/**
 * 
 */
package etudiants.utt.fr.components.controlers;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSMutableDictionary;

import etudiants.utt.fr.components.Annonces;
import etudiants.utt.fr.components.DossierAdm;
import etudiants.utt.fr.components.Editions;
import etudiants.utt.fr.components.EdtExams;
import etudiants.utt.fr.components.EmploiDuTemps;
import etudiants.utt.fr.components.Extractions;
import etudiants.utt.fr.components.ProfilEtudiants;
import etudiants.utt.fr.components.Recherche;
import etudiants.utt.fr.components.ResultatsUV;
import etudiants.utt.fr.components.Wrapper;
import etudiants.utt.fr.roles.LeUser;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.util.StringOperation;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class WrapperCtrl extends Object {

	private Wrapper wocomponent;
	private EOEditingContext edc;
	private Session sess;
	private LeUser user;
	private NSMutableDictionary unUser;
	private Boolean search;
	private Boolean edit;
	private Boolean admin;
	private Boolean extract;
	private Boolean editExam;
	private Boolean prof;
	private Boolean doss;
	private Boolean res;
	private Boolean edt;

	public WrapperCtrl(Wrapper aWOComponent) {
		setWocomponent(aWOComponent);
		setUser(wocomponent().user());
		setUnUser(getUser().leUser());
	}

	/**
	 * @return the wocomponent
	 */
	public Wrapper wocomponent() {
		return wocomponent;
	}

	/**
	 * @param wocomponent the wocomponent to set
	 */
	public void setWocomponent(Wrapper wocomponent) {
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
	 * @return the search
	 */
	public Boolean getSearch() {
		if(search == null)
			search = Boolean.FALSE;
		return search;
	}

	/**
	 * @param search the search to set
	 */
	public void setSearch(Boolean search) {
		this.search = search;
	}

	/**
	 * @return the edit
	 */
	public Boolean getEdit() {
		if(edit == null)
			edit = Boolean.FALSE;
		return edit;
	}

	/**
	 * @param edit the edit to set
	 */
	public void setEdit(Boolean edit) {
		this.edit = edit;
	}

	/**
	 * @return the admin
	 */
	public Boolean getAdmin() {
		if(admin == null)
			admin = Boolean.FALSE;
		return admin;
	}

	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	/**
	 * @return the extract
	 */
	public Boolean getExtract() {
		if(extract == null)
			extract = Boolean.FALSE;
		return extract;
	}

	/**
	 * @param extract the extract to set
	 */
	public void setExtract(Boolean extract) {
		this.extract = extract;
	}

	/**
	 * @return the editExam
	 */
	public Boolean getEditExam() {
		if(editExam == null)
			editExam = Boolean.FALSE;
		return editExam;
	}

	/**
	 * @param editExam the editExam to set
	 */
	public void setEditExam(Boolean editExam) {
		this.editExam = editExam;
	}

	/**
	 * @return the prof
	 */
	public Boolean getProf() {
		if(prof == null)
			prof = Boolean.FALSE;
		return prof;
	}

	/**
	 * @param prof the prof to set
	 */
	public void setProf(Boolean prof) {
		this.prof = prof;
	}

	/**
	 * @return the doss
	 */
	public Boolean getDoss() {
		if(doss == null)
			doss = Boolean.FALSE;
		return doss;
	}

	/**
	 * @param doss the doss to set
	 */
	public void setDoss(Boolean doss) {
		this.doss = doss;
	}

	/**
	 * @return the res
	 */
	public Boolean getRes() {
		if(res == null)
			res = Boolean.FALSE;
		return res;
	}

	/**
	 * @param res the res to set
	 */
	public void setRes(Boolean res) {
		this.res = res;
	}

	/**
	 * @return the edt
	 */
	public Boolean getEdt() {
		if(edt == null)
			edt = Boolean.FALSE;
		return edt;
	}

	/**
	 * @param edt the edt to set
	 */
	public void setEdt(Boolean edt) {
		this.edt = edt;
	}

	public WOActionResults quitter() {
		return sess().onQuitter();
	}

	public WOActionResults logOut() {
		return sess().onLogOut();
	}

	/**
	 * @return the user
	 */
	public LeUser getUser() {
		if(user == null)
			user  = wocomponent().user();
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
	 * @return the unUser
	 */
	public NSMutableDictionary getUnUser() {
		if(unUser == null)
			unUser =  getUser().leUser();
		return unUser;
	}

	/**
	 * @param unUser the unUser to set
	 */
	public void setUnUser(NSMutableDictionary unUser) {
		this.unUser = unUser;
	}

	public boolean allAgent() {
		boolean lesAgents = getUnUser().valueForKey(StringOperation.ROLE).equals(StringOperation.ADMINISTRATEUR)
				|| getUnUser().valueForKey(StringOperation.ROLE).equals(StringOperation.PERSONNEL)
				|| getUnUser().valueForKey(StringOperation.ROLE).equals(StringOperation.ENSEIGNANT);
		return lesAgents;
	}

	public boolean adminUser() {
		boolean admin = getUnUser().valueForKey(StringOperation.ROLE).equals(StringOperation.ADMINISTRATEUR);
		return admin;
	}

	public boolean etudiant() {
		//JavaNullPointerException a corriger
		boolean etudiant = false;
		try {
		 etudiant = getUnUser().valueForKey(StringOperation.ROLE).equals(StringOperation.ETUDIANT);
		} catch (Exception e) {
			e.getLocalizedMessage();
		}
		return etudiant;
	}

	// Partie Agent
	public WOActionResults selectRecherche() {
		wocomponent().setDgActif(null);
		Recherche searchPage = (Recherche) wocomponent()
				.pageWithName(Recherche.class.getName());
		return searchPage;
	}

	public WOActionResults selectEtdition() {
		wocomponent().setDgActif(null);
		Editions editPage = (Editions) wocomponent().pageWithName(Editions.class
				.getName());
		return editPage;
	}

	public WOActionResults selectAnnonce() {
		wocomponent().setDgActif(null);
		Annonces adminPage = (Annonces) wocomponent().pageWithName(Annonces.class
				.getName());
		return adminPage;
	}

	public WOActionResults selectExtraction() {
		wocomponent().setDgActif(null);
		Extractions extractPage = (Extractions) wocomponent()
				.pageWithName(Extractions.class.getName());
		return extractPage;
	}

	public WOActionResults selectEdtExam() {
		wocomponent().setDgActif(null);
		EdtExams edtPage = (EdtExams) wocomponent().pageWithName(EdtExams.class
				.getName());
		return edtPage;
	}

	// Fin partie Agent

	// Partie Etudiant
	public WOActionResults selectProfil() {
		ProfilEtudiants profilPage = (ProfilEtudiants) wocomponent()
				.pageWithName(ProfilEtudiants.class.getName());
		sess().setEtudiant(wocomponent().utilisateur());
		setSearch(Boolean.FALSE);
		setEdit(Boolean.FALSE);
		setAdmin(Boolean.FALSE);
		setExtract(Boolean.FALSE);
		setEditExam(Boolean.FALSE);
		setProf(Boolean.TRUE);
		setDoss(Boolean.FALSE);
		setRes(Boolean.FALSE);
		setEdt(Boolean.FALSE);
		return profilPage;
	}

	public WOActionResults selectDossier() {
		DossierAdm dossierPage = (DossierAdm) wocomponent()
				.pageWithName(DossierAdm.class.getName());
		sess().setEtudiant(wocomponent().utilisateur());
		setSearch(Boolean.FALSE);
		setEdit(Boolean.FALSE);
		setAdmin(Boolean.FALSE);
		setExtract(Boolean.FALSE);
		setEditExam(Boolean.FALSE);
		setProf(Boolean.FALSE);
		setDoss(Boolean.TRUE);
		setRes(Boolean.FALSE);
		setEdt(Boolean.FALSE);
		return dossierPage;
	}

	public WOActionResults selectResUv() {
		ResultatsUV resUvPage = (ResultatsUV) wocomponent()
				.pageWithName(ResultatsUV.class.getName());
		sess().setEtudiant(wocomponent().utilisateur());
		setSearch(Boolean.FALSE);
		setEdit(Boolean.FALSE);
		setAdmin(Boolean.FALSE);
		setExtract(Boolean.FALSE);
		setEditExam(Boolean.FALSE);
		setProf(Boolean.FALSE);
		setDoss(Boolean.FALSE);
		setRes(Boolean.TRUE);
		setEdt(Boolean.FALSE);
		return resUvPage;
	}

	public WOActionResults selectEmploiDuTemps() {
		EmploiDuTemps edtPage = (EmploiDuTemps) wocomponent()
				.pageWithName(EmploiDuTemps.class.getName());
		sess().setEtudiant(wocomponent().utilisateur());
		setSearch(Boolean.FALSE);
		setEdit(Boolean.FALSE);
		setAdmin(Boolean.FALSE);
		setExtract(Boolean.FALSE);
		setEditExam(Boolean.FALSE);
		setProf(Boolean.FALSE);
		setDoss(Boolean.FALSE);
		setRes(Boolean.FALSE);
		setEdt(Boolean.TRUE);
		return edtPage;
	}
	// Fin Partie Etudiant

}
