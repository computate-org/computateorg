package org.computate.site.frFR.cours.c001.l011; 

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;

/**
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/011-comment-installer-une-version-recente-de-keycloak
 * ApiUriRechercheEnUSPage: /enUS/course/001/011-how-to-install-a-recent-version-of-keycloak
 * PageRechercheFrFRPage: C001L011InstallerKeycloakFrFRPage
 * PageRechercheEnUSPage: C001L011InstallerKeycloakEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNom.frFR: le leçon
 * UnNom.enUS: a lesson
 * 
 * H1.frFR: 
 * H1.enUS:How do I try out some user management software for single sign on applications? 
 * 
 * H2.frFR: 
 * H2.enUS:Install Keycloak from the source code. 
 * 
 * Titre.frFR:
 * Titre.enUS:
 * 
 * Description.frFR:
 * Description.enUS:
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
public class C001L011InstallerKeycloak extends C001L011InstallerKeycloakGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(11);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L011InstallerKeycloak.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L011InstallerKeycloak_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.C001L011InstallerKeycloak_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L011InstallerKeycloak_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.C001L011InstallerKeycloak_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L011InstallerKeycloakEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L011InstallerKeycloakFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L011InstallerKeycloakEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L011InstallerKeycloakFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.C001L011InstallerKeycloak_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.C001L011InstallerKeycloak_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak.C001L011InstallerKeycloakVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L011InstallerKeycloak_H1);
		addPageRecherche_frFR(C001L011InstallerKeycloak_H2);
		addPageRecherche_frFR(C001L011InstallerKeycloakVals);
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}  

	protected void _keycloakVersion(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("4.8.3");
//		else
//			c.o(utilisateurSite.getKeycloakVersion());
	}

	protected void _keycloakPortClient(Couverture<Integer> c) {
		if(utilisateurSite == null)
			c.o(10380);
//		else
//			c.o(utilisateurSite.getKeycloakPortClient());
	}

	protected void _keycloakTag(Couverture<String> c) {
		c.o(keycloakVersion + ".Final");
	}

	protected void _keycloakConfigset(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("computate");
//		else
//			c.o(utilisateurSite.getKeycloakConfigset());
	}

	protected void _keycloakCollection(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("site");
//		else
//			c.o(utilisateurSite.getKeycloakCollection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Je vous aiderai à installer une version récente de Keycloak pour ajouter single sign on à votre site Web de manière open source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:I will help you install the most recent version of Keycloak to add single sign on to your application the open source way. 
	 * 
	 * r: version de Keycloak
	 * r.enUS: Keycloak version
	 * r.frFR:port admin de Keycloak
	 * r.enUS:Keycloak admin port
	 * r.frFR:port client de Keycloak
	 * r.enUS:Keycloak client port
	 */    
	protected void _moi(PageHtml o) {
	}

	protected void _personnaliser(PageHtml o) {
	}
	@Override public void htmlBodyPersonnaliser(PageHtml o) {
		super.htmlBodyPersonnaliser(o);
		htmlBodyPersonnaliserAvant(o);
//		if(utilisateurSite != null) {
//			{ e("div").a("class", "w3-cell-row ").f();
//				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
//					{ e("form").a("action", "/api/site/utilisateur").a("id", "keycloakPortClientForm").a("style", "display: inline-block; ").f();
//						e("label").a("for", "Page_keycloakPortClient").a("class", "").f().sx("port client de Keycloak").g("label");
//	
//						e("input")
//							.a("type", "text")
//							.a("placeholder", "port client de Keycloak")
//							.a("class", "setKeycloakPortClient w3-input w3-border ")
//							.a("name", "setKeycloakPortClient")
//							.a("id", "Page_keycloakPortClient")
//							.a("onclick", "enleverLueur($(this)); ")
//							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#keycloakPortClientForm')); ")
//							.a("value", strKeycloakPortClient())
//						.fg();
//	
//					} g("form");
//				} g("div");
//			} g("div");
//			{ e("div").a("class", "w3-cell-row ").f();
//				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
//					{ e("form").a("action", "/api/site/utilisateur").a("id", "keycloakVersionForm").a("style", "display: inline-block; ").f();
//						e("label").a("for", "Page_keycloakVersion").a("class", "").f().sx("version de Keycloak").g("label");
//	
//						e("input")
//							.a("type", "text")
//							.a("placeholder", "version de Keycloak")
//							.a("class", "setKeycloakVersion w3-input w3-border ")
//							.a("name", "setKeycloakVersion")
//							.a("id", "Page_keycloakVersion")
//							.a("onclick", "enleverLueur($(this)); ")
//							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#keycloakVersionForm')); ")
//							.a("value", strKeycloakVersion())
//						.fg();
//	
//					} g("form");
//				} g("div");
//				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
//					{ e("form").a("action", "/api/site/utilisateur").a("id", "keycloakPortClientForm").a("style", "display: inline-block; ").f();
//						e("label").a("for", "Page_keycloakPortClient").a("class", "").f().sx("port client de Keycloak").g("label");
//	
//						e("input")
//							.a("type", "text")
//							.a("placeholder", "port client de Keycloak")
//							.a("class", "setKeycloakPortClient w3-input w3-border ")
//							.a("name", "setKeycloakPortClient")
//							.a("id", "Page_keycloakPortClient")
//							.a("onclick", "enleverLueur($(this)); ")
//							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#keycloakPortClientForm')); ")
//							.a("value", strKeycloakPortClient())
//						.fg();
//	
//					} g("form");
//				} g("div");
//			} g("div");
//			{ e("div").a("class", "w3-cell-row ").f();
//				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
//					{ e("form").a("action", "/api/site/utilisateur").a("id", "keycloakConfigsetForm").a("style", "display: inline-block; ").f();
//						e("label").a("for", "Page_keycloakConfigset").a("class", "").f().sx("Configset Keycloak").g("label");
//	
//						e("input")
//							.a("type", "text")
//							.a("placeholder", "Configset Keycloak")
//							.a("class", "setKeycloakConfigset w3-input w3-border ")
//							.a("name", "setKeycloakConfigset")
//							.a("id", "Page_keycloakConfigset")
//							.a("onclick", "enleverLueur($(this)); ")
//							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#keycloakConfigsetForm')); ")
//							.a("value", strKeycloakConfigset())
//						.fg();
//	
//					} g("form");
//				} g("div");
//				{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
//					{ e("form").a("action", "/api/site/utilisateur").a("id", "keycloakCollectionForm").a("style", "display: inline-block; ").f();
//						e("label").a("for", "Page_keycloakCollection").a("class", "").f().sx("Collection Keycloak").g("label");
//	
//						e("input")
//							.a("type", "text")
//							.a("placeholder", "Collection Keycloak")
//							.a("class", "setKeycloakCollection w3-input w3-border ")
//							.a("name", "setKeycloakCollection")
//							.a("id", "Page_keycloakCollection")
//							.a("onclick", "enleverLueur($(this)); ")
//							.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#keycloakCollectionForm')); ")
//							.a("value", strKeycloakCollection())
//						.fg();
//	
//					} g("form");
//				} g("div");
//			} g("div");
//		}
		htmlBodyPersonnaliserApres(o);
		e("div").a("id", "sitePersonnaliser").f();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-conveyor-belt-alt
	 * Val.H3Span.frFR:Comment installer les dépendences pour Keycloak ? 
	 * Val.H3Span.enUS:How do I install the dependencies for Keycloak? 
	 * Val.H4I:far fa-cookie
	 * Val.H4Span.frFR:Construisez les dépendances avec yum. 
	 * Val.H4Span.enUS:Build the dependencies with yum. 
	 * Val.Pre1Span1:sudo
	 * Val.Pre1Span2: yum
	 * Val.Pre1Span3: install
	 * Val.Pre1Span4: -y
	 * Val.Pre1Span5: ivy lsof maven git
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
	 * Val.Ol2Li5Dt:ivy lsof maven git
	 * Val.Ol2Li5Dd.frFR: : Les noms de paquets des dépendances pour la construction de Keycloak à partir du code source. 
	 * Val.Ol2Li5Dd.enUS:: The package names of the dependencies for building Keycloak from the source code. 
	 */  
	protected void _questionDependences(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-files-medical
	 * Val.H3Span.frFR:Où est-ce que je place le code source Keycloak ? 
	 * Val.H3Span.enUS:Where do I put the Keycloak source code? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire keycloak dans /usr/local/src. 
	 * Val.H4Span.enUS:Create a keycloak directory in /usr/local/src. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /usr/local/src/keycloak
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
	 * Val.H3Span.frFR:Comment télécharger le code source de Keycloak ? 
	 * Val.H3Span.enUS:How do I download the Keycloak source code? 
	 * Val.H4I:fab fa-git
	 * Val.H4Span.frFR:Cloner le code source avec la commande git. 
	 * Val.H4Span.enUS:Clone the source code with the git command. 
	 * Val.PreSpan1:git
	 * Val.PreSpan2: clone
	 * Val.PreSpan3: https://github.com/keycloak/keycloak.git
	 * Val.PreSpan4: /usr/local/src/keycloak
	 * 
	 * Val.Ol2Li1.frFR:git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. 
	 * Val.Ol2Li1.enUS:git: The distributed revision control system for most open source software. 
	 * Val.Ol2Li2.frFR:clone : Cloner un référentiel dans un répertoire. 
	 * Val.Ol2Li2.enUS:clone: Clone a repository into a directory. 
	 * Val.Ol2Li3.frFR:https://github.com/keycloak/keycloak.git : URL git vers le référentiel de code source Keycloak. 
	 * Val.Ol2Li3.enUS:https://github.com/keycloak/keycloak.git: The git URL to the Keycloak source code repository. 
	 * Val.Ol2Li4.frFR:/usr/local/src/keycloak : Répertoire dans lequel le code source Keycloak sera cloné. 
	 * Val.Ol2Li4.enUS:/usr/local/src/keycloak: The directory where the Keycloak source code will be cloned. 
	 */  
	protected void _questionClonerSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-code-branch
	 * Val.H3Span.frFR:Comment choisir une version récente de Keycloak ? 
	 * Val.H3Span.enUS:How do I pick a recent version of Keycloak? 
	 * Val.H4I:far fa-tag
	 * Val.H4Span.frFR:Listez toutes les tags du référentiel git. 
	 * Val.H4Span.enUS:List all the tags in the git repository. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/keycloak
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: tag)
	 * 
	 * Val.Ol2Li1.frFR:(cd : Changer de répertoire temporairement avec la parenthèse ouverte. 
	 * Val.Ol2Li1.enUS:(cd: Change directory temporarily, because of the open parenthesis. 
	 * Val.Ol2Li2.frFR:/usr/local/src/keycloak : Répertoire dans lequel le code source Keycloak a été cloné. 
	 * Val.Ol2Li2.enUS:/usr/local/src/keycloak: The directory where the Keycloak source code was cloned. 
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
	 * Val.H3Span.frFR:Comment changer de version du code source de Keycloak ? 
	 * Val.H3Span.enUS:How do I switch versions of the Keycloak source code? 
	 * Val.H4I:far fa-code-commit
	 * Val.H4Span.frFR:Checkout la tag git. 
	 * Val.H4Span.enUS:Checkout the git tag. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/keycloak
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: checkout
	 * Val.PreSpan6Span1: 
	 * Val:keycloakTag:.PreSpan6Span2:4.8.3.Final
	 * Val.PreSpan6Span3:)
	 * 
	 * Val.Ol1Li1:(cd
	 * Val.Ol1Li2:/usr/local/src/keycloak
	 * Val.Ol1Li3:&&
	 * Val.Ol1Li4:git
	 * Val.Ol1Li5.frFR:checkout : Checkout une branche dans l’arbre de travail. 
	 * Val.Ol1Li5.enUS:checkout: Checkout a branch to the working tree. 
	 * Val:keycloakTag:.Ol1Li6Span1.frFR:4.8.3.Final
	 * Val.Ol1Li6Span2.frFR:) : La dernière tag pour baser la branche. 
	 * Val:keycloakTag:.Ol1Li6Span1.enUS:4.8.3.Final
	 * Val.Ol1Li6Span2.enUS:): The latest tag to base the branch from. 
	 * 
	 * Val.P2Span1.frFR:
	 * Val.P2Span1.enUS:The enterprise supported version of Keycloak is called Red Hat Single Sign On (Red Hat SSO). 
	 * Val.P2Span1.enUS:The latest version of Red Hat SSO is version 7.3 and is based on Keycloak version 4.8. See: 
	 * Val.P2A1:https://access.redhat.com/articles/2342881
	 * Val.P2Span2.enUS:. I will use the latest 4.8 tag to give me the latest updates of the most recent, enterprise supported, version of Keycloak. 
	 * Val.P2Span2.enUS:That way, when I deploy my application to the cloud in production, I can install the same compatible, enterprise supported, version of Red Hat SSO for user management of my applications. 
	 */  
	protected void _questionCheckoutTag(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-tools
	 * Val.H3Span.frFR:Comment contruire le code source de Keycloak ? 
	 * Val.H3Span.enUS:How do I build the Keycloak source code? 
	 * Val.H4I:far fa-terminal
	 * Val.H4Span.frFR:Construisez Keycloak avec la commande mvn. 
	 * Val.H4Span.enUS:Build Keycloak with the mvn command. 
	 * 
	 * Val.Pre1Span01:(cd
	 * Val.Pre1Span02: /usr/local/src/keycloak
	 * Val.Pre1Span03: &&
	 * Val.Pre1Span04: mvn
	 * Val.Pre1Span05: install
	 * Val.Pre1Span06: -Pdistribution
	 * Val.Pre1Span07: -DskipTests)
	 * 
	 * Val.Ol1Li01:(cd
	 * Val.Ol1Li02:/usr/local/src/keycloak
	 * Val.Ol1Li03:&&
	 * Val.Ol1Li04.frFR:mvn : Un outil de construction pour les projets Java. 
	 * Val.Ol1Li04.enUS:mvn:  A platform-independent build tool for Java projects. 
	 * Val.Ol1Li05.frFR:install : 
	 * Val.Ol1Li05.enUS:install: Compile and install the version of Keycloak in the local Maven repository. 
	 * Val.Ol1Li06.frFR:-Pdistribution : 
	 * Val.Ol1Li06.enUS:-Pdistribution:  Create the full distribution of the Keycloak application. 
	 * Val.Ol1Li07.frFR:-DskipTests) : 
	 * Val.Ol1Li07.enUS:-DskipTests): Skip tests to speed up the build process. 
	 */  
	protected void _questionConstruireSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-map-pin
	 * Val.H3Span.frFR:Après avoir compilé Keycloak, où puis-je l'installer en tant que serveur? 
	 * Val.H3Span.enUS:After compiling Keycloak, where do I install it as a server? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire keycloak dans /srv. 
	 * Val.H4Span.enUS:Create a keycloak directory in /srv. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /srv/keycloak
	 * 
	 * Val.Ol1Li1:sudo
	 * Val.Ol1Li2:install
	 * Val.Ol1Li3:-d
	 * Val.Ol1Li4:-o
	 * Val.Ol1Li5:$USER
	 * Val.Ol1Li6:-g
	 * Val.Ol1Li7:$USER
	 * Val.Ol1Li8.frFR:/srv est un bon endroit pour installer des serveurs logicielles open source telles que Keycloak qui fonctionnent comme un service. 
	 * Val.Ol1Li8.enUS:/srv is a good place to install open source software serveurs like Keycloak that run as a service. 
	 * 
	 * Val.Pre2Span1:rsync
	 * Val.Pre2Span2: -r
	 * Val.Pre2Span3Span1: /usr/local/src/keycloak/distribution/server-dist/keycloak-
	 * Val:keycloakVersion:.Pre2Span3Span2:4.8.3
	 * Val.Pre2Span3Span3:.Final/
	 * Val.Pre2Span4: /srv/keycloak/
	 * 
	 * Val.Ol2Li1.frFR:rsync: Un outil de copie de fichiers rapide et polyvalent, distant (et local). 
	 * Val.Ol2Li1.enUS:rsync: a fast, versatile, remote (and local) file-copying tool. 
	 * Val.Ol2Li2.frFR:-r: Recurse dans des répertoires. 
	 * Val.Ol2Li2.enUS:-r: Recurse into directories. 
	 * Val.Ol2Li3Span1.frFR:/usr/local/src/keycloak/distribution/server-dist/keycloak-
	 * Val:keycloakVersion:.Ol2Li3Span2.frFR:4.8.3
	 * Val.Ol2Li3Span3.frFR:.Final/ : Le répertoire où l'application maven a été construite. 
	 * Val.Ol2Li3Span3.frFR:N'oubliez pas le slash à la fin ou rsync suppose qu'il s'agit d'un fichier dans la destination. 
	 * Val.Ol2Li3Span1.enUS:/usr/local/src/keycloak/distribution/server-dist/keycloak-
	 * Val:keycloakVersion:.Ol2Li3Span2.enUS:4.8.3
	 * Val.Ol2Li3Span3.enUS:.Final/: The directory where the maven application was built. 
	 * Val.Ol2Li3Span3.enUS:Don't forget the ending slash or rsync assumes it's a file inside the destination. 
	 * Val.Ol2Li4.frFR:/srv/keycloak/ : Le répertoire où le serveur sera installé.
	 * Val.Ol2Li4.frFR:C'est préférable de toujours écrire des répertoires avec un slash dans rsync pour éviter les surprises. 
	 * Val.Ol2Li4.enUS:/srv/keycloak/: The directory where the server will be installed. 
	 * Val.Ol2Li4.enUS:It's best to always write directories with a trailing slash in rsync for fewer surprises. 
	 * 
	 * Val.Pre3Span1:rsync
	 * Val.Pre3Span2: /usr/local/src/keycloak/distribution/server-dist/src/main/modules/layers.conf
	 * Val.Pre3Span3: /srv/keycloak/modules/
	 * 
	 * Val.Ol3Li1:rsync
	 * Val.Ol3Li2.frFR:/usr/local/src/keycloak/distribution/server-dist/src/main/modules/layers.conf : 
	 * Val.Ol3Li2.enUS:/usr/local/src/keycloak/distribution/server-dist/src/main/modules/layers.conf: 
	 * Val.Ol3Li3.frFR:/srv/keycloak/modules/ : 
	 * Val.Ol3Li3.enUS:/srv/keycloak/modules/: 
	 * 
	 * Val.Pre4Span1:install
	 * Val.Pre4Span2: -d
	 * Val.Pre4Span3: /srv/keycloak-4.8.3/modules/system/layers/keycloak/org/postgresql/main
	 * 
	 * Val.Ol4Li1.frFR:rm: Supprimer les fichiers et les répertoires. 
	 * Val.Ol4Li1.enUS:rm: Remove files and directories. 
	 * Val.Ol4Li2.frFR:-rf : Supprimez tous les fichiers et répertoires de manière récursive sans le demander. 
	 * Val.Ol4Li2.enUS:-rf: Remove all files and directories recursively without prompting. 
	 * Val.Ol4Li3.frFR:/srv/keycloak/example/ : Les fichiers d'exemples Keycloak générant des messages d’erreur lors du démarrage du serveur s’ils restent là. 
	 * Val.Ol4Li3.enUS:/srv/keycloak/example/: The Keycloak example files that will result in error messages when starting the server if they remain. 
	 */  
	protected void _questionMkdirServeur(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-ballot
	 * Val.H3Span.frFR:Comment puis-je configurer le serveur Keycloak ? 
	 * Val.H3Span.enUS:How do I configure the Keycloak server? 
	 * Val.H4I:far fa-file-alt
	 * Val.H4Span.frFR:Créez un fichier keycloak.xml. 
	 * Val.H4Span.enUS:Create a keycloak.xml file. 
	 * 
	 * Val.PreSpan1:echo '<?xml version="1.0" encoding="UTF-8" ?>
	 * Val.PreSpan1Br:<keycloak>
	 * Val.PreSpan1Br:	<keycloakcloud>
	 * Val.PreSpan1Br:		<str name="host">${host:}</str>
	 * Val.PreSpan1Br:		<int name="hostPort">${jetty.port:8983}</int>
	 * Val.PreSpan1Br:		<str name="hostContext">${hostContext:keycloak}</str>
	 * Val.PreSpan1Br:		<bool name="genericCoreNodeNames">${genericCoreNodeNames:true}</bool>
	 * Val.PreSpan1Br:		<int name="zkClientTimeout">${zkClientTimeout:30000}</int>
	 * Val.PreSpan1Br:		<int name="distribUpdateSoTimeout">${distribUpdateSoTimeout:600000}</int>
	 * Val.PreSpan1Br:		<int name="distribUpdateConnTimeout">${distribUpdateConnTimeout:60000}</int>
	 * Val.PreSpan1Br:		<str name="zkCredentialsProvider">${zkCredentialsProvider:org.apache.keycloak.common.cloud.DefaultZkCredentialsProvider}</str>
	 * Val.PreSpan1Br:		<str name="zkACLProvider">${zkACLProvider:org.apache.keycloak.common.cloud.DefaultZkACLProvider}</str>
	 * Val.PreSpan1Br:	</keycloakcloud>
	 * Val.PreSpan1Br:	<shardHandlerFactory name="shardHandlerFactory" class="HttpShardHandlerFactory">
	 * Val.PreSpan1Br:		<int name="socketTimeout">${socketTimeout:600000}</int>
	 * Val.PreSpan1Br:		<int name="connTimeout">${connTimeout:60000}</int>
	 * Val.PreSpan1Br:	</shardHandlerFactory>
	 * Val.PreSpan1Br:</keycloak>
	 * Val.PreSpan5Br:' | tee /srv/keycloak/keycloak.xml
	 * 
	 * Val.Ol2Li01.frFR:echo '...' : Écrivez une chaîne dans la console. 
	 * Val.Ol2Li01.enUS:echo '...': Write a string to the console. 
	 * Val.Ol2Li06.frFR:| : Lisez la chaîne dans la commande suivante. 
	 * Val.Ol2Li06.enUS:|: Read the string into the following command. 
	 * Val.Ol2Li07.frFR:tee : Ecrire une chaîne dans un fichier. 
	 * Val.Ol2Li07.enUS:tee: Write a string to a file. 
	 * Val.Ol2Li08.frFR:/srv/keycloak/keycloak.xml : Un nouveau fichier de configuration pour Keycloak. 
	 * Val.Ol2Li08.enUS:/srv/keycloak/keycloak.xml: A new config file for Keycloak. 
	 */ 
	protected void _questionConfigurer(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-file-check
	 * Val.H3Span.frFR:Comment créer un configset Keycloak pour mon site ? 
	 * Val.H3Span.enUS:How do I create a Keycloak configset for my site. 
	 * Val.H4I:far fa-hand-receiving
	 * Val.H4Span.frFR:Essayez mon propre configset préféré de mon projet opensource computate. 
	 * Val.H4Span.enUS:Try out my own favorite configset from my opensource project computate. 
	 * 
	 * Val.Pre1Span01:git
	 * Val.Pre1Span02: clone
	 * Val.Pre1Span03: https://github.com/computate/computate.git
	 * Val.Pre1Span04Span1: /srv/keycloak/server/keycloak/configsets/
	 * Val:keycloakConfigset:.Pre1Span04Span1:computate
	 * 
	 * P1.frFR:Un configset Keycloak est un ensemble de fichiers de configuration décrivant votre contenu indexable et recherchable. 
	 * P1.frFR:Il commence par un schéma et peut inclure beaucoup plus de configuration pour les synonymes, les mots d'arrêt, les langues, etc. 
	 * P1.enUS:A keycloak configset is a set of configuration files to describe your indexed, searchable content. 
	 * P1.enUS:It starts with a schema and can include much more configuration for synonyms, stop words, languages and more. 
	 * 
	 * Val.Ol1Li01:git
	 * Val.Ol1Li02:clone
	 * Val.Ol1Li03.frFR:https://github.com/computate/computate.git : Le référentiel git open source qui est la base de tout mon travail. 
	 * Val.Ol1Li03.enUS:https://github.com/computate/computate.git: The open source git repository that is the base of all my work. 
	 * Val.Ol1Li04Span1.frFR:/srv/keycloak/server/keycloak/configsets/
	 * Val:keycloakConfigset:.Ol1Li04Span2.frFR:computate
	 * Val.Ol1Li04Span3.frFR: : Le répertoire pour le configset Keycloak computate. 
	 * Val.Ol1Li04Span1.enUS:/srv/keycloak/server/keycloak/configsets/
	 * Val:keycloakConfigset:.Ol1Li04Span2.enUS:computate
	 * Val.Ol1Li04Span3.enUS:: The directory for the computate Keycloak configset. 
	 * 
	 * Val.Pre2Span01:(cd
	 * Val.Pre2Span02: /srv/keycloak/server/keycloak/configsets/computate/
	 * Val.Pre2Span03: &&
	 * Val.Pre2Span04: git
	 * Val.Pre2Span05: filter-branch
	 * Val.Pre2Span06: --subdirectory-filter
	 * Val.Pre2Span07: config/keycloak/server/keycloak/configsets/computate
	 * Val.Pre2Span08: HEAD)
	 * 
	 * Val.Ol2Li01:(cd
	 * Val:keycloakConfigset:.Ol2Li02Span1:/srv/keycloak/server/keycloak/configsets/
	 * Val:keycloakConfigset:.Ol2Li02Span2:computate
	 * Val.Ol2Li03:&&
	 * Val.Ol2Li04:git
	 * Val.Ol2Li05.frFR:filter-branch : Réécrivez la branche en appliquant des filtres personnalisés à chaque révision. 
	 * Val.Ol2Li05.enUS:filter-branch: Rewrite the branch, applying custom filters on each revision. 
	 * Val.Ol2Li06.frFR:--subdirectory-filter : Ne regardez que l'historique qui touche le sous-répertoire donné. 
	 * Val.Ol2Li06.enUS:--subdirectory-filter: Only look at the history which touches the given subdirectory. 
	 * Val.Ol2Li07.frFR:config/keycloak/server/keycloak/configsets/computate : Mon configset préféré à utiliser dans Keycloak. 
	 * Val.Ol2Li07.enUS:config/keycloak/server/keycloak/configsets/computate: My favorite configset to use in Keycloak. 
	 * Val.Ol2Li08.frFR:HEAD) : La révision HEAD actuelle à filtrer. 
	 * Val.Ol2Li08.enUS:HEAD): The current HEAD revision to filter. 
	 */  
	protected void _questionConfigurerConfigset(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-cloud-upload-alt
	 * Val.H3Span.frFR:Comment télécharger mon configset Keycloak sur Keycloak ? 
	 * Val.H3Span.enUS:How do I upload my Keycloak configset to Keycloak? 
	 * Val.H4I:far fa-file-upload
	 * Val.H4Span.frFR:Utilisez la commande keycloak zk upconfig. 
	 * Val.H4Span.enUS:Use the keycloak zk upconfig command. 
	 * 
	 * Val.Pre1Span01:/srv/keycloak/bin/keycloak
	 * Val.Pre1Span02: zk
	 * Val.Pre1Span03: upconfig
	 * Val.Pre1Span04Span1: -n 
	 * Val:keycloakConfigset:.Pre1Span04Span2:computate
	 * Val.Pre1Span05Span1: -d /srv/keycloak/server/keycloak/configsets/
	 * Val:keycloakConfigset:.Pre1Span05Span2:computate
	 * 
	 * Val.Ol1Li01.frFR:/srv/keycloak/bin/keycloak : Le binaire exécutable keycloak. 
	 * Val.Ol1Li01.enUS:/srv/keycloak/bin/keycloak: The keycloak executable binary. 
	 * Val.Ol1Li02.frFR:zk : Effectuez une opération keycloak avec les configsets Keycloak. 
	 * Val.Ol1Li02.enUS:zk: Perform a keycloak operation with Keycloak configsets. 
	 * Val.Ol1Li03.frFR:upconfig : Téléchargez un configset Keycloak sur keycloak. 
	 * Val.Ol1Li03.enUS:upconfig: Upload a Keycloak configset to keycloak. 
	 * Val.Ol1Li04Span1.frFR:-n 
	 * Val:keycloakConfigset:.Ol1Li04Span2.frFR:computate
	 * Val.Ol1Li04Span3.frFR: : Le nom du configset Keycloak. 
	 * Val.Ol1Li04Span1.enUS:-n 
	 * Val:keycloakConfigset:.Ol1Li04Span2.enUS:computate
	 * Val.Ol1Li04Span3.enUS:: The name of the Keycloak configset. 
	 */  
	protected void _questionConfigsetKeycloak(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-alarm-clock
	 * Val.H3Span.frFR:Comment puis-je exécuter Keycloak tout le temps au démarrage de mon ordinateur ? 
	 * Val.H3Span.enUS:How do I run Keycloak all the time, when my computer starts up? 
	 * Val.H4I:far fa-layer-plus
	 * Val.H4Span.frFR:Comment exécuter Keycloak en tant que service systemd. 
	 * Val.H4Span.enUS:How to run Keycloak as a systemd service. 
	 * 
 * Description.frFR:Une application Web conçue pour grandir doit être créée à l'aide d'un gestionnaire de cluster centralisé tel que Zookeper. Keycloak a beaucoup de travail pour résoudre les bugs et les conditions de concurrence inévitables dans les applications distribuées. Vous bénéficierez d'une configuration en cluster, d'un pool de sources de données partagées, de threads de travail en arrière-plan partagés et d'un bus d'événements en cluster pour les demandes misent à l'échelle et d'équilibrage de la charge. Je vous aiderai à installer la version la plus récente de Keycloak pour mettre à l'échelle votre site Web de manière open source. 
 * Description.enUS:A web application that is built to scale should be built using a centralized cluster manager like Zookeper. There is a lot of work that has gone into Keycloak that fix the bugs and race conditions that are inevitable in distributed applications. You will benefit from clustered configuration, shared data source pool, shared background worker threads, and a clustered event bus for scaling and load balancing requests. I will help you install the most recent version of Keycloak to scale your website the open source way. 
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
	 * Val.PreSpan4BrSpan1:ExecStart=/srv/keycloak/bin/keycloak -c -s /srv/keycloak -p 
	 * Val:keycloakPortClient:.PreSpan4Span2:10380
	 * Val.PreSpan5Br:Restart=on-failure
	 * Val.PreSpan5Br:
	 * Val.PreSpan5Br:[Install]
	 * Val.PreSpan5Br:WantedBy=multi-user.target
	 * Val.PreSpan5Br:' | sudo tee /usr/lib/systemd/system/keycloak.service
	 * 
	 * Val.Ol2Li01.frFR:echo '...' : Écrivez une chaîne dans la console. 
	 * Val.Ol2Li01.enUS:echo '...': Write a string to the console. 
	 * Val.Ol2Li02.frFR:[Unit] : Un fichier de configuration « Unit » dont le nom se termine par ".service" code les informations relatives à un processus contrôlé et supervisé par systemd. 
	 * Val.Ol2Li02.enUS:[Unit]: A unit configuration file whose name ends in ".service" encodes information about a process controlled and supervised by systemd. 
	 * Val.Ol2Li03.frFR:Description=... : La description du service. 
	 * Val.Ol2Li03.enUS:Description=...: The description of the service. 
	 * Val.Ol2Li04.frFR:After=... : Le service Keycloak sera démarré après les dépendances suivantes. 
	 * Val.Ol2Li04.enUS:After=...: The Keycloak service will be started after the following dependencies. 
	 * Val.Ol2Li05.frFR:[Service] : Les informations relatives à un service contrôlé et supervisé par systemd. 
	 * Val.Ol2Li05.enUS:[Service]: Information about a service controlled and supervised by systemd. 
	 * Val.Ol2Li06.frFR:Type=forking : Parce qu'il est prévu que le processus configuré avec ExecStart= appelle fork() pendant son démarrage. 
	 * Val.Ol2Li06.enUS:Type=forking: Because it is expected that the process configured with ExecStart= will call fork() as part of its start-up. 
	 * Val.Ol2Li07.frFR:User=... : L'utilisateur en tant que l'utilisateur actuel qui exécutera le service. 
	 * Val.Ol2Li07.enUS:User=...: The user as the current user that will run the service. 
	 * Val.Ol2Li08.frFR:Group=... : L'utilisateur de groupe en tant que l'utilisateur actuel qui exécutera le service. 
	 * Val.Ol2Li08.enUS:Group=...: The group user as the current user that will run the service. 
	 * Val.Ol2Li09.frFR:ExecStart=... : La commande Keycloak qui lancera le service. 
	 * Val.Ol2Li09.enUS:ExecStart=...: The Keycloak command that will start the service. 
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
	 * Val.Ol2Li16.frFR:/usr/lib/systemd/system/keycloak.service : Un nouveau fichier de service systemd dans lequel écrire pour Keycloak. 
	 * Val.Ol2Li16.enUS:/usr/lib/systemd/system/keycloak.service: A new systemd service file to write to for Keycloak. 
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
	 * Val.H3Span.frFR:Comment activer le service Keycloak? 
	 * Val.H3Span.enUS:How do I enable the Keycloak service? 
	 * Val.H4I:far fa-toggle-on
	 * Val.H4Span.frFR:Utilisez la commande systemctl enable. 
	 * Val.H4Span.enUS:Use the systemctl enable command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: enable
	 * Val.PreSpan4: keycloak
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:enable : Activer un ou plusieurs fichiers d'unités ou instances de fichiers d'unités. 
	 * Val.Ol2Li3.enUS:enable: Enable one or more unit files or unit file instances. 
	 * Val.Ol2Li4.frFR:keycloak : Activez le service Keycloak pour démarrer au démarrage de l'ordinateur. 
	 * Val.Ol2Li4.enUS:keycloak: Enable the Keycloak service to start when the computer starts. 
	 */  
	protected void _questionSystemctlEnable(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-pause-circle
	 * Val.H3Span.frFR:Comment démarrer le service Keycloak? 
	 * Val.H3Span.enUS:How do I start the Keycloak service? 
	 * Val.H4I:far fa-play-circle
	 * Val.H4Span.frFR:Utilisez la commande systemctl start. 
	 * Val.H4Span.enUS:Use the systemctl start command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: start
	 * Val.PreSpan4: keycloak
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:start : Activer un ou plusieurs services. 
	 * Val.Ol2Li3.enUS:start: Start one or more services. 
	 * Val.Ol2Li4.frFR:keycloak : Démarrez le service Keycloak. 
	 * Val.Ol2Li4.enUS:keycloak: Start the Keycloak service. 
	 */  
	protected void _questionSystemctlStart(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-clipboard
	 * Val.H3Span.frFR:Comment puis-je m'assurer que le service Keycloak a démarré avec succès ? 
	 * Val.H3Span.enUS:How do I make sure the Keycloak service started successfully? 
	 * Val.H4I:far fa-clipboard-check
	 * Val.H4Span.frFR:Utilisez la commande systemctl status. 
	 * Val.H4Span.enUS:Use the systemctl status command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: status
	 * Val.PreSpan4: keycloak
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:status : Vérifiez le statut d'un ou plusieurs services. 
	 * Val.Ol2Li3.enUS:status: Check the status of one or more services. 
	 * Val.Ol2Li4.frFR:keycloak : Vérifiez le statut du service Keycloak. 
	 * Val.Ol2Li4.enUS:keycloak: Check the status of the Keycloak service. 
	 * 
	 * Val.P2.frFR:Et comme ça, votre serveur Keycloak est prêt pour que le client se connecte et commence à mettre en cluster. 
	 * Val.P2.frFR:Dans les leçons suivants, nous allons connecter un moteur de recherche ainsi que vos applications Web à Keycloak pour leur mettre en cluster. 
	 * Val.P2.enUS:And just like that, your Keycloak server is ready for client to connect and begin clustering. 
	 * Val.P2.enUS:In future lessons we will connect a search engine, as well as your web applications to Keycloak to allow them to scale. 
	 */  
	protected void _questionSystemctlStatus(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-sliders-h-square
	 * Val.H3Span.frFR:Comment créer des collections Keycloak pour commencer l'indexation et la recherche de mon contenu ? 
	 * Val.H3Span.enUS:How do I create Keycloak collections to begin indexing and searching my content? 
	 * Val.H4I:far fa-user-cog
	 * Val.H4Span.frFR:Créez des collections avec la commande keycloak. 
	 * Val.H4Span.enUS:Create collections with the keycloak command. 
	 * 
	 * P1.frFR:Une collection Keycloak est un index de recherche réel sur le système de fichiers basé sur un configset ou un schéma. 
	 * P1.enUS:A Keycloak collection is an actual search index on the filesystem based on a configset or schema. 
	 * 
	 * Val.Pre1Span01:/srv/keycloak/bin/keycloak
	 * Val.Pre1Span02: create_collection
	 * Val.Pre1Span03Span1: -c 
	 * Val:keycloakCollection:.Pre1Span03Span2:site
	 * Val.Pre1Span04Span1: -n 
	 * Val:keycloakConfigset:.Pre1Span04Span2:computate
	 * 
	 * Val.Ol1Li01:/srv/keycloak/bin/keycloak
	 * Val.Ol1Li02.frFR:create_collection : Effectuez une opération keycloak avec les configsets Keycloak. 
	 * Val.Ol1Li02.enUS:create_collection: A Keycloak collection
	 * Val.Ol1Li03Span1.frFR:-c 
	 * Val.Ol1Li03Span1.enUS:-c 
	 * Val:keycloakCollection:.Ol1Li03Span2.frFR:site
	 * Val:keycloakCollection:.Ol1Li03Span2.enUS:site
	 * Val.Ol1Li03Span3.frFR: : Le nom de la collection Keycloak à créer. 
	 * Val.Ol1Li03Span3.enUS:: The name of the keycloak collection to create. 
	 * Val.Ol1Li04Span1.frFR:-n 
	 * Val.Ol1Li04Span1.enUS:-n 
	 * Val:keycloakCollection:.Ol1Li04Span2.frFR:computate
	 * Val:keycloakCollection:.Ol1Li04Span2.enUS:computate
	 * Val.Ol1Li04Span3.frFR: : Le nom de la collection Keycloak à créer. 
	 * Val.Ol1Li04Span3.enUS:: The name of the keycloak collection to create. 
	 */  
	protected void _questionCollectionsKeycloak(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-file-search
	 * Val.H3Span.frFR:Où puis-je aller une fois que j'ai installé un serveur Keycloak ? 
	 * Val.H3Span.enUS:Where can I go once I have installed a Keycloak server? 
	 * Val.H4I:far fa-list
	 * Val.H4Span.frFR:Voici quelques URLs utiles vers votre serveur Keycloak. 
	 * Val.H4Span.enUS:Here are some useful URLs related to your Keycloak server. 
	 * 
	 * Val.UlLi1A:http://localhost:10380/keycloak/#/
	 * Val.UlLi1Span.frFR:Le lien vers le tableau de bord Keycloak, pour des informations sur votre serveur Keycloak en cours d'exécution. 
	 * Val.UlLi1Span.enUS:The link to the Keycloak dashboard, for information about your running Keycloak server. 
	 * Val.UlLi2A:http://localhost:10380/keycloak/#/site/query
	 * Val.UlLi2Span.frFR:Une page pour interroger les résultats de la recherche pour l'index de votre site. 
	 * Val.UlLi2Span.enUS:A page for querying the search results for your site index. 
	 */  
	protected void _questionLiens(PageHtml o) {
	}
	@Override public void htmlBodyQuestionLiens(PageHtml o) {
		String urlBase = "http://localhost:" + keycloakPortClient;
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
				{ e("a").a("class", " questionLiensUlLi1A ").a("href", urlBase, "/keycloak/#/").f();
					sx(urlBase, "/keycloak/#/");
				} g("a");
				{ e("span").a("class", " questionLiensUlLi1Span ").f();
					sx(questionLiensUlLi1Span1);
				} g("span");
			} g("li");
			{ e("li").a("class", " questionLiensUlLi2 questionLiensUlLi even ").f();
				{ e("a").a("class", " questionLiensUlLi2A ").a("href", urlBase + "/keycloak/#/", keycloakCollection, "/query").f();
					sx(urlBase + "/keycloak/#/", keycloakCollection, "/query");
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
	 * Val.TableTr2Td3.frFR:Installer Keycloak à partir du code source. 
	 * Val.TableTr2Td3.enUS:Install Keycloak from the source code. 
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
	 * Val.TableTr02Td2.frFR:Comment installer les dépendences pour Keycloak ? 
	 * Val.TableTr02Td2.enUS:How do I install the dependencies for Keycloak? 
	 * Val.TableTr02Td3Span1I:far fa-cookie
	 * Val.TableTr02Td4.frFR:Construisez les dépendances avec yum. 
	 * Val.TableTr02Td4.enUS:Build the dependencies with yum. 
	 * 
	 * Val.TableTr03Td1I:far fa-files-medical
	 * Val.TableTr03Td2.frFR:Où est-ce que je place le code source Keycloak ? 
	 * Val.TableTr03Td2.enUS:Where do I put the Keycloak source code? 
	 * Val.TableTr03Td3I:far fa-folder-tree
	 * Val.TableTr03Td4.frFR:Créez un répertoire keycloak dans /usr/local/src. 
	 * Val.TableTr03Td4.enUS:Create a keycloak directory in /usr/local/src. 
	 * 
	 * Val.TableTr04Td1I:far fa-cloud-download
	 * Val.TableTr04Td2.frFR:Comment télécharger le code source de Keycloak ? 
	 * Val.TableTr04Td2.enUS:How do I download the Keycloak source code? 
	 * Val.TableTr04Td3Span1I:fab fa-git
	 * Val.TableTr04Td4.frFR:Cloner le code source avec la commande git. 
	 * Val.TableTr04Td4.enUS:Clone the source code with the git command. 
	 * 
	 * Val.TableTr05Td1I:far fa-tools
	 * Val.TableTr05Td2.frFR:Comment contruire le code source de Keycloak ? 
	 * Val.TableTr05Td2.enUS:How do I build the Keycloak source code? 
	 * Val.TableTr05Td3I:far fa-terminal
	 * Val.TableTr05Td4.frFR:Construisez Keycloak avec la commande mvn. 
	 * Val.TableTr05Td4.enUS:Build Keycloak with the mvn command. 
	 * 
	 * Val.TableTr08Td1I:far fa-map-pin
	 * Val.TableTr08Td2.frFR:Après avoir compilé Keycloak, où puis-je l'installer en tant que serveur? 
	 * Val.TableTr08Td2.enUS:After compiling Keycloak, where do I install it as a server? 
	 * Val.TableTr08Td3I:far fa-folder-tree
	 * Val.TableTr08Td4.frFR:Créez un répertoire keycloak dans /srv. 
	 * Val.TableTr08Td4.enUS:Create a keycloak directory in /srv. 
	 * 
	 * Val.TableTr09Td1I:far fa-ballot
	 * Val.TableTr09Td2.frFR:Comment puis-je configurer le serveur Keycloak ? 
	 * Val.TableTr09Td2.enUS:How do I configure the Keycloak server? 
	 * Val.TableTr09Td3I:far fa-file-alt
	 * Val.TableTr09Td4.frFR:Créez un fichier keycloak.xml. 
	 * Val.TableTr09Td4.enUS:Create a keycloak.xml file. 
	 * 
	 * Val.TableTr10Td1I:far fa-file-check
	 * Val.TableTr10Td2.frFR:Comment créer un configset Keycloak pour mon site ? 
	 * Val.TableTr10Td2.enUS:How do I create a Keycloak configset for my site. 
	 * Val.TableTr10Td3I:far fa-hand-receiving
	 * Val.TableTr10Td4.frFR:Essayez mon propre configset préféré de mon projet opensource computate. 
	 * Val.TableTr10Td4.enUS:Try out my own favorite configset from my opensource project computate. 
	 * 
	 * Val.TableTr11Td1I:far fa-cloud-upload-alt
	 * Val.TableTr11Td2.frFR:Comment télécharger mon configset Keycloak sur Keycloak ? 
	 * Val.TableTr11Td2.enUS:How do I upload my Keycloak configset to Keycloak? 
	 * Val.TableTr11Td3I:far fa-file-upload
	 * Val.TableTr11Td4.frFR:Utilisez la commande keycloak zk upconfig. 
	 * Val.TableTr11Td4.enUS:Use the keycloak zk upconfig command. 
	 * 
	 * Val.TableTr12Td1I:far fa-alarm-clock
	 * Val.TableTr12Td2.frFR:Comment puis-je exécuter Keycloak tout le temps au démarrage de mon ordinateur ? 
	 * Val.TableTr12Td2.enUS:How do I run Keycloak all the time, when my computer starts up? 
	 * Val.TableTr12Td3I:far fa-layer-plus
	 * Val.TableTr12Td4.frFR:Comment exécuter Keycloak en tant que service systemd. 
	 * Val.TableTr12Td4.enUS:How to run Keycloak as a systemd service. 
	 * 
	 * Val.TableTr13Td1I:far fa-search
	 * Val.TableTr13Td2.frFR:Comment le système connaît-il le nouveau service ? 
	 * Val.TableTr13Td2.enUS:How does the system know about the new service? 
	 * Val.TableTr13Td3I:far fa-redo-alt
	 * Val.TableTr13Td4.frFR:Rechargez le daemon systemd. 
	 * Val.TableTr13Td4.enUS:Reload the systemd daemon. 
	 * 
	 * Val.TableTr14Td1I:far fa-toggle-off
	 * Val.TableTr14Td2.frFR:Comment activer le service Keycloak? 
	 * Val.TableTr14Td2.enUS:How do I enable the Keycloak service? 
	 * Val.TableTr14Td3I:far fa-toggle-on
	 * Val.TableTr14Td4.frFR:Utilisez la commande systemctl enable. 
	 * Val.TableTr14Td4.enUS:Use the systemctl enable command. 
	 * 
	 * Val.TableTr15Td1I:far fa-pause-circle
	 * Val.TableTr15Td2.frFR:Comment démarrer le service Keycloak? 
	 * Val.TableTr15Td2.enUS:How do I start the Keycloak service? 
	 * Val.TableTr15Td3I:far fa-play-circle
	 * Val.TableTr15Td4.frFR:Utilisez la commande systemctl start. 
	 * Val.TableTr15Td4.enUS:Use the systemctl start command. 
	 * 
	 * Val.TableTr16Td1I:far fa-clipboard
	 * Val.TableTr16Td2.frFR:Comment puis-je m'assurer que le service Keycloak a démarré avec succès ? 
	 * Val.TableTr16Td2.enUS:How do I make sure the Keycloak service started successfully? 
	 * Val.TableTr16Td3I:far fa-clipboard-check
	 * Val.TableTr16Td4.frFR:Utilisez la commande systemctl status. 
	 * Val.TableTr16Td4.enUS:Use the systemctl status command. 
	 * 
	 * Val.TableTr17Td1I:far fa-sliders-h-square
	 * Val.TableTr17Td2.frFR:Comment créer des collections Keycloak pour commencer l'indexation et la recherche de mon contenu ? 
	 * Val.TableTr17Td2.enUS:How do I create Keycloak collections to begin indexing and searching my content? 
	 * Val.TableTr17Td3I:far fa-user-cog
	 * Val.TableTr17Td4.frFR:Créez des collections avec la commande keycloak. 
	 * Val.TableTr17Td4.enUS:Create collections with the keycloak command. 
	 * 
	 * Val.TableTr18Td1I:far fa-file-search
	 * Val.TableTr18Td2.frFR:Où puis-je aller une fois que j'ai installé un serveur Keycloak ? 
	 * Val.TableTr18Td2.enUS:Where can I go once I have installed a Keycloak server? 
	 * Val.TableTr18Td3I:far fa-list
	 * Val.TableTr18Td4.frFR:Voici quelques URLs utiles vers votre serveur Keycloak. 
	 * Val.TableTr18Td4.enUS:Here are some useful URLs related to your Keycloak server. 
	 */ 
	protected void _recapituler3(PageHtml o) {      
	}

}
