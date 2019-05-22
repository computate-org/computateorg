package org.computate.site.frFR.cours.c001.l008;

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.utilisateur.UtilisateurSite;

/**
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement
 * ApiUriRechercheEnUSPage: /enUS/course/001/008-how-to-obtain-free-tls-certificates
 * PageRechercheFrFRPage: C001L008CreerCertificatFrFRPage
 * PageRechercheEnUSPage: C001L008CreerCertificatEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNomMinuscule.frFR: le leçon
 * UnNomMinuscule.enUS: a lesson
 * 
 * H1.frFR: Que puis-je faire une fois que j'ai acheté un nom de domaine ? 
 * H1.enUS: What can I do once I have purchased a domain name? 
 * 
 * H2.frFR: Obtenez gratuitement un certificat TLS valide pour des raisons de sécurité et de crédibilité. 
 * H2.enUS: Obtain a valid TLS certificate for free, for security and credibility. 
 * 
 * Titre.frFR: Obtenez gratuitement un certificat TLS valide pour des raisons de sécurité et de crédibilité. 
 * Titre.enUS: Obtain a valid TLS certificate for free, for security and credibility. 
 * 
 * Description.frFR: Tout d'abord, félicitations pour avoir obtenu votre propre nom de domaine pour lancer votre site. Avec un nom de domaine, vous voudrez également obtenir un certificat TLS. La bonne nouvelle est qu’il est totalement gratuit, grâce à la technologie open source. Avec un certificat vous pouvez sécuriser les communications vers votre site. Vous pouvez signer votre code et vous assurer qu'il est valide lorsqu'il est déployé sur le cloud. Vous pouvez également configurer une connexion sécurisée avec OAuth2/OpenID Connect Single Sign On à toutes vos applications. Je vais vous montrer comment obtenir ces certificats et générer les magasins de clés à utiliser dans vos applications de manière open source. 
 * Description.enUS: First, congratulations on obtaining your own domain name to launch your site. Along with a domain name, you will also want to obtain a TLS certificate. The good news is that it is completely free, thanks to open source technology. With a certificate you can secure communications to your site. You can sign your code and ensure that it is valid when deployed on the cloud. You can also setup secure OAuth2/OpenID Connect Single Sign On to all of your applications. I will show you how to obtain these certificates and generate the keystores to use in your applications the open source way. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 1927
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 1702
*/   
public class C001L008CreerCertificat extends C001L008CreerCertificatGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(8);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L008CreerCertificat.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificat_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificat_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L008CreerCertificatEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificatFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L008CreerCertificatEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificatFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificatVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L008CreerCertificat_H1);
		addPageRecherche_frFR(C001L008CreerCertificat_H2);
		addPageRecherche_frFR(C001L008CreerCertificatVals);
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Tout d'abord, félicitations pour avoir obtenu votre propre nom de domaine pour lancer votre site. 
	 * Val.P.frFR:Avec un nom de domaine, vous voudrez également obtenir un certificat TLS. 
	 * Val.P.frFR:La bonne nouvelle est qu’il est totalement gratuit, grâce à la technologie open source. 
	 * Val.P.frFR:Avec un certificat vous pouvez sécuriser les communications vers votre site. 
	 * Val.P.frFR:Vous pouvez signer votre code et vous assurer qu'il est valide lorsqu'il est déployé sur le cloud. 
	 * Val.P.frFR:Vous pouvez également configurer une connexion sécurisée avec OAuth2/OpenID Connect Single Sign On à toutes vos applications. 
	 * Val.P.frFR:Je vais vous montrer comment obtenir ces certificats et générer les magasins de clés à utiliser dans vos applications de manière open source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:First, congratulations on obtaining your own domain name to launch your site. 
	 * Val.P.enUS:Along with a domain name, you will also want to obtain a TLS certificate. 
	 * Val.P.enUS:The good news is that it is completely free, thanks to open source technology. 
	 * Val.P.enUS:With a certificate you can secure communications to your site. 
	 * Val.P.enUS:You can sign your code and ensure that it is valid when deployed on the cloud. 
	 * Val.P.enUS:You can also setup secure OAuth2/OpenID Connect Single Sign On to all of your applications. 
	 * Val.P.enUS:I will show you how to obtain these certificates and generate the keystores to use in your applications the open source way. 
	 */    
	protected void _moi(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-conveyor-belt-alt
	 * Val.H3Span.frFR:Comment installer les dépendences pour certbot ? 
	 * Val.H3Span.enUS:How do I install the dependencies for certbot? 
	 * Val.H4I:far fa-cookie
	 * Val.H4Span.frFR:Construisez les dépendances avec yum. 
	 * Val.H4Span.enUS:Build the dependencies with yum. 
	 * Val.Pre1Span1:sudo
	 * Val.Pre1Span2: yum
	 * Val.Pre1Span3: install
	 * Val.Pre1Span4: -y
	 * Val.Pre1Span5: epel-release
	 * 
	 * Val.Ol2Li1.frFR:sudo: La commande pour installer des dépots yum commence par la commande sudo. 
	 * Val.Ol2Li1.frFR:La commande "sudo" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. 
	 * Val.Ol2Li1.frFR:L'installation des dépots yum nécessite toujours les privilèges root. 
	 * Val.Ol2Li1.enUS:sudo: The command to install yum repositories begins with the command sudo. 
	 * Val.Ol2Li1.enUS:The "sudo" command allows your current user to have root privileges for a few minutes after entering your password. 
	 * Val.Ol2Li2.frFR:yum Signifie "Yellowdog Updater Modified", mais personne ne le connait comme yellowdog, juste yum. 
	 * Val.Ol2Li2.frFR:CentOS gère les paquets de logiciel et les fichiers d'application RPM avec yum. 
	 * Val.Ol2Li2.enUS:yum Stands for "Yellowdog Updater Modified", but nobody knows it as yellowdog, just yum. 
	 * Val.Ol2Li2.enUS:CentOS manages software packages and RPM application files with yum. 
	 * Val.Ol2Li3.frFR:install : Pour installer des nouveaux paquets yum. 
	 * Val.Ol2Li3.enUS:install: For installing new yum packages. 
	 * Val.Ol2Li4.frFR:-y : Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. 
	 * Val.Ol2Li4.enUS:-y: Suppress messages asking to confirm if you want to install the software. 
	 * Val.Ol2Li5.frFR:epel-release : Nom du paquet des packages supplémentaires pour le référentiel Enterprise Linux. 
	 * Val.Ol2Li5.enUS:epel-release: The package name of the Extra Packages for Enterprise Linux repository. 
	 * 
	 * 
	 * Val.Pre3Span1:sudo
	 * Val.Pre3Span2: yum
	 * Val.Pre3Span3: install
	 * Val.Pre3Span4: -y
	 * Val.Pre3Span5: certbot
	 * 
	 * Val.Ol4Li1:sudo
	 * Val.Ol4Li2:yum
	 * Val.Ol4Li3:install
	 * Val.Ol4Li4:-y
	 * Val.Ol4Li5.frFR:certbot : Une autorité de certification gratuite et automatisée qui vise à réduire les barrières à l'entrée pour le chiffrement de tout le trafic HTTP sur l'Internet. 
	 * Val.Ol4Li5.enUS:certbot: A free, automated certificate authority that aims to lower the barriers to entry for encrypting all HTTP traffic on the Internet. 
	 * 
	 */  
	protected void _questionDependences(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-files-medical
	 * Val.H3Span.frFR:Où dois-je placer les certificats, les clés et les magasins de clés pour mon site ? 
	 * Val.H3Span.enUS:Where do I put the certificates, keys and keystores for my site? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire certbot dans /srv. 
	 * Val.H4Span.enUS:Create a pgsql directory in /srv. 
	 * Val.PreSpan01:sudo
	 * Val.PreSpan02: install
	 * Val.PreSpan03: -d
	 * Val.PreSpan04: -o
	 * Val.PreSpan05: $USER
	 * Val.PreSpan06: -g
	 * Val.PreSpan07: $USER
	 * Val.PreSpan08: -m
	 * Val.PreSpan09: 700
	 * Val.PreSpan10: /srv/certbot
	 * 
	 * Val.Ol2Li01:sudo
	 * Val.Ol2Li02.frFR:install : Crée des répertoires et définit des attributs sur le nouveau répertoire. 
	 * Val.Ol2Li02.enUS:install: Creates directories and sets attributes on the new directory. 
	 * Val.Ol2Li03.frFR:-d : Créez tous les composants des répertoires spécifiés. 
	 * Val.Ol2Li03.enUS:-d: Create  directories. 
	 * Val.Ol2Li04.frFR:-o : Définir la propriété sur le répertoire (super-utilisateur uniquement). 
	 * Val.Ol2Li04.enUS:-o: Set ownership on the directory (super-user only). 
	 * Val.Ol2Li05.frFR:$USER : L'utilisateur actuel à rendre le propriétaire du répertoire. 
	 * Val.Ol2Li05.enUS:$USER: The current user to make the owner of the directory. 
	 * Val.Ol2Li06.frFR:-g : Définir la propriété du groupe sur le répertoire (super-utilisateur uniquement). 
	 * Val.Ol2Li06.enUS:-g: Set group ownership on the directory (super-user only). 
	 * Val.Ol2Li07.frFR:$USER : L'utilisateur actuel à rendre le propriétaire du groupe du répertoire. 
	 * Val.Ol2Li07.enUS:$USER: The current user to make the group owner of the directory. 
	 * Val.Ol2Li08.frFR:-m : Définir la propriété du groupe sur le répertoire (super-utilisateur uniquement). 
	 * Val.Ol2Li08.enUS:-m: Set group ownership on the directory (super-user only). 
	 * Val.Ol2Li09.frFR:700 : Accordez des autorisations de lecture, d'écriture et d'exécution à l'utilisateur du répertoire uniquement. 
	 * Val.Ol2Li09.enUS:700: Give read, write and execute permissions to only the user of the directory. 
	 * Val.Ol2Li10.frFR:/srv est un bon endroit pour installer des serveurs logicielles open source et vos certificats, clés et magasins de clés. 
	 * Val.Ol2Li10.enUS:/srv is a good place to install open source software serveurs and your certificates, keys and keystores. 
	 */  
	protected void _questionMkdirSrv(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-file-certificate
	 * Val.H3Span.frFR:Comment puis-je obtenir mon certificat ? 
	 * Val.H3Span.enUS:How do I obtain my certificate? 
	 * Val.H4I:far fa-stamp
	 * Val.H4Span.frFR:Utilisez la commande certbot. 
	 * Val.H4Span.enUS:Use the certbot command. 
	 */  
	protected void _questionCertbot1(PageHtml o) {
	}

	/**
	 * Val.PreSpan01:sudo
	 * Val.PreSpan02: certbot
	 * Val.PreSpan03: --manual
	 * Val.PreSpan04: --preferred-challenges dns
	 * Val.PreSpan05: --server https://acme-v02.api.letsencrypt.org/directory
	 * Val.PreSpan06: certonly
	 * Val.PreSpan07: -d example.com
	 * Val.PreSpan08: -d *.example.com
	 * Val.PreSpan09: -d *.apps.example.com
	 * Val.PreSpan10: -d example.org -d *.example.org -d *.apps.example.org
	 */
	protected void _questionCertbot2(PageHtml o) {
	}
	@Override public void htmlBodyQuestionCertbot2(PageHtml o) {
		UtilisateurSite utilisateurSite = requeteSite_.getUtilisateurSite();
		if(utilisateurSite == null) {
			super.htmlBodyQuestionCertbot2(o);
		}
		else {
			{ e("pre").a("class", " questionCertbot2Pre ").f();
				{ e("span").a("class", " questionCertbot2PreSpan01 questionCertbot2PreSpan odd ").f();
					sx(questionCertbot2PreSpan011);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan02 questionCertbot2PreSpan even ").f();
					sx(questionCertbot2PreSpan021);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan03 questionCertbot2PreSpan odd ").f();
					sx(questionCertbot2PreSpan031);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan04 questionCertbot2PreSpan even ").f();
					sx(questionCertbot2PreSpan041);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan05 questionCertbot2PreSpan odd ").f();
					sx(questionCertbot2PreSpan051);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan06 questionCertbot2PreSpan even ").f();
					sx(questionCertbot2PreSpan061);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan07 questionCertbot2PreSpan odd ").f();
					sx(" -d ", utilisateurSite.getSiteNomDomaine());
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan08 questionCertbot2PreSpan even ").f();
					sx(" -d *.", utilisateurSite.getSiteNomDomaine());
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan09 questionCertbot2PreSpan odd ").f();
					sx(" -d *.apps.", utilisateurSite.getSiteNomDomaine());
				} g("span");
			} g("pre");
		}
	}

	/**
	 * 
	 * Val.Ol2Li01:sudo
	 * Val.Ol2Li02.frFR:certbot : Une autorité de certification gratuite et automatisée qui vise à réduire les barrières à l'entrée pour le chiffrement de tout le trafic HTTP sur l'Internet. 
	 * Val.Ol2Li02.enUS:certbot: A free, automated certificate authority that aims to lower the barriers to entry for encrypting all HTTP traffic on the Internet. 
	 * Val.Ol2Li03.frFR:--manual : Obtenez des certificats de manière interactive ou à l'aide d'un script shell. 
	 * Val.Ol2Li03.enUS:--manual: Obtain certificates interactively, or using shell script. 
	 * Val.Ol2Li04.frFR:--preferred-challenges dns : Obtenir ou renouveler un certificat, mais ne l'installez pas. 
	 * Val.Ol2Li04.enUS:--preferred-challenges dns: Obtain or renew a certificate, but do not install it. 
	 * Val.Ol2Li05.frFR:--server https://acme-v02.api.letsencrypt.org/directory : Spécifiez une version plus récente d'un serveur letsencrypt qui autorise les domaines wildcard dans les certificats. 
	 * Val.Ol2Li05.enUS:--server https://acme-v02.api.letsencrypt.org/directory: Specify a more recent version of a letsencrypt server that allows wildcard domains in certificates. 
	 * Val.Ol2Li06.frFR:certonly : Obtenir ou renouveler un certificat, mais ne l'installez pas. 
	 * Val.Ol2Li06.enUS:certonly: Obtain or renew a certificate, but do not install it. 
	 * Val.Ol2Li07.frFR:-d example.com : Spécifiez votre nom de domaine de racine pour l'inclure en tant que route sécurisée par le certificat. 
	 * Val.Ol2Li07.enUS:-d example.com: Specify your root domain name to include it as a route secured by the certificate. 
	 * Val.Ol2Li08.frFR:-d example.com : Incluez des domaines génériques dans votre domaine racine, y compris www par exemple. 
	 * Val.Ol2Li08.enUS:-d example.com: Include wildcard domains under your root domain, which would include www for example. 
	 * Val.Ol2Li09.frFR:-d example.com : Les domaines génériques n'incluent pas les sous-domaines d'un domaine générique; incluez donc également des sous-domaines supplémentaires. 
	 * Val.Ol2Li09.enUS:-d example.com: Wildcard domains do not include subdomains of a wildcard domain, so include additional subdomains as well. 
	 * Val.Ol2Li10.frFR:-d example.com : Vous pouvez inclure plus d'un nom de domaine dans le même certificat si vous le souhaitez, jusqu'à un montant généreux par letsencrypt. 
	 * Val.Ol2Li10.enUS:-d example.com: You can optionally include more than one domain name in the same certificate if you want to, up to a generous amount by letsencrypt. 
	 * 
	 * Val.P2.frFR:certbot vous posera des questions, par exemple, si vous souhaitez que votre adresse IP soit consignée comme ayant demandé ce certificat.
	 * Val.P2.frFR:Vous pouvez répondre Yes car c'est votre certificat. 
	 * Val.P2.frFR:Il vous demandera probablement votre adresse e-mail, c'est bien, parce qu'ils vous enverront un mail lorsque votre certificat expirera quelques semaines avant. 
	 * Val.P2.frFR:Les certificats expirent tous les 3 mois, c'est bien souvent, mais ils sont gratuits, donc vous ne pouvez pas trop vous plaindre.
	 * Val.P2.frFR:Des certificats beaucoup plus chers peuvent durer 3 ans. 
	 * Val.P2.enUS:certbot will ask you questions, like if you're okay having your IP address logged as having requested this certificate. 
	 * Val.P2.enUS:You can answer Yes, because it is your certificate. 
	 * Val.P2.enUS:It will probably ask you for your email, which is nice, because they will send you an email when your certificate is a few weeks from expiring. 
	 * Val.P2.enUS:The certificates expire every 3 months, which is often, but they are free, so you can't complain too much. 
	 * Val.P2.enUS:Much more expensive certificates might last for 3 years. 
	 * 
	 * Val.P3Span1.frFR:Aussi, certbot vous demandera de créer plusieurs enregistrements DNS TXT avec des valeurs aléatoires pour vos noms de domaine que vous avez spécifiés, afin de prouver que vous êtes le propriétaire du domaine. 
	 * Val.P3Span1.frFR:Cela prendra du temps tous les trois mois. Je vous recommande donc un service qui vous permettra de gérer le DNS de vos propres noms de domaine. 
	 * Val.P3Span1.frFR:Fastmail est le service que j'utilise pour la messagerie personnelle et le DNS 
	 * Val.P3Span1.enUS:Also, certbot will ask you to create several TXT DNS records with random values for your domain names you specified to prove that you own the domain. 
	 * Val.P3Span1.enUS:This will take some time to do every 3 months, so I recommend a service that will let you manage the DNS of your own domain names. 
	 * Val.P3Span1.enUS:Fastmail is the service that I use for both personal email and DNS 
	 * 
	 * Val.P3A1: fastmail.com
	 * 
	 * Val.P3Span2.frFR:. Fastmail est basé en Australie et protège la confidentialité de votre messagerie, contrairement à certains autres fournisseurs de messagerie. 
	 * Val.P3Span2.frFR:Avec Fastmail, je peux me connecter, même à partir de mon appli Fastmail sur mon mobile, et gérer mon DNS. 
	 * Val.P3Span2.frFR:Je peux gérer autant de noms de domaine que je le souhaite avec Fastmail. 
	 * Val.P3Span2.frFR:Je dit à l'équipe de support du bureau d'enregistrement de domaine où j'ai acheté le domaine, les serveurs de noms de fastmail.com (ns1.messagingengine.com, ns2.messagingengine.com) et j'ajoute le domaine dans Fastmail. 
	 * Val.P3Span2.frFR:Ensuite, je peux gérer les enregistrements DNS une fois les modifications sont faites pour tous mes domaines. 
	 * Val.P3Span2.frFR:J'ajoute un enregistrement TXT et une valeur pour chaque défi certbot et enregistre les modifications. 
	 * Val.P3Span2.frFR:Autant que je sache, les enregistrements TXT sont enregistrés immédiatement. 
	 * Val.P3Span2.enUS:. Fastmail is Australia based, and they protect your email privacy, unlike some other email providers. 
	 * Val.P3Span2.enUS:With Fastmail, I can login, even from my Fastmail phone app, and manage my DNS. 
	 * Val.P3Span2.enUS:I can manage as many domain names as I want with Fastmail. 
	 * Val.P3Span2.enUS:I just tell the support team of the domain registrar where I purchased the domain, the name servers of fastmail.com (ns1.messagingengine.com, ns2.messagingengine.com) and add the domain in Fastmail. 
	 * Val.P3Span2.enUS:Then I can manage the DNS records, after the changes are made for all my domains. 
	 * Val.P3Span2.enUS:So I add a TXT record and value for each certbot challenge and save the changes. 
	 * Val.P3Span2.enUS:As far as I can tell, the TXT records are recorded immediately. 
	 */
	protected void _questionCertbot3(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-cloud-download
	 * Val.H3Span.frFR:Comment télécharger le code source de PostgreSQL ? 
	 * Val.H3Span.enUS:How do I download the PostgreSQL source code? 
	 * Val.H4I:fab fa-git
	 * Val.H4Span.frFR:Cloner le code source avec la commande git. 
	 * Val.H4Span.enUS:Clone the source code with the git command. 
	 * Val.PreSpan1:git
	 * Val.PreSpan2: clone
	 * Val.PreSpan3: git://git.postgresql.org/git/postgresql.git
	 * Val.PreSpan4: /usr/local/src/pgsql
	 * 
	 * Val.Ol2Li1.frFR:git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. 
	 * Val.Ol2Li1.enUS:git: The distributed revision control system for most open source software. 
	 * Val.Ol2Li2.frFR:clone : Cloner un référentiel dans un répertoire. 
	 * Val.Ol2Li2.enUS:clone: Clone a repository into a directory. 
	 * Val.Ol2Li3.frFR:git://git.postgresql.org/git/postgresql.git : URL git vers le référentiel de code source PostgreSQL. 
	 * Val.Ol2Li3.enUS:git://git.postgresql.org/git/postgresql.git: The git URL to the PostgreSQL source code repository. 
	 * Val.Ol2Li4.frFR:/usr/local/src/pgsql : Répertoire dans lequel le code source PostgreSQL sera cloné. 
	 * Val.Ol2Li4.enUS:/usr/local/src/pgsql: The directory where the PostgreSQL source code will be cloned. 
	 */  
	protected void _questionClonerSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-code-branch
	 * Val.H3Span.frFR:Comment choisir une version récente de PostgreSQL ? 
	 * Val.H3Span.enUS:How do I pick a recent version of PostgreSQL? 
	 * Val.H4I:far fa-tag
	 * Val.H4Span.frFR:Listez toutes les tags du référentiel git. 
	 * Val.H4Span.enUS:List all the tags in the git repository. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/pgsql
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: tag)
	 * 
	 * Val.Ol2Li1.frFR:(cd : Changer de répertoire temporairement avec la parenthèse ouverte. 
	 * Val.Ol2Li1.enUS:(cd: Change directory temporarily, because of the open parenthesis. 
	 * Val.Ol2Li2.frFR:/usr/local/src/pgsql : Répertoire dans lequel le code source PostgreSQL a été cloné. 
	 * Val.Ol2Li2.enUS:/usr/local/src/pgsql: The directory where the PostgreSQL source code was cloned. 
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
	 * Val.H3Span.frFR:Comment changer de version du code source de PostgreSQL ? 
	 * Val.H3Span.enUS:How do I switch versions of the PostgreSQL source code? 
	 * Val.H4I:far fa-code-commit
	 * Val.H4Span.frFR:Checkout la tag git. 
	 * Val.H4Span.enUS:Checkout the git tag. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/pgsql
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: checkout
	 * Val.PreSpan6: REL_11_3)
	 * 
	 * Val.Ol2Li1:(cd
	 * Val.Ol2Li2:/usr/local/src/pgsql
	 * Val.Ol2Li3:&&
	 * Val.Ol2Li4:git
	 * Val.Ol2Li5.frFR:checkout : Checkout une branche dans l’arbre de travail. 
	 * Val.Ol2Li5.enUS:checkout: Checkout a branch to the working tree. 
	 * Val.Ol2Li6.frFR:REL_11_3) : La dernière tag pour baser la branche. 
	 * Val.Ol2Li6.enUS:REL_11_3): The latest tag to base the branch from. 
	 */  
	protected void _questionCheckoutTag(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-tools
	 * Val.H3Span.frFR:Comment contruire le code source de PostgreSQL ? 
	 * Val.H3Span.enUS:How do I build the PostgreSQL source code? 
	 * Val.H4I:far fa-terminal
	 * Val.H4Span.frFR:Construisez PostgreSQL avec la commande configure. 
	 * Val.H4Span.enUS:Build PostgreSQL with the configure command. 
	 * 
	 * Val.Pre1Span01:(cd
	 * Val.Pre1Span02: /usr/local/src/pgsql
	 * Val.Pre1Span03: &&
	 * Val.Pre1Span04: ./configure
	 * Val.Pre1Span05: --with-openssl
	 * Val.Pre1Span06: --with-libxml
	 * Val.Pre1Span07: --with-libxslt
	 * Val.Pre1Span08: --with-systemd
	 * Val.Pre1Span09: --with-selinux
	 * Val.Pre1Span10: --prefix=/opt/pgsql)
	 * 
	 * Val.Ol1Li01:(cd
	 * Val.Ol1Li02:/usr/local/src/pgsql
	 * Val.Ol1Li03:&&
	 * Val.Ol1Li04.frFR:./configure : Un script de configuration C++ pour compiler PostgreSQL. 
	 * Val.Ol1Li04.enUS:./configure: A C++ configure script to compile PostgreSQL. 
	 * Val.Ol1Li05.frFR:--with-openssl : Construisez PostgreSQL avec le support OpenSSL pour des connexions TLS sécurisées à la base de données. 
	 * Val.Ol1Li05.enUS:--with-openssl: Build PostgreSQL with OpenSSL support for secure TLS connections to the database. 
	 * Val.Ol1Li06.frFR:--with-libxml : Construisez PostgreSQL avec le support XML. 
	 * Val.Ol1Li06.enUS:--with-libxml: Build PostgreSQL with XML support. 
	 * Val.Ol1Li07.frFR:--with-libxslt : Utilisez le support XSLT lors de la construction de contrib/xml2. 
	 * Val.Ol1Li07.enUS:--with-libxslt: Use XSLT support when building contrib/xml2. 
	 * Val.Ol1Li08.frFR:--with-systemd : Construisez PostgreSQL avec le support pour le gestionnaire de services systemd pour Linux. 
	 * Val.Ol1Li08.enUS:--with-systemd: Build PostgreSQL with support for the systemd service manager for Linux. 
	 * Val.Ol1Li09.frFR:--with-selinux : Construisez PostgreSQL avec des fonctionnalités Linux supplémentaires améliorant la sécurité pour fournir une couche de sécurité supplémentaire. 
	 * Val.Ol1Li09.frFR:Chaque accès à une table ou à une fonction initiée par une requête DML sera vérifié par rapport à la stratégie de sécurité du système. 
	 * Val.Ol1Li09.enUS:--with-selinux: Build PostgreSQL with extra Security-Enhanced Linux features to provide an additional layer of security. 
	 * Val.Ol1Li09.enUS:Each table or function access initiated by a DML query will be checked against the system security policy. 
	 * Val.Ol1Li10.frFR:--prefix=/opt/pgsql) : Construire l'application PostgreSQL complète et fermez la parenthèse. 
	 * Val.Ol1Li10.enUS:--prefix=/opt/pgsql): The prefix is the directory where several other subdirectories will be created with PostgreSQL files. 
	 * Val.Ol1Li10.enUS:/opt/pgsql/bin will contain PostgreSQL binaries. 
	 * Val.Ol1Li10.enUS:/opt/pgsql/include will contain PostgreSQL headers. 
	 * Val.Ol1Li10.enUS:/opt/pgsql/lib will contain PostgreSQL shared libraries. 
	 * Val.Ol1Li10.enUS:/opt/pgsql/share will contain PostgreSQL documentation and other files. 
	 * 
	 * Val.Pre2Span1:(cd
	 * Val.Pre2Span2: /usr/local/src/pgsql
	 * Val.Pre2Span3: &&
	 * Val.Pre2Span4: make
	 * Val.Pre2Span5: world)
	 * 
	 * Val.Ol2Li1:(cd
	 * Val.Ol2Li2:/usr/local/src/pgsql
	 * Val.Ol2Li3:&&
	 * Val.Ol2Li4.frFR:make: Compilez le code source de PostgreSQL. 
	 * Val.Ol2Li4.enUS:make: Compile the PostgreSQL source code. 
	 * Val.Ol2Li5.frFR:world): Pour construire tout ce qui peut être construit, y compris la documentation (HTML et pages de manuel), ainsi que les modules supplémentaires (contrib). 
	 * Val.Ol2Li5.enUS:world): To build everything that can be built, including the documentation (HTML and man pages), and the additional modules (contrib). 
	 * 
	 * Val.Pre3Span1:(cd
	 * Val.Pre3Span2: /usr/local/src/pgsql
	 * Val.Pre3Span3: &&
	 * Val.Pre3Span4: make
	 * Val.Pre3Span5: install-world)
	 * 
	 * Val.Ol3Li1:(cd
	 * Val.Ol3Li2:/usr/local/src/pgsql
	 * Val.Ol3Li3:&&
	 * Val.Ol3Li4:make
	 * Val.Ol3Li5.frFR:install-world): En construisant le monde ci-dessus, cela installe tout, y compris la documentation. 
	 * Val.Ol3Li5.enUS:install-world): By building the world above, this installs everything, including the documentation. 
	 */  
	protected void _questionConstruireSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-map-pin
	 * Val.H3Span.frFR:Après avoir installé PostgreSQL, où se trouve mon répertoire de données ? 
	 * Val.H3Span.enUS:After installing PostgreSQL, where is my data directory? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire pgsql dans /srv. 
	 * Val.H4Span.enUS:Create a pgsql directory in /srv. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /srv/pgsql
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:install
	 * Val.Ol2Li3:-d
	 * Val.Ol2Li4:-o
	 * Val.Ol2Li5:$USER
	 * Val.Ol2Li6:-g
	 * Val.Ol2Li7:$USER
	 * Val.Ol2Li8.frFR:/srv est un bon endroit pour installer des serveurs logicielles open source telles que PostgreSQL qui fonctionnent comme un service. 
	 * Val.Ol2Li8.enUS:/srv is a good place to install open source software serveurs like PostgreSQL that run as a service. 
	 */  
	protected void _questionMkdirServeur(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-database
	 * Val.H3Span.frFR:Comment créer une nouvelle base de données PostgreSQL ? 
	 * Val.H3Span.enUS:How do I create a new PostgreSQL database? 
	 * Val.H4I:far fa-table
	 * Val.H4Span.frFR:Comment initialiser un nouveau serveur PostgreSQL. 
	 * Val.H4Span.enUS:How to initialize a new PostgreSQL server. 
	 * 
	 * Val.P1.frFR:Même après avoir compilé le code source de PostgreSQL, vous ne possédez pas encore de base de données PostgreSQL. 
	 * Val.P1.frFR:Vous n'avez que des binaires et des outils PostgreSQL. 
	 * Val.P1.frFR:Vous devez configurer un serveur de base de données PostgreSQL pour exécuter et stocker les données. 
	 * Val.P1.enUS:Even after you compiled the PostgreSQL source code, you don't yet have a PostgreSQL database. 
	 * Val.P1.enUS:You only have PostgreSQL binaries and tools. 
	 * Val.P1.enUS:You need to setup a PostgreSQL database server to run and store data. 
	 * 
	 * Val.PreSpan1:/opt/pgsql/bin/initdb
	 * Val.PreSpan2: -D
	 * Val.PreSpan3: /srv/pgsql
	 * Val.PreSpan4: -W
	 * 
	 * Val.Ol2Li1.frFR:/opt/pgsql/bin/initdb : Initialise un cluster de base de données PostgreSQL. 
	 * Val.Ol2Li1.enUS:/opt/pgsql/bin/initdb: Initializes a PostgreSQL database cluster. 
	 * Val.Ol2Li2.frFR:checkout : Choisissez un répertoire pour le nouveau serveur de base de données PostgreSQL. 
	 * Val.Ol2Li2.enUS:checkout: Choose a directory for the new PostgreSQL database server. 
	 * Val.Ol2Li3.frFR:/srv/pgsql : Le répertoire du nouveau serveur de base de données PostgreSQL. 
	 * Val.Ol2Li3.enUS:/srv/pgsql: The directory of the new PostgreSQL database server. 
	 * Val.Ol2Li4.frFR:-W : Demander un mot de passe pour le nouveau super utilisateur. 
	 * Val.Ol2Li4.enUS:-W: Prompt for a password for the new superuser. 
	 */  
	protected void _questionDonnees(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-alarm-clock
	 * Val.H3Span.frFR:Comment puis-je exécuter PostgreSQL tout le temps au démarrage de mon ordinateur ? 
	 * Val.H3Span.enUS:How do I run PostgreSQL all the time, when my computer starts up? 
	 * Val.H4I:far fa-layer-plus
	 * Val.H4Span.frFR:Comment exécuter PostgreSQL en tant que service systemd. 
	 * Val.H4Span.enUS:How to run PostgreSQL as a systemd service. 
	 * 
	 * Val.PreSpan1:echo '
	 * Val.PreSpan1Br:[Unit]
	 * Val.PreSpan2Br.frFR:Description=Serveur de base de données PostgreSQL. 
	 * Val.PreSpan2Br.enUS:Description=PostgreSQL database server.
	 * Val.PreSpan3Br:After=syslog.target network.target
	 * Val.PreSpan3Br:
	 * Val.PreSpan3Br:[Service]
	 * Val.PreSpan3Br:Type=forking
	 * Val.PreSpan3Br:Environment=PGDATA=/srv/pgsql PGPORT=5432
	 * Val.PreSpan3Br:User='"$USER"'
	 * Val.PreSpan3Br:Group='"$USER"'
	 * Val.PreSpan3Br:ExecStart=/opt/pgsql/bin/pg_ctl start -D ${PGDATA} -s -o "-p ${PGPORT}" -w -t 300
	 * Val.PreSpan3Br:ExecStop=/opt/pgsql/bin/pg_ctl stop -D ${PGDATA} -s -m fast
	 * Val.PreSpan3Br:ExecReload=/opt/pgsql/bin/pg_ctl reload -D ${PGDATA} -s
	 * Val.PreSpan3Br:TimeoutSec=300
	 * Val.PreSpan3Br:
	 * Val.PreSpan3Br:[Install]
	 * Val.PreSpan3Br:WantedBy=multi-user.target
	 * Val.PreSpan3Br:' | sudo tee /usr/lib/systemd/system/pgsql.service
	 * 
	 * Val.Ol2Li01.frFR:echo '...' : Écrivez une chaîne dans la console. 
	 * Val.Ol2Li01.enUS:echo '...': Write a string to the console. 
	 * Val.Ol2Li02.frFR:[Unit] : Un fichier de configuration « Unit » dont le nom se termine par ".service" code les informations relatives à un processus contrôlé et supervisé par systemd. 
	 * Val.Ol2Li02.enUS:[Unit]: A unit configuration file whose name ends in ".service" encodes information about a process controlled and supervised by systemd. 
	 * Val.Ol2Li03.frFR:Description=... : La description du service. 
	 * Val.Ol2Li03.enUS:Description=...: The description of the service. 
	 * Val.Ol2Li04.frFR:After=... : Demander un mot de passe pour le nouveau super utilisateur. 
	 * Val.Ol2Li04.enUS:After=...: The PostgreSQL service will be started after the following dependencies. 
	 * Val.Ol2Li05.frFR:[Service] : Les informations relatives à un service contrôlé et supervisé par systemd. 
	 * Val.Ol2Li05.enUS:[Service]: Information about a service controlled and supervised by systemd. 
	 * Val.Ol2Li06.frFR:Type=forking : Parce qu'il est prévu que le processus configuré avec ExecStart= appelle fork() pendant son démarrage. 
	 * Val.Ol2Li06.enUS:Type=forking: Because it is expected that the process configured with ExecStart= will call fork() as part of its start-up. 
	 * Val.Ol2Li07.frFR:Environment=PGDATA=/srv/pgsql PGPORT=5432 : Définir le répertoire de données PostgreSQL et le port comme variables d’environnement du système à utiliser plus tard dans des commandes. 
	 * Val.Ol2Li07.enUS:Environment=PGDATA=/srv/pgsql PGPORT=5432: To set the PostgreSQL data directory and port as system environment variables to use in later commands. 
	 * Val.Ol2Li08.frFR:User=... : L'utilisateur en tant que l'utilisateur actuel qui exécutera le service. 
	 * Val.Ol2Li08.enUS:User=...: The user as the current user that will run the service. 
	 * Val.Ol2Li09.frFR:Group=... : L'utilisateur de groupe en tant que l'utilisateur actuel qui exécutera le service. 
	 * Val.Ol2Li09.enUS:Group=...: The group user as the current user that will run the service. 
	 * Val.Ol2Li10.frFR:ExecStart=... : La commande PostgreSQL qui lancera le service. 
	 * Val.Ol2Li10.enUS:ExecStart=...: The PostgreSQL command that will start the service. 
	 * Val.Ol2Li11.frFR:ExecStart=... : La commande PostgreSQL qui arrêtera le service. 
	 * Val.Ol2Li11.enUS:ExecStart=...: The PostgreSQL command that will stop the service. 
	 * Val.Ol2Li12.frFR:ExecReload=... : La commande PostgreSQL qui redémarrera le service. 
	 * Val.Ol2Li12.enUS:ExecReload=...: The PostgreSQL command that will restart the service. 
	 * Val.Ol2Li13.frFR:TimeoutSec=300 : Le nombre de secondes avant d'abandonner le démarrage du service. 
	 * Val.Ol2Li13.enUS:TimeoutSec=300: The number of seconds before giving up starting the service. 
	 * Val.Ol2Li14.frFR:[Install] : Cette section est facultative et permet de définir le comportement ou une unité s’il est activé ou désactivé. 
	 * Val.Ol2Li14.enUS:[Install]: This section is optional and is used to define the behavior or a unit if it is enabled or disabled. 
	 * Val.Ol2Li15.frFR:WantedBy=multi-user.target : Lorsque le service est activé, un répertoire appelé multi-user.target.wants sera créé dans /etc/systemd/system (s'il n'est pas déjà disponible) et un lien symbolique vers l'unité actuelle sera placé dans celui-ci. 
	 * Val.Ol2Li15.enUS:WantedBy=multi-user.target: When the service is enabled, a directory called multi-user.target.wants will be created within /etc/systemd/system (if not already available) and a symbolic link to the current unit will be placed within. 
	 * Val.Ol2Li16.frFR:| : Lisez la chaîne dans la commande suivante. 
	 * Val.Ol2Li16.enUS:|: Read the string into the following command. 
	 * Val.Ol2Li17:sudo
	 * Val.Ol2Li18.frFR:tee : Ecrire une chaîne dans un fichier. 
	 * Val.Ol2Li18.enUS:tee: Write a string to a file. 
	 * Val.Ol2Li19.frFR:/usr/lib/systemd/system/pgsql.service : Un nouveau fichier de service systemd dans lequel écrire pour PostgreSQL. 
	 * Val.Ol2Li19.enUS:/usr/lib/systemd/system/pgsql.service: A new systemd service file to write to for PostgreSQL. 
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
	 * Val.H3Span.frFR:Comment activer le service PostgreSQL? 
	 * Val.H3Span.enUS:How do I enable the PostgreSQL service? 
	 * Val.H4I:far fa-toggle-on
	 * Val.H4Span.frFR:Utilisez la commande systemctl enable. 
	 * Val.H4Span.enUS:Use the systemctl enable command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: enable
	 * Val.PreSpan4: pgsql
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:enable : Activer un ou plusieurs fichiers d'unités ou instances de fichiers d'unités. 
	 * Val.Ol2Li3.enUS:enable: Enable one or more unit files or unit file instances. 
	 * Val.Ol2Li4.frFR:pgsql : Activez le service PostgreSQL pour démarrer au démarrage de l'ordinateur. 
	 * Val.Ol2Li4.enUS:pgsql: Enable the PostgreSQL service to start when the computer starts. 
	 */  
	protected void _questionSystemctlEnable(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-pause-circle
	 * Val.H3Span.frFR:Comment démarrer le service PostgreSQL? 
	 * Val.H3Span.enUS:How do I start the PostgreSQL service? 
	 * Val.H4I:far fa-play-circle
	 * Val.H4Span.frFR:Utilisez la commande systemctl start. 
	 * Val.H4Span.enUS:Use the systemctl start command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: start
	 * Val.PreSpan4: pgsql
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:start : Activer un ou plusieurs services. 
	 * Val.Ol2Li3.enUS:start: Start one or more services. 
	 * Val.Ol2Li4.frFR:pgsql : Démarrez le service PostgreSQL. 
	 * Val.Ol2Li4.enUS:pgsql: Start the PostgreSQL service. 
	 */  
	protected void _questionSystemctlStart(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-clipboard
	 * Val.H3Span.frFR:Comment puis-je m'assurer que le service PostgreSQL a démarré avec succès ? 
	 * Val.H3Span.enUS:How do I make sure the PostgreSQL service started successfully? 
	 * Val.H4I:far fa-clipboard-check
	 * Val.H4Span.frFR:Utilisez la commande systemctl status. 
	 * Val.H4Span.enUS:Use the systemctl status command. 
	 * 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: systemctl
	 * Val.PreSpan3: status
	 * Val.PreSpan4: pgsql
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:systemctl
	 * Val.Ol2Li3.frFR:status : Vérifiez le statut d'un ou plusieurs services. 
	 * Val.Ol2Li3.enUS:status: Check the status of one or more services. 
	 * Val.Ol2Li4.frFR:pgsql : Vérifiez le statut du service PostgreSQL. 
	 * Val.Ol2Li4.enUS:pgsql: Check the status of the PostgreSQL service. 
	 * 
	 * Val.P2.frFR:Et voilà, profitez de votre tout nouvel et puissant serveur de base de données open source. 
	 * Val.P2.enUS:Now enjoy that latest and greatest open source database server of yours. 
	 */  
	protected void _questionSystemctlStatus(PageHtml o) {
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
	 * Val.TableTr1Td2I:far fa-fast-forward
	 * Val.TableTr1Td3I:far fa-file-code
	 * Val.TableTr1Td4I:far fa-pen-nib
	 * Val.TableTr2Td1.frFR:16 Mai 2019
	 * Val.TableTr2Td1.enUS:May 16 2019
	 * Val.TableTr2Td2.frFR:Comment installer la dernière version de PostgreSQL ? 
	 * Val.TableTr2Td2.enUS:How do I install the latest version of PostgreSQL. 
	 * Val.TableTr2Td3.frFR:Installer PostgreSQL à partir du code source. 
	 * Val.TableTr2Td3.enUS:Install PostgreSQL from the source code. 
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
	 * Val.TableTr02Td2.frFR:Comment installer les dépendences pour PostgreSQL ? 
	 * Val.TableTr02Td2.enUS:How do I install the dependencies for PostgreSQL? 
	 * Val.TableTr02Td3Span1I:far fa-cookie
	 * Val.TableTr02Td4.frFR:Construisez les dépendances avec yum. 
	 * Val.TableTr02Td4.enUS:Build the dependencies with yum. 
	 * 
	 * Val.TableTr03Td1I:far fa-files-medical
	 * Val.TableTr03Td2.frFR:Où est-ce que je place le code source PostgreSQL ? 
	 * Val.TableTr03Td2.enUS:Where do I put the PostgreSQL source code? 
	 * Val.TableTr03Td3I:far fa-folder-tree
	 * Val.TableTr03Td4.frFR:Créez un répertoire PostgreSQL dans /usr/local/src. 
	 * Val.TableTr03Td4.enUS:Create a PostgreSQL directory in /usr/local/src. 
	 * 
	 * Val.TableTr04Td1I:far fa-map-pin
	 * Val.TableTr04Td2.frFR:Où puis-je installer PostgreSQL ? 
	 * Val.TableTr04Td2.enUS:Where do I install PostgreSQL? 
	 * Val.TableTr04Td3Span1I:far fa-folder-tree
	 * Val.TableTr04Td4.frFR:Créez un répertoire PostgreSQL dans /opt. 
	 * Val.TableTr04Td4.enUS:Create a PostgreSQL directory in /opt. 
	 * 
	 * Val.TableTr05Td1I:far fa-cloud-download
	 * Val.TableTr05Td2.frFR:Comment télécharger le code source de PostgreSQL ? 
	 * Val.TableTr05Td2.enUS:How do I download the PostgreSQL source code? 
	 * Val.TableTr05Td3I:fab fa-git
	 * Val.TableTr05Td4.frFR:Cloner le code source avec la commande git. 
	 * Val.TableTr05Td4.enUS:Clone the source code with the git command. 
	 * 
	 * Val.TableTr06Td1I:far fa-code-branch
	 * Val.TableTr06Td2.frFR:Comment choisir une version récente de PostgreSQL ? 
	 * Val.TableTr06Td2.enUS:How do I pick a recent version of PostgreSQL? 
	 * Val.TableTr06Td3I:far fa-tag
	 * Val.TableTr06Td4.frFR:Listez toutes les tags du référentiel git. 
	 * Val.TableTr06Td4.enUS:List all the tags in the git repository. 
	 * 
	 * Val.TableTr07Td1I:far fa-code-merge
	 * Val.TableTr07Td2.frFR:Comment changer de version du code source de PostgreSQL ? 
	 * Val.TableTr07Td2.enUS:How do I switch versions of the PostgreSQL source code? 
	 * Val.TableTr07Td3I:far fa-code-commit
	 * Val.TableTr07Td4.frFR:Checkout la tag git. 
	 * Val.TableTr07Td4.enUS:Checkout the git tag. 
	 * 
	 * Val.TableTr08Td1I:far fa-tools
	 * Val.TableTr08Td2.frFR:Comment contruire le code source de PostgreSQL ? 
	 * Val.TableTr08Td2.enUS:How do I build the PostgreSQL source code? 
	 * Val.TableTr08Td3I:far fa-terminal
	 * Val.TableTr08Td4.frFR:Construisez PostgreSQL avec la commande configure. 
	 * Val.TableTr08Td4.enUS:Build PostgreSQL with the configure command. 
	 * 
	 * Val.TableTr09Td1I:far fa-map-pin
	 * Val.TableTr09Td2.frFR:Après avoir installé PostgreSQL, où se trouve mon répertoire de données ? 
	 * Val.TableTr09Td2.enUS:After installing PostgreSQL, where is my data directory? 
	 * Val.TableTr09Td3I:far fa-folder-tree
	 * Val.TableTr09Td4.frFR:Créez un répertoire pgsql dans /srv. 
	 * Val.TableTr09Td4.enUS:Create a pgsql directory in /srv. 
	 * 
	 * Val.TableTr10Td1I:far fa-database
	 * Val.TableTr10Td2.frFR:Comment créer une nouvelle base de données PostgreSQL ? 
	 * Val.TableTr10Td2.enUS:How do I create a new PostgreSQL database? 
	 * Val.TableTr10Td3I:far fa-table
	 * Val.TableTr10Td4.frFR:Comment initialiser un nouveau serveur PostgreSQL. 
	 * Val.TableTr10Td4.enUS:How to initialize a new PostgreSQL server. 
	 * 
	 * Val.TableTr11Td1I:far fa-alarm-clock
	 * Val.TableTr11Td2.frFR:Comment puis-je exécuter PostgreSQL tout le temps au démarrage de mon ordinateur ? 
	 * Val.TableTr11Td2.enUS:How do I run PostgreSQL all the time, when my computer starts up? 
	 * Val.TableTr11Td3I:far fa-layer-plus
	 * Val.TableTr11Td4.frFR:Comment exécuter PostgreSQL en tant que service systemd. 
	 * Val.TableTr11Td4.enUS:How to run PostgreSQL as a systemd service. 
	 * 
	 * Val.TableTr12Td1I:far fa-search
	 * Val.TableTr12Td2.frFR:Comment le système connaît-il le nouveau service ? 
	 * Val.TableTr12Td2.enUS:How does the system know about the new service? 
	 * Val.TableTr12Td3I:far fa-redo-alt
	 * Val.TableTr12Td4.frFR:Rechargez le daemon systemd. 
	 * Val.TableTr12Td4.enUS:Reload the systemd daemon. 
	 * 
	 * Val.TableTr13Td1I:far fa-toggle-off
	 * Val.TableTr13Td2.frFR:Comment activer le service PostgreSQL? 
	 * Val.TableTr13Td2.enUS:How do I enable the PostgreSQL service? 
	 * Val.TableTr13Td3I:far fa-toggle-on
	 * Val.TableTr13Td4.frFR:Utilisez la commande systemctl enable. 
	 * Val.TableTr13Td4.enUS:Use the systemctl enable command. 
	 * 
	 * Val.TableTr14Td1I:far fa-pause-circle
	 * Val.TableTr14Td2.frFR:Comment démarrer le service PostgreSQL? 
	 * Val.TableTr14Td2.enUS:How do I start the PostgreSQL service? 
	 * Val.TableTr14Td3I:far fa-play-circle
	 * Val.TableTr14Td4.frFR:Utilisez la commande systemctl start. 
	 * Val.TableTr14Td4.enUS:Use the systemctl start command. 
	 * 
	 * Val.TableTr15Td1I:far fa-clipboard
	 * Val.TableTr15Td2.frFR:Comment puis-je m'assurer que le service PostgreSQL a démarré avec succès ? 
	 * Val.TableTr15Td2.enUS:How do I make sure the PostgreSQL service started successfully? 
	 * Val.TableTr15Td3I:far fa-clipboard-check
	 * Val.TableTr15Td4.frFR:Utilisez la commande systemctl status. 
	 * Val.TableTr15Td4.enUS:Use the systemctl status command. 
	 */ 
	protected void _recapituler3(PageHtml o) {      
	}
}
