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
// DO NOT EDIT.  Make changes to EOIndividu.java instead.
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
public abstract class _EOIndividu extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOIndividu";

  // Attribute Keys
  public static final ERXKey<String> AUTEUR_MAJ = new ERXKey<String>("auteurMaj");
  public static final ERXKey<String> CIVILITEC = new ERXKey<String>("civilitec");
  public static final ERXKey<String> CODE_CONFID = new ERXKey<String>("codeConfid");
  public static final ERXKey<NSTimestamp> CRE_DATE = new ERXKey<NSTimestamp>("creDate");
  public static final ERXKey<Long> HARP_INDIV_ID = new ERXKey<Long>("harpIndivId");
  public static final ERXKey<Long> HOMON_NO = new ERXKey<Long>("homonNo");
  public static final ERXKey<NSTimestamp> IMPORT_DATE = new ERXKey<NSTimestamp>("importDate");
  public static final ERXKey<Long> INDIV_ID = new ERXKey<Long>("indivId");
  public static final ERXKey<String> LOGIN = new ERXKey<String>("login");
  public static final ERXKey<NSTimestamp> MODIF_DATE = new ERXKey<NSTimestamp>("modifDate");
  public static final ERXKey<String> NAIS_COM = new ERXKey<String>("naisCom");
  public static final ERXKey<NSTimestamp> NAIS_DATE = new ERXKey<NSTimestamp>("naisDate");
  public static final ERXKey<String> NAIS_DEPTC = new ERXKey<String>("naisDeptc");
  public static final ERXKey<String> NAIS_PAYSC = new ERXKey<String>("naisPaysc");
  public static final ERXKey<String> NAT_PAYSC = new ERXKey<String>("natPaysc");
  public static final ERXKey<String> NNI = new ERXKey<String>("nni");
  public static final ERXKey<String> NNI_CLE = new ERXKey<String>("nniCle");
  public static final ERXKey<String> NOM = new ERXKey<String>("nom");
  public static final ERXKey<String> NOM_NAIS = new ERXKey<String>("nomNais");
  public static final ERXKey<String> NOM_TYPE = new ERXKey<String>("nomType");
  public static final ERXKey<String> PASSWD_CRYPT = new ERXKey<String>("passwdCrypt");
  public static final ERXKey<String> PRENOM = new ERXKey<String>("prenom");
  public static final ERXKey<String> PRENOM1 = new ERXKey<String>("prenom1");
  public static final ERXKey<String> PRENOM2 = new ERXKey<String>("prenom2");
  public static final ERXKey<String> PRENOM3 = new ERXKey<String>("prenom3");
  public static final ERXKey<String> PRENOM_TYPE = new ERXKey<String>("prenomType");
  public static final ERXKey<String> SITUATIONC = new ERXKey<String>("situationc");
  public static final ERXKey<Long> VMS_INDIV_ID = new ERXKey<Long>("vmsIndivId");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm> EO_ETUDIANT_INSCR_ADMS = new ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm>("eoEtudiantInscrAdms");
  public static final ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome> EO_VUE_AFFICHERDIPLOMES = new ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome>("eoVueAfficherdiplomes");
  public static final ERXKey<etudiants.utt.fr.eo.EOVueAfficherparcours> EO_VUE_AFFICHERPARCOURSES = new ERXKey<etudiants.utt.fr.eo.EOVueAfficherparcours>("eoVueAfficherparcourses");
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiant> ETUDIANTS = new ERXKey<etudiants.utt.fr.eo.EOEtudiant>("etudiants");
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiant> ETUDIANTS1 = new ERXKey<etudiants.utt.fr.eo.EOEtudiant>("etudiants1");
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm> ETU_INSCR_ADMS = new ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm>("etuInscrAdms");
  public static final ERXKey<etudiants.utt.fr.eo.EOIndEmail> IND_EMAILS = new ERXKey<etudiants.utt.fr.eo.EOIndEmail>("indEmails");
  public static final ERXKey<gestionuv.utt.fr.eo.EOEtuMineur> MINEURS = new ERXKey<gestionuv.utt.fr.eo.EOEtuMineur>("mineurs");
  public static final ERXKey<etudiants.utt.fr.eo.EOProfilImpression> PROFIL_IMPRESSION = new ERXKey<etudiants.utt.fr.eo.EOProfilImpression>("profilImpression");
  public static final ERXKey<etudiants.utt.fr.eo.EORefCivilite> REF_CIVILITE = new ERXKey<etudiants.utt.fr.eo.EORefCivilite>("refCivilite");
  public static final ERXKey<gestionuv.utt.fr.eo.UvOuvResp> UV_OUV_RESPS = new ERXKey<gestionuv.utt.fr.eo.UvOuvResp>("uvOuvResps");

  // Attributes
  public static final String AUTEUR_MAJ_KEY = AUTEUR_MAJ.key();
  public static final String CIVILITEC_KEY = CIVILITEC.key();
  public static final String CODE_CONFID_KEY = CODE_CONFID.key();
  public static final String CRE_DATE_KEY = CRE_DATE.key();
  public static final String HARP_INDIV_ID_KEY = HARP_INDIV_ID.key();
  public static final String HOMON_NO_KEY = HOMON_NO.key();
  public static final String IMPORT_DATE_KEY = IMPORT_DATE.key();
  public static final String INDIV_ID_KEY = INDIV_ID.key();
  public static final String LOGIN_KEY = LOGIN.key();
  public static final String MODIF_DATE_KEY = MODIF_DATE.key();
  public static final String NAIS_COM_KEY = NAIS_COM.key();
  public static final String NAIS_DATE_KEY = NAIS_DATE.key();
  public static final String NAIS_DEPTC_KEY = NAIS_DEPTC.key();
  public static final String NAIS_PAYSC_KEY = NAIS_PAYSC.key();
  public static final String NAT_PAYSC_KEY = NAT_PAYSC.key();
  public static final String NNI_KEY = NNI.key();
  public static final String NNI_CLE_KEY = NNI_CLE.key();
  public static final String NOM_KEY = NOM.key();
  public static final String NOM_NAIS_KEY = NOM_NAIS.key();
  public static final String NOM_TYPE_KEY = NOM_TYPE.key();
  public static final String PASSWD_CRYPT_KEY = PASSWD_CRYPT.key();
  public static final String PRENOM_KEY = PRENOM.key();
  public static final String PRENOM1_KEY = PRENOM1.key();
  public static final String PRENOM2_KEY = PRENOM2.key();
  public static final String PRENOM3_KEY = PRENOM3.key();
  public static final String PRENOM_TYPE_KEY = PRENOM_TYPE.key();
  public static final String SITUATIONC_KEY = SITUATIONC.key();
  public static final String VMS_INDIV_ID_KEY = VMS_INDIV_ID.key();
  // Relationships
  public static final String EO_ETUDIANT_INSCR_ADMS_KEY = EO_ETUDIANT_INSCR_ADMS.key();
  public static final String EO_VUE_AFFICHERDIPLOMES_KEY = EO_VUE_AFFICHERDIPLOMES.key();
  public static final String EO_VUE_AFFICHERPARCOURSES_KEY = EO_VUE_AFFICHERPARCOURSES.key();
  public static final String ETUDIANTS_KEY = ETUDIANTS.key();
  public static final String ETUDIANTS1_KEY = ETUDIANTS1.key();
  public static final String ETU_INSCR_ADMS_KEY = ETU_INSCR_ADMS.key();
  public static final String IND_EMAILS_KEY = IND_EMAILS.key();
  public static final String MINEURS_KEY = MINEURS.key();
  public static final String PROFIL_IMPRESSION_KEY = PROFIL_IMPRESSION.key();
  public static final String REF_CIVILITE_KEY = REF_CIVILITE.key();
  public static final String UV_OUV_RESPS_KEY = UV_OUV_RESPS.key();

  private static Logger LOG = Logger.getLogger(_EOIndividu.class);

  public EOIndividu localInstanceIn(EOEditingContext editingContext) {
    EOIndividu localInstance = (EOIndividu)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String auteurMaj() {
    return (String) storedValueForKey(_EOIndividu.AUTEUR_MAJ_KEY);
  }

  public void setAuteurMaj(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating auteurMaj from " + auteurMaj() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.AUTEUR_MAJ_KEY);
  }

  public String civilitec() {
    return (String) storedValueForKey(_EOIndividu.CIVILITEC_KEY);
  }

  public void setCivilitec(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating civilitec from " + civilitec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.CIVILITEC_KEY);
  }

  public String codeConfid() {
    return (String) storedValueForKey(_EOIndividu.CODE_CONFID_KEY);
  }

  public void setCodeConfid(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating codeConfid from " + codeConfid() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.CODE_CONFID_KEY);
  }

  public NSTimestamp creDate() {
    return (NSTimestamp) storedValueForKey(_EOIndividu.CRE_DATE_KEY);
  }

  public void setCreDate(NSTimestamp value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating creDate from " + creDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.CRE_DATE_KEY);
  }

  public Long harpIndivId() {
    return (Long) storedValueForKey(_EOIndividu.HARP_INDIV_ID_KEY);
  }

  public void setHarpIndivId(Long value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating harpIndivId from " + harpIndivId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.HARP_INDIV_ID_KEY);
  }

  public Long homonNo() {
    return (Long) storedValueForKey(_EOIndividu.HOMON_NO_KEY);
  }

  public void setHomonNo(Long value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating homonNo from " + homonNo() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.HOMON_NO_KEY);
  }

  public NSTimestamp importDate() {
    return (NSTimestamp) storedValueForKey(_EOIndividu.IMPORT_DATE_KEY);
  }

  public void setImportDate(NSTimestamp value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating importDate from " + importDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.IMPORT_DATE_KEY);
  }

  public Long indivId() {
    return (Long) storedValueForKey(_EOIndividu.INDIV_ID_KEY);
  }

  public void setIndivId(Long value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating indivId from " + indivId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.INDIV_ID_KEY);
  }

  public String login() {
    return (String) storedValueForKey(_EOIndividu.LOGIN_KEY);
  }

  public void setLogin(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating login from " + login() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.LOGIN_KEY);
  }

  public NSTimestamp modifDate() {
    return (NSTimestamp) storedValueForKey(_EOIndividu.MODIF_DATE_KEY);
  }

  public void setModifDate(NSTimestamp value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating modifDate from " + modifDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.MODIF_DATE_KEY);
  }

  public String naisCom() {
    return (String) storedValueForKey(_EOIndividu.NAIS_COM_KEY);
  }

  public void setNaisCom(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating naisCom from " + naisCom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.NAIS_COM_KEY);
  }

  public NSTimestamp naisDate() {
    return (NSTimestamp) storedValueForKey(_EOIndividu.NAIS_DATE_KEY);
  }

  public void setNaisDate(NSTimestamp value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating naisDate from " + naisDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.NAIS_DATE_KEY);
  }

  public String naisDeptc() {
    return (String) storedValueForKey(_EOIndividu.NAIS_DEPTC_KEY);
  }

  public void setNaisDeptc(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating naisDeptc from " + naisDeptc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.NAIS_DEPTC_KEY);
  }

  public String naisPaysc() {
    return (String) storedValueForKey(_EOIndividu.NAIS_PAYSC_KEY);
  }

  public void setNaisPaysc(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating naisPaysc from " + naisPaysc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.NAIS_PAYSC_KEY);
  }

  public String natPaysc() {
    return (String) storedValueForKey(_EOIndividu.NAT_PAYSC_KEY);
  }

  public void setNatPaysc(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating natPaysc from " + natPaysc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.NAT_PAYSC_KEY);
  }

  public String nni() {
    return (String) storedValueForKey(_EOIndividu.NNI_KEY);
  }

  public void setNni(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating nni from " + nni() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.NNI_KEY);
  }

  public String nniCle() {
    return (String) storedValueForKey(_EOIndividu.NNI_CLE_KEY);
  }

  public void setNniCle(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating nniCle from " + nniCle() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.NNI_CLE_KEY);
  }

  public String nom() {
    return (String) storedValueForKey(_EOIndividu.NOM_KEY);
  }

  public void setNom(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating nom from " + nom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.NOM_KEY);
  }

  public String nomNais() {
    return (String) storedValueForKey(_EOIndividu.NOM_NAIS_KEY);
  }

  public void setNomNais(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating nomNais from " + nomNais() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.NOM_NAIS_KEY);
  }

  public String nomType() {
    return (String) storedValueForKey(_EOIndividu.NOM_TYPE_KEY);
  }

  public void setNomType(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating nomType from " + nomType() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.NOM_TYPE_KEY);
  }

  public String passwdCrypt() {
    return (String) storedValueForKey(_EOIndividu.PASSWD_CRYPT_KEY);
  }

  public void setPasswdCrypt(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating passwdCrypt from " + passwdCrypt() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.PASSWD_CRYPT_KEY);
  }

  public String prenom() {
    return (String) storedValueForKey(_EOIndividu.PRENOM_KEY);
  }

  public void setPrenom(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating prenom from " + prenom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.PRENOM_KEY);
  }

  public String prenom1() {
    return (String) storedValueForKey(_EOIndividu.PRENOM1_KEY);
  }

  public void setPrenom1(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating prenom1 from " + prenom1() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.PRENOM1_KEY);
  }

  public String prenom2() {
    return (String) storedValueForKey(_EOIndividu.PRENOM2_KEY);
  }

  public void setPrenom2(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating prenom2 from " + prenom2() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.PRENOM2_KEY);
  }

  public String prenom3() {
    return (String) storedValueForKey(_EOIndividu.PRENOM3_KEY);
  }

  public void setPrenom3(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating prenom3 from " + prenom3() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.PRENOM3_KEY);
  }

  public String prenomType() {
    return (String) storedValueForKey(_EOIndividu.PRENOM_TYPE_KEY);
  }

  public void setPrenomType(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating prenomType from " + prenomType() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.PRENOM_TYPE_KEY);
  }

  public String situationc() {
    return (String) storedValueForKey(_EOIndividu.SITUATIONC_KEY);
  }

  public void setSituationc(String value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating situationc from " + situationc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.SITUATIONC_KEY);
  }

  public Long vmsIndivId() {
    return (Long) storedValueForKey(_EOIndividu.VMS_INDIV_ID_KEY);
  }

  public void setVmsIndivId(Long value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
    	_EOIndividu.LOG.debug( "updating vmsIndivId from " + vmsIndivId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndividu.VMS_INDIV_ID_KEY);
  }

  public etudiants.utt.fr.eo.EORefCivilite refCivilite() {
    return (etudiants.utt.fr.eo.EORefCivilite)storedValueForKey(_EOIndividu.REF_CIVILITE_KEY);
  }
  
  public void setRefCivilite(etudiants.utt.fr.eo.EORefCivilite value) {
    takeStoredValueForKey(value, _EOIndividu.REF_CIVILITE_KEY);
  }

  public void setRefCiviliteRelationship(etudiants.utt.fr.eo.EORefCivilite value) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("updating refCivilite from " + refCivilite() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setRefCivilite(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EORefCivilite oldValue = refCivilite();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOIndividu.REF_CIVILITE_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOIndividu.REF_CIVILITE_KEY);
    }
  }
  
  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> eoEtudiantInscrAdms() {
    return (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)storedValueForKey(_EOIndividu.EO_ETUDIANT_INSCR_ADMS_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> eoEtudiantInscrAdms(EOQualifier qualifier) {
    return eoEtudiantInscrAdms(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> eoEtudiantInscrAdms(EOQualifier qualifier, boolean fetch) {
    return eoEtudiantInscrAdms(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> eoEtudiantInscrAdms(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOEtudiantInscrAdm.EO_CONSEILLER_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
      results = eoEtudiantInscrAdms();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEoEtudiantInscrAdms(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    includeObjectIntoPropertyWithKey(object, _EOIndividu.EO_ETUDIANT_INSCR_ADMS_KEY);
  }

  public void removeFromEoEtudiantInscrAdms(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    excludeObjectFromPropertyWithKey(object, _EOIndividu.EO_ETUDIANT_INSCR_ADMS_KEY);
  }

  public void addToEoEtudiantInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("adding " + object + " to eoEtudiantInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoEtudiantInscrAdms(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOIndividu.EO_ETUDIANT_INSCR_ADMS_KEY);
    }
  }

  public void removeFromEoEtudiantInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("removing " + object + " from eoEtudiantInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoEtudiantInscrAdms(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.EO_ETUDIANT_INSCR_ADMS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOEtudiantInscrAdm createEoEtudiantInscrAdmsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOEtudiantInscrAdm.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOIndividu.EO_ETUDIANT_INSCR_ADMS_KEY);
    return (etudiants.utt.fr.eo.EOEtudiantInscrAdm) eo;
  }

  public void deleteEoEtudiantInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.EO_ETUDIANT_INSCR_ADMS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoEtudiantInscrAdmsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOEtudiantInscrAdm> objects = eoEtudiantInscrAdms().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoEtudiantInscrAdmsRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome> eoVueAfficherdiplomes() {
    return (NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome>)storedValueForKey(_EOIndividu.EO_VUE_AFFICHERDIPLOMES_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome> eoVueAfficherdiplomes(EOQualifier qualifier) {
    return eoVueAfficherdiplomes(qualifier, null);
  }

  public NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome> eoVueAfficherdiplomes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome> results;
      results = eoVueAfficherdiplomes();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEoVueAfficherdiplomes(etudiants.utt.fr.eo.EOVueAfficherdiplome object) {
    includeObjectIntoPropertyWithKey(object, _EOIndividu.EO_VUE_AFFICHERDIPLOMES_KEY);
  }

  public void removeFromEoVueAfficherdiplomes(etudiants.utt.fr.eo.EOVueAfficherdiplome object) {
    excludeObjectFromPropertyWithKey(object, _EOIndividu.EO_VUE_AFFICHERDIPLOMES_KEY);
  }

  public void addToEoVueAfficherdiplomesRelationship(etudiants.utt.fr.eo.EOVueAfficherdiplome object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("adding " + object + " to eoVueAfficherdiplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoVueAfficherdiplomes(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOIndividu.EO_VUE_AFFICHERDIPLOMES_KEY);
    }
  }

  public void removeFromEoVueAfficherdiplomesRelationship(etudiants.utt.fr.eo.EOVueAfficherdiplome object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("removing " + object + " from eoVueAfficherdiplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoVueAfficherdiplomes(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.EO_VUE_AFFICHERDIPLOMES_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOVueAfficherdiplome createEoVueAfficherdiplomesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOVueAfficherdiplome.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOIndividu.EO_VUE_AFFICHERDIPLOMES_KEY);
    return (etudiants.utt.fr.eo.EOVueAfficherdiplome) eo;
  }

  public void deleteEoVueAfficherdiplomesRelationship(etudiants.utt.fr.eo.EOVueAfficherdiplome object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.EO_VUE_AFFICHERDIPLOMES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoVueAfficherdiplomesRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOVueAfficherdiplome> objects = eoVueAfficherdiplomes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoVueAfficherdiplomesRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOVueAfficherparcours> eoVueAfficherparcourses() {
    return (NSArray<etudiants.utt.fr.eo.EOVueAfficherparcours>)storedValueForKey(_EOIndividu.EO_VUE_AFFICHERPARCOURSES_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOVueAfficherparcours> eoVueAfficherparcourses(EOQualifier qualifier) {
    return eoVueAfficherparcourses(qualifier, null);
  }

  public NSArray<etudiants.utt.fr.eo.EOVueAfficherparcours> eoVueAfficherparcourses(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<etudiants.utt.fr.eo.EOVueAfficherparcours> results;
      results = eoVueAfficherparcourses();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOVueAfficherparcours>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOVueAfficherparcours>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEoVueAfficherparcourses(etudiants.utt.fr.eo.EOVueAfficherparcours object) {
    includeObjectIntoPropertyWithKey(object, _EOIndividu.EO_VUE_AFFICHERPARCOURSES_KEY);
  }

  public void removeFromEoVueAfficherparcourses(etudiants.utt.fr.eo.EOVueAfficherparcours object) {
    excludeObjectFromPropertyWithKey(object, _EOIndividu.EO_VUE_AFFICHERPARCOURSES_KEY);
  }

  public void addToEoVueAfficherparcoursesRelationship(etudiants.utt.fr.eo.EOVueAfficherparcours object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("adding " + object + " to eoVueAfficherparcourses relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoVueAfficherparcourses(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOIndividu.EO_VUE_AFFICHERPARCOURSES_KEY);
    }
  }

  public void removeFromEoVueAfficherparcoursesRelationship(etudiants.utt.fr.eo.EOVueAfficherparcours object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("removing " + object + " from eoVueAfficherparcourses relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoVueAfficherparcourses(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.EO_VUE_AFFICHERPARCOURSES_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOVueAfficherparcours createEoVueAfficherparcoursesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOVueAfficherparcours.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOIndividu.EO_VUE_AFFICHERPARCOURSES_KEY);
    return (etudiants.utt.fr.eo.EOVueAfficherparcours) eo;
  }

  public void deleteEoVueAfficherparcoursesRelationship(etudiants.utt.fr.eo.EOVueAfficherparcours object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.EO_VUE_AFFICHERPARCOURSES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoVueAfficherparcoursesRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOVueAfficherparcours> objects = eoVueAfficherparcourses().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoVueAfficherparcoursesRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiant> etudiants() {
    return (NSArray<etudiants.utt.fr.eo.EOEtudiant>)storedValueForKey(_EOIndividu.ETUDIANTS_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiant> etudiants(EOQualifier qualifier) {
    return etudiants(qualifier, null);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiant> etudiants(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<etudiants.utt.fr.eo.EOEtudiant> results;
      results = etudiants();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiant>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiant>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEtudiants(etudiants.utt.fr.eo.EOEtudiant object) {
    includeObjectIntoPropertyWithKey(object, _EOIndividu.ETUDIANTS_KEY);
  }

  public void removeFromEtudiants(etudiants.utt.fr.eo.EOEtudiant object) {
    excludeObjectFromPropertyWithKey(object, _EOIndividu.ETUDIANTS_KEY);
  }

  public void addToEtudiantsRelationship(etudiants.utt.fr.eo.EOEtudiant object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("adding " + object + " to etudiants relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEtudiants(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOIndividu.ETUDIANTS_KEY);
    }
  }

  public void removeFromEtudiantsRelationship(etudiants.utt.fr.eo.EOEtudiant object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("removing " + object + " from etudiants relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEtudiants(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.ETUDIANTS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOEtudiant createEtudiantsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOEtudiant.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOIndividu.ETUDIANTS_KEY);
    return (etudiants.utt.fr.eo.EOEtudiant) eo;
  }

  public void deleteEtudiantsRelationship(etudiants.utt.fr.eo.EOEtudiant object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.ETUDIANTS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEtudiantsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOEtudiant> objects = etudiants().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEtudiantsRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiant> etudiants1() {
    return (NSArray<etudiants.utt.fr.eo.EOEtudiant>)storedValueForKey(_EOIndividu.ETUDIANTS1_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiant> etudiants1(EOQualifier qualifier) {
    return etudiants1(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiant> etudiants1(EOQualifier qualifier, boolean fetch) {
    return etudiants1(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiant> etudiants1(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EOEtudiant> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOEtudiant.INDIVIDU0_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EOEtudiant.fetchEOEtudiants(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = etudiants1();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiant>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiant>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEtudiants1(etudiants.utt.fr.eo.EOEtudiant object) {
    includeObjectIntoPropertyWithKey(object, _EOIndividu.ETUDIANTS1_KEY);
  }

  public void removeFromEtudiants1(etudiants.utt.fr.eo.EOEtudiant object) {
    excludeObjectFromPropertyWithKey(object, _EOIndividu.ETUDIANTS1_KEY);
  }

  public void addToEtudiants1Relationship(etudiants.utt.fr.eo.EOEtudiant object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("adding " + object + " to etudiants1 relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEtudiants1(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOIndividu.ETUDIANTS1_KEY);
    }
  }

  public void removeFromEtudiants1Relationship(etudiants.utt.fr.eo.EOEtudiant object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("removing " + object + " from etudiants1 relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEtudiants1(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.ETUDIANTS1_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOEtudiant createEtudiants1Relationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOEtudiant.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOIndividu.ETUDIANTS1_KEY);
    return (etudiants.utt.fr.eo.EOEtudiant) eo;
  }

  public void deleteEtudiants1Relationship(etudiants.utt.fr.eo.EOEtudiant object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.ETUDIANTS1_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEtudiants1Relationships() {
    Enumeration<etudiants.utt.fr.eo.EOEtudiant> objects = etudiants1().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEtudiants1Relationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> etuInscrAdms() {
    return (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)storedValueForKey(_EOIndividu.ETU_INSCR_ADMS_KEY);
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOEtudiantInscrAdm.INDIVIDU_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
    includeObjectIntoPropertyWithKey(object, _EOIndividu.ETU_INSCR_ADMS_KEY);
  }

  public void removeFromEtuInscrAdms(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    excludeObjectFromPropertyWithKey(object, _EOIndividu.ETU_INSCR_ADMS_KEY);
  }

  public void addToEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("adding " + object + " to etuInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEtuInscrAdms(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOIndividu.ETU_INSCR_ADMS_KEY);
    }
  }

  public void removeFromEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("removing " + object + " from etuInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEtuInscrAdms(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.ETU_INSCR_ADMS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOEtudiantInscrAdm createEtuInscrAdmsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOEtudiantInscrAdm.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOIndividu.ETU_INSCR_ADMS_KEY);
    return (etudiants.utt.fr.eo.EOEtudiantInscrAdm) eo;
  }

  public void deleteEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.ETU_INSCR_ADMS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEtuInscrAdmsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOEtudiantInscrAdm> objects = etuInscrAdms().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEtuInscrAdmsRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOIndEmail> indEmails() {
    return (NSArray<etudiants.utt.fr.eo.EOIndEmail>)storedValueForKey(_EOIndividu.IND_EMAILS_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOIndEmail> indEmails(EOQualifier qualifier) {
    return indEmails(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EOIndEmail> indEmails(EOQualifier qualifier, boolean fetch) {
    return indEmails(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EOIndEmail> indEmails(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EOIndEmail> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOIndEmail.INDIVIDU_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EOIndEmail.fetchEOIndEmails(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = indEmails();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOIndEmail>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOIndEmail>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToIndEmails(etudiants.utt.fr.eo.EOIndEmail object) {
    includeObjectIntoPropertyWithKey(object, _EOIndividu.IND_EMAILS_KEY);
  }

  public void removeFromIndEmails(etudiants.utt.fr.eo.EOIndEmail object) {
    excludeObjectFromPropertyWithKey(object, _EOIndividu.IND_EMAILS_KEY);
  }

  public void addToIndEmailsRelationship(etudiants.utt.fr.eo.EOIndEmail object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("adding " + object + " to indEmails relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToIndEmails(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOIndividu.IND_EMAILS_KEY);
    }
  }

  public void removeFromIndEmailsRelationship(etudiants.utt.fr.eo.EOIndEmail object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("removing " + object + " from indEmails relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromIndEmails(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.IND_EMAILS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOIndEmail createIndEmailsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOIndEmail.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOIndividu.IND_EMAILS_KEY);
    return (etudiants.utt.fr.eo.EOIndEmail) eo;
  }

  public void deleteIndEmailsRelationship(etudiants.utt.fr.eo.EOIndEmail object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.IND_EMAILS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllIndEmailsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOIndEmail> objects = indEmails().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteIndEmailsRelationship(objects.nextElement());
    }
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuMineur> mineurs() {
    return (NSArray<gestionuv.utt.fr.eo.EOEtuMineur>)storedValueForKey(_EOIndividu.MINEURS_KEY);
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuMineur> mineurs(EOQualifier qualifier) {
    return mineurs(qualifier, null, false);
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuMineur> mineurs(EOQualifier qualifier, boolean fetch) {
    return mineurs(qualifier, null, fetch);
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuMineur> mineurs(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<gestionuv.utt.fr.eo.EOEtuMineur> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(gestionuv.utt.fr.eo.EOEtuMineur.ETUDIANT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = gestionuv.utt.fr.eo.EOEtuMineur.fetchEOEtuMineurs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = mineurs();
      if (qualifier != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOEtuMineur>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOEtuMineur>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToMineurs(gestionuv.utt.fr.eo.EOEtuMineur object) {
    includeObjectIntoPropertyWithKey(object, _EOIndividu.MINEURS_KEY);
  }

  public void removeFromMineurs(gestionuv.utt.fr.eo.EOEtuMineur object) {
    excludeObjectFromPropertyWithKey(object, _EOIndividu.MINEURS_KEY);
  }

  public void addToMineursRelationship(gestionuv.utt.fr.eo.EOEtuMineur object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("adding " + object + " to mineurs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToMineurs(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOIndividu.MINEURS_KEY);
    }
  }

  public void removeFromMineursRelationship(gestionuv.utt.fr.eo.EOEtuMineur object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("removing " + object + " from mineurs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromMineurs(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.MINEURS_KEY);
    }
  }

  public gestionuv.utt.fr.eo.EOEtuMineur createMineursRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.EOEtuMineur.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOIndividu.MINEURS_KEY);
    return (gestionuv.utt.fr.eo.EOEtuMineur) eo;
  }

  public void deleteMineursRelationship(gestionuv.utt.fr.eo.EOEtuMineur object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.MINEURS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllMineursRelationships() {
    Enumeration<gestionuv.utt.fr.eo.EOEtuMineur> objects = mineurs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteMineursRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOProfilImpression> profilImpression() {
    return (NSArray<etudiants.utt.fr.eo.EOProfilImpression>)storedValueForKey(_EOIndividu.PROFIL_IMPRESSION_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOProfilImpression> profilImpression(EOQualifier qualifier) {
    return profilImpression(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EOProfilImpression> profilImpression(EOQualifier qualifier, boolean fetch) {
    return profilImpression(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EOProfilImpression> profilImpression(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EOProfilImpression> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOProfilImpression.ETUDIANT_ID_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EOProfilImpression.fetchEOProfilImpressions(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = profilImpression();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOProfilImpression>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOProfilImpression>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToProfilImpression(etudiants.utt.fr.eo.EOProfilImpression object) {
    includeObjectIntoPropertyWithKey(object, _EOIndividu.PROFIL_IMPRESSION_KEY);
  }

  public void removeFromProfilImpression(etudiants.utt.fr.eo.EOProfilImpression object) {
    excludeObjectFromPropertyWithKey(object, _EOIndividu.PROFIL_IMPRESSION_KEY);
  }

  public void addToProfilImpressionRelationship(etudiants.utt.fr.eo.EOProfilImpression object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("adding " + object + " to profilImpression relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToProfilImpression(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOIndividu.PROFIL_IMPRESSION_KEY);
    }
  }

  public void removeFromProfilImpressionRelationship(etudiants.utt.fr.eo.EOProfilImpression object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("removing " + object + " from profilImpression relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromProfilImpression(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.PROFIL_IMPRESSION_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOProfilImpression createProfilImpressionRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOProfilImpression.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOIndividu.PROFIL_IMPRESSION_KEY);
    return (etudiants.utt.fr.eo.EOProfilImpression) eo;
  }

  public void deleteProfilImpressionRelationship(etudiants.utt.fr.eo.EOProfilImpression object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.PROFIL_IMPRESSION_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProfilImpressionRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOProfilImpression> objects = profilImpression().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProfilImpressionRelationship(objects.nextElement());
    }
  }

  public NSArray<gestionuv.utt.fr.eo.UvOuvResp> uvOuvResps() {
    return (NSArray<gestionuv.utt.fr.eo.UvOuvResp>)storedValueForKey(_EOIndividu.UV_OUV_RESPS_KEY);
  }

  public NSArray<gestionuv.utt.fr.eo.UvOuvResp> uvOuvResps(EOQualifier qualifier) {
    return uvOuvResps(qualifier, null);
  }

  public NSArray<gestionuv.utt.fr.eo.UvOuvResp> uvOuvResps(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<gestionuv.utt.fr.eo.UvOuvResp> results;
      results = uvOuvResps();
      if (qualifier != null) {
        results = (NSArray<gestionuv.utt.fr.eo.UvOuvResp>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<gestionuv.utt.fr.eo.UvOuvResp>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToUvOuvResps(gestionuv.utt.fr.eo.UvOuvResp object) {
    includeObjectIntoPropertyWithKey(object, _EOIndividu.UV_OUV_RESPS_KEY);
  }

  public void removeFromUvOuvResps(gestionuv.utt.fr.eo.UvOuvResp object) {
    excludeObjectFromPropertyWithKey(object, _EOIndividu.UV_OUV_RESPS_KEY);
  }

  public void addToUvOuvRespsRelationship(gestionuv.utt.fr.eo.UvOuvResp object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("adding " + object + " to uvOuvResps relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToUvOuvResps(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOIndividu.UV_OUV_RESPS_KEY);
    }
  }

  public void removeFromUvOuvRespsRelationship(gestionuv.utt.fr.eo.UvOuvResp object) {
    if (_EOIndividu.LOG.isDebugEnabled()) {
      _EOIndividu.LOG.debug("removing " + object + " from uvOuvResps relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromUvOuvResps(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.UV_OUV_RESPS_KEY);
    }
  }

  public gestionuv.utt.fr.eo.UvOuvResp createUvOuvRespsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.UvOuvResp.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOIndividu.UV_OUV_RESPS_KEY);
    return (gestionuv.utt.fr.eo.UvOuvResp) eo;
  }

  public void deleteUvOuvRespsRelationship(gestionuv.utt.fr.eo.UvOuvResp object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOIndividu.UV_OUV_RESPS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllUvOuvRespsRelationships() {
    Enumeration<gestionuv.utt.fr.eo.UvOuvResp> objects = uvOuvResps().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteUvOuvRespsRelationship(objects.nextElement());
    }
  }


  public static EOIndividu createEOIndividu(EOEditingContext editingContext, Long indivId
, String nom
, String nomNais
, String prenom
, String prenom1
) {
    EOIndividu eo = (EOIndividu) EOUtilities.createAndInsertInstance(editingContext, _EOIndividu.ENTITY_NAME);    
		eo.setIndivId(indivId);
		eo.setNom(nom);
		eo.setNomNais(nomNais);
		eo.setPrenom(prenom);
		eo.setPrenom1(prenom1);
    return eo;
  }

  public static ERXFetchSpecification<EOIndividu> fetchSpec() {
    return new ERXFetchSpecification<EOIndividu>(_EOIndividu.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOIndividu> fetchAllEOIndividus(EOEditingContext editingContext) {
    return _EOIndividu.fetchAllEOIndividus(editingContext, null);
  }

  public static NSArray<EOIndividu> fetchAllEOIndividus(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOIndividu.fetchEOIndividus(editingContext, null, sortOrderings);
  }

  public static NSArray<EOIndividu> fetchEOIndividus(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOIndividu> fetchSpec = new ERXFetchSpecification<EOIndividu>(_EOIndividu.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOIndividu> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOIndividu fetchEOIndividu(EOEditingContext editingContext, String keyName, Object value) {
    return _EOIndividu.fetchEOIndividu(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOIndividu fetchEOIndividu(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOIndividu> eoObjects = _EOIndividu.fetchEOIndividus(editingContext, qualifier, null);
    EOIndividu eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOIndividu that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOIndividu fetchRequiredEOIndividu(EOEditingContext editingContext, String keyName, Object value) {
    return _EOIndividu.fetchRequiredEOIndividu(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOIndividu fetchRequiredEOIndividu(EOEditingContext editingContext, EOQualifier qualifier) {
    EOIndividu eoObject = _EOIndividu.fetchEOIndividu(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOIndividu that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOIndividu localInstanceIn(EOEditingContext editingContext, EOIndividu eo) {
    EOIndividu localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<etudiants.utt.fr.eo.EOIndividu> fetchLeConseiller(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("leConseiller", _EOIndividu.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOIndividu>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOIndividu> fetchLeConseiller(EOEditingContext editingContext,
	String anUnivBinding,
	Long etuidBinding,
	String prdUnivBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("leConseiller", _EOIndividu.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(anUnivBinding, "anUniv");
    bindings.takeValueForKey(etuidBinding, "etuid");
    bindings.takeValueForKey(prdUnivBinding, "prdUniv");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOIndividu>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOIndividu> fetchLesConseillers(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("lesConseillers", _EOIndividu.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOIndividu>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOIndividu> fetchLesConseillers(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("lesConseillers", _EOIndividu.ENTITY_NAME);
    return (NSArray<etudiants.utt.fr.eo.EOIndividu>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOIndividu> fetchLesResponsables(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("lesResponsables", _EOIndividu.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOIndividu>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOIndividu> fetchLesResponsables(EOEditingContext editingContext,
	String anUnivBinding,
	Long indivIdBinding,
	String prdUnivBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("lesResponsables", _EOIndividu.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(anUnivBinding, "anUniv");
    bindings.takeValueForKey(indivIdBinding, "indivId");
    bindings.takeValueForKey(prdUnivBinding, "prdUniv");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOIndividu>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOIndividu> fetchStudentsOnly(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("studentsOnly", _EOIndividu.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOIndividu>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOIndividu> fetchStudentsOnly(EOEditingContext editingContext,
	Long indivIdBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("studentsOnly", _EOIndividu.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(indivIdBinding, "indivId");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOIndividu>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
