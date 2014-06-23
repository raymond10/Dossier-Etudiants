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
// DO NOT EDIT.  Make changes to EOEtudiant.java instead.
package etudiants.utt.fr.eo;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _EOEtudiant extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOEtudiant";

  // Attribute Keys
  public static final ERXKey<String> AN_PREC_SITUC = new ERXKey<String>("anPrecSituc");
  public static final ERXKey<String> AUTEUR_MAJ = new ERXKey<String>("auteurMaj");
  public static final ERXKey<String> BAC_ACADEMIEC = new ERXKey<String>("bacAcademiec");
  public static final ERXKey<String> BAC_AN = new ERXKey<String>("bacAn");
  public static final ERXKey<String> BAC_DEPTC = new ERXKey<String>("bacDeptc");
  public static final ERXKey<String> BAC_ETAB = new ERXKey<String>("bacEtab");
  public static final ERXKey<String> BAC_MENTION = new ERXKey<String>("bacMention");
  public static final ERXKey<String> BAC_PAYSC = new ERXKey<String>("bacPaysc");
  public static final ERXKey<String> BAC_SERIEC = new ERXKey<String>("bacSeriec");
  public static final ERXKey<String> BAC_VILLE = new ERXKey<String>("bacVille");
  public static final ERXKey<String> BDEF = new ERXKey<String>("bdef");
  public static final ERXKey<NSTimestamp> CHARTE_INFO_DATE = new ERXKey<NSTimestamp>("charteInfoDate");
  public static final ERXKey<Long> CONSEILLER_ID = new ERXKey<Long>("conseillerId");
  public static final ERXKey<NSTimestamp> CRE_DATE = new ERXKey<NSTimestamp>("creDate");
  public static final ERXKey<String> DIPL_OBT_AN = new ERXKey<String>("diplObtAn");
  public static final ERXKey<String> DIPL_OBTC = new ERXKey<String>("diplObtc");
  public static final ERXKey<String> DIPL_OBT_ETAB = new ERXKey<String>("diplObtEtab");
  public static final ERXKey<String> DIPL_OBT_LIB = new ERXKey<String>("diplObtLib");
  public static final ERXKey<String> DROIT_IMAGE_ACCORD$F = new ERXKey<String>("droitImageAccord$f");
  public static final ERXKey<NSTimestamp> DROIT_IMAGE_ACCORD_DATE = new ERXKey<NSTimestamp>("droitImageAccordDate");
  public static final ERXKey<String> ENS_SUP_PREM_AN = new ERXKey<String>("ensSupPremAn");
  public static final ERXKey<NSTimestamp> IMPORT_DATE = new ERXKey<NSTimestamp>("importDate");
  public static final ERXKey<Long> INDIV_ID = new ERXKey<Long>("indivId");
  public static final ERXKey<String> INE = new ERXKey<String>("ine");
  public static final ERXKey<String> INE_PROVISF = new ERXKey<String>("ineProvisf");
  public static final ERXKey<String> INE_RE_IMMATF = new ERXKey<String>("ineReImmatf");
  public static final ERXKey<String> LANGUE_MAT = new ERXKey<String>("langueMat");
  public static final ERXKey<NSTimestamp> MODIF_DATE = new ERXKey<NSTimestamp>("modifDate");
  public static final ERXKey<String> PCS_PARENT2C = new ERXKey<String>("pcsParent2c");
  public static final ERXKey<String> PCS_PARENTC = new ERXKey<String>("pcsParentc");
  public static final ERXKey<NSTimestamp> RESP_C_DATE_DEBUT = new ERXKey<NSTimestamp>("respCDateDebut");
  public static final ERXKey<NSTimestamp> RESP_C_DATE_FIN = new ERXKey<NSTimestamp>("respCDateFin");
  public static final ERXKey<String> RESP_CIVC = new ERXKey<String>("respCivc");
  public static final ERXKey<NSTimestamp> RESP_CIV_FIN_DATE = new ERXKey<NSTimestamp>("respCivFinDate");
  public static final ERXKey<String> RESP_CIV_STGI = new ERXKey<String>("respCivStgi");
  public static final ERXKey<String> SPORTC = new ERXKey<String>("sportc");
  public static final ERXKey<String> TITRE_SEJC = new ERXKey<String>("titreSejc");
  public static final ERXKey<String> TITRE_SEJ_COMMENT = new ERXKey<String>("titreSejComment");
  public static final ERXKey<NSTimestamp> TITRE_SEJ_FIN_DATE = new ERXKey<NSTimestamp>("titreSejFinDate");
  public static final ERXKey<NSTimestamp> TRANS_DOSSIER_DATE = new ERXKey<NSTimestamp>("transDossierDate");
  public static final ERXKey<String> TRANS_DOSSIER_LIEU = new ERXKey<String>("transDossierLieu");
  public static final ERXKey<String> UNIV_INS_PREM_AN = new ERXKey<String>("univInsPremAn");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm> ETU_INSCR_ADMS = new ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm>("etuInscrAdms");
  public static final ERXKey<etudiants.utt.fr.eo.EOIndividu> INDIVIDU0 = new ERXKey<etudiants.utt.fr.eo.EOIndividu>("individu0");

  // Attributes
  public static final String AN_PREC_SITUC_KEY = AN_PREC_SITUC.key();
  public static final String AUTEUR_MAJ_KEY = AUTEUR_MAJ.key();
  public static final String BAC_ACADEMIEC_KEY = BAC_ACADEMIEC.key();
  public static final String BAC_AN_KEY = BAC_AN.key();
  public static final String BAC_DEPTC_KEY = BAC_DEPTC.key();
  public static final String BAC_ETAB_KEY = BAC_ETAB.key();
  public static final String BAC_MENTION_KEY = BAC_MENTION.key();
  public static final String BAC_PAYSC_KEY = BAC_PAYSC.key();
  public static final String BAC_SERIEC_KEY = BAC_SERIEC.key();
  public static final String BAC_VILLE_KEY = BAC_VILLE.key();
  public static final String BDEF_KEY = BDEF.key();
  public static final String CHARTE_INFO_DATE_KEY = CHARTE_INFO_DATE.key();
  public static final String CONSEILLER_ID_KEY = CONSEILLER_ID.key();
  public static final String CRE_DATE_KEY = CRE_DATE.key();
  public static final String DIPL_OBT_AN_KEY = DIPL_OBT_AN.key();
  public static final String DIPL_OBTC_KEY = DIPL_OBTC.key();
  public static final String DIPL_OBT_ETAB_KEY = DIPL_OBT_ETAB.key();
  public static final String DIPL_OBT_LIB_KEY = DIPL_OBT_LIB.key();
  public static final String DROIT_IMAGE_ACCORD$F_KEY = DROIT_IMAGE_ACCORD$F.key();
  public static final String DROIT_IMAGE_ACCORD_DATE_KEY = DROIT_IMAGE_ACCORD_DATE.key();
  public static final String ENS_SUP_PREM_AN_KEY = ENS_SUP_PREM_AN.key();
  public static final String IMPORT_DATE_KEY = IMPORT_DATE.key();
  public static final String INDIV_ID_KEY = INDIV_ID.key();
  public static final String INE_KEY = INE.key();
  public static final String INE_PROVISF_KEY = INE_PROVISF.key();
  public static final String INE_RE_IMMATF_KEY = INE_RE_IMMATF.key();
  public static final String LANGUE_MAT_KEY = LANGUE_MAT.key();
  public static final String MODIF_DATE_KEY = MODIF_DATE.key();
  public static final String PCS_PARENT2C_KEY = PCS_PARENT2C.key();
  public static final String PCS_PARENTC_KEY = PCS_PARENTC.key();
  public static final String RESP_C_DATE_DEBUT_KEY = RESP_C_DATE_DEBUT.key();
  public static final String RESP_C_DATE_FIN_KEY = RESP_C_DATE_FIN.key();
  public static final String RESP_CIVC_KEY = RESP_CIVC.key();
  public static final String RESP_CIV_FIN_DATE_KEY = RESP_CIV_FIN_DATE.key();
  public static final String RESP_CIV_STGI_KEY = RESP_CIV_STGI.key();
  public static final String SPORTC_KEY = SPORTC.key();
  public static final String TITRE_SEJC_KEY = TITRE_SEJC.key();
  public static final String TITRE_SEJ_COMMENT_KEY = TITRE_SEJ_COMMENT.key();
  public static final String TITRE_SEJ_FIN_DATE_KEY = TITRE_SEJ_FIN_DATE.key();
  public static final String TRANS_DOSSIER_DATE_KEY = TRANS_DOSSIER_DATE.key();
  public static final String TRANS_DOSSIER_LIEU_KEY = TRANS_DOSSIER_LIEU.key();
  public static final String UNIV_INS_PREM_AN_KEY = UNIV_INS_PREM_AN.key();
  // Relationships
  public static final String ETU_INSCR_ADMS_KEY = ETU_INSCR_ADMS.key();
  public static final String INDIVIDU0_KEY = INDIVIDU0.key();

  private static Logger LOG = Logger.getLogger(_EOEtudiant.class);

  public EOEtudiant localInstanceIn(EOEditingContext editingContext) {
    EOEtudiant localInstance = (EOEtudiant)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String anPrecSituc() {
    return (String) storedValueForKey(_EOEtudiant.AN_PREC_SITUC_KEY);
  }

  public void setAnPrecSituc(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating anPrecSituc from " + anPrecSituc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.AN_PREC_SITUC_KEY);
  }

  public String auteurMaj() {
    return (String) storedValueForKey(_EOEtudiant.AUTEUR_MAJ_KEY);
  }

  public void setAuteurMaj(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating auteurMaj from " + auteurMaj() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.AUTEUR_MAJ_KEY);
  }

  public String bacAcademiec() {
    return (String) storedValueForKey(_EOEtudiant.BAC_ACADEMIEC_KEY);
  }

  public void setBacAcademiec(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating bacAcademiec from " + bacAcademiec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.BAC_ACADEMIEC_KEY);
  }

  public String bacAn() {
    return (String) storedValueForKey(_EOEtudiant.BAC_AN_KEY);
  }

  public void setBacAn(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating bacAn from " + bacAn() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.BAC_AN_KEY);
  }

  public String bacDeptc() {
    return (String) storedValueForKey(_EOEtudiant.BAC_DEPTC_KEY);
  }

  public void setBacDeptc(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating bacDeptc from " + bacDeptc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.BAC_DEPTC_KEY);
  }

  public String bacEtab() {
    return (String) storedValueForKey(_EOEtudiant.BAC_ETAB_KEY);
  }

  public void setBacEtab(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating bacEtab from " + bacEtab() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.BAC_ETAB_KEY);
  }

  public String bacMention() {
    return (String) storedValueForKey(_EOEtudiant.BAC_MENTION_KEY);
  }

  public void setBacMention(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating bacMention from " + bacMention() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.BAC_MENTION_KEY);
  }

  public String bacPaysc() {
    return (String) storedValueForKey(_EOEtudiant.BAC_PAYSC_KEY);
  }

  public void setBacPaysc(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating bacPaysc from " + bacPaysc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.BAC_PAYSC_KEY);
  }

  public String bacSeriec() {
    return (String) storedValueForKey(_EOEtudiant.BAC_SERIEC_KEY);
  }

  public void setBacSeriec(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating bacSeriec from " + bacSeriec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.BAC_SERIEC_KEY);
  }

  public String bacVille() {
    return (String) storedValueForKey(_EOEtudiant.BAC_VILLE_KEY);
  }

  public void setBacVille(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating bacVille from " + bacVille() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.BAC_VILLE_KEY);
  }

  public String bdef() {
    return (String) storedValueForKey(_EOEtudiant.BDEF_KEY);
  }

  public void setBdef(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating bdef from " + bdef() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.BDEF_KEY);
  }

  public NSTimestamp charteInfoDate() {
    return (NSTimestamp) storedValueForKey(_EOEtudiant.CHARTE_INFO_DATE_KEY);
  }

  public void setCharteInfoDate(NSTimestamp value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating charteInfoDate from " + charteInfoDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.CHARTE_INFO_DATE_KEY);
  }

  public Long conseillerId() {
    return (Long) storedValueForKey(_EOEtudiant.CONSEILLER_ID_KEY);
  }

  public void setConseillerId(Long value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating conseillerId from " + conseillerId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.CONSEILLER_ID_KEY);
  }

  public NSTimestamp creDate() {
    return (NSTimestamp) storedValueForKey(_EOEtudiant.CRE_DATE_KEY);
  }

  public void setCreDate(NSTimestamp value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating creDate from " + creDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.CRE_DATE_KEY);
  }

  public String diplObtAn() {
    return (String) storedValueForKey(_EOEtudiant.DIPL_OBT_AN_KEY);
  }

  public void setDiplObtAn(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating diplObtAn from " + diplObtAn() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.DIPL_OBT_AN_KEY);
  }

  public String diplObtc() {
    return (String) storedValueForKey(_EOEtudiant.DIPL_OBTC_KEY);
  }

  public void setDiplObtc(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating diplObtc from " + diplObtc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.DIPL_OBTC_KEY);
  }

  public String diplObtEtab() {
    return (String) storedValueForKey(_EOEtudiant.DIPL_OBT_ETAB_KEY);
  }

  public void setDiplObtEtab(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating diplObtEtab from " + diplObtEtab() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.DIPL_OBT_ETAB_KEY);
  }

  public String diplObtLib() {
    return (String) storedValueForKey(_EOEtudiant.DIPL_OBT_LIB_KEY);
  }

  public void setDiplObtLib(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating diplObtLib from " + diplObtLib() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.DIPL_OBT_LIB_KEY);
  }

  public String droitImageAccord$f() {
    return (String) storedValueForKey(_EOEtudiant.DROIT_IMAGE_ACCORD$F_KEY);
  }

  public void setDroitImageAccord$f(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating droitImageAccord$f from " + droitImageAccord$f() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.DROIT_IMAGE_ACCORD$F_KEY);
  }

  public NSTimestamp droitImageAccordDate() {
    return (NSTimestamp) storedValueForKey(_EOEtudiant.DROIT_IMAGE_ACCORD_DATE_KEY);
  }

  public void setDroitImageAccordDate(NSTimestamp value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating droitImageAccordDate from " + droitImageAccordDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.DROIT_IMAGE_ACCORD_DATE_KEY);
  }

  public String ensSupPremAn() {
    return (String) storedValueForKey(_EOEtudiant.ENS_SUP_PREM_AN_KEY);
  }

  public void setEnsSupPremAn(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating ensSupPremAn from " + ensSupPremAn() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.ENS_SUP_PREM_AN_KEY);
  }

  public NSTimestamp importDate() {
    return (NSTimestamp) storedValueForKey(_EOEtudiant.IMPORT_DATE_KEY);
  }

  public void setImportDate(NSTimestamp value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating importDate from " + importDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.IMPORT_DATE_KEY);
  }

  public Long indivId() {
    return (Long) storedValueForKey(_EOEtudiant.INDIV_ID_KEY);
  }

  public void setIndivId(Long value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating indivId from " + indivId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.INDIV_ID_KEY);
  }

  public String ine() {
    return (String) storedValueForKey(_EOEtudiant.INE_KEY);
  }

  public void setIne(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating ine from " + ine() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.INE_KEY);
  }

  public String ineProvisf() {
    return (String) storedValueForKey(_EOEtudiant.INE_PROVISF_KEY);
  }

  public void setIneProvisf(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating ineProvisf from " + ineProvisf() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.INE_PROVISF_KEY);
  }

  public String ineReImmatf() {
    return (String) storedValueForKey(_EOEtudiant.INE_RE_IMMATF_KEY);
  }

  public void setIneReImmatf(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating ineReImmatf from " + ineReImmatf() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.INE_RE_IMMATF_KEY);
  }

  public String langueMat() {
    return (String) storedValueForKey(_EOEtudiant.LANGUE_MAT_KEY);
  }

  public void setLangueMat(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating langueMat from " + langueMat() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.LANGUE_MAT_KEY);
  }

  public NSTimestamp modifDate() {
    return (NSTimestamp) storedValueForKey(_EOEtudiant.MODIF_DATE_KEY);
  }

  public void setModifDate(NSTimestamp value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating modifDate from " + modifDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.MODIF_DATE_KEY);
  }

  public String pcsParent2c() {
    return (String) storedValueForKey(_EOEtudiant.PCS_PARENT2C_KEY);
  }

  public void setPcsParent2c(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating pcsParent2c from " + pcsParent2c() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.PCS_PARENT2C_KEY);
  }

  public String pcsParentc() {
    return (String) storedValueForKey(_EOEtudiant.PCS_PARENTC_KEY);
  }

  public void setPcsParentc(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating pcsParentc from " + pcsParentc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.PCS_PARENTC_KEY);
  }

  public NSTimestamp respCDateDebut() {
    return (NSTimestamp) storedValueForKey(_EOEtudiant.RESP_C_DATE_DEBUT_KEY);
  }

  public void setRespCDateDebut(NSTimestamp value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating respCDateDebut from " + respCDateDebut() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.RESP_C_DATE_DEBUT_KEY);
  }

  public NSTimestamp respCDateFin() {
    return (NSTimestamp) storedValueForKey(_EOEtudiant.RESP_C_DATE_FIN_KEY);
  }

  public void setRespCDateFin(NSTimestamp value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating respCDateFin from " + respCDateFin() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.RESP_C_DATE_FIN_KEY);
  }

  public String respCivc() {
    return (String) storedValueForKey(_EOEtudiant.RESP_CIVC_KEY);
  }

  public void setRespCivc(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating respCivc from " + respCivc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.RESP_CIVC_KEY);
  }

  public NSTimestamp respCivFinDate() {
    return (NSTimestamp) storedValueForKey(_EOEtudiant.RESP_CIV_FIN_DATE_KEY);
  }

  public void setRespCivFinDate(NSTimestamp value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating respCivFinDate from " + respCivFinDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.RESP_CIV_FIN_DATE_KEY);
  }

  public String respCivStgi() {
    return (String) storedValueForKey(_EOEtudiant.RESP_CIV_STGI_KEY);
  }

  public void setRespCivStgi(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating respCivStgi from " + respCivStgi() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.RESP_CIV_STGI_KEY);
  }

  public String sportc() {
    return (String) storedValueForKey(_EOEtudiant.SPORTC_KEY);
  }

  public void setSportc(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating sportc from " + sportc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.SPORTC_KEY);
  }

  public String titreSejc() {
    return (String) storedValueForKey(_EOEtudiant.TITRE_SEJC_KEY);
  }

  public void setTitreSejc(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating titreSejc from " + titreSejc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.TITRE_SEJC_KEY);
  }

  public String titreSejComment() {
    return (String) storedValueForKey(_EOEtudiant.TITRE_SEJ_COMMENT_KEY);
  }

  public void setTitreSejComment(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating titreSejComment from " + titreSejComment() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.TITRE_SEJ_COMMENT_KEY);
  }

  public NSTimestamp titreSejFinDate() {
    return (NSTimestamp) storedValueForKey(_EOEtudiant.TITRE_SEJ_FIN_DATE_KEY);
  }

  public void setTitreSejFinDate(NSTimestamp value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating titreSejFinDate from " + titreSejFinDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.TITRE_SEJ_FIN_DATE_KEY);
  }

  public NSTimestamp transDossierDate() {
    return (NSTimestamp) storedValueForKey(_EOEtudiant.TRANS_DOSSIER_DATE_KEY);
  }

  public void setTransDossierDate(NSTimestamp value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating transDossierDate from " + transDossierDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.TRANS_DOSSIER_DATE_KEY);
  }

  public String transDossierLieu() {
    return (String) storedValueForKey(_EOEtudiant.TRANS_DOSSIER_LIEU_KEY);
  }

  public void setTransDossierLieu(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating transDossierLieu from " + transDossierLieu() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.TRANS_DOSSIER_LIEU_KEY);
  }

  public String univInsPremAn() {
    return (String) storedValueForKey(_EOEtudiant.UNIV_INS_PREM_AN_KEY);
  }

  public void setUnivInsPremAn(String value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
    	_EOEtudiant.LOG.debug( "updating univInsPremAn from " + univInsPremAn() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiant.UNIV_INS_PREM_AN_KEY);
  }

  public etudiants.utt.fr.eo.EOIndividu individu0() {
    return (etudiants.utt.fr.eo.EOIndividu)storedValueForKey(_EOEtudiant.INDIVIDU0_KEY);
  }
  
  public void setIndividu0(etudiants.utt.fr.eo.EOIndividu value) {
    takeStoredValueForKey(value, _EOEtudiant.INDIVIDU0_KEY);
  }

  public void setIndividu0Relationship(etudiants.utt.fr.eo.EOIndividu value) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
      _EOEtudiant.LOG.debug("updating individu0 from " + individu0() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setIndividu0(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOIndividu oldValue = individu0();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOEtudiant.INDIVIDU0_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOEtudiant.INDIVIDU0_KEY);
    }
  }
  
  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> etuInscrAdms() {
    return (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)storedValueForKey(_EOEtudiant.ETU_INSCR_ADMS_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> etuInscrAdms(EOQualifier qualifier) {
    return etuInscrAdms(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> etuInscrAdms(EOQualifier qualifier, boolean fetch) {
    return etuInscrAdms(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> etuInscrAdms(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOEtudiantInscrAdm.ETUDIANT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EOEtudiantInscrAdm.fetchEOEtudiantInscrAdms(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = etuInscrAdms();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEtuInscrAdms(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    includeObjectIntoPropertyWithKey(object, _EOEtudiant.ETU_INSCR_ADMS_KEY);
  }

  public void removeFromEtuInscrAdms(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    excludeObjectFromPropertyWithKey(object, _EOEtudiant.ETU_INSCR_ADMS_KEY);
  }

  public void addToEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
      _EOEtudiant.LOG.debug("adding " + object + " to etuInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEtuInscrAdms(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOEtudiant.ETU_INSCR_ADMS_KEY);
    }
  }

  public void removeFromEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EOEtudiant.LOG.isDebugEnabled()) {
      _EOEtudiant.LOG.debug("removing " + object + " from etuInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEtuInscrAdms(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtudiant.ETU_INSCR_ADMS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOEtudiantInscrAdm createEtuInscrAdmsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOEtudiantInscrAdm.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOEtudiant.ETU_INSCR_ADMS_KEY);
    return (etudiants.utt.fr.eo.EOEtudiantInscrAdm) eo;
  }

  public void deleteEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtudiant.ETU_INSCR_ADMS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEtuInscrAdmsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOEtudiantInscrAdm> objects = etuInscrAdms().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEtuInscrAdmsRelationship(objects.nextElement());
    }
  }


  public static EOEtudiant createEOEtudiant(EOEditingContext editingContext, Long indivId
, etudiants.utt.fr.eo.EOIndividu individu0) {
    EOEtudiant eo = (EOEtudiant) EOUtilities.createAndInsertInstance(editingContext, _EOEtudiant.ENTITY_NAME);    
		eo.setIndivId(indivId);
    eo.setIndividu0Relationship(individu0);
    return eo;
  }

  public static ERXFetchSpecification<EOEtudiant> fetchSpec() {
    return new ERXFetchSpecification<EOEtudiant>(_EOEtudiant.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOEtudiant> fetchAllEOEtudiants(EOEditingContext editingContext) {
    return _EOEtudiant.fetchAllEOEtudiants(editingContext, null);
  }

  public static NSArray<EOEtudiant> fetchAllEOEtudiants(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOEtudiant.fetchEOEtudiants(editingContext, null, sortOrderings);
  }

  public static NSArray<EOEtudiant> fetchEOEtudiants(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOEtudiant> fetchSpec = new ERXFetchSpecification<EOEtudiant>(_EOEtudiant.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOEtudiant> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOEtudiant fetchEOEtudiant(EOEditingContext editingContext, String keyName, Object value) {
    return _EOEtudiant.fetchEOEtudiant(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOEtudiant fetchEOEtudiant(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOEtudiant> eoObjects = _EOEtudiant.fetchEOEtudiants(editingContext, qualifier, null);
    EOEtudiant eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOEtudiant that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOEtudiant fetchRequiredEOEtudiant(EOEditingContext editingContext, String keyName, Object value) {
    return _EOEtudiant.fetchRequiredEOEtudiant(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOEtudiant fetchRequiredEOEtudiant(EOEditingContext editingContext, EOQualifier qualifier) {
    EOEtudiant eoObject = _EOEtudiant.fetchEOEtudiant(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOEtudiant that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOEtudiant localInstanceIn(EOEditingContext editingContext, EOEtudiant eo) {
    EOEtudiant localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
