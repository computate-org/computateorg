package org.computate.site.enUS.utilisateur;

import java.lang.String;
import java.util.List;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.article.Article;
import org.computate.site.frFR.cluster.ClusterFrFRPage;
import org.computate.site.enUS.cluster.ClusterEnUSPage;
import org.computate.site.enUS.config.ConfigSite;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enUS.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.MiseEnPage;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.core.json.JsonArray;
import java.net.URLDecoder;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Map;


/**
 * Traduire: false
 **/
public class UtilisateurSiteEnUSGenPage extends UtilisateurSiteEnUSGenPageGen<ClusterEnUSPage> {

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeUtilisateurSite(Couverture<ListeRecherche<UtilisateurSite>> c) {
	}

	protected void _utilisateurSite(Couverture<UtilisateurSite> c) {
		if(listeUtilisateurSite != null && listeUtilisateurSite.size() == 1)
			c.o(listeUtilisateurSite.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(utilisateurSite != null)
			c.o("a site user");
		else if(listeUtilisateurSite == null || listeUtilisateurSite.size() == 0)
			c.o("no site user found");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(utilisateurSite != null)
			c.o("");
		else if(listeUtilisateurSite == null || listeUtilisateurSite.size() == 0)
			c.o("no site user found");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/user");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/utilisateur");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/user-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(616);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("book");
	}

	@Override public void initLoinUtilisateurSiteEnUSGenPage() {
		initUtilisateurSiteEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsUtilisateurSiteEnUSGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/UtilisateurSiteEnUSPage.js").f().g("script");
	}

	protected void _pageUriUtilisateurSite(Couverture<String> c) {
			c.o("/enUS/user");
	}

	@Override public void htmlScriptUtilisateurSiteEnUSGenPage() {
	}

	public void htmlFormPageUtilisateurSite(UtilisateurSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("created").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modified").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("username").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNom()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("full name").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNomComplet()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("action", "/api/site/utilisateur").a("id", "siteNomDomaineForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_siteNomDomaine").a("class", "").f().sx("domain name").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "domain name")
						.a("class", "setSiteNomDomaine w3-input w3-border ")
						.a("name", "setSiteNomDomaine")
						.a("id", "Page_siteNomDomaine")
						.a("onclick", "enleverLueur($(this)); ")
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#siteNomDomaineForm')); ")
						.a("value", o.strSiteNomDomaine())
					.fg();

				} g("form");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("action", "/api/site/utilisateur").a("id", "zookeeperVersionForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_zookeeperVersion").a("class", "").f().sx("Zookeeper version").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "Zookeeper version")
						.a("class", "setZookeeperVersion w3-input w3-border ")
						.a("name", "setZookeeperVersion")
						.a("id", "Page_zookeeperVersion")
						.a("onclick", "enleverLueur($(this)); ")
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#zookeeperVersionForm')); ")
						.a("value", o.strZookeeperVersion())
					.fg();

				} g("form");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("action", "/api/site/utilisateur").a("id", "zookeeperPortAdminForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_zookeeperPortAdmin").a("class", "").f().sx("Zookeeper admin port").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "Zookeeper admin port")
						.a("class", "setZookeeperPortAdmin w3-input w3-border ")
						.a("name", "setZookeeperPortAdmin")
						.a("id", "Page_zookeeperPortAdmin")
						.a("onclick", "enleverLueur($(this)); ")
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#zookeeperPortAdminForm')); ")
						.a("value", o.strZookeeperPortAdmin())
					.fg();

				} g("form");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("action", "/api/site/utilisateur").a("id", "zookeeperPortClientForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_zookeeperPortClient").a("class", "").f().sx("Zookeeper client port").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "Zookeeper client port")
						.a("class", "setZookeeperPortClient w3-input w3-border ")
						.a("name", "setZookeeperPortClient")
						.a("id", "Page_zookeeperPortClient")
						.a("onclick", "enleverLueur($(this)); ")
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#zookeeperPortClientForm')); ")
						.a("value", o.strZookeeperPortClient())
					.fg();

				} g("form");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("action", "/api/site/utilisateur").a("id", "solrVersionForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_solrVersion").a("class", "").f().sx("Solr version").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "Solr version")
						.a("class", "setSolrVersion w3-input w3-border ")
						.a("name", "setSolrVersion")
						.a("id", "Page_solrVersion")
						.a("onclick", "enleverLueur($(this)); ")
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#solrVersionForm')); ")
						.a("value", o.strSolrVersion())
					.fg();

				} g("form");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("action", "/api/site/utilisateur").a("id", "solrPortClientForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_solrPortClient").a("class", "").f().sx("Solr client port").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "Solr client port")
						.a("class", "setSolrPortClient w3-input w3-border ")
						.a("name", "setSolrPortClient")
						.a("id", "Page_solrPortClient")
						.a("onclick", "enleverLueur($(this)); ")
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#solrPortClientForm')); ")
						.a("value", o.strSolrPortClient())
					.fg();

				} g("form");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("action", "/api/site/utilisateur").a("id", "solrConfigsetForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_solrConfigset").a("class", "").f().sx("Solr configset").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "Solr configset")
						.a("class", "setSolrConfigset w3-input w3-border ")
						.a("name", "setSolrConfigset")
						.a("id", "Page_solrConfigset")
						.a("onclick", "enleverLueur($(this)); ")
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#solrConfigsetForm')); ")
						.a("value", o.strSolrConfigset())
					.fg();

				} g("form");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("action", "/api/site/utilisateur").a("id", "solrCollectionForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_solrCollection").a("class", "").f().sx("Solr collection").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "Solr collection")
						.a("class", "setSolrCollection w3-input w3-border ")
						.a("name", "setSolrCollection")
						.a("id", "Page_solrCollection")
						.a("onclick", "enleverLueur($(this)); ")
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#solrCollectionForm')); ")
						.a("value", o.strSolrCollection())
					.fg();

				} g("form");
			} g("div");
		} g("div");
	}

	public void htmlFormPOSTUtilisateurSite(UtilisateurSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("created").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modified").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("username").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNom()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("full name").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNomComplet()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_siteNomDomaine").a("class", "").f().sx("domain name").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "domain name")
					.a("class", "valeurSiteNomDomaine w3-input w3-border ")
					.a("name", "siteNomDomaine")
					.a("id", "POST_siteNomDomaine")
					.a("value", o.strSiteNomDomaine())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_zookeeperVersion").a("class", "").f().sx("Zookeeper version").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Zookeeper version")
					.a("class", "valeurZookeeperVersion w3-input w3-border ")
					.a("name", "zookeeperVersion")
					.a("id", "POST_zookeeperVersion")
					.a("value", o.strZookeeperVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_zookeeperPortAdmin").a("class", "").f().sx("Zookeeper admin port").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Zookeeper admin port")
					.a("class", "valeurZookeeperPortAdmin w3-input w3-border ")
					.a("name", "zookeeperPortAdmin")
					.a("id", "POST_zookeeperPortAdmin")
					.a("value", o.strZookeeperPortAdmin())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_zookeeperPortClient").a("class", "").f().sx("Zookeeper client port").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Zookeeper client port")
					.a("class", "valeurZookeeperPortClient w3-input w3-border ")
					.a("name", "zookeeperPortClient")
					.a("id", "POST_zookeeperPortClient")
					.a("value", o.strZookeeperPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_solrVersion").a("class", "").f().sx("Solr version").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr version")
					.a("class", "valeurSolrVersion w3-input w3-border ")
					.a("name", "solrVersion")
					.a("id", "POST_solrVersion")
					.a("value", o.strSolrVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_solrPortClient").a("class", "").f().sx("Solr client port").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr client port")
					.a("class", "valeurSolrPortClient w3-input w3-border ")
					.a("name", "solrPortClient")
					.a("id", "POST_solrPortClient")
					.a("value", o.strSolrPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_solrConfigset").a("class", "").f().sx("Solr configset").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr configset")
					.a("class", "valeurSolrConfigset w3-input w3-border ")
					.a("name", "solrConfigset")
					.a("id", "POST_solrConfigset")
					.a("value", o.strSolrConfigset())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_solrCollection").a("class", "").f().sx("Solr collection").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr collection")
					.a("class", "valeurSolrCollection w3-input w3-border ")
					.a("name", "solrCollection")
					.a("id", "POST_solrCollection")
					.a("value", o.strSolrCollection())
				.fg();

			} g("div");
		} g("div");
	}

	public void htmlFormPATCHUtilisateurSite(UtilisateurSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("created").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modified").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("username").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNom()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("full name").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNomComplet()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_siteNomDomaine").a("class", "").f().sx("domain name").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "domain name")
					.a("class", "setSiteNomDomaine w3-input w3-border ")
					.a("name", "setSiteNomDomaine")
					.a("id", "PATCH_siteNomDomaine")
					.a("value", o.strSiteNomDomaine())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_zookeeperVersion").a("class", "").f().sx("Zookeeper version").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Zookeeper version")
					.a("class", "setZookeeperVersion w3-input w3-border ")
					.a("name", "setZookeeperVersion")
					.a("id", "PATCH_zookeeperVersion")
					.a("value", o.strZookeeperVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_zookeeperPortAdmin").a("class", "").f().sx("Zookeeper admin port").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Zookeeper admin port")
					.a("class", "setZookeeperPortAdmin w3-input w3-border ")
					.a("name", "setZookeeperPortAdmin")
					.a("id", "PATCH_zookeeperPortAdmin")
					.a("value", o.strZookeeperPortAdmin())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_zookeeperPortClient").a("class", "").f().sx("Zookeeper client port").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Zookeeper client port")
					.a("class", "setZookeeperPortClient w3-input w3-border ")
					.a("name", "setZookeeperPortClient")
					.a("id", "PATCH_zookeeperPortClient")
					.a("value", o.strZookeeperPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_solrVersion").a("class", "").f().sx("Solr version").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr version")
					.a("class", "setSolrVersion w3-input w3-border ")
					.a("name", "setSolrVersion")
					.a("id", "PATCH_solrVersion")
					.a("value", o.strSolrVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_solrPortClient").a("class", "").f().sx("Solr client port").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr client port")
					.a("class", "setSolrPortClient w3-input w3-border ")
					.a("name", "setSolrPortClient")
					.a("id", "PATCH_solrPortClient")
					.a("value", o.strSolrPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_solrConfigset").a("class", "").f().sx("Solr configset").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr configset")
					.a("class", "setSolrConfigset w3-input w3-border ")
					.a("name", "setSolrConfigset")
					.a("id", "PATCH_solrConfigset")
					.a("value", o.strSolrConfigset())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_solrCollection").a("class", "").f().sx("Solr collection").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr collection")
					.a("class", "setSolrCollection w3-input w3-border ")
					.a("name", "setSolrCollection")
					.a("id", "PATCH_solrCollection")
					.a("value", o.strSolrCollection())
				.fg();

			} g("div");
		} g("div");
	}

	public void htmlFormRechercheUtilisateurSite(UtilisateurSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("created").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modified").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("username").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNom()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("full name").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNomComplet()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_siteNomDomaine").a("class", "").f().sx("domain name").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "domain name")
					.a("class", "valeurSiteNomDomaine w3-input w3-border ")
					.a("name", "siteNomDomaine")
					.a("id", "Recherche_siteNomDomaine")
					.a("value", o.strSiteNomDomaine())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_zookeeperVersion").a("class", "").f().sx("Zookeeper version").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Zookeeper version")
					.a("class", "valeurZookeeperVersion w3-input w3-border ")
					.a("name", "zookeeperVersion")
					.a("id", "Recherche_zookeeperVersion")
					.a("value", o.strZookeeperVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_zookeeperPortAdmin").a("class", "").f().sx("Zookeeper admin port").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Zookeeper admin port")
					.a("class", "valeurZookeeperPortAdmin w3-input w3-border ")
					.a("name", "zookeeperPortAdmin")
					.a("id", "Recherche_zookeeperPortAdmin")
					.a("value", o.strZookeeperPortAdmin())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_zookeeperPortClient").a("class", "").f().sx("Zookeeper client port").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Zookeeper client port")
					.a("class", "valeurZookeeperPortClient w3-input w3-border ")
					.a("name", "zookeeperPortClient")
					.a("id", "Recherche_zookeeperPortClient")
					.a("value", o.strZookeeperPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_solrVersion").a("class", "").f().sx("Solr version").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr version")
					.a("class", "valeurSolrVersion w3-input w3-border ")
					.a("name", "solrVersion")
					.a("id", "Recherche_solrVersion")
					.a("value", o.strSolrVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_solrPortClient").a("class", "").f().sx("Solr client port").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr client port")
					.a("class", "valeurSolrPortClient w3-input w3-border ")
					.a("name", "solrPortClient")
					.a("id", "Recherche_solrPortClient")
					.a("value", o.strSolrPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_solrConfigset").a("class", "").f().sx("Solr configset").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr configset")
					.a("class", "valeurSolrConfigset w3-input w3-border ")
					.a("name", "solrConfigset")
					.a("id", "Recherche_solrConfigset")
					.a("value", o.strSolrConfigset())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_solrCollection").a("class", "").f().sx("Solr collection").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Solr collection")
					.a("class", "valeurSolrCollection w3-input w3-border ")
					.a("name", "solrCollection")
					.a("id", "Recherche_solrCollection")
					.a("value", o.strSolrCollection())
				.fg();

			} g("div");
		} g("div");
	}

	@Override public void htmlBodyUtilisateurSiteEnUSGenPage() {

		OperationRequest operationRequete = requeteSite_.getOperationRequete();
		JsonObject params = operationRequete.getParams();
		if(listeUtilisateurSite == null || listeUtilisateurSite.size() == 0) {
			// contexteAucunNomTrouve : no site user found

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("no site user found").g("span");
			} g("h1");
		} else if(listeUtilisateurSite != null && listeUtilisateurSite.size() == 1 && params.getJsonObject("query").getString("q").equals("*:*") && params.getJsonObject("query").getJsonArray("fq") == null) {
			// contexteUnNom : a site user
			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
					e("span").a("class", " ").f().sx("a site user").g("span");
				} g("h1");
				UtilisateurSite o = listeUtilisateurSite.get(0);
			}
		} else {
			// contexteNomPluriel : plusiers site users

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("site users").g("span");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					Map<String, Map<String, List<String>>> highlighting = listeUtilisateurSite.getQueryResponse().getHighlighting();
					for(int i = 0; i < listeUtilisateurSite.size(); i++) {
						UtilisateurSite o = listeUtilisateurSite.getList().get(i);
						Map<String, List<String>> highlights = highlighting == null ? null : highlighting.get(o.getId());
						List<String> highlightList = highlights == null ? null : highlights.get(highlights.keySet().stream().findFirst().orElse(null));
						String uri = "/enUS/user/" + o.getPk();
						{ e("tr").f();
						} g("tr");
					}
				} g("tbody");
			} g("table");
		}

		if(listeUtilisateurSite != null && listeUtilisateurSite.size() == 1 && params.getJsonObject("query").getString("q").equals("*:*") && params.getJsonObject("query").getJsonArray("fq") == null) {
			UtilisateurSite o = listeUtilisateurSite.first();

			{ e("div").a("class", "").f();

				if(o.getPk() != null) {
					{ e("form").a("action", "/api/site/utilisateur").a("id", "UtilisateurSiteForm").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageUtilisateurSite(o);
				}

				if(o != null)
					o.htmlBody();

			} g("div");
		}
		htmlBodyFormsUtilisateurSiteEnUSGenPage();
	}

	public void htmlBodyFormsUtilisateurSiteEnUSGenPage() {
		e("div").f();


		e("button")
			.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
			.a("onclick", "$('#patchUtilisateurSiteModale').show(); ")
			.f().sx("Modifier des site users")
		.g("button");
		{ e("div").a("id", "patchUtilisateurSiteModale").a("class", "w3-modal ").f();
			{ e("div").a("class", "w3-modal-content w3-card-4 ").f();
				{ e("header").a("class", "w3-container w3-green ").f();
					e("span").a("class", "w3-button w3-display-topright ").a("onclick", "$('#patchUtilisateurSiteModale').hide(); ").f().sx("×").g("span");
					e("h2").a("class", "").f().sx("Modifier des site users").g("h2");
				} g("header");
				{ e("div").a("class", "w3-container ").f();
					UtilisateurSite o = new UtilisateurSite();

					// FormFiltres PATCH
					{ e("form").a("action", "/api/site/utilisateur").a("id", "patchUtilisateurSiteFormFiltres").f();
						htmlFormRechercheUtilisateurSite(o);
					} g("form");
					e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
						.a("onclick", "rechercheUtilisateurSite($('#patchUtilisateurSiteFormFiltres')); ")
						.f().sx("Rechercher des a site user")
					.g("button");


					// FormValeurs PATCH
					{ e("form").a("action", "/api/site/utilisateur").a("id", "patchUtilisateurSiteFormValeurs").f();
						htmlFormPATCHUtilisateurSite(o);
					} g("form");
					e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
						.a("onclick", "patchUtilisateurSite($('#patchUtilisateurSiteFormFiltres'), $('#patchUtilisateurSiteFormValeurs')); ")
						.f().sx("Modifier des site users")
					.g("button");

				} g("div");
			} g("div");
		} g("div");

		g("div");
	}

}