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
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.internal.matchers.StringContains;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;
import com.webobjects.eoaccess.EODatabaseDataSource;
import com.webobjects.eocontrol.EOAndQualifier;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.eocontrol.EOKeyGlobalID;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.eocontrol._EOIntegralKeyGlobalID;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation.NSTimestamp;

import etudiants.utt.fr.components.controlers.RechercheCtrl;
import etudiants.utt.fr.eo.EOEtudiant;
import etudiants.utt.fr.eo.EOEtudiantInscrAdm;
import etudiants.utt.fr.eo.EOIndEmail;
import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.eo.EOParamPeriode;
import etudiants.utt.fr.eo.EOVueAfficherparcours;
import etudiants.utt.fr.eo.EOVueDiplnoprd;
import etudiants.utt.fr.eo.EOVueDiplwithprd;
import etudiants.utt.fr.eo.EOVueNivAdm;
import etudiants.utt.fr.eo.EOVuePeriodeParam;
import etudiants.utt.fr.eo.EOVueSpecMast;
import etudiants.utt.fr.eo._EOEtudiant;
import etudiants.utt.fr.server.Application;
import etudiants.utt.fr.server.MyAjaxComponent;
import etudiants.utt.fr.server.ProfilHelpers;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.server.process.ProcessGestionRechercheEtudiants;
import gestionuv.utt.fr.eo.EOEtuMineur;
import gestionuv.utt.fr.eo.EOUvOuv;
import gestionuv.utt.fr.eo.EOUvOuvertes;
import gestionuv.utt.fr.eo.EOVueUvsPeriode;
import er.extensions.appserver.ERXDisplayGroup;
import er.extensions.batching.ERXBatchingDisplayGroup;
import er.extensions.eof.ERXEC;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

@SuppressWarnings("all")
public class Recherche extends MyAjaxComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5759244436325196963L;
	private String onload = null;
	private static final Logger Log = Logger.getLogger(Recherche.class);
	public static final Integer DEFAULT_fetchLimit = Integer.valueOf(30);
	public static final Integer DEFAULT_DISPLAY = Integer.valueOf(10);
	public static String ANUNIV = null;
	public static String PRDUNIV = null;
	public static String IMG_SERVER;
	public static String IMG_DIR;
	public static int timer = 200;
	public static ProcessGestionRechercheEtudiants gestEtu;
	private Boolean isOpenFenetreException = Boolean.FALSE;
	// public Session session = (Session)session();
	// public EOEditingContext ed = ERXEC.newEditingContext();
	private RechercheCtrl controleur;
	private String searchMsg;

	// Info combobox
	// periode
	private NSArray<EOVuePeriodeParam> periodes;
	private EOVuePeriodeParam currentPeriode;
	private EOVuePeriodeParam selectedPeriode;
	private EOParamPeriode paramPrd;
	// Diplomes
	private NSArray<EOVueDiplnoprd> diplomes;
	private EOVueDiplnoprd currentDiplome;
	private EOVueDiplnoprd selectedDiplome;

	private NSArray<EOVueDiplwithprd> prdDiplome;
	private EOVueDiplwithprd currentPrdDiplome;
	private EOVueDiplwithprd selectedPrdDiplome;
	// Niveaux
	private NSArray<EOVueNivAdm> niveaux;
	private EOVueNivAdm currentNiveaux;
	private EOVueNivAdm selectedNiveaux;

	private NSArray<EOVueSpecMast> niveauxMast;
	private EOVueSpecMast currentNiveauMst;
	private EOVueSpecMast selectedNiveauMst;
	// UV
	private NSArray<EOUvOuv> uvOuvertes;
	private EOUvOuv currentUvouverte;
	private EOUvOuv selectedUvOuverte;

	private static String message;

	// champs nom prenom numero
	private String nom;
	private String prenom;
	private String numero;
	private Integer nbEtudiant;
	// regroupement de tous les bouleens
	private Boolean noResult = false;
	private Boolean foundResults;
	public Boolean nivoVisible = true;
	public Boolean diplomeVisible = true;
	private Boolean hasmineur;
	private Boolean hasParcours;
	private Boolean hasDiplome = false;
	private Boolean hasSituation;

	// Affichage des etudiants
	private NSArray<EOUvOuvertes> individuList;
	private EOUvOuvertes etudiant;
	private NSDictionary etudiantList;
	private EOIndividu etudiants;
	private NSMutableDictionary students = new NSMutableDictionary();

	// Affichage des parcours
	private NSArray<EOVueAfficherparcours> parcoursList;
	private EOVueAfficherparcours parcours;

	// Affichage des mineurs
	public NSArray<EOEtuMineur> mineurList;
	public EOEtuMineur vMineur;
	private String mineurs;
	private WODisplayGroup voirEtudiantsDg;
	private EOIndEmail email;
	private NSArray<EOParamPeriode> dgUv;
	public String mail = null;

	/**
	 * @param context
	 */
	public Recherche(WOContext context) {
		super(context);
		NSLog.out.appendln("Recherche");
		// gestEtu = new ProcessGestionRechercheEtudiants();
		// session.setRetourAlaListe(false);
		IMG_SERVER = myApp().imgServer();
		IMG_DIR = myApp().repPhoto();
		controleur = new RechercheCtrl(this);
		message = null;
		// EODatabaseDataSource ds = new EODatabaseDataSource(ed,
		// EOIndividu.ENTITY_NAME);
		setVoirEtudiantsDg(new WODisplayGroup());
		// voirEtudiantsDg.setMasterObject(etudiants);
		// voirEtudiantsDg.setNumberOfObjectsPerBatch(10);
		// voirEtudiantsDg.setDataSource(ds);
		comboBoxPeriode();
		comboxDiplome(selectedPeriode);
		comboxNiveau(selectedPrdDiplome, selectedDiplome, selectedPeriode);
		comboxUv(selectedPeriode);
		controleur.isRetouraLaListe();
	}

	/**
	 * @return the onload
	 */
	public String getOnload() {
		return onload;
	}

	/**
	 * @param onload
	 *            the onload to set
	 */
	public void setOnload(String onload) {
		this.onload = onload;
	}

	public void appendToResponse(WOResponse res, WOContext ctx) {
		super.appendToResponse(res, ctx);
		if (onload != null)
			onload = null;
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
	 * @return the controleur
	 */
	public RechercheCtrl getControleur() {
		return controleur;
	}

	/**
	 * @param controleur
	 *            the controleur to set
	 */
	public void setControleur(RechercheCtrl controleur) {
		this.controleur = controleur;
	}

	/**
	 * Using by WOPopUpButton to refresh data dilpome, niveau and Uv OnChange
	 * 
	 * 
	 */
	public WOActionResults changeDiplome() {
		// NSLog.out.appendln(selectedDiplome);
		setNom(null);
		setPrenom(null);
		setNumero(null);
		comboxDiplome(selectedPeriode);
		return null;
	}

	public WOActionResults changeNiveau() {
		// NSLog.out.appendln(selectedDiplome);
		setNom(null);
		setPrenom(null);
		setNumero(null);
		comboxNiveau(selectedPrdDiplome, selectedDiplome, selectedPeriode);
		return null;
	}

	public WOActionResults changeUv() {
		// NSLog.out.appendln(selectedDiplome);
		setNom(null);
		setPrenom(null);
		setNumero(null);
		comboxUv(selectedPeriode);
		return null;
	}

	// END

	/**
	 * @return the etudiantList
	 */
	@SuppressWarnings("rawtypes")
	public NSDictionary getEtudiantList() {
		return etudiantList;
	}

	/**
	 * @param etudiantList
	 *            the etudiantList to set
	 */
	@SuppressWarnings("rawtypes")
	public void setEtudiantList(NSDictionary etudiantList) {
		this.etudiantList = etudiantList;
	}

	/**
	 * @return the etudiants
	 */
	public EOIndividu getEtudiants() {
		return etudiants;
	}

	/**
	 * @param etudiants
	 *            the etudiants to set
	 */
	public void setEtudiants(EOIndividu etudiants) {
		this.etudiants = etudiants;
	}

	/**
	 * @return the voirEtudiantsDg
	 */
	public WODisplayGroup getVoirEtudiantsDg() {
		return voirEtudiantsDg;
	}

	/**
	 * @param voirEtudiantsDg
	 *            the voirEtudiantsDg to set
	 */
	public void setVoirEtudiantsDg(WODisplayGroup voirEtudiantsDg) {
		this.voirEtudiantsDg = voirEtudiantsDg;
	}

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
	 * @return the vMineur
	 */
	public EOEtuMineur getvMineur() {
		return vMineur;
	}

	/**
	 * @return the mineurs
	 */
	public String getMineurs() {
		return mineurs;
	}

	/**
	 * @param mineurs
	 *            the mineurs to set
	 */
	public void setMineurs(String mineurs) {
		this.mineurs = mineurs;
	}

	/**
	 * @return the parcoursList
	 */
	public NSArray<EOVueAfficherparcours> getParcoursList() {
		return parcoursList;
	}

	/**
	 * @param parcoursList
	 *            the parcoursList to set
	 */
	public void setParcoursList(NSArray<EOVueAfficherparcours> parcoursList) {
		this.parcoursList = parcoursList;
	}

	/**
	 * @return the etudiant
	 */
	public EOUvOuvertes getEtudiant() {
		return etudiant;
	}

	/**
	 * @param etudiant
	 *            the etudiant to set
	 */
	public void setEtudiant(EOUvOuvertes etudiant) {
		this.etudiant = etudiant;
	}

	/**
	 * @return the individuList
	 */
	public NSArray<EOUvOuvertes> getIndividuList() {
		return individuList;
	}

	/**
	 * @param individuList
	 *            the individuList to set
	 */
	public void setIndividuList(NSArray<EOUvOuvertes> individuList) {
		this.individuList = individuList;
	}

	/**
	 * @return the foundResults
	 */
	public Boolean getFoundResults() {
		return foundResults;
	}

	/**
	 * @param foundResults
	 *            the foundResults to set
	 */
	public void setFoundResults(Boolean foundResults) {
		this.foundResults = foundResults;
	}

	/**
	 * @return the periodes
	 */
	public NSArray<EOVuePeriodeParam> getPeriodes() {
		return periodes;
	}

	/**
	 * @param periodes
	 *            the periodes to set
	 */
	public void setPeriodes(NSArray<EOVuePeriodeParam> periodes) {
		this.periodes = periodes;
	}

	/**
	 * @return the currentPeriode
	 */
	public EOVuePeriodeParam getCurrentPeriode() {
		return currentPeriode;
	}

	/**
	 * @param currentPeriode
	 *            the currentPeriode to set
	 */
	public void setCurrentPeriode(EOVuePeriodeParam currentPeriode) {
		this.currentPeriode = currentPeriode;
	}

	/**
	 * @return the selectedPeriode
	 */
	public EOVuePeriodeParam getSelectedPeriode() {
		return selectedPeriode;
	}

	/**
	 * @param selectedPeriode
	 *            the selectedPeriode to set
	 */
	public void setSelectedPeriode(EOVuePeriodeParam selectedPeriode) {
		this.selectedPeriode = selectedPeriode;
	}

	/**
	 * @return the paramPrd
	 */
	public EOParamPeriode getParamPrd() {
		return paramPrd;
	}

	/**
	 * @param paramPrd
	 *            the paramPrd to set
	 */
	public void setParamPrd(EOParamPeriode paramPrd) {
		this.paramPrd = paramPrd;
	}

	/**
	 * @return the diplomes
	 */
	public NSArray<EOVueDiplnoprd> getDiplomes() {
		return diplomes;
	}

	/**
	 * @param diplomes
	 *            the diplomes to set
	 */
	public void setDiplomes(NSArray<EOVueDiplnoprd> diplomes) {
		this.diplomes = diplomes;
	}

	/**
	 * @return the currentDiplome
	 */
	public EOVueDiplnoprd getCurrentDiplome() {
		return currentDiplome;
	}

	/**
	 * @param currentDiplome
	 *            the currentDiplome to set
	 */
	public void setCurrentDiplome(EOVueDiplnoprd currentDiplome) {
		this.currentDiplome = currentDiplome;
	}

	/**
	 * @return the selectedDiplome
	 */
	public EOVueDiplnoprd getSelectedDiplome() {
		return selectedDiplome;
	}

	/**
	 * @param selectedDiplome
	 *            the selectedDiplome to set
	 */
	public void setSelectedDiplome(EOVueDiplnoprd selectedDiplome) {
		this.selectedDiplome = selectedDiplome;
	}

	/**
	 * @return the prdDiplome
	 */
	public NSArray<EOVueDiplwithprd> getPrdDiplome() {
		return prdDiplome;
	}

	/**
	 * @param prdDiplome
	 *            the prdDiplome to set
	 */
	public void setPrdDiplome(NSArray<EOVueDiplwithprd> prdDiplome) {
		this.prdDiplome = prdDiplome;
	}

	/**
	 * @return the currentPrdDiplome
	 */
	public EOVueDiplwithprd getCurrentPrdDiplome() {
		return currentPrdDiplome;
	}

	/**
	 * @param currentPrdDiplome
	 *            the currentPrdDiplome to set
	 */
	public void setCurrentPrdDiplome(EOVueDiplwithprd currentPrdDiplome) {
		this.currentPrdDiplome = currentPrdDiplome;
	}

	/**
	 * @return the selectedPrdDiplome
	 */
	public EOVueDiplwithprd getSelectedPrdDiplome() {
		return selectedPrdDiplome;
	}

	/**
	 * @param selectedPrdDiplome
	 *            the selectedPrdDiplome to set
	 */
	public void setSelectedPrdDiplome(EOVueDiplwithprd selectedPrdDiplome) {
		this.selectedPrdDiplome = selectedPrdDiplome;
	}

	/**
	 * @return the niveaux
	 */
	public NSArray<EOVueNivAdm> getNiveaux() {
		return niveaux;
	}

	/**
	 * @param niveaux
	 *            the niveaux to set
	 */
	public void setNiveaux(NSArray<EOVueNivAdm> niveaux) {
		this.niveaux = niveaux;
	}

	/**
	 * @return the currentNiveaux
	 */
	public EOVueNivAdm getCurrentNiveaux() {
		return currentNiveaux;
	}

	/**
	 * @param currentNiveaux
	 *            the currentNiveaux to set
	 */
	public void setCurrentNiveaux(EOVueNivAdm currentNiveaux) {
		this.currentNiveaux = currentNiveaux;
	}

	/**
	 * @return the selectedNiveeaux
	 */
	public EOVueNivAdm getSelectedNiveaux() {
		return selectedNiveaux;
	}

	/**
	 * @param selectedNiveeaux
	 *            the selectedNiveeaux to set
	 */
	public void setSelectedNiveaux(EOVueNivAdm selectedNiveaux) {
		this.selectedNiveaux = selectedNiveaux;
	}

	/**
	 * @return the niveauxMast
	 */
	public NSArray<EOVueSpecMast> getNiveauxMast() {
		return niveauxMast;
	}

	/**
	 * @param niveauxMast
	 *            the niveauxMast to set
	 */
	public void setNiveauxMast(NSArray<EOVueSpecMast> niveauxMast) {
		this.niveauxMast = niveauxMast;
	}

	/**
	 * @return the currentNiveauMst
	 */
	public EOVueSpecMast getCurrentNiveauMst() {
		return currentNiveauMst;
	}

	/**
	 * @param currentNiveauMst
	 *            the currentNiveauMst to set
	 */
	public void setCurrentNiveauMst(EOVueSpecMast currentNiveauMst) {
		this.currentNiveauMst = currentNiveauMst;
	}

	/**
	 * @return the selectedNiveauMst
	 */
	public EOVueSpecMast getSelectedNiveauMst() {
		return selectedNiveauMst;
	}

	/**
	 * @param selectedNiveauMst
	 *            the selectedNiveauMst to set
	 */
	public void setSelectedNiveauMst(EOVueSpecMast selectedNiveauMst) {
		this.selectedNiveauMst = selectedNiveauMst;
	}

	/**
	 * @return the uvOuvertes
	 */
	public NSArray<EOUvOuv> getUvOuvertes() {
		return uvOuvertes;
	}

	/**
	 * @param uvOuvertes
	 *            the uvOuvertes to set
	 */
	public void setUvOuvertes(NSArray<EOUvOuv> uvOuvertes) {
		this.uvOuvertes = uvOuvertes;
	}

	/**
	 * @return the currentUvouverte
	 */
	public EOUvOuv getCurrentUvouverte() {
		return currentUvouverte;
	}

	/**
	 * @param currentUvouverte
	 *            the currentUvouverte to set
	 */
	public void setCurrentUvouverte(EOUvOuv currentUvouverte) {
		this.currentUvouverte = currentUvouverte;
	}

	/**
	 * @return the selectedUvOuverte
	 */
	public EOUvOuv getSelectedUvOuverte() {
		return selectedUvOuverte;
	}

	/**
	 * @param selectedUvOuverte
	 *            the selectedUvOuverte to set
	 */
	public void setSelectedUvOuverte(EOUvOuv selectedUvOuverte) {
		this.selectedUvOuverte = selectedUvOuverte;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		if (nom != null) {
			nom = nom.trim();
		}
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
	public String getPrenom() {
		if (prenom != null) {
			prenom = prenom.trim();
		}
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the nbEtudiant
	 */
	public Integer getNbEtudiant() {
		return nbEtudiant;
	}

	/**
	 * @param nbEtudiant
	 *            the nbEtudiant to set
	 */
	public void setNbEtudiant(Integer nbEtudiant) {
		this.nbEtudiant = nbEtudiant;
	}

	/**
	 * @return the noResult
	 */
	public Boolean getNoResult() {
		return noResult;
	}

	/**
	 * @param noResult
	 *            the noResult to set
	 */
	public void setNoResult(Boolean noResult) {
		this.noResult = noResult;
	}

	/**
	 * @return the hasmineur
	 */
	public Boolean getHasmineur() {
		return hasmineur;
	}

	/**
	 * @param hasmineur
	 *            the hasmineur to set
	 */
	public void setHasmineur(Boolean hasmineur) {
		this.hasmineur = hasmineur;
	}

	/**
	 * @return the hasParcours
	 */
	public Boolean isHasParcours() {
		return hasParcours;
	}

	/**
	 * @param hasParcours
	 *            the hasParcours to set
	 */
	public void setHasParcours(Boolean hasParcours) {
		this.hasParcours = hasParcours;
	}

	/**
	 * @return the hasDiplome
	 */
	public Boolean isHasDiplome() {
		return hasDiplome;
	}

	/**
	 * @param hasDiplome
	 *            the hasDiplome to set
	 */
	public void setHasDiplome(Boolean hasDiplome) {
		this.hasDiplome = hasDiplome;
	}

	/**
	 * @return the hasSituation
	 */
	public Boolean isHasSituation() {
		return hasSituation;
	}

	/**
	 * @param hasSituation
	 *            the hasSituation to set
	 */
	public void setHasSituation(Boolean hasSituation) {
		this.hasSituation = hasSituation;
	}

	/**
	 * @return the searchMsg
	 */
	public String getSearchMsg() {
		return searchMsg;
	}

	/**
	 * @param searchMsg
	 *            the searchMsg to set
	 */
	public void setSearchMsg(String searchMsg) {
		this.searchMsg = searchMsg;
	}

	/** Remplissage du combox periode à l'aide de la vue VUE_PERIODE_PARAM */
	@SuppressWarnings("unchecked")
	protected NSArray<EOVuePeriodeParam> comboBoxPeriode() {
		selectedPeriode = null;
		selectedDiplome = null;
		selectedPrdDiplome = null;
		selectedNiveauMst = null;
		selectedNiveaux = null;
		NSArray OrdreSort = new NSArray(new Object[] {
				EOSortOrdering.sortOrderingWithKey(EOVuePeriodeParam.ORDRE_KEY,
						EOSortOrdering.CompareAscending),
				EOSortOrdering.sortOrderingWithKey(EOVuePeriodeParam.ID_KEY,
						EOSortOrdering.CompareDescending) });
		periodes = EOVuePeriodeParam.fetchAllEOVuePeriodeParams(edc(),
				OrdreSort);
		//RN 09/07/2014 Correction javaNullpointerException
		mySession().setPeriodeCourante((NSMutableDictionary)
		 gestEtu.selectRawRowPeriodeCourante(edc()).objectAtIndex(0));
		String annUnivPrdUniv = (String) mySession().getPeriodeCourante()
				.valueForKey("PERIODE");
		for (int i = 0; periodes.count() > i; i++) {
			if (periodes.objectAtIndex(i).primaryKey().equals(annUnivPrdUniv)) {
				selectedPeriode = periodes.objectAtIndex(i);
				break;
			}
		}
		return periodes;
	}

	/** Remplissage des comboxes diplome à l'aide de la vue VUE_DIPLOME_PRDPARAM */
	protected NSArray comboxDiplome(EOVuePeriodeParam periode) {
		selectedDiplome = null;
		selectedPrdDiplome = null;
		selectedNiveauMst = null;
		selectedNiveaux = null;
		if (periode == null) {
			diplomes = EOVueDiplnoprd.fetchAllEOVueDiplnoprds(edc());
			diplomeVisible = true;
			prdDiplome = null;
			// selectedDiplome = diplomes.lastObject();
		} else {
			prdDiplome = EOVueDiplwithprd.fetchListDiplome(edc(),
					periode.primaryKey());
			diplomeVisible = false;
			// selectedPrdDiplome = prdDiplome.objectAtIndex(0);
			diplomes = null;
			return prdDiplome;
		}
		return diplomes;
	}

	/**
	 * Remplissage du comboxbox niveau depuis la VUE_NIV_ADM, VUE_SPEC_MST
	 * influencée par VUE_DIPLOME_PRDPARAM et VUE_PERIODE_PARAM
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected NSArray comboxNiveau(EOVueDiplwithprd diplomPrd,
			EOVueDiplnoprd diplomNoPrd, EOVuePeriodeParam periode) {
		Object diplome = null;
		if (diplomPrd == null) {
			diplome = diplomNoPrd;
		} else {
			diplome = diplomPrd;
		}
		NSArray titeList = new NSArray();
		NSMutableArray listKey = new NSMutableArray();
		NSMutableArray listAdd = new NSMutableArray();
		NSArray<EOSortOrdering> niveauOrderings = new NSArray<EOSortOrdering>(
				new EOSortOrdering(EOVueNivAdm.ORDRE_KEY,
						EOSortOrdering.CompareAscending));
		NSArray MstSort = new NSArray(new Object[] {
				EOSortOrdering.sortOrderingWithKey(EOVueSpecMast.ORDRE_KEY,
						EOSortOrdering.CompareAscending),
				EOSortOrdering.sortOrderingWithKey(EOVueSpecMast.ID_KEY,
						EOSortOrdering.CompareDescending) });
		EOVueNivAdm virtual = new EOVueNivAdm();
		// Affichage de tous les niveaux
		if (diplomPrd == null && periode == null && diplomNoPrd == null) {
			titeList = EOVueNivAdm.fetchAllEOVueNivAdms(edc(), niveauOrderings);
			for (int i = 0; i < titeList.count(); i++) {
				virtual = (EOVueNivAdm) titeList.objectAtIndex(i);
				if (listKey != null && !listKey.contains(virtual.primaryKey())) {
					listKey.addObject(virtual.primaryKey());
					listAdd.addObject(virtual);
				}
			}
			niveaux = listAdd.mutableClone();
			NSLog.out.appendln("Liste Niveaux:" + niveaux.count());
			nivoVisible = true;
		} else if (periode == null && diplomPrd == null && diplomNoPrd != null) {
			// Afficher toutes les niveaux ayant pour ID le diplome
			// selectionnée
			EOQualifier qual = EOQualifier.qualifierWithQualifierFormat(
					"pdiplome=%@", new NSArray(diplomNoPrd.primaryKey()));
			niveaux = EOVueNivAdm.fetchEOVueNivAdms(edc(), qual,
					niveauOrderings);
			nivoVisible = true;
		}
		if (periode != null
				&& (diplomPrd != null && diplomPrd.primaryKey().equals("MST"))
				&& diplomNoPrd == null) {
			NSMutableArray qual = new NSMutableArray();
			qual.addObject(EOQualifier.qualifierWithQualifierFormat(
					"pdiplome=%@", new NSArray(diplomPrd.primaryKey())));
			qual.addObject(EOQualifier.qualifierWithQualifierFormat(
					"pperiode=%@", new NSArray(periode.id())));
			niveauxMast = EOVueSpecMast.fetchEOVueSpecMasts(edc(),
					new EOAndQualifier(qual), MstSort);
			nivoVisible = false;
			return niveauxMast;
		} else if (periode != null && diplomPrd != null && diplomNoPrd == null) {
			NSMutableArray qual = new NSMutableArray();
			qual.addObject(EOQualifier.qualifierWithQualifierFormat(
					"pdiplome=%@", new NSArray(diplomPrd.primaryKey())));
			qual.addObject(EOQualifier.qualifierWithQualifierFormat(
					"pperiode=%@", new NSArray(periode.id())));
			niveaux = EOVueNivAdm.fetchEOVueNivAdms(edc(), new EOAndQualifier(
					qual), niveauOrderings);
			nivoVisible = true;
		} else if (periode != null && diplomPrd == null && diplomNoPrd == null) {
			NSMutableArray qual = new NSMutableArray();
			niveaux = EOVueNivAdm.fetchEOVueNivAdms(edc(), EOQualifier
					.qualifierWithQualifierFormat("pperiode=%@", new NSArray(
							periode.id())), niveauOrderings);
			nivoVisible = true;
		}
		return niveaux;
	}

	/**
	 * 
	 * @param periode
	 * @return
	 */
	protected NSArray<EOUvOuv> comboxUv(EOVuePeriodeParam periode) {
		EOParamPeriode dicPeriode = new EOParamPeriode();
		dgUv = EOParamPeriode.fetchPeriodeCourante(edc());
		for (int i = 0; i < dgUv.count(); i++) {
			dicPeriode = dgUv.objectAtIndex(i);
		}
		String anUniv = dicPeriode.anUniv();
		String prdUniv = dicPeriode.prdUniv();
		if (periode == null) {
			uvOuvertes = EOUvOuv.fetchListUvPeriode(edc(), anUniv, prdUniv);
		} else {
			int y = periode.primaryKey().length();
			if (y == 5) {
				ANUNIV = periode.primaryKey().substring(0, y - 1);
				PRDUNIV = periode.primaryKey().substring(y - 1, y);
			}
			if (y == 6) {
				ANUNIV = periode.primaryKey().substring(0, y - 2);
				PRDUNIV = periode.primaryKey().substring(y - 2, y);
			}
			uvOuvertes = EOUvOuv.fetchListUvPeriode(edc(), ANUNIV, PRDUNIV);
		}
		return uvOuvertes;

	}

	public String mailTo() {
		return "mailto:" + mail;
	}

	/**
	 * @return the email
	 */
	public EOIndEmail getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(EOIndEmail email) {
		this.email = email;
	}

	/**
	 * @return the droitImage
	 */
	public String droitImage() {
		String imageURL = null;
		EOEtudiant study = null;
		// String droitImages = (String)
		// etudiantList.valueForKey("DROIT_IMAGE");
		// Récupération de l'id de l'étudiant afin d'afficher sa photo

		// String pkey = etudiantsKey.primaryKey();
		Long pk = Long.valueOf(etudiants.primaryKey());
		NSArray<EOEtudiant> droitImage = etudiants.etudiants1();
		EOEtudiant droitImages = droitImage.lastObject();
		imageURL = "image/default.jpg";
		if (droitImages != null) {
			/*
			 * if (droitImages.droitImageAccord$f() == null ||
			 * droitImages.droitImageAccord$f().equals("O")) {
			 */
			imageURL = IMG_SERVER + IMG_DIR + pk + ".jpg";
			if (!exists(imageURL)) {
				imageURL = "image/default.jpg";
			}
		}
		return imageURL;
	}

	public String mailEtudiants() {
		String cmineur = "";
		String utt = null;
		EOIndEmail maily = null;
		mail = "";
		int j = 0;
		// Long pk = Long.valueOf(etudiants.primaryKey());
		// Affichage du mineur
		mineurList = etudiants.mineurs(
				EOEtuMineur.MIN_RESC.eq("ADM").or(
						EOEtuMineur.MIN_RESC.eq("MEN")), true);
		if (mineurList.count() != 0) {
			hasmineur = true;
			for (int i = 0; i < mineurList.count(); i++) {
				cmineur = cmineur
						+ mineurList.objectAtIndex(i).mineurc().toString()
						+ ", ";
				// NSLog.out.appendln(cmineur);
			}
			cmineur = cmineur.substring(0, cmineur.length() - 2);
			mineurs = cmineur;
		} else {
			hasmineur = false;
		}
		// Affichage du parcours d'un étudiant
		if (etudiants != null) {
			NSArray listParc = etudiants.eoVueAfficherparcourses();
			NSMutableArray tstList = new NSMutableArray();
			for (int i = 0; i < listParc.count(); i++) {
				if (tstList != null
						&& !tstList.contains(listParc.objectAtIndex(i))) {
					tstList.addObject(listParc.objectAtIndex(i));
				}
			}
			setParcoursList(tstList.mutableClone());
			if (parcoursList.count() != 0) {
				hasParcours = true;
			} else {
				hasParcours = false;
			}
			NSArray<EOIndEmail> mailList = etudiants
					.indEmails(EOIndEmail.EMAIL_TYPEC.eq("UTT"));
			if (mailList.count() > 0) {
				mail = mailList.lastObject().indEmail();
			}
		}
		return mail;
	}

	public boolean diplomeInParcours() {
		if (parcours.numDiplome() == null) {
			return false;
		}
		return true;
	}

	public boolean situationInParcours() {
		if (parcours.situation() == null) {
			return false;
		}
		return true;
	}

	/**
	 * @return the parcours
	 */
	public EOVueAfficherparcours parcours() {
		return parcours;
	}

	/**
	 * @param parcours
	 *            the parcours to set
	 */
	public void setParcours(EOVueAfficherparcours parcours) {
		this.parcours = parcours;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public static boolean exists(String URLName) {
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

	private static boolean isNumeric(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			message = "Veuillez indiquer un numéro valide.";
			return false;
		}
	}

	/**
	 * @return the dgUv
	 */
	public NSArray<EOParamPeriode> getDgUv() {
		return dgUv;
	}

	/**
	 * @param dgUv
	 *            the dgUv to set
	 */
	public void setDgUv(NSArray<EOParamPeriode> dgUv) {
		this.dgUv = dgUv;
	}

	public static boolean stringContains(String str, String searchStr) {
		if (str == null || searchStr == null) {
			return false;
		}
		return str.indexOf(searchStr) >= 0;
	}

	/**
	 * @return the students
	 */
	public NSMutableDictionary getStudents() {
		return students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(NSMutableDictionary students) {
		this.students = students;
	}

	public boolean browser() {
		if(mySession().browser().isIPad()
				|| mySession().browser().isIPhone()
				|| mySession().browser().isUnknownPlatform()
				|| mySession().browser().isLinux())
			NSLog.out.appendln("Plateforme : " + mySession().browser().platform());
		return mySession().browser().isIPad()
				|| mySession().browser().isIPhone()
				|| mySession().browser().isUnknownPlatform()
				|| mySession().browser().isLinux();
	}
}
