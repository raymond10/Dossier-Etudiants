/**
 * 
 */
package etudiants.utt.fr.sql;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("rawtypes")
public class ProfilEtudiantsSQL {

	public ProfilEtudiantsSQL() {
		// TODO Auto-generated constructor stub
	}
	
	/**appel de la fonction qui qui affiche la catŽgorie du profil en fonction du dipl™me **/
	public String functionCategorie(NSDictionary bindings){
		NSMutableDictionary diplome = (NSMutableDictionary) bindings.valueForKey("dicDiplome");
		String diplomeC =  (String) diplome.valueForKey("DIPLOMEC");
		String sql="SELECT * FROM TABLE(PKG_ETU_DOSSIER.PROFIL_CATEG('"+diplomeC+"'))";
		return sql;
	}
	
	/**appel de la fonction qui affiche les diplome de lŽtudiant **/
	public String functionDiplome(NSDictionary bindings){
		String etuId = (String) bindings.valueForKey("numero");
		if(etuId == null){
			etuId = (String) bindings.valueForKey("indivId");
		}
		String sql="SELECT * FROM TABLE(PKG_ETU_DOSSIER.PROFIL_DIPLOME("+etuId+"))";
		return sql;
	}
	
	/**appel de la fonction qui donne un rŽsumŽ des informations sur l'Žtudiant **/
	public String functionEtudiant(NSDictionary bindings){
		String etuId = (String) bindings.valueForKey("numero");
		if(etuId == null){
			etuId = (String) bindings.valueForKey("indivId");
		}
		String sql="SELECT * FROM TABLE(PKG_ETU_DOSSIER.PROFIL_ETUDIANT("+etuId+"))";
		return sql;
	}
	
	/**appel de la fonction qui affichent les uv auxquels est inscrit l'Žtudiant **/
	public String functionInsUv(NSDictionary bindings){
		String etuId = (String) bindings.valueForKey("numero");
		if(etuId == null){
			etuId = (String) bindings.valueForKey("indivId");
		}
		NSMutableDictionary diplome = (NSMutableDictionary) bindings.valueForKey("dicDiplome");
		String diplomeC =  (String) diplome.valueForKey("DIPLOMEC");
		String sql="SELECT * FROM TABLE(PKG_ETU_DOSSIER.PROFIL_INSUV("+etuId+",'"+diplomeC+"'))";
		return sql;
	}
	/**appel de la fonction qui donne le dŽtail du parcours de l'Žtudiant **/
	public String functionParcours(NSDictionary bindings){
		String etuId = (String) bindings.valueForKey("numero");
		if(etuId ==null){
			etuId = (String) bindings.valueForKey("indivId");
		}
		NSMutableDictionary diplome = (NSMutableDictionary) bindings.valueForKey("dicDiplome");
		String diplomeC =  (String) diplome.valueForKey("DIPLOMEC");
		String pdebut = (String) diplome.valueForKey("PRD_DEBUT");
		String pfin = (String) diplome.valueForKey("PRD_FIN");
		String sql="SELECT * FROM TABLE(PKG_ETU_DOSSIER.PROFIL_INSPARCOURS("+etuId+",'"+diplomeC+"','"+pdebut+"','"+pfin+"'))";
		return sql;
	}
	
	/**appel de la fonction qui affiche le total des uv par catŽgorie **/
	public String functionTotal(NSDictionary bindings){
		String etuId = (String) bindings.valueForKey("numero");
		if(etuId ==null){
			etuId = (String) bindings.valueForKey("indivId");
		}
		NSMutableDictionary diplome = (NSMutableDictionary) bindings.valueForKey("dicDiplome");
		String diplomeC =  (String) diplome.valueForKey("DIPLOMEC");
		Object pSpec =  (Object) diplome.valueForKey("DIPL_SPEC");
		Object pNiveau =  (Object) diplome.valueForKey("NIV_ENTREE");
		String pdebut = (String) diplome.valueForKey("PRD_DEBUT");
		String sql="SELECT * FROM TABLE(PKG_ETU_DOSSIER.PROFIL_TOTAL("+etuId+",'"+diplomeC+"','"+pSpec+"','"+pNiveau+"','"+pdebut+"'))";
		return sql;
	}
	
	/**appel de la fonction qui affiche les totaux par semestre ou annŽe universitaire**/
	public String functionTotaux(NSDictionary bindings){
		String etuId = (String) bindings.valueForKey("numero");
		if(etuId ==null){
			etuId = (String) bindings.valueForKey("indivId");
		}
		NSMutableDictionary diplome = (NSMutableDictionary) bindings.valueForKey("dicDiplome");
		String diplomeC =  (String) diplome.valueForKey("DIPLOMEC");
		String pdebut = (String) diplome.valueForKey("PRD_DEBUT");
		String sql="SELECT * FROM TABLE(PKG_ETU_DOSSIER.PROFIL_TOTAUX("+etuId+",'"+diplomeC+"','"+pdebut+"'))";
		return sql;
	}
	

	public static boolean stringContains(String str, String searchStr) {
		if (str == null || searchStr == null) {
			return false;
		}
		return str.indexOf(searchStr) >= 0;
	}
}