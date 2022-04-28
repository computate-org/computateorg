package org.computate.site.frFR.utilisateur;

import java.lang.String;
import java.util.List;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.article.Article;
import org.computate.site.frFR.cluster.ClusterFrFRPage;
import org.computate.site.frFR.config.ConfigSite;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import org.computate.site.frFR.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.MiseEnPage;
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
public class UtilisateurSiteFrFRGenPage extends UtilisateurSiteFrFRGenPageGen<ClusterFrFRPage> {

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
			c.o("un utilisateur du site");
		else if(listeUtilisateurSite == null || listeUtilisateurSite.size() == 0)
			c.o("aucun utilisateur du site trouvé");
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
			c.o("aucun utilisateur du site trouvé");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/utilisateur");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/user");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/utilisateur-999.png");
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

	@Override public void initLoinUtilisateurSiteFrFRGenPage() {
		initUtilisateurSiteFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsUtilisateurSiteFrFRGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/UtilisateurSiteFrFRPage.js").f().g("script");
	}

	protected void _pageUriUtilisateurSite(Couverture<String> c) {
			c.o("/frFR/utilisateur");
	}

	@Override public void htmlScriptUtilisateurSiteFrFRGenPage() {
	}

	public void htmlFormPageUtilisateurSite(UtilisateurSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("crée").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modifié").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("nom d'utilisateur").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNom()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("nom complet").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNomComplet()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("action", "/api/site/utilisateur").a("id", "siteNomDomaineForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_siteNomDomaine").a("class", "").f().sx("nom de domaine").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "nom de domaine")
						.a("title", "Un nom de domaine est le nom de votre site web. Un nom de domaine est l'adresse à laquelle les internautes peuvent accéder à votre site Web. ")
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
					e("label").a("for", "Page_zookeeperVersion").a("class", "").f().sx("version de Zookeeper").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "version de Zookeeper")
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
					e("label").a("for", "Page_zookeeperPortAdmin").a("class", "").f().sx("port admin de Zookeeper").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "port admin de Zookeeper")
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
					e("label").a("for", "Page_zookeeperPortClient").a("class", "").f().sx("port client de Zookeeper").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "port client de Zookeeper")
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
					e("label").a("for", "Page_solrVersion").a("class", "").f().sx("version de Solr").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "version de Solr")
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
					e("label").a("for", "Page_solrPortClient").a("class", "").f().sx("port client de Solr").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "port client de Solr")
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
					e("label").a("for", "Page_solrConfigset").a("class", "").f().sx("Configset Solr").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "Configset Solr")
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
					e("label").a("for", "Page_solrCollection").a("class", "").f().sx("Collection Solr").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "Collection Solr")
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
					e("label").a("class", "").f().sx("crée").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modifié").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("nom d'utilisateur").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNom()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("nom complet").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNomComplet()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_siteNomDomaine").a("class", "").f().sx("nom de domaine").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "nom de domaine")
					.a("title", "Un nom de domaine est le nom de votre site web. Un nom de domaine est l'adresse à laquelle les internautes peuvent accéder à votre site Web. ")
					.a("class", "valeurSiteNomDomaine w3-input w3-border ")
					.a("name", "siteNomDomaine")
					.a("id", "POST_siteNomDomaine")
					.a("value", o.strSiteNomDomaine())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_zookeeperVersion").a("class", "").f().sx("version de Zookeeper").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "version de Zookeeper")
					.a("class", "valeurZookeeperVersion w3-input w3-border ")
					.a("name", "zookeeperVersion")
					.a("id", "POST_zookeeperVersion")
					.a("value", o.strZookeeperVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_zookeeperPortAdmin").a("class", "").f().sx("port admin de Zookeeper").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "port admin de Zookeeper")
					.a("class", "valeurZookeeperPortAdmin w3-input w3-border ")
					.a("name", "zookeeperPortAdmin")
					.a("id", "POST_zookeeperPortAdmin")
					.a("value", o.strZookeeperPortAdmin())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_zookeeperPortClient").a("class", "").f().sx("port client de Zookeeper").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "port client de Zookeeper")
					.a("class", "valeurZookeeperPortClient w3-input w3-border ")
					.a("name", "zookeeperPortClient")
					.a("id", "POST_zookeeperPortClient")
					.a("value", o.strZookeeperPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_solrVersion").a("class", "").f().sx("version de Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "version de Solr")
					.a("class", "valeurSolrVersion w3-input w3-border ")
					.a("name", "solrVersion")
					.a("id", "POST_solrVersion")
					.a("value", o.strSolrVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_solrPortClient").a("class", "").f().sx("port client de Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "port client de Solr")
					.a("class", "valeurSolrPortClient w3-input w3-border ")
					.a("name", "solrPortClient")
					.a("id", "POST_solrPortClient")
					.a("value", o.strSolrPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_solrConfigset").a("class", "").f().sx("Configset Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Configset Solr")
					.a("class", "valeurSolrConfigset w3-input w3-border ")
					.a("name", "solrConfigset")
					.a("id", "POST_solrConfigset")
					.a("value", o.strSolrConfigset())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_solrCollection").a("class", "").f().sx("Collection Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Collection Solr")
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
					e("label").a("class", "").f().sx("crée").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modifié").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("nom d'utilisateur").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNom()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("nom complet").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNomComplet()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_siteNomDomaine").a("class", "").f().sx("nom de domaine").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "nom de domaine")
					.a("title", "Un nom de domaine est le nom de votre site web. Un nom de domaine est l'adresse à laquelle les internautes peuvent accéder à votre site Web. ")
					.a("class", "setSiteNomDomaine w3-input w3-border ")
					.a("name", "setSiteNomDomaine")
					.a("id", "PATCH_siteNomDomaine")
					.a("value", o.strSiteNomDomaine())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_zookeeperVersion").a("class", "").f().sx("version de Zookeeper").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "version de Zookeeper")
					.a("class", "setZookeeperVersion w3-input w3-border ")
					.a("name", "setZookeeperVersion")
					.a("id", "PATCH_zookeeperVersion")
					.a("value", o.strZookeeperVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_zookeeperPortAdmin").a("class", "").f().sx("port admin de Zookeeper").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "port admin de Zookeeper")
					.a("class", "setZookeeperPortAdmin w3-input w3-border ")
					.a("name", "setZookeeperPortAdmin")
					.a("id", "PATCH_zookeeperPortAdmin")
					.a("value", o.strZookeeperPortAdmin())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_zookeeperPortClient").a("class", "").f().sx("port client de Zookeeper").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "port client de Zookeeper")
					.a("class", "setZookeeperPortClient w3-input w3-border ")
					.a("name", "setZookeeperPortClient")
					.a("id", "PATCH_zookeeperPortClient")
					.a("value", o.strZookeeperPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_solrVersion").a("class", "").f().sx("version de Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "version de Solr")
					.a("class", "setSolrVersion w3-input w3-border ")
					.a("name", "setSolrVersion")
					.a("id", "PATCH_solrVersion")
					.a("value", o.strSolrVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_solrPortClient").a("class", "").f().sx("port client de Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "port client de Solr")
					.a("class", "setSolrPortClient w3-input w3-border ")
					.a("name", "setSolrPortClient")
					.a("id", "PATCH_solrPortClient")
					.a("value", o.strSolrPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_solrConfigset").a("class", "").f().sx("Configset Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Configset Solr")
					.a("class", "setSolrConfigset w3-input w3-border ")
					.a("name", "setSolrConfigset")
					.a("id", "PATCH_solrConfigset")
					.a("value", o.strSolrConfigset())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_solrCollection").a("class", "").f().sx("Collection Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Collection Solr")
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
					e("label").a("class", "").f().sx("crée").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strCree()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("modifié").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strModifie()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("nom d'utilisateur").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNom()).g("span");
				} g("div");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("div").a("class", "").f();
					e("label").a("class", "").f().sx("nom complet").g("label");
				} g("div");
				{ e("div").a("class", "").f();
					e("span").f().sx(o.strUtilisateurNomComplet()).g("span");
				} g("div");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_siteNomDomaine").a("class", "").f().sx("nom de domaine").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "nom de domaine")
					.a("title", "Un nom de domaine est le nom de votre site web. Un nom de domaine est l'adresse à laquelle les internautes peuvent accéder à votre site Web. ")
					.a("class", "valeurSiteNomDomaine w3-input w3-border ")
					.a("name", "siteNomDomaine")
					.a("id", "Recherche_siteNomDomaine")
					.a("value", o.strSiteNomDomaine())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_zookeeperVersion").a("class", "").f().sx("version de Zookeeper").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "version de Zookeeper")
					.a("class", "valeurZookeeperVersion w3-input w3-border ")
					.a("name", "zookeeperVersion")
					.a("id", "Recherche_zookeeperVersion")
					.a("value", o.strZookeeperVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_zookeeperPortAdmin").a("class", "").f().sx("port admin de Zookeeper").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "port admin de Zookeeper")
					.a("class", "valeurZookeeperPortAdmin w3-input w3-border ")
					.a("name", "zookeeperPortAdmin")
					.a("id", "Recherche_zookeeperPortAdmin")
					.a("value", o.strZookeeperPortAdmin())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_zookeeperPortClient").a("class", "").f().sx("port client de Zookeeper").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "port client de Zookeeper")
					.a("class", "valeurZookeeperPortClient w3-input w3-border ")
					.a("name", "zookeeperPortClient")
					.a("id", "Recherche_zookeeperPortClient")
					.a("value", o.strZookeeperPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_solrVersion").a("class", "").f().sx("version de Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "version de Solr")
					.a("class", "valeurSolrVersion w3-input w3-border ")
					.a("name", "solrVersion")
					.a("id", "Recherche_solrVersion")
					.a("value", o.strSolrVersion())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_solrPortClient").a("class", "").f().sx("port client de Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "port client de Solr")
					.a("class", "valeurSolrPortClient w3-input w3-border ")
					.a("name", "solrPortClient")
					.a("id", "Recherche_solrPortClient")
					.a("value", o.strSolrPortClient())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_solrConfigset").a("class", "").f().sx("Configset Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Configset Solr")
					.a("class", "valeurSolrConfigset w3-input w3-border ")
					.a("name", "solrConfigset")
					.a("id", "Recherche_solrConfigset")
					.a("value", o.strSolrConfigset())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_solrCollection").a("class", "").f().sx("Collection Solr").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "Collection Solr")
					.a("class", "valeurSolrCollection w3-input w3-border ")
					.a("name", "solrCollection")
					.a("id", "Recherche_solrCollection")
					.a("value", o.strSolrCollection())
				.fg();

			} g("div");
		} g("div");
	}

	@Override public void htmlBodyUtilisateurSiteFrFRGenPage() {

		OperationRequest operationRequete = requeteSite_.getOperationRequete();
		JsonObject params = operationRequete.getParams();
		if(listeUtilisateurSite == null || listeUtilisateurSite.size() == 0) {
			// contexteAucunNomTrouve : aucun utilisateur du site trouvé

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("aucun utilisateur du site trouvé").g("span");
			} g("h1");
		} else if(listeUtilisateurSite != null && listeUtilisateurSite.size() == 1 && params.getJsonObject("query").getString("q").equals("*:*") && params.getJsonObject("query").getJsonArray("fq") == null) {
			// contexteUnNom : un utilisateur du site
			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
					e("span").a("class", " ").f().sx("un utilisateur du site").g("span");
				} g("h1");
				UtilisateurSite o = listeUtilisateurSite.get(0);
			}
		} else {
			// contexteNomPluriel : plusiers utilisateurs du site

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("utilisateurs du site").g("span");
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
						String uri = "/frFR/utilisateur/" + o.getPk();
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
		htmlBodyFormsUtilisateurSiteFrFRGenPage();
	}

	public void htmlBodyFormsUtilisateurSiteFrFRGenPage() {
		e("div").f();


		e("button")
			.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
			.a("onclick", "$('#patchUtilisateurSiteModale').show(); ")
			.f().sx("Modifier des utilisateurs du site")
		.g("button");
		{ e("div").a("id", "patchUtilisateurSiteModale").a("class", "w3-modal ").f();
			{ e("div").a("class", "w3-modal-content w3-card-4 ").f();
				{ e("header").a("class", "w3-container w3-green ").f();
					e("span").a("class", "w3-button w3-display-topright ").a("onclick", "$('#patchUtilisateurSiteModale').hide(); ").f().sx("×").g("span");
					e("h2").a("class", "").f().sx("Modifier des utilisateurs du site").g("h2");
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
						.f().sx("Rechercher des un utilisateur du site")
					.g("button");


					// FormValeurs PATCH
					{ e("form").a("action", "/api/site/utilisateur").a("id", "patchUtilisateurSiteFormValeurs").f();
						htmlFormPATCHUtilisateurSite(o);
					} g("form");
					e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
						.a("onclick", "patchUtilisateurSite($('#patchUtilisateurSiteFormFiltres'), $('#patchUtilisateurSiteFormValeurs')); ")
						.f().sx("Modifier des utilisateurs du site")
					.g("button");

				} g("div");
			} g("div");
		} g("div");

		g("div");
	}

}
