/**
 * 
 */
package etudiants.utt.fr.components.controlers;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WORequest;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSMutableDictionary;

import etudiants.utt.fr.components.Annonces;
import etudiants.utt.fr.roles.LeUser;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.sql.AnnoncesSQL;
import etudiants.utt.fr.util.StringOperation;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class AnnoncesCtrl extends AComponentCtrl {
	
	private EOEditingContext edc;
	private Annonces wocomponent;
	private Session sess;
	public String selectVisible1 = null, selectVisible2 = null, selectPCB1, selectPCB2;
	private LeUser user;
	private NSMutableDictionary unUser;
	public static AnnoncesSQL Sql = new AnnoncesSQL();
	private String message;
	private NSMutableDictionary bdgs;
	private Boolean isAutorizedUser;
	private Boolean isAdmin;
	
	public AnnoncesCtrl(Annonces aComponent){
		setWocomponent(aComponent);
		setUser(wocomponent().user());
		setUnUser(user().leUser());
	}
	
	/**
	 * @return the edc
	 */
	public EOEditingContext edc() {
		if(edc == null)
			edc = wocomponent().edc();
		return edc;
	}

	/**
	 * @param edc the edc to set
	 */
	public void setEdc(EOEditingContext edc) {
		this.edc = edc;
	}

	/**
	 * @return the wocomponent
	 */
	public Annonces wocomponent() {
		return wocomponent;
	}

	/**
	 * @param wocomponent the wocomponent to set
	 */
	public void setWocomponent(Annonces wocomponent) {
		this.wocomponent = wocomponent;
	}

	/**
	 * @return the sess
	 */
	public Session sess() {
		if(sess == null)
			sess = wocomponent().mySession();
		return sess;
	}

	/**
	 * @param sess the sess to set
	 */
	public void setSess(Session sess) {
		this.sess = sess;
	}

	/**
	 * @return the user
	 */
	public LeUser user() {
		if(user == null)
			user = wocomponent().user();
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(LeUser user) {
		this.user = user;
	}

	/**
	 * @return the unUser
	 */
	public NSMutableDictionary unUser() {
		if(unUser == null)
			unUser = user().leUser();
		return unUser;
	}

	/**
	 * @param unUser the unUser to set
	 */
	public void setUnUser(NSMutableDictionary unUser) {
		this.unUser = unUser;
	}

	/**
	 * @return the bdgs
	 */
	public NSMutableDictionary bdgs() {
		if(bdgs == null)
			bdgs = new NSMutableDictionary();
		return bdgs;
	}

	/**
	 * @param bdgs the bdgs to set
	 */
	public void setBdgs(NSMutableDictionary bdgs) {
		this.bdgs = bdgs;
	}

	public Boolean isAutorizedUser() {
		isAutorizedUser = (Boolean) unUser().valueForKey(StringOperation.AUTORIZED);
		return isAutorizedUser;
	}
	
	public Boolean isAdmin() {
		isAdmin = unUser().valueForKey(StringOperation.ROLE).equals(StringOperation.ADMINISTRATEUR)&&isAutorizedUser();
		return isAdmin;
	}
	
	public void clickRadio() {
		WORequest request = wocomponent().context().request();
		String value = (String) request.formValueForKey("visible");
		if(value.equals("O")){
			selectVisible1 = "O";
			selectVisible2 = null;
			bdgs().put("visible", selectVisible1);
		} else {
			selectVisible1 = null;
			selectVisible2 = "N";
			bdgs().put("visible", selectVisible2);
		}
	}
	
	public void clickRadioPcb() {
		WORequest request = wocomponent().context().request();
		String value = (String) request.formValueForKey("pcbf");
		if(value.equals("O")){
			selectPCB1 = "O";
			selectPCB2 = null;
			bdgs().put("pcbf", selectPCB1);
		} else {
			selectPCB1= null;
			selectPCB2 = "N";
			bdgs().put("pcbf", selectPCB2);
		}
	}
	
	public WOActionResults updateMsgAnnonce() {
		/** invocation directe de SQL pour changer la visiblite et le message de l'annonce */
		WORequest request = wocomponent().context().request();
		String value = (String) request.formValueForKey("message");
		if(value != null){
			setMessage(value.replace("'", "''"));
			bdgs().put("annonce", getMessage());
		}
		String tmpValue = (String) bdgs().valueForKey("visible");
		if(tmpValue == null){
			bdgs().put("visible", wocomponent.getAnnoncePcb().visiblef());
		}
		try{
			EOUtilities.rawRowsForSQL(edc(), "EtudiantEoGestUV",Sql.constructionUpdateMsgVisibilite(edc(), false, bdgs()), null);
			EOUtilities.rawRowsForSQL(edc(), "EtudiantEoGestUV","COMMIT" , null);	
			wocomponent().funcAnoncePcb();
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public WOActionResults updatePcbf() {
		/** invocation directe de SQL pour changer la visiblite du paiement par CB */
		String tmpValue = (String) bdgs().valueForKey("pcbf");
		if(tmpValue == null){
			bdgs().put("pcbf", wocomponent().getAnnoncePcb().pcbf());
		}
		try{
			EOUtilities.rawRowsForSQL(edc, "EtudiantEoGestUV",Sql.constructionUpdatePcbVisible(edc(), false, bdgs()), null);
			EOUtilities.rawRowsForSQL(edc, "EtudiantEoGestUV","COMMIT" , null);	
			wocomponent().funcAnoncePcb();
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
