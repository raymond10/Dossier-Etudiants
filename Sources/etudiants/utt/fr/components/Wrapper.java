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
package etudiants.utt.fr.components;

import org.login.fwkloginwebapp.common.LoginUserInfo;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WORedirect;
import com.webobjects.appserver.WOResponse;
import com.webobjects.foundation.NSLog;

import etudiants.utt.fr.components.controlers.WrapperCtrl;
import etudiants.utt.fr.server.Application;
import etudiants.utt.fr.server.MyAjaxComponent;
import etudiants.utt.fr.server.ProfilHelpers;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.server.VersionMe;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

public class Wrapper extends MyAjaxComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1709892188921393667L;
	private String userName = null;
	private String onload = "";
	private String bodyId = "";
	private Boolean connectUser = true;
	private WrapperCtrl ctrl;
	private Session sess;

	public Wrapper(WOContext context) {
		super(context);
		LoginUserInfo userInfo = sess().connectedUserInfo();
		if (userInfo != null) {
			setConnectUser(false);
		}
		if (ctrl().etudiant()) {
			sess().setEtudiant(utilisateur());
		}
	}

	@Override
	public void appendToResponse(WOResponse response, WOContext context) {
		super.appendToResponse(response, context);
		ProfilHelpers.insertStylesSheet(context, response);
		addScriptResource(response, "jscript/wz_tooltip.js", null,
				"FwkLoginWebApp.framework", RESOURCE_TYPE_JSCRIPT,
				RESOURCE_DEST_END_BODY, RESOURCE_FROM_WEB_SERVER_RESOURCES);
	}

	/**
	 * @return the sess
	 */
	public Session sess() {
		if(sess == null)
			sess = mySession();
		return sess;
	}

	/**
	 * @param sess the sess to set
	 */
	public void setSess(Session sess) {
		this.sess = sess;
	}

	/**
	 * @return the ctrl
	 */
	public WrapperCtrl ctrl() {
		if(ctrl == null)
			ctrl = new WrapperCtrl(this);
		return ctrl;
	}

	/**
	 * @param ctrl
	 *            the ctrl to set
	 */
	public void setCtrl(WrapperCtrl ctrl) {
		this.ctrl = ctrl;
	}

	/**
	 * @return the connectUser
	 */
	public Boolean getConnectUser() {
		return connectUser;
	}

	/**
	 * @param connectUser
	 *            the connectUser to set
	 */
	public void setConnectUser(Boolean connectUser) {
		this.connectUser = connectUser;
	}

	public String icon() {
		return application().resourceManager().urlForResourceNamed(
				"image/favicon.ico", null, null, context().request());
	}

	public String copyright() {
		return myApp().copyright();
		// return VersionMe.copyright();
	}

	public WOActionResults casLogOut() {
		WORedirect nextPage = (WORedirect) loginApp.pageWithName(
				WORedirect.class.getName(), context());
		String url = myApp().casLogOutURL();
		nextPage.setUrl(url);
		mySession().terminate();
		return nextPage;
	}

	public String bdServerId() {
		return Application.bdServerId;
	}

	public String version() {
		return VersionMe.htmlAppliVersion();
	}

	public String getOnload() {
		onload = (String) valueForBinding("onload");
		return onload;
	}

	public void setOnload(String onload) {
		this.onload = onload;
	}

	/**
	 * @return the bodyId
	 */
	public String getBodyId() {
		bodyId = (String) valueForBinding("bodyId");
		return bodyId;
	}

	/**
	 * @param bodyId
	 *            the bodyId to set
	 */
	public void setBodyId(String bodyId) {
		this.bodyId = bodyId;
	}

	public String userName() {
		if (userName == null) {
			LoginUserInfo userInfo = mySession().connectedUserInfo();
			if (userInfo != null) {
				userName = userInfo.nomEtPrenom();
			}
		}
		return userName;
	}

	public String pageTitle() {
		if (hasBinding("pageTitle")) {
			return "- " + (String) valueForBinding("pageTitle");
		} else {
			return null;
		}
	}

	public void fermerMessage() {
		mySession().setAlertMessage(null);
		setOnload("");
		return;
	}

	public boolean isAfficherAlerte() {
		boolean isAfficherAlerte = false;
		String alertMsg = mySession().getAlertMessage();
		if (alertMsg != null && alertMsg.equals("") == false) {
			isAfficherAlerte = true;
		}
		return isAfficherAlerte;
	}

	public boolean browser() {
		if (mySession().browser().isIPad() || mySession().browser().isIPhone()
				|| mySession().browser().isUnknownPlatform()
				|| mySession().browser().isLinux())
			NSLog.out.appendln("Plateforme : "
					+ mySession().browser().platform());
		return mySession().browser().isIPad()
				|| mySession().browser().isIPhone()
				|| mySession().browser().isUnknownPlatform()
				|| mySession().browser().isLinux();
	}
}
