package org.computate.site.frfr.couverture;     

import java.io.Serializable;

/** 
 * 
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
}
