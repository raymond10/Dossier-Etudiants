/**
 * 
 */
package etudiants.utt.fr.sql;

import com.webobjects.foundation.NSDictionary;
import etudiants.utt.fr.eo.EOIndividu;
import etudiants.utt.fr.eo.EOVDossetudiants;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("rawtypes")
public class DossierAdmSQL {

	public DossierAdmSQL() {
		// TODO Auto-generated constructor stub
	}

	public String constructiongetConseiller(
			boolean isForCount, NSDictionary bindings) {
		String numero = (String) bindings.objectForKey("indivId");
		if(numero == null){
			numero = (String) bindings.objectForKey("numero");
		}
		// parties communes des differents select
		String selectClause = "SELECT MAX(AN_UNIV||PRD_UNIV)";
		String fromClause = "FROM GERRY.ETU_INSCR_ADM";
		String whereClause = "WHERE ETU_ID=" + numero;
		String Sql = selectClause + " " + fromClause + " " + whereClause;
		return Sql;
	}

	public String constructionlConseiller(
			boolean isForCount, NSDictionary bindings) {
		EOIndividu individu = (EOIndividu) bindings.objectForKey("nom");
		String selectClause = "select distinct salle_no, tel";
		String fromClause = "from gerry.localisation";
		String whereClause = "where indiv_id="
				+ individu.primaryKey()
				+ " and poste_id in "
				+ "(select distinct poste_id from gerry.ut_pers_poste "
				+ "where indiv_id="
				+ individu.primaryKey()
				+ " and sysdate between NVL(situ_debut_date,sysdate-1) and NVL(situ_fin_date,sysdate+1))";
		String Sql = selectClause + " " + fromClause + " " + whereClause;
		return Sql;
	}

	public String constructionlFormation(
			boolean isForCount, NSDictionary bindings) {
		EOVDossetudiants etudiant = (EOVDossetudiants) bindings
				.objectForKey("civilite");
		String selectClause = "select decode(ef.dipl_obt_$f,'O','Diplôme','Formation') as diplObt, "
				+ "ef.form_an_univ||ef.dipl_obt_an_civ as anDipl, "
				+ "rft.form_type_abr as libDipl, "
				+ "ef.form_ville||' ('||rp.pays||')' as lieuDipl";
		String fromClause = "from gerry.etu_formation ef, "
				+ "gerry.ref_form_type rft, " + "gerry.ref_pays rp";
		String whereClause = "where etu_id=" + etudiant.primaryKey()
				+ " and ef.form_type_$c=rft.form_type_$c "
				+ "and ef.form_pays_$c=rp.pays_$c(+)";
		String orderClause = "order by 2";
		String Sql = selectClause + " " + fromClause + " " + whereClause + " "
				+ orderClause;
		return Sql;
	}

	public String consAdresseEtudiant( boolean isForCount,
			NSDictionary bindings) {
		EOVDossetudiants etudiant = (EOVDossetudiants) bindings
				.objectForKey("civilite");
		String selectClause = "select "
				+ "chez_qui, "
				+ "adr1, "
				+ "adr2, "
				+ "bp, "
				+ "decode(cp_f||cp_e,null,'',cp_f||cp_e||' ')||commune as commune, "
				+ "pays, " + "tel1, " + "tel2 ";
		String fromClause = "from gerry.ind_coord i, " + "gerry.ref_pays p ";
		String whereClause = "where coord_type_$c='IND' "
				+ "and i.pays_$c=p.pays_$c(+) and indiv_id="
				+ etudiant.primaryKey();
		String Sql = selectClause + " " + fromClause + " " + whereClause;
		return Sql;
	}

	public String consAdresseParent( boolean isForCount,
			NSDictionary bindings) {
		EOVDossetudiants etudiant = (EOVDossetudiants) bindings
				.objectForKey("civilite");
		String selectClause = "select "
				+ "chez_qui, "
				+ "adr1, "
				+ "adr2, "
				+ "bp, "
				+ "decode(cp_f||cp_e,null,'',cp_f||cp_e||' ')||commune as commune, "
				+ "pays, " + "tel1, " + "tel2 ";
		String fromClause = "from gerry.ind_coord i, " + "gerry.ref_pays p ";
		String whereClause = "where coord_type_$c='PAR' "
				+ "and i.pays_$c=p.pays_$c(+) and indiv_id="
				+ etudiant.primaryKey();
		String Sql = selectClause + " " + fromClause + " " + whereClause;
		return Sql;
	}

	public String consInscription( boolean isForCount,
			NSDictionary bindings) {
		EOVDossetudiants etudiant = (EOVDossetudiants) bindings
				.objectForKey("civilite");
		String selectClause = "SELECT "
				+ "eia.prd_session as periode, "
				+ "decode(eia.diplome_$c,'TC',eia.diplome,eia.dipl_abr) as diplome, "
				+ "eia.dipl_spec_abr, "
				+ "eia.dipl_opt_abr, "
				+ "eia.niveau_adm, "
				+ "eia.inscr_formule_$c as formule, "
				
				+ "(SELECT inscr_formule "
				+ "FROM gerry.ref_inscr_formule "
				+ "WHERE inscr_formule_$c = eia.inscr_formule_$c) as lib_formule, "
				+ "eia.res_pedag_$c as decision, "
				
				+ "(SELECT code "
				+ "FROM gerry.ref_decision "
				+ "WHERE res_pedag_$c = eia.res_pedag_$c "
				+ "and diplome_$c = eia.diplome_$c) as code_decision, "
				
				+ "(SELECT libelle "
				+ "FROM gerry.ref_decision "
				+ "WHERE res_pedag_$c = eia.res_pedag_$c "
				+ "and diplome_$c = eia.diplome_$c) as lib_decision, "
				+ "nvl(decode(rep.echang_sens,'D','Départ - ','A','Arrivée - ','')||rep.echang_prog,'') as echange";
		String fromClause = "FROM " +
				  "gerry.vue_etu_inscr_adm eia, "
				+ "gerry.individu i, " 
				+ "gerry.ref_echang_prog rep";
		String whereClause = "WHERE " +
				  "etu_id=" + etudiant.primaryKey()
				+ " and eia.conseiller_id=i.indiv_id(+) "
				+ "and eia.echang_prog_$c=rep.echang_prog_$c(+)";
		String orderClause = "order by eia.an_univ, eia.prd_univ";
		String Sql = selectClause + " " + fromClause + " " + whereClause + " "
				+ orderClause;
		return Sql;
	}

	public String consInfoSocial( boolean isForCount,
			NSDictionary bindings) {
		EOVDossetudiants etudiant = (EOVDossetudiants) bindings
				.objectForKey("civilite");
		String selectClause = "select "
				+ "eiau.an_univ as an_univ, "
				+ "eiau.an_univ||'/'||(eiau.an_univ+1) as an, "
				+ "rb.bourse||decode(eiau.bourse_deb_date,null,' ', "
				+ "' du '||to_char(bourse_deb_date,'DD/MM/YYYY')|| "
				+ "' au '||to_char(bourse_fin_date,'DD/MM/YYYY')) as bourse, "
				+ "rsr.secu_regime as regime_secu, "
				+ "nvl(rsc.secu_centre,'inconnu') as centre_secu, "
				+ "decode(eiau.sport_$c,'N','Non','A','Automne','P','Printemps','U','Année complète','') as sport, "
				+ "decode(eiau.bde_$c,'N','Non','A','Automne','P','Printemps','U','Année complète','') as bde ";
		String fromClause = "from gerry.etu_inscr_an_univ eiau, "
				+ "gerry.ref_bourse rb, " + "gerry.ref_secu_regime rsr, "
				+ "gerry.ref_secu_centre rsc";
		String whereClause = "where eiau.an_univ=(select max(an_univ) "
				+ "from gerry.etu_inscr_an_univ " + "where etu_id="
				+ etudiant.primaryKey() + ") " + "and eiau.etu_id="
				+ etudiant.primaryKey()
				+ " and eiau.bourse_$c=rb.bourse_$c(+) "
				+ "and eiau.secu_regime_$c=rsr.secu_regime_$c(+) "
				+ "and eiau.secu_centre_$c=rsc.secu_centre_$c(+) ";
		String Sql = selectClause + " " + fromClause + " " + whereClause;
		return Sql;
	}

	public String consPaiement( boolean isForCount,
			NSDictionary bindings) {
		EOVDossetudiants etudiant = (EOVDossetudiants) bindings
				.objectForKey("civilite");
		String selectClause = "select rif.inscr_frais as paie_lib, "
				+ "to_char(p.montant,'99G990D99') as paie_mnt ";
		String fromClause = "from gerry.inscr_frais_paiement p, "
				+ "gerry.ref_inscr_frais rif ";
		String whereClause = "where p.an_univ =(select max(an_univ) "
				+ "from gerry.etu_inscr_an_univ " + "where etu_id="
				+ etudiant.primaryKey() + ")  " + "and p.etu_id="
				+ etudiant.primaryKey() + " and p.sens_$c='P' "
				+ "and p.inscr_frais_$c=rif.inscr_frais_$c ";
		String orderClause = "ORDER BY decode(rif.inscr_frais_$c,'DI',1,'DOU',2,'SS',4,'MP',3,'SPO',5,'BDE',6,10) ";
		String Sql = selectClause + " " + fromClause + " " + whereClause + " "
				+ orderClause;
		return Sql;
	}
	
	public String consPcb(NSDictionary bindings){
		EOVDossetudiants etudiant = (EOVDossetudiants) bindings.objectForKey("civilite");
		String selectClause ="select etu_id, an_univ, "
							  +"montant*100 as montant, cle_mysql, "
							  +"(select ind_email from gerry.ind_email where indiv_id =etu_id AND 'UTT' = email_type_$c ) as email,"
							  +" (select pcb_$f from gest_uv.param_doetu) as visible ";
		String fromClause = "from gerry.vue_inscr_paiement ";
		String whereClause = "where paiement_type_$c='CBL' "
							  +"and paiement_cb_annule_$f='N' "
							  +"and etu_paiement_cb_date is null "
							  +"and alerte_$F='O' and an_univ= "
							  +"(select max(an_univ) from gerry.etu_inscr_an_univ "
							  +"where etu_id="+etudiant.primaryKey()+")"							  
							  +" and etu_id ="+etudiant.primaryKey() +"";
		String Sql = selectClause + " " + fromClause + " " + whereClause;
		return Sql;
	}

	public String consPaiementTotal( boolean isForCount,
			NSDictionary bindings) {
		EOVDossetudiants etudiant = (EOVDossetudiants) bindings
				.objectForKey("civilite");
		String selectClause = "select "
				+ "nvl(to_char(sum(montant),'99G990D99'),'0') as mnt_tot ";
		String fromClause = "from gerry.inscr_frais_paiement ";
		String whereClause = "where an_univ =(select max(an_univ) "
				+ "from gerry.etu_inscr_an_univ " + "where etu_id="
				+ etudiant.primaryKey() + ") " + "and etu_id="
				+ etudiant.primaryKey() + " and sens_$c='P'";
		String Sql = selectClause + " " + fromClause + " " + whereClause;
		return Sql;
	}

}
