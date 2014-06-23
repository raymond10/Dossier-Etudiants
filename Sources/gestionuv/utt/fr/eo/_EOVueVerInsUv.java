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
// DO NOT EDIT.  Make changes to EOVueVerInsUv.java instead.
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
public abstract class _EOVueVerInsUv extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueVerInsUv";

  // Attribute Keys
  public static final ERXKey<String> CODE_SITUATION = new ERXKey<String>("codeSituation");
  public static final ERXKey<String> DECISION = new ERXKey<String>("decision");
  public static final ERXKey<String> DIPLOME = new ERXKey<String>("diplome");
  public static final ERXKey<String> DIPL_SPEC = new ERXKey<String>("diplSpec");
  public static final ERXKey<Integer> ETU_ID = new ERXKey<Integer>("etuId");
  public static final ERXKey<String> FORMATION = new ERXKey<String>("formation");
  public static final ERXKey<String> NIVEAU_ADM = new ERXKey<String>("niveauAdm");
  public static final ERXKey<String> NOM = new ERXKey<String>("nom");
  public static final ERXKey<String> PERIODE = new ERXKey<String>("periode");
  public static final ERXKey<String> PRENOM = new ERXKey<String>("prenom");
  public static final ERXKey<String> RES_PEDAG = new ERXKey<String>("resPedag");
  public static final ERXKey<String> S_ENTREE = new ERXKey<String>("sEntree");
  public static final ERXKey<String> SITUATION = new ERXKey<String>("situation");
  public static final ERXKey<String> UVS = new ERXKey<String>("uvs");
  // Relationship Keys

  // Attributes
  public static final String CODE_SITUATION_KEY = CODE_SITUATION.key();
  public static final String DECISION_KEY = DECISION.key();
  public static final String DIPLOME_KEY = DIPLOME.key();
  public static final String DIPL_SPEC_KEY = DIPL_SPEC.key();
  public static final String ETU_ID_KEY = ETU_ID.key();
  public static final String FORMATION_KEY = FORMATION.key();
  public static final String NIVEAU_ADM_KEY = NIVEAU_ADM.key();
  public static final String NOM_KEY = NOM.key();
  public static final String PERIODE_KEY = PERIODE.key();
  public static final String PRENOM_KEY = PRENOM.key();
  public static final String RES_PEDAG_KEY = RES_PEDAG.key();
  public static final String S_ENTREE_KEY = S_ENTREE.key();
  public static final String SITUATION_KEY = SITUATION.key();
  public static final String UVS_KEY = UVS.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_EOVueVerInsUv.class);

  public EOVueVerInsUv localInstanceIn(EOEditingContext editingContext) {
    EOVueVerInsUv localInstance = (EOVueVerInsUv)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String codeSituation() {
    return (String) storedValueForKey(_EOVueVerInsUv.CODE_SITUATION_KEY);
  }

  public void setCodeSituation(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating codeSituation from " + codeSituation() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.CODE_SITUATION_KEY);
  }

  public String decision() {
    return (String) storedValueForKey(_EOVueVerInsUv.DECISION_KEY);
  }

  public void setDecision(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating decision from " + decision() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.DECISION_KEY);
  }

  public String diplome() {
    return (String) storedValueForKey(_EOVueVerInsUv.DIPLOME_KEY);
  }

  public void setDiplome(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating diplome from " + diplome() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.DIPLOME_KEY);
  }

  public String diplSpec() {
    return (String) storedValueForKey(_EOVueVerInsUv.DIPL_SPEC_KEY);
  }

  public void setDiplSpec(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating diplSpec from " + diplSpec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.DIPL_SPEC_KEY);
  }

  public Integer etuId() {
    return (Integer) storedValueForKey(_EOVueVerInsUv.ETU_ID_KEY);
  }

  public void setEtuId(Integer value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating etuId from " + etuId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.ETU_ID_KEY);
  }

  public String formation() {
    return (String) storedValueForKey(_EOVueVerInsUv.FORMATION_KEY);
  }

  public void setFormation(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating formation from " + formation() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.FORMATION_KEY);
  }

  public String niveauAdm() {
    return (String) storedValueForKey(_EOVueVerInsUv.NIVEAU_ADM_KEY);
  }

  public void setNiveauAdm(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating niveauAdm from " + niveauAdm() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.NIVEAU_ADM_KEY);
  }

  public String nom() {
    return (String) storedValueForKey(_EOVueVerInsUv.NOM_KEY);
  }

  public void setNom(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating nom from " + nom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.NOM_KEY);
  }

  public String periode() {
    return (String) storedValueForKey(_EOVueVerInsUv.PERIODE_KEY);
  }

  public void setPeriode(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating periode from " + periode() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.PERIODE_KEY);
  }

  public String prenom() {
    return (String) storedValueForKey(_EOVueVerInsUv.PRENOM_KEY);
  }

  public void setPrenom(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating prenom from " + prenom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.PRENOM_KEY);
  }

  public String resPedag() {
    return (String) storedValueForKey(_EOVueVerInsUv.RES_PEDAG_KEY);
  }

  public void setResPedag(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating resPedag from " + resPedag() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.RES_PEDAG_KEY);
  }

  public String sEntree() {
    return (String) storedValueForKey(_EOVueVerInsUv.S_ENTREE_KEY);
  }

  public void setSEntree(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating sEntree from " + sEntree() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.S_ENTREE_KEY);
  }

  public String situation() {
    return (String) storedValueForKey(_EOVueVerInsUv.SITUATION_KEY);
  }

  public void setSituation(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating situation from " + situation() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.SITUATION_KEY);
  }

  public String uvs() {
    return (String) storedValueForKey(_EOVueVerInsUv.UVS_KEY);
  }

  public void setUvs(String value) {
    if (_EOVueVerInsUv.LOG.isDebugEnabled()) {
    	_EOVueVerInsUv.LOG.debug( "updating uvs from " + uvs() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueVerInsUv.UVS_KEY);
  }


  public static EOVueVerInsUv createEOVueVerInsUv(EOEditingContext editingContext, String codeSituation
, String decision
, String diplome
, String diplSpec
, Integer etuId
, String formation
, String niveauAdm
, String nom
, String periode
, String prenom
, String resPedag
, String sEntree
, String situation
, String uvs
) {
    EOVueVerInsUv eo = (EOVueVerInsUv) EOUtilities.createAndInsertInstance(editingContext, _EOVueVerInsUv.ENTITY_NAME);    
		eo.setCodeSituation(codeSituation);
		eo.setDecision(decision);
		eo.setDiplome(diplome);
		eo.setDiplSpec(diplSpec);
		eo.setEtuId(etuId);
		eo.setFormation(formation);
		eo.setNiveauAdm(niveauAdm);
		eo.setNom(nom);
		eo.setPeriode(periode);
		eo.setPrenom(prenom);
		eo.setResPedag(resPedag);
		eo.setSEntree(sEntree);
		eo.setSituation(situation);
		eo.setUvs(uvs);
    return eo;
  }

  public static ERXFetchSpecification<EOVueVerInsUv> fetchSpec() {
    return new ERXFetchSpecification<EOVueVerInsUv>(_EOVueVerInsUv.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueVerInsUv> fetchAllEOVueVerInsUvs(EOEditingContext editingContext) {
    return _EOVueVerInsUv.fetchAllEOVueVerInsUvs(editingContext, null);
  }

  public static NSArray<EOVueVerInsUv> fetchAllEOVueVerInsUvs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueVerInsUv.fetchEOVueVerInsUvs(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueVerInsUv> fetchEOVueVerInsUvs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueVerInsUv> fetchSpec = new ERXFetchSpecification<EOVueVerInsUv>(_EOVueVerInsUv.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueVerInsUv> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueVerInsUv fetchEOVueVerInsUv(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueVerInsUv.fetchEOVueVerInsUv(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueVerInsUv fetchEOVueVerInsUv(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueVerInsUv> eoObjects = _EOVueVerInsUv.fetchEOVueVerInsUvs(editingContext, qualifier, null);
    EOVueVerInsUv eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueVerInsUv that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueVerInsUv fetchRequiredEOVueVerInsUv(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueVerInsUv.fetchRequiredEOVueVerInsUv(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueVerInsUv fetchRequiredEOVueVerInsUv(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueVerInsUv eoObject = _EOVueVerInsUv.fetchEOVueVerInsUv(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueVerInsUv that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueVerInsUv localInstanceIn(EOEditingContext editingContext, EOVueVerInsUv eo) {
    EOVueVerInsUv localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
