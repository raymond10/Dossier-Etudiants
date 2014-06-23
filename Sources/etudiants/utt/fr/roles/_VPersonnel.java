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
// DO NOT EDIT.  Make changes to VPersonnel.java instead.
package etudiants.utt.fr.roles;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _VPersonnel extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "VPersonnel";

  // Attribute Keys
  public static final ERXKey<String> EMAIL = new ERXKey<String>("email");
  public static final ERXKey<String> LOGIN = new ERXKey<String>("login");
  public static final ERXKey<String> NOM = new ERXKey<String>("nom");
  public static final ERXKey<String> PERMANENT = new ERXKey<String>("permanent");
  public static final ERXKey<String> POSTE = new ERXKey<String>("poste");
  public static final ERXKey<String> PRENOM = new ERXKey<String>("prenom");
  // Relationship Keys

  // Attributes
  public static final String EMAIL_KEY = EMAIL.key();
  public static final String LOGIN_KEY = LOGIN.key();
  public static final String NOM_KEY = NOM.key();
  public static final String PERMANENT_KEY = PERMANENT.key();
  public static final String POSTE_KEY = POSTE.key();
  public static final String PRENOM_KEY = PRENOM.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_VPersonnel.class);

  public VPersonnel localInstanceIn(EOEditingContext editingContext) {
    VPersonnel localInstance = (VPersonnel)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String email() {
    return (String) storedValueForKey(_VPersonnel.EMAIL_KEY);
  }

  public void setEmail(String value) {
    if (_VPersonnel.LOG.isDebugEnabled()) {
    	_VPersonnel.LOG.debug( "updating email from " + email() + " to " + value);
    }
    takeStoredValueForKey(value, _VPersonnel.EMAIL_KEY);
  }

  public String login() {
    return (String) storedValueForKey(_VPersonnel.LOGIN_KEY);
  }

  public void setLogin(String value) {
    if (_VPersonnel.LOG.isDebugEnabled()) {
    	_VPersonnel.LOG.debug( "updating login from " + login() + " to " + value);
    }
    takeStoredValueForKey(value, _VPersonnel.LOGIN_KEY);
  }

  public String nom() {
    return (String) storedValueForKey(_VPersonnel.NOM_KEY);
  }

  public void setNom(String value) {
    if (_VPersonnel.LOG.isDebugEnabled()) {
    	_VPersonnel.LOG.debug( "updating nom from " + nom() + " to " + value);
    }
    takeStoredValueForKey(value, _VPersonnel.NOM_KEY);
  }

  public String permanent() {
    return (String) storedValueForKey(_VPersonnel.PERMANENT_KEY);
  }

  public void setPermanent(String value) {
    if (_VPersonnel.LOG.isDebugEnabled()) {
    	_VPersonnel.LOG.debug( "updating permanent from " + permanent() + " to " + value);
    }
    takeStoredValueForKey(value, _VPersonnel.PERMANENT_KEY);
  }

  public String poste() {
    return (String) storedValueForKey(_VPersonnel.POSTE_KEY);
  }

  public void setPoste(String value) {
    if (_VPersonnel.LOG.isDebugEnabled()) {
    	_VPersonnel.LOG.debug( "updating poste from " + poste() + " to " + value);
    }
    takeStoredValueForKey(value, _VPersonnel.POSTE_KEY);
  }

  public String prenom() {
    return (String) storedValueForKey(_VPersonnel.PRENOM_KEY);
  }

  public void setPrenom(String value) {
    if (_VPersonnel.LOG.isDebugEnabled()) {
    	_VPersonnel.LOG.debug( "updating prenom from " + prenom() + " to " + value);
    }
    takeStoredValueForKey(value, _VPersonnel.PRENOM_KEY);
  }


  public static VPersonnel createVPersonnel(EOEditingContext editingContext, String nom
, String prenom
) {
    VPersonnel eo = (VPersonnel) EOUtilities.createAndInsertInstance(editingContext, _VPersonnel.ENTITY_NAME);    
		eo.setNom(nom);
		eo.setPrenom(prenom);
    return eo;
  }

  public static ERXFetchSpecification<VPersonnel> fetchSpec() {
    return new ERXFetchSpecification<VPersonnel>(_VPersonnel.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<VPersonnel> fetchAllVPersonnels(EOEditingContext editingContext) {
    return _VPersonnel.fetchAllVPersonnels(editingContext, null);
  }

  public static NSArray<VPersonnel> fetchAllVPersonnels(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _VPersonnel.fetchVPersonnels(editingContext, null, sortOrderings);
  }

  public static NSArray<VPersonnel> fetchVPersonnels(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<VPersonnel> fetchSpec = new ERXFetchSpecification<VPersonnel>(_VPersonnel.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<VPersonnel> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static VPersonnel fetchVPersonnel(EOEditingContext editingContext, String keyName, Object value) {
    return _VPersonnel.fetchVPersonnel(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VPersonnel fetchVPersonnel(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<VPersonnel> eoObjects = _VPersonnel.fetchVPersonnels(editingContext, qualifier, null);
    VPersonnel eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one VPersonnel that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VPersonnel fetchRequiredVPersonnel(EOEditingContext editingContext, String keyName, Object value) {
    return _VPersonnel.fetchRequiredVPersonnel(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static VPersonnel fetchRequiredVPersonnel(EOEditingContext editingContext, EOQualifier qualifier) {
    VPersonnel eoObject = _VPersonnel.fetchVPersonnel(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no VPersonnel that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static VPersonnel localInstanceIn(EOEditingContext editingContext, VPersonnel eo) {
    VPersonnel localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<etudiants.utt.fr.roles.VPersonnel> fetchPersonnel(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("personnel", _VPersonnel.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    NSArray<etudiants.utt.fr.roles.VPersonnel> result = null;
	try {
		editingContext.lock();
		result = editingContext.objectsWithFetchSpecification(fetchSpec);
	} finally {
		editingContext.unlock();
	}
    return result;
  }
  
  public static NSArray<etudiants.utt.fr.roles.VPersonnel> fetchPersonnel(EOEditingContext editingContext,
	Long idBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("personnel", _VPersonnel.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(idBinding, "id");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
	NSArray<etudiants.utt.fr.roles.VPersonnel> result = null;
	try {
		editingContext.lock();
		result = editingContext.objectsWithFetchSpecification(fetchSpec);
	} finally {
		editingContext.unlock();
	}
    return result;
  }
  
}
