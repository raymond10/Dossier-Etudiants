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
// DO NOT EDIT.  Make changes to EOVueDetailetudiant.java instead.
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
public abstract class _EOVueDetailetudiant extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueDetailetudiant";

  // Attribute Keys
  public static final ERXKey<String> ACT_FORMATION = new ERXKey<String>("actFormation");
  public static final ERXKey<String> AN_BAC = new ERXKey<String>("anBac");
  public static final ERXKey<String> BAC = new ERXKey<String>("bac");
  public static final ERXKey<String> CIV_NOM = new ERXKey<String>("civNom");
  public static final ERXKey<String> COM_NAIS = new ERXKey<String>("comNais");
  public static final ERXKey<String> CONSEILLER = new ERXKey<String>("conseiller");
  public static final ERXKey<Long> CONSEILLER_ID = new ERXKey<Long>("conseillerId");
  public static final ERXKey<String> DATE_NAIS = new ERXKey<String>("dateNais");
  public static final ERXKey<String> DER_DIPLOME = new ERXKey<String>("derDiplome");
  public static final ERXKey<String> DER_INSCRIPTION = new ERXKey<String>("derInscription");
  public static final ERXKey<String> DER_PERIODE = new ERXKey<String>("derPeriode");
  public static final ERXKey<String> EMAIL = new ERXKey<String>("email");
  public static final ERXKey<String> ETAB_DER_DIPLOME = new ERXKey<String>("etabDerDiplome");
  public static final ERXKey<String> NOM = new ERXKey<String>("nom");
  public static final ERXKey<String> PRENOM = new ERXKey<String>("prenom");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome> EO_VUE_AFFICHERDIPLOMES = new ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome>("eoVueAfficherdiplomes");

  // Attributes
  public static final String ACT_FORMATION_KEY = ACT_FORMATION.key();
  public static final String AN_BAC_KEY = AN_BAC.key();
  public static final String BAC_KEY = BAC.key();
  public static final String CIV_NOM_KEY = CIV_NOM.key();
  public static final String COM_NAIS_KEY = COM_NAIS.key();
  public static final String CONSEILLER_KEY = CONSEILLER.key();
  public static final String CONSEILLER_ID_KEY = CONSEILLER_ID.key();
  public static final String DATE_NAIS_KEY = DATE_NAIS.key();
  public static final String DER_DIPLOME_KEY = DER_DIPLOME.key();
  public static final String DER_INSCRIPTION_KEY = DER_INSCRIPTION.key();
  public static final String DER_PERIODE_KEY = DER_PERIODE.key();
  public static final String EMAIL_KEY = EMAIL.key();
  public static final String ETAB_DER_DIPLOME_KEY = ETAB_DER_DIPLOME.key();
  public static final String NOM_KEY = NOM.key();
  public static final String PRENOM_KEY = PRENOM.key();
  // Relationships
  public static final String EO_VUE_AFFICHERDIPLOMES_KEY = EO_VUE_AFFICHERDIPLOMES.key();

  private static Logger LOG = Logger.getLogger(_EOVueDetailetudiant.class);

  public EOVueDetailetudiant localInstanceIn(EOEditingContext editingContext) {
    EOVueDetailetudiant localInstance = (EOVueDetailetudiant)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String actFormation() {
    return (String) storedValueForKey(_EOVueDetailetudiant.ACT_FORMATION_KEY);
  }

  public void setActFormation(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating actFormation from " + actFormation() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.ACT_FORMATION_KEY);
  }

  public String anBac() {
    return (String) storedValueForKey(_EOVueDetailetudiant.AN_BAC_KEY);
  }

  public void setAnBac(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating anBac from " + anBac() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.AN_BAC_KEY);
  }

  public String bac() {
    return (String) storedValueForKey(_EOVueDetailetudiant.BAC_KEY);
  }

  public void setBac(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating bac from " + bac() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.BAC_KEY);
  }

  public String civNom() {
    return (String) storedValueForKey(_EOVueDetailetudiant.CIV_NOM_KEY);
  }

  public void setCivNom(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating civNom from " + civNom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.CIV_NOM_KEY);
  }

  public String comNais() {
    return (String) storedValueForKey(_EOVueDetailetudiant.COM_NAIS_KEY);
  }

  public void setComNais(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating comNais from " + comNais() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.COM_NAIS_KEY);
  }

  public String conseiller() {
    return (String) storedValueForKey(_EOVueDetailetudiant.CONSEILLER_KEY);
  }

  public void setConseiller(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating conseiller from " + conseiller() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.CONSEILLER_KEY);
  }

  public Long conseillerId() {
    return (Long) storedValueForKey(_EOVueDetailetudiant.CONSEILLER_ID_KEY);
  }

  public void setConseillerId(Long value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating conseillerId from " + conseillerId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.CONSEILLER_ID_KEY);
  }

  public String dateNais() {
    return (String) storedValueForKey(_EOVueDetailetudiant.DATE_NAIS_KEY);
  }

  public void setDateNais(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating dateNais from " + dateNais() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.DATE_NAIS_KEY);
  }

  public String derDiplome() {
    return (String) storedValueForKey(_EOVueDetailetudiant.DER_DIPLOME_KEY);
  }

  public void setDerDiplome(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating derDiplome from " + derDiplome() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.DER_DIPLOME_KEY);
  }

  public String derInscription() {
    return (String) storedValueForKey(_EOVueDetailetudiant.DER_INSCRIPTION_KEY);
  }

  public void setDerInscription(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating derInscription from " + derInscription() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.DER_INSCRIPTION_KEY);
  }

  public String derPeriode() {
    return (String) storedValueForKey(_EOVueDetailetudiant.DER_PERIODE_KEY);
  }

  public void setDerPeriode(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating derPeriode from " + derPeriode() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.DER_PERIODE_KEY);
  }

  public String email() {
    return (String) storedValueForKey(_EOVueDetailetudiant.EMAIL_KEY);
  }

  public void setEmail(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating email from " + email() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.EMAIL_KEY);
  }

  public String etabDerDiplome() {
    return (String) storedValueForKey(_EOVueDetailetudiant.ETAB_DER_DIPLOME_KEY);
  }

  public void setEtabDerDiplome(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating etabDerDiplome from " + etabDerDiplome() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.ETAB_DER_DIPLOME_KEY);
  }

  public String nom() {
    return (String) storedValueForKey(_EOVueDetailetudiant.NOM_KEY);
  }

  public void setNom(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating nom from " + nom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.NOM_KEY);
  }

  public String prenom() {
    return (String) storedValueForKey(_EOVueDetailetudiant.PRENOM_KEY);
  }

  public void setPrenom(String value) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
    	_EOVueDetailetudiant.LOG.debug( "updating prenom from " + prenom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueDetailetudiant.PRENOM_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome> eoVueAfficherdiplomes() {
    return (NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome>)storedValueForKey(_EOVueDetailetudiant.EO_VUE_AFFICHERDIPLOMES_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome> eoVueAfficherdiplomes(EOQualifier qualifier) {
    return eoVueAfficherdiplomes(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome> eoVueAfficherdiplomes(EOQualifier qualifier, boolean fetch) {
    return eoVueAfficherdiplomes(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome> eoVueAfficherdiplomes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOVueAfficherdiplome.EO_VUE_DETAILETUDIANT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EOVueAfficherdiplome.fetchEOVueAfficherdiplomes(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = eoVueAfficherdiplomes();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOVueAfficherdiplome>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEoVueAfficherdiplomes(etudiants.utt.fr.eo.EOVueAfficherdiplome object) {
    includeObjectIntoPropertyWithKey(object, _EOVueDetailetudiant.EO_VUE_AFFICHERDIPLOMES_KEY);
  }

  public void removeFromEoVueAfficherdiplomes(etudiants.utt.fr.eo.EOVueAfficherdiplome object) {
    excludeObjectFromPropertyWithKey(object, _EOVueDetailetudiant.EO_VUE_AFFICHERDIPLOMES_KEY);
  }

  public void addToEoVueAfficherdiplomesRelationship(etudiants.utt.fr.eo.EOVueAfficherdiplome object) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
      _EOVueDetailetudiant.LOG.debug("adding " + object + " to eoVueAfficherdiplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoVueAfficherdiplomes(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOVueDetailetudiant.EO_VUE_AFFICHERDIPLOMES_KEY);
    }
  }

  public void removeFromEoVueAfficherdiplomesRelationship(etudiants.utt.fr.eo.EOVueAfficherdiplome object) {
    if (_EOVueDetailetudiant.LOG.isDebugEnabled()) {
      _EOVueDetailetudiant.LOG.debug("removing " + object + " from eoVueAfficherdiplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoVueAfficherdiplomes(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOVueDetailetudiant.EO_VUE_AFFICHERDIPLOMES_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOVueAfficherdiplome createEoVueAfficherdiplomesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOVueAfficherdiplome.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOVueDetailetudiant.EO_VUE_AFFICHERDIPLOMES_KEY);
    return (etudiants.utt.fr.eo.EOVueAfficherdiplome) eo;
  }

  public void deleteEoVueAfficherdiplomesRelationship(etudiants.utt.fr.eo.EOVueAfficherdiplome object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOVueDetailetudiant.EO_VUE_AFFICHERDIPLOMES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoVueAfficherdiplomesRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOVueAfficherdiplome> objects = eoVueAfficherdiplomes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoVueAfficherdiplomesRelationship(objects.nextElement());
    }
  }


  public static EOVueDetailetudiant createEOVueDetailetudiant(EOEditingContext editingContext, String nom
, String prenom
) {
    EOVueDetailetudiant eo = (EOVueDetailetudiant) EOUtilities.createAndInsertInstance(editingContext, _EOVueDetailetudiant.ENTITY_NAME);    
		eo.setNom(nom);
		eo.setPrenom(prenom);
    return eo;
  }

  public static ERXFetchSpecification<EOVueDetailetudiant> fetchSpec() {
    return new ERXFetchSpecification<EOVueDetailetudiant>(_EOVueDetailetudiant.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueDetailetudiant> fetchAllEOVueDetailetudiants(EOEditingContext editingContext) {
    return _EOVueDetailetudiant.fetchAllEOVueDetailetudiants(editingContext, null);
  }

  public static NSArray<EOVueDetailetudiant> fetchAllEOVueDetailetudiants(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueDetailetudiant.fetchEOVueDetailetudiants(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueDetailetudiant> fetchEOVueDetailetudiants(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueDetailetudiant> fetchSpec = new ERXFetchSpecification<EOVueDetailetudiant>(_EOVueDetailetudiant.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueDetailetudiant> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueDetailetudiant fetchEOVueDetailetudiant(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueDetailetudiant.fetchEOVueDetailetudiant(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueDetailetudiant fetchEOVueDetailetudiant(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueDetailetudiant> eoObjects = _EOVueDetailetudiant.fetchEOVueDetailetudiants(editingContext, qualifier, null);
    EOVueDetailetudiant eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueDetailetudiant that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueDetailetudiant fetchRequiredEOVueDetailetudiant(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueDetailetudiant.fetchRequiredEOVueDetailetudiant(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueDetailetudiant fetchRequiredEOVueDetailetudiant(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueDetailetudiant eoObject = _EOVueDetailetudiant.fetchEOVueDetailetudiant(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueDetailetudiant that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueDetailetudiant localInstanceIn(EOEditingContext editingContext, EOVueDetailetudiant eo) {
    EOVueDetailetudiant localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<etudiants.utt.fr.eo.EOVueDetailetudiant> fetchDetailEtudiant(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("detailEtudiant", _EOVueDetailetudiant.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOVueDetailetudiant>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOVueDetailetudiant> fetchDetailEtudiant(EOEditingContext editingContext,
	Long idBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("detailEtudiant", _EOVueDetailetudiant.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(idBinding, "id");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOVueDetailetudiant>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
