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

import org.cedre.fwkuttajaxwebext.serveur.UttAjaxWOComponent;
import org.login.fwkloginwebapp.common.util.StringCtrl;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.appserver.WOResponse;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSPathUtilities;

import er.ajax.UttAjaxUtils;
import er.ajax.UttERXResponseRewriter;
import etudiants.utt.fr.server.Session;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

public abstract class AComponent extends UttAjaxWOComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 407805827530421310L;
	public final static String BINDING_utilisateurPersId = "utilisateurPersId";
	public static final String BINDING_editingContext = "editingContext";
	public static final String BINDING_updateContainerID = "updateContainerID";
	public static final String BINDING_isReadOnly = "isReadOnly";
	public static final String BINDING_isEditing = "isEditing";
	public final Session session = (Session) session();
	
	private String containerErreurMsgId;

	private String erreurSaisieMessage;

	private Boolean localIsEditing = Boolean.FALSE;

	public AComponent(WOContext context) {
		super(context);
	}

	@Override
	public void appendToResponse(WOResponse response, WOContext context) {
		super.appendToResponse(response, context);
		UttAjaxUtils.addScriptResourceInHead(context, response, null,
				"scripts/filterlist.js");
		UttAjaxUtils.addScriptResourceInHead(context, response, null,
				"scripts/dateformat.js");
		UttAjaxUtils.addScriptResourceInHead(context, response, null,
				"scripts/etudiant.js");
		UttAjaxUtils.addStylesheetResourceInHead(context, response,
				"FwkCktlThemes.framework", "css/CktlCommon.css");
		UttAjaxUtils.addStylesheetResourceInHead(context, response,
				"FwkCktlThemes.framework", "css/CktlCommonVert.css");
		UttAjaxUtils.addStylesheetResourceInHead(context, response, null,
				"themes/mac_os_x.css");
		UttAjaxUtils.addStylesheetResourceInHead(context, response, null,
				"css/etudiant.css");

		if (hasBinding(BINDING_cssFilename)) {
			String filename = (String) valueForBinding(BINDING_cssFilename);
			String fwkName = null;
			if (hasBinding(BINDING_cssFwkName)) {
				fwkName = (String) valueForBinding(BINDING_cssFwkName);
				if (!("app".equalsIgnoreCase(fwkName))) {
					fwkName = NSPathUtilities
							.stringByDeletingPathExtension(fwkName);
					fwkName = NSPathUtilities.stringByAppendingPathExtension(
							fwkName, "framework");
				}
			}
			UttERXResponseRewriter.addStylesheetResourceInHead(response,
					context, fwkName, filename);
		}
	}

	/**
	 * @return Le binding <i>editingContext</i> s'il est renseigne, sinon
	 *         l'editingContext de la session. Cette methode peut etre
	 *         surchargee pour renvoyer un nestedEditingContext.
	 */
	@Override
	public EOEditingContext edc() {
		if (hasBinding(BINDING_editingContext)) {
			return (EOEditingContext) valueForBinding(BINDING_editingContext);
		}
		return session.editingContext();
	}

	public Boolean isReadOnly() {
		if (!hasBinding(BINDING_isReadOnly)) {
			return Boolean.TRUE;
		}
		return (Boolean) valueForBinding(BINDING_isReadOnly);
	}

	public void setIsReadOnly(Boolean value) {
		setValueForBinding(value, BINDING_isReadOnly);
	}

	public Boolean isEditing() {
		if (isReadOnly().booleanValue()) {
			localIsEditing = Boolean.FALSE;
		} else {
			localIsEditing = booleanValueForBinding(BINDING_isEditing,
					localIsEditing);
		}
		return localIsEditing;
		// return (Boolean) valueForBinding(BINDING_isEditing);
	}

	public void setIsEditing(Boolean value) {
		localIsEditing = value;
		if (hasBinding(BINDING_isEditing)
				&& canSetValueForBinding(BINDING_isEditing)) {
			setValueForBinding(localIsEditing, BINDING_isEditing);
		}
	}

	/**
	 * @return la valeur du binding utilisateurPersId.
	 */
	public Integer getUtilisateurPersId() {
		if (valueForBinding(BINDING_utilisateurPersId) == null) {
			System.err
					.println("**** Le binding utilisateurPersId n'est pas renseigné pour le composant "
							+ name());
		}
		return (Integer) valueForBinding(BINDING_utilisateurPersId);
	}

	// /**
	// * @return l'ID = le binding ID. Si celui-ci n'est pas defini, on en
	// genere un unique.
	// */
	// public String getComponentId() {
	// if (componentId == null) {
	// if (hasBinding(BINDING_id)) {
	// componentId = (String) valueForBinding(BINDING_id);
	// }
	// else {
	// componentId = componentUniqueId;
	// }
	// }
	// return componentId;
	// }
	//
	// /**
	// * @return Un identifiant pour le container principal du composant, si ce
	// container existe.
	// */
	// public String getMainContainerId() {
	// if (mainContainerId == null) {
	// mainContainerId = getComponentId() + "_mainContainer";
	// }
	// return mainContainerId;
	// }
	//
	public String getContainerErreurMsgId() {
		if (containerErreurMsgId == null) {
			containerErreurMsgId = getComponentId() + "_containerErreurMsg";
		}
		return containerErreurMsgId;
	}

	public String getErreurSaisieMessage() {
		String tmp = erreurSaisieMessage;
		return tmp;
	}

	public void setErreurSaisieMessage(String erreurSaisieMessage) {
		this.erreurSaisieMessage = erreurSaisieMessage;
		if (!StringCtrl.isEmpty(erreurSaisieMessage)) {
			mySession().addSimpleErrorMessage("Erreur", erreurSaisieMessage);
		}
	}

	public WODisplayGroup getDgActif() {
		return session.dgActif();
	}

	public void setDgActif(WODisplayGroup dgActif) {
		session.setDgActif(dgActif);
	}

	public String getUpdateContainerID() {
		return (String) valueForBinding(BINDING_updateContainerID);
	}
	//
	// public Boolean booleanValueForBinding(String bindingName, Boolean
	// valueIfNull) {
	// if (hasBinding(bindingName)) {
	// return (Boolean) valueForBinding(bindingName);
	// }
	// return valueIfNull;
	// }
	//
	// public String stringValueForBinding(String bindingName, String
	// valueIfNull) {
	// if (hasBinding(bindingName)) {
	// return (String) valueForBinding(bindingName);
	// }
	// return valueIfNull;
	// }

}
