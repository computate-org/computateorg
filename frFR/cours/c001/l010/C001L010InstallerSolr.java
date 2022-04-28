package org.computate.site.frFR.cours.c001.l010; 

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;

/**
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/010-comment-installer-une-version-recente-du-moteur-de-recherche-solr
 * ApiUriRechercheEnUSPage: /enUS/course/001/010-how-to-install-a-recent-version-of-solr-search-engine
 * PageRechercheFrFRPage: C001L010InstallerSolrFrFRPage
 * PageRechercheEnUSPage: C001L010InstallerSolrEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNom.frFR: le leçon
 * UnNom.enUS: a lesson
 * 
 * H1.frFR: Comment puis-je essayer un moteur de recherche dans mon projet ? 
 * H1.enUS: How do I try out a search engine in my project? 
 * 
 * H2.frFR: Installer Solr à partir du code source. 
 * H2.enUS: Install Solr from the source code. 
 * 
 * Titre.frFR:Comment puis-je essayer un moteur de recherche dans mon projet ? Installer Solr à partir du code source. 
 * Titre.enUS:How do I try out a search engine in my project? Install Solr from the source code. 
 * 
 * Description.frFR: Les bases de données et les moteurs de recherche sont des ressources précieuses pour la gestion des données de différentes manières. Les bases de données sont idéales pour les données utilisateur persistantes et normalisées. Les moteurs de recherche sont parfaits pour les versions transformées, dénormalisées et interrogeables des données. Index rapides, mise en surbrillance des requêtes, pagination, filtres et facettisation ne sont que quelques-unes des fonctionnalités essentielles que vous pouvez ajouter à votre site avec un moteur de recherche. Je vous aiderai à installer une version récente de Solr pour ajouter la recherche à votre site Web de manière open source. 
 * Description.enUS: Databases and search engines are both valuable resources for serving up data in different ways. Databases are perfect for persistent, normalized user data. Search engines are perfect for transformed, denormalized, searchable versions of the data. Lightning fast indexes, query highlighting, pagination, filters and faceting are just a few of the crucial features you can add to your site with a search engine. I will help you install the most recent version of Solr to make your website searchable the open source way. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 1666
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 1454
*/  
public class C001L010InstallerSolr extends C001L010InstallerSolrGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(10);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L010InstallerSolr.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L010InstallerSolr_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.C001L010InstallerSolr_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L010InstallerSolr_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.C001L010InstallerSolr_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L010InstallerSolrEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L010InstallerSolrFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L010InstallerSolrEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L010InstallerSolrFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.C001L010InstallerSolr_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.C001L010InstallerSolr_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l010.C001L010InstallerSolr.C001L010InstallerSolrVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L010InstallerSolr_H1);
		addPageRecherche_frFR(C001L010InstallerSolr_H2);
		addPageRecherche_frFR(C001L010InstallerSolrVals);
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}  

	protected void _zookeeperPortClient(Couverture<Integer> c) {
		if(utilisateurSite == null)
			c.o(10281);
		else
			c.o(utilisateurSite.getZookeeperPortClient());
	}

	protected void _solrVersion(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("7.1.0");
		else
			c.o(utilisateurSite.getSolrVersion());
	}

	protected void _solrPortClient(Couverture<Integer> c) {
		if(utilisateurSite == null)
			c.o(10380);
		else
			c.o(utilisateurSite.getSolrPortClient());
	}

	protected void _solrTag(Couverture<String> c) {
		c.o("release-" + solrVersion);
	}

	protected void _solrConfigset(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("computate");
		else
			c.o(utilisateurSite.getSolrConfigset());
	}

	protected void _solrCollection(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("site");
		else
			c.o(utilisateurSite.getSolrCollection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Les bases de données et les moteurs de recherche sont des ressources précieuses pour la gestion des données de différentes manières. 
	 * Val.P.frFR:Les bases de données sont idéales pour les données utilisateur persistantes et normalisées. 
	 * Val.P.frFR:Les moteurs de recherche sont parfaits pour les versions transformées, dénormalisées et interrogeables des données. 
	 * Val.P.frFR:Index rapides, mise en surbrillance des requêtes, pagination, filtres et facettisation ne sont que quelques-unes des fonctionnalités essentielles que vous pouvez ajouter à votre site avec un moteur de recherche. 
	 * Val.P.frFR:Je vous aiderai à installer une version récente de Solr pour ajouter la recherche à votre site Web de manière open source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:Databases and search engines are both valuable resources for serving up data in different ways. 
	 * Val.P.enUS:Databases are perfect for persistent, normalized user data. 
	 * Val.P.enUS:Search engines are perfect for transformed, denormalized, searchable versions of the data. 
	 * Val.P.enUS:Lightning fast indexes, query highlighting, pagination, filters and faceting are just a few of the crucial features you can add to your site with a search engine. 
	 * Val.P.enUS:I will help you install the most recent version of Solr to make your website searchable the open source way. 
	 * 
	 * r: version de Solr
	 * r.enUS: Solr version
	 * r.frFR:port admin de Solr
	 * r.enUS:Solr admin port
	 * r.frFR:port client de Solr
	 * r.enUS:Solr client port
	 */    
	protected void _moi(PageHtml o) {
	}

	protected void _personnaliser(PageHtml o) {
	}
	@Override public void htmlBodyPersonnaliser(PageHtml o) {
		super.htmlBodyPersonnaliser(o);
		htmlBodyPersonnaliserAvant(o);
		if(utilisateurSite != null) {
			{ e("div").a("class", "w3-cell-row ").f();
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
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#zookeeperPortClientForm')); ")
							.a("value", strZookeeperPortClient())
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
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#solrVersionForm')); ")
							.a("value", strSolrVersion())
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
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#solrPortClientForm')); ")
							.a("value", strSolrPortClient())
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
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#solrConfigsetForm')); ")
							.a("value", strSolrConfigset())
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
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#solrCollectionForm')); ")
							.a("value", strSolrCollection())
						.fg();
	
					} g("form");
				} g("div");
			} g("div");
		}
		htmlBodyPersonnaliserApres(o);
		e("div").a("id", "sitePersonnaliser").f();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-conveyor-belt-alt
	 * Val.H3Span.frFR:Comment installer les dépendences pour Solr ? 
	 * Val.H3Span.enUS:How do I install the dependencies for Solr? 
	 * Val.H4I:far fa-cookie
	 * Val.H4Span.frFR:Construisez les dépendances avec yum. 
	 * Val.H4Span.enUS:Build the dependencies with yum. 
	 * Val.Pre1Span1:sudo
	 * Val.Pre1Span2: yum
	 * Val.Pre1Span3: install
	 * Val.Pre1Span4: -y
	 * Val.Pre1Span5: ivy lsof maven ant git
	 * 
	 * Val.Ol2Li1Dt:sudo
	 * Val.Ol2Li1Dd.frFR:: La commande pour installer des dépots yum commence par la commande sudo. 
	 * Val.Ol2Li1Dd.frFR:La commande "sudo" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. 
	 * Val.Ol2Li1Dd.frFR:L'installation des dépots yum nécessite toujours les privilèges root. 
	 * Val.Ol2Li1Dd.enUS:: The command to install yum repositories begins with the command sudo. 
	 * Val.Ol2Li1Dd.enUS:The "sudo" command allows your current user to have root privileges for a few minutes after entering your password. 
	 * Val.Ol2Li1Dd.enUS:Installing yum repositories always requires root privileges. 
	 * Val.Ol2Li2Dt:yum
	 * Val.Ol2Li2Dd.frFR:Signifie "Yellowdog Updater Modified", mais personne ne le connait comme yellowdog, juste yum. 
	 * Val.Ol2Li2Dd.frFR:CentOS gère les paquets de logiciel et les fichiers d'application RPM avec yum. 
	 * Val.Ol2Li2Dd.enUS:Stands for "Yellowdog Updater Modified", but nobody knows it as yellowdog, just yum. 
	 * Val.Ol2Li2Dd.enUS:CentOS manages software packages and RPM application files with yum. 
	 * Val.Ol2Li3Dt:install
	 * Val.Ol2Li3Dd.frFR: : Pour installer des nouveaux paquets yum. 
	 * Val.Ol2Li3Dd.enUS:: For installing new yum packages. 
	 * Val.Ol2Li4Dt:-y
	 * Val.Ol2Li4Dd.frFR: : Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. 
	 * Val.Ol2Li4Dd.enUS:: Suppress messages asking to confirm if you want to install the software. 
	 * Val.Ol2Li5Dt:ivy lsof maven ant git
	 * Val.Ol2Li5Dd.frFR: : Les noms de paquets des dépendances pour la construction de Solr à partir du code source. 
	 * Val.Ol2Li5Dd.enUS:: The package names of the dependencies for building Solr from the source code. 
	 */  
	protected void _questionDependences(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-files-medical
	 * Val.H3Span.frFR:Où est-ce que je place le code source Solr ? 
	 * Val.H3Span.enUS:Where do I put the Solr source code? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire solr dans /usr/local/src. 
	 * Val.H4Span.enUS:Create a solr directory in /usr/local/src. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /usr/local/src/solr
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2.frFR:install : Crée des répertoires et définit des attributs sur le nouveau répertoire. 
	 * Val.Ol2Li2.enUS:install: Creates directories and sets attributes on the new directory. 
	 * Val.Ol2Li3.frFR:-d : Créez tous les composants des répertoires spécifiés. 
	 * Val.Ol2Li3.enUS:-d: Create  directories. 
	 * Val.Ol2Li4.frFR:-o : Définir la propriété sur le répertoire (super-utilisateur uniquement). 
	 * Val.Ol2Li4.enUS:-o: Set ownership on the directory (super-user only). 
	 * Val.Ol2Li5.frFR:$USER : L'utilisateur actuel à rendre le propriétaire du répertoire. 
	 * Val.Ol2Li5.enUS:$USER: The current user to make the owner of the directory. 
	 * Val.Ol2Li6.frFR:-g : Définir la propriété du groupe sur le répertoire (super-utilisateur uniquement). 
	 * Val.Ol2Li6.enUS:-g: Set group ownership on the directory (super-user only). 
	 * Val.Ol2Li7.frFR:$USER : L'utilisateur actuel à rendre le propriétaire du groupe du répertoire. 
	 * Val.Ol2Li7.enUS:$USER: The current user to make the group owner of the directory. 
	 * Val.Ol2Li8.frFR:/usr/local est un endroit pour des logiciels supplémentaires que vous installez sans le gestionnaire de paquets. 
	 * Val.Ol2Li8.frFR:/usr/local/src est un bon endroit pour cloner vos référentiels de logiciels open source. 
	 * Val.Ol2Li8.enUS:/usr/local is a place for extra software that you install without the package manager. 
	 * Val.Ol2Li8.enUS:/usr/local/src is a good place to clone your open source software repositories. 
	 */  
	protected void _questionMkdirSrc(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-cloud-download
	 * Val.H3Span.frFR:Comment télécharger le code source de Solr ? 
	 * Val.H3Span.enUS:How do I download the Solr source code? 
	 * Val.H4I:fab fa-git
	 * Val.H4Span.frFR:Cloner le code source avec la commande git. 
	 * Val.H4Span.enUS:Clone the source code with the git command. 
	 * Val.PreSpan1:git
	 * Val.PreSpan2: clone
	 * Val.PreSpan3: https://github.com/apache/lucene-solr.git
	 * Val.PreSpan4: /usr/local/src/solr
	 * Val.PreSpan5: --single-branch
	 * Val.PreSpan6: --depth 1
	 * Val.PreSpan7Span1: --branch 
	 * Val:solrTag:.PreSpan7Span2:releases/lucene-solr/7.1.0
	 * 
	 * Val.Ol2Li1.frFR:git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. 
	 * Val.Ol2Li1.enUS:git: The distributed revision control system for most open source software. 
	 * Val.Ol2Li2.frFR:clone : Cloner un référentiel dans un répertoire. 
	 * Val.Ol2Li2.enUS:clone: Clone a repository into a directory. 
	 * Val.Ol2Li3.frFR:https://github.com/apache/lucene-solr.git : URL git vers le référentiel de code source Solr. 
	 * Val.Ol2Li3.enUS:https://github.com/apache/lucene-solr.git: The git URL to the Solr source code repository. 
	 * Val.Ol2Li4.frFR:/usr/local/src/solr : Répertoire dans lequel le code source Solr sera cloné. 
	 * Val.Ol2Li4.enUS:/usr/local/src/solr: The directory where the Solr source code will be cloned. 
	 * Val.Ol2Li5.frFR:--single-branch : Cloner et extraire uniquement l'historique menant au sommet d'une seule branche. 
	 * Val.Ol2Li5.enUS:--single-branch: Clone and checkout only the history leading to the tip of a single branch. 
	 * Val.Ol2Li6.frFR:--depth 1 : Ne récupérez aucun historique pour la branche. 
	 * Val.Ol2Li6.enUS:--depth 1: Do not retrieve any history for the branch. 
	 * Val.Ol2Li7Span1.frFR:--branch 
	 * Val:solrTag:.Ol2Li7Span2.frFR:releases/lucene-solr/7.1.0
	 * Val.Ol2Li7Span3.frFR: : La tag récente pour baser la branche. 
	 * Val.Ol2Li7Span1.enUS:):--branch 
	 * Val:solrTag:.Ol2Li7Span2.enUS:releases/lucene-solr/7.1.0
	 * Val.Ol2Li7Span3.enUS:): A recent tag to base the branch from. 
	 * 
	 * Val.P2.frFR:Solr a un dépôt git énorme avec beaucoup d’histoire et peut être lent à cloner. 
	 * Val.P2.frFR:Pour accélérer considérablement le temps, nous pouvons cloner une seule branche à la pointe. 
	 * Val.P2.frFR:La version 7.1.0 est une branche récente qui ne nécessite pas de nouvelle version de ant. 
	 * Val.P2.frFR:L'installation d'une version supérieure à 7.1.0 est plus difficile et je vous recommande d'attendre une mise à jour du système d'exploitation avec la version ant 1.10. *. 
	 * Val.P2.enUS:Solr has a huge git repository with a lot of history and can be slow to clone. 
	 * Val.P2.enUS:To greatly speed up time, we can clone a single branch at the tip. 
	 * Val.P2.enUS:The version 7.1.0 is a recent branch that doesn't require a new version of ant. 
	 * Val.P2.enUS:Installing a version greater than 7.1.0 is more challenging, and I would recommend waiting for an operating system upgrade with ant version 1.10.*. 
	 */  
	protected void _questionClonerSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-tools
	 * Val.H3Span.frFR:Comment contruire le code source de Solr ? 
	 * Val.H3Span.enUS:How do I build the Solr source code? 
	 * Val.H4I:far fa-terminal
	 * Val.H4Span.frFR:Construisez Solr avec la commande ant. 
	 * Val.H4Span.enUS:Build Solr with the ant command. 
	 * 
	 * Val.Pre1Span01:(cd
	 * Val.Pre1Span02: /usr/local/src/solr/solr
	 * Val.Pre1Span03: &&
	 * Val.Pre1Span04: ant
	 * Val.Pre1Span05: ivy-bootstrap)
	 * 
	 * Val.Ol1Li01:(cd
	 * Val.Ol1Li02:/usr/local/src/solr/solr
	 * Val.Ol1Li03:&&
	 * Val.Ol1Li04.frFR:ant : Un outil de construction pour les projets Java. 
	 * Val.Ol1Li04.enUS:ant:  A platform-independent build tool for Java projects. 
	 * Val.Ol1Li05.frFR:ivy-bootstrap) : Installez une copie d'Ivy dans votre bibliothèque utilisateur Ant. 
	 * Val.Ol1Li05.enUS:ivy-bootstrap): Install a copy of Ivy into your Ant User Library. 
	 * 
	 * Val.Pre2Span01:(cd
	 * Val.Pre2Span02: /usr/local/src/solr/solr
	 * Val.Pre2Span03: &&
	 * Val.Pre2Span04: ant
	 * Val.Pre2Span05: package)
	 * 
	 * Val.Ol2Li01:(cd
	 * Val.Ol2Li02:/usr/local/src/solr/solr
	 * Val.Ol2Li03:&&
	 * Val.Ol2Li04:ant
	 * Val.Ol2Li05.frFR:package) : Construisez Solr à partir du code source. 
	 * Val.Ol2Li05.enUS:package): Build Solr from the source code. 
	 */  
	protected void _questionConstruireSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-map-pin
	 * Val.H3Span.frFR:Après avoir compilé Solr, où puis-je l'installer en tant que serveur? 
	 * Val.H3Span.enUS:After compiling Solr, where do I install it as a server? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire solr dans /srv. 
	 * Val.H4Span.enUS:Create a solr directory in /srv. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /srv/solr
	 * 
	 * Val.Ol1Li1:sudo
	 * Val.Ol1Li2:install
	 * Val.Ol1Li3:-d
	 * Val.Ol1Li4:-o
	 * Val.Ol1Li5:$USER
	 * Val.Ol1Li6:-g
	 * Val.Ol1Li7:$USER
	 * Val.Ol1Li8.frFR:/srv est un bon endroit pour installer des serveurs logicielles open source telles que Solr qui fonctionnent comme un service. 
	 * Val.Ol1Li8.enUS:/srv is a good place to install open source software serveurs like Solr that run as a service. 
	 * 
	 * Val.Pre2Span1:rsync
	 * Val.Pre2Span2: -r
	 * Val.Pre2Span3Span1: /usr/local/src/solr/solr/build/solr-
	 * Val:solrVersion:.Pre2Span3Span2:7.1.0
	 * Val.Pre2Span3Span3:-SNAPSHOT/
	 * Val.Pre2Span4: /srv/solr/
	 * 
	 * Val.Ol2Li1.frFR:rsync: Un outil de copie de fichiers rapide et polyvalent, distant (et local). 
	 * Val.Ol2Li1.enUS:rsync: a fast, versatile, remote (and local) file-copying tool. 
	 * Val.Ol2Li2.frFR:-r: Recurse dans des répertoires. 
	 * Val.Ol2Li2.enUS:-r: Recurse into directories. 
	 * Val.Ol2Li3Span1.frFR:/usr/local/src/solr/build/solr-
	 * Val:solrVersion:.Ol2Li3Span2.frFR:7.1.0
	 * Val.Ol2Li3Span3.frFR:-SNAPSHOT/ : Le répertoire où l'application maven a été construite. 
	 * Val.Ol2Li3Span3.frFR:N'oubliez pas le slash à la fin ou rsync suppose qu'il s'agit d'un fichier dans la destination. 
	 * Val.Ol2Li3Span1.enUS:/usr/local/src/solr/build/solr-
	 * Val:solrVersion:.Ol2Li3Span2.enUS:7.1.0
	 * Val.Ol2Li3Span3.enUS:-SNAPSHOT/: The directory where the maven application was built. 
	 * Val.Ol2Li3Span3.enUS:Don't forget the ending slash or rsync assumes it's a file inside the destination. 
	 * Val.Ol2Li4.frFR:/srv/solr/ : Le répertoire où le serveur sera installé.
	 * Val.Ol2Li4.frFR:C'est préférable de toujours écrire des répertoires avec un slash dans rsync pour éviter les surprises. 
	 * Val.Ol2Li4.enUS:/srv/solr/: The directory where the server will be installed. 
	 * Val.Ol2Li4.enUS:It's best to always write directories with a trailing slash in rsync for fewer surprises. 
	 * 
	 * Val.Pre3Span1:chmod
	 * Val.Pre3Span2: a+x
	 * Val.Pre3Span3: /srv/solr/bin/*
	 * 
	 * Val.Ol3Li1.frFR:chmod: Changer les bits de mode de fichier. 
	 * Val.Ol3Li1.enUS:chmod: Change the file mode bits. 
	 * Val.Ol3Li2.frFR:a+x: Donner à tous les utilisateurs des privilèges exécutables sur les fichiers suivants. 
	 * Val.Ol3Li2.enUS:a+x: Give all users executable privileges on the following files. 
	 * Val.Ol3Li3.frFR:/srv/solr/bin/* : Les binaires Solr à rendre exécutable. 
	 * Val.Ol3Li3.enUS:/srv/solr/bin/*: The Solr binaries to make executable. 
	 * 
	 * Val.Pre4Span1:rm
	 * Val.Pre4Span2: -rf
	 * Val.Pre4Span3: /srv/solr/example/
	 * 
	 * Val.Ol4Li1.frFR:rm: Supprimer les fichiers et les répertoires. 
	 * Val.Ol4Li1.enUS:rm: Remove files and directories. 
	 * Val.Ol4Li2.frFR:-rf : Supprimez tous les fichiers et répertoires de manière récursive sans le demander. 
	 * Val.Ol4Li2.enUS:-rf: Remove all files and directories recursively without prompting. 
	 * Val.Ol4Li3.frFR:/srv/solr/example/ : Les fichiers d'exemples Solr générant des messages d’erreur lors du démarrage du serveur s’ils restent là. 
	 * Val.Ol4Li3.enUS:/srv/solr/example/: The Solr example files that will result in error messages when starting the server if they remain. 
	 */  
	protected void _questionMkdirServeur(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-ballot
	 * Val.H3Span.frFR:Comment puis-je configurer le serveur Solr ? 
	 * Val.H3Span.enUS:How do I configure the Solr server? 
	 * Val.H4I:far fa-file-alt
	 * Val.H4Span.frFR:Créez un fichier solr.xml. 
	 * Val.H4Span.enUS:Create a solr.xml file. 
	 * 
	 * Val.PreSpan1:echo '<?xml version="1.0" encoding="UTF-8" ?>
	 * Val.PreSpan1Br:<solr>
	 * Val.PreSpan1Br:	<solrcloud>
	 * Val.PreSpan1Br:		<str name="host">${host:}</str>
	 * Val.PreSpan1Br:		<int name="hostPort">${jetty.port:8983}</int>
	 * Val.PreSpan1Br:		<str name="hostContext">${hostContext:solr}</str>
	 * Val.PreSpan1Br:		<bool name="genericCoreNodeNames">${genericCoreNodeNames:true}</bool>
	 * Val.PreSpan1Br:		<int name="zkClientTimeout">${zkClientTimeout:30000}</int>
	 * Val.PreSpan1Br:		<int name="distribUpdateSoTimeout">${distribUpdateSoTimeout:600000}</int>
	 * Val.PreSpan1Br:		<int name="distribUpdateConnTimeout">${distribUpdateConnTimeout:60000}</int>
	 * Val.PreSpan1Br:		<str name="zkCredentialsProvider">${zkCredentialsProvider:org.apache.solr.common.cloud.DefaultZkCredentialsProvider}</str>
	 * Val.PreSpan1Br:		<str name="zkACLProvider">${zkACLProvider:org.apache.solr.common.cloud.DefaultZkACLProvider}</str>
	 * Val.PreSpan1Br:	</solrcloud>
	 * Val.PreSpan1Br:	<shardHandlerFactory name="shardHandlerFactory" class="HttpShardHandlerFactory">
	 * Val.PreSpan1Br:		<int name="socketTimeout">${socketTimeout:600000}</int>
	 * Val.PreSpan1Br:		<int name="connTimeout">${connTimeout:60000}</int>
	 * Val.PreSpan1Br:	</shardHandlerFactory>
	 * Val.PreSpan1Br:</solr>
	 * Val.PreSpan5Br:' | tee /srv/solr/solr.xml
	 * 
	 * Val.Ol2Li01.frFR:echo '...' : Écrivez une chaîne dans la console. 
	 * Val.Ol2Li01.enUS:echo '...': Write a string to the console. 
	 * Val.Ol2Li06.frFR:| : Lisez la chaîne dans la commande suivante. 
	 * Val.Ol2Li06.enUS:|: Read the string into the following command. 
	 * Val.Ol2Li07.frFR:tee : Ecrire une chaîne dans un fichier. 
	 * Val.Ol2Li07.enUS:tee: Write a string to a file. 
	 * Val.Ol2Li08.frFR:/srv/solr/solr.xml : Un nouveau fichier de configuration pour Solr. 
	 * Val.Ol2Li08.enUS:/srv/solr/solr.xml: A new config file for Solr. 
	 */ 
	protected void _questionConfigurer(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-file-check
	 * Val.H3Span.frFR:Comment créer un configset Solr pour mon site ? 
	 * Val.H3Span.enUS:How do I create a Solr configset for my site. 
	 * Val.H4I:far fa-hand-receiving
	 * Val.H4Span.frFR:Essayez mon propre configset préféré de mon projet opensource computate. 
	 * Val.H4Span.enUS:Try out my own favorite configset from my opensource project computate. 
	 * 
	 * Val.Pre1Span01:git
	 * Val.Pre1Span02: clone
	 * Val.Pre1Span03: https://github.com/computate/computate.git
	 * Val.Pre1Span04Span1: /srv/solr/server/solr/configsets/
	 * Val:solrConfigset:.Pre1Span04Span1:computate
	 * 
	 * P1.frFR:Un configset Solr est un ensemble de fichiers de configuration décrivant votre contenu indexable et recherchable. 
	 * P1.frFR:Il commence par un schéma et peut inclure beaucoup plus de configuration pour les synonymes, les mots d'arrêt, les langues, etc. 
	 * P1.enUS:A solr configset is a set of configuration files to describe your indexed, searchable content. 
	 * P1.enUS:It starts with a schema and can include much more configuration for synonyms, stop words, languages and more. 
	 * 
	 * Val.Ol1Li01:git
	 * Val.Ol1Li02:clone
	 * Val.Ol1Li03.frFR:https://github.com/computate/computate.git : Le référentiel git open source qui est la base de tout mon travail. 
	 * Val.Ol1Li03.enUS:https://github.com/computate/computate.git: The open source git repository that is the base of all my work. 
	 * Val.Ol1Li04Span1.frFR:/srv/solr/server/solr/configsets/
	 * Val:solrConfigset:.Ol1Li04Span2.frFR:computate
	 * Val.Ol1Li04Span3.frFR: : Le répertoire pour le configset Solr computate. 
	 * Val.Ol1Li04Span1.enUS:/srv/solr/server/solr/configsets/
	 * Val:solrConfigset:.Ol1Li04Span2.enUS:computate
	 * Val.Ol1Li04Span3.enUS:: The directory for the computate Solr configset. 
	 * 
	 * Val.Pre2Span01:(cd
	 * Val.Pre2Span02: /srv/solr/server/solr/configsets/computate/
	 * Val.Pre2Span03: &&
	 * Val.Pre2Span04: git
	 * Val.Pre2Span05: filter-branch
	 * Val.Pre2Span06: --subdirectory-filter
	 * Val.Pre2Span07: config/solr/server/solr/configsets/computate
	 * Val.Pre2Span08: HEAD)
	 * 
	 * Val.Ol2Li01:(cd
	 * Val:solrConfigset:.Ol2Li02Span1:/srv/solr/server/solr/configsets/
	 * Val:solrConfigset:.Ol2Li02Span2:computate
	 * Val.Ol2Li03:&&
	 * Val.Ol2Li04:git
	 * Val.Ol2Li05.frFR:filter-branch : Réécrivez la branche en appliquant des filtres personnalisés à chaque révision. 
	 * Val.Ol2Li05.enUS:filter-branch: Rewrite the branch, applying custom filters on each revision. 
	 * Val.Ol2Li06.frFR:--subdirectory-filter : Ne regardez que l'historique qui touche le sous-répertoire donné. 
	 * Val.Ol2Li06.enUS:--subdirectory-filter: Only look at the history which touches the given subdirectory. 
	 * Val.Ol2Li07.frFR:config/solr/server/solr/configsets/computate : Mon configset préféré à utiliser dans Solr. 
	 * Val.Ol2Li07.enUS:config/solr/server/solr/configsets/computate: My favorite configset to use in Solr. 
	 * Val.Ol2Li08.frFR:HEAD) : La révision HEAD actuelle à filtrer. 
	 * Val.Ol2Li08.enUS:HEAD): The current HEAD revision to filter. 
	 */  
	protected void _questionConfigurerConfigset(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-cloud-upload-alt
	 * Val.H3Span.frFR:Comment télécharger mon configset Solr sur Zookeeper ? 
	 * Val.H3Span.enUS:How do I upload my Solr configset to Zookeeper? 
	 * Val.H4I:far fa-file-upload
	 * Val.H4Span.frFR:Utilisez la commande solr zk upconfig. 
	 * Val.H4Span.enUS:Use the solr zk upconfig command. 
	 * 
	 * Val.Pre1Span01:/srv/solr/bin/solr
	 * Val.Pre1Span02: zk
	 * Val.Pre1Span03: upconfig
	 * Val.Pre1Span04Span1: -n 
	 * Val:solrConfigset:.Pre1Span04Span2:computate
	 * Val.Pre1Span05Span1: -d /srv/solr/server/solr/configsets/
	 * Val:solrConfigset:.Pre1Span05Span2:computate
	 * Val.Pre1Span06Span1: -z localhost:
	 * Val:zookeeperPortClient:.Pre1Span06Span2:10281
	 * 
	 * Val.Ol1Li01.frFR:/srv/solr/bin/solr : Le binaire exécutable solr. 
	 * Val.Ol1Li01.enUS:/srv/solr/bin/solr: The solr executable binary. 
	 * Val.Ol1Li02.frFR:zk : Effectuez une opération zookeeper avec les configsets Solr. 
	 * Val.Ol1Li02.enUS:zk: Perform a zookeeper operation with Solr configsets. 
	 * Val.Ol1Li03.frFR:upconfig : Téléchargez un configset Solr sur zookeeper. 
	 * Val.Ol1Li03.enUS:upconfig: Upload a Solr configset to zookeeper. 
	 * Val.Ol1Li04Span1.frFR:-n 
	 * Val:solrConfigset:.Ol1Li04Span2.frFR:computate
	 * Val.Ol1Li04Span3.frFR: : Le nom du configset Solr. 
	 * Val.Ol1Li04Span1.enUS:-n 
	 * Val:solrConfigset:.Ol1Li04Span2.enUS:computate
	 * Val.Ol1Li04Span3.enUS:: The name of the Solr configset. 
	 * Val.Ol1Li05Span1.frFR:-d /srv/solr/server/solr/configsets/
	 * Val:solrConfigset:.Ol1Li05Span2.frFR:computate
	 * Val.Ol1Li05Span3.frFR: : Le chemin vers le configset Solr. 
	 * Val.Ol1Li05Span1.enUS:-d /srv/solr/server/solr/configsets/
	 * Val:solrConfigset:.Ol1Li05Span2.enUS:computate
	 * Val.Ol1Li05Span3.enUS:: The path to the Solr configset. 
	 * Val.Ol1Li06Span1.frFR:-z localhost:
	 * Val:zookeeperPortClient:.Ol1Li06Span2.frFR:10281
	 * Val.Ol1Li06Span3.frFR: : Le nom d'hôte et le port vers le serveur Zookeeper. 
	 * Val.Ol1Li06Span1.enUS:-z localhost:
	 * Val:zookeeperPortClient:.Ol1Li06Span2.enUS:10281
	 * Val.Ol1Li06Span3.enUS:: The host and port to the Zookeeper server. 
	 */  
	protected void _questionConfigsetZookeeper(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-alarm-clock
	 * Val.H3Span.frFR:Comment puis-je exécuter Solr tout le temps au démarrage de mon ordinateur ? 
	 * Val.H3Span.enUS:How do I run Solr all the time, when my computer starts up? 
	 * Val.H4I:far fa-layer-plus
	 * Val.H4Span.frFR:Comment exécuter Solr en tant que service systemd. 
	 * Val.H4Span.enUS:How to run Solr as a systemd service. 
	 * 
 * Description.frFR:Une application Web conçue pour grandir doit être créée à l'aide d'un gestionnaire de cluster centralisé tel que Zookeper. Solr a beaucoup de travail pour résoudre les bugs et les conditions de concurrence inévitables dans les applications distribuées. Vous bénéficierez d'une configuration en cluster, d'un pool de sources de données partagées, de threads de travail en arrière-plan partagés et d'un bus d'événements en cluster pour les demandes misent à l'échelle et d'équilibrage de la charge. Je vous aiderai à installer la version la plus récente de Solr pour mettre à l'échelle votre site Web de manière open source. 
 * Description.enUS:A web application that is built to scale should be built using a centralized cluster manager like Zookeper. There is a lot of work that has gone into Solr that fix the bugs and race conditions that are inevitable in distributed applications. You will benefit from clustered configuration, shared data source pool, shared background worker threads, and a clustered event bus for scaling and load balancing requests. I will help you install the most recent version of Solr to scale your website the open source way. 
	 * 
	 * Val.PreSpan1:echo '
	 * Val.PreSpan1Br:[Unit]
	 * Val.PreSpan2Br.frFR:Description=Un moteur de recherche puissant et open source. 
	 * Val.PreSpan2Br.enUS:Description=A powerful open source search engine. 
	 * Val.PreSpan3Br:After=network.target
	 * Val.PreSpan3Br:
	 * Val.PreSpan3Br:[Service]
	 * Val.PreSpan3Br:Type=forking
	 * Val.PreSpan3Br:User='"$USER"'
	 * Val.PreSpan3Br:Group='"$USER"'
	 * Val.PreSpan4BrSpan1:ExecStart=/srv/solr/bin/solr -c -s /srv/solr -p 
	 * Val:solrPortClient:.PreSpan4Span2:10380
	 * Val.PreSpan4Span3: -z localhost:
	 * Val:zookeeperPortClient:.PreSpan4Span4:10281
	 * Val.PreSpan5Br:Restart=on-failure
	 * Val.PreSpan5Br:
	 * Val.PreSpan5Br:[Install]
	 * Val.PreSpan5Br:WantedBy=multi-user.target
	 * Val.PreSpan5Br:' | sudo tee /usr/lib/systemd/system/solr.service
	 * 
	 * Val.Ol2Li01.frFR:echo '...' : Écrivez une chaîne dans la console. 
	 * Val.Ol2Li01.enUS:echo '...': Write a string to the console. 
	 * Val.Ol2Li02.frFR:[Unit] : Un fichier de configuration « Unit » dont le nom se termine par ".service" code les informations relatives à un processus contrôlé et supervisé par systemd. 
	 * Val.Ol2Li02.enUS:[Unit]: A unit configuration file whose name ends in ".service" encodes information about a process controlled and supervised by systemd. 
	 * Val.Ol2Li03.frFR:Description=... : La description du service. 
	 * Val.Ol2Li03.enUS:Description=...: The description of the service. 
	 * Val.Ol2Li04.frFR:After=... : Le service Solr sera démarré après les dépendances suivantes. 
	 * Val.Ol2Li04.enUS:After=...: The Solr service will be started after the following dependencies. 
	 * Val.Ol2Li05.frFR:[Service] : Les informations relatives à un service contrôlé et supervisé par systemd. 
	 * Val.Ol2Li05.enUS:[Service]: Information about a service controlled and supervised by systemd. 
	 * Val.Ol2Li06.frFR:Type=forking : Parce qu'il est prévu que le processus configuré avec ExecStart= appelle fork() pendant son démarrage. 
	 * Val.Ol2Li06.enUS:Type=forking: Because it is expected that the process configured with ExecStart= will call fork() as part of its start-up. 
	 * Val.Ol2Li07.frFR:User=... : L'utilisateur en tant que l'utilisateur actuel qui exécutera le service. 
	 * Val.Ol2Li07.enUS:User=...: The user as the current user that will run the service. 
	 * Val.Ol2Li08.frFR:Group=... : L'utilisateur de groupe en tant que l'utilisateur actuel qui exécutera le service. 
	 * Val.Ol2Li08.enUS:Group=...: The group user as the current user that will run the service. 
	 * Val.Ol2Li09.frFR:ExecStart=... : La commande Solr qui lancera le service. 
	 * Val.Ol2Li09.enUS:ExecStart=...: The Solr command that will start the service. 
	 * Val.Ol2Li10.frFR:Restart=on-failure : Redémarrer le service en cas d'échec. 
	 * Val.Ol2Li10.enUS:Restart=on-failure: Restart the service if it fails. 
	 * Val.Ol2Li11.frFR:[Install] : Cette section est facultative et permet de définir le comportement ou une unité s’il est activé ou désactivé. 
	 * Val.Ol2Li11.enUS:[Install]: This section is optional and is used to define the behavior or a unit if it is enabled or disabled. 
	 * Val.Ol2Li12.frFR:WantedBy=multi-user.target : Lorsque le service est activé, un répertoire appelé multi-user.target.wants sera créé dans /etc/systemd/system (s'il n'est pas déjà disponible) et un lien symbolique vers l'unité actuelle sera placé dans celui-ci. 
	 * Val.Ol2Li12.enUS:WantedBy=multi-user.target: When the service is enabled, a directory called multi-user.target.wants will be created within /etc/systemd/system (if not already available) and a symbolic link to the current unit will be placed within. 
	 * Val.Ol2Li13.frFR:| : Lisez la chaîne dans la commande suivante. 
	 * Val.Ol2Li13.enUS:|: Read the string into the following command. 
	 * Val.Ol2Li14:sudo
	 * Val.Ol2Li15.frFR:tee : Ecrire une chaîne dans un fichier. 
	 * Val.Ol2Li15.enUS:tee: Write a string to a file. 
	 * Val.Ol2Li16.frFR:/usr/lib/systemd/system/solr.service : Un nouveau fichier de service systemd dans lequel écrire pour Solr. 
	 * Val.Ol2Li16.enUS:/usr/lib/systemd/system/solr.service: A new systemd service file to write to for Solr. 
	 */  
	protected void _questionService(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-search
	 * Val.H3Span.frFR:Comment le système connaît-il le nouveau service ? 
	 * Val.H3Span.enUS:How does the system know about the new service? 
	 * Val.H4I:far fa-redo-alt
	 * Val.H4Span.frFR:Rechargez le daemon systemd. 
	 * Val.H4Span.enUS:Reload the systemd daemon. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: daemon-reload
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2.frFR:systemctl : Contrôle le système systemd et le gestionnaire de services. 
	 * Val.Ol2Li2.enUS:systemctl: Controls the systemd system and service manager. 
	 * Val.Ol2Li3.frFR:daemon-reload : Rechargez le fichier de configuration d'une unité systemd. 
	 * Val.Ol2Li3.enUS:daemon-reload: Reload the configuration file of a systemd unit. 
	 */  
	protected void _questionSystemctlDaemonReload(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-toggle-off
	 * Val.H3Span.frFR:Comment activer le service Solr? 
	 * Val.H3Span.enUS:How do I enable the Solr service? 
	 * Val.H4I:far fa-toggle-on
	 * Val.H4Span.frFR:Utilisez la commande systemctl enable. 
	 * Val.H4Span.enUS:Use the systemctl enable command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: enable
	 * Val.PreSpan4: solr
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:enable : Activer un ou plusieurs fichiers d'unités ou instances de fichiers d'unités. 
	 * Val.Ol2Li3.enUS:enable: Enable one or more unit files or unit file instances. 
	 * Val.Ol2Li4.frFR:solr : Activez le service Solr pour démarrer au démarrage de l'ordinateur. 
	 * Val.Ol2Li4.enUS:solr: Enable the Solr service to start when the computer starts. 
	 */  
	protected void _questionSystemctlEnable(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-pause-circle
	 * Val.H3Span.frFR:Comment démarrer le service Solr? 
	 * Val.H3Span.enUS:How do I start the Solr service? 
	 * Val.H4I:far fa-play-circle
	 * Val.H4Span.frFR:Utilisez la commande systemctl start. 
	 * Val.H4Span.enUS:Use the systemctl start command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: start
	 * Val.PreSpan4: solr
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:start : Activer un ou plusieurs services. 
	 * Val.Ol2Li3.enUS:start: Start one or more services. 
	 * Val.Ol2Li4.frFR:solr : Démarrez le service Solr. 
	 * Val.Ol2Li4.enUS:solr: Start the Solr service. 
	 */  
	protected void _questionSystemctlStart(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-clipboard
	 * Val.H3Span.frFR:Comment puis-je m'assurer que le service Solr a démarré avec succès ? 
	 * Val.H3Span.enUS:How do I make sure the Solr service started successfully? 
	 * Val.H4I:far fa-clipboard-check
	 * Val.H4Span.frFR:Utilisez la commande systemctl status. 
	 * Val.H4Span.enUS:Use the systemctl status command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: status
	 * Val.PreSpan4: solr
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:status : Vérifiez le statut d'un ou plusieurs services. 
	 * Val.Ol2Li3.enUS:status: Check the status of one or more services. 
	 * Val.Ol2Li4.frFR:solr : Vérifiez le statut du service Solr. 
	 * Val.Ol2Li4.enUS:solr: Check the status of the Solr service. 
	 * 
	 * Val.P2.frFR:Et comme ça, votre serveur Solr est prêt pour que le client se connecte et commence à mettre en cluster. 
	 * Val.P2.frFR:Dans les leçons suivants, nous allons connecter un moteur de recherche ainsi que vos applications Web à Solr pour leur mettre en cluster. 
	 * Val.P2.enUS:And just like that, your Solr server is ready for client to connect and begin clustering. 
	 * Val.P2.enUS:In future lessons we will connect a search engine, as well as your web applications to Solr to allow them to scale. 
	 */  
	protected void _questionSystemctlStatus(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-sliders-h-square
	 * Val.H3Span.frFR:Comment créer des collections Solr pour commencer l'indexation et la recherche de mon contenu ? 
	 * Val.H3Span.enUS:How do I create Solr collections to begin indexing and searching my content? 
	 * Val.H4I:far fa-user-cog
	 * Val.H4Span.frFR:Créez des collections avec la commande solr. 
	 * Val.H4Span.enUS:Create collections with the solr command. 
	 * 
	 * P1.frFR:Une collection Solr est un index de recherche réel sur le système de fichiers basé sur un configset ou un schéma. 
	 * P1.enUS:A Solr collection is an actual search index on the filesystem based on a configset or schema. 
	 * 
	 * Val.Pre1Span01:/srv/solr/bin/solr
	 * Val.Pre1Span02: create_collection
	 * Val.Pre1Span03Span1: -c 
	 * Val:solrCollection:.Pre1Span03Span2:site
	 * Val.Pre1Span04Span1: -n 
	 * Val:solrConfigset:.Pre1Span04Span2:computate
	 * 
	 * Val.Ol1Li01:/srv/solr/bin/solr
	 * Val.Ol1Li02.frFR:create_collection : Effectuez une opération zookeeper avec les configsets Solr. 
	 * Val.Ol1Li02.enUS:create_collection: A Solr collection
	 * Val.Ol1Li03Span1.frFR:-c 
	 * Val.Ol1Li03Span1.enUS:-c 
	 * Val:solrCollection:.Ol1Li03Span2.frFR:site
	 * Val:solrCollection:.Ol1Li03Span2.enUS:site
	 * Val.Ol1Li03Span3.frFR: : Le nom de la collection Solr à créer. 
	 * Val.Ol1Li03Span3.enUS:: The name of the solr collection to create. 
	 * Val.Ol1Li04Span1.frFR:-n 
	 * Val.Ol1Li04Span1.enUS:-n 
	 * Val:solrCollection:.Ol1Li04Span2.frFR:computate
	 * Val:solrCollection:.Ol1Li04Span2.enUS:computate
	 * Val.Ol1Li04Span3.frFR: : Le nom de la collection Solr à créer. 
	 * Val.Ol1Li04Span3.enUS:: The name of the solr collection to create. 
	 */  
	protected void _questionCollectionsSolr(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-file-search
	 * Val.H3Span.frFR:Où puis-je aller une fois que j'ai installé un serveur Solr ? 
	 * Val.H3Span.enUS:Where can I go once I have installed a Solr server? 
	 * Val.H4I:far fa-list
	 * Val.H4Span.frFR:Voici quelques URLs utiles vers votre serveur Solr. 
	 * Val.H4Span.enUS:Here are some useful URLs related to your Solr server. 
	 * 
	 * Val.UlLi1A:http://localhost:10380/solr/#/
	 * Val.UlLi1Span.frFR:Le lien vers le tableau de bord Solr, pour des informations sur votre serveur Solr en cours d'exécution. 
	 * Val.UlLi1Span.enUS:The link to the Solr dashboard, for information about your running Solr server. 
	 * Val.UlLi2A:http://localhost:10380/solr/#/site/query
	 * Val.UlLi2Span.frFR:Une page pour interroger les résultats de la recherche pour l'index de votre site. 
	 * Val.UlLi2Span.enUS:A page for querying the search results for your site index. 
	 */  
	protected void _questionLiens(PageHtml o) {
	}
	@Override public void htmlBodyQuestionLiens(PageHtml o) {
		String urlBase = "http://localhost:" + solrPortClient;
		{ e("h3").a("class", " questionLiensH3 ").f();
			{ e("i").a("class", questionLiensH3I1, " site-menu-icon questionLiensH3I ").f();
			} g("i");
			{ e("span").a("class", " questionLiensH3Span ").f();
				sx(questionLiensH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionLiensH4 ").f();
			{ e("i").a("class", questionLiensH4I1, " site-menu-icon questionLiensH4I ").f();
			} g("i");
			{ e("span").a("class", " questionLiensH4Span ").f();
				sx(questionLiensH4Span1);
			} g("span");
		} g("h4");
		{ e("ul").a("class", " questionLiensUl ").f();
			{ e("li").a("class", " questionLiensUlLi1 questionLiensUlLi odd ").f();
				{ e("a").a("class", " questionLiensUlLi1A ").a("href", urlBase, "/solr/#/").f();
					sx(urlBase, "/solr/#/");
				} g("a");
				{ e("span").a("class", " questionLiensUlLi1Span ").f();
					sx(questionLiensUlLi1Span1);
				} g("span");
			} g("li");
			{ e("li").a("class", " questionLiensUlLi2 questionLiensUlLi even ").f();
				{ e("a").a("class", " questionLiensUlLi2A ").a("href", urlBase + "/solr/#/", solrCollection, "/query").f();
					sx(urlBase + "/solr/#/", solrCollection, "/query");
				} g("a");
				{ e("span").a("class", " questionLiensUlLi2Span ").f();
					sx(questionLiensUlLi2Span1);
				} g("span");
			} g("li");
		} g("ul");
	}

	/**
	 * Val.H3.frFR:À récapituler : 
	 * Val.H3.enUS:To review: 
	 */
	protected void _recapituler1(PageHtml o) {      
	}
	@Override public void htmlBodyRecapituler1(PageHtml o) {
		g("div");
		super.htmlBodyRecapituler1(o);
	}

	/**
	 * Val.TableTr1Td1.frFR:Lundi 
	 * Val.TableTr1Td1.enUS:Monday 
	 * Val.TableTr1Td2I:far fa-fast-forward
	 * Val.TableTr1Td3I:far fa-file-code
	 * Val.TableTr1Td4I:far fa-pen-nib
	 * Val.TableTr2Td1.frFR:3 Juin 2019
	 * Val.TableTr2Td1.enUS:June 3 2019
	 * Val.TableTr2Td2.frFR:Comment puis-je tester en développment la configuration en cluster, les demandes, les événements et les sources de données partagées ? 
	 * Val.TableTr2Td2.enUS:How do I try out clustered configuration, requests, events and shared data sources in development? 
	 * Val.TableTr2Td3.frFR:Installer Solr à partir du code source. 
	 * Val.TableTr2Td3.enUS:Install Solr from the source code. 
	 * Val.TableTr2Td4.frFR:Par Christophe Tate
	 * Val.TableTr2Td4.enUS:By Christopher Tate
	 */  
	protected void _recapituler2(PageHtml o) {    
	}

	/**
	 * 
	 * Val.TableTr01Td1I:far fa-question
	 * Val.TableTr01Td2.frFR:Questions
	 * Val.TableTr01Td2.enUS:Questions
	 * Val.TableTr01Td3I:far fa-bullhorn
	 * Val.TableTr01Td4.frFR:Reponses
	 * Val.TableTr01Td4.enUS:Answers
	 * 
	 * Val.TableTr02Td1I:far fa-conveyor-belt-alt
	 * Val.TableTr02Td2.frFR:Comment installer les dépendences pour Solr ? 
	 * Val.TableTr02Td2.enUS:How do I install the dependencies for Solr? 
	 * Val.TableTr02Td3Span1I:far fa-cookie
	 * Val.TableTr02Td4.frFR:Construisez les dépendances avec yum. 
	 * Val.TableTr02Td4.enUS:Build the dependencies with yum. 
	 * 
	 * Val.TableTr03Td1I:far fa-files-medical
	 * Val.TableTr03Td2.frFR:Où est-ce que je place le code source Solr ? 
	 * Val.TableTr03Td2.enUS:Where do I put the Solr source code? 
	 * Val.TableTr03Td3I:far fa-folder-tree
	 * Val.TableTr03Td4.frFR:Créez un répertoire solr dans /usr/local/src. 
	 * Val.TableTr03Td4.enUS:Create a solr directory in /usr/local/src. 
	 * 
	 * Val.TableTr04Td1I:far fa-cloud-download
	 * Val.TableTr04Td2.frFR:Comment télécharger le code source de Solr ? 
	 * Val.TableTr04Td2.enUS:How do I download the Solr source code? 
	 * Val.TableTr04Td3Span1I:fab fa-git
	 * Val.TableTr04Td4.frFR:Cloner le code source avec la commande git. 
	 * Val.TableTr04Td4.enUS:Clone the source code with the git command. 
	 * 
	 * Val.TableTr05Td1I:far fa-tools
	 * Val.TableTr05Td2.frFR:Comment contruire le code source de Solr ? 
	 * Val.TableTr05Td2.enUS:How do I build the Solr source code? 
	 * Val.TableTr05Td3I:far fa-terminal
	 * Val.TableTr05Td4.frFR:Construisez Solr avec la commande ant. 
	 * Val.TableTr05Td4.enUS:Build Solr with the ant command. 
	 * 
	 * Val.TableTr08Td1I:far fa-map-pin
	 * Val.TableTr08Td2.frFR:Après avoir compilé Solr, où puis-je l'installer en tant que serveur? 
	 * Val.TableTr08Td2.enUS:After compiling Solr, where do I install it as a server? 
	 * Val.TableTr08Td3I:far fa-folder-tree
	 * Val.TableTr08Td4.frFR:Créez un répertoire solr dans /srv. 
	 * Val.TableTr08Td4.enUS:Create a solr directory in /srv. 
	 * 
	 * Val.TableTr09Td1I:far fa-ballot
	 * Val.TableTr09Td2.frFR:Comment puis-je configurer le serveur Solr ? 
	 * Val.TableTr09Td2.enUS:How do I configure the Solr server? 
	 * Val.TableTr09Td3I:far fa-file-alt
	 * Val.TableTr09Td4.frFR:Créez un fichier solr.xml. 
	 * Val.TableTr09Td4.enUS:Create a solr.xml file. 
	 * 
	 * Val.TableTr10Td1I:far fa-file-check
	 * Val.TableTr10Td2.frFR:Comment créer un configset Solr pour mon site ? 
	 * Val.TableTr10Td2.enUS:How do I create a Solr configset for my site. 
	 * Val.TableTr10Td3I:far fa-hand-receiving
	 * Val.TableTr10Td4.frFR:Essayez mon propre configset préféré de mon projet opensource computate. 
	 * Val.TableTr10Td4.enUS:Try out my own favorite configset from my opensource project computate. 
	 * 
	 * Val.TableTr11Td1I:far fa-cloud-upload-alt
	 * Val.TableTr11Td2.frFR:Comment télécharger mon configset Solr sur Zookeeper ? 
	 * Val.TableTr11Td2.enUS:How do I upload my Solr configset to Zookeeper? 
	 * Val.TableTr11Td3I:far fa-file-upload
	 * Val.TableTr11Td4.frFR:Utilisez la commande solr zk upconfig. 
	 * Val.TableTr11Td4.enUS:Use the solr zk upconfig command. 
	 * 
	 * Val.TableTr12Td1I:far fa-alarm-clock
	 * Val.TableTr12Td2.frFR:Comment puis-je exécuter Solr tout le temps au démarrage de mon ordinateur ? 
	 * Val.TableTr12Td2.enUS:How do I run Solr all the time, when my computer starts up? 
	 * Val.TableTr12Td3I:far fa-layer-plus
	 * Val.TableTr12Td4.frFR:Comment exécuter Solr en tant que service systemd. 
	 * Val.TableTr12Td4.enUS:How to run Solr as a systemd service. 
	 * 
	 * Val.TableTr13Td1I:far fa-search
	 * Val.TableTr13Td2.frFR:Comment le système connaît-il le nouveau service ? 
	 * Val.TableTr13Td2.enUS:How does the system know about the new service? 
	 * Val.TableTr13Td3I:far fa-redo-alt
	 * Val.TableTr13Td4.frFR:Rechargez le daemon systemd. 
	 * Val.TableTr13Td4.enUS:Reload the systemd daemon. 
	 * 
	 * Val.TableTr14Td1I:far fa-toggle-off
	 * Val.TableTr14Td2.frFR:Comment activer le service Solr? 
	 * Val.TableTr14Td2.enUS:How do I enable the Solr service? 
	 * Val.TableTr14Td3I:far fa-toggle-on
	 * Val.TableTr14Td4.frFR:Utilisez la commande systemctl enable. 
	 * Val.TableTr14Td4.enUS:Use the systemctl enable command. 
	 * 
	 * Val.TableTr15Td1I:far fa-pause-circle
	 * Val.TableTr15Td2.frFR:Comment démarrer le service Solr? 
	 * Val.TableTr15Td2.enUS:How do I start the Solr service? 
	 * Val.TableTr15Td3I:far fa-play-circle
	 * Val.TableTr15Td4.frFR:Utilisez la commande systemctl start. 
	 * Val.TableTr15Td4.enUS:Use the systemctl start command. 
	 * 
	 * Val.TableTr16Td1I:far fa-clipboard
	 * Val.TableTr16Td2.frFR:Comment puis-je m'assurer que le service Solr a démarré avec succès ? 
	 * Val.TableTr16Td2.enUS:How do I make sure the Solr service started successfully? 
	 * Val.TableTr16Td3I:far fa-clipboard-check
	 * Val.TableTr16Td4.frFR:Utilisez la commande systemctl status. 
	 * Val.TableTr16Td4.enUS:Use the systemctl status command. 
	 * 
	 * Val.TableTr17Td1I:far fa-sliders-h-square
	 * Val.TableTr17Td2.frFR:Comment créer des collections Solr pour commencer l'indexation et la recherche de mon contenu ? 
	 * Val.TableTr17Td2.enUS:How do I create Solr collections to begin indexing and searching my content? 
	 * Val.TableTr17Td3I:far fa-user-cog
	 * Val.TableTr17Td4.frFR:Créez des collections avec la commande solr. 
	 * Val.TableTr17Td4.enUS:Create collections with the solr command. 
	 * 
	 * Val.TableTr18Td1I:far fa-file-search
	 * Val.TableTr18Td2.frFR:Où puis-je aller une fois que j'ai installé un serveur Solr ? 
	 * Val.TableTr18Td2.enUS:Where can I go once I have installed a Solr server? 
	 * Val.TableTr18Td3I:far fa-list
	 * Val.TableTr18Td4.frFR:Voici quelques URLs utiles vers votre serveur Solr. 
	 * Val.TableTr18Td4.enUS:Here are some useful URLs related to your Solr server. 
	 */ 
	protected void _recapituler3(PageHtml o) {      
	}
}
