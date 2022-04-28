package org.computate.site.frFR.cours.c001.l001;             

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.page.parti.PageParagraphe;
import org.computate.site.frFR.page.parti.QuestionReponse;


/** 
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/001-choisir-nom-domaine
 * ApiUriRechercheEnUSPage: /enUS/course/001/001-choose-domain-name
 * PageRechercheFrFRPage: C001L001ChoisirNomDomaineFrFRPage
 * PageRechercheEnUSPage: C001L001ChoisirNomDomaineEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNom.frFR: le leçon
 * UnNom.enUS: a lesson
 * 
 * H1.frFR: Quel est l'étape première pour créer mon propre site Web ? 
 * H1.enUS: What is the first step to creating my own website? 
 * 
 * H2.frFR: Choisir un nom de domaine. 
 * H2.enUS: Choose a domain name. 
 * 
 * Titre.frFR: Quel est l'étape première pour créer mon propre site Web ? Choisir un nom de domaine. 
 * Titre.enUS: What is the first step to creating my own website? Choose a domain name. 
 * 
 * Description.frFR: Quel est l'étape première pour créer mon propre site Web ? Choisir un nom de domaine. 
 * Description.enUS: What is the first step to creating my own website? Choose a domain name. 
 * 
 * PageSimple: true
 * NomPluriel.frFR: lessons
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: book
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 781
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 781
 * VideoId.frFR: ZJTDpIpan8M
 * VideoId.enUS: sBcDnQj9_QM
*/  
public class C001L001ChoisirNomDomaine extends C001L001ChoisirNomDomaineGen<C001Lecon> {      

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(1);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L001ChoisirNomDomaine.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaine_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.C001L001ChoisirNomDomaine_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaine_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.C001L001ChoisirNomDomaine_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaineEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaineFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaineEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L001ChoisirNomDomaineFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.C001L001ChoisirNomDomaine_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.C001L001ChoisirNomDomaine_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine.C001L001ChoisirNomDomaineVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L001ChoisirNomDomaine_H1);
		addPageRecherche_frFR(C001L001ChoisirNomDomaine_H2);
		addPageRecherche_frFR(C001L001ChoisirNomDomaineVals);
	}

	public void htmlBody() {
		super.htmlBody();
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	/**
	 * 
	 * Val.P.frFR:Envisagez-vous de créer votre propre site Web ? 
	 * Val.P.frFR:Peut-être vous demandez-vous quelle est la première étape de la création de votre propre site Web ? 
	 * Val.P.enUS:Are you thinking about launching your own website? 
	 * Val.P.enUS:Are you wondering what the very first step is to creating your own website? 
	 */
	protected void _intro(PageHtml o) {
	}

	/**
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. 
	 * Val.P.frFR:La première chose à faire est de choisir votre nom de domaine, afin que vous puissiez commencer dans la bonne direction. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:I will help you create your own successful website, on your own computer, using open-source software. 
	 * Val.P.enUS:The first thing you should do is choose your domain name so you can get started in the right direction. 
	 */
	protected void _moi(PageHtml o) {
	}

	/**
	 * Val.H3I:fas fa-history
	 * Val.H3Span.frFR:Est-t-il important d'acheter un nom de domaine à l'avance ? 
	 * Val.H3Span.enUS:Is it important to purchase a domain name ahead of time? 
	 * Val.H4I:fas fa-map-pin
	 * Val.H4Span.frFR:Vous devez savoir maintenant comment vous appelez votre site, afin que vous ne seriez pas perdu. 
	 * Val.H4Span.enUS:You need to know now what your site will be called so you don't get lost. 
	 * Val.P.frFR:Vous pouvez commencer aujourd'hui avec votre propre ordinateur à construire votre propre site Web, mais vous devez comprendre ce que le site s'appele. 
	 * Val.P.frFR:Le destin du nom de votre ordinateur en dépend. 
	 * Val.P.frFR:Les répertoires où vous mettez votre site Web l'attendent. 
	 * Val.P.frFR:Toutes les applications qui font partie du site Web devront le connaître. 
	 * Val.P.frFR:Alors, passez du temps et pensez au .com, .fr ou .nimporte qui représentera votre vision, puis revenez ici et je vais vous aider à partir de là. 
	 * Val.P.enUS:You can start today with your very own computer building your own website, but you must figure out what it will be called. 
	 * Val.P.enUS:The fate of the name of your computer depends on it. 
	 * Val.P.enUS:The directories where you will be putting your website are waiting for it. 
	 * Val.P.enUS:All the applications that are part of the website will need to know it. 
	 * Val.P.enUS:So go take some time and think of the perfect .com, .org or .whatever that will represent your vision, and then come back here and I'll help you from there. 
	 */  
	protected void _aLAvance(PageHtml o) {      
	}

	/**  
	 * Val.H3I:fas fa-credit-card
	 * Val.H3Span.frFR:Où puis-je acheter un nom de domaine ? 
	 * Val.H3Span.enUS:Where can I purchase a domain name? 
	 * Val.H4I:fas fa-building
	 * Val.H4Span.frFR:Il y a tellement d'enregistreurs de noms de domaine à choisir, mais vous pouvez essayer brinkster.com ou gandi.net. 
	 * Val.H4Span.enUS:There are so many domain name registrars to choose from, but you might try brinkster.com or gandi.net. 
	 * Val.PSpan1.frFR:Je ne peux pas vous dire où l'endroit le moins cher ou le lieu le plus digne de confiance est d'acheter le nom de domaine de votre site. 
	 * Val.PSpan1.frFR:Mais je peux vous dire où j'ai acheté le mien il y a 12 ans, c'est 
	 * Val.PSpan1A.frFR:https://secure.brinkster.com/Domains/
	 * Val.PSpan2.frFR:. Mais brinkster.com n'est pas le moins chèr ($ 19.83 cette année). 
	 * Val.PSpan2.frFR:Peut-être vous voulez essayer 
	 * Val.PSpan2A.frFR:https://www.gandi.net/fr
	 * Val.PSpan3.frFR:. Leurs prix varient, mais ils ont des noms de domaine publicitaire à un bon prix, et beaucoup d'autres options à choisir. 
	 * Val.PSpan1.enUS:I can't tell you where the cheapest place or most trustworthy place is to purchase your site's domain name. 
	 * Val.PSpan1.enUS:But I can tell you where I purchased mine 12 years ago, which is 
	 * Val.PSpan1A1.enUS:https://secure.brinkster.com/Domains/
	 * Val.PSpan2.enUS:. But brinkster.com is not the cheapest ($19.83 this year). 
	 * Val.PSpan2.enUS:You may also want to try 
	 * Val.PSpan2A2.enUS:https://www.gandi.net/en
	 * Val.PSpan3.enUS:. Their prices vary, but they have very cheap promotional domain names, and many more options to choose from. 
	 */   
	protected void _acheter(PageHtml o) {      
	}

	/**  
	 * 
	 * Val.H3I:fab fa-wpforms
	 * Val.H3Span.frFR:Qu'est-ce que je choisis comme un nom de domaine ? 
	 * Val.H3Span.enUS:What do I choose for a domain name? 
	 * Val.H4I:fas fa-bullhorn
	 * Val.H4Span.frFR:Trouver un nom de domaine qui atteindra votre public. 
	 * Val.H4Span.enUS:Find a domain name that will reach your audience. 
	 * Val.P.frFR:Je ne connais pas votre passion, mais trouvez un nom de domaine qui atteindra votre public. 
	 * Val.P.frFR:C'est bon si c'est court. 
	 * Val.P.frFR:Que ce soit un .com, ou .org, ou .fr, tout dépend de vous aussi. 
	 * Val.P.frFR:Créez un endroit dont vous serez fier un jour ! 
	 * Val.P.enUS:I don't know your passion, but find a domain name that will reach your audience. 
	 * Val.P.enUS:It's good if it is short and sweet. 
	 * Val.P.enUS:Whether it is a .com, or .org, or .net or whatever is up to you too. 
	 * Val.P.enUS:Just make it a place you will be proud of someday! 
	 */     
	protected void _appeler(PageHtml o) {      
	}

	/**  
	 * 
	 * Val.H3I:fas fa-cart-plus
	 * Val.H3Span.frFR:Qu'est-ce que je fais après j'ai acheté un nom de domaine ? 
	 * Val.H3Span.enUS:What do I do after I bought a domain name? 
	 * Val.H4I:fas fa-clipboard-check
	 * Val.H4Span.frFR:Gérer votre domaine. 
	 * Val.H4Span.enUS:Manage your domain. 
	 * Val.PSpan1.frFR:Laissez-moi vous montrer comment gérer un nom de domaine. 
	 * Val.PSpan1.frFR:Je vais me connecter au site de mon propre enregistreur, 
	 * Val.PSpan1A.frFR:https://secure.brinkster.com/
	 * Val.PSpan2.frFR:. 
	 * Val.PSpan1.enUS:Let me show you what it's like to manage a domain name. 
	 * Val.PSpan1.enUS:I will log into my own registrar's site, 
	 * Val.PSpan1A.enUS:https://secure.brinkster.com/
	 * Val.PSpan2.enUS:. 
	 */     
	protected void _apres1(PageHtml o) {      
	}

	/**  
	 * Val.UlLi1.frFR:Je clique sur « Login ». 
	 * Val.UlLi2.frFR:Je clique encore sur « Login ». 
	 * Val.UlLi3.frFR:Je clique sur « DOMAIN NAMES ». 
	 * Val.UlLi3.frFR:Et là vous pouvez voir mes noms de domaine qui sont encore vivants, et ceux qui sont morts. 
	 * Val.UlLi3.frFR:Ainsi, les domaines expirent chaque année et peuvent être renouvelés chaque année. 
	 * Val.UlLi4.frFR:Je peux également gérer mon site, je clique sur « Manage ». 
	 * Val.UlLi1.enUS:I click on "Login". 
	 * Val.UlLi2.enUS:I click again on "Login". 
	 * Val.UlLi3.enUS:I click on "DOMAIN NAMES". 
	 * Val.UlLi3.enUS:And there you can see my domain names that are still alive, and those that are dead. 
	 * Val.UlLi3.enUS:So domains expire yearly, and they can be renewed each year. 
	 * Val.UlLi4.enUS:I can also manage my site, so I will click on "Manage". 
	 */     
	protected void _apres2(PageHtml o) {      
	}
	public void htmlBodyApres2() { 
	}

	/**  
	 * Val.UlLi1.frFR:Si je clique sur « Update Domain Registrant Information », je peux mettre à jour mon nom et mon adresse pour m'assurer que je reçois du spam de tous les internautes qui ont remarqué que j'ai créé un nouveau domaine. 
	 * Val.UlLi1.frFR:Je recommanderais un Boîte à la poste pour votre entreprise, plutôt que votre adresse personnelle, pour plus d'intimité. 
	 * Val.UlLi1.enUS:If I click on "Update Domain Registrant Information" I can update my name and address information to make sure I receive spam from everyone on the Web who noticed I created a new domain. 
	 * Val.UlLi1.enUS:I would recommend a P.O. Box for your business, rather than your home address, for more privacy. 
	 */     
	protected void _apres3(PageHtml o) {      
	}

	/**  
	 * Val.UlLi1.frFR:Si je reviens et clique sur « Update Name Servers », je peux rediriger mon site vers une autre société DNS que mon registraire, brinkster.com. 
	 * Val.UlLi1.frFR:C'est pratique pour moi, car j'utilise en fait mon fournisseur de messagerie SMTP fastmail.com comme fournisseur DNS, donc j'ai mis les serveurs de noms de mon fournisseur DNS là-bas. 
	 * Val.UlLi1.frFR:Vous n'avez pas besoin d'un fournisseur de DNS différent, vous pouvez également utiliser votre bureau d'enregistrement pour le courrier électronique, mais j'ai choisi Fastmail pour leur confidentialité et leur excellente interface de messagerie. 
	 * Val.UlLi1.enUS:If I go back and click on "Update Name Servers" I can point my website to a different DNS company than my registrar, brinkster.com. 
	 * Val.UlLi1.enUS:This is handy for me, because I actually use my email SMTP provider fastmail.com as my DNS provider, so I put in the name servers of my DNS provider there. 
	 * Val.UlLi1.enUS:You don't need a different DNS provider, you can usually use your registrar for email as well, but I choose fastmail for their privacy and excellent email interface. 
	 */     
	protected void _apres4(PageHtml o) {      
	}

	/**  
	 * Val.UlLi1.frFR:Dans un futur leçon, nous parlerons de la création d'une adresse IP statique afin que les utilisateurs puissent trouver votre serveur Web, sur votre ordinateur, sur votre domaine. 
	 * Val.UlLi1.frFR:Lorsque vous avez cela, vous pouvez demander à l'équipe de support de votre enregistreur, de créer pour vous des « enregistrements A » sur votre adresse IP statique. 
	 * Val.UlLi1.frFR:Par exemple, je demanderais que deux enregistrements A soient créés pour « computate.org » et « *.computate.org » sur mon adresse IP statique. 
	 * Val.UlLi1.frFR:Mais comme j'utilise fastmail pour mon DNS, je peux créer mes propres enregistrements A pour chacun de mes domaines dans mon compte, ce qui est utile. 
	 * Val.UlLi1.enUS:In a future lesson, we'll talk about creating a static IP address so that users can find your web server, on your computer, at your domain. 
	 * Val.UlLi1.enUS:When you have this, you can ask the support team at your registrar, to create for you some "A records" at your static IP. 
	 * Val.UlLi1.enUS:For example, I would ask for two A records to be created for "computate.org" and "*.computate.org" to my static IP address. 
	 * Val.UlLi1.enUS:But since I use fastmail for my DNS, I can actually create my own A records for any of my domains in my account, which is nice. 
	 */     
	protected void _apres5(PageHtml o) {      
	}

	/**  
	 * 
	 * Val.H3I:fas fa-fast-forward
	 * Val.H3Span.frFR:Puis-je commencer à développer mon site localement avant de choisir mon nom de domaine ? 
	 * Val.H3Span.enUS:Can I start developing my website locally before deciding on my domain name? 
	 * Val.H4I:fas fa-list-ol
	 * Val.H4Span.frFR:Le nom d'hôte de votre ordinateur dépendra de votre nom de domaine. 
	 * Val.H4Span.enUS:The hostname of your computer will depend on your domain name. 
	 * Val.P.frFR:Si vous ne connaissez pas votre nom de domaine, cela vous gâchera plus tard. 
	 * Val.P.frFR:Avoir un nom d'hôte qui est un sous-domaine de votre nom de domaine facilite le développement et la mise en ligne de votre site. 
	 * Val.P.frFR:Vous pouvez attribuer à vos ordinateurs des noms d'hôtes qui sont des sous-domaines de votre propre nom de domaine afin de faciliter le développement et l'affichage local et public de votre site à partir de la même URL. 
	 * Val.P.frFR:J'aime créer un répertoire pour votre nom de domaine pour stocker des certificats SSL et d'autres fichiers spécifiques au domaine au même endroit pour être synchronisé avec tous vos ordinateurs. 
	 * Val.P.frFR:Alors, au lieu de vous compliquer la vie, profitez de cette opportunité pour acheter votre nom de domaine, c'est moins de 20 euros par an! 
	 * Val.P.frFR:Vous pouvez maintenant continuer à lancer votre propre site Web avec succès sur votre propre ordinateur. 
	 * Val.P.enUS:If you don't know your domain name, it's going to bite you later. 
	 * Val.P.enUS:Having a hostname that is a subdomain of your domain name makes it easier to develop and bring your site live. 
	 * Val.P.enUS:You can give your computers hostnames that are subdomains of your own domain name to make it easy to develop and view your site locally and publicly from the same URL. 
	 * Val.P.enUS:I like creating a directory for your domain name for storing SSL certs and other domain specific files together in the same place to be synced to all your computers. 
	 * Val.P.enUS:So instead of making it harder on yourself, take this exciting opportunity to buy your domain name, it's less than $20 per year! 
	 * Val.P.enUS:Now you can continue to launch your own successful website on your own computer. 
	 */     
	protected void _plusTard(QuestionReponse o) {      
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
	 * Val.TableTr1Td2I:fas fa-question
	 * Val.TableTr1Td3I:fas fa-hand-receiving
	 * Val.TableTr1Td4I:fas fa-pen-nib
	 * Val.TableTr2Td1.frFR:23 Avril 2019
	 * Val.TableTr2Td1.enUS:April 23 2019
	 * Val.TableTr2Td2.frFR:Première étape pour créer un site web ? 
	 * Val.TableTr2Td2.enUS:First step to create a website? 
	 * Val.TableTr2Td3.frFR:Choisir un nom de domaine. 
	 * Val.TableTr2Td3.enUS:Choose a domain name. 
	 * Val.TableTr2Td4.frFR:Par Christophe Tate
	 * Val.TableTr2Td4.enUS:By Christopher Tate
	 */  
	protected void _recapituler2(PageHtml o) {      
	}

	/**
	 * 
	 * Val.TableTr1Td1I:fas fa-question
	 * Val.TableTr1Td2.frFR:Questions
	 * Val.TableTr1Td2.enUS:Questions
	 * Val.TableTr1Td3I:fas fa-bullhorn
	 * Val.TableTr1Td4.frFR:Reponses
	 * Val.TableTr1Td4.enUS:Answers
	 * 
	 * Val.TableTr2Td1I:fas fa-history
	 * Val.TableTr2Td2.frFR:Devrais je l'acheter à l'avance ? 
	 * Val.TableTr2Td2.enUS:Should I buy it ahead of time? 
	 * Val.TableTr2Td3I:fas fa-map-pin
	 * Val.TableTr2Td4.frFR:Savoir maintenant comment vous appelez votre site. 
	 * Val.TableTr2Td4.enUS:Know what your site will be called. 
	 * 
	 * Val.TableTr3Td1I:fas fa-credit-card
	 * Val.TableTr3Td2.frFR:Où puis-je acheter un nom de domaine ? 
	 * Val.TableTr3Td2.enUS:Where can I purchase a domain name? 
	 * Val.TableTr3Td3I:fas fa-building
	 * Val.TableTr3Td4.frFR:Essayez brinkster.com ou gandi.net. 
	 * Val.TableTr3Td4.enUS:Try brinkster.com or gandi.net. 
	 * 
	 * Val.TableTr4Td1I:fab fa-wpforms
	 * Val.TableTr4Td2.frFR:Qu'est-ce que je choisis comme un nom de domaine ? 
	 * Val.TableTr4Td2.enUS:What do I choose for a domain name? 
	 * Val.TableTr4Td3I:fas fa-bullhorn
	 * Val.TableTr4Td4.frFR:Atteindra votre public. 
	 * Val.TableTr4Td4.enUS:Reach your audience. 
	 * 
	 * Val.TableTr5Td1I:fas fa-cart-plus
	 * Val.TableTr5Td2.frFR:Quoi faire après j'ai acheté un nom de domaine ? 
	 * Val.TableTr5Td2.enUS:What do I do after I've bought a domain name? 
	 * Val.TableTr5Td3I:fas fa-clipboard-check
	 * Val.TableTr5Td4.frFR:Gérer votre domaine. 
	 * Val.TableTr5Td4.enUS:Manage your domain. 
	 * 
	 * Val.TableTr6Td1I:fas fa-fast-forward
	 * Val.TableTr6Td2.frFR:Puis-je choisir un nom de domaine plus tard ? 
	 * Val.TableTr6Td2.enUS:Can I pick a domain name later? 
	 * Val.TableTr6Td3I:fas fa-list-ol
	 * Val.TableTr6Td4.frFR:Le nom d'hôte de votre ordinateur le dépendra. 
	 * Val.TableTr6Td4.enUS:Your computer hostname will depend on it. 
	 */  
	protected void _recapituler3(PageHtml o) {      
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Texte: true
	 * Langue: frFR
	 **/
	protected void _leconRecherche_frFR(List<String> l) {
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Texte: true
	 * Langue: enUS
	 **/
	protected void _leconRecherche_enUS(List<String> l) {
		
	}
}
