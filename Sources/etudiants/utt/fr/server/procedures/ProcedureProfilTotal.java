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
public class ProcedureProfilTotal extends Procedure {
	
	private final static String PROCEDURE_NAME="ProfilTotal";
	
	public ProcedureProfilTotal() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean getTotal(_LoginBasicDataBus dataBus, Integer edtuId, String diplomeC, String pspecialite, String pniveau) throws NSValidation.ValidationException{
		return dataBus.executeProcedure(ProcedureProfilTotal.PROCEDURE_NAME, 
				ProcedureProfilTotal.construireDictionnaire(edtuId, diplomeC,pspecialite,pniveau));
	}
	
	private static NSDictionary construireDictionnaire(Integer edtuId, String diplomeC, String pspecialite, String pniveau) {
		NSMutableDictionary dico=new NSMutableDictionary();
		dico.takeValueForKey(null, "10_returnValue");
		dico.takeValueForKey(edtuId, "20_etuId");
		dico.takeValueForKey(diplomeC, "30_pdiplome");
		dico.takeValueForKey(pspecialite, "40_pspecialite");
		dico.takeValueForKey(pniveau, "50_pniveau");
		return dico;
	}

}
