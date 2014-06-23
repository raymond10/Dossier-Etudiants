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
public class ProcedureProfilParcours extends Procedure {
	
	private static final String PROCEDURE_NAME ="ProfilParcours";
	
	public ProcedureProfilParcours() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean getParcours(_LoginBasicDataBus dataBus, Integer edtuId, String diplomeC, String pdebut, String pfin) throws NSValidation.ValidationException{
		return dataBus.executeProcedure(ProcedureProfilParcours.PROCEDURE_NAME, 
				ProcedureProfilParcours.construireDictionnaire(edtuId, diplomeC,pdebut,pfin));
	}
	
	private static NSDictionary construireDictionnaire(Integer edtuId, String diplomeC,String pdebut, String pfin) {
		NSMutableDictionary dico=new NSMutableDictionary();
		dico.takeValueForKey(edtuId, "010_etuId");
		dico.takeValueForKey(diplomeC, "020_pdiplome");
		dico.takeValueForKey(pdebut, "030_pdebut");
		dico.takeValueForKey(pfin, "040_pfin");
		return dico;
	}

}
