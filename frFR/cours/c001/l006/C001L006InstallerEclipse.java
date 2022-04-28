package org.computate.site.frFR.cours.c001.l006; 

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;

/**  
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/006-comment-installer-eclipse
 * ApiUriRechercheEnUSPage: /enUS/course/001/006-how-to-install-eclipse
 * PageRechercheFrFRPage: C001L006InstallerEclipseFrFRPage
 * PageRechercheEnUSPage: C001L006InstallerEclipseEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNom.frFR: le leçon
 * UnNom.enUS: a lesson
 * 
 * H1.frFR: Comment installer des outils de développement pour développer mon site web ? 
 * H1.enUS: How do I install development tools to develop my website? 
 * 
 * H2.frFR: Comment installer l'IDE Eclipse de manière open source. 
 * H2.enUS: How to install Eclipse IDE the open source way. 
 * 
 * Titre.frFR: Comment installer des outils de développement pour développer mon site web ? Comment installer l'IDE Eclipse de manière open source. 
 * Titre.enUS: How do I install development tools to develop my website? How to install Eclipse IDE the open source way. 
 * 
 * Description.frFR: Pour montrer à quel point Eclipse est important pour le monde du développement open source, de nombreuses grandes entreprises de technologie ont leurs propres IDE basés sur Eclipse. Notamment Red Hat, IBM, Texas Instruments, Adobe, Node, PHP et bien d'autres. Red Hat® Developer Studio est un environnement de développement intégré (IDE) certifié basé sur Eclipse, qui permet de développer, tester et déployer des applications Web élaborées, des applications Web mobiles, des applications transactionnelles d'entreprise et des microservices. Fidèle à la mission de Red Hat, « aider les entreprises à relever les défis auxquels elles sont confrontées de manière open source, » Red Hat est très impliqué dans Eclipse. Je vous aiderai à installer la version la plus récente d'Eclipse pour développer votre site Web de manière open source. 
 * Description.enUS: To show how important Eclipse is to the world of open source development, many leading technology companies have their own IDEs based off Eclipse. These include Red Hat, IBM, Texas Instruments, Adobe, Node, PHP and many more. Red Hat® Developer Studio is a certified Eclipse-based integrated development environment (IDE) for developing, testing, and deploying rich web apps, mobile web apps, transactional enterprise apps, and microservices. True to the Red Hat's mission, "to be the catalyst in communities of customers, contributors, and partners creating better technology the open source way," Red Hat is very involved in Eclipse. I will help you install the most recent version of Eclipse to develop your website the open source way. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 1423
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 1426
*/    
public class C001L006InstallerEclipse extends C001L006InstallerEclipseGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(6);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L006InstallerEclipse.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipse_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipse_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L006InstallerEclipseEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipseFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L006InstallerEclipseEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipseFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipseVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L006InstallerEclipse_H1);
		addPageRecherche_frFR(C001L006InstallerEclipse_H2);
		addPageRecherche_frFR(C001L006InstallerEclipseVals);
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Pour montrer à quel point Eclipse est important pour le monde du développement open source, de nombreuses grandes entreprises de technologie ont leurs propres IDE basés sur Eclipse. 
	 * Val.P.frFR:Notamment Red Hat, IBM, Texas Instruments, Adobe, Node, PHP et bien d'autres.
	 * Val.P.frFR:Red Hat® Developer Studio est un environnement de développement intégré (IDE) certifié basé sur Eclipse, qui permet de développer, tester et déployer des applications Web élaborées, des applications Web mobiles, des applications transactionnelles d'entreprise et des microservices. 
	 * Val.P.frFR:Fidèle à la mission de Red Hat, « aider les entreprises à relever les défis auxquels elles sont confrontées de manière open source, » Red Hat est très impliqué dans Eclipse. 
	 * Val.P.frFR:Je vous aiderai à installer la version la plus récente d'Eclipse pour développer votre site Web de manière open source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:To show how important Eclipse is to the world of open source development, many leading technology companies have their own IDEs based off Eclipse. 
	 * Val.P.enUS:These include Red Hat, IBM, Texas Instruments, Adobe, Node, PHP and many more. 
	 * Val.P.enUS:Red Hat® Developer Studio is a certified Eclipse-based integrated development environment (IDE) for developing, testing, and deploying rich web apps, mobile web apps, transactional enterprise apps, and microservices. 
	 * Val.P.enUS:True to the Red Hat's mission, "to be the catalyst in communities of customers, contributors, and partners creating better technology the open source way," Red Hat is very involved in Eclipse. 
	 * Val.P.enUS:I will help you install the most recent version of Eclipse to develop your website the open source way. 
	 */    
	protected void _moi(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-conveyor-belt-alt
	 * Val.H3Span.frFR:Comment installer les dépendences pour Eclipse ? 
	 * Val.H3Span.enUS:How do I install the dependencies for Eclipse? 
	 * Val.H4I:far fa-cookie
	 * Val.H4Span.frFR:Construisez les dépendances avec yum. 
	 * Val.H4Span.enUS:Build the dependencies with yum. 
	 * 
	 * Val.Ol2Li1.frFR:sudo: La commande pour installer des dépots yum commence par la commande sudo. 
	 * Val.Ol2Li1.frFR:La commande "sudo" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. 
	 * Val.Ol2Li1.frFR:L'installation des dépots yum nécessite toujours les privilèges root. 
	 * Val.Ol2Li1.enUS:sudo: The command to install yum repositories begins with the command sudo. 
	 * Val.Ol2Li1.enUS:The "sudo" command allows your current user to have root privileges for a few minutes after entering your password. 
	 * Val.Ol2Li2.frFR:Ce qui signifie "Yellowdog Updater Modified", mais personne ne le connait comme yellowdog, juste yum. 
	 * Val.Ol2Li2.frFR:CentOS gère les paquets de logiciel et les fichiers d'application RPM avec yum. 
	 * Val.Ol2Li2.enUS:Which stands for "Yellowdog Updater Modified", but nobody knows it as yellowdog, just yum. 
	 * Val.Ol2Li2.enUS:CentOS manages software packages and RPM application files with yum. 
	 * Val.Ol2Li3.frFR:-y: Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. 
	 * Val.Ol2Li3.enUS:-y: Suppress messages asking to confirm if you want to install the software. 
	 * Val.Ol2Li4.frFR:git : Les noms du paquet que vous souhaitez installer. 
	 * Val.Ol2Li4.enUS:git: The package names you wish to install. 
	 * 
	 * Val.Pre3Span1:sudo
	 * Val.Pre3Span2: yum
	 * Val.Pre3Span3: install
	 * Val.Pre3Span4: -y
	 * Val.Pre3Span5: git
	 * 
	 * Val.Ol4Li1:sudo
	 * Val.Ol4Li2:yum
	 * Val.Ol4Li3.frFR:install : Pour installer des nouveaux paquets yum. 
	 * Val.Ol4Li3.enUS:install: For installing new yum packages. 
	 * Val.Ol4Li4:-y
	 * Val.Ol4Li5.frFR:git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. 
	 * Val.Ol4Li5.enUS:git: The distributed revision control system for most open source software. 
	 * 
	 */  
	protected void _questionDependences(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-files-medical
	 * Val.H3Span.frFR:Où est-ce que je place le code source Eclipse ? 
	 * Val.H3Span.enUS:Where do I put the Eclipse source code? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire eclipse dans /usr/local/src. 
	 * Val.H4Span.enUS:Create a eclipse directory in /usr/local/src. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /usr/local/src/eclipse
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
	 * Val.H3I:far fa-map-pin
	 * Val.H3Span.frFR:Où puis-je installer Eclipse ? 
	 * Val.H3Span.enUS:Where do I install Eclipse? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire eclipse dans /opt. 
	 * Val.H4Span.enUS:Create a eclipse directory in /opt. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /opt/eclipse
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:install
	 * Val.Ol2Li3:-d
	 * Val.Ol2Li4:-o
	 * Val.Ol2Li5:$USER
	 * Val.Ol2Li6:-g
	 * Val.Ol2Li7:$USER
	 * Val.Ol2Li8.frFR:/opt est un bon endroit pour installer des applications logicielles open source telles que Eclipse. 
	 * Val.Ol2Li8.enUS:/opt is a good place to install open source software applications like Eclipse. 
	 */  
	protected void _questionMkdirEclipse(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-cloud-download
	 * Val.H3Span.frFR:Comment télécharger le code source d'Eclipse ? 
	 * Val.H3Span.enUS:How do I download the eclipse source code? 
	 * Val.H4I:fab fa-git
	 * Val.H4Span.frFR:Cloner le code source avec la commande git. 
	 * Val.H4Span.enUS:Clone the source code with the git command. 
	 * Val.PreSpan1:git
	 * Val.PreSpan2: clone
	 * Val.PreSpan3: git://git.eclipse.org/gitroot/platform/eclipse.platform.releng.aggregator.git
	 * Val.PreSpan4: /usr/local/src/eclipse
	 * 
	 * Val.Ol2Li1.frFR:git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. 
	 * Val.Ol2Li1.enUS:git: The distributed revision control system for most open source software. 
	 * Val.Ol2Li2.frFR:clone : Cloner un référentiel dans un répertoire. 
	 * Val.Ol2Li2.enUS:clone: Clone a repository into a directory. 
	 * Val.Ol2Li3.frFR:git://git.eclipse.org/gitroot/platform/eclipse.platform.releng.aggregator.git : URL git vers le référentiel de code source eclipse. 
	 * Val.Ol2Li3.enUS:git://git.eclipse.org/gitroot/platform/eclipse.platform.releng.aggregator.git: The git URL to the eclipse source code repository. 
	 * Val.Ol2Li4.frFR:/usr/local/src/eclipse : Répertoire dans lequel le code source eclipse sera cloné. 
	 * Val.Ol2Li4.enUS:/usr/local/src/eclipse: The directory where the eclipse source code will be cloned. 
	 */  
	protected void _questionClonerSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-code-branch
	 * Val.H3Span.frFR:Comment choisir une version récente d'Eclipse ? 
	 * Val.H3Span.enUS:How do I pick a recent version of Eclipse? 
	 * Val.H4I:far fa-tag
	 * Val.H4Span.frFR:Listez toutes les tags du référentiel git. 
	 * Val.H4Span.enUS:List all the tags in the git repository. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/eclipse
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: tag)
	 * 
	 * Val.Ol1Li1.frFR:(cd : Changer de répertoire temporairement avec la parenthèse ouverte. 
	 * Val.Ol1Li1.enUS:(cd: Change directory temporarily, because of the open parenthesis. 
	 * Val.Ol1Li2.frFR:/usr/local/src/eclipse : Répertoire dans lequel le code source eclipse a été cloné. 
	 * Val.Ol1Li2.enUS:/usr/local/src/eclipse: The directory where the eclipse source code was cloned. 
	 * Val.Ol1Li3.frFR:&& : Exécutez la commande cd et git ensemble. 
	 * Val.Ol1Li3.enUS:&&: Run the cd and git command together. 
	 * Val.Ol1Li4:git
	 * Val.Ol1Li5.frFR:tag) : Répertorie les tags actuelles ou les versions assignées du code et ferme la parenthèse. 
	 * Val.Ol1Li5.enUS:tag): Lists the current tags or assigned versions of the code and close the parenthesis. 
	 * 
	 * Val.P1Span1.frFR:Choisir une version peut être assez déroutant, je vous recommande de visiter la page Eclipse Project Build Types. 
	 * Val.P1Span1.enUS:Picking a version can be quite confusing, so I recommend visiting the Eclipse Project Build Types page. 
	 * Val.P1A2:https://download.eclipse.org/eclipse/downloads/build_types.html
	 * Val.P1Span3.frFR:. Vous trouverez des informations sur les versions stables: « Les versions stables sont des versions d'intégration qui se sont révélées suffisamment stables pour être utilisées par la plupart des utilisateurs. 
	 * Val.P1Span3.frFR:Ils sont promus d’intégration en construction stable par l’équipe d’architectes après avoir été utilisés pendant quelques jours et jugés raisonnablement stables. 
	 * Val.P1Span3.frFR:La dernière version stable est la bonne version pour ceux qui veulent rester au courant de ce qui se passe dans le dernier flux de développement et qui ne craignent pas de rencontrer quelques problèmes pour obtenir les dernières fonctionnalités des corrections. 
	 * Val.P1Span3.frFR:La dernière version stable est celle que l’équipe de développement aime bien utiliser, en raison des retours précieux et opportuns. » 
	 * Val.P1Span3.frFR:Visitez, alors, la page Eclipse Project Downloads. 
	 * Val.P1Span3.enUS:. You can read about Stable builds: "Stable builds are integration builds that have been found to be stable enough for most people to use. 
	 * Val.P1Span3.enUS:They are promoted from integration build to stable build by the architecture team after they have been used for a few days and deemed reasonably stable. 
	 * Val.P1Span3.enUS:The latest stable build is the right build for people who want to stay up to date with what is going on in the latest development stream, and don't mind putting up with a few problems n in order to get the latest greatest features and bug fixes. 
	 * Val.P1Span3.enUS:The latest stable build is the one the development team likes people to be using, because of the valuable and timely feedback." 
	 * Val.P2Span3.enUS:Now visit the Eclipse Project Downloads page. 
	 * Val.P2A2:https://download.eclipse.org/eclipse/downloads/
	 * Val.P2Span2.frFR:. Recherchez la section « Stable Builds ». 
	 * Val.P2Span2.frFR:Si elle indique quelque chose comme "4.12M1", recherchez le tag git "S4_12_0_M1" qui serait probablement le bon tag stable sur laquelle on peut construire à ce moment-là. 
	 * Val.P2Span2.enUS:. Look for the "Stable Builds" section. 
	 * Val.P2Span2.enUS:If it says something like "4.12M1", then look for the git branch "S4_12_0_M1" which would likely be the right stable tag to build off of at that time. 
	 */  
	protected void _questionListerTags(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-code-merge
	 * Val.H3Span.frFR:Comment changer de version du code source d'Eclipse ? 
	 * Val.H3Span.enUS:How do I switch versions of the eclipse source code? 
	 * Val.H4I:far fa-code-commit
	 * Val.H4Span.frFR:Checkout la tag git. 
	 * Val.H4Span.enUS:Checkout the git tag. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/eclipse
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: checkout
	 * Val.PreSpan6: S4_12_0_M1)
	 * 
	 * Val.Ol1Li1:(cd
	 * Val.Ol1Li2:/usr/local/src/eclipse
	 * Val.Ol1Li3:&&
	 * Val.Ol1Li4:git
	 * Val.Ol1Li5.frFR:checkout : Checkout une branche dans l’arbre de travail. 
	 * Val.Ol1Li5.enUS:checkout: Checkout a branch to the working tree. 
	 * Val.Ol1Li6.frFR:S4_12_0_M1) : La dernière tag pour baser la branche. 
	 * Val.Ol1Li6.enUS:S4_12_0_M1): The latest tag to base the branch from. 
	 */  
	protected void _questionCheckoutTag(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-retweet
	 * Val.H3Span.frFR:Comment puis-je intégrer toutes les dépendances d'Eclipse ? 
	 * Val.H3Span.enUS:How do I pull in all the Eclipse dependencies? 
	 * Val.H4I:far fa-sitemap
	 * Val.H4Span.frFR:Mettez à jour les sous-modules avec git. 
	 * Val.H4Span.enUS:Update the submodules with git. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/eclipse
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: submodule
	 * Val.PreSpan6: update
	 * Val.PreSpan7: --init
	 * Val.PreSpan8: --recursive)
	 * 
	 * Val.Ol2Li1:(cd
	 * Val.Ol2Li2:/usr/local/src/eclipse
	 * Val.Ol2Li3:&&
	 * Val.Ol2Li4:git
	 * Val.Ol2Li5.frFR:submodule : Les sous-modules Git sont d'autres référentiels Git qui peuvent être chargés dans un autre référentiel à un certain commit. 
	 * Val.Ol2Li5.enUS:submodule: Git submodules are other git repositories that can be loaded into another repository at a certain commit. 
	 * Val.Ol2Li6.frFR:update : Mettez à jour tous les sous-modules dans le référentiel git actuel. 
	 * Val.Ol2Li6.enUS:update: Update all submodules in the current git repository. 
	 * Val.Ol2Li7.frFR:--init : Initialise les sous-modules vides. 
	 * Val.Ol2Li7.enUS:--init: Initialize empty submodules. 
	 * Val.Ol2Li8.frFR:--recursive) : Initialiser les sous-modules des sous-modules dans le référentiel git de manière récursive. 
	 * Val.Ol2Li8.frFR:Cela prendra beaucoup de temps. 
	 * Val.Ol2Li8.enUS:--recursive): Initialize submodules of the submodules in the git repository recursively. 
	 * Val.Ol2Li8.enUS:This will take a long time. 
	 */  
	protected void _questionSousModules(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-tools
	 * Val.H3Span.frFR:Comment contruire le code source d'eclipse ? 
	 * Val.H3Span.enUS:How do I build the eclipse source code? 
	 * Val.H4I:far fa-terminal
	 * Val.H4Span.frFR:Construisez Eclipse avec la commande mvn. 
	 * Val.H4Span.enUS:Build Eclipse with the mvn command. 
	 * 
	 * Val.Pre1Span1:(cd
	 * Val.Pre1Span2: /usr/local/src/eclipse
	 * Val.Pre1Span3: &&
	 * Val.Pre1Span4: mvn
	 * Val.Pre1Span5: clean
	 * Val.Pre1Span6: verify
	 * Val.Pre1Span7: -DskipTests=true)
	 * 
	 * Val.Ol1Li1:(cd
	 * Val.Ol1Li2:/usr/local/src/eclipse
	 * Val.Ol1Li3:&&
	 * Val.Ol1Li4.frFR:mvn : L'outil de gestion de projet logiciel Java. 
	 * Val.Ol1Li4.enUS:mvn: The java software project management tool. 
	 * Val.Ol1Li5.frFR:clean : Nettoyez toutes les versions précédentes. 
	 * Val.Ol1Li5.enUS:clean: Clean up any previous builds. 
	 * Val.Ol1Li6.frFR:verify : La cible Maven pour construire l’application Eclipse. 
	 * Val.Ol1Li6.enUS:verify: The Maven target to build the eclipse application. 
	 * Val.Ol1Li7.frFR:-DskipTests=true) : Ignorer les tests pour accélérer la compilation, mais la compilation prendra encore beaucoup de temps. 
	 * Val.Ol1Li7.enUS:-DskipTests=true): Skip tests to make the build go faster, but the build will still take a very long time. 
	 * 
	 * Val.P2.frFR:Maintenant, copiez la nouvelle application Eclipse dans le répertoire de destination. 
	 * Val.P2.enUS:Now copy the newly built eclipse application into the destination directory. 
	 */
	protected void _questionConstruireSource(PageHtml o) {
	}

	/** 
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-exclamation-square
	 * Val.H3Span.frFR:Et si ma construction échoue ? 
	 * Val.H3Span.enUS:What if my build fails? 
	 * Val.H4I:far fa-repeat
	 * Val.H4Span.frFR:Essayez une autre tag, nettoyez-la et réessayez. 
	 * Val.H4Span.enUS:Try a different tag, clean it up, and try again. 
	 * 
	 * Val.Pre1Span1:(cd
	 * Val.Pre1Span2: /usr/local/src/eclipse
	 * Val.Pre1Span3: &&
	 * Val.Pre1Span4: git
	 * Val.Pre1Span5: tag)
	 * 
	 * Val.Pre2Span1:(cd
	 * Val.Pre2Span2: /usr/local/src/eclipse
	 * Val.Pre2Span3: &&
	 * Val.Pre2Span4: git
	 * Val.Pre2Span5: checkout
	 * Val.Pre2Span6: S4_12_0_M1)
	 * 
	 * Val.Pre3Span01:(cd
	 * Val.Pre3Span02: /usr/local/src/eclipse
	 * Val.Pre3Span03: &&
	 * Val.Pre3Span04: git
	 * Val.Pre3Span05: submodule
	 * Val.Pre3Span06: foreach
	 * Val.Pre3Span07: --recursive
	 * Val.Pre3Span08: git
	 * Val.Pre3Span09: clean
	 * Val.Pre3Span10: -f
	 * Val.Pre3Span11: -d)
	 * 
	 * Val.Ol3Li01:(cd
	 * Val.Ol3Li02:/usr/local/src/eclipse
	 * Val.Ol3Li03:&&
	 * Val.Ol3Li04:git
	 * Val.Ol3Li05:submodule
	 * Val.Ol3Li06.frFR:foreach : Exécutez la commande suivante pour chaque sous-module. 
	 * Val.Ol3Li06.enUS:foreach: Perform the following command for each submodule. 
	 * Val.Ol3Li07:--recursive
	 * Val.Ol3Li08:git
	 * Val.Ol3Li09.frFR:clean : Supprimer les fichiers non suivis de l'arbre de travail. 
	 * Val.Ol3Li09.enUS:clean: Remove untracked files from the working tree. 
	 * Val.Ol3Li10.frFR:-f : Force git à nettoyer le projet. 
	 * Val.Ol3Li10.enUS:-f: Force git to clean the project. 
	 * Val.Ol3Li11.frFR:-d) : Supprimez les répertoires non suivis en plus des fichiers non suivis. 
	 * Val.Ol3Li11.enUS:-d): Remove untracked directories in addition to untracked files. 
	 * 
	 * Val.Pre4Span1:(cd
	 * Val.Pre4Span2: /usr/local/src/eclipse
	 * Val.Pre4Span3: &&
	 * Val.Pre4Span4: mvn
	 * Val.Pre4Span5: clean
	 * Val.Pre4Span6: verify
	 * Val.Pre4Span7: -DskipTests=true)
	 */  
	protected void _questionErreur(PageHtml o) {
	}

	/** 
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-copy
	 * Val.H3Span.frFR:Comment pourrais-je copier la nouvelle version d'Eclipse au bon endroit ? 
	 * Val.H3Span.enUS:How would I copy the new eclipse build into the right location? 
	 * Val.H4I:far fa-sync-alt
	 * Val.H4Span.frFR:Utilisez rsync. 
	 * Val.H4Span.enUS:Use rsync. 
	 * 
	 * Val.Pre2Span1:rsync
	 * Val.Pre2Span2: -r
	 * Val.Pre2Span3: /usr/local/src/eclipse/eclipse.platform.releng.tychoeclipsebuilder/sdk/target/products/org.eclipse.sdk.ide/linux/gtk/x86_64/eclipse/
	 * Val.Pre2Span4: /opt/eclipse/
	 * 
	 * Val.Ol2Li1.frFR:rsync: Un outil de copie de fichiers rapide et polyvalent, distant (et local). 
	 * Val.Ol2Li1.enUS:rsync: a fast, versatile, remote (and local) file-copying tool. 
	 * Val.Ol2Li2.frFR:-r: Recurse dans des répertoires. 
	 * Val.Ol2Li2.enUS:-r: Recurse into directories. 
	 * Val.Ol2Li3.frFR:Le répertoire où l'application eclipse a été construite. 
	 * Val.Ol2Li3.frFR:N'oubliez pas le slash à la fin ou rsync suppose qu'il s'agit d'un fichier dans la destination. 
	 * Val.Ol2Li3.enUS:The directory where the eclipse application was built. 
	 * Val.Ol2Li3.enUS:Don't forget the ending slash or rsync assumes it's a file inside the destination. 
	 * Val.Ol2Li4.frFR:/opt/eclipse/ : Le répertoire où le eclipse sera installé.
	 * Val.Ol2Li4.frFR:/opt/eclipse/ : C'est préférable de toujours écrire des répertoires avec un slash dans rsync pour éviter les surprises. 
	 * Val.Ol2Li4.enUS:/opt/eclipse/: The directory where the eclipse will be installed. 
	 * Val.Ol2Li4.enUS:/opt/eclipse/: It's best to always write directories with a trailing slash in rsync for fewer surprises. 
	 */  
	protected void _questionCopierSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-image
	 * Val.H3Span.frFR:Comment créer une icône d'application pour exécuter eclipse ? 
	 * Val.H3Span.enUS:How do I make an application icon to run eclipse? 
	 * Val.H4I:far fa-file-alt
	 * Val.H4Span.frFR:Créez un fichier eclipse.desktop dans /usr/share/applications. 
	 * Val.H4Span.enUS:Create an eclipse.desktop file in /usr/share/applications. 
	 * 
	 * Val.Pre1Span01:echo
	 * Val.Pre1Span02: '
	 * Val.Pre1Span03:[Desktop Entry]
	 * Val.Pre1Span04Br:Type=Application
	 * Val.Pre1Span05Br:Name=Eclipse
	 * Val.Pre1Span06Br.frFR:Comment=Environnement de Développement Intégré Eclipse
	 * Val.Pre1Span06Br.enUS:Comment=Eclipse Integrated Development Environment
	 * Val.Pre1Span07Br:Icon=/opt/eclipse/icon.xpm
	 * Val.Pre1Span08Br:Exec=/opt/eclipse/eclipse
	 * Val.Pre1Span09Br:Terminal=false
	 * Val.Pre1Span10Br:Categories=Development;IDE;Java;
	 * Val.Pre1Span11Br:'
	 * Val.Pre1Span12: |
	 * Val.Pre1Span13: sudo
	 * Val.Pre1Span14: tee
	 * Val.Pre1Span15: /usr/share/applications/eclipse.desktop
	 * 
	 * Val.P1.frFR:Comme ça, vous pouvez maintenant trouver Eclipse dans vos applications ! 
	 * Val.P1.enUS:Like that, you can now find Eclipse in your applications! 
	 */  
	protected void _questionSauvegardeRemplacer(PageHtml o) {
	}

	/**
	 * Val.H3.frFR:À récapituler : 
	 * Val.H3.enUS:To review: 
	 */
	protected void _recapituler1(PageHtml o) {      
	}

	/**
	 * Val.TableTr1Td1.frFR:Jeudi 
	 * Val.TableTr1Td1.enUS:Thursday 
	 * Val.TableTr1Td2I:far fa-eclipse
	 * Val.TableTr1Td3I:far fa-file-code
	 * Val.TableTr1Td4I:far fa-pen-nib
	 * Val.TableTr2Td1.frFR:9 Mai 2019
	 * Val.TableTr2Td1.enUS:May 9 2019
	 * Val.TableTr2Td2.frFR:Comment installer la dernière version d'Eclipse ? 
	 * Val.TableTr2Td2.enUS:How do I install the latest version of eclipse. 
	 * Val.TableTr2Td3.frFR:Installer eclipse à partir du code source. 
	 * Val.TableTr2Td3.enUS:Install eclipse from the source code. 
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
	 * Val.TableTr02Td2.frFR:Comment installer les dépendences pour Eclipse ? 
	 * Val.TableTr02Td2.enUS:How do I install the dependencies for Eclipse? 
	 * Val.TableTr02Td3Span1I:far fa-cookie
	 * Val.TableTr02Td4.frFR:Construisez les dépendances avec yum. 
	 * Val.TableTr02Td4.enUS:Build the dependencies with yum. 
	 * 
	 * Val.TableTr03Td1I:far fa-files-medical
	 * Val.TableTr03Td2.frFR:Où est-ce que je place le code source Eclipse ? 
	 * Val.TableTr03Td2.enUS:Where do I put the Eclipse source code? 
	 * Val.TableTr03Td3I:far fa-folder-tree
	 * Val.TableTr03Td4.frFR:Créez un répertoire eclipse dans /usr/local/src. 
	 * Val.TableTr03Td4.enUS:Create a eclipse directory in /usr/local/src. 
	 * 
	 * Val.TableTr04Td1I:far fa-map-pin
	 * Val.TableTr04Td2.frFR:Où puis-je installer Eclipse ? 
	 * Val.TableTr04Td2.enUS:Where do I install Eclipse? 
	 * Val.TableTr04Td3Span1I:far fa-folder-tree
	 * Val.TableTr04Td4.frFR:Créez un répertoire eclipse dans /opt. 
	 * Val.TableTr04Td4.enUS:Create a eclipse directory in /opt. 
	 * 
	 * Val.TableTr05Td1I:far fa-cloud-download
	 * Val.TableTr05Td2.frFR:Comment télécharger le code source d'Eclipse ? 
	 * Val.TableTr05Td2.enUS:How do I download the eclipse source code? 
	 * Val.TableTr05Td3I:fab fa-git
	 * Val.TableTr05Td4.frFR:Cloner le code source avec la commande git. 
	 * Val.TableTr05Td4.enUS:Clone the source code with the git command. 
	 * 
	 * Val.TableTr06Td1I:far fa-code-branch
	 * Val.TableTr06Td2.frFR:Comment choisir une version récente d'Eclipse ? 
	 * Val.TableTr06Td2.enUS:How do I pick a recent version of Eclipse? 
	 * Val.TableTr06Td3I:far fa-tag
	 * Val.TableTr06Td4.frFR:Listez toutes les tags du référentiel git. 
	 * Val.TableTr06Td4.enUS:List all the tags in the git repository. 
	 * 
	 * Val.TableTr07Td1I:far fa-code-merge
	 * Val.TableTr07Td2.frFR:Comment changer de version du code source d'Eclipse ? 
	 * Val.TableTr07Td2.enUS:How do I switch versions of the eclipse source code? 
	 * Val.TableTr07Td3I:far fa-code-commit
	 * Val.TableTr07Td4.frFR:Checkout la tag git. 
	 * Val.TableTr07Td4.enUS:Checkout the git tag. 
	 * 
	 * Val.TableTr08Td1I:far fa-retweet
	 * Val.TableTr08Td2.frFR:Comment puis-je intégrer toutes les dépendances d'Eclipse ? 
	 * Val.TableTr08Td2.enUS:How do I pull in all the Eclipse dependencies? 
	 * Val.TableTr08Td3I:far fa-sitemap
	 * Val.TableTr08Td4.frFR:Mettez à jour les sous-modules avec git. 
	 * Val.TableTr08Td4.enUS:Update the submodules with git. 
	 * 
	 * Val.TableTr09Td1I:far fa-tools
	 * Val.TableTr09Td2.frFR:Comment contruire le code source d'Eclipse ? 
	 * Val.TableTr09Td2.enUS:How do I build the eclipse source code? 
	 * Val.TableTr09Td3I:far fa-terminal
	 * Val.TableTr09Td4.frFR:Construisez Eclipse avec la commande mvn. 
	 * Val.TableTr09Td4.enUS:Build Eclipse with the mvn command. 
	 * 
	 * Val.TableTr10TdI:far fa-exclamation-square
	 * Val.TableTr10Td2.frFR:Et si ma construction échoue ? 
	 * Val.TableTr10Td2.enUS:What if my build fails? 
	 * Val.TableTr10Td3I:far fa-repeat
	 * Val.TableTr10Td4.frFR:Essayez une autre tag, nettoyez-la et réessayez. 
	 * Val.TableTr10Td4.enUS:Try a different tag, clean it up, and try again. 
	 * 
	 * Val.TableTr11TdI:far fa-copy
	 * Val.TableTr11Td2.frFR:Comment pourrais-je copier la nouvelle version d'Eclipse au bon endroit ? 
	 * Val.TableTr11Td2.enUS:How would I copy the new eclipse build into the right location? 
	 * Val.TableTr11Td3I:far fa-sync-alt
	 * Val.TableTr11Td4.frFR:Utilisez rsync. 
	 * Val.TableTr11Td4.enUS:Use rsync. 
	 * 
	 * Val.TableTr12Td1I:far fa-image
	 * Val.TableTr12Td2.frFR:Comment créer une icône d'application pour exécuter eclipse ? 
	 * Val.TableTr12Td2.enUS:How do I make an application icon to run eclipse? 
	 * Val.TableTr12Td3I:far fa-file-alt
	 * Val.TableTr12Td4.frFR:Créez un fichier eclipse.desktop dans /usr/share/applications. 
	 * Val.TableTr12Td4.enUS:Create an eclipse.desktop file in /usr/share/applications. 
	 */ 
	protected void _recapituler3(PageHtml o) {      
	}
}

