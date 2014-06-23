/**
 * 
 */
package etudiants.utt.fr.server.procedures;

import org.login.fwkloginwebapp.server.database._LoginBasicDataBus;

import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation.NSValidation;

import etudiants.utt.fr.eo.EODiplome;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("rawtypes")
public class ProcedureProfilCetegorie extends Procedure {
	
	private static final String PROCEDURE_NAME = "ProfilCategorie";
	
	public ProcedureProfilCetegorie() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean getCategorie(_LoginBasicDataBus dataBus, EODiplome diplome) throws NSValidation.ValidationException{
		return dataBus.executeProcedure(ProcedureProfilCetegorie.PROCEDURE_NAME, 
				ProcedureProfilCetegorie.construireDictionnaire(diplome));
	}
	
	private static NSDictionary construireDictionnaire(EODiplome diplome) {
		NSMutableDictionary dico=new NSMutableDictionary();
		dico.takeValueForKey(diplome.primaryKey(), "010_diplomeC");
		return dico;
	}

}
