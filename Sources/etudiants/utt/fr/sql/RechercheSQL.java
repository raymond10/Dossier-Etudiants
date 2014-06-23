/**
 * 
 */
package etudiants.utt.fr.sql;

import org.login.fwkloginwebapp.common.LoginLog;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class RechercheSQL {
	
	public RechercheSQL() {
		// TODO Auto-generated constructor stub
	}
	
	public static final NSArray getRawRowSearchEtudiants(EOEditingContext ed, NSDictionary bindinds){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",laFonctionRECHETU(bindinds), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public static final NSArray getRawRowParcoursEtudiants(EOEditingContext ed, String id){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry", laFonctionPARCETU(id),null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	/**appel de la fonction de recherche d'�tudiants par nom, prenom, periode, uv **/
	public static String laFonctionRECHETU(NSDictionary bindinds){
		String periode = (String) bindinds.valueForKey("periode");
		String diplome = (String) bindinds.valueForKey("diplome");
		if(diplome == null){
			diplome = (String) bindinds.valueForKey("prdDiplome");
		}
		String niveau = (String) bindinds.valueForKey("niveau");
		String uv = (String) bindinds.valueForKey("uv");
		String nom = (String) bindinds.valueForKey("nom");
		String prenom = (String) bindinds.valueForKey("prenom");
		String numero = (String) bindinds.valueForKey("numero");
		String idConseiller = (String) bindinds.valueForKey("idConseiller");
			String MyRequest = "SELECT * FROM TABLE(PKG_ETU_DOSSIER.FONC_RECHETU(";
					if(periode==null){
						MyRequest+=periode;
					} else {
						MyRequest+="'"+periode+"'";
					}
					MyRequest+=",";
					if(diplome==null){
						MyRequest+=diplome;
					} else {
						MyRequest+="'"+diplome+"'";
					}
					MyRequest+=",";
					if(niveau==null){
						MyRequest+=niveau;
					} else {
						MyRequest+="'"+niveau+"'";
					}
					MyRequest+=",";
					if(uv==null){
						MyRequest+=uv;
					} else {
						MyRequest+="'"+uv+"'";
					}
					MyRequest+=",";
					if(nom==null){
						MyRequest+=nom;
					} else {
						MyRequest+="'"+nom+"'";
					}
					MyRequest+=",";
					if(prenom==null){
						MyRequest+=prenom;
					} else {
						MyRequest+="'"+prenom+"'";
					}
					MyRequest+=",";
					MyRequest+=numero;
					MyRequest+=",";
					MyRequest+=idConseiller;
					MyRequest+="))";
			return MyRequest;
		}
		
		/**appel de la fonction du parcours de chaque �tudiant **/
		public static String laFonctionPARCETU(String id) {
			String MyRequest = "SELECT * FROM TABLE(PKG_ETU_DOSSIER.FONC_PARCETU("
					+ id + "))";
			return MyRequest;
		}
		
		public static String periodeCourante(){
			String MyRequest = "SELECT rp.an_univ||rp.prd_univ as periode, rp.libelle, rp.prd_session, rp.an_civ as annee "+
		                       "FROM gerry.param_prd pp, gerry.ref_periode rp "+
					            "WHERE   pp.an_univ||pp.prd_univ = rp.an_univ||rp.prd_univ  and pp.par_prd_type='DEF'";
			return MyRequest;
		}
		
		/**recup�rer le persId de COCKTAIL **/
		public String requetePersId(Integer indivId){
			String sql="SELECT COCK_PERS_ID, COCK_NO_IND, NOM, PRENOM FROM CEDRE.VUE_IND_ID@COCKTAIL.WORLD WHERE GERR_INDIV_ID = "+indivId;
			return sql;
		}
		
		/**appel de la fonction qui permet de savoir si le user connect� peut GCTC**/
		public String functionHasPermission(Integer PersId){
			String sql="SELECT ADMGCTC.HASPERMISSION@COCKTAIL.WORLD("+PersId+") NB_MSG FROM DUAL";
			//LoginLog.log(sql);
			return sql;
		}

}
