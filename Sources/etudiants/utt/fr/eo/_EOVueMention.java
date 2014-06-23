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
// DO NOT EDIT.  Make changes to EOVueMention.java instead.
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
public abstract class _EOVueMention extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueMention";

  // Attribute Keys
  public static final ERXKey<String> LIBELLE = new ERXKey<String>("libelle");
  public static final ERXKey<String> ORDRE = new ERXKey<String>("ordre");
  // Relationship Keys

  // Attributes
  public static final String LIBELLE_KEY = LIBELLE.key();
  public static final String ORDRE_KEY = ORDRE.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_EOVueMention.class);

  public EOVueMention localInstanceIn(EOEditingContext editingContext) {
    EOVueMention localInstance = (EOVueMention)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String libelle() {
    return (String) storedValueForKey(_EOVueMention.LIBELLE_KEY);
  }

  public void setLibelle(String value) {
    if (_EOVueMention.LOG.isDebugEnabled()) {
    	_EOVueMention.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueMention.LIBELLE_KEY);
  }

  public String ordre() {
    return (String) storedValueForKey(_EOVueMention.ORDRE_KEY);
  }

  public void setOrdre(String value) {
    if (_EOVueMention.LOG.isDebugEnabled()) {
    	_EOVueMention.LOG.debug( "updating ordre from " + ordre() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueMention.ORDRE_KEY);
  }


  public static EOVueMention createEOVueMention(EOEditingContext editingContext, String libelle
, String ordre
) {
    EOVueMention eo = (EOVueMention) EOUtilities.createAndInsertInstance(editingContext, _EOVueMention.ENTITY_NAME);    
		eo.setLibelle(libelle);
		eo.setOrdre(ordre);
    return eo;
  }

  public static ERXFetchSpecification<EOVueMention> fetchSpec() {
    return new ERXFetchSpecification<EOVueMention>(_EOVueMention.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueMention> fetchAllEOVueMentions(EOEditingContext editingContext) {
    return _EOVueMention.fetchAllEOVueMentions(editingContext, null);
  }

  public static NSArray<EOVueMention> fetchAllEOVueMentions(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueMention.fetchEOVueMentions(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueMention> fetchEOVueMentions(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueMention> fetchSpec = new ERXFetchSpecification<EOVueMention>(_EOVueMention.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueMention> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueMention fetchEOVueMention(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueMention.fetchEOVueMention(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueMention fetchEOVueMention(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueMention> eoObjects = _EOVueMention.fetchEOVueMentions(editingContext, qualifier, null);
    EOVueMention eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueMention that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueMention fetchRequiredEOVueMention(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueMention.fetchRequiredEOVueMention(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueMention fetchRequiredEOVueMention(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueMention eoObject = _EOVueMention.fetchEOVueMention(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueMention that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueMention localInstanceIn(EOEditingContext editingContext, EOVueMention eo) {
    EOVueMention localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
