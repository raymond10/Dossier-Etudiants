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
// DO NOT EDIT.  Make changes to EOVueSelectumdalites.java instead.
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
public abstract class _EOVueSelectumdalites extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueSelectumdalites";

  // Attribute Keys
  public static final ERXKey<String> CONTROLE = new ERXKey<String>("controle");
  public static final ERXKey<String> CONTROLE_LIB = new ERXKey<String>("controleLib");
  public static final ERXKey<String> NOTE_ELIM = new ERXKey<String>("noteElim");
  public static final ERXKey<String> OBSERVATION = new ERXKey<String>("observation");
  public static final ERXKey<String> PERIODE = new ERXKey<String>("periode");
  public static final ERXKey<String> UV = new ERXKey<String>("uv");
  public static final ERXKey<Long> UV_OUV_ID = new ERXKey<Long>("uvOuvId");
  public static final ERXKey<Double> VALEUR = new ERXKey<Double>("valeur");
  // Relationship Keys

  // Attributes
  public static final String CONTROLE_KEY = CONTROLE.key();
  public static final String CONTROLE_LIB_KEY = CONTROLE_LIB.key();
  public static final String NOTE_ELIM_KEY = NOTE_ELIM.key();
  public static final String OBSERVATION_KEY = OBSERVATION.key();
  public static final String PERIODE_KEY = PERIODE.key();
  public static final String UV_KEY = UV.key();
  public static final String UV_OUV_ID_KEY = UV_OUV_ID.key();
  public static final String VALEUR_KEY = VALEUR.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_EOVueSelectumdalites.class);

  public EOVueSelectumdalites localInstanceIn(EOEditingContext editingContext) {
    EOVueSelectumdalites localInstance = (EOVueSelectumdalites)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String controle() {
    return (String) storedValueForKey(_EOVueSelectumdalites.CONTROLE_KEY);
  }

  public void setControle(String value) {
    if (_EOVueSelectumdalites.LOG.isDebugEnabled()) {
    	_EOVueSelectumdalites.LOG.debug( "updating controle from " + controle() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectumdalites.CONTROLE_KEY);
  }

  public String controleLib() {
    return (String) storedValueForKey(_EOVueSelectumdalites.CONTROLE_LIB_KEY);
  }

  public void setControleLib(String value) {
    if (_EOVueSelectumdalites.LOG.isDebugEnabled()) {
    	_EOVueSelectumdalites.LOG.debug( "updating controleLib from " + controleLib() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectumdalites.CONTROLE_LIB_KEY);
  }

  public String noteElim() {
    return (String) storedValueForKey(_EOVueSelectumdalites.NOTE_ELIM_KEY);
  }

  public void setNoteElim(String value) {
    if (_EOVueSelectumdalites.LOG.isDebugEnabled()) {
    	_EOVueSelectumdalites.LOG.debug( "updating noteElim from " + noteElim() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectumdalites.NOTE_ELIM_KEY);
  }

  public String observation() {
    return (String) storedValueForKey(_EOVueSelectumdalites.OBSERVATION_KEY);
  }

  public void setObservation(String value) {
    if (_EOVueSelectumdalites.LOG.isDebugEnabled()) {
    	_EOVueSelectumdalites.LOG.debug( "updating observation from " + observation() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectumdalites.OBSERVATION_KEY);
  }

  public String periode() {
    return (String) storedValueForKey(_EOVueSelectumdalites.PERIODE_KEY);
  }

  public void setPeriode(String value) {
    if (_EOVueSelectumdalites.LOG.isDebugEnabled()) {
    	_EOVueSelectumdalites.LOG.debug( "updating periode from " + periode() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectumdalites.PERIODE_KEY);
  }

  public String uv() {
    return (String) storedValueForKey(_EOVueSelectumdalites.UV_KEY);
  }

  public void setUv(String value) {
    if (_EOVueSelectumdalites.LOG.isDebugEnabled()) {
    	_EOVueSelectumdalites.LOG.debug( "updating uv from " + uv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectumdalites.UV_KEY);
  }

  public Long uvOuvId() {
    return (Long) storedValueForKey(_EOVueSelectumdalites.UV_OUV_ID_KEY);
  }

  public void setUvOuvId(Long value) {
    if (_EOVueSelectumdalites.LOG.isDebugEnabled()) {
    	_EOVueSelectumdalites.LOG.debug( "updating uvOuvId from " + uvOuvId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectumdalites.UV_OUV_ID_KEY);
  }

  public Double valeur() {
    return (Double) storedValueForKey(_EOVueSelectumdalites.VALEUR_KEY);
  }

  public void setValeur(Double value) {
    if (_EOVueSelectumdalites.LOG.isDebugEnabled()) {
    	_EOVueSelectumdalites.LOG.debug( "updating valeur from " + valeur() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectumdalites.VALEUR_KEY);
  }


  public static EOVueSelectumdalites createEOVueSelectumdalites(EOEditingContext editingContext, String controle
, Long uvOuvId
) {
    EOVueSelectumdalites eo = (EOVueSelectumdalites) EOUtilities.createAndInsertInstance(editingContext, _EOVueSelectumdalites.ENTITY_NAME);    
		eo.setControle(controle);
		eo.setUvOuvId(uvOuvId);
    return eo;
  }

  public static ERXFetchSpecification<EOVueSelectumdalites> fetchSpec() {
    return new ERXFetchSpecification<EOVueSelectumdalites>(_EOVueSelectumdalites.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueSelectumdalites> fetchAllEOVueSelectumdaliteses(EOEditingContext editingContext) {
    return _EOVueSelectumdalites.fetchAllEOVueSelectumdaliteses(editingContext, null);
  }

  public static NSArray<EOVueSelectumdalites> fetchAllEOVueSelectumdaliteses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueSelectumdalites.fetchEOVueSelectumdaliteses(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueSelectumdalites> fetchEOVueSelectumdaliteses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueSelectumdalites> fetchSpec = new ERXFetchSpecification<EOVueSelectumdalites>(_EOVueSelectumdalites.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueSelectumdalites> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueSelectumdalites fetchEOVueSelectumdalites(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueSelectumdalites.fetchEOVueSelectumdalites(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueSelectumdalites fetchEOVueSelectumdalites(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueSelectumdalites> eoObjects = _EOVueSelectumdalites.fetchEOVueSelectumdaliteses(editingContext, qualifier, null);
    EOVueSelectumdalites eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueSelectumdalites that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueSelectumdalites fetchRequiredEOVueSelectumdalites(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueSelectumdalites.fetchRequiredEOVueSelectumdalites(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueSelectumdalites fetchRequiredEOVueSelectumdalites(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueSelectumdalites eoObject = _EOVueSelectumdalites.fetchEOVueSelectumdalites(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueSelectumdalites that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueSelectumdalites localInstanceIn(EOEditingContext editingContext, EOVueSelectumdalites eo) {
    EOVueSelectumdalites localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
