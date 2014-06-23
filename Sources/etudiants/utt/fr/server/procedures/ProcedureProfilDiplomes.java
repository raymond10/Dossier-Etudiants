/**
 * 
 */
package etudiants.utt.fr.server.procedures;

import org.login.fwkloginwebapp.server.database._LoginBasicDataBus;

import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation.NSValidation;
import etudiants.utt.fr.eo.EOIndividu;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("rawtypes")
public class ProcedureProfilDiplomes extends Procedure {
	
	private static final String PROCEDURE_NAME ="ProfilDiplome";
	
	public ProcedureProfilDiplomes() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean getDiplome(_LoginBasicDataBus dataBus, EOIndividu etudiant) throws NSValidation.ValidationException{
		return dataBus.executeProcedure(ProcedureProfilDiplomes.PROCEDURE_NAME, 
				ProcedureProfilDiplomes.construireDictionnaire(etudiant));
	}
	
	private static NSDictionary construireDictionnaire(EOIndividu etudiant) {
		NSMutableDictionary dico=new NSMutableDictionary();
		dico.takeValueForKey(etudiant.primaryKey(), "010_etuId");
		return dico;
	}

}
