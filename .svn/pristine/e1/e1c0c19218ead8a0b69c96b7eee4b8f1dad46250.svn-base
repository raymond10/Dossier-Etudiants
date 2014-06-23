/**
 * 
 */
package etudiants.utt.fr.server.process;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;

import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.sql.EmploiDuTempSQL;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class ProcessGestionEdt extends Process {

	public static EmploiDuTempSQL sql;
	
	public ProcessGestionEdt() {
		// TODO Auto-generated constructor stub
		sql = new EmploiDuTempSQL();
	}
	
	public static NSArray selectRawRowEdtPubli(EOEditingContext ed){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sql.edtPubli(), null);	
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public static NSArray selectRawRowFunctionEdt(EOEditingContext ed, NSDictionary bindings){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sql.functionEdt(bindings), null);	
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public static NSArray selectRawRowFunctionEdtUV(EOEditingContext ed, NSDictionary bindings){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sql.functionEdtUV(bindings), null);	
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public static NSArray selectRawRowFunctionEdtETU(EOEditingContext ed, NSDictionary bindings){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sql.functionEdtETU(bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

}
