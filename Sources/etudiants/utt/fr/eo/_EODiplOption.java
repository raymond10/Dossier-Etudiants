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
// DO NOT EDIT.  Make changes to EODiplOption.java instead.
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
public abstract class _EODiplOption extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EODiplOption";

  // Attribute Keys
  public static final ERXKey<String> CODE_HAB_SISE = new ERXKey<String>("codeHabSise");
  public static final ERXKey<String> DEB_AN_UNIV = new ERXKey<String>("debAnUniv");
  public static final ERXKey<String> DEB_PRD_UNIV = new ERXKey<String>("debPrdUniv");
  public static final ERXKey<String> DIPLOMEC = new ERXKey<String>("diplomec");
  public static final ERXKey<String> DIPL_OPT = new ERXKey<String>("diplOpt");
  public static final ERXKey<String> DIPL_OPT_ABR = new ERXKey<String>("diplOptAbr");
  public static final ERXKey<String> DIPL_OPT_AN = new ERXKey<String>("diplOptAn");
  public static final ERXKey<String> DIPL_OPTC = new ERXKey<String>("diplOptc");
  public static final ERXKey<String> DIPL_SPECC = new ERXKey<String>("diplSpecc");
  public static final ERXKey<String> FERM_AN_UNIV = new ERXKey<String>("fermAnUniv");
  public static final ERXKey<String> FERM_PRD_UNIV = new ERXKey<String>("fermPrdUniv");
  public static final ERXKey<Long> RESP_UT_ID = new ERXKey<Long>("respUtId");
  public static final ERXKey<String> STOP_AN_UNIV = new ERXKey<String>("stopAnUniv");
  public static final ERXKey<String> STOP_PRD_UNIV = new ERXKey<String>("stopPrdUniv");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EODiplome> DIPLOME = new ERXKey<etudiants.utt.fr.eo.EODiplome>("diplome");
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm> ETU_INSCR_ADMS = new ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm>("etuInscrAdms");
  public static final ERXKey<etudiants.utt.fr.eo.EORefPeriode> REF_PERIODE = new ERXKey<etudiants.utt.fr.eo.EORefPeriode>("refPeriode");
  public static final ERXKey<etudiants.utt.fr.eo.EORefPeriode> REF_PERIODE0 = new ERXKey<etudiants.utt.fr.eo.EORefPeriode>("refPeriode0");
  public static final ERXKey<etudiants.utt.fr.eo.EORefPeriode> REF_PERIODE1 = new ERXKey<etudiants.utt.fr.eo.EORefPeriode>("refPeriode1");

  // Attributes
  public static final String CODE_HAB_SISE_KEY = CODE_HAB_SISE.key();
  public static final String DEB_AN_UNIV_KEY = DEB_AN_UNIV.key();
  public static final String DEB_PRD_UNIV_KEY = DEB_PRD_UNIV.key();
  public static final String DIPLOMEC_KEY = DIPLOMEC.key();
  public static final String DIPL_OPT_KEY = DIPL_OPT.key();
  public static final String DIPL_OPT_ABR_KEY = DIPL_OPT_ABR.key();
  public static final String DIPL_OPT_AN_KEY = DIPL_OPT_AN.key();
  public static final String DIPL_OPTC_KEY = DIPL_OPTC.key();
  public static final String DIPL_SPECC_KEY = DIPL_SPECC.key();
  public static final String FERM_AN_UNIV_KEY = FERM_AN_UNIV.key();
  public static final String FERM_PRD_UNIV_KEY = FERM_PRD_UNIV.key();
  public static final String RESP_UT_ID_KEY = RESP_UT_ID.key();
  public static final String STOP_AN_UNIV_KEY = STOP_AN_UNIV.key();
  public static final String STOP_PRD_UNIV_KEY = STOP_PRD_UNIV.key();
  // Relationships
  public static final String DIPLOME_KEY = DIPLOME.key();
  public static final String ETU_INSCR_ADMS_KEY = ETU_INSCR_ADMS.key();
  public static final String REF_PERIODE_KEY = REF_PERIODE.key();
  public static final String REF_PERIODE0_KEY = REF_PERIODE0.key();
  public static final String REF_PERIODE1_KEY = REF_PERIODE1.key();

  private static Logger LOG = Logger.getLogger(_EODiplOption.class);

  public EODiplOption localInstanceIn(EOEditingContext editingContext) {
    EODiplOption localInstance = (EODiplOption)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String codeHabSise() {
    return (String) storedValueForKey(_EODiplOption.CODE_HAB_SISE_KEY);
  }

  public void setCodeHabSise(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating codeHabSise from " + codeHabSise() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.CODE_HAB_SISE_KEY);
  }

  public String debAnUniv() {
    return (String) storedValueForKey(_EODiplOption.DEB_AN_UNIV_KEY);
  }

  public void setDebAnUniv(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating debAnUniv from " + debAnUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.DEB_AN_UNIV_KEY);
  }

  public String debPrdUniv() {
    return (String) storedValueForKey(_EODiplOption.DEB_PRD_UNIV_KEY);
  }

  public void setDebPrdUniv(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating debPrdUniv from " + debPrdUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.DEB_PRD_UNIV_KEY);
  }

  public String diplomec() {
    return (String) storedValueForKey(_EODiplOption.DIPLOMEC_KEY);
  }

  public void setDiplomec(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating diplomec from " + diplomec() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.DIPLOMEC_KEY);
  }

  public String diplOpt() {
    return (String) storedValueForKey(_EODiplOption.DIPL_OPT_KEY);
  }

  public void setDiplOpt(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating diplOpt from " + diplOpt() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.DIPL_OPT_KEY);
  }

  public String diplOptAbr() {
    return (String) storedValueForKey(_EODiplOption.DIPL_OPT_ABR_KEY);
  }

  public void setDiplOptAbr(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating diplOptAbr from " + diplOptAbr() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.DIPL_OPT_ABR_KEY);
  }

  public String diplOptAn() {
    return (String) storedValueForKey(_EODiplOption.DIPL_OPT_AN_KEY);
  }

  public void setDiplOptAn(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating diplOptAn from " + diplOptAn() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.DIPL_OPT_AN_KEY);
  }

  public String diplOptc() {
    return (String) storedValueForKey(_EODiplOption.DIPL_OPTC_KEY);
  }

  public void setDiplOptc(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating diplOptc from " + diplOptc() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.DIPL_OPTC_KEY);
  }

  public String diplSpecc() {
    return (String) storedValueForKey(_EODiplOption.DIPL_SPECC_KEY);
  }

  public void setDiplSpecc(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating diplSpecc from " + diplSpecc() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.DIPL_SPECC_KEY);
  }

  public String fermAnUniv() {
    return (String) storedValueForKey(_EODiplOption.FERM_AN_UNIV_KEY);
  }

  public void setFermAnUniv(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating fermAnUniv from " + fermAnUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.FERM_AN_UNIV_KEY);
  }

  public String fermPrdUniv() {
    return (String) storedValueForKey(_EODiplOption.FERM_PRD_UNIV_KEY);
  }

  public void setFermPrdUniv(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating fermPrdUniv from " + fermPrdUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.FERM_PRD_UNIV_KEY);
  }

  public Long respUtId() {
    return (Long) storedValueForKey(_EODiplOption.RESP_UT_ID_KEY);
  }

  public void setRespUtId(Long value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating respUtId from " + respUtId() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.RESP_UT_ID_KEY);
  }

  public String stopAnUniv() {
    return (String) storedValueForKey(_EODiplOption.STOP_AN_UNIV_KEY);
  }

  public void setStopAnUniv(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating stopAnUniv from " + stopAnUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.STOP_AN_UNIV_KEY);
  }

  public String stopPrdUniv() {
    return (String) storedValueForKey(_EODiplOption.STOP_PRD_UNIV_KEY);
  }

  public void setStopPrdUniv(String value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
    	_EODiplOption.LOG.debug( "updating stopPrdUniv from " + stopPrdUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EODiplOption.STOP_PRD_UNIV_KEY);
  }

  public etudiants.utt.fr.eo.EODiplome diplome() {
    return (etudiants.utt.fr.eo.EODiplome)storedValueForKey(_EODiplOption.DIPLOME_KEY);
  }
  
  public void setDiplome(etudiants.utt.fr.eo.EODiplome value) {
    takeStoredValueForKey(value, _EODiplOption.DIPLOME_KEY);
  }

  public void setDiplomeRelationship(etudiants.utt.fr.eo.EODiplome value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
      _EODiplOption.LOG.debug("updating diplome from " + diplome() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setDiplome(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EODiplome oldValue = diplome();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EODiplOption.DIPLOME_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EODiplOption.DIPLOME_KEY);
    }
  }
  
  public etudiants.utt.fr.eo.EORefPeriode refPeriode() {
    return (etudiants.utt.fr.eo.EORefPeriode)storedValueForKey(_EODiplOption.REF_PERIODE_KEY);
  }
  
  public void setRefPeriode(etudiants.utt.fr.eo.EORefPeriode value) {
    takeStoredValueForKey(value, _EODiplOption.REF_PERIODE_KEY);
  }

  public void setRefPeriodeRelationship(etudiants.utt.fr.eo.EORefPeriode value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
      _EODiplOption.LOG.debug("updating refPeriode from " + refPeriode() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setRefPeriode(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EORefPeriode oldValue = refPeriode();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EODiplOption.REF_PERIODE_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EODiplOption.REF_PERIODE_KEY);
    }
  }
  
  public etudiants.utt.fr.eo.EORefPeriode refPeriode0() {
    return (etudiants.utt.fr.eo.EORefPeriode)storedValueForKey(_EODiplOption.REF_PERIODE0_KEY);
  }
  
  public void setRefPeriode0(etudiants.utt.fr.eo.EORefPeriode value) {
    takeStoredValueForKey(value, _EODiplOption.REF_PERIODE0_KEY);
  }

  public void setRefPeriode0Relationship(etudiants.utt.fr.eo.EORefPeriode value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
      _EODiplOption.LOG.debug("updating refPeriode0 from " + refPeriode0() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setRefPeriode0(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EORefPeriode oldValue = refPeriode0();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EODiplOption.REF_PERIODE0_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EODiplOption.REF_PERIODE0_KEY);
    }
  }
  
  public etudiants.utt.fr.eo.EORefPeriode refPeriode1() {
    return (etudiants.utt.fr.eo.EORefPeriode)storedValueForKey(_EODiplOption.REF_PERIODE1_KEY);
  }
  
  public void setRefPeriode1(etudiants.utt.fr.eo.EORefPeriode value) {
    takeStoredValueForKey(value, _EODiplOption.REF_PERIODE1_KEY);
  }

  public void setRefPeriode1Relationship(etudiants.utt.fr.eo.EORefPeriode value) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
      _EODiplOption.LOG.debug("updating refPeriode1 from " + refPeriode1() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setRefPeriode1(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EORefPeriode oldValue = refPeriode1();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EODiplOption.REF_PERIODE1_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EODiplOption.REF_PERIODE1_KEY);
    }
  }
  
  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> etuInscrAdms() {
    return (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)storedValueForKey(_EODiplOption.ETU_INSCR_ADMS_KEY);
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOEtudiantInscrAdm.DIPL_OPTION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
    includeObjectIntoPropertyWithKey(object, _EODiplOption.ETU_INSCR_ADMS_KEY);
  }

  public void removeFromEtuInscrAdms(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    excludeObjectFromPropertyWithKey(object, _EODiplOption.ETU_INSCR_ADMS_KEY);
  }

  public void addToEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
      _EODiplOption.LOG.debug("adding " + object + " to etuInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEtuInscrAdms(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EODiplOption.ETU_INSCR_ADMS_KEY);
    }
  }

  public void removeFromEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EODiplOption.LOG.isDebugEnabled()) {
      _EODiplOption.LOG.debug("removing " + object + " from etuInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEtuInscrAdms(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EODiplOption.ETU_INSCR_ADMS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOEtudiantInscrAdm createEtuInscrAdmsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOEtudiantInscrAdm.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EODiplOption.ETU_INSCR_ADMS_KEY);
    return (etudiants.utt.fr.eo.EOEtudiantInscrAdm) eo;
  }

  public void deleteEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EODiplOption.ETU_INSCR_ADMS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEtuInscrAdmsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOEtudiantInscrAdm> objects = etuInscrAdms().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEtuInscrAdmsRelationship(objects.nextElement());
    }
  }


  public static EODiplOption createEODiplOption(EOEditingContext editingContext, String diplOptc
) {
    EODiplOption eo = (EODiplOption) EOUtilities.createAndInsertInstance(editingContext, _EODiplOption.ENTITY_NAME);    
		eo.setDiplOptc(diplOptc);
    return eo;
  }

  public static ERXFetchSpecification<EODiplOption> fetchSpec() {
    return new ERXFetchSpecification<EODiplOption>(_EODiplOption.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EODiplOption> fetchAllEODiplOptions(EOEditingContext editingContext) {
    return _EODiplOption.fetchAllEODiplOptions(editingContext, null);
  }

  public static NSArray<EODiplOption> fetchAllEODiplOptions(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EODiplOption.fetchEODiplOptions(editingContext, null, sortOrderings);
  }

  public static NSArray<EODiplOption> fetchEODiplOptions(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EODiplOption> fetchSpec = new ERXFetchSpecification<EODiplOption>(_EODiplOption.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EODiplOption> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EODiplOption fetchEODiplOption(EOEditingContext editingContext, String keyName, Object value) {
    return _EODiplOption.fetchEODiplOption(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EODiplOption fetchEODiplOption(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EODiplOption> eoObjects = _EODiplOption.fetchEODiplOptions(editingContext, qualifier, null);
    EODiplOption eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EODiplOption that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EODiplOption fetchRequiredEODiplOption(EOEditingContext editingContext, String keyName, Object value) {
    return _EODiplOption.fetchRequiredEODiplOption(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EODiplOption fetchRequiredEODiplOption(EOEditingContext editingContext, EOQualifier qualifier) {
    EODiplOption eoObject = _EODiplOption.fetchEODiplOption(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EODiplOption that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EODiplOption localInstanceIn(EOEditingContext editingContext, EODiplOption eo) {
    EODiplOption localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
