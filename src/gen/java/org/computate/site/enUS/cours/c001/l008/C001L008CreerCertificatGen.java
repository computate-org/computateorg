package org.computate.site.enUS.cours.c001.l008;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import org.computate.site.enUS.cluster.Cluster;
import javax.imageio.ImageIO;
import org.computate.site.enUS.page.parti.PagePart;
import org.apache.commons.exec.DefaultExecutor;
import java.awt.image.BufferedImage;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import java.io.File;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L008CreerCertificatGen<DEV> extends C001Lecon {

	public static final String C001L008CreerCertificat_UnNom = "a lesson";
	public static final String C001L008CreerCertificat_Ce = "this ";
	public static final String C001L008CreerCertificat_CeNom = "this lesson";
	public static final String C001L008CreerCertificat_Un = "an ";
	public static final String C001L008CreerCertificat_LeNom = "the lesson";
	public static final String C001L008CreerCertificat_NomSingulier = "lesson";
	public static final String C001L008CreerCertificat_NomPluriel = "lessons";
	public static final String C001L008CreerCertificat_NomActuel = "current lesson";
	public static final String C001L008CreerCertificat_TousNom = "the lessons";
	public static final String C001L008CreerCertificat_RechercherTousNomPar = "search lessons by ";
	public static final String C001L008CreerCertificat_H1 = "What can I do once I have purchased a domain name? ";
	public static final String C001L008CreerCertificat_H2 = "Obtain a valid TLS certificate for free, for security and credibility. ";
	public static final String C001L008CreerCertificat_Titre = "Obtain a valid TLS certificate for free, for security and credibility. ";
	public static final String C001L008CreerCertificat_LesNoms = "the lessons";
	public static final String C001L008CreerCertificat_AucunNomTrouve = "no lesson found";
	public static final String C001L008CreerCertificat_NomVar = "lesson";
	public static final String C001L008CreerCertificat_DeNom = "of lesson";
	public static final String C001L008CreerCertificat_Couleur = "green";
	public static final String C001L008CreerCertificat_IconeGroupe = "regular";
	public static final String C001L008CreerCertificat_IconeNom = "question";
	public static final String C001L008CreerCertificatFrFRPage_Uri = "/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement";
	public static final String C001L008CreerCertificatFrFRPage_ImageUri = "/png/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement-999.png";
	public static final String C001L008CreerCertificatEnUSPage_Uri = "/enUS/course/001/008-how-to-obtain-free-tls-certificates";
	public static final String C001L008CreerCertificatEnUSPage_ImageUri = "/png/enUS/course/001/008-how-to-obtain-free-tls-certificates-999.png";

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. ";
	public static final String moiP2 = "First, congratulations on obtaining your own domain name to launch your site. ";
	public static final String moiP3 = "Along with a domain name, you will also want to obtain a TLS certificate. ";
	public static final String moiP4 = "The good news is that it is completely free, thanks to open source technology. ";
	public static final String moiP5 = "With a certificate you can secure communications to your site. ";
	public static final String moiP6 = "You can sign your code and ensure that it is valid when deployed on the cloud. ";
	public static final String moiP7 = "You can also setup secure OAuth2/OpenID Connect Single Sign On to all of your applications. ";
	public static final String moiP8 = "I will show you how to obtain these certificates and generate the keystores to use in your applications the open source way. ";
	public static final String moiP = moiP1 + moiP2 + moiP3 + moiP4 + moiP5 + moiP6 + moiP7 + moiP8;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml moi = new PageHtml();
	public Couverture<PageHtml> moiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
	 * <br/>
	 * @param moi est l'entité déjà construit. 
	 **/
	protected abstract void _moi(PageHtml o);

	public PageHtml getMoi() {
		return moi;
	}

	public void setMoi(PageHtml moi) {
		this.moi = moi;
		this.moiCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat moiInit() {
		if(moi != null) {
			((C001L008CreerCertificat)this).avantPagePart(moi, "moi");
			((C001L008CreerCertificat)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyMoi(PageHtml o) {
		{ e("p").a("class", " moiP ").f();
			sx(moiP1);
			sx(moiP2);
			sx(moiP3);
			sx(moiP4);
			sx(moiP5);
			sx(moiP6);
			sx(moiP7);
			sx(moiP8);
		} g("p");
	}
	public void htmlBodyMoi() {
		moi.htmlAvant();
		htmlBodyMoi(moi);
		moi.htmlApres();
	}

	/////////////////////////
	// questionDependences //
	/////////////////////////

	public static final String questionDependencesH3I1 = "far fa-conveyor-belt-alt";
	public static final String questionDependencesH3I = questionDependencesH3I1;
	public static final String questionDependencesH3Span1 = "How do I install the dependencies for PostgreSQL? ";
	public static final String questionDependencesH3Span = questionDependencesH3Span1;
	public static final String questionDependencesH4I1 = "far fa-cookie";
	public static final String questionDependencesH4I = questionDependencesH4I1;
	public static final String questionDependencesH4Span1 = "Build the dependencies with yum. ";
	public static final String questionDependencesH4Span = questionDependencesH4Span1;
	public static final String questionDependencesPre1Span11 = "sudo";
	public static final String questionDependencesPre1Span1 = questionDependencesPre1Span11;
	public static final String questionDependencesPre1Span21 = " yum";
	public static final String questionDependencesPre1Span2 = questionDependencesPre1Span21;
	public static final String questionDependencesPre1Span31 = " install";
	public static final String questionDependencesPre1Span3 = questionDependencesPre1Span31;
	public static final String questionDependencesPre1Span41 = " -y";
	public static final String questionDependencesPre1Span4 = questionDependencesPre1Span41;
	public static final String questionDependencesPre1Span51 = " postgresql";
	public static final String questionDependencesPre1Span5 = questionDependencesPre1Span51;
	public static final String questionDependencesOl2Li11 = "sudo: The command to install yum repositories begins with the command sudo. ";
	public static final String questionDependencesOl2Li12 = "The \"sudo\" command allows your current user to have root privileges for a few minutes after entering your password. ";
	public static final String questionDependencesOl2Li1 = questionDependencesOl2Li11 + questionDependencesOl2Li12;
	public static final String questionDependencesOl2Li21 = "yum Stands for \"Yellowdog Updater Modified\", but nobody knows it as yellowdog, just yum. ";
	public static final String questionDependencesOl2Li22 = "CentOS manages software packages and RPM application files with yum. ";
	public static final String questionDependencesOl2Li2 = questionDependencesOl2Li21 + questionDependencesOl2Li22;
	public static final String questionDependencesOl2Li31 = "install: For installing new yum packages. ";
	public static final String questionDependencesOl2Li3 = questionDependencesOl2Li31;
	public static final String questionDependencesOl2Li41 = "-y: Suppress messages asking to confirm if you want to install the software. ";
	public static final String questionDependencesOl2Li4 = questionDependencesOl2Li41;
	public static final String questionDependencesOl2Li51 = "certbot: The package name of the Extra Packages for Enterprise Linux repository. ";
	public static final String questionDependencesOl2Li5 = questionDependencesOl2Li51;
	public static final String questionDependencesPre3Span11 = "sudo";
	public static final String questionDependencesPre3Span1 = questionDependencesPre3Span11;
	public static final String questionDependencesPre3Span21 = " yum";
	public static final String questionDependencesPre3Span2 = questionDependencesPre3Span21;
	public static final String questionDependencesPre3Span31 = " install";
	public static final String questionDependencesPre3Span3 = questionDependencesPre3Span31;
	public static final String questionDependencesPre3Span41 = " -y";
	public static final String questionDependencesPre3Span4 = questionDependencesPre3Span41;
	public static final String questionDependencesPre3Span51 = " certbot";
	public static final String questionDependencesPre3Span5 = questionDependencesPre3Span51;
	public static final String questionDependencesOl4Li11 = "sudo";
	public static final String questionDependencesOl4Li1 = questionDependencesOl4Li11;
	public static final String questionDependencesOl4Li21 = "yum";
	public static final String questionDependencesOl4Li2 = questionDependencesOl4Li21;
	public static final String questionDependencesOl4Li31 = "install";
	public static final String questionDependencesOl4Li3 = questionDependencesOl4Li31;
	public static final String questionDependencesOl4Li41 = "-y";
	public static final String questionDependencesOl4Li4 = questionDependencesOl4Li41;
	public static final String questionDependencesOl4Li51 = "certbot: A free, automated certificate authority that aims to lower the barriers to entry for encrypting all HTTP traffic on the Internet. ";
	public static final String questionDependencesOl4Li5 = questionDependencesOl4Li51;

	/**	L'entité « questionDependences »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDependences = new PageHtml();
	public Couverture<PageHtml> questionDependencesCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDependences").o(questionDependences);

	/**	<br/>L'entité « questionDependences »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionDependences">Trouver l'entité questionDependences dans Solr</a>
	 * <br/>
	 * @param questionDependences est l'entité déjà construit. 
	 **/
	protected abstract void _questionDependences(PageHtml o);

	public PageHtml getQuestionDependences() {
		return questionDependences;
	}

	public void setQuestionDependences(PageHtml questionDependences) {
		this.questionDependences = questionDependences;
		this.questionDependencesCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionDependencesInit() {
		if(questionDependences != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionDependences, "questionDependences");
			((C001L008CreerCertificat)this).avantPagePart(questionDependences, "questionDependences");
		}
		if(!questionDependencesCouverture.dejaInitialise) {
			_questionDependences(questionDependences);
		}
		questionDependences.initLoinPourClasse(requeteSite_);
		questionDependencesCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionDependences(PageHtml o) {
		{ e("h3").a("class", " questionDependencesH3 ").f();
			{ e("i").a("class", questionDependencesH3I1, " site-menu-icon questionDependencesH3I ").f();
			} g("i");
			{ e("span").a("class", " questionDependencesH3Span ").f();
				sx(questionDependencesH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionDependencesH4 ").f();
			{ e("i").a("class", questionDependencesH4I1, " site-menu-icon questionDependencesH4I ").f();
			} g("i");
			{ e("span").a("class", " questionDependencesH4Span ").f();
				sx(questionDependencesH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionDependencesPre1 questionDependencesPre odd ").f();
			{ e("span").a("class", " questionDependencesPre1Span1 questionDependencesPre1Span odd ").f();
				sx(questionDependencesPre1Span11);
			} g("span");
			{ e("span").a("class", " questionDependencesPre1Span2 questionDependencesPre1Span even ").f();
				sx(questionDependencesPre1Span21);
			} g("span");
			{ e("span").a("class", " questionDependencesPre1Span3 questionDependencesPre1Span odd ").f();
				sx(questionDependencesPre1Span31);
			} g("span");
			{ e("span").a("class", " questionDependencesPre1Span4 questionDependencesPre1Span even ").f();
				sx(questionDependencesPre1Span41);
			} g("span");
			{ e("span").a("class", " questionDependencesPre1Span5 questionDependencesPre1Span odd ").f();
				sx(questionDependencesPre1Span51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionDependencesOl2 questionDependencesOl even ").f();
			{ e("li").a("class", " questionDependencesOl2Li1 questionDependencesOl2Li odd ").f();
				sx(questionDependencesOl2Li11);
				sx(questionDependencesOl2Li12);
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li2 questionDependencesOl2Li even ").f();
				sx(questionDependencesOl2Li21);
				sx(questionDependencesOl2Li22);
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li3 questionDependencesOl2Li odd ").f();
				sx(questionDependencesOl2Li31);
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li4 questionDependencesOl2Li even ").f();
				sx(questionDependencesOl2Li41);
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li5 questionDependencesOl2Li odd ").f();
				sx(questionDependencesOl2Li51);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionDependencesPre3 questionDependencesPre odd ").f();
			{ e("span").a("class", " questionDependencesPre3Span1 questionDependencesPre3Span odd ").f();
				sx(questionDependencesPre3Span11);
			} g("span");
			{ e("span").a("class", " questionDependencesPre3Span2 questionDependencesPre3Span even ").f();
				sx(questionDependencesPre3Span21);
			} g("span");
			{ e("span").a("class", " questionDependencesPre3Span3 questionDependencesPre3Span odd ").f();
				sx(questionDependencesPre3Span31);
			} g("span");
			{ e("span").a("class", " questionDependencesPre3Span4 questionDependencesPre3Span even ").f();
				sx(questionDependencesPre3Span41);
			} g("span");
			{ e("span").a("class", " questionDependencesPre3Span5 questionDependencesPre3Span odd ").f();
				sx(questionDependencesPre3Span51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionDependencesOl4 questionDependencesOl even ").f();
			{ e("li").a("class", " questionDependencesOl4Li1 questionDependencesOl4Li odd ").f();
				sx(questionDependencesOl4Li11);
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li2 questionDependencesOl4Li even ").f();
				sx(questionDependencesOl4Li21);
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li3 questionDependencesOl4Li odd ").f();
				sx(questionDependencesOl4Li31);
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li4 questionDependencesOl4Li even ").f();
				sx(questionDependencesOl4Li41);
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li5 questionDependencesOl4Li odd ").f();
				sx(questionDependencesOl4Li51);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionDependences() {
		questionDependences.htmlAvant();
		htmlBodyQuestionDependences(questionDependences);
		questionDependences.htmlApres();
	}

	//////////////////////
	// questionMkdirSrv //
	//////////////////////

	public static final String questionMkdirSrvH3I1 = "far fa-files-medical";
	public static final String questionMkdirSrvH3I = questionMkdirSrvH3I1;
	public static final String questionMkdirSrvH3Span1 = "Where do I put the certificates, keys and keystores for my site? ";
	public static final String questionMkdirSrvH3Span = questionMkdirSrvH3Span1;
	public static final String questionMkdirSrvH4I1 = "far fa-folder-tree";
	public static final String questionMkdirSrvH4I = questionMkdirSrvH4I1;
	public static final String questionMkdirSrvH4Span1 = "Create a pgsql directory in /srv. ";
	public static final String questionMkdirSrvH4Span = questionMkdirSrvH4Span1;
	public static final String questionMkdirSrvPreSpan11 = "sudo";
	public static final String questionMkdirSrvPreSpan1 = questionMkdirSrvPreSpan11;
	public static final String questionMkdirSrvPreSpan21 = " install";
	public static final String questionMkdirSrvPreSpan2 = questionMkdirSrvPreSpan21;
	public static final String questionMkdirSrvPreSpan31 = " -d";
	public static final String questionMkdirSrvPreSpan3 = questionMkdirSrvPreSpan31;
	public static final String questionMkdirSrvPreSpan41 = " -o";
	public static final String questionMkdirSrvPreSpan4 = questionMkdirSrvPreSpan41;
	public static final String questionMkdirSrvPreSpan51 = " $USER";
	public static final String questionMkdirSrvPreSpan5 = questionMkdirSrvPreSpan51;
	public static final String questionMkdirSrvPreSpan61 = " -g";
	public static final String questionMkdirSrvPreSpan6 = questionMkdirSrvPreSpan61;
	public static final String questionMkdirSrvPreSpan71 = " $USER";
	public static final String questionMkdirSrvPreSpan7 = questionMkdirSrvPreSpan71;
	public static final String questionMkdirSrvPreSpan61 = " -m";
	public static final String questionMkdirSrvPreSpan6 = questionMkdirSrvPreSpan61;
	public static final String questionMkdirSrvPreSpan71 = " rwxr-xr-x";
	public static final String questionMkdirSrvPreSpan7 = questionMkdirSrvPreSpan71;
	public static final String questionMkdirSrvPreSpan81 = " /srv/certbot";
	public static final String questionMkdirSrvPreSpan8 = questionMkdirSrvPreSpan81;
	public static final String questionMkdirSrvOl2Li11 = "sudo";
	public static final String questionMkdirSrvOl2Li1 = questionMkdirSrvOl2Li11;
	public static final String questionMkdirSrvOl2Li21 = "install: Creates directories and sets attributes on the new directory. ";
	public static final String questionMkdirSrvOl2Li2 = questionMkdirSrvOl2Li21;
	public static final String questionMkdirSrvOl2Li31 = "-d: Create  directories. ";
	public static final String questionMkdirSrvOl2Li3 = questionMkdirSrvOl2Li31;
	public static final String questionMkdirSrvOl2Li41 = "-o: Set ownership on the directory (super-user only). ";
	public static final String questionMkdirSrvOl2Li4 = questionMkdirSrvOl2Li41;
	public static final String questionMkdirSrvOl2Li51 = "$USER: The current user to make the owner of the directory. ";
	public static final String questionMkdirSrvOl2Li5 = questionMkdirSrvOl2Li51;
	public static final String questionMkdirSrvOl2Li61 = "-g: Set group ownership on the directory (super-user only). ";
	public static final String questionMkdirSrvOl2Li6 = questionMkdirSrvOl2Li61;
	public static final String questionMkdirSrvOl2Li71 = "$USER: The current user to make the group owner of the directory. ";
	public static final String questionMkdirSrvOl2Li7 = questionMkdirSrvOl2Li71;
	public static final String questionMkdirSrvOl2Li61 = "-m: Set group ownership on the directory (super-user only). ";
	public static final String questionMkdirSrvOl2Li6 = questionMkdirSrvOl2Li61;
	public static final String questionMkdirSrvOl2Li71 = "700: Give read, write and execute permissions to only the user of the directory. ";
	public static final String questionMkdirSrvOl2Li7 = questionMkdirSrvOl2Li71;
	public static final String questionMkdirSrvOl2Li81 = "/srv is a good place to install open source software serveurs and your certificates, keys and keystores. ";
	public static final String questionMkdirSrvOl2Li8 = questionMkdirSrvOl2Li81;

	/**	L'entité « questionMkdirSrv »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMkdirSrv = new PageHtml();
	public Couverture<PageHtml> questionMkdirSrvCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMkdirSrv").o(questionMkdirSrv);

	/**	<br/>L'entité « questionMkdirSrv »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionMkdirSrv">Trouver l'entité questionMkdirSrv dans Solr</a>
	 * <br/>
	 * @param questionMkdirSrv est l'entité déjà construit. 
	 **/
	protected abstract void _questionMkdirSrv(PageHtml o);

	public PageHtml getQuestionMkdirSrv() {
		return questionMkdirSrv;
	}

	public void setQuestionMkdirSrv(PageHtml questionMkdirSrv) {
		this.questionMkdirSrv = questionMkdirSrv;
		this.questionMkdirSrvCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionMkdirSrvInit() {
		if(questionMkdirSrv != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionMkdirSrv, "questionMkdirSrv");
			((C001L008CreerCertificat)this).avantPagePart(questionMkdirSrv, "questionMkdirSrv");
		}
		if(!questionMkdirSrvCouverture.dejaInitialise) {
			_questionMkdirSrv(questionMkdirSrv);
		}
		questionMkdirSrv.initLoinPourClasse(requeteSite_);
		questionMkdirSrvCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionMkdirSrv(PageHtml o) {
		{ e("h3").a("class", " questionMkdirSrvH3 ").f();
			{ e("i").a("class", questionMkdirSrvH3I1, " site-menu-icon questionMkdirSrvH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirSrvH3Span ").f();
				sx(questionMkdirSrvH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMkdirSrvH4 ").f();
			{ e("i").a("class", questionMkdirSrvH4I1, " site-menu-icon questionMkdirSrvH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirSrvH4Span ").f();
				sx(questionMkdirSrvH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionMkdirSrvPre ").f();
			{ e("span").a("class", " questionMkdirSrvPreSpan1 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan11);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan2 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan21);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan3 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan31);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan4 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan41);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan5 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan51);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan6 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan61);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan7 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan71);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan6 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan61);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan7 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan71);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan8 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan81);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirSrvOl2 questionMkdirSrvOl even ").f();
			{ e("li").a("class", " questionMkdirSrvOl2Li1 questionMkdirSrvOl2Li odd ").f();
				sx(questionMkdirSrvOl2Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li2 questionMkdirSrvOl2Li even ").f();
				sx(questionMkdirSrvOl2Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li3 questionMkdirSrvOl2Li odd ").f();
				sx(questionMkdirSrvOl2Li31);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li4 questionMkdirSrvOl2Li even ").f();
				sx(questionMkdirSrvOl2Li41);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li5 questionMkdirSrvOl2Li odd ").f();
				sx(questionMkdirSrvOl2Li51);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li6 questionMkdirSrvOl2Li even ").f();
				sx(questionMkdirSrvOl2Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li7 questionMkdirSrvOl2Li odd ").f();
				sx(questionMkdirSrvOl2Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li6 questionMkdirSrvOl2Li even ").f();
				sx(questionMkdirSrvOl2Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li7 questionMkdirSrvOl2Li odd ").f();
				sx(questionMkdirSrvOl2Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li8 questionMkdirSrvOl2Li even ").f();
				sx(questionMkdirSrvOl2Li81);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMkdirSrv() {
		questionMkdirSrv.htmlAvant();
		htmlBodyQuestionMkdirSrv(questionMkdirSrv);
		questionMkdirSrv.htmlApres();
	}

	/////////////////////
	// questionCertbot //
	/////////////////////

	public static final String questionCertbotH3I1 = "far fa-file-certificate";
	public static final String questionCertbotH3I = questionCertbotH3I1;
	public static final String questionCertbotH3Span1 = "How do I obtain my certificate? ";
	public static final String questionCertbotH3Span = questionCertbotH3Span1;
	public static final String questionCertbotH4I1 = "far fa-stamp";
	public static final String questionCertbotH4I = questionCertbotH4I1;
	public static final String questionCertbotH4Span1 = "Use the certbot command. ";
	public static final String questionCertbotH4Span = questionCertbotH4Span1;
	public static final String questionCertbotPreSpan011 = "sudo";
	public static final String questionCertbotPreSpan01 = questionCertbotPreSpan011;
	public static final String questionCertbotPreSpan021 = " certbot";
	public static final String questionCertbotPreSpan02 = questionCertbotPreSpan021;
	public static final String questionCertbotPreSpan031 = " --manual";
	public static final String questionCertbotPreSpan03 = questionCertbotPreSpan031;
	public static final String questionCertbotPreSpan041 = " --preferred-challenges dns";
	public static final String questionCertbotPreSpan04 = questionCertbotPreSpan041;
	public static final String questionCertbotPreSpan051 = " --server https://acme-v02.api.letsencrypt.org/directory";
	public static final String questionCertbotPreSpan05 = questionCertbotPreSpan051;
	public static final String questionCertbotPreSpan061 = " certonly";
	public static final String questionCertbotPreSpan06 = questionCertbotPreSpan061;
	public static final String questionCertbotPreSpan071 = " -d example.com";
	public static final String questionCertbotPreSpan07 = questionCertbotPreSpan071;
	public static final String questionCertbotPreSpan081 = " -d *.example.com";
	public static final String questionCertbotPreSpan08 = questionCertbotPreSpan081;
	public static final String questionCertbotPreSpan091 = " -d *.apps.example.com";
	public static final String questionCertbotPreSpan09 = questionCertbotPreSpan091;
	public static final String questionCertbotPreSpan101 = " -d example.org -d *.example.org -d *.apps.example.org";
	public static final String questionCertbotPreSpan10 = questionCertbotPreSpan101;
	public static final String questionCertbotOl2Li011 = "sudo";
	public static final String questionCertbotOl2Li01 = questionCertbotOl2Li011;
	public static final String questionCertbotOl2Li021 = "certbot: A free, automated certificate authority that aims to lower the barriers to entry for encrypting all HTTP traffic on the Internet. ";
	public static final String questionCertbotOl2Li02 = questionCertbotOl2Li021;
	public static final String questionCertbotOl2Li031 = "--manual: Obtain certificates interactively, or using shell script. ";
	public static final String questionCertbotOl2Li03 = questionCertbotOl2Li031;
	public static final String questionCertbotOl2Li041 = "--preferred-challenges dns: Obtain or renew a certificate, but do not install it. ";
	public static final String questionCertbotOl2Li04 = questionCertbotOl2Li041;
	public static final String questionCertbotOl2Li051 = "--server https://acme-v02.api.letsencrypt.org/directory: Specify a more recent version of a letsencrypt server that allows wildcard domains in certificates. ";
	public static final String questionCertbotOl2Li05 = questionCertbotOl2Li051;
	public static final String questionCertbotOl2Li061 = "certonly: Obtain or renew a certificate, but do not install it. ";
	public static final String questionCertbotOl2Li06 = questionCertbotOl2Li061;
	public static final String questionCertbotOl2Li071 = "-d example.com: Specify your root domain name to include it as a route secured by the certificate. ";
	public static final String questionCertbotOl2Li07 = questionCertbotOl2Li071;
	public static final String questionCertbotOl2Li081 = "-d example.com: Include wildcard domains under your root domain, which would include www for example. ";
	public static final String questionCertbotOl2Li08 = questionCertbotOl2Li081;
	public static final String questionCertbotOl2Li091 = "-d example.com: Wildcard domains do not include subdomains of a wildcard domain, so include additional subdomains as well. ";
	public static final String questionCertbotOl2Li09 = questionCertbotOl2Li091;
	public static final String questionCertbotOl2Li101 = "-d example.com: You can optionally include more than one domain name in the same certificate if you want to, up to a generous amount by letsencrypt. ";
	public static final String questionCertbotOl2Li10 = questionCertbotOl2Li101;
	public static final String questionCertbotP21 = "certbot will ask you questions, like if you're okay having your IP address logged as having requested this certificate. ";
	public static final String questionCertbotP22 = "You can answer Yes, because it is your certificate. ";
	public static final String questionCertbotP23 = "It will probably ask you for your email, which is nice, because they will send you an email when your certificate is a few weeks from expiring. ";
	public static final String questionCertbotP24 = "The certificates expire every 3 months, which is often, but they are free, so you can't complain too much. ";
	public static final String questionCertbotP25 = "Much more expensive certificates might last for 3 years. ";
	public static final String questionCertbotP2 = questionCertbotP21 + questionCertbotP22 + questionCertbotP23 + questionCertbotP24 + questionCertbotP25;
	public static final String questionCertbotP3Span11 = "Also, certbot will ask you to create several TXT DNS records with random values for your domain names you specified to prove that you own the domain. ";
	public static final String questionCertbotP3Span12 = "This will take some time to do every 3 months, so I recommend a service that will let you manage the DNS of your own domain names. ";
	public static final String questionCertbotP3Span13 = "Fastmail is the service that I use for both personal email and DNS ";
	public static final String questionCertbotP3Span1 = questionCertbotP3Span11 + questionCertbotP3Span12 + questionCertbotP3Span13;
	public static final String questionCertbotP3A11 = " fastmail.com";
	public static final String questionCertbotP3A1 = questionCertbotP3A11;
	public static final String questionCertbotP3Span21 = ". Fastmail is Australia based, and they protect your email privacy, unlike some other email providers. ";
	public static final String questionCertbotP3Span22 = "With Fastmail, I can login, even from my Fastmail phone app, and manage my DNS. ";
	public static final String questionCertbotP3Span23 = "I can manage as many domain names as I want with Fastmail. ";
	public static final String questionCertbotP3Span24 = "I just tell the support team of the domain registrar where I purchased the domain, the name servers of fastmail.com (ns1.messagingengine.com, ns2.messagingengine.com) and add the domain in Fastmail. ";
	public static final String questionCertbotP3Span25 = "Then I can manage the DNS records, after the changes are made for all my domains. ";
	public static final String questionCertbotP3Span26 = "So I add a TXT record and value for each certbot challenge and save the changes. ";
	public static final String questionCertbotP3Span27 = "As far as I can tell, the TXT records are recorded immediately. ";
	public static final String questionCertbotP3Span2 = questionCertbotP3Span21 + questionCertbotP3Span22 + questionCertbotP3Span23 + questionCertbotP3Span24 + questionCertbotP3Span25 + questionCertbotP3Span26 + questionCertbotP3Span27;

	/**	L'entité « questionCertbot »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCertbot = new PageHtml();
	public Couverture<PageHtml> questionCertbotCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCertbot").o(questionCertbot);

	/**	<br/>L'entité « questionCertbot »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCertbot">Trouver l'entité questionCertbot dans Solr</a>
	 * <br/>
	 * @param questionCertbot est l'entité déjà construit. 
	 **/
	protected abstract void _questionCertbot(PageHtml o);

	public PageHtml getQuestionCertbot() {
		return questionCertbot;
	}

	public void setQuestionCertbot(PageHtml questionCertbot) {
		this.questionCertbot = questionCertbot;
		this.questionCertbotCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionCertbotInit() {
		if(questionCertbot != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionCertbot, "questionCertbot");
			((C001L008CreerCertificat)this).avantPagePart(questionCertbot, "questionCertbot");
		}
		if(!questionCertbotCouverture.dejaInitialise) {
			_questionCertbot(questionCertbot);
		}
		questionCertbot.initLoinPourClasse(requeteSite_);
		questionCertbotCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionCertbot(PageHtml o) {
		{ e("h3").a("class", " questionCertbotH3 ").f();
			{ e("i").a("class", questionCertbotH3I1, " site-menu-icon questionCertbotH3I ").f();
			} g("i");
			{ e("span").a("class", " questionCertbotH3Span ").f();
				sx(questionCertbotH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionCertbotH4 ").f();
			{ e("i").a("class", questionCertbotH4I1, " site-menu-icon questionCertbotH4I ").f();
			} g("i");
			{ e("span").a("class", " questionCertbotH4Span ").f();
				sx(questionCertbotH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionCertbotPre ").f();
			{ e("span").a("class", " questionCertbotPreSpan01 questionCertbotPreSpan odd ").f();
				sx(questionCertbotPreSpan011);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan02 questionCertbotPreSpan even ").f();
				sx(questionCertbotPreSpan021);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan03 questionCertbotPreSpan odd ").f();
				sx(questionCertbotPreSpan031);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan04 questionCertbotPreSpan even ").f();
				sx(questionCertbotPreSpan041);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan05 questionCertbotPreSpan odd ").f();
				sx(questionCertbotPreSpan051);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan06 questionCertbotPreSpan even ").f();
				sx(questionCertbotPreSpan061);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan07 questionCertbotPreSpan odd ").f();
				sx(questionCertbotPreSpan071);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan08 questionCertbotPreSpan even ").f();
				sx(questionCertbotPreSpan081);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan09 questionCertbotPreSpan odd ").f();
				sx(questionCertbotPreSpan091);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan10 questionCertbotPreSpan even ").f();
				sx(questionCertbotPreSpan101);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCertbotOl2 questionCertbotOl even ").f();
			{ e("li").a("class", " questionCertbotOl2Li01 questionCertbotOl2Li odd ").f();
				sx(questionCertbotOl2Li011);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li02 questionCertbotOl2Li even ").f();
				sx(questionCertbotOl2Li021);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li03 questionCertbotOl2Li odd ").f();
				sx(questionCertbotOl2Li031);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li04 questionCertbotOl2Li even ").f();
				sx(questionCertbotOl2Li041);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li05 questionCertbotOl2Li odd ").f();
				sx(questionCertbotOl2Li051);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li06 questionCertbotOl2Li even ").f();
				sx(questionCertbotOl2Li061);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li07 questionCertbotOl2Li odd ").f();
				sx(questionCertbotOl2Li071);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li08 questionCertbotOl2Li even ").f();
				sx(questionCertbotOl2Li081);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li09 questionCertbotOl2Li odd ").f();
				sx(questionCertbotOl2Li091);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li10 questionCertbotOl2Li even ").f();
				sx(questionCertbotOl2Li101);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionCertbotP2 questionCertbotP even ").f();
			sx(questionCertbotP21);
			sx(questionCertbotP22);
			sx(questionCertbotP23);
			sx(questionCertbotP24);
			sx(questionCertbotP25);
		} g("p");
		{ e("p").a("class", " questionCertbotP3 questionCertbotP odd ").f();
			{ e("span").a("class", " questionCertbotP3Span1 questionCertbotP3Span odd ").f();
				sx(questionCertbotP3Span11);
				sx(questionCertbotP3Span12);
				sx(questionCertbotP3Span13);
			} g("span");
			{ e("a").a("class", " questionCertbotP3A1 questionCertbotP3A odd ").a("href", questionCertbotP3A11).f();
				sx(questionCertbotP3A11);
			} g("a");
			{ e("span").a("class", " questionCertbotP3Span2 questionCertbotP3Span even ").f();
				sx(questionCertbotP3Span21);
				sx(questionCertbotP3Span22);
				sx(questionCertbotP3Span23);
				sx(questionCertbotP3Span24);
				sx(questionCertbotP3Span25);
				sx(questionCertbotP3Span26);
				sx(questionCertbotP3Span27);
			} g("span");
		} g("p");
	}
	public void htmlBodyQuestionCertbot() {
		questionCertbot.htmlAvant();
		htmlBodyQuestionCertbot(questionCertbot);
		questionCertbot.htmlApres();
	}

	//////////////////////////
	// questionClonerSource //
	//////////////////////////

	public static final String questionClonerSourceH3I1 = "far fa-cloud-download";
	public static final String questionClonerSourceH3I = questionClonerSourceH3I1;
	public static final String questionClonerSourceH3Span1 = "How do I download the PostgreSQL source code? ";
	public static final String questionClonerSourceH3Span = questionClonerSourceH3Span1;
	public static final String questionClonerSourceH4I1 = "fab fa-git";
	public static final String questionClonerSourceH4I = questionClonerSourceH4I1;
	public static final String questionClonerSourceH4Span1 = "Clone the source code with the git command. ";
	public static final String questionClonerSourceH4Span = questionClonerSourceH4Span1;
	public static final String questionClonerSourcePreSpan11 = "git";
	public static final String questionClonerSourcePreSpan1 = questionClonerSourcePreSpan11;
	public static final String questionClonerSourcePreSpan21 = " clone";
	public static final String questionClonerSourcePreSpan2 = questionClonerSourcePreSpan21;
	public static final String questionClonerSourcePreSpan31 = " git://git.postgresql.org/git/postgresql.git";
	public static final String questionClonerSourcePreSpan3 = questionClonerSourcePreSpan31;
	public static final String questionClonerSourcePreSpan41 = " /usr/local/src/pgsql";
	public static final String questionClonerSourcePreSpan4 = questionClonerSourcePreSpan41;
	public static final String questionClonerSourceOl2Li11 = "git: The distributed revision control system for most open source software. ";
	public static final String questionClonerSourceOl2Li1 = questionClonerSourceOl2Li11;
	public static final String questionClonerSourceOl2Li21 = "clone: Clone a repository into a directory. ";
	public static final String questionClonerSourceOl2Li2 = questionClonerSourceOl2Li21;
	public static final String questionClonerSourceOl2Li31 = "git://git.postgresql.org/git/postgresql.git: The git URL to the PostgreSQL source code repository. ";
	public static final String questionClonerSourceOl2Li3 = questionClonerSourceOl2Li31;
	public static final String questionClonerSourceOl2Li41 = "/usr/local/src/pgsql: The directory where the PostgreSQL source code will be cloned. ";
	public static final String questionClonerSourceOl2Li4 = questionClonerSourceOl2Li41;

	/**	L'entité « questionClonerSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionClonerSource = new PageHtml();
	public Couverture<PageHtml> questionClonerSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionClonerSource").o(questionClonerSource);

	/**	<br/>L'entité « questionClonerSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionClonerSource">Trouver l'entité questionClonerSource dans Solr</a>
	 * <br/>
	 * @param questionClonerSource est l'entité déjà construit. 
	 **/
	protected abstract void _questionClonerSource(PageHtml o);

	public PageHtml getQuestionClonerSource() {
		return questionClonerSource;
	}

	public void setQuestionClonerSource(PageHtml questionClonerSource) {
		this.questionClonerSource = questionClonerSource;
		this.questionClonerSourceCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionClonerSourceInit() {
		if(questionClonerSource != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionClonerSource, "questionClonerSource");
			((C001L008CreerCertificat)this).avantPagePart(questionClonerSource, "questionClonerSource");
		}
		if(!questionClonerSourceCouverture.dejaInitialise) {
			_questionClonerSource(questionClonerSource);
		}
		questionClonerSource.initLoinPourClasse(requeteSite_);
		questionClonerSourceCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionClonerSource(PageHtml o) {
		{ e("h3").a("class", " questionClonerSourceH3 ").f();
			{ e("i").a("class", questionClonerSourceH3I1, " site-menu-icon questionClonerSourceH3I ").f();
			} g("i");
			{ e("span").a("class", " questionClonerSourceH3Span ").f();
				sx(questionClonerSourceH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionClonerSourceH4 ").f();
			{ e("i").a("class", questionClonerSourceH4I1, " site-menu-icon questionClonerSourceH4I ").f();
			} g("i");
			{ e("span").a("class", " questionClonerSourceH4Span ").f();
				sx(questionClonerSourceH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionClonerSourcePre ").f();
			{ e("span").a("class", " questionClonerSourcePreSpan1 questionClonerSourcePreSpan odd ").f();
				sx(questionClonerSourcePreSpan11);
			} g("span");
			{ e("span").a("class", " questionClonerSourcePreSpan2 questionClonerSourcePreSpan even ").f();
				sx(questionClonerSourcePreSpan21);
			} g("span");
			{ e("span").a("class", " questionClonerSourcePreSpan3 questionClonerSourcePreSpan odd ").f();
				sx(questionClonerSourcePreSpan31);
			} g("span");
			{ e("span").a("class", " questionClonerSourcePreSpan4 questionClonerSourcePreSpan even ").f();
				sx(questionClonerSourcePreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionClonerSourceOl2 questionClonerSourceOl even ").f();
			{ e("li").a("class", " questionClonerSourceOl2Li1 questionClonerSourceOl2Li odd ").f();
				sx(questionClonerSourceOl2Li11);
			} g("li");
			{ e("li").a("class", " questionClonerSourceOl2Li2 questionClonerSourceOl2Li even ").f();
				sx(questionClonerSourceOl2Li21);
			} g("li");
			{ e("li").a("class", " questionClonerSourceOl2Li3 questionClonerSourceOl2Li odd ").f();
				sx(questionClonerSourceOl2Li31);
			} g("li");
			{ e("li").a("class", " questionClonerSourceOl2Li4 questionClonerSourceOl2Li even ").f();
				sx(questionClonerSourceOl2Li41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionClonerSource() {
		questionClonerSource.htmlAvant();
		htmlBodyQuestionClonerSource(questionClonerSource);
		questionClonerSource.htmlApres();
	}

	////////////////////////
	// questionListerTags //
	////////////////////////

	public static final String questionListerTagsH3I1 = "far fa-code-branch";
	public static final String questionListerTagsH3I = questionListerTagsH3I1;
	public static final String questionListerTagsH3Span1 = "How do I pick a recent version of PostgreSQL? ";
	public static final String questionListerTagsH3Span = questionListerTagsH3Span1;
	public static final String questionListerTagsH4I1 = "far fa-tag";
	public static final String questionListerTagsH4I = questionListerTagsH4I1;
	public static final String questionListerTagsH4Span1 = "List all the tags in the git repository. ";
	public static final String questionListerTagsH4Span = questionListerTagsH4Span1;
	public static final String questionListerTagsPreSpan11 = "(cd";
	public static final String questionListerTagsPreSpan1 = questionListerTagsPreSpan11;
	public static final String questionListerTagsPreSpan21 = " /usr/local/src/pgsql";
	public static final String questionListerTagsPreSpan2 = questionListerTagsPreSpan21;
	public static final String questionListerTagsPreSpan31 = " &&";
	public static final String questionListerTagsPreSpan3 = questionListerTagsPreSpan31;
	public static final String questionListerTagsPreSpan41 = " git";
	public static final String questionListerTagsPreSpan4 = questionListerTagsPreSpan41;
	public static final String questionListerTagsPreSpan51 = " tag)";
	public static final String questionListerTagsPreSpan5 = questionListerTagsPreSpan51;
	public static final String questionListerTagsOl2Li11 = "(cd: Change directory temporarily, because of the open parenthesis. ";
	public static final String questionListerTagsOl2Li1 = questionListerTagsOl2Li11;
	public static final String questionListerTagsOl2Li21 = "/usr/local/src/pgsql: The directory where the PostgreSQL source code was cloned. ";
	public static final String questionListerTagsOl2Li2 = questionListerTagsOl2Li21;
	public static final String questionListerTagsOl2Li31 = "&&: Run the cd and git command together. ";
	public static final String questionListerTagsOl2Li3 = questionListerTagsOl2Li31;
	public static final String questionListerTagsOl2Li41 = "git";
	public static final String questionListerTagsOl2Li4 = questionListerTagsOl2Li41;
	public static final String questionListerTagsOl2Li51 = "tag): Lists the current tags or assigned versions of the code and close the parenthesis. ";
	public static final String questionListerTagsOl2Li5 = questionListerTagsOl2Li51;

	/**	L'entité « questionListerTags »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionListerTags = new PageHtml();
	public Couverture<PageHtml> questionListerTagsCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionListerTags").o(questionListerTags);

	/**	<br/>L'entité « questionListerTags »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionListerTags">Trouver l'entité questionListerTags dans Solr</a>
	 * <br/>
	 * @param questionListerTags est l'entité déjà construit. 
	 **/
	protected abstract void _questionListerTags(PageHtml o);

	public PageHtml getQuestionListerTags() {
		return questionListerTags;
	}

	public void setQuestionListerTags(PageHtml questionListerTags) {
		this.questionListerTags = questionListerTags;
		this.questionListerTagsCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionListerTagsInit() {
		if(questionListerTags != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionListerTags, "questionListerTags");
			((C001L008CreerCertificat)this).avantPagePart(questionListerTags, "questionListerTags");
		}
		if(!questionListerTagsCouverture.dejaInitialise) {
			_questionListerTags(questionListerTags);
		}
		questionListerTags.initLoinPourClasse(requeteSite_);
		questionListerTagsCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionListerTags(PageHtml o) {
		{ e("h3").a("class", " questionListerTagsH3 ").f();
			{ e("i").a("class", questionListerTagsH3I1, " site-menu-icon questionListerTagsH3I ").f();
			} g("i");
			{ e("span").a("class", " questionListerTagsH3Span ").f();
				sx(questionListerTagsH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionListerTagsH4 ").f();
			{ e("i").a("class", questionListerTagsH4I1, " site-menu-icon questionListerTagsH4I ").f();
			} g("i");
			{ e("span").a("class", " questionListerTagsH4Span ").f();
				sx(questionListerTagsH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionListerTagsPre ").f();
			{ e("span").a("class", " questionListerTagsPreSpan1 questionListerTagsPreSpan odd ").f();
				sx(questionListerTagsPreSpan11);
			} g("span");
			{ e("span").a("class", " questionListerTagsPreSpan2 questionListerTagsPreSpan even ").f();
				sx(questionListerTagsPreSpan21);
			} g("span");
			{ e("span").a("class", " questionListerTagsPreSpan3 questionListerTagsPreSpan odd ").f();
				sx(questionListerTagsPreSpan31);
			} g("span");
			{ e("span").a("class", " questionListerTagsPreSpan4 questionListerTagsPreSpan even ").f();
				sx(questionListerTagsPreSpan41);
			} g("span");
			{ e("span").a("class", " questionListerTagsPreSpan5 questionListerTagsPreSpan odd ").f();
				sx(questionListerTagsPreSpan51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionListerTagsOl2 questionListerTagsOl even ").f();
			{ e("li").a("class", " questionListerTagsOl2Li1 questionListerTagsOl2Li odd ").f();
				sx(questionListerTagsOl2Li11);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl2Li2 questionListerTagsOl2Li even ").f();
				sx(questionListerTagsOl2Li21);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl2Li3 questionListerTagsOl2Li odd ").f();
				sx(questionListerTagsOl2Li31);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl2Li4 questionListerTagsOl2Li even ").f();
				sx(questionListerTagsOl2Li41);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl2Li5 questionListerTagsOl2Li odd ").f();
				sx(questionListerTagsOl2Li51);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionListerTags() {
		questionListerTags.htmlAvant();
		htmlBodyQuestionListerTags(questionListerTags);
		questionListerTags.htmlApres();
	}

	/////////////////////////
	// questionCheckoutTag //
	/////////////////////////

	public static final String questionCheckoutTagH3I1 = "far fa-code-merge";
	public static final String questionCheckoutTagH3I = questionCheckoutTagH3I1;
	public static final String questionCheckoutTagH3Span1 = "How do I switch versions of the PostgreSQL source code? ";
	public static final String questionCheckoutTagH3Span = questionCheckoutTagH3Span1;
	public static final String questionCheckoutTagH4I1 = "far fa-code-commit";
	public static final String questionCheckoutTagH4I = questionCheckoutTagH4I1;
	public static final String questionCheckoutTagH4Span1 = "Checkout the git tag. ";
	public static final String questionCheckoutTagH4Span = questionCheckoutTagH4Span1;
	public static final String questionCheckoutTagPreSpan11 = "(cd";
	public static final String questionCheckoutTagPreSpan1 = questionCheckoutTagPreSpan11;
	public static final String questionCheckoutTagPreSpan21 = " /usr/local/src/pgsql";
	public static final String questionCheckoutTagPreSpan2 = questionCheckoutTagPreSpan21;
	public static final String questionCheckoutTagPreSpan31 = " &&";
	public static final String questionCheckoutTagPreSpan3 = questionCheckoutTagPreSpan31;
	public static final String questionCheckoutTagPreSpan41 = " git";
	public static final String questionCheckoutTagPreSpan4 = questionCheckoutTagPreSpan41;
	public static final String questionCheckoutTagPreSpan51 = " checkout";
	public static final String questionCheckoutTagPreSpan5 = questionCheckoutTagPreSpan51;
	public static final String questionCheckoutTagPreSpan61 = " REL_11_3)";
	public static final String questionCheckoutTagPreSpan6 = questionCheckoutTagPreSpan61;
	public static final String questionCheckoutTagOl2Li11 = "(cd";
	public static final String questionCheckoutTagOl2Li1 = questionCheckoutTagOl2Li11;
	public static final String questionCheckoutTagOl2Li21 = "/usr/local/src/pgsql";
	public static final String questionCheckoutTagOl2Li2 = questionCheckoutTagOl2Li21;
	public static final String questionCheckoutTagOl2Li31 = "&&";
	public static final String questionCheckoutTagOl2Li3 = questionCheckoutTagOl2Li31;
	public static final String questionCheckoutTagOl2Li41 = "git";
	public static final String questionCheckoutTagOl2Li4 = questionCheckoutTagOl2Li41;
	public static final String questionCheckoutTagOl2Li51 = "checkout: Checkout a branch to the working tree. ";
	public static final String questionCheckoutTagOl2Li5 = questionCheckoutTagOl2Li51;
	public static final String questionCheckoutTagOl2Li61 = "REL_11_3): The latest tag to base the branch from. ";
	public static final String questionCheckoutTagOl2Li6 = questionCheckoutTagOl2Li61;

	/**	L'entité « questionCheckoutTag »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCheckoutTag = new PageHtml();
	public Couverture<PageHtml> questionCheckoutTagCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCheckoutTag").o(questionCheckoutTag);

	/**	<br/>L'entité « questionCheckoutTag »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCheckoutTag">Trouver l'entité questionCheckoutTag dans Solr</a>
	 * <br/>
	 * @param questionCheckoutTag est l'entité déjà construit. 
	 **/
	protected abstract void _questionCheckoutTag(PageHtml o);

	public PageHtml getQuestionCheckoutTag() {
		return questionCheckoutTag;
	}

	public void setQuestionCheckoutTag(PageHtml questionCheckoutTag) {
		this.questionCheckoutTag = questionCheckoutTag;
		this.questionCheckoutTagCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionCheckoutTagInit() {
		if(questionCheckoutTag != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
			((C001L008CreerCertificat)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
		}
		if(!questionCheckoutTagCouverture.dejaInitialise) {
			_questionCheckoutTag(questionCheckoutTag);
		}
		questionCheckoutTag.initLoinPourClasse(requeteSite_);
		questionCheckoutTagCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionCheckoutTag(PageHtml o) {
		{ e("h3").a("class", " questionCheckoutTagH3 ").f();
			{ e("i").a("class", questionCheckoutTagH3I1, " site-menu-icon questionCheckoutTagH3I ").f();
			} g("i");
			{ e("span").a("class", " questionCheckoutTagH3Span ").f();
				sx(questionCheckoutTagH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionCheckoutTagH4 ").f();
			{ e("i").a("class", questionCheckoutTagH4I1, " site-menu-icon questionCheckoutTagH4I ").f();
			} g("i");
			{ e("span").a("class", " questionCheckoutTagH4Span ").f();
				sx(questionCheckoutTagH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionCheckoutTagPre ").f();
			{ e("span").a("class", " questionCheckoutTagPreSpan1 questionCheckoutTagPreSpan odd ").f();
				sx(questionCheckoutTagPreSpan11);
			} g("span");
			{ e("span").a("class", " questionCheckoutTagPreSpan2 questionCheckoutTagPreSpan even ").f();
				sx(questionCheckoutTagPreSpan21);
			} g("span");
			{ e("span").a("class", " questionCheckoutTagPreSpan3 questionCheckoutTagPreSpan odd ").f();
				sx(questionCheckoutTagPreSpan31);
			} g("span");
			{ e("span").a("class", " questionCheckoutTagPreSpan4 questionCheckoutTagPreSpan even ").f();
				sx(questionCheckoutTagPreSpan41);
			} g("span");
			{ e("span").a("class", " questionCheckoutTagPreSpan5 questionCheckoutTagPreSpan odd ").f();
				sx(questionCheckoutTagPreSpan51);
			} g("span");
			{ e("span").a("class", " questionCheckoutTagPreSpan6 questionCheckoutTagPreSpan even ").f();
				sx(questionCheckoutTagPreSpan61);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCheckoutTagOl2 questionCheckoutTagOl even ").f();
			{ e("li").a("class", " questionCheckoutTagOl2Li1 questionCheckoutTagOl2Li odd ").f();
				sx(questionCheckoutTagOl2Li11);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl2Li2 questionCheckoutTagOl2Li even ").f();
				sx(questionCheckoutTagOl2Li21);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl2Li3 questionCheckoutTagOl2Li odd ").f();
				sx(questionCheckoutTagOl2Li31);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl2Li4 questionCheckoutTagOl2Li even ").f();
				sx(questionCheckoutTagOl2Li41);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl2Li5 questionCheckoutTagOl2Li odd ").f();
				sx(questionCheckoutTagOl2Li51);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl2Li6 questionCheckoutTagOl2Li even ").f();
				sx(questionCheckoutTagOl2Li61);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionCheckoutTag() {
		questionCheckoutTag.htmlAvant();
		htmlBodyQuestionCheckoutTag(questionCheckoutTag);
		questionCheckoutTag.htmlApres();
	}

	//////////////////////////////
	// questionConstruireSource //
	//////////////////////////////

	public static final String questionConstruireSourceH3I1 = "far fa-tools";
	public static final String questionConstruireSourceH3I = questionConstruireSourceH3I1;
	public static final String questionConstruireSourceH3Span1 = "How do I build the PostgreSQL source code? ";
	public static final String questionConstruireSourceH3Span = questionConstruireSourceH3Span1;
	public static final String questionConstruireSourceH4I1 = "far fa-terminal";
	public static final String questionConstruireSourceH4I = questionConstruireSourceH4I1;
	public static final String questionConstruireSourceH4Span1 = "Build PostgreSQL with the configure command. ";
	public static final String questionConstruireSourceH4Span = questionConstruireSourceH4Span1;
	public static final String questionConstruireSourcePre1Span011 = "(cd";
	public static final String questionConstruireSourcePre1Span01 = questionConstruireSourcePre1Span011;
	public static final String questionConstruireSourcePre1Span021 = " /usr/local/src/pgsql";
	public static final String questionConstruireSourcePre1Span02 = questionConstruireSourcePre1Span021;
	public static final String questionConstruireSourcePre1Span031 = " &&";
	public static final String questionConstruireSourcePre1Span03 = questionConstruireSourcePre1Span031;
	public static final String questionConstruireSourcePre1Span041 = " ./configure";
	public static final String questionConstruireSourcePre1Span04 = questionConstruireSourcePre1Span041;
	public static final String questionConstruireSourcePre1Span051 = " --with-openssl";
	public static final String questionConstruireSourcePre1Span05 = questionConstruireSourcePre1Span051;
	public static final String questionConstruireSourcePre1Span061 = " --with-libxml";
	public static final String questionConstruireSourcePre1Span06 = questionConstruireSourcePre1Span061;
	public static final String questionConstruireSourcePre1Span071 = " --with-libxslt";
	public static final String questionConstruireSourcePre1Span07 = questionConstruireSourcePre1Span071;
	public static final String questionConstruireSourcePre1Span081 = " --with-systemd";
	public static final String questionConstruireSourcePre1Span08 = questionConstruireSourcePre1Span081;
	public static final String questionConstruireSourcePre1Span091 = " --with-selinux";
	public static final String questionConstruireSourcePre1Span09 = questionConstruireSourcePre1Span091;
	public static final String questionConstruireSourcePre1Span101 = " --prefix=/opt/pgsql)";
	public static final String questionConstruireSourcePre1Span10 = questionConstruireSourcePre1Span101;
	public static final String questionConstruireSourceOl1Li011 = "(cd";
	public static final String questionConstruireSourceOl1Li01 = questionConstruireSourceOl1Li011;
	public static final String questionConstruireSourceOl1Li021 = "/usr/local/src/pgsql";
	public static final String questionConstruireSourceOl1Li02 = questionConstruireSourceOl1Li021;
	public static final String questionConstruireSourceOl1Li031 = "&&";
	public static final String questionConstruireSourceOl1Li03 = questionConstruireSourceOl1Li031;
	public static final String questionConstruireSourceOl1Li041 = "./configure: A C++ configure script to compile PostgreSQL. ";
	public static final String questionConstruireSourceOl1Li04 = questionConstruireSourceOl1Li041;
	public static final String questionConstruireSourceOl1Li051 = "--with-openssl: Build PostgreSQL with OpenSSL support for secure TLS connections to the database. ";
	public static final String questionConstruireSourceOl1Li05 = questionConstruireSourceOl1Li051;
	public static final String questionConstruireSourceOl1Li061 = "--with-libxml: Build PostgreSQL with XML support. ";
	public static final String questionConstruireSourceOl1Li06 = questionConstruireSourceOl1Li061;
	public static final String questionConstruireSourceOl1Li071 = "--with-libxslt: Use XSLT support when building contrib/xml2. ";
	public static final String questionConstruireSourceOl1Li07 = questionConstruireSourceOl1Li071;
	public static final String questionConstruireSourceOl1Li081 = "--with-systemd: Build PostgreSQL with support for the systemd service manager for Linux. ";
	public static final String questionConstruireSourceOl1Li08 = questionConstruireSourceOl1Li081;
	public static final String questionConstruireSourceOl1Li091 = "--with-selinux: Build PostgreSQL with extra Security-Enhanced Linux features to provide an additional layer of security. ";
	public static final String questionConstruireSourceOl1Li092 = "Each table or function access initiated by a DML query will be checked against the system security policy. ";
	public static final String questionConstruireSourceOl1Li09 = questionConstruireSourceOl1Li091 + questionConstruireSourceOl1Li092;
	public static final String questionConstruireSourceOl1Li101 = "--prefix=/opt/pgsql): The prefix is the directory where several other subdirectories will be created with PostgreSQL files. ";
	public static final String questionConstruireSourceOl1Li102 = "/opt/pgsql/bin will contain PostgreSQL binaries. ";
	public static final String questionConstruireSourceOl1Li103 = "/opt/pgsql/include will contain PostgreSQL headers. ";
	public static final String questionConstruireSourceOl1Li104 = "/opt/pgsql/lib will contain PostgreSQL shared libraries. ";
	public static final String questionConstruireSourceOl1Li105 = "/opt/pgsql/share will contain PostgreSQL documentation and other files. ";
	public static final String questionConstruireSourceOl1Li10 = questionConstruireSourceOl1Li101 + questionConstruireSourceOl1Li102 + questionConstruireSourceOl1Li103 + questionConstruireSourceOl1Li104 + questionConstruireSourceOl1Li105;
	public static final String questionConstruireSourcePre2Span11 = "(cd";
	public static final String questionConstruireSourcePre2Span1 = questionConstruireSourcePre2Span11;
	public static final String questionConstruireSourcePre2Span21 = " /usr/local/src/pgsql";
	public static final String questionConstruireSourcePre2Span2 = questionConstruireSourcePre2Span21;
	public static final String questionConstruireSourcePre2Span31 = " &&";
	public static final String questionConstruireSourcePre2Span3 = questionConstruireSourcePre2Span31;
	public static final String questionConstruireSourcePre2Span41 = " make";
	public static final String questionConstruireSourcePre2Span4 = questionConstruireSourcePre2Span41;
	public static final String questionConstruireSourcePre2Span51 = " world)";
	public static final String questionConstruireSourcePre2Span5 = questionConstruireSourcePre2Span51;
	public static final String questionConstruireSourceOl2Li11 = "(cd";
	public static final String questionConstruireSourceOl2Li1 = questionConstruireSourceOl2Li11;
	public static final String questionConstruireSourceOl2Li21 = "/usr/local/src/pgsql";
	public static final String questionConstruireSourceOl2Li2 = questionConstruireSourceOl2Li21;
	public static final String questionConstruireSourceOl2Li31 = "&&";
	public static final String questionConstruireSourceOl2Li3 = questionConstruireSourceOl2Li31;
	public static final String questionConstruireSourceOl2Li41 = "make: Compile the PostgreSQL source code. ";
	public static final String questionConstruireSourceOl2Li4 = questionConstruireSourceOl2Li41;
	public static final String questionConstruireSourceOl2Li51 = "world): To build everything that can be built, including the documentation (HTML and man pages), and the additional modules (contrib). ";
	public static final String questionConstruireSourceOl2Li5 = questionConstruireSourceOl2Li51;
	public static final String questionConstruireSourcePre3Span11 = "(cd";
	public static final String questionConstruireSourcePre3Span1 = questionConstruireSourcePre3Span11;
	public static final String questionConstruireSourcePre3Span21 = " /usr/local/src/pgsql";
	public static final String questionConstruireSourcePre3Span2 = questionConstruireSourcePre3Span21;
	public static final String questionConstruireSourcePre3Span31 = " &&";
	public static final String questionConstruireSourcePre3Span3 = questionConstruireSourcePre3Span31;
	public static final String questionConstruireSourcePre3Span41 = " make";
	public static final String questionConstruireSourcePre3Span4 = questionConstruireSourcePre3Span41;
	public static final String questionConstruireSourcePre3Span51 = " install-world)";
	public static final String questionConstruireSourcePre3Span5 = questionConstruireSourcePre3Span51;
	public static final String questionConstruireSourceOl3Li11 = "(cd";
	public static final String questionConstruireSourceOl3Li1 = questionConstruireSourceOl3Li11;
	public static final String questionConstruireSourceOl3Li21 = "/usr/local/src/pgsql";
	public static final String questionConstruireSourceOl3Li2 = questionConstruireSourceOl3Li21;
	public static final String questionConstruireSourceOl3Li31 = "&&";
	public static final String questionConstruireSourceOl3Li3 = questionConstruireSourceOl3Li31;
	public static final String questionConstruireSourceOl3Li41 = "make";
	public static final String questionConstruireSourceOl3Li4 = questionConstruireSourceOl3Li41;
	public static final String questionConstruireSourceOl3Li51 = "install-world): By building the world above, this installs everything, including the documentation. ";
	public static final String questionConstruireSourceOl3Li5 = questionConstruireSourceOl3Li51;

	/**	L'entité « questionConstruireSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionConstruireSource = new PageHtml();
	public Couverture<PageHtml> questionConstruireSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionConstruireSource").o(questionConstruireSource);

	/**	<br/>L'entité « questionConstruireSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionConstruireSource">Trouver l'entité questionConstruireSource dans Solr</a>
	 * <br/>
	 * @param questionConstruireSource est l'entité déjà construit. 
	 **/
	protected abstract void _questionConstruireSource(PageHtml o);

	public PageHtml getQuestionConstruireSource() {
		return questionConstruireSource;
	}

	public void setQuestionConstruireSource(PageHtml questionConstruireSource) {
		this.questionConstruireSource = questionConstruireSource;
		this.questionConstruireSourceCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionConstruireSourceInit() {
		if(questionConstruireSource != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
			((C001L008CreerCertificat)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
		}
		if(!questionConstruireSourceCouverture.dejaInitialise) {
			_questionConstruireSource(questionConstruireSource);
		}
		questionConstruireSource.initLoinPourClasse(requeteSite_);
		questionConstruireSourceCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionConstruireSource(PageHtml o) {
		{ e("h3").a("class", " questionConstruireSourceH3 ").f();
			{ e("i").a("class", questionConstruireSourceH3I1, " site-menu-icon questionConstruireSourceH3I ").f();
			} g("i");
			{ e("span").a("class", " questionConstruireSourceH3Span ").f();
				sx(questionConstruireSourceH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionConstruireSourceH4 ").f();
			{ e("i").a("class", questionConstruireSourceH4I1, " site-menu-icon questionConstruireSourceH4I ").f();
			} g("i");
			{ e("span").a("class", " questionConstruireSourceH4Span ").f();
				sx(questionConstruireSourceH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionConstruireSourcePre1 questionConstruireSourcePre odd ").f();
			{ e("span").a("class", " questionConstruireSourcePre1Span01 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span011);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span02 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span021);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span03 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span031);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span04 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span041);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span05 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span051);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span06 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span061);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span07 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span071);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span08 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span081);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span09 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span091);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span10 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span101);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionConstruireSourceOl1 questionConstruireSourceOl odd ").f();
			{ e("li").a("class", " questionConstruireSourceOl1Li01 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li011);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li02 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li021);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li03 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li031);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li04 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li041);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li05 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li051);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li06 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li061);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li07 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li071);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li08 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li081);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li09 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li091);
				sx(questionConstruireSourceOl1Li092);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li10 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li101);
				sx(questionConstruireSourceOl1Li102);
				sx(questionConstruireSourceOl1Li103);
				sx(questionConstruireSourceOl1Li104);
				sx(questionConstruireSourceOl1Li105);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionConstruireSourcePre2 questionConstruireSourcePre even ").f();
			{ e("span").a("class", " questionConstruireSourcePre2Span1 questionConstruireSourcePre2Span odd ").f();
				sx(questionConstruireSourcePre2Span11);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre2Span2 questionConstruireSourcePre2Span even ").f();
				sx(questionConstruireSourcePre2Span21);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre2Span3 questionConstruireSourcePre2Span odd ").f();
				sx(questionConstruireSourcePre2Span31);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre2Span4 questionConstruireSourcePre2Span even ").f();
				sx(questionConstruireSourcePre2Span41);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre2Span5 questionConstruireSourcePre2Span odd ").f();
				sx(questionConstruireSourcePre2Span51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionConstruireSourceOl2 questionConstruireSourceOl even ").f();
			{ e("li").a("class", " questionConstruireSourceOl2Li1 questionConstruireSourceOl2Li odd ").f();
				sx(questionConstruireSourceOl2Li11);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl2Li2 questionConstruireSourceOl2Li even ").f();
				sx(questionConstruireSourceOl2Li21);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl2Li3 questionConstruireSourceOl2Li odd ").f();
				sx(questionConstruireSourceOl2Li31);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl2Li4 questionConstruireSourceOl2Li even ").f();
				sx(questionConstruireSourceOl2Li41);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl2Li5 questionConstruireSourceOl2Li odd ").f();
				sx(questionConstruireSourceOl2Li51);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionConstruireSourcePre3 questionConstruireSourcePre odd ").f();
			{ e("span").a("class", " questionConstruireSourcePre3Span1 questionConstruireSourcePre3Span odd ").f();
				sx(questionConstruireSourcePre3Span11);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre3Span2 questionConstruireSourcePre3Span even ").f();
				sx(questionConstruireSourcePre3Span21);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre3Span3 questionConstruireSourcePre3Span odd ").f();
				sx(questionConstruireSourcePre3Span31);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre3Span4 questionConstruireSourcePre3Span even ").f();
				sx(questionConstruireSourcePre3Span41);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre3Span5 questionConstruireSourcePre3Span odd ").f();
				sx(questionConstruireSourcePre3Span51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionConstruireSourceOl3 questionConstruireSourceOl odd ").f();
			{ e("li").a("class", " questionConstruireSourceOl3Li1 questionConstruireSourceOl3Li odd ").f();
				sx(questionConstruireSourceOl3Li11);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl3Li2 questionConstruireSourceOl3Li even ").f();
				sx(questionConstruireSourceOl3Li21);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl3Li3 questionConstruireSourceOl3Li odd ").f();
				sx(questionConstruireSourceOl3Li31);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl3Li4 questionConstruireSourceOl3Li even ").f();
				sx(questionConstruireSourceOl3Li41);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl3Li5 questionConstruireSourceOl3Li odd ").f();
				sx(questionConstruireSourceOl3Li51);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionConstruireSource() {
		questionConstruireSource.htmlAvant();
		htmlBodyQuestionConstruireSource(questionConstruireSource);
		questionConstruireSource.htmlApres();
	}

	//////////////////////////
	// questionMkdirServeur //
	//////////////////////////

	public static final String questionMkdirServeurH3I1 = "far fa-map-pin";
	public static final String questionMkdirServeurH3I = questionMkdirServeurH3I1;
	public static final String questionMkdirServeurH3Span1 = "After installing PostgreSQL, where is my data directory? ";
	public static final String questionMkdirServeurH3Span = questionMkdirServeurH3Span1;
	public static final String questionMkdirServeurH4I1 = "far fa-folder-tree";
	public static final String questionMkdirServeurH4I = questionMkdirServeurH4I1;
	public static final String questionMkdirServeurH4Span1 = "Create a pgsql directory in /srv. ";
	public static final String questionMkdirServeurH4Span = questionMkdirServeurH4Span1;
	public static final String questionMkdirServeurPreSpan11 = "sudo";
	public static final String questionMkdirServeurPreSpan1 = questionMkdirServeurPreSpan11;
	public static final String questionMkdirServeurPreSpan21 = " install";
	public static final String questionMkdirServeurPreSpan2 = questionMkdirServeurPreSpan21;
	public static final String questionMkdirServeurPreSpan31 = " -d";
	public static final String questionMkdirServeurPreSpan3 = questionMkdirServeurPreSpan31;
	public static final String questionMkdirServeurPreSpan41 = " -o";
	public static final String questionMkdirServeurPreSpan4 = questionMkdirServeurPreSpan41;
	public static final String questionMkdirServeurPreSpan51 = " $USER";
	public static final String questionMkdirServeurPreSpan5 = questionMkdirServeurPreSpan51;
	public static final String questionMkdirServeurPreSpan61 = " -g";
	public static final String questionMkdirServeurPreSpan6 = questionMkdirServeurPreSpan61;
	public static final String questionMkdirServeurPreSpan71 = " $USER";
	public static final String questionMkdirServeurPreSpan7 = questionMkdirServeurPreSpan71;
	public static final String questionMkdirServeurPreSpan81 = " /srv/pgsql";
	public static final String questionMkdirServeurPreSpan8 = questionMkdirServeurPreSpan81;
	public static final String questionMkdirServeurOl2Li11 = "sudo";
	public static final String questionMkdirServeurOl2Li1 = questionMkdirServeurOl2Li11;
	public static final String questionMkdirServeurOl2Li21 = "install";
	public static final String questionMkdirServeurOl2Li2 = questionMkdirServeurOl2Li21;
	public static final String questionMkdirServeurOl2Li31 = "-d";
	public static final String questionMkdirServeurOl2Li3 = questionMkdirServeurOl2Li31;
	public static final String questionMkdirServeurOl2Li41 = "-o";
	public static final String questionMkdirServeurOl2Li4 = questionMkdirServeurOl2Li41;
	public static final String questionMkdirServeurOl2Li51 = "$USER";
	public static final String questionMkdirServeurOl2Li5 = questionMkdirServeurOl2Li51;
	public static final String questionMkdirServeurOl2Li61 = "-g";
	public static final String questionMkdirServeurOl2Li6 = questionMkdirServeurOl2Li61;
	public static final String questionMkdirServeurOl2Li71 = "$USER";
	public static final String questionMkdirServeurOl2Li7 = questionMkdirServeurOl2Li71;
	public static final String questionMkdirServeurOl2Li81 = "/srv is a good place to install open source software serveurs like PostgreSQL that run as a service. ";
	public static final String questionMkdirServeurOl2Li8 = questionMkdirServeurOl2Li81;

	/**	L'entité « questionMkdirServeur »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMkdirServeur = new PageHtml();
	public Couverture<PageHtml> questionMkdirServeurCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMkdirServeur").o(questionMkdirServeur);

	/**	<br/>L'entité « questionMkdirServeur »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionMkdirServeur">Trouver l'entité questionMkdirServeur dans Solr</a>
	 * <br/>
	 * @param questionMkdirServeur est l'entité déjà construit. 
	 **/
	protected abstract void _questionMkdirServeur(PageHtml o);

	public PageHtml getQuestionMkdirServeur() {
		return questionMkdirServeur;
	}

	public void setQuestionMkdirServeur(PageHtml questionMkdirServeur) {
		this.questionMkdirServeur = questionMkdirServeur;
		this.questionMkdirServeurCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionMkdirServeurInit() {
		if(questionMkdirServeur != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionMkdirServeur, "questionMkdirServeur");
			((C001L008CreerCertificat)this).avantPagePart(questionMkdirServeur, "questionMkdirServeur");
		}
		if(!questionMkdirServeurCouverture.dejaInitialise) {
			_questionMkdirServeur(questionMkdirServeur);
		}
		questionMkdirServeur.initLoinPourClasse(requeteSite_);
		questionMkdirServeurCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionMkdirServeur(PageHtml o) {
		{ e("h3").a("class", " questionMkdirServeurH3 ").f();
			{ e("i").a("class", questionMkdirServeurH3I1, " site-menu-icon questionMkdirServeurH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirServeurH3Span ").f();
				sx(questionMkdirServeurH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMkdirServeurH4 ").f();
			{ e("i").a("class", questionMkdirServeurH4I1, " site-menu-icon questionMkdirServeurH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirServeurH4Span ").f();
				sx(questionMkdirServeurH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionMkdirServeurPre ").f();
			{ e("span").a("class", " questionMkdirServeurPreSpan1 questionMkdirServeurPreSpan odd ").f();
				sx(questionMkdirServeurPreSpan11);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan2 questionMkdirServeurPreSpan even ").f();
				sx(questionMkdirServeurPreSpan21);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan3 questionMkdirServeurPreSpan odd ").f();
				sx(questionMkdirServeurPreSpan31);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan4 questionMkdirServeurPreSpan even ").f();
				sx(questionMkdirServeurPreSpan41);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan5 questionMkdirServeurPreSpan odd ").f();
				sx(questionMkdirServeurPreSpan51);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan6 questionMkdirServeurPreSpan even ").f();
				sx(questionMkdirServeurPreSpan61);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan7 questionMkdirServeurPreSpan odd ").f();
				sx(questionMkdirServeurPreSpan71);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan8 questionMkdirServeurPreSpan even ").f();
				sx(questionMkdirServeurPreSpan81);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirServeurOl2 questionMkdirServeurOl even ").f();
			{ e("li").a("class", " questionMkdirServeurOl2Li1 questionMkdirServeurOl2Li odd ").f();
				sx(questionMkdirServeurOl2Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li2 questionMkdirServeurOl2Li even ").f();
				sx(questionMkdirServeurOl2Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li3 questionMkdirServeurOl2Li odd ").f();
				sx(questionMkdirServeurOl2Li31);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li4 questionMkdirServeurOl2Li even ").f();
				sx(questionMkdirServeurOl2Li41);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li5 questionMkdirServeurOl2Li odd ").f();
				sx(questionMkdirServeurOl2Li51);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li6 questionMkdirServeurOl2Li even ").f();
				sx(questionMkdirServeurOl2Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li7 questionMkdirServeurOl2Li odd ").f();
				sx(questionMkdirServeurOl2Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li8 questionMkdirServeurOl2Li even ").f();
				sx(questionMkdirServeurOl2Li81);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMkdirServeur() {
		questionMkdirServeur.htmlAvant();
		htmlBodyQuestionMkdirServeur(questionMkdirServeur);
		questionMkdirServeur.htmlApres();
	}

	/////////////////////
	// questionDonnees //
	/////////////////////

	public static final String questionDonneesH3I1 = "far fa-database";
	public static final String questionDonneesH3I = questionDonneesH3I1;
	public static final String questionDonneesH3Span1 = "How do I create a new PostgreSQL database? ";
	public static final String questionDonneesH3Span = questionDonneesH3Span1;
	public static final String questionDonneesH4I1 = "far fa-table";
	public static final String questionDonneesH4I = questionDonneesH4I1;
	public static final String questionDonneesH4Span1 = "How to initialize a new PostgreSQL server. ";
	public static final String questionDonneesH4Span = questionDonneesH4Span1;
	public static final String questionDonneesP11 = "Even after you compiled the PostgreSQL source code, you don't yet have a PostgreSQL database. ";
	public static final String questionDonneesP12 = "You only have PostgreSQL binaries and tools. ";
	public static final String questionDonneesP13 = "You need to setup a PostgreSQL database server to run and store data. ";
	public static final String questionDonneesP1 = questionDonneesP11 + questionDonneesP12 + questionDonneesP13;
	public static final String questionDonneesPreSpan11 = "/opt/pgsql/bin/initdb";
	public static final String questionDonneesPreSpan1 = questionDonneesPreSpan11;
	public static final String questionDonneesPreSpan21 = " -D";
	public static final String questionDonneesPreSpan2 = questionDonneesPreSpan21;
	public static final String questionDonneesPreSpan31 = " /srv/pgsql";
	public static final String questionDonneesPreSpan3 = questionDonneesPreSpan31;
	public static final String questionDonneesPreSpan41 = " -W";
	public static final String questionDonneesPreSpan4 = questionDonneesPreSpan41;
	public static final String questionDonneesOl2Li11 = "/opt/pgsql/bin/initdb: Initializes a PostgreSQL database cluster. ";
	public static final String questionDonneesOl2Li1 = questionDonneesOl2Li11;
	public static final String questionDonneesOl2Li21 = "checkout: Choose a directory for the new PostgreSQL database server. ";
	public static final String questionDonneesOl2Li2 = questionDonneesOl2Li21;
	public static final String questionDonneesOl2Li31 = "/srv/pgsql: The directory of the new PostgreSQL database server. ";
	public static final String questionDonneesOl2Li3 = questionDonneesOl2Li31;
	public static final String questionDonneesOl2Li41 = "-W: Prompt for a password for the new superuser. ";
	public static final String questionDonneesOl2Li4 = questionDonneesOl2Li41;

	/**	L'entité « questionDonnees »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDonnees = new PageHtml();
	public Couverture<PageHtml> questionDonneesCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDonnees").o(questionDonnees);

	/**	<br/>L'entité « questionDonnees »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionDonnees">Trouver l'entité questionDonnees dans Solr</a>
	 * <br/>
	 * @param questionDonnees est l'entité déjà construit. 
	 **/
	protected abstract void _questionDonnees(PageHtml o);

	public PageHtml getQuestionDonnees() {
		return questionDonnees;
	}

	public void setQuestionDonnees(PageHtml questionDonnees) {
		this.questionDonnees = questionDonnees;
		this.questionDonneesCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionDonneesInit() {
		if(questionDonnees != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionDonnees, "questionDonnees");
			((C001L008CreerCertificat)this).avantPagePart(questionDonnees, "questionDonnees");
		}
		if(!questionDonneesCouverture.dejaInitialise) {
			_questionDonnees(questionDonnees);
		}
		questionDonnees.initLoinPourClasse(requeteSite_);
		questionDonneesCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionDonnees(PageHtml o) {
		{ e("h3").a("class", " questionDonneesH3 ").f();
			{ e("i").a("class", questionDonneesH3I1, " site-menu-icon questionDonneesH3I ").f();
			} g("i");
			{ e("span").a("class", " questionDonneesH3Span ").f();
				sx(questionDonneesH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionDonneesH4 ").f();
			{ e("i").a("class", questionDonneesH4I1, " site-menu-icon questionDonneesH4I ").f();
			} g("i");
			{ e("span").a("class", " questionDonneesH4Span ").f();
				sx(questionDonneesH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " questionDonneesP1 questionDonneesP odd ").f();
			sx(questionDonneesP11);
			sx(questionDonneesP12);
			sx(questionDonneesP13);
		} g("p");
		{ e("pre").a("class", " questionDonneesPre ").f();
			{ e("span").a("class", " questionDonneesPreSpan1 questionDonneesPreSpan odd ").f();
				sx(questionDonneesPreSpan11);
			} g("span");
			{ e("span").a("class", " questionDonneesPreSpan2 questionDonneesPreSpan even ").f();
				sx(questionDonneesPreSpan21);
			} g("span");
			{ e("span").a("class", " questionDonneesPreSpan3 questionDonneesPreSpan odd ").f();
				sx(questionDonneesPreSpan31);
			} g("span");
			{ e("span").a("class", " questionDonneesPreSpan4 questionDonneesPreSpan even ").f();
				sx(questionDonneesPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionDonneesOl2 questionDonneesOl even ").f();
			{ e("li").a("class", " questionDonneesOl2Li1 questionDonneesOl2Li odd ").f();
				sx(questionDonneesOl2Li11);
			} g("li");
			{ e("li").a("class", " questionDonneesOl2Li2 questionDonneesOl2Li even ").f();
				sx(questionDonneesOl2Li21);
			} g("li");
			{ e("li").a("class", " questionDonneesOl2Li3 questionDonneesOl2Li odd ").f();
				sx(questionDonneesOl2Li31);
			} g("li");
			{ e("li").a("class", " questionDonneesOl2Li4 questionDonneesOl2Li even ").f();
				sx(questionDonneesOl2Li41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionDonnees() {
		questionDonnees.htmlAvant();
		htmlBodyQuestionDonnees(questionDonnees);
		questionDonnees.htmlApres();
	}

	/////////////////////
	// questionService //
	/////////////////////

	public static final String questionServiceH3I1 = "far fa-alarm-clock";
	public static final String questionServiceH3I = questionServiceH3I1;
	public static final String questionServiceH3Span1 = "How do I run PostgreSQL all the time, when my computer starts up? ";
	public static final String questionServiceH3Span = questionServiceH3Span1;
	public static final String questionServiceH4I1 = "far fa-layer-plus";
	public static final String questionServiceH4I = questionServiceH4I1;
	public static final String questionServiceH4Span1 = "How to run PostgreSQL as a systemd service. ";
	public static final String questionServiceH4Span = questionServiceH4Span1;
	public static final String questionServicePreSpan11 = "echo '";
	public static final String questionServicePreSpan1 = questionServicePreSpan11;
	public static final String questionServicePreSpan1Br1 = "[Unit]";
	public static final String questionServicePreSpan1Br = questionServicePreSpan1Br1;
	public static final String questionServicePreSpan2Br1 = "Description=PostgreSQL database server.";
	public static final String questionServicePreSpan2Br = questionServicePreSpan2Br1;
	public static final String questionServicePreSpan3Br1 = "After=syslog.target network.target";
	public static final String questionServicePreSpan3Br2 = "";
	public static final String questionServicePreSpan3Br3 = "[Service]";
	public static final String questionServicePreSpan3Br4 = "Type=forking";
	public static final String questionServicePreSpan3Br5 = "Environment=PGDATA=/srv/pgsql PGPORT=5432";
	public static final String questionServicePreSpan3Br6 = "User='\"$USER\"'";
	public static final String questionServicePreSpan3Br7 = "Group='\"$USER\"'";
	public static final String questionServicePreSpan3Br8 = "ExecStart=/opt/pgsql/bin/pg_ctl start -D ${PGDATA} -s -o \"-p ${PGPORT}\" -w -t 300";
	public static final String questionServicePreSpan3Br9 = "ExecStop=/opt/pgsql/bin/pg_ctl stop -D ${PGDATA} -s -m fast";
	public static final String questionServicePreSpan3Br10 = "ExecReload=/opt/pgsql/bin/pg_ctl reload -D ${PGDATA} -s";
	public static final String questionServicePreSpan3Br11 = "TimeoutSec=300";
	public static final String questionServicePreSpan3Br12 = "";
	public static final String questionServicePreSpan3Br13 = "[Install]";
	public static final String questionServicePreSpan3Br14 = "WantedBy=multi-user.target";
	public static final String questionServicePreSpan3Br15 = "' | sudo tee /usr/lib/systemd/system/pgsql.service";
	public static final String questionServicePreSpan3Br = questionServicePreSpan3Br1 + questionServicePreSpan3Br2 + questionServicePreSpan3Br3 + questionServicePreSpan3Br4 + questionServicePreSpan3Br5 + questionServicePreSpan3Br6 + questionServicePreSpan3Br7 + questionServicePreSpan3Br8 + questionServicePreSpan3Br9 + questionServicePreSpan3Br10 + questionServicePreSpan3Br11 + questionServicePreSpan3Br12 + questionServicePreSpan3Br13 + questionServicePreSpan3Br14 + questionServicePreSpan3Br15;
	public static final String questionServiceOl2Li011 = "echo '...': Write a string to the console. ";
	public static final String questionServiceOl2Li01 = questionServiceOl2Li011;
	public static final String questionServiceOl2Li021 = "[Unit]: A unit configuration file whose name ends in \".service\" encodes information about a process controlled and supervised by systemd. ";
	public static final String questionServiceOl2Li02 = questionServiceOl2Li021;
	public static final String questionServiceOl2Li031 = "Description=...: The description of the service. ";
	public static final String questionServiceOl2Li03 = questionServiceOl2Li031;
	public static final String questionServiceOl2Li041 = "After=...: The PostgreSQL service will be started after the following dependencies. ";
	public static final String questionServiceOl2Li04 = questionServiceOl2Li041;
	public static final String questionServiceOl2Li051 = "[Service]: Information about a service controlled and supervised by systemd. ";
	public static final String questionServiceOl2Li05 = questionServiceOl2Li051;
	public static final String questionServiceOl2Li061 = "Type=forking: Because it is expected that the process configured with ExecStart= will call fork() as part of its start-up. ";
	public static final String questionServiceOl2Li06 = questionServiceOl2Li061;
	public static final String questionServiceOl2Li071 = "Environment=PGDATA=/srv/pgsql PGPORT=5432: To set the PostgreSQL data directory and port as system environment variables to use in later commands. ";
	public static final String questionServiceOl2Li07 = questionServiceOl2Li071;
	public static final String questionServiceOl2Li081 = "User=...: The user as the current user that will run the service. ";
	public static final String questionServiceOl2Li08 = questionServiceOl2Li081;
	public static final String questionServiceOl2Li091 = "Group=...: The group user as the current user that will run the service. ";
	public static final String questionServiceOl2Li09 = questionServiceOl2Li091;
	public static final String questionServiceOl2Li101 = "ExecStart=...: The PostgreSQL command that will start the service. ";
	public static final String questionServiceOl2Li10 = questionServiceOl2Li101;
	public static final String questionServiceOl2Li111 = "ExecStart=...: The PostgreSQL command that will stop the service. ";
	public static final String questionServiceOl2Li11 = questionServiceOl2Li111;
	public static final String questionServiceOl2Li121 = "ExecReload=...: The PostgreSQL command that will restart the service. ";
	public static final String questionServiceOl2Li12 = questionServiceOl2Li121;
	public static final String questionServiceOl2Li131 = "TimeoutSec=300: The number of seconds before giving up starting the service. ";
	public static final String questionServiceOl2Li13 = questionServiceOl2Li131;
	public static final String questionServiceOl2Li141 = "[Install]: This section is optional and is used to define the behavior or a unit if it is enabled or disabled. ";
	public static final String questionServiceOl2Li14 = questionServiceOl2Li141;
	public static final String questionServiceOl2Li151 = "WantedBy=multi-user.target: When the service is enabled, a directory called multi-user.target.wants will be created within /etc/systemd/system (if not already available) and a symbolic link to the current unit will be placed within. ";
	public static final String questionServiceOl2Li15 = questionServiceOl2Li151;
	public static final String questionServiceOl2Li161 = "|: Read the string into the following command. ";
	public static final String questionServiceOl2Li16 = questionServiceOl2Li161;
	public static final String questionServiceOl2Li171 = "sudo";
	public static final String questionServiceOl2Li17 = questionServiceOl2Li171;
	public static final String questionServiceOl2Li181 = "tee: Write a string to a file. ";
	public static final String questionServiceOl2Li18 = questionServiceOl2Li181;
	public static final String questionServiceOl2Li191 = "/usr/lib/systemd/system/pgsql.service: A new systemd service file to write to for PostgreSQL. ";
	public static final String questionServiceOl2Li19 = questionServiceOl2Li191;

	/**	L'entité « questionService »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionService = new PageHtml();
	public Couverture<PageHtml> questionServiceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionService").o(questionService);

	/**	<br/>L'entité « questionService »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionService">Trouver l'entité questionService dans Solr</a>
	 * <br/>
	 * @param questionService est l'entité déjà construit. 
	 **/
	protected abstract void _questionService(PageHtml o);

	public PageHtml getQuestionService() {
		return questionService;
	}

	public void setQuestionService(PageHtml questionService) {
		this.questionService = questionService;
		this.questionServiceCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionServiceInit() {
		if(questionService != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionService, "questionService");
			((C001L008CreerCertificat)this).avantPagePart(questionService, "questionService");
		}
		if(!questionServiceCouverture.dejaInitialise) {
			_questionService(questionService);
		}
		questionService.initLoinPourClasse(requeteSite_);
		questionServiceCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionService(PageHtml o) {
		{ e("h3").a("class", " questionServiceH3 ").f();
			{ e("i").a("class", questionServiceH3I1, " site-menu-icon questionServiceH3I ").f();
			} g("i");
			{ e("span").a("class", " questionServiceH3Span ").f();
				sx(questionServiceH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionServiceH4 ").f();
			{ e("i").a("class", questionServiceH4I1, " site-menu-icon questionServiceH4I ").f();
			} g("i");
			{ e("span").a("class", " questionServiceH4Span ").f();
				sx(questionServiceH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionServicePre ").f();
			{ e("span").a("class", " questionServicePreSpan1 questionServicePreSpan odd ").f();
				sx(questionServicePreSpan11);
				e("br").fg();
				sx(questionServicePreSpan1Br1);
			} g("span");
			{ e("span").a("class", " questionServicePreSpan2 questionServicePreSpan even ").f();
				e("br").fg();
				sx(questionServicePreSpan2Br1);
			} g("span");
			{ e("span").a("class", " questionServicePreSpan3 questionServicePreSpan odd ").f();
				e("br").fg();
				sx(questionServicePreSpan3Br1);
				e("br").fg();
				sx(questionServicePreSpan3Br2);
				e("br").fg();
				sx(questionServicePreSpan3Br3);
				e("br").fg();
				sx(questionServicePreSpan3Br4);
				e("br").fg();
				sx(questionServicePreSpan3Br5);
				e("br").fg();
				sx(questionServicePreSpan3Br6);
				e("br").fg();
				sx(questionServicePreSpan3Br7);
				e("br").fg();
				sx(questionServicePreSpan3Br8);
				e("br").fg();
				sx(questionServicePreSpan3Br9);
				e("br").fg();
				sx(questionServicePreSpan3Br10);
				e("br").fg();
				sx(questionServicePreSpan3Br11);
				e("br").fg();
				sx(questionServicePreSpan3Br12);
				e("br").fg();
				sx(questionServicePreSpan3Br13);
				e("br").fg();
				sx(questionServicePreSpan3Br14);
				e("br").fg();
				sx(questionServicePreSpan3Br15);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionServiceOl2 questionServiceOl even ").f();
			{ e("li").a("class", " questionServiceOl2Li01 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li011);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li02 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li021);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li03 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li031);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li04 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li041);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li05 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li051);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li06 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li061);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li07 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li071);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li08 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li081);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li09 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li091);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li10 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li101);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li11 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li111);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li12 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li121);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li13 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li131);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li14 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li141);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li15 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li151);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li16 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li161);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li17 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li171);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li18 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li181);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li19 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li191);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionService() {
		questionService.htmlAvant();
		htmlBodyQuestionService(questionService);
		questionService.htmlApres();
	}

	///////////////////////////////////
	// questionSystemctlDaemonReload //
	///////////////////////////////////

	public static final String questionSystemctlDaemonReloadH3I1 = "far fa-search";
	public static final String questionSystemctlDaemonReloadH3I = questionSystemctlDaemonReloadH3I1;
	public static final String questionSystemctlDaemonReloadH3Span1 = "How does the system know about the new service? ";
	public static final String questionSystemctlDaemonReloadH3Span = questionSystemctlDaemonReloadH3Span1;
	public static final String questionSystemctlDaemonReloadH4I1 = "far fa-redo-alt";
	public static final String questionSystemctlDaemonReloadH4I = questionSystemctlDaemonReloadH4I1;
	public static final String questionSystemctlDaemonReloadH4Span1 = "Reload the systemd daemon. ";
	public static final String questionSystemctlDaemonReloadH4Span = questionSystemctlDaemonReloadH4Span1;
	public static final String questionSystemctlDaemonReloadPreSpan11 = "sudo";
	public static final String questionSystemctlDaemonReloadPreSpan1 = questionSystemctlDaemonReloadPreSpan11;
	public static final String questionSystemctlDaemonReloadPreSpan21 = " systemctl";
	public static final String questionSystemctlDaemonReloadPreSpan2 = questionSystemctlDaemonReloadPreSpan21;
	public static final String questionSystemctlDaemonReloadPreSpan31 = " daemon-reload";
	public static final String questionSystemctlDaemonReloadPreSpan3 = questionSystemctlDaemonReloadPreSpan31;
	public static final String questionSystemctlDaemonReloadOl2Li11 = "sudo";
	public static final String questionSystemctlDaemonReloadOl2Li1 = questionSystemctlDaemonReloadOl2Li11;
	public static final String questionSystemctlDaemonReloadOl2Li21 = "systemctl: Controls the systemd system and service manager. ";
	public static final String questionSystemctlDaemonReloadOl2Li2 = questionSystemctlDaemonReloadOl2Li21;
	public static final String questionSystemctlDaemonReloadOl2Li31 = "daemon-reload: Reload the configuration file of a systemd unit. ";
	public static final String questionSystemctlDaemonReloadOl2Li3 = questionSystemctlDaemonReloadOl2Li31;

	/**	L'entité « questionSystemctlDaemonReload »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlDaemonReload = new PageHtml();
	public Couverture<PageHtml> questionSystemctlDaemonReloadCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlDaemonReload").o(questionSystemctlDaemonReload);

	/**	<br/>L'entité « questionSystemctlDaemonReload »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSystemctlDaemonReload">Trouver l'entité questionSystemctlDaemonReload dans Solr</a>
	 * <br/>
	 * @param questionSystemctlDaemonReload est l'entité déjà construit. 
	 **/
	protected abstract void _questionSystemctlDaemonReload(PageHtml o);

	public PageHtml getQuestionSystemctlDaemonReload() {
		return questionSystemctlDaemonReload;
	}

	public void setQuestionSystemctlDaemonReload(PageHtml questionSystemctlDaemonReload) {
		this.questionSystemctlDaemonReload = questionSystemctlDaemonReload;
		this.questionSystemctlDaemonReloadCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionSystemctlDaemonReloadInit() {
		if(questionSystemctlDaemonReload != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlDaemonReload, "questionSystemctlDaemonReload");
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlDaemonReload, "questionSystemctlDaemonReload");
		}
		if(!questionSystemctlDaemonReloadCouverture.dejaInitialise) {
			_questionSystemctlDaemonReload(questionSystemctlDaemonReload);
		}
		questionSystemctlDaemonReload.initLoinPourClasse(requeteSite_);
		questionSystemctlDaemonReloadCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionSystemctlDaemonReload(PageHtml o) {
		{ e("h3").a("class", " questionSystemctlDaemonReloadH3 ").f();
			{ e("i").a("class", questionSystemctlDaemonReloadH3I1, " site-menu-icon questionSystemctlDaemonReloadH3I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlDaemonReloadH3Span ").f();
				sx(questionSystemctlDaemonReloadH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionSystemctlDaemonReloadH4 ").f();
			{ e("i").a("class", questionSystemctlDaemonReloadH4I1, " site-menu-icon questionSystemctlDaemonReloadH4I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlDaemonReloadH4Span ").f();
				sx(questionSystemctlDaemonReloadH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionSystemctlDaemonReloadPre ").f();
			{ e("span").a("class", " questionSystemctlDaemonReloadPreSpan1 questionSystemctlDaemonReloadPreSpan odd ").f();
				sx(questionSystemctlDaemonReloadPreSpan11);
			} g("span");
			{ e("span").a("class", " questionSystemctlDaemonReloadPreSpan2 questionSystemctlDaemonReloadPreSpan even ").f();
				sx(questionSystemctlDaemonReloadPreSpan21);
			} g("span");
			{ e("span").a("class", " questionSystemctlDaemonReloadPreSpan3 questionSystemctlDaemonReloadPreSpan odd ").f();
				sx(questionSystemctlDaemonReloadPreSpan31);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSystemctlDaemonReloadOl2 questionSystemctlDaemonReloadOl even ").f();
			{ e("li").a("class", " questionSystemctlDaemonReloadOl2Li1 questionSystemctlDaemonReloadOl2Li odd ").f();
				sx(questionSystemctlDaemonReloadOl2Li11);
			} g("li");
			{ e("li").a("class", " questionSystemctlDaemonReloadOl2Li2 questionSystemctlDaemonReloadOl2Li even ").f();
				sx(questionSystemctlDaemonReloadOl2Li21);
			} g("li");
			{ e("li").a("class", " questionSystemctlDaemonReloadOl2Li3 questionSystemctlDaemonReloadOl2Li odd ").f();
				sx(questionSystemctlDaemonReloadOl2Li31);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionSystemctlDaemonReload() {
		questionSystemctlDaemonReload.htmlAvant();
		htmlBodyQuestionSystemctlDaemonReload(questionSystemctlDaemonReload);
		questionSystemctlDaemonReload.htmlApres();
	}

	/////////////////////////////
	// questionSystemctlEnable //
	/////////////////////////////

	public static final String questionSystemctlEnableH3I1 = "far fa-toggle-off";
	public static final String questionSystemctlEnableH3I = questionSystemctlEnableH3I1;
	public static final String questionSystemctlEnableH3Span1 = "How do I enable the PostgreSQL service? ";
	public static final String questionSystemctlEnableH3Span = questionSystemctlEnableH3Span1;
	public static final String questionSystemctlEnableH4I1 = "far fa-toggle-on";
	public static final String questionSystemctlEnableH4I = questionSystemctlEnableH4I1;
	public static final String questionSystemctlEnableH4Span1 = "Use the systemctl enable command. ";
	public static final String questionSystemctlEnableH4Span = questionSystemctlEnableH4Span1;
	public static final String questionSystemctlEnablePreSpan11 = "sudo";
	public static final String questionSystemctlEnablePreSpan1 = questionSystemctlEnablePreSpan11;
	public static final String questionSystemctlEnablePreSpan21 = " systemctl";
	public static final String questionSystemctlEnablePreSpan2 = questionSystemctlEnablePreSpan21;
	public static final String questionSystemctlEnablePreSpan31 = " enable";
	public static final String questionSystemctlEnablePreSpan3 = questionSystemctlEnablePreSpan31;
	public static final String questionSystemctlEnablePreSpan41 = " pgsql";
	public static final String questionSystemctlEnablePreSpan4 = questionSystemctlEnablePreSpan41;
	public static final String questionSystemctlEnableOl2Li11 = "sudo";
	public static final String questionSystemctlEnableOl2Li1 = questionSystemctlEnableOl2Li11;
	public static final String questionSystemctlEnableOl2Li21 = "systemctl";
	public static final String questionSystemctlEnableOl2Li2 = questionSystemctlEnableOl2Li21;
	public static final String questionSystemctlEnableOl2Li31 = "enable: Enable one or more unit files or unit file instances. ";
	public static final String questionSystemctlEnableOl2Li3 = questionSystemctlEnableOl2Li31;
	public static final String questionSystemctlEnableOl2Li41 = "pgsql: Enable the PostgreSQL service to start when the computer starts. ";
	public static final String questionSystemctlEnableOl2Li4 = questionSystemctlEnableOl2Li41;

	/**	L'entité « questionSystemctlEnable »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlEnable = new PageHtml();
	public Couverture<PageHtml> questionSystemctlEnableCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlEnable").o(questionSystemctlEnable);

	/**	<br/>L'entité « questionSystemctlEnable »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSystemctlEnable">Trouver l'entité questionSystemctlEnable dans Solr</a>
	 * <br/>
	 * @param questionSystemctlEnable est l'entité déjà construit. 
	 **/
	protected abstract void _questionSystemctlEnable(PageHtml o);

	public PageHtml getQuestionSystemctlEnable() {
		return questionSystemctlEnable;
	}

	public void setQuestionSystemctlEnable(PageHtml questionSystemctlEnable) {
		this.questionSystemctlEnable = questionSystemctlEnable;
		this.questionSystemctlEnableCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionSystemctlEnableInit() {
		if(questionSystemctlEnable != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlEnable, "questionSystemctlEnable");
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlEnable, "questionSystemctlEnable");
		}
		if(!questionSystemctlEnableCouverture.dejaInitialise) {
			_questionSystemctlEnable(questionSystemctlEnable);
		}
		questionSystemctlEnable.initLoinPourClasse(requeteSite_);
		questionSystemctlEnableCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionSystemctlEnable(PageHtml o) {
		{ e("h3").a("class", " questionSystemctlEnableH3 ").f();
			{ e("i").a("class", questionSystemctlEnableH3I1, " site-menu-icon questionSystemctlEnableH3I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlEnableH3Span ").f();
				sx(questionSystemctlEnableH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionSystemctlEnableH4 ").f();
			{ e("i").a("class", questionSystemctlEnableH4I1, " site-menu-icon questionSystemctlEnableH4I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlEnableH4Span ").f();
				sx(questionSystemctlEnableH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionSystemctlEnablePre ").f();
			{ e("span").a("class", " questionSystemctlEnablePreSpan1 questionSystemctlEnablePreSpan odd ").f();
				sx(questionSystemctlEnablePreSpan11);
			} g("span");
			{ e("span").a("class", " questionSystemctlEnablePreSpan2 questionSystemctlEnablePreSpan even ").f();
				sx(questionSystemctlEnablePreSpan21);
			} g("span");
			{ e("span").a("class", " questionSystemctlEnablePreSpan3 questionSystemctlEnablePreSpan odd ").f();
				sx(questionSystemctlEnablePreSpan31);
			} g("span");
			{ e("span").a("class", " questionSystemctlEnablePreSpan4 questionSystemctlEnablePreSpan even ").f();
				sx(questionSystemctlEnablePreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSystemctlEnableOl2 questionSystemctlEnableOl even ").f();
			{ e("li").a("class", " questionSystemctlEnableOl2Li1 questionSystemctlEnableOl2Li odd ").f();
				sx(questionSystemctlEnableOl2Li11);
			} g("li");
			{ e("li").a("class", " questionSystemctlEnableOl2Li2 questionSystemctlEnableOl2Li even ").f();
				sx(questionSystemctlEnableOl2Li21);
			} g("li");
			{ e("li").a("class", " questionSystemctlEnableOl2Li3 questionSystemctlEnableOl2Li odd ").f();
				sx(questionSystemctlEnableOl2Li31);
			} g("li");
			{ e("li").a("class", " questionSystemctlEnableOl2Li4 questionSystemctlEnableOl2Li even ").f();
				sx(questionSystemctlEnableOl2Li41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionSystemctlEnable() {
		questionSystemctlEnable.htmlAvant();
		htmlBodyQuestionSystemctlEnable(questionSystemctlEnable);
		questionSystemctlEnable.htmlApres();
	}

	////////////////////////////
	// questionSystemctlStart //
	////////////////////////////

	public static final String questionSystemctlStartH3I1 = "far fa-pause-circle";
	public static final String questionSystemctlStartH3I = questionSystemctlStartH3I1;
	public static final String questionSystemctlStartH3Span1 = "How do I start the PostgreSQL service? ";
	public static final String questionSystemctlStartH3Span = questionSystemctlStartH3Span1;
	public static final String questionSystemctlStartH4I1 = "far fa-play-circle";
	public static final String questionSystemctlStartH4I = questionSystemctlStartH4I1;
	public static final String questionSystemctlStartH4Span1 = "Use the systemctl start command. ";
	public static final String questionSystemctlStartH4Span = questionSystemctlStartH4Span1;
	public static final String questionSystemctlStartPreSpan11 = "sudo";
	public static final String questionSystemctlStartPreSpan1 = questionSystemctlStartPreSpan11;
	public static final String questionSystemctlStartPreSpan21 = " systemctl";
	public static final String questionSystemctlStartPreSpan2 = questionSystemctlStartPreSpan21;
	public static final String questionSystemctlStartPreSpan31 = " start";
	public static final String questionSystemctlStartPreSpan3 = questionSystemctlStartPreSpan31;
	public static final String questionSystemctlStartPreSpan41 = " pgsql";
	public static final String questionSystemctlStartPreSpan4 = questionSystemctlStartPreSpan41;
	public static final String questionSystemctlStartOl2Li11 = "sudo";
	public static final String questionSystemctlStartOl2Li1 = questionSystemctlStartOl2Li11;
	public static final String questionSystemctlStartOl2Li21 = "systemctl";
	public static final String questionSystemctlStartOl2Li2 = questionSystemctlStartOl2Li21;
	public static final String questionSystemctlStartOl2Li31 = "start: Start one or more services. ";
	public static final String questionSystemctlStartOl2Li3 = questionSystemctlStartOl2Li31;
	public static final String questionSystemctlStartOl2Li41 = "pgsql: Start the PostgreSQL service. ";
	public static final String questionSystemctlStartOl2Li4 = questionSystemctlStartOl2Li41;

	/**	L'entité « questionSystemctlStart »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlStart = new PageHtml();
	public Couverture<PageHtml> questionSystemctlStartCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlStart").o(questionSystemctlStart);

	/**	<br/>L'entité « questionSystemctlStart »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSystemctlStart">Trouver l'entité questionSystemctlStart dans Solr</a>
	 * <br/>
	 * @param questionSystemctlStart est l'entité déjà construit. 
	 **/
	protected abstract void _questionSystemctlStart(PageHtml o);

	public PageHtml getQuestionSystemctlStart() {
		return questionSystemctlStart;
	}

	public void setQuestionSystemctlStart(PageHtml questionSystemctlStart) {
		this.questionSystemctlStart = questionSystemctlStart;
		this.questionSystemctlStartCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionSystemctlStartInit() {
		if(questionSystemctlStart != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlStart, "questionSystemctlStart");
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlStart, "questionSystemctlStart");
		}
		if(!questionSystemctlStartCouverture.dejaInitialise) {
			_questionSystemctlStart(questionSystemctlStart);
		}
		questionSystemctlStart.initLoinPourClasse(requeteSite_);
		questionSystemctlStartCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionSystemctlStart(PageHtml o) {
		{ e("h3").a("class", " questionSystemctlStartH3 ").f();
			{ e("i").a("class", questionSystemctlStartH3I1, " site-menu-icon questionSystemctlStartH3I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlStartH3Span ").f();
				sx(questionSystemctlStartH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionSystemctlStartH4 ").f();
			{ e("i").a("class", questionSystemctlStartH4I1, " site-menu-icon questionSystemctlStartH4I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlStartH4Span ").f();
				sx(questionSystemctlStartH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionSystemctlStartPre ").f();
			{ e("span").a("class", " questionSystemctlStartPreSpan1 questionSystemctlStartPreSpan odd ").f();
				sx(questionSystemctlStartPreSpan11);
			} g("span");
			{ e("span").a("class", " questionSystemctlStartPreSpan2 questionSystemctlStartPreSpan even ").f();
				sx(questionSystemctlStartPreSpan21);
			} g("span");
			{ e("span").a("class", " questionSystemctlStartPreSpan3 questionSystemctlStartPreSpan odd ").f();
				sx(questionSystemctlStartPreSpan31);
			} g("span");
			{ e("span").a("class", " questionSystemctlStartPreSpan4 questionSystemctlStartPreSpan even ").f();
				sx(questionSystemctlStartPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSystemctlStartOl2 questionSystemctlStartOl even ").f();
			{ e("li").a("class", " questionSystemctlStartOl2Li1 questionSystemctlStartOl2Li odd ").f();
				sx(questionSystemctlStartOl2Li11);
			} g("li");
			{ e("li").a("class", " questionSystemctlStartOl2Li2 questionSystemctlStartOl2Li even ").f();
				sx(questionSystemctlStartOl2Li21);
			} g("li");
			{ e("li").a("class", " questionSystemctlStartOl2Li3 questionSystemctlStartOl2Li odd ").f();
				sx(questionSystemctlStartOl2Li31);
			} g("li");
			{ e("li").a("class", " questionSystemctlStartOl2Li4 questionSystemctlStartOl2Li even ").f();
				sx(questionSystemctlStartOl2Li41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionSystemctlStart() {
		questionSystemctlStart.htmlAvant();
		htmlBodyQuestionSystemctlStart(questionSystemctlStart);
		questionSystemctlStart.htmlApres();
	}

	/////////////////////////////
	// questionSystemctlStatus //
	/////////////////////////////

	public static final String questionSystemctlStatusH3I1 = "far fa-clipboard";
	public static final String questionSystemctlStatusH3I = questionSystemctlStatusH3I1;
	public static final String questionSystemctlStatusH3Span1 = "How do I make sure the PostgreSQL service started successfully? ";
	public static final String questionSystemctlStatusH3Span = questionSystemctlStatusH3Span1;
	public static final String questionSystemctlStatusH4I1 = "far fa-clipboard-check";
	public static final String questionSystemctlStatusH4I = questionSystemctlStatusH4I1;
	public static final String questionSystemctlStatusH4Span1 = "Use the systemctl status command. ";
	public static final String questionSystemctlStatusH4Span = questionSystemctlStatusH4Span1;
	public static final String questionSystemctlStatusPreSpan11 = "sudo";
	public static final String questionSystemctlStatusPreSpan1 = questionSystemctlStatusPreSpan11;
	public static final String questionSystemctlStatusPreSpan21 = " systemctl";
	public static final String questionSystemctlStatusPreSpan2 = questionSystemctlStatusPreSpan21;
	public static final String questionSystemctlStatusPreSpan31 = " status";
	public static final String questionSystemctlStatusPreSpan3 = questionSystemctlStatusPreSpan31;
	public static final String questionSystemctlStatusPreSpan41 = " pgsql";
	public static final String questionSystemctlStatusPreSpan4 = questionSystemctlStatusPreSpan41;
	public static final String questionSystemctlStatusOl2Li11 = "sudo";
	public static final String questionSystemctlStatusOl2Li1 = questionSystemctlStatusOl2Li11;
	public static final String questionSystemctlStatusOl2Li21 = "systemctl";
	public static final String questionSystemctlStatusOl2Li2 = questionSystemctlStatusOl2Li21;
	public static final String questionSystemctlStatusOl2Li31 = "status: Check the status of one or more services. ";
	public static final String questionSystemctlStatusOl2Li3 = questionSystemctlStatusOl2Li31;
	public static final String questionSystemctlStatusOl2Li41 = "pgsql: Check the status of the PostgreSQL service. ";
	public static final String questionSystemctlStatusOl2Li4 = questionSystemctlStatusOl2Li41;
	public static final String questionSystemctlStatusP21 = "Now enjoy that latest and greatest open source database server of yours. ";
	public static final String questionSystemctlStatusP2 = questionSystemctlStatusP21;

	/**	L'entité « questionSystemctlStatus »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlStatus = new PageHtml();
	public Couverture<PageHtml> questionSystemctlStatusCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlStatus").o(questionSystemctlStatus);

	/**	<br/>L'entité « questionSystemctlStatus »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSystemctlStatus">Trouver l'entité questionSystemctlStatus dans Solr</a>
	 * <br/>
	 * @param questionSystemctlStatus est l'entité déjà construit. 
	 **/
	protected abstract void _questionSystemctlStatus(PageHtml o);

	public PageHtml getQuestionSystemctlStatus() {
		return questionSystemctlStatus;
	}

	public void setQuestionSystemctlStatus(PageHtml questionSystemctlStatus) {
		this.questionSystemctlStatus = questionSystemctlStatus;
		this.questionSystemctlStatusCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionSystemctlStatusInit() {
		if(questionSystemctlStatus != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlStatus, "questionSystemctlStatus");
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlStatus, "questionSystemctlStatus");
		}
		if(!questionSystemctlStatusCouverture.dejaInitialise) {
			_questionSystemctlStatus(questionSystemctlStatus);
		}
		questionSystemctlStatus.initLoinPourClasse(requeteSite_);
		questionSystemctlStatusCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionSystemctlStatus(PageHtml o) {
		{ e("h3").a("class", " questionSystemctlStatusH3 ").f();
			{ e("i").a("class", questionSystemctlStatusH3I1, " site-menu-icon questionSystemctlStatusH3I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlStatusH3Span ").f();
				sx(questionSystemctlStatusH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionSystemctlStatusH4 ").f();
			{ e("i").a("class", questionSystemctlStatusH4I1, " site-menu-icon questionSystemctlStatusH4I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlStatusH4Span ").f();
				sx(questionSystemctlStatusH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionSystemctlStatusPre ").f();
			{ e("span").a("class", " questionSystemctlStatusPreSpan1 questionSystemctlStatusPreSpan odd ").f();
				sx(questionSystemctlStatusPreSpan11);
			} g("span");
			{ e("span").a("class", " questionSystemctlStatusPreSpan2 questionSystemctlStatusPreSpan even ").f();
				sx(questionSystemctlStatusPreSpan21);
			} g("span");
			{ e("span").a("class", " questionSystemctlStatusPreSpan3 questionSystemctlStatusPreSpan odd ").f();
				sx(questionSystemctlStatusPreSpan31);
			} g("span");
			{ e("span").a("class", " questionSystemctlStatusPreSpan4 questionSystemctlStatusPreSpan even ").f();
				sx(questionSystemctlStatusPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSystemctlStatusOl2 questionSystemctlStatusOl even ").f();
			{ e("li").a("class", " questionSystemctlStatusOl2Li1 questionSystemctlStatusOl2Li odd ").f();
				sx(questionSystemctlStatusOl2Li11);
			} g("li");
			{ e("li").a("class", " questionSystemctlStatusOl2Li2 questionSystemctlStatusOl2Li even ").f();
				sx(questionSystemctlStatusOl2Li21);
			} g("li");
			{ e("li").a("class", " questionSystemctlStatusOl2Li3 questionSystemctlStatusOl2Li odd ").f();
				sx(questionSystemctlStatusOl2Li31);
			} g("li");
			{ e("li").a("class", " questionSystemctlStatusOl2Li4 questionSystemctlStatusOl2Li even ").f();
				sx(questionSystemctlStatusOl2Li41);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionSystemctlStatusP2 questionSystemctlStatusP even ").f();
			sx(questionSystemctlStatusP21);
		} g("p");
	}
	public void htmlBodyQuestionSystemctlStatus() {
		questionSystemctlStatus.htmlAvant();
		htmlBodyQuestionSystemctlStatus(questionSystemctlStatus);
		questionSystemctlStatus.htmlApres();
	}

	//////////////////
	// recapituler1 //
	//////////////////

	public static final String recapituler1H31 = "To review: ";
	public static final String recapituler1H3 = recapituler1H31;

	/**	L'entité « recapituler1 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler1 = new PageHtml();
	public Couverture<PageHtml> recapituler1Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler1").o(recapituler1);

	/**	<br/>L'entité « recapituler1 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
	 * <br/>
	 * @param recapituler1 est l'entité déjà construit. 
	 **/
	protected abstract void _recapituler1(PageHtml o);

	public PageHtml getRecapituler1() {
		return recapituler1;
	}

	public void setRecapituler1(PageHtml recapituler1) {
		this.recapituler1 = recapituler1;
		this.recapituler1Couverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat recapituler1Init() {
		if(recapituler1 != null) {
			((C001L008CreerCertificat)this).avantPagePart(recapituler1, "recapituler1");
			((C001L008CreerCertificat)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyRecapituler1(PageHtml o) {
		{ e("h3").a("class", " recapituler1H3 ").f();
			sx(recapituler1H31);
		} g("h3");
	}
	public void htmlBodyRecapituler1() {
		recapituler1.htmlAvant();
		htmlBodyRecapituler1(recapituler1);
		recapituler1.htmlApres();
	}

	//////////////////
	// recapituler2 //
	//////////////////

	public static final String recapituler2TableTr1Td11 = "Thursday ";
	public static final String recapituler2TableTr1Td1 = recapituler2TableTr1Td11;
	public static final String recapituler2TableTr1Td2I1 = "far fa-fast-forward";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "far fa-file-code";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "far fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "May 16 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "How do I install the latest version of PostgreSQL. ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "Install PostgreSQL from the source code. ";
	public static final String recapituler2TableTr2Td3 = recapituler2TableTr2Td31;
	public static final String recapituler2TableTr2Td41 = "By Christopher Tate";
	public static final String recapituler2TableTr2Td4 = recapituler2TableTr2Td41;

	/**	L'entité « recapituler2 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler2 = new PageHtml();
	public Couverture<PageHtml> recapituler2Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler2").o(recapituler2);

	/**	<br/>L'entité « recapituler2 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
	 * <br/>
	 * @param recapituler2 est l'entité déjà construit. 
	 **/
	protected abstract void _recapituler2(PageHtml o);

	public PageHtml getRecapituler2() {
		return recapituler2;
	}

	public void setRecapituler2(PageHtml recapituler2) {
		this.recapituler2 = recapituler2;
		this.recapituler2Couverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat recapituler2Init() {
		if(recapituler2 != null) {
			((C001L008CreerCertificat)this).avantPagePart(recapituler2, "recapituler2");
			((C001L008CreerCertificat)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyRecapituler2(PageHtml o) {
		{ e("table").a("class", " recapituler2Table ").f();
			{ e("tr").a("class", " recapituler2TableTr1 recapituler2TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td1 recapituler2TableTr1Td odd ").f();
					sx(recapituler2TableTr1Td11);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td2 recapituler2TableTr1Td even ").f();
					{ e("i").a("class", recapituler2TableTr1Td2I1, " site-menu-icon recapituler2TableTr1Td2I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td3 recapituler2TableTr1Td odd ").f();
					{ e("i").a("class", recapituler2TableTr1Td3I1, " site-menu-icon recapituler2TableTr1Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td4 recapituler2TableTr1Td even ").f();
					{ e("i").a("class", recapituler2TableTr1Td4I1, " site-menu-icon recapituler2TableTr1Td4I ").f();
					} g("i");
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler2TableTr2 recapituler2TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td1 recapituler2TableTr2Td odd ").f();
					sx(recapituler2TableTr2Td11);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td2 recapituler2TableTr2Td even ").f();
					sx(recapituler2TableTr2Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td3 recapituler2TableTr2Td odd ").f();
					sx(recapituler2TableTr2Td31);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td4 recapituler2TableTr2Td even ").f();
					sx(recapituler2TableTr2Td41);
				} g("td");
			} g("tr");
		} g("table");
	}
	public void htmlBodyRecapituler2() {
		recapituler2.htmlAvant();
		htmlBodyRecapituler2(recapituler2);
		recapituler2.htmlApres();
	}

	//////////////////
	// recapituler3 //
	//////////////////

	public static final String recapituler3TableTr01Td1I1 = "far fa-question";
	public static final String recapituler3TableTr01Td1I = recapituler3TableTr01Td1I1;
	public static final String recapituler3TableTr01Td21 = "Questions";
	public static final String recapituler3TableTr01Td2 = recapituler3TableTr01Td21;
	public static final String recapituler3TableTr01Td3I1 = "far fa-bullhorn";
	public static final String recapituler3TableTr01Td3I = recapituler3TableTr01Td3I1;
	public static final String recapituler3TableTr01Td41 = "Answers";
	public static final String recapituler3TableTr01Td4 = recapituler3TableTr01Td41;
	public static final String recapituler3TableTr02Td1I1 = "far fa-conveyor-belt-alt";
	public static final String recapituler3TableTr02Td1I = recapituler3TableTr02Td1I1;
	public static final String recapituler3TableTr02Td21 = "How do I install the dependencies for PostgreSQL? ";
	public static final String recapituler3TableTr02Td2 = recapituler3TableTr02Td21;
	public static final String recapituler3TableTr02Td3Span1I1 = "far fa-cookie";
	public static final String recapituler3TableTr02Td3Span1I = recapituler3TableTr02Td3Span1I1;
	public static final String recapituler3TableTr02Td41 = "Build the dependencies with yum. ";
	public static final String recapituler3TableTr02Td4 = recapituler3TableTr02Td41;
	public static final String recapituler3TableTr03Td1I1 = "far fa-files-medical";
	public static final String recapituler3TableTr03Td1I = recapituler3TableTr03Td1I1;
	public static final String recapituler3TableTr03Td21 = "Where do I put the PostgreSQL source code? ";
	public static final String recapituler3TableTr03Td2 = recapituler3TableTr03Td21;
	public static final String recapituler3TableTr03Td3I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr03Td3I = recapituler3TableTr03Td3I1;
	public static final String recapituler3TableTr03Td41 = "Create a PostgreSQL directory in /usr/local/src. ";
	public static final String recapituler3TableTr03Td4 = recapituler3TableTr03Td41;
	public static final String recapituler3TableTr04Td1I1 = "far fa-map-pin";
	public static final String recapituler3TableTr04Td1I = recapituler3TableTr04Td1I1;
	public static final String recapituler3TableTr04Td21 = "Where do I install PostgreSQL? ";
	public static final String recapituler3TableTr04Td2 = recapituler3TableTr04Td21;
	public static final String recapituler3TableTr04Td3Span1I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr04Td3Span1I = recapituler3TableTr04Td3Span1I1;
	public static final String recapituler3TableTr04Td41 = "Create a PostgreSQL directory in /opt. ";
	public static final String recapituler3TableTr04Td4 = recapituler3TableTr04Td41;
	public static final String recapituler3TableTr05Td1I1 = "far fa-cloud-download";
	public static final String recapituler3TableTr05Td1I = recapituler3TableTr05Td1I1;
	public static final String recapituler3TableTr05Td21 = "How do I download the PostgreSQL source code? ";
	public static final String recapituler3TableTr05Td2 = recapituler3TableTr05Td21;
	public static final String recapituler3TableTr05Td3I1 = "fab fa-git";
	public static final String recapituler3TableTr05Td3I = recapituler3TableTr05Td3I1;
	public static final String recapituler3TableTr05Td41 = "Clone the source code with the git command. ";
	public static final String recapituler3TableTr05Td4 = recapituler3TableTr05Td41;
	public static final String recapituler3TableTr06Td1I1 = "far fa-code-branch";
	public static final String recapituler3TableTr06Td1I = recapituler3TableTr06Td1I1;
	public static final String recapituler3TableTr06Td21 = "How do I pick a recent version of PostgreSQL? ";
	public static final String recapituler3TableTr06Td2 = recapituler3TableTr06Td21;
	public static final String recapituler3TableTr06Td3I1 = "far fa-tag";
	public static final String recapituler3TableTr06Td3I = recapituler3TableTr06Td3I1;
	public static final String recapituler3TableTr06Td41 = "List all the tags in the git repository. ";
	public static final String recapituler3TableTr06Td4 = recapituler3TableTr06Td41;
	public static final String recapituler3TableTr07Td1I1 = "far fa-code-merge";
	public static final String recapituler3TableTr07Td1I = recapituler3TableTr07Td1I1;
	public static final String recapituler3TableTr07Td21 = "How do I switch versions of the PostgreSQL source code? ";
	public static final String recapituler3TableTr07Td2 = recapituler3TableTr07Td21;
	public static final String recapituler3TableTr07Td3I1 = "far fa-code-commit";
	public static final String recapituler3TableTr07Td3I = recapituler3TableTr07Td3I1;
	public static final String recapituler3TableTr07Td41 = "Checkout the git tag. ";
	public static final String recapituler3TableTr07Td4 = recapituler3TableTr07Td41;
	public static final String recapituler3TableTr08Td1I1 = "far fa-tools";
	public static final String recapituler3TableTr08Td1I = recapituler3TableTr08Td1I1;
	public static final String recapituler3TableTr08Td21 = "How do I build the PostgreSQL source code? ";
	public static final String recapituler3TableTr08Td2 = recapituler3TableTr08Td21;
	public static final String recapituler3TableTr08Td3I1 = "far fa-terminal";
	public static final String recapituler3TableTr08Td3I = recapituler3TableTr08Td3I1;
	public static final String recapituler3TableTr08Td41 = "Build PostgreSQL with the configure command. ";
	public static final String recapituler3TableTr08Td4 = recapituler3TableTr08Td41;
	public static final String recapituler3TableTr09Td1I1 = "far fa-map-pin";
	public static final String recapituler3TableTr09Td1I = recapituler3TableTr09Td1I1;
	public static final String recapituler3TableTr09Td21 = "After installing PostgreSQL, where is my data directory? ";
	public static final String recapituler3TableTr09Td2 = recapituler3TableTr09Td21;
	public static final String recapituler3TableTr09Td3I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr09Td3I = recapituler3TableTr09Td3I1;
	public static final String recapituler3TableTr09Td41 = "Create a pgsql directory in /srv. ";
	public static final String recapituler3TableTr09Td4 = recapituler3TableTr09Td41;
	public static final String recapituler3TableTr10Td1I1 = "far fa-database";
	public static final String recapituler3TableTr10Td1I = recapituler3TableTr10Td1I1;
	public static final String recapituler3TableTr10Td21 = "How do I create a new PostgreSQL database? ";
	public static final String recapituler3TableTr10Td2 = recapituler3TableTr10Td21;
	public static final String recapituler3TableTr10Td3I1 = "far fa-table";
	public static final String recapituler3TableTr10Td3I = recapituler3TableTr10Td3I1;
	public static final String recapituler3TableTr10Td41 = "How to initialize a new PostgreSQL server. ";
	public static final String recapituler3TableTr10Td4 = recapituler3TableTr10Td41;
	public static final String recapituler3TableTr11Td1I1 = "far fa-alarm-clock";
	public static final String recapituler3TableTr11Td1I = recapituler3TableTr11Td1I1;
	public static final String recapituler3TableTr11Td21 = "How do I run PostgreSQL all the time, when my computer starts up? ";
	public static final String recapituler3TableTr11Td2 = recapituler3TableTr11Td21;
	public static final String recapituler3TableTr11Td3I1 = "far fa-layer-plus";
	public static final String recapituler3TableTr11Td3I = recapituler3TableTr11Td3I1;
	public static final String recapituler3TableTr11Td41 = "How to run PostgreSQL as a systemd service. ";
	public static final String recapituler3TableTr11Td4 = recapituler3TableTr11Td41;
	public static final String recapituler3TableTr12Td1I1 = "far fa-search";
	public static final String recapituler3TableTr12Td1I = recapituler3TableTr12Td1I1;
	public static final String recapituler3TableTr12Td21 = "How does the system know about the new service? ";
	public static final String recapituler3TableTr12Td2 = recapituler3TableTr12Td21;
	public static final String recapituler3TableTr12Td3I1 = "far fa-redo-alt";
	public static final String recapituler3TableTr12Td3I = recapituler3TableTr12Td3I1;
	public static final String recapituler3TableTr12Td41 = "Reload the systemd daemon. ";
	public static final String recapituler3TableTr12Td4 = recapituler3TableTr12Td41;
	public static final String recapituler3TableTr13Td1I1 = "far fa-toggle-off";
	public static final String recapituler3TableTr13Td1I = recapituler3TableTr13Td1I1;
	public static final String recapituler3TableTr13Td21 = "How do I enable the PostgreSQL service? ";
	public static final String recapituler3TableTr13Td2 = recapituler3TableTr13Td21;
	public static final String recapituler3TableTr13Td3I1 = "far fa-toggle-on";
	public static final String recapituler3TableTr13Td3I = recapituler3TableTr13Td3I1;
	public static final String recapituler3TableTr13Td41 = "Use the systemctl enable command. ";
	public static final String recapituler3TableTr13Td4 = recapituler3TableTr13Td41;
	public static final String recapituler3TableTr14Td1I1 = "far fa-pause-circle";
	public static final String recapituler3TableTr14Td1I = recapituler3TableTr14Td1I1;
	public static final String recapituler3TableTr14Td21 = "How do I start the PostgreSQL service? ";
	public static final String recapituler3TableTr14Td2 = recapituler3TableTr14Td21;
	public static final String recapituler3TableTr14Td3I1 = "far fa-play-circle";
	public static final String recapituler3TableTr14Td3I = recapituler3TableTr14Td3I1;
	public static final String recapituler3TableTr14Td41 = "Use the systemctl start command. ";
	public static final String recapituler3TableTr14Td4 = recapituler3TableTr14Td41;
	public static final String recapituler3TableTr15Td1I1 = "far fa-clipboard";
	public static final String recapituler3TableTr15Td1I = recapituler3TableTr15Td1I1;
	public static final String recapituler3TableTr15Td21 = "How do I make sure the PostgreSQL service started successfully? ";
	public static final String recapituler3TableTr15Td2 = recapituler3TableTr15Td21;
	public static final String recapituler3TableTr15Td3I1 = "far fa-clipboard-check";
	public static final String recapituler3TableTr15Td3I = recapituler3TableTr15Td3I1;
	public static final String recapituler3TableTr15Td41 = "Use the systemctl status command. ";
	public static final String recapituler3TableTr15Td4 = recapituler3TableTr15Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
	 * <br/>
	 * @param recapituler3 est l'entité déjà construit. 
	 **/
	protected abstract void _recapituler3(PageHtml o);

	public PageHtml getRecapituler3() {
		return recapituler3;
	}

	public void setRecapituler3(PageHtml recapituler3) {
		this.recapituler3 = recapituler3;
		this.recapituler3Couverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat recapituler3Init() {
		if(recapituler3 != null) {
			((C001L008CreerCertificat)this).avantPagePart(recapituler3, "recapituler3");
			((C001L008CreerCertificat)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyRecapituler3(PageHtml o) {
		{ e("table").a("class", " recapituler3Table ").f();
			{ e("tr").a("class", " recapituler3TableTr01 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr01Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr01Td1I1, " site-menu-icon recapituler3TableTr01Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr01Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr01Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr01Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr01Td3I1, " site-menu-icon recapituler3TableTr01Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr01Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr01Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr02 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr02Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr02Td1I1, " site-menu-icon recapituler3TableTr02Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr02Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr02Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr02Td3 recapituler3TableTr odd ").f();
					{ e("span").a("class", " recapituler3TableTr02Td3Span1 recapituler3TableTr odd ").f();
						{ e("i").a("class", recapituler3TableTr02Td3Span1I1, " site-menu-icon recapituler3TableTr02Td3Span1I ").f();
						} g("i");
					} g("span");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr02Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr02Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr03 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr03Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr03Td1I1, " site-menu-icon recapituler3TableTr03Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr03Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr03Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr03Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr03Td3I1, " site-menu-icon recapituler3TableTr03Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr03Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr03Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr04 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr04Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr04Td1I1, " site-menu-icon recapituler3TableTr04Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr04Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr04Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr04Td3 recapituler3TableTr odd ").f();
					{ e("span").a("class", " recapituler3TableTr04Td3Span1 recapituler3TableTr odd ").f();
						{ e("i").a("class", recapituler3TableTr04Td3Span1I1, " site-menu-icon recapituler3TableTr04Td3Span1I ").f();
						} g("i");
					} g("span");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr04Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr04Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr05 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr05Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr05Td1I1, " site-menu-icon recapituler3TableTr05Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr05Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr05Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr05Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr05Td3I1, " site-menu-icon recapituler3TableTr05Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr05Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr05Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr06 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr06Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr06Td1I1, " site-menu-icon recapituler3TableTr06Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr06Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr06Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr06Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr06Td3I1, " site-menu-icon recapituler3TableTr06Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr06Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr06Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr07 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr07Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr07Td1I1, " site-menu-icon recapituler3TableTr07Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr07Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr07Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr07Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr07Td3I1, " site-menu-icon recapituler3TableTr07Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr07Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr07Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr08 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr08Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr08Td1I1, " site-menu-icon recapituler3TableTr08Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr08Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr08Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr08Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr08Td3I1, " site-menu-icon recapituler3TableTr08Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr08Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr08Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr09 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr09Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr09Td1I1, " site-menu-icon recapituler3TableTr09Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr09Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr09Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr09Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr09Td3I1, " site-menu-icon recapituler3TableTr09Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr09Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr09Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr10 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr10Td1 recapituler3TableTr1 odd ").f();
					{ e("i").a("class", recapituler3TableTr10Td1I1, " site-menu-icon recapituler3TableTr10Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr10Td2 recapituler3TableTr1 even ").f();
					sx(recapituler3TableTr10Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr10Td3 recapituler3TableTr1 odd ").f();
					{ e("i").a("class", recapituler3TableTr10Td3I1, " site-menu-icon recapituler3TableTr10Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr10Td4 recapituler3TableTr1 even ").f();
					sx(recapituler3TableTr10Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr11 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr11Td1 recapituler3TableTr11Td odd ").f();
					{ e("i").a("class", recapituler3TableTr11Td1I1, " site-menu-icon recapituler3TableTr11Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr11Td2 recapituler3TableTr11Td even ").f();
					sx(recapituler3TableTr11Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr11Td3 recapituler3TableTr11Td odd ").f();
					{ e("i").a("class", recapituler3TableTr11Td3I1, " site-menu-icon recapituler3TableTr11Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr11Td4 recapituler3TableTr11Td even ").f();
					sx(recapituler3TableTr11Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr12 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr12Td1 recapituler3TableTr12Td odd ").f();
					{ e("i").a("class", recapituler3TableTr12Td1I1, " site-menu-icon recapituler3TableTr12Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr12Td2 recapituler3TableTr12Td even ").f();
					sx(recapituler3TableTr12Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr12Td3 recapituler3TableTr12Td odd ").f();
					{ e("i").a("class", recapituler3TableTr12Td3I1, " site-menu-icon recapituler3TableTr12Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr12Td4 recapituler3TableTr12Td even ").f();
					sx(recapituler3TableTr12Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr13 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr13Td1 recapituler3TableTr13Td odd ").f();
					{ e("i").a("class", recapituler3TableTr13Td1I1, " site-menu-icon recapituler3TableTr13Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr13Td2 recapituler3TableTr13Td even ").f();
					sx(recapituler3TableTr13Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr13Td3 recapituler3TableTr13Td odd ").f();
					{ e("i").a("class", recapituler3TableTr13Td3I1, " site-menu-icon recapituler3TableTr13Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr13Td4 recapituler3TableTr13Td even ").f();
					sx(recapituler3TableTr13Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr14 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr14Td1 recapituler3TableTr14Td odd ").f();
					{ e("i").a("class", recapituler3TableTr14Td1I1, " site-menu-icon recapituler3TableTr14Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr14Td2 recapituler3TableTr14Td even ").f();
					sx(recapituler3TableTr14Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr14Td3 recapituler3TableTr14Td odd ").f();
					{ e("i").a("class", recapituler3TableTr14Td3I1, " site-menu-icon recapituler3TableTr14Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr14Td4 recapituler3TableTr14Td even ").f();
					sx(recapituler3TableTr14Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr15 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr15Td1 recapituler3TableTr15Td odd ").f();
					{ e("i").a("class", recapituler3TableTr15Td1I1, " site-menu-icon recapituler3TableTr15Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr15Td2 recapituler3TableTr15Td even ").f();
					sx(recapituler3TableTr15Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr15Td3 recapituler3TableTr15Td odd ").f();
					{ e("i").a("class", recapituler3TableTr15Td3I1, " site-menu-icon recapituler3TableTr15Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr15Td4 recapituler3TableTr15Td even ").f();
					sx(recapituler3TableTr15Td41);
				} g("td");
			} g("tr");
		} g("table");
	}
	public void htmlBodyRecapituler3() {
		recapituler3.htmlAvant();
		htmlBodyRecapituler3(recapituler3);
		recapituler3.htmlApres();
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L008CreerCertificat = false;

	public C001L008CreerCertificat initLoinC001L008CreerCertificat(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L008CreerCertificat) {
			dejaInitialiseC001L008CreerCertificat = true;
			initLoinC001L008CreerCertificat();
		}
		return (C001L008CreerCertificat)this;
	}

	public void initLoinC001L008CreerCertificat() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L008CreerCertificat();
	}

	public void initC001L008CreerCertificat() {
		moiInit();
		questionDependencesInit();
		questionMkdirSrvInit();
		questionCertbotInit();
		questionClonerSourceInit();
		questionListerTagsInit();
		questionCheckoutTagInit();
		questionConstruireSourceInit();
		questionMkdirServeurInit();
		questionDonneesInit();
		questionServiceInit();
		questionSystemctlDaemonReloadInit();
		questionSystemctlEnableInit();
		questionSystemctlStartInit();
		questionSystemctlStatusInit();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L008CreerCertificat(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L008CreerCertificat(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(questionDependences != null)
			questionDependences.setRequeteSite_(requeteSite_);
		if(questionMkdirSrv != null)
			questionMkdirSrv.setRequeteSite_(requeteSite_);
		if(questionCertbot != null)
			questionCertbot.setRequeteSite_(requeteSite_);
		if(questionClonerSource != null)
			questionClonerSource.setRequeteSite_(requeteSite_);
		if(questionListerTags != null)
			questionListerTags.setRequeteSite_(requeteSite_);
		if(questionCheckoutTag != null)
			questionCheckoutTag.setRequeteSite_(requeteSite_);
		if(questionConstruireSource != null)
			questionConstruireSource.setRequeteSite_(requeteSite_);
		if(questionMkdirServeur != null)
			questionMkdirServeur.setRequeteSite_(requeteSite_);
		if(questionDonnees != null)
			questionDonnees.setRequeteSite_(requeteSite_);
		if(questionService != null)
			questionService.setRequeteSite_(requeteSite_);
		if(questionSystemctlDaemonReload != null)
			questionSystemctlDaemonReload.setRequeteSite_(requeteSite_);
		if(questionSystemctlEnable != null)
			questionSystemctlEnable.setRequeteSite_(requeteSite_);
		if(questionSystemctlStart != null)
			questionSystemctlStart.setRequeteSite_(requeteSite_);
		if(questionSystemctlStatus != null)
			questionSystemctlStatus.setRequeteSite_(requeteSite_);
		if(recapituler1 != null)
			recapituler1.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L008CreerCertificat(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L008CreerCertificat(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L008CreerCertificat(String var) {
		C001L008CreerCertificat oC001L008CreerCertificat = (C001L008CreerCertificat)this;
		switch(var) {
			case "moi":
				return oC001L008CreerCertificat.moi;
			case "questionDependences":
				return oC001L008CreerCertificat.questionDependences;
			case "questionMkdirSrv":
				return oC001L008CreerCertificat.questionMkdirSrv;
			case "questionCertbot":
				return oC001L008CreerCertificat.questionCertbot;
			case "questionClonerSource":
				return oC001L008CreerCertificat.questionClonerSource;
			case "questionListerTags":
				return oC001L008CreerCertificat.questionListerTags;
			case "questionCheckoutTag":
				return oC001L008CreerCertificat.questionCheckoutTag;
			case "questionConstruireSource":
				return oC001L008CreerCertificat.questionConstruireSource;
			case "questionMkdirServeur":
				return oC001L008CreerCertificat.questionMkdirServeur;
			case "questionDonnees":
				return oC001L008CreerCertificat.questionDonnees;
			case "questionService":
				return oC001L008CreerCertificat.questionService;
			case "questionSystemctlDaemonReload":
				return oC001L008CreerCertificat.questionSystemctlDaemonReload;
			case "questionSystemctlEnable":
				return oC001L008CreerCertificat.questionSystemctlEnable;
			case "questionSystemctlStart":
				return oC001L008CreerCertificat.questionSystemctlStart;
			case "questionSystemctlStatus":
				return oC001L008CreerCertificat.questionSystemctlStatus;
			case "recapituler1":
				return oC001L008CreerCertificat.recapituler1;
			case "recapituler2":
				return oC001L008CreerCertificat.recapituler2;
			case "recapituler3":
				return oC001L008CreerCertificat.recapituler3;
			default:
				return super.obtenirC001Lecon(var);
		}
	}

	///////////////
	// attribuer //
	///////////////

	@Override public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerC001L008CreerCertificat(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L008CreerCertificat(String var, Object val) {
		C001L008CreerCertificat oC001L008CreerCertificat = (C001L008CreerCertificat)this;
		switch(var) {
			default:
				return super.attribuerC001Lecon(var, val);
		}
	}

	/////////////
	// definir //
	/////////////

	@Override public boolean definirPourClasse(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirC001L008CreerCertificat(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L008CreerCertificat(String var, String val) {
		switch(var) {
			default:
				return super.definirC001Lecon(var, val);
		}
	}

	///////////
	// image //
	///////////

	public static void image() {
		try {
			DefaultExecutor executeur = new DefaultExecutor();
			{
				new File("/usr/local/src/computate.org-static/png/frFR/cours/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement-999.png"));
				System.out.println("C001L008CreerCertificatFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/008-how-to-obtain-free-tls-certificates?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/008-how-to-obtain-free-tls-certificates-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/008-how-to-obtain-free-tls-certificates-999.png"));
				System.out.println("C001L008CreerCertificatEnUSPage");
				System.out.println(" * ImageLargeur.enUS: " + img.getWidth());
				System.out.println(" * ImageHauteur.enUS: " + img.getHeight());
			}
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	/////////////
	// indexer //
	/////////////

	public static void indexer() {
		try {
			RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L008CreerCertificat o = new C001L008CreerCertificat();
			o.requeteSiteC001L008CreerCertificat(requeteSite);
			o.initLoinC001L008CreerCertificat(requeteSite);
			o.indexerC001L008CreerCertificat();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001L008CreerCertificat();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001L008CreerCertificat(document);
	}

	public void indexerC001L008CreerCertificat(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L008CreerCertificat(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L008CreerCertificat() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L008CreerCertificat(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L008CreerCertificat(SolrInputDocument document) {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L008CreerCertificat() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinC001L008CreerCertificat(siteContexte.getRequeteSite_());
			SolrClient clientSolr = siteContexte.getClientSolr();
			clientSolr.deleteById(id.toString());
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerC001L008CreerCertificat(solrDocument);
	}
	public void stockerC001L008CreerCertificat(SolrDocument solrDocument) {
		C001L008CreerCertificat oC001L008CreerCertificat = (C001L008CreerCertificat)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L008CreerCertificat();
	}

	public void htmlBodyCourtC001L008CreerCertificat() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(questionDependences != null)
			questionDependences.htmlBodyCourt();
		if(questionMkdirSrv != null)
			questionMkdirSrv.htmlBodyCourt();
		if(questionCertbot != null)
			questionCertbot.htmlBodyCourt();
		if(questionClonerSource != null)
			questionClonerSource.htmlBodyCourt();
		if(questionListerTags != null)
			questionListerTags.htmlBodyCourt();
		if(questionCheckoutTag != null)
			questionCheckoutTag.htmlBodyCourt();
		if(questionConstruireSource != null)
			questionConstruireSource.htmlBodyCourt();
		if(questionMkdirServeur != null)
			questionMkdirServeur.htmlBodyCourt();
		if(questionDonnees != null)
			questionDonnees.htmlBodyCourt();
		if(questionService != null)
			questionService.htmlBodyCourt();
		if(questionSystemctlDaemonReload != null)
			questionSystemctlDaemonReload.htmlBodyCourt();
		if(questionSystemctlEnable != null)
			questionSystemctlEnable.htmlBodyCourt();
		if(questionSystemctlStart != null)
			questionSystemctlStart.htmlBodyCourt();
		if(questionSystemctlStatus != null)
			questionSystemctlStatus.htmlBodyCourt();
		if(recapituler1 != null)
			recapituler1.htmlBodyCourt();
		if(recapituler2 != null)
			recapituler2.htmlBodyCourt();
		if(recapituler3 != null)
			recapituler3.htmlBodyCourt();
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L008CreerCertificat();
		super.htmlBody();
	}

	public void htmlBodyC001L008CreerCertificat() {
		((C001L008CreerCertificat)this).htmlBodyMoi();
		((C001L008CreerCertificat)this).htmlBodyQuestionDependences();
		((C001L008CreerCertificat)this).htmlBodyQuestionMkdirSrv();
		((C001L008CreerCertificat)this).htmlBodyQuestionCertbot();
		((C001L008CreerCertificat)this).htmlBodyQuestionClonerSource();
		((C001L008CreerCertificat)this).htmlBodyQuestionListerTags();
		((C001L008CreerCertificat)this).htmlBodyQuestionCheckoutTag();
		((C001L008CreerCertificat)this).htmlBodyQuestionConstruireSource();
		((C001L008CreerCertificat)this).htmlBodyQuestionMkdirServeur();
		((C001L008CreerCertificat)this).htmlBodyQuestionDonnees();
		((C001L008CreerCertificat)this).htmlBodyQuestionService();
		((C001L008CreerCertificat)this).htmlBodyQuestionSystemctlDaemonReload();
		((C001L008CreerCertificat)this).htmlBodyQuestionSystemctlEnable();
		((C001L008CreerCertificat)this).htmlBodyQuestionSystemctlStart();
		((C001L008CreerCertificat)this).htmlBodyQuestionSystemctlStatus();
		((C001L008CreerCertificat)this).htmlBodyRecapituler1();
		((C001L008CreerCertificat)this).htmlBodyRecapituler2();
		((C001L008CreerCertificat)this).htmlBodyRecapituler3();
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode());
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof C001L008CreerCertificat))
			return false;
		C001L008CreerCertificat that = (C001L008CreerCertificat)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L008CreerCertificat {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L008CreerCertificatVals = new String[] { moiP1, moiP2, moiP3, moiP4, moiP5, moiP6, moiP7, moiP8, questionDependencesH3I1, questionDependencesH3Span1, questionDependencesH4I1, questionDependencesH4Span1, questionDependencesPre1Span11, questionDependencesPre1Span21, questionDependencesPre1Span31, questionDependencesPre1Span41, questionDependencesPre1Span51, questionDependencesOl2Li11, questionDependencesOl2Li12, questionDependencesOl2Li21, questionDependencesOl2Li22, questionDependencesOl2Li31, questionDependencesOl2Li41, questionDependencesOl2Li51, questionDependencesPre3Span11, questionDependencesPre3Span21, questionDependencesPre3Span31, questionDependencesPre3Span41, questionDependencesPre3Span51, questionDependencesOl4Li11, questionDependencesOl4Li21, questionDependencesOl4Li31, questionDependencesOl4Li41, questionDependencesOl4Li51, questionMkdirSrvH3I1, questionMkdirSrvH3Span1, questionMkdirSrvH4I1, questionMkdirSrvH4Span1, questionMkdirSrvPreSpan11, questionMkdirSrvPreSpan21, questionMkdirSrvPreSpan31, questionMkdirSrvPreSpan41, questionMkdirSrvPreSpan51, questionMkdirSrvPreSpan61, questionMkdirSrvPreSpan71, questionMkdirSrvPreSpan61, questionMkdirSrvPreSpan71, questionMkdirSrvPreSpan81, questionMkdirSrvOl2Li11, questionMkdirSrvOl2Li21, questionMkdirSrvOl2Li31, questionMkdirSrvOl2Li41, questionMkdirSrvOl2Li51, questionMkdirSrvOl2Li61, questionMkdirSrvOl2Li71, questionMkdirSrvOl2Li61, questionMkdirSrvOl2Li71, questionMkdirSrvOl2Li81, questionCertbotH3I1, questionCertbotH3Span1, questionCertbotH4I1, questionCertbotH4Span1, questionCertbotPreSpan011, questionCertbotPreSpan021, questionCertbotPreSpan031, questionCertbotPreSpan041, questionCertbotPreSpan051, questionCertbotPreSpan061, questionCertbotPreSpan071, questionCertbotPreSpan081, questionCertbotPreSpan091, questionCertbotPreSpan101, questionCertbotOl2Li011, questionCertbotOl2Li021, questionCertbotOl2Li031, questionCertbotOl2Li041, questionCertbotOl2Li051, questionCertbotOl2Li061, questionCertbotOl2Li071, questionCertbotOl2Li081, questionCertbotOl2Li091, questionCertbotOl2Li101, questionCertbotP21, questionCertbotP22, questionCertbotP23, questionCertbotP24, questionCertbotP25, questionCertbotP3Span11, questionCertbotP3Span12, questionCertbotP3Span13, questionCertbotP3A11, questionCertbotP3Span21, questionCertbotP3Span22, questionCertbotP3Span23, questionCertbotP3Span24, questionCertbotP3Span25, questionCertbotP3Span26, questionCertbotP3Span27, questionClonerSourceH3I1, questionClonerSourceH3Span1, questionClonerSourceH4I1, questionClonerSourceH4Span1, questionClonerSourcePreSpan11, questionClonerSourcePreSpan21, questionClonerSourcePreSpan31, questionClonerSourcePreSpan41, questionClonerSourceOl2Li11, questionClonerSourceOl2Li21, questionClonerSourceOl2Li31, questionClonerSourceOl2Li41, questionListerTagsH3I1, questionListerTagsH3Span1, questionListerTagsH4I1, questionListerTagsH4Span1, questionListerTagsPreSpan11, questionListerTagsPreSpan21, questionListerTagsPreSpan31, questionListerTagsPreSpan41, questionListerTagsPreSpan51, questionListerTagsOl2Li11, questionListerTagsOl2Li21, questionListerTagsOl2Li31, questionListerTagsOl2Li41, questionListerTagsOl2Li51, questionCheckoutTagH3I1, questionCheckoutTagH3Span1, questionCheckoutTagH4I1, questionCheckoutTagH4Span1, questionCheckoutTagPreSpan11, questionCheckoutTagPreSpan21, questionCheckoutTagPreSpan31, questionCheckoutTagPreSpan41, questionCheckoutTagPreSpan51, questionCheckoutTagPreSpan61, questionCheckoutTagOl2Li11, questionCheckoutTagOl2Li21, questionCheckoutTagOl2Li31, questionCheckoutTagOl2Li41, questionCheckoutTagOl2Li51, questionCheckoutTagOl2Li61, questionConstruireSourceH3I1, questionConstruireSourceH3Span1, questionConstruireSourceH4I1, questionConstruireSourceH4Span1, questionConstruireSourcePre1Span011, questionConstruireSourcePre1Span021, questionConstruireSourcePre1Span031, questionConstruireSourcePre1Span041, questionConstruireSourcePre1Span051, questionConstruireSourcePre1Span061, questionConstruireSourcePre1Span071, questionConstruireSourcePre1Span081, questionConstruireSourcePre1Span091, questionConstruireSourcePre1Span101, questionConstruireSourceOl1Li011, questionConstruireSourceOl1Li021, questionConstruireSourceOl1Li031, questionConstruireSourceOl1Li041, questionConstruireSourceOl1Li051, questionConstruireSourceOl1Li061, questionConstruireSourceOl1Li071, questionConstruireSourceOl1Li081, questionConstruireSourceOl1Li091, questionConstruireSourceOl1Li092, questionConstruireSourceOl1Li101, questionConstruireSourceOl1Li102, questionConstruireSourceOl1Li103, questionConstruireSourceOl1Li104, questionConstruireSourceOl1Li105, questionConstruireSourcePre2Span11, questionConstruireSourcePre2Span21, questionConstruireSourcePre2Span31, questionConstruireSourcePre2Span41, questionConstruireSourcePre2Span51, questionConstruireSourceOl2Li11, questionConstruireSourceOl2Li21, questionConstruireSourceOl2Li31, questionConstruireSourceOl2Li41, questionConstruireSourceOl2Li51, questionConstruireSourcePre3Span11, questionConstruireSourcePre3Span21, questionConstruireSourcePre3Span31, questionConstruireSourcePre3Span41, questionConstruireSourcePre3Span51, questionConstruireSourceOl3Li11, questionConstruireSourceOl3Li21, questionConstruireSourceOl3Li31, questionConstruireSourceOl3Li41, questionConstruireSourceOl3Li51, questionMkdirServeurH3I1, questionMkdirServeurH3Span1, questionMkdirServeurH4I1, questionMkdirServeurH4Span1, questionMkdirServeurPreSpan11, questionMkdirServeurPreSpan21, questionMkdirServeurPreSpan31, questionMkdirServeurPreSpan41, questionMkdirServeurPreSpan51, questionMkdirServeurPreSpan61, questionMkdirServeurPreSpan71, questionMkdirServeurPreSpan81, questionMkdirServeurOl2Li11, questionMkdirServeurOl2Li21, questionMkdirServeurOl2Li31, questionMkdirServeurOl2Li41, questionMkdirServeurOl2Li51, questionMkdirServeurOl2Li61, questionMkdirServeurOl2Li71, questionMkdirServeurOl2Li81, questionDonneesH3I1, questionDonneesH3Span1, questionDonneesH4I1, questionDonneesH4Span1, questionDonneesP11, questionDonneesP12, questionDonneesP13, questionDonneesPreSpan11, questionDonneesPreSpan21, questionDonneesPreSpan31, questionDonneesPreSpan41, questionDonneesOl2Li11, questionDonneesOl2Li21, questionDonneesOl2Li31, questionDonneesOl2Li41, questionServiceH3I1, questionServiceH3Span1, questionServiceH4I1, questionServiceH4Span1, questionServicePreSpan11, questionServicePreSpan1Br1, questionServicePreSpan2Br1, questionServicePreSpan3Br1, questionServicePreSpan3Br2, questionServicePreSpan3Br3, questionServicePreSpan3Br4, questionServicePreSpan3Br5, questionServicePreSpan3Br6, questionServicePreSpan3Br7, questionServicePreSpan3Br8, questionServicePreSpan3Br9, questionServicePreSpan3Br10, questionServicePreSpan3Br11, questionServicePreSpan3Br12, questionServicePreSpan3Br13, questionServicePreSpan3Br14, questionServicePreSpan3Br15, questionServiceOl2Li011, questionServiceOl2Li021, questionServiceOl2Li031, questionServiceOl2Li041, questionServiceOl2Li051, questionServiceOl2Li061, questionServiceOl2Li071, questionServiceOl2Li081, questionServiceOl2Li091, questionServiceOl2Li101, questionServiceOl2Li111, questionServiceOl2Li121, questionServiceOl2Li131, questionServiceOl2Li141, questionServiceOl2Li151, questionServiceOl2Li161, questionServiceOl2Li171, questionServiceOl2Li181, questionServiceOl2Li191, questionSystemctlDaemonReloadH3I1, questionSystemctlDaemonReloadH3Span1, questionSystemctlDaemonReloadH4I1, questionSystemctlDaemonReloadH4Span1, questionSystemctlDaemonReloadPreSpan11, questionSystemctlDaemonReloadPreSpan21, questionSystemctlDaemonReloadPreSpan31, questionSystemctlDaemonReloadOl2Li11, questionSystemctlDaemonReloadOl2Li21, questionSystemctlDaemonReloadOl2Li31, questionSystemctlEnableH3I1, questionSystemctlEnableH3Span1, questionSystemctlEnableH4I1, questionSystemctlEnableH4Span1, questionSystemctlEnablePreSpan11, questionSystemctlEnablePreSpan21, questionSystemctlEnablePreSpan31, questionSystemctlEnablePreSpan41, questionSystemctlEnableOl2Li11, questionSystemctlEnableOl2Li21, questionSystemctlEnableOl2Li31, questionSystemctlEnableOl2Li41, questionSystemctlStartH3I1, questionSystemctlStartH3Span1, questionSystemctlStartH4I1, questionSystemctlStartH4Span1, questionSystemctlStartPreSpan11, questionSystemctlStartPreSpan21, questionSystemctlStartPreSpan31, questionSystemctlStartPreSpan41, questionSystemctlStartOl2Li11, questionSystemctlStartOl2Li21, questionSystemctlStartOl2Li31, questionSystemctlStartOl2Li41, questionSystemctlStatusH3I1, questionSystemctlStatusH3Span1, questionSystemctlStatusH4I1, questionSystemctlStatusH4Span1, questionSystemctlStatusPreSpan11, questionSystemctlStatusPreSpan21, questionSystemctlStatusPreSpan31, questionSystemctlStatusPreSpan41, questionSystemctlStatusOl2Li11, questionSystemctlStatusOl2Li21, questionSystemctlStatusOl2Li31, questionSystemctlStatusOl2Li41, questionSystemctlStatusP21, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3Span1I1, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41, recapituler3TableTr11Td1I1, recapituler3TableTr11Td21, recapituler3TableTr11Td3I1, recapituler3TableTr11Td41, recapituler3TableTr12Td1I1, recapituler3TableTr12Td21, recapituler3TableTr12Td3I1, recapituler3TableTr12Td41, recapituler3TableTr13Td1I1, recapituler3TableTr13Td21, recapituler3TableTr13Td3I1, recapituler3TableTr13Td41, recapituler3TableTr14Td1I1, recapituler3TableTr14Td21, recapituler3TableTr14Td3I1, recapituler3TableTr14Td41, recapituler3TableTr15Td1I1, recapituler3TableTr15Td21, recapituler3TableTr15Td3I1, recapituler3TableTr15Td41 };
}
