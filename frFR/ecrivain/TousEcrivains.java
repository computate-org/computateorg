package org.computate.site.frFR.ecrivain;    

import java.io.IOException;
import java.util.List;

import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;


/**   
 **/ 
public class TousEcrivains extends TousEcrivainsGen<Object> {    

	/**
	 * {@inheritDoc}
	 **/
	protected void _requeteSite_(Couverture<RequeteSiteFrFR> c) {
	}

	/**
	 */
	public static TousEcrivains creer(RequeteSiteFrFR requeteSite_, ToutEcrivain...ecrivains) { 
		TousEcrivains o = new TousEcrivains();
		o.initLoinPourClasse(requeteSite_);
		o.addEcrivains(ecrivains);
		return o;
	}

	protected void _ecrivains(List<ToutEcrivain> c) {
	}

	public TousEcrivains t(int nombreTabulations, Object...objets) {
		for(ToutEcrivain stringPrintWriter : ecrivains) {
			stringPrintWriter.t(nombreTabulations, objets);
		}
		return this;
	}
	public TousEcrivains tl(int nombreTabulations, Object...objets) {
		for(ToutEcrivain stringPrintWriter : ecrivains) {
			stringPrintWriter.tl(nombreTabulations, objets);
		}
		return this;
	}

	public TousEcrivains l(Object...objets) {
		for(ToutEcrivain stringPrintWriter : ecrivains) {
			stringPrintWriter.l(objets);
		}
		return this;
	}

	public TousEcrivains s(Object...objets) { 
		for(ToutEcrivain stringPrintWriter : ecrivains) {
			stringPrintWriter.s(objets);
		}
		return this;
	}

	public void flushClose() throws IOException {
		for(ToutEcrivain stringPrintWriter : ecrivains) {
			stringPrintWriter.flushClose();
		}
	}

	@Override public String toString() {
		return ecrivains.get(0).toString();
	}
}
