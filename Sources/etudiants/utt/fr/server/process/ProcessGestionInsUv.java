/**
 * 
 */
package etudiants.utt.fr.server.process;

import org.login.fwkloginwebapp.server.database._LoginBasicDataBus;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;

import etudiants.utt.fr.server.exception.FactoryException;
import etudiants.utt.fr.server.procedures.ProcedureProfilInsUv;
import etudiants.utt.fr.sql.ProfilEtudiantsSQL;
import etudiants.utt.fr.sql.ResultatsUvSQL;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ProcessGestionInsUv extends Process {
	
	public static ProfilEtudiantsSQL sql = new ProfilEtudiantsSQL();
	public static ResultatsUvSQL sqli = new ResultatsUvSQL();
	
	public ProcessGestionInsUv() {
		// TODO Auto-generated constructor stub
	}
	
	public static void selectInsUv(_LoginBasicDataBus databus, Integer edtuId, String diplomeC){
		if(edtuId == null) {
			throw new FactoryException("il faut passer l'id d'un etudiant en parametre");
		}
		if(diplomeC == null) {
			throw new FactoryException("il faut passer l'id d'un diplome en parametre");
		}
		try {
			// on lance le select
			if (_LoginBasicDataBus.adaptorContext().hasOpenTransaction()) {
				System.out.println("Methode ProcessInsUv.selectInsUv : hasOpenTransaction() --> rollbackTransaction()");
				_LoginBasicDataBus.adaptorContext().rollbackTransaction();
			}
			databus.beginTransaction();

			boolean pbProcedure = false;
			NSDictionary dico = null;
			
			pbProcedure = ProcedureProfilInsUv.getInsUv(databus, edtuId, diplomeC);
			dico = new NSDictionary(databus.executedProcResult());
			if (!pbProcedure) {
				throw new FactoryException((String) dico.valueForKey(_LoginBasicDataBus.ERROR_KEY));
			}
		}catch (Exception e) {
			databus.rollbackTransaction();
			throw new FactoryException(e.getMessage());
		}
	}
	
	//Profil etudiant
	public static NSArray selectRawRowUV(EOEditingContext ed, NSDictionary bindings){
		NSArray result = null;
		try {
			ed.lock();
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				sql.functionInsUv(bindings), null);	
		} finally {
			ed.unlock();
		}
		return result;
	}
	
	//Resultats UV
	public static NSArray selectRawRowInsUV(EOEditingContext ed, NSDictionary bindings){
		NSArray result = null;
		try {
			ed.lock();
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				sqli.selectInsUv(bindings), null);	
		} finally {
			ed.unlock();
		}
		return result;
	}

}
