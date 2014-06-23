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
// DO NOT EDIT.  Make changes to EOEtuMineur.java instead.
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
public abstract class _EOEtuMineur extends ERXGenericRecord {
	public static final String ENTITY_NAME = "EOEtuMineur";

	// Attribute Keys
	public static final ERXKey<String> AN_UNIV = new ERXKey<String>("anUniv");
	public static final ERXKey<String> COMMENTAIRE = new ERXKey<String>(
			"commentaire");
	public static final ERXKey<NSTimestamp> CRE_DATE = new ERXKey<NSTimestamp>(
			"creDate");
	public static final ERXKey<String> DIPLOMEC = new ERXKey<String>("diplomec");
	public static final ERXKey<Long> ETU_ID = new ERXKey<Long>("etuId");
	public static final ERXKey<NSTimestamp> JURY_DATE = new ERXKey<NSTimestamp>(
			"juryDate");
	public static final ERXKey<String> MAJ_AUTEUR = new ERXKey<String>(
			"majAuteur");
	public static final ERXKey<NSTimestamp> MAJ_DATE = new ERXKey<NSTimestamp>(
			"majDate");
	public static final ERXKey<String> MINEURC = new ERXKey<String>("mineurc");
	public static final ERXKey<String> MIN_RESC = new ERXKey<String>("minResc");
	public static final ERXKey<String> PRD_UNIV = new ERXKey<String>("prdUniv");
	// Relationship Keys
	public static final ERXKey<etudiants.utt.fr.eo.EODiplome> EO_DIPLOME = new ERXKey<etudiants.utt.fr.eo.EODiplome>(
			"eoDiplome");
	public static final ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm> EO_ETUDIANT_INSCR_ADM = new ERXKey<etudiants.utt.fr.eo.EOEtudiantInscrAdm>(
			"eoEtudiantInscrAdm");
	public static final ERXKey<etudiants.utt.fr.eo.EORefPeriode> EO_REF_PERIODE = new ERXKey<etudiants.utt.fr.eo.EORefPeriode>(
			"eoRefPeriode");
	public static final ERXKey<etudiants.utt.fr.eo.EOIndividu> ETUDIANT = new ERXKey<etudiants.utt.fr.eo.EOIndividu>(
			"etudiant");

	// Attributes
	public static final String AN_UNIV_KEY = AN_UNIV.key();
	public static final String COMMENTAIRE_KEY = COMMENTAIRE.key();
	public static final String CRE_DATE_KEY = CRE_DATE.key();
	public static final String DIPLOMEC_KEY = DIPLOMEC.key();
	public static final String ETU_ID_KEY = ETU_ID.key();
	public static final String JURY_DATE_KEY = JURY_DATE.key();
	public static final String MAJ_AUTEUR_KEY = MAJ_AUTEUR.key();
	public static final String MAJ_DATE_KEY = MAJ_DATE.key();
	public static final String MINEURC_KEY = MINEURC.key();
	public static final String MIN_RESC_KEY = MIN_RESC.key();
	public static final String PRD_UNIV_KEY = PRD_UNIV.key();
	// Relationships
	public static final String EO_DIPLOME_KEY = EO_DIPLOME.key();
	public static final String EO_ETUDIANT_INSCR_ADM_KEY = EO_ETUDIANT_INSCR_ADM
			.key();
	public static final String EO_REF_PERIODE_KEY = EO_REF_PERIODE.key();
	public static final String ETUDIANT_KEY = ETUDIANT.key();

	private static Logger LOG = Logger.getLogger(_EOEtuMineur.class);

	public EOEtuMineur localInstanceIn(EOEditingContext editingContext) {
		EOEtuMineur localInstance = (EOEtuMineur) EOUtilities
				.localInstanceOfObject(editingContext, this);
		if (localInstance == null) {
			throw new IllegalStateException("You attempted to localInstance "
					+ this + ", which has not yet committed.");
		}
		return localInstance;
	}

	public String anUniv() {
		return (String) storedValueForKey(_EOEtuMineur.AN_UNIV_KEY);
	}

	public void setAnUniv(String value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating anUniv from " + anUniv() + " to "
					+ value);
		}
		takeStoredValueForKey(value, _EOEtuMineur.AN_UNIV_KEY);
	}

	public String commentaire() {
		return (String) storedValueForKey(_EOEtuMineur.COMMENTAIRE_KEY);
	}

	public void setCommentaire(String value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating commentaire from " + commentaire()
					+ " to " + value);
		}
		takeStoredValueForKey(value, _EOEtuMineur.COMMENTAIRE_KEY);
	}

	public NSTimestamp creDate() {
		return (NSTimestamp) storedValueForKey(_EOEtuMineur.CRE_DATE_KEY);
	}

	public void setCreDate(NSTimestamp value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating creDate from " + creDate()
					+ " to " + value);
		}
		takeStoredValueForKey(value, _EOEtuMineur.CRE_DATE_KEY);
	}

	public String diplomec() {
		return (String) storedValueForKey(_EOEtuMineur.DIPLOMEC_KEY);
	}

	public void setDiplomec(String value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating diplomec from " + diplomec()
					+ " to " + value);
		}
		takeStoredValueForKey(value, _EOEtuMineur.DIPLOMEC_KEY);
	}

	public Long etuId() {
		return (Long) storedValueForKey(_EOEtuMineur.ETU_ID_KEY);
	}

	public void setEtuId(Long value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating etuId from " + etuId() + " to "
					+ value);
		}
		takeStoredValueForKey(value, _EOEtuMineur.ETU_ID_KEY);
	}

	public NSTimestamp juryDate() {
		return (NSTimestamp) storedValueForKey(_EOEtuMineur.JURY_DATE_KEY);
	}

	public void setJuryDate(NSTimestamp value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating juryDate from " + juryDate()
					+ " to " + value);
		}
		takeStoredValueForKey(value, _EOEtuMineur.JURY_DATE_KEY);
	}

	public String majAuteur() {
		return (String) storedValueForKey(_EOEtuMineur.MAJ_AUTEUR_KEY);
	}

	public void setMajAuteur(String value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating majAuteur from " + majAuteur()
					+ " to " + value);
		}
		takeStoredValueForKey(value, _EOEtuMineur.MAJ_AUTEUR_KEY);
	}

	public NSTimestamp majDate() {
		return (NSTimestamp) storedValueForKey(_EOEtuMineur.MAJ_DATE_KEY);
	}

	public void setMajDate(NSTimestamp value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating majDate from " + majDate()
					+ " to " + value);
		}
		takeStoredValueForKey(value, _EOEtuMineur.MAJ_DATE_KEY);
	}

	public String mineurc() {
		return (String) storedValueForKey(_EOEtuMineur.MINEURC_KEY);
	}

	public void setMineurc(String value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating mineurc from " + mineurc()
					+ " to " + value);
		}
		takeStoredValueForKey(value, _EOEtuMineur.MINEURC_KEY);
	}

	public String minResc() {
		return (String) storedValueForKey(_EOEtuMineur.MIN_RESC_KEY);
	}

	public void setMinResc(String value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating minResc from " + minResc()
					+ " to " + value);
		}
		takeStoredValueForKey(value, _EOEtuMineur.MIN_RESC_KEY);
	}

	public String prdUniv() {
		return (String) storedValueForKey(_EOEtuMineur.PRD_UNIV_KEY);
	}

	public void setPrdUniv(String value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating prdUniv from " + prdUniv()
					+ " to " + value);
		}
		takeStoredValueForKey(value, _EOEtuMineur.PRD_UNIV_KEY);
	}

	public etudiants.utt.fr.eo.EODiplome eoDiplome() {
		return (etudiants.utt.fr.eo.EODiplome) storedValueForKey(_EOEtuMineur.EO_DIPLOME_KEY);
	}

	public void setEoDiplome(etudiants.utt.fr.eo.EODiplome value) {
		takeStoredValueForKey(value, _EOEtuMineur.EO_DIPLOME_KEY);
	}

	public void setEoDiplomeRelationship(etudiants.utt.fr.eo.EODiplome value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating eoDiplome from " + eoDiplome()
					+ " to " + value);
		}
		if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater
				.updateInverseRelationships()) {
			setEoDiplome(value);
		} else if (value == null) {
			etudiants.utt.fr.eo.EODiplome oldValue = eoDiplome();
			if (oldValue != null) {
				removeObjectFromBothSidesOfRelationshipWithKey(oldValue,
						_EOEtuMineur.EO_DIPLOME_KEY);
			}
		} else {
			addObjectToBothSidesOfRelationshipWithKey(value,
					_EOEtuMineur.EO_DIPLOME_KEY);
		}
	}

	public etudiants.utt.fr.eo.EOEtudiantInscrAdm eoEtudiantInscrAdm() {
		return (etudiants.utt.fr.eo.EOEtudiantInscrAdm) storedValueForKey(_EOEtuMineur.EO_ETUDIANT_INSCR_ADM_KEY);
	}

	public void setEoEtudiantInscrAdm(
			etudiants.utt.fr.eo.EOEtudiantInscrAdm value) {
		takeStoredValueForKey(value, _EOEtuMineur.EO_ETUDIANT_INSCR_ADM_KEY);
	}

	public void setEoEtudiantInscrAdmRelationship(
			etudiants.utt.fr.eo.EOEtudiantInscrAdm value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating eoEtudiantInscrAdm from "
					+ eoEtudiantInscrAdm() + " to " + value);
		}
		if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater
				.updateInverseRelationships()) {
			setEoEtudiantInscrAdm(value);
		} else if (value == null) {
			etudiants.utt.fr.eo.EOEtudiantInscrAdm oldValue = eoEtudiantInscrAdm();
			if (oldValue != null) {
				removeObjectFromBothSidesOfRelationshipWithKey(oldValue,
						_EOEtuMineur.EO_ETUDIANT_INSCR_ADM_KEY);
			}
		} else {
			addObjectToBothSidesOfRelationshipWithKey(value,
					_EOEtuMineur.EO_ETUDIANT_INSCR_ADM_KEY);
		}
	}

	public etudiants.utt.fr.eo.EORefPeriode eoRefPeriode() {
		return (etudiants.utt.fr.eo.EORefPeriode) storedValueForKey(_EOEtuMineur.EO_REF_PERIODE_KEY);
	}

	public void setEoRefPeriode(etudiants.utt.fr.eo.EORefPeriode value) {
		takeStoredValueForKey(value, _EOEtuMineur.EO_REF_PERIODE_KEY);
	}

	public void setEoRefPeriodeRelationship(
			etudiants.utt.fr.eo.EORefPeriode value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating eoRefPeriode from "
					+ eoRefPeriode() + " to " + value);
		}
		if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater
				.updateInverseRelationships()) {
			setEoRefPeriode(value);
		} else if (value == null) {
			etudiants.utt.fr.eo.EORefPeriode oldValue = eoRefPeriode();
			if (oldValue != null) {
				removeObjectFromBothSidesOfRelationshipWithKey(oldValue,
						_EOEtuMineur.EO_REF_PERIODE_KEY);
			}
		} else {
			addObjectToBothSidesOfRelationshipWithKey(value,
					_EOEtuMineur.EO_REF_PERIODE_KEY);
		}
	}

	public etudiants.utt.fr.eo.EOIndividu etudiant() {
		return (etudiants.utt.fr.eo.EOIndividu) storedValueForKey(_EOEtuMineur.ETUDIANT_KEY);
	}

	public void setEtudiant(etudiants.utt.fr.eo.EOIndividu value) {
		takeStoredValueForKey(value, _EOEtuMineur.ETUDIANT_KEY);
	}

	public void setEtudiantRelationship(etudiants.utt.fr.eo.EOIndividu value) {
		if (_EOEtuMineur.LOG.isDebugEnabled()) {
			_EOEtuMineur.LOG.debug("updating etudiant from " + etudiant()
					+ " to " + value);
		}
		if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater
				.updateInverseRelationships()) {
			setEtudiant(value);
		} else if (value == null) {
			etudiants.utt.fr.eo.EOIndividu oldValue = etudiant();
			if (oldValue != null) {
				removeObjectFromBothSidesOfRelationshipWithKey(oldValue,
						_EOEtuMineur.ETUDIANT_KEY);
			}
		} else {
			addObjectToBothSidesOfRelationshipWithKey(value,
					_EOEtuMineur.ETUDIANT_KEY);
		}
	}

	public static EOEtuMineur createEOEtuMineur(
			EOEditingContext editingContext, String anUniv, String diplomec,
			Long etuId, String mineurc, String minResc, String prdUniv,
			etudiants.utt.fr.eo.EODiplome eoDiplome,
			etudiants.utt.fr.eo.EOEtudiantInscrAdm eoEtudiantInscrAdm,
			etudiants.utt.fr.eo.EORefPeriode eoRefPeriode,
			etudiants.utt.fr.eo.EOIndividu etudiant) {
		EOEtuMineur eo = (EOEtuMineur) EOUtilities.createAndInsertInstance(
				editingContext, _EOEtuMineur.ENTITY_NAME);
		eo.setAnUniv(anUniv);
		eo.setDiplomec(diplomec);
		eo.setEtuId(etuId);
		eo.setMineurc(mineurc);
		eo.setMinResc(minResc);
		eo.setPrdUniv(prdUniv);
		eo.setEoDiplomeRelationship(eoDiplome);
		eo.setEoEtudiantInscrAdmRelationship(eoEtudiantInscrAdm);
		eo.setEoRefPeriodeRelationship(eoRefPeriode);
		eo.setEtudiantRelationship(etudiant);
		return eo;
	}

	public static ERXFetchSpecification<EOEtuMineur> fetchSpec() {
		return new ERXFetchSpecification<EOEtuMineur>(_EOEtuMineur.ENTITY_NAME,
				null, null, false, true, null);
	}

	public static NSArray<EOEtuMineur> fetchAllEOEtuMineurs(
			EOEditingContext editingContext) {
		return _EOEtuMineur.fetchAllEOEtuMineurs(editingContext, null);
	}

	public static NSArray<EOEtuMineur> fetchAllEOEtuMineurs(
			EOEditingContext editingContext,
			NSArray<EOSortOrdering> sortOrderings) {
		return _EOEtuMineur.fetchEOEtuMineurs(editingContext, null,
				sortOrderings);
	}

	public static NSArray<EOEtuMineur> fetchEOEtuMineurs(
			EOEditingContext editingContext, EOQualifier qualifier,
			NSArray<EOSortOrdering> sortOrderings) {
		ERXFetchSpecification<EOEtuMineur> fetchSpec = new ERXFetchSpecification<EOEtuMineur>(
				_EOEtuMineur.ENTITY_NAME, qualifier, sortOrderings);
		fetchSpec.setIsDeep(true);
		NSArray<EOEtuMineur> eoObjects = null;
		try {
	    	editingContext.lock();
	    	eoObjects = fetchSpec.fetchObjects(editingContext);
		} finally {
	    	editingContext.unlock();
		}
		return eoObjects;
	}

	public static EOEtuMineur fetchEOEtuMineur(EOEditingContext editingContext,
			String keyName, Object value) {
		return _EOEtuMineur.fetchEOEtuMineur(editingContext,
				new EOKeyValueQualifier(keyName,
						EOQualifier.QualifierOperatorEqual, value));
	}

	public static EOEtuMineur fetchEOEtuMineur(EOEditingContext editingContext,
			EOQualifier qualifier) {
		NSArray<EOEtuMineur> eoObjects = _EOEtuMineur.fetchEOEtuMineurs(
				editingContext, qualifier, null);
		EOEtuMineur eoObject;
		int count = eoObjects.count();
		if (count == 0) {
			eoObject = null;
		} else if (count == 1) {
			eoObject = eoObjects.objectAtIndex(0);
		} else {
			throw new IllegalStateException(
					"There was more than one EOEtuMineur that matched the qualifier '"
							+ qualifier + "'.");
		}
		return eoObject;
	}

	public static EOEtuMineur fetchRequiredEOEtuMineur(
			EOEditingContext editingContext, String keyName, Object value) {
		return _EOEtuMineur.fetchRequiredEOEtuMineur(editingContext,
				new EOKeyValueQualifier(keyName,
						EOQualifier.QualifierOperatorEqual, value));
	}

	public static EOEtuMineur fetchRequiredEOEtuMineur(
			EOEditingContext editingContext, EOQualifier qualifier) {
		EOEtuMineur eoObject = _EOEtuMineur.fetchEOEtuMineur(editingContext,
				qualifier);
		if (eoObject == null) {
			throw new NoSuchElementException(
					"There was no EOEtuMineur that matched the qualifier '"
							+ qualifier + "'.");
		}
		return eoObject;
	}

	public static EOEtuMineur localInstanceIn(EOEditingContext editingContext,
			EOEtuMineur eo) {
		EOEtuMineur localInstance = (eo == null) ? null : ERXEOControlUtilities
				.localInstanceOfObject(editingContext, eo);
		if (localInstance == null && eo != null) {
			throw new IllegalStateException("You attempted to localInstance "
					+ eo + ", which has not yet committed.");
		}
		return localInstance;
	}

	public static NSArray<gestionuv.utt.fr.eo.EOEtuMineur> fetchEtuMineurs(
			EOEditingContext editingContext,
			NSDictionary<String, Object> bindings) {
		EOFetchSpecification fetchSpec = EOFetchSpecification
				.fetchSpecificationNamed("etuMineurs", _EOEtuMineur.ENTITY_NAME);
		fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
		try {
			editingContext.lock();
			return (NSArray<gestionuv.utt.fr.eo.EOEtuMineur>) editingContext
					.objectsWithFetchSpecification(fetchSpec);
		} catch (Exception e) {
			return null;
		} finally {
			editingContext.unlock();
		}
	}

	public static NSArray<gestionuv.utt.fr.eo.EOEtuMineur> fetchEtuMineurs(
			EOEditingContext editingContext, Long etuIdBinding) {
		EOFetchSpecification fetchSpec = EOFetchSpecification
				.fetchSpecificationNamed("etuMineurs", _EOEtuMineur.ENTITY_NAME);
		NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
		bindings.takeValueForKey(etuIdBinding, "etuId");
		fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
		return (NSArray<gestionuv.utt.fr.eo.EOEtuMineur>) editingContext
				.objectsWithFetchSpecification(fetchSpec);
	}

}
