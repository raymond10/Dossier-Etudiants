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
// DO NOT EDIT.  Make changes to EOProfilImpression.java instead.
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
public abstract class _EOProfilImpression extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOProfilImpression";

  // Attribute Keys
  public static final ERXKey<Long> ETUID = new ERXKey<Long>("ETUID");
  public static final ERXKey<NSTimestamp> PIMPDATE = new ERXKey<NSTimestamp>("PIMPDATE");
  public static final ERXKey<String> PIMPINFOSIMPRESSION = new ERXKey<String>("PIMPINFOSIMPRESSION");
  public static final ERXKey<Long> USERID = new ERXKey<Long>("USERID");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOIndividu> ETUDIANT_ID = new ERXKey<etudiants.utt.fr.eo.EOIndividu>("etudiantID");
  public static final ERXKey<org.login.fwkloginwebapp.common.metier.EOIndividu> UTILISATEUR = new ERXKey<org.login.fwkloginwebapp.common.metier.EOIndividu>("utilisateur");

  // Attributes
  public static final String ETUID_KEY = ETUID.key();
  public static final String PIMPDATE_KEY = PIMPDATE.key();
  public static final String PIMPINFOSIMPRESSION_KEY = PIMPINFOSIMPRESSION.key();
  public static final String USERID_KEY = USERID.key();
  // Relationships
  public static final String ETUDIANT_ID_KEY = ETUDIANT_ID.key();
  public static final String UTILISATEUR_KEY = UTILISATEUR.key();

  private static Logger LOG = Logger.getLogger(_EOProfilImpression.class);

  public EOProfilImpression localInstanceIn(EOEditingContext editingContext) {
    EOProfilImpression localInstance = (EOProfilImpression)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Long ETUID() {
    return (Long) storedValueForKey(_EOProfilImpression.ETUID_KEY);
  }

  public void setETUID(Long value) {
    if (_EOProfilImpression.LOG.isDebugEnabled()) {
    	_EOProfilImpression.LOG.debug( "updating ETUID from " + ETUID() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilImpression.ETUID_KEY);
  }

  public NSTimestamp PIMPDATE() {
    return (NSTimestamp) storedValueForKey(_EOProfilImpression.PIMPDATE_KEY);
  }

  public void setPIMPDATE(NSTimestamp value) {
    if (_EOProfilImpression.LOG.isDebugEnabled()) {
    	_EOProfilImpression.LOG.debug( "updating PIMPDATE from " + PIMPDATE() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilImpression.PIMPDATE_KEY);
  }

  public String PIMPINFOSIMPRESSION() {
    return (String) storedValueForKey(_EOProfilImpression.PIMPINFOSIMPRESSION_KEY);
  }

  public void setPIMPINFOSIMPRESSION(String value) {
    if (_EOProfilImpression.LOG.isDebugEnabled()) {
    	_EOProfilImpression.LOG.debug( "updating PIMPINFOSIMPRESSION from " + PIMPINFOSIMPRESSION() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilImpression.PIMPINFOSIMPRESSION_KEY);
  }

  public Long USERID() {
    return (Long) storedValueForKey(_EOProfilImpression.USERID_KEY);
  }

  public void setUSERID(Long value) {
    if (_EOProfilImpression.LOG.isDebugEnabled()) {
    	_EOProfilImpression.LOG.debug( "updating USERID from " + USERID() + " to " + value);
    }
    takeStoredValueForKey(value, _EOProfilImpression.USERID_KEY);
  }

  public etudiants.utt.fr.eo.EOIndividu etudiantID() {
    return (etudiants.utt.fr.eo.EOIndividu)storedValueForKey(_EOProfilImpression.ETUDIANT_ID_KEY);
  }
  
  public void setEtudiantID(etudiants.utt.fr.eo.EOIndividu value) {
    takeStoredValueForKey(value, _EOProfilImpression.ETUDIANT_ID_KEY);
  }

  public void setEtudiantIDRelationship(etudiants.utt.fr.eo.EOIndividu value) {
    if (_EOProfilImpression.LOG.isDebugEnabled()) {
      _EOProfilImpression.LOG.debug("updating etudiantID from " + etudiantID() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setEtudiantID(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOIndividu oldValue = etudiantID();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOProfilImpression.ETUDIANT_ID_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOProfilImpression.ETUDIANT_ID_KEY);
    }
  }
  
  public org.login.fwkloginwebapp.common.metier.EOIndividu utilisateur() {
    return (org.login.fwkloginwebapp.common.metier.EOIndividu)storedValueForKey(_EOProfilImpression.UTILISATEUR_KEY);
  }
  
  public void setUtilisateur(org.login.fwkloginwebapp.common.metier.EOIndividu value) {
    takeStoredValueForKey(value, _EOProfilImpression.UTILISATEUR_KEY);
  }

  public void setUtilisateurRelationship(org.login.fwkloginwebapp.common.metier.EOIndividu value) {
    if (_EOProfilImpression.LOG.isDebugEnabled()) {
      _EOProfilImpression.LOG.debug("updating utilisateur from " + utilisateur() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setUtilisateur(value);
    }
    else if (value == null) {
    	org.login.fwkloginwebapp.common.metier.EOIndividu oldValue = utilisateur();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOProfilImpression.UTILISATEUR_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOProfilImpression.UTILISATEUR_KEY);
    }
  }
  

  public static EOProfilImpression createEOProfilImpression(EOEditingContext editingContext, Long ETUID
, NSTimestamp PIMPDATE
, String PIMPINFOSIMPRESSION
, Long USERID
, etudiants.utt.fr.eo.EOIndividu etudiantID, org.login.fwkloginwebapp.common.metier.EOIndividu utilisateur) {
    EOProfilImpression eo = (EOProfilImpression) EOUtilities.createAndInsertInstance(editingContext, _EOProfilImpression.ENTITY_NAME);    
		eo.setETUID(ETUID);
		eo.setPIMPDATE(PIMPDATE);
		eo.setPIMPINFOSIMPRESSION(PIMPINFOSIMPRESSION);
		eo.setUSERID(USERID);
    eo.setEtudiantIDRelationship(etudiantID);
    eo.setUtilisateurRelationship(utilisateur);
    return eo;
  }

  public static ERXFetchSpecification<EOProfilImpression> fetchSpec() {
    return new ERXFetchSpecification<EOProfilImpression>(_EOProfilImpression.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOProfilImpression> fetchAllEOProfilImpressions(EOEditingContext editingContext) {
    return _EOProfilImpression.fetchAllEOProfilImpressions(editingContext, null);
  }

  public static NSArray<EOProfilImpression> fetchAllEOProfilImpressions(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOProfilImpression.fetchEOProfilImpressions(editingContext, null, sortOrderings);
  }

  public static NSArray<EOProfilImpression> fetchEOProfilImpressions(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOProfilImpression> fetchSpec = new ERXFetchSpecification<EOProfilImpression>(_EOProfilImpression.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOProfilImpression> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOProfilImpression fetchEOProfilImpression(EOEditingContext editingContext, String keyName, Object value) {
    return _EOProfilImpression.fetchEOProfilImpression(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOProfilImpression fetchEOProfilImpression(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOProfilImpression> eoObjects = _EOProfilImpression.fetchEOProfilImpressions(editingContext, qualifier, null);
    EOProfilImpression eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOProfilImpression that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOProfilImpression fetchRequiredEOProfilImpression(EOEditingContext editingContext, String keyName, Object value) {
    return _EOProfilImpression.fetchRequiredEOProfilImpression(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOProfilImpression fetchRequiredEOProfilImpression(EOEditingContext editingContext, EOQualifier qualifier) {
    EOProfilImpression eoObject = _EOProfilImpression.fetchEOProfilImpression(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOProfilImpression that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOProfilImpression localInstanceIn(EOEditingContext editingContext, EOProfilImpression eo) {
    EOProfilImpression localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
