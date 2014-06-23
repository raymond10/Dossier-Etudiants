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
import etudiants.utt.fr.server.procedures.ProcedureProfilParcours;
import etudiants.utt.fr.sql.ProfilEtudiantsSQL;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ProcessGestionParcours extends Process {
	
	public static ProfilEtudiantsSQL sql = new ProfilEtudiantsSQL();
	
	public ProcessGestionParcours() {
		// TODO Auto-generated constructor stub
	}
	
	public static void selectParcours(_LoginBasicDataBus databus, Integer edtuId, String diplomeC, String pdebut, String pfin){
		if(edtuId == null) {
			throw new FactoryException("il faut passer l'id d'un etudiant en parametre");
		}
		if(diplomeC == null) {
			throw new FactoryException("il faut passer l'id d'un diplome en parametre");
		}
		if(pdebut == null) {
			throw new FactoryException("il faut passer une periode de debut en parametre");
		}
		if(pfin == null) {
			throw new FactoryException("il faut passer une periode de fin en parametre");
		}
		try {
			// on lance le select
			if (_LoginBasicDataBus.adaptorContext().hasOpenTransaction()) {
				System.out.println("Methode ProcessParcours.selectParcours : hasOpenTransaction() --> rollbackTransaction()");
				_LoginBasicDataBus.adaptorContext().rollbackTransaction();
			}
			databus.beginTransaction();

			boolean pbProcedure = false;
			NSDictionary dico = null;
			
			pbProcedure = ProcedureProfilParcours.getParcours(databus, edtuId, diplomeC, pdebut, pfin);
			dico = new NSDictionary(databus.executedProcResult());
			if (!pbProcedure) {
				throw new FactoryException((String) dico.valueForKey(_LoginBasicDataBus.ERROR_KEY));
			}
		}catch (Exception e) {
			databus.rollbackTransaction();
			throw new FactoryException(e.getMessage());
		}
	}
	
	public static NSArray selectRawRowParcours(EOEditingContext ed, NSDictionary bindings){
		NSArray result = null;
		try {
			ed.lock();
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				sql.functionParcours(bindings), null);	
		} finally {
			ed.unlock();
		}
		return result;	
	}
}
