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

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableDictionary;

import etudiants.utt.fr.components.controlers.EmploiDuTempsCtrl;
import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.server.MyAjaxComponent;
import etudiants.utt.fr.server.ProfilHelpers;
import etudiants.utt.fr.util.EdtUtilitaires;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

@SuppressWarnings("all")
public class EmploiDuTemps extends MyAjaxComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8327991648693364521L;
	private String onLoad = null;
	private EmploiDuTempsCtrl edtCtrl;
	private NSMutableDictionary dicEtudiant;
	private NSArray listUv;
	private NSMutableDictionary dicUv;
	private EdtUtilitaires edtUtil;

	public EmploiDuTemps(WOContext context) {
		super(context);
		NSLog.out.appendln("Emploi du temps");
		edtCtrl().edtUvSelection();
		edtUtil().lesCouleurs(getListUv());
		edtCtrl().horaires();
		edtCtrl().edtIdSelection();
	}
	
	/**
	 * @return the edtUtil
	 */
	public EdtUtilitaires edtUtil() {
		if(edtUtil == null)
			edtUtil = new EdtUtilitaires();
		return edtUtil;
	}

	/**
	 * @param edtUtil the edtUtil to set
	 */
	public void setEdtUtil(EdtUtilitaires edtUtil) {
		this.edtUtil = edtUtil;
	}

	/**
	 * @return the onLoad
	 */
	public String getOnLoad() {
		return onLoad;
	}

	/**
	 * @param onLoad the onLoad to set
	 */
	public void setOnLoad(String onLoad) {
		this.onLoad = onLoad;
	}

	public void appendToResponse(WOResponse res, WOContext ctx) {
		super.appendToResponse(res, ctx);
		if (onLoad != null)
			onLoad = null;
		ProfilHelpers.insertStylesSheet(ctx, res);
		 String message = mySession().getAlertMessage();
			if (message != null && message.equals("") == false) {
				String str = "<script language=\"javascript\" type=\"text/javascript\">\n";
				str += "alert(\"" + message + "\");\n";
				str += "</script>";
				res.appendContentString(str);
				mySession().setAlertMessage(null);
			}
	}

	/**
	 * @return the edtCtrl
	 */
	public EmploiDuTempsCtrl edtCtrl() {
		if(edtCtrl == null)
			edtCtrl = new EmploiDuTempsCtrl(this);
		return edtCtrl;
	}

	/**
	 * @param edtCtrl the edtCtrl to set
	 */
	public void setEdtCtrl(EmploiDuTempsCtrl edtCtrl) {
		this.edtCtrl = edtCtrl;
	}

	/**
	 * @return the dicEtudiant
	 */
	public NSMutableDictionary getDicEtudiant() {
		return dicEtudiant;
	}

	/**
	 * @param dicEtudiant the dicEtudiant to set
	 */
	public void setDicEtudiant(NSMutableDictionary dicEtudiant) {
		this.dicEtudiant = dicEtudiant;
	}

	/**
	 * @return the listUv
	 */
	public NSArray getListUv() {
		return listUv;
	}

	/**
	 * @param listUv the listUv to set
	 */
	public void setListUv(NSArray listUv) {
		this.listUv = listUv;
	}

	/**
	 * @return the dicUv
	 */
	public NSMutableDictionary getDicUv() {
		return dicUv;
	}

	/**
	 * @param dicUv the dicUv to set
	 */
	public void setDicUv(NSMutableDictionary dicUv) {
		this.dicUv = dicUv;
	}
	
	public boolean browser() {
		if(mySession().browser().isIPad()
				|| mySession().browser().isIPhone()
				|| mySession().browser().isUnknownPlatform()
				|| mySession().browser().isLinux())
			NSLog.out.appendln("Plateforme : " + mySession().browser().platform());
		return mySession().browser().isIPad()
				|| mySession().browser().isIPhone()
				|| mySession().browser().isUnknownPlatform()
				|| mySession().browser().isLinux();
	}
}
