/**
 * 
 */
package etudiants.utt.fr.server.process;

import org.login.fwkloginwebapp.server.database._LoginBasicDataBus;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;

import etudiants.utt.fr.server.exception.FactoryException;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class ProcessRechercheEtudiants extends Process {

	public ProcessRechercheEtudiants() {
		// TODO Auto-generated constructor stub
	}

	public static NSMutableDictionary rechercher(_LoginBasicDataBus databus,NSMutableDictionary bindings) {
		NSMutableDictionary curseur = new NSMutableDictionary ();
		if (bindings.count() == 0) {
			throw new FactoryException(
					"Merci de dŽterminer les paramtres de la recherche");
		}
		// on lance la recherche
		try {
			if (_LoginBasicDataBus.adaptorContext().hasOpenTransaction()) {
				System.out
						.println("Methode ProcessRechercheEtudiants.rechercher : hasOpenTransaction() --> rollbackTransaction()");
				_LoginBasicDataBus.adaptorContext().rollbackTransaction();
			}
			databus.beginTransaction();
			curseur.setDictionary(ProcessGestionRechercheEtudiants.rechercherEtudiants(databus,bindings));
			databus.commitTransaction();
		} catch (FactoryException e) {
			databus.rollbackTransaction();
			System.out.println("FactoryException : " + e);
			throw e;
		} catch (Exception e) {
			databus.rollbackTransaction();
			System.out.println("Exception : " + e);
			throw new FactoryException(e.getMessage());
		}
		return curseur;
	}

}
