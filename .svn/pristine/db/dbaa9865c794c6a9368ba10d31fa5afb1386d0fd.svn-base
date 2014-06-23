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
// DO NOT EDIT.  Make changes to EOVueEiaAbr.java instead.
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
public abstract class _EOVueEiaAbr extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOVueEiaAbr";

  // Attribute Keys
  public static final ERXKey<String> AN_UNIV = new ERXKey<String>("anUniv");
  public static final ERXKey<Long> CONSEILLER_ID = new ERXKey<Long>("conseillerId");
  public static final ERXKey<String> DIPLOME$C = new ERXKey<String>("diplome$c");
  public static final ERXKey<String> DIPL_OPT$C = new ERXKey<String>("diplOpt$c");
  public static final ERXKey<String> DIPL_OPT_ABR = new ERXKey<String>("diplOptAbr");
  public static final ERXKey<String> DIPL_SPEC = new ERXKey<String>("diplSpec");
  public static final ERXKey<String> DIPL_SPEC$C = new ERXKey<String>("diplSpec$c");
  public static final ERXKey<String> DIPL_SPEC_ABR = new ERXKey<String>("diplSpecAbr");
  public static final ERXKey<Long> ETU_ID = new ERXKey<Long>("etuId");
  public static final ERXKey<String> INSCR_ADM_ID = new ERXKey<String>("inscrAdmId");
  public static final ERXKey<String> INSCR_FORMULE$C = new ERXKey<String>("inscrFormule$c");
  public static final ERXKey<String> NIVEAU_ADM = new ERXKey<String>("niveauAdm");
  public static final ERXKey<String> NOM = new ERXKey<String>("nom");
  public static final ERXKey<String> NOMPRENOM = new ERXKey<String>("nomprenom");
  public static final ERXKey<String> PRD_UNIV = new ERXKey<String>("prdUniv");
  public static final ERXKey<String> PRENOM = new ERXKey<String>("prenom");
  public static final ERXKey<String> RES_PEDAG$C = new ERXKey<String>("resPedag$c");
  public static final ERXKey<String> SITUATION$C = new ERXKey<String>("situation$c");
  // Relationship Keys

  // Attributes
  public static final String AN_UNIV_KEY = AN_UNIV.key();
  public static final String CONSEILLER_ID_KEY = CONSEILLER_ID.key();
  public static final String DIPLOME$C_KEY = DIPLOME$C.key();
  public static final String DIPL_OPT$C_KEY = DIPL_OPT$C.key();
  public static final String DIPL_OPT_ABR_KEY = DIPL_OPT_ABR.key();
  public static final String DIPL_SPEC_KEY = DIPL_SPEC.key();
  public static final String DIPL_SPEC$C_KEY = DIPL_SPEC$C.key();
  public static final String DIPL_SPEC_ABR_KEY = DIPL_SPEC_ABR.key();
  public static final String ETU_ID_KEY = ETU_ID.key();
  public static final String INSCR_ADM_ID_KEY = INSCR_ADM_ID.key();
  public static final String INSCR_FORMULE$C_KEY = INSCR_FORMULE$C.key();
  public static final String NIVEAU_ADM_KEY = NIVEAU_ADM.key();
  public static final String NOM_KEY = NOM.key();
  public static final String NOMPRENOM_KEY = NOMPRENOM.key();
  public static final String PRD_UNIV_KEY = PRD_UNIV.key();
  public static final String PRENOM_KEY = PRENOM.key();
  public static final String RES_PEDAG$C_KEY = RES_PEDAG$C.key();
  public static final String SITUATION$C_KEY = SITUATION$C.key();
  // Relationships

  private static Logger LOG = Logger.getLogger(_EOVueEiaAbr.class);

  public EOVueEiaAbr localInstanceIn(EOEditingContext editingContext) {
    EOVueEiaAbr localInstance = (EOVueEiaAbr)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String anUniv() {
    return (String) storedValueForKey(_EOVueEiaAbr.AN_UNIV_KEY);
  }

  public void setAnUniv(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating anUniv from " + anUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.AN_UNIV_KEY);
  }

  public Long conseillerId() {
    return (Long) storedValueForKey(_EOVueEiaAbr.CONSEILLER_ID_KEY);
  }

  public void setConseillerId(Long value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating conseillerId from " + conseillerId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.CONSEILLER_ID_KEY);
  }

  public String diplome$c() {
    return (String) storedValueForKey(_EOVueEiaAbr.DIPLOME$C_KEY);
  }

  public void setDiplome$c(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating diplome$c from " + diplome$c() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.DIPLOME$C_KEY);
  }

  public String diplOpt$c() {
    return (String) storedValueForKey(_EOVueEiaAbr.DIPL_OPT$C_KEY);
  }

  public void setDiplOpt$c(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating diplOpt$c from " + diplOpt$c() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.DIPL_OPT$C_KEY);
  }

  public String diplOptAbr() {
    return (String) storedValueForKey(_EOVueEiaAbr.DIPL_OPT_ABR_KEY);
  }

  public void setDiplOptAbr(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating diplOptAbr from " + diplOptAbr() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.DIPL_OPT_ABR_KEY);
  }

  public String diplSpec() {
    return (String) storedValueForKey(_EOVueEiaAbr.DIPL_SPEC_KEY);
  }

  public void setDiplSpec(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating diplSpec from " + diplSpec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.DIPL_SPEC_KEY);
  }

  public String diplSpec$c() {
    return (String) storedValueForKey(_EOVueEiaAbr.DIPL_SPEC$C_KEY);
  }

  public void setDiplSpec$c(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating diplSpec$c from " + diplSpec$c() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.DIPL_SPEC$C_KEY);
  }

  public String diplSpecAbr() {
    return (String) storedValueForKey(_EOVueEiaAbr.DIPL_SPEC_ABR_KEY);
  }

  public void setDiplSpecAbr(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating diplSpecAbr from " + diplSpecAbr() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.DIPL_SPEC_ABR_KEY);
  }

  public Long etuId() {
    return (Long) storedValueForKey(_EOVueEiaAbr.ETU_ID_KEY);
  }

  public void setEtuId(Long value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating etuId from " + etuId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.ETU_ID_KEY);
  }

  public String inscrAdmId() {
    return (String) storedValueForKey(_EOVueEiaAbr.INSCR_ADM_ID_KEY);
  }

  public void setInscrAdmId(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating inscrAdmId from " + inscrAdmId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.INSCR_ADM_ID_KEY);
  }

  public String inscrFormule$c() {
    return (String) storedValueForKey(_EOVueEiaAbr.INSCR_FORMULE$C_KEY);
  }

  public void setInscrFormule$c(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating inscrFormule$c from " + inscrFormule$c() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.INSCR_FORMULE$C_KEY);
  }

  public String niveauAdm() {
    return (String) storedValueForKey(_EOVueEiaAbr.NIVEAU_ADM_KEY);
  }

  public void setNiveauAdm(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating niveauAdm from " + niveauAdm() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.NIVEAU_ADM_KEY);
  }

  public String nom() {
    return (String) storedValueForKey(_EOVueEiaAbr.NOM_KEY);
  }

  public void setNom(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating nom from " + nom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.NOM_KEY);
  }

  public String nomprenom() {
    return (String) storedValueForKey(_EOVueEiaAbr.NOMPRENOM_KEY);
  }

  public void setNomprenom(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating nomprenom from " + nomprenom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.NOMPRENOM_KEY);
  }

  public String prdUniv() {
    return (String) storedValueForKey(_EOVueEiaAbr.PRD_UNIV_KEY);
  }

  public void setPrdUniv(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating prdUniv from " + prdUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.PRD_UNIV_KEY);
  }

  public String prenom() {
    return (String) storedValueForKey(_EOVueEiaAbr.PRENOM_KEY);
  }

  public void setPrenom(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating prenom from " + prenom() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.PRENOM_KEY);
  }

  public String resPedag$c() {
    return (String) storedValueForKey(_EOVueEiaAbr.RES_PEDAG$C_KEY);
  }

  public void setResPedag$c(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating resPedag$c from " + resPedag$c() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.RES_PEDAG$C_KEY);
  }

  public String situation$c() {
    return (String) storedValueForKey(_EOVueEiaAbr.SITUATION$C_KEY);
  }

  public void setSituation$c(String value) {
    if (_EOVueEiaAbr.LOG.isDebugEnabled()) {
    	_EOVueEiaAbr.LOG.debug( "updating situation$c from " + situation$c() + " to " + value);
    }
    takeStoredValueForKey(value, _EOVueEiaAbr.SITUATION$C_KEY);
  }


  public static EOVueEiaAbr createEOVueEiaAbr(EOEditingContext editingContext, String anUniv
, String diplome$c
, Long etuId
, String inscrAdmId
, String nom
, String prdUniv
, String prenom
) {
    EOVueEiaAbr eo = (EOVueEiaAbr) EOUtilities.createAndInsertInstance(editingContext, _EOVueEiaAbr.ENTITY_NAME);    
		eo.setAnUniv(anUniv);
		eo.setDiplome$c(diplome$c);
		eo.setEtuId(etuId);
		eo.setInscrAdmId(inscrAdmId);
		eo.setNom(nom);
		eo.setPrdUniv(prdUniv);
		eo.setPrenom(prenom);
    return eo;
  }

  public static ERXFetchSpecification<EOVueEiaAbr> fetchSpec() {
    return new ERXFetchSpecification<EOVueEiaAbr>(_EOVueEiaAbr.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOVueEiaAbr> fetchAllEOVueEiaAbrs(EOEditingContext editingContext) {
    return _EOVueEiaAbr.fetchAllEOVueEiaAbrs(editingContext, null);
  }

  public static NSArray<EOVueEiaAbr> fetchAllEOVueEiaAbrs(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOVueEiaAbr.fetchEOVueEiaAbrs(editingContext, null, sortOrderings);
  }

  public static NSArray<EOVueEiaAbr> fetchEOVueEiaAbrs(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOVueEiaAbr> fetchSpec = new ERXFetchSpecification<EOVueEiaAbr>(_EOVueEiaAbr.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOVueEiaAbr> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOVueEiaAbr fetchEOVueEiaAbr(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueEiaAbr.fetchEOVueEiaAbr(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueEiaAbr fetchEOVueEiaAbr(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOVueEiaAbr> eoObjects = _EOVueEiaAbr.fetchEOVueEiaAbrs(editingContext, qualifier, null);
    EOVueEiaAbr eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOVueEiaAbr that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueEiaAbr fetchRequiredEOVueEiaAbr(EOEditingContext editingContext, String keyName, Object value) {
    return _EOVueEiaAbr.fetchRequiredEOVueEiaAbr(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOVueEiaAbr fetchRequiredEOVueEiaAbr(EOEditingContext editingContext, EOQualifier qualifier) {
    EOVueEiaAbr eoObject = _EOVueEiaAbr.fetchEOVueEiaAbr(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOVueEiaAbr that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOVueEiaAbr localInstanceIn(EOEditingContext editingContext, EOVueEiaAbr eo) {
    EOVueEiaAbr localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
