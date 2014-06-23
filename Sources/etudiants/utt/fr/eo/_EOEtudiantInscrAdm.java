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
// DO NOT EDIT.  Make changes to EOEtudiantInscrAdm.java instead.
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
public abstract class _EOEtudiantInscrAdm extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "EOEtudiantInscrAdm";

  // Attribute Keys
  public static final ERXKey<String> ANNEE_DIPL = new ERXKey<String>("anneeDipl");
  public static final ERXKey<String> AN_UNIV = new ERXKey<String>("anUniv");
  public static final ERXKey<String> AUTEUR_MAJ = new ERXKey<String>("auteurMaj");
  public static final ERXKey<Long> CONSEILLER_ID = new ERXKey<Long>("conseillerId");
  public static final ERXKey<NSTimestamp> CRE_DATE = new ERXKey<NSTimestamp>("creDate");
  public static final ERXKey<String> DIPLOMEC = new ERXKey<String>("diplomec");
  public static final ERXKey<String> DIPL_OPTC = new ERXKey<String>("diplOptc");
  public static final ERXKey<String> DIPL_SPECC = new ERXKey<String>("diplSpecc");
  public static final ERXKey<String> ECHANG_PROGC = new ERXKey<String>("echangProgc");
  public static final ERXKey<Long> ETU_ID = new ERXKey<Long>("etuId");
  public static final ERXKey<NSTimestamp> IMPORT_DATE = new ERXKey<NSTimestamp>("importDate");
  public static final ERXKey<String> INSCR_ADM_ID = new ERXKey<String>("inscrAdmId");
  public static final ERXKey<String> INSCR_FORMULE$C = new ERXKey<String>("inscrFormule$c");
  public static final ERXKey<String> INSCR_VF_OLD = new ERXKey<String>("inscrVfOld");
  public static final ERXKey<String> JURY_NOUVF = new ERXKey<String>("juryNouvf");
  public static final ERXKey<String> JURY_PUBLIF = new ERXKey<String>("juryPublif");
  public static final ERXKey<NSTimestamp> MODIF_DATE = new ERXKey<NSTimestamp>("modifDate");
  public static final ERXKey<String> NIVEAU_ADM = new ERXKey<String>("niveauAdm");
  public static final ERXKey<String> NOUV_REGL_A_SUPPRIMER = new ERXKey<String>("nouvReglASupprimer");
  public static final ERXKey<String> OBS_GEN = new ERXKey<String>("obsGen");
  public static final ERXKey<String> OBS_PEDAG = new ERXKey<String>("obsPedag");
  public static final ERXKey<String> PRD_UNIV = new ERXKey<String>("prdUniv");
  public static final ERXKey<String> RES_PEDAGC = new ERXKey<String>("resPedagc");
  public static final ERXKey<String> SITUATIONC = new ERXKey<String>("situationc");
  public static final ERXKey<Long> THESE_ID = new ERXKey<Long>("theseId");
  // Relationship Keys
  public static final ERXKey<etudiants.utt.fr.eo.EODiplome> DIPLOME = new ERXKey<etudiants.utt.fr.eo.EODiplome>("diplome");
  public static final ERXKey<etudiants.utt.fr.eo.EODiplOption> DIPL_OPTION = new ERXKey<etudiants.utt.fr.eo.EODiplOption>("diplOption");
  public static final ERXKey<etudiants.utt.fr.eo.EOIndividu> EO_CONSEILLER = new ERXKey<etudiants.utt.fr.eo.EOIndividu>("eoConseiller");
  public static final ERXKey<gestionuv.utt.fr.eo.EOEtuMineur> EO_ETU_MINEURS = new ERXKey<gestionuv.utt.fr.eo.EOEtuMineur>("eoEtuMineurs");
  public static final ERXKey<etudiants.utt.fr.eo.EOVueDiplSpec> EO_VUE_DIPL_SPECS = new ERXKey<etudiants.utt.fr.eo.EOVueDiplSpec>("eoVueDiplSpecs");
  public static final ERXKey<gestionuv.utt.fr.eo.EOVueInsuv> EO_VUE_INSUVS = new ERXKey<gestionuv.utt.fr.eo.EOVueInsuv>("eoVueInsuvs");
  public static final ERXKey<etudiants.utt.fr.eo.EOEtudiant> ETUDIANT = new ERXKey<etudiants.utt.fr.eo.EOEtudiant>("etudiant");
  public static final ERXKey<etudiants.utt.fr.eo.EOIndividu> INDIVIDU = new ERXKey<etudiants.utt.fr.eo.EOIndividu>("individu");
  public static final ERXKey<etudiants.utt.fr.eo.EORefPeriode> REF_PERIODE = new ERXKey<etudiants.utt.fr.eo.EORefPeriode>("refPeriode");
  public static final ERXKey<etudiants.utt.fr.eo.EORefSituation> REF_SITUATION = new ERXKey<etudiants.utt.fr.eo.EORefSituation>("refSituation");

  // Attributes
  public static final String ANNEE_DIPL_KEY = ANNEE_DIPL.key();
  public static final String AN_UNIV_KEY = AN_UNIV.key();
  public static final String AUTEUR_MAJ_KEY = AUTEUR_MAJ.key();
  public static final String CONSEILLER_ID_KEY = CONSEILLER_ID.key();
  public static final String CRE_DATE_KEY = CRE_DATE.key();
  public static final String DIPLOMEC_KEY = DIPLOMEC.key();
  public static final String DIPL_OPTC_KEY = DIPL_OPTC.key();
  public static final String DIPL_SPECC_KEY = DIPL_SPECC.key();
  public static final String ECHANG_PROGC_KEY = ECHANG_PROGC.key();
  public static final String ETU_ID_KEY = ETU_ID.key();
  public static final String IMPORT_DATE_KEY = IMPORT_DATE.key();
  public static final String INSCR_ADM_ID_KEY = INSCR_ADM_ID.key();
  public static final String INSCR_FORMULE$C_KEY = INSCR_FORMULE$C.key();
  public static final String INSCR_VF_OLD_KEY = INSCR_VF_OLD.key();
  public static final String JURY_NOUVF_KEY = JURY_NOUVF.key();
  public static final String JURY_PUBLIF_KEY = JURY_PUBLIF.key();
  public static final String MODIF_DATE_KEY = MODIF_DATE.key();
  public static final String NIVEAU_ADM_KEY = NIVEAU_ADM.key();
  public static final String NOUV_REGL_A_SUPPRIMER_KEY = NOUV_REGL_A_SUPPRIMER.key();
  public static final String OBS_GEN_KEY = OBS_GEN.key();
  public static final String OBS_PEDAG_KEY = OBS_PEDAG.key();
  public static final String PRD_UNIV_KEY = PRD_UNIV.key();
  public static final String RES_PEDAGC_KEY = RES_PEDAGC.key();
  public static final String SITUATIONC_KEY = SITUATIONC.key();
  public static final String THESE_ID_KEY = THESE_ID.key();
  // Relationships
  public static final String DIPLOME_KEY = DIPLOME.key();
  public static final String DIPL_OPTION_KEY = DIPL_OPTION.key();
  public static final String EO_CONSEILLER_KEY = EO_CONSEILLER.key();
  public static final String EO_ETU_MINEURS_KEY = EO_ETU_MINEURS.key();
  public static final String EO_VUE_DIPL_SPECS_KEY = EO_VUE_DIPL_SPECS.key();
  public static final String EO_VUE_INSUVS_KEY = EO_VUE_INSUVS.key();
  public static final String ETUDIANT_KEY = ETUDIANT.key();
  public static final String INDIVIDU_KEY = INDIVIDU.key();
  public static final String REF_PERIODE_KEY = REF_PERIODE.key();
  public static final String REF_SITUATION_KEY = REF_SITUATION.key();

  private static Logger LOG = Logger.getLogger(_EOEtudiantInscrAdm.class);

  public EOEtudiantInscrAdm localInstanceIn(EOEditingContext editingContext) {
    EOEtudiantInscrAdm localInstance = (EOEtudiantInscrAdm)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String anneeDipl() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.ANNEE_DIPL_KEY);
  }

  public void setAnneeDipl(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating anneeDipl from " + anneeDipl() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.ANNEE_DIPL_KEY);
  }

  public String anUniv() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.AN_UNIV_KEY);
  }

  public void setAnUniv(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating anUniv from " + anUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.AN_UNIV_KEY);
  }

  public String auteurMaj() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.AUTEUR_MAJ_KEY);
  }

  public void setAuteurMaj(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating auteurMaj from " + auteurMaj() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.AUTEUR_MAJ_KEY);
  }

  public Long conseillerId() {
    return (Long) storedValueForKey(_EOEtudiantInscrAdm.CONSEILLER_ID_KEY);
  }

  public void setConseillerId(Long value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating conseillerId from " + conseillerId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.CONSEILLER_ID_KEY);
  }

  public NSTimestamp creDate() {
    return (NSTimestamp) storedValueForKey(_EOEtudiantInscrAdm.CRE_DATE_KEY);
  }

  public void setCreDate(NSTimestamp value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating creDate from " + creDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.CRE_DATE_KEY);
  }

  public String diplomec() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.DIPLOMEC_KEY);
  }

  public void setDiplomec(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating diplomec from " + diplomec() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.DIPLOMEC_KEY);
  }

  public String diplOptc() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.DIPL_OPTC_KEY);
  }

  public void setDiplOptc(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating diplOptc from " + diplOptc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.DIPL_OPTC_KEY);
  }

  public String diplSpecc() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.DIPL_SPECC_KEY);
  }

  public void setDiplSpecc(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating diplSpecc from " + diplSpecc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.DIPL_SPECC_KEY);
  }

  public String echangProgc() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.ECHANG_PROGC_KEY);
  }

  public void setEchangProgc(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating echangProgc from " + echangProgc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.ECHANG_PROGC_KEY);
  }

  public Long etuId() {
    return (Long) storedValueForKey(_EOEtudiantInscrAdm.ETU_ID_KEY);
  }

  public void setEtuId(Long value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating etuId from " + etuId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.ETU_ID_KEY);
  }

  public NSTimestamp importDate() {
    return (NSTimestamp) storedValueForKey(_EOEtudiantInscrAdm.IMPORT_DATE_KEY);
  }

  public void setImportDate(NSTimestamp value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating importDate from " + importDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.IMPORT_DATE_KEY);
  }

  public String inscrAdmId() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.INSCR_ADM_ID_KEY);
  }

  public void setInscrAdmId(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating inscrAdmId from " + inscrAdmId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.INSCR_ADM_ID_KEY);
  }

  public String inscrFormule$c() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.INSCR_FORMULE$C_KEY);
  }

  public void setInscrFormule$c(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating inscrFormule$c from " + inscrFormule$c() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.INSCR_FORMULE$C_KEY);
  }

  public String inscrVfOld() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.INSCR_VF_OLD_KEY);
  }

  public void setInscrVfOld(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating inscrVfOld from " + inscrVfOld() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.INSCR_VF_OLD_KEY);
  }

  public String juryNouvf() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.JURY_NOUVF_KEY);
  }

  public void setJuryNouvf(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating juryNouvf from " + juryNouvf() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.JURY_NOUVF_KEY);
  }

  public String juryPublif() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.JURY_PUBLIF_KEY);
  }

  public void setJuryPublif(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating juryPublif from " + juryPublif() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.JURY_PUBLIF_KEY);
  }

  public NSTimestamp modifDate() {
    return (NSTimestamp) storedValueForKey(_EOEtudiantInscrAdm.MODIF_DATE_KEY);
  }

  public void setModifDate(NSTimestamp value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating modifDate from " + modifDate() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.MODIF_DATE_KEY);
  }

  public String niveauAdm() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.NIVEAU_ADM_KEY);
  }

  public void setNiveauAdm(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating niveauAdm from " + niveauAdm() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.NIVEAU_ADM_KEY);
  }

  public String nouvReglASupprimer() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.NOUV_REGL_A_SUPPRIMER_KEY);
  }

  public void setNouvReglASupprimer(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating nouvReglASupprimer from " + nouvReglASupprimer() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.NOUV_REGL_A_SUPPRIMER_KEY);
  }

  public String obsGen() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.OBS_GEN_KEY);
  }

  public void setObsGen(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating obsGen from " + obsGen() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.OBS_GEN_KEY);
  }

  public String obsPedag() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.OBS_PEDAG_KEY);
  }

  public void setObsPedag(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating obsPedag from " + obsPedag() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.OBS_PEDAG_KEY);
  }

  public String prdUniv() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.PRD_UNIV_KEY);
  }

  public void setPrdUniv(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating prdUniv from " + prdUniv() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.PRD_UNIV_KEY);
  }

  public String resPedagc() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.RES_PEDAGC_KEY);
  }

  public void setResPedagc(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating resPedagc from " + resPedagc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.RES_PEDAGC_KEY);
  }

  public String situationc() {
    return (String) storedValueForKey(_EOEtudiantInscrAdm.SITUATIONC_KEY);
  }

  public void setSituationc(String value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating situationc from " + situationc() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.SITUATIONC_KEY);
  }

  public Long theseId() {
    return (Long) storedValueForKey(_EOEtudiantInscrAdm.THESE_ID_KEY);
  }

  public void setTheseId(Long value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
    	_EOEtudiantInscrAdm.LOG.debug( "updating theseId from " + theseId() + " to " + value);
    }
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.THESE_ID_KEY);
  }

  public etudiants.utt.fr.eo.EODiplome diplome() {
    return (etudiants.utt.fr.eo.EODiplome)storedValueForKey(_EOEtudiantInscrAdm.DIPLOME_KEY);
  }
  
  public void setDiplome(etudiants.utt.fr.eo.EODiplome value) {
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.DIPLOME_KEY);
  }

  public void setDiplomeRelationship(etudiants.utt.fr.eo.EODiplome value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("updating diplome from " + diplome() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setDiplome(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EODiplome oldValue = diplome();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOEtudiantInscrAdm.DIPLOME_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOEtudiantInscrAdm.DIPLOME_KEY);
    }
  }
  
  public etudiants.utt.fr.eo.EODiplOption diplOption() {
    return (etudiants.utt.fr.eo.EODiplOption)storedValueForKey(_EOEtudiantInscrAdm.DIPL_OPTION_KEY);
  }
  
  public void setDiplOption(etudiants.utt.fr.eo.EODiplOption value) {
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.DIPL_OPTION_KEY);
  }

  public void setDiplOptionRelationship(etudiants.utt.fr.eo.EODiplOption value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("updating diplOption from " + diplOption() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setDiplOption(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EODiplOption oldValue = diplOption();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOEtudiantInscrAdm.DIPL_OPTION_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOEtudiantInscrAdm.DIPL_OPTION_KEY);
    }
  }
  
  public etudiants.utt.fr.eo.EOIndividu eoConseiller() {
    return (etudiants.utt.fr.eo.EOIndividu)storedValueForKey(_EOEtudiantInscrAdm.EO_CONSEILLER_KEY);
  }
  
  public void setEoConseiller(etudiants.utt.fr.eo.EOIndividu value) {
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.EO_CONSEILLER_KEY);
  }

  public void setEoConseillerRelationship(etudiants.utt.fr.eo.EOIndividu value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("updating eoConseiller from " + eoConseiller() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setEoConseiller(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOIndividu oldValue = eoConseiller();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOEtudiantInscrAdm.EO_CONSEILLER_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOEtudiantInscrAdm.EO_CONSEILLER_KEY);
    }
  }
  
  public etudiants.utt.fr.eo.EOEtudiant etudiant() {
    return (etudiants.utt.fr.eo.EOEtudiant)storedValueForKey(_EOEtudiantInscrAdm.ETUDIANT_KEY);
  }
  
  public void setEtudiant(etudiants.utt.fr.eo.EOEtudiant value) {
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.ETUDIANT_KEY);
  }

  public void setEtudiantRelationship(etudiants.utt.fr.eo.EOEtudiant value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("updating etudiant from " + etudiant() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setEtudiant(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOEtudiant oldValue = etudiant();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOEtudiantInscrAdm.ETUDIANT_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOEtudiantInscrAdm.ETUDIANT_KEY);
    }
  }
  
  public etudiants.utt.fr.eo.EOIndividu individu() {
    return (etudiants.utt.fr.eo.EOIndividu)storedValueForKey(_EOEtudiantInscrAdm.INDIVIDU_KEY);
  }
  
  public void setIndividu(etudiants.utt.fr.eo.EOIndividu value) {
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.INDIVIDU_KEY);
  }

  public void setIndividuRelationship(etudiants.utt.fr.eo.EOIndividu value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("updating individu from " + individu() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setIndividu(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EOIndividu oldValue = individu();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOEtudiantInscrAdm.INDIVIDU_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOEtudiantInscrAdm.INDIVIDU_KEY);
    }
  }
  
  public etudiants.utt.fr.eo.EORefPeriode refPeriode() {
    return (etudiants.utt.fr.eo.EORefPeriode)storedValueForKey(_EOEtudiantInscrAdm.REF_PERIODE_KEY);
  }
  
  public void setRefPeriode(etudiants.utt.fr.eo.EORefPeriode value) {
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.REF_PERIODE_KEY);
  }

  public void setRefPeriodeRelationship(etudiants.utt.fr.eo.EORefPeriode value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("updating refPeriode from " + refPeriode() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setRefPeriode(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EORefPeriode oldValue = refPeriode();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOEtudiantInscrAdm.REF_PERIODE_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOEtudiantInscrAdm.REF_PERIODE_KEY);
    }
  }
  
  public etudiants.utt.fr.eo.EORefSituation refSituation() {
    return (etudiants.utt.fr.eo.EORefSituation)storedValueForKey(_EOEtudiantInscrAdm.REF_SITUATION_KEY);
  }
  
  public void setRefSituation(etudiants.utt.fr.eo.EORefSituation value) {
    takeStoredValueForKey(value, _EOEtudiantInscrAdm.REF_SITUATION_KEY);
  }

  public void setRefSituationRelationship(etudiants.utt.fr.eo.EORefSituation value) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("updating refSituation from " + refSituation() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setRefSituation(value);
    }
    else if (value == null) {
    	etudiants.utt.fr.eo.EORefSituation oldValue = refSituation();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _EOEtudiantInscrAdm.REF_SITUATION_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _EOEtudiantInscrAdm.REF_SITUATION_KEY);
    }
  }
  
  public NSArray<gestionuv.utt.fr.eo.EOEtuMineur> eoEtuMineurs() {
    return (NSArray<gestionuv.utt.fr.eo.EOEtuMineur>)storedValueForKey(_EOEtudiantInscrAdm.EO_ETU_MINEURS_KEY);
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(gestionuv.utt.fr.eo.EOEtuMineur.EO_ETUDIANT_INSCR_ADM_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
    includeObjectIntoPropertyWithKey(object, _EOEtudiantInscrAdm.EO_ETU_MINEURS_KEY);
  }

  public void removeFromEoEtuMineurs(gestionuv.utt.fr.eo.EOEtuMineur object) {
    excludeObjectFromPropertyWithKey(object, _EOEtudiantInscrAdm.EO_ETU_MINEURS_KEY);
  }

  public void addToEoEtuMineursRelationship(gestionuv.utt.fr.eo.EOEtuMineur object) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("adding " + object + " to eoEtuMineurs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoEtuMineurs(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOEtudiantInscrAdm.EO_ETU_MINEURS_KEY);
    }
  }

  public void removeFromEoEtuMineursRelationship(gestionuv.utt.fr.eo.EOEtuMineur object) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("removing " + object + " from eoEtuMineurs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoEtuMineurs(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtudiantInscrAdm.EO_ETU_MINEURS_KEY);
    }
  }

  public gestionuv.utt.fr.eo.EOEtuMineur createEoEtuMineursRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.EOEtuMineur.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOEtudiantInscrAdm.EO_ETU_MINEURS_KEY);
    return (gestionuv.utt.fr.eo.EOEtuMineur) eo;
  }

  public void deleteEoEtuMineursRelationship(gestionuv.utt.fr.eo.EOEtuMineur object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtudiantInscrAdm.EO_ETU_MINEURS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoEtuMineursRelationships() {
    Enumeration<gestionuv.utt.fr.eo.EOEtuMineur> objects = eoEtuMineurs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoEtuMineursRelationship(objects.nextElement());
    }
  }

  public NSArray<etudiants.utt.fr.eo.EOVueDiplSpec> eoVueDiplSpecs() {
    return (NSArray<etudiants.utt.fr.eo.EOVueDiplSpec>)storedValueForKey(_EOEtudiantInscrAdm.EO_VUE_DIPL_SPECS_KEY);
  }

  public NSArray<etudiants.utt.fr.eo.EOVueDiplSpec> eoVueDiplSpecs(EOQualifier qualifier) {
    return eoVueDiplSpecs(qualifier, null, false);
  }

  public NSArray<etudiants.utt.fr.eo.EOVueDiplSpec> eoVueDiplSpecs(EOQualifier qualifier, boolean fetch) {
    return eoVueDiplSpecs(qualifier, null, fetch);
  }

  public NSArray<etudiants.utt.fr.eo.EOVueDiplSpec> eoVueDiplSpecs(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<etudiants.utt.fr.eo.EOVueDiplSpec> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(etudiants.utt.fr.eo.EOVueDiplSpec.EO_ETUDIANT_INSCR_ADM_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = etudiants.utt.fr.eo.EOVueDiplSpec.fetchEOVueDiplSpecs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = eoVueDiplSpecs();
      if (qualifier != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOVueDiplSpec>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<etudiants.utt.fr.eo.EOVueDiplSpec>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEoVueDiplSpecs(etudiants.utt.fr.eo.EOVueDiplSpec object) {
    includeObjectIntoPropertyWithKey(object, _EOEtudiantInscrAdm.EO_VUE_DIPL_SPECS_KEY);
  }

  public void removeFromEoVueDiplSpecs(etudiants.utt.fr.eo.EOVueDiplSpec object) {
    excludeObjectFromPropertyWithKey(object, _EOEtudiantInscrAdm.EO_VUE_DIPL_SPECS_KEY);
  }

  public void addToEoVueDiplSpecsRelationship(etudiants.utt.fr.eo.EOVueDiplSpec object) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("adding " + object + " to eoVueDiplSpecs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoVueDiplSpecs(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOEtudiantInscrAdm.EO_VUE_DIPL_SPECS_KEY);
    }
  }

  public void removeFromEoVueDiplSpecsRelationship(etudiants.utt.fr.eo.EOVueDiplSpec object) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("removing " + object + " from eoVueDiplSpecs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoVueDiplSpecs(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtudiantInscrAdm.EO_VUE_DIPL_SPECS_KEY);
    }
  }

  public etudiants.utt.fr.eo.EOVueDiplSpec createEoVueDiplSpecsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( etudiants.utt.fr.eo.EOVueDiplSpec.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOEtudiantInscrAdm.EO_VUE_DIPL_SPECS_KEY);
    return (etudiants.utt.fr.eo.EOVueDiplSpec) eo;
  }

  public void deleteEoVueDiplSpecsRelationship(etudiants.utt.fr.eo.EOVueDiplSpec object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtudiantInscrAdm.EO_VUE_DIPL_SPECS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoVueDiplSpecsRelationships() {
    Enumeration<etudiants.utt.fr.eo.EOVueDiplSpec> objects = eoVueDiplSpecs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoVueDiplSpecsRelationship(objects.nextElement());
    }
  }

  public NSArray<gestionuv.utt.fr.eo.EOVueInsuv> eoVueInsuvs() {
    return (NSArray<gestionuv.utt.fr.eo.EOVueInsuv>)storedValueForKey(_EOEtudiantInscrAdm.EO_VUE_INSUVS_KEY);
  }

  public NSArray<gestionuv.utt.fr.eo.EOVueInsuv> eoVueInsuvs(EOQualifier qualifier) {
    return eoVueInsuvs(qualifier, null, false);
  }

  public NSArray<gestionuv.utt.fr.eo.EOVueInsuv> eoVueInsuvs(EOQualifier qualifier, boolean fetch) {
    return eoVueInsuvs(qualifier, null, fetch);
  }

  public NSArray<gestionuv.utt.fr.eo.EOVueInsuv> eoVueInsuvs(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<gestionuv.utt.fr.eo.EOVueInsuv> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(gestionuv.utt.fr.eo.EOVueInsuv.EO_ETUDIANT_INSCR_ADM_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = gestionuv.utt.fr.eo.EOVueInsuv.fetchEOVueInsuvs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = eoVueInsuvs();
      if (qualifier != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOVueInsuv>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<gestionuv.utt.fr.eo.EOVueInsuv>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToEoVueInsuvs(gestionuv.utt.fr.eo.EOVueInsuv object) {
    includeObjectIntoPropertyWithKey(object, _EOEtudiantInscrAdm.EO_VUE_INSUVS_KEY);
  }

  public void removeFromEoVueInsuvs(gestionuv.utt.fr.eo.EOVueInsuv object) {
    excludeObjectFromPropertyWithKey(object, _EOEtudiantInscrAdm.EO_VUE_INSUVS_KEY);
  }

  public void addToEoVueInsuvsRelationship(gestionuv.utt.fr.eo.EOVueInsuv object) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("adding " + object + " to eoVueInsuvs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToEoVueInsuvs(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _EOEtudiantInscrAdm.EO_VUE_INSUVS_KEY);
    }
  }

  public void removeFromEoVueInsuvsRelationship(gestionuv.utt.fr.eo.EOVueInsuv object) {
    if (_EOEtudiantInscrAdm.LOG.isDebugEnabled()) {
      _EOEtudiantInscrAdm.LOG.debug("removing " + object + " from eoVueInsuvs relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromEoVueInsuvs(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtudiantInscrAdm.EO_VUE_INSUVS_KEY);
    }
  }

  public gestionuv.utt.fr.eo.EOVueInsuv createEoVueInsuvsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( gestionuv.utt.fr.eo.EOVueInsuv.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _EOEtudiantInscrAdm.EO_VUE_INSUVS_KEY);
    return (gestionuv.utt.fr.eo.EOVueInsuv) eo;
  }

  public void deleteEoVueInsuvsRelationship(gestionuv.utt.fr.eo.EOVueInsuv object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _EOEtudiantInscrAdm.EO_VUE_INSUVS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEoVueInsuvsRelationships() {
    Enumeration<gestionuv.utt.fr.eo.EOVueInsuv> objects = eoVueInsuvs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEoVueInsuvsRelationship(objects.nextElement());
    }
  }


  public static EOEtudiantInscrAdm createEOEtudiantInscrAdm(EOEditingContext editingContext, String anneeDipl
, String anUniv
, String diplomec
, Long etuId
, String inscrVfOld
, String juryPublif
, String prdUniv
, etudiants.utt.fr.eo.EODiplome diplome, etudiants.utt.fr.eo.EOEtudiant etudiant, etudiants.utt.fr.eo.EOIndividu individu, etudiants.utt.fr.eo.EORefPeriode refPeriode) {
    EOEtudiantInscrAdm eo = (EOEtudiantInscrAdm) EOUtilities.createAndInsertInstance(editingContext, _EOEtudiantInscrAdm.ENTITY_NAME);    
		eo.setAnneeDipl(anneeDipl);
		eo.setAnUniv(anUniv);
		eo.setDiplomec(diplomec);
		eo.setEtuId(etuId);
		eo.setInscrVfOld(inscrVfOld);
		eo.setJuryPublif(juryPublif);
		eo.setPrdUniv(prdUniv);
    eo.setDiplomeRelationship(diplome);
    eo.setEtudiantRelationship(etudiant);
    eo.setIndividuRelationship(individu);
    eo.setRefPeriodeRelationship(refPeriode);
    return eo;
  }

  public static ERXFetchSpecification<EOEtudiantInscrAdm> fetchSpec() {
    return new ERXFetchSpecification<EOEtudiantInscrAdm>(_EOEtudiantInscrAdm.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<EOEtudiantInscrAdm> fetchAllEOEtudiantInscrAdms(EOEditingContext editingContext) {
    return _EOEtudiantInscrAdm.fetchAllEOEtudiantInscrAdms(editingContext, null);
  }

  public static NSArray<EOEtudiantInscrAdm> fetchAllEOEtudiantInscrAdms(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _EOEtudiantInscrAdm.fetchEOEtudiantInscrAdms(editingContext, null, sortOrderings);
  }

  public static NSArray<EOEtudiantInscrAdm> fetchEOEtudiantInscrAdms(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<EOEtudiantInscrAdm> fetchSpec = new ERXFetchSpecification<EOEtudiantInscrAdm>(_EOEtudiantInscrAdm.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<EOEtudiantInscrAdm> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static EOEtudiantInscrAdm fetchEOEtudiantInscrAdm(EOEditingContext editingContext, String keyName, Object value) {
    return _EOEtudiantInscrAdm.fetchEOEtudiantInscrAdm(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOEtudiantInscrAdm fetchEOEtudiantInscrAdm(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<EOEtudiantInscrAdm> eoObjects = _EOEtudiantInscrAdm.fetchEOEtudiantInscrAdms(editingContext, qualifier, null);
    EOEtudiantInscrAdm eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one EOEtudiantInscrAdm that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOEtudiantInscrAdm fetchRequiredEOEtudiantInscrAdm(EOEditingContext editingContext, String keyName, Object value) {
    return _EOEtudiantInscrAdm.fetchRequiredEOEtudiantInscrAdm(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static EOEtudiantInscrAdm fetchRequiredEOEtudiantInscrAdm(EOEditingContext editingContext, EOQualifier qualifier) {
    EOEtudiantInscrAdm eoObject = _EOEtudiantInscrAdm.fetchEOEtudiantInscrAdm(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no EOEtudiantInscrAdm that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static EOEtudiantInscrAdm localInstanceIn(EOEditingContext editingContext, EOEtudiantInscrAdm eo) {
    EOEtudiantInscrAdm localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> fetchToutNiveaux(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("toutNiveaux", _EOEtudiantInscrAdm.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm> fetchToutNiveaux(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("toutNiveaux", _EOEtudiantInscrAdm.ENTITY_NAME);
    return (NSArray<etudiants.utt.fr.eo.EOEtudiantInscrAdm>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}