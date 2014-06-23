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
// DO NOT EDIT.  Make changes to EOVueAfficherparcours.java instead.
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
public abstract class _EOVueAfficherparcours extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueAfficherparcours";

  // Attribute Keys
  public static final ERXKey<String> DEBUT = new ERXKey<String>("debut");
  public static final ERXKey<String> DEMISSIONAIRE = new ERXKey<String>("demissionaire");
  public static final ERXKey<String> DIPLOME_ETU = new ERXKey<String>("diplomeEtu");
  public static final ERXKey<String> DIPLOME_SPEC = new ERXKey<String>("diplomeSpec");
  public static final ERXKey<String> FIN = new ERXKey<String>("fin");
  public static final ERXKey<String> LIBELLE_DIPLOME = new ERXKey<String>("libelleDiplome");
  public static final ERXKey<String> NUM_DIPLOME = new ERXKey<String>("numDiplome");
  public static final ERXKey<Long> NUMERO_ETU = new ERXKey<Long>("numeroEtu");
  public static final ERXKey<String> PRD_DEBUT = new ERXKey<String>("prdDebut");
  public static final ERXKey<String> PRD_FIN = new ERXKey<String>("prdFin");
  public static final ERXKey<String> REORIENTATION = new ERXKey<String>("reorientation");
  public static final ERXKey<String> SITUATION = new ERXKey<String>("situation");
  public static final ERXKey<String> TRANSFERT = new ERXKey<String>("transfert");
  // Relationship Keys

  // Attributes
  public static final String DEBUT_KEY = DEBUT.key();
  public static final String DEMISSIONAIRE_KEY = DEMISSIONAIRE.key();
  public static final String DIPLOME_ETU_KEY = DIPLOME_ETU.key();
  public static final String DIPLOME_SPEC_KEY = DIPLOME_SPEC.key();
  public static final String FIN_KEY = FIN.key();
  public static final String LIBELLE_DIPLOME_KEY = LIBELLE_DIPLOME.key();
  public static final String NUM_DIPLOME_KEY = NUM_DIPLOME.key();
  public static final String NUMERO_ETU_KEY = NUMERO_ETU.key();
  public static final String PRD_DEBUT_KEY = PRD_DEBUT.key();
  public static final String PRD_FIN_KEY = PRD_FIN.key();
  public static final String REORIENTATION_KEY = REORIENTATION.key();
  public static final String SITUATION_KEY = SITUATION.key();
  public static final String TRANSFERT_KEY = TRANSFERT.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_EOVueAfficherparcours.class);

  public EOVueAfficherparcours localInstanceIn(EOEditingContext editingContext) {
    EOVueAfficherparcours localInstance = (EOVueAfficherparcours)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String debut() {
    return (String) storedValueForKey(_EOVueAfficherparcours.DEBUT_KEY);
  }

  public void setDebut(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating debut from " + debut() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.DEBUT_KEY);
  }

  public String demissionaire() {
    return (String) storedValueForKey(_EOVueAfficherparcours.DEMISSIONAIRE_KEY);
  }

  public void setDemissionaire(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating demissionaire from " + demissionaire() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.DEMISSIONAIRE_KEY);
  }

  public String diplomeEtu() {
    return (String) storedValueForKey(_EOVueAfficherparcours.DIPLOME_ETU_KEY);
  }

  public void setDiplomeEtu(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating diplomeEtu from " + diplomeEtu() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.DIPLOME_ETU_KEY);
  }

  public String diplomeSpec() {
    return (String) storedValueForKey(_EOVueAfficherparcours.DIPLOME_SPEC_KEY);
  }

  public void setDiplomeSpec(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating diplomeSpec from " + diplomeSpec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.DIPLOME_SPEC_KEY);
  }

  public String fin() {
    return (String) storedValueForKey(_EOVueAfficherparcours.FIN_KEY);
  }

  public void setFin(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating fin from " + fin() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.FIN_KEY);
  }

  public String libelleDiplome() {
    return (String) storedValueForKey(_EOVueAfficherparcours.LIBELLE_DIPLOME_KEY);
  }

  public void setLibelleDiplome(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating libelleDiplome from " + libelleDiplome() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.LIBELLE_DIPLOME_KEY);
  }

  public String numDiplome() {
    return (String) storedValueForKey(_EOVueAfficherparcours.NUM_DIPLOME_KEY);
  }

  public void setNumDiplome(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating numDiplome from " + numDiplome() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.NUM_DIPLOME_KEY);
  }

  public Long numeroEtu() {
    return (Long) storedValueForKey(_EOVueAfficherparcours.NUMERO_ETU_KEY);
  }

  public void setNumeroEtu(Long value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating numeroEtu from " + numeroEtu() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.NUMERO_ETU_KEY);
  }

  public String prdDebut() {
    return (String) storedValueForKey(_EOVueAfficherparcours.PRD_DEBUT_KEY);
  }

  public void setPrdDebut(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating prdDebut from " + prdDebut() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.PRD_DEBUT_KEY);
  }

  public String prdFin() {
    return (String) storedValueForKey(_EOVueAfficherparcours.PRD_FIN_KEY);
  }

  public void setPrdFin(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating prdFin from " + prdFin() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.PRD_FIN_KEY);
  }

  public String reorientation() {
    return (String) storedValueForKey(_EOVueAfficherparcours.REORIENTATION_KEY);
  }

  public void setReorientation(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating reorientation from " + reorientation() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.REORIENTATION_KEY);
  }

  public String situation() {
    return (String) storedValueForKey(_EOVueAfficherparcours.SITUATION_KEY);
  }

  public void setSituation(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating situation from " + situation() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.SITUATION_KEY);
  }

  public String transfert() {
    return (String) storedValueForKey(_EOVueAfficherparcours.TRANSFERT_KEY);
  }

  public void setTransfert(String value) {
    if (_EOVueAfficherparcours.LOG.isDebugEnabled()) {
    	_EOVueAfficherparcours.LOG.debug( "updating transfert from " + transfert() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueAfficherparcours.TRANSFERT_KEY);
  }


  public static EOVueAfficherparcours createEOVueAfficherparcours(EOEditingContext editingContext, String diplomeEtu
, Long numeroEtu
) {
    EOVueAfficherparcours eo = (EOVueAfficherparcours) EOUtilities.createAndInsertInstance(editingContext, _EOVueAfficherparcours.ENTITY_NAME);    
		eo.setDiplomeEtu(diplomeEtu);
		eo.setNumeroEtu(numeroEtu);
    return eo;
  }

  public static ERXFetchSpecification<EOVueAfficherparcours> fetchSpec() {
    return new ERXFetchSpecification<EOVueAfficherparcours>(_EOVueAfficherparcours.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueAfficherparcours> fetchAllEOVueAfficherparcourses(EOEditingContext editingContext) {
    return _EOVueAfficherparcours.fetchAllEOVueAfficherparcourses(editingContext, null);
  }

  public static NSArray<EOVueAfficherparcours> fetchAllEOVueAfficherparcourses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueAfficherparcours.fetchEOVueAfficherparcourses(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueAfficherparcours> fetchEOVueAfficherparcourses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueAfficherparcours> fetchSpec = new ERXFetchSpecification<EOVueAfficherparcours>(_EOVueAfficherparcours.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueAfficherparcours> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueAfficherparcours fetchEOVueAfficherparcours(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueAfficherparcours.fetchEOVueAfficherparcours(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueAfficherparcours fetchEOVueAfficherparcours(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueAfficherparcours> eoObjects = _EOVueAfficherparcours.fetchEOVueAfficherparcourses(editingContext, qualifier, null);
    EOVueAfficherparcours eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueAfficherparcours that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueAfficherparcours fetchRequiredEOVueAfficherparcours(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueAfficherparcours.fetchRequiredEOVueAfficherparcours(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueAfficherparcours fetchRequiredEOVueAfficherparcours(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueAfficherparcours eoObject = _EOVueAfficherparcours.fetchEOVueAfficherparcours(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueAfficherparcours that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueAfficherparcours localInstanceIn(EOEditingContext editingContext, EOVueAfficherparcours eo) {
    EOVueAfficherparcours localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<etudiants.utt.fr.eo.EOVueAfficherparcours> fetchVoirParcours(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("voirParcours", _EOVueAfficherparcours.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOVueAfficherparcours>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOVueAfficherparcours> fetchVoirParcours(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("voirParcours", _EOVueAfficherparcours.ENTITY_NAME);
    return (NSArray<etudiants.utt.fr.eo.EOVueAfficherparcours>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
