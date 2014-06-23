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
// DO NOT EDIT.  Make changes to EOVueDiplSpec.java instead.
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
public abstract class _EOVueDiplSpec extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueDiplSpec";

  // Attribute Keys
  public static final ERXKey<String> DEB_PRD = new ERXKey<String>("debPrd");
  public static final ERXKey<String> DIPLOMEC = new ERXKey<String>("diplomec");
  public static final ERXKey<String> DIPL_SPEC = new ERXKey<String>("diplSpec");
  public static final ERXKey<String> DIPL_SPEC_ABR = new ERXKey<String>("diplSpecAbr");
  public static final ERXKey<String> DIPL_SPEC_AN = new ERXKey<String>("diplSpecAn");
  public static final ERXKey<String> DIPL_SPECC = new ERXKey<String>("diplSpecc");
  public static final ERXKey<Long> DIPL_SPEC_LIB_ID = new ERXKey<Long>("diplSpecLibId");
  public static final ERXKey<String> FIN_PRD = new ERXKey<String>("finPrd");
  public static final ERXKey<String> STOP_PRD = new ERXKey<String>("stopPrd");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm> EO_ETUDIANT_INSCR_ADM = new ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm>("eoEtudiantInscrAdm");

  // Attributes
  public static final String DEB_PRD_KEY = DEB_PRD.key();
  public static final String DIPLOMEC_KEY = DIPLOMEC.key();
  public static final String DIPL_SPEC_KEY = DIPL_SPEC.key();
  public static final String DIPL_SPEC_ABR_KEY = DIPL_SPEC_ABR.key();
  public static final String DIPL_SPEC_AN_KEY = DIPL_SPEC_AN.key();
  public static final String DIPL_SPECC_KEY = DIPL_SPECC.key();
  public static final String DIPL_SPEC_LIB_ID_KEY = DIPL_SPEC_LIB_ID.key();
  public static final String FIN_PRD_KEY = FIN_PRD.key();
  public static final String STOP_PRD_KEY = STOP_PRD.key();
  // Relationships
  public static final String EO_ETUDIANT_INSCR_ADM_KEY = EO_ETUDIANT_INSCR_ADM.key();

  private static Logger LOG = Logger.getLogger(_EOVueDiplSpec.class);

  public EOVueDiplSpec localInstanceIn(EOEditingContext editingContext) {
    EOVueDiplSpec localInstance = (EOVueDiplSpec)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String debPrd() {
    return (String) storedValueForKey(_EOVueDiplSpec.DEB_PRD_KEY);
  }

  public void setDebPrd(String value) {
    if (_EOVueDiplSpec.LOG.isDebugEnabled()) {
    	_EOVueDiplSpec.LOG.debug( "updating debPrd from " + debPrd() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplSpec.DEB_PRD_KEY);
  }

  public String diplomec() {
    return (String) storedValueForKey(_EOVueDiplSpec.DIPLOMEC_KEY);
  }

  public void setDiplomec(String value) {
    if (_EOVueDiplSpec.LOG.isDebugEnabled()) {
    	_EOVueDiplSpec.LOG.debug( "updating diplomec from " + diplomec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplSpec.DIPLOMEC_KEY);
  }

  public String diplSpec() {
    return (String) storedValueForKey(_EOVueDiplSpec.DIPL_SPEC_KEY);
  }

  public void setDiplSpec(String value) {
    if (_EOVueDiplSpec.LOG.isDebugEnabled()) {
    	_EOVueDiplSpec.LOG.debug( "updating diplSpec from " + diplSpec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplSpec.DIPL_SPEC_KEY);
  }

  public String diplSpecAbr() {
    return (String) storedValueForKey(_EOVueDiplSpec.DIPL_SPEC_ABR_KEY);
  }

  public void setDiplSpecAbr(String value) {
    if (_EOVueDiplSpec.LOG.isDebugEnabled()) {
    	_EOVueDiplSpec.LOG.debug( "updating diplSpecAbr from " + diplSpecAbr() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplSpec.DIPL_SPEC_ABR_KEY);
  }

  public String diplSpecAn() {
    return (String) storedValueForKey(_EOVueDiplSpec.DIPL_SPEC_AN_KEY);
  }

  public void setDiplSpecAn(String value) {
    if (_EOVueDiplSpec.LOG.isDebugEnabled()) {
    	_EOVueDiplSpec.LOG.debug( "updating diplSpecAn from " + diplSpecAn() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplSpec.DIPL_SPEC_AN_KEY);
  }

  public String diplSpecc() {
    return (String) storedValueForKey(_EOVueDiplSpec.DIPL_SPECC_KEY);
  }

  public void setDiplSpecc(String value) {
    if (_EOVueDiplSpec.LOG.isDebugEnabled()) {
    	_EOVueDiplSpec.LOG.debug( "updating diplSpecc from " + diplSpecc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplSpec.DIPL_SPECC_KEY);
  }

  public Long diplSpecLibId() {
    return (Long) storedValueForKey(_EOVueDiplSpec.DIPL_SPEC_LIB_ID_KEY);
  }

  public void setDiplSpecLibId(Long value) {
    if (_EOVueDiplSpec.LOG.isDebugEnabled()) {
    	_EOVueDiplSpec.LOG.debug( "updating diplSpecLibId from " + diplSpecLibId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplSpec.DIPL_SPEC_LIB_ID_KEY);
  }

  public String finPrd() {
    return (String) storedValueForKey(_EOVueDiplSpec.FIN_PRD_KEY);
  }

  public void setFinPrd(String value) {
    if (_EOVueDiplSpec.LOG.isDebugEnabled()) {
    	_EOVueDiplSpec.LOG.debug( "updating finPrd from " + finPrd() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplSpec.FIN_PRD_KEY);
  }

  public String stopPrd() {
    return (String) storedValueForKey(_EOVueDiplSpec.STOP_PRD_KEY);
  }

  public void setStopPrd(String value) {
    if (_EOVueDiplSpec.LOG.isDebugEnabled()) {
    	_EOVueDiplSpec.LOG.debug( "updating stopPrd from " + stopPrd() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplSpec.STOP_PRD_KEY);
  }

  public etudiants.utt.fr.eo.EOEtudiantInscrAdm eoEtudiantInscrAdm() {
    return (etudiants.utt.fr.eo.EOEtudiantInscrAdm)storedValueForKey(_EOVueDiplSpec.EO_ETUDIANT_INSCR_ADM_KEY);
  }
  
  public void setEoEtudiantInscrAdm(etudiants.utt.fr.eo.EOEtudiantInscrAdm value) {
    takeStoredValueForKey(value, _EOVueDiplSpec.EO_ETUDIANT_INSCR_ADM_KEY);
  }

  public void setEoEtudiantInscrAdmRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm value) {
    if (_EOVueDiplSpec.LOG.isDebugEnabled()) {
      _EOVueDiplSpec.LOG.debug("updating eoEtudiantInscrAdm from " + eoEtudiantInscrAdm() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setEoEtudiantInscrAdm(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOEtudiantInscrAdm oldValue = eoEtudiantInscrAdm();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOVueDiplSpec.EO_ETUDIANT_INSCR_ADM_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOVueDiplSpec.EO_ETUDIANT_INSCR_ADM_KEY);
    }
  }
  

  public static EOVueDiplSpec createEOVueDiplSpec(EOEditingContext editingContext, String diplomec
, String diplSpecc
, Long diplSpecLibId
, etudiants.utt.fr.eo.EOEtudiantInscrAdm eoEtudiantInscrAdm) {
    EOVueDiplSpec eo = (EOVueDiplSpec) EOUtilities.createAndInsertInstance(editingContext, _EOVueDiplSpec.ENTITY_NAME);    
		eo.setDiplomec(diplomec);
		eo.setDiplSpecc(diplSpecc);
		eo.setDiplSpecLibId(diplSpecLibId);
    eo.setEoEtudiantInscrAdmRelationship(eoEtudiantInscrAdm);
    return eo;
  }

  public static ERXFetchSpecification<EOVueDiplSpec> fetchSpec() {
    return new ERXFetchSpecification<EOVueDiplSpec>(_EOVueDiplSpec.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueDiplSpec> fetchAllEOVueDiplSpecs(EOEditingContext editingContext) {
    return _EOVueDiplSpec.fetchAllEOVueDiplSpecs(editingContext, null);
  }

  public static NSArray<EOVueDiplSpec> fetchAllEOVueDiplSpecs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueDiplSpec.fetchEOVueDiplSpecs(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueDiplSpec> fetchEOVueDiplSpecs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueDiplSpec> fetchSpec = new ERXFetchSpecification<EOVueDiplSpec>(_EOVueDiplSpec.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueDiplSpec> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueDiplSpec fetchEOVueDiplSpec(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueDiplSpec.fetchEOVueDiplSpec(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueDiplSpec fetchEOVueDiplSpec(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueDiplSpec> eoObjects = _EOVueDiplSpec.fetchEOVueDiplSpecs(editingContext, qualifier, null);
    EOVueDiplSpec eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueDiplSpec that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueDiplSpec fetchRequiredEOVueDiplSpec(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueDiplSpec.fetchRequiredEOVueDiplSpec(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueDiplSpec fetchRequiredEOVueDiplSpec(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueDiplSpec eoObject = _EOVueDiplSpec.fetchEOVueDiplSpec(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueDiplSpec that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueDiplSpec localInstanceIn(EOEditingContext editingContext, EOVueDiplSpec eo) {
    EOVueDiplSpec localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
