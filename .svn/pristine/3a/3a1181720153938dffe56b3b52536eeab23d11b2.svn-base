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
// DO NOT EDIT.  Make changes to EOVueSpecMast.java instead.
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
public abstract class _EOVueSpecMast extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueSpecMast";

  // Attribute Keys
  public static final ERXKey<String> ID = new ERXKey<String>("id");
  public static final ERXKey<String> LIBELLE = new ERXKey<String>("libelle");
  public static final ERXKey<String> ORDRE = new ERXKey<String>("ordre");
  public static final ERXKey<String> PDIPLOME = new ERXKey<String>("pdiplome");
  public static final ERXKey<String> PPERIODE = new ERXKey<String>("pperiode");
  // Relationship Keys

  // Attributes
  public static final String ID_KEY = ID.key();
  public static final String LIBELLE_KEY = LIBELLE.key();
  public static final String ORDRE_KEY = ORDRE.key();
  public static final String PDIPLOME_KEY = PDIPLOME.key();
  public static final String PPERIODE_KEY = PPERIODE.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_EOVueSpecMast.class);

  public EOVueSpecMast localInstanceIn(EOEditingContext editingContext) {
    EOVueSpecMast localInstance = (EOVueSpecMast)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String id() {
    return (String) storedValueForKey(_EOVueSpecMast.ID_KEY);
  }

  public void setId(String value) {
    if (_EOVueSpecMast.LOG.isDebugEnabled()) {
    	_EOVueSpecMast.LOG.debug( "updating id from " + id() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSpecMast.ID_KEY);
  }

  public String libelle() {
    return (String) storedValueForKey(_EOVueSpecMast.LIBELLE_KEY);
  }

  public void setLibelle(String value) {
    if (_EOVueSpecMast.LOG.isDebugEnabled()) {
    	_EOVueSpecMast.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSpecMast.LIBELLE_KEY);
  }

  public String ordre() {
    return (String) storedValueForKey(_EOVueSpecMast.ORDRE_KEY);
  }

  public void setOrdre(String value) {
    if (_EOVueSpecMast.LOG.isDebugEnabled()) {
    	_EOVueSpecMast.LOG.debug( "updating ordre from " + ordre() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSpecMast.ORDRE_KEY);
  }

  public String pdiplome() {
    return (String) storedValueForKey(_EOVueSpecMast.PDIPLOME_KEY);
  }

  public void setPdiplome(String value) {
    if (_EOVueSpecMast.LOG.isDebugEnabled()) {
    	_EOVueSpecMast.LOG.debug( "updating pdiplome from " + pdiplome() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSpecMast.PDIPLOME_KEY);
  }

  public String pperiode() {
    return (String) storedValueForKey(_EOVueSpecMast.PPERIODE_KEY);
  }

  public void setPperiode(String value) {
    if (_EOVueSpecMast.LOG.isDebugEnabled()) {
    	_EOVueSpecMast.LOG.debug( "updating pperiode from " + pperiode() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSpecMast.PPERIODE_KEY);
  }


  public static EOVueSpecMast createEOVueSpecMast(EOEditingContext editingContext, String id
) {
    EOVueSpecMast eo = (EOVueSpecMast) EOUtilities.createAndInsertInstance(editingContext, _EOVueSpecMast.ENTITY_NAME);    
		eo.setId(id);
    return eo;
  }

  public static ERXFetchSpecification<EOVueSpecMast> fetchSpec() {
    return new ERXFetchSpecification<EOVueSpecMast>(_EOVueSpecMast.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueSpecMast> fetchAllEOVueSpecMasts(EOEditingContext editingContext) {
    return _EOVueSpecMast.fetchAllEOVueSpecMasts(editingContext, null);
  }

  public static NSArray<EOVueSpecMast> fetchAllEOVueSpecMasts(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueSpecMast.fetchEOVueSpecMasts(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueSpecMast> fetchEOVueSpecMasts(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueSpecMast> fetchSpec = new ERXFetchSpecification<EOVueSpecMast>(_EOVueSpecMast.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueSpecMast> eoObjects = null;
    	eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueSpecMast fetchEOVueSpecMast(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueSpecMast.fetchEOVueSpecMast(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueSpecMast fetchEOVueSpecMast(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueSpecMast> eoObjects = _EOVueSpecMast.fetchEOVueSpecMasts(editingContext, qualifier, null);
    EOVueSpecMast eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueSpecMast that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueSpecMast fetchRequiredEOVueSpecMast(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueSpecMast.fetchRequiredEOVueSpecMast(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueSpecMast fetchRequiredEOVueSpecMast(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueSpecMast eoObject = _EOVueSpecMast.fetchEOVueSpecMast(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueSpecMast that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueSpecMast localInstanceIn(EOEditingContext editingContext, EOVueSpecMast eo) {
    EOVueSpecMast localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
