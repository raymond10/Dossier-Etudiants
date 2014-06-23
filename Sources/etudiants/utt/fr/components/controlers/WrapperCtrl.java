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
	public EOEditingContext edc;
	public Session sess;
	private LeUser user = new LeUser();
	public NSMutableDictionary unUser = new NSMutableDictionary();
	public boolean search = false, edit = false, admin = false,
			extract = false, editExam = false, prof = false, doss = false,
			res = false, edt = false;

	public WrapperCtrl(Wrapper aWOComponent) {
		wocomponent = aWOComponent;
		edc = wocomponent.edc();
		sess = wocomponent.mySession();
		user = wocomponent.user();
		unUser = user.leUser();
	}

	public WOActionResults quitter() {
		return wocomponent.mySession().onQuitter();
	}

	public WOActionResults logOut() {
		return wocomponent.mySession().onLogOut();
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

	public boolean allAgent() {
		boolean lesAgents = unUser.valueForKey("role").equals(StringOperation.ADMINISTRATEUR)
				|| unUser.valueForKey("role").equals(StringOperation.PERSONNEL)
				|| unUser.valueForKey("role").equals(StringOperation.ENSEIGNANT);
		return lesAgents;
	}

	public boolean admin() {
		boolean admin = unUser.valueForKey("role").equals(StringOperation.ADMINISTRATEUR);
		return admin;
	}

	public boolean etudiant() {
		boolean etudiant = unUser.valueForKey("role").equals(StringOperation.ETUDIANT);
		return etudiant;
	}

	// Partie Agent
	public WOActionResults selectRecherche() {
		wocomponent.setDgActif(null);
		Recherche searchPage = (Recherche) wocomponent
				.pageWithName(Recherche.class.getName());
		return searchPage;
	}

	public WOActionResults selectEtdition() {
		wocomponent.setDgActif(null);
		Editions editPage = (Editions) wocomponent.pageWithName(Editions.class
				.getName());
		return editPage;
	}

	public WOActionResults selectAnnonce() {
		wocomponent.setDgActif(null);
		Annonces adminPage = (Annonces) wocomponent.pageWithName(Annonces.class
				.getName());
		return adminPage;
	}

	public WOActionResults selectExtraction() {
		wocomponent.setDgActif(null);
		Extractions extractPage = (Extractions) wocomponent
				.pageWithName(Extractions.class.getName());
		return extractPage;
	}

	public WOActionResults selectEdtExam() {
		wocomponent.setDgActif(null);
		EdtExams edtPage = (EdtExams) wocomponent.pageWithName(EdtExams.class
				.getName());
		return edtPage;
	}

	// Fin partie Agent

	// Partie Etudiant
	public WOActionResults selectProfil() {
		ProfilEtudiants profilPage = (ProfilEtudiants) wocomponent
				.pageWithName(ProfilEtudiants.class.getName());
		sess.setEtudiant(wocomponent.utilisateur());
		search = false;
		edit = false;
		admin = false;
		extract = false;
		editExam = false;
		prof = true;
		doss = false;
		res = false;
		edt = false;
		return profilPage;
	}

	public WOActionResults selectDossier() {
		DossierAdm dossierPage = (DossierAdm) wocomponent
				.pageWithName(DossierAdm.class.getName());
		sess.setEtudiant(wocomponent.utilisateur());
		search = false;
		edit = false;
		admin = false;
		extract = false;
		editExam = false;
		prof = false;
		doss = true;
		res = false;
		edt = false;
		return dossierPage;
	}

	public WOActionResults selectResUv() {
		ResultatsUV resUvPage = (ResultatsUV) wocomponent
				.pageWithName(ResultatsUV.class.getName());
		sess.setEtudiant(wocomponent.utilisateur());
		search = false;
		edit = false;
		admin = false;
		extract = false;
		editExam = false;
		prof = false;
		doss = false;
		res = true;
		edt = false;
		return resUvPage;
	}

	public WOActionResults selectEmploiDuTemps() {
		EmploiDuTemps edtPage = (EmploiDuTemps) wocomponent
				.pageWithName(EmploiDuTemps.class.getName());
		sess.setEtudiant(wocomponent.utilisateur());
		search = false;
		edit = false;
		admin = false;
		extract = false;
		editExam = false;
		prof = false;
		doss = false;
		res = false;
		edt = true;
		return edtPage;
	}
	// Fin Partie Etudiant

}
