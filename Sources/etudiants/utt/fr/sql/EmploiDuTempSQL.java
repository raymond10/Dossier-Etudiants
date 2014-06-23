/**
 * 
 */
package etudiants.utt.fr.sql;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSDictionary;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class EmploiDuTempSQL {

	public EmploiDuTempSQL() {
		// TODO Auto-generated constructor stub
	}
	
	/**affiche si l'emploi du temps est publi� ou pas **/
	public String edtPubli(){
		String sql="SELECT EDT_PUBLIQ_$F AS PUBLI FROM GEST_UV.ADMIN_ETU";
		return sql;
	}
	
	/**appel de la fonction qui donne le d�tail de l'emploi du temps de l'�tudiant **/
	public String functionEdt(NSDictionary bindings){
		String etuId = (String) bindings.valueForKey("numero");
		if(etuId == null){
			etuId = (String) bindings.valueForKey("indivId");
		}
		String sql="SELECT * FROM TABLE(PKG_ETU_DOSSIER.SELECT_EDT2("+etuId+"))";
		return sql;
	}
	
	/**appel de la fonction qui affiche l'uv suivi dans l'emploi du temps de l'�tudiant **/
	public String functionEdtUV( NSDictionary bindings){
		String etuId = (String) bindings.valueForKey("numero");
		if(etuId == null){
			etuId = (String) bindings.valueForKey("indivId");
		}
		String sql="SELECT * FROM TABLE(PKG_ETU_DOSSIER.SELECT_EDT_UV("+etuId+"))";
		return sql;
	}
	
	/**appel de la fonction qui donne le nom prenom de l'�tudiant suivant le m�me uv **/
	public String functionEdtETU(NSDictionary bindings){
		String etuId = (String) bindings.valueForKey("numero");
		if(etuId == null){
			etuId = (String) bindings.valueForKey("indivId");
		}
		String sql="SELECT * FROM TABLE(PKG_ETU_DOSSIER.SELECT_EDTETU("+etuId+"))";
		return sql;
	}

}
