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
// DO NOT EDIT.  Make changes to EOUtPersPoste.java instead.
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
public abstract class _EOUtPersPoste extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOUtPersPoste";

  // Attribute Keys
  public static final ERXKey<String> AUTEUR_MAJ = new ERXKey<String>("auteurMaj");
  public static final ERXKey<String> CORPSC = new ERXKey<String>("corpsc");
  public static final ERXKey<String> CRC = new ERXKey<String>("crc");
  public static final ERXKey<NSTimestamp> CRE_DATE = new ERXKey<NSTimestamp>("creDate");
  public static final ERXKey<String> CR_PRINC_PAIEI = new ERXKey<String>("crPrincPaiei");
  public static final ERXKey<String> FONCTION = new ERXKey<String>("fonction");
  public static final ERXKey<String> FONCTION_DESC = new ERXKey<String>("fonctionDesc");
  public static final ERXKey<String> GRADEC = new ERXKey<String>("gradec");
  public static final ERXKey<Long> INDIV_ID = new ERXKey<Long>("indivId");
  public static final ERXKey<NSTimestamp> MODIF_DATE = new ERXKey<NSTimestamp>("modifDate");
  public static final ERXKey<Long> OBLIG_SERV = new ERXKey<Long>("obligServ");
  public static final ERXKey<Long> POSTE_ID = new ERXKey<Long>("posteId");
  public static final ERXKey<String> RANG = new ERXKey<String>("rang");
  public static final ERXKey<Long> RECH_UNIT_ID = new ERXKey<Long>("rechUnitId");
  public static final ERXKey<NSTimestamp> SITU_DEBUT_DATE = new ERXKey<NSTimestamp>("situDebutDate");
  public static final ERXKey<NSTimestamp> SITU_FIN_DATE = new ERXKey<NSTimestamp>("situFinDate");
  public static final ERXKey<String> STATUTC = new ERXKey<String>("statutc");
  public static final ERXKey<Long> SUPER_INDIV_ID = new ERXKey<Long>("superIndivId");
  public static final ERXKey<String> SUPPR_LOGICF = new ERXKey<String>("supprLogicf");
  public static final ERXKey<String> TITREC = new ERXKey<String>("titrec");
  public static final ERXKey<String> TYPE_POSTEI = new ERXKey<String>("typePostei");
  public static final ERXKey<String> UT_COMPC = new ERXKey<String>("utCompc");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EOIndividu> INDIVIDU = new ERXKey<etudiants.utt.fr.eo.EOIndividu>("individu");

  // Attributes
  public static final String AUTEUR_MAJ_KEY = AUTEUR_MAJ.key();
  public static final String CORPSC_KEY = CORPSC.key();
  public static final String CRC_KEY = CRC.key();
  public static final String CRE_DATE_KEY = CRE_DATE.key();
  public static final String CR_PRINC_PAIEI_KEY = CR_PRINC_PAIEI.key();
  public static final String FONCTION_KEY = FONCTION.key();
  public static final String FONCTION_DESC_KEY = FONCTION_DESC.key();
  public static final String GRADEC_KEY = GRADEC.key();
  public static final String INDIV_ID_KEY = INDIV_ID.key();
  public static final String MODIF_DATE_KEY = MODIF_DATE.key();
  public static final String OBLIG_SERV_KEY = OBLIG_SERV.key();
  public static final String POSTE_ID_KEY = POSTE_ID.key();
  public static final String RANG_KEY = RANG.key();
  public static final String RECH_UNIT_ID_KEY = RECH_UNIT_ID.key();
  public static final String SITU_DEBUT_DATE_KEY = SITU_DEBUT_DATE.key();
  public static final String SITU_FIN_DATE_KEY = SITU_FIN_DATE.key();
  public static final String STATUTC_KEY = STATUTC.key();
  public static final String SUPER_INDIV_ID_KEY = SUPER_INDIV_ID.key();
  public static final String SUPPR_LOGICF_KEY = SUPPR_LOGICF.key();
  public static final String TITREC_KEY = TITREC.key();
  public static final String TYPE_POSTEI_KEY = TYPE_POSTEI.key();
  public static final String UT_COMPC_KEY = UT_COMPC.key();
  // Relationships
  public static final String INDIVIDU_KEY = INDIVIDU.key();

  private static Logger LOG = Logger.getLogger(_EOUtPersPoste.class);

  public EOUtPersPoste localInstanceIn(EOEditingContext editingContext) {
    EOUtPersPoste localInstance = (EOUtPersPoste)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String auteurMaj() {
    return (String) storedValueForKey(_EOUtPersPoste.AUTEUR_MAJ_KEY);
  }

  public void setAuteurMaj(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating auteurMaj from " + auteurMaj() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.AUTEUR_MAJ_KEY);
  }

  public String corpsc() {
    return (String) storedValueForKey(_EOUtPersPoste.CORPSC_KEY);
  }

  public void setCorpsc(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating corpsc from " + corpsc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.CORPSC_KEY);
  }

  public String crc() {
    return (String) storedValueForKey(_EOUtPersPoste.CRC_KEY);
  }

  public void setCrc(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating crc from " + crc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.CRC_KEY);
  }

  public NSTimestamp creDate() {
    return (NSTimestamp) storedValueForKey(_EOUtPersPoste.CRE_DATE_KEY);
  }

  public void setCreDate(NSTimestamp value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating creDate from " + creDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.CRE_DATE_KEY);
  }

  public String crPrincPaiei() {
    return (String) storedValueForKey(_EOUtPersPoste.CR_PRINC_PAIEI_KEY);
  }

  public void setCrPrincPaiei(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating crPrincPaiei from " + crPrincPaiei() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.CR_PRINC_PAIEI_KEY);
  }

  public String fonction() {
    return (String) storedValueForKey(_EOUtPersPoste.FONCTION_KEY);
  }

  public void setFonction(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating fonction from " + fonction() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.FONCTION_KEY);
  }

  public String fonctionDesc() {
    return (String) storedValueForKey(_EOUtPersPoste.FONCTION_DESC_KEY);
  }

  public void setFonctionDesc(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating fonctionDesc from " + fonctionDesc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.FONCTION_DESC_KEY);
  }

  public String gradec() {
    return (String) storedValueForKey(_EOUtPersPoste.GRADEC_KEY);
  }

  public void setGradec(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating gradec from " + gradec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.GRADEC_KEY);
  }

  public Long indivId() {
    return (Long) storedValueForKey(_EOUtPersPoste.INDIV_ID_KEY);
  }

  public void setIndivId(Long value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating indivId from " + indivId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.INDIV_ID_KEY);
  }

  public NSTimestamp modifDate() {
    return (NSTimestamp) storedValueForKey(_EOUtPersPoste.MODIF_DATE_KEY);
  }

  public void setModifDate(NSTimestamp value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating modifDate from " + modifDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.MODIF_DATE_KEY);
  }

  public Long obligServ() {
    return (Long) storedValueForKey(_EOUtPersPoste.OBLIG_SERV_KEY);
  }

  public void setObligServ(Long value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating obligServ from " + obligServ() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.OBLIG_SERV_KEY);
  }

  public Long posteId() {
    return (Long) storedValueForKey(_EOUtPersPoste.POSTE_ID_KEY);
  }

  public void setPosteId(Long value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating posteId from " + posteId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.POSTE_ID_KEY);
  }

  public String rang() {
    return (String) storedValueForKey(_EOUtPersPoste.RANG_KEY);
  }

  public void setRang(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating rang from " + rang() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.RANG_KEY);
  }

  public Long rechUnitId() {
    return (Long) storedValueForKey(_EOUtPersPoste.RECH_UNIT_ID_KEY);
  }

  public void setRechUnitId(Long value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating rechUnitId from " + rechUnitId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.RECH_UNIT_ID_KEY);
  }

  public NSTimestamp situDebutDate() {
    return (NSTimestamp) storedValueForKey(_EOUtPersPoste.SITU_DEBUT_DATE_KEY);
  }

  public void setSituDebutDate(NSTimestamp value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating situDebutDate from " + situDebutDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.SITU_DEBUT_DATE_KEY);
  }

  public NSTimestamp situFinDate() {
    return (NSTimestamp) storedValueForKey(_EOUtPersPoste.SITU_FIN_DATE_KEY);
  }

  public void setSituFinDate(NSTimestamp value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating situFinDate from " + situFinDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.SITU_FIN_DATE_KEY);
  }

  public String statutc() {
    return (String) storedValueForKey(_EOUtPersPoste.STATUTC_KEY);
  }

  public void setStatutc(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating statutc from " + statutc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.STATUTC_KEY);
  }

  public Long superIndivId() {
    return (Long) storedValueForKey(_EOUtPersPoste.SUPER_INDIV_ID_KEY);
  }

  public void setSuperIndivId(Long value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating superIndivId from " + superIndivId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.SUPER_INDIV_ID_KEY);
  }

  public String supprLogicf() {
    return (String) storedValueForKey(_EOUtPersPoste.SUPPR_LOGICF_KEY);
  }

  public void setSupprLogicf(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating supprLogicf from " + supprLogicf() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.SUPPR_LOGICF_KEY);
  }

  public String titrec() {
    return (String) storedValueForKey(_EOUtPersPoste.TITREC_KEY);
  }

  public void setTitrec(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating titrec from " + titrec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.TITREC_KEY);
  }

  public String typePostei() {
    return (String) storedValueForKey(_EOUtPersPoste.TYPE_POSTEI_KEY);
  }

  public void setTypePostei(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating typePostei from " + typePostei() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.TYPE_POSTEI_KEY);
  }

  public String utCompc() {
    return (String) storedValueForKey(_EOUtPersPoste.UT_COMPC_KEY);
  }

  public void setUtCompc(String value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
    	_EOUtPersPoste.LOG.debug( "updating utCompc from " + utCompc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOUtPersPoste.UT_COMPC_KEY);
  }

  public etudiants.utt.fr.eo.EOIndividu individu() {
    return (etudiants.utt.fr.eo.EOIndividu)storedValueForKey(_EOUtPersPoste.INDIVIDU_KEY);
  }
  
  public void setIndividu(etudiants.utt.fr.eo.EOIndividu value) {
    takeStoredValueForKey(value, _EOUtPersPoste.INDIVIDU_KEY);
  }

  public void setIndividuRelationship(etudiants.utt.fr.eo.EOIndividu value) {
    if (_EOUtPersPoste.LOG.isDebugEnabled()) {
      _EOUtPersPoste.LOG.debug("updating individu from " + individu() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setIndividu(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOIndividu oldValue = individu();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOUtPersPoste.INDIVIDU_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOUtPersPoste.INDIVIDU_KEY);
    }
  }
  

  public static EOUtPersPoste createEOUtPersPoste(EOEditingContext editingContext, Long posteId
, String supprLogicf
) {
    EOUtPersPoste eo = (EOUtPersPoste) EOUtilities.createAndInsertInstance(editingContext, _EOUtPersPoste.ENTITY_NAME);    
		eo.setPosteId(posteId);
		eo.setSupprLogicf(supprLogicf);
    return eo;
  }

  public static ERXFetchSpecification<EOUtPersPoste> fetchSpec() {
    return new ERXFetchSpecification<EOUtPersPoste>(_EOUtPersPoste.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOUtPersPoste> fetchAllEOUtPersPostes(EOEditingContext editingContext) {
    return _EOUtPersPoste.fetchAllEOUtPersPostes(editingContext, null);
  }

  public static NSArray<EOUtPersPoste> fetchAllEOUtPersPostes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOUtPersPoste.fetchEOUtPersPostes(editingContext, null, sortOrderings);
  }

  public static NSArray<EOUtPersPoste> fetchEOUtPersPostes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOUtPersPoste> fetchSpec = new ERXFetchSpecification<EOUtPersPoste>(_EOUtPersPoste.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOUtPersPoste> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOUtPersPoste fetchEOUtPersPoste(EOEditingContext editingContext, String keyName, Object value) {
    return _EOUtPersPoste.fetchEOUtPersPoste(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOUtPersPoste fetchEOUtPersPoste(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOUtPersPoste> eoObjects = _EOUtPersPoste.fetchEOUtPersPostes(editingContext, qualifier, null);
    EOUtPersPoste eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOUtPersPoste that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOUtPersPoste fetchRequiredEOUtPersPoste(EOEditingContext editingContext, String keyName, Object value) {
    return _EOUtPersPoste.fetchRequiredEOUtPersPoste(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOUtPersPoste fetchRequiredEOUtPersPoste(EOEditingContext editingContext, EOQualifier qualifier) {
    EOUtPersPoste eoObject = _EOUtPersPoste.fetchEOUtPersPoste(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOUtPersPoste that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOUtPersPoste localInstanceIn(EOEditingContext editingContext, EOUtPersPoste eo) {
    EOUtPersPoste localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
