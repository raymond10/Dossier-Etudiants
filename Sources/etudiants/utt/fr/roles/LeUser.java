/**
 * 
 */
package etudiants.utt.fr.roles;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;

import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.server.process.ProcessGestionRechercheEtudiants;

/**
 * @author naneon
 * 
 */
@SuppressWarnings("all")
public class LeUser {

	private NSMutableDictionary leUser;
	public Boolean isconseiller = Boolean.FALSE;
	public boolean isAutorized = false;
	public static Boolean isGcTC = null;
	public static ProcessGestionRechercheEtudiants gestEtu;

	public LeUser() {
		// TODO Auto-generated constructor stub
	}

	public Boolean Autorization(Session session, EOIndividu id) {
		Integer noIndiv = Integer.valueOf(id.primaryKey());
		leUser = null;
		isconseiller = !EOIndividu.lesConseillers(session.editingContext(),
				id.primaryKey()).isEmpty();
		//Acces GCTC
		AutorisationGCTC(session, noIndiv);
		// Enseignants
		if (VEnseignant.isEnseignant(session.editingContext(), id)) {
			leUser = null;
			isAutorized = true;
			leUser().put("role", "enseignant");
			leUser().put("isconseiller", isconseiller);
			leUser().put("isAutorized", isAutorized);
			leUser().put("isAutorizedGcTc", isGcTC);
			leUser().put("indiv_id", session.getUtilisateur().primaryKey());
			leUser().put("login", session.getUtilisateur().login());
			leUser().put(
					"mail",
					session.getUtilisateur().indEmails().objectAtIndex(0)
							.indEmail());
			return true;
		}
		// Administrateurs
		if (VIadmin.isAdmin(session.editingContext(), id)) {
			leUser = null;
			isAutorized = true;
			leUser().put("role", "administrateur");
			leUser().put("isconseiller", isconseiller);
			leUser().put("isAutorized", isAutorized);
			leUser().put("isAutorizedGcTc", isGcTC);
			leUser().put("indiv_id", session.getUtilisateur().primaryKey());
			leUser().put("login", session.getUtilisateur().login());
			leUser().put(
					"mail",
					session.getUtilisateur().indEmails().objectAtIndex(0)
							.indEmail());
			return true;
		}
		// Personnels
		if (VPersonnel.isPersonnel(session.editingContext(), id)) {
			leUser = null;
			isAutorized = true;
			leUser().put("role", "personnel");
			leUser().put("isconseiller", isconseiller);
			leUser().put("isAutorized", isAutorized);
			leUser().put("isAutorizedGcTc", isGcTC);
			leUser().put("indiv_id", session.getUtilisateur().primaryKey());
			leUser().put("login", session.getUtilisateur().login());
			leUser().put(
					"mail",
					session.getUtilisateur().indEmails().objectAtIndex(0)
							.indEmail());
			return true;
		}
		// Etudiants
		if (EOIndividu.isEtudiant(session.editingContext(), id)) {
			leUser = null;
			isAutorized = true;
			leUser().put("role", "etudiant");
			leUser().put("isconseiller", isconseiller);
			leUser().put("isAutorized", isAutorized);
			leUser().put("isAutorizedGcTc", false);
			leUser().put("indiv_id", session.getUtilisateur().primaryKey());
			leUser().put("login", session.getUtilisateur().login());
			leUser().put(
					"mail",
					session.getUtilisateur().indEmails().objectAtIndex(0)
							.indEmail());
			return true;
		}
		// Non autoris�
		if (!leUser().containsKey("role")) {
			leUser().put("role", "pasautorise");
			leUser().put("isconseiller", isconseiller);
			leUser().put("isAutorized", isAutorized);
			leUser().put("isAutorizedGcTc", false);
			leUser().put("indiv_id", session.getUtilisateur().primaryKey());
			leUser().put("login", session.getUtilisateur().login());
		}
		return false;
	}

	/**
	 * @return the leUser
	 */
	public NSMutableDictionary leUser() {
		if (leUser == null)
			leUser = new NSMutableDictionary();
		return leUser;
	}

	/**
	 * @param leUser
	 *            the leUser to set
	 */
	public void setLeUser(NSMutableDictionary leUser) {
		this.leUser = leUser;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LeUser [leUser=" + leUser + "]";
	}

	protected static void AutorisationGCTC(Session session, Integer noIndiv) {
		EOEditingContext ed = session.defaultEditingContext();
		gestEtu = new ProcessGestionRechercheEtudiants();
		NSMutableDictionary requetePersId = (NSMutableDictionary) gestEtu
				.selectRawRowrequetePersId(ed, noIndiv).lastObject();
		String persId = requetePersId.valueForKey("COCK_PERS_ID").toString();
		NSMutableDictionary hasPermission = (NSMutableDictionary) gestEtu.selectRawRowfunctionHasPermission(ed, Integer.valueOf(persId)).lastObject();
		Double ng_msg = (Double) hasPermission.valueForKey("NB_MSG");
		if(ng_msg.intValue() == 1) {
			isGcTC = true;
		} else {
			isGcTC = false;
		}
	}

}
