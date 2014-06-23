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
// DO NOT EDIT.  Make changes to EOProfilParam.java instead.
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
public abstract class _EOProfilParam extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOProfilParam";

  // Attribute Keys
  public static final ERXKey<String> LIB_ABR = new ERXKey<String>("libAbr");
  public static final ERXKey<String> LIBELLE = new ERXKey<String>("libelle");
  public static final ERXKey<Double> LIGNE = new ERXKey<Double>("ligne");
  public static final ERXKey<Double> LONGUEUR = new ERXKey<Double>("longueur");
  public static final ERXKey<Long> MIN = new ERXKey<Long>("min");
  public static final ERXKey<String> PRD_DEBUT = new ERXKey<String>("prdDebut");
  public static final ERXKey<String> PRD_FIN = new ERXKey<String>("prdFin");
  public static final ERXKey<Long> PROFIL_TOTAL_ID = new ERXKey<Long>("profilTotalId");
  public static final ERXKey<String> REGLE$C = new ERXKey<String>("regle$c");
  // Relationship Keys
  public static final ERXKey<gestionuv.utt.fr.eo.EOProfilTotaux> PROFIL_TOTAUXS = new ERXKey<gestionuv.utt.fr.eo.EOProfilTotaux>("profilTotauxs");
  public static final ERXKey<gestionuv.utt.fr.eo.EORefProfilTotal> REF_PROFIL_TOTAL = new ERXKey<gestionuv.utt.fr.eo.EORefProfilTotal>("refProfilTotal");

  // Attributes
  public static final String LIB_ABR_KEY = LIB_ABR.key();
  public static final String LIBELLE_KEY = LIBELLE.key();
  public static final String LIGNE_KEY = LIGNE.key();
  public static final String LONGUEUR_KEY = LONGUEUR.key();
  public static final String MIN_KEY = MIN.key();
  public static final String PRD_DEBUT_KEY = PRD_DEBUT.key();
  public static final String PRD_FIN_KEY = PRD_FIN.key();
  public static final String PROFIL_TOTAL_ID_KEY = PROFIL_TOTAL_ID.key();
  public static final String REGLE$C_KEY = REGLE$C.key();
  // Relationships
  public static final String PROFIL_TOTAUXS_KEY = PROFIL_TOTAUXS.key();
  public static final String REF_PROFIL_TOTAL_KEY = REF_PROFIL_TOTAL.key();

  private static Logger LOG = Logger.getLogger(_EOProfilParam.class);

  public EOProfilParam localInstanceIn(EOEditingContext editingContext) {
    EOProfilParam localInstance = (EOProfilParam)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String libAbr() {
    return (String) storedValueForKey(_EOProfilParam.LIB_ABR_KEY);
  }

  public void setLibAbr(String value) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
    	_EOProfilParam.LOG.debug( "updating libAbr from " + libAbr() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParam.LIB_ABR_KEY);
  }

  public String libelle() {
    return (String) storedValueForKey(_EOProfilParam.LIBELLE_KEY);
  }

  public void setLibelle(String value) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
    	_EOProfilParam.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParam.LIBELLE_KEY);
  }

  public Double ligne() {
    return (Double) storedValueForKey(_EOProfilParam.LIGNE_KEY);
  }

  public void setLigne(Double value) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
    	_EOProfilParam.LOG.debug( "updating ligne from " + ligne() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParam.LIGNE_KEY);
  }

  public Double longueur() {
    return (Double) storedValueForKey(_EOProfilParam.LONGUEUR_KEY);
  }

  public void setLongueur(Double value) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
    	_EOProfilParam.LOG.debug( "updating longueur from " + longueur() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParam.LONGUEUR_KEY);
  }

  public Long min() {
    return (Long) storedValueForKey(_EOProfilParam.MIN_KEY);
  }

  public void setMin(Long value) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
    	_EOProfilParam.LOG.debug( "updating min from " + min() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParam.MIN_KEY);
  }

  public String prdDebut() {
    return (String) storedValueForKey(_EOProfilParam.PRD_DEBUT_KEY);
  }

  public void setPrdDebut(String value) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
    	_EOProfilParam.LOG.debug( "updating prdDebut from " + prdDebut() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParam.PRD_DEBUT_KEY);
  }

  public String prdFin() {
    return (String) storedValueForKey(_EOProfilParam.PRD_FIN_KEY);
  }

  public void setPrdFin(String value) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
    	_EOProfilParam.LOG.debug( "updating prdFin from " + prdFin() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParam.PRD_FIN_KEY);
  }

  public Long profilTotalId() {
    return (Long) storedValueForKey(_EOProfilParam.PROFIL_TOTAL_ID_KEY);
  }

  public void setProfilTotalId(Long value) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
    	_EOProfilParam.LOG.debug( "updating profilTotalId from " + profilTotalId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParam.PROFIL_TOTAL_ID_KEY);
  }

  public String regle$c() {
    return (String) storedValueForKey(_EOProfilParam.REGLE$C_KEY);
  }

  public void setRegle$c(String value) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
    	_EOProfilParam.LOG.debug( "updating regle$c from " + regle$c() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParam.REGLE$C_KEY);
  }

  public gestionuv.utt.fr.eo.EORefProfilTotal refProfilTotal() {
    return (gestionuv.utt.fr.eo.EORefProfilTotal)storedValueForKey(_EOProfilParam.REF_PROFIL_TOTAL_KEY);
  }
  
  public void setRefProfilTotal(gestionuv.utt.fr.eo.EORefProfilTotal value) {
    takeStoredValueForKey(value, _EOProfilParam.REF_PROFIL_TOTAL_KEY);
  }

  public void setRefProfilTotalRelationship(gestionuv.utt.fr.eo.EORefProfilTotal value) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
      _EOProfilParam.LOG.debug("updating refProfilTotal from " + refProfilTotal() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setRefProfilTotal(value);
    }
    else if (value == null) {
    	gestionuv.utt.fr.eo.EORefProfilTotal oldValue = refProfilTotal();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOProfilParam.REF_PROFIL_TOTAL_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOProfilParam.REF_PROFIL_TOTAL_KEY);
    }
  }
  
  public NSArray<gestionuv.utt.fr.eo.EOProfilTotaux> profilTotauxs() {
    return (NSArray<gestionuv.utt.fr.eo.EOProfilTotaux>)storedValueForKey(_EOProfilParam.PROFIL_TOTAUXS_KEY);
  }

  public NSArray<gestionuv.utt.fr.eo.EOProfilTotaux> profilTotauxs(EOQualifier qualifier) {
    return profilTotauxs(qualifier, null, false);
  }

  public NSArray<gestionuv.utt.fr.eo.EOProfilTotaux> profilTotauxs(EOQualifier qualifier, boolean fetch) {
    return profilTotauxs(qualifier, null, fetch);
  }

  public NSArray<gestionuv.utt.fr.eo.EOProfilTotaux> profilTotauxs(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<gestionuv.utt.fr.eo.EOProfilTotaux> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(gestionuv.utt.fr.eo.EOProfilTotaux.PROFIL_PARAM_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = gestionuv.utt.fr.eo.EOProfilTotaux.fetchEOProfilTotauxes(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = profilTotauxs();
      if (qualifier != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOProfilTotaux>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOProfilTotaux>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToProfilTotauxs(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    includeObjectIntoPropertyWithKey(object, _EOProfilParam.PROFIL_TOTAUXS_KEY);
  }

  public void removeFromProfilTotauxs(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    excludeObjectFromPropertyWithKey(object, _EOProfilParam.PROFIL_TOTAUXS_KEY);
  }

  public void addToProfilTotauxsRelationship(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
      _EOProfilParam.LOG.debug("adding " + object + " to profilTotauxs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToProfilTotauxs(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOProfilParam.PROFIL_TOTAUXS_KEY);
    }
  }

  public void removeFromProfilTotauxsRelationship(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    if (_EOProfilParam.LOG.isDebugEnabled()) {
      _EOProfilParam.LOG.debug("removing " + object + " from profilTotauxs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromProfilTotauxs(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOProfilParam.PROFIL_TOTAUXS_KEY);
    }
  }

  public gestionuv.utt.fr.eo.EOProfilTotaux createProfilTotauxsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.EOProfilTotaux.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOProfilParam.PROFIL_TOTAUXS_KEY);
    return (gestionuv.utt.fr.eo.EOProfilTotaux) eo;
  }

  public void deleteProfilTotauxsRelationship(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOProfilParam.PROFIL_TOTAUXS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProfilTotauxsRelationships() {
    Enumeration<gestionuv.utt.fr.eo.EOProfilTotaux> objects = profilTotauxs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProfilTotauxsRelationship(objects.nextElement());
    }
  }


  public static EOProfilParam createEOProfilParam(EOEditingContext editingContext, String regle$c
) {
    EOProfilParam eo = (EOProfilParam) EOUtilities.createAndInsertInstance(editingContext, _EOProfilParam.ENTITY_NAME);    
		eo.setRegle$c(regle$c);
    return eo;
  }

  public static ERXFetchSpecification<EOProfilParam> fetchSpec() {
    return new ERXFetchSpecification<EOProfilParam>(_EOProfilParam.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOProfilParam> fetchAllEOProfilParams(EOEditingContext editingContext) {
    return _EOProfilParam.fetchAllEOProfilParams(editingContext, null);
  }

  public static NSArray<EOProfilParam> fetchAllEOProfilParams(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOProfilParam.fetchEOProfilParams(editingContext, null, sortOrderings);
  }

  public static NSArray<EOProfilParam> fetchEOProfilParams(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOProfilParam> fetchSpec = new ERXFetchSpecification<EOProfilParam>(_EOProfilParam.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOProfilParam> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOProfilParam fetchEOProfilParam(EOEditingContext editingContext, String keyName, Object value) {
    return _EOProfilParam.fetchEOProfilParam(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOProfilParam fetchEOProfilParam(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOProfilParam> eoObjects = _EOProfilParam.fetchEOProfilParams(editingContext, qualifier, null);
    EOProfilParam eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOProfilParam that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOProfilParam fetchRequiredEOProfilParam(EOEditingContext editingContext, String keyName, Object value) {
    return _EOProfilParam.fetchRequiredEOProfilParam(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOProfilParam fetchRequiredEOProfilParam(EOEditingContext editingContext, EOQualifier qualifier) {
    EOProfilParam eoObject = _EOProfilParam.fetchEOProfilParam(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOProfilParam that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOProfilParam localInstanceIn(EOEditingContext editingContext, EOProfilParam eo) {
    EOProfilParam localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
