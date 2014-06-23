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
// DO NOT EDIT.  Make changes to EOVueUvsPeriode.java instead.
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
public abstract class _EOVueUvsPeriode extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueUvsPeriode";

  // Attribute Keys
  public static final ERXKey<Long> ID = new ERXKey<Long>("id");
  public static final ERXKey<String> LIBELLE = new ERXKey<String>("libelle");
  public static final ERXKey<String> ORDRE = new ERXKey<String>("ordre");
  public static final ERXKey<String> UVPERIODE = new ERXKey<String>("uvperiode");
  // Relationship Keys

  // Attributes
  public static final String ID_KEY = ID.key();
  public static final String LIBELLE_KEY = LIBELLE.key();
  public static final String ORDRE_KEY = ORDRE.key();
  public static final String UVPERIODE_KEY = UVPERIODE.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_EOVueUvsPeriode.class);

  public EOVueUvsPeriode localInstanceIn(EOEditingContext editingContext) {
    EOVueUvsPeriode localInstance = (EOVueUvsPeriode)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Long id() {
    return (Long) storedValueForKey(_EOVueUvsPeriode.ID_KEY);
  }

  public void setId(Long value) {
    if (_EOVueUvsPeriode.LOG.isDebugEnabled()) {
    	_EOVueUvsPeriode.LOG.debug( "updating id from " + id() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueUvsPeriode.ID_KEY);
  }

  public String libelle() {
    return (String) storedValueForKey(_EOVueUvsPeriode.LIBELLE_KEY);
  }

  public void setLibelle(String value) {
    if (_EOVueUvsPeriode.LOG.isDebugEnabled()) {
    	_EOVueUvsPeriode.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueUvsPeriode.LIBELLE_KEY);
  }

  public String ordre() {
    return (String) storedValueForKey(_EOVueUvsPeriode.ORDRE_KEY);
  }

  public void setOrdre(String value) {
    if (_EOVueUvsPeriode.LOG.isDebugEnabled()) {
    	_EOVueUvsPeriode.LOG.debug( "updating ordre from " + ordre() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueUvsPeriode.ORDRE_KEY);
  }

  public String uvperiode() {
    return (String) storedValueForKey(_EOVueUvsPeriode.UVPERIODE_KEY);
  }

  public void setUvperiode(String value) {
    if (_EOVueUvsPeriode.LOG.isDebugEnabled()) {
    	_EOVueUvsPeriode.LOG.debug( "updating uvperiode from " + uvperiode() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueUvsPeriode.UVPERIODE_KEY);
  }


  public static EOVueUvsPeriode createEOVueUvsPeriode(EOEditingContext editingContext, Long id
) {
    EOVueUvsPeriode eo = (EOVueUvsPeriode) EOUtilities.createAndInsertInstance(editingContext, _EOVueUvsPeriode.ENTITY_NAME);    
		eo.setId(id);
    return eo;
  }

  public static ERXFetchSpecification<EOVueUvsPeriode> fetchSpec() {
    return new ERXFetchSpecification<EOVueUvsPeriode>(_EOVueUvsPeriode.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueUvsPeriode> fetchAllEOVueUvsPeriodes(EOEditingContext editingContext) {
    return _EOVueUvsPeriode.fetchAllEOVueUvsPeriodes(editingContext, null);
  }

  public static NSArray<EOVueUvsPeriode> fetchAllEOVueUvsPeriodes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueUvsPeriode.fetchEOVueUvsPeriodes(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueUvsPeriode> fetchEOVueUvsPeriodes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueUvsPeriode> fetchSpec = new ERXFetchSpecification<EOVueUvsPeriode>(_EOVueUvsPeriode.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueUvsPeriode> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueUvsPeriode fetchEOVueUvsPeriode(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueUvsPeriode.fetchEOVueUvsPeriode(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueUvsPeriode fetchEOVueUvsPeriode(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueUvsPeriode> eoObjects = _EOVueUvsPeriode.fetchEOVueUvsPeriodes(editingContext, qualifier, null);
    EOVueUvsPeriode eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueUvsPeriode that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueUvsPeriode fetchRequiredEOVueUvsPeriode(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueUvsPeriode.fetchRequiredEOVueUvsPeriode(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueUvsPeriode fetchRequiredEOVueUvsPeriode(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueUvsPeriode eoObject = _EOVueUvsPeriode.fetchEOVueUvsPeriode(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueUvsPeriode that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueUvsPeriode localInstanceIn(EOEditingContext editingContext, EOVueUvsPeriode eo) {
    EOVueUvsPeriode localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
