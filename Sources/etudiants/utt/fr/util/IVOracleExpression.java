/**
 * 
 */
package etudiants.utt.fr.util;

import com.webobjects.eoaccess.EOEntity;
import com.webobjects.foundation._NSStringUtilities;
import com.webobjects.jdbcadaptor.OraclePlugIn.OracleExpression;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
public class IVOracleExpression extends OracleExpression {

	/**
	 * @param in_entity
	 */
	public IVOracleExpression(EOEntity in_entity) {
		super(in_entity);
		// TODO Auto-generated constructor stub
	}

	public String sqlStringForCaseInsensitiveLike(String in_s, String in_s1) {
		String l_str = _NSStringUtilities.concat("CONVERT(upper(", in_s1,"), 'US7ASCII') LIKE CONVERT(upper(", in_s, "), 'US7ASCII')");
		return l_str;
	}

}
