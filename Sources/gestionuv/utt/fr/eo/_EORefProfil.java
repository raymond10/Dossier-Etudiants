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
// DO NOT EDIT.  Make changes to EORefProfil.java instead.
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
public abstract class _EORefProfil extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EORefProfil";

  // Attribute Keys
  public static final ERXKey<String> DIPLOME_C = new ERXKey<String>("diplomeC");
  public static final ERXKey<String> LEGENDE = new ERXKey<String>("legende");
  public static final ERXKey<String> LEGENDE2 = new ERXKey<String>("legende2");
  public static final ERXKey<String> PROFIL_ABR = new ERXKey<String>("profilAbr");
  public static final ERXKey<String> PROFIL_LIB = new ERXKey<String>("profilLib");
  public static final ERXKey<String> PROFIL_ORDRE = new ERXKey<String>("profilOrdre");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EODiplome> EO_DIPLOMES = new ERXKey<etudiants.utt.fr.eo.EODiplome>("eoDiplomes");
  public static final ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome> EO_VUE_AFFICHERDIPLOME = new ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome>("eoVueAfficherdiplome");

  // Attributes
  public static final String DIPLOME_C_KEY = DIPLOME_C.key();
  public static final String LEGENDE_KEY = LEGENDE.key();
  public static final String LEGENDE2_KEY = LEGENDE2.key();
  public static final String PROFIL_ABR_KEY = PROFIL_ABR.key();
  public static final String PROFIL_LIB_KEY = PROFIL_LIB.key();
  public static final String PROFIL_ORDRE_KEY = PROFIL_ORDRE.key();
  // Relationships
  public static final String EO_DIPLOMES_KEY = EO_DIPLOMES.key();
  public static final String EO_VUE_AFFICHERDIPLOME_KEY = EO_VUE_AFFICHERDIPLOME.key();

  private static Logger LOG = Logger.getLogger(_EORefProfil.class);

  public EORefProfil localInstanceIn(EOEditingContext editingContext) {
    EORefProfil localInstance = (EORefProfil)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String diplomeC() {
    return (String) storedValueForKey(_EORefProfil.DIPLOME_C_KEY);
  }

  public void setDiplomeC(String value) {
    if (_EORefProfil.LOG.isDebugEnabled()) {
    	_EORefProfil.LOG.debug( "updating diplomeC from " + diplomeC() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfil.DIPLOME_C_KEY);
  }

  public String legende() {
    return (String) storedValueForKey(_EORefProfil.LEGENDE_KEY);
  }

  public void setLegende(String value) {
    if (_EORefProfil.LOG.isDebugEnabled()) {
    	_EORefProfil.LOG.debug( "updating legende from " + legende() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfil.LEGENDE_KEY);
  }

  public String legende2() {
    return (String) storedValueForKey(_EORefProfil.LEGENDE2_KEY);
  }

  public void setLegende2(String value) {
    if (_EORefProfil.LOG.isDebugEnabled()) {
    	_EORefProfil.LOG.debug( "updating legende2 from " + legende2() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfil.LEGENDE2_KEY);
  }

  public String profilAbr() {
    return (String) storedValueForKey(_EORefProfil.PROFIL_ABR_KEY);
  }

  public void setProfilAbr(String value) {
    if (_EORefProfil.LOG.isDebugEnabled()) {
    	_EORefProfil.LOG.debug( "updating profilAbr from " + profilAbr() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfil.PROFIL_ABR_KEY);
  }

  public String profilLib() {
    return (String) storedValueForKey(_EORefProfil.PROFIL_LIB_KEY);
  }

  public void setProfilLib(String value) {
    if (_EORefProfil.LOG.isDebugEnabled()) {
    	_EORefProfil.LOG.debug( "updating profilLib from " + profilLib() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfil.PROFIL_LIB_KEY);
  }

  public String profilOrdre() {
    return (String) storedValueForKey(_EORefProfil.PROFIL_ORDRE_KEY);
  }

  public void setProfilOrdre(String value) {
    if (_EORefProfil.LOG.isDebugEnabled()) {
    	_EORefProfil.LOG.debug( "updating profilOrdre from " + profilOrdre() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefProfil.PROFIL_ORDRE_KEY);
  }

  public etudiants.utt.fr.eo.EOVueAfficherdiplome eoVueAfficherdiplome() {
    return (etudiants.utt.fr.eo.EOVueAfficherdiplome)storedValueForKey(_EORefProfil.EO_VUE_AFFICHERDIPLOME_KEY);
  }
  
  public void setEoVueAfficherdiplome(etudiants.utt.fr.eo.EOVueAfficherdiplome value) {
    takeStoredValueForKey(value, _EORefProfil.EO_VUE_AFFICHERDIPLOME_KEY);
  }

  public void setEoVueAfficherdiplomeRelationship(etudiants.utt.fr.eo.EOVueAfficherdiplome value) {
    if (_EORefProfil.LOG.isDebugEnabled()) {
      _EORefProfil.LOG.debug("updating eoVueAfficherdiplome from " + eoVueAfficherdiplome() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setEoVueAfficherdiplome(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOVueAfficherdiplome oldValue = eoVueAfficherdiplome();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EORefProfil.EO_VUE_AFFICHERDIPLOME_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EORefProfil.EO_VUE_AFFICHERDIPLOME_KEY);
    }
  }
  
  public NSArray<etudiants.utt.fr.eo.EODiplome> eoDiplomes() {
    return (NSArray<etudiants.utt.fr.eo.EODiplome>)storedValueForKey(_EORefProfil.EO_DIPLOMES_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> eoDiplomes(EOQualifier qualifier) {
    return eoDiplomes(qualifier, null);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> eoDiplomes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<etudiants.utt.fr.eo.EODiplome> results;
      results = eoDiplomes();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplome>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplome>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEoDiplomes(etudiants.utt.fr.eo.EODiplome object) {
    includeObjectIntoPropertyWithKey(object, _EORefProfil.EO_DIPLOMES_KEY);
  }

  public void removeFromEoDiplomes(etudiants.utt.fr.eo.EODiplome object) {
    excludeObjectFromPropertyWithKey(object, _EORefProfil.EO_DIPLOMES_KEY);
  }

  public void addToEoDiplomesRelationship(etudiants.utt.fr.eo.EODiplome object) {
    if (_EORefProfil.LOG.isDebugEnabled()) {
      _EORefProfil.LOG.debug("adding " + object + " to eoDiplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoDiplomes(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefProfil.EO_DIPLOMES_KEY);
    }
  }

  public void removeFromEoDiplomesRelationship(etudiants.utt.fr.eo.EODiplome object) {
    if (_EORefProfil.LOG.isDebugEnabled()) {
      _EORefProfil.LOG.debug("removing " + object + " from eoDiplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoDiplomes(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefProfil.EO_DIPLOMES_KEY);
    }
  }

  public etudiants.utt.fr.eo.EODiplome createEoDiplomesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EODiplome.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefProfil.EO_DIPLOMES_KEY);
    return (etudiants.utt.fr.eo.EODiplome) eo;
  }

  public void deleteEoDiplomesRelationship(etudiants.utt.fr.eo.EODiplome object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefProfil.EO_DIPLOMES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoDiplomesRelationships() {
    Enumeration<etudiants.utt.fr.eo.EODiplome> objects = eoDiplomes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoDiplomesRelationship(objects.nextElement());
    }
  }


  public static EORefProfil createEORefProfil(EOEditingContext editingContext, String diplomeC
, etudiants.utt.fr.eo.EOVueAfficherdiplome eoVueAfficherdiplome) {
    EORefProfil eo = (EORefProfil) EOUtilities.createAndInsertInstance(editingContext, _EORefProfil.ENTITY_NAME);    
		eo.setDiplomeC(diplomeC);
    eo.setEoVueAfficherdiplomeRelationship(eoVueAfficherdiplome);
    return eo;
  }

  public static ERXFetchSpecification<EORefProfil> fetchSpec() {
    return new ERXFetchSpecification<EORefProfil>(_EORefProfil.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EORefProfil> fetchAllEORefProfils(EOEditingContext editingContext) {
    return _EORefProfil.fetchAllEORefProfils(editingContext, null);
  }

  public static NSArray<EORefProfil> fetchAllEORefProfils(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EORefProfil.fetchEORefProfils(editingContext, null, sortOrderings);
  }

  public static NSArray<EORefProfil> fetchEORefProfils(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EORefProfil> fetchSpec = new ERXFetchSpecification<EORefProfil>(_EORefProfil.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EORefProfil> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EORefProfil fetchEORefProfil(EOEditingContext editingContext, String keyName, Object value) {
    return _EORefProfil.fetchEORefProfil(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EORefProfil fetchEORefProfil(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EORefProfil> eoObjects = _EORefProfil.fetchEORefProfils(editingContext, qualifier, null);
    EORefProfil eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EORefProfil that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EORefProfil fetchRequiredEORefProfil(EOEditingContext editingContext, String keyName, Object value) {
    return _EORefProfil.fetchRequiredEORefProfil(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EORefProfil fetchRequiredEORefProfil(EOEditingContext editingContext, EOQualifier qualifier) {
    EORefProfil eoObject = _EORefProfil.fetchEORefProfil(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EORefProfil that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EORefProfil localInstanceIn(EOEditingContext editingContext, EORefProfil eo) {
    EORefProfil localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<gestionuv.utt.fr.eo.EORefProfil> fetchLegende(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("Legende", _EORefProfil.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EORefProfil>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<gestionuv.utt.fr.eo.EORefProfil> fetchLegende(EOEditingContext editingContext,
	String diplomeCBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("Legende", _EORefProfil.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(diplomeCBinding, "diplomeC");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
	NSArray<gestionuv.utt.fr.eo.EORefProfil> result = null;
	try {
		editingContext.lock();
		result = editingContext.objectsWithFetchSpecification(fetchSpec);
	} finally {
		editingContext.unlock();
	}
    return result;
  }
  
}
