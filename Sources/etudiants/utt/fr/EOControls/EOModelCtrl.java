/**
 * 
 */
package etudiants.utt.fr.EOControls;

import com.webobjects.eoaccess.EOModel;
import com.webobjects.eoaccess.EOModelGroup;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
public class EOModelCtrl {

	@SuppressWarnings("rawtypes")
	public static NSMutableArray modelsDico = new NSMutableArray();

	public static void scanModels() {
		modelsDico.removeAllObjects();
		EOModelGroup vModelGroup = EOModelGroup.defaultGroup();
		for (int i = 0; i < vModelGroup.models().count(); ++i) {
			EOModel tmpEOModel = (EOModel) vModelGroup.models()
					.objectAtIndex(i);
			modelsDico.takeValueForKey(tmpEOModel, tmpEOModel.name());
		}
	}

	@SuppressWarnings("rawtypes")
	public static NSMutableArray getModelDisco() {
		return modelsDico;
	}

	public static String bdConnectionUrl(EOModel model) {
		@SuppressWarnings("rawtypes")
		NSDictionary vDico = model.connectionDictionary();
		String url = (String) vDico.valueForKey("URL");
		if (url == null) {
			url = "n/a";
		}
		return url;
	}

	public static String bdConnexionUser(EOModel model) {
		@SuppressWarnings("rawtypes")
		NSDictionary vDico = model.connectionDictionary();
		return ((String) vDico.valueForKey("username"));
	}

	public static String bdConnectionServerId(EOModel model) {
		String url = bdConnectionUrl(model);
		String serverUrl = null;
		String serverBdName = null;
		String[] parts = url.split("@");
		if (parts.length > 1) {
			serverUrl = parts[1];
			parts = serverUrl.split(":");
			if (parts.length > 1) {
				serverBdName = parts[(parts.length - 1)];
			}
		}
		return serverBdName;
	}

	public static String bdConnectionServerName(EOModel model) {
		String url = bdConnectionUrl(model);
		String serverUrl = null;
		String serverName = null;
		String[] parts = url.split("@");
		if (parts.length > 1) {
			serverUrl = parts[1];
			parts = serverUrl.split(":");
			if (parts.length > 0) {
				serverName = parts[0];
			}
		}
		return serverName;
	}
}
