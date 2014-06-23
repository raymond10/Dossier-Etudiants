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
// DO NOT EDIT.  Make changes to EOVueLescategories.java instead.
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
public abstract class _EOVueLescategories extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueLescategories";

  // Attribute Keys
  public static final ERXKey<String> CODE_DIPLOME = new ERXKey<String>("codeDiplome");
  public static final ERXKey<String> LIB_ABR = new ERXKey<String>("libAbr");
  public static final ERXKey<String> LIBELLE = new ERXKey<String>("libelle");
  public static final ERXKey<String> ORDRE = new ERXKey<String>("ordre");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome> EO_VUE_AFFICHERDIPLOME = new ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome>("eoVueAfficherdiplome");

  // Attributes
  public static final String CODE_DIPLOME_KEY = CODE_DIPLOME.key();
  public static final String LIB_ABR_KEY = LIB_ABR.key();
  public static final String LIBELLE_KEY = LIBELLE.key();
  public static final String ORDRE_KEY = ORDRE.key();
  // Relationships
  public static final String EO_VUE_AFFICHERDIPLOME_KEY = EO_VUE_AFFICHERDIPLOME.key();

  private static Logger LOG = Logger.getLogger(_EOVueLescategories.class);

  public EOVueLescategories localInstanceIn(EOEditingContext editingContext) {
    EOVueLescategories localInstance = (EOVueLescategories)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String codeDiplome() {
    return (String) storedValueForKey(_EOVueLescategories.CODE_DIPLOME_KEY);
  }

  public void setCodeDiplome(String value) {
    if (_EOVueLescategories.LOG.isDebugEnabled()) {
    	_EOVueLescategories.LOG.debug( "updating codeDiplome from " + codeDiplome() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueLescategories.CODE_DIPLOME_KEY);
  }

  public String libAbr() {
    return (String) storedValueForKey(_EOVueLescategories.LIB_ABR_KEY);
  }

  public void setLibAbr(String value) {
    if (_EOVueLescategories.LOG.isDebugEnabled()) {
    	_EOVueLescategories.LOG.debug( "updating libAbr from " + libAbr() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueLescategories.LIB_ABR_KEY);
  }

  public String libelle() {
    return (String) storedValueForKey(_EOVueLescategories.LIBELLE_KEY);
  }

  public void setLibelle(String value) {
    if (_EOVueLescategories.LOG.isDebugEnabled()) {
    	_EOVueLescategories.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueLescategories.LIBELLE_KEY);
  }

  public String ordre() {
    return (String) storedValueForKey(_EOVueLescategories.ORDRE_KEY);
  }

  public void setOrdre(String value) {
    if (_EOVueLescategories.LOG.isDebugEnabled()) {
    	_EOVueLescategories.LOG.debug( "updating ordre from " + ordre() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueLescategories.ORDRE_KEY);
  }

  public etudiants.utt.fr.eo.EOVueAfficherdiplome eoVueAfficherdiplome() {
    return (etudiants.utt.fr.eo.EOVueAfficherdiplome)storedValueForKey(_EOVueLescategories.EO_VUE_AFFICHERDIPLOME_KEY);
  }
  
  public void setEoVueAfficherdiplome(etudiants.utt.fr.eo.EOVueAfficherdiplome value) {
    takeStoredValueForKey(value, _EOVueLescategories.EO_VUE_AFFICHERDIPLOME_KEY);
  }

  public void setEoVueAfficherdiplomeRelationship(etudiants.utt.fr.eo.EOVueAfficherdiplome value) {
    if (_EOVueLescategories.LOG.isDebugEnabled()) {
      _EOVueLescategories.LOG.debug("updating eoVueAfficherdiplome from " + eoVueAfficherdiplome() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setEoVueAfficherdiplome(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOVueAfficherdiplome oldValue = eoVueAfficherdiplome();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOVueLescategories.EO_VUE_AFFICHERDIPLOME_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOVueLescategories.EO_VUE_AFFICHERDIPLOME_KEY);
    }
  }
  

  public static EOVueLescategories createEOVueLescategories(EOEditingContext editingContext, String codeDiplome
, String libAbr
, etudiants.utt.fr.eo.EOVueAfficherdiplome eoVueAfficherdiplome) {
    EOVueLescategories eo = (EOVueLescategories) EOUtilities.createAndInsertInstance(editingContext, _EOVueLescategories.ENTITY_NAME);    
		eo.setCodeDiplome(codeDiplome);
		eo.setLibAbr(libAbr);
    eo.setEoVueAfficherdiplomeRelationship(eoVueAfficherdiplome);
    return eo;
  }

  public static ERXFetchSpecification<EOVueLescategories> fetchSpec() {
    return new ERXFetchSpecification<EOVueLescategories>(_EOVueLescategories.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueLescategories> fetchAllEOVueLescategorieses(EOEditingContext editingContext) {
    return _EOVueLescategories.fetchAllEOVueLescategorieses(editingContext, null);
  }

  public static NSArray<EOVueLescategories> fetchAllEOVueLescategorieses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueLescategories.fetchEOVueLescategorieses(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueLescategories> fetchEOVueLescategorieses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueLescategories> fetchSpec = new ERXFetchSpecification<EOVueLescategories>(_EOVueLescategories.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueLescategories> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueLescategories fetchEOVueLescategories(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueLescategories.fetchEOVueLescategories(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueLescategories fetchEOVueLescategories(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueLescategories> eoObjects = _EOVueLescategories.fetchEOVueLescategorieses(editingContext, qualifier, null);
    EOVueLescategories eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueLescategories that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueLescategories fetchRequiredEOVueLescategories(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueLescategories.fetchRequiredEOVueLescategories(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueLescategories fetchRequiredEOVueLescategories(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueLescategories eoObject = _EOVueLescategories.fetchEOVueLescategories(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueLescategories that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueLescategories localInstanceIn(EOEditingContext editingContext, EOVueLescategories eo) {
    EOVueLescategories localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<gestionuv.utt.fr.eo.EOVueLescategories> fetchListCategory(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("listCategory", _EOVueLescategories.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EOVueLescategories>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<gestionuv.utt.fr.eo.EOVueLescategories> fetchListCategory(EOEditingContext editingContext,
	String codeDiplomeBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("listCategory", _EOVueLescategories.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(codeDiplomeBinding, "codeDiplome");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EOVueLescategories>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
