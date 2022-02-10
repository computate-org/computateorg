package org.computate.site.enUS.ecrivain;

import java.io.IOException;
import java.util.List;

import org.computate.site.enUS.request.RequeteSiteEnUS;
import org.computate.site.site.enUS.couverture.Couverture;

public class TousEcrivains extends TousEcrivainsGen<Object> {

	protected void _requeteSite_(Couverture<RequeteSiteEnUS> c) {
	}

	public static TousEcrivains creer(RequeteSiteEnUS requeteSite_, ToutEcrivain...ecrivains) { 
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

	public void  flushClose() throws IOException, IOException {
		for(ToutEcrivain stringPrintWriter : ecrivains) {
			stringPrintWriter.flushClose();
		}
	}

	@Override()
	public String toString() {
		return ecrivains.get(0).toString();
	}
}
