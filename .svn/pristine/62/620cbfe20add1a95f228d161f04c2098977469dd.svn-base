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
// DO NOT EDIT.  Make changes to EOVueProfilParcours.java instead.
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
public abstract class _EOVueProfilParcours extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueProfilParcours";

  // Attribute Keys
  public static final ERXKey<String> DIPLOME$C = new ERXKey<String>("diplome$c");
  public static final ERXKey<Long> ETU_ID = new ERXKey<Long>("etuId");
  public static final ERXKey<String> PRD_DEBUT = new ERXKey<String>("prdDebut");
  public static final ERXKey<String> PRD_FIN = new ERXKey<String>("prdFin");
  public static final ERXKey<String> REORIENT$F = new ERXKey<String>("reorient$f");
  // Relationship Keys

  // Attributes
  public static final String DIPLOME$C_KEY = DIPLOME$C.key();
  public static final String ETU_ID_KEY = ETU_ID.key();
  public static final String PRD_DEBUT_KEY = PRD_DEBUT.key();
  public static final String PRD_FIN_KEY = PRD_FIN.key();
  public static final String REORIENT$F_KEY = REORIENT$F.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_EOVueProfilParcours.class);

  public EOVueProfilParcours localInstanceIn(EOEditingContext editingContext) {
    EOVueProfilParcours localInstance = (EOVueProfilParcours)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String diplome$c() {
    return (String) storedValueForKey(_EOVueProfilParcours.DIPLOME$C_KEY);
  }

  public void setDiplome$c(String value) {
    if (_EOVueProfilParcours.LOG.isDebugEnabled()) {
    	_EOVueProfilParcours.LOG.debug( "updating diplome$c from " + diplome$c() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueProfilParcours.DIPLOME$C_KEY);
  }

  public Long etuId() {
    return (Long) storedValueForKey(_EOVueProfilParcours.ETU_ID_KEY);
  }

  public void setEtuId(Long value) {
    if (_EOVueProfilParcours.LOG.isDebugEnabled()) {
    	_EOVueProfilParcours.LOG.debug( "updating etuId from " + etuId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueProfilParcours.ETU_ID_KEY);
  }

  public String prdDebut() {
    return (String) storedValueForKey(_EOVueProfilParcours.PRD_DEBUT_KEY);
  }

  public void setPrdDebut(String value) {
    if (_EOVueProfilParcours.LOG.isDebugEnabled()) {
    	_EOVueProfilParcours.LOG.debug( "updating prdDebut from " + prdDebut() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueProfilParcours.PRD_DEBUT_KEY);
  }

  public String prdFin() {
    return (String) storedValueForKey(_EOVueProfilParcours.PRD_FIN_KEY);
  }

  public void setPrdFin(String value) {
    if (_EOVueProfilParcours.LOG.isDebugEnabled()) {
    	_EOVueProfilParcours.LOG.debug( "updating prdFin from " + prdFin() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueProfilParcours.PRD_FIN_KEY);
  }

  public String reorient$f() {
    return (String) storedValueForKey(_EOVueProfilParcours.REORIENT$F_KEY);
  }

  public void setReorient$f(String value) {
    if (_EOVueProfilParcours.LOG.isDebugEnabled()) {
    	_EOVueProfilParcours.LOG.debug( "updating reorient$f from " + reorient$f() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueProfilParcours.REORIENT$F_KEY);
  }


  public static EOVueProfilParcours createEOVueProfilParcours(EOEditingContext editingContext, String diplome$c
, Long etuId
) {
    EOVueProfilParcours eo = (EOVueProfilParcours) EOUtilities.createAndInsertInstance(editingContext, _EOVueProfilParcours.ENTITY_NAME);    
		eo.setDiplome$c(diplome$c);
		eo.setEtuId(etuId);
    return eo;
  }

  public static ERXFetchSpecification<EOVueProfilParcours> fetchSpec() {
    return new ERXFetchSpecification<EOVueProfilParcours>(_EOVueProfilParcours.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueProfilParcours> fetchAllEOVueProfilParcourses(EOEditingContext editingContext) {
    return _EOVueProfilParcours.fetchAllEOVueProfilParcourses(editingContext, null);
  }

  public static NSArray<EOVueProfilParcours> fetchAllEOVueProfilParcourses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueProfilParcours.fetchEOVueProfilParcourses(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueProfilParcours> fetchEOVueProfilParcourses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueProfilParcours> fetchSpec = new ERXFetchSpecification<EOVueProfilParcours>(_EOVueProfilParcours.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueProfilParcours> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueProfilParcours fetchEOVueProfilParcours(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueProfilParcours.fetchEOVueProfilParcours(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueProfilParcours fetchEOVueProfilParcours(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueProfilParcours> eoObjects = _EOVueProfilParcours.fetchEOVueProfilParcourses(editingContext, qualifier, null);
    EOVueProfilParcours eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueProfilParcours that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueProfilParcours fetchRequiredEOVueProfilParcours(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueProfilParcours.fetchRequiredEOVueProfilParcours(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueProfilParcours fetchRequiredEOVueProfilParcours(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueProfilParcours eoObject = _EOVueProfilParcours.fetchEOVueProfilParcours(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueProfilParcours that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueProfilParcours localInstanceIn(EOEditingContext editingContext, EOVueProfilParcours eo) {
    EOVueProfilParcours localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
