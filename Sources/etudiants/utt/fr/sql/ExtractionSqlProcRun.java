/**
 * 
 */
package etudiants.utt.fr.sql;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 *
 */
@SuppressWarnings("all")
public class ExtractionSqlProcRun {

	/**
	 * 
	 */
	
	public static ExtractionSqlRequest sqli;
	
	public ExtractionSqlProcRun() {
		// TODO Auto-generated constructor stub
		sqli = new ExtractionSqlRequest();
	}
	
	public NSArray niveau(){
		NSMutableDictionary nn = new NSMutableDictionary();
		NSMutableArray<NSMutableDictionary> niv = new NSMutableArray<NSMutableDictionary>();
		nn.put("LIBELLE","Tous");
		nn.put("VALEUR",0);
		niv.addObject(nn);
		for(int i=1; i < 13; i++){
			NSMutableDictionary nn1 = new NSMutableDictionary();
			nn1.put("LIBELLE",i);
			nn1.put("VALEUR",i);
			niv.addObject(nn1);
		}
		return niv.immutableClone();
	}
	
	public static NSArray selectRawRowPeriodeCourante(EOEditingContext ed){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.periodeCourante(), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}	
	
	public static NSArray selectRawRowAnneeCourante(EOEditingContext ed){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.anneeCourante(), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public static NSArray selectRawRowDiplomeRespUv(EOEditingContext ed){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.diplomeRespUv(), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	public static NSArray selectRawRowNiveauxRespUv(EOEditingContext ed){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.niveauRespUv(), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	/**appel de la fonction qui affiche la sp�cialit� du dipl�me **/
	public static NSArray selectRawRowRecupDilSpec(EOEditingContext ed){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.functionRecupDilSpec(), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;	
	}
	
	/**appel de la fonction qui affiche les periode **/
	public static NSArray selectRawRowRefPeriode(EOEditingContext ed){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.functionRefPeriode(), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;	
	}
	
	/**appel de la fonction qui affiche les uv**/
	public static NSArray selectRawRowRefUv(EOEditingContext ed){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.functionRefUv(), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;		
	}
	
	/**appel de la fonction qui affiche les ann�es**/
	public static NSArray selectRawRowRefAnnee(EOEditingContext ed){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.functionRefAnnee(), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;	
	}
	
	/**Liste des �tudiants par p�riode, dipl�me ou branche ou niveau ou uv**/
	public static NSArray selectRawRowExtUvV2(EOEditingContext ed,NSDictionary bindings){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.functionExtUvV2(bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;		
	}
	
	/**Liste des �tudiants inscrits � une UV par p�riode **/
	public static NSArray selectRawRowExpListUv1(EOEditingContext ed,NSDictionary bindings){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.functionExpListUv1(bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;		
	}
	
	/**Liste des �tudiants inscrits pendant une p�riode **/
	public static NSArray selectRawRowExpEff(EOEditingContext ed,NSDictionary bindings){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.functionExpEff(bindings), null);
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;	
	}
	
	/**Liste des r�sultats des �tudiants pour une p�riode**/
	public static NSArray selectRawRowExpResult(EOEditingContext ed,NSDictionary bindings){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.functionExpResult(bindings), null);	
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	/**Liste des inscriptions aux UV **/
	public static NSArray selectRawRowExportInsuv(EOEditingContext ed,NSDictionary bindings){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.exportInsuv(bindings), null);	
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;	
	}
	
	/**Liste des d�cisions de jury pour des p�riodes**/
	public static NSArray selectRawRowExpDecis(EOEditingContext ed,NSDictionary bindings){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.functionExpDecis(bindings), null);	
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;	
	}
	
	/**Liste des d�cisions de jury avec codes des appr�ciations**/
	public static NSArray selectRawRowExpDecis2(EOEditingContext ed,NSDictionary bindings){
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",	sqli.functionExpDecis2(bindings), null);	
		} catch (Exception e){
			e.printStackTrace();
		}
		return result;	
	}
}
