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

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;
import org.login.fwkloginacces.server.handler.FwkLoginResourcesInJarRequestHandler;
import org.login.fwkloginwebapp.common.LoginLog;
import org.login.fwkloginwebapp.common.util.DateCtrl;
import org.login.fwkloginwebapp.server.LoginMailBus;
import org.login.fwkloginwebapp.server.init.NSLegacyBundleMonkeyPatch;
import org.login.fwkloginwebapp.server.version.A_LoginVersion;

import com.webobjects.eoaccess.EODatabaseChannel;
import com.webobjects.eoaccess.EODatabaseContext;
import com.webobjects.eoaccess.EOGeneralAdaptorException;
import com.webobjects.eoaccess.EOModel;
import com.webobjects.eoaccess.EOModelGroup;
import com.webobjects.eocontrol.EOObjectStoreCoordinator;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSForwardException;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation.NSPropertyListSerialization;
import com.webobjects.foundation.NSTimeZone;
import com.webobjects.foundation.NSTimestamp;
import com.webobjects.foundation.NSTimestampFormatter;
import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOMessage;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WORequestHandler;
import com.webobjects.appserver.WOResponse;
import com.woinject.WOInject;

import er.extensions.appserver.ERXApplication;
import er.extensions.appserver.ERXMessageEncoding;
import er.extensions.appserver.ERXStaticResourceRequestHandler;
import er.extensions.eof.ERXEC;
import er.extensions.foundation.ERXConfigurationManager;
import er.extensions.foundation.ERXProperties;
import etudiants.utt.fr.EOControls.EOModelCtrl;
import etudiants.utt.fr.components.OnException;
import etudiants.utt.fr.components.ProfilEtudiants;
import etudiants.utt.fr.components.Recherche;
import etudiants.utt.fr.eo.EOParametre;
import etudiants.utt.fr.server.exception.CedreConfigurationException;
import etudiants.utt.fr.util.StringOperation;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

@SuppressWarnings("all")
public class Application extends ZApplication {

	public static final String TYPE_APP_STR = "DOSSIER-ETUDIANTS"; // ID de
																	// l'application
	public static final String CONFIG_FILE_NAME = VersionMe.APPLICATION_INTERNAL_ALIAS
			+ ".config";
	private static final String PARAMETRES_TABLE_NAME = "Parametres";
	private static final String MAIN_MODEL_NAME = "EtudiantEoGerry";
	public static final String DEFAULT_TIMESTAMP_FORMATTER = "%d/%m/%Y � %Hh%M";
	public static final String ENCODING_COLLECTE = "ISO-8859-1";
	private final String urlDatabaseConnection = null;
	protected ContentRequestHandler _contentRequestHandler;
	private String _sessionIdKey;
	private String _instanceIdKey;
	private Boolean isAutorizUser;
	private Boolean isEtudiant;

	private String appAdminMail = null;

	public static NSTimeZone ntz = null;
	
	/**
	 * Formatteur de dates.
	 */
	public NSTimestampFormatter appDateFormatter;
	
	/**
	 * ID du container permettant d'afficher les messages via pnotify
	 */
	private static final String MESSAGE_CONTAINER_ID = "Profil_MessageContainer";

	/**
	 * Fonction JS permettant l'update du container de messages 
	 */
	private static final String ON_FAILURE_MESSAGE = "function () {"+MESSAGE_CONTAINER_ID+"Update();}";

	private final Logger logger = ERXApplication.log;

	private static final String[] REQUIRED_PARAMS = { "APP_ID", "APP_USE_CAS",
			"MAIN_LOGO_URL", "CAS_SERVICE_URL", "GERRY_HOST_MAIL",
			"ADMIN_MAIL", "CAS_LOGOUT_URL" };
	/**
	 * boolean qui indique si on se trouve en mode developpement ou non. Permet
	 * de desactiver l'envoi de mail lors d'une exception par exemple
	 */
	public static boolean isModeDebug = false;

	public static Application app() {
		return (Application) application();
	}

	/**
	 * Liste des utilisateurs connect�s
	 */
	private static NSMutableArray utilisateurs;

	private static boolean test = false;

	private Version _appVersion;

	public static String bdServerId;

	/**
	 * Called when the application starts up and saves the command line
	 * arguments for {@link ERXConfigurationManager}.
	 * 
	 * @see WOApplication#main(String[], Class)
	 */
	/*
	 * public static void main(String argv[], Class applicationClass) {
	 * WOApplication.main(argv, applicationClass); }
	 */
	public static void main(String argv[]) {
		//Fix pb lenteur au d�marrage
		NSLegacyBundleMonkeyPatch.apply();
		WOInject.init("etudiants.utt.fr.server.Application", argv);
		ERXApplication.main(argv, Application.class);
	}

	public Application() {
		super();
		/* ** put your initialization code in here ** */
		setAllowsConcurrentRequestHandling(false);
		setDefaultRequestHandler(requestHandlerForKey(directActionRequestHandlerKey()));
		setPageRefreshOnBacktrackEnabled(true);
		WOResponse.setDefaultEncoding("UTF-8");
		WOMessage.setDefaultEncoding("UTF-8");
		WOMessage.setDefaultURLEncoding("UTF-8");
		ERXMessageEncoding.setDefaultEncoding("UTF8");
		ERXMessageEncoding.setDefaultEncodingForAllLanguages("UTF8");
		utilisateurs = new NSMutableArray();
		ERXEC.setDefaultFetchTimestampLag(2000);
		setupDatabaseChannelCloserTimer();
		LoginLog.rawLog("Demarrage de Dossier-Etudiants le "
				+ DateCtrl.currentDateTimeString());
		log.info("Bienvenue sur le " + name() + " !");

		/* Remplacement du requestHandler pour les ressources statiques */
		registerRequestHandler(new FwkLoginResourcesInJarRequestHandler(), "_wr_");
	}

	/**
	 * Initialise l'application.
	 * 
	 * @see org.login.fwkloginwebapp.server.LoginWebApplication#initApplication()
	 */
	@Override
	protected boolean initApplicationSpecial() {
		LoginLog.rawLog("Demarrage de Dossier-Etudiants le "
				+ DateCtrl.currentDateTimeString());
		test = config().booleanForKey("TEST");
		isModeDebug = config().booleanForKey("MODE_DEBUG");
		LoginLog.rawLog("TEST: " + test);
		LoginLog.rawLog("MODE_DEBUG: " + isModeDebug);
		return true;
	}

	public void startRunning() {
		EOModelGroup modelGroup = EOModelGroup.defaultGroup();
		LoginLog.rawLog("Modeles:"
				+ modelGroup.models().valueForKeyPath("path"));
		EOModel modeleProfilEtudiants = modelGroup.modelNamed(mainModelName());
		if (modeleProfilEtudiants != null) {
			Application.bdServerId = bdConnexionServerId(modeleProfilEtudiants);
		}
		initTimeZones();
		this.appDateFormatter = new NSTimestampFormatter();
		this.appDateFormatter.setPattern("%d/%m/%Y");
	}

	public Logger logger() {
		return logger;
	}

	@Override
	public String configFileName() {
		return CONFIG_FILE_NAME;
	}

	/**
	 * Retourne le nom de <em>EOModel</em> de l'application. Le nom ne doit pas
	 * avoir d'extention <em>.emodeld</em>.
	 */
	@Override
	public String mainModelName() {
		return MAIN_MODEL_NAME;
	}

	@Override
	public String configTableName() {
		return EOParametre.ENTITY_NAME;
	}

	@Override
	public String configFilePath() {
		String path = System.getProperty("CRIAppConfig");
		if (path == null && configFileName() != null) {
			path = appResources().pathForResource(configFileName());
		}
		return path;
	}

	public String casLogOutURL() {
		return config().stringForKey("CAS_LOGOUT_URL");
	}

	//Serveur D'impression
	public String reportURL() {
		return config().stringForKey("REPORT_URL");
	}

	public String exportURL() {
		return config().stringForKey("EXPORT_URL");
	}

	public String reportExportPath() {
		return config().stringForKey("REPORT_EXPORT_PATH");
	}

	public String reportServer() {
		return config().stringForKey("REPORT_SERVER");
	}

	public String reportPwd() {
		return config().stringForKey("SERVER_PWD");
	}
	//Fin ServeurImpression
	
	//Gctc url
	public String gctcLink() {
		return config().stringForKey("GCTC_URL");
	}
	
	//LocalSig
	public String imgServer() {
		return config().stringForKey("PHOTO_SERVER");
	}
	
	public String repPhoto() {
		return config().stringForKey("REP_PHOTO");
	}
	//Fin
	
	//Paiement PayxBox
	public String payBoxPost() {
		return config().stringForKey("PAYBOX_POST");
	}
	
	public String payBoxOption() {
		return config().stringForKey("PBX_OPT");
	}
	
	public String payBoxLang() {
		return config().stringForKey("PBX_LANGUE");
	}
	
	public String payBoxMode() {
		return config().stringForKey("PBX_MODE");
	}
	//Fin PBX
	
	//PersUV
	public String notPersInsUv() {
		return config().stringForKey("NOT_PERS_INS_UV");
	}
	
	public boolean persUv() {
		return config().booleanForKey("NOT_PERS_UV");
	}
	//FIN
	
	public String messageContainerID() {
		return MESSAGE_CONTAINER_ID;
	}
	
	public String onFailureMessage() {
		return ON_FAILURE_MESSAGE;
	}

	/**
	 * @return the isAutorizUser
	 */
	public Boolean getIsAutorizUser() {
		return isAutorizUser;
	}

	/**
	 * @param isAutorizUser
	 *            the isAutorizUser to set
	 */
	public void setIsAutorizUser(Boolean isAutorizUser) {
		this.isAutorizUser = isAutorizUser;
	}

	/**
	 * @return the isEtudiant
	 */
	public Boolean getIsEtudiant() {
		return isEtudiant;
	}

	/**
	 * @param isEtudiant
	 *            the isEtudiant to set
	 */
	public void setIsEtudiant(Boolean isEtudiant) {
		this.isEtudiant = isEtudiant;
	}

	public WOResponse handlePageRestorationErrorInContext(WOContext context) {
		Session session = (Session) context.session();
		WOComponent ErrorPage = (WOComponent) pageWithName("OnException",
				context);
		if (context.response() != null) {
			session.setMessageErreur(context.response().toString());
			NSLog.out.appendln("Error Message ! "
					+ context.response().toString());
		} else {
			session.setMessageErreur("Context.Response est � null");
			NSLog.out.appendln("Error Message ! "
					+ "Context.Response est � null");
		}
		// initialisation du composant si necessaire
		return ErrorPage.generateResponse();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public WOResponse handleException(Exception anException, WOContext context) {
		log.error("Message d'erreur :" + anException.getMessage(), anException);
		WOComponent nextPage = null;
		WOResponse response = null;
		if (context != null && context.hasSession()) {
			Session session = (Session) context.session();
			setIsAutorizUser((Boolean) session.getNewUser().leUser().valueForKey(StringOperation.AUTORIZED));
			setIsEtudiant(session.getEtudiant().isNonNull() && getIsAutorizUser());
			session.setGeneralErrorMessage(anException.getMessage());
			sendMessageErreur(anException, context, session);
			String error = createMessageErreur(anException, context, session);
			response = createResponseInContext(context);
			session.setGeneralErrorMessage(error);
			NSMutableDictionary formValues = new NSMutableDictionary();
			formValues.setObjectForKey(session.sessionID(), "wosid");
			String applicationExceptionUrl = context
					.directActionURLForActionNamed("applicationException",
							formValues);
			response.appendContentString("<script>document.location.href='"
					+ applicationExceptionUrl + "';</script>");
			cleanInvalidEOFState(anException, context);
			if(getIsEtudiant()) {
				nextPage = (ProfilEtudiants) pageWithName(
						ProfilEtudiants.class.getName(), context);
						((ProfilEtudiants) nextPage).setIsOpenFenetreException(true);
			} else {
				nextPage = (Recherche) pageWithName(
						Recherche.class.getName(), context);
				((Recherche) nextPage).setIsOpenFenetreException(true);				
			}
			response = nextPage.generateResponse();
			return response;
		} else {
			return super.handleException(anException, context);
		}
	}

	@SuppressWarnings("rawtypes")
	private String createMessageErreur(Exception anException,
			WOContext context, Session session) {
		try {
			String contenu;
			// Si c'est une erreur de config, on affiche pas tout le tsoin
			// tsoin,
			// juste une info claire
			if (anException instanceof CedreConfigurationException) {
				contenu = anException.getMessage();
				session.setGeneralErrorMessage(contenu);
			} else if (anException instanceof NSForwardException
					&& ((NSForwardException) anException).originalException() instanceof CedreConfigurationException) {
				Throwable cause = ((NSForwardException) anException)
						.originalException();
				contenu = cause != null ? cause.getLocalizedMessage() : null;
			} else {
				NSDictionary extraInfo = extraInformationForExceptionInContext(
						anException, context);
				contenu = "Date : "
						+ DateCtrl.dateToString(DateCtrl.now(),
								"%d/%m/%Y %H:%M") + "\n";
				contenu += "OS: " + System.getProperty("os.name") + "\n";
				contenu += "Java vm version: "
						+ System.getProperty("java.vm.version") + "\n";
				contenu += "WO version: " + ERXProperties.webObjectsVersion()
						+ "\n\n";
				contenu += "User agent: "
						+ context.request().headerForKey("user-agent") + "\n\n";
				contenu += "Utilisateur(Numero individu): "
						+ session.getUtilisateur().nomAndPrenom() + " ("
						+ session.getUtilisateur().primaryKey() + ")" + "\n";

				contenu += "\n\nException : " + "\n";
				if (anException instanceof InvocationTargetException) {
					contenu += getMessage(anException, extraInfo) + "\n";
					anException = (Exception) anException.getCause();
				}
				contenu += getMessage(anException, extraInfo) + "\n";
				contenu += "\n\n";
			}
			return contenu;
		} catch (Exception e) {
			logger().error("\n\n\n");
			logger().error(
					"!!!!!!!!!!!!!!!!!!!!!!!! Exception durant le traitement d'une autre exception !!!!!!!!!!!!!!!!");
			logger().error(e.getMessage(), e);
			super.handleException(e, context);
			logger().error("\n");
			logger().error(
					"Message Exception originale: " + anException.getMessage());
			logger().error(
					"Stack Exception dans exception: "
							+ anException.getStackTrace());
			return "Message Exception originale: " + anException.getMessage();
		}
	}

	private void sendMessageErreur(Exception anException, WOContext context,
			Session session) {
		try {
			LoginMailBus cmb = session.mailBus();
			String smtpServeur = config().stringForKey("GERRY_HOST_MAIL");
			String destinataires = config().stringForKey("ADMIN_MAIL");

			if (cmb != null && smtpServeur != null
					&& smtpServeur.equals("") == false && destinataires != null
					&& destinataires.equals("") == false) {
				String objet = "[DOSSIER-ETUDIANT]:Exception:[";
				objet += VersionMe.txtAppliVersion() + "]";
				String contenu = createMessageErreur(anException, context,
						session);
				session.setGeneralErrorMessage(contenu);
				boolean retour = false;
				if (isModeDebug) {
					logger().info(
							"!!!!!!!!!!!!!!!!!!!!!!!! MODE DEVELOPPEMENT : pas de mail !!!!!!!!!!!!!!!!");
					retour = false;
				} else {
					retour = cmb.sendMail(destinataires, destinataires, null,
							objet, contenu);
				}
				if (!retour) {
					logger().warn(
							"!!!!!!!!!!!!!!!!!!!!!!!! IMPOSSIBLE d'ENVOYER le mail d'exception !!!!!!!!!!!!!!!!");
					logger().warn("\nMail:\n\n" + contenu);

				}
			} else {
				logger().warn(
						"!!!!!!!!!!!!!!!!!!!!!!!! IMPOSSIBLE d'ENVOYER le mail d'exception !!!!!!!!!!!!!!!!");
				logger().warn(
						"Veuillez verifier que les parametres HOST_MAIL et ADMIN_MAIL sont bien renseignes");
				logger().warn("GERRY_HOST_MAIL = " + smtpServeur);
				logger().warn("ADMIN_MAIL = " + destinataires);
				logger().warn("cmb = " + cmb);
				logger().warn("\n\n\n");
			}
		} catch (Exception e) {
			logger().error("\n\n\n");
			logger().error(
					"!!!!!!!!!!!!!!!!!!!!!!!! Exception durant le traitement d'une autre exception !!!!!!!!!!!!!!!!");
			logger().error(e.getMessage(), e);
			super.handleException(e, context);
			logger().error("\n");
			logger().error(
					"Message Exception originale: " + anException.getMessage());
			logger().error(
					"Stack Exception dans exception: "
							+ anException.getStackTrace());
		}

	}

	/*
	 * !
	 * 
	 * @abstract Overrides sessionIdKey to return one including the app name
	 */
/*	public String sessionIdKey() {
		if (_sessionIdKey == null)
			_sessionIdKey = String
					.format("%s-%s", super.sessionIdKey(), name());
		return _sessionIdKey;
	}

	
	 * !
	 * 
	 * @abstract Overrides instanceIdKey to return one including the app name
	 
	public String instanceIdKey() {
		if (_instanceIdKey == null)
			_instanceIdKey = String.format("%s-%s", super.instanceIdKey(),
					name());
		return _instanceIdKey;
	}*/

/*	public String _rewriteURL(String url) {
		String processedURL = url;
		if (url != null && _replaceApplicationPathPattern != null
				&& _replaceApplicationPathReplace != null) {
			processedURL = processedURL.replaceFirst(
					_replaceApplicationPathPattern,
					_replaceApplicationPathReplace);
		}
		return processedURL;
	}*/

	public String getServerTd() {
		return EOModelCtrl.bdConnectionServerId(EOModelGroup.defaultGroup()
				.modelNamed(mainModelName()));
	}

	@SuppressWarnings("rawtypes")
	public NSMutableArray utilisateurs() {
		return utilisateurs;
	}

	public void setupDatabaseChannelCloserTimer() {
		Timer timer = new Timer(true);
		// Close open database connections every four hours.
		timer.scheduleAtFixedRate(new DBChannelCloserTask(), new Date(),
				14400000);
	}
	
	/**
	 * Initialise le TimeZone � utiliser pour l'application.
	 */
	protected void initTimeZones() {
		// appLog().trace(new NSArray(TimeZone.getAvailableIDs()));
		LoginLog.log("Initialisation du NSTimeZone");
		// myLog.appendKeyValue("NSTimeZone par defaut recupere sur le systeme (avant initialisation)",
		// NSTimeZone.defaultTimeZone(),75 );
		String tz = config().valueForKey("DEFAULT_NS_TIMEZONE").toString();
		if (tz == null || tz.equals("")) {
			LoginLog.log("Le parametre DEFAULT_NS_TIMEZONE n'est pas defini dans le fichier .config.");
			TimeZone.setDefault(TimeZone.getTimeZone("Europe/Paris"));
			NSTimeZone.setDefaultTimeZone(NSTimeZone.timeZoneWithName(
					"Europe/Paris", false));
		} else {
			ntz = NSTimeZone.timeZoneWithName(tz, false);
			if (ntz == null) {
				LoginLog.log("Le parametre DEFAULT_NS_TIMEZONE defini dans le fichier .config n'est pas valide ("
						+ tz + ")");
				TimeZone.setDefault(TimeZone.getTimeZone("Europe/Paris"));
				NSTimeZone.setDefaultTimeZone(NSTimeZone.timeZoneWithName(
						"Europe/Paris", false));
			} else {
				TimeZone.setDefault(TimeZone.getTimeZone(tz));
				NSTimeZone.setDefaultTimeZone(ntz);
			}
		}
		ntz = NSTimeZone.defaultTimeZone();
		LoginLog.log("NSTimeZone par defaut utilise dans l'application:"
				+ NSTimeZone.defaultTimeZone());
		NSTimestampFormatter ntf = new NSTimestampFormatter(
				"%d/%m/%Y %H:%M:%S %Z");
		LoginLog.log("Les NSTimestampFormatter analyseront les dates avec le NSTimeZone: "
				+ ntf.defaultParseTimeZone());
		LoginLog.log("Les NSTimestampFormatter afficheront les dates avec le NSTimeZone: "
				+ ntf.defaultFormatTimeZone());
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
		LoginLog.log("Les DateFormat afficheront les dates avec le TimeZone: "
				+ df.getTimeZone());
		LoginLog.log("new NSTimestamp() : " + new NSTimestamp()
				+ " >>>>>>> " + ntf.format(new NSTimestamp()));
		LoginLog.log("new Date() : " + new Date() + " >>>> "
				+ df.format(new Date()));
	}

	class DBChannelCloserTask extends TimerTask {
		public DBChannelCloserTask() {
			super();
		}

		@Override
		public void run() {
			closeDatabaseChannels();
			NSLog.out.appendln("running timer");
		}

		public void closeDatabaseChannels() {
			int i, contextCount, j, channelCount;
			NSArray databaseContexts;
			EOObjectStoreCoordinator coordinator;
			coordinator = EOObjectStoreCoordinator.defaultCoordinator();
			databaseContexts = coordinator.cooperatingObjectStores();
			contextCount = databaseContexts.count();
			// Iterate through all an app’s cooperating object stores
			// (database
			// contexts).
			for (i = 0; i < contextCount; i++) {
				NSArray channels = ((EODatabaseContext) databaseContexts
						.objectAtIndex(i)).registeredChannels();
				channelCount = channels.count();
				for (j = 0; j < channelCount; j++) {
					// Make sure the channel you're trying to close isn't
					// performing a transaction.
					if (!((EODatabaseChannel) channels.objectAtIndex(j))
							.adaptorChannel().adaptorContext()
							.hasOpenTransaction()) {
						((EODatabaseChannel) channels.objectAtIndex(j))
								.adaptorChannel().closeChannel();
					}
				}
			}
		}
	}

	public String bdConnexionServerId(EOModel model) {
		String url = bdConnexionUrl(model);
		String serverUrl = null;
		// String serverName=null;
		String serverBdName = null;
		// appLog.trace("URL", url);
		// L'url est du type jdbc:oracle:thin:@asterix-dev.utt.fr:1531:GERRYD
		// On separe la partie jdbc de la partie server
		String[] parts = url.split("@");
		if (parts.length > 1) {
			serverUrl = parts[1];
			parts = serverUrl.split(":");
			if (parts.length > 0) {
				// serverName = parts[0];
				if (parts.length > 1) {
					serverBdName = parts[parts.length - 1];
				}
			}
		}
		return serverBdName;
	}

	/**
	 * Renvoie le serverid de la base de donnees (par exemple jane).
	 * 
	 * @return
	 */
	public String bdConnexionServerName(EOModel model) {
		String url = bdConnexionUrl(model);
		String serverUrl = null;
		String serverName = null;
		// String serverBdName=null;
		// appLog.trace("URL", url);
		// L'url est du type jdbc:oracle:thin:@asterix-dev.utt.fr:1531:GERRYD
		// On separe la partie jdbc de la partie server
		String[] parts = url.split("@");
		if (parts.length > 1) {
			serverUrl = parts[1];
			parts = serverUrl.split(":");
			if (parts.length > 0) {
				serverName = parts[0];
				/*
				 * if (parts.length>1) { serverBdName = parts[parts.length - 1];
				 * }
				 */}
		}
		return serverName;
	}

	public String urlDatabaseConnection() {
		if (urlDatabaseConnection == null) {
			EOModelGroup vModelGroup = EOModelGroup.defaultGroup();
			for (int i = 0; i < vModelGroup.models().count(); i++) {
				// EOModel tmpEOModel=
				// (EOModel)vModelGroup.models().objectAtIndex(i);
				// dicoBdConnexionServerName.takeValueForKey(
				// bdConnexionServerName(tmpEOModel) , tmpEOModel.name());
				// dicoBdConnexionServerId.takeValueForKey(
				// bdConnexionServerId(tmpEOModel) , tmpEOModel.name());
			}
		}
		return urlDatabaseConnection;
	}

	/**
	 * Renvoie l'url de connexion � la base de donn�es.
	 * 
	 * @return
	 */
	public String bdConnexionName(EOModel model) {
		return bdConnexionUrl(model);
	}

	public boolean test() {
		// return config().booleanForKey("TEST");
		return test;
	}

	/**
	 * Renvoie l'url de connexion � la base de donn�es pour le modele sp�cifi�
	 * en parametre.
	 * 
	 * @param model
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public String bdConnexionUrl(EOModel model) {
		// EOModelGroup vModelGroup = EOModelGroup.defaultGroup();
		// EOModel vModel = vModelGroup.modelNamed(mainModelName());
		NSDictionary vDico = model.connectionDictionary();
		return (String) vDico.valueForKey("URL");
	}

	/**
	 * Renvoie le user base de donn�es
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public String bdConnexionUser(EOModel model) {
		NSDictionary vDico = model.connectionDictionary();
		return (String) vDico.valueForKey("username");
	}

	@Override
	protected String[] requiredParams() {
		// TODO Auto-generated method stub
		return REQUIRED_PARAMS;
	}

	@Override
	protected String[] maquettesSix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String txtAppliVersion() {
		// TODO Auto-generated method stub
		return VersionMe.txtAppliVersion();
	}

	@Override
	protected String parametresTableName() {
		// TODO Auto-generated method stub
		return PARAMETRES_TABLE_NAME;
	}

	@Override
	protected String appliId() {
		// TODO Auto-generated method stub
		return VersionMe.APPLICATION_STRID;
	}

	/**
	 * Check for Windows XP
	 * 
	 * @return true if runs on XP
	 */
	public boolean _isAdditionalForeignSupportedDevelopmentPlatform() {
		String s = System.getProperty("os.name");
		return (s != null && s.equals("Windows XP"));
	}

	/**
	 * Calls _isAdditionalForeignSupportedDevelopmentPlatform
	 * 
	 * @see com.webobjects.appserver.WOApplication#_isForeignSupportedDevelopmentPlatform()
	 */
	@Override
	public boolean _isForeignSupportedDevelopmentPlatform() {
		return (super._isForeignSupportedDevelopmentPlatform() || _isAdditionalForeignSupportedDevelopmentPlatform());
	}

	public String copyright() {
		return appVersion().copyright();
	}

	public Version appVersion() {
		if (_appVersion == null) {
			_appVersion = new Version();
		}
		return _appVersion;
	}

	@Override
	public A_LoginVersion appLoginVersion() {
		return appVersion();
	}

	private void cleanInvalidEOFState(Exception e, WOContext ctx) {
		if (e instanceof IllegalStateException
				|| e instanceof EOGeneralAdaptorException) {
			Session sess = (Session) ctx.session();
			sess.editingContext().invalidateAllObjects();
		}
	}

	protected String getMessage(Throwable e, NSDictionary extraInfo) {
		String message = "";
		if (e != null) {
			message = stackTraceToString(e, false) + "\n\n";
			message += "Info extra :\n";
			if (extraInfo != null) {
				message += NSPropertyListSerialization
						.stringFromPropertyList(extraInfo) + "\n\n";
			}
		}
		return message;
	}

	/**
	 * permet de recuperer la trace d'une exception au format string message +
	 * trace
	 * 
	 * @param e
	 * @return
	 */
	public static String stackTraceToString(Throwable e, boolean useHtml) {
		String tagCR = "\n";
		if (useHtml) {
			tagCR = "<br>";
		}
		String stackStr = e + tagCR + tagCR;
		StackTraceElement[] stack = e.getStackTrace();
		for (int i = 0; i < stack.length; i++) {
			stackStr += (stack[i]).toString() + tagCR;
		}
		return stackStr;
	}

	public boolean _isSupportedDevelopmentPlatform() {
		return (super._isSupportedDevelopmentPlatform() || System.getProperty(
				"os.name").startsWith("Win"));
	}

	@Override
	public WOResponse handleSessionRestorationErrorInContext(WOContext context) {
		WOResponse response;
		response = createResponseInContext(context);
		String sessionExpiredUrl = context.directActionURLForActionNamed(
				"sessionExpired", null);
		response.appendContentString("<script>document.location.href='"
				+ sessionExpiredUrl + "';</script>");

		return response;
	}
}
