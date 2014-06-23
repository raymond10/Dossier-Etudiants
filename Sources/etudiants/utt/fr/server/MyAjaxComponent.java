/**
 * 
 */
package etudiants.utt.fr.server;

import org.apache.log4j.Logger;
import org.cedre.fwkuttajaxwebext.serveur.UttAjaxWOComponent;
import org.cedre.fwkuttajaxwebext.serveur.UttResourceProvider;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;
import com.webobjects.eocontrol.EOEditingContext;

import er.extensions.appserver.ERXWOContext;
import er.extensions.eof.ERXEC;
import er.extensions.localization.ERXLocalizer;
import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.roles.LeUser;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

public class MyAjaxComponent extends UttAjaxWOComponent implements UttResourceProvider {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1435918229099891739L;
	public static final Logger LOG = Logger.getLogger(MyAjaxComponent.class);
	private String _id;

	public MyAjaxComponent(WOContext context) {
		super(context);
	}
	
	public boolean synchronizesVariablesWithBindings() {
		return false;
	}
	
	@Override
	public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {
		super.takeValuesFromRequest(aRequest, aContext);
	}
	
	@Override
	public void appendToResponse(WOResponse response, WOContext context) {
		
		super.appendToResponse(response, context);

		
	}
	
	@Override
	public void injectResources(WOResponse response, WOContext context) {
		// TODO Auto-generated method stub
		ProfilHelpers.insertStylesSheet(context, response);	
	}

	public Application myApp() {
		return (Application) application();
	}

	public Session mySession() {
		return (Session) session();
	}
	
	public ERXLocalizer localizer() {
    	return mySession().localizer();
    }

	public EOIndividu utilisateur() {
		return mySession().getUtilisateur();
	}
	
/*	public EOIndividu etudiant(){
		return session.getEtudiant();
	}
	
	public void setLetudiant(EOIndividu etudiant){
		session.setEtudiant(etudiant);
	}*/
	
	public LeUser user(){
		return mySession().getNewUser();
	}
	
	public void setLeUser(LeUser user){
		mySession().setNewUser(user);
	}
	
	/**
	 * @return the utilisateurAvecDroit
	 */
	public Boolean userAvecDroit() {
		return mySession().getUtilisateurAvecDroit();
	}

	public void setUserAvecDroit(Boolean utilisateurAvecDroit) {
		mySession().setUtilisateurAvecDroit(utilisateurAvecDroit);
	}

	public EOIndividu utilisateurInContext(EOEditingContext ed) {
		EOIndividu user = mySession().getUtilisateur();
		if (user.editingContext().equals(ed) == false) {
			try {
				user = (EOIndividu) ed.faultForGlobalID(
					edc().globalIDForObject(user), ed);
			} catch (Exception e) {
			}
		}
		return user;
	}

	public EOEditingContext edc() {
		return ERXEC.newEditingContext();
	}

	public WODisplayGroup getDgActif() {
		return mySession().dgActif();
	}

	public void setDgActif(WODisplayGroup dgActif) {
		mySession().setDgActif(dgActif);
	}

	public WODisplayGroup getEtudiantActif() {
		return mySession().etudiantActif();
	}

	public void setEtudiantActif(WODisplayGroup etudiantActif) {
		mySession().setEtudiantActif(etudiantActif);
	}

	protected String uniqueDomId() {
		if (_id == null)
			_id = ERXWOContext.safeIdentifierName(context(), true);
		return _id;
	}
	
	public WOActionResults doNothing() {
		return null;
	}
	
	public void addSimpleErrorMessage(String titre, Throwable exception) {
		if (LOG.isDebugEnabled()) {
			exception.printStackTrace();
		}
		mySession().addSimpleErrorMessage(titre, exception);
	}

}
