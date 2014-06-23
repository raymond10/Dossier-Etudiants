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
// DO NOT EDIT.  Make changes to EOUvOuv.java instead.
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
public abstract class _EOUvOuv extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOUvOuv";

  // Attribute Keys
  public static final ERXKey<String> AN_UNIV = new ERXKey<String>("anUniv");
  public static final ERXKey<NSTimestamp> CRE_DATE = new ERXKey<NSTimestamp>("creDate");
  public static final ERXKey<String> EDC = new ERXKey<String>("edc");
  public static final ERXKey<Long> EFFECTIF = new ERXKey<Long>("effectif");
  public static final ERXKey<String> ENSF = new ERXKey<String>("ensf");
  public static final ERXKey<java.math.BigDecimal> LIMITE_MOY = new ERXKey<java.math.BigDecimal>("limiteMoy");
  public static final ERXKey<String> MAJ_AUTEUR = new ERXKey<String>("majAuteur");
  public static final ERXKey<NSTimestamp> MAJ_DATE = new ERXKey<NSTimestamp>("majDate");
  public static final ERXKey<String> PRD_UNIV = new ERXKey<String>("prdUniv");
  public static final ERXKey<Long> PROGRAMME_ID = new ERXKey<Long>("programmeId");
  public static final ERXKey<String> PUBLIQF = new ERXKey<String>("publiqf");
  public static final ERXKey<String> UVC = new ERXKey<String>("uvc");
  public static final ERXKey<Long> UV_OUV_ID = new ERXKey<Long>("uvOuvId");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EORefPeriode> EO_REF_PERIODES = new ERXKey<etudiants.utt.fr.eo.EORefPeriode>("eoRefPeriodes");
  public static final ERXKey<gestionuv.utt.fr.eo.EOUv> UV = new ERXKey<gestionuv.utt.fr.eo.EOUv>("uv");
  public static final ERXKey<gestionuv.utt.fr.eo.EOUvOuvertes> UV_OUVERTESS = new ERXKey<gestionuv.utt.fr.eo.EOUvOuvertes>("uvOuvertess");

  // Attributes
  public static final String AN_UNIV_KEY = AN_UNIV.key();
  public static final String CRE_DATE_KEY = CRE_DATE.key();
  public static final String EDC_KEY = EDC.key();
  public static final String EFFECTIF_KEY = EFFECTIF.key();
  public static final String ENSF_KEY = ENSF.key();
  public static final String LIMITE_MOY_KEY = LIMITE_MOY.key();
  public static final String MAJ_AUTEUR_KEY = MAJ_AUTEUR.key();
  public static final String MAJ_DATE_KEY = MAJ_DATE.key();
  public static final String PRD_UNIV_KEY = PRD_UNIV.key();
  public static final String PROGRAMME_ID_KEY = PROGRAMME_ID.key();
  public static final String PUBLIQF_KEY = PUBLIQF.key();
  public static final String UVC_KEY = UVC.key();
  public static final String UV_OUV_ID_KEY = UV_OUV_ID.key();
  // Relationships
  public static final String EO_REF_PERIODES_KEY = EO_REF_PERIODES.key();
  public static final String UV_KEY = UV.key();
  public static final String UV_OUVERTESS_KEY = UV_OUVERTESS.key();

  private static Logger LOG = Logger.getLogger(_EOUvOuv.class);

  public EOUvOuv localInstanceIn(EOEditingContext editingContext) {
    EOUvOuv localInstance = (EOUvOuv)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String anUniv() {
    return (String) storedValueForKey(_EOUvOuv.AN_UNIV_KEY);
  }

  public void setAnUniv(String value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating anUniv from " + anUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.AN_UNIV_KEY);
  }

  public NSTimestamp creDate() {
    return (NSTimestamp) storedValueForKey(_EOUvOuv.CRE_DATE_KEY);
  }

  public void setCreDate(NSTimestamp value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating creDate from " + creDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.CRE_DATE_KEY);
  }

  public String edc() {
    return (String) storedValueForKey(_EOUvOuv.EDC_KEY);
  }

  public void setEdc(String value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating edc from " + edc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.EDC_KEY);
  }

  public Long effectif() {
    return (Long) storedValueForKey(_EOUvOuv.EFFECTIF_KEY);
  }

  public void setEffectif(Long value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating effectif from " + effectif() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.EFFECTIF_KEY);
  }

  public String ensf() {
    return (String) storedValueForKey(_EOUvOuv.ENSF_KEY);
  }

  public void setEnsf(String value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating ensf from " + ensf() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.ENSF_KEY);
  }

  public java.math.BigDecimal limiteMoy() {
    return (java.math.BigDecimal) storedValueForKey(_EOUvOuv.LIMITE_MOY_KEY);
  }

  public void setLimiteMoy(java.math.BigDecimal value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating limiteMoy from " + limiteMoy() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.LIMITE_MOY_KEY);
  }

  public String majAuteur() {
    return (String) storedValueForKey(_EOUvOuv.MAJ_AUTEUR_KEY);
  }

  public void setMajAuteur(String value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating majAuteur from " + majAuteur() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.MAJ_AUTEUR_KEY);
  }

  public NSTimestamp majDate() {
    return (NSTimestamp) storedValueForKey(_EOUvOuv.MAJ_DATE_KEY);
  }

  public void setMajDate(NSTimestamp value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating majDate from " + majDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.MAJ_DATE_KEY);
  }

  public String prdUniv() {
    return (String) storedValueForKey(_EOUvOuv.PRD_UNIV_KEY);
  }

  public void setPrdUniv(String value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating prdUniv from " + prdUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.PRD_UNIV_KEY);
  }

  public Long programmeId() {
    return (Long) storedValueForKey(_EOUvOuv.PROGRAMME_ID_KEY);
  }

  public void setProgrammeId(Long value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating programmeId from " + programmeId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.PROGRAMME_ID_KEY);
  }

  public String publiqf() {
    return (String) storedValueForKey(_EOUvOuv.PUBLIQF_KEY);
  }

  public void setPubliqf(String value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating publiqf from " + publiqf() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.PUBLIQF_KEY);
  }

  public String uvc() {
    return (String) storedValueForKey(_EOUvOuv.UVC_KEY);
  }

  public void setUvc(String value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating uvc from " + uvc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.UVC_KEY);
  }

  public Long uvOuvId() {
    return (Long) storedValueForKey(_EOUvOuv.UV_OUV_ID_KEY);
  }

  public void setUvOuvId(Long value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
    	_EOUvOuv.LOG.debug( "updating uvOuvId from " + uvOuvId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuv.UV_OUV_ID_KEY);
  }

  public gestionuv.utt.fr.eo.EOUv uv() {
    return (gestionuv.utt.fr.eo.EOUv)storedValueForKey(_EOUvOuv.UV_KEY);
  }
  
  public void setUv(gestionuv.utt.fr.eo.EOUv value) {
    takeStoredValueForKey(value, _EOUvOuv.UV_KEY);
  }

  public void setUvRelationship(gestionuv.utt.fr.eo.EOUv value) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
      _EOUvOuv.LOG.debug("updating uv from " + uv() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setUv(value);
    }
    else if (value == null) {
    	gestionuv.utt.fr.eo.EOUv oldValue = uv();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOUvOuv.UV_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOUvOuv.UV_KEY);
    }
  }
  
  public NSArray<etudiants.utt.fr.eo.EORefPeriode> eoRefPeriodes() {
    return (NSArray<etudiants.utt.fr.eo.EORefPeriode>)storedValueForKey(_EOUvOuv.EO_REF_PERIODES_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EORefPeriode> eoRefPeriodes(EOQualifier qualifier) {
    return eoRefPeriodes(qualifier, null);
  }

  public NSArray<etudiants.utt.fr.eo.EORefPeriode> eoRefPeriodes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<etudiants.utt.fr.eo.EORefPeriode> results;
      results = eoRefPeriodes();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EORefPeriode>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EORefPeriode>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEoRefPeriodes(etudiants.utt.fr.eo.EORefPeriode object) {
    includeObjectIntoPropertyWithKey(object, _EOUvOuv.EO_REF_PERIODES_KEY);
  }

  public void removeFromEoRefPeriodes(etudiants.utt.fr.eo.EORefPeriode object) {
    excludeObjectFromPropertyWithKey(object, _EOUvOuv.EO_REF_PERIODES_KEY);
  }

  public void addToEoRefPeriodesRelationship(etudiants.utt.fr.eo.EORefPeriode object) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
      _EOUvOuv.LOG.debug("adding " + object + " to eoRefPeriodes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoRefPeriodes(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOUvOuv.EO_REF_PERIODES_KEY);
    }
  }

  public void removeFromEoRefPeriodesRelationship(etudiants.utt.fr.eo.EORefPeriode object) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
      _EOUvOuv.LOG.debug("removing " + object + " from eoRefPeriodes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoRefPeriodes(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOUvOuv.EO_REF_PERIODES_KEY);
    }
  }

  public etudiants.utt.fr.eo.EORefPeriode createEoRefPeriodesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EORefPeriode.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOUvOuv.EO_REF_PERIODES_KEY);
    return (etudiants.utt.fr.eo.EORefPeriode) eo;
  }

  public void deleteEoRefPeriodesRelationship(etudiants.utt.fr.eo.EORefPeriode object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOUvOuv.EO_REF_PERIODES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoRefPeriodesRelationships() {
    Enumeration<etudiants.utt.fr.eo.EORefPeriode> objects = eoRefPeriodes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoRefPeriodesRelationship(objects.nextElement());
    }
  }

  public NSArray<gestionuv.utt.fr.eo.EOUvOuvertes> uvOuvertess() {
    return (NSArray<gestionuv.utt.fr.eo.EOUvOuvertes>)storedValueForKey(_EOUvOuv.UV_OUVERTESS_KEY);
  }

  public NSArray<gestionuv.utt.fr.eo.EOUvOuvertes> uvOuvertess(EOQualifier qualifier) {
    return uvOuvertess(qualifier, null, false);
  }

  public NSArray<gestionuv.utt.fr.eo.EOUvOuvertes> uvOuvertess(EOQualifier qualifier, boolean fetch) {
    return uvOuvertess(qualifier, null, fetch);
  }

  public NSArray<gestionuv.utt.fr.eo.EOUvOuvertes> uvOuvertess(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<gestionuv.utt.fr.eo.EOUvOuvertes> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(gestionuv.utt.fr.eo.EOUvOuvertes.UV_OUV_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = gestionuv.utt.fr.eo.EOUvOuvertes.fetchEOUvOuverteses(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = uvOuvertess();
      if (qualifier != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOUvOuvertes>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOUvOuvertes>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToUvOuvertess(gestionuv.utt.fr.eo.EOUvOuvertes object) {
    includeObjectIntoPropertyWithKey(object, _EOUvOuv.UV_OUVERTESS_KEY);
  }

  public void removeFromUvOuvertess(gestionuv.utt.fr.eo.EOUvOuvertes object) {
    excludeObjectFromPropertyWithKey(object, _EOUvOuv.UV_OUVERTESS_KEY);
  }

  public void addToUvOuvertessRelationship(gestionuv.utt.fr.eo.EOUvOuvertes object) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
      _EOUvOuv.LOG.debug("adding " + object + " to uvOuvertess relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToUvOuvertess(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOUvOuv.UV_OUVERTESS_KEY);
    }
  }

  public void removeFromUvOuvertessRelationship(gestionuv.utt.fr.eo.EOUvOuvertes object) {
    if (_EOUvOuv.LOG.isDebugEnabled()) {
      _EOUvOuv.LOG.debug("removing " + object + " from uvOuvertess relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromUvOuvertess(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOUvOuv.UV_OUVERTESS_KEY);
    }
  }

  public gestionuv.utt.fr.eo.EOUvOuvertes createUvOuvertessRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.EOUvOuvertes.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOUvOuv.UV_OUVERTESS_KEY);
    return (gestionuv.utt.fr.eo.EOUvOuvertes) eo;
  }

  public void deleteUvOuvertessRelationship(gestionuv.utt.fr.eo.EOUvOuvertes object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOUvOuv.UV_OUVERTESS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllUvOuvertessRelationships() {
    Enumeration<gestionuv.utt.fr.eo.EOUvOuvertes> objects = uvOuvertess().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteUvOuvertessRelationship(objects.nextElement());
    }
  }


  public static EOUvOuv createEOUvOuv(EOEditingContext editingContext, Long uvOuvId
) {
    EOUvOuv eo = (EOUvOuv) EOUtilities.createAndInsertInstance(editingContext, _EOUvOuv.ENTITY_NAME);    
		eo.setUvOuvId(uvOuvId);
    return eo;
  }

  public static ERXFetchSpecification<EOUvOuv> fetchSpec() {
    return new ERXFetchSpecification<EOUvOuv>(_EOUvOuv.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOUvOuv> fetchAllEOUvOuvs(EOEditingContext editingContext) {
    return _EOUvOuv.fetchAllEOUvOuvs(editingContext, null);
  }

  public static NSArray<EOUvOuv> fetchAllEOUvOuvs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOUvOuv.fetchEOUvOuvs(editingContext, null, sortOrderings);
  }

  public static NSArray<EOUvOuv> fetchEOUvOuvs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOUvOuv> fetchSpec = new ERXFetchSpecification<EOUvOuv>(_EOUvOuv.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOUvOuv> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOUvOuv fetchEOUvOuv(EOEditingContext editingContext, String keyName, Object value) {
    return _EOUvOuv.fetchEOUvOuv(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOUvOuv fetchEOUvOuv(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOUvOuv> eoObjects = _EOUvOuv.fetchEOUvOuvs(editingContext, qualifier, null);
    EOUvOuv eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOUvOuv that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOUvOuv fetchRequiredEOUvOuv(EOEditingContext editingContext, String keyName, Object value) {
    return _EOUvOuv.fetchRequiredEOUvOuv(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOUvOuv fetchRequiredEOUvOuv(EOEditingContext editingContext, EOQualifier qualifier) {
    EOUvOuv eoObject = _EOUvOuv.fetchEOUvOuv(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOUvOuv that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOUvOuv localInstanceIn(EOEditingContext editingContext, EOUvOuv eo) {
    EOUvOuv localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<gestionuv.utt.fr.eo.EOUvOuv> fetchLesUvs(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("lesUvs", _EOUvOuv.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EOUvOuv>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<gestionuv.utt.fr.eo.EOUvOuv> fetchLesUvs(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("lesUvs", _EOUvOuv.ENTITY_NAME);
    return (NSArray<gestionuv.utt.fr.eo.EOUvOuv>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<gestionuv.utt.fr.eo.EOUvOuv> fetchListUvPeriode(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("ListUvPeriode", _EOUvOuv.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EOUvOuv>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<gestionuv.utt.fr.eo.EOUvOuv> fetchListUvPeriode(EOEditingContext editingContext,
	String anUnivBinding,
	String prdUnivBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("ListUvPeriode", _EOUvOuv.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(anUnivBinding, "anUniv");
    bindings.takeValueForKey(prdUnivBinding, "prdUniv");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
	NSArray<gestionuv.utt.fr.eo.EOUvOuv> result = null;
    	result = editingContext.objectsWithFetchSpecification(fetchSpec);
    return result;
    
  }
  
}
