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
package etudiants.utt.fr.eo;

import er.extensions.eof.ERXEC;
import er.extensions.eof.ERXKey;
import er.extensions.qualifiers.ERXKeyValueQualifier;
import etudiants.utt.fr.components.Recherche;
import etudiants.utt.fr.server.Application;
import etudiants.utt.fr.server.Session;
import etudiants.utt.fr.sql.EditionSQL;
import etudiants.utt.fr.util.StringOperation;
import gestionuv.utt.fr.eo.EOUvOuv;
import gestionuv.utt.fr.eo.EOVueInsuv;
import gestionuv.utt.fr.eo.EOVueUvsPeriode;
import org.apache.log4j.Logger;
import org.login.fwkloginwebapp.common.metier.EOUtilAppliCibleAct;
import org.login.fwkloginwebapp.common.util.StringCtrl;

import com.webobjects.appserver.WOApplication;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOAndQualifier;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOOrQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOQualifierVariable;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

@SuppressWarnings("all")
public class EOIndividu extends _EOIndividu {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5812982879122485011L;
	private static Logger log = Logger.getLogger(EOIndividu.class);
	private static Session sess = new Session();

	public static String ETAT_VALIDE = "VALIDE";
	public static String ETAT_SUPPRIME = "SUPPRIME";
	public static EditionSQL sql = new EditionSQL();
	// ORDER BY sur l'ID
	public static final EOSortOrdering SORT_ID_ASC = EOSortOrdering
			.sortOrderingWithKey("indivId", EOSortOrdering.CompareAscending);
	// ORDER BY sur le NOM
	public static final EOSortOrdering SORT_NOM_ASC = EOSortOrdering
			.sortOrderingWithKey("nom", EOSortOrdering.CompareAscending);
	// ORDER BY sur le PRENOM
	public static final EOSortOrdering SORT_PRENOM_ASC = EOSortOrdering
			.sortOrderingWithKey("prenom", EOSortOrdering.CompareAscending);

	public static final NSMutableArray ARGSUV = new NSMutableArray();
	public static String ANUNIV = null;
	public static String PRDUNIV = null;
	private NSDictionary dataEtudiant;
	private NSDictionary dataIndividu;

	public EOIndividu() {
		// TODO Auto-generated constructor stub
	}
	
	public static Application myApp() {
		return (Application) WOApplication.application();
	}

	/**
	 * @return the dataEtudiant
	 */
	public NSDictionary getDataEtudiant() {
		return dataEtudiant;
	}

	/**
	 * @param dataEtudiant
	 *            the dataEtudiant to set
	 */
	public void setDataEtudiant(NSDictionary dataEtudiant) {
		this.dataEtudiant = dataEtudiant;
	}

	/**
	 * @return the dataIndividu
	 */
	public NSDictionary getDataIndividu() {
		return dataIndividu;
	}

	/**
	 * @param dataIndividu
	 *            the dataIndividu to set
	 */
	public void setDataIndividu(NSDictionary dataIndividu) {
		this.dataIndividu = dataIndividu;
	}

	/**
	 * @return the sess
	 */
	public Session getSess() {
		return sess;
	}

	/**
	 * @param sess
	 *            the sess to set
	 */
	public void setSess(Session sess) {
		this.sess = sess;
	}

	public boolean isValide() {
		return true;
	}

	public static boolean isEtudiant(EOEditingContext myContext,
			EOIndividu aIndividu) {
		boolean isEtudiant = false;
		NSArray etudiants = null;
		if (aIndividu != null) {
			etudiants = lesEtudiants(myContext, aIndividu);
		}
		return !etudiants.isEmpty();
	}

	// Affichage Nom, Prénom
	public String nomAndPrenom() {
		return nom() + " " + prenom();
	}

	// Numero de sécurité social
	public String numSecu() {
		return nni() + " " + nniCle();
	}

	// Vérification afin de savoir si le user connecté est conseillé d'un
	// étudiant
	public static NSArray lesConseillers(EOEditingContext myContext,
			String conseil) {
		NSArray cons = new NSArray();
		if (conseil != null) {
			EOQualifier qalCons = ETU_INSCR_ADMS.dot(
					EOEtudiantInscrAdm.CONSEILLER_ID).eq(Long.valueOf(conseil));
			EOFetchSpecification spec = new EOFetchSpecification("EOIndividu",
					qalCons, new NSArray(new Object[] { SORT_NOM_ASC,
							SORT_PRENOM_ASC }));
			spec.setUsesDistinct(true);
			cons = myContext.objectsWithFetchSpecification(spec);
		}
		return cons;
	}

	// Vérification afin de savoir si le user connecté est un étudiant
	private static NSArray lesEtudiants(EOEditingContext myContext,
			EOIndividu etudiant) {
		EOQualifier qalCons = ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.ETU_ID).eq(
				etudiant.indivId());
		EOFetchSpecification spec = new EOFetchSpecification("EOIndividu",
				qalCons, new NSArray(new Object[] { SORT_NOM_ASC,
						SORT_PRENOM_ASC }));
		spec.setUsesDistinct(true);
		NSArray etu = myContext.objectsWithFetchSpecification(spec);
		return etu;
	}

	/** Qualifier conditionner */
	// CLAUSE WHERE "NOM LIKE ..."
	private static EOQualifier qualForNomLike(String nom) {
		String nom_b = StringCtrl.chaineSansAccents(nom, "?").toUpperCase();
		// EOQualifier quaNom =
		// EOQualifier.qualifierWithQualifierFormat(StringCtrl.chaineSansAccents(NOM_KEY)+" LIKE %@",
		// new NSArray(nom_b));
		// return quaNom;
		return NOM.ilike(nom_b);
	}

	private static EOQualifier qualForNomNaisLike(String nom) {
		String nom_b = StringCtrl.chaineSansAccents(nom, "?").toUpperCase();
		// EOQualifier quaNom =
		// EOQualifier.qualifierWithQualifierFormat(StringCtrl.chaineSansAccents(NOM_KEY)+" LIKE %@",
		// new NSArray(nom_b));
		// return quaNom;
		return NOM_NAIS.ilike(nom_b);
	}

	// CLAUSE WHERE "PRENOM LIKE ..."
	private static EOQualifier qualForPrenomLike(String prenom) {
		// String prenom_a = StringCtrl.chaineSansAccents(prenom,
		// "?").toUpperCase();
		// EOQualifier quaPrenom =
		// EOQualifier.qualifierWithQualifierFormat(PRENOM_KEY+" LIKE %@", new
		// NSArray(prenom));
		// return quaPrenom;
		return PRENOM.ilike(prenom);
	}

	// CLAUSE WHERE "ANUNIV||PRDUNIV = ..."
	private static EOQualifier qualForPeriode(String periode) {
		NSMutableArray args = new NSMutableArray();
		int y = periode.length();
		if (y == 5) {
			ANUNIV = periode.substring(0, y - 1);
			PRDUNIV = periode.substring(y - 1, y);
		}
		if (y == 6) {
			ANUNIV = periode.substring(0, y - 2);
			PRDUNIV = periode.substring(y - 2, y);
		}
		args.addObject(ANUNIV);
		args.addObject(PRDUNIV);
		ARGSUV.addObject(ANUNIV);
		ARGSUV.addObject(PRDUNIV);
		return ETU_INSCR_ADMS
				.dot(EOEtudiantInscrAdm.AN_UNIV)
				.eq(ANUNIV)
				.and(ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.PRD_UNIV)
						.eq(PRDUNIV));
	}

	// CLAUSE WHERE "EIA.DIPLOMEC = ..." Diplôme non soumis à une période
	private static EOQualifier qualDiplome(String diplome) {
		return ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.DIPLOMEC).eq(diplome);
		// return new EOKeyValueQualifier("etuInscrAdms.diplomec",
		// EOQualifier.QualifierOperatorEqual, diplome);
	}

	// CLAUSE WHERE "EIA.DIPLOMEC = ..." Diplôme soumis à une période
	private static EOQualifier qualPrdDiplome(String prdDiplome) {
		return ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.DIPLOMEC).eq(prdDiplome);
	}

	// CLAUSE WHERE "EIA.NIVEAUADM = ..." Niveau non Master
	private static EOQualifier qualNonMST(String niveau) {
		NSMutableArray lNiveau = new NSMutableArray();
		String checkIt = niveau;
		if (checkIt.length() == 8) {
			checkIt = checkIt.substring(5);
		} else {
			checkIt = checkIt.substring(1);
		}
		int z = niveau.length();
		if (stringContains(checkIt, "-M1") || stringContains(checkIt, "-M2")) {
			if (stringContains(checkIt, "-M1")) {
				lNiveau = new NSMutableArray();
				String pSpec = null;
				String pSpeci = niveau.substring(0, z - 1);
				if (z == 5) {
					pSpec = pSpeci.substring(0, pSpeci.length() - 2).trim();
				} else if (z == 6) {
					pSpec = pSpeci.substring(0, pSpeci.length() - 3).trim();
				} else {
					pSpec = pSpeci.substring(0, z - 5).trim();
				}
				// lNiveau.addObject(pSpec);
				lNiveau.addObject("1");
				lNiveau.addObject("2");
				return ETU_INSCR_ADMS
						.dot(EOEtudiantInscrAdm.DIPL_SPECC)
						.eq(pSpec)
						.and(ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.NIVEAU_ADM)
								.in(lNiveau));
			} else if (stringContains(checkIt, "-M2")) {
				lNiveau = new NSMutableArray();
				String pSpec = null;
				String pSpeci = niveau.substring(0, z - 1);
				if (z == 5) {
					pSpec = pSpeci.substring(0, pSpeci.length() - 2).trim();
				} else if (z == 6) {
					pSpec = pSpeci.substring(0, pSpeci.length() - 3).trim();
				} else {
					pSpec = pSpeci.substring(0, z - 5).trim();
				}
				// lNiveau.addObject(pSpec);
				lNiveau.addObject("3");
				lNiveau.addObject("4");
				lNiveau.addObject("5");
				return ETU_INSCR_ADMS
						.dot(EOEtudiantInscrAdm.DIPL_SPECC)
						.eq(pSpec)
						.and(ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.NIVEAU_ADM)
								.in(lNiveau));
			}
		} else {
			if (stringContains(niveau, "M1") || stringContains(niveau, "M2")) {
				if (stringContains(niveau, "M1")) {
					lNiveau = new NSMutableArray();
					lNiveau.addObject('1');
					lNiveau.addObject('2');
					return ETU_INSCR_ADMS
							.dot(EOEtudiantInscrAdm.NIVEAU_ADM)
							.eq("1")
							.or(ETU_INSCR_ADMS.dot(
									EOEtudiantInscrAdm.NIVEAU_ADM).eq("2"));
				} else if (stringContains(niveau, "M2")) {
					lNiveau = new NSMutableArray();
					lNiveau.addObject("3");
					lNiveau.addObject("4");
					lNiveau.addObject("5");
					return ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.NIVEAU_ADM)
							.in(lNiveau);
				}
			} else {
				lNiveau = new NSMutableArray();
				String pSpec = null;
				String pniveau = null;
				String pSpeci = niveau.substring(0, z - 1);
				if (z == 5) {
					pSpec = pSpeci.substring(0, pSpeci.length() - 1).trim();
					pniveau = niveau.substring(z - 2, z);
				} else if (z == 6) {
					pSpec = pSpeci.substring(0, pSpeci.length() - 2).trim();
					pniveau = niveau.substring(z - 3, z);
				} else if (z == 8) {
					pSpec = pSpeci.substring(0, z - 5).trim();
					pniveau = niveau.substring(z - 4, z);
				} else {
					pSpec = pSpeci;
					pniveau = niveau.substring(z - 1, z);
				}
				lNiveau.addObject(pSpec);
				lNiveau.addObject(pniveau);
				return ETU_INSCR_ADMS
						.dot(EOEtudiantInscrAdm.DIPL_SPECC)
						.eq(pSpec)
						.and(ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.NIVEAU_ADM)
								.eq(pniveau));
			}
		}
		String pSpec = null;
		String pSpeci = niveau.substring(0, z - 1);
		if (z == 5) {
			pSpec = pSpeci.substring(0, pSpeci.length() - 2).trim();
		} else if (z == 6) {
			pSpec = pSpeci.substring(0, pSpeci.length() - 3).trim();
		} else {
			pSpec = pSpeci.substring(0, z - 5).trim();
		}
		String pniveau = niveau.substring(z - 1, z);
		lNiveau.addObject(pSpec);
		lNiveau.addObject(pniveau);
		return ETU_INSCR_ADMS
				.dot(EOEtudiantInscrAdm.DIPL_SPECC)
				.eq(pSpec)
				.and(ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.NIVEAU_ADM).eq(
						pniveau));
	}

	// CLAUSE WHERE "EIA.NIVEAUADM = ..." Niveau Master
	private static EOQualifier qualMST(String niveau, String diplome,
			String prdDiplome) {
		NSMutableArray lNiveau = new NSMutableArray();
		String checkIt = niveau;
		checkIt = checkIt.substring(5);
		int z = niveau.length();
		if (stringContains(checkIt, "-M1") || stringContains(checkIt, "-M2")) {
			if (stringContains(checkIt, "-M1")) {
				lNiveau = new NSMutableArray();
				String pSpec = null;
				String pSpeci = niveau.substring(0, z - 1);
				if (z == 5) {
					pSpec = pSpeci.substring(0, pSpeci.length() - 2).trim();
				} else if (z == 6) {
					pSpec = pSpeci.substring(0, pSpeci.length() - 3).trim();
				} else {
					pSpec = pSpeci.substring(0, z - 5).trim();
				}
				lNiveau.addObject(pSpec);
				lNiveau.addObject("1");
				lNiveau.addObject("2");
				return ETU_INSCR_ADMS
						.dot(EOEtudiantInscrAdm.DIPL_SPECC)
						.eq(pSpec)
						.and(ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.NIVEAU_ADM)
								.in(lNiveau));
			} else if (stringContains(checkIt, "-M2")) {
				lNiveau = new NSMutableArray();
				String pSpec = null;
				String pSpeci = niveau.substring(0, z - 1);
				if (z == 5) {
					pSpec = pSpeci.substring(0, pSpeci.length() - 2).trim();
				} else if (z == 6) {
					pSpec = pSpeci.substring(0, pSpeci.length() - 3).trim();
				} else {
					pSpec = pSpeci.substring(0, z - 5).trim();
				}
				lNiveau.addObject("3");
				lNiveau.addObject("4");
				lNiveau.addObject("5");
				return ETU_INSCR_ADMS
						.dot(EOEtudiantInscrAdm.DIPL_SPECC)
						.eq(pSpec)
						.and(ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.NIVEAU_ADM)
								.in(lNiveau));
			}
		} else {
			if (stringContains(niveau, "M1") || stringContains(niveau, "M2")) {
				if (stringContains(niveau, "M1")) {
					lNiveau = new NSMutableArray();
					lNiveau.addObject("1");
					lNiveau.addObject("2");
					return ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.NIVEAU_ADM)
							.in(lNiveau);
				} else if (stringContains(niveau, "M2")) {
					lNiveau = new NSMutableArray();
					lNiveau.addObject("3");
					lNiveau.addObject("4");
					lNiveau.addObject("5");
					return ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.NIVEAU_ADM)
							.in(lNiveau);
				}
			} else {

				if ((diplome != null && diplome.equals("MST"))
						|| (prdDiplome != null && prdDiplome.equals("MST"))) {
					EOQualifier qualOpt = null;
					lNiveau = new NSMutableArray();
					String pSpec = null;
					String diplopt = null;
					String pSpeci = niveau.substring(0, z - 1);
					if (z == 5) {
						pSpec = pSpeci.substring(0, pSpeci.length() - 2).trim();
						diplopt = pSpeci.substring(pSpeci.length() - 2,
								pSpeci.length()).trim();
						if (diplopt.equals("**")) {
							diplopt = " ";
						}
					} else if (z == 6) {
						pSpec = pSpeci.substring(0, pSpeci.length() - 3).trim();
						diplopt = pSpeci.substring(pSpeci.length() - 3,
								pSpeci.length()).trim();
						if (diplopt.equals("**")) {
							diplopt = " ";
						}
					} else {
						pSpec = pSpeci.substring(0, z - 5).trim();
						diplopt = pSpeci.substring(z - 5, pSpeci.length())
								.trim();
						if (diplopt.equals("**")) {
							diplopt = null;
						}
					}
					String pniveau = niveau.substring(z - 1, z);
					lNiveau.addObject(pSpec);
					if (!diplopt.equals(" ") || diplopt != null) {
						lNiveau.addObject(diplopt);
						qualOpt = new EOKeyValueQualifier(
								"etuInscrAdms.diplOptc",
								EOQualifier.QualifierOperatorEqual, diplopt);
					} else {
						qualOpt = new EOKeyValueQualifier(
								"etuInscrAdms.diplOptc",
								EOQualifier.QualifierOperatorEqual,
								NSKeyValueCoding.NullValue);
					}
					lNiveau.addObject(pniveau);
					NSMutableArray qualfin = new NSMutableArray();
					EOQualifier qualSpec = new EOKeyValueQualifier(
							"etuInscrAdms.diplSpecc",
							EOQualifier.QualifierOperatorEqual, pSpec);
					EOQualifier qualNvieau = new EOKeyValueQualifier(
							"etuInscrAdms.niveauAdm",
							EOQualifier.QualifierOperatorEqual, pniveau);
					qualfin.addObject(qualSpec);
					qualfin.addObject(qualOpt);
					qualfin.addObject(qualNvieau);
					return new EOAndQualifier(qualfin);

				} else {
					lNiveau = new NSMutableArray();
					String pSpec = null;
					String pSpeci = niveau.substring(0, z - 1);
					if (z == 5) {
						pSpec = pSpeci.substring(0, pSpeci.length() - 2).trim();
					} else if (z == 6) {
						pSpec = pSpeci.substring(0, pSpeci.length() - 3).trim();
					} else {
						pSpec = pSpeci.substring(0, z - 5).trim();
					}
					String pniveau = niveau.substring(z - 1, z);
					lNiveau.addObject(pSpec);
					lNiveau.addObject(pniveau);
					return ETU_INSCR_ADMS
							.dot(EOEtudiantInscrAdm.DIPL_SPECC)
							.eq(pSpec)
							.and(ETU_INSCR_ADMS.dot(
									EOEtudiantInscrAdm.NIVEAU_ADM).eq(pniveau));
				}
			}
		}
		String pSpec = null;
		String pSpeci = niveau.substring(0, z - 1);
		if (z == 5) {
			pSpec = pSpeci.substring(0, pSpeci.length() - 2).trim();
		} else if (z == 6) {
			pSpec = pSpeci.substring(0, pSpeci.length() - 3).trim();
		} else {
			pSpec = pSpeci.substring(0, z - 5).trim();
		}
		String pniveau = niveau.substring(z - 1, z);
		lNiveau.addObject(pSpec);
		lNiveau.addObject(pniveau);
		return ETU_INSCR_ADMS
				.dot(EOEtudiantInscrAdm.DIPL_SPECC)
				.eq(pSpec)
				.and(ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.NIVEAU_ADM).eq(
						pniveau));
	}

	// CLAUSE WHERE "EIA.ETUID = ..." Recherche d'un étudiant
	private static EOQualifier qualNumero(String numero) {
		Long nombre = Long.parseLong(numero);
		return ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.ETU_ID).eq(nombre);
		// return new EOKeyValueQualifier("etuInscrAdms.etuId",
		// EOQualifier.QualifierOperatorEqual, nombre);
	}

	// CLAUSE WHERE "UV.ANUNIV || UV.PRDUNIV = ... AND UV.UVC = ...
	// AND UV.ANUNIV || UV.PRDUNIV = EIA.ANUNIV || EIA.PRDUNIV" UV où est
	// inscris l'étudiant
	private static EOQualifier qualForUv(String uv, String periode) {
		// ARGSUV.addObject(uv);
		NSMutableArray quals = new NSMutableArray();
		EOEditingContext myContext = ERXEC.newEditingContext();
		EOQualifier qalUv = EOVueInsuv.UVC.eq(uv).and(
				EOVueInsuv.EO_ETUDIANT_INSCR_ADM.dot(EOEtudiantInscrAdm.ETU_ID)
						.eq(EOVueInsuv.ETU_ID));
		quals.addObject(qalUv);
		if (periode != null) {
			EOQualifier qualPer = EOQualifier.qualifierWithQualifierFormat(
					"anUniv=%@ AND prdUniv=%@", ARGSUV);
			quals.addObject(qualPer);
		}
		EOFetchSpecification spec = null;
		if (quals.count() == 2) {
			EOQualifier qual = new EOAndQualifier(quals);
			spec = new EOFetchSpecification("EOVueInsuv", qual, null);
		} else {
			spec = new EOFetchSpecification("EOVueInsuv", qalUv, null);
		}
		spec.setUsesDistinct(true);
		NSArray uvs = myContext.objectsWithFetchSpecification(spec);
		NSMutableArray etuids = new NSMutableArray();
		for (int i = 0; i < uvs.count(); i++) {
			EOVueInsuv luv = (EOVueInsuv) uvs.objectAtIndex(i);
			Long etu_id = luv.etuId();
			etuids.addObject(etu_id);
		}
		EOQualifier fin = ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.ETU_ID).in(
				etuids.immutableClone());
		return fin;
	}

	// CLAUSE WHERE "EIA.Conseiller_ID = ..." Conseiller de l'étudiant
	private static EOQualifier qualForConseiller(EOEditingContext myContext,
			String conseil) {
		String periode = null;
		NSMutableDictionary tmpper = (NSMutableDictionary) reWriteListDico(
				selectRawRowcourant(myContext)).lastObject();
		periode = (String) tmpper.valueForKey("PERIODE");
		int y = periode.length();
		if (y == 5) {
			ANUNIV = periode.substring(0, y - 1);
			PRDUNIV = periode.substring(y - 1, y);
		}
		if (y == 6) {
			ANUNIV = periode.substring(0, y - 2);
			PRDUNIV = periode.substring(y - 2, y);
		}
		return ETU_INSCR_ADMS
				.dot(EOEtudiantInscrAdm.CONSEILLER_ID)
				.eq(Long.valueOf(conseil))
				.and(ETU_INSCR_ADMS
						.dot(EOEtudiantInscrAdm.AN_UNIV)
						.eq(ANUNIV)
						.and(ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.PRD_UNIV)
								.eq(PRDUNIV)));
		// return new EOKeyValueQualifier("etuInscrAdms.conseillerId",
		// EOQualifier.QualifierOperatorEqual, Long.valueOf((conseil)));
	}

	/**
	 * Jointures par défaut suite aux clés étrangères entre les différentes
	 * tables
	 */

	// JOINTURE SUR INDMAILS
	private static EOQualifier typeEmail1() {
		return new EOKeyValueQualifier("indEmails.emailTypec",
				EOQualifier.QualifierOperatorEqual, "UTT");
	}

	private static EOQualifier typeEmail() {
		EOQualifier mail = INDIV_ID.eq(IND_EMAILS.dot(EOIndEmail.INDIV_ID))
				.and(IND_EMAILS.dot(EOIndEmail.EMAIL_TYPEC).eq("UTT"));
		return mail;
	}

	// JOINTURE SUR LA CIVILITE
	private static EOQualifier qualCivilite1() {
		return new EOKeyValueQualifier("refCivilite.civilitec",
				EOQualifier.QualifierOperatorNotEqual,
				NSKeyValueCoding.NullValue);
	}

	private static EOQualifier qualCivilite() {
		EOQualifier civilite = CIVILITEC.eq(REF_CIVILITE
				.dot(EORefCivilite.CIVILITEC));
		return civilite;
	}

	// JOINTURE SUR L'EIA
	private static EOQualifier qualEia1() {
		return new EOKeyValueQualifier("etuInscrAdms.etuId",
				EOQualifier.QualifierOperatorNotEqual,
				NSKeyValueCoding.NullValue);
	}

	private static EOQualifier qualEia() {
		EOAndQualifier and = null;
		NSMutableArray qua = new NSMutableArray();
		ERXKeyValueQualifier PERS_UV = null;
		if(myApp().persUv()){
			PERS_UV = ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.DIPL_SPECC).isNot("03");
			qua.add(PERS_UV);
		}
		EOQualifier eia = INDIV_ID
				.eq(ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.ETU_ID))
				.and(ETU_INSCR_ADMS.dot(EOEtudiantInscrAdm.ETU_ID).eq(
						IND_EMAILS.dot(EOIndEmail.INDIV_ID)));
		if(PERS_UV != null) {
			qua.add(eia);
			and = new EOAndQualifier(qua);
			return and; 
		}
		return eia;
	}

	private static EOQualifier refMail() {
		return new EOKeyValueQualifier("indEmails.indivId",
				EOQualifier.QualifierOperatorNotEqual,
				NSKeyValueCoding.NullValue);
	}

	// SELECT sur la vue parcours des etudiants
	private static NSArray<String> preFetch() {
		NSMutableArray preFetching = new NSMutableArray();
		preFetching.addObject("eoVueAfficherparcourses");
		preFetching.addObject("mineurs");
		preFetching.addObject("refCivilite");
		preFetching.addObject("indEmails");
		preFetching.addObject("etudiants1");
		preFetching.addObject("etuInscrAdms");
		return preFetching.immutableClone();
	}

	// SELECT des étudiants non master
	public static NSArray EtudiantsNonMST(EOEditingContext myContext,
			NSDictionary bindinds, Recherche searchMsg) {
		String periode = (String) bindinds.valueForKey("periode");
		String diplome = (String) bindinds.valueForKey("diplome");
		String prdDiplome = (String) bindinds.valueForKey("prdDiplome");
		String niveau = (String) bindinds.valueForKey("niveau");
		String uv = (String) bindinds.valueForKey("uv");
		String nom = (String) bindinds.valueForKey("nom");
		String prenom = (String) bindinds.valueForKey("prenom");
		String numero = (String) bindinds.valueForKey("numero");
		String idConseiller = (String) bindinds.valueForKey("idConseiller");
		NSMutableArray quals = new NSMutableArray();
		quals.addObject(typeEmail());
		quals.addObject(qualCivilite());
		quals.addObject(qualEia());
		// quals.addObject(refMail());
		if ((StringCtrl.isEmpty(nom)) && (StringCtrl.isEmpty(prenom))
				&& ((StringCtrl.isEmpty(numero)))
				&& (periode == null || (StringCtrl.isEmpty(periode)))
				&& (diplome == null || (StringCtrl.isEmpty(diplome)))
				&& (niveau == null || (StringCtrl.isEmpty(niveau)))
				&& (uv == null || (StringCtrl.isEmpty(uv)))
				&& ((StringCtrl.isEmpty(idConseiller)))) {
			searchMsg
					.setSearchMsg("Veuillez affiner la recherche, trop de données remontées");
			return NSArray.EmptyArray;
		}
		if (lesConseillers(myContext, idConseiller).count() != 0) {
			quals.addObject(qualForConseiller(myContext, idConseiller));
		} else {
			if (!(StringCtrl.isEmpty(nom))) {
				NSMutableArray qua = new NSMutableArray();
				qua.addObject(qualForNomLike(nom));
				qua.addObject(qualForNomNaisLike(nom));
				EOQualifier nor = new EOOrQualifier(qua);
				quals.addObject(nor);
			}
			if (!(StringCtrl.isEmpty(prenom))) {
				String deb = prenom.substring(0).toUpperCase();
				String rest = prenom.substring(1, prenom.length())
						.toLowerCase();
				prenom = deb + rest;
				quals.addObject(qualForPrenomLike(prenom));
			}
			if (!(StringCtrl.isEmpty(numero))) {
				quals.addObject(qualNumero(numero));
			}
			if (periode != null && !(StringCtrl.isEmpty(periode))) {
				quals.addObject(qualForPeriode(periode));
			}
			if (diplome != null && !(StringCtrl.isEmpty(diplome))) {
				quals.addObject(qualDiplome(diplome));
			}
			if (prdDiplome != null && !(StringCtrl.isEmpty(prdDiplome))) {
				quals.addObject(qualPrdDiplome(prdDiplome));
			}
			if (niveau != null && !(StringCtrl.isEmpty(niveau))) {
				quals.addObject(qualNonMST(niveau));
			}
			if (uv != null && !(StringCtrl.isEmpty(uv))) {
				quals.addObject(qualForUv(uv, periode));
			}
		}

		EOQualifier qual = new EOAndQualifier(quals);
		EOFetchSpecification spec = new EOFetchSpecification("EOIndividu",
				qual, new NSArray(
						new Object[] { SORT_NOM_ASC, SORT_PRENOM_ASC }));
		// spec.setFetchLimit(fetchLimit);
		spec.setPrefetchingRelationshipKeyPaths(preFetch());
		spec.setUsesDistinct(true);
		NSArray disp = myContext.objectsWithFetchSpecification(spec);
		return disp;
	}

	// SELECT des étudiants master
	public static NSArray EtudiantsMST(EOEditingContext myContext,
			NSDictionary bindinds, Recherche searchMsg) {
		String periode = (String) bindinds.valueForKey("periode");
		String diplome = (String) bindinds.valueForKey("diplome");
		String prdDiplome = (String) bindinds.valueForKey("prdDiplome");
		String niveau = (String) bindinds.valueForKey("niveau");
		String uv = (String) bindinds.valueForKey("uv");
		String nom = (String) bindinds.valueForKey("nom");
		String prenom = (String) bindinds.valueForKey("prenom");
		String numero = (String) bindinds.valueForKey("numero");
		String idConseiller = (String) bindinds.valueForKey("idConseiller");
		NSMutableArray quals = new NSMutableArray();
		quals.addObject(typeEmail());
		quals.addObject(qualCivilite());
		quals.addObject(qualEia());
		// quals.addObject(refMail());
		if ((StringCtrl.isEmpty(nom)) && (StringCtrl.isEmpty(prenom))
				&& ((StringCtrl.isEmpty(numero)))
				&& (periode == null || (StringCtrl.isEmpty(periode)))
				&& (diplome == null || (StringCtrl.isEmpty(diplome)))
				&& (niveau == null || (StringCtrl.isEmpty(niveau)))
				&& (uv == null || (StringCtrl.isEmpty(uv)))
				&& ((StringCtrl.isEmpty(idConseiller)))) {
			searchMsg
					.setSearchMsg("Veuillez affiner la recherche, trop de données remontées");
			return NSArray.EmptyArray;
		}
		if (lesConseillers(myContext, idConseiller).count() != 0) {
			quals.addObject(qualForConseiller(myContext, idConseiller));
		} else {
			if (!(StringCtrl.isEmpty(nom))) {
				NSMutableArray qua = new NSMutableArray();
				qua.addObject(qualForNomLike(nom));
				qua.addObject(qualForNomNaisLike(nom));
				EOQualifier nor = new EOOrQualifier(qua);
				quals.addObject(nor);
			}
			if (!(StringCtrl.isEmpty(prenom))) {
				String deb = prenom.substring(0, 1).toUpperCase();
				String rest = prenom.substring(1, prenom.length())
						.toLowerCase();
				prenom = deb + rest;
				quals.addObject(qualForPrenomLike(prenom));
			}
			if (!(StringCtrl.isEmpty(numero))) {
				quals.addObject(qualNumero(numero));
			}
			if (periode != null && !(StringCtrl.isEmpty(periode))) {
				quals.addObject(qualForPeriode(periode));
			}
			if (diplome != null && !(StringCtrl.isEmpty(diplome))) {
				quals.addObject(qualDiplome(diplome));
			}
			if (prdDiplome != null && !(StringCtrl.isEmpty(prdDiplome))) {
				quals.addObject(qualPrdDiplome(prdDiplome));
			}
			if (niveau != null && !(StringCtrl.isEmpty(niveau))) {
				quals.addObject(qualMST(niveau, diplome, prdDiplome));
			}
			if (uv != null && !(StringCtrl.isEmpty(uv))) {
				quals.addObject(qualForUv(uv, periode));
			}
		}

		EOQualifier qual = new EOAndQualifier(quals);
		EOFetchSpecification spec = new EOFetchSpecification("EOIndividu",
				qual, new NSArray(
						new Object[] { SORT_NOM_ASC, SORT_PRENOM_ASC }));
		spec.setPrefetchingRelationshipKeyPaths(preFetch());
		spec.setUsesDistinct(true);
		NSArray disp = myContext.objectsWithFetchSpecification(spec);
		return disp;
	}

	public static boolean stringContains(String str, String searchStr) {
		if (str == null || searchStr == null) {
			return false;
		}
		return str.indexOf(searchStr) >= 0;
	}

	protected static NSArray selectRawRowcourant(EOEditingContext ed) {
		NSArray result = null;
		try {
			result = EOUtilities.rawRowsForSQL(ed, "EtudiantEoGerry",
					sql.periodeCourante(), null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// Dictionnary Null value decoder
	protected static NSMutableArray reWriteListDico(NSArray dicoList) {
		NSMutableArray listDico = new NSMutableArray();
		for (int j = 0; j < dicoList.count(); j++) {
			NSMutableDictionary tinyDico = new NSMutableDictionary();
			tinyDico = (NSMutableDictionary) dicoList.objectAtIndex(j);
			reWriteDico(tinyDico);
			listDico.addObject(tinyDico);
		}
		return listDico;
	}

	protected static void reWriteDico(NSMutableDictionary dico) {
		for (int i = 0; i < dico.size(); i++) {
			Object value = dico.allValues().objectAtIndex(i);
			if (value.toString().equals(
					"<com.webobjects.foundation.NSKeyValueCoding$Null>")) {
				String key = (String) dico.allKeys().objectAtIndex(i);
				dico.setObjectForKey(" ", key);
				// NSLog.out.appendln(dico);
			}
		}
	}
}
