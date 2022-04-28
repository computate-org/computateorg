package org.computate.site.frFR.article; 

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.solr.common.SolrDocument;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.MiseEnPage;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.page.parti.PagePart;
import org.computate.site.frFR.utilisateur.UtilisateurSite;

/**
 * Api: true
 * ApiUri: /api/article
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiMethode: Recherche
 * ApiMethode: GET
 * ApiUriRechercheFrFRPage: /frFR/article
 * ApiUriRechercheEnUSPage: /enUS/article
 * PageRechercheFrFRPage: ArticleFrFRPage
 * PageRechercheEnUSPage: ArticleEnUSPage
 * UnNom.frFR: un article
 * UnNom.enUS: an article
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: university
*/   
public class Article extends ArticleGen<Cluster> {  

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(Article.class.getCanonicalName());
		l.add(org.computate.site.enUS.article.Article.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	/**
	 * 
	 * {@inheritDoc}
	 **/ 
	protected void _statiqueUrlBase(Couverture<String> c) {
		c.o(requeteSite_.getConfigSite_().getStatiqueUrlBase()); 
	}

	protected void _documentSolr(Couverture<SolrDocument> c) {  
		c.o(requeteSite_.getDocumentSolr());
	}

	/** 
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * NomAffichage.enUS: Site domain name
	 * NomAffichage.frFR: Nom de domaine du site
	 * Le nom de domaine du site. 
	 * **/
	protected void _nomDomaine(Couverture<String> c) {
		c.o("example.com");
	}

	/**   
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * NomAffichage.enUS: Display name of the site
	 * NomAffichage.frFR: Nom d'affichage du site
	 * Le nom d'hôte du site. **/
	protected void _nomSite(Couverture<String> c) {
		c.o(nomDomaine);
	}

	/**	
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * NomAffichage.enUS: Site host name
	 * NomAffichage.frFR: Nom d'hôte du site
	 * Le nom d'hôte du site. **/
	protected void _nomHoteSite(Couverture<String> c) {
		c.o(nomDomaine);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * NomAffichage.enUS: site package name
	 * NomAffichage.frFR: nom d'ensemble du site
	 * 
	 */    
	protected void _nomEnsembleSite(Couverture<String> c) { 
		String[] partis = StringUtils.split(nomHoteSite, ".");
		ArrayUtils.reverse(partis);
		String o = StringUtils.join(partis, ".");
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * NomAffichage.enUS: Computer host name
	 * NomAffichage.frFR: Nom d'hôte de l'ordinateur
	 * Le nom d'hôte du site. 
	 * r: tour
	 * r.enUS: tower
	 * **/    
	protected void _nomHoteOrdinateur(Couverture<String> c) {
		c.o("tour1." + nomDomaine);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * NomAffichage.enUS: Server path
	 * NomAffichage.frFR: Chemin du serveur
	 * Le chemin vers le serveur. **/
	protected void _cheminServeur(Couverture<String> c) {
		String o = new StringBuilder("/srv/").append(nomHoteOrdinateur).toString();
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * NomAffichage.enUS: Project path
	 * NomAffichage.frFR: Chemin du projet
	 * Le chemin vers le projet du site. **/
	protected void _cheminProjet(Couverture<String> c) {
		String o = new StringBuilder(cheminServeur).append("/").append(nomDomaine).toString();
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * NomAffichage.enUS: User name
	 * NomAffichage.frFR: Nom d'utilisateur
	 * r: monutlisateur
	 * r.enUS: myuser
	 */
	protected void _utilisateurNom(Couverture<String> c) {
		String[] partis = requeteSite_.getUtilisateurNom() == null ? new String[0] : requeteSite_.getUtilisateurNom().split("\\W");
		if(partis.length > 0) {
			String o = partis[0];
			c.o(o);
		}
		else {
			c.o("monutilisateur");
		}
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * NomAffichage.enUS: Group name
	 * NomAffichage.frFR: Nom de groupe
	 * 
	 */ 
	protected void _groupeNom(Couverture<String> c) {
		c.o(utilisateurNom);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * NomAffichage.frFR: est cours
	 * NomAffichage.enUS: is course
	 */
	protected void _estCours(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * NomAffichage.frFR: est leçon
	 * NomAffichage.enUS: is lesson
	 */
	protected void _estLecon(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * NomAffichage.frFR: est article
	 * NomAffichage.enUS: is article
	 */
	protected void _estArticle(Couverture<Boolean> c) {
		c.o(true);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * HtmlLigne: 1
	 * HtmlColonne: 1
	 * NomAffichage.frFR: cours
	 * NomAffichage.enUS: course
	 */  
	protected void _coursNumero(Couverture<Integer> c) {
		Matcher m = Pattern.compile("^C(\\d+)", Pattern.MULTILINE).matcher(getClass().getSimpleName());
		if(m.find()) {
			Integer o = Integer.parseInt(m.group(1));
			c.o(o);
		}
	}

	/**
	 * leconNumeroCouverture.indexe: true
	 * Stocke: true
	 * Indexe: true
	 * HtmlColonne: 2
	 * NomAffichage.frFR: leçon
	 * NomAffichage.enUS: lesson
	 */
	protected void _leconNumero(Couverture<Integer> c) {
	}

	/**
	 * {@inheritDoc}
	 * HtmlLigne: 1
	 * NomAffichage.frFR: description
	 * NomAffichage.enUS: description
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _leconDescription(Couverture<String> c) {
		if(estLecon)
			c.o(articleH1_frFR + "\n" + articleH2_frFR);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Langue: enUS
	 * NomAffichage.enUS: title in English
	 */
	protected void _articleH1_enUS(Couverture<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Langue: frFR
	 * NomAffichage.frFR: titre en français
	 */
	protected void _articleH1_frFR(Couverture<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Langue: enUS
	 */
	protected void _articleH2_enUS(Couverture<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Langue: frFR
	 */ 
	protected void _articleH2_frFR(Couverture<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _articleH1(Couverture<String> c) {
		c.o(articleH1_frFR);
	}

	/**
	 * {@inheritDoc}
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _articleH2(Couverture<String> c) {
		c.o(articleH2_frFR);
	}

	/**
	 * {@inheritDoc}
	 * HtmlLigne: 1
	 * HtmlColonne: 3
	 * NomAffichage.frFR: description
	 * NomAffichage.enUS: description
	 * Highlighting: true
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _articleDescription(Couverture<String> c) {
		c.o(articleH1_frFR + "\n" + articleH2_frFR);
	}

	protected void _pageDescription(Couverture<String> c) {
		c.o(articleH1_frFR + "\n" + articleH2_frFR);
	}

	/**  
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _articleCree(Couverture<LocalDateTime> c) {
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageUri_enUS(Couverture<String> c) {
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageUri_frFR(Couverture<String> c) {
	}

	/**
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _pageUri(Couverture<String> c) {
		c.o(pageUri_frFR);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageImageUri_enUS(Couverture<String> c) {
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageImageUri_frFR(Couverture<String> c) {
	}

	/**
	 * r: frFR
	 * r.enUS: enUS
	 */
	protected void _pageImageUri(Couverture<String> c) {
		c.o(pageImageUri_frFR);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageCree(Couverture<LocalDateTime> c) {
		c.o(articleCree);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageH1(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_H1")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageH2(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_H2")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 * r: Crée : 
	 * r.enUS: Created: 
	 */
	protected void _pageH3(Couverture<String> c) { 
		if(pageCree != null)
			c.o("Crée : " + pageCree.format(MiseEnPage.FORMATAffichage));
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 * r: Titre
	 * r.enUS: Title
	 */
	protected void _pageTitre(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_Titre")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	/**
	 * {@inheritDoc}
	 * Texte: true
	 * Langue: enUS
	 */
	protected void _pageRecherche_enUS(List<String> l) {
	}

	/**
	 * {@inheritDoc}
	 * Texte: true
	 * Langue: frFR
	 */ 
	protected void _pageRecherche_frFR(List<String> l) {
	}

	public void htmlBody() {
		super.htmlBody();
	}

	@Override protected void _id(Couverture<String> c) {
		c.o(getClass().getCanonicalName());
	}

	protected void _pageParts(List<PagePart> l) {
	}

	public void avantPagePart(PagePart o, String var) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _utilisateurSite(Couverture<UtilisateurSite> c) {
		c.o(requeteSite_.getUtilisateurSite());
	}
	@Override public void htmlBodyArticle() {
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _utilisateurId(Couverture<String> c) {
		if(utilisateurSite != null)
			c.o(utilisateurSite.getUtilisateurId());
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _utilisateurSiteNomDomaine(Couverture<String> c) {
		if(utilisateurSite != null)
			c.o(utilisateurSite.getSiteNomDomaine());
	}

	/**
	 * r:Un nom de domaine est le nom de votre site web. Un nom de domaine est l'adresse à laquelle les internautes peuvent accéder à votre site Web. 
	 * r.enUS:A domain name is your website name. A domain name is the address where Internet users can access your website. 
	 * r:nom de domaine
	 * r.enUS:domain name
	 * r:rafraîchir la page
	 * r.enUS:refresh page
	 * r: Personnalisez le site entier pour votre domaine. 
	 * r.enUS: Customize the whole site for your domain. 
	 * r:Cliquez simplement sur le bouton 
	 * r.enUS:Just click the 
	 * r:[ Connexion ]
	 * r.enUS:[ Login ]
	 * r: ci-dessus. 
	 * r.enUS: button above. 
	 * r:Cliquez « New user? Register ». 
	 * r.enUS:Click: New user? Register
	 * r:C'est gratuit et vos informations sont privées. 
	 * r.enUS:It's free, and your information is private. 
	 * r:/frFR/utilisateur
	 * r.enUS:/enUS/user
	 */ 
	public void htmlBodyPersonnaliserAvant(PageHtml o) {
		if(utilisateurSite != null && requeteSite_.getUtilisateurRolesRessource().contains("SiteAdmin")) {
			{ e("div").a("class", "w3-card-4 w3-margin-bottom ").f();
				{ e("h1").a("class", "w3-container w3-vivid-greenish-blue ").f();
					e("i").a("class", "far fa-keyboard site-menu-icon ").f().g("i");
					sx("Site Admin. ");
				} g("h1");
				{ e("div").a("class", "w3-padding ").f();

					// FormFiltres PATCH
					{ e("form").a("action", "/api/cluster").a("id", "patchClusterFormFiltres").f();
					} g("form");
					{ e("form").a("action", "/api/cluster").a("id", "patchClusterFormValeurs").f();
					} g("form");
					e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3- ")
						.a("onclick", "patchCluster($('#patchClusterFormFiltres'), $('#patchClusterFormValeurs')); ")
						.f().sx("Indexer tous les pages")
					.g("button");
				} g("div");
			} g("div");
		}
		{ e("div").a("class", "w3-card-4 w3-margin-bottom ").f();
			{e("h1").a("class", "w3-container w3-vivid-greenish-blue ").f();
				e("i").a("class", "far fa-keyboard site-menu-icon ").f().g("i");
				sx("Personnalisez le site entier pour votre domaine. ");
			} g("h1");
			{ e("div").a("class", "w3-padding ").f();
				if(utilisateurSite == null) {
					{ e("ol").f();
						{ e("li").f();
							e("i").a("class", "far fa-sign-in-alt site-menu-icon ").f().g("i");
							sx("Cliquez simplement sur le bouton ");
							e("a").a("class", "").a("href", "/frFR/utilisateur").f(); 
								sx("[ Connexion ]");
							g("a");
							sx(" ci-dessus. ");
						} g("li");
						{ e("li").f();
							e("i").a("class", "far fa-users-medical site-menu-icon ").f().g("i");
							sx("Cliquez « New user? Register ». ");
						} g("li");
						{ e("li").f();
							e("i").a("class", "far fa-shield-check site-menu-icon ").f().g("i");
							sx("C'est gratuit et vos informations sont privées. ");
						} g("li");
					} g("ol");
				}
				else {
				}
			}
		}
	}

	public void htmlBodyPersonnaliserApres(PageHtml o) {
		{
			{
				if(utilisateurSite == null) {
				}
				else {
					e("a").a("href", "").f().g("a");
				}
			} g("div");
		} g("div");
	}
}
