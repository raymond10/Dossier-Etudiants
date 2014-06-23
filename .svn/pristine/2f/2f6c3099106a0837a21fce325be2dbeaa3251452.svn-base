/**
 * 
 */
package etudiants.utt.fr.server;

import com.webobjects.appserver.WOAction;
import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WORequest;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

public class ContentAction extends WOAction {

	/**
	 * @param aRequest
	 */
	public ContentAction(WORequest aRequest) {
		super(aRequest);
		// TODO Auto-generated constructor stub
	}

	private static String _getSessionIDFromValuesOrCookie(WORequest request,
			boolean lookInCookiesFirst) {
		boolean isStream = Application.app().streamActionRequestHandlerKey()
				.equals(request.requestHandlerKey());
		String aSessionID = null;
		if (lookInCookiesFirst) {
			aSessionID = request.cookieValueForKey(Application.app()
					.sessionIdKey());
			if (aSessionID == null && !isStream)
				aSessionID = request.stringFormValueForKey(Application.app()
						.sessionIdKey());
		} else {
			if (!isStream)
				aSessionID = request.stringFormValueForKey(Application.app()
						.sessionIdKey());
			if (aSessionID == null)
				aSessionID = request.cookieValueForKey(Application.app()
						.sessionIdKey());
		}
		return aSessionID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.webobjects.appserver.WOAction#getSessionIDForRequest(com.webobjects
	 * .appserver.WORequest)
	 */
	@Override
	public String getSessionIDForRequest(WORequest request) {
		// TODO Auto-generated method stub
		String aSessionID = null;
        if(request != null)
            aSessionID = _getSessionIDFromValuesOrCookie(request, false);
        return aSessionID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.webobjects.appserver.WOAction#performActionNamed(java.lang.String)
	 */
	@Override
	public WOActionResults performActionNamed(String paramString) {
		// TODO Auto-generated method stub
		return null;
	}

}
