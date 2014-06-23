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
// DO NOT EDIT.  Make changes to EOEtuDiplome.java instead.
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
public abstract class _EOEtuDiplome extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOEtuDiplome";

  // Attribute Keys
  public static final ERXKey<String> AN_UNIV = new ERXKey<String>("anUniv");
  public static final ERXKey<NSTimestamp> CRE_DATE = new ERXKey<NSTimestamp>("creDate");
  public static final ERXKey<NSTimestamp> DATE_JURY = new ERXKey<NSTimestamp>("dateJury");
  public static final ERXKey<String> DIPLOMEC = new ERXKey<String>("diplomec");
  public static final ERXKey<String> DIPLOME_NUM = new ERXKey<String>("diplomeNum");
  public static final ERXKey<String> DIPL_OPTC = new ERXKey<String>("diplOptc");
  public static final ERXKey<String> DIPL_SPECC = new ERXKey<String>("diplSpecc");
  public static final ERXKey<Long> ETU_ID = new ERXKey<Long>("etuId");
  public static final ERXKey<String> MAJ_AUTEUR = new ERXKey<String>("majAuteur");
  public static final ERXKey<NSTimestamp> MAJ_DATE = new ERXKey<NSTimestamp>("majDate");
  public static final ERXKey<String> PRD_UNIV = new ERXKey<String>("prdUniv");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EODiplOption> EO_DIPL_OPTIONS = new ERXKey<etudiants.utt.fr.eo.EODiplOption>("eoDiplOptions");
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm> EO_ETUDIANT_INSCR_ADMS = new ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm>("eoEtudiantInscrAdms");
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiant> EO_ETUDIANTS = new ERXKey<etudiants.utt.fr.eo.EOEtudiant>("eoEtudiants");
  public static final ERXKey<etudiants.utt.fr.eo.EORefPeriode> EO_REF_PERIODES = new ERXKey<etudiants.utt.fr.eo.EORefPeriode>("eoRefPeriodes");

  // Attributes
  public static final String AN_UNIV_KEY = AN_UNIV.key();
  public static final String CRE_DATE_KEY = CRE_DATE.key();
  public static final String DATE_JURY_KEY = DATE_JURY.key();
  public static final String DIPLOMEC_KEY = DIPLOMEC.key();
  public static final String DIPLOME_NUM_KEY = DIPLOME_NUM.key();
  public static final String DIPL_OPTC_KEY = DIPL_OPTC.key();
  public static final String DIPL_SPECC_KEY = DIPL_SPECC.key();
  public static final String ETU_ID_KEY = ETU_ID.key();
  public static final String MAJ_AUTEUR_KEY = MAJ_AUTEUR.key();
  public static final String MAJ_DATE_KEY = MAJ_DATE.key();
  public static final String PRD_UNIV_KEY = PRD_UNIV.key();
  // Relationships
  public static final String EO_DIPL_OPTIONS_KEY = EO_DIPL_OPTIONS.key();
  public static final String EO_ETUDIANT_INSCR_ADMS_KEY = EO_ETUDIANT_INSCR_ADMS.key();
  public static final String EO_ETUDIANTS_KEY = EO_ETUDIANTS.key();
  public static final String EO_REF_PERIODES_KEY = EO_REF_PERIODES.key();

  private static Logger LOG = Logger.getLogger(_EOEtuDiplome.class);

  public EOEtuDiplome localInstanceIn(EOEditingContext editingContext) {
    EOEtuDiplome localInstance = (EOEtuDiplome)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String anUniv() {
    return (String) storedValueForKey(_EOEtuDiplome.AN_UNIV_KEY);
  }

  public void setAnUniv(String value) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
    	_EOEtuDiplome.LOG.debug( "updating anUniv from " + anUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtuDiplome.AN_UNIV_KEY);
  }

  public NSTimestamp creDate() {
    return (NSTimestamp) storedValueForKey(_EOEtuDiplome.CRE_DATE_KEY);
  }

  public void setCreDate(NSTimestamp value) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
    	_EOEtuDiplome.LOG.debug( "updating creDate from " + creDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtuDiplome.CRE_DATE_KEY);
  }

  public NSTimestamp dateJury() {
    return (NSTimestamp) storedValueForKey(_EOEtuDiplome.DATE_JURY_KEY);
  }

  public void setDateJury(NSTimestamp value) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
    	_EOEtuDiplome.LOG.debug( "updating dateJury from " + dateJury() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtuDiplome.DATE_JURY_KEY);
  }

  public String diplomec() {
    return (String) storedValueForKey(_EOEtuDiplome.DIPLOMEC_KEY);
  }

  public void setDiplomec(String value) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
    	_EOEtuDiplome.LOG.debug( "updating diplomec from " + diplomec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtuDiplome.DIPLOMEC_KEY);
  }

  public String diplomeNum() {
    return (String) storedValueForKey(_EOEtuDiplome.DIPLOME_NUM_KEY);
  }

  public void setDiplomeNum(String value) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
    	_EOEtuDiplome.LOG.debug( "updating diplomeNum from " + diplomeNum() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtuDiplome.DIPLOME_NUM_KEY);
  }

  public String diplOptc() {
    return (String) storedValueForKey(_EOEtuDiplome.DIPL_OPTC_KEY);
  }

  public void setDiplOptc(String value) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
    	_EOEtuDiplome.LOG.debug( "updating diplOptc from " + diplOptc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtuDiplome.DIPL_OPTC_KEY);
  }

  public String diplSpecc() {
    return (String) storedValueForKey(_EOEtuDiplome.DIPL_SPECC_KEY);
  }

  public void setDiplSpecc(String value) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
    	_EOEtuDiplome.LOG.debug( "updating diplSpecc from " + diplSpecc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtuDiplome.DIPL_SPECC_KEY);
  }

  public Long etuId() {
    return (Long) storedValueForKey(_EOEtuDiplome.ETU_ID_KEY);
  }

  public void setEtuId(Long value) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
    	_EOEtuDiplome.LOG.debug( "updating etuId from " + etuId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtuDiplome.ETU_ID_KEY);
  }

  public String majAuteur() {
    return (String) storedValueForKey(_EOEtuDiplome.MAJ_AUTEUR_KEY);
  }

  public void setMajAuteur(String value) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
    	_EOEtuDiplome.LOG.debug( "updating majAuteur from " + majAuteur() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtuDiplome.MAJ_AUTEUR_KEY);
  }

  public NSTimestamp majDate() {
    return (NSTimestamp) storedValueForKey(_EOEtuDiplome.MAJ_DATE_KEY);
  }

  public void setMajDate(NSTimestamp value) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
    	_EOEtuDiplome.LOG.debug( "updating majDate from " + majDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtuDiplome.MAJ_DATE_KEY);
  }

  public String prdUniv() {
    return (String) storedValueForKey(_EOEtuDiplome.PRD_UNIV_KEY);
  }

  public void setPrdUniv(String value) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
    	_EOEtuDiplome.LOG.debug( "updating prdUniv from " + prdUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtuDiplome.PRD_UNIV_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> eoDiplOptions() {
    return (NSArray<etudiants.utt.fr.eo.EODiplOption>)storedValueForKey(_EOEtuDiplome.EO_DIPL_OPTIONS_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> eoDiplOptions(EOQualifier qualifier) {
    return eoDiplOptions(qualifier, null);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> eoDiplOptions(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<etudiants.utt.fr.eo.EODiplOption> results;
      results = eoDiplOptions();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplOption>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplOption>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEoDiplOptions(etudiants.utt.fr.eo.EODiplOption object) {
    includeObjectIntoPropertyWithKey(object, _EOEtuDiplome.EO_DIPL_OPTIONS_KEY);
  }

  public void removeFromEoDiplOptions(etudiants.utt.fr.eo.EODiplOption object) {
    excludeObjectFromPropertyWithKey(object, _EOEtuDiplome.EO_DIPL_OPTIONS_KEY);
  }

  public void addToEoDiplOptionsRelationship(etudiants.utt.fr.eo.EODiplOption object) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
      _EOEtuDiplome.LOG.debug("adding " + object + " to eoDiplOptions relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoDiplOptions(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_DIPL_OPTIONS_KEY);
    }
  }

  public void removeFromEoDiplOptionsRelationship(etudiants.utt.fr.eo.EODiplOption object) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
      _EOEtuDiplome.LOG.debug("removing " + object + " from eoDiplOptions relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoDiplOptions(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_DIPL_OPTIONS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EODiplOption createEoDiplOptionsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EODiplOption.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOEtuDiplome.EO_DIPL_OPTIONS_KEY);
    return (etudiants.utt.fr.eo.EODiplOption) eo;
  }

  public void deleteEoDiplOptionsRelationship(etudiants.utt.fr.eo.EODiplOption object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_DIPL_OPTIONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoDiplOptionsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EODiplOption> objects = eoDiplOptions().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoDiplOptionsRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> eoEtudiantInscrAdms() {
    return (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)storedValueForKey(_EOEtuDiplome.EO_ETUDIANT_INSCR_ADMS_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> eoEtudiantInscrAdms(EOQualifier qualifier) {
    return eoEtudiantInscrAdms(qualifier, null);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> eoEtudiantInscrAdms(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> results;
      results = eoEtudiantInscrAdms();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEoEtudiantInscrAdms(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    includeObjectIntoPropertyWithKey(object, _EOEtuDiplome.EO_ETUDIANT_INSCR_ADMS_KEY);
  }

  public void removeFromEoEtudiantInscrAdms(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    excludeObjectFromPropertyWithKey(object, _EOEtuDiplome.EO_ETUDIANT_INSCR_ADMS_KEY);
  }

  public void addToEoEtudiantInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
      _EOEtuDiplome.LOG.debug("adding " + object + " to eoEtudiantInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoEtudiantInscrAdms(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_ETUDIANT_INSCR_ADMS_KEY);
    }
  }

  public void removeFromEoEtudiantInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
      _EOEtuDiplome.LOG.debug("removing " + object + " from eoEtudiantInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoEtudiantInscrAdms(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_ETUDIANT_INSCR_ADMS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOEtudiantInscrAdm createEoEtudiantInscrAdmsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOEtudiantInscrAdm.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOEtuDiplome.EO_ETUDIANT_INSCR_ADMS_KEY);
    return (etudiants.utt.fr.eo.EOEtudiantInscrAdm) eo;
  }

  public void deleteEoEtudiantInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_ETUDIANT_INSCR_ADMS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoEtudiantInscrAdmsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOEtudiantInscrAdm> objects = eoEtudiantInscrAdms().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoEtudiantInscrAdmsRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiant> eoEtudiants() {
    return (NSArray<etudiants.utt.fr.eo.EOEtudiant>)storedValueForKey(_EOEtuDiplome.EO_ETUDIANTS_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiant> eoEtudiants(EOQualifier qualifier) {
    return eoEtudiants(qualifier, null);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiant> eoEtudiants(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    NSArray<etudiants.utt.fr.eo.EOEtudiant> results;
      results = eoEtudiants();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiant>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiant>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEoEtudiants(etudiants.utt.fr.eo.EOEtudiant object) {
    includeObjectIntoPropertyWithKey(object, _EOEtuDiplome.EO_ETUDIANTS_KEY);
  }

  public void removeFromEoEtudiants(etudiants.utt.fr.eo.EOEtudiant object) {
    excludeObjectFromPropertyWithKey(object, _EOEtuDiplome.EO_ETUDIANTS_KEY);
  }

  public void addToEoEtudiantsRelationship(etudiants.utt.fr.eo.EOEtudiant object) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
      _EOEtuDiplome.LOG.debug("adding " + object + " to eoEtudiants relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoEtudiants(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_ETUDIANTS_KEY);
    }
  }

  public void removeFromEoEtudiantsRelationship(etudiants.utt.fr.eo.EOEtudiant object) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
      _EOEtuDiplome.LOG.debug("removing " + object + " from eoEtudiants relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoEtudiants(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_ETUDIANTS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOEtudiant createEoEtudiantsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOEtudiant.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOEtuDiplome.EO_ETUDIANTS_KEY);
    return (etudiants.utt.fr.eo.EOEtudiant) eo;
  }

  public void deleteEoEtudiantsRelationship(etudiants.utt.fr.eo.EOEtudiant object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_ETUDIANTS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoEtudiantsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOEtudiant> objects = eoEtudiants().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoEtudiantsRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EORefPeriode> eoRefPeriodes() {
    return (NSArray<etudiants.utt.fr.eo.EORefPeriode>)storedValueForKey(_EOEtuDiplome.EO_REF_PERIODES_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EORefPeriode> eoRefPeriodes(EOQualifier qualifier) {
    return eoRefPeriodes(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EORefPeriode> eoRefPeriodes(EOQualifier qualifier, boolean fetch) {
    return eoRefPeriodes(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EORefPeriode> eoRefPeriodes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EORefPeriode> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EORefPeriode.EO_ETU_DIPLOMES_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EORefPeriode.fetchEORefPeriodes(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = eoRefPeriodes();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EORefPeriode>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EORefPeriode>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEoRefPeriodes(etudiants.utt.fr.eo.EORefPeriode object) {
    includeObjectIntoPropertyWithKey(object, _EOEtuDiplome.EO_REF_PERIODES_KEY);
  }

  public void removeFromEoRefPeriodes(etudiants.utt.fr.eo.EORefPeriode object) {
    excludeObjectFromPropertyWithKey(object, _EOEtuDiplome.EO_REF_PERIODES_KEY);
  }

  public void addToEoRefPeriodesRelationship(etudiants.utt.fr.eo.EORefPeriode object) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
      _EOEtuDiplome.LOG.debug("adding " + object + " to eoRefPeriodes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoRefPeriodes(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_REF_PERIODES_KEY);
    }
  }

  public void removeFromEoRefPeriodesRelationship(etudiants.utt.fr.eo.EORefPeriode object) {
    if (_EOEtuDiplome.LOG.isDebugEnabled()) {
      _EOEtuDiplome.LOG.debug("removing " + object + " from eoRefPeriodes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoRefPeriodes(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_REF_PERIODES_KEY);
    }
  }

  public etudiants.utt.fr.eo.EORefPeriode createEoRefPeriodesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EORefPeriode.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOEtuDiplome.EO_REF_PERIODES_KEY);
    return (etudiants.utt.fr.eo.EORefPeriode) eo;
  }

  public void deleteEoRefPeriodesRelationship(etudiants.utt.fr.eo.EORefPeriode object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtuDiplome.EO_REF_PERIODES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoRefPeriodesRelationships() {
    Enumeration<etudiants.utt.fr.eo.EORefPeriode> objects = eoRefPeriodes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoRefPeriodesRelationship(objects.nextElement());
    }
  }


  public static EOEtuDiplome createEOEtuDiplome(EOEditingContext editingContext, String anUniv
, String diplomec
, Long etuId
, String prdUniv
) {
    EOEtuDiplome eo = (EOEtuDiplome) EOUtilities.createAndInsertInstance(editingContext, _EOEtuDiplome.ENTITY_NAME);    
		eo.setAnUniv(anUniv);
		eo.setDiplomec(diplomec);
		eo.setEtuId(etuId);
		eo.setPrdUniv(prdUniv);
    return eo;
  }

  public static ERXFetchSpecification<EOEtuDiplome> fetchSpec() {
    return new ERXFetchSpecification<EOEtuDiplome>(_EOEtuDiplome.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOEtuDiplome> fetchAllEOEtuDiplomes(EOEditingContext editingContext) {
    return _EOEtuDiplome.fetchAllEOEtuDiplomes(editingContext, null);
  }

  public static NSArray<EOEtuDiplome> fetchAllEOEtuDiplomes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOEtuDiplome.fetchEOEtuDiplomes(editingContext, null, sortOrderings);
  }

  public static NSArray<EOEtuDiplome> fetchEOEtuDiplomes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOEtuDiplome> fetchSpec = new ERXFetchSpecification<EOEtuDiplome>(_EOEtuDiplome.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOEtuDiplome> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOEtuDiplome fetchEOEtuDiplome(EOEditingContext editingContext, String keyName, Object value) {
    return _EOEtuDiplome.fetchEOEtuDiplome(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOEtuDiplome fetchEOEtuDiplome(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOEtuDiplome> eoObjects = _EOEtuDiplome.fetchEOEtuDiplomes(editingContext, qualifier, null);
    EOEtuDiplome eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOEtuDiplome that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOEtuDiplome fetchRequiredEOEtuDiplome(EOEditingContext editingContext, String keyName, Object value) {
    return _EOEtuDiplome.fetchRequiredEOEtuDiplome(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOEtuDiplome fetchRequiredEOEtuDiplome(EOEditingContext editingContext, EOQualifier qualifier) {
    EOEtuDiplome eoObject = _EOEtuDiplome.fetchEOEtuDiplome(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOEtuDiplome that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOEtuDiplome localInstanceIn(EOEditingContext editingContext, EOEtuDiplome eo) {
    EOEtuDiplome localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
