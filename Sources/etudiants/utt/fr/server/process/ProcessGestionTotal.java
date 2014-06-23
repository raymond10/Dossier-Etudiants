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

import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.server.exception.FactoryException;
import etudiants.utt.fr.server.procedures.ProcedureProfilTotal;
import etudiants.utt.fr.sql.ProfilEtudiantsSQL;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ProcessGestionTotal extends Process {
	
	private static Session session = new Session();
	public static ProfilEtudiantsSQL sql = new ProfilEtudiantsSQL();
	
	public ProcessGestionTotal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the session
	 */
	public static Session getSession() {
		return session;
	}

	/**
	 * @param session the session to set
	 */
	public static void setSession(Session session) {
		ProcessGestionTotal.session = session;
	}

	public static void selectTotal(_LoginBasicDataBus databus, Integer edtuId, String diplomeC, String pspecialite, String pniveau){
		if(edtuId == null) {
			throw new FactoryException("il faut passer l'id d'un etudiant en parametre");
		}
		if(diplomeC == null) {
			throw new FactoryException("il faut passer l'id d'un diplome en parametre");
		}
		if(pspecialite == null) {
			throw new FactoryException("il faut passer une specialite en parametre");
		}
		if(pniveau == null) {
			throw new FactoryException("il faut passer un niveau en parametre");
		}
		try {
			// on lance le select
			if (_LoginBasicDataBus.adaptorContext().hasOpenTransaction()) {
				System.out.println("Methode ProcessTotal.selectTotal : hasOpenTransaction() --> rollbackTransaction()");
				_LoginBasicDataBus.adaptorContext().rollbackTransaction();
			}
			databus.beginTransaction();

			boolean pbProcedure = false;
			NSDictionary dico = null;
			
			pbProcedure = ProcedureProfilTotal.getTotal(databus, edtuId, diplomeC, pspecialite, pniveau);
			dico = new NSDictionary(databus.executedProcResult());
			if (!pbProcedure) {
				throw new FactoryException((String) dico.valueForKey(_LoginBasicDataBus.ERROR_KEY));
			}
			session.setTotalCursor((NSMutableDictionary) dico.valueForKey("10_returnValue"));
		}catch (Exception e) {
			databus.rollbackTransaction();
			throw new FactoryException(e.getMessage());
		}
	}
	
	public static NSArray selectRawRowTotal(EOEditingContext ed, NSDictionary bindings){
		NSArray result = null;
		try {
			ed.lock();
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
				sql.functionTotal(bindings), null);	
		} finally {
			ed.unlock();
		}
		return result;	
		}

}
