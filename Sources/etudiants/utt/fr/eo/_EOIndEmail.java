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
// DO NOT EDIT.  Make changes to EOIndEmail.java instead.
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
public abstract class _EOIndEmail extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOIndEmail";

  // Attribute Keys
  public static final ERXKey<String> AUTEUR_MAJ = new ERXKey<String>("auteurMaj");
  public static final ERXKey<NSTimestamp> CRE_DATE = new ERXKey<NSTimestamp>("creDate");
  public static final ERXKey<String> EMAIL_TYPEC = new ERXKey<String>("emailTypec");
  public static final ERXKey<String> IND_EMAIL = new ERXKey<String>("indEmail");
  public static final ERXKey<Long> INDIV_ID = new ERXKey<Long>("indivId");
  public static final ERXKey<NSTimestamp> MODIF_DATE = new ERXKey<NSTimestamp>("modifDate");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOIndividu> INDIVIDU = new ERXKey<etudiants.utt.fr.eo.EOIndividu>("individu");

  // Attributes
  public static final String AUTEUR_MAJ_KEY = AUTEUR_MAJ.key();
  public static final String CRE_DATE_KEY = CRE_DATE.key();
  public static final String EMAIL_TYPEC_KEY = EMAIL_TYPEC.key();
  public static final String IND_EMAIL_KEY = IND_EMAIL.key();
  public static final String INDIV_ID_KEY = INDIV_ID.key();
  public static final String MODIF_DATE_KEY = MODIF_DATE.key();
  // Relationships
  public static final String INDIVIDU_KEY = INDIVIDU.key();

  private static Logger LOG = Logger.getLogger(_EOIndEmail.class);

  public EOIndEmail localInstanceIn(EOEditingContext editingContext) {
    EOIndEmail localInstance = (EOIndEmail)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String auteurMaj() {
    return (String) storedValueForKey(_EOIndEmail.AUTEUR_MAJ_KEY);
  }

  public void setAuteurMaj(String value) {
    if (_EOIndEmail.LOG.isDebugEnabled()) {
    	_EOIndEmail.LOG.debug( "updating auteurMaj from " + auteurMaj() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndEmail.AUTEUR_MAJ_KEY);
  }

  public NSTimestamp creDate() {
    return (NSTimestamp) storedValueForKey(_EOIndEmail.CRE_DATE_KEY);
  }

  public void setCreDate(NSTimestamp value) {
    if (_EOIndEmail.LOG.isDebugEnabled()) {
    	_EOIndEmail.LOG.debug( "updating creDate from " + creDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndEmail.CRE_DATE_KEY);
  }

  public String emailTypec() {
    return (String) storedValueForKey(_EOIndEmail.EMAIL_TYPEC_KEY);
  }

  public void setEmailTypec(String value) {
    if (_EOIndEmail.LOG.isDebugEnabled()) {
    	_EOIndEmail.LOG.debug( "updating emailTypec from " + emailTypec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndEmail.EMAIL_TYPEC_KEY);
  }

  public String indEmail() {
    return (String) storedValueForKey(_EOIndEmail.IND_EMAIL_KEY);
  }

  public void setIndEmail(String value) {
    if (_EOIndEmail.LOG.isDebugEnabled()) {
    	_EOIndEmail.LOG.debug( "updating indEmail from " + indEmail() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndEmail.IND_EMAIL_KEY);
  }

  public Long indivId() {
    return (Long) storedValueForKey(_EOIndEmail.INDIV_ID_KEY);
  }

  public void setIndivId(Long value) {
    if (_EOIndEmail.LOG.isDebugEnabled()) {
    	_EOIndEmail.LOG.debug( "updating indivId from " + indivId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndEmail.INDIV_ID_KEY);
  }

  public NSTimestamp modifDate() {
    return (NSTimestamp) storedValueForKey(_EOIndEmail.MODIF_DATE_KEY);
  }

  public void setModifDate(NSTimestamp value) {
    if (_EOIndEmail.LOG.isDebugEnabled()) {
    	_EOIndEmail.LOG.debug( "updating modifDate from " + modifDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOIndEmail.MODIF_DATE_KEY);
  }

  public etudiants.utt.fr.eo.EOIndividu individu() {
    return (etudiants.utt.fr.eo.EOIndividu)storedValueForKey(_EOIndEmail.INDIVIDU_KEY);
  }
  
  public void setIndividu(etudiants.utt.fr.eo.EOIndividu value) {
    takeStoredValueForKey(value, _EOIndEmail.INDIVIDU_KEY);
  }

  public void setIndividuRelationship(etudiants.utt.fr.eo.EOIndividu value) {
    if (_EOIndEmail.LOG.isDebugEnabled()) {
      _EOIndEmail.LOG.debug("updating individu from " + individu() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setIndividu(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOIndividu oldValue = individu();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOIndEmail.INDIVIDU_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOIndEmail.INDIVIDU_KEY);
    }
  }
  

  public static EOIndEmail createEOIndEmail(EOEditingContext editingContext, String emailTypec
, Long indivId
, etudiants.utt.fr.eo.EOIndividu individu) {
    EOIndEmail eo = (EOIndEmail) EOUtilities.createAndInsertInstance(editingContext, _EOIndEmail.ENTITY_NAME);    
		eo.setEmailTypec(emailTypec);
		eo.setIndivId(indivId);
    eo.setIndividuRelationship(individu);
    return eo;
  }

  public static ERXFetchSpecification<EOIndEmail> fetchSpec() {
    return new ERXFetchSpecification<EOIndEmail>(_EOIndEmail.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOIndEmail> fetchAllEOIndEmails(EOEditingContext editingContext) {
    return _EOIndEmail.fetchAllEOIndEmails(editingContext, null);
  }

  public static NSArray<EOIndEmail> fetchAllEOIndEmails(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOIndEmail.fetchEOIndEmails(editingContext, null, sortOrderings);
  }

  public static NSArray<EOIndEmail> fetchEOIndEmails(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOIndEmail> fetchSpec = new ERXFetchSpecification<EOIndEmail>(_EOIndEmail.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOIndEmail> eoObjects = null;
    try {
    	editingContext.lock();
    	eoObjects = fetchSpec.fetchObjects(editingContext);
    	} finally {
    		editingContext.unlock();
    	}
    return eoObjects;
  }

  public static EOIndEmail fetchEOIndEmail(EOEditingContext editingContext, String keyName, Object value) {
    return _EOIndEmail.fetchEOIndEmail(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOIndEmail fetchEOIndEmail(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOIndEmail> eoObjects = _EOIndEmail.fetchEOIndEmails(editingContext, qualifier, null);
    EOIndEmail eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOIndEmail that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOIndEmail fetchRequiredEOIndEmail(EOEditingContext editingContext, String keyName, Object value) {
    return _EOIndEmail.fetchRequiredEOIndEmail(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOIndEmail fetchRequiredEOIndEmail(EOEditingContext editingContext, EOQualifier qualifier) {
    EOIndEmail eoObject = _EOIndEmail.fetchEOIndEmail(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOIndEmail that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOIndEmail localInstanceIn(EOEditingContext editingContext, EOIndEmail eo) {
    EOIndEmail localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
