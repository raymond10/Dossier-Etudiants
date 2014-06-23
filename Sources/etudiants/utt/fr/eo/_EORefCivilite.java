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
// DO NOT EDIT.  Make changes to EORefCivilite.java instead.
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
public abstract class _EORefCivilite extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EORefCivilite";

  // Attribute Keys
  public static final ERXKey<String> CIV_FR_ABR = new ERXKey<String>("civFrAbr");
  public static final ERXKey<String> CIVILITE = new ERXKey<String>("civilite");
  public static final ERXKey<String> CIVILITEC = new ERXKey<String>("civilitec");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOIndividu> INDIVIDUS = new ERXKey<etudiants.utt.fr.eo.EOIndividu>("individus");

  // Attributes
  public static final String CIV_FR_ABR_KEY = CIV_FR_ABR.key();
  public static final String CIVILITE_KEY = CIVILITE.key();
  public static final String CIVILITEC_KEY = CIVILITEC.key();
  // Relationships
  public static final String INDIVIDUS_KEY = INDIVIDUS.key();

  private static Logger LOG = Logger.getLogger(_EORefCivilite.class);

  public EORefCivilite localInstanceIn(EOEditingContext editingContext) {
    EORefCivilite localInstance = (EORefCivilite)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String civFrAbr() {
    return (String) storedValueForKey(_EORefCivilite.CIV_FR_ABR_KEY);
  }

  public void setCivFrAbr(String value) {
    if (_EORefCivilite.LOG.isDebugEnabled()) {
    	_EORefCivilite.LOG.debug( "updating civFrAbr from " + civFrAbr() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefCivilite.CIV_FR_ABR_KEY);
  }

  public String civilite() {
    return (String) storedValueForKey(_EORefCivilite.CIVILITE_KEY);
  }

  public void setCivilite(String value) {
    if (_EORefCivilite.LOG.isDebugEnabled()) {
    	_EORefCivilite.LOG.debug( "updating civilite from " + civilite() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefCivilite.CIVILITE_KEY);
  }

  public String civilitec() {
    return (String) storedValueForKey(_EORefCivilite.CIVILITEC_KEY);
  }

  public void setCivilitec(String value) {
    if (_EORefCivilite.LOG.isDebugEnabled()) {
    	_EORefCivilite.LOG.debug( "updating civilitec from " + civilitec() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefCivilite.CIVILITEC_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOIndividu> individus() {
    return (NSArray<etudiants.utt.fr.eo.EOIndividu>)storedValueForKey(_EORefCivilite.INDIVIDUS_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOIndividu> individus(EOQualifier qualifier) {
    return individus(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EOIndividu> individus(EOQualifier qualifier, boolean fetch) {
    return individus(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EOIndividu> individus(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EOIndividu> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOIndividu.REF_CIVILITE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EOIndividu.fetchEOIndividus(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = individus();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOIndividu>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOIndividu>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToIndividus(etudiants.utt.fr.eo.EOIndividu object) {
    includeObjectIntoPropertyWithKey(object, _EORefCivilite.INDIVIDUS_KEY);
  }

  public void removeFromIndividus(etudiants.utt.fr.eo.EOIndividu object) {
    excludeObjectFromPropertyWithKey(object, _EORefCivilite.INDIVIDUS_KEY);
  }

  public void addToIndividusRelationship(etudiants.utt.fr.eo.EOIndividu object) {
    if (_EORefCivilite.LOG.isDebugEnabled()) {
      _EORefCivilite.LOG.debug("adding " + object + " to individus relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToIndividus(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefCivilite.INDIVIDUS_KEY);
    }
  }

  public void removeFromIndividusRelationship(etudiants.utt.fr.eo.EOIndividu object) {
    if (_EORefCivilite.LOG.isDebugEnabled()) {
      _EORefCivilite.LOG.debug("removing " + object + " from individus relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromIndividus(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefCivilite.INDIVIDUS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOIndividu createIndividusRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOIndividu.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefCivilite.INDIVIDUS_KEY);
    return (etudiants.utt.fr.eo.EOIndividu) eo;
  }

  public void deleteIndividusRelationship(etudiants.utt.fr.eo.EOIndividu object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefCivilite.INDIVIDUS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllIndividusRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOIndividu> objects = individus().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteIndividusRelationship(objects.nextElement());
    }
  }


  public static EORefCivilite createEORefCivilite(EOEditingContext editingContext, String civilitec
) {
    EORefCivilite eo = (EORefCivilite) EOUtilities.createAndInsertInstance(editingContext, _EORefCivilite.ENTITY_NAME);    
		eo.setCivilitec(civilitec);
    return eo;
  }

  public static ERXFetchSpecification<EORefCivilite> fetchSpec() {
    return new ERXFetchSpecification<EORefCivilite>(_EORefCivilite.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EORefCivilite> fetchAllEORefCivilites(EOEditingContext editingContext) {
    return _EORefCivilite.fetchAllEORefCivilites(editingContext, null);
  }

  public static NSArray<EORefCivilite> fetchAllEORefCivilites(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EORefCivilite.fetchEORefCivilites(editingContext, null, sortOrderings);
  }

  public static NSArray<EORefCivilite> fetchEORefCivilites(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EORefCivilite> fetchSpec = new ERXFetchSpecification<EORefCivilite>(_EORefCivilite.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EORefCivilite> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EORefCivilite fetchEORefCivilite(EOEditingContext editingContext, String keyName, Object value) {
    return _EORefCivilite.fetchEORefCivilite(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EORefCivilite fetchEORefCivilite(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EORefCivilite> eoObjects = _EORefCivilite.fetchEORefCivilites(editingContext, qualifier, null);
    EORefCivilite eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EORefCivilite that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EORefCivilite fetchRequiredEORefCivilite(EOEditingContext editingContext, String keyName, Object value) {
    return _EORefCivilite.fetchRequiredEORefCivilite(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EORefCivilite fetchRequiredEORefCivilite(EOEditingContext editingContext, EOQualifier qualifier) {
    EORefCivilite eoObject = _EORefCivilite.fetchEORefCivilite(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EORefCivilite that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EORefCivilite localInstanceIn(EOEditingContext editingContext, EORefCivilite eo) {
    EORefCivilite localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
