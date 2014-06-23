/*******************************************************************************
 * DOSSIER-ETUDIANT
 * Copyright UNIVERSITE DE TECHNOLOGIE DE TROYES - CEDRE (www.utt.fr), since 1993 
 * This software is governed by the CeCILL license under French law and abiding by the
 * rules of distribution of free software. You can use, modify and/or 
 * redistribute the software under the terms of the CeCILL license as 
 * circulated by CEA, CNRS and INRIA at the following URL 
 * "http://www.cecill.info". 
 * As a counterpart to the access to the source code and rights to copy, modify 
 * and redistribute granted by the license, users are provided only with a 
 * limited warranty and the software's author, the holder of the economic 
 * rights, and the successive licensors have only limited liability. In this 
 * respect, the user's attention is drawn to the risks associated with loading,
 * using, modifying and/or developing or reproducing the software by the user 
 * in light of its specific status of free software, that may mean that it
 * is complicated to manipulate, and that also therefore means that it is 
 * reserved for developers and experienced professionals having in-depth
 * computer knowledge. Users are therefore encouraged to load and test the 
 * software's suitability as regards their requirements in conditions enabling
 * the security of their systems and/or data to be ensured and, more generally, 
 * to use and operate it in the same conditions as regards security. The
 * fact that you are presently reading this means that you have had knowledge 
 * of the CeCILL license and that you accept its terms.
 * 
 * Do not remove this copyright message
 ******************************************************************************/
// Generated by the WOLips Templateengine Plug-in at 23 mars 2011 09:02:59
package etudiants.utt.fr.server;

import org.cedre.fwkuttajaxwebext.serveur.UttAjaxSession;
import org.cedre.fwkuttajaxwebext.serveur.component.UttAjaxWindow;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.eoaccess.EODatabaseChannel;
import com.webobjects.eoaccess.EODatabaseContext;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation.NSNotification;
import com.webobjects.foundation.NSNotificationCenter;
import com.webobjects.foundation.NSSelector;
import com.webobjects.foundation.NSTimestamp;

import er.extensions.eof.ERXEC;
import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.roles.LeUser;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

@SuppressWarnings("rawtypes")
public class Session extends UttAjaxSession {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5185125063446349388L;
	String alertMessage = null;
	String messageErreur = null;
	private String searchMsg;
	private String generalErrorMessage;
	Boolean utilisateurAvecDroit = null;
	EOEditingContext nestedEdc = null;
	// private LoginUserInfo connectedUserInfo;
	EOIndividu utilisateur = null;
	private final int DatabaseChannelCountMax = 3;
	private EOIndividu etudiant;
	private EOEditingContext editingContext;
	public WODisplayGroup dgActif = null;
	public WODisplayGroup etudiantActif = null;
	private Boolean retourAlaListe = false;
	private Integer currentBatchIndex;
	LeUser newUser = new LeUser();
	private NSMutableDictionary totalCursor;
	private NSMutableDictionary totauxCursor;
	private NSMutableDictionary periodeCourante;
	private NSMutableDictionary anneeCourante;

	public Session() {
		super();
		try {
			// sauvegarde des IDs de session dans un cookie
			//setStoresIDsInCookies(true);
			//setStoresIDsInURLs(false);
			NSNotificationCenter.defaultCenter().addObserver(
					this,
					new NSSelector("registerNewDatabaseChannel",
							new Class[] { NSNotification.class }),
					EODatabaseContext.DatabaseChannelNeededNotification, null);
			// NSLog.out.appendln("SESSION CREATED " + sessionID());
			setWindowsClassName(UttAjaxWindow.WINDOWS_CLASS_NAME_BLUELIGHTING);
		} catch (Exception e) {

		}
	}
	
	/**
	 * @return the etudiant
	 */
	public EOIndividu getEtudiant() {
		return etudiant;
	}

	/**
	 * @param etudiant
	 *            the etudiant to set
	 */
	public void setEtudiant(EOIndividu etudiant) {
		this.etudiant = etudiant;
	}

	/**
	 * @param generalErrorMessage
	 *            the generalErrorMessage to set
	 */
	public void setGeneralErrorMessage(String generalErrorMessage) {
		this.generalErrorMessage = generalErrorMessage;
	}

	/**
	 * @return the generalErrorMessage
	 */
	public String getGeneralErrorMessage() {
		return generalErrorMessage;
	}

	/**
	 * @return the searchMsg
	 */
	public String getSearchMsg() {
		return searchMsg;
	}

	/**
	 * @param searchMsg
	 *            the searchMsg to set
	 */
	public void setSearchMsg(String searchMsg) {
		this.searchMsg = searchMsg;
	}

	public NSDictionary exceptionInfos() {
		return null;
	}

	public EOEditingContext editingContext() {
		if (editingContext == null)
			editingContext = ERXEC.newEditingContext();
		return editingContext;
	}

	public void reset() {
		if (editingContext() != null) {
			editingContext().revert();
		}
		utilisateur = null;
		utilisateurAvecDroit = null;
	}

	/**
	 * @return the nestedEdc
	 */
	public EOEditingContext getNestedEdc() {
		return nestedEdc;
	}

	/**
	 * @param nestedEdc the nestedEdc to set
	 */
	public void setNestedEdc(EOEditingContext nestedEdc) {
		this.nestedEdc = nestedEdc;
	}

	public void registerNewDatabaseChannel(NSNotification notification) {
		EODatabaseContext databaseContext = (EODatabaseContext) notification
				.object();
		if (databaseContext.registeredChannels().count() < DatabaseChannelCountMax) {
			EODatabaseChannel channel = new EODatabaseChannel(databaseContext);
			databaseContext.registerChannel(channel);
		}
	}

	/**
	 * @return the totalCursor
	 */
	public NSMutableDictionary getTotalCursor() {
		return totalCursor;
	}

	/**
	 * @param totalCursor
	 *            the totalCursor to set
	 */
	public void setTotalCursor(NSMutableDictionary totalCursor) {
		this.totalCursor = totalCursor;
	}

	/**
	 * @return the totauxCursor
	 */
	public NSMutableDictionary getTotauxCursor() {
		return totauxCursor;
	}

	/**
	 * @param totauxCursor
	 *            the totauxCursor to set
	 */
	public void setTotauxCursor(NSMutableDictionary totauxCursor) {
		this.totauxCursor = totauxCursor;
	}

	/**
	 * @return the periodeCourante
	 */
	public NSMutableDictionary getPeriodeCourante() {
		return periodeCourante;
	}

	/**
	 * @param periodeCourante
	 *            the periodeCourante to set
	 */
	public void setPeriodeCourante(NSMutableDictionary periodeCourante) {
		this.periodeCourante = periodeCourante;
	}

	/**
	 * @return the anneeCourante
	 */
	public NSMutableDictionary getAnneeCourante() {
		return anneeCourante;
	}

	/**
	 * @param anneeCourante
	 *            the anneeCourante to set
	 */
	public void setAnneeCourante(NSMutableDictionary anneeCourante) {
		this.anneeCourante = anneeCourante;
	}

	public EOIndividu getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(EOIndividu utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * @return the newUser
	 */
	public LeUser getNewUser() {
		return newUser;
	}

	/**
	 * @param newUser
	 *            the newUser to set
	 */
	public void setNewUser(LeUser newUser) {
		this.newUser = newUser;
	}

	public String setConnectedUser(String arg0) {
		String str = super.setConnectedUser(arg0);
		if (connectedUserInfo() != null) {
			if (connectedUserInfo().email() != null) {
				if (((Application) WOApplication.application()).utilisateurs()
						.indexOfIdenticalObject(connectedUserInfo().email()) == NSArray.NotFound)
					((Application) WOApplication.application()).utilisateurs()
							.addObject(connectedUserInfo().email());
				System.out.println("----Connexion de "
						+ connectedUserInfo().nomEtPrenom() + " (noIndividu ="
						+ connectedUserInfo().noIndividu() + ") le "
						+ (new NSTimestamp()) + " depuis IP : "
						+ loginApp.getRequestIPAddress(context().request()));
			} else {
				str = "Veuillez renseigner votre adresse email avant de vous connecter.";
			}
		}

		return str;
	}

	public String getMessageErreur() {
		return messageErreur;
	}

	public void setMessageErreur(String messageErreur) {
		this.messageErreur = messageErreur;
	}

	public String getAlertMessage() {
		return alertMessage;
	}

	public void setAlertMessage(String alertMessage) {
		this.alertMessage = alertMessage;
	}

	public void terminate() {
		NSMutableArray users = ((Application) WOApplication.application())
				.utilisateurs();
		if (users != null && users.count() > 0) {
			if (connectedUserInfo() != null
					&& connectedUserInfo().email() != null) {
				users.removeIdenticalObject(connectedUserInfo().email());
			}
		}
		super.terminate();
	}

	/**
	 * @return the utilisateurAvecDroit
	 */
	public Boolean getUtilisateurAvecDroit() {
		return utilisateurAvecDroit;
	}

	public void setUtilisateurAvecDroit(Boolean utilisateurAvecDroit) {
		this.utilisateurAvecDroit = utilisateurAvecDroit;
	}

	public WOActionResults onQuitter() {
		terminate();
		return goToMainSite();
	}

	public WOActionResults onLogOut() {
		terminate();
		return logout();
	}

	@Override
	public void awake() {
		super.awake();
		if (getUtilisateur() != null) {
			// peremet de passer le persId aux objets metiers qui exploitent
			// cette cl�
			// ERXThreadStorage.takeValueForKey(getUtilisateur().indivId(),
			// PersonneApplicationUser.PERS_ID_CURRENT_USER_STORAGE_KEY);
		}

	}

	public WODisplayGroup dgActif() {
		return dgActif;
	}

	public void setDgActif(WODisplayGroup dgActif) {
		this.dgActif = dgActif;
	}

	/**
	 * @return the etudiantActif
	 */
	public WODisplayGroup etudiantActif() {
		return etudiantActif;
	}

	/**
	 * @param etudiantActif
	 *            the etudiantActif to set
	 */
	public void setEtudiantActif(WODisplayGroup etudiantActif) {
		this.etudiantActif = etudiantActif;
	}

	/**
	 * @return the retourAlaListe
	 */
	public Boolean getRetourAlaListe() {
		return retourAlaListe;
	}

	/**
	 * @param retourAlaListe
	 *            the retourAlaListe to set
	 */
	public void setRetourAlaListe(Boolean retourAlaListe) {
		this.retourAlaListe = retourAlaListe;
	}

	/**
	 * @return the currentBatchIndex
	 */
	public Integer getCurrentBatchIndex() {
		return currentBatchIndex;
	}

	/**
	 * @param currentBatchIndex the currentBatchIndex to set
	 */
	public void setCurrentBatchIndex(Integer currentBatchIndex) {
		this.currentBatchIndex = currentBatchIndex;
	}
}
