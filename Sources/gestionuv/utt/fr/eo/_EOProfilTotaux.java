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
// DO NOT EDIT.  Make changes to EOProfilTotaux.java instead.
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
public abstract class _EOProfilTotaux extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOProfilTotaux";

  // Attribute Keys
  public static final ERXKey<String> ACQUIS$F = new ERXKey<String>("acquis$f");
  public static final ERXKey<String> DIPLOMEC = new ERXKey<String>("diplomec");
  public static final ERXKey<Long> ETU_ID = new ERXKey<Long>("etuId");
  public static final ERXKey<Double> LONGUEUR = new ERXKey<Double>("longueur");
  public static final ERXKey<String> MIN = new ERXKey<String>("min");
  public static final ERXKey<Double> ORDRE_COL = new ERXKey<Double>("ordreCol");
  public static final ERXKey<Double> ORDRE_LG = new ERXKey<Double>("ordreLg");
  public static final ERXKey<String> PRD_DEBUT = new ERXKey<String>("prdDebut");
  public static final ERXKey<Long> PROFIL_PARAM_ID = new ERXKey<Long>("profilParamId");
  public static final ERXKey<Long> PROFIL_TOTAL_ID = new ERXKey<Long>("profilTotalId");
  public static final ERXKey<String> TOTAL = new ERXKey<String>("total");
  // Relationship Keys
  public static final ERXKey<gestionuv.utt.fr.eo.EOProfilParam> PROFIL_PARAM = new ERXKey<gestionuv.utt.fr.eo.EOProfilParam>("profilParam");
  public static final ERXKey<gestionuv.utt.fr.eo.EOProfilParcours> PROFIL_PARCOURS = new ERXKey<gestionuv.utt.fr.eo.EOProfilParcours>("profilParcours");
  public static final ERXKey<gestionuv.utt.fr.eo.EORefProfilTotal> REF_PROFIL_TOTAL = new ERXKey<gestionuv.utt.fr.eo.EORefProfilTotal>("refProfilTotal");

  // Attributes
  public static final String ACQUIS$F_KEY = ACQUIS$F.key();
  public static final String DIPLOMEC_KEY = DIPLOMEC.key();
  public static final String ETU_ID_KEY = ETU_ID.key();
  public static final String LONGUEUR_KEY = LONGUEUR.key();
  public static final String MIN_KEY = MIN.key();
  public static final String ORDRE_COL_KEY = ORDRE_COL.key();
  public static final String ORDRE_LG_KEY = ORDRE_LG.key();
  public static final String PRD_DEBUT_KEY = PRD_DEBUT.key();
  public static final String PROFIL_PARAM_ID_KEY = PROFIL_PARAM_ID.key();
  public static final String PROFIL_TOTAL_ID_KEY = PROFIL_TOTAL_ID.key();
  public static final String TOTAL_KEY = TOTAL.key();
  // Relationships
  public static final String PROFIL_PARAM_KEY = PROFIL_PARAM.key();
  public static final String PROFIL_PARCOURS_KEY = PROFIL_PARCOURS.key();
  public static final String REF_PROFIL_TOTAL_KEY = REF_PROFIL_TOTAL.key();

  private static Logger LOG = Logger.getLogger(_EOProfilTotaux.class);

  public EOProfilTotaux localInstanceIn(EOEditingContext editingContext) {
    EOProfilTotaux localInstance = (EOProfilTotaux)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String acquis$f() {
    return (String) storedValueForKey(_EOProfilTotaux.ACQUIS$F_KEY);
  }

  public void setAcquis$f(String value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
    	_EOProfilTotaux.LOG.debug( "updating acquis$f from " + acquis$f() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilTotaux.ACQUIS$F_KEY);
  }

  public String diplomec() {
    return (String) storedValueForKey(_EOProfilTotaux.DIPLOMEC_KEY);
  }

  public void setDiplomec(String value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
    	_EOProfilTotaux.LOG.debug( "updating diplomec from " + diplomec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilTotaux.DIPLOMEC_KEY);
  }

  public Long etuId() {
    return (Long) storedValueForKey(_EOProfilTotaux.ETU_ID_KEY);
  }

  public void setEtuId(Long value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
    	_EOProfilTotaux.LOG.debug( "updating etuId from " + etuId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilTotaux.ETU_ID_KEY);
  }

  public Double longueur() {
    return (Double) storedValueForKey(_EOProfilTotaux.LONGUEUR_KEY);
  }

  public void setLongueur(Double value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
    	_EOProfilTotaux.LOG.debug( "updating longueur from " + longueur() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilTotaux.LONGUEUR_KEY);
  }

  public String min() {
    return (String) storedValueForKey(_EOProfilTotaux.MIN_KEY);
  }

  public void setMin(String value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
    	_EOProfilTotaux.LOG.debug( "updating min from " + min() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilTotaux.MIN_KEY);
  }

  public Double ordreCol() {
    return (Double) storedValueForKey(_EOProfilTotaux.ORDRE_COL_KEY);
  }

  public void setOrdreCol(Double value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
    	_EOProfilTotaux.LOG.debug( "updating ordreCol from " + ordreCol() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilTotaux.ORDRE_COL_KEY);
  }

  public Double ordreLg() {
    return (Double) storedValueForKey(_EOProfilTotaux.ORDRE_LG_KEY);
  }

  public void setOrdreLg(Double value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
    	_EOProfilTotaux.LOG.debug( "updating ordreLg from " + ordreLg() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilTotaux.ORDRE_LG_KEY);
  }

  public String prdDebut() {
    return (String) storedValueForKey(_EOProfilTotaux.PRD_DEBUT_KEY);
  }

  public void setPrdDebut(String value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
    	_EOProfilTotaux.LOG.debug( "updating prdDebut from " + prdDebut() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilTotaux.PRD_DEBUT_KEY);
  }

  public Long profilParamId() {
    return (Long) storedValueForKey(_EOProfilTotaux.PROFIL_PARAM_ID_KEY);
  }

  public void setProfilParamId(Long value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
    	_EOProfilTotaux.LOG.debug( "updating profilParamId from " + profilParamId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilTotaux.PROFIL_PARAM_ID_KEY);
  }

  public Long profilTotalId() {
    return (Long) storedValueForKey(_EOProfilTotaux.PROFIL_TOTAL_ID_KEY);
  }

  public void setProfilTotalId(Long value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
    	_EOProfilTotaux.LOG.debug( "updating profilTotalId from " + profilTotalId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilTotaux.PROFIL_TOTAL_ID_KEY);
  }

  public String total() {
    return (String) storedValueForKey(_EOProfilTotaux.TOTAL_KEY);
  }

  public void setTotal(String value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
    	_EOProfilTotaux.LOG.debug( "updating total from " + total() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilTotaux.TOTAL_KEY);
  }

  public gestionuv.utt.fr.eo.EOProfilParam profilParam() {
    return (gestionuv.utt.fr.eo.EOProfilParam)storedValueForKey(_EOProfilTotaux.PROFIL_PARAM_KEY);
  }
  
  public void setProfilParam(gestionuv.utt.fr.eo.EOProfilParam value) {
    takeStoredValueForKey(value, _EOProfilTotaux.PROFIL_PARAM_KEY);
  }

  public void setProfilParamRelationship(gestionuv.utt.fr.eo.EOProfilParam value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
      _EOProfilTotaux.LOG.debug("updating profilParam from " + profilParam() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setProfilParam(value);
    }
    else if (value == null) {
    	gestionuv.utt.fr.eo.EOProfilParam oldValue = profilParam();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOProfilTotaux.PROFIL_PARAM_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOProfilTotaux.PROFIL_PARAM_KEY);
    }
  }
  
  public gestionuv.utt.fr.eo.EOProfilParcours profilParcours() {
    return (gestionuv.utt.fr.eo.EOProfilParcours)storedValueForKey(_EOProfilTotaux.PROFIL_PARCOURS_KEY);
  }
  
  public void setProfilParcours(gestionuv.utt.fr.eo.EOProfilParcours value) {
    takeStoredValueForKey(value, _EOProfilTotaux.PROFIL_PARCOURS_KEY);
  }

  public void setProfilParcoursRelationship(gestionuv.utt.fr.eo.EOProfilParcours value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
      _EOProfilTotaux.LOG.debug("updating profilParcours from " + profilParcours() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setProfilParcours(value);
    }
    else if (value == null) {
    	gestionuv.utt.fr.eo.EOProfilParcours oldValue = profilParcours();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOProfilTotaux.PROFIL_PARCOURS_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOProfilTotaux.PROFIL_PARCOURS_KEY);
    }
  }
  
  public gestionuv.utt.fr.eo.EORefProfilTotal refProfilTotal() {
    return (gestionuv.utt.fr.eo.EORefProfilTotal)storedValueForKey(_EOProfilTotaux.REF_PROFIL_TOTAL_KEY);
  }
  
  public void setRefProfilTotal(gestionuv.utt.fr.eo.EORefProfilTotal value) {
    takeStoredValueForKey(value, _EOProfilTotaux.REF_PROFIL_TOTAL_KEY);
  }

  public void setRefProfilTotalRelationship(gestionuv.utt.fr.eo.EORefProfilTotal value) {
    if (_EOProfilTotaux.LOG.isDebugEnabled()) {
      _EOProfilTotaux.LOG.debug("updating refProfilTotal from " + refProfilTotal() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setRefProfilTotal(value);
    }
    else if (value == null) {
    	gestionuv.utt.fr.eo.EORefProfilTotal oldValue = refProfilTotal();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOProfilTotaux.REF_PROFIL_TOTAL_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOProfilTotaux.REF_PROFIL_TOTAL_KEY);
    }
  }
  

  public static EOProfilTotaux createEOProfilTotaux(EOEditingContext editingContext, String diplomec
, Long etuId
, String prdDebut
, Long profilParamId
, Long profilTotalId
, gestionuv.utt.fr.eo.EOProfilParam profilParam, gestionuv.utt.fr.eo.EOProfilParcours profilParcours, gestionuv.utt.fr.eo.EORefProfilTotal refProfilTotal) {
    EOProfilTotaux eo = (EOProfilTotaux) EOUtilities.createAndInsertInstance(editingContext, _EOProfilTotaux.ENTITY_NAME);    
		eo.setDiplomec(diplomec);
		eo.setEtuId(etuId);
		eo.setPrdDebut(prdDebut);
		eo.setProfilParamId(profilParamId);
		eo.setProfilTotalId(profilTotalId);
    eo.setProfilParamRelationship(profilParam);
    eo.setProfilParcoursRelationship(profilParcours);
    eo.setRefProfilTotalRelationship(refProfilTotal);
    return eo;
  }

  public static ERXFetchSpecification<EOProfilTotaux> fetchSpec() {
    return new ERXFetchSpecification<EOProfilTotaux>(_EOProfilTotaux.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOProfilTotaux> fetchAllEOProfilTotauxes(EOEditingContext editingContext) {
    return _EOProfilTotaux.fetchAllEOProfilTotauxes(editingContext, null);
  }

  public static NSArray<EOProfilTotaux> fetchAllEOProfilTotauxes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOProfilTotaux.fetchEOProfilTotauxes(editingContext, null, sortOrderings);
  }

  public static NSArray<EOProfilTotaux> fetchEOProfilTotauxes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOProfilTotaux> fetchSpec = new ERXFetchSpecification<EOProfilTotaux>(_EOProfilTotaux.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOProfilTotaux> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOProfilTotaux fetchEOProfilTotaux(EOEditingContext editingContext, String keyName, Object value) {
    return _EOProfilTotaux.fetchEOProfilTotaux(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOProfilTotaux fetchEOProfilTotaux(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOProfilTotaux> eoObjects = _EOProfilTotaux.fetchEOProfilTotauxes(editingContext, qualifier, null);
    EOProfilTotaux eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOProfilTotaux that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOProfilTotaux fetchRequiredEOProfilTotaux(EOEditingContext editingContext, String keyName, Object value) {
    return _EOProfilTotaux.fetchRequiredEOProfilTotaux(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOProfilTotaux fetchRequiredEOProfilTotaux(EOEditingContext editingContext, EOQualifier qualifier) {
    EOProfilTotaux eoObject = _EOProfilTotaux.fetchEOProfilTotaux(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOProfilTotaux that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOProfilTotaux localInstanceIn(EOEditingContext editingContext, EOProfilTotaux eo) {
    EOProfilTotaux localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<gestionuv.utt.fr.eo.EOProfilTotaux> fetchSelectTotaux(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("selectTotaux", _EOProfilTotaux.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EOProfilTotaux>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<gestionuv.utt.fr.eo.EOProfilTotaux> fetchSelectTotaux(EOEditingContext editingContext,
	String codeDiplomeBinding,
	String debutBinding,
	Long numeroEtuBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("selectTotaux", _EOProfilTotaux.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(codeDiplomeBinding, "codeDiplome");
    bindings.takeValueForKey(debutBinding, "debut");
    bindings.takeValueForKey(numeroEtuBinding, "numeroEtu");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EOProfilTotaux>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
