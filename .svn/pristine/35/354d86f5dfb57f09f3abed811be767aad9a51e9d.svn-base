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
public class ProcedureProfilTotaux extends Procedure {
	
	private final static String PROCEDURE_NAME="ProfilTotaux";
	
	public ProcedureProfilTotaux() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean getTotaux(_LoginBasicDataBus dataBus, Integer edtuId, String diplomeC, String prddebut) throws NSValidation.ValidationException{
		return dataBus.executeProcedure(ProcedureProfilTotaux.PROCEDURE_NAME, 
				ProcedureProfilTotaux.construireDictionnaire(edtuId, diplomeC,prddebut));
	}
	
	private static NSDictionary construireDictionnaire(Integer edtuId, String diplomeC, String prddebut) {
		NSMutableDictionary dico=new NSMutableDictionary();
		dico.takeValueForKey(null, "010_returnValue");
		dico.takeValueForKey(edtuId, "020_etuId");
		dico.takeValueForKey(diplomeC, "030_pdiplome");
		dico.takeValueForKey(prddebut, "040_prddebut");
		return dico;
	}

}
