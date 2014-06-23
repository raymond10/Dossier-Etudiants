/**
 * 
 */
package etudiants.utt.fr.server.process;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;

import etudiants.utt.fr.sql.ResultatsUvSQL;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

@SuppressWarnings("all")
public class ProcessGestionModalites extends Process {
	
	public static ResultatsUvSQL sql = new ResultatsUvSQL();
	
	public ProcessGestionModalites() {
		// TODO Auto-generated constructor stub
	}
	
	//Modalites UV
		public static NSArray selectRawRowModalites(EOEditingContext ed, NSDictionary bindings){
			NSArray result = null;
			try {
				ed.lock();
				result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
					sql.selectUmodalites(bindings), null);
			} finally {
				ed.unlock();
			}
			return result;	
		}
		
	//Annee Univ en cours
		
		public static NSArray annee(EOEditingContext ed, NSDictionary bindings){
			NSArray result = null;
			try {
				ed.lock();
				result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
					sql.selectAnneeEnCours(bindings), null);
			} finally {
				ed.unlock();
			}
			return result;
		}
}
