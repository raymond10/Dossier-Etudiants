/**
 * 
 */
package etudiants.utt.fr.server;

import org.login.fwkloginwebapp.common.LoginLog;
import org.login.fwkloginwebapp.server.components.LoginAlertPage;
import org.login.fwkloginwebapp.server.components.LoginLoginResponder;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WORequest;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;

import etudiants.utt.fr.components.ProfilEtudiants;
import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.server.process.ProcessGestionRechercheEtudiants;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 *
 */

@SuppressWarnings("all")
public class DAConsultProfil extends DirectAction {
	
	public final static String ETU_ID_KEY = "etuId";
	private NSDictionary actionParams;
	public static ProcessGestionRechercheEtudiants gestEtu;

	/**
	 * @param request
	 */
	public DAConsultProfil(WORequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * @see DirectAction#casLoginLink()
	 */
	public String casLoginLink() {
		return getLoginActionURL(context(), false, "etudiants.utt.fr.server.DAConsultProfil", true, actionParams);
	}
	
	public WOActionResults defaultAction() {
		try {
			try {
				int etuId = Integer.parseInt(request().stringFormValueForKey(ETU_ID_KEY));
				setLoginComment("Acc�s au profil de l'�tudiant etuId : " + etuId);
				actionParams = new NSDictionary(new Integer(etuId), ETU_ID_KEY);
				if (useCasService())
					return pageForURL(getLoginActionURL(context(), false, DAConsultProfil.class.getCanonicalName(), true, actionParams));
				else
					return loginNoCasPage(actionParams);
			} catch (NumberFormatException e) {
				throw new Exception("Impossible de r�cup�rer le n� de l'�tudiant : " + request().stringFormValueForKey(ETU_ID_KEY));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return getErrorPage(e.getMessage());
		}
	}
	
	public WOActionResults loginCasSuccessPage(String netid, NSDictionary actionParams) {
		WOActionResults nextPage = super.loginCasSuccessPage(netid, actionParams);
		LoginLog.trace(null);
		String errorMsg = DossierEtuSession().setConnectedUser(netid);
		if (!(nextPage instanceof LoginAlertPage)) {
			nextPage = getDestPage(DossierEtuSession(), actionParams);
		}
		return nextPage;
	}

	public WOComponent getDestPage(Session session, NSDictionary actionParams) {
		try {
			LoginLog.log("login : " + session.connectedUserInfo().login() + ", type : DAConsultProfil - OK");
			String strEtuIdOrdre = actionParams.valueForKey(ETU_ID_KEY).toString();
			int etuId = Integer.parseInt(strEtuIdOrdre);
			EOEditingContext edc = session.defaultEditingContext();
			gestEtu = new ProcessGestionRechercheEtudiants();
			session.setPeriodeCourante((NSMutableDictionary) gestEtu
					.selectRawRowPeriodeCourante(edc).objectAtIndex(0));
			NSArray etudiants = EOUtilities.objectsMatchingKeyAndValue(
					edc, EOIndividu.ENTITY_NAME, "indivId",	etuId);
			if (etudiants != null && etudiants.count() == 1) {
				session.setEtudiant((EOIndividu) etudiants.lastObject());
			} else {
				throw new Exception("Il existe des doublons pour cet identifiant : "+etuId);				
			}
			if (session.getNewUser().leUser().valueForKey("role").equals("pasautorise")) {
				throw new Exception("Vous n'avez pas le droit d'acc�der � cette application.");
			}
			ProfilEtudiants nextPage = (ProfilEtudiants) loginApp.pageWithName(ProfilEtudiants.class.getName(), session.context());
			return nextPage;
		} catch (Exception e) {
			e.printStackTrace();
			return getErrorPage(e.getMessage());
		}

	}

	public LoginLoginResponder getNewLoginResponder(NSDictionary actionParams) {
		return new DefaultLoginResponder(actionParams);
	}

	public static String buildLink(Session session, Integer etuId) {
		return ((Application) session.application()).getApplicationURL(session.context()) + "/wa/DAConsultProfil?etuId=" + etuId;
	}

}
