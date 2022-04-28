package org.computate.site.frFR.cours.c001.l009; 

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;

/**
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/009-comment-installer-la-derniere-version-de-zookeeper
 * ApiUriRechercheEnUSPage: /enUS/course/001/009-how-to-install-the-latest-version-of-zookeeper
 * PageRechercheFrFRPage: C001L009InstallerZookeeperFrFRPage
 * PageRechercheEnUSPage: C001L009InstallerZookeeperEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNom.frFR: le leçon
 * UnNom.enUS: a lesson
 * 
 * H1.frFR: Comment puis-je tester en développment la configuration en cluster, les demandes, les événements et les sources de données partagées ? 
 * H1.enUS: How do I try out clustered configuration, requests, events and shared data sources in development? 
 * 
 * H2.frFR: Installer Zookeeper à partir du code source. 
 * H2.enUS: Install Zookeeper from the source code. 
 * 
 * Titre.frFR: Comment puis-je tester en développment la configuration en cluster, les demandes, les événements et les sources de données partagées ? Installer Zookeeper à partir du code source. 
 * Titre.enUS: How do I try out clustered configuration, requests, events and shared data sources in development? 
 * 
 * Description.frFR:Une application Web conçue pour grandir doit être créée à l'aide d'un gestionnaire de cluster centralisé tel que Zookeper. Zookeeper a beaucoup de travail pour résoudre les bugs et les conditions de concurrence inévitables dans les applications distribuées. Vous bénéficierez d'une configuration en cluster, d'un pool de sources de données partagées, de threads de travail en arrière-plan partagés et d'un bus d'événements en cluster pour les demandes misent à l'échelle et d'équilibrage de la charge. Je vous aiderai à installer la version la plus récente de Zookeeper pour mettre à l'échelle votre site Web de manière open source. 
 * Description.enUS:A web application that is built to scale should be built using a centralized cluster manager like Zookeper. There is a lot of work that has gone into Zookeeper that fix the bugs and race conditions that are inevitable in distributed applications. You will benefit from clustered configuration, shared data source pool, shared background worker threads, and a clustered event bus for scaling and load balancing requests. I will help you install the most recent version of Zookeeper to scale your website the open source way. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 1523
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 1981
*/  
public class C001L009InstallerZookeeper extends C001L009InstallerZookeeperGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(9);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L009InstallerZookeeper.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L009InstallerZookeeper_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.C001L009InstallerZookeeper_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L009InstallerZookeeper_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.C001L009InstallerZookeeper_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L009InstallerZookeeperEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L009InstallerZookeeperFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L009InstallerZookeeperEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L009InstallerZookeeperFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.C001L009InstallerZookeeper_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.C001L009InstallerZookeeper_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.C001L009InstallerZookeeperVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L009InstallerZookeeper_H1);
		addPageRecherche_frFR(C001L009InstallerZookeeper_H2);
		addPageRecherche_frFR(C001L009InstallerZookeeperVals);
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _zookeeperVersion(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("3.5.5");
		else
			c.o(utilisateurSite.getZookeeperVersion());
	}

	protected void _zookeeperPortAdmin(Couverture<Integer> c) {
		if(utilisateurSite == null)
			c.o(10280);
		else
			c.o(utilisateurSite.getZookeeperPortAdmin());
	}

	protected void _zookeeperPortClient(Couverture<Integer> c) {
		if(utilisateurSite == null)
			c.o(10281);
		else
			c.o(utilisateurSite.getZookeeperPortClient());
	}

	protected void _zookeeperTag(Couverture<String> c) {
		c.o("release-" + zookeeperVersion);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Une application Web conçue pour grandir doit être créée à l'aide d'un gestionnaire de cluster centralisé tel que Zookeper. 
	 * Val.P.frFR:Zookeeper a beaucoup de travail pour résoudre les bugs et les conditions de concurrence inévitables dans les applications distribuées. 
	 * Val.P.frFR:Vous bénéficierez d'une configuration en cluster, d'un pool de sources de données partagées, de threads de travail en arrière-plan partagés et d'un bus d'événements en cluster pour les demandes misent à l'échelle et d'équilibrage de la charge. 
	 * Val.P.frFR:Je vous aiderai à installer la version la plus récente de Zookeeper pour mettre à l'échelle votre site Web de manière open source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:A web application that is built to scale should be built using a centralized cluster manager like Zookeper. 
	 * Val.P.enUS:There is a lot of work that has gone into Zookeeper that fix the bugs and race conditions that are inevitable in distributed applications. 
	 * Val.P.enUS:You will benefit from clustered configuration, shared data source pool, shared background worker threads, and a clustered event bus for scaling and load balancing requests. 
	 * Val.P.enUS:I will help you install the most recent version of Zookeeper to scale your website the open source way. 
	 * 
	 * r: version de Zookeeper
	 * r.enUS: Zookeeper version
	 * r.frFR:port admin de Zookeeper
	 * r.enUS:Zookeeper admin port
	 * r.frFR:port client de Zookeeper
	 * r.enUS:Zookeeper client port
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
					{ e("form").a("action", "/api/site/utilisateur").a("id", "zookeeperVersionForm").a("style", "display: inline-block; ").f();
						e("label").a("for", "Page_zookeeperVersion").a("class", "").f().sx("version de Zookeeper").g("label");
		
						e("input")
							.a("type", "text")
							.a("placeholder", "version de Zookeeper")
							.a("class", "setZookeeperVersion w3-input w3-border ")
							.a("name", "setZookeeperVersion")
							.a("id", "Page_zookeeperVersion")
							.a("onclick", "enleverLueur($(this)); ")
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#zookeeperVersionForm')); ")
							.a("value", strZookeeperVersion())
						.fg();
		
					} g("form");
					{ e("form").a("action", "/api/site/utilisateur").a("id", "zookeeperPortAdminForm").a("style", "display: inline-block; ").f();
						e("label").a("for", "Page_zookeeperPortAdmin").a("class", "").f().sx("port admin de Zookeeper").g("label");
	
						e("input")
							.a("type", "text")
							.a("placeholder", "port admin de Zookeeper")
							.a("class", "setZookeeperPortAdmin w3-input w3-border ")
							.a("name", "setZookeeperPortAdmin")
							.a("id", "Page_zookeeperPortAdmin")
							.a("onclick", "enleverLueur($(this)); ")
							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#zookeeperPortAdminForm')); ")
							.a("value", strZookeeperPortAdmin())
						.fg();
	
					} g("form");
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
		}
		htmlBodyPersonnaliserApres(o);
		e("div").a("id", "sitePersonnaliser").f();
	}

	/**
	 * {@inheritDoc}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-conveyor-belt-alt
	 * Val.H3Span.frFR:Comment installer les dépendences pour Zookeeper ? 
	 * Val.H3Span.enUS:How do I install the dependencies for Zookeeper? 
	 * Val.H4I:far fa-cookie
	 * Val.H4Span.frFR:Construisez les dépendances avec yum. 
	 * Val.H4Span.enUS:Build the dependencies with yum. 
	 * Val.Pre1Span1:sudo
	 * Val.Pre1Span2: yum
	 * Val.Pre1Span3: install
	 * Val.Pre1Span4: -y
	 * Val.Pre1Span5: ivy lsof maven ant git libtool automake cppunit cppunit-devel python-setuptools
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
	 * Val.Ol2Li5Dt:ivy lsof maven ant git libtool automake cppunit cppunit-devel python-setuptools
	 * Val.Ol2Li5Dd.frFR: : Les noms de paquets des dépendances pour la construction de Zookeeper à partir du code source. 
	 * Val.Ol2Li5Dd.enUS:: The package names of the dependencies for building Zookeeper from the source code. 
	 */  
	protected void _questionDependences(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-files-medical
	 * Val.H3Span.frFR:Où est-ce que je place le code source Zookeeper ? 
	 * Val.H3Span.enUS:Where do I put the Zookeeper source code? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire zookeeper dans /usr/local/src. 
	 * Val.H4Span.enUS:Create a zookeeper directory in /usr/local/src. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /usr/local/src/zookeeper
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
	 * Val.H3Span.frFR:Comment télécharger le code source de Zookeeper ? 
	 * Val.H3Span.enUS:How do I download the Zookeeper source code? 
	 * Val.H4I:fab fa-git
	 * Val.H4Span.frFR:Cloner le code source avec la commande git. 
	 * Val.H4Span.enUS:Clone the source code with the git command. 
	 * Val.PreSpan1:git
	 * Val.PreSpan2: clone
	 * Val.PreSpan3: https://github.com/apache/zookeeper.git
	 * Val.PreSpan4: /usr/local/src/zookeeper
	 * 
	 * Val.Ol2Li1.frFR:git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. 
	 * Val.Ol2Li1.enUS:git: The distributed revision control system for most open source software. 
	 * Val.Ol2Li2.frFR:clone : Cloner un référentiel dans un répertoire. 
	 * Val.Ol2Li2.enUS:clone: Clone a repository into a directory. 
	 * Val.Ol2Li3.frFR:https://github.com/apache/zookeeper.git : URL git vers le référentiel de code source Zookeeper. 
	 * Val.Ol2Li3.enUS:https://github.com/apache/zookeeper.git: The git URL to the Zookeeper source code repository. 
	 * Val.Ol2Li4.frFR:/usr/local/src/zookeeper : Répertoire dans lequel le code source Zookeeper sera cloné. 
	 * Val.Ol2Li4.enUS:/usr/local/src/zookeeper: The directory where the Zookeeper source code will be cloned. 
	 */  
	protected void _questionClonerSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-code-branch
	 * Val.H3Span.frFR:Comment choisir une version récente de Zookeeper ? 
	 * Val.H3Span.enUS:How do I pick a recent version of Zookeeper? 
	 * Val.H4I:far fa-tag
	 * Val.H4Span.frFR:Listez toutes les tags du référentiel git. 
	 * Val.H4Span.enUS:List all the tags in the git repository. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/zookeeper
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: tag)
	 * 
	 * Val.Ol2Li1.frFR:(cd : Changer de répertoire temporairement avec la parenthèse ouverte. 
	 * Val.Ol2Li1.enUS:(cd: Change directory temporarily, because of the open parenthesis. 
	 * Val.Ol2Li2.frFR:/usr/local/src/zookeeper : Répertoire dans lequel le code source Zookeeper a été cloné. 
	 * Val.Ol2Li2.enUS:/usr/local/src/zookeeper: The directory where the Zookeeper source code was cloned. 
	 * Val.Ol2Li3.frFR:&& : Exécutez la commande cd et git ensemble. 
	 * Val.Ol2Li3.enUS:&&: Run the cd and git command together. 
	 * Val.Ol2Li4:git
	 * Val.Ol2Li5.frFR:tag) : Répertorie les tags actuelles ou les versions assignées du code et ferme la parenthèse. 
	 * Val.Ol2Li5.enUS:tag): Lists the current tags or assigned versions of the code and close the parenthesis. 
	 */  
	protected void _questionListerTags(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-code-merge
	 * Val.H3Span.frFR:Comment changer de version du code source de Zookeeper ? 
	 * Val.H3Span.enUS:How do I switch versions of the Zookeeper source code? 
	 * Val.H4I:far fa-code-commit
	 * Val.H4Span.frFR:Checkout la tag git. 
	 * Val.H4Span.enUS:Checkout the git tag. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/zookeeper
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: checkout
	 * Val.PreSpan6Span1: 
	 * Val:zookeeperTag:.PreSpan6Span2:release-3.5.5
	 * Val.PreSpan6Span3:)
	 * 
	 * Val.Ol2Li1:(cd
	 * Val.Ol2Li2:/usr/local/src/zookeeper
	 * Val.Ol2Li3:&&
	 * Val.Ol2Li4:git
	 * Val.Ol2Li5.frFR:checkout : Checkout une branche dans l’arbre de travail. 
	 * Val.Ol2Li5.enUS:checkout: Checkout a branch to the working tree. 
	 * Val:zookeeperTag:.Ol2Li6Span1.frFR:release-3.5.5
	 * Val.Ol2Li6Span2.frFR:) : La dernière tag pour baser la branche. 
	 * Val:zookeeperTag:.Ol2Li6Span1.enUS:release-3.5.5
	 * Val.Ol2Li6Span2.enUS:): The latest tag to base the branch from. 
	 */  
	protected void _questionCheckoutTag(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-tools
	 * Val.H3Span.frFR:Comment contruire le code source de Zookeeper ? 
	 * Val.H3Span.enUS:How do I build the Zookeeper source code? 
	 * Val.H4I:far fa-terminal
	 * Val.H4Span.frFR:Construisez Zookeeper avec la commande configure. 
	 * Val.H4Span.enUS:Build Zookeeper with the configure command. 
	 * 
	 * Val.Pre1Span01:(cd
	 * Val.Pre1Span02: /usr/local/src/zookeeper
	 * Val.Pre1Span03: &&
	 * Val.Pre1Span04: ant
	 * Val.Pre1Span05: package)
	 * 
	 * Val.Ol1Li01:(cd
	 * Val.Ol1Li02:/usr/local/src/zookeeper
	 * Val.Ol1Li03:&&
	 * Val.Ol1Li04.frFR:ant : Un outil de construction pour les projets Java. 
	 * Val.Ol1Li04.enUS:ant:  A platform-independent build tool for Java projects. 
	 * Val.Ol1Li05.frFR:package) : Construisez Zookeeper à partir du code source. 
	 * Val.Ol1Li05.enUS:package): Build Solr from the source code. 
	 */  
	protected void _questionConstruireSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-map-pin
	 * Val.H3Span.frFR:Après avoir compilé Zookeeper, où puis-je l'installer en tant que serveur? 
	 * Val.H3Span.enUS:After compiling Zookeeper, where do I install it as a server? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire zookeeper dans /srv. 
	 * Val.H4Span.enUS:Create a zookeeper directory in /srv. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /srv/zookeeper
	 * 
	 * Val.Ol1Li1:sudo
	 * Val.Ol1Li2:install
	 * Val.Ol1Li3:-d
	 * Val.Ol1Li4:-o
	 * Val.Ol1Li5:$USER
	 * Val.Ol1Li6:-g
	 * Val.Ol1Li7:$USER
	 * Val.Ol1Li8.frFR:/srv est un bon endroit pour installer des serveurs logicielles open source telles que Zookeeper qui fonctionnent comme un service. 
	 * Val.Ol1Li8.enUS:/srv is a good place to install open source software serveurs like Zookeeper that run as a service. 
	 * 
	 * Val.Pre2Span1:rsync
	 * Val.Pre2Span2: -r
	 * Val.Pre2Span3Span1: /usr/local/src/zookeeper/build/zookeeper-
	 * Val:zookeeperVersion:.Pre2Span3Span2:3.5.5
	 * Val.Pre2Span3Span3:-SNAPSHOT/
	 * Val.Pre2Span4: /srv/zookeeper/
	 * 
	 * Val.Ol2Li1.frFR:rsync: Un outil de copie de fichiers rapide et polyvalent, distant (et local). 
	 * Val.Ol2Li1.enUS:rsync: a fast, versatile, remote (and local) file-copying tool. 
	 * Val.Ol2Li2.frFR:-r: Recurse dans des répertoires. 
	 * Val.Ol2Li2.enUS:-r: Recurse into directories. 
	 * Val.Ol2Li3Span1.frFR:/usr/local/src/zookeeper/build/zookeeper-
	 * Val:zookeeperVersion:.Ol2Li3Span2.frFR:3.5.5
	 * Val.Ol2Li3Span3.frFR:-SNAPSHOT/ : Le répertoire où l'application maven a été construite. 
	 * Val.Ol2Li3Span3.frFR:N'oubliez pas le slash à la fin ou rsync suppose qu'il s'agit d'un fichier dans la destination. 
	 * Val.Ol2Li3Span1.enUS:/usr/local/src/zookeeper/build/zookeeper-
	 * Val:zookeeperVersion:.Ol2Li3Span2.enUS:3.5.5
	 * Val.Ol2Li3Span3.enUS:-SNAPSHOT/: The directory where the maven application was built. 
	 * Val.Ol2Li3Span3.enUS:Don't forget the ending slash or rsync assumes it's a file inside the destination. 
	 * Val.Ol2Li4.frFR:/srv/zookeeper/ : Le répertoire où le serveur sera installé.
	 * Val.Ol2Li4.frFR:C'est préférable de toujours écrire des répertoires avec un slash dans rsync pour éviter les surprises. 
	 * Val.Ol2Li4.enUS:/srv/zookeeper/: The directory where the server will be installed. 
	 * Val.Ol2Li4.enUS:It's best to always write directories with a trailing slash in rsync for fewer surprises. 
	 */  
	protected void _questionMkdirServeur(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-ballot
	 * Val.H3Span.frFR:Comment puis-je configurer le serveur Zookeeper ? 
	 * Val.H3Span.enUS:How do I configure the Zookeeper server? 
	 * Val.H4I:far fa-file-alt
	 * Val.H4Span.frFR:Créez un fichier zoo.cfg dans le répertoire conf. 
	 * Val.H4Span.enUS:Create a zoo.cfg file in the conf directory. 
	 * 
	 * Val.PreSpan1:echo '
	 * Val.PreSpan1Br:tickTime=2000
	 * Val.PreSpan2Br:dataDir=/srv/zookeeper/data
	 * Val.PreSpan3BrSpan1:admin.serverPort=
	 * Val:zookeeperPortAdmin:.PreSpan3Span2:10280
	 * Val.PreSpan4BrSpan1:clientPort=
	 * Val:zookeeperPortClient:.PreSpan4Span2:10281
	 * Val.PreSpan5Br:' | tee /srv/zookeeper/conf/zoo.cfg
	 * 
	 * Val.Ol2Li01.frFR:echo '...' : Écrivez une chaîne dans la console. 
	 * Val.Ol2Li01.enUS:echo '...': Write a string to the console. 
	 * Val.Ol2Li02.frFR:tickTime=2000 : Longueur recommandée d'un tick, qui est l'unité de temps de base utilisée par ZooKeeper, mesurée en millisecondes. 
	 * Val.Ol2Li02.frFR:tickTime=2000 : C'est utilisé pour réguler les battements de coeur et les délais d'attente. 
	 * Val.Ol2Li02.enUS:tickTime=2000: The recommended length of a single tick, which is the basic time unit used by ZooKeeper, as measured in milliseconds. 
	 * Val.Ol2Li02.enUS:tickTime=2000: It is used to regulate heartbeats, and timeouts. 
	 * Val.Ol2Li03.frFR:dataDir=/srv/zookeeper/data : ZooKeeper stocke les instantanés de la base de données en mémoire et, sauf indication contraire, le journal des transactions des mises à jour de la base de données. 
	 * Val.Ol2Li03.enUS:dataDir=/srv/zookeeper/data: The location where ZooKeeper will store the in-memory database snapshots and, unless specified otherwise, the transaction log of updates to the database. 
	 * Val.Ol2Li04Span1.frFR:admin.serverPort=
	 * Val:zookeeperPortAdmin:.Ol2Li04Span1.frFR:10280
	 * Val.Ol2Li04Span1.frFR: : Le port sur lequel le serveur Jetty intégré écoute. 
	 * Val.Ol2Li04Span1.enUS:admin.serverPort=
	 * Val:zookeeperPortAdmin:.Ol2Li04Span1.enUS:10280
	 * Val.Ol2Li04Span1.enUS:: The port the embedded Jetty server listens on. 
	 * Val.Ol2Li05Span1.frFR:clientPort=
	 * Val:zookeeperPortClient:.Ol2Li05Span1.frFR:10281
	 * Val.Ol2Li05Span1.frFR: : Le port qui écoute pour les connexions des clients. 
	 * Val.Ol2Li05Span1.enUS:clientPort=
	 * Val:zookeeperPortClient:.Ol2Li05Span1.enUS:10281
	 * Val.Ol2Li05Span1.enUS:: The port to listen for client connections. 
	 * Val.Ol2Li06.frFR:| : Lisez la chaîne dans la commande suivante. 
	 * Val.Ol2Li06.enUS:|: Read the string into the following command. 
	 * Val.Ol2Li07.frFR:tee : Ecrire une chaîne dans un fichier. 
	 * Val.Ol2Li07.enUS:tee: Write a string to a file. 
	 * Val.Ol2Li08.frFR:/srv/zookeeper/conf/zoo.cfg : Un nouveau fichier de configuration pour Zookeeper. 
	 * Val.Ol2Li08.enUS:/srv/zookeeper/conf/zoo.cfg: A new config file for Zookeeper. 
	 */  
	protected void _questionConfigurer(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-alarm-clock
	 * Val.H3Span.frFR:Comment puis-je exécuter Zookeeper tout le temps au démarrage de mon ordinateur ? 
	 * Val.H3Span.enUS:How do I run Zookeeper all the time, when my computer starts up? 
	 * Val.H4I:far fa-layer-plus
	 * Val.H4Span.frFR:Comment exécuter Zookeeper en tant que service systemd. 
	 * Val.H4Span.enUS:How to run Zookeeper as a systemd service. 
	 * 
 * Description.frFR:Une application Web conçue pour grandir doit être créée à l'aide d'un gestionnaire de cluster centralisé tel que Zookeper. Zookeeper a beaucoup de travail pour résoudre les bugs et les conditions de concurrence inévitables dans les applications distribuées. Vous bénéficierez d'une configuration en cluster, d'un pool de sources de données partagées, de threads de travail en arrière-plan partagés et d'un bus d'événements en cluster pour les demandes misent à l'échelle et d'équilibrage de la charge. Je vous aiderai à installer la version la plus récente de Zookeeper pour mettre à l'échelle votre site Web de manière open source. 
 * Description.enUS:A web application that is built to scale should be built using a centralized cluster manager like Zookeper. There is a lot of work that has gone into Zookeeper that fix the bugs and race conditions that are inevitable in distributed applications. You will benefit from clustered configuration, shared data source pool, shared background worker threads, and a clustered event bus for scaling and load balancing requests. I will help you install the most recent version of Zookeeper to scale your website the open source way. 
	 * 
	 * Val.PreSpan1:echo '
	 * Val.PreSpan1Br:[Unit]
	 * Val.PreSpan2Br.frFR:Description=Un gestionnaire de cluster centralisé open source. 
	 * Val.PreSpan2Br.enUS:Description=An open source centralized cluster manager. 
	 * Val.PreSpan3Br:After=network.target
	 * Val.PreSpan3Br:
	 * Val.PreSpan3Br:[Service]
	 * Val.PreSpan3Br:Type=forking
	 * Val.PreSpan3Br:User='"$USER"'
	 * Val.PreSpan3Br:Group='"$USER"'
	 * Val.PreSpan3Br:ExecStart=/srv/zookeeper/bin/zkServer.sh start
	 * Val.PreSpan3Br:Restart=on-failure
	 * Val.PreSpan3Br:
	 * Val.PreSpan3Br:[Install]
	 * Val.PreSpan3Br:WantedBy=multi-user.target
	 * Val.PreSpan3Br:' | sudo tee /usr/lib/systemd/system/zookeeper.service
	 * 
	 * Val.Ol2Li01.frFR:echo '...' : Écrivez une chaîne dans la console. 
	 * Val.Ol2Li01.enUS:echo '...': Write a string to the console. 
	 * Val.Ol2Li02.frFR:[Unit] : Un fichier de configuration « Unit » dont le nom se termine par ".service" code les informations relatives à un processus contrôlé et supervisé par systemd. 
	 * Val.Ol2Li02.enUS:[Unit]: A unit configuration file whose name ends in ".service" encodes information about a process controlled and supervised by systemd. 
	 * Val.Ol2Li03.frFR:Description=... : La description du service. 
	 * Val.Ol2Li03.enUS:Description=...: The description of the service. 
	 * Val.Ol2Li04.frFR:After=... : Le service Zookeeper sera démarré après les dépendances suivantes. 
	 * Val.Ol2Li04.enUS:After=...: The Zookeeper service will be started after the following dependencies. 
	 * Val.Ol2Li05.frFR:[Service] : Les informations relatives à un service contrôlé et supervisé par systemd. 
	 * Val.Ol2Li05.enUS:[Service]: Information about a service controlled and supervised by systemd. 
	 * Val.Ol2Li06.frFR:Type=forking : Parce qu'il est prévu que le processus configuré avec ExecStart= appelle fork() pendant son démarrage. 
	 * Val.Ol2Li06.enUS:Type=forking: Because it is expected that the process configured with ExecStart= will call fork() as part of its start-up. 
	 * Val.Ol2Li07.frFR:User=... : L'utilisateur en tant que l'utilisateur actuel qui exécutera le service. 
	 * Val.Ol2Li07.enUS:User=...: The user as the current user that will run the service. 
	 * Val.Ol2Li08.frFR:Group=... : L'utilisateur de groupe en tant que l'utilisateur actuel qui exécutera le service. 
	 * Val.Ol2Li08.enUS:Group=...: The group user as the current user that will run the service. 
	 * Val.Ol2Li09.frFR:ExecStart=... : La commande Zookeeper qui lancera le service. 
	 * Val.Ol2Li09.enUS:ExecStart=...: The Zookeeper command that will start the service. 
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
	 * Val.Ol2Li16.frFR:/usr/lib/systemd/system/zookeeper.service : Un nouveau fichier de service systemd dans lequel écrire pour Zookeeper. 
	 * Val.Ol2Li16.enUS:/usr/lib/systemd/system/zookeeper.service: A new systemd service file to write to for Zookeeper. 
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
	 * Val.H3Span.frFR:Comment activer le service Zookeeper? 
	 * Val.H3Span.enUS:How do I enable the Zookeeper service? 
	 * Val.H4I:far fa-toggle-on
	 * Val.H4Span.frFR:Utilisez la commande systemctl enable. 
	 * Val.H4Span.enUS:Use the systemctl enable command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: enable
	 * Val.PreSpan4: zookeeper
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:enable : Activer un ou plusieurs fichiers d'unités ou instances de fichiers d'unités. 
	 * Val.Ol2Li3.enUS:enable: Enable one or more unit files or unit file instances. 
	 * Val.Ol2Li4.frFR:zookeeper : Activez le service Zookeeper pour démarrer au démarrage de l'ordinateur. 
	 * Val.Ol2Li4.enUS:zookeeper: Enable the Zookeeper service to start when the computer starts. 
	 */  
	protected void _questionSystemctlEnable(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-pause-circle
	 * Val.H3Span.frFR:Comment démarrer le service Zookeeper? 
	 * Val.H3Span.enUS:How do I start the Zookeeper service? 
	 * Val.H4I:far fa-play-circle
	 * Val.H4Span.frFR:Utilisez la commande systemctl start. 
	 * Val.H4Span.enUS:Use the systemctl start command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: start
	 * Val.PreSpan4: zookeeper
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:start : Activer un ou plusieurs services. 
	 * Val.Ol2Li3.enUS:start: Start one or more services. 
	 * Val.Ol2Li4.frFR:zookeeper : Démarrez le service Zookeeper. 
	 * Val.Ol2Li4.enUS:zookeeper: Start the Zookeeper service. 
	 */  
	protected void _questionSystemctlStart(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-clipboard
	 * Val.H3Span.frFR:Comment puis-je m'assurer que le service Zookeeper a démarré avec succès ? 
	 * Val.H3Span.enUS:How do I make sure the Zookeeper service started successfully? 
	 * Val.H4I:far fa-clipboard-check
	 * Val.H4Span.frFR:Utilisez la commande systemctl status. 
	 * Val.H4Span.enUS:Use the systemctl status command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: status
	 * Val.PreSpan4: zookeeper
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:status : Vérifiez le statut d'un ou plusieurs services. 
	 * Val.Ol2Li3.enUS:status: Check the status of one or more services. 
	 * Val.Ol2Li4.frFR:zookeeper : Vérifiez le statut du service Zookeeper. 
	 * Val.Ol2Li4.enUS:zookeeper: Check the status of the Zookeeper service. 
	 * 
	 * Val.P2.frFR:Et comme ça, votre serveur Zookeeper est prêt pour que le client se connecte et commence à mettre en cluster. 
	 * Val.P2.frFR:Dans les leçons suivants, nous allons connecter un moteur de recherche ainsi que vos applications Web à Zookeeper pour leur mettre en cluster. 
	 * Val.P2.enUS:And just like that, your Zookeeper server is ready for client to connect and begin clustering. 
	 * Val.P2.enUS:In future lessons we will connect a search engine, as well as your web applications to Zookeeper to allow them to scale. 
	 */  
	protected void _questionSystemctlStatus(PageHtml o) {
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
	 * Val.TableTr2Td3.frFR:Installer Zookeeper à partir du code source. 
	 * Val.TableTr2Td3.enUS:Install Zookeeper from the source code. 
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
	 * Val.TableTr02Td2.frFR:Comment installer les dépendences pour Zookeeper ? 
	 * Val.TableTr02Td2.enUS:How do I install the dependencies for Zookeeper? 
	 * Val.TableTr02Td3Span1I:far fa-cookie
	 * Val.TableTr02Td4.frFR:Construisez les dépendances avec yum. 
	 * Val.TableTr02Td4.enUS:Build the dependencies with yum. 
	 * 
	 * Val.TableTr03Td1I:far fa-files-medical
	 * Val.TableTr03Td2.frFR:Où est-ce que je place le code source Zookeeper ? 
	 * Val.TableTr03Td2.enUS:Where do I put the Zookeeper source code? 
	 * Val.TableTr03Td3I:far fa-folder-tree
	 * Val.TableTr03Td4.frFR:Créez un répertoire zookeeper dans /usr/local/src. 
	 * Val.TableTr03Td4.enUS:Create a zookeeper directory in /usr/local/src. 
	 * 
	 * Val.TableTr04Td1I:far fa-cloud-download
	 * Val.TableTr04Td2.frFR:Comment télécharger le code source de Zookeeper ? 
	 * Val.TableTr04Td2.enUS:How do I download the Zookeeper source code? 
	 * Val.TableTr04Td3Span1I:fab fa-git
	 * Val.TableTr04Td4.frFR:Cloner le code source avec la commande git. 
	 * Val.TableTr04Td4.enUS:Clone the source code with the git command. 
	 * 
	 * Val.TableTr05Td1I:far fa-code-branch
	 * Val.TableTr05Td2.frFR:Comment choisir une version récente de Zookeeper ? 
	 * Val.TableTr05Td2.enUS:How do I pick a recent version of Zookeeper? 
	 * Val.TableTr05Td3I:far fa-tag
	 * Val.TableTr05Td4.frFR:Listez toutes les tags du référentiel git. 
	 * Val.TableTr05Td4.enUS:List all the tags in the git repository. 
	 * 
	 * Val.TableTr06Td1I:far fa-code-merge
	 * Val.TableTr06Td2.frFR:Comment changer de version du code source de Zookeeper ? 
	 * Val.TableTr06Td2.enUS:How do I switch versions of the Zookeeper source code? 
	 * Val.TableTr06Td3I:far fa-code-commit
	 * Val.TableTr06Td4.frFR:Checkout la tag git. 
	 * Val.TableTr06Td4.enUS:Checkout the git tag. 
	 * 
	 * Val.TableTr07Td1I:far fa-tools
	 * Val.TableTr07Td2.frFR:Comment contruire le code source de Zookeeper ? 
	 * Val.TableTr07Td2.enUS:How do I build the Zookeeper source code? 
	 * Val.TableTr07Td3I:far fa-terminal
	 * Val.TableTr07Td4.frFR:Construisez Zookeeper avec la commande ant. 
	 * Val.TableTr07Td4.enUS:Build Zookeeper with the ant command. 
	 * 
	 * Val.TableTr08Td1I:far fa-map-pin
	 * Val.TableTr08Td2.frFR:Après avoir compilé Zookeeper, où puis-je l'installer en tant que serveur? 
	 * Val.TableTr08Td2.enUS:After compiling Zookeeper, where do I install it as a server? 
	 * Val.TableTr08Td3I:far fa-folder-tree
	 * Val.TableTr08Td4.frFR:Créez un répertoire zookeeper dans /srv. 
	 * Val.TableTr08Td4.enUS:Create a zookeeper directory in /srv. 
	 * 
	 * Val.TableTr09Td1I:far fa-ballot
	 * Val.TableTr09Td2.frFR:Comment puis-je configurer le serveur Zookeeper ? 
	 * Val.TableTr09Td2.enUS:How do I configure the Zookeeper server? 
	 * Val.TableTr09Td3I:far fa-file-alt
	 * Val.TableTr09Td4.frFR:Créez un fichier zoo.cfg dans le répertoire conf. 
	 * Val.TableTr09Td4.enUS:Create a zoo.cfg file in the conf directory. 
	 * 
	 * Val.TableTr10Td1I:far fa-alarm-clock
	 * Val.TableTr10Td2.frFR:Comment puis-je exécuter Zookeeper tout le temps au démarrage de mon ordinateur ? 
	 * Val.TableTr10Td2.enUS:How do I run Zookeeper all the time, when my computer starts up? 
	 * Val.TableTr10Td3I:far fa-layer-plus
	 * Val.TableTr10Td4.frFR:Comment exécuter Zookeeper en tant que service systemd. 
	 * Val.TableTr10Td4.enUS:How to run Zookeeper as a systemd service. 
	 * 
	 * Val.TableTr11Td1I:far fa-search
	 * Val.TableTr11Td2.frFR:Comment le système connaît-il le nouveau service ? 
	 * Val.TableTr11Td2.enUS:How does the system know about the new service? 
	 * Val.TableTr11Td3I:far fa-redo-alt
	 * Val.TableTr11Td4.frFR:Rechargez le daemon systemd. 
	 * Val.TableTr11Td4.enUS:Reload the systemd daemon. 
	 * 
	 * Val.TableTr12Td1I:far fa-toggle-off
	 * Val.TableTr12Td2.frFR:Comment activer le service Zookeeper? 
	 * Val.TableTr12Td2.enUS:How do I enable the Zookeeper service? 
	 * Val.TableTr12Td3I:far fa-toggle-on
	 * Val.TableTr12Td4.frFR:Utilisez la commande systemctl enable. 
	 * Val.TableTr12Td4.enUS:Use the systemctl enable command. 
	 * 
	 * Val.TableTr13Td1I:far fa-pause-circle
	 * Val.TableTr13Td2.frFR:Comment démarrer le service Zookeeper? 
	 * Val.TableTr13Td2.enUS:How do I start the Zookeeper service? 
	 * Val.TableTr13Td3I:far fa-play-circle
	 * Val.TableTr13Td4.frFR:Utilisez la commande systemctl start. 
	 * Val.TableTr13Td4.enUS:Use the systemctl start command. 
	 * 
	 * Val.TableTr14Td1I:far fa-clipboard
	 * Val.TableTr14Td2.frFR:Comment puis-je m'assurer que le service Zookeeper a démarré avec succès ? 
	 * Val.TableTr14Td2.enUS:How do I make sure the Zookeeper service started successfully? 
	 * Val.TableTr14Td3I:far fa-clipboard-check
	 * Val.TableTr14Td4.frFR:Utilisez la commande systemctl status. 
	 * Val.TableTr14Td4.enUS:Use the systemctl status command. 
	 */ 
	protected void _recapituler3(PageHtml o) {      
	}
}
