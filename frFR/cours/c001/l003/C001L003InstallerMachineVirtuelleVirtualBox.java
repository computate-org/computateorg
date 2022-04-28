package org.computate.site.frFR.cours.c001.l003;  

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.Cmd;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.page.parti.QuestionReponse;

/**  
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box
 * ApiUriRechercheEnUSPage: /enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box
 * PageRechercheFrFRPage: C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage
 * PageRechercheEnUSPage: C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNom.frFR: le leçon
 * UnNom.enUS: a lesson
 * 
 * H1.frFR: Comment puis-je essayer CentOS 7 Linux sans remplacer mon système d'exploitation ? 
 * H1.enUS: How do I try CentOS 7 Linux without replacing my operating system? 
 * 
 * H2.frFR: Essayez CentOS 7 sur une machine virtuelle VirtualBox. 
 * H2.enUS: Try CentOS 7 on a VirtualBox virtual machine. 
 * 
 * Titre.frFR: Comment puis-je essayer CentOS 7 Linux sans remplacer mon système d'exploitation ? Essayez CentOS 7 sur une machine virtuelle VirtualBox. 
 * Titre.enUS: How do I try CentOS 7 Linux without replacing my operating system? Try CentOS 7 on a VirtualBox virtual machine. 
 * 
 * Description.frFR: Comment puis-je essayer CentOS 7 Linux sans remplacer mon système d'exploitation ? Essayez CentOS 7 sur une machine virtuelle VirtualBox. 
 * Description.enUS: How do I try CentOS 7 Linux without replacing my operating system? Try CentOS 7 on a VirtualBox virtual machine. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 1258
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 1253
*/     
public class C001L003InstallerMachineVirtuelleVirtualBox extends C001L003InstallerMachineVirtuelleVirtualBoxGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(3);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L003InstallerMachineVirtuelleVirtualBox.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBox_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBox_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBoxVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBox_H1);
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBox_H2);
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBoxVals);
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:I will help you create your own successful website, on your own computer, using open-source software. 
	 */    
	protected void _moi(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-eraser
	 * Val.H3Span.frFR:Est-t-il possible d'essayer Linux sans écraser mon système d'exploitation ? 
	 * Val.H3Span.enUS:Is it possible to try Linux without destroying my operating system? 
	 * Val.H4Span1I:fab fa-windows
	 * Val.H4Span2I:fab fa-apple
	 * Val.H4Span3I:fab fa-linux
	 * Val.H4Span.frFR:La virtualisation peut exécuter Linux sous tous les systèmes d'exploitation. 
	 * Val.H4Span.enUS:Virtualization can run Linux on any operating system. 
	 * Val.PDiv.frFR:Grâce à la virtualisation, c'est simple à essayer les systèmes d'exploitation sur votre propre ordinateur ! 
	 * Val.PDiv.frFR:La virtualisation vous permet de démarrer des machines virtuelles. 
	 * Val.PDiv.frFR:Les machines virtuelles sont des systèmes d'exploitation entiers s'exécutant sous votre propre système d'exploitation via un logiciel. 
	 * Val.PDiv.frFR:La virtualisation est gratuite, grâce à des nombreux logiciels fantastiques ! 
	 * Val.PDiv.frFR:Pour Linux, je recommande Libvirt pour plus de puissance, mais pour une solution multi-plateforme, nous allons utiliser VirtualBox dans cette leçon. 
	 * Val.PDiv.frFR:Je vais vous apprendre comment faire fonctionner une machine virtuelle CentOS 7 sur votre système. 
	 * Val.PDiv.enUS:Thanks to virtualization, trying out operating systems on your own computer is simple! 
	 * Val.PDiv.enUS:Virtualization allows you to run virtual machines. 
	 * Val.PDiv.enUS:Virtual machines are entire operating systems running under your own operating system through software. 
	 * Val.PDiv.enUS:Virtualization is free, thanks to many good software packages! 
	 * Val.PDiv.enUS:For Linux I recommend Libvirt for more power, but for a cross-platform solution, we will be using VirtualBox in this lesson. 
	 * Val.PDiv.enUS:I'll teach you how to get a CentOS 7 virtual machine running on your system. 
	 */ 
	protected void _ecraser(PageHtml o) {      
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-person-carry
	 * Val.H3Span.frFR:Comment installer VirtualBox pour la virtualisation ? 
	 * Val.H3Span.enUS:How do I install VirtualBox for virtualization? 
	 * Val.H4I:fas fa-cloud-download-alt
	 * Val.H4Span.frFR:Téléchargez-le simplement depuis virtualbox.org. 
	 * Val.H4Span.enUS:Simply download it from virtualbox.org. 
	 * Val.POlLi1Span.frFR:VirtualBox est facile à télécharger et à installer. 
	 * Val.POlLi1Span.enUS:VirtualBox is easy to download and install. 
	 * Val.POlLi2Span.frFR:Visitez cette URL : 
	 * Val.POlLi2Span.enUS:Visit this url: 
	 * Val.POlLi2A.frFR:https://www.virtualbox.org/wiki/Downloads
	 * Val.POlLi2A.enUS:https://www.virtualbox.org/wiki/Downloads
	 * Val.POlLi3Span.frFR:Vous pouvez le télécharger sur un hôte Windows, un hôte OS X, un hôte Linux ou Solaris. 
	 * Val.POlLi3Span.enUS:You can download it on a Windows host, an OS X host, a Linux or Solaris host. 
	 * Val.POlLi4Span.frFR:Parce que j'utilise CentOS 7, qui est similaire à RHEL, j'utiliserai les instructions RHEL tout en bas de la page. 
	 * Val.POlLi4Span.enUS:Because I am running CentOS 7, which is similar to RHEL, I will use the RHEL instructions at the very bottom of the page. 
	 */  
	protected void _commentInstaller(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-play-circle
	 * Val.H3Span.frFR:Comment puis-je préparer CentOS 7 pour installer VirtualBox ? 
	 * Val.H3Span.enUS:How can I prepare CentOS 7 to install VirtualBox? 
	 * Val.H4I:fas fa-download
	 * Val.H4Span.frFR:Installer le dépot yum virtualbox
	 * Val.H4Span.enUS:Install the virtualbox yum repo
	 * Val.PreSpan1:wget
	 * Val.PreSpan2: https://download.virtualbox.org/virtualbox/rpm/el/virtualbox.repo
	 * Val.PreSpan3: -O
	 * Val.PreSpan4: /tmp/virtualbox.repo
	 * Val.OlLi1.frFR:La commande pour télécharger des fichiers. 
	 * Val.OlLi1.enUS:The command to download files. 
	 * Val.OlLi2.frFR:L'URL vers le téléchargement dépôt yum VirtualBox. 
	 * Val.OlLi2.enUS:The URL to the VirtualBox yum repository download file. 
	 * Val.OlLi3.frFR:Pour spécifier le chemin de sortie pour le téléchargement. 
	 * Val.OlLi3.enUS:For specifying the output path for the downloaded file. 
	 * Val.OlLi4.frFR:Le chemin de sortie pour le téléchargement dépôt yum. 
	 * Val.OlLi4.enUS:The output path for the downloaded yum repository file. 
	 */ 
	protected void _telecharger(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-box-check
	 * Val.H3Span.frFR:Comment puis-je installer le dépôt yum virtualbox ? 
	 * Val.H3Span.enUS:How can I install the virtualbox yum repository? 
	 * Val.H4I:fas fa-person-dolly
	 * Val.H4Span.frFR:Mettre virtualbox.repo dans /etc/yum.repos.d/. 
	 * Val.H4Span.enUS:Put virtualbox.repo in /etc/yum.repos.d/. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: mv
	 * Val.PreSpan3: /tmp/virtualbox.repo
	 * Val.PreSpan4: /etc/yum.repos.d/
	 * Val.OlLi1.frFR:La commande pour installer des dépots yum commence par la commande sudo. 
	 * Val.OlLi1.frFR:La commande "sudo" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. 
	 * Val.OlLi1.frFR:L'installation des dépots yum nécessite toujours les privilèges root. 
	 * Val.OlLi1.enUS:The command to install yum repositories begins with the command sudo. 
	 * Val.OlLi1.enUS:The "sudo" command allows your current user to have root privileges for a few minutes after entering your password. 
	 * Val.OlLi1.enUS:Installing yum repositories always requires root privileges. 
	 * Val.OlLi2.frFR:Pour déplacer des fichiers vers de nouveaux emplacements dans le système de fichiers. 
	 * Val.OlLi2.enUS:For moving files to new locations in the filesystem. 
	 * Val.OlLi3.frFR:Le chemin vers le téléchargement dépôt yum. 
	 * Val.OlLi3.enUS:The path to the downloaded yum repository file. 
	 * Val.OlLi4.frFR:Le répertoire pour les dépôts yum configurés. 
	 * Val.OlLi4.enUS:The directory for configured yum repositories. 
	 */ 
	protected void _deplacerDepot(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-question
	 * Val.H3Span.frFR:Comment savoir comment le paquet VirtualBox est appelé ? 
	 * Val.H3Span.enUS:How do I know what the VirtualBox package is called? 
	 * Val.H4I:fas fa-search
	 * Val.H4Span.frFR:Rechercher « virtualbox » dans yum. 
	 * Val.H4Span.enUS:Search for \"virtualbox\" in yum. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: yum
	 * Val.PreSpan3: search
	 * Val.PreSpan4: virtualbox
	 * Val.OlLi1.frFR:sudo
	 * Val.OlLi1.enUS:sudo
	 * Val.OlLi2.frFR:Ce qui signifie "Yellowdog Updater Modified", mais personne ne le connait comme yellowdog, juste yum. 
	 * Val.OlLi2.frFR:CentOS gère les paquets de logiciel et les fichiers d'application RPM avec yum. 
	 * Val.OlLi2.enUS:Which stands for "Yellowdog Updater Modified", but nobody knows it as yellowdog, just yum. 
	 * Val.OlLi2.enUS:CentOS manages software packages and RPM application files with yum. 
	 * Val.OlLi3.frFR:Pour rechercher les paquets yum disponibles. 
	 * Val.OlLi3.enUS:For searching for available yum packages. 
	 * Val.OlLi4.frFR:Une phrase à rechercher dans les dépôts yum, comme « virtualbox ». 
	 * Val.OlLi4.enUS:A phrase to search for in the yum repositories, like "virtualbox". 
	 */ 
	protected void _yumSearch(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-box
	 * Val.H3Span.frFR:Comment puis-je maintenant installer l'application VirtualBox ? 
	 * Val.H3Span.enUS:How do I now install the VirtualBox application? 
	 * Val.H4I:fas fa-box-full
	 * Val.H4Span.frFR:Installer le paquet avec yum. 
	 * Val.H4Span.enUS:Install the package with yum. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: yum
	 * Val.PreSpan3: install
	 * Val.PreSpan4: -y
	 * Val.PreSpan5: VirtualBox-5.2
	 * Val.OlLi1.frFR:sudo
	 * Val.OlLi1.enUS:sudo
	 * Val.OlLi2.frFR:yum
	 * Val.OlLi2.enUS:yum
	 * Val.OlLi3.frFR:Pour installer des nouveaux paquets yum. 
	 * Val.OlLi3.enUS:For installing new yum packages. 
	 * Val.OlLi4.frFR:Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. 
	 * Val.OlLi4.enUS:Suppress messages asking to confirm if you want to install the software. 
	 * Val.OlLi5.frFR:Le nom du paquet de VirtualBox que vous souhaitez installer. 
	 * Val.OlLi5.frFR:Vous pouvez utiliser le nom du paquet avant le « .x86_64 » de la recherche yum que vous avez effectuée précédemment. 
	 * Val.OlLi5.frFR:Pour moi c'est « VirtualBox-5.2 ». 
	 * Val.OlLi5.enUS:The package name of VirtualBox you wish to install. 
	 * Val.OlLi5.enUS:You can use the package name before the ".x86_64" from the yum search you did earlier. 
	 * Val.OlLi5.enUS:For me it is "VirtualBox-5.2". 
	 */ 
	protected void _yumInstallPaquets(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-clipboard-list
	 * Val.H3Span.frFR:Comment mettre un système d'exploitation sur une machine virtuelle VirtualBox ? 
	 * Val.H3Span.enUS:How do I put an operating system on a VirtualBox virtual machine? 
	 * Val.H4I:fas fa-arrow-alt-to-bottom
	 * Val.H4Span.frFR:Télécharger un fichier ISO. 
	 * Val.H4Span.enUS:Download an ISO file. 
	 * Val.PreSpan1:wget
	 * Val.PreSpan2: http://mirrors.xmission.com/centos/7.6.1810/isos/x86_64/CentOS-7-x86_64-DVD-1810.iso
	 * Val.PreSpan3: -O
	 * Val.PreSpan4: ~/Downloads/CentOS-7-x86_64-DVD-1810.iso
	 * Val.OlLi1:wget
	 * Val.OlLi2.frFR:L'URL vers le téléchargement ISO de CentOS 7. 
	 * Val.OlLi2.enUS:The URL to the CentOS 7 ISO file to download. 
	 * Val.OlLi3:-O
	 * Val.OlLi4.frFR:Le chemin de sortie pour le téléchargement ISO CentOS 7. 
	 * Val.OlLi4.enUS:The output path for the downloaded CentOS 7 ISO file. 
	 * Val.PSpan1.frFR:Vous pouvez télécharger le fichier ISO CentOS 7 le plus récent pour installer sur une nouvelle machine virtuelle ici 
	 * Val.PSpan1.enUS:You can download the latest CentOS 7 ISO file to install on a new virtual machine here 
	 * Val.PSpan2A:https://www.centos.org/download/
	 * Val.PSpan3.frFR:. Cliquez sur le bouton [ DVD ISO ]. 
	 * Val.PSpan3.frFR:Vous pouvez choisir parmi  l'un des miroirs, vous pourriez en trouver un près de chez vous. 
	 * Val.PSpan3.frFR:Vous pouvez également télécharger le fichier en utilisant la commande wget dans le terminal comme ça. 
	 * Val.PSpan3.enUS:. Click on the [ DVD ISO ] button. 
	 * Val.PSpan3.enUS:You can choose from any of the mirrors, you might find one close to you. 
	 * Val.PSpan3.enUS:You can also download the file using the wget command in the terminal like that. 
	 */ 
	protected void _telechargerIso(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-clipboard-check
	 * Val.H3Span.frFR:Comment savoir que mon téléchargement ISO est correct ? 
	 * Val.H3Span.enUS:How do I know that my ISO download is complete? 
	 * Val.H4I:fas fa-box-check
	 * Val.H4Span.frFR:Vérifier le sha256sum. 
	 * Val.H4Span.enUS:Check the sha256sum. 
	 * Val.PreSpan1:sha256sum
	 * Val.PreSpan2: ~/Downloads/CentOS-7-x86_64-DVD-1810.iso
	 * Val.OlLi1.frFR:L'URL vers le téléchargement ISO de CentOS 7. 
	 * Val.OlLi1.enUS:Compute and check the SHA256 message digest for a file. 
	 * Val.OlLi2.frFR:Le chemin vers le téléchargement ISO CentOS 7. 
	 * Val.OlLi2.enUS:The path to the downloaded CentOS 7 ISO file. 
	 * Val.PSpan1.frFR:Vous pouvez voir la sha256sum du téléchargement dans les documents de publication pour votre version de CentOS 7, voir 
	 * Val.PSpan1.enUS:You can see the documented sha256sum of the download in the release notes for your version of CentOS 7, see 
	 * Val.PSpan2A:https://wiki.centos.org/Manuals/ReleaseNotes
	 * Val.PSpan3.frFR:. Si la vôtre est la dernière version, cliquez sur « Release notes for CentOS 7 ». 
	 * Val.PSpan3.frFR:Sinon, trouvez votre version dans les liens dans les documents de publication. 
	 * Val.PSpan3.frFR:Où il est indiqué « Verifying Downloaded Installation Images », vous verrez également les sha256sums pour toutes les versions. 
	 * Val.PSpan3.frFR:Notez le sha256sum pour CentOS-7-x86_64-DVD-1708.iso, puis exécutez la commande et comparez. 
	 * Val.PSpan3.enUS:. If yours is the latest version, then click on "Release Notes for CentOS 7". 
	 * Val.PSpan3.enUS:Otherwise, find your version in the links in the release notes. 
	 * Val.PSpan3.enUS:Where it says "Verifying Downloaded Installation Images", you will also see the sha256sums for all versions. 
	 * Val.PSpan3.enUS:Notice the sha256sum for CentOS-7-x86_64-DVD-1708.iso, and then perform the command and compare. 
	 */ 
	protected void _verifierIso(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-plus-square
	 * Val.H3Span.frFR:Comment créer une machine virtuelle CentOS 7 dans VirtualBox ? 
	 * Val.H3Span.enUS:How do I create a CentOS 7 virtual machine in VirtualBox? 
	 * Val.H4I:fas fa-window
	 * Val.H4Span.frFR:Ouvrir VirtualBox et cliquer [ New ]. 
	 * Val.H4Span.enUS:Open up VirtualBox and click [ New ]. 
	 * Val.OlLi01.frFR:Ouvrir VirtualBox dans vos applications installées. 
	 * Val.OlLi01.enUS:Open VirtualBox in your installed applications. 
	 * Val.OlLi02.frFR:Cliquer [ New ]. 
	 * Val.OlLi02.enUS:Click [ New ]. 
	 * Val.OlLi03.frFR:Donnez un nom à votre machine virtuelle, comme « mv1 ». 
	 * Val.OlLi03.enUS:Give your virtual machine a name, like "vm1". 
	 * Val.OlLi04.frFR:Type: Linux
	 * Val.OlLi04.enUS:Type: Linux
	 * Val.OlLi05.frFR:Version: Other Linux (64-bit)
	 * Val.OlLi05.enUS:Version: Other Linux (64-bit)
	 * Val.OlLi06.frFR:Cliquez [ Next > ]. 
	 * Val.OlLi06.enUS:Click [ Next > ]. 
	 * Val.OlLi07.frFR:Vous pouvez maintenant donner à votre machine virtuelle autant de RAM que vous le souhaitez. 
	 * Val.OlLi07.frFR:Cela peut être changé plus tard. 
	 * Val.OlLi07.frFR:Je recommande au moins 4096 MiB. 
	 * Val.OlLi07.enUS:Now you can give your virtual machine as much RAM as you want. 
	 * Val.OlLi07.enUS:This can be changed later. 
	 * Val.OlLi07.enUS:I would recommend at least 4096 MiB. 
	 * Val.OlLi08.frFR:Cliquez [ Next > ]. 
	 * Val.OlLi08.enUS:Click [ Next > ]. 
	 * Val.OlLi09.frFR:Vous allez maintenant créer un fichier disque pour votre machine virtuelle. 
	 * Val.OlLi09.frFR:Vous pouvez sélectionner l'option par défaut « Créer un disque dur virtuel maintenant ». 
	 * Val.OlLi09.enUS:Now you will create a disk file for your virtual machine. 
	 * Val.OlLi09.enUS:You can select the default option "Create a virtual hard disk now". 
	 * Val.OlLi10.frFR:Cliquez [ Create ]. 
	 * Val.OlLi10.enUS:Click [ Create ]. 
	 * Val.OlLi11.frFR:Maintenant, vous pouvez choisir parmi quelques types de disques différents. 
	 * Val.OlLi11.frFR:Je recommanderais « VMDK (Virtual Machine Disk) » qui est plus portable à d'autres logiciels d'hyperviseur comme libvirt. 
	 * Val.OlLi11.enUS:Now you can choose from a few different disk types. 
	 * Val.OlLi11.enUS:I would recommend "VMDK (Virtual Machine Disk)" which is more portable to other hypervisor software like libvirt. 
	 * Val.OlLi12.frFR:Ici, je recommanderais un disque « Dynamically allocated », qui commencera comme un petit fichier et se développera lorsqu'il est utilisé. 
	 * Val.OlLi12.enUS:Here I would recommend a "Dynamically allocated" disk, that will will start out as a small file and will grow as it is used. 
	 * Val.OlLi13.frFR:Ici, vous pouvez garder le nom du disque comme nom d'hôte que vous avez donné à la machine virtuelle. 
	 * Val.OlLi13.frFR:Vous pouvez également choisir la taille du disque de la machine virtuelle. 
	 * Val.OlLi13.frFR:Je recommande au moins 50 Go, car le fichier disque ne prend pas beaucoup d'espace, à moins qu'il ne devienne si grand s'il est alloué dynamiquement. 
	 * Val.OlLi13.enUS:Here you can leave the name of the disk as the hostname you gave to the virtual machine. 
	 * Val.OlLi13.enUS:You can also choose the size of the virtual machine disk. 
	 * Val.OlLi13.enUS:I would recommend at least 108 GB, since the disk file does not take up that much space, unless it grows to be that big if it is dynamically allocated. 
	 * Val.OlLi14.frFR:Cliquez [ Create ]. 
	 * Val.OlLi14.enUS:Click [ Create ]. 
	 * Val.OlLi15.frFR:Voilà, votre machine virtuelle est créée ! 
	 * Val.OlLi15.frFR:L'étape suivante consiste à lui attribuer un ISO comme disque optique. 
	 * Val.OlLi15.frFR:Cliquez-droit sur la machine virtuelle dans VirtualBox.
	 * Val.OlLi15.enUS:Now your virtual machine is created! 
	 * Val.OlLi15.enUS:The next step is to assign an ISO to it as an optical disk drive. 
	 * Val.OlLi15.enUS:Right-click on the virtual machine in VirtualBox. 
	 * Val.OlLi16.frFR:Cliquer « Settings... ». 
	 * Val.OlLi16.enUS:Click "Settings..." 
	 * Val.OlLi17.frFR:Cliquer [ Storage ]. 
	 * Val.OlLi17.enUS:Click [ Storage ]. 
	 * Val.OlLi18.frFR:Cliquez sur le lecteur optique nommé « Empty ». 
	 * Val.OlLi18.enUS:Click the optical drive named "Empty". 
	 * Val.OlLi19.frFR:Dans les attributs du lecteur optique, cliquez sur le bouton du disque avec la flèche déroulante.
	 * Val.OlLi19.enUS:In the optical drive attributes, click the disk button with the dropdown arrow. 
	 * Val.OlLi20.frFR:Cliquez « Choose Virtual Optical Disk File... ». 
	 * Val.OlLi20.enUS:Click "Choose Virtual Optical Disk File...". 
	 * Val.OlLi21.frFR:Recherchez le fichier ISO CentOS 7 dans vos téléchargements : ~/Downloads/CentOS-7-x86_64-DVD-1810.iso
	 * Val.OlLi21.enUS:Browse to the CentOS 7 ISO file in your downloads: ~/Downloads/CentOS-7-x86_64-DVD-1810.iso
	 * Val.OlLi22.frFR:Cliquez [ OK ]. 
	 * Val.OlLi22.enUS:Click [ OK ]. 
	 * Val.OlLi23.frFR:Et cliquez [ Start ]. 
	 * Val.OlLi23.enUS:Now click [ Start ]. 
	 */ 
	protected void _creerMachineVirtuelle(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-exclamation-circle
	 * Val.H3Span.frFR:Que faire si j'ai une erreur? Kernel driver not installed (rc=-1908)
	 * Val.H3Span.enUS:What if I get an error? Kernel driver not installed (rc=-1908)
	 * Val.H4I:fas fa-clipboard-list
	 * Val.H4Span.frFR:Installez les prérequis du kernel Linux. 
	 * Val.H4Span.enUS:Install the right linux kernel prerequisites. 
	 * Val.PSpan1.frFR:Si vous utilisez CentOS 7, une erreur peut survenir lors du démarrage de votre machine virtuelle : 
	 * Val.PSpan1.enUS:If you are running CentOS 7, you may get an error when starting your virtual machine: 
	 * Val.DivP1:VirtualBox - Error In suplibOsInit
	 * Val.DivP2:Kernel driver not installed (rc=-1908) 
	 * Val.DivP3:The VirtualBox Linux kernel driver (vboxdrv) is either not loaded or there is a permission problem with /dev/vboxdrv. Please reinstall the kernel module by executing
	 * Val.DivP4:'/sbin/vboxconfig'
	 * Val.DivP5:as root.
	 * Val.DivP6:where: suplib0slnit what: 3 VERR_VM_DRIVER_NOT_INSTALLED (-1908) - The support driver is not installed. On linux, open returned EN0ENT.
	 */ 
	protected void _erreurKernel(PageHtml o) {
	}
	@Override public void htmlBodyErreurKernel(PageHtml o) {
		{ e("h3").a("class", " erreurKernelH3 ").f();
			{ e("i").a("class", erreurKernelH3I1, " site-menu-icon erreurKernelH3I ").f();
			} g("i");
			{ e("span").a("class", " erreurKernelH3Span ").f();
				sx(erreurKernelH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " erreurKernelH4 ").f();
			{ e("i").a("class", erreurKernelH4I1, " site-menu-icon erreurKernelH4I ").f();
			} g("i");
			{ e("span").a("class", " erreurKernelH4Span ").f();
				sx(erreurKernelH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " erreurKernelP ").f();
			{ e("span").a("class", " erreurKernelPSpan1 erreurKernelPSpan odd ").f();
				sx(erreurKernelPSpan11);
			} g("span");
		} g("p");
		{ e("div").a("class", " erreurKernelDiv ").a("style", "background-color: #efebe7; padding: 10px; margin: 5px; border: 1px #efebe7; solid; color: black; font-family: arial; font-size: 12px; ").f();
			{ e("p").a("class", " erreurKernelDivP1 erreurKernelDivP odd ").a("style", "font-weight: bold; ").f();
				sx(erreurKernelDivP11);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP2 erreurKernelDivP even ").a("style", "font-weight: bold; ").f();
				sx(erreurKernelDivP21);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP3 erreurKernelDivP odd ").f();
				sx(erreurKernelDivP31);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP4 erreurKernelDivP even ").a("style", "color: #0000ff; ").f();
				sx(erreurKernelDivP41);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP5 erreurKernelDivP odd ").f();
				sx(erreurKernelDivP51);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP6 erreurKernelDivP even ").f();
				sx(erreurKernelDivP61);
			} g("p");
		} g("div");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: /sbin/vboxconfig
	 * Val.OlLi1:sudo
	 * Val.OlLi2.frFR:Linux post-installateur pour la construction de modules kernel VirtualBox. 
	 * Val.OlLi2.frFR:Cela échouera si les prérequis du kernel n'ont pas été installés. 
	 * Val.OlLi2.enUS:Linux post-installer for building VirtualBox kernel modules. 
	 * Val.OlLi2.enUS:This will fail if the kernel-devel prerequisites have not been installed. 
	 * 
	 * Val.P1.frFR:Une autre erreur se produira lors de l'exécution de cette commande ici. 
	 * Val.P1.enUS:Another error will occur when running this command here. 
	 * Val.PreDiv01:vboxdrv.sh: Stopping VirtualBox services.
	 * Val.PreDiv02:vboxdrv.sh: Building VirtualBox kernel modules.
	 * Val.PreDiv03:This system is currently not set up to build kernel modules.
	 * Val.PreDiv04:Please install the Linux kernel "header" files matching the current kernel
	 * Val.PreDiv05:for adding new hardware support to the system.
	 * Val.PreDiv06:The distribution packages containing the headers are probably:
	 * Val.PreDiv07:    kernel-devel kernel-devel-3.10.0-693.el7.x86_64
	 * Val.PreDiv08:This system is currently not set up to build kernel modules.
	 * Val.PreDiv09:Please install the Linux kernel "header" files matching the current kernel
	 * Val.PreDiv10:for adding new hardware support to the system.
	 * Val.PreDiv11:The distribution packages containing the headers are probably:
	 * Val.PreDiv12:    kernel-devel kernel-devel-3.10.0-693.el7.x86_64
	 * Val.P2.frFR:Alors, vous voudrez lire attentivement le message d'erreur que vous recevez pour les paquets spécifiques que vous devez installer pour résoudre le problème ci-dessous. 
	 * Val.P2.enUS:So you will want to read carefully in the error message you receive for the specific packages you need to install to fix the problem as below. 
	 */ 
	protected void _cmdSbinVboxconfig1(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: yum
	 * Val.PreSpan3: install
	 * Val.PreSpan4: -y
	 * Val.PreSpan5: kernel-devel
	 * Val.PreSpan5: kernel-devel-3.10.0-693.el7.x86_64
	 * Val.OlLi1:sudo
	 * Val.OlLi2:yum
	 * Val.OlLi3:install
	 * Val.OlLi4:-y
	 * Val.OlLi5.frFR:Package de développement pour construire des modules du kernel pour faire correspondre le kernel. 
	 * Val.OlLi5.enUS:The development package for building kernel modules to match the kernel. 
	 * Val.OlLi6.frFR:Sachez que cette version peut être différente pour votre système. 
	 * Val.OlLi6.frFR:Vous voudrez installer la version que cette commande a recommandé plus tôt: sudo /sbin/vboxconfig
	 * Val.OlLi6.enUS:Be aware that this version may be different for your system. 
	 * Val.OlLi6.enUS:You will want to install the version that this command recommended earlier: sudo /sbin/vboxconfig
	 */ 
	protected void _cmdErreurKernel(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: /sbin/vboxconfig
	 * Val.OlLi1:sudo
	 * Val.OlLi2.frFR:Exécutez à nouveau avec les prérequis kernel-devel installés. 
	 * Val.OlLi2.enUS:Run this again with the kernel-devel prerequisites installed. 
	 * 
	 * Val.P1.frFR:Ici, lorsque vous exécutez à nouveau cette commande, vous ne devriez plus avoir un message d'erreur. 
	 * Val.P1.enUS:Here, when you run this command again, you should no longer have an error message. 
	 * Val.P2.frFR:Maintenant, retournez à VirtualBox et cliquez [ Start ]. 
	 * Val.P2.enUS:Now, return to VirtualBox and click [ Start ]. 
	 */ 
	protected void _cmdSbinVboxconfig2(PageHtml o) {
	}

	/**
	 * Val.H3.frFR:À récapituler : 
	 * Val.H3.enUS:To review: 
	 */
	protected void _recapituler1(PageHtml o) {      
	}

	/**
	 * Val.TableTr1Td1.frFR:Mardi 
	 * Val.TableTr1Td1.enUS:Tuesday 
	 * Val.TableTr1Td2I:fab fa-linux
	 * Val.TableTr1Td3I:fas fa-network-wired
	 * Val.TableTr1Td4I:fas fa-pen-nib
	 * Val.TableTr2Td1.frFR:23 Avril 2019
	 * Val.TableTr2Td1.enUS:April 23 2019
	 * Val.TableTr2Td2.frFR:Comment essayer CentOS 7
	 * Val.TableTr2Td2.enUS:How to try CentOS 7
	 * Val.TableTr2Td3.frFR:Sur une machine virtuelle
	 * Val.TableTr2Td3.enUS:On a virtual machine
	 * Val.TableTr2Td4.frFR:Par Christophe Tate
	 * Val.TableTr2Td4.enUS:By Christopher Tate
	 */  
	protected void _recapituler2(PageHtml o) {      
	}

	/**
	 * 
	 * Val.TableTr01Td1I:fas fa-question
	 * Val.TableTr01Td2.frFR:Questions
	 * Val.TableTr01Td2.enUS:Questions
	 * Val.TableTr01Td3I:fas fa-bullhorn
	 * Val.TableTr01Td4.frFR:Reponses
	 * Val.TableTr01Td4.enUS:Answers
	 * 
	 * Val.TableTr02Td1I:fas fa-eraser
	 * Val.TableTr02Td2.frFR:Linux va-t-il détruire mon système d'exploitation ? 
	 * Val.TableTr02Td2.enUS:Will Linux destroy my operating system? 
	 * Val.TableTr02Td3Span1I:fab fa-microsoft
	 * Val.TableTr02Td3Span2I:fab fa-apple
	 * Val.TableTr02Td3Span3I:fab fa-linux
	 * Val.TableTr02Td4.frFR:La virtualisation peut exécuter Linux sous tous les systèmes d'exploitation. 
	 * Val.TableTr02Td4.enUS:Virtualization can run Linux on any operating system. 
	 * 
	 * Val.TableTr03Td1I:fas fa-person-carry
	 * Val.TableTr03Td2.frFR:Comment installer VirtualBox ? 
	 * Val.TableTr03Td2.enUS:How do I install VirtualBox? 
	 * Val.TableTr03Td3I:fas fa-cloud-download-alt
	 * Val.TableTr03Td4.frFR:Téléchargez-le depuis virtualbox.org
	 * Val.TableTr03Td4.enUS:Download it from virtualbox.org
	 * 
	 * Val.TableTr04Td1I:fas fa-play-circle
	 * Val.TableTr04Td2.frFR:Préparer CentOS 7 pour installer VirtualBox
	 * Val.TableTr04Td2.enUS:Prepare CentOS 7 to install VirtualBox
	 * Val.TableTr04Td3I:fas fa-download
	 * Val.TableTr04Td4.frFR:Installer le dépot yum virtualbox
	 * Val.TableTr04Td4.enUS:Install the virtualbox yum repo
	 * 
	 * Val.TableTr05Td1I:fas fa-box-check
	 * Val.TableTr05Td2.frFR:Installer le dépôt yum virtualbox
	 * Val.TableTr05Td2.enUS:Install the virtualbox yum repository
	 * Val.TableTr05Td3I:fas fa-person-dolly
	 * Val.TableTr05Td4.frFR:Mettre virtualbox.repo dans /etc/yum.repos.d/
	 * Val.TableTr05Td4.enUS:Put virtualbox.repo in /etc/yum.repos.d/
	 * 
	 * Val.TableTr06Td1I:fas fa-question
	 * Val.TableTr06Td2.frFR:Quel est le nom du paquet VirtualBox ? 
	 * Val.TableTr06Td2.enUS:What is the VirtualBox package called? 
	 * Val.TableTr06Td3I:fas fa-search
	 * Val.TableTr06Td4.frFR:Rechercher « virtualbox » dans yum
	 * Val.TableTr06Td4.enUS:Search for "virtualbox" in yum
	 * 
	 * Val.TableTr07Td1I:fas fa-box
	 * Val.TableTr07Td2.frFR:Installer VirtualBox
	 * Val.TableTr07Td2.enUS:Installing VirtualBox
	 * Val.TableTr07Td3I:fas fa-box-full
	 * Val.TableTr07Td4.frFR:Installer le paquet avec yum
	 * Val.TableTr07Td4.enUS:Install the package with yum
	 * 
	 * Val.TableTr08Td1I:fas fa-clipboard-list
	 * Val.TableTr08Td2.frFR:Comment mettre un système d'exploitation sur une machine virtuelle
	 * Val.TableTr08Td2.enUS:How to put an operating system on a virtual machine
	 * Val.TableTr08Td3I:fas fa-arrow-alt-to-bottom
	 * Val.TableTr08Td4.frFR:Télécharger un fichier ISO
	 * Val.TableTr08Td4.enUS:Download an ISO file
	 * 
	 * Val.TableTr09Td1I:fas fa-clipboard-check
	 * Val.TableTr09Td2.frFR:Vérifier un téléchargement ISO
	 * Val.TableTr09Td2.enUS:Verify ISO download
	 * Val.TableTr09Td3I:fas fa-box-check
	 * Val.TableTr09Td4.frFR:Vérifier le sha256sum
	 * Val.TableTr09Td4.enUS:Check the sha256sum
	 * 
	 * Val.TableTr10Td1I:fas fa-plus-square
	 * Val.TableTr10Td2.frFR:Comment créer la machine virtuelle ?
	 * Val.TableTr10Td2.enUS:How do I create the virtual machine?
	 * Val.TableTr10Td3I:fas fa-window
	 * Val.TableTr10Td4.frFR:Ouvrir VirtualBox et cliquer New
	 * Val.TableTr10Td4.enUS:Open up VirtualBox and click New
	 * 
	 * Val.TableTr11Td1I:fas fa-exclamation-circle
	 * Val.TableTr11Td2.frFR:Erreur Kernel driver not installed
	 * Val.TableTr11Td2.enUS:Kernel driver not installed error
	 * Val.TableTr11Td3I:fas fa-clipboard-list
	 * Val.TableTr11Td4.frFR:Installez les prérequis du kernel
	 * Val.TableTr11Td4.enUS:Install kernel prerequisites
	 */   
	protected void _recapituler3(PageHtml o) {      
	}
}
