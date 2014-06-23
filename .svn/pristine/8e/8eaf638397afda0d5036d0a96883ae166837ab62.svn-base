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
// DO NOT EDIT.  Make changes to EOVueDiplwithprd.java instead.
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
public abstract class _EOVueDiplwithprd extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueDiplwithprd";

  // Attribute Keys
  public static final ERXKey<String> DIPL_DEBUT = new ERXKey<String>("diplDebut");
  public static final ERXKey<String> DIPL_FERM = new ERXKey<String>("diplFerm");
  public static final ERXKey<String> ID = new ERXKey<String>("id");
  public static final ERXKey<String> LIBELLE = new ERXKey<String>("libelle");
  public static final ERXKey<Double> ORDRE = new ERXKey<Double>("ordre");
  // Relationship Keys

  // Attributes
  public static final String DIPL_DEBUT_KEY = DIPL_DEBUT.key();
  public static final String DIPL_FERM_KEY = DIPL_FERM.key();
  public static final String ID_KEY = ID.key();
  public static final String LIBELLE_KEY = LIBELLE.key();
  public static final String ORDRE_KEY = ORDRE.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_EOVueDiplwithprd.class);

  public EOVueDiplwithprd localInstanceIn(EOEditingContext editingContext) {
    EOVueDiplwithprd localInstance = (EOVueDiplwithprd)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String diplDebut() {
    return (String) storedValueForKey(_EOVueDiplwithprd.DIPL_DEBUT_KEY);
  }

  public void setDiplDebut(String value) {
    if (_EOVueDiplwithprd.LOG.isDebugEnabled()) {
    	_EOVueDiplwithprd.LOG.debug( "updating diplDebut from " + diplDebut() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplwithprd.DIPL_DEBUT_KEY);
  }

  public String diplFerm() {
    return (String) storedValueForKey(_EOVueDiplwithprd.DIPL_FERM_KEY);
  }

  public void setDiplFerm(String value) {
    if (_EOVueDiplwithprd.LOG.isDebugEnabled()) {
    	_EOVueDiplwithprd.LOG.debug( "updating diplFerm from " + diplFerm() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplwithprd.DIPL_FERM_KEY);
  }

  public String id() {
    return (String) storedValueForKey(_EOVueDiplwithprd.ID_KEY);
  }

  public void setId(String value) {
    if (_EOVueDiplwithprd.LOG.isDebugEnabled()) {
    	_EOVueDiplwithprd.LOG.debug( "updating id from " + id() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplwithprd.ID_KEY);
  }

  public String libelle() {
    return (String) storedValueForKey(_EOVueDiplwithprd.LIBELLE_KEY);
  }

  public void setLibelle(String value) {
    if (_EOVueDiplwithprd.LOG.isDebugEnabled()) {
    	_EOVueDiplwithprd.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplwithprd.LIBELLE_KEY);
  }

  public Double ordre() {
    return (Double) storedValueForKey(_EOVueDiplwithprd.ORDRE_KEY);
  }

  public void setOrdre(Double value) {
    if (_EOVueDiplwithprd.LOG.isDebugEnabled()) {
    	_EOVueDiplwithprd.LOG.debug( "updating ordre from " + ordre() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDiplwithprd.ORDRE_KEY);
  }


  public static EOVueDiplwithprd createEOVueDiplwithprd(EOEditingContext editingContext, String id
) {
    EOVueDiplwithprd eo = (EOVueDiplwithprd) EOUtilities.createAndInsertInstance(editingContext, _EOVueDiplwithprd.ENTITY_NAME);    
		eo.setId(id);
    return eo;
  }

  public static ERXFetchSpecification<EOVueDiplwithprd> fetchSpec() {
    return new ERXFetchSpecification<EOVueDiplwithprd>(_EOVueDiplwithprd.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueDiplwithprd> fetchAllEOVueDiplwithprds(EOEditingContext editingContext) {
    return _EOVueDiplwithprd.fetchAllEOVueDiplwithprds(editingContext, null);
  }

  public static NSArray<EOVueDiplwithprd> fetchAllEOVueDiplwithprds(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueDiplwithprd.fetchEOVueDiplwithprds(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueDiplwithprd> fetchEOVueDiplwithprds(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueDiplwithprd> fetchSpec = new ERXFetchSpecification<EOVueDiplwithprd>(_EOVueDiplwithprd.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueDiplwithprd> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueDiplwithprd fetchEOVueDiplwithprd(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueDiplwithprd.fetchEOVueDiplwithprd(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueDiplwithprd fetchEOVueDiplwithprd(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueDiplwithprd> eoObjects = _EOVueDiplwithprd.fetchEOVueDiplwithprds(editingContext, qualifier, null);
    EOVueDiplwithprd eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueDiplwithprd that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueDiplwithprd fetchRequiredEOVueDiplwithprd(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueDiplwithprd.fetchRequiredEOVueDiplwithprd(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueDiplwithprd fetchRequiredEOVueDiplwithprd(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueDiplwithprd eoObject = _EOVueDiplwithprd.fetchEOVueDiplwithprd(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueDiplwithprd that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueDiplwithprd localInstanceIn(EOEditingContext editingContext, EOVueDiplwithprd eo) {
    EOVueDiplwithprd localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<etudiants.utt.fr.eo.EOVueDiplwithprd> fetchListDiplome(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("listDiplome", _EOVueDiplwithprd.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOVueDiplwithprd>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOVueDiplwithprd> fetchListDiplome(EOEditingContext editingContext,
	String periodeBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("listDiplome", _EOVueDiplwithprd.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(periodeBinding, "periode");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
	NSArray<etudiants.utt.fr.eo.EOVueDiplwithprd> eoObjects = null;
    	eoObjects = editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }
  
}
