package org.computate.site.frFR.utilisateur;               

import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.frFR.article.Article;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.recherche.ListeRecherche;

import io.vertx.core.json.JsonArray;
import io.vertx.ext.web.api.OperationRequest;

/** 
 * Api: true
 * MotCle: classeNomSimpleUtilisateurSite
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiMethode: PATCH
 * ApiUriRechercheFrFRPage: /frFR/utilisateur
 * ApiUriRechercheEnUSPage: /enUS/user
 * PageRechercheFrFRPage: UtilisateurSiteFrFRPage
 * PageRechercheEnUSPage: UtilisateurSiteEnUSPage
 * PageSuperRechercheFrFRPage: ClusterFrFRPage
 * PageSuperRechercheEnUSPage: ClusterEnUSPage
 * ApiUri: /api/site/utilisateur
 * Role: SiteAdmin
 * Filtre: utilisateurId
 * Sauvegarde: true
 * 
 * UnNom.frFR: un utilisateur du site
 * UnNom.enUS: a site user
 * NomPluriel.frFR: utilisateurs du site
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: book
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 616
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 616
 */             
public class UtilisateurSite extends UtilisateurSiteGen<Cluster> {  

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(org.computate.site.frFR.utilisateur.UtilisateurSite.class.getCanonicalName());
		l.add(org.computate.site.enUS.utilisateur.UtilisateurSite.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	/**  
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Description.frFR: L'identifiant Keycloak pour cet utilisateur. 
	 * NomAffichage.frFR: utilisateur ID
	 * NomAffichage.enUS: user ID
	 */      
	protected void _utilisateurId(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurId();
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Attribuer: CalculInr.utilisateurPk
	 */ 
	protected void _calculInrPks(List<Long> l) {
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le nom d'utilisateur pour se connecter au site. 
	 * NomAffichage.frFR: nom d'utilisateur
	 * NomAffichage.enUS: username
	 * HtmlLigne: 2
	 * Indexe: true
	 * Stocke: true
	 */   
	protected void _utilisateurNom(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNom();
		c.o(o);
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le mail pour recevoir des courriels. 
	 * NomAffichage.frFR: mail
	 * NomAffichage.enUS: email
	 * Indexe: true
	 * Stocke: true
	 */  
	protected void _utilisateurMail(Couverture<String> c) {
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le prénom pour cet utilisateur. 
	 * NomAffichage.frFR: prénom
	 * NomAffichage.enUS: first name
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _utilisateurPrenom(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurPrenom();
		c.o(o);
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le nom de famille pour cet utilisateur. 
	 * NomAffichage.frFR: nom de famille
	 * NomAffichage.enUS: last name
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _utilisateurNomFamille(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNomFamille();
		c.o(o);
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le prénom et nom de famille pour cet utilisateur. 
	 * NomAffichage.frFR: nom complet
	 * NomAffichage.enUS: full name
	 * HtmlLigne: 2
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _utilisateurNomComplet(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNomComplet();
		c.o(o);
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: L'URL du site Web pour cet utilisateur. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _utilisateurSite(Couverture<String> c) {
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le nom de famille pour cet utilisateur. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _utilisateurRecevoirCourriels(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * NomAffichage.frFR: voir archivé
	 * NomAffichage.enUS: see archived
	 * Description.frFR: Filter the search results in the application to show archived records. 
	 * Description.enUS: Filtrer les résultats de recherche dans l'application à voir les données archivées. 
	**/ 
	protected void _voirArchive(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * NomAffichage.frFR: voir supprimé
	 * NomAffichage.enUS: see deleted
	 * Description.frFR: Filter the search results in the application to show deleted records. 
	 * Description.enUS: Filtrer les résultats de recherche dans l'application à voir les données supprimées. 
	 **/ 
	protected void _voirSupprime(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 3
	 * NomAffichage.frFR:nom de domaine
	 * NomAffichage.enUS:domain name
	 * Description.frFR:Un nom de domaine est le nom de votre site web. Un nom de domaine est l'adresse à laquelle les internautes peuvent accéder à votre site Web. 
	 * Description.enUS:A domain name is your website name. A domain name is the address where Internet users can access your website. 
	 */   
	protected void _siteNomDomaine(Couverture<String> c) {
		c.o("example.com");
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 4
	 * NomAffichage.frFR:version de Zookeeper
	 * NomAffichage.enUS:Zookeeper version
	 */   
	protected void _zookeeperVersion(Couverture<String> c) {
		c.o("3.5.5");
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 4
	 * NomAffichage.frFR:port admin de Zookeeper
	 * NomAffichage.enUS:Zookeeper admin port
	 */   
	protected void _zookeeperPortAdmin(Couverture<Integer> c) {
		c.o(10280);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 4
	 * NomAffichage.frFR:port client de Zookeeper
	 * NomAffichage.enUS:Zookeeper client port
	 */ 
	protected void _zookeeperPortClient(Couverture<Integer> c) {
		c.o(10281);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 5
	 * NomAffichage.frFR:version de Solr
	 * NomAffichage.enUS:Solr version
	 */   
	protected void _solrVersion(Couverture<String> c) {
		c.o("7.1.0");
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 5
	 * NomAffichage.frFR:port client de Solr
	 * NomAffichage.enUS:Solr client port
	 */ 
	protected void _solrPortClient(Couverture<Integer> c) {
		c.o(10380);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 6
	 * NomAffichage.frFR:Configset Solr
	 * NomAffichage.enUS:Solr configset
	 */ 
	protected void _solrConfigset(Couverture<String> c) {
		c.o("computate");
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 6
	 * NomAffichage.frFR:Collection Solr
	 * NomAffichage.enUS:Solr collection
	 */ 
	protected void _solrCollection(Couverture<String> c) {
		c.o("site");
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
	 * 
	 **/
	protected void _listeArticle(ListeRecherche<Article> o) {
		o.setC(Article.class);
		o.setQuery("*:*");
		o.addSort("coursNumero_indexed_int", ORDER.desc);
		o.addSort("leconNumero_indexed_int", ORDER.desc);
		o.addFilterQuery("classeNomsCanoniques_indexed_strings:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.article.Article"));
		o.addFilterQuery("estLecon_indexed_boolean:true");
	}

	/**
	 * r: frFR
	 * r.enUS: enUS
	 * r: articles récents
	 * r.enUS: recent articles
	 * r: rechercher articles
	 * r.enUS: search articles
	 * r: leçon
	 * r.enUS: lesson
	 * r: cours
	 * r.enUS: course
	 * r: Gérer mon compte
	 * r.enUS: Manage my account
	 * r: actions de l'administrateur
	 * r.enUS: admin actions
	 * r: indexer tous les pages
	 * r.enUS: index all the pages
	 */ 
	public void htmlBody() {  
		OperationRequest operationRequete = requeteSite_.getOperationRequete();

		super.htmlBody();
		if(requeteSite_.getUtilisateurRolesRessource().contains("SiteAdmin")) {
			{ e("div").a("class", "w3-card-4 w3-margin-top w3-margin-bottom ").f();
				{ e("h1").a("class", "w3-container w3-vivid-greenish-blue ").f();
					e("i").a("class", "far fa-keyboard site-menu-icon ").f().g("i");
					sx("actions de l'administrateur");
				} g("h1");
				{ e("div").a("class", "w3-padding ").f();

					// FormFiltres PATCH
					{ e("form").a("action", "/api/cluster").a("id", "patchClusterFormFiltres").f();
					} g("form");
					{ e("form").a("action", "/api/cluster").a("id", "patchClusterFormValeurs").f();
					} g("form");
					e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3- ")
						.a("onclick", "patchClusterBase($('#patchClusterFormFiltres'), $('#patchClusterFormValeurs')); ")
						.f().sx("indexer tous les pages")
					.g("button");
				} g("div");
			} g("div");
		}
		{ e("a").a("href", requeteSite_.getConfigSite_().getAuthUrl(), "/realms/", requeteSite_.getConfigSite_().getAuthRoyaume(), "/account");
			a("class", "w3-btn w3-round w3-border w3-border-black w3-section w3-vivid-greenish-blue w3-ripple w3-padding w3-margin ");
			f();
			sx("Gérer mon compte");
		} g("a");

		{ e("div").a("class", "").f();
			{ e("form").a("id", "ArticleForm").a("style", "display: inline-block; ").a("method", "GET").a("action", "/frFR/article").a("onsubmit", "event.preventDefault(); rechercher($('#recherchePageRecherche_frFR')); return false; ").f();
				{ e("div").a("class", "w3-bar ").f();
					e("input").a("type", "text")
						.a("placeholder", "rechercher articles")
						.a("title", "")
						.a("class", "recherchePageRecherche_frFR w3-input w3-border w3-bar-item ")
						.a("name", "pageRecherche_frFR")
						.a("id", "recherchePageRecherche_frFR");
					operationRequete.getParams().getJsonObject("query").forEach(paramRequete -> {
						String entiteVar = null;
						String valeurIndexe = null;
						String paramNom = paramRequete.getKey();
						Object paramValeursObjet = paramRequete.getValue();
						JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);

						try {
							for(Object paramObjet : paramObjets) {
								switch(paramNom) {
									case "q":
										entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
										valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
										if("pageRecherche_frFR".equals(entiteVar))
											a("value", URLDecoder.decode(valeurIndexe, "UTF-8"));
								}
							}
						} catch(Exception e) {
							ExceptionUtils.rethrow(e);
						}
					});
					fg();
					{ e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-vivid-greenish-blue ")
						.f();
						e("i").a("class", "fas fa-search ").f().g("i");
					} g("button");
				} g("div");
			} g("form");
		} g("div");

		{ e("h1").f();
				e("i").a("class", Article.Article_IconeGroupe, " ", Article.Article_IconeNom, " site-menu-icon ").f().g("i");
			e("span").a("class", " ").f().sx("articles récents").g("span");
		} g("h1");
		{ e("div").a("class", "w3-row ").f();
			Map<String, Map<String, List<String>>> highlighting = listeArticle.getQueryResponse().getHighlighting();
			for(int i = 0; i < listeArticle.size(); i++) {
				Article o = listeArticle.getList().get(i);
				Map<String, List<String>> highlights = highlighting == null ? null : highlighting.get(o.getId());
				List<String> highlightList = highlights == null ? null : highlights.get(highlights.keySet().stream().findFirst().orElse(null));
				String uri = o.getPageUri();
				{ e("div").a("class", "w3-half w3-mobile ").f();
					{ e("div").a("class", "w3-card-4 w3-margin w3-white ").f();
						{ e("a").a("href", uri).f();
							{ e("span").a("class", "w3-container w3-responsive ").f();
								{ e("h3").a("class", "w3-margin-top ").f();
									sx(o.getArticleH1());
								} g("h3");
								{ e("div").a("class", "site-highlight w3-opacity ").f();
									sx(requeteSite_.getConfigSite_().getSiteUrlBase(), o.getPageUri());
								} g("div");
								{ e("h4").a("class", "w3-margin-top w3-margin-bottom ").f();
									sx(o.getArticleH2());
								} g("h4");
							} g("span");
							if(o.getPageImageUri() != null)
								e("img").a("src", statiqueUrlBase, "/", o.getPageImageUri()).a("class", "w3-image ").fg();
						} g("a");
					} g("div");
				} g("div");
			}
		} g("div");
	}
}
