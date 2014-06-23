/**
 * 
 */
package etudiants.utt.fr.util;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.collections.ComparatorUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.log4j.Logger;

import com.sshtools.j2ssh.FileTransferProgress;
import com.sshtools.j2ssh.SftpClient;
import com.sshtools.j2ssh.SshClient;
import com.sshtools.j2ssh.authentication.AuthenticationProtocolState;
import com.sshtools.j2ssh.authentication.PasswordAuthenticationClient;
import com.sshtools.j2ssh.sftp.FileAttributes;
import com.sshtools.j2ssh.sftp.SftpFile;
import com.sshtools.j2ssh.transport.IgnoreHostKeyVerification;
import com.webobjects.foundation.NSData;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation.NSSelector;
import com.webobjects.foundation.NSTimestamp;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class SshConnexion {

	static final public Logger LOG = Logger.getLogger(SshConnexion.class);
	public static int timer = 200;
	public static String EXPORT_PATH = "";
	public static String USERNAME = "";
	public static String PASSWORD = "";
	public static String HOSTNAME = "";
	public static final int PORT = 22;
	private byte[] encryptionBytes = null;
	// Connect
	private SshClient ssh = new SshClient();
	// Authenticate
	private PasswordAuthenticationClient passwordAuthenticationClient = new PasswordAuthenticationClient();
	public int result = 0;

	public SshConnexion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the encryptionBytes
	 */
	public byte[] getEncryptionBytes() {
		return encryptionBytes;
	}

	/**
	 * @param encryptionBytes
	 *            the encryptionBytes to set
	 */
	public void setEncryptionBytes(byte[] encryptionBytes) {
		this.encryptionBytes = encryptionBytes;
	}

	/**
	 * @return the ssh
	 */
	public SshClient getSsh() {
		return ssh;
	}

	/**
	 * @param ssh
	 *            the ssh to set
	 */
	public void setSsh(SshClient ssh) {
		this.ssh = ssh;
	}

	/**
	 * @return the passwordAuthenticationClient
	 */
	public PasswordAuthenticationClient getPasswordAuthenticationClient() {
		return passwordAuthenticationClient;
	}

	/**
	 * @param passwordAuthenticationClient
	 *            the passwordAuthenticationClient to set
	 */
	public void setPasswordAuthenticationClient(
			PasswordAuthenticationClient passwordAuthenticationClient) {
		this.passwordAuthenticationClient = passwordAuthenticationClient;
	}

	public NSMutableArray connection(String hostname, String username,
			String pwd, String exportpath, String login, String exporturl)
			throws Exception {
		HOSTNAME = hostname;
		PwdDecrypter decrypter = new PwdDecrypter(HOSTNAME);
		PASSWORD = decrypter.decrypt(pwd);
		USERNAME = username;
		EXPORT_PATH = exportpath;
		// Open the SFTP channel
		SftpClient client = null;
		SftpFile ftpFile = null;
		NSMutableDictionary fichiers = new NSMutableDictionary();
		NSMutableArray<SftpFile> fichier = new NSMutableArray<SftpFile>();
		NSMutableArray<String> attributs = new NSMutableArray<String>();
		try {
			ssh.connect(HOSTNAME, PORT, new IgnoreHostKeyVerification());
			passwordAuthenticationClient.setUsername(USERNAME);
			passwordAuthenticationClient.setPassword(PASSWORD);
			result = ssh.authenticate(passwordAuthenticationClient);
			if (result != AuthenticationProtocolState.COMPLETE) {
				throw new Exception("Connexion � " + HOSTNAME + ":" + PORT
						+ " " + USERNAME + "/" + pwd + " �chou�e");
			}
			try {
				client = ssh.openSftpClient();
				// List pdf directory
				client.cd(EXPORT_PATH);
				NSTimestamp date = new NSTimestamp();
				List<SftpFile> listOfFiles = client.ls();
				for (int i = 0; i < listOfFiles.size(); i++) {
					ftpFile = (SftpFile) listOfFiles.get(i);
					if (ftpFile.isFile()) {
						if (ftpFile.getFilename().contains(login)) {
							attributs.addObject(ftpFile.getAttributes()
									.getModifiedTime().toString());
							fichiers.put(ftpFile.getAttributes()
									.getModifiedTime().toString(), ftpFile);
						}
					} else if (ftpFile.isDirectory()) {
					}
				}
				Collections.sort(attributs, Collections.reverseOrder());
				int max = 5;
				if (attributs.count() < max) {
					max = attributs.count();
				}
				for (int i = 0; i < max; i++) {
					String x = attributs.objectAtIndex(i);
					fichier.addObject(fichiers.objectForKey(x));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				client.quit();
				ssh.disconnect();
				e.printStackTrace();
			}

		} finally {
			client.quit();
			ssh.disconnect();
		}
		return fichier;
	}

	public SftpFile renvoieLePv(String hostname, String username, String pwd,
			String exportpath, String login, String exporturl, String etudiant)
			throws Exception {
		NSLog.out.appendln("Num�ro Etudiant ="+etudiant);
		SftpFile file = null;
		NSData data = null;
		HOSTNAME = hostname;
		PwdDecrypter decrypter = new PwdDecrypter(HOSTNAME);
		PASSWORD = decrypter.decrypt(pwd);
		USERNAME = username;
		EXPORT_PATH = exportpath;
		// Open the SFTP channel
		SftpClient client = null;
		SftpFile ftpFile = null;
		NSMutableDictionary fichiers = new NSMutableDictionary();
		NSMutableArray<SftpFile> fichier = new NSMutableArray<SftpFile>();
		NSMutableArray<String> attributs = new NSMutableArray<String>();
		try {
			if (timer != 500)
				timer = 500;
			while (file == null || file.getFilename().contains("tmp")) {
				timer--;
				ssh.connect(HOSTNAME, PORT, new IgnoreHostKeyVerification());
				passwordAuthenticationClient.setUsername(USERNAME);
				passwordAuthenticationClient.setPassword(PASSWORD);
				result = ssh.authenticate(passwordAuthenticationClient);
				if (result != AuthenticationProtocolState.COMPLETE) {
					throw new Exception("Connexion � " + HOSTNAME + ":" + PORT
							+ " " + USERNAME + "/" + pwd + " �chou�e");
				}
				client = ssh.openSftpClient();
				// List pdf directory
				client.cd(EXPORT_PATH);
				try {
					List<SftpFile> listOfFiles = client.ls();
					for (int i = 0; i < listOfFiles.size(); i++) {
						ftpFile = (SftpFile) listOfFiles.get(i);
						if (ftpFile.isFile()) {
							/*
							if (ftpFile.getFilename().indexOf(etudiant) > 0
									&& ftpFile.getFilename().indexOf(login) > 0) {
								attributs.addObject(ftpFile.getAttributes()
										.getModifiedTime().toString());
								fichiers.put(ftpFile.getAttributes()
										.getModifiedTime().toString(), ftpFile);
							}
							*/

							if (ftpFile.getFilename().contains(etudiant)
									&& ftpFile.getFilename().contains(login)) {
								attributs.addObject(ftpFile.getAttributes()
										.getModifiedTime().toString());
								fichiers.put(ftpFile.getAttributes()
										.getModifiedTime().toString(), ftpFile);
							}
						} else if (ftpFile.isDirectory()) {
						}
					}
					Collections.sort(attributs, Collections.reverseOrder());
					for (int i = 0; i < 1; i++) {
						if (attributs != null && attributs.count() != 0) {
							String x = attributs.objectAtIndex(i);
							fichier.addObject(fichiers.objectForKey(x));
						}
					}
					file = fichier.lastObject();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					client.quit();
					ssh.disconnect();
					e.printStackTrace();
					break;
				}
				if (timer == 0
						|| (file != null && !file.getFilename().contains("tmp")))
					break;
			}
		} finally {
			// Lib�ration des ressources
			client.quit();
			ssh.disconnect();
		}
		return file;
	}

	protected static boolean exists(String URLName) {
		if (timer != 500)
			timer = 500;
		try {
			do {
				timer--;
				Properties systemSettings = System.getProperties();
				systemSettings.put("proxySet", "true");
				systemSettings.put("http.proxyHost", "proxy.mycompany.local");
				systemSettings.put("http.proxyPort", "80");

				URL u = new URL(URLName);
				HttpURLConnection con = (HttpURLConnection) u.openConnection();
				//
				// it's not the greatest idea to use a sun.misc.* class
				// Sun strongly advises not to use them since they can
				// change or go away in a future release so beware.
				//
				sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
				String encodedUserPwd = encoder
						.encode("domain\\username:password".getBytes());
				con.setRequestProperty("Proxy-Authorization", "Basic "
						+ encodedUserPwd);
				con.setRequestMethod("HEAD");
				/*
				 * System.out.println(con.getResponseCode() + " : " +
				 * con.getResponseMessage() + " " + con.getConnectTimeout());
				 */
				if (con.getResponseCode() == HttpURLConnection.HTTP_OK)
					return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
			} while (timer != 0);
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
