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
import com.webobjects.appserver.WOResponse;

import etudiants.utt.fr.components.controlers.AnnoncesCtrl;
import etudiants.utt.fr.server.MyAjaxComponent;
import etudiants.utt.fr.server.ProfilHelpers;
import gestionuv.utt.fr.eo.EOParamDoetu;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSLog;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

public class Annonces extends MyAjaxComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6507795251582270594L;
	private String onLoad = null;
	EOEditingContext ed = edc();
	private NSArray<EOParamDoetu> listAnnoncePcb;
	private EOParamDoetu annoncePcb;
	public boolean check1 = false, check2 = false, check3, check4;
	private AnnoncesCtrl annoCtrl;

	public Annonces(WOContext context) {
		super(context);
		NSLog.out.appendln("Annonces");
		annoCtrl = new AnnoncesCtrl(this);
		funcAnoncePcb();
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
	 * @return the listAnnoncePcb
	 */
	public NSArray<EOParamDoetu> getListAnnoncePcb() {
		return listAnnoncePcb;
	}

	/**
	 * @param listAnnoncePcb
	 *            the listAnnoncePcb to set
	 */
	public void setListAnnoncePcb(NSArray<EOParamDoetu> listAnnoncePcb) {
		this.listAnnoncePcb = listAnnoncePcb;
	}

	/**
	 * @return the annoncePcb
	 */
	public EOParamDoetu getAnnoncePcb() {
		return annoncePcb;
	}

	/**
	 * @param annoncePcb
	 *            the annoncePcb to set
	 */
	public void setAnnoncePcb(EOParamDoetu annoncePcb) {
		this.annoncePcb = annoncePcb;
	}

	public void funcAnoncePcb() {
		listAnnoncePcb = EOParamDoetu.fetchAllEOParamDoetus(ed);
		annoncePcb = new EOParamDoetu();
		if (listAnnoncePcb != null && listAnnoncePcb.count() != 0) {
			annoncePcb = listAnnoncePcb.lastObject();
		}
		if (annoncePcb.annonce() != null && !annoncePcb.annonce().contains("null")) {
			annoCtrl.setMessage(annoncePcb.annonce());
			NSLog.out.appendln(annoncePcb.annonce());
		}
		testChecked();
	}

	protected void testChecked() {
		if (annoncePcb.visiblef().equals("O")) {
			check1 = true;
			check2 = false;
			annoCtrl.selectVisible1 = "O";
		}
		if (annoncePcb.visiblef().equals("N")) {
			check2 = true;
			check1 = false;
			annoCtrl.selectVisible2= "N";
		}
		if (annoncePcb.pcbf().equals("O")) {
			check3 = true;
			check4 = false;
			annoCtrl.selectPCB1 = "O";
		}
		if (annoncePcb.pcbf().equals("N")) {
			check4 = true;
			check3 = false;
			annoCtrl.selectPCB2= "N";
		}
	}

	/**
	 * @return the annoCtrl
	 */
	public AnnoncesCtrl getAnnoCtrl() {
		return annoCtrl;
	}

	/**
	 * @param annoCtrl the annoCtrl to set
	 */
	public void setAnnoCtrl(AnnoncesCtrl annoCtrl) {
		this.annoCtrl = annoCtrl;
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
