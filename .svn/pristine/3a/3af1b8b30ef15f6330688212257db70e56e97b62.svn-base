/**
 * 
 */
package etudiants.utt.fr.server.process;

import org.login.fwkloginwebapp.server.database._LoginBasicDataBus;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;

import etudiants.utt.fr.server.exception.FactoryException;
import etudiants.utt.fr.server.procedures.ProcedureRechercheEtudiants;
import etudiants.utt.fr.sql.RechercheSQL;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class ProcessGestionRechercheEtudiants extends Process {
	
	public static RechercheSQL sql;

	public ProcessGestionRechercheEtudiants() {
		// TODO Auto-generated constructor stub
		sql = new RechercheSQL();
	}

	public static NSDictionary rechercherEtudiants(_LoginBasicDataBus databus,
			NSMutableDictionary bindings) {
		boolean pbProcedure = false;
		NSDictionary dico = null;
		// on lance la recherche
		pbProcedure = ProcedureRechercheEtudiants.rechercher(databus, bindings);
		dico = new NSDictionary(databus.executedProcResult());
		if (!pbProcedure) {
			throw new FactoryException(
					(String) dico.valueForKey(_LoginBasicDataBus.ERROR_KEY));
		}
		return dico;
	}
	
	public static NSArray selectRawRowPeriodeCourante(EOEditingContext ed){
		return EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sql.periodeCourante(), null);	
	}
	
	public static NSArray selectRawRowrequetePersId(EOEditingContext ed, Integer indivId){
		return EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sql.requetePersId(indivId), null);	
	}
	
	public static NSArray selectRawRowfunctionHasPermission(EOEditingContext ed, Integer PersId){
		return EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sql.functionHasPermission(PersId), null);	
	}

}
