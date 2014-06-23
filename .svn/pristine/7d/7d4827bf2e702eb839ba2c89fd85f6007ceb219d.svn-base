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
// DO NOT EDIT.  Make changes to EOVueSelectinsuv.java instead.
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
public abstract class _EOVueSelectinsuv extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueSelectinsuv";

  // Attribute Keys
  public static final ERXKey<String> CATEG_ABR = new ERXKey<String>("categAbr");
  public static final ERXKey<String> CATEG_ORDRE = new ERXKey<String>("categOrdre");
  public static final ERXKey<String> CREDIT = new ERXKey<String>("credit");
  public static final ERXKey<String> DIPLOME = new ERXKey<String>("diplome");
  public static final ERXKey<String> EIUDIPLM = new ERXKey<String>("eiudiplm");
  public static final ERXKey<Long> ETU_ID = new ERXKey<Long>("etuId");
  public static final ERXKey<String> LEGENDE = new ERXKey<String>("legende");
  public static final ERXKey<String> PERIODE = new ERXKey<String>("periode");
  public static final ERXKey<String> PROFIL_ABR = new ERXKey<String>("profilAbr");
  public static final ERXKey<String> PROFILF = new ERXKey<String>("profilf");
  public static final ERXKey<String> PUBLIE_F = new ERXKey<String>("publieF");
  public static final ERXKey<String> RESUV = new ERXKey<String>("resuv");
  public static final ERXKey<String> UV = new ERXKey<String>("uv");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome> EO_VUE_AFFICHERDIPLOME = new ERXKey<etudiants.utt.fr.eo.EOVueAfficherdiplome>("eoVueAfficherdiplome");

  // Attributes
  public static final String CATEG_ABR_KEY = CATEG_ABR.key();
  public static final String CATEG_ORDRE_KEY = CATEG_ORDRE.key();
  public static final String CREDIT_KEY = CREDIT.key();
  public static final String DIPLOME_KEY = DIPLOME.key();
  public static final String EIUDIPLM_KEY = EIUDIPLM.key();
  public static final String ETU_ID_KEY = ETU_ID.key();
  public static final String LEGENDE_KEY = LEGENDE.key();
  public static final String PERIODE_KEY = PERIODE.key();
  public static final String PROFIL_ABR_KEY = PROFIL_ABR.key();
  public static final String PROFILF_KEY = PROFILF.key();
  public static final String PUBLIE_F_KEY = PUBLIE_F.key();
  public static final String RESUV_KEY = RESUV.key();
  public static final String UV_KEY = UV.key();
  // Relationships
  public static final String EO_VUE_AFFICHERDIPLOME_KEY = EO_VUE_AFFICHERDIPLOME.key();

  private static Logger LOG = Logger.getLogger(_EOVueSelectinsuv.class);

  public EOVueSelectinsuv localInstanceIn(EOEditingContext editingContext) {
    EOVueSelectinsuv localInstance = (EOVueSelectinsuv)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String categAbr() {
    return (String) storedValueForKey(_EOVueSelectinsuv.CATEG_ABR_KEY);
  }

  public void setCategAbr(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating categAbr from " + categAbr() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.CATEG_ABR_KEY);
  }

  public String categOrdre() {
    return (String) storedValueForKey(_EOVueSelectinsuv.CATEG_ORDRE_KEY);
  }

  public void setCategOrdre(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating categOrdre from " + categOrdre() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.CATEG_ORDRE_KEY);
  }

  public String credit() {
    return (String) storedValueForKey(_EOVueSelectinsuv.CREDIT_KEY);
  }

  public void setCredit(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating credit from " + credit() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.CREDIT_KEY);
  }

  public String diplome() {
    return (String) storedValueForKey(_EOVueSelectinsuv.DIPLOME_KEY);
  }

  public void setDiplome(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating diplome from " + diplome() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.DIPLOME_KEY);
  }

  public String eiudiplm() {
    return (String) storedValueForKey(_EOVueSelectinsuv.EIUDIPLM_KEY);
  }

  public void setEiudiplm(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating eiudiplm from " + eiudiplm() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.EIUDIPLM_KEY);
  }

  public Long etuId() {
    return (Long) storedValueForKey(_EOVueSelectinsuv.ETU_ID_KEY);
  }

  public void setEtuId(Long value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating etuId from " + etuId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.ETU_ID_KEY);
  }

  public String legende() {
    return (String) storedValueForKey(_EOVueSelectinsuv.LEGENDE_KEY);
  }

  public void setLegende(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating legende from " + legende() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.LEGENDE_KEY);
  }

  public String periode() {
    return (String) storedValueForKey(_EOVueSelectinsuv.PERIODE_KEY);
  }

  public void setPeriode(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating periode from " + periode() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.PERIODE_KEY);
  }

  public String profilAbr() {
    return (String) storedValueForKey(_EOVueSelectinsuv.PROFIL_ABR_KEY);
  }

  public void setProfilAbr(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating profilAbr from " + profilAbr() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.PROFIL_ABR_KEY);
  }

  public String profilf() {
    return (String) storedValueForKey(_EOVueSelectinsuv.PROFILF_KEY);
  }

  public void setProfilf(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating profilf from " + profilf() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.PROFILF_KEY);
  }

  public String publieF() {
    return (String) storedValueForKey(_EOVueSelectinsuv.PUBLIE_F_KEY);
  }

  public void setPublieF(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating publieF from " + publieF() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.PUBLIE_F_KEY);
  }

  public String resuv() {
    return (String) storedValueForKey(_EOVueSelectinsuv.RESUV_KEY);
  }

  public void setResuv(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating resuv from " + resuv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.RESUV_KEY);
  }

  public String uv() {
    return (String) storedValueForKey(_EOVueSelectinsuv.UV_KEY);
  }

  public void setUv(String value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
    	_EOVueSelectinsuv.LOG.debug( "updating uv from " + uv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueSelectinsuv.UV_KEY);
  }

  public etudiants.utt.fr.eo.EOVueAfficherdiplome eoVueAfficherdiplome() {
    return (etudiants.utt.fr.eo.EOVueAfficherdiplome)storedValueForKey(_EOVueSelectinsuv.EO_VUE_AFFICHERDIPLOME_KEY);
  }
  
  public void setEoVueAfficherdiplome(etudiants.utt.fr.eo.EOVueAfficherdiplome value) {
    takeStoredValueForKey(value, _EOVueSelectinsuv.EO_VUE_AFFICHERDIPLOME_KEY);
  }

  public void setEoVueAfficherdiplomeRelationship(etudiants.utt.fr.eo.EOVueAfficherdiplome value) {
    if (_EOVueSelectinsuv.LOG.isDebugEnabled()) {
      _EOVueSelectinsuv.LOG.debug("updating eoVueAfficherdiplome from " + eoVueAfficherdiplome() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setEoVueAfficherdiplome(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOVueAfficherdiplome oldValue = eoVueAfficherdiplome();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOVueSelectinsuv.EO_VUE_AFFICHERDIPLOME_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOVueSelectinsuv.EO_VUE_AFFICHERDIPLOME_KEY);
    }
  }
  

  public static EOVueSelectinsuv createEOVueSelectinsuv(EOEditingContext editingContext, String diplome
, Long etuId
, etudiants.utt.fr.eo.EOVueAfficherdiplome eoVueAfficherdiplome) {
    EOVueSelectinsuv eo = (EOVueSelectinsuv) EOUtilities.createAndInsertInstance(editingContext, _EOVueSelectinsuv.ENTITY_NAME);    
		eo.setDiplome(diplome);
		eo.setEtuId(etuId);
    eo.setEoVueAfficherdiplomeRelationship(eoVueAfficherdiplome);
    return eo;
  }

  public static ERXFetchSpecification<EOVueSelectinsuv> fetchSpec() {
    return new ERXFetchSpecification<EOVueSelectinsuv>(_EOVueSelectinsuv.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueSelectinsuv> fetchAllEOVueSelectinsuvs(EOEditingContext editingContext) {
    return _EOVueSelectinsuv.fetchAllEOVueSelectinsuvs(editingContext, null);
  }

  public static NSArray<EOVueSelectinsuv> fetchAllEOVueSelectinsuvs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueSelectinsuv.fetchEOVueSelectinsuvs(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueSelectinsuv> fetchEOVueSelectinsuvs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueSelectinsuv> fetchSpec = new ERXFetchSpecification<EOVueSelectinsuv>(_EOVueSelectinsuv.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueSelectinsuv> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueSelectinsuv fetchEOVueSelectinsuv(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueSelectinsuv.fetchEOVueSelectinsuv(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueSelectinsuv fetchEOVueSelectinsuv(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueSelectinsuv> eoObjects = _EOVueSelectinsuv.fetchEOVueSelectinsuvs(editingContext, qualifier, null);
    EOVueSelectinsuv eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueSelectinsuv that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueSelectinsuv fetchRequiredEOVueSelectinsuv(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueSelectinsuv.fetchRequiredEOVueSelectinsuv(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueSelectinsuv fetchRequiredEOVueSelectinsuv(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueSelectinsuv eoObject = _EOVueSelectinsuv.fetchEOVueSelectinsuv(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueSelectinsuv that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueSelectinsuv localInstanceIn(EOEditingContext editingContext, EOVueSelectinsuv eo) {
    EOVueSelectinsuv localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<gestionuv.utt.fr.eo.EOVueSelectinsuv> fetchListUV(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("listUV", _EOVueSelectinsuv.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EOVueSelectinsuv>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<gestionuv.utt.fr.eo.EOVueSelectinsuv> fetchListUV(EOEditingContext editingContext,
	String codeDiplomeBinding,
	Long etuIdBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("listUV", _EOVueSelectinsuv.ENTITY_NAME);
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(codeDiplomeBinding, "codeDiplome");
    bindings.takeValueForKey(etuIdBinding, "etuId");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<gestionuv.utt.fr.eo.EOVueSelectinsuv>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
