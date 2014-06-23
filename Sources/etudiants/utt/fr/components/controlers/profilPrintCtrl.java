/**
 * 
 */
package etudiants.utt.fr.components.controlers;

import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

import etudiants.utt.fr.components.profilPrint;
import etudiants.utt.fr.roles.LeUser;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.server.exception.FactoryException;
import etudiants.utt.fr.server.process.ProcessGestionCategorie;
import etudiants.utt.fr.server.process.ProcessGestionDiplome;
import etudiants.utt.fr.server.process.ProcessGestionEtudiant;
import etudiants.utt.fr.server.process.ProcessGestionInsUv;
import etudiants.utt.fr.server.process.ProcessGestionParcours;
import etudiants.utt.fr.server.process.ProcessGestionTotal;
import etudiants.utt.fr.server.process.ProcessGestionTotaux;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
@SuppressWarnings("all")
public class profilPrintCtrl extends AComponentCtrl {
	
	public EOEditingContext edc;
	public profilPrint wocomponent;
	public Session sess;
	private LeUser user = new LeUser();
	public NSMutableDictionary unUser = new NSMutableDictionary();
	private Boolean isAutorizedUser;
	private Boolean isAdmin;
	WODisplayGroup dg = new WODisplayGroup();
	NSDictionary bdgs = new NSDictionary();
	
	public profilPrintCtrl(profilPrint aComponent) {
		// TODO Auto-generated constructor stub
		wocomponent = aComponent;
		edc = wocomponent.edc();
		dg = wocomponent.getEtudiantActif();
		sess = (Session) wocomponent.session();
		user = sess.getNewUser();
		unUser = user.leUser();
		NSMutableDictionary bindinds = new NSMutableDictionary();
	}
	
	public Boolean isAutorizedUser() {
		isAutorizedUser = (Boolean) unUser.valueForKey("isAutorized");
		return isAutorizedUser;
	}
	
	public Boolean isAdmin() {
		isAdmin = unUser.valueForKey("role").equals("administrateur")&&isAutorizedUser;
		return isAdmin;
	}
	
	public String pdfName(){
		String pdf = "PV-";
		pdf += sess.getUtilisateur().login()+"-";
		return pdf;
	}
	
	//Display profil pdf
	public void letudiant(){
		if (dg == null) {
			dg = new WODisplayGroup();
			dg.setObjectArray(new NSArray(sess.getEtudiant()));
			dg.queryBindings().setObjectForKey(sess.getEtudiant().primaryKey(),"numero");
		}
		bdgs = dg.queryBindings();
		try {
			NSMutableDictionary etuDico = new NSMutableDictionary();
		etuDico = (NSMutableDictionary) ProcessGestionEtudiant.selectRawRowEtudiants(edc, bdgs).lastObject();
		reWriteDico(etuDico);
		wocomponent.setDicEtudiant(etuDico);
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess.addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess.setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess.addSimpleErrorMessage("FactoryException ",
						alertMessage);
				sess.setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess.addSimpleErrorMessage("RuntimeException ",
					e1.getMessage());
			sess.setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}
	
	public void leDiplome(){
		if (dg == null) {
			dg = new WODisplayGroup();
			dg.setObjectArray(new NSArray(sess.getEtudiant()));
			dg.queryBindings().setObjectForKey(sess.getEtudiant().primaryKey(),"numero");
		}
		bdgs = dg.queryBindings();
		try {
			NSMutableArray diplList = new NSMutableArray();
			diplList = reWriteListDico(ProcessGestionDiplome.selectRawRowDiplome(edc, bdgs));
		wocomponent.setListDiplome(diplList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess.addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess.setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess.addSimpleErrorMessage("FactoryException ",
						alertMessage);
				sess.setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess.addSimpleErrorMessage("RuntimeException ",
					e1.getMessage());
			sess.setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}
	
	public void laCategorie(){
		dg = wocomponent.getEtudiantActif();
		if (dg == null) {
			dg = new WODisplayGroup();
			dg.setObjectArray(new NSArray(sess.getEtudiant()));
			dg.queryBindings().setObjectForKey(sess.getEtudiant().primaryKey(),"numero");
		}
		bdgs = dg.queryBindings();
		try {
			NSMutableArray categList = new NSMutableArray();
			categList = reWriteListDico(ProcessGestionCategorie.selectRawCategorie(edc, bdgs));
		wocomponent.setListCategory(categList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess.addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess.setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess.addSimpleErrorMessage("FactoryException ",
						alertMessage);
				sess.setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess.addSimpleErrorMessage("RuntimeException ",
					e1.getMessage());
			sess.setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}
	
	public void lUV(){
		dg = wocomponent.getEtudiantActif();
		if (dg == null) {
			dg = new WODisplayGroup();
			dg.setObjectArray(new NSArray(sess.getEtudiant()));
			dg.queryBindings().setObjectForKey(sess.getEtudiant().primaryKey(),"numero");
		}
		bdgs = dg.queryBindings();
		try {
			NSMutableArray uvList = new NSMutableArray();
			uvList = reWriteListDico(ProcessGestionInsUv.selectRawRowUV(edc, bdgs));
		wocomponent.setListInsUv(uvList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess.addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess.setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess.addSimpleErrorMessage("FactoryException ",
						alertMessage);
				sess.setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess.addSimpleErrorMessage("RuntimeException ",
					e1.getMessage());
			sess.setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}
	
	public void leParcours(){
		dg = wocomponent.getEtudiantActif();
		if (dg == null) {
			dg = new WODisplayGroup();
			dg.setObjectArray(new NSArray(sess.getEtudiant()));
			dg.queryBindings().setObjectForKey(sess.getEtudiant().primaryKey(),"numero");
		}
		bdgs = dg.queryBindings();
		try {
			NSMutableArray parcList = new NSMutableArray();
			parcList = reWriteListDico(ProcessGestionParcours.selectRawRowParcours(edc, bdgs));
		wocomponent.setListParcours(parcList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess.addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess.setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess.addSimpleErrorMessage("FactoryException ",
						alertMessage);
				sess.setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess.addSimpleErrorMessage("RuntimeException ",
					e1.getMessage());
			sess.setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}
	
	public void leTotal(){
		dg = wocomponent.getEtudiantActif();
		if (dg == null) {
			dg = new WODisplayGroup();
			dg.setObjectArray(new NSArray(sess.getEtudiant()));
			dg.queryBindings().setObjectForKey(sess.getEtudiant().primaryKey(),"numero");
		}
		bdgs = dg.queryBindings();
		try {
		//ProcessEtudiant.selectEtudiants(sess.dataBus(), sess.getEtudiant());
			NSMutableArray totalList = new NSMutableArray();
			totalList = reWriteListDico(ProcessGestionTotal.selectRawRowTotal(edc, bdgs));
		wocomponent.setListTotal(totalList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess.addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess.setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess.addSimpleErrorMessage("FactoryException ",
						alertMessage);
				sess.setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess.addSimpleErrorMessage("RuntimeException ",
					e1.getMessage());
			sess.setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}
	
	public void lesTotaux(){
		dg = wocomponent.getEtudiantActif();
		if (dg == null) {
			dg = new WODisplayGroup();
			dg.setObjectArray(new NSArray(sess.getEtudiant()));
			dg.queryBindings().setObjectForKey(sess.getEtudiant().primaryKey(),"numero");
		}
		bdgs = dg.queryBindings();
		try {
		//ProcessEtudiant.selectEtudiants(sess.dataBus(), sess.getEtudiant());
			NSMutableArray totauxList = new NSMutableArray();
			totauxList = reWriteListDico(ProcessGestionTotaux.selectRawRowTotaux(edc, bdgs));
		wocomponent.setListTotaux(totauxList.immutableClone());
		} catch (FactoryException e) {
			String alertMessage = e.getMessageFormatte();
			if (e.isBloquant()) {
				if (e.isInformatif()) {
					// Exception contenant un message d'information pour
					// l'utilisateur
					sess.addSimpleErrorMessage(
							"message d'information pour l'utilisateur",
							alertMessage);
					sess.setMessageErreur(alertMessage);
				} else {
					e.printStackTrace();
					throw e;
				}
			} else {
				sess.addSimpleErrorMessage("FactoryException ",
						alertMessage);
				sess.setMessageErreur(alertMessage);
			}

		} catch (RuntimeException e1) {
			sess.addSimpleErrorMessage("RuntimeException ",
					e1.getMessage());
			sess.setMessageErreur(e1.getMessage());
			e1.printStackTrace();
			throw e1;
		}
	}
	
	protected void querry(NSArray list){
		for(int i=0; i<list.count();i++){
			dg.queryBindings().setObjectForKey(list.objectAtIndex(i),"diplome"+i);
		}
	}
	//End display profil pdf
	//Dictionnary Null value decoder
		protected NSMutableArray reWriteListDico(NSArray dicoList){
			NSMutableArray  listDico = new NSMutableArray();
			for(int j=0; j < dicoList.count(); j++){
				NSMutableDictionary tinyDico = new NSMutableDictionary();
				tinyDico = (NSMutableDictionary) dicoList.objectAtIndex(j);
				reWriteDico(tinyDico);
				listDico.addObject(tinyDico);
			}
			return listDico;
		}
		
		protected void reWriteDico (NSMutableDictionary dico){
			for(int i=0;i<dico.size();i++){
				Object value = dico.allValues().objectAtIndex(i);
				if(value.equals(NSKeyValueCoding.NullValue)){
					String key = (String) dico.allKeys().objectAtIndex(i);
					dico.setObjectForKey("",key);
					//NSLog.out.appendln(dico);
				}
			}
		}
		
		protected String decode(Object obj) {
			String key = obj.toString().substring(1);
			String key2 = key.substring(0, key.length()-1);
			String decodedValue = key2.substring(key2.length()-4);
			if (decodedValue.equals("Null")) {
				return null;
			} else {
				return obj.toString();
			}
		}
		//End Decoder

}
