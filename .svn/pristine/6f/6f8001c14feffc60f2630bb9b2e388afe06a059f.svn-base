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
// DO NOT EDIT.  Make changes to EOUvOuvertes.java instead.
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
public abstract class _EOUvOuvertes extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOUvOuvertes";

  // Attribute Keys
  public static final ERXKey<Long> ANC_UV_OUVERTE_ID = new ERXKey<Long>("ancUvOuverteId");
  public static final ERXKey<Long> CATEG_ID = new ERXKey<Long>("categId");
  public static final ERXKey<NSTimestamp> CRE_DATE = new ERXKey<NSTimestamp>("creDate");
  public static final ERXKey<String> DIPLOMEC = new ERXKey<String>("diplomec");
  public static final ERXKey<String> DIPL_SPECC = new ERXKey<String>("diplSpecc");
  public static final ERXKey<String> MAJ_AUTEUR = new ERXKey<String>("majAuteur");
  public static final ERXKey<NSTimestamp> MAJ_DATE = new ERXKey<NSTimestamp>("majDate");
  public static final ERXKey<Long> NLE_UV_OUVERTE_ID = new ERXKey<Long>("nleUvOuverteId");
  public static final ERXKey<String> UV_CREDITS_ECTS = new ERXKey<String>("uvCreditsEcts");
  public static final ERXKey<Long> UV_OUV_ID = new ERXKey<Long>("uvOuvId");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EODiplome> EO_DIPLOMES = new ERXKey<etudiants.utt.fr.eo.EODiplome>("eoDiplomes");
  public static final ERXKey<gestionuv.utt.fr.eo.EOUvOuv> UV_OUV = new ERXKey<gestionuv.utt.fr.eo.EOUvOuv>("uvOuv");

  // Attributes
  public static final String ANC_UV_OUVERTE_ID_KEY = ANC_UV_OUVERTE_ID.key();
  public static final String CATEG_ID_KEY = CATEG_ID.key();
  public static final String CRE_DATE_KEY = CRE_DATE.key();
  public static final String DIPLOMEC_KEY = DIPLOMEC.key();
  public static final String DIPL_SPECC_KEY = DIPL_SPECC.key();
  public static final String MAJ_AUTEUR_KEY = MAJ_AUTEUR.key();
  public static final String MAJ_DATE_KEY = MAJ_DATE.key();
  public static final String NLE_UV_OUVERTE_ID_KEY = NLE_UV_OUVERTE_ID.key();
  public static final String UV_CREDITS_ECTS_KEY = UV_CREDITS_ECTS.key();
  public static final String UV_OUV_ID_KEY = UV_OUV_ID.key();
  // Relationships
  public static final String EO_DIPLOMES_KEY = EO_DIPLOMES.key();
  public static final String UV_OUV_KEY = UV_OUV.key();

  private static Logger LOG = Logger.getLogger(_EOUvOuvertes.class);

  public EOUvOuvertes localInstanceIn(EOEditingContext editingContext) {
    EOUvOuvertes localInstance = (EOUvOuvertes)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Long ancUvOuverteId() {
    return (Long) storedValueForKey(_EOUvOuvertes.ANC_UV_OUVERTE_ID_KEY);
  }

  public void setAncUvOuverteId(Long value) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
    	_EOUvOuvertes.LOG.debug( "updating ancUvOuverteId from " + ancUvOuverteId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuvertes.ANC_UV_OUVERTE_ID_KEY);
  }

  public Long categId() {
    return (Long) storedValueForKey(_EOUvOuvertes.CATEG_ID_KEY);
  }

  public void setCategId(Long value) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
    	_EOUvOuvertes.LOG.debug( "updating categId from " + categId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuvertes.CATEG_ID_KEY);
  }

  public NSTimestamp creDate() {
    return (NSTimestamp) storedValueForKey(_EOUvOuvertes.CRE_DATE_KEY);
  }

  public void setCreDate(NSTimestamp value) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
    	_EOUvOuvertes.LOG.debug( "updating creDate from " + creDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuvertes.CRE_DATE_KEY);
  }

  public String diplomec() {
    return (String) storedValueForKey(_EOUvOuvertes.DIPLOMEC_KEY);
  }

  public void setDiplomec(String value) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
    	_EOUvOuvertes.LOG.debug( "updating diplomec from " + diplomec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuvertes.DIPLOMEC_KEY);
  }

  public String diplSpecc() {
    return (String) storedValueForKey(_EOUvOuvertes.DIPL_SPECC_KEY);
  }

  public void setDiplSpecc(String value) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
    	_EOUvOuvertes.LOG.debug( "updating diplSpecc from " + diplSpecc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuvertes.DIPL_SPECC_KEY);
  }

  public String majAuteur() {
    return (String) storedValueForKey(_EOUvOuvertes.MAJ_AUTEUR_KEY);
  }

  public void setMajAuteur(String value) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
    	_EOUvOuvertes.LOG.debug( "updating majAuteur from " + majAuteur() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuvertes.MAJ_AUTEUR_KEY);
  }

  public NSTimestamp majDate() {
    return (NSTimestamp) storedValueForKey(_EOUvOuvertes.MAJ_DATE_KEY);
  }

  public void setMajDate(NSTimestamp value) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
    	_EOUvOuvertes.LOG.debug( "updating majDate from " + majDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuvertes.MAJ_DATE_KEY);
  }

  public Long nleUvOuverteId() {
    return (Long) storedValueForKey(_EOUvOuvertes.NLE_UV_OUVERTE_ID_KEY);
  }

  public void setNleUvOuverteId(Long value) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
    	_EOUvOuvertes.LOG.debug( "updating nleUvOuverteId from " + nleUvOuverteId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuvertes.NLE_UV_OUVERTE_ID_KEY);
  }

  public String uvCreditsEcts() {
    return (String) storedValueForKey(_EOUvOuvertes.UV_CREDITS_ECTS_KEY);
  }

  public void setUvCreditsEcts(String value) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
    	_EOUvOuvertes.LOG.debug( "updating uvCreditsEcts from " + uvCreditsEcts() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuvertes.UV_CREDITS_ECTS_KEY);
  }

  public Long uvOuvId() {
    return (Long) storedValueForKey(_EOUvOuvertes.UV_OUV_ID_KEY);
  }

  public void setUvOuvId(Long value) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
    	_EOUvOuvertes.LOG.debug( "updating uvOuvId from " + uvOuvId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUvOuvertes.UV_OUV_ID_KEY);
  }

  public gestionuv.utt.fr.eo.EOUvOuv uvOuv() {
    return (gestionuv.utt.fr.eo.EOUvOuv)storedValueForKey(_EOUvOuvertes.UV_OUV_KEY);
  }
  
  public void setUvOuv(gestionuv.utt.fr.eo.EOUvOuv value) {
    takeStoredValueForKey(value, _EOUvOuvertes.UV_OUV_KEY);
  }

  public void setUvOuvRelationship(gestionuv.utt.fr.eo.EOUvOuv value) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
      _EOUvOuvertes.LOG.debug("updating uvOuv from " + uvOuv() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setUvOuv(value);
    }
    else if (value == null) {
    	gestionuv.utt.fr.eo.EOUvOuv oldValue = uvOuv();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOUvOuvertes.UV_OUV_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOUvOuvertes.UV_OUV_KEY);
    }
  }
  
  public NSArray<etudiants.utt.fr.eo.EODiplome> eoDiplomes() {
    return (NSArray<etudiants.utt.fr.eo.EODiplome>)storedValueForKey(_EOUvOuvertes.EO_DIPLOMES_KEY);
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
    includeObjectIntoPropertyWithKey(object, _EOUvOuvertes.EO_DIPLOMES_KEY);
  }

  public void removeFromEoDiplomes(etudiants.utt.fr.eo.EODiplome object) {
    excludeObjectFromPropertyWithKey(object, _EOUvOuvertes.EO_DIPLOMES_KEY);
  }

  public void addToEoDiplomesRelationship(etudiants.utt.fr.eo.EODiplome object) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
      _EOUvOuvertes.LOG.debug("adding " + object + " to eoDiplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoDiplomes(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOUvOuvertes.EO_DIPLOMES_KEY);
    }
  }

  public void removeFromEoDiplomesRelationship(etudiants.utt.fr.eo.EODiplome object) {
    if (_EOUvOuvertes.LOG.isDebugEnabled()) {
      _EOUvOuvertes.LOG.debug("removing " + object + " from eoDiplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoDiplomes(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOUvOuvertes.EO_DIPLOMES_KEY);
    }
  }

  public etudiants.utt.fr.eo.EODiplome createEoDiplomesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EODiplome.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOUvOuvertes.EO_DIPLOMES_KEY);
    return (etudiants.utt.fr.eo.EODiplome) eo;
  }

  public void deleteEoDiplomesRelationship(etudiants.utt.fr.eo.EODiplome object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOUvOuvertes.EO_DIPLOMES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoDiplomesRelationships() {
    Enumeration<etudiants.utt.fr.eo.EODiplome> objects = eoDiplomes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoDiplomesRelationship(objects.nextElement());
    }
  }


  public static EOUvOuvertes createEOUvOuvertes(EOEditingContext editingContext, Long ancUvOuverteId
, Long categId
, String diplomec
, Long nleUvOuverteId
, Long uvOuvId
, gestionuv.utt.fr.eo.EOUvOuv uvOuv) {
    EOUvOuvertes eo = (EOUvOuvertes) EOUtilities.createAndInsertInstance(editingContext, _EOUvOuvertes.ENTITY_NAME);    
		eo.setAncUvOuverteId(ancUvOuverteId);
		eo.setCategId(categId);
		eo.setDiplomec(diplomec);
		eo.setNleUvOuverteId(nleUvOuverteId);
		eo.setUvOuvId(uvOuvId);
    eo.setUvOuvRelationship(uvOuv);
    return eo;
  }

  public static ERXFetchSpecification<EOUvOuvertes> fetchSpec() {
    return new ERXFetchSpecification<EOUvOuvertes>(_EOUvOuvertes.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOUvOuvertes> fetchAllEOUvOuverteses(EOEditingContext editingContext) {
    return _EOUvOuvertes.fetchAllEOUvOuverteses(editingContext, null);
  }

  public static NSArray<EOUvOuvertes> fetchAllEOUvOuverteses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOUvOuvertes.fetchEOUvOuverteses(editingContext, null, sortOrderings);
  }

  public static NSArray<EOUvOuvertes> fetchEOUvOuverteses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOUvOuvertes> fetchSpec = new ERXFetchSpecification<EOUvOuvertes>(_EOUvOuvertes.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOUvOuvertes> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOUvOuvertes fetchEOUvOuvertes(EOEditingContext editingContext, String keyName, Object value) {
    return _EOUvOuvertes.fetchEOUvOuvertes(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOUvOuvertes fetchEOUvOuvertes(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOUvOuvertes> eoObjects = _EOUvOuvertes.fetchEOUvOuverteses(editingContext, qualifier, null);
    EOUvOuvertes eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOUvOuvertes that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOUvOuvertes fetchRequiredEOUvOuvertes(EOEditingContext editingContext, String keyName, Object value) {
    return _EOUvOuvertes.fetchRequiredEOUvOuvertes(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOUvOuvertes fetchRequiredEOUvOuvertes(EOEditingContext editingContext, EOQualifier qualifier) {
    EOUvOuvertes eoObject = _EOUvOuvertes.fetchEOUvOuvertes(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOUvOuvertes that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOUvOuvertes localInstanceIn(EOEditingContext editingContext, EOUvOuvertes eo) {
    EOUvOuvertes localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
