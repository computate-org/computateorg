package org.computate.site.frFR.couverture;     

import java.io.Serializable;
import java.util.ArrayList;

/** 
 * MotCle: classeNomSimpleCouverture
 */ 
public class Couverture<DEV> implements Serializable {  
	private static final long serialVersionUID = 4171725370071929571L;

	/**	
	 * frFR: Le nom du champ qui est couvert par cette couverture. 
	 **/  
	public String var;
	public Couverture<DEV> var(String o) {
		var = o;
		return this;
	}

	/**
	 * frFR: L'objet qui est couvert par cette couverture. 
	 **/
	public DEV o;
	public Couverture<DEV> o(DEV o) {
		this.o = o;
		return this;
	}

	/**
	 * frFR: La classe de l'objet qui est couvert par cette couverture. 
	 **/
	public Class<?> c;
	public Couverture<DEV> c(Class<?> o) {
		c = o;
		return this;
	}

	/**
	 * frFR: L'objet parent de l'objet qui est couvert par cette couverture. 
	 **/
	public Object p;
	public Couverture<DEV> p(Object o) {
		p = o;
		return this;
	}

	/**
	 */
	public Class<?> cEnfant;

	/**
	 */
	public Couverture<DEV> cEnfant(Class<?> o) {
		cEnfant = o;
		return this;
	}

	/**
	 * frFR: Vrai si cette couverture a était déjà initialisée. 
	 */
	public Boolean dejaInitialise = false;
	/**
	 * frFR: Vrai si cette couverture a était déjà initialisée. 
	 */
	public Couverture<DEV> dejaInitialise(Boolean o) {
		dejaInitialise = o;
		return this;
	}

	/**
	 * **/
	public Object requeteSiteObjet;
	/**
	 * frFR: Tous les infos importants à propos de la requête actuelle. 
	 */
	public Couverture<DEV> requeteSiteObjet(Object o) {
		requeteSiteObjet = o;
		return this;
	}

	/**  
	 * **/
	public ArrayList<String> pageVars = new ArrayList<String>();

	/** 
	 */
	public void pageVarsAjouter(String...pageVars) {
		for(String pageVar : pageVars)
			this.pageVars.add(pageVar);
	}
}
