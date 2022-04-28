package org.computate.site.frFR.cours.c001.l004; 


import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;

/** 
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/004-comment-installer-centos7
 * ApiUriRechercheEnUSPage: /enUS/course/001/004-how-to-install-centos7
 * PageRechercheFrFRPage: C001L004InstallerCentos7FrFRPage
 * PageRechercheEnUSPage: C001L004InstallerCentos7EnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNom.frFR: le leçon
 * UnNom.enUS: a lesson
 * 
 * H1.frFR: Comment installer le système d'exploitation pour développer mon site Web ? 
 * H1.enUS: How do I install the operating system to start developing my website? 
 * 
 * H2.frFR: Chaque étape pour installer le système d'exploitation CentOS 7. 
 * H2.enUS: Every step to install the CentOS 7 operating system. 
 * 
 * Titre.frFR: Comment installer le système d'exploitation pour développer mon site Web ? Chaque étape pour installer le système d'exploitation CentOS 7. 
 * Titre.enUS: How do I install the operating system to start developing my website? Every step to install the CentOS 7 operating system. 
 * 
 * Description.frFR: Comment installer le système d'exploitation pour développer mon site Web ? Chaque étape pour installer le système d'exploitation CentOS 7. 
 * Description.enUS: How do I install the operating system to start developing my website? Every step to install the CentOS 7 operating system. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 1749
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 1479
*/    
public class C001L004InstallerCentos7 extends C001L004InstallerCentos7Gen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(4);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L004InstallerCentos7.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L004InstallerCentos7EnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7FrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L004InstallerCentos7EnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7FrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7Vals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L004InstallerCentos7_H1);
		addPageRecherche_frFR(C001L004InstallerCentos7_H2);
		addPageRecherche_frFR(C001L004InstallerCentos7Vals);
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
	 * Val.H3I:far fa-person-carry
	 * Val.H3Span.frFR:Comment télecharger CentOS 7 ? 
	 * Val.H3Span.enUS:How do I download CentOS 7?
	 * Val.H4I:far fa-cloud-download-alt
	 * Val.H4Span.frFR:Télécharger un fichier ISO. 
	 * Val.H4Span.enUS:Download an ISO file. 
	 * Val.PreSpan1:wget
	 * Val.PreSpan2: http://mirrors.xmission.com/centos/7.6.1810/isos/x86_64/CentOS-7-x86_64-DVD-1810.iso
	 * Val.PreSpan3: -O
	 * Val.PreSpan4: ~/Downloads/CentOS-7-x86_64-DVD-1810.iso
	 * 
	 * Val.OlLi1.frFR:wget : La commande pour télécharger des fichiers. 
	 * Val.OlLi1.enUS:wget: The command to download files. 
	 * Val.OlLi2.frFR:L'URL vers le téléchargement ISO de CentOS 7. 
	 * Val.OlLi2.enUS:The URL to the CentOS 7 ISO file to download. 
	 * Val.OlLi3.frFR:-O : Pour spécifier le chemin de sortie pour le téléchargement. 
	 * Val.OlLi3.enUS:-O: For specifying the output path for the downloaded file. 
	 * Val.OlLi4.frFR:Le chemin de sortie pour le téléchargement ISO CentOS 7. 
	 * Val.OlLi4.enUS:The output path for the downloaded CentOS 7 ISO file. 
	 * Val.PSpan1.frFR:Vous pouvez télécharger le fichier ISO CentOS 7 le plus récent pour installer sur votre ordinateur ici 
	 * Val.PSpan1.enUS:You can download the latest CentOS 7 ISO file to install on your computer here 
	 * Val.PSpan2A:https://www.centos.org/download/
	 * Val.PSpan3.frFR:. Cliquez sur le bouton [ DVD ISO ]. 
	 * Val.PSpan3.frFR:Vous pouvez choisir parmi  l'un des miroirs, vous pourriez en trouver un près de chez vous. 
	 * Val.PSpan3.frFR:Vous pouvez également télécharger le fichier en utilisant la commande wget dans le terminal comme ça. 
	 * Val.PSpan3.enUS:. Click on the [ DVD ISO ] button. 
	 * Val.PSpan3.enUS:You can choose from any of the mirrors, you might find one close to you. 
	 * Val.PSpan3.enUS:You can also download the file using the wget command in the terminal like that. 
	 */  
	protected void _questionTelechargerCentos7(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fab fa-usb
	 * Val.H3Span.frFR:Comment puis-je créer une clé USB avec CentOS 7 ? 
	 * Val.H3Span.enUS:How can I create a USB key with CentOS 7? 
	 * Val.H4I:far fa-compact-disc
	 * Val.H4Span.frFR:Utilizez la commande dd. 
	 * Val.H4Span.enUS:Use the dd command. 
	 * Val.Ol1Li1.frFR:Des que vous avez téléchargé votre image ISO, placez votre clé USB dans un port USB de votre ordinateur. 
	 * Val.Ol1Li1.enUS:Once you have downloaded your ISO image, place your USB key into a USB port on your computer. 
	 * Val.Ol1Li2Span1.frFR:Si vous utilisez actuellement Windows, vous pouvez télécharger un programme « Win32 Disk Imager » pour charger l’image ISO sur une clé USB au bas de cette page 
	 * Val.Ol1Li2Span1.enUS:If you are currently using windows, you can download a program like Win32 Disk Imager to load the ISO image onto a USB key at the bottom of this page 
	 * Val.Ol1Li2A:https://wiki.centos.org/HowTos/InstallFromUSBkey
	 * Val.Ol1Li2Span2.frFR:. 
	 * Val.Ol1Li2Span2.enUS:. 
	 * Val.Ol1Li3.frFR:Si vous êtes déjà sous Linux, je vais vous apprendre à charger CentOS sur une clé USB depuis le terminal qui affiche une barre de progression.
	 * Val.Ol1Li3.frFR:Installez d’abord l’application « pv » requise pour surveiller la progression des données dans un tube. 
	 * Val.Ol1Li3.enUS:If you are on Linux already, I'll teach you a way to load CentOS onto a USB key from the terminal that shows a progress bar. 
	 * Val.Ol1Li3.enUS:First install the prerequisite "pv" application to monitor the progress of data through a pipe. 
	 * Val.Div2H5.frFR:Installer l'application « pv ». 
	 * Val.Div2H5.enUS:Install the "pv" application. 
	 * Val.Pre2Span1:sudo
	 * Val.Pre2Span2: yum
	 * Val.Pre2Span3: install
	 * Val.Pre2Span4: -y
	 * Val.Pre2Span4: pv
	 * Val.Ol2Li1.frFR:sudo: La commande pour installer des dépots yum commence par la commande sudo. 
	 * Val.Ol2Li1.frFR:La commande "sudo" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. 
	 * Val.Ol2Li1.frFR:L'installation des dépots yum nécessite toujours les privilèges root. 
	 * Val.Ol2Li1.enUS:sudo: The command to install yum repositories begins with the command sudo. 
	 * Val.Ol2Li1.enUS:The "sudo" command allows your current user to have root privileges for a few minutes after entering your password. 
	 * Val.Ol2Li2.frFR:yum : Signifie "Yellowdog Updater Modified", mais personne ne le connait comme yellowdog, juste yum. 
	 * Val.Ol2Li2.frFR:CentOS gère les paquets de logiciel et les fichiers d'application RPM avec yum. 
	 * Val.Ol2Li2.enUS:yum : Stands for "Yellowdog Updater Modified", but nobody knows it as yellowdog, just yum. 
	 * Val.Ol2Li2.enUS:CentOS manages software packages and RPM application files with yum. 
	 * Val.Ol2Li3.frFR:install : Pour installer des nouveaux paquets yum. 
	 * Val.Ol2Li3.enUS:install: For installing new yum packages. 
	 * Val.Ol2Li4.frFR:-y: Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. 
	 * Val.Ol2Li4.enUS:-y: Suppress messages asking to confirm if you want to install the software. 
	 * Val.Ol2Li5.frFR:pv: Le nom du paquet que vous souhaitez installer. 
	 * Val.Ol2Li5.enUS:pv: The package name you wish to install. 
	 * Val.Div3H5.frFR:Trouvez le chemin vers le périphérique de stockage USB. 
	 * Val.Div3H5.enUS:Find the path to the USB storage device. 
	 * Val.Div3P.frFR:Éxecuter la commande intégrée dans Linux pour afficher les disques sur l'ordinateur : 
	 * Val.Div3P.enUS:Run the built in command in linux to view the disks on the computer: 
	 * Val.Pre3:lsblk
	 * Val.Ol3Li1.frFR:lsblk : La commande pour montrer tous les périphériques de stockage en mode bloc sur l'ordinateur. 
	 * Val.Ol3Li1.enUS:lsblk: The command to list all block storage devices on the computer. 
	 * Val.P4.frFR:Vous voudrez examiner très attentivement la liste des disques. 
	 * Val.P4.frFR:Recherchez le nom du disque qui correspond à la taille et au point de montage de votre clé USB. 
	 * Val.P4.frFR:Voici à quoi ressemble mon périphérique USB sous /dev/sdb : 
	 * Val.P4.enUS:You will want to very carefully review the list of disks. 
	 * Val.P4.enUS:Find the disk name that matches the size and mount point of your USB key. 
	 * Val.P4.enUS:Here is what my USB device at /dev/sdb looks like: 
	 * Val.Pre5:NAME                                          MAJ:MIN RM   SIZE RO TYPE  MOUNTPOINT
	 * Val.Pre5Br:sdb                                             8:16   1   7.2G  0 disk
	 * Val.Pre5Br:├─sdb1                                          8:17   1   4.3G  0 part  /run/media/ctate/CentOS 7 x86_64
	 * Val.Pre5Br:└─sdb2                                          8:18   1   8.5M  0 part
	 * Val.Div6H5.frFR:Écrivez l'image ISO sur la clé USB et observez le progrès. 
	 * Val.Div6H5.enUS:Write the ISO image to the USB key and watch the progress. 
	 * Val.P6.frFR:Si la commande lsblk affiche sdb, sdb1, sdb2, etc., le chemin d'accès à votre périphérique USB serait /dev/sdb. 
	 * Val.P6.frFR:Avec ces infos, vous pouvez exécuter une commande pour écrire l'image ISO sur le périphérique USB et voir la progression. 
	 * Val.P6.enUS:If the lsblk command shows sdb, sdb1, sdb2, etc, the path to your USB device would be /dev/sdb. 
	 * Val.P6.enUS:With that information, you can run a command to write the ISO image to the USB device and see the progress. 
	 * Val.Pre6:pv ~/Downloads/CentOS-7-x86_64-DVD-1810.iso | sudo dd of=/dev/sdb
	 * Val.Ol6Li1.frFR:pv : Pour surveiller la progression des données dans un tube. 
	 * Val.Ol6Li1.enUS:pv: To monitor the progress of data through a pipe. 
	 * Val.Ol6Li2.frFR:Le chemin vers le fichier ISO. 
	 * Val.Ol6Li2.enUS:The path to the ISO file. 
	 * Val.Ol6Li3.frFR:| : Prend la sortie de la commande pv et l'utilise comme entrée de la commande dd. 
	 * Val.Ol6Li3.enUS:|: Takes the output from the pv command and uses it as the input to the dd command. 
	 * Val.Ol6Li4:sudo 
	 * Val.Ol6Li5.frFR:dd : Copie un fichier sur un périphérique. 
	 * Val.Ol6Li5.enUS:dd: Copies a file to a device. 
	 * Val.Ol6Li6.frFR:of=... : Le chemin vers le périphérique USB. 
	 * Val.Ol6Li6.enUS:of=... The path to the USB device. 
	 * Val.P7.frFR:Profitez de la barre de progression pendant que votre image ISO est lentement et soigneusement chargée sur votre clé USB. 
	 * Val.P7.enUS:Enjoy the progress bar as your ISO is slowly and carefully loaded onto your USB key. 
	 */ 
	protected void _questionCreerUneCleUsb(PageHtml o) {
	}

	/**
	 * Val.H3I:far fa-play-circle
	 * Val.H3Span.frFR:Lorsque je redémarre avec la clé USB, quel mode de démarrage choisir? 
	 * Val.H3Span.enUS:When I reboot with the USB key, which boot mode do I choose? 
	 * Val.H4Span1I:fab fa-windows
	 * Val.H4Span2I:fab fa-centos
	 * Val.H4Span3.frFR:Évitez de démarrer en mode de démarrage UEFI.
	 * Val.H4Span3.enUS:Avoid booting in UEFI boot mode. 
	 * Val.P1.frFR:Lorsque vous redémarrez votre ordinateur, vous voudrez appuyer sur la clé pour accéder au menu de démarrage. 
	 * Val.P1.frFR:Sinon, c'est possible que vous entriez dans un mode de démarrage sur l'USB qui poserait des problèmes après l'installation de votre système d'exploitation. 
	 * Val.P1.frFR:Pour moi, je vais ignorer les options UEFI, telles que "UEFI: TOSHIBA TransMemory 1.00" et choisir "TOSHIBA TransMemory 1.00". 
	 * Val.P1.frFR:Je ne suis pas un expert en UEFI, mais je sais que je regrettais de l'avoir installé une fois avec UEFI et que mon système était instable. 
	 * Val.P1.frFR:Une des raisons d'utiliser le mode UEFI est que si d'autres systèmes (Windows Vista / 7/8, GNU / Linux ...) de votre ordinateur sont installés en mode UEFI et que vous souhaitez effectuer un double démarrage, vous devez également installer en mode UEFI. 
	 * Val.P1.frFR:Je n'ai jamais effectué de double démarrage, car j'avais choisi il y a longtemps de garder Microsoft pour toujours hors de ma vie personnelle, comme ça, je n'utilise jamais le mode UEFI. 
	 * Val.P1.enUS:When you reboot your computer, you will want to press the right key to enter the boot menu. 
	 * Val.P1.enUS:If not, it's possible that you enter a boot mode on the USB that will cause problems after installing your operating system. 
	 * Val.P1.enUS:For me, I will ignore the UEFI options, like "UEFI: TOSHIBA TransMemory 1.00", and choose "TOSHIBA TransMemory 1.00". 
	 * Val.P1.enUS:I'm not an expert on UEFI, but I know I regretted installing it with UEFI once and it made my system unstable. 
	 * Val.P1.enUS:One reason to use UEFI mode is if other systems (Windows Vista/7/8, GNU/Linux...) of your computer are installed in UEFI mode, and you wish to dual boot, then you must install in UEFI mode too. 
	 * Val.P1.enUS:I never dual boot, since I chose a long time ago to keep Microsoft out of my personal life forever, so I never use UEFI mode. 
	 * Val.P2.frFR:Maintenant, laissez-le démarrer dans votre image USB, laissez-le vérifier le disque pour détecter des erreurs, et comme ça, vous êtes sur la bonne voie ! 
	 * Val.P2.enUS:Now let it boot into your USB image, let it check the disk for errors and you're on your way! 
	 */
	protected void _questionDemarrerSystemSurCleUsb(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-flag-alt
	 * Val.H3Span.frFR:Quelle langue j'utilise pendant le processus d'installation? 
	 * Val.H3Span.enUS:What language would I use during the install process? 
	 * Val.H4I:far fa-language
	 * Val.H4Span.frFR:Choisissez la langue avec laquelle vous êtes à l'aise. 
	 * Val.H4Span.enUS:Choose the language you are comfortable with. 
	 * Val.OlLi1.frFR:Sur le côté gauche, vous trouverez les choix de langue pour le système d'exploitation. 
	 * Val.OlLi1.frFR:Sélectionnez la langue que vous préférez (Français). 
	 * Val.OlLi1.enUS:On the left hand side, you will find the choices of language for the operating system. 
	 * Val.OlLi1.enUS:Select the language that you prefer (English). 
	 * Val.OlLi2.frFR:Sur le côté droit, vous trouverez les choix de locale (Français (France)). 
	 * Val.OlLi2.enUS:On the right hand side, you will find the choices of locale (English (United States). 
	 * Val.OlLi3.frFR:Appuyez sur [ Poursuivre ]. 
	 * Val.OlLi3.enUS:Press [ Continue ]. 
	 */ 
	protected void _questionChoisirLangue(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-clock
	 * Val.H3Span.frFR:Comment configurer la date et l'heure d'une installation de CentOS 7 ? 
	 * Val.H3Span.enUS:How do I setup the date and time for a CentOS 7 installation? 
	 * Val.H4I:fas fa-city
	 * Val.H4Span.frFR:Choisissez la grande ville près de chez vous. 
	 * Val.H4Span.enUS:Choose the big city near you. 
	 * Val.OlLi1.frFR:Sur la page "RÉSUMÉ DE L'INSTALLATION", plusieurs options sont à compléter. 
	 * Val.OlLi1.enUS:On the "INSTALLATION SUMMARY" page, there are several options to complete. 
	 * Val.OlLi2.frFR:Commencez dans la section "LOCALISATION", cliquez sur "DATE ET HEURE". 
	 * Val.OlLi2.enUS:Start in the "LOCALIZATION" section, click "DATE & TIME". 
	 * Val.OlLi3.frFR:Cliquez sur la ville dans la carte qui est le plus proche de chez vous (pour moi c'est Région: Amériques, City: Denver). 
	 * Val.OlLi3.enUS:Click on the city on the map that is the closest match to your timezone (for me it's Region: Americas, City: Denver). 
	 * Val.OlLi4.frFR:Choisissez si vous préférez l'heure "24-heures" ou l'heure "AM/PM". 
	 * Val.OlLi4.enUS:Select whether you prefer "24-hour" time or "AM/PM" time. 
	 * Val.OlLi5.frFR:Au supérieur gauche, cliquez sur [ Terminé ]. 
	 * Val.OlLi5.enUS:In the top-left corner, click [ Done ]. 
	 */ 
	protected void _questionDateHeure(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-network-wired
	 * Val.H3Span.frFR:Comment configurer le réseau et le nom d'hôte ? 
	 * Val.H3Span.enUS:How do I setup the network and host name? 
	 * Val.H4I:fas fa-ethernet
	 * Val.H4Span.frFR:Choisissez un nom unique sur votre réseau et branchez votre câble Ethernet. 
	 * Val.H4Span.enUS:Pick a unique name on your network and plug in your Ethernet cable. 
	 * Val.OlLi1.frFR:C'est une bonne étape préliminaire de configurer le réseau afin que les packages nécessaires puissent être trouvés avant de choisir d'autres options. 
	 * Val.OlLi1.frFR:Dans la section SYSTÈME, sélectionnez « NOM D'HÔTE ET RÉSEAU ». 
	 * Val.OlLi1.enUS:This is a good early step in the install process to configure the network so that necessary packages can be found before choosing other options. 
	 * Val.OlLi1.enUS:In the SYSTEM section, select "NETWORK & HOST NAME". 
	 * Val.OlLi2.frFR:Je m'attends à ce que votre machine soit connectée à un câble Ethernet plutôt qu'à un réseau sans fil. 
	 * Val.OlLi2.frFR:Assurez-vous donc que votre carte "Ethernet (...)" est sélectionnée à gauche. 
	 * Val.OlLi2.enUS:I'm expecting your machine to be connected to an Ethernet cable, rather than a wireless network. 
	 * Val.OlLi2.enUS:So make sure your "Ethernet (...)" card is selected on the left. 
	 * Val.OlLi3.frFR:Sur le côté droit, allumez la carte Ethernet. 
	 * Val.OlLi3.frFR:Notez que votre routeur attribue à la machine une adresse IP basée sur l'adresse matérielle. 
	 * Val.OlLi3.enUS:On the right side, switch the Ethernet card to on. 
	 * Val.OlLi3.enUS:Notice that your router assigns the machine an IP Address based on the Hardware Address. 
	 * Val.OlLi4.frFR:Un autre élément important à modifier est le "Host name". 
	 * Val.OlLi4.frFR:Attribuez à votre ordinateur un nom unique sur votre réseau ("tour1" pour moi), mais n'incluez pas de nom de domaine complet (suivi d'un point). 
	 * Val.OlLi4.frFR:Si vous donnez un nom de domaine complet comme "tower1.computate.org", le réseau (/etc/resolve.conf) configurera votre nom de domaine "computate.org" en tant que domaine de recherche. 
	 * Val.OlLi4.frFR:J'ai rencontrai des problèmes avec un tel nom d'hôte me rendant le réseau plus lente. 
	 * Val.OlLi4.frFR:J'ai donc configuré des noms de domaine pleinement qualifiés sur un serveur IPA ou dans le fichier /etc/hosts. 
	 * Val.OlLi4.enUS:Another important item to change is the "Host name". 
	 * Val.OlLi4.enUS:Give your computer a unique name on your network ("tower1" for me), but do not include a fully qualified domain name (followed by a dot). 
	 * Val.OlLi4.enUS:If you give a fully qualified domain name like "tower1.computate.org", then networking (/etc/resolve.conf) will configure your domain name "computate.org" as a search domain. 
	 * Val.OlLi4.enUS:I've found that to cause me problems in the past, making networking slower for me. 
	 * Val.OlLi4.enUS:I setup fully qualified domain names in an IPA server or in the /etc/hosts file instead. 
	 * Val.OlLi5.frFR:À côté du nom d'hôte, cliquez sur [ Appliquer ]. 
	 * Val.OlLi5.enUS:Next to the host name, click [ Apply ]. 
	 * Val.OlLi6.frFR:Maintenant, cliquez sur [ Terminé ]. 
	 * Val.OlLi6.enUS:Now click [ Done ]. 
	 */ 
	protected void _questionReseau(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-save
	 * Val.H3Span.frFR:Que dois-je choisir pour la sélection de logiciel dans une installation CentOS 7 ? 
	 * Val.H3Span.enUS:What should I choose for the software selection in a CentOS 7 installation? 
	 * Val.H4I:fas fa-browser
	 * Val.H4Span.frFR:Assurez-vous de choisir un environnement de bureau. 
	 * Val.H4Span.enUS:Make sure to pick a desktop environment. 
	 * Val.OlLi1.frFR:Dans la section "LOGICIEL", cliquez sur « SÉLECTION DE LOGICIELS ». 
	 * Val.OlLi1.enUS:In the "SOFTWARE" section, click "SOFTWARE SELECTION". 
	 * Val.OlLi2.frFR:Je recommanderais toujours un environnement de bureau sur vos ordinateurs. 
	 * Val.OlLi2.frFR:Vos ordinateurs sont pour développement et votre site Web actuel est recommandé pour le cloud OpenShift sur le site openshift.com de Red Hat. 
	 * Val.OlLi2.frFR:OpenShift est open source et Red Hat est une société open source, le véritable chef de la technologie open source pour entreprises. 
	 * Val.OlLi2.frFR:Je vous guiderai tout au long du voyage, depuis le développement de votre site sur votre propre ordinateur jusqu'au déploiement sur le cloud OpenShift. 
	 * Val.OlLi2.enUS:I would always recommend a Desktop environment on your computers. 
	 * Val.OlLi2.enUS:Your computers are for development, and your actual website I recommend running on an OpenShift cloud at Red Hat's openshift.com. 
	 * Val.OlLi2.enUS:OpenShift is open source, and Red Hat is an open source company, the true leader in enterprise open source technology. 
	 * Val.OlLi2.enUS:I'll take you through the whole journey from developing your site on your own computer, to deployment on the OpenShift cloud. 
	 * Val.OlLi3.frFR:Dans la section « Environment de base », sélectionnez « Bureau GNOME ». 
	 * Val.OlLi3.frFR:Phonétiquement, GNOME se prononce nɔ̃m et non pas ʒi-nɔ̃m. 
	 * Val.OlLi3.enUS:So in the "Base Environment" section, select "GNOME Desktop". 
	 * Val.OlLi3.enUS:Phonetically, GNOME is pronounced nɔ̃m, not ʒi-nɔ̃m. 
	 * Val.OlLi4.frFR:Vous pouvez également choisir « KDE PLasma Workspaces », mais je trouve que KDE a des problèmes et je préfère un simple bureau GNOME. 
	 * Val.OlLi4.enUS:You could also choose "KDE PLasma Workspaces", but I find KDE to be buggy, and I prefer a simple GNOME Desktop. 
	 * Val.OlLi5.frFR:Au supérieur gauche, cliquez sur [ Terminé ].
	 * Val.OlLi5.enUS:In the top-left corner, click [ Done ]. 
	 */ 
	protected void _questionSelectionLogiciel(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-hdd
	 * Val.H3Span.frFR:Comment configurer le disque pour la destination d'installation ? 
	 * Val.H3Span.enUS:How do I setup the disk for the installation destination? 
	 * Val.H4I:fas fa-pallet-alt
	 * Val.H4Span.frFR:Configurez votre propre partitionnement. 
	 * Val.H4Span.enUS:Configure your own partitioning. 
	 * Val.Ol1Li1.frFR:C'est temps de configurer le disque principal pour le système d'exploitation. 
	 * Val.Ol1Li1.frFR:Dans la section "SYSTÈME", cliquez sur « DESTINATION DE L'INSTALLATION ». 
	 * Val.Ol1Li1.enUS:Now it's time to configure the primary disk for the operating system. 
	 * Val.Ol1Li1.enUS:In the "SYSTEM" section, click "INSTALLATION DESTINATION". 
	 * Val.Ol1Li2.frFR:Si votre disque principal n'a pas d'icône en forme de coche en noir et blanc, vous devrez sélectionner le disque principal correct. 
	 * Val.Ol1Li2.enUS:If your primary disk does not have a black and white checkmark icon, then you'll want to select the correct primary disk. 
	 * Val.Ol1Li3.frFR:Sélectionnez « Je vais configurer le partitionnement. ». 
	 * Val.Ol1Li3.frFR:Vous pouvez également sélectionner d'autres options telles que "Chiffrer mes données.", mais ce n'est pas nécessaire. 
	 * Val.Ol1Li3.enUS:Select "I will configure partitioning.". 
	 * Val.Ol1Li3.enUS:You can also select other options like "Encrypt my data", but it's not necessary. 
	 * Val.Ol1Li4.frFR:Cliquez sur [ Terminé ] pour configurer vous-même le partitionnement. 
	 * Val.Ol1Li4.enUS:Click [ Done ] to configure partitioning yourself. 
	 * Val.Div2H5.frFR:Instructions pour un système d'exploitation existant sur votre disque. 
	 * Val.Div2H5.enUS:Instructions for an existing operating system on your disk. 
	 * Val.Ol2Li1.frFR:Si vous avez un système d'exploitation existant sur votre disque, vous ouvrez la liste déroulante pour que votre système d'exploitation puisse rétablir le système de fichiers. 
	 * Val.Ol2Li1.enUS:If you have an existing operating system on your disk, you will want to open the drop down for your operating system to redo the filesystem. 
	 * Val.Ol2Li2.frFR:Cliquez sur la première partition SYSTEM et cliquez sur le bouton [ - ].
	 * Val.Ol2Li2.enUS:Click on the first SYSTEM partition and click the [ - ] button. 
	 * Val.Ol2Li3.frFR:Vous pouvez sélectionner "Delete all file systems which are only used by ....". 
	 * Val.Ol2Li3.enUS:You can select "Delete all file systems which are only used by ....". 
	 * Val.Ol2Li4.frFR:Cliquez sur [ Delete It ]. 
	 * Val.Ol2Li4.enUS:Click [ Delete It ]. 
	 * Val.Div3H5.frFR:La meilleure façon de configurer votre disque pour la plupart des situations. 
	 * Val.Div3H5.enUS:The best way to setup your disk for most situations. 
	 * Val.Ol3Li01.frFR:Le plus simple est de cliquer sur « Cliquez ici pour les créer automatiquement. ».
	 * Val.Ol3Li01.frFR:Si vous êtes un expert en disques, vous pouvez ignorer cette section et le faire à votre façon. 
	 * Val.Ol3Li01.frFR:Mais je vous recommanderai le meilleur façon de configurer votre disque pour la plupart des situations. 
	 * Val.Ol3Li01.enUS:The easiest way is to get started is to click "Click here to create them automatically.". 
	 * Val.Ol3Li01.enUS:If you are a disk expert, than you can ignore this section and do it your way. 
	 * Val.Ol3Li01.enUS:But I'll recommend the best way to setup your disk for most situations. 
	 * Val.Ol3Li02.frFR:La configuration automatique du disque créera 4 partitions (/home, /boot, / et swap). 
	 * Val.Ol3Li02.frFR:Vous n'avez pas besoin d'une partition séparée entre / et /home, je supprimerais donc la partition /home. 
	 * Val.Ol3Li02.frFR:Cliquez sur la partition /home. 
	 * Val.Ol3Li02.enUS:The automatic disk setup will create 4 partitions (/home, /boot, /, and swap). 
	 * Val.Ol3Li02.enUS:You don't need a separate partition between / and /home, so I would delete the /home partition. 
	 * Val.Ol3Li02.enUS:Click on the /home partition. 
	 * Val.Ol3Li03.frFR:Cliquez sur le bouton [ - ]. 
	 * Val.Ol3Li03.enUS:Click the [ - ] button. 
	 * Val.Ol3Li04.frFR:Maintenant, la taille de la partition /boot dépend de vous. 
	 * Val.Ol3Li04.frFR:Cependant, je recommande au moins 2 GiO pour votre partition /boot. 
	 * Val.Ol3Li04.frFR:Ainsi, lorsque vous recevez des packages mis à jour et des correctifs de sécurité, votre partition /boot ne manquera pas d'espace, du moins pas avant de nombreuses années, je crois. 
	 * Val.Ol3Li04.frFR:Alors cliquez sur la partition /boot. 
	 * Val.Ol3Li04.enUS:Now the size of the /boot partition is up to you. 
	 * Val.Ol3Li04.enUS:However, I recommend at least 2 GiB for your /boot partition. 
	 * Val.Ol3Li04.enUS:This way, when you receive updated packages and security fixes, your /boot partition won't run out of space, at least not for many years I think. 
	 * Val.Ol3Li04.enUS:So click on the /boot partition. 
	 * Val.Ol3Li05.frFR:Changez la partition /boot « Desired Capacity » en « 2 GiO ». 
	 * Val.Ol3Li05.enUS:Change the /boot partition "Desired Capacity" to "2 GiB". 
	 * Val.Ol3Li06.frFR:Maintenant, décidez combien d’espace de swap à réserver pour la mémoire. 
	 * Val.Ol3Li06.frFR:L'espace de swap est lié à la quantité de RAM installée sur votre système. 
	 * Val.Ol3Li06.frFR:C'est généralement admis que vous n'avez pas besoin de plus d'espace de swap que de doubler la quantité de RAM de votre système. 
	 * Val.Ol3Li06.frFR:Toutefois, prenez en compte la quantité de RAM avec laquelle vous effectuerez un jour dans votre système afin de déterminer la quantité d'espace de swap à réserver. 
	 * Val.Ol3Li06.frFR:En effet, vous ne pourrez pas le changer plus tard sans réinstaller le système d'exploitation. 
	 * Val.Ol3Li06.frFR:Ce n'est pas la fin du monde de réinstaller votre système d'exploitation, je le fais assez souvent. 
	 * Val.Ol3Li06.frFR:Pour définir l’espace de swap, cliquez sur la partition de swap. 
	 * Val.Ol3Li06.enUS:Now to decide how much swap space to reserve for memory. 
	 * Val.Ol3Li06.enUS:Swap space is related to the amount of RAM you have installed in your system. 
	 * Val.Ol3Li06.enUS:It's generally agreed that you don't need more swap space than double the amount of RAM in your system. 
	 * Val.Ol3Li06.enUS:However, do consider the amount of RAM you will likely upgrade your system with someday to determine how much swap space to reserve. 
	 * Val.Ol3Li06.enUS:This is because you won't be able to change it later without reinstalling the operating system either. 
	 * Val.Ol3Li06.enUS:It's not the end of the world to reinstall your operating system, I seem to do it fairly often. 
	 * Val.Ol3Li06.enUS:So to set the swap space, click on the swap partition. 
	 * Val.Ol3Li07.frFR:Si j'ai 32 Go de RAM dans mon système, je définirai la quantité d'espace de swap de manière à doubler cette quantité dans "Desired Capacity": "64 GiO". 
	 * Val.Ol3Li07.enUS:If I have 32 GiB of RAM in my system, I will set the amount of swap space to double that amount in "Desired Capacity": "64 GiB". 
	 * Val.Ol3Li08.frFR:Maintenant, maximisez la quantité d’espace disponible sur la partition /. 
	 * Val.Ol3Li08.enUS:Now let's max out the amount of space on the / partition. 
	 * Val.Ol3Li09.frFR:Cliquez sur la partition /. 
	 * Val.Ol3Li09.enUS:Click on the / partition. 
	 * Val.Ol3Li10.frFR:Effacez la valeur de la "Desired Capacity" de la partition /.
	 * Val.Ol3Li10.enUS:Clear any value from the "Desired Capacity" of the / partition. 
	 * Val.Ol3Li11.frFR:Cliquez maintenant sur la partition /boot pour voir toutes les valeurs des trois partitions mises à jour. 
	 * Val.Ol3Li11.frFR:Les montants peuvent avoir été convertis en MiB au lieu de GiO, mais vous devriez voir les bonnes valeurs que vous attendez, avec la partition / maximum. 
	 * Val.Ol3Li11.enUS:Now click on the /boot partition to see all of the values of all three partitions updated. 
	 * Val.Ol3Li11.enUS:The amounts may have been converted to MiB instead of GiB, but you should see the right values you are expecting, with the / partition maxed out. 
	 * Val.Div4H5.frFR:Si vous êtes accidentellement démarré en mode "UEFI". 
	 * Val.Div4H5.enUS:If you are accidentally booted into "UEFI" mode. 
	 * Val.Ol4Li1.frFR:Si vous êtes accidentallement dans votre programme d’installation USB Centos 7 en mode "UEFI", vous verrez une partition /boot/efi supplémentaire. 
	 * Val.Ol4Li1.frFR:Le programme d'installation supposera que vous avez besoin d'une partition /boot/efi, mais vous n'avez pas besoin de ça. 
	 * Val.Ol4Li1.frFR:Si vous continuez avec la partition /boot/efi et retirez le clé USB d'installation CentOS, il rendra votre système instable et il plantera. 
	 * Val.Ol4Li1.frFR:Alors, évitez d'installer le système d'exploitation en mode UEFI. 
	 * Val.Ol4Li1.enUS:If you are accidentally booted into your USB Centos 7 Installer in "UEFI" mode, you will see an extra /boot/efi paritition. 
	 * Val.Ol4Li1.enUS:The installer will assume that you need a /boot/efi partition, which you don't. 
	 * Val.Ol4Li1.enUS:Proceeding with the /boot/efi paritition and removing the install media will make your system unstable and crash. 
	 * Val.Ol4Li1.enUS:So avoid installing the operating system in UEFI mode. 
	 * Val.Ol4Li2.frFR:Cliquez sur [ Terminé ]. 
	 * Val.Ol4Li2.enUS:Click [ Done ]. 
	 * Val.Ol4Li3.frFR:Cliquez sur [ Accepter les modifications ]. 
	 * Val.Ol4Li3.enUS:Click [ Accept the changes ]. 
	 */      
	protected void _questionInstallationDestination(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-exclamation-triangle
	 * Val.H3Span.frFR:Suis-je prêt à appuyer sur le bouton [ Démarrer l'installation ] ? 
	 * Val.H3Span.enUS:Am I ready to push the [ Begin Installation ] button? 
	 * Val.H4I:fab fa-centos
	 * Val.H4Span.frFR:Bienvenu au monde merveilleux de CentOS 7. 
	 * Val.H4Span.enUS:Welcome the wonderful world of CentOS 7. 
	 * Val.OlLi1.frFR:Vous êtes sur le point d'installer le monde merveilleux de CentOS 7. 
	 * Val.OlLi1.frFR:À l'aise, vous allez l'adorer, tout comme des milliers d'autres dans le monde. 
	 * Val.OlLi1.frFR:Allez-y, appuyez sur le bouton [ Démarrer l'installation ]. 
	 * Val.OlLi1.enUS:You are about to install the wonderful world of CentOS 7. 
	 * Val.OlLi1.enUS:Relax, you're going to love it, just like thousands of others around the world. 
	 * Val.OlLi1.enUS:So go ahead and push the [ Begin Installation ] button. 
	 */ 
	protected void _questionInstaller(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-user-cog
	 * Val.H3Span.frFR:Ai-je besoin d'un mot de passe root et d'un mot de passe utilisateur ? 
	 * Val.H3Span.enUS:Do I need a root password and a user password? 
	 * Val.H4I:fas fa-lock-alt
	 * Val.H4Span.frFR:Choisisez un mot de passe root fort. 
	 * Val.H4Span.enUS:Choose a string root password. 
	 * Val.OlLi1.frFR:C'est important de choisir un mot de passe root fort. 
	 * Val.OlLi1.frFR:Ce sera un compte administratif sur lequel vous pourrez vous connecter pour tout faire. 
	 * Val.OlLi1.frFR:Cliquez sur « MOT DE PASSE AMINISTRATEUR ». 
	 * Val.OlLi1.enUS:It's important to choose a strong root password. 
	 * Val.OlLi1.enUS:This will be an administrative account that can be logged into to do anything at all. 
	 * Val.OlLi1.enUS:Click on "ROOT PASSWORD". 
	 * Val.OlLi2.frFR:Donc, créez ou générez un mot de passe root fort et tapez-le deux fois dans les champs. 
	 * Val.OlLi2.frFR:Ecrivez-le soigneusement pour plus tard ou stockez-le dans un coffre-fort crypté si possible. 
	 * Val.OlLi2.frFR:Je vais vous en dire plus sur les coffres-forts de mots de passe dans une autre leçon. 
	 * Val.OlLi2.frFR:Cliquez sur [ Terminé ]. 
	 * Val.OlLi2.enUS:So come up with, or generate a strong root password and type it twice in the boxes. 
	 * Val.OlLi2.enUS:Write it down carefully for later, or store it in an encrypted password safe if possible. 
	 * Val.OlLi2.enUS:I'll tell you more about password safes in another lesson. 
	 * Val.OlLi2.enUS:Click [ Done ]. 
	 * Val.OlLi3.frFR:Cliquez sur « CRÉATION DE L'UTILISATEUR ». 
	 * Val.OlLi3.frFR:Écrire le nom, prénom et nom d'utilisateur que vous souhaitez. 
	 * Val.OlLi3.frFR:Cocher « Faire de cet utilisateur un administrateur ». 
	 * Val.OlLi3.frFR:Choisisez un mot de passe d'utilisateur fort. 
	 * Val.OlLi3.frFR:Cliquez sur [ Terminé ]. 
	 * Val.OlLi3.enUS:Click on "USER CREATION". 
	 * Val.OlLi3.enUS:Write the first name, last name and username that you want. 
	 * Val.OlLi3.enUS:Check "Make this user an administrator". 
	 * Val.OlLi3.enUS:It's important to choose a strong user password. 
	 * Val.OlLi3.enUS:Click [ Done ]. 
	 */ 
	protected void _questionMotsDePasse(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-fast-forward
	 * Val.H3Span.frFR:Comment terminer l'installation de CentOS 7 ? 
	 * Val.H3Span.enUS:How do I finish the install of CentOS 7? 
	 * Val.H4I:fab fa-linux
	 * Val.H4Span.frFR:Quelques étapes supplémentaires pour profiter de votre nouvel ordinateur. 
	 * Val.H4Span.enUS:A few more steps to enjoy your new computer. 
	 * Val.OlLi01.frFR:Lorsque l'installation est fait, vous pouvez cliquer sur [ Redémarrer ]. 
	 * Val.OlLi01.enUS:When it's done, you can click [ Reboot ]. 
	 * Val.OlLi02.frFR:N'oubliez pas de retirer le disque USB en même temps, sinon vous redémarrez dans le programme d'installation. 
	 * Val.OlLi02.enUS:Don't forget to take out the USB disk at the same time, or you will boot back into the installer. 
	 * Val.OlLi03.frFR:Lorsque vous démarrez CentOS 7 pour la première fois, il vous sera demandé d'accepter les informations de licence. 
	 * Val.OlLi03.frFR:Cliquez sur « LICENSE INFORMATION ». 
	 * Val.OlLi03.enUS:When you boot into CentOS 7 for the first time, you will be asked to accept the License Information. 
	 * Val.OlLi03.enUS:Click on "LICENCE AGREEMENT". 
	 * Val.OlLi04.frFR:Passez en revue le contrat de licence, puis cochez la case « J'accepte le contrat de license. ». 
	 * Val.OlLi04.enUS:Review the license agreement and then check "I accept the license agreement". 
	 * Val.OlLi05.frFR:Cliquez sur [ Terminé ]. 
	 * Val.OlLi05.enUS:Click [ Done ]. 
	 * Val.OlLi06.frFR:Cliquez maintenant sur [ FINALISER LA CONFIGURATION ] dans le coin inférieur droit. 
	 * Val.OlLi06.enUS:Now click [ FINISH CONFIGURATION ] in the bottom-right corner. 
	 * Val.OlLi07.frFR:Vous pouvez vous connecter à votre compte d'utilisateur en cliquant sur votre nom d'utilisateur et en entrant votre mot de passe. 
	 * Val.OlLi07.enUS:You can now sign into your user account by clicking on your username and entering your password. 
	 * Val.OlLi08.frFR:Suivez l'écran de bienvenue en cliquant sur [ Suivant ] pour votre langue. 
	 * Val.OlLi08.enUS:Follow the welcome screen by clicking [ Next ] for your language. 
	 * Val.OlLi09.frFR:Cliquez sur [ Suivant ] pour votre disposition de clavier. 
	 * Val.OlLi09.enUS:Click [ Next ] for your keyboard layout. 
	 * Val.OlLi10.frFR:Désactivez "Location Services", car vous n'avez besoin de personne pour suivre votre position. 
	 * Val.OlLi10.enUS:Turn off "Location Services", since you don't need anybody tracking your location. 
	 * Val.OlLi11.frFR:Cliquez sur [ Suivant ] pour désactiver les services de localisation. 
	 * Val.OlLi11.enUS:Click [ Next ] to turn off location services. 
	 * Val.OlLi12.frFR:Et je n'utilise pas les comptes en ligne en cliquant sur [ Passer ]. 
	 * Val.OlLi12.enUS:And I skip the online accounts by clicking [ Skip ]. 
	 * Val.OlLi13.frFR:Maintenant, cliquez sur [ Commencer à utiliser CentOS Linux ] pour profiter de votre nouvel ordinateur ! 
	 * Val.OlLi13.enUS:Now click [ Start using CentOS Linux ] to enjoy your new computer! 
	 */ 
	protected void _questionConfigurationInitiale(PageHtml o) {
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
	 * Val.TableTr1Td3I:far fa-network-wired
	 * Val.TableTr1Td4I:far fa-pen-nib
	 * Val.TableTr2Td1.frFR:30 Avril 2019
	 * Val.TableTr2Td1.enUS:April 30 2019
	 * Val.TableTr2Td2.frFR:Comment installer le système d'exploitation pour développer mon site Web ? 
	 * Val.TableTr2Td2.enUS:How do I install the operating system to start developing my website? 
	 * Val.TableTr2Td3.frFR:Chaque étape pour installer le système d'exploitation CentOS 7. 
	 * Val.TableTr2Td3.enUS:Every step to install the CentOS 7 operating system. 
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
	 * Val.TableTr02Td1I:far fa-person-carry
	 * Val.TableTr02Td2.frFR:Comment télecharger CentOS 7 ? 
	 * Val.TableTr02Td2.enUS:How do I download CentOS 7? 
	 * Val.TableTr02Td3Span1I:far fa-cloud-download-alt
	 * Val.TableTr02Td4.frFR:Télécharger un fichier ISO. 
	 * Val.TableTr02Td4.enUS:Download an ISO file. 
	 * 
	 * Val.TableTr03Td1I:fab fa-usb
	 * Val.TableTr03Td2.frFR:Comment puis-je créer une clé USB avec CentOS 7 ? 
	 * Val.TableTr03Td2.enUS:How can I create a USB key with CentOS 7? 
	 * Val.TableTr03Td3I:far fa-compact-disc
	 * Val.TableTr03Td4.frFR:Utilizez la commande dd. 
	 * Val.TableTr03Td4.enUS:Use the dd command. 
	 * 
	 * Val.TableTr04Td1I:far fa-play-circle
	 * Val.TableTr04Td2.frFR:Lorsque je redémarre avec la clé USB, quel mode de démarrage choisir? 
	 * Val.TableTr04Td2.enUS:When I reboot with the USB key, which boot mode do I choose? 
	 * Val.TableTr04Td3Span1I:fab fa-windows
	 * Val.TableTr04Td3Span1I:fab fa-centos
	 * Val.TableTr04Td4.frFR:Évitez de démarrer en mode de démarrage UEFI. 
	 * Val.TableTr04Td4.enUS:Avoid booting in UEFI boot mode. 
	 * 
	 * Val.TableTr05Td1I:fas fa-flag-alt
	 * Val.TableTr05Td2.frFR:Quelle langue j'utilise pendant le processus d'installation? 
	 * Val.TableTr05Td2.enUS:What language would I use during the install process? 
	 * Val.TableTr05Td3I:far fa-language
	 * Val.TableTr05Td4.frFR:Choisissez la langue avec laquelle vous êtes à l'aise. 
	 * Val.TableTr05Td4.enUS:Choose the language you are comfortable with. 
	 * 
	 * Val.TableTr06Td1I:fas fa-clock
	 * Val.TableTr06Td2.frFR:Comment configurer la date et l'heure d'une installation de CentOS 7 ? 
	 * Val.TableTr06Td2.enUS:How do I setup the date and time for a CentOS 7 installation? 
	 * Val.TableTr06Td3I:fas fa-city
	 * Val.TableTr06Td4.frFR:Choisissez la grande ville près de chez vous. 
	 * Val.TableTr06Td4.enUS:Choose the big city near you. 
	 * 
	 * Val.TableTr07Td1I:fas fa-network-wired
	 * Val.TableTr07Td2.frFR:Comment configurer le réseau et le nom d'hôte ? 
	 * Val.TableTr07Td2.enUS:How do I setup the network and host name? 
	 * Val.TableTr07Td3I:fas fa-ethernet
	 * Val.TableTr07Td4.frFR:Choisissez un nom unique sur votre réseau et branchez votre câble Ethernet. 
	 * Val.TableTr07Td4.enUS:Pick a unique name on your network and plug in your Ethernet cable. 
	 * 
	 * Val.TableTr08Td1I:fas fa-save
	 * Val.TableTr08Td2.frFR:Que dois-je choisir pour la sélection de logiciel dans une installation CentOS 7 ? 
	 * Val.TableTr08Td2.enUS:What should I choose for the software selection in a CentOS 7 installation? 
	 * Val.TableTr08Td3I:fas fa-browser
	 * Val.TableTr08Td4.frFR:Assurez-vous de choisir un environnement de bureau. 
	 * Val.TableTr08Td4.enUS:Make sure to pick a desktop environment. 
	 * 
	 * Val.TableTr09Td1I:fas fa-hdd
	 * Val.TableTr09Td2.frFR:Comment configurer le disque pour la destination d'installation ? 
	 * Val.TableTr09Td2.enUS:How do I setup the disk for the installation destination? 
	 * Val.TableTr09Td3I:fas fa-pallet-alt
	 * Val.TableTr09Td4.frFR:Configurez votre propre partitionnement. 
	 * Val.TableTr09Td4.enUS:Configure your own partitioning. 
	 * 
	 * Val.TableTr10Td1I:fas fa-exclamation-triangle
	 * Val.TableTr10Td2.frFR:Suis-je prêt à appuyer sur le bouton [ Begin Installation ] ? 
	 * Val.TableTr10Td2.enUS:Am I ready to push the [ Begin Installation ] button? 
	 * Val.TableTr10Td3I:fab fa-centos
	 * Val.TableTr10Td4.frFR:Bienvenu au monde merveilleux de CentOS 7. 
	 * Val.TableTr10Td4.enUS:Welcome the wonderful world of CentOS 7. 
	 * 
	 * Val.TableTr11Td1I:fas fa-user-cog
	 * Val.TableTr11Td2.frFR:Ai-je besoin d'un mot de passe root et d'un mot de passe utilisateur ? 
	 * Val.TableTr11Td2.enUS:Do I need a root password and a user password? 
	 * Val.TableTr11Td3I:fas fa-lock-alt
	 * Val.TableTr11Td4.frFR:Choisisez un mot de passe root fort. 
	 * Val.TableTr11Td4.enUS:Choose a string root password. 
	 * 
	 * Val.TableTr12Td1I:fas fa-fast-forward
	 * Val.TableTr12Td2.frFR:Comment terminer l'installation de CentOS 7 ? 
	 * Val.TableTr12Td2.enUS:How do I finish the install of CentOS 7? 
	 * Val.TableTr12Td3I:fab fa-linux
	 * Val.TableTr12Td4.frFR:Quelques étapes supplémentaires pour profiter de votre nouvel ordinateur. 
	 * Val.TableTr12Td4.enUS:A few more steps to enjoy your new computer. 
	 */   
	protected void _recapituler3(PageHtml o) {      
	}
}
