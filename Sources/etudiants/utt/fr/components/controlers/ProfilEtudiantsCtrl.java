/**
 * 
 */
package etudiants.utt.fr.components.controlers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import com.sshtools.j2ssh.sftp.SftpFile;
import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.appserver.WOResponse;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSData;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation.NSTimestamp;

import er.extensions.eof.ERXEC;
import etudiants.utt.fr.components.DossierAdm;
import etudiants.utt.fr.components.EmploiDuTemps;
import etudiants.utt.fr.components.ProfilEtudiants;
import etudiants.utt.fr.components.ResultatsUV;
import etudiants.utt.fr.components.profilPrint;
import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.roles.LeUser;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.server.exception.FactoryException;
import etudiants.utt.fr.server.process.ProcessGestionCategorie;
import etudiants.utt.fr.server.process.ProcessGestionDiplome;
import etudiants.utt.fr.server.process.ProcessGestionEtudiant;
import etudiants.utt.fr.server.process.ProcessGestionInsUv;
import etudiants.utt.fr.server.process.ProcessGestionParcours;
import etudiants.utt.fr.server.process.ProcessGestionRechercheEtudiants;
import etudiants.utt.fr.server.process.ProcessGestionTotal;
import etudiants.utt.fr.server.process.ProcessGestionTotaux;
import etudiants.utt.fr.server.reports.ReportFactory;
import etudiants.utt.fr.sql.RechercheSQL;
import etudiants.utt.fr.util.LesURLs;
import etudiants.utt.fr.util.SshConnexion;
import etudiants.utt.fr.util.StringOperation;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class ProfilEtudiantsCtrl extends AComponentCtrl {
	public static int timer = 200;
	public static String IMG_SERVER;
	public static String IMG_DIR;
	private ProfilEtudiants wocomponent;
	private EOEditingContext edc;
	private Session sess;
	private Boolean isAutorizUser;
	private Boolean isEtudiant;
	private LeUser user;
	public NSMutableDictionary unUser ;
	private WODisplayGroup dg;
	private NSDictionary bdgs;
	public static RechercheSQL sqli = new RechercheSQL();
	public NSArray etu = new NSArray();
	private ReportFactory factory;
	private SftpFile lePdf;
	private LesURLs url;
	public String exporturl;

	public ProfilEtudiantsCtrl(ProfilEtudiants aComponent) {
		setUrl(new LesURLs());
		setWocomponent(aComponent);
		IMG_SERVER = wocomponent().myApp().imgServer();
		IMG_DIR = wocomponent().myApp().repPhoto();
/*		if(wocomponent.etudiant() != null){
			ETUDIANT = wocomponent.etudiant();
			NUMERO_ETU = Integer.valueOf(wocomponent.etudiant().primaryKey());
		}*/
		setDg(wocomponent().getEtudiantActif());
		setUser(wocomponent().user());
		setUnUser(user().leUser());
		exporturl = wocomponent().myApp().exportURL();
		NSMutableDictionary bindinds = new NSMutableDictionary();
		bindinds.put("numero", sess().getEtudiant().primaryKey());
		etu = reWriteListDico(sqli.getRawRowSearchEtudiants(edc(), bindinds));
		//ERXEC.unlockAllContextsForCurrentThread();
	}

	public ProfilEtudiantsCtrl() {
		super();
	}

	/**
	 * @return the dg
	 */
	public WODisplayGroup dg() {
		if(dg == null)
			dg = new WODisplayGroup();
		return dg;
	}

	/**
	 * @param dg the dg to set
	 */
	public void setDg(WODisplayGroup dg) {
		this.dg = dg;
	}

	/**
	 * @return the bdgs
	 */
	public NSDictionary bdgs() {
		if(bdgs == null)
			bdgs = new NSDictionary();
		return bdgs;
	}

	/**
	 * @param bdgs the bdgs to set
	 */
	public void setBdgs(NSDictionary bdgs) {
		this.bdgs = bdgs;
	}

	/**
	 * @return the wocomponent
	 */
	public ProfilEtudiants wocomponent() {
		return wocomponent;
	}

	/**
	 * @param wocomponent the wocomponent to set
	 */
	public void setWocomponent(ProfilEtudiants wocomponent) {
		this.wocomponent = wocomponent;
	}

	/**
	 * @return the edc
	 */
	public EOEditingContext edc() {
		if(edc == null)
			edc = wocomponent().edc();
		return edc;
	}

	/**
	 * @param edc the edc to set
	 */
	public void setEdc(EOEditingContext edc) {
		this.edc = edc;
	}

	/**
	 * @return the sess
	 */
	public Session sess() {
		if(sess == null)
			sess = wocomponent().mySession();
		return sess;
	}

	/**
	 * @param sess the sess to set
	 */
	public void setSess(Session sess) {
		this.sess = sess;
	}

	/**
	 * @return the user
	 */
	public LeUser user() {
		if(user == null)
			user = new LeUser();
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(LeUser user) {
		this.user = user;
	}

	/**
	 * @return the unUser
	 */
	public NSMutableDictionary unUser() {
		if(unUser == null)
			unUser = new NSMutableDictionary();
		return unUser;
	}

	/**
	 * @param unUser the unUser to set
	 */
	public void setUnUser(NSMutableDictionary unUser) {
		this.unUser = unUser;
	}

	/**
	 * @return the isAutorizUser
	 */
	public Boolean isAutorizUser() {
		isAutorizUser = (Boolean) unUser().valueForKey(StringOperation.AUTORIZED);
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
	 * @return the isUser
	 */
	public Boolean isEtudiant() {
		isEtudiant = !wocomponent().getDicEtudiant().isEmpty() && isAutorizUser();
		return isEtudiant;
	}

	/**
	 * @param isUser
	 *            the isUser to set
	 */
	public void setIsEtudiant(Boolean isEtudiant) {
		this.isEtudiant = isEtudiant;
	}

	/**
	 * @return the factory
	 */
	public ReportFactory factory() {
		if(factory == null)
			factory = new ReportFactory();
		return factory;
	}

	/**
	 * @param factory
	 *            the factory to set
	 */
	public void setFactory(ReportFactory factory) {
		this.factory = factory;
	}

	/**
	 * @return the lePdf
	 */
	public SftpFile lePdf() {
		return lePdf;
	}

	/**
	 * @param lePdf
	 *            the lePdf to set
	 */
	public void setLePdf(SftpFile lePdf) {
		this.lePdf = lePdf;
	}

	/**
	 * @return the url
	 */
	public LesURLs getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(LesURLs url) {
		this.url = url;
	}

	public WOActionResults retourAlaListe() {
		WOComponent searchPage = null;
		NSArray<EOIndividu> lesEtudiants = new NSArray<EOIndividu>();
		WODisplayGroup dg = wocomponent().getDgActif();
		if (dg != null && dg.allObjects().count() == 0) {
			wocomponent().setDgActif(dg);
			NSDictionary bdgs = dg.queryBindings();
			String mst = (String) bdgs.valueForKey("diplome");
			if (mst == null) {
				mst = (String) bdgs.valueForKey("prdDiplome");
			}
			if (mst != null && mst.equals("MST")) {
				lesEtudiants = EOIndividu.EtudiantsMST(edc(), bdgs, null);
			} else {
				lesEtudiants = EOIndividu.EtudiantsNonMST(edc(), bdgs, null);
			}
			wocomponent().getDgActif().setObjectArray(lesEtudiants);
			wocomponent().getDgActif().setCurrentBatchIndex(sess().getCurrentBatchIndex());
		} else {
			wocomponent().setDgActif(dg);
			wocomponent().getDgActif().setCurrentBatchIndex(sess().getCurrentBatchIndex());
		}
		searchPage = wocomponent().pageWithName("Recherche");
		return searchPage;
	}

	public void letudiant() {
		if (dg().allObjects().isEmpty()) {
			dg().setObjectArray(new NSArray(sess().getEtudiant()));
			dg().queryBindings().setObjectForKey(sess().getEtudiant().primaryKey(),
					"numero");
		}
		setBdgs(dg().queryBindings());
		try {
			NSMutableDictionary etuDico = new NSMutableDictionary();
			etuDico = (NSMutableDictionary) ProcessGestionEtudiant
					.selectRawRowEtudiants(edc(), bdgs()).lastObject();
			reWriteDico(etuDico);
			wocomponent().setDicEtudiant(etuDico);
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess().addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess().setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess().addSimpleErrorMessage("FactoryException ", alertMessage);
				sess().setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess().addSimpleErrorMessage("RuntimeException ", e1.getMessage());
			sess().setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}

	public void leDiplome() {
		if (dg().allObjects().isEmpty()) {
			dg().setObjectArray(new NSArray(sess().getEtudiant()));
			dg().queryBindings().setObjectForKey(sess().getEtudiant().primaryKey(),
					"numero");
		}
		setBdgs(dg().queryBindings());
		try {
			NSMutableArray diplList = new NSMutableArray();
			diplList = reWriteListDico(ProcessGestionDiplome
					.selectRawRowDiplome(edc(), bdgs()));
			wocomponent().setListDiplome(diplList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess().addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess().setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess().addSimpleErrorMessage("FactoryException ", alertMessage);
				sess().setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess().addSimpleErrorMessage("RuntimeException ", e1.getMessage());
			sess().setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}

	public void laCategorie() {
		setDg( wocomponent().getEtudiantActif());
		if (dg().allObjects().isEmpty()) {
			dg().setObjectArray(new NSArray(sess().getEtudiant()));
			dg().queryBindings().setObjectForKey(sess().getEtudiant().primaryKey(),
					"numero");
		}
		setBdgs(dg().queryBindings());
		try {
			NSMutableArray categList = new NSMutableArray();
			categList = reWriteListDico(ProcessGestionCategorie
					.selectRawCategorie(edc(), bdgs()));
			wocomponent().setListCategory(categList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess().addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess().setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess().addSimpleErrorMessage("FactoryException ", alertMessage);
				sess().setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess().addSimpleErrorMessage("RuntimeException ", e1.getMessage());
			sess().setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}

	public void lUV() {
		setDg(wocomponent().getEtudiantActif());
		if (dg().allObjects().isEmpty()) {
			dg().setObjectArray(new NSArray(sess().getEtudiant()));
			dg().queryBindings().setObjectForKey(sess().getEtudiant().primaryKey(),
					"numero");
		}
		setBdgs(dg().queryBindings());
		try {
			NSMutableArray uvList = new NSMutableArray();
			uvList = reWriteListDico(ProcessGestionInsUv.selectRawRowUV(edc(),
					bdgs()));
			wocomponent().setListInsUv(uvList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess().addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess().setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess().addSimpleErrorMessage("FactoryException ", alertMessage);
				sess().setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess().addSimpleErrorMessage("RuntimeException ", e1.getMessage());
			sess().setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}

	public void leParcours() {
		setDg(wocomponent().getEtudiantActif());
		if (dg().allObjects().isEmpty()) {
			dg().setObjectArray(new NSArray(sess().getEtudiant()));
			dg().queryBindings().setObjectForKey(sess().getEtudiant().primaryKey(),
					"numero");
		}
		setBdgs(dg().queryBindings());
		try {
			NSMutableArray parcList = new NSMutableArray();
			parcList = reWriteListDico(ProcessGestionParcours
					.selectRawRowParcours(edc(), bdgs()));
			wocomponent().setListParcours(parcList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess().addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess().setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess().addSimpleErrorMessage("FactoryException ", alertMessage);
				sess().setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess().addSimpleErrorMessage("RuntimeException ", e1.getMessage());
			sess().setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}

	public void leTotal() {
		setDg(wocomponent().getEtudiantActif());
		if (dg().allObjects().isEmpty()) {
			dg().setObjectArray(new NSArray(sess().getEtudiant()));
			dg().queryBindings().setObjectForKey(sess().getEtudiant().primaryKey(),
					"numero");
		}
		setBdgs(dg().queryBindings());
		try {
			// ProcessEtudiant.selectEtudiants(sess.dataBus(),
			// sess.getEtudiant());
			NSMutableArray totalList = new NSMutableArray();
			totalList = reWriteListDico(ProcessGestionTotal.selectRawRowTotal(
					edc(), bdgs()));
			wocomponent().setListTotal(totalList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess().addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess().setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess().addSimpleErrorMessage("FactoryException ", alertMessage);
				sess().setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess().addSimpleErrorMessage("RuntimeException ", e1.getMessage());
			sess().setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}

	public void lesTotaux() {
		setDg(wocomponent().getEtudiantActif());
		if (dg().allObjects().isEmpty()) {
			dg().setObjectArray(new NSArray(sess().getEtudiant()));
			dg().queryBindings().setObjectForKey(sess().getEtudiant().primaryKey(),
					"numero");
		}
		setBdgs(dg().queryBindings());
		try {
			// ProcessEtudiant.selectEtudiants(sess.dataBus(),
			// sess.getEtudiant());
			NSMutableArray totauxList = new NSMutableArray();
			totauxList = reWriteListDico(ProcessGestionTotaux
					.selectRawRowTotaux(edc(), bdgs()));
			wocomponent().setListTotaux(totauxList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess().addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess().setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess().addSimpleErrorMessage("FactoryException ", alertMessage);
				sess().setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess().addSimpleErrorMessage("RuntimeException ", e1.getMessage());
			sess().setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}

	protected void querry(NSArray list) {
		for (int i = 0; i < list.count(); i++) {
			dg().queryBindings().setObjectForKey(list.objectAtIndex(i),
					"diplome" + i);
		}
	}

	// Link
	public WOActionResults dossier() {
		sess().setRetourAlaListe(true);
		if (wocomponent().getDgActif() == null || wocomponent().getDgActif() .allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		sess().setEtudiant(sess().getEtudiant());
		DossierAdm dossierPage = (DossierAdm) wocomponent()
				.pageWithName(DossierAdm.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess().setNestedEdc(newEdc);
		return dossierPage;
	}

	public WOActionResults resUv() {
		sess().setRetourAlaListe(true);
		if (wocomponent().getDgActif() == null || wocomponent().getDgActif().allObjects().count() == 0) {
			sess.setRetourAlaListe(false);
		}
		sess().setEtudiant(sess().getEtudiant());
		ResultatsUV resUvPage = (ResultatsUV) wocomponent()
				.pageWithName(ResultatsUV.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess().setNestedEdc(newEdc);
		return resUvPage;
	}

	public WOActionResults emploiDuTemps() {
		sess().setRetourAlaListe(true);
		if (wocomponent().getDgActif() == null || wocomponent().getDgActif().allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		sess().setEtudiant(sess().getEtudiant());
		EmploiDuTemps emploiDutempsPage = (EmploiDuTemps) wocomponent()
				.pageWithName(EmploiDuTemps.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess().setNestedEdc(newEdc);
		return emploiDutempsPage;
	}

	public WOActionResults imprimerProfil() throws IOException {
		try {
			sess().setRetourAlaListe(true);
			NSTimestamp myTime = new NSTimestamp();
			if (wocomponent().getDgActif() == null
					|| wocomponent().getDgActif().allObjects().count() == 0) {
				sess().setRetourAlaListe(false);
			}
			sess().setEtudiant(sess().getEtudiant());
			// Param && printFile
			setLePdf(null);
			String login = (String) unUser().valueForKey("login");
			String login_Etudiant = sess().getEtudiant().login();
			String etudiant = sess().getEtudiant().primaryKey();
			String mail = (String) unUser().valueForKey("mail");
			String hostname = getUrl().getHostname();
			String pwd = getUrl().getReportPwd();
			String exportpath = getUrl().getReportExportPath();
			String username = "root";
			String exporturl = getUrl().getExportURL();
			//if (!exists(IMG_SERVER + IMG_DIR + etudiant + ".jpg"))
			//	throw new Exception("Serveur d'image indisponible");
			factory().imprimerLeProfil(login, etudiant, mail);
			SshConnexion connexion = new SshConnexion();
			while (lePdf() == null) {
				try {
					setLePdf(connexion.renvoieLePv(hostname, username, pwd,
							exportpath, login, exporturl, etudiant));
					connexion.ssh().disconnect();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					connexion.ssh().disconnect();
					sess().addSimpleErrorMessage("PROBLEME SERVEUR DISTANT", e.getMessage());
					e.printStackTrace();
					return null;
				}
			}
			//
			WOContext context = (WOContext) wocomponent().context().clone();
			profilPrint ImprimerProfilPage = (profilPrint) wocomponent().myApp().pageWithName(profilPrint.class.getName(),
							context);
			WOResponse pdfReport = new WOResponse();
			URL uri = null;
			try {
				if (lePdf() != null) {
					try {
						NSLog.out.appendln("URL :" + exporturl
								+ lePdf().getFilename());
						uri = new URL(exporturl + lePdf().getFilename());
						NSData stream = new NSData(uri);
						pdfReport.setHeader("maxage=1", "Cache-Control");
						pdfReport.setHeader("public", "Pragma");
						pdfReport.setHeader("pv.pdf", "Content-Title");
						pdfReport.setHeader("attachement; filename=\""
								+ "pv-"+login_Etudiant+".pdf" + "\"", "Content-Disposition");
						pdfReport.setHeader("application/pdf", "Content-Type");
						pdfReport.setContent(stream);
					} finally {
						// Lib�ration de ressources URL
						uri.openStream().close();
					}
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				sess().addSimpleErrorMessage("PROBLEME URL", e.getMessage());
				e.printStackTrace();
				return null;
			}
			return pdfReport.generateResponse();
		} catch (Exception e) {
			sess().addSimpleErrorMessage("PROBLEME SERVEUR", e.getMessage());
			return null;
		}
	}
	
	public boolean accessLinkGctc(){
		boolean lesAgents =  (Boolean) unUser().valueForKey("isAutorizedGcTc");
		return lesAgents;
	}
	
	public String LinkGcTc() {
		ProcessGestionRechercheEtudiants gestEtu = new ProcessGestionRechercheEtudiants();
		sess().setRetourAlaListe(true);
		if (wocomponent().getDgActif() == null || wocomponent().getDgActif().allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		if (etu != null && etu.count() != 0) {
			sess().setEtudiant(sess().getEtudiant());
		}
		Integer etuId = Integer.valueOf(sess().getEtudiant().primaryKey());
		String link = getUrl().getGctcUrl();
		NSMutableDictionary requetePersId = (NSMutableDictionary) gestEtu
				.selectRawRowrequetePersId(edc(), etuId).lastObject();
		String persId = requetePersId.valueForKey("COCK_PERS_ID").toString();
		String urlGctc = link+persId;
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess().setNestedEdc(newEdc);
		return urlGctc;
	}

	// End Link

	// Dictionnary Null value decoder
	protected NSMutableArray reWriteListDico(NSArray dicoList) {
		NSMutableArray listDico = new NSMutableArray();
		for (int j = 0; j < dicoList.count(); j++) {
			NSMutableDictionary tinyDico = new NSMutableDictionary();
			tinyDico = (NSMutableDictionary) dicoList.objectAtIndex(j);
			reWriteDico(tinyDico);
			listDico.addObject(tinyDico);
		}
		return listDico;
	}

	protected void reWriteDico(NSMutableDictionary dico) {
		for (int i = 0; i < dico.size(); i++) {
			Object value = dico.allValues().objectAtIndex(i);
			if (value.equals(NSKeyValueCoding.NullValue)) {
				String key = (String) dico.allKeys().objectAtIndex(i);
				dico.setObjectForKey("", key);
				// NSLog.out.appendln(dico);
			}
		}
	}

	protected String decode(Object obj) {
		String key = obj.toString().substring(1);
		String key2 = key.substring(0, key.length() - 1);
		String decodedValue = key2.substring(key2.length() - 4);
		if (decodedValue.equals("Null")) {
			return null;
		} else {
			return obj.toString();
		}
	}

	// End Decoder
	protected EOIndividu createOne(NSMutableDictionary dico) {
		EOIndividu createEtudiant = new EOIndividu();
		Long pk = (Long) dico.objectForKey("numero");
		NSArray<EOIndividu> createEtudiants = EOIndividu.fetchStudentsOnly(edc(),
				pk);
		for (int i = 0; i < createEtudiants.count(); i++) {
			createEtudiant = (EOIndividu) createEtudiants.objectAtIndex(0);
		}
		return createEtudiant;
	}

	protected static boolean exists(String URLName) {
		if(timer != 200)
			timer = 200;
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
