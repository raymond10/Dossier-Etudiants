/**
 * 
 */
package etudiants.utt.fr.util;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 *
 */
@SuppressWarnings("all")
public class EdtUtilitaires {
	public static String TIME = "time";
	public static String UV = "UV";
	public static String CRENO = "temp";
	public static String SEMAINE = "semaine";
	public static String TYPE = "type";
	public static String SALLE1 = "salle1";
	public static String SALLE2 = "salle2";
	public static String SALLE3 = "salle3";
	public static String SALLE4 = "salle4";
	public static String WEEKNAME = "weekname";
	public Integer HEIGHT = 20;
	public Integer WEIGHT = 48;
	public String tplVide = null;
	public String tplPlein = null;
	private NSMutableDictionary type;
	private NSMutableArray jours;
	private NSMutableArray couleurs;
	private NSMutableArray ttime;
	private NSMutableDictionary couleur;
	private Integer iniTime;
	private NSMutableDictionary edt;
	public Number id;
	public Number cid;
	public String uv = null;
	public Integer hei = 0;
	public Integer wei = 0;
	public String col = null;
	public String tipe = null;
	public String sale1 = null;
	public String sale2 = null;
	public String sale3 = null;
	public String sale4 = null;
	public String weak = null;
	
	
	public EdtUtilitaires() {
		type = new NSMutableDictionary();
		couleurs = new NSMutableArray();
		jours = new NSMutableArray();
		ttime = new NSMutableArray();
		couleur = new NSMutableDictionary();
		edt = new NSMutableDictionary();
	}
	
	/**
	 * @return the edt
	 */
	public NSMutableDictionary getEdt() {
		return edt;
	}

	/**
	 * @param edt the edt to set
	 */
	public void setEdt(NSMutableDictionary edt) {
		this.edt = edt;
	}

	/**
	 * @return the type
	 */
	public NSMutableDictionary getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(NSMutableDictionary type) {
		this.type = type;
	}

	/**
	 * @return the jours
	 */
	public NSMutableArray getJours() {
		return jours;
	}

	/**
	 * @param jours the jours to set
	 */
	public void setJours(NSMutableArray jours) {
		this.jours = jours;
	}

	/**
	 * @return the couleurs
	 */
	public NSMutableArray getCouleurs() {
		return couleurs;
	}

	/**
	 * @param couleurs the couleurs to set
	 */
	public void setCouleurs(NSMutableArray couleurs) {
		this.couleurs = couleurs;
	}

	/**
	 * @return the ttime
	 */
	public NSMutableArray getTtime() {
		return ttime;
	}

	/**
	 * @param ttime the ttime to set
	 */
	public void setTtime(NSMutableArray ttime) {
		this.ttime = ttime;
	}

	/**
	 * @return the couleur
	 */
	public NSMutableDictionary getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(NSMutableDictionary couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the iniTime
	 */
	public Integer getIniTime() {
		return iniTime;
	}

	/**
	 * @param iniTime the iniTime to set
	 */
	public void setIniTime(Integer iniTime) {
		this.iniTime = iniTime;
	}

	//Couleur des UV
	public void lesCouleurs(NSArray uvs) {
		for (int i = 0; i < uvs.count(); i++) {
			NSMutableDictionary tmpUv = new NSMutableDictionary();
			tmpUv = (NSMutableDictionary) uvs.objectAtIndex(i);
			couleur.put(tmpUv.valueForKey(UV), couleurs.objectAtIndex(i));
		}
	}
	
	public String couleurUV(String uv){
		String uvs = "#FFF";
		String ValueUv = (String) couleur.objectForKey(uv);
		if(ValueUv != null)
			return ValueUv;
		return uvs;
	}

	//Type d'activitŽ
	public NSMutableDictionary theType() {
		type.put("CM", "Cours");
		type.put("TP", "TP");
		type.put("TD", "TD");
		return type;

	}

	//Les jours de la semaine
	public NSMutableArray theDay() {
		jours.addObject("lundi");
		jours.addObject("mardi");
		jours.addObject("mercredi");
		jours.addObject("jeudi");
		jours.addObject("vendredi");
		jours.addObject("samedi");
		return jours;
	}

	//Les couleurs des activitŽs
	public NSMutableArray theColor() {
		couleurs.addObject("#BBFF00");
		couleurs.addObject("#CCFFCC");
		couleurs.addObject("#FFFFCC");
		couleurs.addObject("#CCAACC");
		couleurs.addObject("#FFAA88");
		couleurs.addObject("#BBCCFF");
		couleurs.addObject("#BBFFBB");
		couleurs.addObject("#00FF00");
		//couleurs.addObject("#BBFF00");
		//couleurs.addObject("#CCFFCC");
		return couleurs;
	}
	
	//Traitement des horaires
	public NSMutableDictionary horaires() {
		for (int i = 16; i < 45; i++) {
			ttime.addObject(decode(i));
		}
		edt.put(TIME, ttime);
		return edt;
	}
	
	// Time decoder / coder
	public String decode(Number ptime) {
		String ttime = null;
		String t = null;
		float time = ptime.floatValue();
		Double var = new Double(time / 2);
		double pf = Math.floor(var);
		if (String.valueOf(pf).length() == 3) {
			ttime = String.valueOf(pf).substring(0, 1) + ":";
		} else {
			ttime = String.valueOf(pf).substring(0, 2) + ":";
		}
		Double var1 = new Double(ptime.doubleValue() / 2);
		if (pf == (var1)) {
			t = "00";
		} else {
			t = "30";
		}
		ttime += t;
		return ttime;
	}

	public Integer code(String pdebut) {
		String[] one = null;
		Integer more = 0;
		one = pdebut.split(":");
		if (one[1].equals("30")) {
			more = 1;
		}
		if (one[1].equals("60")) {
			more = 2;
		}
		return Integer.valueOf(one[0]) * 2 + more;
	}
	
	//Traitement crenoPleins
	public String crenoPlein(NSMutableDictionary creno, String jour, Integer time) {
		String affiche = "";
		Integer temp = (Integer) creno.objectForKey(CRENO);
		Integer size = temp * HEIGHT + temp - 2;
		NSMutableArray weeky = new NSMutableArray();
		weeky.addObject("A");
		weeky.addObject("B");
		if (creno.objectForKey(SEMAINE).equals("2"))
			WEIGHT = Integer.valueOf(48);
		else {
			WEIGHT = Integer.valueOf(100);
		}
		String types = (String) type.objectForKey(creno.objectForKey(TYPE));
		String week = "";
		String weekname = (String) creno.objectForKey(WEEKNAME);		
		String uvs = (String) creno.objectForKey("uv");
		String coule = couleurUV(uvs);
		String salle1 = (String) creno.objectForKey(SALLE1);
		String salle2 = (String) creno.objectForKey(SALLE2);
		String salle3 = (String) creno.objectForKey(SALLE3);
		String salle4 = (String) creno.objectForKey(SALLE4);
		cid = ((Number) creno.objectForKey("id"));
		if (creno.objectForKey(SEMAINE).equals("2")) {
			week = "<br/>" + weekname;
		} else {
			week = "";
		}
		wei = WEIGHT;
		hei = size;
		col = coule;
		uv = uvs;
		tipe = types;
		sale1 = salle1;
		sale2 = salle2;
		sale3 = salle3;
		sale4 = salle4;
		weak = week;
		tplPlein = ("\n<div class=\"crenoPlein\" style=\"width:"
				+ wei
				+ "px;height:"
				+ hei
				+ "px;background-color:"
				+ col
				+ ";border:1px solid #225588\"> \n"
				+ "<div style=\"height:"
				+ hei
				+ "px;width:"
				+ wei
				+ "px\"> \n"
				+ "<a href=#>"
				+ "<!--\"edtetus?id="
				+ id
				+ "&cid="
				+ cid
				+ "\"-->"
				+ uv
				+ "</a>&nbsp;&nbsp; \n"
				+ tipe
				+ "<br/> \n");
		        if(sale1 != null && !sale1.equals(""))
		        	tplPlein += sale1 + "<br/> \n";
		        if(sale2 != null && !sale2.equals(""))
		        	tplPlein += sale2 +"<br/> \n";
		        if(sale3 != null && !sale3.equals(""))
		        	tplPlein += sale3 +"<br/> \n";
		        if(sale4 != null && !sale4.equals(""))
		        	tplPlein += sale4 +"<br/> \n";
		        if(weak != null && !weak.equals(""))
		        	tplPlein += weak +"<br/> \n";
				tplPlein+= "</div></div> \n";
		affiche = tplPlein;
		iniTime = (time + temp) -1;
		return affiche;
	}
	
	//Traitement crenoVide
	public String crenoVide(String sem){
		String affVide = "";
		if (sem != null && sem.equals("2")) {
			WEIGHT = 48;
		} else {
			WEIGHT = 100;
		}
		tplVide = "<div class=\"crenoVide\" style=\"height:20px;width:"
				+ WEIGHT + "px\"></div>";
		affVide = tplVide;
		return affVide;
	}

}
