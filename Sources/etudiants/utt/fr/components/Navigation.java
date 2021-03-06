package etudiants.utt.fr.components;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOResponse;

import etudiants.utt.fr.components.controlers.NavigationCtrl;
import etudiants.utt.fr.server.MyAjaxComponent;
import etudiants.utt.fr.server.ProfilHelpers;
import etudiants.utt.fr.util.StringOperation;

public class Navigation extends MyAjaxComponent {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3072115890104911384L;
	private NavigationCtrl ctrl;
	private String onload = "";
	private String bodyId = "";

	public Navigation(WOContext context) {
        super(context);
    }
	
	@Override
	public void appendToResponse(WOResponse response, WOContext context) {
		super.appendToResponse(response, context);
		ProfilHelpers.insertStylesSheet(context, response);
		addScriptResource(response, "jscript/wz_tooltip.js", null, StringOperation.FWKLOGINWEBAPP, 
		                            RESOURCE_TYPE_JSCRIPT, RESOURCE_DEST_END_BODY, RESOURCE_FROM_WEB_SERVER_RESOURCES);
	}

	/**
	 * @return the ctrl
	 */
	public NavigationCtrl ctrl() {
		if(ctrl == null)
			ctrl = new NavigationCtrl(this);
		return ctrl;
	}

	/**
	 * @param ctrl the ctrl to set
	 */
	public void setCtrl(NavigationCtrl ctrl) {
		this.ctrl = ctrl;
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
	 * @param bodyId the bodyId to set
	 */
	public void setBodyId(String bodyId) {
		this.bodyId = bodyId;
	}
	
	public String icon() {
		return application().resourceManager().urlForResourceNamed(
				"image/favicon.ico", null, null, context().request());
	}
}