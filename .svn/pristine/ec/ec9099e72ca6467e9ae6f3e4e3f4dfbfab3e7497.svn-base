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
public class ProcedureRechercheEtudiants extends Procedure {
	
	private final static String PROCEDURE_NAME="rechercheEtudiants";
	
	public ProcedureRechercheEtudiants() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean rechercher(_LoginBasicDataBus dataBus, NSMutableDictionary bindings) throws NSValidation.ValidationException{
		return dataBus.executeProcedure(ProcedureRechercheEtudiants.PROCEDURE_NAME, 
				ProcedureRechercheEtudiants.construireDictionnaire(bindings));
	}
	
	private static NSDictionary construireDictionnaire(NSDictionary bindings) {
		NSMutableDictionary dico=new NSMutableDictionary();
		dico.takeValueForKey(bindings.valueForKey("periode"), "010_pperiode");
		dico.takeValueForKey(bindings.valueForKey("diplome"), "020_pdiplome");
		dico.takeValueForKey(bindings.valueForKey("niveau"), "030_pniveau");
		dico.takeValueForKey(bindings.valueForKey("uv"), "040_puv");
		dico.takeValueForKey(bindings.valueForKey("nom"), "050_pnom");
		dico.takeValueForKey(bindings.valueForKey("prenom"), "060_pprenom");
		dico.takeValueForKey(Integer.valueOf((String) bindings.valueForKey("numero")), "070_pnum");
		dico.takeValueForKey(bindings.valueForKey("idConseiller"), "080_pconseiller");
		dico.takeValueForKey(null, "090_etu_cur");
		return dico;
	}

}
