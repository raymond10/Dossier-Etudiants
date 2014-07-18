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
import etudiants.utt.fr.components.Recherche;
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
import etudiants.utt.fr.util.StringOperation;
import gestionuv.utt.fr.eo.EOParamDoetu;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class ResultatsUVCtrl extends AComponentCtrl {

	private ResultatsUV wocomponent;
	private EOEditingContext edc;
	private Session sess;
	private Boolean isAutorizUser;
	private Boolean iEtudiant;
	private Boolean isEtudiant;
	private LeUser user = new LeUser();
	private NSArray<EOIndividu> etu ;
	private static ResultatsUvSQL sql = new ResultatsUvSQL();
	private static RechercheSQL sqli = new RechercheSQL();
	private WODisplayGroup dg ;
	private NSDictionary bdgs;
	private NSMutableDictionary unUser;
	private NSMutableDictionary mods;
	private NSMutableDictionary uvs;
	private NSMutableDictionary anUniv;
	private String obs;
	private NSMutableArray modalite;
	private NSMutableArray modaliteUv;
	private NSMutableDictionary dicModalite;
	private NSMutableDictionary dicMod;

	public ResultatsUVCtrl(ResultatsUV aComponent) {
		// TODO Auto-generated constructor stub
		setWocomponent(aComponent);
		setUser(wocomponent().user());
		setUnUser(user().leUser());
		setiEtudiant((Boolean) unUser().valueForKey(StringOperation.ETUDIANT));
		NSMutableDictionary bindinds = new NSMutableDictionary();
		bindinds.put("numero", sess().getEtudiant().primaryKey());
		setEtu((NSArray<EOIndividu>) reWriteListDico(sqli
				.getRawRowSearchEtudiants(edc(), bindinds)));
	}

	/**
	 * @return the wocomponent
	 */
	public ResultatsUV wocomponent() {
		return wocomponent;
	}

	/**
	 * @param wocomponent the wocomponent to set
	 */
	public void setWocomponent(ResultatsUV wocomponent) {
		this.wocomponent = wocomponent;
	}

	/**
	 * @return the edc
	 */
	public EOEditingContext edc() {
		if(edc == null)
			edc = wocomponent().edc();
		return edc;
	}

	/**
	 * @param edc the edc to set
	 */
	public void setEdc(EOEditingContext edc) {
		this.edc = edc;
	}

	/**
	 * @return the sess
	 */
	public Session sess() {
		if(sess == null)
			sess = wocomponent().mySession();
		return sess;
	}

	/**
	 * @param sess the sess to set
	 */
	public void setSess(Session sess) {
		this.sess = sess;
	}

	/**
	 * @return the iEtudiant
	 */
	public Boolean iEtudiant() {
		if(iEtudiant == null)
			iEtudiant = Boolean.FALSE;
		return iEtudiant;
	}

	/**
	 * @param iEtudiant the iEtudiant to set
	 */
	public void setiEtudiant(Boolean iEtudiant) {
		this.iEtudiant = iEtudiant;
	}

	/**
	 * @return the etu
	 */
	public NSArray<EOIndividu> etu() {
		if(etu == null)
			etu = new NSArray<EOIndividu>();
		return etu;
	}

	/**
	 * @param etu the etu to set
	 */
	public void setEtu(NSArray<EOIndividu> etu) {
		this.etu = etu;
	}

	/**
	 * @return the dg
	 */
	public WODisplayGroup dg() {
		if(dg == null)
			dg = new WODisplayGroup();
		return dg;
	}

	/**
	 * @param dg the dg to set
	 */
	public void setDg(WODisplayGroup dg) {
		this.dg = dg;
	}

	/**
	 * @return the bdgs
	 */
	public NSDictionary bdgs() {
		if(bdgs == null)
			bdgs = new NSMutableDictionary();
		return bdgs;
	}

	/**
	 * @param bdgs the bdgs to set
	 */
	public void setBdgs(NSDictionary bdgs) {
		this.bdgs = bdgs;
	}

	/**
	 * @return the unUser
	 */
	public NSMutableDictionary unUser() {
		if(unUser == null)
			unUser = new NSMutableDictionary();
		return unUser;
	}

	/**
	 * @param unUser the unUser to set
	 */
	public void setUnUser(NSMutableDictionary unUser) {
		this.unUser = unUser;
	}

	/**
	 * @return the mods
	 */
	public NSMutableDictionary getMods() {
		return mods;
	}

	/**
	 * @param mods the mods to set
	 */
	public void setMods(NSMutableDictionary mods) {
		this.mods = mods;
	}

	/**
	 * @return the uvs
	 */
	public NSMutableDictionary getUvs() {
		return uvs;
	}

	/**
	 * @param uvs the uvs to set
	 */
	public void setUvs(NSMutableDictionary uvs) {
		this.uvs = uvs;
	}

	/**
	 * @return the isAutorizUser
	 */
	public Boolean getIsAutorizUser() {
		isAutorizUser = (Boolean) unUser().valueForKey(StringOperation.AUTORIZED);
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
		isEtudiant =  sess().getEtudiant().isNonNull() && getIsAutorizUser();
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
	public LeUser user() {
		if(user == null)
			user = new LeUser();
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
		if(modalite == null)
			modalite = new NSMutableArray();
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
		if(modaliteUv == null)
			modaliteUv = new NSMutableArray();
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
		if(dicModalite == null)
			dicModalite = new NSMutableDictionary();
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
		setDg(wocomponent().getEtudiantActif());
		if (dg().allObjects().isEmpty()) {
			dg().setObjectArray(new NSArray(sess().getEtudiant()));
			dg().queryBindings().setObjectForKey(sess().getEtudiant().primaryKey(),
					EOIndividu.INDIV_ID_KEY);
		}
		setBdgs(dg().queryBindings());
		try {
			setAnUniv((NSMutableDictionary) reWriteListDico(ProcessGestionModalites.annee(edc(), bdgs())).lastObject());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess().addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess().setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess().addSimpleErrorMessage("FactoryException ", alertMessage);
				sess().setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess().addSimpleErrorMessage("RuntimeException ", e1.getMessage());
			sess().setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}

	public void selectInsUV() {
		setDg(wocomponent().getEtudiantActif());
		if (dg().allObjects().isEmpty()) {
			dg().setObjectArray(new NSArray(sess().getEtudiant()));
			dg().queryBindings().setObjectForKey(sess().getEtudiant().primaryKey(),
					EOIndividu.INDIV_ID_KEY);
		}
		setBdgs(dg().queryBindings());
		try {
			NSMutableArray insUvList = new NSMutableArray();
			insUvList = reWriteListDico(ProcessGestionInsUv.selectRawRowInsUV(edc(),
					bdgs()));
			wocomponent().setListInsUv(insUvList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess().addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess().setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess().addSimpleErrorMessage("FactoryException ", alertMessage);
				sess().setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess().addSimpleErrorMessage("RuntimeException ", e1.getMessage());
			sess().setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}

	// modalites pour le semestre courant
	public void modalites() {
		if (wocomponent().getListInsUv().count() != 0) {
			setObs("");
			String ldip = "";
			String cdip = "";
			boolean first = true;
			for (int i = 0; i < wocomponent().getListInsUv().count(); i++) {
				NSMutableDictionary ins = new NSMutableDictionary();
				ins = (NSMutableDictionary) wocomponent().getListInsUv()
						.objectAtIndex(i);
				if (!cdip.equals((String) ins.valueForKey("DIPLOME"))) {
					ldip = (String) ins.valueForKey("LIB_DIPLOME");
				} else {
					ldip = "";
				}
				NSMutableArray mList = new NSMutableArray();
				mList = reWriteListDico(ProcessGestionModalites.selectRawRowModalites(
						edc(), ins));
				if (mList.count() != 0) {
					NSMutableDictionary tmp = new NSMutableDictionary();
					tmp = (NSMutableDictionary) mList.objectAtIndex(0);
					setObs((String) tmp.valueForKey("OBSERVATION"));
					for (int j = 0; j < mList.count(); j++) {
						setMods(new NSMutableDictionary());
						NSMutableDictionary mod = new NSMutableDictionary();
						mod = (NSMutableDictionary) mList.objectAtIndex(j);
						getMods().put("libelle", mod.valueForKey("CONTROLE_LIB"));
						getMods().put("valeur", mod.valueForKey("VALEUR"));
						getMods().put("note_elim", mod.valueForKey("NOTE_ELIM"));
						getModalite().addObject(getMods());
					}
				}
				setUvs( new NSMutableDictionary());
				getUvs().put("uv", ins.valueForKey("UV"));
				getUvs().put("diplome", ldip);
				getUvs().put("resuv", ins.valueForKey("RESUV"));
				getUvs().put("credit", ins.valueForKey("CREDIT"));
				getUvs().put("modalites", getModalite());
				getUvs().put("observation", getObs());
				getModaliteUv().addObject(getUvs());
				setModalite(new NSMutableArray());
				cdip = (String) ins.valueForKey("DIPLOME");
			}
		}
	}

	public void funcAnoncePcb() {
		wocomponent().setListAnnoncePcb(EOParamDoetu.fetchAllEOParamDoetus(edc));
		if (wocomponent().getListAnnoncePcb() != null
				&& wocomponent().getListAnnoncePcb().count() == 1) {
			wocomponent().setAnnoncePcb(wocomponent().getListAnnoncePcb()
					.lastObject());
		}
	}

	public String noteEliminatoire() {
		String noteElim = null;
		String note = (String) getDicMod().valueForKey("note_elim");
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
		if (wocomponent().getDgActif() == null || wocomponent().getDgActif().allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		if (etu() != null && etu().count() != 0) {
			sess().setEtudiant(sess().getEtudiant());
		}
		ProfilEtudiants profilPage = (ProfilEtudiants) wocomponent()
				.pageWithName(ProfilEtudiants.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess().setNestedEdc(newEdc);
		return profilPage;
	}

	public WOActionResults dossier() {
		if (wocomponent().getDgActif() == null || wocomponent().getDgActif().allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		if (etu() != null && etu().count() == 1) {
			sess().setEtudiant(sess().getEtudiant());
		}
		DossierAdm dossierPage = (DossierAdm) wocomponent()
				.pageWithName(DossierAdm.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess().setNestedEdc(newEdc);
		return dossierPage;
	}

	public WOActionResults emploiDuTemps() {
		if (wocomponent().getDgActif() == null || wocomponent().getDgActif().allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		if (etu() != null && etu().count() == 1) {
			sess().setEtudiant(sess().getEtudiant());
		}
		EmploiDuTemps emploiDutempsPage = (EmploiDuTemps) wocomponent()
				.pageWithName(EmploiDuTemps.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess().setNestedEdc(newEdc);
		return emploiDutempsPage;
	}
	
	public boolean accessLinkGctc(){
		boolean lesAgents =  (Boolean) unUser().valueForKey(StringOperation.GCTC);
		return lesAgents;
	}
	
	public String LinkGcTc() {
		ProcessGestionRechercheEtudiants gestEtu = new ProcessGestionRechercheEtudiants();
		LesURLs url = new LesURLs();
		sess().setRetourAlaListe(true);
		if (wocomponent().getDgActif() == null || wocomponent().getDgActif().allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		if (etu() != null && etu().count() != 0) {
			sess().setEtudiant(sess().getEtudiant());
		}
		Integer etuId = Integer.valueOf(sess().getEtudiant().primaryKey());
		String link = url.getGctcUrl();
		NSMutableDictionary requetePersId = (NSMutableDictionary) gestEtu
				.selectRawRowrequetePersId(edc(), etuId).lastObject();
		String persId = requetePersId.valueForKey("COCK_PERS_ID").toString();
		String urlGctc = link+persId;
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess().setNestedEdc(newEdc);
		return urlGctc;
	}

	// End Link

	public WOActionResults retourAlaListe() {
		WOComponent searchPage = null;
		NSArray<EOIndividu> lesEtudiants = new NSArray<EOIndividu>();
		WODisplayGroup dg = wocomponent().getDgActif();
		if (dg.allObjects().count() == 0) {
			wocomponent().setDgActif(dg);
			NSDictionary bdgs = dg.queryBindings();
			String mst = (String) bdgs.valueForKey("diplome");
			if (mst == null) {
				mst = (String) bdgs.valueForKey("prdDiplome");
			}
			if (mst != null && mst.equals("MST")) {
				lesEtudiants = EOIndividu.EtudiantsMST(edc(), bdgs, null);
			} else {
				lesEtudiants = EOIndividu.EtudiantsNonMST(edc(), bdgs, null);
			}
			wocomponent().getDgActif().setObjectArray(lesEtudiants);
			wocomponent().getDgActif().setCurrentBatchIndex(sess().getCurrentBatchIndex());
		} else {
			wocomponent().setDgActif(dg);
			wocomponent().getDgActif().setCurrentBatchIndex(sess().getCurrentBatchIndex());
		}
		searchPage = wocomponent().pageWithName(Recherche.class.getName());
		return searchPage;
	}
}
