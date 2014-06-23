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
// DO NOT EDIT.  Make changes to EOParamPeriode.java instead.
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
public abstract class _EOParamPeriode extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOParamPeriode";

  // Attribute Keys
  public static final ERXKey<String> AN_CIV = new ERXKey<String>("anCiv");
  public static final ERXKey<String> AN_UNIV = new ERXKey<String>("anUniv");
  public static final ERXKey<String> PAR_PRD_TYPE = new ERXKey<String>("parPrdType");
  public static final ERXKey<String> PAR_VAL = new ERXKey<String>("parVal");
  public static final ERXKey<String> PRD_UNIV = new ERXKey<String>("prdUniv");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EORefPeriode> EO_REF_PERIODE = new ERXKey<etudiants.utt.fr.eo.EORefPeriode>("eoRefPeriode");

  // Attributes
  public static final String AN_CIV_KEY = AN_CIV.key();
  public static final String AN_UNIV_KEY = AN_UNIV.key();
  public static final String PAR_PRD_TYPE_KEY = PAR_PRD_TYPE.key();
  public static final String PAR_VAL_KEY = PAR_VAL.key();
  public static final String PRD_UNIV_KEY = PRD_UNIV.key();
  // Relationships
  public static final String EO_REF_PERIODE_KEY = EO_REF_PERIODE.key();

  private static Logger LOG = Logger.getLogger(_EOParamPeriode.class);

  public EOParamPeriode localInstanceIn(EOEditingContext editingContext) {
    EOParamPeriode localInstance = (EOParamPeriode)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String anCiv() {
    return (String) storedValueForKey(_EOParamPeriode.AN_CIV_KEY);
  }

  public void setAnCiv(String value) {
    if (_EOParamPeriode.LOG.isDebugEnabled()) {
    	_EOParamPeriode.LOG.debug( "updating anCiv from " + anCiv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOParamPeriode.AN_CIV_KEY);
  }

  public String anUniv() {
    return (String) storedValueForKey(_EOParamPeriode.AN_UNIV_KEY);
  }

  public void setAnUniv(String value) {
    if (_EOParamPeriode.LOG.isDebugEnabled()) {
    	_EOParamPeriode.LOG.debug( "updating anUniv from " + anUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOParamPeriode.AN_UNIV_KEY);
  }

  public String parPrdType() {
    return (String) storedValueForKey(_EOParamPeriode.PAR_PRD_TYPE_KEY);
  }

  public void setParPrdType(String value) {
    if (_EOParamPeriode.LOG.isDebugEnabled()) {
    	_EOParamPeriode.LOG.debug( "updating parPrdType from " + parPrdType() + " to " + value);
    }
    takeStoredValueForKey(value, _EOParamPeriode.PAR_PRD_TYPE_KEY);
  }

  public String parVal() {
    return (String) storedValueForKey(_EOParamPeriode.PAR_VAL_KEY);
  }

  public void setParVal(String value) {
    if (_EOParamPeriode.LOG.isDebugEnabled()) {
    	_EOParamPeriode.LOG.debug( "updating parVal from " + parVal() + " to " + value);
    }
    takeStoredValueForKey(value, _EOParamPeriode.PAR_VAL_KEY);
  }

  public String prdUniv() {
    return (String) storedValueForKey(_EOParamPeriode.PRD_UNIV_KEY);
  }

  public void setPrdUniv(String value) {
    if (_EOParamPeriode.LOG.isDebugEnabled()) {
    	_EOParamPeriode.LOG.debug( "updating prdUniv from " + prdUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOParamPeriode.PRD_UNIV_KEY);
  }

  public etudiants.utt.fr.eo.EORefPeriode eoRefPeriode() {
    return (etudiants.utt.fr.eo.EORefPeriode)storedValueForKey(_EOParamPeriode.EO_REF_PERIODE_KEY);
  }
  
  public void setEoRefPeriode(etudiants.utt.fr.eo.EORefPeriode value) {
    takeStoredValueForKey(value, _EOParamPeriode.EO_REF_PERIODE_KEY);
  }

  public void setEoRefPeriodeRelationship(etudiants.utt.fr.eo.EORefPeriode value) {
    if (_EOParamPeriode.LOG.isDebugEnabled()) {
      _EOParamPeriode.LOG.debug("updating eoRefPeriode from " + eoRefPeriode() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setEoRefPeriode(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EORefPeriode oldValue = eoRefPeriode();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOParamPeriode.EO_REF_PERIODE_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOParamPeriode.EO_REF_PERIODE_KEY);
    }
  }
  

  public static EOParamPeriode createEOParamPeriode(EOEditingContext editingContext, String parPrdType
) {
    EOParamPeriode eo = (EOParamPeriode) EOUtilities.createAndInsertInstance(editingContext, _EOParamPeriode.ENTITY_NAME);    
		eo.setParPrdType(parPrdType);
    return eo;
  }

  public static ERXFetchSpecification<EOParamPeriode> fetchSpec() {
    return new ERXFetchSpecification<EOParamPeriode>(_EOParamPeriode.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOParamPeriode> fetchAllEOParamPeriodes(EOEditingContext editingContext) {
    return _EOParamPeriode.fetchAllEOParamPeriodes(editingContext, null);
  }

  public static NSArray<EOParamPeriode> fetchAllEOParamPeriodes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOParamPeriode.fetchEOParamPeriodes(editingContext, null, sortOrderings);
  }

  public static NSArray<EOParamPeriode> fetchEOParamPeriodes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOParamPeriode> fetchSpec = new ERXFetchSpecification<EOParamPeriode>(_EOParamPeriode.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOParamPeriode> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOParamPeriode fetchEOParamPeriode(EOEditingContext editingContext, String keyName, Object value) {
    return _EOParamPeriode.fetchEOParamPeriode(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOParamPeriode fetchEOParamPeriode(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOParamPeriode> eoObjects = _EOParamPeriode.fetchEOParamPeriodes(editingContext, qualifier, null);
    EOParamPeriode eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOParamPeriode that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOParamPeriode fetchRequiredEOParamPeriode(EOEditingContext editingContext, String keyName, Object value) {
    return _EOParamPeriode.fetchRequiredEOParamPeriode(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOParamPeriode fetchRequiredEOParamPeriode(EOEditingContext editingContext, EOQualifier qualifier) {
    EOParamPeriode eoObject = _EOParamPeriode.fetchEOParamPeriode(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOParamPeriode that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOParamPeriode localInstanceIn(EOEditingContext editingContext, EOParamPeriode eo) {
    EOParamPeriode localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<etudiants.utt.fr.eo.EOParamPeriode> fetchPeriodeCourante(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("periodeCourante", _EOParamPeriode.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOParamPeriode>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOParamPeriode> fetchPeriodeCourante(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("periodeCourante", _EOParamPeriode.ENTITY_NAME);
    return (NSArray<etudiants.utt.fr.eo.EOParamPeriode>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
