/**
 * 
 */
package etudiants.utt.fr.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import com.webobjects.foundation.NSLog;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class CreateServlet {

	public CreateServlet() {
		// TODO Auto-generated constructor stub
	}

	// Generation des donnees à soumettre lors du POST
	public static String data(String type, String login, String periode,
			String diplome, String niveau, String libniv, String nom,
			String numero, String libpv, String mail, String reoriente,
			String mention) throws UnsupportedEncodingException {
		String donnes = null;
		String charset = "UTF-8";
		if (type != null) {
			donnes = String.format("type=%s", URLEncoder.encode(type, charset));
		} else {
			donnes = String.format("type=%s", URLEncoder.encode(""));
		}
		if (login != null) {
			donnes += String
					.format("&id=%s", URLEncoder.encode(login, charset));
		} else {
			donnes += String.format("&id=%s", URLEncoder.encode(""));
		}
		if (periode != null) {
			donnes += String.format("&periode=%s",
					URLEncoder.encode(periode, charset));
		} else {
			donnes += String.format("&periode=%s", URLEncoder.encode(""));
		}
		if (diplome != null) {
			donnes += String.format("&diplome=%s",
					URLEncoder.encode(diplome, charset));
		} else {
			donnes += String.format("&diplome=%s", URLEncoder.encode(""));
		}
		if (niveau != null) {
			donnes += String.format("&niveau=%s",
					URLEncoder.encode(niveau, charset));
		} else {
			donnes += String.format("&niveau=%s", URLEncoder.encode(""));
		}
		if (libniv != null) {
			donnes += String.format("&libniv=%s",
					URLEncoder.encode(libniv, charset));
		} else {
			donnes += String.format("&libniv=%s", URLEncoder.encode(""));
		}
		if (nom != null) {
			donnes += String.format("&nom=%s",
					"'" + URLEncoder.encode(nom, charset) + "'");
		} else {
			donnes += String.format("&nom=%s", URLEncoder.encode(""));
		}
		if (numero != null) {
			donnes += String.format("&num=%s",
					URLEncoder.encode(numero, charset));
		} else {
			donnes += String.format("&num=%s", URLEncoder.encode(""));
		}
		if (libpv != null) {
			donnes += String.format("&libpv=%s",
					URLEncoder.encode(libpv, charset));
		} else {
			donnes += String.format("&libpv=%s", URLEncoder.encode(""));
		}
		if (mail != null) {
			donnes += String.format("&mail=%s",
					URLEncoder.encode(mail, charset));
		} else {
			donnes += String.format("&mail=%s", URLEncoder.encode(""));
		}
		if (reoriente != null) {
			donnes += String.format("&reoriente=%s",
					URLEncoder.encode(reoriente, charset));
		} else {
			donnes += String.format("&reoriente=%s", URLEncoder.encode(""));
		}
		if (mention != null) {
			donnes += String.format("&mention=%s",
					URLEncoder.encode(mention, charset));
		} else {
			donnes += String.format("&mention=%s", URLEncoder.encode(""));
		}
		NSLog.out.appendln("PostData = " + donnes);
		return donnes;
	}

	// Envoie des données du formulaires vers le serveur report
	public static String excutePost(String adresse, String donnees) {
		String getResponse = "";
		int idex = 0;
		DataOutputStream writer = null;
		BufferedReader reader = null;
		URLConnection conn = null;
		URL uri = null;
		try {
			getResponse = "";
			//création de la connexion
			uri = new URL(adresse);
			conn = uri.openConnection();
			((HttpURLConnection) conn).setRequestMethod("POST");
			conn.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			conn.setRequestProperty("Content-Length",
					"" + Integer.toString(donnees.getBytes().length));
			//conn.setRequestProperty("Content-Language", "fr-FR");
			conn.setDoOutput(true);
			//envoi de la requête
			writer = new DataOutputStream(conn.getOutputStream());
			writer.writeBytes(donnees);
			//NSLog.out.appendln(writer.toString());
			writer.flush();
			//lecture de la réponse
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String ligne;
			while ((ligne = reader.readLine()) != null) {
				NSLog.out.appendln(ligne);
				getResponse += ligne;
			}

		} catch (Exception e) {
			getResponse = "Exception -"+e.getLocalizedMessage();
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}
			try {
				reader.close();
			} catch (Exception e) {
			}
			if (conn != null) {
				((HttpURLConnection) conn).disconnect();
			}
		}
		return getResponse;
	}

}
