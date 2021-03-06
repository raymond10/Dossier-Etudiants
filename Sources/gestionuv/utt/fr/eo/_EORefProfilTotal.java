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
// DO NOT EDIT.  Make changes to EORefProfilTotal.java instead.
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
public abstract class _EORefProfilTotal extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EORefProfilTotal";

  // Attribute Keys
  public static final ERXKey<String> DIPLOMEC = new ERXKey<String>("diplomec");
  public static final ERXKey<String> DIPL_SPECC = new ERXKey<String>("diplSpecc");
  public static final ERXKey<String> DOUBLE_DIPL = new ERXKey<String>("doubleDipl");
  public static final ERXKey<String> LIB_ABR = new ERXKey<String>("libAbr");
  public static final ERXKey<String> LIBELLE = new ERXKey<String>("libelle");
  public static final ERXKey<String> NIV_ENTREE = new ERXKey<String>("nivEntree");
  public static final ERXKey<Long> ORDRE = new ERXKey<Long>("ordre");
  public static final ERXKey<String> PRD_DEBUT = new ERXKey<String>("prdDebut");
  public static final ERXKey<String> PRD_FIN = new ERXKey<String>("prdFin");
  public static final ERXKey<Long> PROFIL_ID1 = new ERXKey<Long>("profilId1");
  public static final ERXKey<Long> PROFIL_ID2 = new ERXKey<Long>("profilId2");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome> EO_VUE_AFFICHERDIPLOME = new ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome>("eoVueAfficherdiplome");
  public static final ERXKey<gestionuv.utt.fr.eo.EOProfilParam> PROFIL_PARAMS = new ERXKey<gestionuv.utt.fr.eo.EOProfilParam>("profilParams");
  public static final ERXKey<gestionuv.utt.fr.eo.EOProfilTotaux> PROFIL_TOTAUXS = new ERXKey<gestionuv.utt.fr.eo.EOProfilTotaux>("profilTotauxs");

  // Attributes
  public static final String DIPLOMEC_KEY = DIPLOMEC.key();
  public static final String DIPL_SPECC_KEY = DIPL_SPECC.key();
  public static final String DOUBLE_DIPL_KEY = DOUBLE_DIPL.key();
  public static final String LIB_ABR_KEY = LIB_ABR.key();
  public static final String LIBELLE_KEY = LIBELLE.key();
  public static final String NIV_ENTREE_KEY = NIV_ENTREE.key();
  public static final String ORDRE_KEY = ORDRE.key();
  public static final String PRD_DEBUT_KEY = PRD_DEBUT.key();
  public static final String PRD_FIN_KEY = PRD_FIN.key();
  public static final String PROFIL_ID1_KEY = PROFIL_ID1.key();
  public static final String PROFIL_ID2_KEY = PROFIL_ID2.key();
  // Relationships
  public static final String EO_VUE_AFFICHERDIPLOME_KEY = EO_VUE_AFFICHERDIPLOME.key();
  public static final String PROFIL_PARAMS_KEY = PROFIL_PARAMS.key();
  public static final String PROFIL_TOTAUXS_KEY = PROFIL_TOTAUXS.key();

  private static Logger LOG = Logger.getLogger(_EORefProfilTotal.class);

  public EORefProfilTotal localInstanceIn(EOEditingContext editingContext) {
    EORefProfilTotal localInstance = (EORefProfilTotal)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String diplomec() {
    return (String) storedValueForKey(_EORefProfilTotal.DIPLOMEC_KEY);
  }

  public void setDiplomec(String value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
    	_EORefProfilTotal.LOG.debug( "updating diplomec from " + diplomec() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfilTotal.DIPLOMEC_KEY);
  }

  public String diplSpecc() {
    return (String) storedValueForKey(_EORefProfilTotal.DIPL_SPECC_KEY);
  }

  public void setDiplSpecc(String value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
    	_EORefProfilTotal.LOG.debug( "updating diplSpecc from " + diplSpecc() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfilTotal.DIPL_SPECC_KEY);
  }

  public String doubleDipl() {
    return (String) storedValueForKey(_EORefProfilTotal.DOUBLE_DIPL_KEY);
  }

  public void setDoubleDipl(String value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
    	_EORefProfilTotal.LOG.debug( "updating doubleDipl from " + doubleDipl() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfilTotal.DOUBLE_DIPL_KEY);
  }

  public String libAbr() {
    return (String) storedValueForKey(_EORefProfilTotal.LIB_ABR_KEY);
  }

  public void setLibAbr(String value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
    	_EORefProfilTotal.LOG.debug( "updating libAbr from " + libAbr() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfilTotal.LIB_ABR_KEY);
  }

  public String libelle() {
    return (String) storedValueForKey(_EORefProfilTotal.LIBELLE_KEY);
  }

  public void setLibelle(String value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
    	_EORefProfilTotal.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfilTotal.LIBELLE_KEY);
  }

  public String nivEntree() {
    return (String) storedValueForKey(_EORefProfilTotal.NIV_ENTREE_KEY);
  }

  public void setNivEntree(String value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
    	_EORefProfilTotal.LOG.debug( "updating nivEntree from " + nivEntree() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfilTotal.NIV_ENTREE_KEY);
  }

  public Long ordre() {
    return (Long) storedValueForKey(_EORefProfilTotal.ORDRE_KEY);
  }

  public void setOrdre(Long value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
    	_EORefProfilTotal.LOG.debug( "updating ordre from " + ordre() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfilTotal.ORDRE_KEY);
  }

  public String prdDebut() {
    return (String) storedValueForKey(_EORefProfilTotal.PRD_DEBUT_KEY);
  }

  public void setPrdDebut(String value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
    	_EORefProfilTotal.LOG.debug( "updating prdDebut from " + prdDebut() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfilTotal.PRD_DEBUT_KEY);
  }

  public String prdFin() {
    return (String) storedValueForKey(_EORefProfilTotal.PRD_FIN_KEY);
  }

  public void setPrdFin(String value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
    	_EORefProfilTotal.LOG.debug( "updating prdFin from " + prdFin() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfilTotal.PRD_FIN_KEY);
  }

  public Long profilId1() {
    return (Long) storedValueForKey(_EORefProfilTotal.PROFIL_ID1_KEY);
  }

  public void setProfilId1(Long value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
    	_EORefProfilTotal.LOG.debug( "updating profilId1 from " + profilId1() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfilTotal.PROFIL_ID1_KEY);
  }

  public Long profilId2() {
    return (Long) storedValueForKey(_EORefProfilTotal.PROFIL_ID2_KEY);
  }

  public void setProfilId2(Long value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
    	_EORefProfilTotal.LOG.debug( "updating profilId2 from " + profilId2() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfilTotal.PROFIL_ID2_KEY);
  }

  public etudiants.utt.fr.eo.EOVueAfficherdiplome eoVueAfficherdiplome() {
    return (etudiants.utt.fr.eo.EOVueAfficherdiplome)storedValueForKey(_EORefProfilTotal.EO_VUE_AFFICHERDIPLOME_KEY);
  }
  
  public void setEoVueAfficherdiplome(etudiants.utt.fr.eo.EOVueAfficherdiplome value) {
    takeStoredValueForKey(value, _EORefProfilTotal.EO_VUE_AFFICHERDIPLOME_KEY);
  }

  public void setEoVueAfficherdiplomeRelationship(etudiants.utt.fr.eo.EOVueAfficherdiplome value) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
      _EORefProfilTotal.LOG.debug("updating eoVueAfficherdiplome from " + eoVueAfficherdiplome() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setEoVueAfficherdiplome(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOVueAfficherdiplome oldValue = eoVueAfficherdiplome();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EORefProfilTotal.EO_VUE_AFFICHERDIPLOME_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EORefProfilTotal.EO_VUE_AFFICHERDIPLOME_KEY);
    }
  }
  
  public NSArray<gestionuv.utt.fr.eo.EOProfilParam> profilParams() {
    return (NSArray<gestionuv.utt.fr.eo.EOProfilParam>)storedValueForKey(_EORefProfilTotal.PROFIL_PARAMS_KEY);
  }

  public NSArray<gestionuv.utt.fr.eo.EOProfilParam> profilParams(EOQualifier qualifier) {
    return profilParams(qualifier, null, false);
  }

  public NSArray<gestionuv.utt.fr.eo.EOProfilParam> profilParams(EOQualifier qualifier, boolean fetch) {
    return profilParams(qualifier, null, fetch);
  }

  public NSArray<gestionuv.utt.fr.eo.EOProfilParam> profilParams(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<gestionuv.utt.fr.eo.EOProfilParam> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(gestionuv.utt.fr.eo.EOProfilParam.REF_PROFIL_TOTAL_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = gestionuv.utt.fr.eo.EOProfilParam.fetchEOProfilParams(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = profilParams();
      if (qualifier != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOProfilParam>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOProfilParam>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToProfilParams(gestionuv.utt.fr.eo.EOProfilParam object) {
    includeObjectIntoPropertyWithKey(object, _EORefProfilTotal.PROFIL_PARAMS_KEY);
  }

  public void removeFromProfilParams(gestionuv.utt.fr.eo.EOProfilParam object) {
    excludeObjectFromPropertyWithKey(object, _EORefProfilTotal.PROFIL_PARAMS_KEY);
  }

  public void addToProfilParamsRelationship(gestionuv.utt.fr.eo.EOProfilParam object) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
      _EORefProfilTotal.LOG.debug("adding " + object + " to profilParams relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToProfilParams(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefProfilTotal.PROFIL_PARAMS_KEY);
    }
  }

  public void removeFromProfilParamsRelationship(gestionuv.utt.fr.eo.EOProfilParam object) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
      _EORefProfilTotal.LOG.debug("removing " + object + " from profilParams relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromProfilParams(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefProfilTotal.PROFIL_PARAMS_KEY);
    }
  }

  public gestionuv.utt.fr.eo.EOProfilParam createProfilParamsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.EOProfilParam.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefProfilTotal.PROFIL_PARAMS_KEY);
    return (gestionuv.utt.fr.eo.EOProfilParam) eo;
  }

  public void deleteProfilParamsRelationship(gestionuv.utt.fr.eo.EOProfilParam object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefProfilTotal.PROFIL_PARAMS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProfilParamsRelationships() {
    Enumeration<gestionuv.utt.fr.eo.EOProfilParam> objects = profilParams().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProfilParamsRelationship(objects.nextElement());
    }
  }

  public NSArray<gestionuv.utt.fr.eo.EOProfilTotaux> profilTotauxs() {
    return (NSArray<gestionuv.utt.fr.eo.EOProfilTotaux>)storedValueForKey(_EORefProfilTotal.PROFIL_TOTAUXS_KEY);
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(gestionuv.utt.fr.eo.EOProfilTotaux.REF_PROFIL_TOTAL_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
    includeObjectIntoPropertyWithKey(object, _EORefProfilTotal.PROFIL_TOTAUXS_KEY);
  }

  public void removeFromProfilTotauxs(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    excludeObjectFromPropertyWithKey(object, _EORefProfilTotal.PROFIL_TOTAUXS_KEY);
  }

  public void addToProfilTotauxsRelationship(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
      _EORefProfilTotal.LOG.debug("adding " + object + " to profilTotauxs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToProfilTotauxs(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefProfilTotal.PROFIL_TOTAUXS_KEY);
    }
  }

  public void removeFromProfilTotauxsRelationship(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    if (_EORefProfilTotal.LOG.isDebugEnabled()) {
      _EORefProfilTotal.LOG.debug("removing " + object + " from profilTotauxs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromProfilTotauxs(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefProfilTotal.PROFIL_TOTAUXS_KEY);
    }
  }

  public gestionuv.utt.fr.eo.EOProfilTotaux createProfilTotauxsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.EOProfilTotaux.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefProfilTotal.PROFIL_TOTAUXS_KEY);
    return (gestionuv.utt.fr.eo.EOProfilTotaux) eo;
  }

  public void deleteProfilTotauxsRelationship(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefProfilTotal.PROFIL_TOTAUXS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProfilTotauxsRelationships() {
    Enumeration<gestionuv.utt.fr.eo.EOProfilTotaux> objects = profilTotauxs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProfilTotauxsRelationship(objects.nextElement());
    }
  }


  public static EORefProfilTotal createEORefProfilTotal(EOEditingContext editingContext, String diplomec
, String diplSpecc
, String nivEntree
, etudiants.utt.fr.eo.EOVueAfficherdiplome eoVueAfficherdiplome) {
    EORefProfilTotal eo = (EORefProfilTotal) EOUtilities.createAndInsertInstance(editingContext, _EORefProfilTotal.ENTITY_NAME);    
		eo.setDiplomec(diplomec);
		eo.setDiplSpecc(diplSpecc);
		eo.setNivEntree(nivEntree);
    eo.setEoVueAfficherdiplomeRelationship(eoVueAfficherdiplome);
    return eo;
  }

  public static ERXFetchSpecification<EORefProfilTotal> fetchSpec() {
    return new ERXFetchSpecification<EORefProfilTotal>(_EORefProfilTotal.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EORefProfilTotal> fetchAllEORefProfilTotals(EOEditingContext editingContext) {
    return _EORefProfilTotal.fetchAllEORefProfilTotals(editingContext, null);
  }

  public static NSArray<EORefProfilTotal> fetchAllEORefProfilTotals(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EORefProfilTotal.fetchEORefProfilTotals(editingContext, null, sortOrderings);
  }

  public static NSArray<EORefProfilTotal> fetchEORefProfilTotals(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EORefProfilTotal> fetchSpec = new ERXFetchSpecification<EORefProfilTotal>(_EORefProfilTotal.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EORefProfilTotal> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EORefProfilTotal fetchEORefProfilTotal(EOEditingContext editingContext, String keyName, Object value) {
    return _EORefProfilTotal.fetchEORefProfilTotal(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EORefProfilTotal fetchEORefProfilTotal(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EORefProfilTotal> eoObjects = _EORefProfilTotal.fetchEORefProfilTotals(editingContext, qualifier, null);
    EORefProfilTotal eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EORefProfilTotal that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EORefProfilTotal fetchRequiredEORefProfilTotal(EOEditingContext editingContext, String keyName, Object value) {
    return _EORefProfilTotal.fetchRequiredEORefProfilTotal(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EORefProfilTotal fetchRequiredEORefProfilTotal(EOEditingContext editingContext, EOQualifier qualifier) {
    EORefProfilTotal eoObject = _EORefProfilTotal.fetchEORefProfilTotal(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EORefProfilTotal that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EORefProfilTotal localInstanceIn(EOEditingContext editingContext, EORefProfilTotal eo) {
    EORefProfilTotal localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<gestionuv.utt.fr.eo.EORefProfilTotal> fetchSelectTotal(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("selectTotal", _EORefProfilTotal.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EORefProfilTotal>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<gestionuv.utt.fr.eo.EORefProfilTotal> fetchSelectTotal(EOEditingContext editingContext,
	String diplomecBinding,
	String diplSpeccBinding,
	String nivEntreeBinding,
	String prdDebutBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("selectTotal", _EORefProfilTotal.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(diplomecBinding, "diplomec");
    bindings.takeValueForKey(diplSpeccBinding, "diplSpecc");
    bindings.takeValueForKey(nivEntreeBinding, "nivEntree");
    bindings.takeValueForKey(prdDebutBinding, "prdDebut");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EORefProfilTotal>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
