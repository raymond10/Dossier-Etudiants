/**
 * 
 */
package etudiants.utt.fr.components.controlers;
import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

import er.extensions.appserver.ERXRedirect;
import er.extensions.eof.ERXEC;
import etudiants.utt.fr.components.DossierAdm;
import etudiants.utt.fr.components.EmploiDuTemps;
import etudiants.utt.fr.components.ProfilEtudiants;
import etudiants.utt.fr.components.Recherche;
import etudiants.utt.fr.components.ResultatsUV;
import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.eo.EOVDossetudiants;
import etudiants.utt.fr.roles.LeUser;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.server.process.ProcessGestionRechercheEtudiants;
import etudiants.utt.fr.sql.DossierAdmSQL;
import etudiants.utt.fr.sql.RechercheSQL;
import etudiants.utt.fr.util.LesURLs;
import etudiants.utt.fr.util.StringOperation;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class DossierAdmCtrl extends AComponentCtrl {

	public DossierAdm wocomponent;
	public EOEditingContext edc;
	public Session sess;
	private Boolean isAutorizUser;
	private Boolean isEtudiant;
	// private static String MAXPERIODE = "MAX_AN_UNIV__PRD_UNIV_";
	private EOIndividu leConseiller;
	private EOVDossetudiants currentEtudiant;
	private String anUniv;
	private String prdUniv;
	private WODisplayGroup dglConseil;
	public static DossierAdmSQL Sql = new DossierAdmSQL();
	public static RechercheSQL sqli = new RechercheSQL();
	public static ProcessGestionRechercheEtudiants gestEtu;
	private NSArray adrInd;
	private NSArray adrPar;
	private NSArray infos;
	private NSArray total;
	private NSArray pcbButton;
	private LeUser user = new LeUser();
	public NSMutableDictionary unUser = new NSMutableDictionary();
	public NSArray etu = new NSArray();
	private LesURLs url;

	public DossierAdmCtrl(DossierAdm aComponent) {
		url = new LesURLs();
		gestEtu = new ProcessGestionRechercheEtudiants();
		wocomponent = aComponent;
		edc = wocomponent.edc();
		sess = wocomponent.mySession();
		dglConseil = new WODisplayGroup();
		user = wocomponent.user();
		unUser = user.leUser();
	}

	public void letudiant() {
		// TODO Auto-generated method stub
		NSMutableDictionary bindinds = new NSMutableDictionary();
		bindinds.put("numero", sess.getEtudiant().primaryKey());
		etu = reWriteListDico(sqli.getRawRowSearchEtudiants(edc, bindinds));
		currentEtudiant = EOVDossetudiants.fetchDossEtudiant(edc,
				sess.getEtudiant().indivId()).lastObject();
	}

	public DossierAdmCtrl() {
		super();
	}

	/**
	 * @return the isAutorizUser
	 */
	public Boolean getIsAutorizUser() {
		isAutorizUser = (Boolean) unUser.valueForKey("isAutorized");
		return isAutorizUser;
	}

	/**
	 * @param isAutorizUser
	 *            the isAutorizUser to set
	 */
	public void setIsAutorizUser(Boolean isAutorizUser) {
		this.isAutorizUser = isAutorizUser;
	}

	/**
	 * @return the isEtudiant
	 */
	public Boolean getIsEtudiant() {
		isEtudiant = sess.getEtudiant().isNonNull() && isAutorizUser;
		return isEtudiant;
	}

	/**
	 * @param isEtudiant
	 *            the isEtudiant to set
	 */
	public void setIsEtudiant(Boolean isEtudiant) {
		this.isEtudiant = isEtudiant;
	}

	/**
	 * @return the leConseiller
	 */
	public EOIndividu getLeConseiller() {
		return leConseiller;
	}

	/**
	 * @param leConseiller
	 *            the leConseiller to set
	 */
	public void setLeConseiller(EOIndividu leConseiller) {
		this.leConseiller = leConseiller;
	}

	/**
	 * @return the currentEtudiant
	 */
	public EOVDossetudiants getCurrentEtudiant() {
		return currentEtudiant;
	}

	/**
	 * @param currentEtudiant
	 *            the currentEtudiant to set
	 */
	public void setCurrentEtudiant(EOVDossetudiants currentEtudiant) {
		this.currentEtudiant = currentEtudiant;
	}

	public void leConseiller() {
		anUniv = null;
		prdUniv = null;
		String periode = null;
		NSMutableDictionary obj = new NSMutableDictionary();
		WODisplayGroup dg = wocomponent.getEtudiantActif();
		if (dg == null) {
			dg = new WODisplayGroup();
			dg.setObjectArray(new NSArray(sess.getEtudiant()));
			dg.queryBindings().setObjectForKey(sess.getEtudiant().primaryKey(),
					EOIndividu.INDIV_ID_KEY);
		}
		NSDictionary bdgs = dg.queryBindings();
		if (!bdgs.isEmpty()) {
			NSArray laperiode = reWriteListDico(getRawRowConseiller(edc, bdgs));
			for (int i = 0; i < laperiode.count(); i++) {
				obj = (NSMutableDictionary) laperiode.objectAtIndex(i);
			}
			periode = (String) obj.valueForKey("MAXPERIODE");
			if (periode != null) {
				if (periode.length() == 5) {
					anUniv = periode.substring(0, periode.length() - 1);
					prdUniv = periode.substring(periode.length() - 1,
							periode.length());
				} else {
					anUniv = periode.substring(0, periode.length() - 2);
					prdUniv = periode.substring(periode.length() - 2,
							periode.length());
				}
				NSArray cons = new NSArray();
				cons = EOIndividu.fetchLeConseiller(edc, anUniv,
						Long.valueOf(currentEtudiant.primaryKey()), prdUniv);
				if (cons != null && cons.count() != 0) {
					leConseiller = (EOIndividu) cons.lastObject();
				}
			}
		} else {
			NSArray cons = new NSArray();
			cons = EOIndividu.fetchLesConseillers(edc);
			if (cons != null && cons.count() == 1) {
				leConseiller = (EOIndividu) cons.lastObject();
			}
		}
		NSMutableArray demo = new NSMutableArray();
		if (leConseiller != null) {
			demo.addObject(leConseiller);
		}
		demo.addObject(currentEtudiant);
		dglConseil.setObjectArray(demo.mutableClone());
		if (leConseiller != null) {
			dglConseil.queryBindings().setObjectForKey(leConseiller,
					EOIndividu.NOM_KEY);
		}
		dglConseil.queryBindings().setObjectForKey(currentEtudiant,
				EOVDossetudiants.CIVILITE_KEY);
	}

	public void consLocalisation() {
		NSDictionary bdgs = dglConseil.queryBindings();
		if (bdgs.containsKey("nom")) {
			wocomponent.setListLocation(reWriteListDico(getRawRowlConseiller(edc, bdgs)));
		}
	}

	public void formation() {
		NSDictionary bdgs = dglConseil.queryBindings();
		wocomponent.setListFormation(reWriteListDico(getRawRowlFormation(edc, bdgs)));
	}

	public void adressInd() {
		NSDictionary bdgs = dglConseil.queryBindings();
		adrInd = reWriteListDico(getRawRowAdresseInd(edc, bdgs));
		if (adrInd != null && adrInd.count() == 1) {
			wocomponent.setAdresseInd((NSMutableDictionary) adrInd.lastObject());
		}
	}

	public void adressPar() {
		NSDictionary bdgs = dglConseil.queryBindings();
		adrPar = reWriteListDico(getRawRowAdressePar(edc, bdgs));
		if (adrPar != null && adrPar.count() == 1) {
			wocomponent
					.setAdressePar((NSMutableDictionary) adrPar.lastObject());
		}
	}

	public void inscription() {
		NSDictionary bdgs = dglConseil.queryBindings();
		wocomponent.setListInscription(reWriteListDico(getRawRowInscription(edc, bdgs)));
	}

	public void infoSocial() {
		NSDictionary bdgs = dglConseil.queryBindings();
		infos = reWriteListDico(getRawRowInsfoScoial(edc, bdgs));
		if (infos != null && infos.count() != 0) {
			wocomponent.setScoial((NSMutableDictionary) infos.lastObject());
		}
	}

	public void paiement() {
		NSDictionary bdgs = dglConseil.queryBindings();
		wocomponent.setListPaiement(reWriteListDico(getRawRowPaiement(edc, bdgs)));
	}

	public void pcb() {
		NSDictionary bdgs = dglConseil.queryBindings();
		pcbButton = reWriteListDico(getRawRowBoutonPCB(edc, bdgs));
		if (pcbButton != null && pcbButton.count() != 0) {
			wocomponent.setBoutonPCB((NSMutableDictionary) pcbButton
					.lastObject());
		}
	}

	public void paiementTotal() {
		NSDictionary bdgs = dglConseil.queryBindings();
		total = reWriteListDico(getRawRowPaiementTotal(edc, bdgs));
		if (total != null && total.count() != 0) {
			wocomponent.setPaiementTotal((NSMutableDictionary) total
					.lastObject());
		}
	}

	public boolean boolPcb() {
		NSMutableDictionary cB = wocomponent.getBoutonPCB();
		NSLog.out.appendln(cB.count() != 0);
		boolean bool = cB.count() != 0;
		return bool;
	}

	public boolean canPost() {
		NSMutableDictionary cB = wocomponent.getBoutonPCB();
		if (cB.count() != 0) {
			String cbValue = (String) cB.valueForKey("VISIBLE");
			boolean viewButon = unUser.valueForKey("role").equals(StringOperation.ETUDIANT)
					&& cB.containsKey("VISIBLE") && cbValue.equals("O");
			return viewButon;
		} else {
			return false;
		}
	}
	
	public WOActionResults payementPost(){
		String url = wocomponent.formPost();
		ERXRedirect direct = new ERXRedirect(wocomponent.context());
		direct.setUrl(url);
		//direct.takeValueForKey("_blank", "target");
		return direct;
	}

	public boolean leRole() {
		return unUser.valueForKey("role").equals(StringOperation.ADMINISTRATEUR)
				|| unUser.valueForKey("role").equals(StringOperation.ENSEIGNANT)
				|| unUser.valueForKey("role").equals(StringOperation.PERSONNEL)				
				|| unUser.valueForKey("role").equals(StringOperation.ETUDIANT);
	}

	@SuppressWarnings("unchecked")
	protected static final NSArray getRawRowConseiller(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray keys = new NSArray("MAXPERIODE");
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
					Sql.constructiongetConseiller(false, bindings), keys);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	protected static final NSArray getRawRowlConseiller(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				Sql.constructionlConseiller(false, bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	protected static final NSArray getRawRowlFormation(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				Sql.constructionlFormation(false, bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	protected static final NSArray getRawRowAdresseInd(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				Sql.consAdresseEtudiant(false, bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	protected static final NSArray getRawRowAdressePar(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				Sql.consAdresseParent(false, bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	protected static final NSArray getRawRowInscription(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				Sql.consInscription(false, bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	protected static final NSArray getRawRowInsfoScoial(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				Sql.consInfoSocial(false, bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	protected static final NSArray getRawRowPaiement(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				Sql.consPaiement(false, bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	protected static final NSArray getRawRowBoutonPCB(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				Sql.consPcb(bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	protected static final NSArray getRawRowPaiementTotal(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				Sql.consPaiementTotal(false, bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @return the anUniv
	 */
	public String getAnUniv() {
		return anUniv;
	}

	/**
	 * @param anUniv
	 *            the anUniv to set
	 */
	public void setAnUniv(String anUniv) {
		this.anUniv = anUniv;
	}

	/**
	 * @return the prdUniv
	 */
	public String getPrdUniv() {
		return prdUniv;
	}

	/**
	 * @param prdUniv
	 *            the prdUniv to set
	 */
	public void setPrdUniv(String prdUniv) {
		this.prdUniv = prdUniv;
	}

	/**
	 * @return the dglConseil
	 */
	public WODisplayGroup getDglConseil() {
		return dglConseil;
	}

	/**
	 * @param dglConseil
	 *            the dglConseil to set
	 */
	public void setDglConseil(WODisplayGroup dglConseil) {
		this.dglConseil = dglConseil;
	}

	/**
	 * @return the adrInd
	 */
	public NSArray getAdrInd() {
		return adrInd;
	}

	/**
	 * @param adrInd
	 *            the adrInd to set
	 */
	public void setAdrInd(NSArray adrInd) {
		this.adrInd = adrInd;
	}

	/**
	 * @return the adrPar
	 */
	public NSArray getAdrPar() {
		return adrPar;
	}

	/**
	 * @param adrPar
	 *            the adrPar to set
	 */
	public void setAdrPar(NSArray adrPar) {
		this.adrPar = adrPar;
	}

	/**
	 * @return the infos
	 */
	public NSArray getInfos() {
		return infos;
	}

	/**
	 * @param infos
	 *            the infos to set
	 */
	public void setInfos(NSArray infos) {
		this.infos = infos;
	}

	/**
	 * @return the total
	 */
	public NSArray getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(NSArray total) {
		this.total = total;
	}

	/**
	 * @return the pcbButton
	 */
	public NSArray getPcbButton() {
		return pcbButton;
	}

	/**
	 * @param pcbButton
	 *            the pcbButton to set
	 */
	public void setPcbButton(NSArray pcbButton) {
		this.pcbButton = pcbButton;
	}

	// Dictionnary Null value decoder
	protected NSMutableArray reWriteListDico(NSArray dicoList) {
		NSMutableArray listDico = new NSMutableArray();
		for (int j = 0; j < dicoList.count(); j++) {
			NSMutableDictionary tinyDico = new NSMutableDictionary();
			tinyDico = (NSMutableDictionary) dicoList.objectAtIndex(j);
			reWriteDico(tinyDico);
			listDico.addObject(tinyDico);
		}
		return listDico;
	}

	protected void reWriteDico(NSMutableDictionary dico) {
		for (int i = 0; i < dico.size(); i++) {
			String key = (String) dico.allKeys().objectAtIndex(i);
			Object value = dico.valueForKey(key);
			if (value.equals(NSKeyValueCoding.NullValue)) {
				dico.setObjectForKey("", key);
			}
		}
	}

	protected String decode(Object obj) {
		String key = obj.toString().substring(1);
		String key2 = key.substring(0, key.length() - 1);
		String decodedValue = key2.substring(key2.length() - 4);
		if (decodedValue.equals("Null")) {
			return null;
		} else {
			return obj.toString();
		}
	}

	// End Decoder

	// Lien page etudiant
	public WOActionResults leprofil() {
		sess.setRetourAlaListe(true);
		if (wocomponent.getDgActif() == null || wocomponent.getDgActif().allObjects().count() == 0) {
			sess.setRetourAlaListe(false);
		}
		if (etu != null && etu.count() != 0) {
			sess.setEtudiant(sess.getEtudiant());
		}
		ProfilEtudiants profilPage = (ProfilEtudiants) wocomponent
				.pageWithName(ProfilEtudiants.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess.setNestedEdc(newEdc);
		return profilPage;
	}

	public WOActionResults leResultatUv() {
		sess.setRetourAlaListe(true);
		if (wocomponent.getDgActif() == null ||wocomponent.getDgActif().allObjects().count() == 0) {
			sess.setRetourAlaListe(false);
		}
		if (etu != null && etu.count() != 0) {
			sess.setEtudiant(sess.getEtudiant());
		}
		ResultatsUV resUvPage = (ResultatsUV) wocomponent
				.pageWithName(ResultatsUV.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess.setNestedEdc(newEdc);
		return resUvPage;
	}

	public WOActionResults lEmploiDuTemps() {
		sess.setRetourAlaListe(true);
		if (wocomponent.getDgActif() == null ||wocomponent.getDgActif().allObjects().count() == 0) {
			sess.setRetourAlaListe(false);
		}
		if (etu != null && etu.count() != 0) {
			sess.setEtudiant(sess.getEtudiant());
		}
		EmploiDuTemps lEdtPage = (EmploiDuTemps) wocomponent
				.pageWithName(EmploiDuTemps.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess.setNestedEdc(newEdc);
		return lEdtPage;
	}
	
	public boolean accessLinkGctc(){
		boolean lesAgents =  (Boolean) unUser.valueForKey("isAutorizedGcTc");
		return lesAgents;
	}
	
	public String LinkGcTc() {
		sess.setRetourAlaListe(true);
		if (wocomponent.getDgActif() == null || wocomponent.getDgActif().allObjects().count() == 0) {
			sess.setRetourAlaListe(false);
		}
		if (etu != null && etu.count() != 0) {
			sess.setEtudiant(sess.getEtudiant());
		}
		Integer etuId = Integer.valueOf(sess.getEtudiant().primaryKey());
		String link = url.getGctcUrl();
		NSMutableDictionary requetePersId = (NSMutableDictionary) gestEtu
				.selectRawRowrequetePersId(edc, etuId).lastObject();
		String persId = requetePersId.valueForKey("COCK_PERS_ID").toString();
		String urlGctc = link+persId;
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess.setNestedEdc(newEdc);
		return urlGctc;
	}

	// fin lien page etudiant

	public WOActionResults retourAlaListe() {
		WOComponent searchPage = null;
		NSArray<EOIndividu> lesEtudiants = new NSArray<EOIndividu>();
		WODisplayGroup dg = wocomponent.getDgActif();
		if (dg.allObjects().count() == 0) {
			wocomponent.setDgActif(dg);
			NSDictionary bdgs = dg.queryBindings();
			String mst = (String) bdgs.valueForKey("diplome");
			if (mst == null) {
				mst = (String) bdgs.valueForKey("prdDiplome");
			}
			if (mst != null && mst.equals("MST")) {
				lesEtudiants = EOIndividu.EtudiantsMST(edc, bdgs, null);
			} else {
				lesEtudiants = EOIndividu.EtudiantsNonMST(edc, bdgs, null);
			}
			wocomponent.getDgActif().setObjectArray(lesEtudiants);
			wocomponent.getDgActif().setCurrentBatchIndex(sess.getCurrentBatchIndex());
		} else {
			wocomponent.setDgActif(dg);
			wocomponent.getDgActif().setCurrentBatchIndex(sess.getCurrentBatchIndex());
		}
		searchPage = wocomponent.pageWithName(Recherche.class.getName());
		return searchPage;
	}
}
