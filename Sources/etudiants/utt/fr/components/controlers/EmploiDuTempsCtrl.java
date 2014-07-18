/**
 * 
 */
package etudiants.utt.fr.components.controlers;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.appserver.WOSession;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

import er.extensions.eof.ERXEC;
import etudiants.utt.fr.components.DossierAdm;
import etudiants.utt.fr.components.EmploiDuTemps;
import etudiants.utt.fr.components.ProfilEtudiants;
import etudiants.utt.fr.components.ResultatsUV;
import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.roles.LeUser;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.server.exception.FactoryException;
import etudiants.utt.fr.server.process.ProcessGestionEdt;
import etudiants.utt.fr.server.process.ProcessGestionEtudiant;
import etudiants.utt.fr.server.process.ProcessGestionRechercheEtudiants;
import etudiants.utt.fr.sql.RechercheSQL;
import etudiants.utt.fr.util.EdtUtilitaires;
import etudiants.utt.fr.util.LesURLs;
import etudiants.utt.fr.util.RegEx;
import etudiants.utt.fr.util.StringOperation;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class EmploiDuTempsCtrl extends AComponentCtrl {

	public Integer HEIGHT = 20;
	public Integer WEIGHT = 48;
	private EmploiDuTemps wocomponent;
	private EOEditingContext edc;
	private Session sess;
	private Boolean isAutorizUser;
	private Boolean isEtudiant;
	private LeUser user;
	private NSMutableDictionary unUser;
	private NSMutableDictionary publi;
	private NSMutableDictionary students;
	private WODisplayGroup dg;
	private NSDictionary bdgs;
	public static RechercheSQL sqli;
	public static ProcessGestionEdt gestEdt;
	private NSMutableDictionary edt;
	private NSMutableDictionary data;
	private NSMutableArray ttime;
	private String html;
	private NSArray etu;
	private Number id;
	private Number cid;
	String uv = null;
	Integer hei = 0;
	Integer wei = 0;
	String col = null;
	String tipe = null;
	String sale = null;
	String weak = null;
	public boolean publique = false;
	private NSMutableDictionary type;
	private NSMutableArray<String> jours;
	private NSMutableArray couleurs;
	private NSMutableDictionary couleur;
	private NSMutableArray horaire;
	private String horaireLoop;
	private String leHTML;
	public String tplVide = null;
	public String tplPlein = null;
	private RegEx regex;
	private String nom;
	private String courante;

	public EmploiDuTempsCtrl(EmploiDuTemps aComponent) {
		// TODO Auto-generated constructor stub
		setWocomponent(aComponent);
		setUser(wocomponent().user());
		setUnUser(user().leUser());
		type();
		jours();
		couleurs();
		//Initialisation des composants principaux		
		sqli = new RechercheSQL();
		gestEdt = new ProcessGestionEdt();
		setDg(wocomponent().getEtudiantActif());
		NSMutableDictionary bindinds = new NSMutableDictionary();
		bindinds.put("numero", sess().getEtudiant().primaryKey());
		setEtu(reWriteListDico(sqli.getRawRowSearchEtudiants(edc(), bindinds)));
		setPubli(reWriteDico((NSMutableDictionary) gestEdt.selectRawRowEdtPubli(
				edc()).lastObject()));
		if (getPubli() != null && getPubli().objectForKey("PUBLI").equals("O")
				&& getData() != null) {
			publique = true;
		} else {
			publique = false;
		}
		setCourante((String) sess().getPeriodeCourante().objectForKey("LIBELLE"));
	}

	/**
	 * @return the wocomponent
	 */
	public EmploiDuTemps wocomponent() {
		return wocomponent;
	}

	/**
	 * @param wocomponent the wocomponent to set
	 */
	public void setWocomponent(EmploiDuTemps wocomponent) {
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
	 * @return the unUser
	 */
	public NSMutableDictionary unUser() {
		if(unUser == null)
			unUser = user().leUser();
		return unUser;
	}

	/**
	 * @param unUser the unUser to set
	 */
	public void setUnUser(NSMutableDictionary unUser) {
		this.unUser = unUser;
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
	 * @return the etu
	 */
	public NSArray etu() {
		if(etu == null)
			etu = new NSArray();
		return etu;
	}

	/**
	 * @param etu the etu to set
	 */
	public void setEtu(NSArray etu) {
		this.etu = etu;
	}

	/**
	 * @return the regex
	 */
	public RegEx regex() {
		if(regex == null)
			regex = new RegEx();
		return regex;
	}

	/**
	 * @param regex the regex to set
	 */
	public void setRegex(RegEx regex) {
		this.regex = regex;
	}

	/**
	 * @return the isAutorizUser
	 */
	public Boolean getIsAutorizUser() {
		isAutorizUser = (Boolean) unUser.valueForKey(StringOperation.AUTORIZED);
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
		isEtudiant = sess.getEtudiant().isNonNull() && getIsAutorizUser();
		return isEtudiant;
	}

	/**
	 * @param isEtudiant
	 *            the isEtudiant to set
	 */
	public void setIsEtudiant(Boolean isEtudiant) {
		this.isEtudiant = isEtudiant;
	}

	/**
	 * @return the user
	 */
	public LeUser user() {
		if(user == null)
			user = wocomponent().user();
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(LeUser user) {
		this.user = user;
	}

	/**
	 * @return the publi
	 */
	public NSMutableDictionary getPubli() {
		if(publi == null)
			publi = new NSMutableDictionary();
		return publi;
	}

	/**
	 * @param publi
	 *            the publi to set
	 */
	public void setPubli(NSMutableDictionary publi) {
		this.publi = publi;
	}

	/**
	 * @return the students
	 */
	public NSMutableDictionary getStudents() {
		if(students == null)
			students = new NSMutableDictionary();
		return students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(NSMutableDictionary students) {
		this.students = students;
	}

	/**
	 * @return the id
	 */
	public Number getId() {
		if(id == null)
			id = 0;
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Number id) {
		this.id = id;
	}

	/**
	 * @return the cid
	 */
	public Number getCid() {
		if(cid == null)
			cid = 0;
		return cid;
	}

	/**
	 * @param cid
	 *            the cid to set
	 */
	public void setCid(Number cid) {
		this.cid = cid;
	}

	/**
	 * @return the edt
	 */
	public NSMutableDictionary getEdt() {
		if(edt == null)
			edt = new NSMutableDictionary();
		return edt;
	}

	/**
	 * @param edt
	 *            the edt to set
	 */
	public void setEdt(NSMutableDictionary edt) {
		this.edt = edt;
	}

	/**
	 * @return the couleur
	 */
	public NSMutableDictionary getCouleur() {
		if(couleur == null)
			couleur = new NSMutableDictionary();
		return couleur;
	}

	/**
	 * @param couleur
	 *            the couleur to set
	 */
	public void setCouleur(NSMutableDictionary couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the data
	 */
	public NSMutableDictionary getData() {
		if(data == null)
			data = new NSMutableDictionary();
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(NSMutableDictionary data) {
		this.data = data;
	}

	/**
	 * @return the ttime
	 */
	public NSMutableArray getTtime() {
		if(ttime == null)
			ttime = new NSMutableArray();
		return ttime;
	}

	/**
	 * @param ttime
	 *            the ttime to set
	 */
	public void setTtime(NSMutableArray ttime) {
		this.ttime = ttime;
	}

	/**
	 * @return the html
	 */
	public String getHtml() {
		return html;
	}

	/**
	 * @param html
	 *            the html to set
	 */
	public void setHtml(String html) {
		this.html = html;
	}

	/**
	 * @return the horaire
	 */
	public NSMutableArray getHoraire() {
		if(horaire == null)
			horaire = new NSMutableArray();
		return horaire;
	}

	/**
	 * @param horaire
	 *            the horaire to set
	 */
	public void setHoraire(NSMutableArray horaire) {
		this.horaire = horaire;
	}

	/**
	 * @return the horaireLoop
	 */
	public String getHoraireLoop() {
		return horaireLoop;
	}

	/**
	 * @param horaireLoop
	 *            the horaireLoop to set
	 */
	public void setHoraireLoop(String horaireLoop) {
		this.horaireLoop = horaireLoop;
	}

	/**
	 * @return the leHTML
	 */
	public String getLeHTML() {
		return leHTML;
	}

	/**
	 * @param leHTML
	 *            the leHTML to set
	 */
	public void setLeHTML(String leHTML) {
		this.leHTML = leHTML;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getCourante() {
		return courante;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setCourante(String courante) {
		this.courante = courante;
	}

	/**
	 * @return the type
	 */
	public NSMutableDictionary type() {
		if(type == null)
			type = wocomponent().edtUtil().theType();
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(NSMutableDictionary type) {
		this.type = type;
	}

	/**
	 * @return the jours
	 */
	public NSMutableArray<String> jours() {
		if(jours == null)
			jours = wocomponent().edtUtil().theDay();
		return jours;
	}

	/**
	 * @param jours the jours to set
	 */
	public void setJours(NSMutableArray<String> jours) {
		this.jours = jours;
	}

	/**
	 * @return the couleurs
	 */
	public NSMutableArray couleurs() {
		if(couleurs == null)
			couleurs = wocomponent().edtUtil().theColor();
		return couleurs;
	}

	/**
	 * @param couleurs the couleurs to set
	 */
	public void setCouleurs(NSMutableArray couleurs) {
		this.couleurs = couleurs;
	}

	// Lien page etudiant
	public WOActionResults dossier() {
		sess().setRetourAlaListe(true);
		if (sess().dgActif() == null || sess().dgActif().allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		sess().setEtudiant(sess().getEtudiant());
		DossierAdm dossierPage = (DossierAdm) wocomponent()
				.pageWithName(DossierAdm.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
		sess().setNestedEdc(newEdc);
		return dossierPage;
	}

	public WOActionResults leprofil() {
		sess().setRetourAlaListe(true);
		if (sess().dgActif() == null || sess().dgActif().allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		if (etu() != null && etu().count() != 0) {
			sess().setEtudiant(sess().getEtudiant());
		}
		ProfilEtudiants profilPage = (ProfilEtudiants) wocomponent()
				.pageWithName(ProfilEtudiants.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
		sess().setNestedEdc(newEdc);
		return profilPage;
	}

	public WOActionResults leResultatUv() {
		sess().setRetourAlaListe(true);
		if (sess().dgActif() == null || sess().dgActif().allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		if (etu() != null && etu().count() != 0) {
			sess().setEtudiant(sess().getEtudiant());
		}
		ResultatsUV resUvPage = (ResultatsUV) wocomponent()
				.pageWithName(ResultatsUV.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
		sess().setNestedEdc(newEdc);
		return resUvPage;
	}

	public WOActionResults lEmploiDuTemps() {
		sess().setRetourAlaListe(true);
		if (sess().dgActif() == null || sess().dgActif().allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		if (etu() != null && etu().count() != 0) {
			sess().setEtudiant(sess().getEtudiant());
		}
		EmploiDuTemps lEdtPage = (EmploiDuTemps) wocomponent()
				.pageWithName(EmploiDuTemps.class.getName());
		EOEditingContext newEdc = ERXEC.newEditingContext();
		sess().setNestedEdc(newEdc);
		return lEdtPage;
	}
	
	public boolean accessLinkGctc(){
		boolean access =  (Boolean) unUser().valueForKey(StringOperation.GCTC);
		return access;
	}
	
	public String LinkGcTc() {
		ProcessGestionRechercheEtudiants gestEtu = new ProcessGestionRechercheEtudiants();
		LesURLs url = new LesURLs();
		sess().setRetourAlaListe(true);
		if (wocomponent().getDgActif() == null || wocomponent().getDgActif().allObjects().count() == 0) {
			sess().setRetourAlaListe(false);
		}
		if (etu() != null && etu().count() != 0) {
			sess().setEtudiant(sess().getEtudiant());
		}
		Integer etuId = Integer.valueOf(sess().getEtudiant().primaryKey());
		String link = url.getGctcUrl();
		NSMutableDictionary requetePersId = (NSMutableDictionary) gestEtu
				.selectRawRowrequetePersId(edc(), etuId).lastObject();
		String persId = requetePersId.valueForKey("COCK_PERS_ID").toString();
		String urlGctc = link+persId;
		EOEditingContext newEdc = ERXEC.newEditingContext();
	    sess().setNestedEdc(newEdc);
		return urlGctc;
	}

	// fin lien page etudiant

	public WOActionResults retourAlaListe() {
		WOComponent searchPage = null;
		NSArray<EOIndividu> lesEtudiants = new NSArray<EOIndividu>();
		WODisplayGroup dg = wocomponent().getDgActif();
		if (dg.allObjects().count() == 0) {
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
			wocomponent().getDgActif().setCurrentBatchIndex(
					sess().getCurrentBatchIndex());
		} else {
			wocomponent().setDgActif(dg);
			wocomponent().getDgActif().setCurrentBatchIndex(
					sess().getCurrentBatchIndex());
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
		id = Integer.valueOf(sess().getEtudiant().primaryKey());
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

	public void edtUvSelection() {
		if (dg().allObjects().isEmpty()) {
			dg().setObjectArray(new NSArray(sess().getEtudiant()));
			dg().queryBindings().setObjectForKey(sess().getEtudiant().primaryKey(),
					"numero");
		}
		setBdgs(dg().queryBindings());
		try {
			NSMutableArray uvList = new NSMutableArray();
			uvList = reWriteListDico(gestEdt.selectRawRowFunctionEdtUV(edc(),
					bdgs()));
			wocomponent().setListUv(uvList);
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

	public void lesCouleurs(NSArray uvs) {
		for (int i = 0; i < uvs.count(); i++) {
			NSMutableDictionary tmpUv = new NSMutableDictionary();
			tmpUv = (NSMutableDictionary) uvs.objectAtIndex(i);
			getCouleur().put(tmpUv.valueForKey("UV"), couleurs().objectAtIndex(i));
		}
	}

	public void horaires() {
		setEdt(wocomponent().edtUtil().horaires());
	}

	// Refonte de l'emploi du temps
	public void edtIdSelection() {
		setData(new NSMutableDictionary());
		setHtml("<!-- Début du HTML--> \n");
		if (dg().allObjects().isEmpty()) {
			dg().setObjectArray(new NSArray(sess().getEtudiant()));
			dg().queryBindings().setObjectForKey(sess().getEtudiant().primaryKey(),
					"numero");
		}
		setNom(sess().getEtudiant().nomAndPrenom());
		setId(Integer.valueOf(sess().getEtudiant().primaryKey()));
		setBdgs(dg().queryBindings());
		try {
			NSMutableArray edtEtuList = new NSMutableArray();
			edtEtuList = reWriteListDico(gestEdt.selectRawRowFunctionEdt(edc(),
					bdgs()));
			for (int i = 0; i < edtEtuList.count(); i++) {
				NSMutableDictionary dicoJour = new NSMutableDictionary();
				NSMutableDictionary dicoDebut = new NSMutableDictionary();
				NSMutableDictionary ln = new NSMutableDictionary();
				ln = (NSMutableDictionary) edtEtuList.objectAtIndex(i);
				String jour = (String) ln.objectForKey("JOUR");
				// On vérifie si le dictionnaire principal contient les jours de
				// la semaine
				if (!getData().containsKey(jour)) {
					getData().put(jour, dicoJour);
				}
				NSMutableDictionary debut = (NSMutableDictionary) data
						.valueForKey(jour);
				Integer deb = wocomponent().edtUtil().code((String) ln.objectForKey("DEBUT"));
				// On vérifie si les jours de la semaine ont un numéro de début
				if (!debut.containsKey(deb)) {
					debut.put(deb, dicoDebut);
					NSMutableArray debList = new NSMutableArray();
					NSMutableDictionary edtData = new NSMutableDictionary();
					edtData.put("uv", ln.objectForKey("UV"));
					edtData.put("id", ln.objectForKey("EDT_ID"));
					edtData.put("type", ln.objectForKey("TYPE_EDT"));
					edtData.put("semaine", ln.objectForKey("SEMAINE"));
					edtData.put("weekname", ln.objectForKey("WEEKNAME"));
					edtData.put("salle1", ln.objectForKey("SALLE1"));
					edtData.put("salle2", ln.objectForKey("SALLE2"));
					edtData.put("salle3", ln.objectForKey("SALLE3"));
					edtData.put("salle4", ln.objectForKey("SALLE4"));
					Integer fin = wocomponent().edtUtil().code((String) ln.objectForKey("FIN"));
					Integer debInt = wocomponent().edtUtil().code((String) ln.objectForKey("DEBUT"));
					edtData.put("temp", (fin - debInt));
					debList.addObject(edtData);
					debut.put(deb, debList);
				} else {
					NSMutableArray List = new NSMutableArray();
					NSMutableArray old = (NSMutableArray) debut
							.objectForKey(deb);
					NSMutableDictionary oldDico = (NSMutableDictionary) old
							.objectAtIndex(0);
					NSMutableDictionary edtData = new NSMutableDictionary();
					edtData.put("uv", ln.objectForKey("UV"));
					edtData.put("id", ln.objectForKey("EDT_ID"));
					edtData.put("type", ln.objectForKey("TYPE_EDT"));
					edtData.put("semaine", ln.objectForKey("SEMAINE"));
					edtData.put("weekname", ln.objectForKey("WEEKNAME"));
					edtData.put("salle1", ln.objectForKey("SALLE1"));
					edtData.put("salle2", ln.objectForKey("SALLE2"));
					edtData.put("salle3", ln.objectForKey("SALLE3"));
					edtData.put("salle4", ln.objectForKey("SALLE4"));
					Integer fin = wocomponent().edtUtil().code((String) ln.objectForKey("FIN"));
					Integer debInt = wocomponent().edtUtil().code((String) ln.objectForKey("DEBUT"));
					edtData.put("temp", (fin - debInt));
					List.addObject(oldDico);
					List.addObject(edtData);
					debut.put(deb, List);
				}
			}
			// On parcourt chaque jour de la semaine
			for(String jour : jours()) {
				setHtml(html += "<td class=\"jourField\"> \n");
				// Pour le jour on va parcourir les heures qui sont codés en demi-
				// heure !
				for (int time = 16; time < 45; time++) {
					setHtml(html += "<!-- Début for principale--> \n");
					// On recupère le jour
					NSMutableDictionary data_jour = (NSMutableDictionary) getData()
							.objectForKey(jour);
					NSMutableArray jourTime = null;
					if (data_jour != null) {
						// On récupère les heures du jour
						jourTime = (NSMutableArray) data_jour
								.objectForKey(time);
					}
					// S'il y a un objet qui correspond, on va pouvoir
					// l'afficher !
					if (jourTime != null) {
						// la variable max est la fin du mode 2Tableaux
						Integer max = 0;
						// Analyse de la longeur du 2Tableaux
						NSMutableDictionary jourTime_T2 = jourTime_T2 = (NSMutableDictionary) jourTime
								.objectAtIndex(0);
						String semaine = (String) jourTime_T2
								.objectForKey("semaine");
						if (semaine != null && semaine.equals("2")) {// IF [SEMAINET2?]
							Integer temp = (Integer) jourTime_T2
									.objectForKey("temp");
							max = temp + time;
							for (int test = time; test < max; test++) {
								NSMutableArray jourTest = (NSMutableArray) data_jour.objectForKey(test);
								if (jourTest != null) {
									NSMutableDictionary jourTest_T2 = null;
									// SI on trouve un creno paralelle on regarde sa taille et on MAJ max
									if(jourTest.count() > 1)
										jourTest_T2 = (NSMutableDictionary) jourTest.objectAtIndex(1);
									if (jourTest_T2 != null) {// On verifie l'existance
										Integer tempa = (Integer) ((NSMutableDictionary) jourTest.objectAtIndex(1)).objectForKey("temp");
										max = Math.max(max,(test+ tempa));
									}
									Integer tempo = (Integer) ((NSMutableDictionary) jourTest.objectAtIndex(0)).objectForKey("temp");
									max = Math.max(max.intValue(), (test + tempo));
									if (jourTest_T2 != null) {// On verifie l'existance
										Integer tempa = (Integer) ((NSMutableDictionary) jourTest.objectAtIndex(1)).objectForKey("temp");
										max = Math.max(max,(test+ tempa));
									}
								}
							}
							//On va maintenant parcourir a gauche puis a drouite le 2Tableaux
							Integer droite = time;
							setHtml(html += "<table class=\"tableinner\"><tr><td> \n");
							setHtml(html += "<!-- debut colonne gauche--> \n");
							//GAUCHE
							for(time = time; time < max; time++) {
								NSMutableArray jourGauche = (NSMutableArray) data_jour.objectForKey(time);
								NSMutableDictionary jourGauche_T2 = null;
								if(jourGauche != null && jourGauche.count() != 0)
									jourGauche_T2 = (NSMutableDictionary) jourGauche.objectAtIndex(0);
								if(jourGauche_T2 != null){
									Integer depile = time;
									setHtml(html+= wocomponent().edtUtil().crenoPlein(jourGauche_T2, jour, time));
									time = wocomponent().edtUtil().getIniTime();
									//ARRET ICI
									jourGauche.removeObjectAtIndex(0);
									data_jour.setObjectForKey(jourGauche, depile);
								} else {
									//crenoVide
									setHtml(html += wocomponent().edtUtil().crenoVide("2"));
								}	
							}
							setHtml(html += "<!-- fin colonne gauche--> \n");
							setHtml(html += "</td><td> \n");
							setHtml(html += "<!-- debut colonne droite--> \n");
							//DROITE
							for(time = droite; time < max; time++){
								NSMutableArray jourDroite = (NSMutableArray) data_jour.objectForKey(time);
								NSMutableDictionary jourDroite_T2A = null;
								NSMutableDictionary jourDroite_T2B = null;
								if(jourDroite != null && jourDroite.count() != 0){
									jourDroite_T2A = (NSMutableDictionary) jourDroite.objectAtIndex(0);
									if(jourDroite.count() > 1)
										jourDroite_T2B = (NSMutableDictionary) jourDroite.objectAtIndex(1);
								}
								if(jourDroite_T2A != null){
									setHtml(html+= wocomponent().edtUtil().crenoPlein(jourDroite_T2A, jour, time));
									time = wocomponent().edtUtil().getIniTime();
								} else if(jourDroite_T2B != null) {
									setHtml(html+= wocomponent().edtUtil().crenoPlein(jourDroite_T2B, jour, time));
									time = wocomponent().edtUtil().getIniTime();
								} else {
									//crenoVide
									setHtml(html += wocomponent().edtUtil().crenoVide("2"));
								}
							}
							setHtml(html += "<!-- fin colonne droite--> \n");
							setHtml(html += "</td></tr></table> \n");
							time = max - 1;
							//Ce else correspond a s'il n'y a pas de 2Tableaux (mode : normal)
						} else {
							// crenoPlein
							setHtml(html+= wocomponent().edtUtil().crenoPlein(jourTime_T2, jour, time));
							time = wocomponent().edtUtil().getIniTime();
						}// FIN de si il y a un creno de semaine 2Tableaux
					} else {
						// crenoVide
						NSMutableDictionary valueData = null;
						String classe = null;
						String sem = "1";
						Integer tep = 0;
						if (jourTime != null) {
							valueData = (NSMutableDictionary) jourTime.objectAtIndex(0);
							sem = (String) valueData.objectForKey("semaine");
						}
						setHtml(html += wocomponent().edtUtil().crenoVide(sem));
					}// Fin du IF qui verifie qui il y a un creno ou non (le cas
						// au dessus est un else )
				}// FIn du for qui parcour les heures !!!
					// Fin for principal
				setHtml(html += "<!-- Fin for principal--> \n");
				setHtml(html += "</td> \n");
			}
			getEdt().put("html", getHtml());
			// NSLog.out.appendln("page HTML :" + edt.objectForKey("html"));
			// NSLog.out.appendln("page TIME :" + edt.objectForKey("time"));
			setHoraire((NSMutableArray) getEdt().objectForKey("time"));
			setLeHTML((String) getEdt().objectForKey("html"));
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

	protected NSMutableDictionary reWriteDico(NSMutableDictionary dico) {
		NSMutableDictionary ledico = new NSMutableDictionary();
		ledico = dico;
		for (int i = 0; i < dico.size(); i++) {
			String key = (String) dico.allKeys().objectAtIndex(i);
			Object value = dico.valueForKey(key);
			if (value.equals(NSKeyValueCoding.NullValue)) {
				dico.setObjectForKey("", key);
				ledico = dico;
			}
		}
		return ledico;
	}
/*
	// Time decoder / coder protected
	String decode(Number ptime) {
		String ttime = null;
		String t = null;
		float time = ptime.floatValue();
		Double var = new Double(time / 2);
		double pf = Math.floor(var);
		if (String.valueOf(pf).length() == 3) {
			ttime = String.valueOf(pf).substring(0, 1) + ":";
		} else {
			ttime = String.valueOf(pf).substring(0, 2) + ":";
		}
		Double var1 = new Double(ptime.doubleValue() / 2);
		if (pf == (var1)) {
			t = "00";
		} else {
			t = "30";
		}
		ttime += t;
		return ttime;
	}

	protected Integer code(String pdebut) {
		String[] one = null;
		Integer more = 0;
		one = pdebut.split(":");
		if (one[1].equals("30")) {
			more = 1;
		}
		if (one[1].equals("60")) {
			more = 2;
		}
		return Integer.valueOf(one[0]) * 2 + more;
	}

	protected void theType() {
		type = new NSMutableDictionary();
		type.put("CM", "Cours");
		type.put("TP", "TP");
		type.put("TD", "TD");

	}

	protected void theDay() {
		jours = new NSMutableArray();
		jours.addObject("lundi");
		jours.addObject("mardi");
		jours.addObject("mercredi");
		jours.addObject("jeudi");
		jours.addObject("vendredi");
		jours.addObject("samedi");
	}

	protected void theColor() {
		couleurs = new NSMutableArray();
		couleurs.addObject("#BBFF00");
		couleurs.addObject("#CCFFCC");
		couleurs.addObject("#FFFFCC");
		couleurs.addObject("#CCAACC");
		couleurs.addObject("#FFAA88");
		couleurs.addObject("#BBCCFF");
		couleurs.addObject("#BBFFBB");
		couleurs.addObject("#00FF00");
		// couleurs.addObject("#BBFF00"); //couleurs.addObject("#CCFFCC");
	}
*/
}
