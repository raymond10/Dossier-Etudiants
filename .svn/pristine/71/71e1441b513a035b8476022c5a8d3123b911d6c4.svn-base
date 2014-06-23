/**
 * 
 */
package etudiants.utt.fr.components.controlers;

import com.webobjects.eocontrol.EOEditingContext;

import etudiants.utt.fr.server.MyAjaxComponent;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

public class ModuleCtrl<T extends MyAjaxComponent> {

	public T wocomponent;
	public EOEditingContext edc;

	public ModuleCtrl(T component) {
		this.wocomponent = component;
	}

	public EOEditingContext editingContext() {
	    return wocomponent.edc();
	}
	
	public T wocomponent() {
	    return wocomponent;
	}

}
