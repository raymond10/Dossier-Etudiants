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
import etudiants.utt.fr.server.procedures.ProcedureProfilDiplomes;
import etudiants.utt.fr.sql.ProfilEtudiantsSQL;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class ProcessGestionDiplome extends Process {

	public static ProfilEtudiantsSQL sql = new ProfilEtudiantsSQL();

	public ProcessGestionDiplome() {
		// TODO Auto-generated constructor stub
	}

	public static void selectDiplomes(_LoginBasicDataBus databus,
			EOIndividu etudiant) {
		if (etudiant == null) {
			throw new FactoryException(
					"il faut passer un etudiant en parametre");
		}
		try {
			// on lance le select
			if (_LoginBasicDataBus.adaptorContext().hasOpenTransaction()) {
				System.out
						.println("Methode ProcessDiplome.selectDiplomes : hasOpenTransaction() --> rollbackTransaction()");
				_LoginBasicDataBus.adaptorContext().rollbackTransaction();
			}
			databus.beginTransaction();

			boolean pbProcedure = false;
			NSDictionary dico = null;

			pbProcedure = ProcedureProfilDiplomes.getDiplome(databus, etudiant);
			dico = new NSDictionary(databus.executedProcResult());
			if (!pbProcedure) {
				throw new FactoryException(
						(String) dico.valueForKey(_LoginBasicDataBus.ERROR_KEY));
			}
			etudiant.setDataEtudiant(dico);
		} catch (Exception e) {
			databus.rollbackTransaction();
			throw new FactoryException(e.getMessage());
		}
	}

	public static NSArray selectRawRowDiplome(EOEditingContext ed,
			NSDictionary bindings) {
		NSArray result = null;
		try {
			ed.lock();
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
					sql.functionDiplome(bindings), null);
		} finally {
			ed.unlock();
		}
		return result;
	}

}
