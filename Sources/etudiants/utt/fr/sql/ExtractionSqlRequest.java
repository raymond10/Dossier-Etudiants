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
public class ExtractionSqlRequest {

	/**
	 * 
	 */
	public ExtractionSqlRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public String periodeCourante() {
		String courante = "SELECT rp.an_univ||rp.prd_univ as periode, rp.libelle, rp.prd_session, rp.an_civ as annee "+
						"FROM "+
							"gerry.param_prd pp, gerry.ref_periode rp "+
							"WHERE "+
						 "pp.an_univ||pp.prd_univ = rp.an_univ||rp.prd_univ "+
						  "and pp.par_prd_type='DEF'";
		return courante;
	}
	
	public String anneeCourante() {
		String annee = "SELECT an_univ as defaut "+
						"FROM "+
							"gerry.param_prd "+
							"WHERE "+
						 "par_prd_type = 'DEF3C' "+
							"ORDER BY "+
						  "an_univ DESC";
		return annee;
	}
	
	public String diplomeRespUv() {
		String diplome = "SELECT DISTINCT(DIPLOME_$C) AS DIPLOME FROM GERRY.MV_EXTRACT_CATALOGUE ORDER BY DIPLOME";
		return diplome;
	}
	
	public String niveauRespUv() {
		String niveau = "SELECT DISTINCT(TO_NUMBER(NIVEAU_ADM)) AS NIVEAU FROM GERRY.MV_EXTRACT_CATALOGUE ORDER BY NIVEAU";
		return niveau;
	}
	
	/**appel de la fonction qui affiche la sp�cialit� du dipl�me **/
	public String functionRecupDilSpec() {
		String sql="SELECT * FROM TABLE(SELECT PKG_ETU_DOSSIER.RECUP_DILPSPEC FROM DUAL)";
		return sql;
	}
	
	/**appel de la fonction qui affiche les periode **/
	public String functionRefPeriode(){
		String sql="SELECT * FROM TABLE(SELECT PKG_ETU_DOSSIER.REF_PERIODE1 FROM DUAL)";
		return sql;
	}
	
	/**appel de la fonction qui affiche les uv**/
	public String functionRefUv(){
		String sql="SELECT * FROM TABLE(SELECT PKG_ETU_DOSSIER.REF_UV FROM DUAL)";
		return sql;
	}
	
	/**appel de la fonction qui affiche les ann�es**/
	public String functionRefAnnee(){
		String sql="SELECT * FROM TABLE(SELECT PKG_ETU_DOSSIER.REF_ANNEE FROM DUAL)";
		return sql;
	}
	
	/**Liste des �tudiants par p�riode, dipl�me ou branche ou niveau ou uv**/
	public String functionExtUvV2(NSDictionary bindings){
		String diplome =  (String) bindings.valueForKey("DIPL_CODE");
		String periode = (String) bindings.valueForKey("ANPRD_UNIV");
		String niveau = (String) bindings.valueForKey("NIVEAU");
		String uv = (String) bindings.valueForKey("UV");
		String sql="SELECT * FROM TABLE(SELECT PKG_ETU_DOSSIER.EXT_UV_V2('"+periode+"','"+diplome+"','"+niveau+"','"+uv+"') FROM DUAL)";
		return sql;
	}
	/**Liste des �tudiants inscrits � une UV par p�riode **/
	public String functionExpListUv1(NSDictionary bindings){
		String periode = (String) bindings.valueForKey("ANPRD_UNIV");
		String uv = (String) bindings.valueForKey("UV");
		String sql="SELECT * FROM TABLE(SELECT PKG_ETU_DOSSIER.EXP_LIST_UV1('"+periode+"','"+uv+"') FROM DUAL)";
		return sql;
	}
	
	/**Liste des �tudiants inscrits pendant une p�riode **/
	public String functionExpEff(NSDictionary bindings){
		String periode1 = (String) bindings.valueForKey("AN_VALEUR");
		String periode2 = (String) bindings.valueForKey("AN_VALEUR");
		String sql="SELECT * FROM TABLE(SELECT PKG_ETU_DOSSIER.EXP_EFF('"+periode1+"','"+periode2+"') FROM DUAL)";
		return sql;
	}
	
	/**Liste des r�sultats des �tudiants pour une p�riode**/
	public String functionExpResult(NSDictionary bindings){
		String periode1 = (String) bindings.valueForKey("ANPRD_UNIV");
		String periode2 = (String) bindings.valueForKey("ANPRD_UNIV");
		String uv = (String) bindings.valueForKey("UV");
		String diplome =  (String) bindings.valueForKey("DIPL_CODE");
		String sql="SELECT * FROM TABLE(SELECT PKG_ETU_DOSSIER.EXP_RESULT('"+periode1+"','"+periode2+"','"+uv+"','"+diplome+"') FROM DUAL)";
		return sql;
	}
	
	/**Liste des inscriptions aux UV **/
	public String exportInsuv(NSDictionary bindings) {
		String periode = (String) bindings.valueForKey("ANPRD_UNIV");
		String diplome =  (String) bindings.valueForKey("DIPL_CODE");
		String niveau = (String) bindings.valueForKey("NIVEAU");
		String insUvs = "SELECT * "+
						"FROM "+
							"gest_uv.vue_ver_insuv "+
							"WHERE "+
						 "periode = '"+periode+"'"+
						 "and rpad(diplome_$c,6)||dipl_spec_$c = '"+diplome+"'"+
						  "and niveau_adm = '"+niveau+"'";
		return insUvs;
	}
	
	/**Liste des d�cisions de jury pour des p�riodes**/
	public String functionExpDecis(NSDictionary bindings){
		String periode1 = (String) bindings.valueForKey("ANPRD_UNIV");
		String periode2 = (String) bindings.valueForKey("ANPRD_UNIV");
		String sql="SELECT * FROM TABLE(SELECT PKG_ETU_DOSSIER.EXP_DECIS('"+periode1+"','"+periode2+"') FROM DUAL)";
		return sql;
	}
	
	/**Liste des d�cisions de jury avec codes des appr�ciations**/
	public String functionExpDecis2(NSDictionary bindings){
		String periode = (String) bindings.valueForKey("ANPRD_UNIV");
		String diplome =  (String) bindings.valueForKey("DIPL_CODE");
		String sql="SELECT * FROM TABLE(SELECT PKG_ETU_DOSSIER.EXP_DECIS2('"+periode+"','"+diplome+"') FROM DUAL)";
		return sql;
	}

}
