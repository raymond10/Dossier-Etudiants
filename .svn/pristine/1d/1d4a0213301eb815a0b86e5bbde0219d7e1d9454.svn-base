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
public class AnnoncesSQL {
	
	public AnnoncesSQL() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("rawtypes")
	public String constructionUpdateMsgVisibilite(EOEditingContext ed,
			boolean isForCount, NSDictionary bindings){
		String annonce = (String) bindings.objectForKey("annonce");
		String visible = (String) bindings.objectForKey("visible");
		String sql = "UPDATE GEST_UV.PARAM_DOETU SET ANNONCE='"+annonce+"',VISIBLE_$F ='"+visible+"'";
		return sql;
	}
	
	@SuppressWarnings("rawtypes")
	public String constructionUpdatePcbVisible(EOEditingContext ed,
			boolean isForCount, NSDictionary bindings){
		String pcbf = (String) bindings.objectForKey("pcbf");
		String sql = "UPDATE GEST_UV.PARAM_DOETU SET PCB_$F ='"+pcbf+"'";
		return sql;
	}

}
