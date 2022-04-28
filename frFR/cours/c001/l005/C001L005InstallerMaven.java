package org.computate.site.frFR.cours.c001.l005; 

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;

/**
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/004-comment-installer-la-derniere-version-de-maven
 * ApiUriRechercheEnUSPage: /enUS/course/001/004-how-to-install-the-latest-version-of-maven
 * PageRechercheFrFRPage: C001L005InstallerMavenFrFRPage
 * PageRechercheEnUSPage: C001L005InstallerMavenEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNom.frFR: le leçon
 * UnNom.enUS: a lesson
 * 
 * H1.frFR: Comment installer la dernière version de maven ? 
 * H1.enUS: How do I install the latest version of maven. 
 * 
 * H2.frFR: Installer maven à partir du code source. 
 * H2.enUS: Install maven from the source code. 
 * 
 * Titre.frFR: Comment installer la dernière version de maven ? Installer maven à partir du code source. 
 * Titre.enUS: How do I install the latest version of maven. Install maven from the source code. 
 * 
 * Description.frFR: La plupart des entreprises utilisent aujourd'hui Java pour créer leurs applications et microservices, y compris les gouvernements, les banques, la comptabilité et les entreprises. La création d’applications Java commence par l’installation de Maven. La version par défaut de Maven sur votre distribution Linux est peut être obsolète pour installer certains logiciels open source. Je vous aiderai à installer la version la plus récente de Maven pour développer votre site Web de manière open source. 
 * Description.enUS: Most enterprises use Java today to build their applications and microservices, including governments, banks, accounting and businesses. Building java applications begins with installing Maven. The default version of Maven on your Linux distribution may be out of date to install certain open source software. I will help you install the most recent version of Maven to develop your website the open source way. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 1470
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 1245
*/   
public class C001L005InstallerMaven extends C001L005InstallerMavenGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(5);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L005InstallerMaven.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L005InstallerMaven_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.C001L005InstallerMaven_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L005InstallerMaven_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.C001L005InstallerMaven_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L005InstallerMavenEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L005InstallerMavenFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L005InstallerMavenEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L005InstallerMavenFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.C001L005InstallerMaven_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.C001L005InstallerMaven_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.C001L005InstallerMavenVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L005InstallerMaven_H1);
		addPageRecherche_frFR(C001L005InstallerMaven_H2);
		addPageRecherche_frFR(C001L005InstallerMavenVals);
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:La plupart des entreprises utilisent aujourd'hui Java pour créer leurs applications et microservices, y compris les gouvernements, les banques, la comptabilité et les entreprises. 
	 * Val.P.frFR:La création d’applications Java commence par l’installation de Maven. 
	 * Val.P.frFR:La version par défaut de Maven sur votre distribution Linux est peut être obsolète pour installer certains logiciels open source. 
	 * Val.P.frFR:Je vous aiderai à installer la version la plus récente de Maven pour développer votre site Web de manière open source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:Most enterprises use Java today to build their applications and microservices, including governments, banks, accounting and businesses. 
	 * Val.P.enUS:Building java applications begins with installing Maven. 
	 * Val.P.enUS:The default version of Maven on your Linux distribution may be out of date to install certain open source software. 
	 * Val.P.enUS:I will help you install the most recent version of Maven to develop your website the open source way. 
	 */    
	protected void _moi(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-conveyor-belt-alt
	 * Val.H3Span.frFR:Comment installer les dépendences pour Maven ? 
	 * Val.H3Span.enUS:How do I install the dependencies for Maven? 
	 * Val.H4I:far fa-cookie
	 * Val.H4Span.frFR:Construisez les dépendances avec yum. 
	 * Val.H4Span.enUS:Build the dependencies with yum. 
	 * Val.Pre1Span1:sudo
	 * Val.Pre1Span2: yum-builddep
	 * Val.Pre1Span3: -y
	 * Val.Pre1Span4: maven
	 * 
	 * Val.Ol2Li1.frFR:sudo: La commande pour installer des dépots yum commence par la commande sudo. 
	 * Val.Ol2Li1.frFR:La commande "sudo" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. 
	 * Val.Ol2Li1.frFR:L'installation des dépots yum nécessite toujours les privilèges root. 
	 * Val.Ol2Li1.enUS:sudo: The command to install yum repositories begins with the command sudo. 
	 * Val.Ol2Li1.enUS:The "sudo" command allows your current user to have root privileges for a few minutes after entering your password. 
	 * Val.Ol2Li2.frFR:yum Signifie "Yellowdog Updater Modified", mais personne ne le connait comme yellowdog, juste yum. 
	 * Val.Ol2Li2.frFR:yum-builddep installe les dépendances manquantes pour la construction d'un paquet RPM. 
	 * Val.Ol2Li2.enUS:yum Stands for "Yellowdog Updater Modified", but nobody knows it as yellowdog, just yum. 
	 * Val.Ol2Li2.enUS:yum-builddep installs missing dependencies for building an RPM package. 
	 * Val.Ol2Li3.frFR:-y: Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. 
	 * Val.Ol2Li3.enUS:-y: Suppress messages asking to confirm if you want to install the software. 
	 * Val.Ol2Li4.frFR:maven : Le nom du paquet pour lequel vous vous souhaitez installer les dépendences. 
	 * Val.Ol2Li4.enUS:maven: The package name you wish to install the dependencies for. 
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
	 * Val.H3Span.frFR:Où est-ce que je place le code source Maven ? 
	 * Val.H3Span.enUS:Where do I put the Maven source code? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire maven dans /usr/local/src. 
	 * Val.H4Span.enUS:Create a maven directory in /usr/local/src. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /usr/local/src/maven
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
	 * Val.H3Span.frFR:Où puis-je installer Maven ? 
	 * Val.H3Span.enUS:Where do I install Maven? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire maven dans /opt. 
	 * Val.H4Span.enUS:Create a maven directory in /opt. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /opt/maven
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:install
	 * Val.Ol2Li3:-d
	 * Val.Ol2Li4:-o
	 * Val.Ol2Li5:$USER
	 * Val.Ol2Li6:-g
	 * Val.Ol2Li7:$USER
	 * Val.Ol2Li8.frFR:/opt est un bon endroit pour installer des applications logicielles open source telles que maven. 
	 * Val.Ol2Li8.enUS:/opt is a good place to install open source software applications like maven. 
	 */  
	protected void _questionMkdirMaven(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-cloud-download
	 * Val.H3Span.frFR:Comment télécharger le code source de maven ? 
	 * Val.H3Span.enUS:How do I download the maven source code? 
	 * Val.H4I:fab fa-git
	 * Val.H4Span.frFR:Cloner le code source avec la commande git. 
	 * Val.H4Span.enUS:Clone the source code with the git command. 
	 * Val.PreSpan1:git
	 * Val.PreSpan2: clone
	 * Val.PreSpan3: https://git-wip-us.apache.org/repos/asf/maven.git
	 * Val.PreSpan4: /usr/local/src/maven
	 * 
	 * Val.Ol2Li1.frFR:git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. 
	 * Val.Ol2Li1.enUS:git: The distributed revision control system for most open source software. 
	 * Val.Ol2Li2.frFR:clone : Cloner un référentiel dans un répertoire. 
	 * Val.Ol2Li2.enUS:clone: Clone a repository into a directory. 
	 * Val.Ol2Li3.frFR:https://git-wip-us.apache.org/repos/asf/maven.git : URL git vers le référentiel de code source maven. 
	 * Val.Ol2Li3.enUS:https://git-wip-us.apache.org/repos/asf/maven.git: The git URL to the maven source code repository. 
	 * Val.Ol2Li4.frFR:/usr/local/src/maven : Répertoire dans lequel le code source maven sera cloné. 
	 * Val.Ol2Li4.enUS:/usr/local/src/maven: The directory where the maven source code will be cloned. 
	 */  
	protected void _questionClonerSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-code-branch
	 * Val.H3Span.frFR:Comment choisir une version récente de Maven ? 
	 * Val.H3Span.enUS:How do I pick a recent version of Maven? 
	 * Val.H4I:far fa-tag
	 * Val.H4Span.frFR:Listez toutes les tags du référentiel git. 
	 * Val.H4Span.enUS:List all the tags in the git repository. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/maven
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: tag)
	 * 
	 * Val.Ol2Li1.frFR:(cd : Changer de répertoire temporairement avec la parenthèse ouverte. 
	 * Val.Ol2Li1.enUS:(cd: Change directory temporarily, because of the open parenthesis. 
	 * Val.Ol2Li2.frFR:/usr/local/src/maven : Répertoire dans lequel le code source maven a été cloné. 
	 * Val.Ol2Li2.enUS:/usr/local/src/maven: The directory where the maven source code was cloned. 
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
	 * Val.H3Span.frFR:Comment changer de version du code source de maven ? 
	 * Val.H3Span.enUS:How do I switch versions of the maven source code? 
	 * Val.H4I:far fa-code-commit
	 * Val.H4Span.frFR:Checkout la tag git. 
	 * Val.H4Span.enUS:Checkout the git tag. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/maven
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: checkout
	 * Val.PreSpan6: maven-3.6.1)
	 * 
	 * Val.Ol2Li1:(cd
	 * Val.Ol2Li2:/usr/local/src/maven
	 * Val.Ol2Li3:&&
	 * Val.Ol2Li4:git
	 * Val.Ol2Li5.frFR:checkout : Checkout une branche dans l’arbre de travail. 
	 * Val.Ol2Li5.enUS:checkout: Checkout a branch to the working tree. 
	 * Val.Ol2Li6.frFR:maven-3.6.1) : La dernière tag pour baser la branche. 
	 * Val.Ol2Li6.enUS:maven-3.6.1): The latest tag to base the branch from. 
	 */  
	protected void _questionCheckoutTag(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-tools
	 * Val.H3Span.frFR:Comment contruire le code source de maven ? 
	 * Val.H3Span.enUS:How do I build the maven source code? 
	 * Val.H4I:far fa-terminal
	 * Val.H4Span.frFR:Construisez Maven avec la commande mvn. 
	 * Val.H4Span.enUS:Build Maven with the mvn command. 
	 * 
	 * Val.Pre1Span1:(cd
	 * Val.Pre1Span2: /usr/local/src/maven
	 * Val.Pre1Span3: &&
	 * Val.Pre1Span4: mvn
	 * Val.Pre1Span5: -DdistributionTargetDir="/tmp/maven"
	 * Val.Pre1Span6: clean
	 * Val.Pre1Span7: package)
	 * 
	 * Val.Ol1Li1:(cd
	 * Val.Ol1Li2:/usr/local/src/maven
	 * Val.Ol1Li3:&&
	 * Val.Ol1Li4.frFR:mvn : L'outil de gestion de projet logiciel Java. 
	 * Val.Ol1Li4.enUS:mvn: The java software project management tool. 
	 * Val.Ol1Li5.frFR:-DdistributionTargetDir="/tmp/maven" : Pointez le distributionTargetDir vers un répertoire temporaire dans /tmp. 
	 * Val.Ol1Li5.enUS:-DdistributionTargetDir="/tmp/maven": Point the distributionTargetDir to a temporary directory in /tmp. 
	 * Val.Ol1Li6.frFR:clean : Nettoyez toutes les versions précédentes. 
	 * Val.Ol1Li6.enUS:clean: Clean up any previous builds. 
	 * Val.Ol1Li7.frFR:package) : Construire l'application Maven complète et fermez la parenthèse. 
	 * Val.Ol1Li7.enUS:package): Build the complete maven application and close the parenthesis. 
	 * 
	 * Val.Pre2Span1:rsync
	 * Val.Pre2Span2: -r
	 * Val.Pre2Span3: /tmp/maven/
	 * Val.Pre2Span4: /opt/maven/
	 * 
	 * Val.Ol2Li1.frFR:rsync: Un outil de copie de fichiers rapide et polyvalent, distant (et local). 
	 * Val.Ol2Li1.enUS:rsync: a fast, versatile, remote (and local) file-copying tool. 
	 * Val.Ol2Li2.frFR:-r: Recurse dans des répertoires. 
	 * Val.Ol2Li2.enUS:-r: Recurse into directories. 
	 * Val.Ol2Li3.frFR:/tmp/maven/ : Le répertoire où l'application maven a été construite. 
	 * Val.Ol2Li3.frFR:/tmp/maven/ : N'oubliez pas le slash à la fin ou rsync suppose qu'il s'agit d'un fichier dans la destination. 
	 * Val.Ol2Li3.enUS:/tmp/maven/: The directory where the maven application was built. 
	 * Val.Ol2Li3.enUS:/tmp/maven/: Don't forget the ending slash or rsync assumes it's a file inside the destination. 
	 * Val.Ol2Li4.frFR:/opt/maven/ : Le répertoire où le maven sera installé.
	 * Val.Ol2Li4.frFR:/opt/maven/ : C'est préférable de toujours écrire des répertoires avec un slash dans rsync pour éviter les surprises. 
	 * Val.Ol2Li4.enUS:/opt/maven/: The directory where the maven will be installed. 
	 * Val.Ol2Li4.enUS:/opt/maven/: It's best to always write directories with a trailing slash in rsync for fewer surprises. 
	 */  
	protected void _questionConstruireSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-question
	 * Val.H3Span.frFR:Mais pourquoi installons-nous Maven pour installer la dernière version de Maven ? 
	 * Val.H3Span.enUS:But why are we installing Maven to install the latest Maven? 
	 * Val.H4I:far fa-flushed
	 * Val.H4Span.frFR:Un programme qui nécessite de se construire. 
	 * Val.H4Span.enUS:A program that requires itself to build itself. 
	 * 
	 * Val.H5Span.frFR:
	 * Val.P5Span.frFR:Je ne le croisais pas non plus, un programme qui nécessite de se construire ? 
	 * Val.P5Span.frFR:Le mieux que je puisse faire pour expliquer ce phénomène est de citer la documentation de Maven : 
	 * Val.P5Span.frFR:« Jusqu'au Maven 3.3, la construction de base de Maven pourrait être optimisée avec une construction Ant.  
	 * Val.P5Span.frFR:Ce bootstrap a été supprimé dans Maven 3.5: vous avez besoin d'un Maven pré-construit pour créer Maven à partir du source. » 
	 * Val.H5Span.enUS:
	 * Val.P5Span.enUS:I couldn't believe it myself at first, a program that requires itself to build itself? 
	 * Val.P5Span.enUS:The best I can do to explain this phenomenon is to quote the maven documentation: 
	 * Val.P5Span.enUS:"Until Maven 3.3, Maven core build could be boostrapped with an Ant build. 
	 * Val.P5Span.enUS:This bootstrap has been removed in Maven 3.5: you need a pre-built Maven to build Maven from source." 
	 */  
	protected void _questionMavenInstalleMaven(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-mind-share
	 * Val.H3Span.frFR:Comment changer la commande mvn par défaut sur le système ? 
	 * Val.H3Span.enUS:How do I change the default mvn command on the system? 
	 * Val.H4I:far fa-link
	 * Val.H4Span.frFR:Sauvegardez l'original et faites un lien symbolique. 
	 * Val.H4Span.enUS:Backup the original and make a symbolic link. 
	 * 
	 * Val.Pre1Span1:which
	 * Val.Pre1Span2: mvn
	 * 
	 * Val.Ol1Li1.frFR:which : Affiche le chemin complet des commandes dans $PATH. 
	 * Val.Ol1Li1.enUS:which: Shows the full path of commands in the $PATH. 
	 * Val.Ol1Li2.frFR:mvn : La commande que nous voulons sauvegarder et mettre à niveau. 
	 * Val.Ol1Li2.enUS:mvn: The command we want to backup and upgrade. 
	 * 
	 * Val.Pre2Span1:mvn
	 * Val.Pre2Span2: -v
	 * 
	 * Val.Ol2Li1:mvn
	 * Val.Ol2Li2.frFR:-v : Voir la version de maven sur le système. 
	 * Val.Ol2Li2.enUS:-v: View the version of maven on the system. 
	 * 
	 * Val.Pre3Span1:sudo
	 * Val.Pre3Span2: mv
	 * Val.Pre3Span3: /usr/bin/mvn
	 * Val.Pre3Span4: /usr/bin/mvn3.0.5
	 * 
	 * Val.Ol3Li1:sudo
	 * Val.Ol3Li2.frFR:mv : Déplacer ou renommer des fichiers. 
	 * Val.Ol3Li2.enUS:mv: Move or rename files. 
	 * Val.Ol3Li3.frFR:/usr/bin/mvn : L'ancienne commande mvn à sauvegarder. 
	 * Val.Ol3Li3.enUS:/usr/bin/mvn: The old mvn command to backup. 
	 * Val.Ol3Li4.frFR:/usr/bin/mvn3.0.5 : Le chemin au fichier de sauvegarde. 
	 * Val.Ol3Li4.enUS:/usr/bin/mvn3.0.5: The path to the backup file. 
	 * 
	 * Val.Pre4Span1:sudo
	 * Val.Pre4Span2: ln
	 * Val.Pre4Span3: -s
	 * Val.Pre4Span4: /opt/maven/bin/mvn
	 * Val.Pre4Span5: /usr/local/bin/mvn
	 * 
	 * Val.Ol4Li1:sudo
	 * Val.Ol4Li2.frFR:ln : Crée des liens entre des fichiers. 
	 * Val.Ol4Li2.enUS:ln: Makes links between files. 
	 * Val.Ol4Li3.frFR:-s : Faites des liens symboliques au lieu de liens durs. 
	 * Val.Ol4Li3.enUS:-s: Make symbolic links instead of hard links. 
	 * Val.Ol4Li4.frFR:/opt/maven/bin/mvn : Le chemin au nouveau fichier mvn. 
	 * Val.Ol4Li4.enUS:/opt/maven/bin/mvn: The path to the new mvn file. 
	 * Val.Ol4Li5.frFR:/usr/local/bin/mvn : Le chemin au lien symbolique dans le $PATH. 
	 * Val.Ol4Li5.enUS:/usr/local/bin/mvn: The path to the symbolic link in the $PATH. 
	 * Val.P4.frFR:Maintenant, essayez le nouveau fichier binaire et vérifiez qu'il est correctement mis à niveau ! 
	 * Val.P4.enUS:Now try out the new binary and see that it's properly upgraded! 
	 * 
	 * Val.Pre5Span1:which
	 * Val.Pre5Span2: mvn
	 * 
	 * Val.Pre6Span1:mvn
	 * Val.Pre6Span2: -v
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
	 * Val.TableTr1Td1.frFR:Mercredi 
	 * Val.TableTr1Td1.enUS:Wednesday 
	 * Val.TableTr1Td2I:far fa-fast-forward
	 * Val.TableTr1Td3I:far fa-file-code
	 * Val.TableTr1Td4I:far fa-pen-nib
	 * Val.TableTr2Td1.frFR:8 Mai 2019
	 * Val.TableTr2Td1.enUS:May 8 2019
	 * Val.TableTr2Td2.frFR:Comment installer la dernière version de maven ? 
	 * Val.TableTr2Td2.enUS:How do I install the latest version of maven. 
	 * Val.TableTr2Td3.frFR:Installer maven à partir du code source. 
	 * Val.TableTr2Td3.enUS:Install maven from the source code. 
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
	 * Val.TableTr02Td2.frFR:Comment installer les dépendences pour Maven ? 
	 * Val.TableTr02Td2.enUS:How do I install the dependencies for Maven? 
	 * Val.TableTr02Td3Span1I:far fa-cookie
	 * Val.TableTr02Td4.frFR:Construisez les dépendances avec yum. 
	 * Val.TableTr02Td4.enUS:Build the dependencies with yum. 
	 * 
	 * Val.TableTr03Td1I:far fa-files-medical
	 * Val.TableTr03Td2.frFR:Où est-ce que je place le code source Maven ? 
	 * Val.TableTr03Td2.enUS:Where do I put the Maven source code? 
	 * Val.TableTr03Td3I:far fa-folder-tree
	 * Val.TableTr03Td4.frFR:Créez un répertoire maven dans /usr/local/src. 
	 * Val.TableTr03Td4.enUS:Create a maven directory in /usr/local/src. 
	 * 
	 * Val.TableTr04Td1I:far fa-map-pin
	 * Val.TableTr04Td2.frFR:Où puis-je installer Maven ? 
	 * Val.TableTr04Td2.enUS:Where do I install Maven? 
	 * Val.TableTr04Td3Span1I:far fa-folder-tree
	 * Val.TableTr04Td4.frFR:Créez un répertoire maven dans /opt. 
	 * Val.TableTr04Td4.enUS:Create a maven directory in /opt. 
	 * 
	 * Val.TableTr05Td1I:far fa-cloud-download
	 * Val.TableTr05Td2.frFR:Comment télécharger le code source de maven ? 
	 * Val.TableTr05Td2.enUS:How do I download the maven source code? 
	 * Val.TableTr05Td3I:fab fa-git
	 * Val.TableTr05Td4.frFR:Cloner le code source avec la commande git. 
	 * Val.TableTr05Td4.enUS:Clone the source code with the git command. 
	 * 
	 * Val.TableTr06Td1I:far fa-code-branch
	 * Val.TableTr06Td2.frFR:Comment choisir une version récente de Maven ? 
	 * Val.TableTr06Td2.enUS:How do I pick a recent version of Maven? 
	 * Val.TableTr06Td3I:far fa-tag
	 * Val.TableTr06Td4.frFR:Listez toutes les tags du référentiel git. 
	 * Val.TableTr06Td4.enUS:List all the tags in the git repository. 
	 * 
	 * Val.TableTr07Td1I:far fa-code-merge
	 * Val.TableTr07Td2.frFR:Comment changer de version du code source de maven ? 
	 * Val.TableTr07Td2.enUS:How do I switch versions of the maven source code? 
	 * Val.TableTr07Td3I:far fa-code-commit
	 * Val.TableTr07Td4.frFR:Checkout la tag git. 
	 * Val.TableTr07Td4.enUS:Checkout the git tag. 
	 * 
	 * Val.TableTr08Td1I:far fa-tools
	 * Val.TableTr08Td2.frFR:Comment contruire le code source de maven ? 
	 * Val.TableTr08Td2.enUS:How do I build the maven source code? 
	 * Val.TableTr08Td3I:far fa-terminal
	 * Val.TableTr08Td4.frFR:Construisez Maven avec la commande mvn. 
	 * Val.TableTr08Td4.enUS:Build Maven with the mvn command. 
	 * 
	 * Val.TableTr09Td1I:far fa-question
	 * Val.TableTr09Td2.frFR:Mais pourquoi installons-nous Maven pour installer la dernière version de Maven ? 
	 * Val.TableTr09Td2.enUS:But why are we installing Maven to install the latest Maven? 
	 * Val.TableTr09Td3I:far fa-flushed
	 * Val.TableTr09Td4.frFR:Un programme qui nécessite de se construire. 
	 * Val.TableTr09Td4.enUS:A program that requires itself to build itself. 
	 * 
	 * Val.TableTr10Td1I:far fa-mind-share
	 * Val.TableTr10Td2.frFR:Comment changer la commande mvn par défaut sur le système ? 
	 * Val.TableTr10Td2.enUS:How do I change the default mvn command on the system? 
	 * Val.TableTr10Td3I:far fa-link
	 * Val.TableTr10Td4.frFR:Sauvegardez l'original et faites un lien symbolique. 
	 * Val.TableTr10Td4.enUS:Backup the original and make a symbolic link. 
	 */ 
	protected void _recapituler3(PageHtml o) {      
	}
}
