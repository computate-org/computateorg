package org.computate.frFR.site.ecrivain;   

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.text.WordUtils;
import org.computate.frFR.site.chaine.Chaine;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.requete.RequeteSite;
import org.computate.frFR.site.xml.OutilXml;

import io.vertx.core.buffer.Buffer;


/**  
 * NomCanonique.enUS: org.computate.enUS.school.writer.AllWriter
 **/
public class ToutEcrivain extends ToutEcrivainGen<Object> {    

	/**
	 * Var.enUS: HTML_CLOSED_ELEMENTS
	 */
	public static List<String> HTML_ELEMENTS_FERMES = Arrays.asList("area", "base", "br", "col", "command", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr");
	public static List<String> HTML_ELEMENTS_NO_WRAP = Arrays.asList("script", "span", "a", "b", "i", "u", "title", "use", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "p");

	/**
	 * 
	 * {@inheritDoc}
	 **/ 
	protected void _requeteSite_(Couverture<RequeteSite> c) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _tabStr(Couverture<String> c) {
		c.o("\t");
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: create
	 * Param1.var.enUS: siteRequest
	 * r: initLoinPourClasse
	 * r.enUS: initDeepForClass
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ToutEcrivain
	 * r.enUS: AllWriter
	 */
	public static ToutEcrivain creer(RequeteSite requeteSite_) {
		ToutEcrivain o = new ToutEcrivain();
		o.initLoinPourClasse(requeteSite_);
		return o;
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: create
	 * Param1.var.enUS: siteRequest
	 * r: initLoinPourClasse
	 * r.enUS: initDeepForClass
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ToutEcrivain
	 * r.enUS: AllWriter
	 */
	public static ToutEcrivain creer(RequeteSite requeteSite_, String tabStr) {
		ToutEcrivain o = new ToutEcrivain();
		o.setTabStr(tabStr);
		o.initLoinPourClasse(requeteSite_);
		return o;
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: create
	 * Param1.var.enUS: siteRequest
	 * Param2.var.enUS: fichier
	 * r: Fichier
	 * r.enUS: File
	 * r: fichier
	 * r.enUS: file
	 * r: initLoinPourClasse
	 * r.enUS: initDeepForClass
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ToutEcrivain
	 * r.enUS: AllWriter
	 */
	public static ToutEcrivain creer(RequeteSite requeteSite_, File fichier) {
		ToutEcrivain o = new ToutEcrivain();
		o.setFichier(fichier);
		o.initLoinPourClasse(requeteSite_);
		return o;
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: create
	 * Param1.var.enUS: siteRequest
	 * Param2.var.enUS: fichier
	 * r: Fichier
	 * r.enUS: File
	 * r: fichier
	 * r.enUS: file
	 * r: initLoinPourClasse
	 * r.enUS: initDeepForClass
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ToutEcrivain
	 * r.enUS: AllWriter
	 */
	public static ToutEcrivain creer(RequeteSite requeteSite_, File fichier, String tabStr) {
		ToutEcrivain o = new ToutEcrivain();
		o.setFichier(fichier);
		o.setTabStr(tabStr);
		o.initLoinPourClasse(requeteSite_);
		return o;
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: create
	 * Param1.var.enUS: siteRequest
	 * Param2.var.enUS: fichier
	 * r: Fichier
	 * r.enUS: File
	 * r: fichier
	 * r.enUS: file
	 * r: initLoinPourClasse
	 * r.enUS: initDeepForClass
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ToutEcrivain
	 * r.enUS: AllWriter
	 */
	public static ToutEcrivain creer(RequeteSite requeteSite_, Buffer buffer) {
		ToutEcrivain o = new ToutEcrivain();
		o.setBuffer(buffer);
		o.initLoinPourClasse(requeteSite_);
		return o;
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: create
	 * Param1.var.enUS: siteRequest
	 * Param2.var.enUS: fichier
	 * r: Fichier
	 * r.enUS: File
	 * r: fichier
	 * r.enUS: file
	 * r: initLoinPourClasse
	 * r.enUS: initDeepForClass
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ToutEcrivain
	 * r.enUS: AllWriter
	 */
	public static ToutEcrivain creer(RequeteSite requeteSite_, Buffer buffer, String tabStr) {
		ToutEcrivain o = new ToutEcrivain();
		o.setBuffer(buffer);
		o.setTabStr(tabStr);
		o.initLoinPourClasse(requeteSite_);
		return o;
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: fichier
	 **/
	protected void _fichier(Couverture<File> c) {
	}

	/**
	 * Var.enUS: stringWriter
	 * r: fichier
	 * r.enUS: file
	 * r: ecrivainString
	 * r.enUS: stringWriter
	 */
	protected void _ecrivainString(Couverture<StringWriter> c) {
//		if(fichier == null && reponseServeurHttp == null)
		if(fichier == null && buffer == null)
			c.o(new StringWriter());
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _buffer(Couverture<Buffer> c) {
	}
//
//	/**
//	 * {@inheritDoc}
//	 * Var.enUS: httpServerResponse
//	 **/
//	protected void _reponseServeurHttp(Couverture<HttpServerResponse> c) {
//	}

	/**
	 * Var.enUS: printWriter
	 * r: ecrivainString
	 * r.enUS: stringWriter
	 * r: fichier
	 * r.enUS: file
	 * r: reponseServeurHttp
	 * r.enUS: httpServerResponse
	 */
	protected void _ecrivainImpression(Couverture<PrintWriter> c) {
//		if(reponseServeurHttp == null && buffer == null) {
		if(buffer == null) {
			if(fichier == null)
				c.o(new PrintWriter(ecrivainString));
			else {
				try {
					c.o(new PrintWriter(fichier));
				} catch (FileNotFoundException e) {
					ExceptionUtils.rethrow(e);
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: empty
	 **/
	protected void _vide(Couverture<Boolean> c) {
		c.o(true);
	}

	/**
	 * Param1.var.enUS: tabNumber
	 * Param2.var.enUS: objects
	 * r: objets
	 * r.enUS: objects
	 * r: nombreTabulations
	 * r.enUS: tabNumber
	 */
	public ToutEcrivain t(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			s(tabStr);
		s(objets);
		return this;
	}

	/**
	 * Param1.var.enUS: tabNumber
	 * Param2.var.enUS: objects
	 * r: objets
	 * r.enUS: objects
	 * r: nombreTabulations
	 * r.enUS: tabNumber
	 */
	public ToutEcrivain tl(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			s(tabStr);
		s(objets);
		s("\n");
		return this;
	}

	/**
	 * Param1.var.enUS: objects
	 * r: objets
	 * r.enUS: objects
	 */
	public ToutEcrivain l(Object...objets) {
		s(objets);
		s("\n");
		return this;
	}

	/**
	 * r: objets
	 * r.enUS: objects
	 * r: objet
	 * r.enUS: object
	 * r: chaine
	 * r.enUS: chain
	 * r: ecrivainImpression
	 * r.enUS: printWriter
	 * r: reponseServeurHttp
	 * r.enUS: httpServerResponse
	 * r: vide
	 * r.enUS: empty
	 */
	public ToutEcrivain s(Object...objets) { 
		for(Object objet : objets) {
			if(objet != null) {
				if(objet instanceof List) {
					List<?> chaine = (List<?>)objet;
					for(Object objet2 : chaine) {
						String str = objet2.toString();
						if(objet2 != null && !StringUtils.isEmpty(str)) {
//							if(reponseServeurHttp == null)
							if(buffer == null)
								ecrivainImpression.write(str);
							else
//								reponseServeurHttp.write(str);
								buffer.appendString(str);
						}
					}
				}
				else {
					String str = objet.toString();
					if(!StringUtils.isEmpty(str)) {
//						if(reponseServeurHttp == null)
						if(buffer == null)
							ecrivainImpression.write(str);
						else
//							reponseServeurHttp.write(str);
							buffer.appendString(str);
					}
				}
			}
		}
		vide = false;
		return this;
	}

	public ToutEcrivain string(Object...objets) {
		s("\"");
		for(Object objet : objets)
			if(objet != null)
				s(StringUtils.replace(StringUtils.replace(objet.toString(), "\\", "\\\\"), "\"", "\\\""));
		s("\"");
		return this;
	}

	public String q(Object...objets) {
		StringBuilder o = new StringBuilder();
		o.append("\"");
		for(Object objet : objets)
			if(objet != null)
				o.append(StringUtils.replace(StringUtils.replace(objet.toString(), "\\", "\\\\"), "\"", "\\\""));
		o.append("\"");
		return o.toString();
	}

	public ToutEcrivain js(Object...objets) {
		for(Object objet : objets)
			if(objet != null)
				s(StringEscapeUtils.escapeJava(objet.toString()));
		return this;
	}

	public ToutEcrivain yamlStr(int tabNumber, Object...objets) {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		for(Object objet : objets) {
			if(objet != null) {
				if(objet instanceof Chaine) {
					Chaine chaine = (Chaine)objet;
					for(Object objet2 : chaine.getTout()) {
						if(objet2 != null && !StringUtils.isEmpty(objet2.toString()))
							printWriter.append(objet2.toString());
					}
				}
				else if(objet instanceof List) {
					List<?> chaine = (List<?>)objet;
					for(Object objet2 : chaine) {
						if(objet2 != null && !StringUtils.isEmpty(objet2.toString()))
							printWriter.append(objet2.toString());
					}
				}
				else {
					if(!StringUtils.isEmpty(objet.toString()))
						printWriter.append(objet.toString());
				}
			}
		}
		String[] lines = StringUtils.splitPreserveAllTokens(stringWriter.toString(), "\n");
		l(">+");
		for(int i = 0; i < lines.length; i++) {
			boolean last = i == (lines.length -1);
			String line = lines[i];

			String[] wrapLines = StringUtils.splitPreserveAllTokens(WordUtils.wrap(line, 70), "\n");
			for(int j = 0; j < wrapLines.length; j++) {
				boolean wrapLast = j == (wrapLines.length -1);
				String wrapLine = wrapLines[j];
				if(wrapLast)
					t(tabNumber, wrapLine);
				else
					tl(tabNumber, wrapLine);
			}

			if(!last) {
				tl(tabNumber);
				if(StringUtils.isNotBlank(line))
					tl(tabNumber);
			}
			else {
				l();
			}
		}

		try {
			printWriter.flush();
			stringWriter.flush();
			printWriter.close();
			stringWriter.close();
		} catch (IOException e) {
			ExceptionUtils.rethrow(e);
		}
		return this;
	}

	/**
	 * Param1.var.enUS: localName
	 * r.enUS: nomLocal
	 * localName
	 * r.enUS: xmlPile
	 * xmlStack
	 * r.enUS: requeteSite_
	 * siteRequest
	 * r.enUS: tabulation
	 * tab
	 * r.enUS: Echappes
	 * Escaped
	 * r.enUS: ecrivain
	 * writer
	 */
	public ToutEcrivain e(String nomLocal) {
		String nomLocalParent = requeteSite_.getXmlPile().isEmpty() ? null : requeteSite_.getXmlPile().peek();

		boolean eNoWrapParent = nomLocalParent == null || HTML_ELEMENTS_NO_WRAP.contains(nomLocalParent);
		String tabulations = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\t"));
		String tabulationsEchappes = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\\t"));

		requeteSite_.getXmlPile().push(nomLocal);
		if(StringUtils.equals(nomLocal, "html"))
			s("<!DOCTYPE html>\n");
		if(!eNoWrapParent && !tabulationsEchappes.isEmpty()) {
			l();
			s(tabulations);
		}
		s("<");
		s(nomLocal);
		
		return this;
	}

	public ToutEcrivain a1(String nomAttribut, Object...objets) {
		s(" ");
		s(nomAttribut);
		s("=\"");
		for(Object objet : objets) {
			if(objet != null) {
				String s = objet.toString();
				s(OutilXml.echapperDansCitatations(s));
			}
		}
		
		return this;
	}

	/**  
	 * Param1.var.enUS: attributeName
	 * Param2.var.enUS: objects
	 * r.enUS: nomAttribut
	 * attributeName
	 * r.enUS: objets
	 * objects
	 * r.enUS: ecrivain
	 * writer
	 * r.enUS: echapperXmlDansCitations
	 * escapeXmlInQuotes
	 * r.enUS: OutilEchapper
	 * EscapeTool
	 */
	public ToutEcrivain a(String nomAttribut, Object...objets) {
		s(" ");
		s(nomAttribut);
		s("=\"");
		for(Object objet : objets) {
			if(objet != null) {
				String s = objet.toString();
				s(OutilXml.echapperDansCitatations(s));
			}
		}
		s("\"");
		
		return this;
	}

	public ToutEcrivain a2() {
		s("\"");
		
		return this;
	}

	/** 
	 * r.enUS: ecrivain
	 * writer
	 */
	public ToutEcrivain f() {
		s(">");
		
		return this;
	}

	public ToutEcrivain lx(Object...objets) {
		s(objets);
		sx("\n");
		return this;
	}

	/** 
	 * Var.enUS: allXml
	 * Param1.var.enUS: objects
	 * r.enUS: objet
	 * object
	 * r.enUS: ecrivain
	 * writer
	 * r.enUS: OutilEchapper
	 * EscapeTool
	 * r.enUS: echapperXml
	 * escapeXml
	 */
	public ToutEcrivain sx(Object...objets) {
		for(Object objet : objets) {
			if(objet != null) {
				if(objet instanceof Chaine) {
					Chaine chaine = (Chaine)objet;
					String s = chaine.toString();
					s(OutilXml.echapper(s));
				}
				else {
					String s = objet.toString();
					s(OutilXml.echapper(s));
				}
			}
		}
		
		return this;
	}

	/**
	 * Var.enUS: allXml
	 * Param1.var.enUS: numberTabs
	 * Param2.var.enUS: objects
	 * r.enUS: nombreTabulations
	 * numberTabs
	 * r.enUS: objets
	 * objects
	 * r.enUS: tout
	 * all
	 */
	public ToutEcrivain tx(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			sx("\t");
		sx(objets);
		return this;
	}

	/**
	 * Var.enUS: tabLineXml
	 * Param1.var.enUS: numberTabs
	 * Param2.var.enUS: objects
	 * r.enUS: nombreTabulations
	 * numberTabs
	 * r.enUS: objets
	 * objects
	 * r.enUS: tout
	 * all
	 */
	public ToutEcrivain tlx(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			sx("\t");
		sx(objets);
		sx("\n");
		return this;
	}

	/**
	 * r.enUS: ecrivain
	 * writer
	 * r.enUS: requeteSite_
	 * siteRequest
	 * r.enUS: xmlPile
	 * xmlStack
	 */
	public ToutEcrivain fg() {
		s("/>");
		requeteSite_.getXmlPile().pop();
		
		return this;
	}

	/**    
	 * Param1.var.enUS: localName
	 * r.enUS: nomLocal
	 * localName
	 * r.enUS: nomLocalParent
	 * parentLocalName
	 * r.enUS: requeteSite_
	 * siteRequest
	 * r.enUS: xmlPile
	 * xmlStack
	 * r.enUS: tabulations
	 * tabs
	 * r.enUS: Echappes
	 * Escaped
	 * r.enUS: ecrivain
	 * writer
	 */
	public ToutEcrivain g(String nomLocal) {
		String nomLocalParent = requeteSite_.getXmlPile().peek();
		boolean eNoWrap = nomLocalParent == null || HTML_ELEMENTS_NO_WRAP.contains(nomLocal);

		requeteSite_.getXmlPile().pop();
		String tabulations = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\t"));
		String tabulationsEchappes = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\\t"));

		if(!eNoWrap && !tabulationsEchappes.isEmpty()) {
			l();
			s(tabulations);
		}
		s("</");
		s(nomLocal);
		s(">");
		
		return this;
	}

	/**
	 * r: ecrivainString
	 * r.enUS: stringWriter
	 * r: ecrivainImpression
	 * r.enUS: printWriter
	 * r: reponseServeurHttp
	 * r.enUS: httpServerResponse
	 */
	public void flushClose() {

		if(ecrivainImpression != null)
			ecrivainImpression.flush();
		if(ecrivainString != null)
			ecrivainString.flush();

		if(ecrivainImpression != null)
			ecrivainImpression.close();
		if(ecrivainString != null) {
			try {
				ecrivainString.close();
			} catch (IOException e) {
				ExceptionUtils.rethrow(e);
			}
		}

//		if(reponseServeurHttp != null)
//			reponseServeurHttp.close();
	}

	/**
	 * r: ecrivainString
	 * r.enUS: stringWriter
	 * r: ecrivainImpression
	 * r.enUS: printWriter
	 * r: reponseServeurHttp
	 * r.enUS: httpServerResponse
	 */
	@Override public String toString() {
//		if(reponseServeurHttp != null)
//			return ecrivainString.toString();
		if(buffer != null)
			return ecrivainString.toString();
		else if(fichier != null)
			return ecrivainImpression.toString();
		else
			return ecrivainString.toString();
	}
}
