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
import etudiants.utt.fr.components.Navigation;
import etudiants.utt.fr.components.ProfilEtudiants;
import etudiants.utt.fr.components.Recherche;
import etudiants.utt.fr.components.ResultatsUV;
import etudiants.utt.fr.roles.LeUser;
import etudiants.utt.fr.server.Session;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 *
 */
@SuppressWarnings("all")
public class NavigationCtrl extends ModuleCtrl<Navigation> {

	public EOEditingContext edc;
	public Session sess;
	private LeUser user;
	private NSMutableDictionary unUser;
	public boolean search = false, edit = false, admin = false, extract = false,
				   editExam = false, prof = false, doss=false, res = false, edt = false;

	/**
	 * @param component
	 */
	public NavigationCtrl(Navigation component) {
		super(component);
		// TODO Auto-generated constructor stub
		edc = wocomponent().edc();
		sess = wocomponent().mySession();
		setUser(wocomponent().user());
		setUnUser(user().leUser());
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
	 * @param user the user to set
	 */
	public void setUser(LeUser user) {
		this.user = user;
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

	public boolean allAgent(){
		boolean lesAgents =  unUser().valueForKey("role").equals("administrateur") || unUser().valueForKey("role").equals("personnel") || unUser().valueForKey("role").equals("enseignant");
		return lesAgents;
	}
	
	public boolean admin(){
		boolean admin =  unUser().valueForKey("role").equals("administrateur");
		return admin;
	}
	
	public boolean etudiant(){
		boolean etudiant = unUser().valueForKey("role").equals("etudiant");
		return etudiant;
	}
	
	//Partie Agent
	public WOActionResults selectRecherche() {
		wocomponent().setDgActif(null);
		Recherche searchPage = (Recherche) wocomponent().pageWithName(Recherche.class.getName());
		return searchPage;
	}
	public WOActionResults selectEtdition() {
		wocomponent().setDgActif(null);
		Editions editPage = (Editions) wocomponent().pageWithName(Editions.class.getName());
		return editPage;
	}
	public WOActionResults selectAnnonce() {
		wocomponent().setDgActif(null);
		Annonces adminPage = (Annonces) wocomponent().pageWithName(Annonces.class.getName());
		return adminPage;
	}
	public WOActionResults selectExtraction() {
		wocomponent().setDgActif(null);
		Extractions extractPage = (Extractions) wocomponent().pageWithName(Extractions.class.getName());
		return extractPage;
	}
	public WOActionResults selectEdtExam() {
		wocomponent().setDgActif(null);
		EdtExams edtPage = (EdtExams) wocomponent().pageWithName(EdtExams.class.getName());
		return edtPage;
	}
	//Fin partie Agent
	
	//Partie Etudiant
	public WOActionResults selectProfil() {
		ProfilEtudiants profilPage = (ProfilEtudiants) wocomponent().pageWithName(ProfilEtudiants.class.getName());
		sess.setEtudiant(wocomponent().utilisateur());
		search = false;
		edit = false; admin = false; extract = false;
		editExam = false; prof = true; doss=false; 
		res = false; edt = false;
		return profilPage;
	}
	
	public WOActionResults selectDossier() {
		DossierAdm dossierPage = (DossierAdm) wocomponent().pageWithName(DossierAdm.class.getName());
		sess.setEtudiant(wocomponent().utilisateur());
		search = false;
		edit = false; admin = false; extract = false;
		editExam = false; prof = false; doss=true; 
		res = false; edt = false;
		return dossierPage;
	}
	
	public WOActionResults selectResUv() {
		ResultatsUV resUvPage = (ResultatsUV) wocomponent().pageWithName(ResultatsUV.class.getName());
		sess.setEtudiant(wocomponent().utilisateur());
		search = false;
		edit = false; admin = false; extract = false;
		editExam = false; prof = false; doss=false; 
		res = true; edt = false;
		return resUvPage;
	}
	
	public WOActionResults selectEmploiDuTemps() {
		EmploiDuTemps edtPage = (EmploiDuTemps) wocomponent().pageWithName(EmploiDuTemps.class.getName());
		sess.setEtudiant(wocomponent().utilisateur());
		search = false;
		edit = false; admin = false; extract = false;
		editExam = false; prof = false; doss=false; 
		res = false; edt = true;
		return edtPage;
	}
	//Fin Partie Etudiant

}
