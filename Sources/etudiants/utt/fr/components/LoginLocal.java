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

import org.login.fwkloginwebapp.server.components.LoginLoginResponder;

import com.webobjects.appserver.WOContext;

import etudiants.utt.fr.server.Application;
import etudiants.utt.fr.server.VersionMe;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

public class LoginLocal extends LoginCAS {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2451456228278004873L;

	/** Le gestionnaire des evenements de composant de login local. */
	private LoginLoginResponder loginResponder;

	public LoginLocal(WOContext context) {
		super(context);
	}
	
	/**
	 * @return the loginResponder
	 */
	public LoginLoginResponder getLoginResponder() {
		return loginResponder;
	}

	/**
	 * @param loginResponder
	 *            the loginResponder to set
	 */
	public void registerLoginResponder(LoginLoginResponder loginResponder) {
		this.loginResponder = loginResponder;
	}

	public String bdServerId() {
		return Application.bdServerId;
	}

	public String copyright() {
		return ((Application) application()).copyright();
		// return VersionMe.copyright();
	}

	public String version() {
		return VersionMe.htmlAppliVersion();
	}

	public String cssEtudiant() {
		return application().resourceManager().urlForResourceNamed(
				"css/etudiant.css", null, null, context().request());
	}

}
