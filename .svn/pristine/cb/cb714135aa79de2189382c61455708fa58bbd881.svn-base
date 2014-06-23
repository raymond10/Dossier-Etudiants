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
package etudiants.utt.fr.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.util.Hashtable;

import org.cedre.fwkuttajaxwebext.serveur.UttAjaxApplication;
import org.login.fwkloginwebapp.common.LoginLog;
import org.login.fwkloginwebapp.common.database.LoginUserInfoDB;
import org.login.fwkloginwebapp.common.util.SAUTClient;
import org.login.fwkloginwebapp.server.database.LoginDataBus;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOResourceManager;
import com.webobjects.eoaccess.EOAdaptorContext;
import com.webobjects.eoaccess.EODatabaseContext;
import com.webobjects.eoaccess.EOModel;
import com.webobjects.eoaccess.EOModelGroup;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOGenericRecord;
import com.webobjects.eocontrol.EOSharedEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSData;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation.NSPropertyListSerialization;
import com.webobjects.jdbcadaptor.*;

import etudiants.utt.fr.eo.EOParametre;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

@SuppressWarnings("all")
public abstract class ZApplication extends UttAjaxApplication {

	/**
	 * @return booléen bloquant: si false, le démarrage de l'application
	 *         s'interrompt !
	 */
	protected abstract boolean initApplicationSpecial();

	protected abstract String[] requiredParams();

	protected abstract String[] maquettesSix();

	protected abstract String txtAppliVersion();

	protected abstract String parametresTableName();

	protected abstract String appliId();

	protected SAUTClient sautClient;
	NSMutableDictionary dicoBdConnexionServerName;

	NSMutableDictionary dicoBdConnexionServerId;
	protected EOSharedEditingContext mySharedEditingContext;

	private NSMutableDictionary appParametres;

	public final void initApplication() {
		System.out.println("Lancement de l'application serveur "
				+ this.appliId() + " !");
		super.initApplication();

		boolean ok1 = init();
		boolean ok2 = checkUp();

		if (!ok2) {
			LoginLog.rawLog("");
			LoginLog.rawLog("Il y a eu des ERREURS CRITIQUES D'INITIALISATION, impossible de démarrer l'application (voir ci-dessus pour les détails) !!!");
			LoginLog.rawLog("");
			terminate();
			System.exit(-1);
		}

		boolean ok3 = initApplicationSpecial();
		if (!ok3) {
			LoginLog.rawLog("");
			LoginLog.rawLog("Il y a eu des ERREURS CRITIQUES D'INITIALISATION, impossible de démarrer l'application (voir ci-dessus pour les détails) !!!");
			LoginLog.rawLog("");
			terminate();
			System.exit(-1);
		}

		if (!ok1) {
			LoginLog.rawLog("");
			LoginLog.rawLog("Il y a eu des ERREURS D'INITIALISATION !!!");
			LoginLog.rawLog("");
		}

		LoginLog.rawLog("INITIALISATION TERMINEE");
	}

	@SuppressWarnings("deprecation")
	private boolean init() {
		boolean ok = true;

		// full logs?
		if (getParamBoolean("SHOWSQLLOGS")) {
			NSLog.setAllowedDebugLevel(NSLog.DebugLevelDetailed);
			NSLog.allowDebugLoggingForGroups(NSLog.DebugGroupSQLGeneration);
			NSLog.allowDebugLoggingForGroups(NSLog.DebugGroupDatabaseAccess);
		}

		// init SAUT
		if (getParam("SAUT_URL") != null) {
			initSAUTClient(getParam("SAUT_URL"));
		}

		return ok;
	}

	private boolean checkUp() {
		// Versions...
		LoginLog.log("Versions");
		//LoginLog.log("WebObjects: " + getWOVersion());
		LoginLog.log("Java Runtime: " + System.getProperty("java.version"));
		LoginLog.log(name() + ": " + txtAppliVersion());

		// Propriétés systéme...
		if ("1".equals(getParam("DISPLAY_SYSTEM_PROPERTIES"))) {
			LoginLog.log("Proprietes systeme\n" + System.getProperties());
		}

		// Base de données...
		boolean ok1 = checkBdConnection();
		if (ok1) {
			// Vérif des modéles...
			rawLogModelInfos();
			ok1 = checkModel();
			if (ok1) {
				// Vérification des paramétres obligatoires...
				ok1 = checkRequiredParams();
				if (ok1) {
					// Verification de la version de la base...
					// ok1 = checkDbVersion();
				}
			}
		}

		return ok1;
	}

	public static int compare(final int[] version, final int[] anotherVersion) {
		if (version == null && anotherVersion == null) {
			return 0;
		}
		if (version == null) {
			return -1;
		}
		if (anotherVersion == null) {
			return 1;
		}
		for (int i = 0; i < version.length && i < anotherVersion.length; i++) {
			if (version[i] < anotherVersion[i]) {
				return -1;
			}
			if (version[i] > anotherVersion[i]) {
				return 1;
			}
		}
		if (version.length < anotherVersion.length) {
			for (int i = version.length; i < anotherVersion.length; i++) {
				if (anotherVersion[i] > 0) {
					return -1;
				}
			}
		}
		if (version.length > anotherVersion.length) {
			for (int i = anotherVersion.length; i < version.length; i++) {
				if (version[i] > 0) {
					return 1;
				}
			}
		}
		return 0;
	}

	public void compareFwkVersion(String fwkName, int[] fwkVersion,
			int[] minVersion) throws Exception {
		LoginLog.log(fwkName, toString(fwkVersion) + " (minimum requis: "
				+ toString(minVersion) + ")");
		if (compare(fwkVersion, minVersion) < 0) {
			throw new Exception("Version de framework " + fwkName
					+ " incompatible (version de fwk utilisee: "
					+ toString(fwkVersion)
					+ ", version minimum requise par l'application: "
					+ toString(minVersion) + ")");
		}
	}

	private static String toString(int[] array) {
		if (array == null) {
			return "";
		}
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < array.length; i++) {
			sb = sb.append(array[i]);
			sb = sb.append('.');
		}
		if (sb.length() > 0) {
			sb = sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}

	/**
	 * Récupére une valeur dans la table parametresTableName(). Si elle
	 * n'existe pas dans la table, va la chercher dans le configFileName(), et
	 * si n'existe pas va dans la table configTableName()
	 * 
	 * @param paramKey
	 *            La clé à rechercher
	 * @return La premiére valeur associée à la clé paramkey.
	 * @see ZApplication#appParametres
	 */
	@SuppressWarnings("rawtypes")
	public String getParam(String paramKey) {
		NSArray a = (NSArray) appParametres().valueForKey(paramKey);
		String res = null;
		if (a == null || a.count() == 0) {
			// recherche dans le configFileName()/configTableName()
			res = config().stringForKey(paramKey);
		} else {
			res = (String) a.objectAtIndex(0);
		}
		return res;
	}

	public boolean getParamBoolean(String paramKey) {
		return getParamBoolean(paramKey, false);
	}

	public boolean getParamBoolean(String paramKey,
			boolean defaultValueWhenNotFound) {
		String s = getParam(paramKey);
		if (s == null) {
			return defaultValueWhenNotFound;
		}
		if (s.equals("1") || s.equalsIgnoreCase("O")
				|| s.equalsIgnoreCase("OUI") || s.equalsIgnoreCase("Y")
				|| s.equalsIgnoreCase("YES") || s.equalsIgnoreCase("TRUE")) {
			return true;
		}
		return false;
	}

	public String hrefContactMail() {
		return "mailto:" + contactMail();
	}

	public String appHtmlCssStyles() {
		return getParam("APP_HTML_CSS_STYLES");
	}

	public boolean appUseCas() {
		return getParamBoolean("APP_USE_CAS");
	}

	public boolean allowWebAccess() {
		return getParamBoolean("ALLOW_WEB_ACCESS", true);
	}

	public void resetAppParametres() {
		appParametres = null;
	}

	private void initSAUTClient(String url) {
		try {
			sautClient = new SAUTClient(url);
		} catch (Exception e) {
			LoginLog.log("L'initialisation du SAUTClient a echouee. Pas de SAUT trouve a l'URL " + url);
			sautClient = null;
		}
	}
	
	public String getReportsLocation(String fileName) {
		String param = getParam("REPORTS_LOCATION");
		if (param != null) {
			return param + "/" + fileName;
		}
		else {
			WOResourceManager rm = application().resourceManager();
			URL url = rm.pathURLForResourceNamed("Properties", null, null);
			if (url == null) {
				return null;
			}
			String resourcesRoot = new File(url.getPath()).getParent();

			return resourcesRoot.concat("/").concat("reports/").concat(fileName);
		}
	}


	protected Hashtable getUserAuthentication(String usrLogin, String usrPass) {
		LoginUserInfoDB info = new LoginUserInfoDB(dataBus());
		if (usrPass == null) {
			System.out.println("!!! Connexion de " + usrLogin
					+ " sans mot de passe !!!");
			info.setAcceptEmptyPass(true);
		}
		info.compteForLogin(usrLogin, usrPass, true);
		Hashtable h = new Hashtable();
		switch (info.errorCode()) {
		case LoginUserInfoDB.ERROR_COMPTE:
			h.put("err", "Login inconnu !");
			return h;
		case LoginUserInfoDB.ERROR_PASSWORD:
			h.put("err", "Mot de passe incorrect !");
			return h;
		case LoginUserInfoDB.ERROR_INDIVIDU:
			h.put("err",
					"Pas d'individu associé a ce login ! "
							+ info.errorMessage());
			return h;
		case LoginUserInfoDB.ERROR_SOURCE:
			h.put("err",
					"Erreur lors de la tentative d'authentification, peut-être un pb de connection à la base de données ! "
							+ info.errorMessage());
			return h;
		case LoginUserInfoDB.ERROR_NONE:
			return info.toHashtable();
		default:
			h.put("err",
					"Erreur lors de l'authentification (erreur non récupérée) ! "
							+ info.errorMessage());
			return h;
		}
		// }
	}

	public boolean sendMail(String mailFrom, String mailTo, String mailCC, String mailSubject, String mailBody, String filename, NSData filedata) {
		if (getParamBoolean("TEST_MODE") && getParam("TEST_EMAIL") != null && getParam("TEST_EMAIL").length() > 0) {
			String preamble = "Vous recevez ce message car l'adresse \"" + getParam("TEST_EMAIL")
					+ "\" est l'adresse de test spècifièe dans le fichier de configuration de l'application " + this.appliId() + ".\n\n";
			preamble = preamble + "Normalement le message devrait ètre adressè è :\n";
			preamble = preamble + "To : " + mailTo + "\n";
			preamble = preamble + "Cc : " + mailCC + "\n\n";
			preamble = preamble + "------- Message original -------\n";
			mailBody = preamble + mailBody;

			mailTo = getParam("TEST_EMAIL");
			mailCC = null;
		}
		mailBody = mailBody + "\n\n" + "---------------------------------------------------\n"
				+ "Ce message a ètè gènèrè automatiquement par l'application " + this.appliId();
		return mailBus().sendMail(mailFrom, mailTo, mailCC, mailSubject, mailBody, filename, filedata);
	}

	/**
	 * @return Le né de version de WebObjects
	 */
	private String getWOVersion() {
		try {
			final InputStream is = resourceManager()
					.inputStreamForResourceNamed("version.plist",
							"JavaWebObjects", null);
			final NSData data = new NSData(is, 1024);
			final Object plist = NSPropertyListSerialization
					.propertyListFromData(data, null);
			final String list = NSPropertyListSerialization
					.stringFromPropertyList(plist);
			final NSDictionary dico = NSPropertyListSerialization
					.dictionaryForString(list);
			return (String) dico.valueForKey("CFBundleShortVersionString")
					+ "." + (String) dico.valueForKey("BuildVersion");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

/*	private boolean checkModels() {
		try {
			// On récupére tous les modéles utilisés
			dicoBdConnexionServerName = new NSMutableDictionary();
			dicoBdConnexionServerId = new NSMutableDictionary();
			EOModelGroup vModelGroup = EOModelGroup.defaultGroup();
			for (int i = 0; i < vModelGroup.models().count(); i++) {
				EOModel tmpEOModel = (EOModel) vModelGroup.models()
						.objectAtIndex(i);
				dicoBdConnexionServerName.takeValueForKey(
						bdConnexionServerName(tmpEOModel), tmpEOModel.name());
				dicoBdConnexionServerId.takeValueForKey(
						bdConnexionServerId(tmpEOModel), tmpEOModel.name());
				LoginLog.log("");
				LoginLog.log("Modele " + tmpEOModel.name() + " : ");
				LoginLog.log("  * Connexion base de donnees: "
						+ tmpEOModel.connectionDictionary().valueForKey("URL"));
				LoginLog.log("  * Instance: " + bdConnexionServerId(tmpEOModel));
				LoginLog.log("  * User base de donnees: "
						+ tmpEOModel.connectionDictionary().valueForKey(
								"username"));
			}

			// Vérifier que tous les modéles sont sur le méme serverId
			String sid = null;
			boolean erreurSid = false;
			for (int i = 0; i < vModelGroup.models().count(); i++) {
				EOModel tmpEOModel = (EOModel) vModelGroup.models()
						.objectAtIndex(i);
				if (sid == null) {
					sid = bdConnexionServerId(tmpEOModel);
				} else if (bdConnexionServerId(tmpEOModel) != null
						&& !sid.toUpperCase().equals(
								bdConnexionServerId(tmpEOModel).toUpperCase())) {
					erreurSid = true;
				}
			}
			if (erreurSid) {
				LoginLog.log("Les modeles pointent vers differentes instances de base de donnees (cf. ci-dessus), ceci peut causer des problemes d'incoherence lors de l'execution.");
			}
			return !erreurSid;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}*/

	private boolean checkBdConnection() {
		LoginLog.log("Base de donnees");
		if (LoginDataBus.isDatabaseConnected()) {
			LoginLog.log("La connexion a la base de donnees est active");
			return true;
		} else {
			LoginLog.log("La connexion a la base de donnees n'est pas active!!");
			return false;
		}
	}

	public String bdConnexionInfo() {
		String info = (String) dicoBdConnexionServerName
				.valueForKey(mainModelName());
		if (info != null && info.length() > 0) {
			info = "@" + info;
		}
		info = (String) dicoBdConnexionServerId.valueForKey(mainModelName())
				+ info;
		return info;
	}

	/**
	 * Renvoie le serverid de la base de données (par exemple gest).
	 */
	private String bdConnexionServerId(EOModel model) {
		String[] parts = bdSecondPartUrl(model);
		String serverBdName = null;
		if (parts != null && parts.length > 1) {
			serverBdName = parts[parts.length - 1];
		}
		return serverBdName;
	}

	/**
	 * Renvoie le serverName de la base de données (par exemple jane).
	 */
	private String bdConnexionServerName(EOModel model) {
		String[] parts = bdSecondPartUrl(model);
		String serverName = null;
		if (parts != null && parts.length > 0) {
			serverName = parts[0];
		}
		return serverName;
	}

	private String[] bdSecondPartUrl(EOModel model) {
		String url = (String) model.connectionDictionary().valueForKey("URL");
		if (url == null || url.length() == 0) {
			return new String[0];
		}
		String[] res;
		// L'url est du type jdbc:oracle:thin:@asterix-dev.utt.fr:1521:gerryd
		// On sépare la partie jdbc de la partie server
		res = url.split("@");
		if (res.length > 1) {
			String serverUrl = res[1];
			res = serverUrl.split(":");
			if (res.length > 0) {
				return res;
			}
		}
		return new String[0];
	}

	/**
	 * Vérifie si tous les paramètres nécessaires à l'application sont bien
	 * présents et initialisés.
	 */
	private boolean checkRequiredParams() {
		boolean ok = true;
		if (requiredParams() == null || requiredParams().length == 0) {
			return ok;
		}
		LoginLog.log("Verification des parametres");
		for (int i = 0; i < requiredParams().length; i++) {
			String p = getParam(requiredParams()[i]);
			if (p == null || p.trim().length() == 0) {
				LoginLog.log("Le parametre " + requiredParams()[i]
						+ " n'est pas renseigne dans la configuration. ");
				LoginLog.log("Veuillez l'ajouter soit:");
				LoginLog.log("		Dans le fichier de configuration: "
						+ configFileName());
				LoginLog.log("		Dans la table des parametres des applications: "
						+ configTableName());

				ok = false;
			} else {
				// On affiche la paire clé/valeur dans le log
				LoginLog.log(requiredParams()[i] + ": " + p);
			}
		}
		LoginLog.log("");
		return ok;
	}

	/**
	 * Récupére le contenu du fichier filePath
	 */
	public String fileContent(String filePath) {
		try {
			File f = new File(filePath);
			int size = (int) f.length();
			FileInputStream in = new FileInputStream(f);
			byte[] data = new byte[size];
			in.read(data);
			in.close();
			return new String(data);
		} catch (FileNotFoundException fnfe) {
			System.err.println("Fichier " + filePath + " introuvable !");
			return "";
		} catch (IOException ioe) {
			System.err.println("Erreur lors de la lecture du fchier "
					+ filePath + " : " + ioe);
			return "";
		}
	}

	/**
	 * Fournit la connection JDBC utilisee par un model pour acceder a la base
	 * de donnees.
	 * 
	 * @param modelName
	 *            Nom du model a partir duquel on veut recuperer la connection
	 *            JDBC (ex: "Pie" pour Pie.eomodeld). Passer <code>null</code>
	 *            pour obtenir la connexion par defaut.
	 * @return La connexion JDBC associee au model specifie, ou la connexion par
	 *         defaut.
	 */
	public Connection getJDBCConnection(final String modelName) {

		Connection conn = null;
		if (modelName != null) {
			conn = ((JDBCContext) EODatabaseContext
					.registeredDatabaseContextForModel(
							EOModelGroup.defaultGroup().modelNamed(modelName),
							new EOEditingContext()).availableChannel()
					.adaptorChannel().adaptorContext()).connection();
		} else
			conn = getJDBCConnection();

		return conn;
	}

	public Connection getJDBCConnection() {
		return ((JDBCContext) getAdaptorContext()).connection();
	}

	public EOAdaptorContext getAdaptorContext() {
		return LoginDataBus.databaseContext().availableChannel()
				.adaptorChannel().adaptorContext();
	}

	public WOComponent getSessionTimeoutPage(WOContext context) {
		return null;
	}

	/**
	 * @return Les parametres de l'application stockés dans la table
	 *         parametresTableName()
	 */
	private NSMutableDictionary appParametres() {
		if (appParametres == null) {
			if (mySharedEditingContext == null || parametresTableName() == null) {
				return new NSMutableDictionary();
			}
			appParametres = new NSMutableDictionary();
			try {
				NSArray vParam = dataBus().fetchArray(parametresTableName(),
						null, null);
				String previousParamKey = null;
				NSMutableArray a = null;
				java.util.Enumeration enumerator = vParam.objectEnumerator();
				while (enumerator.hasMoreElements()) {
					EOGenericRecord vTmpRec = (EOGenericRecord) enumerator
							.nextElement();
					if (vTmpRec.valueForKey(EOParametre.PARAM_KEY_KEY) == null
							|| ((String) vTmpRec
									.valueForKey(EOParametre.PARAM_KEY_KEY))
									.equals("")
							|| vTmpRec.valueForKey(EOParametre.PARAM_KEY_KEY) == null) {
						continue;
					}
					if (!((String) vTmpRec
							.valueForKey(EOParametre.PARAM_KEY_KEY))
							.equalsIgnoreCase(previousParamKey)) {
						if (a != null && a.count() > 0) {
							appParametres.setObjectForKey(a, previousParamKey);
						}
						previousParamKey = (String) vTmpRec
								.valueForKey(EOParametre.PARAM_KEY_KEY);
						a = new NSMutableArray();
					}
					if (vTmpRec.valueForKey(EOParametre.PARAM_VALUE_KEY) != null) {
						a.addObject((String) vTmpRec
								.valueForKey(EOParametre.PARAM_VALUE_KEY));
					}
				}
				if (a != null && a.count() > 0) {
					appParametres.setObjectForKey(a, previousParamKey);
				}
				mySharedEditingContext.invalidateAllObjects();
			} catch (Exception e) {
				appParametres = new NSMutableDictionary();
			}
		}
		return appParametres;
	}
}
