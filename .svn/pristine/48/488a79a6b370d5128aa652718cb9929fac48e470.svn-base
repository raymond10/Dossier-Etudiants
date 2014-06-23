/**
 * 
 */
package etudiants.utt.fr.sql;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
public class EditionSQL {
	
	public EditionSQL() {
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
	
	public String periodeSelectionnee(String periode) {
		String periodes = "SELECT rp.an_univ||rp.prd_univ as periode, rp.libelle, rp.prd_session, rp.an_civ as annee "+
						"FROM "+
							"gerry.param_prd pp, gerry.ref_periode rp "+
							"WHERE "+
						 "rp.an_univ||rp.prd_univ = '"+periode+"'";
		return periodes;
	}
	
	public String specialite(String niveau) {
		String specialite  = "SELECT dipl_spec_abr FROM gerry.vue_dipl_spec "+
							"WHERE dipl_spec_$c= '"+niveau+"'";
		return specialite;
	}

}
