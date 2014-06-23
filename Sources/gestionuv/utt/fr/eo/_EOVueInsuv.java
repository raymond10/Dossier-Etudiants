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
// DO NOT EDIT.  Make changes to EOVueInsuv.java instead.
package gestionuv.utt.fr.eo;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _EOVueInsuv extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueInsuv";

  // Attribute Keys
  public static final ERXKey<String> ACTIVEF = new ERXKey<String>("activef");
  public static final ERXKey<String> AN_UNIV = new ERXKey<String>("anUniv");
  public static final ERXKey<Long> CATEG_ID_INSUV = new ERXKey<Long>("categIdInsuv");
  public static final ERXKey<String> DIPLOMEC = new ERXKey<String>("diplomec");
  public static final ERXKey<Long> ETU_ID = new ERXKey<Long>("etuId");
  public static final ERXKey<String> INSCR_ADM_ID = new ERXKey<String>("inscrAdmId");
  public static final ERXKey<String> MODIF_MANF = new ERXKey<String>("modifManf");
  public static final ERXKey<String> NB_CREDITS_ECTS_INSUV = new ERXKey<String>("nbCreditsEctsInsuv");
  public static final ERXKey<String> NB_CREDITS_ECTS_INSUVP = new ERXKey<String>("nbCreditsEctsInsuvp");
  public static final ERXKey<Long> NLE_UV_OUVERTE_ID = new ERXKey<Long>("nleUvOuverteId");
  public static final ERXKey<String> NOM_PRENOM = new ERXKey<String>("nomPrenom");
  public static final ERXKey<String> PRD_UNIV = new ERXKey<String>("prdUniv");
  public static final ERXKey<String> PROFILF = new ERXKey<String>("profilf");
  public static final ERXKey<Long> PROFIL_ID = new ERXKey<Long>("profilId");
  public static final ERXKey<String> RAISON_ADM = new ERXKey<String>("raisonAdm");
  public static final ERXKey<String> RESUVC = new ERXKey<String>("resuvc");
  public static final ERXKey<String> UVC = new ERXKey<String>("uvc");
  public static final ERXKey<String> VMS_SESSION = new ERXKey<String>("vmsSession");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm> EO_ETUDIANT_INSCR_ADM = new ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm>("eoEtudiantInscrAdm");

  // Attributes
  public static final String ACTIVEF_KEY = ACTIVEF.key();
  public static final String AN_UNIV_KEY = AN_UNIV.key();
  public static final String CATEG_ID_INSUV_KEY = CATEG_ID_INSUV.key();
  public static final String DIPLOMEC_KEY = DIPLOMEC.key();
  public static final String ETU_ID_KEY = ETU_ID.key();
  public static final String INSCR_ADM_ID_KEY = INSCR_ADM_ID.key();
  public static final String MODIF_MANF_KEY = MODIF_MANF.key();
  public static final String NB_CREDITS_ECTS_INSUV_KEY = NB_CREDITS_ECTS_INSUV.key();
  public static final String NB_CREDITS_ECTS_INSUVP_KEY = NB_CREDITS_ECTS_INSUVP.key();
  public static final String NLE_UV_OUVERTE_ID_KEY = NLE_UV_OUVERTE_ID.key();
  public static final String NOM_PRENOM_KEY = NOM_PRENOM.key();
  public static final String PRD_UNIV_KEY = PRD_UNIV.key();
  public static final String PROFILF_KEY = PROFILF.key();
  public static final String PROFIL_ID_KEY = PROFIL_ID.key();
  public static final String RAISON_ADM_KEY = RAISON_ADM.key();
  public static final String RESUVC_KEY = RESUVC.key();
  public static final String UVC_KEY = UVC.key();
  public static final String VMS_SESSION_KEY = VMS_SESSION.key();
  // Relationships
  public static final String EO_ETUDIANT_INSCR_ADM_KEY = EO_ETUDIANT_INSCR_ADM.key();

  private static Logger LOG = Logger.getLogger(_EOVueInsuv.class);

  public EOVueInsuv localInstanceIn(EOEditingContext editingContext) {
    EOVueInsuv localInstance = (EOVueInsuv)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String activef() {
    return (String) storedValueForKey(_EOVueInsuv.ACTIVEF_KEY);
  }

  public void setActivef(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating activef from " + activef() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.ACTIVEF_KEY);
  }

  public String anUniv() {
    return (String) storedValueForKey(_EOVueInsuv.AN_UNIV_KEY);
  }

  public void setAnUniv(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating anUniv from " + anUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.AN_UNIV_KEY);
  }

  public Long categIdInsuv() {
    return (Long) storedValueForKey(_EOVueInsuv.CATEG_ID_INSUV_KEY);
  }

  public void setCategIdInsuv(Long value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating categIdInsuv from " + categIdInsuv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.CATEG_ID_INSUV_KEY);
  }

  public String diplomec() {
    return (String) storedValueForKey(_EOVueInsuv.DIPLOMEC_KEY);
  }

  public void setDiplomec(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating diplomec from " + diplomec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.DIPLOMEC_KEY);
  }

  public Long etuId() {
    return (Long) storedValueForKey(_EOVueInsuv.ETU_ID_KEY);
  }

  public void setEtuId(Long value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating etuId from " + etuId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.ETU_ID_KEY);
  }

  public String inscrAdmId() {
    return (String) storedValueForKey(_EOVueInsuv.INSCR_ADM_ID_KEY);
  }

  public void setInscrAdmId(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating inscrAdmId from " + inscrAdmId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.INSCR_ADM_ID_KEY);
  }

  public String modifManf() {
    return (String) storedValueForKey(_EOVueInsuv.MODIF_MANF_KEY);
  }

  public void setModifManf(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating modifManf from " + modifManf() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.MODIF_MANF_KEY);
  }

  public String nbCreditsEctsInsuv() {
    return (String) storedValueForKey(_EOVueInsuv.NB_CREDITS_ECTS_INSUV_KEY);
  }

  public void setNbCreditsEctsInsuv(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating nbCreditsEctsInsuv from " + nbCreditsEctsInsuv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.NB_CREDITS_ECTS_INSUV_KEY);
  }

  public String nbCreditsEctsInsuvp() {
    return (String) storedValueForKey(_EOVueInsuv.NB_CREDITS_ECTS_INSUVP_KEY);
  }

  public void setNbCreditsEctsInsuvp(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating nbCreditsEctsInsuvp from " + nbCreditsEctsInsuvp() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.NB_CREDITS_ECTS_INSUVP_KEY);
  }

  public Long nleUvOuverteId() {
    return (Long) storedValueForKey(_EOVueInsuv.NLE_UV_OUVERTE_ID_KEY);
  }

  public void setNleUvOuverteId(Long value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating nleUvOuverteId from " + nleUvOuverteId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.NLE_UV_OUVERTE_ID_KEY);
  }

  public String nomPrenom() {
    return (String) storedValueForKey(_EOVueInsuv.NOM_PRENOM_KEY);
  }

  public void setNomPrenom(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating nomPrenom from " + nomPrenom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.NOM_PRENOM_KEY);
  }

  public String prdUniv() {
    return (String) storedValueForKey(_EOVueInsuv.PRD_UNIV_KEY);
  }

  public void setPrdUniv(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating prdUniv from " + prdUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.PRD_UNIV_KEY);
  }

  public String profilf() {
    return (String) storedValueForKey(_EOVueInsuv.PROFILF_KEY);
  }

  public void setProfilf(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating profilf from " + profilf() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.PROFILF_KEY);
  }

  public Long profilId() {
    return (Long) storedValueForKey(_EOVueInsuv.PROFIL_ID_KEY);
  }

  public void setProfilId(Long value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating profilId from " + profilId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.PROFIL_ID_KEY);
  }

  public String raisonAdm() {
    return (String) storedValueForKey(_EOVueInsuv.RAISON_ADM_KEY);
  }

  public void setRaisonAdm(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating raisonAdm from " + raisonAdm() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.RAISON_ADM_KEY);
  }

  public String resuvc() {
    return (String) storedValueForKey(_EOVueInsuv.RESUVC_KEY);
  }

  public void setResuvc(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating resuvc from " + resuvc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.RESUVC_KEY);
  }

  public String uvc() {
    return (String) storedValueForKey(_EOVueInsuv.UVC_KEY);
  }

  public void setUvc(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating uvc from " + uvc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.UVC_KEY);
  }

  public String vmsSession() {
    return (String) storedValueForKey(_EOVueInsuv.VMS_SESSION_KEY);
  }

  public void setVmsSession(String value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
    	_EOVueInsuv.LOG.debug( "updating vmsSession from " + vmsSession() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueInsuv.VMS_SESSION_KEY);
  }

  public etudiants.utt.fr.eo.EOEtudiantInscrAdm eoEtudiantInscrAdm() {
    return (etudiants.utt.fr.eo.EOEtudiantInscrAdm)storedValueForKey(_EOVueInsuv.EO_ETUDIANT_INSCR_ADM_KEY);
  }
  
  public void setEoEtudiantInscrAdm(etudiants.utt.fr.eo.EOEtudiantInscrAdm value) {
    takeStoredValueForKey(value, _EOVueInsuv.EO_ETUDIANT_INSCR_ADM_KEY);
  }

  public void setEoEtudiantInscrAdmRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm value) {
    if (_EOVueInsuv.LOG.isDebugEnabled()) {
      _EOVueInsuv.LOG.debug("updating eoEtudiantInscrAdm from " + eoEtudiantInscrAdm() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setEoEtudiantInscrAdm(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOEtudiantInscrAdm oldValue = eoEtudiantInscrAdm();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOVueInsuv.EO_ETUDIANT_INSCR_ADM_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOVueInsuv.EO_ETUDIANT_INSCR_ADM_KEY);
    }
  }
  

  public static EOVueInsuv createEOVueInsuv(EOEditingContext editingContext, String anUniv
, String diplomec
, Long etuId
, String inscrAdmId
, Long nleUvOuverteId
, String prdUniv
, etudiants.utt.fr.eo.EOEtudiantInscrAdm eoEtudiantInscrAdm) {
    EOVueInsuv eo = (EOVueInsuv) EOUtilities.createAndInsertInstance(editingContext, _EOVueInsuv.ENTITY_NAME);    
		eo.setAnUniv(anUniv);
		eo.setDiplomec(diplomec);
		eo.setEtuId(etuId);
		eo.setInscrAdmId(inscrAdmId);
		eo.setNleUvOuverteId(nleUvOuverteId);
		eo.setPrdUniv(prdUniv);
    eo.setEoEtudiantInscrAdmRelationship(eoEtudiantInscrAdm);
    return eo;
  }

  public static ERXFetchSpecification<EOVueInsuv> fetchSpec() {
    return new ERXFetchSpecification<EOVueInsuv>(_EOVueInsuv.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueInsuv> fetchAllEOVueInsuvs(EOEditingContext editingContext) {
    return _EOVueInsuv.fetchAllEOVueInsuvs(editingContext, null);
  }

  public static NSArray<EOVueInsuv> fetchAllEOVueInsuvs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueInsuv.fetchEOVueInsuvs(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueInsuv> fetchEOVueInsuvs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueInsuv> fetchSpec = new ERXFetchSpecification<EOVueInsuv>(_EOVueInsuv.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueInsuv> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueInsuv fetchEOVueInsuv(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueInsuv.fetchEOVueInsuv(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueInsuv fetchEOVueInsuv(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueInsuv> eoObjects = _EOVueInsuv.fetchEOVueInsuvs(editingContext, qualifier, null);
    EOVueInsuv eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueInsuv that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueInsuv fetchRequiredEOVueInsuv(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueInsuv.fetchRequiredEOVueInsuv(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueInsuv fetchRequiredEOVueInsuv(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueInsuv eoObject = _EOVueInsuv.fetchEOVueInsuv(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueInsuv that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueInsuv localInstanceIn(EOEditingContext editingContext, EOVueInsuv eo) {
    EOVueInsuv localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<gestionuv.utt.fr.eo.EOVueInsuv> fetchDistinctEtuID(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("distinctEtuID", _EOVueInsuv.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EOVueInsuv>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<gestionuv.utt.fr.eo.EOVueInsuv> fetchDistinctEtuID(EOEditingContext editingContext,
	String uvcBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("distinctEtuID", _EOVueInsuv.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(uvcBinding, "uvc");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EOVueInsuv>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}