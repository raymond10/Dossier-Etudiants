/**
 * 
 */
package etudiants.utt.fr.components.controlers;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

import er.extensions.eof.ERXEC;
import etudiants.utt.fr.components.DossierAdm;
import etudiants.utt.fr.components.EmploiDuTemps;
import etudiants.utt.fr.components.ProfilEtudiants;
import etudiants.utt.fr.components.ResultatsUV;
import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.roles.LeUser;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.server.exception.FactoryException;
import etudiants.utt.fr.server.process.ProcessGestionDiplome;
import etudiants.utt.fr.server.process.ProcessGestionInsUv;
import etudiants.utt.fr.server.process.ProcessGestionModalites;
import etudiants.utt.fr.server.process.ProcessGestionRechercheEtudiants;
import etudiants.utt.fr.sql.RechercheSQL;
import etudiants.utt.fr.sql.ResultatsUvSQL;
import etudiants.utt.fr.util.LesURLs;
import gestionuv.utt.fr.eo.EOParamDoetu;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class ResultatsUVCtrl extends AComponentCtrl {

	public ResultatsUV wocomponent;
	public EOEditingContext edc;
	public Session sess;
	private Boolean isAutorizUser;
	private Boolean iEtudiant = false;
	private Boolean isEtudiant;
	private LeUser user = new LeUser();
	public NSArray<EOIndividu> etu = new NSArray<EOIndividu>();
	public static ResultatsUvSQL sql = new ResultatsUvSQL();
	public static RechercheSQL sqli = new RechercheSQL();
	WODisplayGroup dg = new WODisplayGroup();
	NSDictionary bdgs = new NSDictionary();
	public NSMutableDictionary unUser = new NSMutableDictionary();
	public NSMutableDictionary mods;
	public NSMutableDictionary uvs;
	private NSMutableDictionary anUniv;
	private String obs;
	private NSMutableArray modalite;
	private NSMutableArray modaliteUv;
	private NSMutableDictionary dicModalite;
	private NSMutableDictionary dicMod;

	public ResultatsUVCtrl(ResultatsUV aComponent) {
		// TODO Auto-generated constructor stub
		wocomponent = aComponent;
		edc = wocomponent.edc();
		sess = wocomponent.mySession();
		user = wocomponent.user();
		unUser = user.leUser();
		iEtudiant = (Boolean) unUser.valueForKey("etudiant");
		modalite = new NSMutableArray();
		modaliteUv = new NSMutableArray();
		dicModalite = new NSMutableDictionary();
		NSMutableDictionary bindinds = new NSMutableDictionary();
		bindinds.put("numero", sess.getEtudiant().primaryKey());
		etu = (NSArray<EOIndividu>) reWriteListDico(sqli
				.getRawRowSearchEtudiants(edc, bindinds));
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
	 * @return the user
	 */
	public LeUser getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(LeUser user) {
		this.user = user;
	}

	/**
	 * @return the obs
	 */
	public String getObs() {
		return obs;
	}

	/**
	 * @param obs
	 *            the obs to set
	 */
	public void setObs(String obs) {
		this.obs = obs;
	}

	/**
	 * @return the anUniv
	 */
	public NSMutableDictionary getAnUniv() {
		return anUniv;
	}

	/**
	 * @param anUniv the anUniv to set
	 */
	public void setAnUniv(NSMutableDictionary anUniv) {
		this.anUniv = anUniv;
	}

	/**
	 * @return the modalite
	 */
	public NSMutableArray getModalite() {
		return modalite;
	}

	/**
	 * @param modalite
	 *            the modalite to set
	 */
	public void setModalite(NSMutableArray modalite) {
		this.modalite = modalite;
	}

	/**
	 * @return the modaliteUv
	 */
	public NSMutableArray getModaliteUv() {
		return modaliteUv;
	}

	/**
	 * @param modaliteUv
	 *            the modaliteUv to set
	 */
	public void setModaliteUv(NSMutableArray modaliteUv) {
		this.modaliteUv = modaliteUv;
	}

	/**
	 * @return the dicModalite
	 */
	public NSMutableDictionary getDicModalite() {
		return dicModalite;
	}

	/**
	 * @param dicModalite
	 *            the dicModalite to set
	 */
	public void setDicModalite(NSMutableDictionary dicModalite) {
		this.dicModalite = dicModalite;
	}

	/**
	 * @return the dicMod
	 */
	public NSMutableDictionary getDicMod() {
		return dicMod;
	}

	/**
	 * @param dicMod
	 *            the dicMod to set
	 */
	public void setDicMod(NSMutableDictionary dicMod) {
		this.dicMod = dicMod;
	}
	
	public void anneeEnCours(){
		dg = wocomponent.getEtudiantActif();
		if (dg == null) {
			dg = new WODisplayGroup();
			dg.setObjectArray(new NSArray(sess.getEtudiant()));
			dg.queryBindings().setObjectForKey(sess.getEtudiant().primaryKey(),
					EOIndividu.INDIV_ID_KEY);
		}
		bdgs = dg.queryBindings();
		try {
			anUniv = (NSMutableDictionary) reWriteListDico(ProcessGestionModalites.annee(edc, bdgs)).lastObject();
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess.addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess.setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess.addSimpleErrorMessage("FactoryException ", alertMessage);
				sess.setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess.addSimpleErrorMessage("RuntimeException ", e1.getMessage());
			sess.setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}

	public void selectInsUV() {
		dg = wocomponent.getEtudiantActif();
		if (dg == null) {
			dg = new WODisplayGroup();
			dg.setObjectArray(new NSArray(sess.getEtudiant()));
			dg.queryBindings().setObjectForKey(sess.getEtudiant().primaryKey(),
					EOIndividu.INDIV_ID_KEY);
		}
		bdgs = dg.queryBindings();
		try {
			NSMutableArray insUvList = new NSMutableArray();
			insUvList = reWriteListDico(ProcessGestionInsUv.selectRawRowInsUV(edc,
					bdgs));
			wocomponent.setListInsUv(insUvList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess.addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess.setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess.addSimpleErrorMessage("FactoryException ", alertMessage);
				sess.setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess.addSimpleErrorMessage("RuntimeException ", e1.getMessage());
			sess.setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}

	// modalites pour le semestre courant
	public void modalites() {
		if (wocomponent.getListInsUv().count() != 0) {
			obs = "";
			String ldip = "";
			String cdip = "";
			boolean first = true;
			for (int i = 0; i < wocomponent.getListInsUv().count(); i++) {
				NSMutableDictionary ins = new NSMutableDictionary();
				ins = (NSMutableDictionary) wocomponent.getListInsUv()
						.objectAtIndex(i);
				if (!cdip.equals((String) ins.valueForKey("DIPLOME"))) {
					ldip = (String) ins.valueForKey("LIB_DIPLOME");
				} else {
					ldip = "";
				}
				NSMutableArray mList = new NSMutableArray();
				mList = reWriteListDico(ProcessGestionModalites.selectRawRowModalites(
						edc, ins));
				if (mList.count() != 0) {
					NSMutableDictionary tmp = new NSMutableDictionary();
					tmp = (NSMutableDictionary) mList.objectAtIndex(0);
					obs = (String) tmp.valueForKey("OBSERVATION");
					for (int j = 0; j < mList.count(); j++) {
						mods = new NSMutableDictionary();
						NSMutableDictionary mod = new NSMutableDictionary();
						mod = (NSMutableDictionary) mList.objectAtIndex(j);
						mods.put("libelle", mod.valueForKey("CONTROLE_LIB"));
						mods.put("valeur", mod.valueForKey("VALEUR"));
						mods.put("note_elim", mod.valueForKey("NOTE_ELIM"));
						modalite.addObject(mods);
					}
				}
				uvs = new NSMutableDictionary();
				uvs.put("uv", ins.valueForKey("UV"));
				uvs.put("diplome", ldip);
				uvs.put("resuv", ins.valueForKey("RESUV"));
				uvs.put("credit", ins.valueForKey("CREDIT"));
				uvs.put("modalites", modalite);
				uvs.put("observation", obs);
				modaliteUv.addObject(uvs);
				modalite = new NSMutableArray();
				cdip = (String) ins.valueForKey("DIPLOME");
			}
		}
	}

	public void funcAnoncePcb() {
		wocomponent.setListAnnoncePcb(EOParamDoetu.fetchAllEOParamDoetus(edc));
		if (wocomponent.getListAnnoncePcb() != null
				&& wocomponent.getListAnnoncePcb().count() == 1) {
			wocomponent.setAnnoncePcb(wocomponent.getListAnnoncePcb()
					.lastObject());
		}
	}

	public String noteEliminatoire() {
		String noteElim = null;
		String note = (String) dicMod.valueForKey("note_elim");
		if(!note.equals("")){
		noteElim = "(note Žliminatoire "
				+ note + "/20)";
		}
		return noteElim;
	}

	// Dictionnary Null value decoder
	protected NSMutableArray reWriteListDico(NSArray dicoList) {
		NSMutableArray listDico = new NSMutableArray();
		if (dicoList.count() != 0) {
			for (int j = 0; j < dicoList.count(); j++) {
				NSMutableDictionary tinyDico = new NSMutableDictionary();
				tinyDico = (NSMutableDictionary) dicoList.objectAtIndex(j);
				reWriteDico(tinyDico);
				listDico.addObject(tinyDico);
			}
			return listDico;
		}
		return dicoList.mutableClone();
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

	public WOActionResults dossier() {
		if (wocomponent.getDgActif() == null || wocomponent.getDgActif().allObjects().count() == 0) {
			sess.setRetourAlaListe(false);
		}
		if (etu != null && etu.count() == 1) {
			sess.setEtudiant(sess.getEtudiant());
		}
		DossierAdm dossierPage = (DossierAdm) wocomponent
				.pageWithName(DossierAdm.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess.setNestedEdc(newEdc);
		return dossierPage;
	}

	public WOActionResults emploiDuTemps() {
		if (wocomponent.getDgActif() == null || wocomponent.getDgActif().allObjects().count() == 0) {
			sess.setRetourAlaListe(false);
		}
		if (etu != null && etu.count() == 1) {
			sess.setEtudiant(sess.getEtudiant());
		}
		EmploiDuTemps emploiDutempsPage = (EmploiDuTemps) wocomponent
				.pageWithName(EmploiDuTemps.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess.setNestedEdc(newEdc);
		return emploiDutempsPage;
	}
	
	public boolean accessLinkGctc(){
		boolean lesAgents =  (Boolean) unUser.valueForKey("isAutorizedGcTc");
		return lesAgents;
	}
	
	public String LinkGcTc() {
		ProcessGestionRechercheEtudiants gestEtu = new ProcessGestionRechercheEtudiants();
		LesURLs url = new LesURLs();
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

	// End Link

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
		searchPage = wocomponent.pageWithName("Recherche");
		return searchPage;
	}
}
