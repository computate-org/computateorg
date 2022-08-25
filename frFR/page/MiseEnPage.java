package org.computate.site.frFR.page;   

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.solr.common.SolrDocument;
import org.computate.site.frFR.chaine.Chaine;
import org.computate.site.frFR.config.ConfigSite;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.ecrivain.ToutEcrivain;
import org.computate.site.frFR.page.parti.PagePart;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.xml.OutilXml;

import io.vertx.core.json.JsonObject;

/**
 * MotCle: classeNomSimpleMiseEnPage
 */
public class MiseEnPage extends MiseEnPageGen<Object> {  

	/**
	 */
	public static List<String> HTML_ELEMENTS_FERMES = Arrays.asList("area", "base", "br", "col", "command", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr");
	public static List<String> HTML_ELEMENTS_NO_WRAP = Arrays.asList("script", "span", "a", "b", "i", "u", "title", "use", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "p");

	/**
	 * r: d MMM yyyy H'h'mm
	 * r.enUS: MMM d yyyy h:mm a
	 * r: Locale.FRANCE
	 * r.enUS: Locale.US
	 */
	public static DateTimeFormatter FORMATDateHeureCourt = DateTimeFormatter.ofPattern("d MMM yyyy H'h'mm", Locale.FRANCE);

	/**
	 * r: EEE d MMM yyyy
	 * r.enUS: EEE MMM d yyyy
	 * r: Locale.FRANCE
	 * r.enUS: Locale.US
	 */
	public static DateTimeFormatter FORMATDateCourt = DateTimeFormatter.ofPattern("EEE d MMM yyyy", Locale.FRANCE);

	/**
	 * r: EEEE d MMMM yyyy H'h'mm
	 * r.enUS: EEEE MMMM d yyyy h:mm a
	 * r: Locale.FRANCE
	 * r.enUS: Locale.US
	 */   
	public static DateTimeFormatter FORMATAffichage = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy H'h'mm", Locale.FRANCE);

	protected void _pageParts(List<PagePart> l) {
	}

	public void avantPagePart(PagePart o, String var) {
		o.setPage_(this);
	}

	/**
	 * 
	 * {@inheritDoc}
	 **/ 
	protected void _requeteSite_(Couverture<RequeteSiteFrFR> c) {
	}

	/**
	 * 
	 * {@inheritDoc}
	 **/ 
	protected void _statiqueUrlBase(Couverture<String> c) {
		c.o(requeteSite_.getConfigSite_().getStatiqueUrlBase()); 
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _pageDocumentSolr(Couverture<SolrDocument> c) {
		
	}

	/**
	 * frFR: L'écrivain pour écrirer le résultat du réponse. 
	 */ 
	protected void _w(Couverture<ToutEcrivain> c) {
		c.o(requeteSite_.getW());
	}

	/**
	 */
	protected void _contexteIconeGroupe(Couverture<String> c) {
	}

	/**
	 */
	protected void _contexteIconeNom(Couverture<String> c) {
	}

	/**
	 */
	protected void _contexteIconeClassesCss(Couverture<String> c) {
		if(contexteIconeGroupe != null && contexteIconeNom != null)
			c.o("fa" + StringUtils.substring(contexteIconeGroupe, 0, 1) + " fa-" + contexteIconeNom + " ");
	}

	/**
	 * frFR: Choisir si cette page est trouvée dans le /sitemap.xml.
	 * frFR: Si true, les bots de Google, Bing, Yahoo peuvent trouver la page. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageVisibleAuxBots(Couverture<Boolean> c)  {
		c.o(BooleanUtils.toBooleanDefaultIfNull((Boolean)pageDocumentSolr.get(c.var + "_stored_boolean"), false));
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageH1(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageH2(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageH3(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	/**
	 */
	protected void _pageH1Court(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), pageH1));
	}

	/**
	 */
	protected void _pageH2Court(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), pageH2));
	}

	/**
	 */
	protected void _pageH3Court(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), pageH2));
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _pageTitre(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_frFR_stored_string"), StringUtils.join(pageH1, pageH2)));
	}

	/**	la version plus courte de l'URL qui commence avec « / » 
	 * Indexe: true
	 * Stocke: true
	 * r: frFR
	 * r.enUS: enUS
	 * **/
	protected void _pageUri(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_frFR_stored_string"), null));
	}

	/**
	 * Var.enUS: pageUriFrFR
	 */
	protected void _pageUriEnUS(Couverture<String> c) {
	}

	/**	Tous les URIs ensemble pour toutes les langues dans cette liste. 
	 * Indexe: true
	 * Stocke: true
	 * **/
	protected void _pageUris(List<String> l)  {
		l.add(pageUri.toString());
		l.add(pageUri + "/");
	}

	/**
	 * frFR: l'URL complet. 
	 * Indexe: true
	 * Stocke: true
	 */ 
	protected void _pageUrl(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), requeteSite_.getConfigSite_().getSiteUrlBase() + pageUri));
	}

	/**
	 * frFR: l'URI courte vers l'image. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageImageUri(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	/**
	 * frFR: l'URL complet vers l'image. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageImageUrl(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), statiqueUrlBase + pageImageUri));
	}

	/**
	 * frFR: l'ID Youtube du video. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageVideoId(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	/**
	 * frFR: l'URL complet vers le video. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageVideoUrl(Couverture<String> c)  {
		if(pageVideoId != null) {
			c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), "https://youtu.be/" + pageVideoId));
		}
	}

	/**
	 * frFR: l'URL embed vers le video. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageVideoUrlEmbed(Couverture<String> c)  {
		if(pageVideoId != null) {
			c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), "https://www.youtube.com/embed/" + pageVideoId));
		}
	}

	/**
	 * frFR: Le longeur de l'image. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageImageLargeur(Couverture<Integer> c)  {
		c.o((Integer)pageDocumentSolr.get(c.var + "_stored_int"));
	}

	/**
	 * frFR: Le hauteur de l'image. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageImageHauteur(Couverture<Integer> c)  {
		c.o((Integer)pageDocumentSolr.get(c.var + "_stored_int"));
	}

	/**
	 * frFR: Le type de contenu de l'image. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageImageTypeContenu(Couverture<String> c)  {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	/**
	 * frFR: Le type de contenu de la page. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageTypeContenu(Couverture<String> c)  {
//		if(requeteSite_.requete != null && requeteSite_.requete.getRequestURI().endsWith(".svg"))
//			c.o("image/svg+xml");
//		if(requeteSite_.requete != null && requeteSite_.requete.getRequestURI().endsWith(".sh.html"))
//			c.o("text/html;charset=UTF-8");
//		if(requeteSite_.requete != null && requeteSite_.requete.getRequestURI().endsWith(".sh"))
//			c.o("text/x-shellscript");
//		else
			c.o("text/html;charset=UTF-8");
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageCree(Couverture<LocalDateTime> c)  {   
		Date solrVal = (Date)pageDocumentSolr.get(c.var + "_stored_date");
		if(solrVal != null)
			c.o(solrVal.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
	}

	/**
	 * r.enUS: pageCree
	 * Page.Created
	 */
	protected void _pageModifiee(Couverture<LocalDateTime> c)  {
		Date solrVal = (Date)pageDocumentSolr.get(c.var + "_stored_date");
		if(solrVal != null)
			c.o(solrVal.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
		else
			c.o(pageCree);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageMotsCles(Couverture<String> c)  {
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageDescription(Couverture<String> c)  {
	}

	/**
	 * String.enUS: /
	 */
	protected void _pageAccueilUri(Couverture<String> c)  {
		c.o("/frFR");
	}

	/**
	 * String.enUS: /enUS/about
	 */
	protected void _pageAProposUri(Couverture<String> c)  {
		c.o("/frFR/apropos");
	}

	/**
	 * String.enUS: /enUS/blog
	 */
	protected void _pageBlogUri(Couverture<String> c)  {
		c.o("/frFR/blog");
	}

	/**
	 * String.enUS: /enUS/lesson
	 */
	protected void _pageLeconUri(Couverture<String> c)  {
		c.o("/frFR/lecon");
	}

	/**
	 * String.enUS: /enUS/course
	 */
	protected void _pageCoursUri(Couverture<String> c)  {
		c.o("/frFR/cours");
	}

	/**
	 * String.enUS: /enUS/faq
	 */
	protected void _pageFaqUri(Couverture<String> c)  {
		c.o("/frFR/faq");
	}

	/**
	 * String.enUS: /enUS/user
	 */
	protected void _pageUtilisateurUri(Couverture<String> c)  {
		c.o("/frFR/utilisateur");
	}

	/**
	 */
	protected void _pageDeconnexionUri(Couverture<String> c)  {
		try {
			ConfigSite configSite = requeteSite_.getConfigSite_();
			String o = configSite.getAuthUrl() + "/realms/" + configSite.getAuthRoyaume() + "/protocol/openid-connect/logout?redirect_uri=" + URLEncoder.encode(configSite.getSiteUrlBase() + "/deconnexion", "UTF-8");
			c.o(o);
		} catch (UnsupportedEncodingException e) {
			ExceptionUtils.rethrow(e);
		}
	}
//
//	protected void _pageCoursUri(Couverture<String> c)  {
//		c.o("/cours");
//	}

	/** 
	 */
	protected void _pageYoutubeUrl(Couverture<String> c)  {
		c.o("https://www.youtube.com/channel/UC3ryOB2snhO7fItkx6dGx2Q");
	}

	/** 
	 * String.enUS: https://www.pinterest.com/computateorg/computate-in-english/
	 */
	protected void _pagePinterestUrl(Couverture<String> c)  {
		c.o("https://www.pinterest.com/computateorg/site-en-fran%C3%A7ais/");
	}
//
//	/**
//	 */
//	protected void _cleRequete(Couverture<Long> c) {
//		if(requeteSite_.requete != null) {
//			Long o = NumberUtils.toLong(requeteSite_.requete.getParameter("key"));
//			if(o > 0L)
//				c.o(o);
//		}
//	}

	/**
	 */
//	public void pagePartsHtml()  {
//		e("h1").f().sx(pageH1).g("h1");
//		e("h2").f().sx(pageH2).g("h2");
//		for(int i = 0; i < pageParts.size(); i++) {
//			PageParti parti = pageParts.get(i);
//			parti.html();
////			e("h1").f().tout(parti.partiH3Court()).g("h1");
////			e("h2").f().tout(parti.partiH4Court()).g("h2");
//		}
//	}

	/**
	 * r:À récapituler : 
	 * r.enUS:To review: 
	 * r:"fr"
	 * r.enUS:"en"
	 */ 
	public void pageRecapituler()  {
		{ e("html").a("lang", "fr").f();
			{ e("head").f();
				e("title").f();
					sx(pageTitre);
				g("title");
				htmlScripts();
				e("script").f().l("/*<![CDATA[*/");
				htmlScript();
				s("/*]]>*/").g("script");
				htmlStyles();
				e("style").f().l("/*<![CDATA[*/");
				htmlStyle();
				s("/*]]>*/").g("style");
	
			} g("head");
			{ e("body").a("class", "").f(); 
						htmlBodyCourt();
			} g("body");
		} g("html");
	}

	@Override public void htmlBodyCourtMiseEnPage() {
	}

	@Override public void htmlMetaMiseEnPage() {
		e("meta").a("charset", "UTF-8").fg();
		e("meta").a("name", "viewport").a("content", "width=device-width, initial-scale=1").fg();
		e("meta").a("name", "keywords").a("content", pageMotsCles).fg();
		e("meta").a("property", "og:title").a("content", pageTitre).fg();
		e("meta").a("property", "og:description").a("content", pageDescription).fg();
		e("meta").a("property", "og:url").a("content", pageUrl).fg();
		e("meta").a("property", "og:site_name").a("content", requeteSite_.getConfigSite_().getNomDomaine()).fg();
		e("meta").a("property", "og:image").a("content", pageImageUrl).fg();
		e("meta").a("property", "og:image:width").a("content", pageImageLargeur).fg();
		e("meta").a("property", "og:image:height").a("content", pageImageHauteur).fg();
		e("meta").a("property", "og:image:type").a("content", pageImageTypeContenu).fg();
		e("meta").a("property", "og:image:alt").a("content", pageTitre).fg();
		e("meta").a("property", "og:type").a("content", "article").fg();
		e("meta").a("name", "twitter:card").a("content", "summary_large_image").fg();
		e("meta").a("name", "twitter:site").a("content", "@computateorg").fg();
		e("meta").a("name", "twitter:creator").a("content", "@computateorg").fg();
		e("meta").a("name", "twitter:title").a("content", pageTitre).fg();
		e("meta").a("name", "twitter:description").a("content", pageDescription).fg();
		e("meta").a("name", "twitter:image").a("content", pageImageUrl).fg();
		e("meta").a("name", "description").a("content", pageDescription).fg();
	}

	@Override public void htmlScriptsMiseEnPage() {
//		e("script").a("src", "https://code.jquery.com/jquery-1.12.4.min.js").f().g("script");
		e("script").a("src", statiqueUrlBase, "/js/jquery-1.12.4.min.js").f().g("script");
		e("script").a("src", statiqueUrlBase, "/js/site.js").f().g("script");
		e("script").a("src", statiqueUrlBase, "/js/UtilisateurSiteFrFRPage.js").f().g("script");
		e("script").a("src", statiqueUrlBase, "/js/moment.min.js").f().g("script");
		e("script").a("src", statiqueUrlBase, "/js/jqDatePicker.js").f().g("script");
		e("script").a("src", statiqueUrlBase, "/js/jquery.serialize-object.js").f().g("script");
//		e("script").a("src", "https://kit.fontawesome.com/a66bc13c75.js").f().g("script");
		e("script").a("async", "").a("defer", "").a("src", "https://apis.google.com/js/platform.js").f().g("script");
		e("script").a("async", "").a("src", "https://www.googletagmanager.com/gtag/js?id=UA-8782010-1").f().g("script");
		e("script").f().l("/*<![CDATA[*/");
			l("window.dataLayer = window.dataLayer || [];");
			l("function gtag(){dataLayer.push(arguments);}");
			l("gtag('js', new Date());");
			l("gtag('config', 'UA-8782010-1');");
		s("/*]]>*/").g("script");
	}

	@Override public void htmlScriptMiseEnPage() {
	}

	@Override public void htmlStylesMiseEnPage() {
		e("link").a("rel", "stylesheet").a("href", statiqueUrlBase, "/css/w3.css").fg();
		e("link").a("rel", "stylesheet").a("href", statiqueUrlBase, "/css/site.css").fg();
		e("link").a("rel", "stylesheet").a("href", statiqueUrlBase, "/css/datePicker.css").fg();
		e("link").a("rel", "stylesheet").a("href", "https://fonts.googleapis.com/css?family=Anonymous%20Pro%7CBellefair%7CJomhuria%7CPT%20Serif%3A700%7CStint%20Ultra%20Condensed&display=swap").fg();
		e("link").a("rel", "stylesheet").a("href", "https://pro.fontawesome.com/releases/v5.9.0/css/all.css").a("integrity", "sha384-vlOMx0hKjUCl4WzuhIhSNZSm2yQCaf0mOU1hEDK/iztH3gU4v5NMmJln9273A6Jz").a("crossorigin", "anonymous").fg();
		e("link").a("rel", "shortcut icon").a("href", statiqueUrlBase, "/png/c-key.png").fg();
	}

	@Override public void htmlStyleMiseEnPage() {
	}

	@Override public void htmlBodyMiseEnPage() {
	}

	/**
	 * r: Ce site est open source. 
	 * r.enUS: This site is open source. 
	 * r: Voir le code source ici sur github. 
	 * r.enUS: View the source code here on github. 
	 * r: Connectez-vous. 
	 * r.enUS: Let's get connected. 
	 * r: En-haut. 
	 * r.enUS: Up to the top. 
	 * r:"fr"
	 * r.enUS:"en"
	 */
	@Override public void htmlMiseEnPage() {
		if(requeteSite_.getOperationRequete().getParams().getJsonObject("query").getBoolean("pageRecapituler")) {
			pageRecapituler();
		}
		else {
			e("html").a("lang", "fr").f();
				e("head").f();
					e("title").f();
						sx(pageTitre);
					g("title");
					htmlMeta();
					htmlScripts();
					e("script").f().l("/*<![CDATA[*/");
					htmlScript();
					s("/*]]>*/").g("script");
					htmlStyles();
					e("style").f().l("/*<![CDATA[*/");
					htmlStyle();
					s("/*]]>*/").g("style");
		
				g("head");
				e("body").a("class", "w3-light-grey ").f(); 
					e("a").a("id", "top").f().g("a");
					JsonObject params = requeteSite_.getOperationRequete().getParams();
					if(StringUtils.equals("*:*", params.getJsonObject("query").getString("q")) && params.getJsonObject("query").getJsonArray("fq") == null) {
						e("script").a("async", "").a("defer", "").a("src", "//assets.pinterest.com/js/pinit_main.js?0.8726554954646004").f().g("script");
						e("div").a("id", "fb-root").f().g("div");
						e("script").f().l("/*<![CDATA[*/");
							l("(function(d, s, id) {");
							l("var js, fjs = d.getElementsByTagName(s)[0];");
							l("if (d.getElementById(id)) return;");
							l("js = d.createElement(s); js.id = id;");
							s("js.src = '");
							s("//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.10&appId=1871568493111919");
							l("';");
							l("fjs.parentNode.insertBefore(js, fjs);");
							l("}(document, 'script', 'facebook-jssdk'));");
						s("/*]]>*/").g("script");
						e("script").f().l("/*<![CDATA[*/");
							s("var _ctct_m = \"805a4a78c2843d257b9b05ea244b6ec7\"; ");
						s("/*]]>*/").g("script");
					}
					e("div").a("id", "modaleErreur").a("class", "w3-modal").a("onclick", "this.style.display = 'none';").f();
						e("div").a("class", "w3-modal-content w3-animate-zoom").f();
							e("header").a("class", "w3-container w3-center w3-red ").f();
								e("h3").f();
									sx("Une erreur s'est produite. ");
								g("h3");
							g("header");
						g("div");
						e("div").a("id", "modaleErreurMessage").a("class", "w3-container w3-center").f().g("div");
						e("header").a("class", "w3-container w3-center w3-padding-16 ").f();
							sx("L'erreur a été envoyée par e-mail à l'administrateur pour analyse. ");
						g("header");
					g("div");
					e("div").a("class", "site-section-all ").f();
						e("div").a("class", "site-section-above w3-light-grey ").f();
							e("div").a("class", "w3-center w3-black w3-text-white ").f();
								menu();
							g("div");
							e("div").a("id", "site-section-primary").a("class", "site-section-primary w3-text-black w3-padding-bottom-32 ").f();
								e("div").a("class", "w3-content ").f();
		
									{ t(3).e("div").a("class", "w3-card w3-padding w3-margin-top w3-show w3-white ").f();
										htmlBody();
									} t(3).g("div");
//	
//									{ t(3).e("div").a("class", "w3-row ").f();
//										htmlBodyCourt();
//									} t(3).g("div");
		
									abondonnezPas();
		
									partagerPage();
	
								g("div");
								e("footer").a("class", "w3-center w3-black w3-padding-48 ").f();
									e("div").a("class", "grow-30 w3-margin ").f();
										e("a").a("href", "https://www.openshift.com/").a("target", "_blank").f();
											e("span").a("class", "w3-large ").f();
												sx("Powered by ");
											g("span");
											e("img").a("alt", "").a("class", "w3-image ").a("style", "display: inline-block; width: 200px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/openshift.svg").fg();
										g("a");
									g("div");
								g("footer");
							g("div");
						g("div");
					g("div");
					e("div").a("class", "w3-row site-section-contact w3-text-white ").f();
						e("div").a("class", "w3-content w3-center  w3-cell-row w3-margin-bottom-32 ").f();
							menu();
							e("div").a("class", "w3-container ").f();
								e("div").a("class", "w3-container w3-text-black w3-margin-top ").f();
									e("h6").a("id", "h2-contactez-nous").a("class",  "w3-xlarge w3-text-white ").f();
										sx("Connectez-vous. ");
									g("h6");
									e("div").a("style", "").f();
										e("a").a("target", "_blank").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", "https://www.facebook.com/computateorg/").f();
											e("img").a("alt", "").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/facebook.svg").fg();
										g("a");
										e("a").a("target", "_blank").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", "https://twitter.com/computateorg").f();
											e("img").a("alt", "").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/twitter.svg").fg();
										g("a");
										e("a").a("target", "_blank").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", "https://www.instagram.com/computateorg/").f();
											e("img").a("alt", "").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/instagram.svg").fg();
										g("a");
										e("a").a("target", "_blank").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", "https://openclipart.org/user-detail/computateorg").f();
											e("img").a("alt", "").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/openclipart.svg").fg();
										g("a");
										e("a").a("target", "_blank").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", pageYoutubeUrl).f();
											e("img").a("alt", "").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/youtube.svg").fg();
										g("a");
										e("a").a("target", "_blank").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", pagePinterestUrl).f();
											e("img").a("alt", "").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/pinterest.svg").fg();
										g("a");
									g("div");
									e("h6").f();
										e("a").a("href", "#top").a("class", "w3-text-white ").f();
											sx("En-haut. ");
										g("a");
									g("h6");
								g("div");
							g("div");
						g("div");
					g("div");
				g("body");
			g("html");
		}
	}

	/** 
	 * r.enUS: Home 
	 * Accueil 
	 * r: "Langue"
	 * r.enUS: "Language"
	 * r: "Accueil"
	 * r.enUS: "Home"
	 * r: "À propos"
	 * r.enUS: "About"
	 * r: "Connexion"
	 * r.enUS: "Login"
	 * r: "Déconnexion"
	 * r.enUS: "Logout"
	 * r: "Cours"
	 * r.enUS: "Courses"
	 * r: "Leçons"
	 * r.enUS: "Lessons"
	 * r:"English").a("href", pageUriEnUS)
	 * r.enUS:"English").a("href", pageUri)
	 * r:"français").a("href", pageUri)
	 * r.enUS:"français").a("href", pageUriFrFR)
	 */
	public void menu()  {
		e("div").a("class", "w3-bar w3-text-white w3-padding-bottom-8 w3-padding-top-8 ").a("style", "padding-left: 16px; padding-right: 16px; ").f();
//			e("div").a("class", "site-bar-item w3-bar-item ").f();
//				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageAccueilUri).f();
//					e("img").a("src", statiqueUrlBase, "/svg/computate-keys.svg").a("style", "width: 250px; ").fg();
//					e("br").fg();
////					e("span").a("class", "site-menu-item").f();
////						sx("computate");
////					g("span");
//				g("a");
//			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("span").a("class", "header-icon-a grow-30 w3-center ").f();
					e("a").a("class", "w3-hover-opacity").a("title", "English").a("href", pageUriEnUS).f();
						e("img").a("alt", "").a("src", statiqueUrlBase, "/svg/flag-US.svg").a("style", "height: 50px; ").fg();
					g("a");
					e("a").a("class", "w3-hover-opacity").a("title", "français").a("href", pageUri).f();
						e("img").a("alt", "").a("src", statiqueUrlBase, "/svg/flag-FR.svg").a("style", "height: 50px; ").fg();
					g("a");
					e("br").fg();
					e("span").a("class", "site-menu-item").f();
						sx("Langue");
					g("span");
				g("span");
			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageAccueilUri).f();
//					e("img").a("alt", "").a("src", statiqueUrlBase, "/svg/computate-keys.svg").a("style", "width: 250px; ").fg();
					e("br").fg();
					e("span").a("class", "site-menu-item").f();
						sx("Accueil");
					g("span");
				g("a");
			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageBlogUri).f();
//					e("img").a("alt", "").a("src", statiqueUrlBase, "/svg/full-moon.svg").a("style", "height: 50px; ").fg();
					e("br").fg();
					e("span").a("class", "site-menu-item").f();
						sx("Blog");
					g("span");
				g("a");
			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageCoursUri).f();
//					e("img").a("alt", "").a("src", statiqueUrlBase, "/svg/cluster.svg").a("style", "height: 50px; ").fg();
					e("br").fg();
					e("span").a("class", "site-menu-item").f();
						sx("Cours");
					g("span");
				g("a");
			g("div");
//			e("div").a("class", "site-bar-item w3-bar-item ").f();
//				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageCoursUri).f();
//					e("img").a("alt", "").a("src", statiqueUrlBase, "/svg/full-moon.svg").a("style", "height: 50px; ").fg();
//					e("br").fg();
//					e("span").a("class", "site-menu-item").f();
//						sx("Leçons");
//					g("span");
//				g("a");
//			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageAProposUri).f();
//					e("img").a("alt", "").a("src", statiqueUrlBase, "/png/computate.png").a("style", "height: 50px; ").fg();
					e("br").fg();
					e("span").a("class", "site-menu-item").f();
						sx("À propos");
					g("span");
				g("a");
			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageFaqUri).f();
//					e("img").a("alt", "").a("src", statiqueUrlBase, "/svg/ufo.svg").a("style", "height: 50px; ").fg();
					e("br").fg();
					e("span").a("class", "site-menu-item").f();
						sx("FAQ");
					g("span");
				g("a");
			g("div");
			if(requeteSite_.getUtilisateurId() == null) {
				e("div").a("class", "site-bar-item w3-bar-item ").f();
					e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageUtilisateurUri).f(); 
//						e("img").a("alt", "").a("src", statiqueUrlBase, "/svg/astronaut-helmet.svg").a("style", "height: 50px; ").fg();
						e("br").fg();
						e("span").a("class", "site-menu-item").f();
							sx("Connexion");
						g("span");
					g("a");
				g("div");
			}
			if(requeteSite_.getUtilisateurId() != null) {
				e("div").a("class", "site-bar-item w3-bar-item ").f();
					e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageUtilisateurUri).f(); 
//						e("img").a("alt", "").a("src", statiqueUrlBase, "/svg/astronaut-helmet.svg").a("style", "height: 50px; ").fg();
						e("br").fg();
						e("span").a("class", "site-menu-item").f();
							sx(requeteSite_.getUtilisateurNom());
						g("span");
					g("a");
				g("div");
				e("div").a("class", "site-bar-item w3-bar-item ").f();
					e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageDeconnexionUri).f();
//						e("img").a("alt", "").a("src", statiqueUrlBase, "/svg/light-speed.svg").a("style", "height: 50px; ").fg();
						e("br").fg();
						e("span").a("class", "site-menu-item").f();
							sx("Déconnexion");
						g("span");
					g("a");
				g("div");
			}
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("br").fg();
				e("form").a("action", "https://www.paypal.com/donate").a("method", "post").a("target", "_top").f(); 
					e("input").a("type", "hidden").a("name", "hosted_button_id").a("value", "NK35539R3LMJY").fg();
					e("input").a("type", "image").a("src", "https://www.paypalobjects.com/fr_FR/FR/i/btn/btn_donate_SM.gif").a("border", "0").a("name", "submit").a("title", "PayPal - The safer, easier way to pay online!").a("alt", "Donate with PayPal button").fg();
					e("img").a("alt", "").a("border", "0").a("src", "https://www.paypal.com/fr_FR/i/scr/pixel.gif").a("width", "1").a("height", "1").fg();
				g("form");
			g("div");
		g("div");
	}

	/**
	 * r: N'abandonnez pas vos idées. Vous pouvez faire des choses compliquées ! 
	 * r.enUS: Don't give up on your dreams. You can do hard things! 
	 * @throws Exception
	 */
	public void abondonnezPas() {
		{ e("div").a("class", "w3-padding w3-margin-top w3-center site-abondonnezPas-div ").f();
			e("h3").f().sx("N'abandonnez pas vos idées. Vous pouvez faire des choses compliquées ! ").g("h3");
			{ e("div").f();
				e("img").a("alt", "").a("class", "w3-image ").a("src", statiqueUrlBase, "/svg/computate-keys.svg").fg();
			} g("div");
		} g("div");
	}

	/**  
	 * r:Partager cette page. 
	 * r.enUS:Share this story. 
	 */
	public void partagerPage() {
		JsonObject params = requeteSite_.getOperationRequete().getParams();
		if(StringUtils.equals("*:*", params.getJsonObject("query").getString("q")) && params.getJsonObject("query").getJsonArray("fq") == null) {
			{ e("div").a("class", "w3-content w3-center w3-margin w3-padding-top-32 ").f();
				e("h3").f().sx("Partager cette page. ").g("h3");
				{ e("div").a("class", "w3-cell-row ").f();
					{ e("div").a("class", "blog-publication-social-div w3-cell ").f();
						e("img").a("alt", "").a("class", "blog-publication-social-img").a("src", statiqueUrlBase, "/svg/facebook.svg").fg();
						{ e("div").f();
							e("div").a("class", "fb-like").a("data-href", pageUrl).a("data-layout", "box_count").a("data-action", "like").a("data-size", "small").a("data-show-faces", "true").a("data-share", "true").f().g("div");
						} g("div");
					} g("div");
					{ e("div").a("class", "blog-publication-social-div w3-cell ").f();
						e("img").a("alt", "").a("class", "blog-publication-social-img").a("src", statiqueUrlBase, "/svg/twitter.svg").fg();
						{ e("div").f();
							e("a").a("href", "https://twitter.com/share").a("class", "twitter-share-button ").a("data-show-count", "false").f().g("a");
							e("script").a("async", "").a("src", "//platform.twitter.com/widgets.js").f().g("script");
						} g("div");
					}g("div");
					{ e("div").a("class", "blog-publication-social-div w3-cell ").f();
						e("img").a("alt", "").a("class", "blog-publication-social-img").a("src", statiqueUrlBase, "/svg/pinterest.svg").fg();
						{ e("div").a("class",  "pinterest-div ").f();
							{ e("a");
								a("data-pin-media", pageImageUrl);
								a("data-pin-description", pageDescription);
								a("data-pin-url", pageUrl);
								a("data-pin-id", "");
								a("href", "https://www.pinterest.com/pin/create/button/");
								a("data-pin-do", "buttonPin");
								f();
									e("img").a("alt", "").a("src", "//assets.pinterest.com/images/pidgets/pinit_fg_en_rect_gray_20.png").fg();
							} g("a");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		}
	}

	public String formaterDateHeureCourt(Date date) {
		String resultat = "";
		if(date != null) {
			resultat = FORMATDateHeureCourt.format(date.toInstant().atZone(ZoneId.systemDefault()));
		}
		return resultat;
	}

	public String formaterDateCourt(Date date) {
		String resultat = "";
		if(date != null) {
			resultat = FORMATDateCourt.format(date.toInstant().atZone(ZoneId.systemDefault()));
		}
		return resultat;
	}

	public String formaterDateAffichage(Date date) {
		String resultat = "";
		if(date != null) {
			resultat = FORMATAffichage.format(date.toInstant());
		}
		return resultat;
	}

	public String formaterDateAffichage(LocalDateTime date) {
		String resultat = "";
		if(date != null) {
			resultat = FORMATAffichage.format(date);
		}
		return resultat;
	}

	/**
	 */
	public MiseEnPage e(String nomLocal) {
		String nomLocalParent = requeteSite_.getXmlPile().isEmpty() ? null : requeteSite_.getXmlPile().peek();

		boolean eNoWrapParent = nomLocalParent == null || HTML_ELEMENTS_NO_WRAP.contains(nomLocalParent);
		String tabulations = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\t"));
		String tabulationsEchappes = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\\t"));

		requeteSite_.getXmlPile().push(nomLocal);
		if(StringUtils.equals(nomLocal, "html"))
			w.s("<!DOCTYPE html>\n");
		if(!eNoWrapParent && !tabulationsEchappes.isEmpty()) {
			w.l();
			w.s(tabulations);
		}
		w.s("<");
		w.s(nomLocal);
		
		return this;
	}

	public MiseEnPage a1(String nomAttribut, Object...objets) {
		w.s(" ");
		w.s(nomAttribut);
		w.s("=\"");
		for(Object objet : objets) {
			if(objet != null) {
				String s = objet.toString();
				w.s(OutilXml.echapperDansCitatations(s));
			}
		}
		
		return this;
	}

	/**  
	 */
	public MiseEnPage a(String nomAttribut, Object...objets) {
		w.s(" ");
		w.s(nomAttribut);
		w.s("=\"");
		for(Object objet : objets) {
			if(objet != null) {
				String s = objet.toString();
				w.s(OutilXml.echapperDansCitatations(s));
			}
		}
		w.s("\"");
		
		return this;
	}

	public MiseEnPage a2() {
		w.s("\"");
		
		return this;
	}

	/** 
	 */
	public MiseEnPage f() {
		w.s(">");
		
		return this;
	}

	/**
	 */
	public MiseEnPage s(Object...objets) {
		for(Object objet : objets) {
			if(objet != null) {
				if(objet instanceof Chaine) {
					Chaine chaine = (Chaine)objet;
					String s = chaine.s();
					w.s(s);
				}
				else {
					String s = objet.toString();
					w.s(s);
				}
			}
		}
		
		return this;
	}

	/**
	 */
	public MiseEnPage t(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			s("\t");
		s(objets);
		return this;
	}

	/**
	 */
	public MiseEnPage tl(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			s("\t");
		s(objets);
		s("\n");
		return this;
	}

	/** 
	 */
	public MiseEnPage l(Object...objets) {
		s(objets);
		s("\n");
		return this;
	}

	public MiseEnPage lx(Object...objets) {
		s(objets);
		sx("\n");
		return this;
	}

	/** 
	 */
	public MiseEnPage sx(Object...objets) {
		for(Object objet : objets) {
			if(objet != null) {
				if(objet instanceof Chaine) {
					Chaine chaine = (Chaine)objet;
					String s = chaine.toString();
					w.s(OutilXml.echapper(s));
				}
				else {
					String s = objet.toString();
					w.s(OutilXml.echapper(s));
				}
			}
		}
		
		return this;
	}

	/**
	 */
	public MiseEnPage tx(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			sx("\t");
		sx(objets);
		return this;
	}

	/**
	 */
	public MiseEnPage tlx(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			sx("\t");
		sx(objets);
		sx("\n");
		return this;
	}

	/**
	 */
	public MiseEnPage fg() {
		w.s("/>");
		requeteSite_.getXmlPile().pop();
		
		return this;
	}

	/**    
	 */
	public MiseEnPage g(String nomLocal) {
		String nomLocalParent = requeteSite_.getXmlPile().peek();
		boolean eNoWrap = nomLocalParent == null || HTML_ELEMENTS_NO_WRAP.contains(nomLocal);

		requeteSite_.getXmlPile().pop();
		String tabulations = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\t"));
		String tabulationsEchappes = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\\t"));

		if(!eNoWrap && !tabulationsEchappes.isEmpty()) {
			w.l();
			w.s(tabulations);
		}
		w.s("</");
		w.s(nomLocal);
		w.s(">");
		
		return this;
	}
}
