/**
 * 
 */
package etudiants.utt.fr.sql;

import com.webobjects.foundation.NSDictionary;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("rawtypes")
public class ResultatsUvSQL {

	public ResultatsUvSQL() {
		// TODO Auto-generated constructor stub
	}

	public String selectInsUv(NSDictionary bindings) {
		String id = (String) bindings.valueForKey("indivId");
		if(id == null){
			id = (String) bindings.valueForKey("numero");
		}
		String select = "select vi.etu_id,  vi.diplome_$c as diplome, "
				+ "(select decode(diplome_$c,'110',diplome ||' Ancien règlement',diplome)"
				+ " from diplome where diplome_$c = vi.diplome_$c) as lib_diplome,"
				+ " vi.uv_$c as uv, vi.resuv_$c as resuv, vi.NB_CREDITS_ECTS_INSUVP as credit,vi.an_univ||vi.prd_univ as periode";
		String from = " from gest_uv.vue_insuv vi, gerry.diplome d";
		String where = " where etu_id ="
				+ id
				+ " and vi.diplome_$c = d.diplome_$c"
				+ " and vi.an_univ||vi.prd_univ = (select pp.an_univ||pp.prd_univ from gerry.param_prd pp, gerry.diplome p "
				+ "where p.diplome_$c = d.diplome_$c and par_prd_type=decode(d.prd_type_$c,'S', 'DEF','U', 'DEF3C'))";
		String sql = select + from + where;
		return sql;
	}
	
	public String selectAnneeEnCours(NSDictionary bindings){
		String id = (String) bindings.valueForKey("indivId");
		if(id == null){
			id = (String) bindings.valueForKey("numero");
		}
		String select = "SELECT rp.an_univ||rp.prd_univ as PERIODE, ";
			   select+="rp.libelle, rp.prd_session, rp.an_civ as ANNEE ";
		String from = "FROM gerry.param_prd pp, gerry.ref_periode rp ";
		String where = "WHERE pp.an_univ||pp.prd_univ = rp.an_univ||rp.prd_univ AND pp.par_prd_type='DEF'";
		String sql = select + from + where;
		return sql;
	}

	public String selectUmodalites(NSDictionary bindings) {
		String uv = (String) bindings.valueForKey("UV");
		String periode = (String) bindings.valueForKey("PERIODE");
		String select = "select uo.uv_ouv_id, uo.uv_$c as uv, uoc.controle_$c as controle,"
				+ " (select controle_lib from gest_uv.ref_controle rc where rc.controle_$c = uoc.controle_$c) as controle_lib,"
				+ " uoc.valeur, uoc.note_elim,	(select observation from gest_uv.uv_ouv_mod_ctl where uv_ouv_id = uoc.uv_ouv_id) as observation";
		String from = " from gest_uv.uv_ouv_ctl uoc, gest_uv.uv_ouv uo, gest_uv.uv_ouv_mod_ctl uomc";
		String where = " where uo.uv_ouv_id = uoc.uv_ouv_id and uo.uv_ouv_id = uomc.uv_ouv_id and uomc.publi_$f = 'O'"
				+ " and uo.uv_$c ='"
				+ uv
				+ "' and uo.an_univ||uo.prd_univ ='"
				+ periode +"'";
		String sql = select + from + where;
		return sql;
	}

}
