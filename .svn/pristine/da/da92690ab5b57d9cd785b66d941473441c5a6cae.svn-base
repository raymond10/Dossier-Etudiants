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
package etudiants.utt.fr.eo;

import org.apache.log4j.Logger;
import com.webobjects.foundation.NSTimestamp;
import com.webobjects.foundation.NSValidation;

import er.extensions.eof.ERXKey;
import etudiants.utt.fr.server.exception.ProfilImpressionException;

public class EOProfilImpression extends _EOProfilImpression {
	/**
	 * 
	 */
	private static final long serialVersionUID = 92436900464125163L;
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(EOProfilImpression.class);
	private Number pimpIdProc;
	// Attributs non visibles
	public static final ERXKey<Integer> PIMPID = new ERXKey<Integer>("PIMPID");
	public static final String PIMPID_KEY = PIMPID.key();
	
	public EOProfilImpression() {
		// TODO Auto-generated constructor stub
		super();
		pimpIdProc = null;
	}
	
	
    /**
	 * @return the pimpIdProc
	 */
	public Number getPimpIdProc() {
		return pimpIdProc;
	}

	/**
	 * @param pimpIdProc the pimpIdProc to set
	 */
	public void setPimpIdProc(Number pimpIdProc) {
		this.pimpIdProc = pimpIdProc;
	}

	public void validateForInsert() throws NSValidation.ValidationException {
        this.validateObjectMetier();
        validateBeforeTransactionSave();
        super.validateForInsert();
    }

    public void validateForUpdate() throws NSValidation.ValidationException {
        this.validateObjectMetier();
        validateBeforeTransactionSave();
        super.validateForUpdate();
    }

    public void validateForDelete() throws NSValidation.ValidationException {
        super.validateForDelete();
    }

    /**
     * Apparemment cette methode n'est pas appelee.
     * @see com.webobjects.eocontrol.EOValidation#validateForUpdate()
     */    
    public void validateForSave() throws NSValidation.ValidationException {
        validateObjectMetier();
        validateBeforeTransactionSave();
        super.validateForSave();
    }
    
    /**
     * Peut etre appele e partir des factories.
     * @throws CommandeImpressionException
     */
    public void validateObjectMetier() throws NSValidation.ValidationException {
    	if (PIMPDATE()==null)
    		setPIMPDATE(new NSTimestamp());
    	if (utilisateur()==null)
            throw new ProfilImpressionException(ProfilImpressionException.utilisateurManquant);
    	if (etudiantID()==null)
            throw new ProfilImpressionException(ProfilImpressionException.etudiantManquant);
    }
    
    /**
     * A appeler par les validateforsave, forinsert, forupdate.
     *
     */
    private final void validateBeforeTransactionSave() throws NSValidation.ValidationException {
    }
}
