/**
 * 
 */
package etudiants.utt.fr.server.reports;

import java.sql.Connection;
import java.util.HashMap;

import org.cocktail.reporting.jrxml.JrxmlReporter;
import org.login.fwkloginwebapp.server.LoginDataResponse;
import org.login.fwkloginwebapp.server.LoginMimeType;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.foundation.NSData;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableDictionary;

import etudiants.utt.fr.server.Application;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.util.CreateServlet;
import etudiants.utt.fr.util.LesURLs;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 *
 */
@SuppressWarnings("all")
public class ReportFactory {
	
	public static String TYPE = "3";
	public static String PERIODE = "20072P";
	public static String DIPLOME = "ING2";
	public static String NIVEAU = "";
	public static String LIBNIV = "";
	public static String NOM = "";
	public static String REORIENTE = "O";
	public static String LIBPV = "";
	public static String MENTION = "";
	public static String URI = "";
	private CreateServlet servlet;
	private LesURLs url;
	public static final String EXT_UV_V2 = "ext_uv_v2.jasper";
	public static final String EXP_LIST_UV1 = "exp_list_uv1.jasper";
	public static final String EXP_EFF = "exp_eff.jasper";
	public static final String EXP_RESULT = "exp_result.jasper";
	public static final String EXP_INSUV = "exp_insuv.jasper";
	public static final String EXP_DECIS = "exp_decis.jasper";
	public static final String EXP_DECIS2 = "exp_cis2.jasper";
	public static final String EXP_RESPUV = "exp_respuv.jasper";

	public ReportFactory() {
		// TODO Auto-generated constructor stub
		servlet = new CreateServlet();
		url = new LesURLs();
	}

	public void imprimerLeProfil(String login, String etudiant, String mail) {
		String donnees = null;
		String urlResponseView = null;
		URI = url.getReportUrl();
		try {
			donnees = servlet.data(TYPE, login, PERIODE, DIPLOME, NIVEAU,
					LIBNIV, NOM, etudiant, LIBPV, mail, REORIENTE, MENTION);
			NSLog.out.appendln("Link : "+URI+"?"+donnees);
			urlResponseView = servlet.excutePost(URI, donnees);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/** Liste des étudiants par période, diplôme ou branche ou niveau ou uv **/
	public static NSData printExport_Uv2(Session session,
			NSDictionary bindings) throws Throwable {
		String diplome = (String) bindings.valueForKey("DIPL_CODE");
		String periode = (String) bindings.valueForKey("ANPRD_UNIV");
		Integer niveau = (Integer) bindings.valueForKey("NIVEAU");
		String leNiveau = null;
		if (niveau != null && niveau != 0)
			leNiveau = niveau.toString();
		String uv = (String) bindings.valueForKey("UV");
		Application app = ((Application) Application.app());
		NSMutableDictionary<String, Object> parametres = new NSMutableDictionary<String, Object>();
		parametres.takeValueForKey(diplome, "DIPLOME");
		parametres.takeValueForKey(periode, "PERIODE");
		parametres.takeValueForKey(leNiveau, "NIVEAU");
		parametres.takeValueForKey(uv, "UV");
		String reportFileName = app.getReportsLocation(EXT_UV_V2);
		Connection connection = app.getJDBCConnection();
		HashMap<String, Object> aMap = new HashMap<String, Object>();
		aMap.putAll(parametres.hashtable());
		JrxmlReporter reporter = new JrxmlReporter();
		NSData res = reporter.printNow("Export période, diplôme ou branche ou niveau ou uv", connection, null, reportFileName, aMap,
				JrxmlReporter.EXPORT_FORMAT_CSV, false, true, null);
		return res;
	}

	/** Liste des étudiants inscrits à une UV par période **/
	public static NSData printExport_List_Uv1(Session session,
			NSDictionary bindings) throws Throwable {
		String periode = (String) bindings.valueForKey("ANPRD_UNIV");
		String uv = (String) bindings.valueForKey("UV");
		Application app = ((Application) Application.app());
		NSMutableDictionary<String, Object> parametres = new NSMutableDictionary<String, Object>();
		parametres.takeValueForKey(periode, "PERIODE");
		parametres.takeValueForKey(uv, "UV");
		String reportFileName = app.getReportsLocation(EXP_LIST_UV1);
		Connection connection = app.getJDBCConnection();
		HashMap<String, Object> aMap = new HashMap<String, Object>();
		aMap.putAll(parametres.hashtable());
		JrxmlReporter reporter = new JrxmlReporter();
		NSData res = reporter.printNow("Export inscrits à UV par période", connection, null, reportFileName,
				aMap, JrxmlReporter.EXPORT_FORMAT_CSV, false, true, null);
		return res;
	}

	/** Liste des étudiants inscrits pendant une période **/
	public static NSData printExport_Effectif(Session session,
			NSDictionary bindings) throws Throwable {
		String annee1 = (String) bindings.valueForKey("AN_VALEUR_1");
		String annee2 = (String) bindings.valueForKey("AN_VALEUR_2");
		Application app = ((Application) Application.app());
		NSMutableDictionary<String, Object> parametres = new NSMutableDictionary<String, Object>();
		parametres.takeValueForKey(annee1, "ANNEE_1");
		parametres.takeValueForKey(annee2, "ANNEE_2");
		String reportFileName = app.getReportsLocation(EXP_EFF);
		Connection connection = app.getJDBCConnection();
		HashMap<String, Object> aMap = new HashMap<String, Object>();
		aMap.putAll(parametres.hashtable());
		JrxmlReporter reporter = new JrxmlReporter();
		NSData res = reporter.printNow("Export inscrits pendant une période", connection, null, reportFileName,
				aMap, JrxmlReporter.EXPORT_FORMAT_CSV, false, true, null);
		return res;
	}

	/** Liste des résultats des étudiants pour une période **/
	public static NSData printExport_Resultat(Session session,
			NSDictionary bindings) throws Throwable {
		String diplome = (String) bindings.valueForKey("DIPL_CODE");
		String periode1 = (String) bindings.valueForKey("ANPRD_UNIV_1");
		String periode2 = (String) bindings.valueForKey("ANPRD_UNIV_2");
		String uv = (String) bindings.valueForKey("UV");
		Application app = ((Application) Application.app());
		NSMutableDictionary<String, Object> parametres = new NSMutableDictionary<String, Object>();
		parametres.takeValueForKey(periode1, "PERIODE_1");
		parametres.takeValueForKey(periode2, "PERIODE_2");
		parametres.takeValueForKey(uv, "UV");
		parametres.takeValueForKey(diplome, "DIPLOME");
		String reportFileName = app.getReportsLocation(EXP_RESULT);
		Connection connection = app.getJDBCConnection();
		HashMap<String, Object> aMap = new HashMap<String, Object>();
		aMap.putAll(parametres.hashtable());
		JrxmlReporter reporter = new JrxmlReporter();
		NSData res = reporter.printNow("Export résultats pour une période", connection, null, reportFileName,
				aMap, JrxmlReporter.EXPORT_FORMAT_CSV, false, true, null);
		return res;
	}

	/** Liste des inscriptions aux UV **/
	public static NSData printExport_InsUv(Session session,
			NSDictionary bindings) throws Throwable {
		String diplome = (String) bindings.valueForKey("DIPL_CODE");
		String periode = (String) bindings.valueForKey("ANPRD_UNIV");
		Integer niveau = (Integer) bindings.valueForKey("NIVEAU");
		String leNiveau = null;
		if (niveau != null && niveau != 0)
			leNiveau = niveau.toString();
		Application app = ((Application) Application.app());
		NSMutableDictionary<String, Object> parametres = new NSMutableDictionary<String, Object>();
		parametres.takeValueForKey(periode, "PERIODE");
		parametres.takeValueForKey(diplome, "DIPLOME");
		parametres.takeValueForKey(leNiveau, "NIVEAU");
		String reportFileName = app.getReportsLocation(EXP_INSUV);
		Connection connection = app.getJDBCConnection();
		HashMap<String, Object> aMap = new HashMap<String, Object>();
		aMap.putAll(parametres.hashtable());
		JrxmlReporter reporter = new JrxmlReporter();
		NSData res = reporter.printNow("Export inscriptions aux UV", connection, null, reportFileName,
				aMap, JrxmlReporter.EXPORT_FORMAT_CSV, false, true, null);
		return res;
	}

	/** Liste des décisions de jury pour des périodes **/
	public static NSData printExport_Decision(Session session,
			NSDictionary bindings) throws Throwable {
		String periode1 = (String) bindings.valueForKey("ANPRD_UNIV_1");
		String periode2 = (String) bindings.valueForKey("ANPRD_UNIV_2");
		Application app = ((Application) Application.app());
		NSMutableDictionary<String, Object> parametres = new NSMutableDictionary<String, Object>();
		parametres.takeValueForKey(periode1, "PERIODE_1");
		parametres.takeValueForKey(periode2, "PERIODE_2");
		String reportFileName = app.getReportsLocation(EXP_DECIS);
		Connection connection = app.getJDBCConnection();
		HashMap<String, Object> aMap = new HashMap<String, Object>();
		aMap.putAll(parametres.hashtable());
		JrxmlReporter reporter = new JrxmlReporter();
		NSData res = reporter.printNow("Export décisions de jury", connection, null, reportFileName,
				aMap, JrxmlReporter.EXPORT_FORMAT_CSV, false, true, null);
		return res;
	}

	/** Liste des décisions de jury avec codes des appréciations **/
	public static NSData printExport_Decision2(Session session,
			NSDictionary bindings) throws Throwable {
		String diplome = (String) bindings.valueForKey("DIPL_CODE");
		String periode = (String) bindings.valueForKey("ANPRD_UNIV");
		Application app = ((Application) Application.app());
		NSMutableDictionary<String, Object> parametres = new NSMutableDictionary<String, Object>();
		parametres.takeValueForKey(diplome, "DIPLOME");
		parametres.takeValueForKey(periode, "PERIODE");
		String reportFileName = app.getReportsLocation(EXP_DECIS2);
		Connection connection = app.getJDBCConnection();
		HashMap<String, Object> aMap = new HashMap<String, Object>();
		aMap.putAll(parametres.hashtable());
		JrxmlReporter reporter = new JrxmlReporter();
		NSData res = reporter.printNow("Export décisions de jury avec codes", connection, null,
				reportFileName, aMap, JrxmlReporter.EXPORT_FORMAT_CSV, false,
				true, null);
		return res;
	}
	
	/** Liste des UV par semestre avec le nom du responsable de l'UV, 
	 * la cat&eacute;gorie de l'UV, les effectifs par UV avec la 
	 * r&eacute;partition ing&eacute;nieur et master et le total 
	 * **/
	public static NSData printExport_RespUv(Session session,
			NSDictionary bindings) throws Throwable {
		String periode = (String) bindings.valueForKey("AN_VALEUR");
		String diplome = (String) bindings.valueForKey("DIPLOME");
		String uv = (String) bindings.valueForKey("UV");
		String niveau = (String) bindings.valueForKey("NIVEAU");
		Application app = ((Application) Application.app());
		NSMutableDictionary<String, Object> parametres = new NSMutableDictionary<String, Object>();
		parametres.takeValueForKey(periode, "PERIODE");
		parametres.takeValueForKey(diplome, "DIPLOME");
		parametres.takeValueForKey(uv, "UV");
		parametres.takeValueForKey(niveau, "NIVEAU");
		String reportFileName = app.getReportsLocation(EXP_RESPUV);
		Connection connection = app.getJDBCConnection();
		HashMap<String, Object> aMap = new HashMap<String, Object>();
		aMap.putAll(parametres.hashtable());
		JrxmlReporter reporter = new JrxmlReporter();
		NSData res = reporter.printNow("Export liste responsable UV", connection, null,
				reportFileName, aMap, JrxmlReporter.EXPORT_FORMAT_CSV, false,
				true, null);
		return res;
	}

	public static WOActionResults afficherXls(NSData xlsData, String fileName) {
		LoginDataResponse resp = new LoginDataResponse();
		if (xlsData != null) {
			resp.setHeader("maxage=1", "Cache-Control");
			resp.setHeader("Pragma", "public");
			resp.setHeader( "Content-Type", "text/csv" );
			resp.setContentEncoding("UTF-8");
			//resp.setContent(xlsData, LoginDataResponse.MIME_XLS);
			resp.setContent(xlsData);
			resp.setFileName(fileName);
		} else {
			resp.setContent("");
			resp.setHeader("0", "Content-Length");
		}
		return resp;
	}

}
