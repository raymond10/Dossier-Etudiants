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
// DO NOT EDIT.  Make changes to EORefPeriode.java instead.
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
public abstract class _EORefPeriode extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EORefPeriode";

  // Attribute Keys
  public static final ERXKey<String> AN_CIV = new ERXKey<String>("anCiv");
  public static final ERXKey<String> AN_UNIV = new ERXKey<String>("anUniv");
  public static final ERXKey<NSTimestamp> DEB_DATE = new ERXKey<NSTimestamp>("debDate");
  public static final ERXKey<NSTimestamp> FIN_DATE = new ERXKey<NSTimestamp>("finDate");
  public static final ERXKey<String> LIBELLE = new ERXKey<String>("libelle");
  public static final ERXKey<String> PRD_CIV = new ERXKey<String>("prdCiv");
  public static final ERXKey<String> PRD_PREC = new ERXKey<String>("prdPrec");
  public static final ERXKey<String> PRD_SESSION = new ERXKey<String>("prdSession");
  public static final ERXKey<String> PRD_TYPEC = new ERXKey<String>("prdTypec");
  public static final ERXKey<String> PRD_UNIV = new ERXKey<String>("prdUniv");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EODiplome> DIPLOMES = new ERXKey<etudiants.utt.fr.eo.EODiplome>("diplomes");
  public static final ERXKey<etudiants.utt.fr.eo.EODiplome> DIPLOMES1 = new ERXKey<etudiants.utt.fr.eo.EODiplome>("diplomes1");
  public static final ERXKey<etudiants.utt.fr.eo.EODiplome> DIPLOMES2 = new ERXKey<etudiants.utt.fr.eo.EODiplome>("diplomes2");
  public static final ERXKey<etudiants.utt.fr.eo.EODiplOption> DIPL_OPTIONS = new ERXKey<etudiants.utt.fr.eo.EODiplOption>("diplOptions");
  public static final ERXKey<etudiants.utt.fr.eo.EODiplOption> DIPL_OPTIONS1 = new ERXKey<etudiants.utt.fr.eo.EODiplOption>("diplOptions1");
  public static final ERXKey<etudiants.utt.fr.eo.EODiplOption> DIPL_OPTIONS2 = new ERXKey<etudiants.utt.fr.eo.EODiplOption>("diplOptions2");
  public static final ERXKey<gestionuv.utt.fr.eo.EOEtuDiplome> EO_ETU_DIPLOMES = new ERXKey<gestionuv.utt.fr.eo.EOEtuDiplome>("eoEtuDiplomes");
  public static final ERXKey<gestionuv.utt.fr.eo.EOEtuMineur> EO_ETU_MINEURS = new ERXKey<gestionuv.utt.fr.eo.EOEtuMineur>("eoEtuMineurs");
  public static final ERXKey<etudiants.utt.fr.eo.EOParamPeriode> EO_PARAM_PERIODES = new ERXKey<etudiants.utt.fr.eo.EOParamPeriode>("eoParamPeriodes");
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm> ETU_INSCR_ADMS = new ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm>("etuInscrAdms");

  // Attributes
  public static final String AN_CIV_KEY = AN_CIV.key();
  public static final String AN_UNIV_KEY = AN_UNIV.key();
  public static final String DEB_DATE_KEY = DEB_DATE.key();
  public static final String FIN_DATE_KEY = FIN_DATE.key();
  public static final String LIBELLE_KEY = LIBELLE.key();
  public static final String PRD_CIV_KEY = PRD_CIV.key();
  public static final String PRD_PREC_KEY = PRD_PREC.key();
  public static final String PRD_SESSION_KEY = PRD_SESSION.key();
  public static final String PRD_TYPEC_KEY = PRD_TYPEC.key();
  public static final String PRD_UNIV_KEY = PRD_UNIV.key();
  // Relationships
  public static final String DIPLOMES_KEY = DIPLOMES.key();
  public static final String DIPLOMES1_KEY = DIPLOMES1.key();
  public static final String DIPLOMES2_KEY = DIPLOMES2.key();
  public static final String DIPL_OPTIONS_KEY = DIPL_OPTIONS.key();
  public static final String DIPL_OPTIONS1_KEY = DIPL_OPTIONS1.key();
  public static final String DIPL_OPTIONS2_KEY = DIPL_OPTIONS2.key();
  public static final String EO_ETU_DIPLOMES_KEY = EO_ETU_DIPLOMES.key();
  public static final String EO_ETU_MINEURS_KEY = EO_ETU_MINEURS.key();
  public static final String EO_PARAM_PERIODES_KEY = EO_PARAM_PERIODES.key();
  public static final String ETU_INSCR_ADMS_KEY = ETU_INSCR_ADMS.key();

  private static Logger LOG = Logger.getLogger(_EORefPeriode.class);

  public EORefPeriode localInstanceIn(EOEditingContext editingContext) {
    EORefPeriode localInstance = (EORefPeriode)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String anCiv() {
    return (String) storedValueForKey(_EORefPeriode.AN_CIV_KEY);
  }

  public void setAnCiv(String value) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
    	_EORefPeriode.LOG.debug( "updating anCiv from " + anCiv() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefPeriode.AN_CIV_KEY);
  }

  public String anUniv() {
    return (String) storedValueForKey(_EORefPeriode.AN_UNIV_KEY);
  }

  public void setAnUniv(String value) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
    	_EORefPeriode.LOG.debug( "updating anUniv from " + anUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefPeriode.AN_UNIV_KEY);
  }

  public NSTimestamp debDate() {
    return (NSTimestamp) storedValueForKey(_EORefPeriode.DEB_DATE_KEY);
  }

  public void setDebDate(NSTimestamp value) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
    	_EORefPeriode.LOG.debug( "updating debDate from " + debDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefPeriode.DEB_DATE_KEY);
  }

  public NSTimestamp finDate() {
    return (NSTimestamp) storedValueForKey(_EORefPeriode.FIN_DATE_KEY);
  }

  public void setFinDate(NSTimestamp value) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
    	_EORefPeriode.LOG.debug( "updating finDate from " + finDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefPeriode.FIN_DATE_KEY);
  }

  public String libelle() {
    return (String) storedValueForKey(_EORefPeriode.LIBELLE_KEY);
  }

  public void setLibelle(String value) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
    	_EORefPeriode.LOG.debug( "updating libelle from " + libelle() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefPeriode.LIBELLE_KEY);
  }

  public String prdCiv() {
    return (String) storedValueForKey(_EORefPeriode.PRD_CIV_KEY);
  }

  public void setPrdCiv(String value) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
    	_EORefPeriode.LOG.debug( "updating prdCiv from " + prdCiv() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefPeriode.PRD_CIV_KEY);
  }

  public String prdPrec() {
    return (String) storedValueForKey(_EORefPeriode.PRD_PREC_KEY);
  }

  public void setPrdPrec(String value) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
    	_EORefPeriode.LOG.debug( "updating prdPrec from " + prdPrec() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefPeriode.PRD_PREC_KEY);
  }

  public String prdSession() {
    return (String) storedValueForKey(_EORefPeriode.PRD_SESSION_KEY);
  }

  public void setPrdSession(String value) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
    	_EORefPeriode.LOG.debug( "updating prdSession from " + prdSession() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefPeriode.PRD_SESSION_KEY);
  }

  public String prdTypec() {
    return (String) storedValueForKey(_EORefPeriode.PRD_TYPEC_KEY);
  }

  public void setPrdTypec(String value) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
    	_EORefPeriode.LOG.debug( "updating prdTypec from " + prdTypec() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefPeriode.PRD_TYPEC_KEY);
  }

  public String prdUniv() {
    return (String) storedValueForKey(_EORefPeriode.PRD_UNIV_KEY);
  }

  public void setPrdUniv(String value) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
    	_EORefPeriode.LOG.debug( "updating prdUniv from " + prdUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EORefPeriode.PRD_UNIV_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes() {
    return (NSArray<etudiants.utt.fr.eo.EODiplome>)storedValueForKey(_EORefPeriode.DIPLOMES_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes(EOQualifier qualifier) {
    return diplomes(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes(EOQualifier qualifier, boolean fetch) {
    return diplomes(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EODiplome> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EODiplome.REF_PERIODE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EODiplome.fetchEODiplomes(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = diplomes();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplome>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplome>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToDiplomes(etudiants.utt.fr.eo.EODiplome object) {
    includeObjectIntoPropertyWithKey(object, _EORefPeriode.DIPLOMES_KEY);
  }

  public void removeFromDiplomes(etudiants.utt.fr.eo.EODiplome object) {
    excludeObjectFromPropertyWithKey(object, _EORefPeriode.DIPLOMES_KEY);
  }

  public void addToDiplomesRelationship(etudiants.utt.fr.eo.EODiplome object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("adding " + object + " to diplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToDiplomes(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPLOMES_KEY);
    }
  }

  public void removeFromDiplomesRelationship(etudiants.utt.fr.eo.EODiplome object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("removing " + object + " from diplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromDiplomes(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPLOMES_KEY);
    }
  }

  public etudiants.utt.fr.eo.EODiplome createDiplomesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EODiplome.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefPeriode.DIPLOMES_KEY);
    return (etudiants.utt.fr.eo.EODiplome) eo;
  }

  public void deleteDiplomesRelationship(etudiants.utt.fr.eo.EODiplome object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPLOMES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllDiplomesRelationships() {
    Enumeration<etudiants.utt.fr.eo.EODiplome> objects = diplomes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteDiplomesRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes1() {
    return (NSArray<etudiants.utt.fr.eo.EODiplome>)storedValueForKey(_EORefPeriode.DIPLOMES1_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes1(EOQualifier qualifier) {
    return diplomes1(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes1(EOQualifier qualifier, boolean fetch) {
    return diplomes1(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes1(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EODiplome> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EODiplome.REF_PERIODE0_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EODiplome.fetchEODiplomes(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = diplomes1();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplome>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplome>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToDiplomes1(etudiants.utt.fr.eo.EODiplome object) {
    includeObjectIntoPropertyWithKey(object, _EORefPeriode.DIPLOMES1_KEY);
  }

  public void removeFromDiplomes1(etudiants.utt.fr.eo.EODiplome object) {
    excludeObjectFromPropertyWithKey(object, _EORefPeriode.DIPLOMES1_KEY);
  }

  public void addToDiplomes1Relationship(etudiants.utt.fr.eo.EODiplome object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("adding " + object + " to diplomes1 relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToDiplomes1(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPLOMES1_KEY);
    }
  }

  public void removeFromDiplomes1Relationship(etudiants.utt.fr.eo.EODiplome object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("removing " + object + " from diplomes1 relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromDiplomes1(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPLOMES1_KEY);
    }
  }

  public etudiants.utt.fr.eo.EODiplome createDiplomes1Relationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EODiplome.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefPeriode.DIPLOMES1_KEY);
    return (etudiants.utt.fr.eo.EODiplome) eo;
  }

  public void deleteDiplomes1Relationship(etudiants.utt.fr.eo.EODiplome object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPLOMES1_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllDiplomes1Relationships() {
    Enumeration<etudiants.utt.fr.eo.EODiplome> objects = diplomes1().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteDiplomes1Relationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes2() {
    return (NSArray<etudiants.utt.fr.eo.EODiplome>)storedValueForKey(_EORefPeriode.DIPLOMES2_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes2(EOQualifier qualifier) {
    return diplomes2(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes2(EOQualifier qualifier, boolean fetch) {
    return diplomes2(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplome> diplomes2(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EODiplome> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EODiplome.REF_PERIODE1_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EODiplome.fetchEODiplomes(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = diplomes2();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplome>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplome>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToDiplomes2(etudiants.utt.fr.eo.EODiplome object) {
    includeObjectIntoPropertyWithKey(object, _EORefPeriode.DIPLOMES2_KEY);
  }

  public void removeFromDiplomes2(etudiants.utt.fr.eo.EODiplome object) {
    excludeObjectFromPropertyWithKey(object, _EORefPeriode.DIPLOMES2_KEY);
  }

  public void addToDiplomes2Relationship(etudiants.utt.fr.eo.EODiplome object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("adding " + object + " to diplomes2 relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToDiplomes2(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPLOMES2_KEY);
    }
  }

  public void removeFromDiplomes2Relationship(etudiants.utt.fr.eo.EODiplome object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("removing " + object + " from diplomes2 relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromDiplomes2(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPLOMES2_KEY);
    }
  }

  public etudiants.utt.fr.eo.EODiplome createDiplomes2Relationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EODiplome.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefPeriode.DIPLOMES2_KEY);
    return (etudiants.utt.fr.eo.EODiplome) eo;
  }

  public void deleteDiplomes2Relationship(etudiants.utt.fr.eo.EODiplome object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPLOMES2_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllDiplomes2Relationships() {
    Enumeration<etudiants.utt.fr.eo.EODiplome> objects = diplomes2().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteDiplomes2Relationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions() {
    return (NSArray<etudiants.utt.fr.eo.EODiplOption>)storedValueForKey(_EORefPeriode.DIPL_OPTIONS_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions(EOQualifier qualifier) {
    return diplOptions(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions(EOQualifier qualifier, boolean fetch) {
    return diplOptions(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EODiplOption> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EODiplOption.REF_PERIODE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EODiplOption.fetchEODiplOptions(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = diplOptions();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplOption>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplOption>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToDiplOptions(etudiants.utt.fr.eo.EODiplOption object) {
    includeObjectIntoPropertyWithKey(object, _EORefPeriode.DIPL_OPTIONS_KEY);
  }

  public void removeFromDiplOptions(etudiants.utt.fr.eo.EODiplOption object) {
    excludeObjectFromPropertyWithKey(object, _EORefPeriode.DIPL_OPTIONS_KEY);
  }

  public void addToDiplOptionsRelationship(etudiants.utt.fr.eo.EODiplOption object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("adding " + object + " to diplOptions relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToDiplOptions(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPL_OPTIONS_KEY);
    }
  }

  public void removeFromDiplOptionsRelationship(etudiants.utt.fr.eo.EODiplOption object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("removing " + object + " from diplOptions relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromDiplOptions(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPL_OPTIONS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EODiplOption createDiplOptionsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EODiplOption.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefPeriode.DIPL_OPTIONS_KEY);
    return (etudiants.utt.fr.eo.EODiplOption) eo;
  }

  public void deleteDiplOptionsRelationship(etudiants.utt.fr.eo.EODiplOption object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPL_OPTIONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllDiplOptionsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EODiplOption> objects = diplOptions().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteDiplOptionsRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions1() {
    return (NSArray<etudiants.utt.fr.eo.EODiplOption>)storedValueForKey(_EORefPeriode.DIPL_OPTIONS1_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions1(EOQualifier qualifier) {
    return diplOptions1(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions1(EOQualifier qualifier, boolean fetch) {
    return diplOptions1(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions1(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EODiplOption> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EODiplOption.REF_PERIODE0_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EODiplOption.fetchEODiplOptions(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = diplOptions1();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplOption>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplOption>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToDiplOptions1(etudiants.utt.fr.eo.EODiplOption object) {
    includeObjectIntoPropertyWithKey(object, _EORefPeriode.DIPL_OPTIONS1_KEY);
  }

  public void removeFromDiplOptions1(etudiants.utt.fr.eo.EODiplOption object) {
    excludeObjectFromPropertyWithKey(object, _EORefPeriode.DIPL_OPTIONS1_KEY);
  }

  public void addToDiplOptions1Relationship(etudiants.utt.fr.eo.EODiplOption object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("adding " + object + " to diplOptions1 relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToDiplOptions1(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPL_OPTIONS1_KEY);
    }
  }

  public void removeFromDiplOptions1Relationship(etudiants.utt.fr.eo.EODiplOption object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("removing " + object + " from diplOptions1 relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromDiplOptions1(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPL_OPTIONS1_KEY);
    }
  }

  public etudiants.utt.fr.eo.EODiplOption createDiplOptions1Relationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EODiplOption.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefPeriode.DIPL_OPTIONS1_KEY);
    return (etudiants.utt.fr.eo.EODiplOption) eo;
  }

  public void deleteDiplOptions1Relationship(etudiants.utt.fr.eo.EODiplOption object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPL_OPTIONS1_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllDiplOptions1Relationships() {
    Enumeration<etudiants.utt.fr.eo.EODiplOption> objects = diplOptions1().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteDiplOptions1Relationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions2() {
    return (NSArray<etudiants.utt.fr.eo.EODiplOption>)storedValueForKey(_EORefPeriode.DIPL_OPTIONS2_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions2(EOQualifier qualifier) {
    return diplOptions2(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions2(EOQualifier qualifier, boolean fetch) {
    return diplOptions2(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EODiplOption> diplOptions2(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EODiplOption> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EODiplOption.REF_PERIODE1_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EODiplOption.fetchEODiplOptions(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = diplOptions2();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplOption>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EODiplOption>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToDiplOptions2(etudiants.utt.fr.eo.EODiplOption object) {
    includeObjectIntoPropertyWithKey(object, _EORefPeriode.DIPL_OPTIONS2_KEY);
  }

  public void removeFromDiplOptions2(etudiants.utt.fr.eo.EODiplOption object) {
    excludeObjectFromPropertyWithKey(object, _EORefPeriode.DIPL_OPTIONS2_KEY);
  }

  public void addToDiplOptions2Relationship(etudiants.utt.fr.eo.EODiplOption object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("adding " + object + " to diplOptions2 relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToDiplOptions2(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPL_OPTIONS2_KEY);
    }
  }

  public void removeFromDiplOptions2Relationship(etudiants.utt.fr.eo.EODiplOption object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("removing " + object + " from diplOptions2 relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromDiplOptions2(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPL_OPTIONS2_KEY);
    }
  }

  public etudiants.utt.fr.eo.EODiplOption createDiplOptions2Relationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EODiplOption.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefPeriode.DIPL_OPTIONS2_KEY);
    return (etudiants.utt.fr.eo.EODiplOption) eo;
  }

  public void deleteDiplOptions2Relationship(etudiants.utt.fr.eo.EODiplOption object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.DIPL_OPTIONS2_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllDiplOptions2Relationships() {
    Enumeration<etudiants.utt.fr.eo.EODiplOption> objects = diplOptions2().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteDiplOptions2Relationship(objects.nextElement());
    }
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuDiplome> eoEtuDiplomes() {
    return (NSArray<gestionuv.utt.fr.eo.EOEtuDiplome>)storedValueForKey(_EORefPeriode.EO_ETU_DIPLOMES_KEY);
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuDiplome> eoEtuDiplomes(EOQualifier qualifier) {
    return eoEtuDiplomes(qualifier, null, false);
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuDiplome> eoEtuDiplomes(EOQualifier qualifier, boolean fetch) {
    return eoEtuDiplomes(qualifier, null, fetch);
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuDiplome> eoEtuDiplomes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<gestionuv.utt.fr.eo.EOEtuDiplome> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(gestionuv.utt.fr.eo.EOEtuDiplome.EO_REF_PERIODES_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = gestionuv.utt.fr.eo.EOEtuDiplome.fetchEOEtuDiplomes(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = eoEtuDiplomes();
      if (qualifier != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOEtuDiplome>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOEtuDiplome>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEoEtuDiplomes(gestionuv.utt.fr.eo.EOEtuDiplome object) {
    includeObjectIntoPropertyWithKey(object, _EORefPeriode.EO_ETU_DIPLOMES_KEY);
  }

  public void removeFromEoEtuDiplomes(gestionuv.utt.fr.eo.EOEtuDiplome object) {
    excludeObjectFromPropertyWithKey(object, _EORefPeriode.EO_ETU_DIPLOMES_KEY);
  }

  public void addToEoEtuDiplomesRelationship(gestionuv.utt.fr.eo.EOEtuDiplome object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("adding " + object + " to eoEtuDiplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoEtuDiplomes(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefPeriode.EO_ETU_DIPLOMES_KEY);
    }
  }

  public void removeFromEoEtuDiplomesRelationship(gestionuv.utt.fr.eo.EOEtuDiplome object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("removing " + object + " from eoEtuDiplomes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoEtuDiplomes(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.EO_ETU_DIPLOMES_KEY);
    }
  }

  public gestionuv.utt.fr.eo.EOEtuDiplome createEoEtuDiplomesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.EOEtuDiplome.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefPeriode.EO_ETU_DIPLOMES_KEY);
    return (gestionuv.utt.fr.eo.EOEtuDiplome) eo;
  }

  public void deleteEoEtuDiplomesRelationship(gestionuv.utt.fr.eo.EOEtuDiplome object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.EO_ETU_DIPLOMES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoEtuDiplomesRelationships() {
    Enumeration<gestionuv.utt.fr.eo.EOEtuDiplome> objects = eoEtuDiplomes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoEtuDiplomesRelationship(objects.nextElement());
    }
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuMineur> eoEtuMineurs() {
    return (NSArray<gestionuv.utt.fr.eo.EOEtuMineur>)storedValueForKey(_EORefPeriode.EO_ETU_MINEURS_KEY);
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuMineur> eoEtuMineurs(EOQualifier qualifier) {
    return eoEtuMineurs(qualifier, null, false);
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuMineur> eoEtuMineurs(EOQualifier qualifier, boolean fetch) {
    return eoEtuMineurs(qualifier, null, fetch);
  }

  public NSArray<gestionuv.utt.fr.eo.EOEtuMineur> eoEtuMineurs(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<gestionuv.utt.fr.eo.EOEtuMineur> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(gestionuv.utt.fr.eo.EOEtuMineur.EO_REF_PERIODE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = gestionuv.utt.fr.eo.EOEtuMineur.fetchEOEtuMineurs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = eoEtuMineurs();
      if (qualifier != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOEtuMineur>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOEtuMineur>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEoEtuMineurs(gestionuv.utt.fr.eo.EOEtuMineur object) {
    includeObjectIntoPropertyWithKey(object, _EORefPeriode.EO_ETU_MINEURS_KEY);
  }

  public void removeFromEoEtuMineurs(gestionuv.utt.fr.eo.EOEtuMineur object) {
    excludeObjectFromPropertyWithKey(object, _EORefPeriode.EO_ETU_MINEURS_KEY);
  }

  public void addToEoEtuMineursRelationship(gestionuv.utt.fr.eo.EOEtuMineur object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("adding " + object + " to eoEtuMineurs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoEtuMineurs(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefPeriode.EO_ETU_MINEURS_KEY);
    }
  }

  public void removeFromEoEtuMineursRelationship(gestionuv.utt.fr.eo.EOEtuMineur object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("removing " + object + " from eoEtuMineurs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoEtuMineurs(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.EO_ETU_MINEURS_KEY);
    }
  }

  public gestionuv.utt.fr.eo.EOEtuMineur createEoEtuMineursRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.EOEtuMineur.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefPeriode.EO_ETU_MINEURS_KEY);
    return (gestionuv.utt.fr.eo.EOEtuMineur) eo;
  }

  public void deleteEoEtuMineursRelationship(gestionuv.utt.fr.eo.EOEtuMineur object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.EO_ETU_MINEURS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoEtuMineursRelationships() {
    Enumeration<gestionuv.utt.fr.eo.EOEtuMineur> objects = eoEtuMineurs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoEtuMineursRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOParamPeriode> eoParamPeriodes() {
    return (NSArray<etudiants.utt.fr.eo.EOParamPeriode>)storedValueForKey(_EORefPeriode.EO_PARAM_PERIODES_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOParamPeriode> eoParamPeriodes(EOQualifier qualifier) {
    return eoParamPeriodes(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EOParamPeriode> eoParamPeriodes(EOQualifier qualifier, boolean fetch) {
    return eoParamPeriodes(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EOParamPeriode> eoParamPeriodes(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EOParamPeriode> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOParamPeriode.EO_REF_PERIODE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EOParamPeriode.fetchEOParamPeriodes(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = eoParamPeriodes();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOParamPeriode>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOParamPeriode>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEoParamPeriodes(etudiants.utt.fr.eo.EOParamPeriode object) {
    includeObjectIntoPropertyWithKey(object, _EORefPeriode.EO_PARAM_PERIODES_KEY);
  }

  public void removeFromEoParamPeriodes(etudiants.utt.fr.eo.EOParamPeriode object) {
    excludeObjectFromPropertyWithKey(object, _EORefPeriode.EO_PARAM_PERIODES_KEY);
  }

  public void addToEoParamPeriodesRelationship(etudiants.utt.fr.eo.EOParamPeriode object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("adding " + object + " to eoParamPeriodes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoParamPeriodes(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefPeriode.EO_PARAM_PERIODES_KEY);
    }
  }

  public void removeFromEoParamPeriodesRelationship(etudiants.utt.fr.eo.EOParamPeriode object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("removing " + object + " from eoParamPeriodes relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoParamPeriodes(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.EO_PARAM_PERIODES_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOParamPeriode createEoParamPeriodesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOParamPeriode.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefPeriode.EO_PARAM_PERIODES_KEY);
    return (etudiants.utt.fr.eo.EOParamPeriode) eo;
  }

  public void deleteEoParamPeriodesRelationship(etudiants.utt.fr.eo.EOParamPeriode object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.EO_PARAM_PERIODES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoParamPeriodesRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOParamPeriode> objects = eoParamPeriodes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoParamPeriodesRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> etuInscrAdms() {
    return (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)storedValueForKey(_EORefPeriode.ETU_INSCR_ADMS_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> etuInscrAdms(EOQualifier qualifier) {
    return etuInscrAdms(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> etuInscrAdms(EOQualifier qualifier, boolean fetch) {
    return etuInscrAdms(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> etuInscrAdms(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOEtudiantInscrAdm.REF_PERIODE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EOEtudiantInscrAdm.fetchEOEtudiantInscrAdms(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = etuInscrAdms();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEtuInscrAdms(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    includeObjectIntoPropertyWithKey(object, _EORefPeriode.ETU_INSCR_ADMS_KEY);
  }

  public void removeFromEtuInscrAdms(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    excludeObjectFromPropertyWithKey(object, _EORefPeriode.ETU_INSCR_ADMS_KEY);
  }

  public void addToEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("adding " + object + " to etuInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEtuInscrAdms(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EORefPeriode.ETU_INSCR_ADMS_KEY);
    }
  }

  public void removeFromEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    if (_EORefPeriode.LOG.isDebugEnabled()) {
      _EORefPeriode.LOG.debug("removing " + object + " from etuInscrAdms relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEtuInscrAdms(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.ETU_INSCR_ADMS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOEtudiantInscrAdm createEtuInscrAdmsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOEtudiantInscrAdm.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EORefPeriode.ETU_INSCR_ADMS_KEY);
    return (etudiants.utt.fr.eo.EOEtudiantInscrAdm) eo;
  }

  public void deleteEtuInscrAdmsRelationship(etudiants.utt.fr.eo.EOEtudiantInscrAdm object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EORefPeriode.ETU_INSCR_ADMS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEtuInscrAdmsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOEtudiantInscrAdm> objects = etuInscrAdms().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEtuInscrAdmsRelationship(objects.nextElement());
    }
  }


  public static EORefPeriode createEORefPeriode(EOEditingContext editingContext, String anUniv
, String prdTypec
, String prdUniv
) {
    EORefPeriode eo = (EORefPeriode) EOUtilities.createAndInsertInstance(editingContext, _EORefPeriode.ENTITY_NAME);    
		eo.setAnUniv(anUniv);
		eo.setPrdTypec(prdTypec);
		eo.setPrdUniv(prdUniv);
    return eo;
  }

  public static ERXFetchSpecification<EORefPeriode> fetchSpec() {
    return new ERXFetchSpecification<EORefPeriode>(_EORefPeriode.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EORefPeriode> fetchAllEORefPeriodes(EOEditingContext editingContext) {
    return _EORefPeriode.fetchAllEORefPeriodes(editingContext, null);
  }

  public static NSArray<EORefPeriode> fetchAllEORefPeriodes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EORefPeriode.fetchEORefPeriodes(editingContext, null, sortOrderings);
  }

  public static NSArray<EORefPeriode> fetchEORefPeriodes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EORefPeriode> fetchSpec = new ERXFetchSpecification<EORefPeriode>(_EORefPeriode.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EORefPeriode> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EORefPeriode fetchEORefPeriode(EOEditingContext editingContext, String keyName, Object value) {
    return _EORefPeriode.fetchEORefPeriode(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EORefPeriode fetchEORefPeriode(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EORefPeriode> eoObjects = _EORefPeriode.fetchEORefPeriodes(editingContext, qualifier, null);
    EORefPeriode eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EORefPeriode that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EORefPeriode fetchRequiredEORefPeriode(EOEditingContext editingContext, String keyName, Object value) {
    return _EORefPeriode.fetchRequiredEORefPeriode(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EORefPeriode fetchRequiredEORefPeriode(EOEditingContext editingContext, EOQualifier qualifier) {
    EORefPeriode eoObject = _EORefPeriode.fetchEORefPeriode(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EORefPeriode that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EORefPeriode localInstanceIn(EOEditingContext editingContext, EORefPeriode eo) {
    EORefPeriode localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
