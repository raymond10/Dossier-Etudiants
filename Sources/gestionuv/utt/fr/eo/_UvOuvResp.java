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
// DO NOT EDIT.  Make changes to UvOuvResp.java instead.
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
public abstract class _UvOuvResp extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "UvOuvResp";

  // Attribute Keys
  // Relationship Keys
  public static final ERXKey<gestionuv.utt.fr.eo.EOUvOuv> EO_UV_OUVS = new ERXKey<gestionuv.utt.fr.eo.EOUvOuv>("eoUvOuvs");

  // Attributes
  // Relationships
  public static final String EO_UV_OUVS_KEY = EO_UV_OUVS.key();

  private static Logger LOG = Logger.getLogger(_UvOuvResp.class);

  public UvOuvResp localInstanceIn(EOEditingContext editingContext) {
    UvOuvResp localInstance = (UvOuvResp)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSArray<gestionuv.utt.fr.eo.EOUvOuv> eoUvOuvs() {
    return (NSArray<gestionuv.utt.fr.eo.EOUvOuv>)storedValueForKey(_UvOuvResp.EO_UV_OUVS_KEY);
  }

  public NSArray<gestionuv.utt.fr.eo.EOUvOuv> eoUvOuvs(EOQualifier qualifier) {
    return eoUvOuvs(qualifier, null);
  }

  public NSArray<gestionuv.utt.fr.eo.EOUvOuv> eoUvOuvs(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<gestionuv.utt.fr.eo.EOUvOuv> results;
      results = eoUvOuvs();
      if (qualifier != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOUvOuv>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOUvOuv>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEoUvOuvs(gestionuv.utt.fr.eo.EOUvOuv object) {
    includeObjectIntoPropertyWithKey(object, _UvOuvResp.EO_UV_OUVS_KEY);
  }

  public void removeFromEoUvOuvs(gestionuv.utt.fr.eo.EOUvOuv object) {
    excludeObjectFromPropertyWithKey(object, _UvOuvResp.EO_UV_OUVS_KEY);
  }

  public void addToEoUvOuvsRelationship(gestionuv.utt.fr.eo.EOUvOuv object) {
    if (_UvOuvResp.LOG.isDebugEnabled()) {
      _UvOuvResp.LOG.debug("adding " + object + " to eoUvOuvs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoUvOuvs(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _UvOuvResp.EO_UV_OUVS_KEY);
    }
  }

  public void removeFromEoUvOuvsRelationship(gestionuv.utt.fr.eo.EOUvOuv object) {
    if (_UvOuvResp.LOG.isDebugEnabled()) {
      _UvOuvResp.LOG.debug("removing " + object + " from eoUvOuvs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoUvOuvs(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _UvOuvResp.EO_UV_OUVS_KEY);
    }
  }

  public gestionuv.utt.fr.eo.EOUvOuv createEoUvOuvsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.EOUvOuv.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _UvOuvResp.EO_UV_OUVS_KEY);
    return (gestionuv.utt.fr.eo.EOUvOuv) eo;
  }

  public void deleteEoUvOuvsRelationship(gestionuv.utt.fr.eo.EOUvOuv object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _UvOuvResp.EO_UV_OUVS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoUvOuvsRelationships() {
    Enumeration<gestionuv.utt.fr.eo.EOUvOuv> objects = eoUvOuvs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoUvOuvsRelationship(objects.nextElement());
    }
  }


  public static UvOuvResp createUvOuvResp(EOEditingContext editingContext) {
    UvOuvResp eo = (UvOuvResp) EOUtilities.createAndInsertInstance(editingContext, _UvOuvResp.ENTITY_NAME);    
    return eo;
  }

  public static ERXFetchSpecification<UvOuvResp> fetchSpec() {
    return new ERXFetchSpecification<UvOuvResp>(_UvOuvResp.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<UvOuvResp> fetchAllUvOuvResps(EOEditingContext editingContext) {
    return _UvOuvResp.fetchAllUvOuvResps(editingContext, null);
  }

  public static NSArray<UvOuvResp> fetchAllUvOuvResps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _UvOuvResp.fetchUvOuvResps(editingContext, null, sortOrderings);
  }

  public static NSArray<UvOuvResp> fetchUvOuvResps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<UvOuvResp> fetchSpec = new ERXFetchSpecification<UvOuvResp>(_UvOuvResp.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<UvOuvResp> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static UvOuvResp fetchUvOuvResp(EOEditingContext editingContext, String keyName, Object value) {
    return _UvOuvResp.fetchUvOuvResp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static UvOuvResp fetchUvOuvResp(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<UvOuvResp> eoObjects = _UvOuvResp.fetchUvOuvResps(editingContext, qualifier, null);
    UvOuvResp eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one UvOuvResp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static UvOuvResp fetchRequiredUvOuvResp(EOEditingContext editingContext, String keyName, Object value) {
    return _UvOuvResp.fetchRequiredUvOuvResp(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static UvOuvResp fetchRequiredUvOuvResp(EOEditingContext editingContext, EOQualifier qualifier) {
    UvOuvResp eoObject = _UvOuvResp.fetchUvOuvResp(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no UvOuvResp that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static UvOuvResp localInstanceIn(EOEditingContext editingContext, UvOuvResp eo) {
    UvOuvResp localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
