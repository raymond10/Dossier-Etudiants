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
package etudiants.utt.fr.server;

import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOResponse;

import er.ajax.UttAjaxUtils;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

public class ProfilHelpers {
	
	/**
    * Rajoute les styles css aux r�ponses.
    * @param context le contexte
    * @param response la r�ponse
    */
   public static void insertStylesSheet(WOContext context, WOResponse response) {
	   UttAjaxUtils.addScriptResourceInHead(context, response, "prototype.js");
        UttAjaxUtils.addStylesheetResourceInHead(context, response, "FwkUttThemes.framework", "themes/alert.css");
 	   UttAjaxUtils.addStylesheetResourceInHead(context, response, "FwkUttThemes.framework", "themes/default.css");
        UttAjaxUtils.addStylesheetResourceInHead(context, response, "FwkUttThemes.framework", "themes/lighting.css");
		UttAjaxUtils.addStylesheetResourceInHead(context, response, "FwkUttThemes.framework", "themes/mac_os_x.css");
		UttAjaxUtils.addStylesheetResourceInHead(context, response, "FwkUttThemes.framework", "css/UttCommon.css");
		UttAjaxUtils.addStylesheetResourceInHead(context, response, "Ajax", "default_ajaxupload.css");
		UttAjaxUtils.addScriptResourceInHead(context, response, "app", "scripts/cedre.js");
		UttAjaxUtils.addScriptResourceInHead(context, response, "app", "scripts/etudiant.js");
		UttAjaxUtils.addStylesheetResourceInHead(context, response, "app", "scripts/form.js");
	    UttAjaxUtils.addStylesheetResourceInHead(context, response, "app", "scripts/scriptaculous.js");
		UttAjaxUtils.addStylesheetResourceInHead(context, response, "app", "css/edt.css");
		UttAjaxUtils.addStylesheetResourceInHead(context, response, "app", "css/tip.css");
		UttAjaxUtils.addStylesheetResourceInHead(context, response, "app", "tinymce/skins/lightgray/skin.min.css");
		UttAjaxUtils.addStylesheetResourceInHead(context, response, "app", "css/etudiant.css");
   }

   /**
    * @param obj1 
    * @param obj2
    * @return true si obj1 et obj2 sont non nulls et �gaux (au sens Object.equals())
    */
   public static boolean nullSafeEquals(Object obj1, Object obj2) {
       return obj1 != null && obj2 != null && obj1.equals(obj2);
   }

}
