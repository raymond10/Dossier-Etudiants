/**
 * 
 */
package etudiants.utt.fr.server.process;

import org.login.fwkloginwebapp.server.database._LoginBasicDataBus;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;

import etudiants.utt.fr.eo.EODiplome;
import etudiants.utt.fr.server.exception.FactoryException;
import etudiants.utt.fr.server.procedures.ProcedureProfilCetegorie;
import etudiants.utt.fr.sql.ProfilEtudiantsSQL;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ProcessGestionCategorie extends Process {
	
	public static ProfilEtudiantsSQL sql = new ProfilEtudiantsSQL();
	
	public ProcessGestionCategorie() {
		// TODO Auto-generated constructor stub
	}
	
	public static void selectCategorie(_LoginBasicDataBus databus, EODiplome diplome){
		
		if(diplome == null) {
			throw new FactoryException("il faut passer un diplome en parametre");
		}
		try {
			// on lance le select
			if (_LoginBasicDataBus.adaptorContext().hasOpenTransaction()) {
				System.out.println("Methode ProcessCategorie.selectCategorie : hasOpenTransaction() --> rollbackTransaction()");
				_LoginBasicDataBus.adaptorContext().rollbackTransaction();
			}
			databus.beginTransaction();

			boolean pbProcedure = false;
			NSDictionary dico = null;
			
			pbProcedure = ProcedureProfilCetegorie.getCategorie(databus, diplome);
			dico = new NSDictionary(databus.executedProcResult());
			if (!pbProcedure) {
				throw new FactoryException((String) dico.valueForKey(_LoginBasicDataBus.ERROR_KEY));
			}
			diplome.setDataDiplome(dico);
		}catch (Exception e) {
			databus.rollbackTransaction();
			throw new FactoryException(e.getMessage());
		}
	}
	
	public static NSArray selectRawCategorie(EOEditingContext ed, NSDictionary bindings){
		NSArray result = null;
		try {
			ed.lock();
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				sql.functionCategorie(bindings), null);	
		} finally {
			ed.unlock();
		}
		return result;
	}

}
