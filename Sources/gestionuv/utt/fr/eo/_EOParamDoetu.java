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
// DO NOT EDIT.  Make changes to EOParamDoetu.java instead.
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
public abstract class _EOParamDoetu extends ERXGenericRecord {
	public static final String ENTITY_NAME = "EOParamDoetu";

	// Attribute Keys
	public static final ERXKey<String> ANNONCE = new ERXKey<String>("annonce");
	public static final ERXKey<String> PCBF = new ERXKey<String>("pcbf");
	public static final ERXKey<String> VISIBLEF = new ERXKey<String>("visiblef");
	// Relationship Keys

	// Attributes
	public static final String ANNONCE_KEY = ANNONCE.key();
	public static final String PCBF_KEY = PCBF.key();
	public static final String VISIBLEF_KEY = VISIBLEF.key();
	// Relationships

	private static Logger LOG = Logger.getLogger(_EOParamDoetu.class);

	public EOParamDoetu localInstanceIn(EOEditingContext editingContext) {
		EOParamDoetu localInstance = (EOParamDoetu) EOUtilities
				.localInstanceOfObject(editingContext, this);
		if (localInstance == null) {
			throw new IllegalStateException("You attempted to localInstance "
					+ this + ", which has not yet committed.");
		}
		return localInstance;
	}

	public String annonce() {
		return (String) storedValueForKey(_EOParamDoetu.ANNONCE_KEY);
	}

	public void setAnnonce(String value) {
		if (_EOParamDoetu.LOG.isDebugEnabled()) {
			_EOParamDoetu.LOG.debug("updating annonce from " + annonce()
					+ " to " + value);
		}
		takeStoredValueForKey(value, _EOParamDoetu.ANNONCE_KEY);
	}

	public String pcbf() {
		return (String) storedValueForKey(_EOParamDoetu.PCBF_KEY);
	}

	public void setPcbf(String value) {
		if (_EOParamDoetu.LOG.isDebugEnabled()) {
			_EOParamDoetu.LOG.debug("updating pcbf from " + pcbf() + " to "
					+ value);
		}
		takeStoredValueForKey(value, _EOParamDoetu.PCBF_KEY);
	}

	public String visiblef() {
		return (String) storedValueForKey(_EOParamDoetu.VISIBLEF_KEY);
	}

	public void setVisiblef(String value) {
		if (_EOParamDoetu.LOG.isDebugEnabled()) {
			_EOParamDoetu.LOG.debug("updating visiblef from " + visiblef()
					+ " to " + value);
		}
		takeStoredValueForKey(value, _EOParamDoetu.VISIBLEF_KEY);
	}

	public static EOParamDoetu createEOParamDoetu(
			EOEditingContext editingContext, String annonce, String pcbf,
			String visiblef) {
		EOParamDoetu eo = (EOParamDoetu) EOUtilities.createAndInsertInstance(
				editingContext, _EOParamDoetu.ENTITY_NAME);
		eo.setAnnonce(annonce);
		eo.setPcbf(pcbf);
		eo.setVisiblef(visiblef);
		return eo;
	}

	public static ERXFetchSpecification<EOParamDoetu> fetchSpec() {
		return new ERXFetchSpecification<EOParamDoetu>(
				_EOParamDoetu.ENTITY_NAME, null, null, false, true, null);
	}

	public static NSArray<EOParamDoetu> fetchAllEOParamDoetus(
			EOEditingContext editingContext) {
		return _EOParamDoetu.fetchAllEOParamDoetus(editingContext, null);
	}

	public static NSArray<EOParamDoetu> fetchAllEOParamDoetus(
			EOEditingContext editingContext,
			NSArray<EOSortOrdering> sortOrderings) {
		return _EOParamDoetu.fetchEOParamDoetus(editingContext, null,
				sortOrderings);
	}

	public static NSArray<EOParamDoetu> fetchEOParamDoetus(
			EOEditingContext editingContext, EOQualifier qualifier,
			NSArray<EOSortOrdering> sortOrderings) {
		ERXFetchSpecification<EOParamDoetu> fetchSpec = new ERXFetchSpecification<EOParamDoetu>(
				_EOParamDoetu.ENTITY_NAME, qualifier, sortOrderings);
		fetchSpec.setIsDeep(true);
		NSArray<EOParamDoetu> eoObjects = null;
		try {
			editingContext.lock();
			eoObjects = fetchSpec.fetchObjects(editingContext);
		} finally {
			editingContext.unlock();
		}
		return eoObjects;
	}

	public static EOParamDoetu fetchEOParamDoetu(
			EOEditingContext editingContext, String keyName, Object value) {
		return _EOParamDoetu.fetchEOParamDoetu(editingContext,
				new EOKeyValueQualifier(keyName,
						EOQualifier.QualifierOperatorEqual, value));
	}

	public static EOParamDoetu fetchEOParamDoetu(
			EOEditingContext editingContext, EOQualifier qualifier) {
		NSArray<EOParamDoetu> eoObjects = _EOParamDoetu.fetchEOParamDoetus(
				editingContext, qualifier, null);
		EOParamDoetu eoObject;
		int count = eoObjects.count();
		if (count == 0) {
			eoObject = null;
		} else if (count == 1) {
			eoObject = eoObjects.objectAtIndex(0);
		} else {
			throw new IllegalStateException(
					"There was more than one EOParamDoetu that matched the qualifier '"
							+ qualifier + "'.");
		}
		return eoObject;
	}

	public static EOParamDoetu fetchRequiredEOParamDoetu(
			EOEditingContext editingContext, String keyName, Object value) {
		return _EOParamDoetu.fetchRequiredEOParamDoetu(editingContext,
				new EOKeyValueQualifier(keyName,
						EOQualifier.QualifierOperatorEqual, value));
	}

	public static EOParamDoetu fetchRequiredEOParamDoetu(
			EOEditingContext editingContext, EOQualifier qualifier) {
		EOParamDoetu eoObject = _EOParamDoetu.fetchEOParamDoetu(editingContext,
				qualifier);
		if (eoObject == null) {
			throw new NoSuchElementException(
					"There was no EOParamDoetu that matched the qualifier '"
							+ qualifier + "'.");
		}
		return eoObject;
	}

	public static EOParamDoetu localInstanceIn(EOEditingContext editingContext,
			EOParamDoetu eo) {
		EOParamDoetu localInstance = (eo == null) ? null
				: ERXEOControlUtilities.localInstanceOfObject(editingContext,
						eo);
		if (localInstance == null && eo != null) {
			throw new IllegalStateException("You attempted to localInstance "
					+ eo + ", which has not yet committed.");
		}
		return localInstance;
	}
}
