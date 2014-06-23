/**
 * 
 */
package etudiants.utt.fr.server;

import com.webobjects.appserver.WOAction;
import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WODynamicURL;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WORequestHandler;
import com.webobjects.appserver.WOResponse;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

public class ContentRequestHandler extends WORequestHandler {

	/**
	 * 
	 */
	private WOResponse nullResponse;

	public ContentRequestHandler() {
		// TODO Auto-generated constructor stub
	}

	public WOResponse generateRequestRefusal(WORequest aRequest) {
		WODynamicURL aURIString = aRequest._uriDecomposed();
		String contentString = (new StringBuilder())
				.append("Désolé, votre demande n'a pas pu être immédiatement traitées. S'il vous plaît essayer cette URL: <a href=\"")
				.append(aURIString).append("\">").append(aURIString)
				.append("</a>").toString();
		aURIString.setApplicationNumber("-1");
		WOResponse aResponse = WOApplication.application()
				.createResponseInContext(null);
		WOResponse._redirectResponse(aResponse, aURIString.toString(),
				contentString);
		return aResponse;
	}

	public WOResponse nullResponse() {
		if (nullResponse == null) {
			nullResponse = Application.app().createResponseInContext(null);
			nullResponse.setStatus(500);
			nullResponse
					.appendContentString("<html><head><title>Errorlt;/title></head><body>Votre requête produit une erreur.</body></html>");
		}
		return nullResponse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.webobjects.appserver.WORequestHandler#handleRequest(com.webobjects
	 * .appserver.WORequest)
	 */
	@Override
	public WOResponse handleRequest(WORequest request) {
		// TODO Auto-generated method stub
		WOResponse aResponse = null;
		WOApplication anApplication = Application.app();
		if (anApplication.isRefusingNewSessions()
				&& !request.isSessionIDInRequest()
				&& request.isUsingWebServer()) {
			aResponse = generateRequestRefusal(request);
		} else {
			Object lock = anApplication.requestHandlingLock();
			if (lock != null)
				synchronized (lock) {
					aResponse = _handleRequest(request);
				}
			else
				aResponse = _handleRequest(request);
		}
		if (aResponse == null)
			aResponse = nullResponse();
		return aResponse;
	}

	public WOResponse _handleRequest(WORequest request) {
		// Retrieve the application object. We need to inform it of awake/sleep
		// and use some of its helper methods.
		WOApplication application = Application.app();

		WOResponse response;
		WOContext context;

		application.awake();
		try {
			// Instantiate the action object for this request.
			// The WOAction sets up the context and restores the session and so
			// on.
			WOAction action = new ContentAction(request);

			// Retrieve the context object from the action.
			context = action.context();

			// Retrieve the content path. e.g. blog or blog/2009/10/10/foobar or
			// whatever.
			String contentPath = request.requestHandlerPath();

			// TODO: We probably could use some exception handling here.
			// 1. performActionNamed throws generating the WOActionResults
			// 2. performActionNamed returns null
			// 3. generateResponse throws
			// 4. generateResponse returns null (although we do kind of handle
			// this already).

			// Ask the action object to handle the request. Unlike normal action
			// objects the
			// ContentAction object takes a path instead of the first part of a
			// method name.
			WOActionResults actionResults = action
					.performActionNamed(contentPath);

			// Generate the response object.
			if (actionResults != null)
				response = actionResults.generateResponse();
			else
				response = null;

			// FIXME: When we do add error handling, do we or don't we save the
			// session in the
			// event of an error?
			if (context != null) {
				// Check the session in to the session store. Particularly
				// important if the
				// session store is out of process.
				application.saveSessionForContext(context);
			}
		} finally {
			// End of request.
			application.sleep();
		}

		// Ah, the joys of calling private APIs. For some reason both
		// WOActionRequestHandler
		// and WOComponentRequestHandler know about and call this method as
		// virtually the
		// last thing before returning the response. I am somewhat unclear as to
		// why this
		// method is private and why it isn't called by our caller instead of
		// within the
		// request handler.
		// It is imperative that this method be called because it generates HTTP
		// Set-Cookie
		// headers from the NSArray<WOCookie>. Without this no cookies will ever
		// function.
		if (response != null)
			response._finalizeInContext(context);

		return response;
	}

}
