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
// DO NOT EDIT.  Make changes to EOProfilParcours.java instead.
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
public abstract class _EOProfilParcours extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOProfilParcours";

  // Attribute Keys
  public static final ERXKey<String> DIPL_SPEC$C = new ERXKey<String>("diplSpec$c");
  public static final ERXKey<String> NIV_ENTREE = new ERXKey<String>("nivEntree");
  public static final ERXKey<String> PRD_FIN = new ERXKey<String>("prdFin");
  public static final ERXKey<String> REORIENT$F = new ERXKey<String>("reorient$f");
  // Relationship Keys
  public static final ERXKey<gestionuv.utt.fr.eo.EOProfilTotaux> PROFIL_TOTAUXS = new ERXKey<gestionuv.utt.fr.eo.EOProfilTotaux>("profilTotauxs");

  // Attributes
  public static final String DIPL_SPEC$C_KEY = DIPL_SPEC$C.key();
  public static final String NIV_ENTREE_KEY = NIV_ENTREE.key();
  public static final String PRD_FIN_KEY = PRD_FIN.key();
  public static final String REORIENT$F_KEY = REORIENT$F.key();
  // Relationships
  public static final String PROFIL_TOTAUXS_KEY = PROFIL_TOTAUXS.key();

  private static Logger LOG = Logger.getLogger(_EOProfilParcours.class);

  public EOProfilParcours localInstanceIn(EOEditingContext editingContext) {
    EOProfilParcours localInstance = (EOProfilParcours)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String diplSpec$c() {
    return (String) storedValueForKey(_EOProfilParcours.DIPL_SPEC$C_KEY);
  }

  public void setDiplSpec$c(String value) {
    if (_EOProfilParcours.LOG.isDebugEnabled()) {
    	_EOProfilParcours.LOG.debug( "updating diplSpec$c from " + diplSpec$c() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParcours.DIPL_SPEC$C_KEY);
  }

  public String nivEntree() {
    return (String) storedValueForKey(_EOProfilParcours.NIV_ENTREE_KEY);
  }

  public void setNivEntree(String value) {
    if (_EOProfilParcours.LOG.isDebugEnabled()) {
    	_EOProfilParcours.LOG.debug( "updating nivEntree from " + nivEntree() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParcours.NIV_ENTREE_KEY);
  }

  public String prdFin() {
    return (String) storedValueForKey(_EOProfilParcours.PRD_FIN_KEY);
  }

  public void setPrdFin(String value) {
    if (_EOProfilParcours.LOG.isDebugEnabled()) {
    	_EOProfilParcours.LOG.debug( "updating prdFin from " + prdFin() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParcours.PRD_FIN_KEY);
  }

  public String reorient$f() {
    return (String) storedValueForKey(_EOProfilParcours.REORIENT$F_KEY);
  }

  public void setReorient$f(String value) {
    if (_EOProfilParcours.LOG.isDebugEnabled()) {
    	_EOProfilParcours.LOG.debug( "updating reorient$f from " + reorient$f() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilParcours.REORIENT$F_KEY);
  }

  public NSArray<gestionuv.utt.fr.eo.EOProfilTotaux> profilTotauxs() {
    return (NSArray<gestionuv.utt.fr.eo.EOProfilTotaux>)storedValueForKey(_EOProfilParcours.PROFIL_TOTAUXS_KEY);
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(gestionuv.utt.fr.eo.EOProfilTotaux.PROFIL_PARCOURS_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
    includeObjectIntoPropertyWithKey(object, _EOProfilParcours.PROFIL_TOTAUXS_KEY);
  }

  public void removeFromProfilTotauxs(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    excludeObjectFromPropertyWithKey(object, _EOProfilParcours.PROFIL_TOTAUXS_KEY);
  }

  public void addToProfilTotauxsRelationship(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    if (_EOProfilParcours.LOG.isDebugEnabled()) {
      _EOProfilParcours.LOG.debug("adding " + object + " to profilTotauxs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToProfilTotauxs(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOProfilParcours.PROFIL_TOTAUXS_KEY);
    }
  }

  public void removeFromProfilTotauxsRelationship(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    if (_EOProfilParcours.LOG.isDebugEnabled()) {
      _EOProfilParcours.LOG.debug("removing " + object + " from profilTotauxs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromProfilTotauxs(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOProfilParcours.PROFIL_TOTAUXS_KEY);
    }
  }

  public gestionuv.utt.fr.eo.EOProfilTotaux createProfilTotauxsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.EOProfilTotaux.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOProfilParcours.PROFIL_TOTAUXS_KEY);
    return (gestionuv.utt.fr.eo.EOProfilTotaux) eo;
  }

  public void deleteProfilTotauxsRelationship(gestionuv.utt.fr.eo.EOProfilTotaux object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOProfilParcours.PROFIL_TOTAUXS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProfilTotauxsRelationships() {
    Enumeration<gestionuv.utt.fr.eo.EOProfilTotaux> objects = profilTotauxs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProfilTotauxsRelationship(objects.nextElement());
    }
  }


  public static EOProfilParcours createEOProfilParcours(EOEditingContext editingContext, String prdFin
, String reorient$f
) {
    EOProfilParcours eo = (EOProfilParcours) EOUtilities.createAndInsertInstance(editingContext, _EOProfilParcours.ENTITY_NAME);    
		eo.setPrdFin(prdFin);
		eo.setReorient$f(reorient$f);
    return eo;
  }

  public static ERXFetchSpecification<EOProfilParcours> fetchSpec() {
    return new ERXFetchSpecification<EOProfilParcours>(_EOProfilParcours.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOProfilParcours> fetchAllEOProfilParcourses(EOEditingContext editingContext) {
    return _EOProfilParcours.fetchAllEOProfilParcourses(editingContext, null);
  }

  public static NSArray<EOProfilParcours> fetchAllEOProfilParcourses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOProfilParcours.fetchEOProfilParcourses(editingContext, null, sortOrderings);
  }

  public static NSArray<EOProfilParcours> fetchEOProfilParcourses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOProfilParcours> fetchSpec = new ERXFetchSpecification<EOProfilParcours>(_EOProfilParcours.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOProfilParcours> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOProfilParcours fetchEOProfilParcours(EOEditingContext editingContext, String keyName, Object value) {
    return _EOProfilParcours.fetchEOProfilParcours(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOProfilParcours fetchEOProfilParcours(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOProfilParcours> eoObjects = _EOProfilParcours.fetchEOProfilParcourses(editingContext, qualifier, null);
    EOProfilParcours eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOProfilParcours that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOProfilParcours fetchRequiredEOProfilParcours(EOEditingContext editingContext, String keyName, Object value) {
    return _EOProfilParcours.fetchRequiredEOProfilParcours(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOProfilParcours fetchRequiredEOProfilParcours(EOEditingContext editingContext, EOQualifier qualifier) {
    EOProfilParcours eoObject = _EOProfilParcours.fetchEOProfilParcours(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOProfilParcours that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOProfilParcours localInstanceIn(EOEditingContext editingContext, EOProfilParcours eo) {
    EOProfilParcours localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
