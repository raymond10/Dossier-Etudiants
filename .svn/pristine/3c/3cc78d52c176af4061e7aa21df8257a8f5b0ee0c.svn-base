/**
 * 
 */
package etudiants.utt.fr.server.process;

import org.login.fwkloginwebapp.server.database._LoginBasicDataBus;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;

import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.server.exception.FactoryException;
import etudiants.utt.fr.server.procedures.ProcedureProfilEtudiants;
import etudiants.utt.fr.sql.ProfilEtudiantsSQL;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ProcessGestionEtudiant extends Process {

	public static ProfilEtudiantsSQL sql = new ProfilEtudiantsSQL();

	public ProcessGestionEtudiant() {
		// TODO Auto-generated constructor stub
	}

	public static void selectEtudiants(_LoginBasicDataBus databus,
			EOIndividu etudiant) {
		if (etudiant == null) {
			throw new FactoryException(
					"il faut passer un etudiant en parametre");
		}
		try {
			// on lance le select
			if (_LoginBasicDataBus.adaptorContext().hasOpenTransaction()) {
				System.out
						.println("Methode ProcessEtudiant.selectEtudiants : hasOpenTransaction() --> rollbackTransaction()");
				_LoginBasicDataBus.adaptorContext().rollbackTransaction();
			}
			databus.beginTransaction();

			boolean pbProcedure = false;
			NSDictionary dico = null;

			pbProcedure = ProcedureProfilEtudiants.getEtudiant(databus,
					etudiant);
			dico = new NSDictionary(databus.executedProcResult());
			if (!pbProcedure) {
				throw new FactoryException(
						(String) dico.valueForKey(_LoginBasicDataBus.ERROR_KEY));
			}
			etudiant.setDataIndividu((NSDictionary) dico
					.valueForKey("020_returnValue"));
		} catch (Exception e) {
			databus.rollbackTransaction();
			throw new FactoryException(e.getLocalizedMessage());
		}
	}

	public static NSArray selectRawRowEtudiants(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray result = null;
		try {
			ed.lock();
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
					sql.functionEtudiant(bindings), null);
		} finally {
			ed.unlock();
		}
		return result;
	}

}
