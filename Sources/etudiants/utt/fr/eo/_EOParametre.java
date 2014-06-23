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
// DO NOT EDIT.  Make changes to EOParametre.java instead.
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
public abstract class _EOParametre extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOParametre";

  // Attribute Keys
  public static final ERXKey<String> PARAM_DESCRIPTION = new ERXKey<String>("paramDescription");
  public static final ERXKey<String> PARAM_KEY = new ERXKey<String>("paramKey");
  public static final ERXKey<String> PARAM_VALUE = new ERXKey<String>("paramValue");
  // Relationship Keys

  // Attributes
  public static final String PARAM_DESCRIPTION_KEY = PARAM_DESCRIPTION.key();
  public static final String PARAM_KEY_KEY = PARAM_KEY.key();
  public static final String PARAM_VALUE_KEY = PARAM_VALUE.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_EOParametre.class);

  public EOParametre localInstanceIn(EOEditingContext editingContext) {
    EOParametre localInstance = (EOParametre)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String paramDescription() {
    return (String) storedValueForKey(_EOParametre.PARAM_DESCRIPTION_KEY);
  }

  public void setParamDescription(String value) {
    if (_EOParametre.LOG.isDebugEnabled()) {
    	_EOParametre.LOG.debug( "updating paramDescription from " + paramDescription() + " to " + value);
    }
    takeStoredValueForKey(value, _EOParametre.PARAM_DESCRIPTION_KEY);
  }

  public String paramKey() {
    return (String) storedValueForKey(_EOParametre.PARAM_KEY_KEY);
  }

  public void setParamKey(String value) {
    if (_EOParametre.LOG.isDebugEnabled()) {
    	_EOParametre.LOG.debug( "updating paramKey from " + paramKey() + " to " + value);
    }
    takeStoredValueForKey(value, _EOParametre.PARAM_KEY_KEY);
  }

  public String paramValue() {
    return (String) storedValueForKey(_EOParametre.PARAM_VALUE_KEY);
  }

  public void setParamValue(String value) {
    if (_EOParametre.LOG.isDebugEnabled()) {
    	_EOParametre.LOG.debug( "updating paramValue from " + paramValue() + " to " + value);
    }
    takeStoredValueForKey(value, _EOParametre.PARAM_VALUE_KEY);
  }


  public static EOParametre createEOParametre(EOEditingContext editingContext, String paramDescription
, String paramKey
, String paramValue
) {
    EOParametre eo = (EOParametre) EOUtilities.createAndInsertInstance(editingContext, _EOParametre.ENTITY_NAME);    
		eo.setParamDescription(paramDescription);
		eo.setParamKey(paramKey);
		eo.setParamValue(paramValue);
    return eo;
  }

  public static ERXFetchSpecification<EOParametre> fetchSpec() {
    return new ERXFetchSpecification<EOParametre>(_EOParametre.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOParametre> fetchAllEOParametres(EOEditingContext editingContext) {
    return _EOParametre.fetchAllEOParametres(editingContext, null);
  }

  public static NSArray<EOParametre> fetchAllEOParametres(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOParametre.fetchEOParametres(editingContext, null, sortOrderings);
  }

  public static NSArray<EOParametre> fetchEOParametres(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOParametre> fetchSpec = new ERXFetchSpecification<EOParametre>(_EOParametre.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOParametre> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOParametre fetchEOParametre(EOEditingContext editingContext, String keyName, Object value) {
    return _EOParametre.fetchEOParametre(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOParametre fetchEOParametre(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOParametre> eoObjects = _EOParametre.fetchEOParametres(editingContext, qualifier, null);
    EOParametre eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOParametre that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOParametre fetchRequiredEOParametre(EOEditingContext editingContext, String keyName, Object value) {
    return _EOParametre.fetchRequiredEOParametre(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOParametre fetchRequiredEOParametre(EOEditingContext editingContext, EOQualifier qualifier) {
    EOParametre eoObject = _EOParametre.fetchEOParametre(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOParametre that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOParametre localInstanceIn(EOEditingContext editingContext, EOParametre eo) {
    EOParametre localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
