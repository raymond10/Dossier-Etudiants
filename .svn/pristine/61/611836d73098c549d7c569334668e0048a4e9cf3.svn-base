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
public class ProcedureProfilEtudiants extends Procedure {
	
	private static final String PROCEDURE_NAME ="ProfilEtudiant";
	
	public ProcedureProfilEtudiants() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean getEtudiant(_LoginBasicDataBus dataBus, EOIndividu etudiant) throws NSValidation.ValidationException{
		return dataBus.executeProcedure(ProcedureProfilEtudiants.PROCEDURE_NAME, 
				ProcedureProfilEtudiants.construireDictionnaire(etudiant));
	}
	
	private static NSDictionary construireDictionnaire(EOIndividu etudiant) {
		NSMutableDictionary dico=new NSMutableDictionary();
		dico.takeValueForKey(Integer.valueOf(etudiant.primaryKey()), "010_etuId");
		dico.takeValueForKey(new NSMutableDictionary(), "020_returnValue");
		return dico;
	}

}