/*******************************************************************************
 * DOSSIER-ETUDIANT
 * Copyright UNIVERSITE DE TECHNOLOGIE DE TROYES - CEDRE (www.utt.fr), since 1993 
 * This software is governed by the CeCILL license under French law and abiding by the
 * rules of distribution of free software. You can use, modify and/or 
 * redistribute the software under the terms of the CeCILL license as 
 * circulated by CEA, CNRS and INRIA at the following URL 
 * "http://www.cecill.info". 
 * As a counterpart to the access to the source code and rights to copy, modify 
 * and redistribute granted by the license, users are provided only with a 
 * limited warranty and the software's author, the holder of the economic 
 * rights, and the successive licensors have only limited liability. In this 
 * respect, the user's attention is drawn to the risks associated with loading,
 * using, modifying and/or developing or reproducing the software by the user 
 * in light of its specific status of free software, that may mean that it
 * is complicated to manipulate, and that also therefore means that it is 
 * reserved for developers and experienced professionals having in-depth
 * computer knowledge. Users are therefore encouraged to load and test the 
 * software's suitability as regards their requirements in conditions enabling
 * the security of their systems and/or data to be ensured and, more generally, 
 * to use and operate it in the same conditions as regards security. The
 * fact that you are presently reading this means that you have had knowledge 
 * of the CeCILL license and that you accept its terms.
 * 
 * Do not remove this copyright message
 ******************************************************************************/
package etudiants.utt.fr.components.controlers;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

import etudiants.utt.fr.components.Extractions;
import etudiants.utt.fr.eo.EOVuePeriodeParam;
import etudiants.utt.fr.roles.LeUser;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.sql.ExtractionSqlProcRun;
import etudiants.utt.fr.util.StringOperation;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */

@SuppressWarnings("all")
public class ExtractionCtrl extends AComponentCtrl {
	
	private EOEditingContext edc;
	private Session sess;
	private Extractions wocomponent;
	private LeUser user;
	private NSMutableDictionary unUser;
	private Boolean isAutorizedUser;
	private Boolean isAdmin;
	private NSArray periodes = new NSArray();
	private NSArray diplomes = new NSArray();
	private NSArray diplomesRespUv = new NSArray();
	private NSArray niveauxRespUv = new NSArray();
	private NSArray niveau = new NSArray();
	private NSArray uvs = new NSArray();
	private NSArray annees = new NSArray();
	public static ExtractionSqlProcRun procRun;
	
	public ExtractionCtrl() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public ExtractionCtrl(Extractions aComponent) {
		// TODO Auto-generated method stub
		setWocomponent(aComponent);
		setUser(wocomponent().user());
		setUnUser(user().leUser());
		procRun = new ExtractionSqlProcRun();
		sess().setPeriodeCourante((NSMutableDictionary) procRun.selectRawRowPeriodeCourante(edc()).lastObject());
		sess().setAnneeCourante((NSMutableDictionary) procRun.selectRawRowAnneeCourante(edc()).lastObject());
		setNiveau(procRun.niveau());
		periodes();
		setDiplomes(reWriteListDico(procRun.selectRawRowRecupDilSpec(edc())));
		setDiplomesRespUv(reWriteListDico(procRun.selectRawRowDiplomeRespUv(edc())));
		setUvs(reWriteListDico(procRun.selectRawRowRefUv(edc())));
		setNiveauxRespUv(reWriteListDico(procRun.selectRawRowNiveauxRespUv(edc())));
		annee();
	}
	
	public Boolean isAutorizedUser() {
		isAutorizedUser = (Boolean) unUser().valueForKey(StringOperation.AUTORIZED);
		return isAutorizedUser;
	}
	
	public Boolean isAdmin() {
		isAdmin = unUser().valueForKey(StringOperation.ROLE).equals(StringOperation.ADMINISTRATEUR)&&isAutorizedUser();
		return isAdmin;
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
	 * @return the wocomponent
	 */
	public Extractions wocomponent() {
		return wocomponent;
	}

	/**
	 * @param wocomponent the wocomponent to set
	 */
	public void setWocomponent(Extractions wocomponent) {
		this.wocomponent = wocomponent;
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
	 * @return the periodes
	 */
	public NSArray getPeriodes() {
		return periodes;
	}

	/**
	 * @param periodes the periodes to set
	 */
	public void setPeriodes(NSArray periodes) {
		this.periodes = periodes;
	}

	/**
	 * @return the diplomes
	 */
	public NSArray getDiplomes() {
		return diplomes;
	}

	/**
	 * @param diplomes the diplomes to set
	 */
	public void setDiplomes(NSArray diplomes) {
		this.diplomes = diplomes;
	}

	/**
	 * @return the diplomesRespUv
	 */
	public NSArray getDiplomesRespUv() {
		return diplomesRespUv;
	}

	/**
	 * @param diplomesRespUv the diplomesRespUv to set
	 */
	public void setDiplomesRespUv(NSArray diplomesRespUv) {
		this.diplomesRespUv = diplomesRespUv;
	}

	/**
	 * @return the niveauxRespUv
	 */
	public NSArray getNiveauxRespUv() {
		return niveauxRespUv;
	}

	/**
	 * @param niveauxRespUv the niveauxRespUv to set
	 */
	public void setNiveauxRespUv(NSArray niveauxRespUv) {
		this.niveauxRespUv = niveauxRespUv;
	}

	/**
	 * @return the niveau
	 */
	public NSArray getNiveau() {
		return niveau;
	}

	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(NSArray niveau) {
		this.niveau = niveau;
	}

	/**
	 * @return the uvs
	 */
	public NSArray getUvs() {
		return uvs;
	}

	/**
	 * @param uvs the uvs to set
	 */
	public void setUvs(NSArray uvs) {
		this.uvs = uvs;
	}

	/**
	 * @return the annees
	 */
	public NSArray getAnnees() {
		return annees;
	}

	/**
	 * @param annees the annees to set
	 */
	public void setAnnees(NSArray annees) {
		this.annees = annees;
	}

	protected void periodes(){
		setPeriodes(reWriteListDico(procRun.selectRawRowRefPeriode(edc())));
		String period = (String) sess().getPeriodeCourante().valueForKey("PERIODE");
		for(int i=0; getPeriodes().count() > i; i++){
			String pper = (String) ((NSMutableDictionary)getPeriodes().objectAtIndex(i)).valueForKey("ANPRD_UNIV");
			if(pper.equals(period)){
				NSMutableDictionary dicP = (NSMutableDictionary) getPeriodes().objectAtIndex(i);
				wocomponent().setPeriodeSelect(dicP);;
				wocomponent().setPeriodeUvpSelect(dicP);
				wocomponent().setPeriodeEtup1Select(dicP);
				wocomponent().setPeriodeEtup2Select(dicP);
				wocomponent().setPeriodeInsUvSelect(dicP);
				wocomponent().setPeriodeJury1Select(dicP);
				wocomponent().setPeriodeJury2Select(dicP);
				wocomponent().setPeriodeJuryApSelect(dicP);
			    break;
			}
		}
	}
	
	protected void annee(){
		setAnnees(reWriteListDico(procRun.selectRawRowRefAnnee(edc())));
		String defaut = (String) sess().getAnneeCourante().valueForKey("DEFAUT");
		for(int i=0; i < getAnnees().count(); i++){
			String ann = (String) ((NSMutableDictionary)getAnnees().objectAtIndex(i)).valueForKey("AN_VALEUR");
			if(ann.equals(defaut)){
				NSMutableDictionary dicAn = (NSMutableDictionary) getAnnees().objectAtIndex(i);
				wocomponent().setAnneeInsp1Select(dicAn);
				wocomponent().setAnneeInsp2Select(dicAn);
				break;
			}
		}
	}
		// Dictionnary Null value decoder
		protected NSMutableArray reWriteListDico(NSArray dicoList) {
			NSMutableArray listDico = new NSMutableArray();
			for (int j = 0; j < dicoList.count(); j++) {
				NSMutableDictionary tinyDico = new NSMutableDictionary();
				tinyDico = (NSMutableDictionary) dicoList.objectAtIndex(j);
				if(tinyDico.containsKey("NIVEAU")) {
					Integer innit = ((Double)tinyDico.valueForKey("NIVEAU")).intValue();
					tinyDico.setObjectForKey(innit, "NIVEAU");
				}
				reWriteDico(tinyDico);
				listDico.addObject(tinyDico);
			}
			return listDico;
		}

		protected void reWriteDico(NSMutableDictionary dico) {
			for (int i = 0; i < dico.size(); i++) {
				Object value = dico.allValues().objectAtIndex(i);
				if (value.equals(NSKeyValueCoding.NullValue)) {
					String key = (String) dico.allKeys().objectAtIndex(i);
					dico.setObjectForKey("", key);
					// NSLog.out.appendln(dico);
				}
			}
		}
		//END Decode

}
