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
package etudiants.utt.fr.components;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

import org.login.fwkloginwebapp.common.util.StringCtrl;

import com.ibm.icu.math.BigDecimal;
import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEditingContext.EditingContextEvent;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSCoder;
import com.webobjects.foundation.NSCoding;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

import er.extensions.batching.ERXBatchingDisplayGroup;
import etudiants.utt.fr.components.controlers.ProfilEtudiantsCtrl;
import etudiants.utt.fr.eo.EOEtudiant;
import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.eo.EOVueAfficherdiplome;
import etudiants.utt.fr.eo.EOVueAfficherparcours;
import etudiants.utt.fr.eo.EOVueDetailetudiant;
import etudiants.utt.fr.eo.EOVueDetailparcours;
import etudiants.utt.fr.eo.EOVueDiplnoprd;
import etudiants.utt.fr.eo.EOVueDiplwithprd;
import etudiants.utt.fr.eo.EOVueNivAdm;
import etudiants.utt.fr.eo.EOVuePeriodeParam;
import etudiants.utt.fr.eo.EOVueSpecMast;
import etudiants.utt.fr.server.Application;
import etudiants.utt.fr.server.MyAjaxComponent;
import etudiants.utt.fr.server.ProfilHelpers;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.server.process.ProcessGestionRechercheEtudiants;
import etudiants.utt.fr.util.StringOperation;
import gestionuv.utt.fr.eo.EOEtuMineur;
import gestionuv.utt.fr.eo.EOParamDoetu;
import gestionuv.utt.fr.eo.EOProfilTotaux;
import gestionuv.utt.fr.eo.EORefProfil;
import gestionuv.utt.fr.eo.EORefProfilTotal;
import gestionuv.utt.fr.eo.EOUvOuv;
import gestionuv.utt.fr.eo.EOVueLescategories;
import gestionuv.utt.fr.eo.EOVueSelectinsuv;

import com.webobjects.appserver.WOActionResults;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

@SuppressWarnings("all")
public class ProfilEtudiants extends MyAjaxComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4818994417027101016L;
	private String onLoad = null;
	private ProfilEtudiantsCtrl ctrl;
	private Session sess;
	public static String IMG_SERVER;
	public static String IMG_DIR;
	public static int timer = 200;
	private Boolean hasAnnonce;
	private Boolean hasInscription = Boolean.FALSE;
	private Boolean hasMineur = Boolean.FALSE;
	private Boolean hasDiplomes = Boolean.FALSE;
	private EOEtudiant unEtudiant;
	private EOVueDetailetudiant detailEtudiant;
	private NSMutableDictionary dicEtudiant;
	private EOIndividu unConseiller;
	private NSArray listDiplome;
	private NSMutableDictionary dicDiplome;
	// private EOVueAfficherdiplome diplomeItem;
	private NSArray<EOEtuMineur> mineurList;
	private EOEtuMineur mineurItem;
	private NSArray<EORefProfil> listLegende;
	private EORefProfil legendeItem;
	private String mineurs;
	private Boolean hasDernierEtab = Boolean.FALSE;
	private NSArray listCategory;
	private NSMutableDictionary dicCateg;
	private NSMutableDictionary dicCateg1;
	private NSMutableDictionary dicCateg2;
	private NSMutableDictionary dicCateg3;
	private NSMutableDictionary dicCateg4;
	private EOVueLescategories categoryItem;
	private EOVueLescategories categoryItem1;
	private EOVueLescategories categoryItem2;
	private EOVueLescategories categoryItem3;
	private EOVueLescategories categoryItem4;
	private NSArray listParcours;
	private NSMutableDictionary dicParcours;
	private EOVueDetailparcours parcoursItem;
	private NSArray listInsUv;
	private NSMutableDictionary dicUv;
	private NSMutableDictionary dicUv2;
	private EOVueSelectinsuv uvItem;
	private EOVueSelectinsuv uvItem1;
	private NSArray listTotal;
	private NSMutableDictionary dicTotal;
	private EORefProfilTotal totalItem;
	private NSArray listTotaux;
	private NSMutableDictionary dicTotaux;
	private NSMutableDictionary dicTotaux2;
	private NSMutableDictionary dicTotaux3;
	private EOProfilTotaux totauxItem;
	private EOProfilTotaux totauxItem2;
	private EOProfilTotaux totauxItem3;
	//
	private String reo;
	private boolean hasSoutenance = false;
	private boolean hasDiplNum = false;
	private Boolean isAnnee;
	private Boolean isSemestre;
	public NSMutableDictionary stotal;
	public NSMutableDictionary stotalTg;
	public NSMutableDictionary totalg;
	private NSMutableArray total1;
	private int totals;
	private boolean okParc;
	private boolean okDipl;
	private int total;
	private int totalsg;
	private boolean okCateg = false;
	private boolean okCateg1 = false;
	public String ss;
	public String cc;
	public String cc2;
	public String dd;
	public String dd2;
	private Boolean diplTotaux = Boolean.FALSE;
	private Boolean isMin = Boolean.FALSE;
	private Boolean isMin2 = Boolean.FALSE;
	private Boolean dispImg = Boolean.FALSE;
	private Boolean dispImg2 = Boolean.FALSE;
	private String gt;
	private Boolean totalGcond = Boolean.FALSE;
	public int idx;
	private NSArray<EOParamDoetu> listAnnoncePcb;
	private EOParamDoetu annoncePcb;
	private Boolean isOpenFenetreException = Boolean.FALSE;

	// Initialisation des composants de l'IHM + fetch des donn�es principales
	public ProfilEtudiants(WOContext context) {
		super(context);
		NSLog.out.appendln("ProfilEtudiants");
		totalg = new NSMutableDictionary();
		stotalTg = new NSMutableDictionary();
		stotal = new NSMutableDictionary();
		IMG_SERVER = myApp().imgServer();
		IMG_DIR = myApp().repPhoto();
		setHasAnnonce(false);
		setHasInscription(false);
		setHasMineur(false);
		ctrl().letudiant();
		ctrl().leDiplome();
		if (getListDiplome().count() != 0) {
			setHasDiplomes(Boolean.TRUE);
		}
		if (!getDicEtudiant().valueForKey("ETAB_DER_DIPLOME").equals("")) {
			setHasDernierEtab(Boolean.TRUE);
		}
		if (!getDicEtudiant().valueForKey("DER_INSCRIPTION").equals("")
				|| !getDicEtudiant().valueForKey("ACT_FORMATION").equals("")) {
			setHasInscription(Boolean.TRUE);
		}
		funcAnoncePcb();
		if (getAnnoncePcb().visiblef().equals("O")) {
			setHasAnnonce(Boolean.TRUE);
		} else {
			setHasAnnonce(Boolean.FALSE);
		}
	}

	/**
	 * @return the onLoad
	 */
	public String getOnLoad() {
		return onLoad;
	}

	/**
	 * @param onLoad
	 *            the onLoad to set
	 */
	public void setOnLoad(String onLoad) {
		this.onLoad = onLoad;
	}

	public void appendToResponse(WOResponse res, WOContext ctx) {
		super.appendToResponse(res, ctx);
		if (onLoad != null)
			onLoad = null;
		ProfilHelpers.insertStylesSheet(ctx, res);
		String message = mySession().getAlertMessage();
		if (message != null && message.equals("") == false) {
			String str = "<script language=\"javascript\" type=\"text/javascript\">\n";
			str += "alert(\"" + message + "\");\n";
			str += "</script>";
			res.appendContentString(str);
			mySession().setAlertMessage(null);
		}
	}

	/**
	 * @return the isOpenFenetreException
	 */
	public Boolean isOpenFenetreException() {
		return isOpenFenetreException;
	}

	/**
	 * @param isOpenFenetreException
	 *            the isOpenFenetreException to set
	 */
	public void setIsOpenFenetreException(Boolean isOpenFenetreException) {
		this.isOpenFenetreException = isOpenFenetreException;
	}

	/**
	 * @return the ctrl
	 */
	public ProfilEtudiantsCtrl ctrl() {
		if (ctrl == null)
			ctrl = new ProfilEtudiantsCtrl(this);
		return ctrl;
	}

	/**
	 * @param ctrl
	 *            the ctrl to set
	 */
	public void setCtrl(ProfilEtudiantsCtrl ctrl) {
		this.ctrl = ctrl;
	}

	/**
	 * @return the sess
	 */
	public Session sess() {
		if (sess == null)
			sess = mySession();
		return sess;
	}

	/**
	 * @param sess
	 *            the sess to set
	 */
	public void setSess(Session sess) {
		this.sess = sess;
	}

	/**
	 * @return the hasAnnonce
	 */
	public Boolean hasAnnonce() {
		return hasAnnonce;
	}

	/**
	 * @param hasAnnonce
	 *            the hasAnnonce to set
	 */
	public void setHasAnnonce(Boolean hasAnnonce) {
		this.hasAnnonce = hasAnnonce;
	}

	/**
	 * @return the hasNotInscription
	 */
	public Boolean hasInscription() {
		return hasInscription;
	}

	/**
	 * @param hasNotInscription
	 *            the hasNotInscription to set
	 */
	public void setHasInscription(Boolean hasNotInscription) {
		this.hasInscription = hasNotInscription;
	}

	/**
	 * @return the hasMineur
	 */
	public Boolean hasMineur() {
		return hasMineur;
	}

	/**
	 * @param hasMineur
	 *            the hasMineur to set
	 */
	public void setHasMineur(Boolean hasMineur) {
		this.hasMineur = hasMineur;
	}

	/**
	 * @return the hasDiplomes
	 */
	public Boolean isHasDiplomes() {
		return hasDiplomes;
	}

	/**
	 * @param hasDiplomes
	 *            the hasDiplomes to set
	 */
	public void setHasDiplomes(Boolean hasDiplomes) {
		this.hasDiplomes = hasDiplomes;
	}

	// V�rification droit � l'image avant affichage des photos des �tudiants
	public String droitImage() {
		String cmineur = "";
		String imageURL = null;
		EOEtudiant study = null;
		// R�cup�ration de l'id de l'�tudiant afin d'afficher sa photo
		EOIndividu etudiantsKey = sess().getEtudiant();
		String pkey = etudiantsKey.primaryKey();
		Long pk = Long.parseLong(pkey);
		NSArray<EOEtudiant> droitImages = etudiantsKey.etudiants1();
		// Affichage du mineur d'un �tudiant
		setMineurList(EOEtuMineur.fetchEtuMineurs(edc(), pk));
		if (getMineurList().count() != 0) {
			setHasMineur(Boolean.TRUE);
			for (int i = 0; i < getMineurList().count(); i++) {
				cmineur = cmineur
						+ getMineurList().objectAtIndex(i).mineurc().toString()
						+ ", ";
				// NSLog.out.appendln(cmineur);
			}
			cmineur = cmineur.substring(0, cmineur.length() - 2);
			setMineurs(cmineur);
			// NSLog.out.appendln(cmineur);
		} else {
			setHasMineur(Boolean.FALSE);
		}
		for (int i = 0; i < droitImages.count(); i++) {
			study = droitImages.objectAtIndex(i);
			/*
			 * if (study.droitImageAccord$f() == null ||
			 * study.droitImageAccord$f().toString().equals("o") ||
			 * study.droitImageAccord$f().toString().equals("O") ||
			 * study.droitImageAccord$f().toString().equals(" ")) {
			 */
			imageURL = IMG_SERVER + IMG_DIR + pk + ".jpg";
			// Test de l'URL si la photo existe sinon afficher l'image par
			// d�faut
			if (!exists(imageURL)) {
				imageURL = "image/default.jpg";
			}/*
			 * else { imageURL = "image/default.jpg"; }
			 */
		}
		return imageURL;
	}

	/**
	 * @param unEtudiant
	 *            the unEtudiant to set
	 */
	public void setUnEtudiant(EOEtudiant unEtudiant) {
		this.unEtudiant = unEtudiant;
	}

	/**
	 * @return the unEtudiant
	 */
	public EOEtudiant getUnEtudiant() {
		return unEtudiant;
	}

	/**
	 * @param detailEtudiant
	 *            the detailEtudiant to set
	 */
	public void setDetailEtudiant(EOVueDetailetudiant detailEtudiant) {
		this.detailEtudiant = detailEtudiant;
	}

	/**
	 * @return the detailEtudiant
	 */
	public EOVueDetailetudiant getDetailEtudiant() {
		return detailEtudiant;
	}

	/**
	 * @return the unConseiller
	 */
	public EOIndividu getUnConseiller() {
		return unConseiller;
	}

	/**
	 * @param unConseiller
	 *            the unConseiller to set
	 */
	public void setUnConseiller(EOIndividu unConseiller) {
		this.unConseiller = unConseiller;
	}

	/**
	 * @return the listDiplome
	 */
	public NSArray getListDiplome() {
		return listDiplome;
	}

	/**
	 * @param listDiplome
	 *            the listDiplome to set
	 */
	public void setListDiplome(NSArray listDiplome) {
		this.listDiplome = listDiplome;
	}

	/**
	 * @return the diplomeItem
	 * 
	 *         public EOVueAfficherdiplome getDiplomeItem() { return
	 *         diplomeItem; }
	 */
	/**
	 * @param diplomeItem
	 *            the diplomeItem to set
	 * 
	 *            public void setDiplomeItem(EOVueAfficherdiplome diplomeItem) {
	 *            this.diplomeItem = diplomeItem; }
	 */
	/**
	 * @return the mineurList
	 */
	public NSArray<EOEtuMineur> getMineurList() {
		return mineurList;
	}

	/**
	 * @param mineurList
	 *            the mineurList to set
	 */
	public void setMineurList(NSArray<EOEtuMineur> mineurList) {
		this.mineurList = mineurList;
	}

	/**
	 * @param mineurItem
	 *            the mineurItem to set
	 */
	public void setMineurItem(EOEtuMineur mineurItem) {
		this.mineurItem = mineurItem;
	}

	/**
	 * @return the mineurItem
	 */
	public EOEtuMineur getMineurItem() {
		return mineurItem;
	}

	/**
	 * @param mineurs
	 *            the mineurs to set
	 */
	public void setMineurs(String mineurs) {
		this.mineurs = mineurs;
	}

	/**
	 * @return the mineurs
	 */
	public String getMineurs() {
		return mineurs;
	}

	/**
	 * @param listLegende
	 *            the listLegende to set
	 */
	public void setListLegende(NSArray<EORefProfil> listLegende) {
		this.listLegende = listLegende;
	}

	/**
	 * @return the listLegende
	 */
	public NSArray<EORefProfil> getListLegende() {
		return listLegende;
	}

	/**
	 * @param listCategory
	 *            the listCategory to set
	 */
	public void setListCategory(NSArray listCategory) {
		this.listCategory = listCategory;
	}

	/**
	 * @return the listCategory
	 */
	public NSArray getListCategory() {
		return listCategory;
	}

	/**
	 * @param categoryItem
	 *            the categoryItem to set
	 */
	public void setCategoryItem(EOVueLescategories categoryItem) {
		this.categoryItem = categoryItem;
	}

	/**
	 * @return the categoryItem
	 */
	public EOVueLescategories getCategoryItem() {
		return categoryItem;
	}

	/**
	 * @param categoryItem1
	 *            the categoryItem1 to set
	 */
	public void setCategoryItem1(EOVueLescategories categoryItem1) {
		this.categoryItem1 = categoryItem1;
	}

	/**
	 * @return the categoryItem1
	 */
	public EOVueLescategories getCategoryItem1() {
		return categoryItem1;
	}

	/**
	 * @param categoryItem2
	 *            the categoryItem2 to set
	 */
	public void setCategoryItem2(EOVueLescategories categoryItem2) {
		this.categoryItem2 = categoryItem2;
	}

	/**
	 * @return the categoryItem2
	 */
	public EOVueLescategories getCategoryItem2() {
		return categoryItem2;
	}

	/**
	 * @return the categoryItem3
	 */
	public EOVueLescategories getCategoryItem3() {
		return categoryItem3;
	}

	/**
	 * @param categoryItem3
	 *            the categoryItem3 to set
	 */
	public void setCategoryItem3(EOVueLescategories categoryItem3) {
		this.categoryItem3 = categoryItem3;
	}

	/**
	 * @return the categoryItem4
	 */
	public EOVueLescategories getCategoryItem4() {
		return categoryItem4;
	}

	/**
	 * @param categoryItem4
	 *            the categoryItem4 to set
	 */
	public void setCategoryItem4(EOVueLescategories categoryItem4) {
		this.categoryItem4 = categoryItem4;
	}

	/**
	 * @param listParcours
	 *            the listParcours to set
	 */
	public void setListParcours(NSArray listParcours) {
		this.listParcours = listParcours;
	}

	/**
	 * @return the listParcours
	 */
	public NSArray getListParcours() {
		return listParcours;
	}

	/**
	 * @param parcoursItem
	 *            the parcoursItem to set
	 */
	public void setParcoursItem(EOVueDetailparcours parcoursItem) {
		this.parcoursItem = parcoursItem;
	}

	/**
	 * @return the parcoursItem
	 */
	public EOVueDetailparcours getParcoursItem() {
		return parcoursItem;
	}

	/**
	 * @param legendeItem
	 *            the legendeItem to set
	 */
	public void setLegendeItem(EORefProfil legendeItem) {
		this.legendeItem = legendeItem;
	}

	/**
	 * @return the legendeItem
	 */
	public EORefProfil getLegendeItem() {
		return legendeItem;
	}

	/**
	 * @param listInsUv
	 *            the listInsUv to set
	 */
	public void setListInsUv(NSArray listInsUv) {
		this.listInsUv = listInsUv;
	}

	/**
	 * @return the listInsUv
	 */
	public NSArray getListInsUv() {
		return listInsUv;
	}

	/**
	 * @param uvItem
	 *            the uvItem to set
	 */
	public void setUvItem(EOVueSelectinsuv uvItem) {
		this.uvItem = uvItem;
	}

	/**
	 * @return the uvItem
	 */
	public EOVueSelectinsuv getUvItem() {
		return uvItem;
	}

	/**
	 * @param uvItem1
	 *            the uvItem1 to set
	 */
	public void setUvItem1(EOVueSelectinsuv uvItem1) {
		this.uvItem1 = uvItem1;
	}

	/**
	 * @return the uvItem1
	 */
	public EOVueSelectinsuv getUvItem1() {
		return uvItem1;
	}

	/**
	 * @param listTotal
	 *            the listTotal to set
	 */
	public void setListTotal(NSArray listTotal) {
		this.listTotal = listTotal;
	}

	/**
	 * @return the listTotal
	 */
	public NSArray getListTotal() {
		return listTotal;
	}

	/**
	 * @param totalItem
	 *            the totalItem to set
	 */
	public void setTotalItem(EORefProfilTotal totalItem) {
		this.totalItem = totalItem;
	}

	/**
	 * @return the totalItem
	 */
	public EORefProfilTotal getTotalItem() {
		return totalItem;
	}

	/**
	 * @param reo
	 *            the reo to set
	 */
	public void setReo(String reo) {
		this.reo = reo;
	}

	/**
	 * @return the reo
	 */
	public String getReo() {
		return reo;
	}

	/*
	 * protected NSArray<EOSortOrdering> sortLegene() { return new
	 * NSArray(EOSortOrdering.sortOrderingWithKey("profilOrdre",
	 * EOSortOrdering.CompareAscending)); }
	 * 
	 * protected NSArray<EOSortOrdering> sortCateg() { return new
	 * NSArray(EOSortOrdering.sortOrderingWithKey("ordre",
	 * EOSortOrdering.CompareAscending)); }
	 * 
	 * protected NSArray<EOSortOrdering> sortUv() { return new NSArray(new
	 * Object[] { EOSortOrdering.sortOrderingWithKey("categOrdre",
	 * EOSortOrdering.CompareAscending),
	 * EOSortOrdering.sortOrderingWithKey("uv", EOSortOrdering.CompareAscending)
	 * }); }
	 * 
	 * protected NSArray<EOSortOrdering> sortParc() { return new
	 * NSArray(EOSortOrdering.sortOrderingWithKey("incrAdmId",
	 * EOSortOrdering.CompareAscending)); }
	 */

	// V�rification si l�gende existe avant affichage + test des ann�es et
	// semestre
	// + fetch des legende, category, uv et parcours.
	public Boolean legendeInDiplome() {
		setListTotal(new NSArray<EORefProfilTotal>());
		setTotalGcond(Boolean.FALSE);
		if (getDicDiplome().valueForKey("REORIENTE").equals("O")) {
			setReo("reoriente");
		} else {
			setReo("");
		}
		if (getDicDiplome().valueForKey("DIPLOMEC").equals(StringOperation.DOCTORANT)
				|| getDicDiplome().valueForKey("DIPLOMEC").equals(StringOperation.UNIVERSITAIRE)
				|| getDicDiplome().valueForKey("DIPLOMEC").equals(StringOperation.LICENCE)) {
			setIsAnnee(Boolean.TRUE);
			setIsSemestre(Boolean.FALSE);
		} else {
			setIsAnnee(Boolean.FALSE);
			setIsSemestre(Boolean.TRUE);
		}
		if (getDicDiplome().valueForKey("DIPLOMEC").equals(StringOperation.TRONC)
				|| getDicDiplome().valueForKey("DIPLOMEC").equals("LB")
				|| getDicDiplome().valueForKey("DIPLOMEC").equals(StringOperation.INGENIEUR)
				|| getDicDiplome().valueForKey("DIPLOMEC").equals(StringOperation.DOCTORANT)) {
			setTotalGcond(Boolean.TRUE);
		}

		// Fetch sur les totaux d'un �tudiants si le profil du diplome est � OUI
		if (getDicDiplome().valueForKey("PROFILC").equals("O")) {
			ctrl().leTotal();
		}
		if (getListTotal() != null && getListTotal().count() != 0) {
			setDiplTotaux(Boolean.TRUE);
		} else {
			setDiplTotaux(Boolean.FALSE);
		}
		if (getListLegende().count() == 0) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	// Test pour v�rifier si un diplome calcul les totaux des uvs
	public boolean totoIn() {
		ctrl().lesTotaux();
		if (getListTotaux().count() != 0) {
			return true;
		}
		return false;
	}

	// Test afin d'afficher le d�tail des totaux et la g�n�ration du tableau des
	// totaux
	public boolean pythonTtId() {
		setMin(Boolean.FALSE);
		setDispImg(Boolean.FALSE);
		if (!getDicTotaux().valueForKey("MINI").equals("")) {
			setMin(Boolean.TRUE);
		}
		if (getDicTotaux().valueForKey("ACQUIS").equals("O")) {
			setDispImg(Boolean.TRUE);
		}
		if (getDicTotaux().valueForKey("PROFIL_TOTAL_ID").equals(
				getDicTotal().valueForKey("PROFIL_TOTAL_ID"))) {
			return true;
		}
		return false;
	}

	// Test pour g�n�ration du tableau des totaux
	public boolean pythonTtOrdre() {
		BigDecimal min = new BigDecimal(1);
		BigDecimal max = new BigDecimal(999);
		Object lg = getDicTotaux().valueForKey("ORDRE_LG");
		Object col = getDicTotaux().valueForKey("ORDRE_COL");
		Integer inLg = ((Double) lg).intValue();
		Integer inCol = ((Double) col).intValue();
		if (inLg.toString().equals(min.toString())
				&& !inCol.toString().equals(max.toString())) {
			return true;
		}
		return false;
	}

	// Test pour affichage des d�tail de la g�n�ration du tableau des totaux
	public boolean egalites2() {
		/*
		 * EOEditingContext ec = totalItem.editingContext(); EORefProfilTotal
		 * total = totalItem.localInstanceIn(ec);
		 */
		if (getDicTotaux2().valueForKey("PROFIL_TOTAL_ID").equals(
				getDicTotal().valueForKey("PROFIL_TOTAL_ID"))) {
			return true;
		}
		return false;
	}

	// Test pour affichage des d�tail de la g�n�ration du tableau des totaux
	public boolean tTordre2() {
		BigDecimal min = new BigDecimal(2);
		Object lg = getDicTotaux2().valueForKey("ORDRE_LG");
		Integer inLg = ((Double) lg).intValue();
		if (inLg.toString().equals(min.toString())) {
			gt = "1";
			return true;
		}
		gt = null;
		return false;
	}

	public boolean conditionalGt() {
		if (gt != null && gt.equals("1")) {
			return true;
		}
		return false;
	}

	// Test pour affichage des d�tail de la g�n�ration du tableau des totaux
	public boolean egalites3() {
		/*
		 * EOEditingContext ec = totalItem.editingContext(); EORefProfilTotal
		 * total = totalItem.localInstanceIn(ec);
		 */
		setIsMin2(Boolean.FALSE);
		setDispImg2(Boolean.FALSE);
		if (!getDicTotaux3().valueForKey("MINI").equals("")) {
			setIsMin2(Boolean.TRUE);
		}
		if (getDicTotaux3().valueForKey("ACQUIS").equals("O")) {
			setDispImg2(Boolean.TRUE);
		}
		if (getDicTotaux3().valueForKey("PROFIL_TOTAL_ID").equals(
				getDicTotal().valueForKey("PROFIL_TOTAL_ID"))) {
			return true;
		}
		return false;
	}

	// Test pour affichage des d�tail de la g�n�ration du tableau des totaux
	public boolean tTordre3() {
		BigDecimal min = new BigDecimal(2);
		Object lg = getDicTotaux3().valueForKey("ORDRE_LG");
		Integer inLg = ((Double) lg).intValue();
		if (inLg.toString().equals(min.toString())) {
			return true;
		}
		gt = null;
		return false;
	}

	/**
	 * @return the hasDernierEtab
	 */
	public Boolean isHasDernierEtab() {
		return hasDernierEtab;
	}

	/**
	 * @param hasDernierEtab
	 *            the hasDernierEtab to set
	 */
	public void setHasDernierEtab(Boolean hasDernierEtab) {
		this.hasDernierEtab = hasDernierEtab;
	}

	// G�n�ration du d�tail d'une uv dans un semestre ou ann�e + addition des
	// uvs pour chaque cat�gorie
	public Boolean uvInDiplome() {
		String ss = (String) getDicParcours().valueForKey("AN_UNIV")
				+ (String) getDicParcours().valueForKey("PRD_UNIV");
		String ss_A = (String) getDicParcours().valueForKey("AN_UNIV") + "1A";
		String ss_P = (String) getDicParcours().valueForKey("AN_UNIV") + "2P";
		String dd = (String) getDicDiplome().valueForKey("DIPLOMEC");
		String cc = (String) getDicCateg1().valueForKey("LIB_ABR_CATEG");
		String key = dd + ss + cc;
		String keyG = dd + cc;
		stotalTg.put(keyG, "");
		stotal.put(key, "");
		boolean valideUv = false;
		String per = (String) getDicUv().valueForKey("PERIODE");
		String cate = (String) getDicUv().valueForKey("CATEG_ABR");
		if ((per.equals(ss) && cate.equals(cc) && (!getDicUv().valueForKey(
				//Agent de difference sur LICENCE
				"DIPLOMES").equals(StringOperation.DOCTORANT)))
				|| (per.equals(ss) || per.equals(ss_A) || per.equals(ss_P))
				&& cate.equals(cc)
				&& (getDicUv().valueForKey("DIPLOMES").equals(StringOperation.DOCTORANT))) {
			Object cr = (Object) getDicUv().valueForKey("CREDIT");
			if (!cr.toString().equals("")) {
				setTotal(getTotal() + Integer.parseInt(cr.toString()));
				setOkCateg(true);
			}
			valideUv = true;
		}
		// D�tail du total des uv pour chaque semestre ou ann�e et chaque
		// cat�gorie
		if (isOkCateg()) {
			if (getTotal() != -1) {
				stotal.put(key, getTotal());
				stotalTg.put(keyG, getTotal());
				// totalParc = totalParc + totalCateg;
				setOkParc(true);
			} else {
				stotal.put(key, "");
				stotalTg.put(keyG, "");
			}
		}
		/*
		 * String key2 = dd + ss + "TS"; if (okParc) { stotal.put(key2,
		 * totalParc); }
		 */
		return valideUv;
	}

	// Affichage du total des uvs pour chaque cat�gorie en fonction du diplome,
	// de la periode et de la categorie
	public Object totalCat() {
		String dd = (String) getDicDiplome().valueForKey("DIPLOMEC");
		String ss = (String) getDicParcours().valueForKey("AN_UNIV")
				+ (String) getDicParcours().valueForKey("PRD_UNIV");
		String c = (String) getDicCateg2().valueForKey("LIB_ABR_CATEG");
		String key = dd + ss + c;
		String categTotal = null;
		if (stotal.containsKey(key)) {
			categTotal = stotal.get(key).toString();
		}
		return categTotal;
	}

	// Affichage du total des uvs pour chaque semestre ou ann�e en fonction du
	// diplome, de la periode et de la categorie
	public Object totalPac() {
		String dd = (String) getDicDiplome().valueForKey("DIPLOMEC");
		String ss = (String) getDicParcours().valueForKey("AN_UNIV")
				+ (String) getDicParcours().valueForKey("PRD_UNIV");
		String key = "";
		//Correction du decalage sur les LP
		if(!dd.equals(StringOperation.LICENCE)) {
			key = dd + ss + "TS";			
		} else {	
			key = dd + ss + "LP";		
		}
		String pacTotal = null;
		if (stotal.containsKey(key)) {
			pacTotal = stotal.get(key).toString();
		}
		return pacTotal;
	}

	// Test de verification de soutenance
	public boolean soutenanceCond() {
		if (!getDicParcours().valueForKey("SOUTENANCE").equals("")) {
			return true;
		}
		return false;
	}

	// Test de verification de diplome
	public boolean diplnumCond() {
		if (!getDicParcours().valueForKey("DIPLOME_NUM").equals("")) {
			return true;
		}
		return false;
	}

	/**
	 * @return the hasSoutenance
	 */
	public boolean getHasSoutenance() {
		return hasSoutenance;
	}

	/**
	 * @param hasSoutenance
	 *            the hasSoutenance to set
	 */
	public void setHasSoutenance(boolean hasSoutenance) {
		this.hasSoutenance = hasSoutenance;
	}

	/**
	 * @return the hasDiplNum
	 */
	public boolean getHasDiplNum() {
		return hasDiplNum;
	}

	/**
	 * @param hasDiplNum
	 *            the hasDiplNum to set
	 */
	public void setHasDiplNum(boolean hasDiplNum) {
		this.hasDiplNum = hasDiplNum;
	}

	/**
	 * @return the isAnnee
	 */
	public Boolean getIsAnnee() {
		if (isAnnee == null)
			isAnnee = Boolean.FALSE;
		return isAnnee;
	}

	/**
	 * @param isAnnee
	 *            the isAnnee to set
	 */
	public void setIsAnnee(Boolean isAnnee) {
		this.isAnnee = isAnnee;
	}

	/**
	 * @return the isSemestre
	 */
	public Boolean getIsSemestre() {
		if (isSemestre == null)
			isSemestre = Boolean.FALSE;
		return isSemestre;
	}

	/**
	 * @param isSemestre
	 *            the isSemestre to set
	 */
	public void setIsSemestre(Boolean isSemestre) {
		this.isSemestre = isSemestre;
	}

	/**
	 * @param total1
	 *            the total1 to set
	 */
	public void setTotal1(NSMutableArray total1) {
		this.total1 = total1;
	}

	/**
	 * @return the total1
	 */
	public NSMutableArray getTotal1() {
		return total1;
	}

	/**
	 * @param totals
	 *            the totalParc to set
	 */
	public void setTotals(int totals) {
		this.totals = totals;
	}

	/**
	 * @return the totalParc
	 */
	public int getTotals() {
		return totals;
	}

	/**
	 * @param okParc
	 *            the okParc to set
	 */
	public void setOkParc(boolean okParc) {
		this.okParc = okParc;
	}

	/**
	 * @return the okParc
	 */
	public boolean isOkParc() {
		return okParc;
	}

	/**
	 * @return the okDipl
	 */
	public boolean isOkDipl() {
		return okDipl;
	}

	/**
	 * @param okDipl
	 *            the okDipl to set
	 */
	public void setOkDipl(boolean okDipl) {
		this.okDipl = okDipl;
	}

	/**
	 * @param totalCateg
	 *            the totalCateg to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * @return the totalCateg
	 */
	public int getTotal() {
		return total;
	}

	// Initialisation du calcul des totaux des uvs pour chaque diplome
	public void totalDiplInit() {
		totalg = new NSMutableDictionary();
		stotalTg = new NSMutableDictionary();
		stotal = new NSMutableDictionary();
		totalsg = 0;
		String key = getDicDiplome().valueForKey("DIPLOMEC") + "TG";
		totalg.put(key, "");
		idx = ((String) getDicDiplome().valueForKey("DIPLOMEC")).length() + 6;
		if (getDicDiplome().valueForKey("DIPLOMEC").equals("DOC")) {
			idx = ((String) getDicDiplome().valueForKey("DIPLOMEC")).length() + 5;
		}
		setOkDipl(false);
	}

	// Initialisation du total des uvs pour chaque semestre ou ann�e
	public void totalParcInit() {

		dd = (String) getDicDiplome().valueForKey("DIPLOMEC");
		ss = (String) getDicParcours().valueForKey("AN_UNIV")
				+ (String) getDicParcours().valueForKey("PRD_UNIV");
		String key = dd + ss + "TS";
		stotal.put(key, "");
		String KeyG = dd + "TS";
		stotalTg.put(KeyG, "");
		setTotals(0);
		setOkParc(false);
	}

	// Initialisation du total des uvs pour chaque cat�gorie
	public void initTotalCategs() {
		String dd = (String) getDicDiplome().valueForKey("DIPLOMEC");
		String ss = (String) getDicParcours().valueForKey("AN_UNIV")
				+ (String) getDicParcours().valueForKey("PRD_UNIV");
		String c = (String) getDicCateg1().valueForKey("LIB_ABR_CATEG");
		String key = dd + ss + c;
		String keyG = dd + c;
		if (isOkCateg()) {
			if (getTotal() != -1) {
				setTotals(getTotals() + getTotal());
				setOkParc(true);
			} else {
				stotal.put(key, "");
				stotalTg.put(keyG, "");
			}
		}
		String key2 = dd + ss + "TS";
		String key2G = dd + "TS";
		if (isOkParc()) {
			stotal.put(key2, getTotals());
			stotalTg.put(key2G, getTotals());
		}
		setTotal(0);
		setOkCateg(false);
	}

	// Calcul des totaux des uvs pour chaque cat�gories et pour chaque diplome
	public void calcul_stotalg() {
		int totals = 0;
		cc2 = (String) getDicDiplome().valueForKey("DIPLOMEC")
				+ (String) getDicCateg3().valueForKey("LIB_ABR_CATEG");
		int total = 0;
		setOkCateg2(false);
		String key = null;
		String key2 = null;
		int count = 0;
		for (int i = 0; i < stotal.allKeys().count(); i++) {
			key = (String) stotal.allKeys().objectAtIndex(i);
			key2 = (String) getDicDiplome().valueForKey("DIPLOMEC")
					+ key.substring(idx);
			totalg.put(cc2, "");
			if (key2.equals(cc2)) {
				Object cr = stotal.get(key);
				if (!cr.equals(null) && !cr.equals("")) {
					count = (Integer) cr;
					total += count;
				}
				setOkCateg2(true);
			}
		}
		if (isOkCateg2()) {
			totalg.put(cc2, total);
			totalsg += total;
			setOkDipl(true);
		}
	}

	public void totalgPrint() {
		String keyTG = (String) getDicDiplome().valueForKey("DIPLOMEC") + "TG";
		if (isOkDipl()) {
			totalg.put(keyTG, totalsg);
		}
	}

	// Test si le total de la cat�gorie contient les cl�s pour l'affichage des
	// totaux
	public Boolean has_key() {
		String key = (String) getDicDiplome().valueForKey("DIPLOMEC")
				+ (String) getDicCateg3().valueForKey("LIB_ABR_CATEG");
		if (totalg.containsKey(key)) {
			return true;
		}
		return false;
	}

	// Affichage des totaux des uv pour chaque cat�gories;
	public String tgClGet() {
		String tgCl = null;
		String key = (String) getDicDiplome().valueForKey("DIPLOMEC")
				+ (String) getDicCateg3().valueForKey("LIB_ABR_CATEG");
		if (totalg.containsKey(key)) {
			tgCl = (String) totalg.get(key).toString();
		}
		if (tgCl.equals("0")) {
			return "";
		}
		return tgCl;
	}

	// Affichage des totaux des uvs pour chaque diplome
	public String getTgTG() {
		String tgTG = null;
		String key = (String) getDicDiplome().valueForKey("DIPLOMEC") + "TG";
		if (totalg.containsKey(key)) {
			tgTG = (String) totalg.get(key).toString();
		}
		if (tgTG.equals("0")) {
			return "";
		}
		return tgTG;
	}

	/**
	 * @param okCateg
	 *            the okCateg to set
	 */
	public void setOkCateg(boolean okCateg) {
		this.okCateg = okCateg;
	}

	/**
	 * @return the okCateg
	 */
	public boolean isOkCateg() {
		return okCateg;
	}

	/**
	 * @return the okCateg2
	 */
	public boolean isOkCateg2() {
		return okCateg1;
	}

	/**
	 * @param okCateg2
	 *            the okCateg2 to set
	 */
	public void setOkCateg2(boolean okCateg2) {
		this.okCateg1 = okCateg2;
	}

	// Methode de test d'existance d'une URL
	private static boolean exists(String URLName) {
		if (timer != 200)
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

	/**
	 * // Qualifier pour le fetch sur la table ProfilTotaux private EOQualifier
	 * qualForTotaux(EOEditingContext ec, EOVueAfficherdiplome dipl) {
	 * NSMutableArray args = new NSMutableArray(); args.add(dipl.codeDiplome());
	 * args.add(dipl.debut());
	 * args.add(Long.parseLong(etudiant().primaryKey())); return
	 * EOQualifier.qualifierWithQualifierFormat(
	 * "diplomec=%@ AND prdDebut=%@ AND etuId=%@", args); }
	 * 
	 * // Param�trage du Sort pour le fetch sur la table ProfilTotaux private
	 * NSArray<EOSortOrdering> sortOrdre() { return new NSArray(new Object[] {
	 * EOSortOrdering.sortOrderingWithKey(EOProfilTotaux.ORDRE_LG_KEY,
	 * EOSortOrdering.CompareAscending), EOSortOrdering.sortOrderingWithKey(
	 * EOProfilTotaux.ORDRE_COL_KEY, EOSortOrdering.CompareDescending) }); }
	 **/

	/**
	 * @return the diplTotaux
	 */
	public Boolean isDiplTotaux() {
		return diplTotaux;
	}

	/**
	 * @param diplTotaux
	 *            the diplTotaux to set
	 */
	public void setDiplTotaux(Boolean diplTotaux) {
		this.diplTotaux = diplTotaux;
	}

	/**
	 * @return the listTotaux
	 */
	public NSArray getListTotaux() {
		return listTotaux;
	}

	/**
	 * @param listTotaux
	 *            the listTotaux to set
	 */
	public void setListTotaux(NSArray listTotaux) {
		this.listTotaux = listTotaux;
	}

	/**
	 * @return the totauxItem
	 */
	public EOProfilTotaux getTotauxItem() {
		return totauxItem;
	}

	/**
	 * @param totauxItem
	 *            the totauxItem to set
	 */
	public void setTotauxItem(EOProfilTotaux totauxItem) {
		this.totauxItem = totauxItem;
	}

	/**
	 * @return the totauxItem2
	 */
	public EOProfilTotaux getTotauxItem2() {
		return totauxItem2;
	}

	/**
	 * @param totauxItem2
	 *            the totauxItem2 to set
	 */
	public void setTotauxItem2(EOProfilTotaux totauxItem2) {
		this.totauxItem2 = totauxItem2;
	}

	/**
	 * @return the totauxItem3
	 */
	public EOProfilTotaux getTotauxItem3() {
		return totauxItem3;
	}

	/**
	 * @param totauxItem3
	 *            the totauxItem3 to set
	 */
	public void setTotauxItem3(EOProfilTotaux totauxItem3) {
		this.totauxItem3 = totauxItem3;
	}

	/**
	 * @return the isMin
	 */
	public Boolean isMin() {
		return isMin;
	}

	/**
	 * @param isMin
	 *            the isMin to set
	 */
	public void setMin(Boolean isMin) {
		this.isMin = isMin;
	}

	/**
	 * @param isMin2
	 *            the isMin2 to set
	 */
	public void setIsMin2(Boolean isMin2) {
		this.isMin2 = isMin2;
	}

	/**
	 * @return the isMin2
	 */
	public Boolean getIsMin2() {
		return isMin2;
	}

	/**
	 * @return the dispImg
	 */
	public Boolean isDispImg() {
		return dispImg;
	}

	/**
	 * @param dispImg
	 *            the dispImg to set
	 */
	public void setDispImg(Boolean dispImg) {
		this.dispImg = dispImg;
	}

	/**
	 * @param dispImg2
	 *            the dispImg2 to set
	 */
	public void setDispImg2(Boolean dispImg2) {
		this.dispImg2 = dispImg2;
	}

	/**
	 * @return the dispImg2
	 */
	public Boolean getDispImg2() {
		return dispImg2;
	}

	/**
	 * @param gt
	 *            the gt to set
	 */
	public void setGt(String gt) {
		this.gt = gt;
	}

	/**
	 * @return the gt
	 */
	public String getGt() {
		return gt;
	}

	/**
	 * @return the totalGcond
	 */
	public Boolean isTotalGcond() {
		return totalGcond;
	}

	/**
	 * @param totalGcond
	 *            the totalGcond to set
	 */
	public void setTotalGcond(Boolean totalGcond) {
		this.totalGcond = totalGcond;
	}

	/**
	 * @return the listAnnoncePcb
	 */
	public NSArray<EOParamDoetu> getListAnnoncePcb() {
		return listAnnoncePcb;
	}

	/**
	 * @param listAnnoncePcb
	 *            the listAnnoncePcb to set
	 */
	public void setListAnnoncePcb(NSArray<EOParamDoetu> listAnnoncePcb) {
		this.listAnnoncePcb = listAnnoncePcb;
	}

	/**
	 * @return the annoncePcb
	 */
	public EOParamDoetu getAnnoncePcb() {
		return annoncePcb;
	}

	/**
	 * @param annoncePcb
	 *            the annoncePcb to set
	 */
	public void setAnnoncePcb(EOParamDoetu annoncePcb) {
		this.annoncePcb = annoncePcb;
	}

	protected void funcAnoncePcb() {
		setListAnnoncePcb(EOParamDoetu.fetchAllEOParamDoetus(edc()));
		if (getListAnnoncePcb() != null && getListAnnoncePcb().count() == 1) {
			setAnnoncePcb(getListAnnoncePcb().lastObject());
		}
	}

	// Initialisation des donn�es dynamiques
	public void fetchObject() {
		if (getEtudiantActif() != null) {
			getEtudiantActif().queryBindings().setObjectForKey(getDicDiplome(),
					"dicDiplome");
			getEtudiantActif().queryBindings().setObjectForKey(
					sess().getEtudiant().primaryKey(), "numero");
		} else {
			setEtudiantActif(new WODisplayGroup());
			getEtudiantActif().queryBindings().setObjectForKey(getDicDiplome(),
					"dicDiplome");
			getEtudiantActif().queryBindings().setObjectForKey(
					sess().getEtudiant().primaryKey(), "numero");
		}

		// Fetch Legende
		setListLegende(EORefProfil.fetchLegende(edc(), (String) getDicDiplome()
				.valueForKey("DIPLOMEC")));

		// Fetch categorie
		ctrl().laCategorie();
		// Fetch uv
		ctrl().lUV();
		// Fetch du parcours
		ctrl().leParcours();
	}

	// Fin initialisation

	// Data Dictionary

	/**
	 * @return the dicEtudiant
	 */
	public NSMutableDictionary getDicEtudiant() {
		return dicEtudiant;
	}

	/**
	 * @param dicEtudiant
	 *            the dicEtudiant to set
	 */
	public void setDicEtudiant(NSMutableDictionary dicEtudiant) {
		this.dicEtudiant = dicEtudiant;
	}

	/**
	 * @return the dicDiplome
	 */
	public NSMutableDictionary getDicDiplome() {
		return dicDiplome;
	}

	/**
	 * @param dicDiplome
	 *            the dicDiplome to set
	 */
	public void setDicDiplome(NSMutableDictionary dicDiplome) {
		this.dicDiplome = dicDiplome;
	}

	/**
	 * @return the dicCateg
	 */
	public NSMutableDictionary getDicCateg() {
		return dicCateg;
	}

	/**
	 * @param dicCateg
	 *            the dicCateg to set
	 */
	public void setDicCateg(NSMutableDictionary dicCateg) {
		this.dicCateg = dicCateg;
	}

	/**
	 * @return the dicCateg1
	 */
	public NSMutableDictionary getDicCateg1() {
		return dicCateg1;
	}

	/**
	 * @param dicCateg1
	 *            the dicCateg1 to set
	 */
	public void setDicCateg1(NSMutableDictionary dicCateg1) {
		this.dicCateg1 = dicCateg1;
	}

	/**
	 * @return the dicCateg2
	 */
	public NSMutableDictionary getDicCateg2() {
		return dicCateg2;
	}

	/**
	 * @param dicCateg2
	 *            the dicCateg2 to set
	 */
	public void setDicCateg2(NSMutableDictionary dicCateg2) {
		this.dicCateg2 = dicCateg2;
	}

	/**
	 * @return the dicCateg3
	 */
	public NSMutableDictionary getDicCateg3() {
		return dicCateg3;
	}

	/**
	 * @param dicCateg3
	 *            the dicCateg3 to set
	 */
	public void setDicCateg3(NSMutableDictionary dicCateg3) {
		this.dicCateg3 = dicCateg3;
	}

	/**
	 * @return the dicCateg4
	 */
	public NSMutableDictionary getDicCateg4() {
		return dicCateg4;
	}

	/**
	 * @param dicCateg4
	 *            the dicCateg4 to set
	 */
	public void setDicCateg4(NSMutableDictionary dicCateg4) {
		this.dicCateg4 = dicCateg4;
	}

	/**
	 * @return the dicParcours
	 */
	public NSMutableDictionary getDicParcours() {
		return dicParcours;
	}

	/**
	 * @param dicParcours
	 *            the dicParcours to set
	 */
	public void setDicParcours(NSMutableDictionary dicParcours) {
		this.dicParcours = dicParcours;
	}

	/**
	 * @return the dicUv
	 */
	public NSMutableDictionary getDicUv() {
		return dicUv;
	}

	/**
	 * @param dicUv
	 *            the dicUv to set
	 */
	public void setDicUv(NSMutableDictionary dicUv) {
		this.dicUv = dicUv;
	}

	/**
	 * @return the dicUv2
	 */
	public NSMutableDictionary getDicUv2() {
		return dicUv2;
	}

	/**
	 * @param dicUv2
	 *            the dicUv2 to set
	 */
	public void setDicUv2(NSMutableDictionary dicUv2) {
		this.dicUv2 = dicUv2;
	}

	/**
	 * @return the dicTotal
	 */
	public NSMutableDictionary getDicTotal() {
		return dicTotal;
	}

	/**
	 * @param dicTotal
	 *            the dicTotal to set
	 */
	public void setDicTotal(NSMutableDictionary dicTotal) {
		this.dicTotal = dicTotal;
	}

	/**
	 * @return the dicTotaux
	 */
	public NSMutableDictionary getDicTotaux() {
		return dicTotaux;
	}

	/**
	 * @param dicTotaux
	 *            the dicTotaux to set
	 */
	public void setDicTotaux(NSMutableDictionary dicTotaux) {
		this.dicTotaux = dicTotaux;
	}

	/**
	 * @return the dicTotaux2
	 */
	public NSMutableDictionary getDicTotaux2() {
		return dicTotaux2;
	}

	/**
	 * @param dicTotaux2
	 *            the dicTotaux2 to set
	 */
	public void setDicTotaux2(NSMutableDictionary dicTotaux2) {
		this.dicTotaux2 = dicTotaux2;
	}

	/**
	 * @return the dicTotaux3
	 */
	public NSMutableDictionary getDicTotaux3() {
		return dicTotaux3;
	}

	/**
	 * @param dicTotaux3
	 *            the dicTotaux3 to set
	 */
	public void setDicTotaux3(NSMutableDictionary dicTotaux3) {
		this.dicTotaux3 = dicTotaux3;
	}

	/**
	 * @return the diplTotaux
	 */
	public Boolean getDiplTotaux() {
		return diplTotaux;
	}

	// End Data Dictionary

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

	public Integer ID() {
		Integer intId = 0;
		try {
			Double id = (Double) getDicEtudiant().valueForKey("ID_ETU");
			intId = id.intValue();
		}catch (Exception e) {
			//Nothing
		}
		return intId;
	}

	public Integer longueur() {
		Integer inLg = 0;
		try {
			Double lg = (Double) getDicEtudiant().valueForKey("LONGUEUR");
			inLg = lg.intValue();
		} catch (Exception e) {
			//Nothing
		}
		return inLg;
	}

	public Integer longueur2() {
		Integer inLg = 0;
		try {
			Double lg = (Double) getDicEtudiant().valueForKey("LONGUEUR");
			inLg = lg.intValue();
		} catch (Exception e) {
			//Nothing
		}
		return inLg;
	}

	public boolean browser() {
		if (mySession().browser().isIPad() || mySession().browser().isIPhone()
				|| mySession().browser().isUnknownPlatform()
				|| mySession().browser().isLinux())
			NSLog.out.appendln("Plateforme : "
					+ mySession().browser().platform());
		return mySession().browser().isIPad()
				|| mySession().browser().isIPhone()
				|| mySession().browser().isUnknownPlatform()
				|| mySession().browser().isLinux();
	}
}
