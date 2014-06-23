/**
 * 
 */
package etudiants.utt.fr.server.procedures;

import org.login.fwkloginwebapp.server.database._LoginBasicDataBus;

import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation.NSValidation;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("rawtypes")
public class ProcedureProfilInsUv extends Procedure {
	
	private static final String PROCEDURE_NAME ="ProfilInsUv";
	
	public ProcedureProfilInsUv() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean getInsUv(_LoginBasicDataBus dataBus, Integer edtuId, String diplomeC) throws NSValidation.ValidationException{
		return dataBus.executeProcedure(ProcedureProfilInsUv.PROCEDURE_NAME, 
				ProcedureProfilInsUv.construireDictionnaire(edtuId, diplomeC));
	}
	
	private static NSDictionary construireDictionnaire(Integer edtuId, String diplomeC) {
		NSMutableDictionary dico=new NSMutableDictionary();
		dico.takeValueForKey(edtuId, "010_etuId");
		dico.takeValueForKey(diplomeC, "020_pdiplome");
		return dico;
	}

}
