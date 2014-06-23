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
package etudiants.utt.fr.components;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOResponse;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSLog;

import etudiants.utt.fr.server.MyAjaxComponent;
import etudiants.utt.fr.server.ProfilHelpers;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

public class Erreur extends MyAjaxComponent {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8334873619569197070L;
	@SuppressWarnings("rawtypes")
	private NSDictionary exceptionInfos;

	public Erreur(WOContext context) {
        super(context);
        NSLog.out.appendln("Erreur");
    }	
	
	@Override
	public void appendToResponse(WOResponse response, WOContext context) {
		super.appendToResponse(response, context);
		ProfilHelpers.insertStylesSheet(context, response);
		addScriptResource(response, "jscript/wz_tooltip.js", null, "FwkLoginWebApp.framework", 
		                            RESOURCE_TYPE_JSCRIPT, RESOURCE_DEST_END_BODY, RESOURCE_FROM_WEB_SERVER_RESOURCES);
	}
	
	public WOComponent retourAccueil() {
		Main accueil = (Main) mySession().getSavedPageWithName(Main.class.getName());
		mySession().reset();
		//accueil.setOnload(null);
		return accueil;
	}

	/**
	 * @return the exceptionInfos
	 */
	@SuppressWarnings("rawtypes")
	public NSDictionary exceptionInfos() {
		this.exceptionInfos = (NSDictionary) mySession().exceptionInfos();
		return this.exceptionInfos;
	}

	/**
	 * @param exceptionInfos the exceptionInfos to set
	 */
	@SuppressWarnings("rawtypes")
	public void setExceptionInfos(NSDictionary exceptionInfos) {
		this.exceptionInfos = exceptionInfos;
	}
}
