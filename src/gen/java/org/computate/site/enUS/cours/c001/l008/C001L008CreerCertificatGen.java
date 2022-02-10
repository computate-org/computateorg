package org.computate.site.enUS.cours.c001.l008;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import org.computate.site.enUS.page.parti.PagePart;
import org.computate.site.enUS.request.RequeteSiteEnUS;
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

	///////////////////
	// personnaliser //
	///////////////////

	/**	L'entité « personnaliser »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml personnaliser = new PageHtml();
	public Couverture<PageHtml> personnaliserCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("personnaliser").o(personnaliser);

	/**	<br/>L'entité « personnaliser »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:personnaliser">Trouver l'entité personnaliser dans Solr</a>
	 * <br/>
	 * @param personnaliser est l'entité déjà construit. 
	 **/
	protected abstract void _personnaliser(PageHtml o);

	public PageHtml getPersonnaliser() {
		return personnaliser;
	}

	public void setPersonnaliser(PageHtml personnaliser) {
		this.personnaliser = personnaliser;
		this.personnaliserCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat personnaliserInit() {
		if(personnaliser != null) {
			((C001L008CreerCertificat)this).avantPagePart(personnaliser, "personnaliser");
			((C001L008CreerCertificat)this).avantPagePart(personnaliser, "personnaliser");
		}
		if(!personnaliserCouverture.dejaInitialise) {
			_personnaliser(personnaliser);
		}
		personnaliser.initLoinPourClasse(requeteSite_);
		personnaliserCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyPersonnaliser(PageHtml o) {
	}
	public void htmlBodyPersonnaliser() {
		personnaliser.htmlAvant();
		htmlBodyPersonnaliser(personnaliser);
		personnaliser.htmlApres();
	}

	/////////////////////////
	// questionDependences //
	/////////////////////////

	public static final String questionDependencesH3I1 = "far fa-conveyor-belt-alt";
	public static final String questionDependencesH3I = questionDependencesH3I1;
	public static final String questionDependencesH3Span1 = "How do I install the dependencies for certbot? ";
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
	public static final String questionDependencesPre1Span51 = " epel-release";
	public static final String questionDependencesPre1Span5 = questionDependencesPre1Span51;
	public static final String questionDependencesOl2Li1Dt1 = "sudo";
	public static final String questionDependencesOl2Li1Dt = questionDependencesOl2Li1Dt1;
	public static final String questionDependencesOl2Li1Dd1 = ": The command to install yum repositories begins with the command sudo. ";
	public static final String questionDependencesOl2Li1Dd2 = "The \"sudo\" command allows your current user to have root privileges for a few minutes after entering your password. ";
	public static final String questionDependencesOl2Li1Dd3 = "Installing yum repositories always requires root privileges. ";
	public static final String questionDependencesOl2Li1Dd = questionDependencesOl2Li1Dd1 + questionDependencesOl2Li1Dd2 + questionDependencesOl2Li1Dd3;
	public static final String questionDependencesOl2Li2Dt1 = "yum";
	public static final String questionDependencesOl2Li2Dt = questionDependencesOl2Li2Dt1;
	public static final String questionDependencesOl2Li2Dd1 = "yum Stands for \"Yellowdog Updater Modified\", but nobody knows it as yellowdog, just yum. ";
	public static final String questionDependencesOl2Li2Dd2 = "CentOS manages software packages and RPM application files with yum. ";
	public static final String questionDependencesOl2Li2Dd = questionDependencesOl2Li2Dd1 + questionDependencesOl2Li2Dd2;
	public static final String questionDependencesOl2Li3Dt1 = "install";
	public static final String questionDependencesOl2Li3Dt = questionDependencesOl2Li3Dt1;
	public static final String questionDependencesOl2Li3Dd1 = ": For installing new yum packages. ";
	public static final String questionDependencesOl2Li3Dd = questionDependencesOl2Li3Dd1;
	public static final String questionDependencesOl2Li4Dt1 = "-y";
	public static final String questionDependencesOl2Li4Dt = questionDependencesOl2Li4Dt1;
	public static final String questionDependencesOl2Li4Dd1 = ": Suppress messages asking to confirm if you want to install the software. ";
	public static final String questionDependencesOl2Li4Dd = questionDependencesOl2Li4Dd1;
	public static final String questionDependencesOl2Li5Dt1 = "epel-release";
	public static final String questionDependencesOl2Li5Dt = questionDependencesOl2Li5Dt1;
	public static final String questionDependencesOl2Li5Dd1 = ": The package name of the Extra Packages for Enterprise Linux repository. ";
	public static final String questionDependencesOl2Li5Dd = questionDependencesOl2Li5Dd1;
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
	public static final String questionDependencesOl4Li1Dt1 = "sudo";
	public static final String questionDependencesOl4Li1Dt = questionDependencesOl4Li1Dt1;
	public static final String questionDependencesOl4Li2Dt1 = "yum";
	public static final String questionDependencesOl4Li2Dt = questionDependencesOl4Li2Dt1;
	public static final String questionDependencesOl4Li3Dt1 = "install";
	public static final String questionDependencesOl4Li3Dt = questionDependencesOl4Li3Dt1;
	public static final String questionDependencesOl4Li4Dt1 = "-y";
	public static final String questionDependencesOl4Li4Dt = questionDependencesOl4Li4Dt1;
	public static final String questionDependencesOl4Li5Dt1 = "certbot";
	public static final String questionDependencesOl4Li5Dt = questionDependencesOl4Li5Dt1;
	public static final String questionDependencesOl4Li5Dd1 = ": A free, automated certificate authority that aims to lower the barriers to entry for encrypting all HTTP traffic on the Internet. ";
	public static final String questionDependencesOl4Li5Dd = questionDependencesOl4Li5Dd1;

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
				{ e("dt").a("class", " questionDependencesOl2Li1Dt ").f();
					sx(questionDependencesOl2Li1Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl2Li1Dd ").f();
					sx(questionDependencesOl2Li1Dd1);
					sx(questionDependencesOl2Li1Dd2);
					sx(questionDependencesOl2Li1Dd3);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li2 questionDependencesOl2Li even ").f();
				{ e("dt").a("class", " questionDependencesOl2Li2Dt ").f();
					sx(questionDependencesOl2Li2Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl2Li2Dd ").f();
					sx(questionDependencesOl2Li2Dd1);
					sx(questionDependencesOl2Li2Dd2);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li3 questionDependencesOl2Li odd ").f();
				{ e("dt").a("class", " questionDependencesOl2Li3Dt ").f();
					sx(questionDependencesOl2Li3Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl2Li3Dd ").f();
					sx(questionDependencesOl2Li3Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li4 questionDependencesOl2Li even ").f();
				{ e("dt").a("class", " questionDependencesOl2Li4Dt ").f();
					sx(questionDependencesOl2Li4Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl2Li4Dd ").f();
					sx(questionDependencesOl2Li4Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li5 questionDependencesOl2Li odd ").f();
				{ e("dt").a("class", " questionDependencesOl2Li5Dt ").f();
					sx(questionDependencesOl2Li5Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl2Li5Dd ").f();
					sx(questionDependencesOl2Li5Dd1);
				} g("dd");
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
				{ e("dt").a("class", " questionDependencesOl4Li1Dt ").f();
					sx(questionDependencesOl4Li1Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li2 questionDependencesOl4Li even ").f();
				{ e("dt").a("class", " questionDependencesOl4Li2Dt ").f();
					sx(questionDependencesOl4Li2Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li3 questionDependencesOl4Li odd ").f();
				{ e("dt").a("class", " questionDependencesOl4Li3Dt ").f();
					sx(questionDependencesOl4Li3Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li4 questionDependencesOl4Li even ").f();
				{ e("dt").a("class", " questionDependencesOl4Li4Dt ").f();
					sx(questionDependencesOl4Li4Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li5 questionDependencesOl4Li odd ").f();
				{ e("dt").a("class", " questionDependencesOl4Li5Dt ").f();
					sx(questionDependencesOl4Li5Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl4Li5Dd ").f();
					sx(questionDependencesOl4Li5Dd1);
				} g("dd");
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
	public static final String questionMkdirSrvH4Span1 = "Create a certbot directory in /srv. ";
	public static final String questionMkdirSrvH4Span = questionMkdirSrvH4Span1;
	public static final String questionMkdirSrvPreSpan011 = "sudo";
	public static final String questionMkdirSrvPreSpan01 = questionMkdirSrvPreSpan011;
	public static final String questionMkdirSrvPreSpan021 = " install";
	public static final String questionMkdirSrvPreSpan02 = questionMkdirSrvPreSpan021;
	public static final String questionMkdirSrvPreSpan031 = " -d";
	public static final String questionMkdirSrvPreSpan03 = questionMkdirSrvPreSpan031;
	public static final String questionMkdirSrvPreSpan041 = " -o";
	public static final String questionMkdirSrvPreSpan04 = questionMkdirSrvPreSpan041;
	public static final String questionMkdirSrvPreSpan051 = " $USER";
	public static final String questionMkdirSrvPreSpan05 = questionMkdirSrvPreSpan051;
	public static final String questionMkdirSrvPreSpan061 = " -g";
	public static final String questionMkdirSrvPreSpan06 = questionMkdirSrvPreSpan061;
	public static final String questionMkdirSrvPreSpan071 = " $USER";
	public static final String questionMkdirSrvPreSpan07 = questionMkdirSrvPreSpan071;
	public static final String questionMkdirSrvPreSpan081 = " -m";
	public static final String questionMkdirSrvPreSpan08 = questionMkdirSrvPreSpan081;
	public static final String questionMkdirSrvPreSpan091 = " 700";
	public static final String questionMkdirSrvPreSpan09 = questionMkdirSrvPreSpan091;
	public static final String questionMkdirSrvPreSpan101 = " /srv/certbot";
	public static final String questionMkdirSrvPreSpan10 = questionMkdirSrvPreSpan101;
	public static final String questionMkdirSrvOl2Li01Dt1 = "sudo";
	public static final String questionMkdirSrvOl2Li01Dt = questionMkdirSrvOl2Li01Dt1;
	public static final String questionMkdirSrvOl2Li02Dt1 = "install";
	public static final String questionMkdirSrvOl2Li02Dt = questionMkdirSrvOl2Li02Dt1;
	public static final String questionMkdirSrvOl2Li02Dd1 = ": Creates directories and sets attributes on the new directory. ";
	public static final String questionMkdirSrvOl2Li02Dd = questionMkdirSrvOl2Li02Dd1;
	public static final String questionMkdirSrvOl2Li03Dt1 = "-d";
	public static final String questionMkdirSrvOl2Li03Dt = questionMkdirSrvOl2Li03Dt1;
	public static final String questionMkdirSrvOl2Li03Dd1 = ": Create  directories. ";
	public static final String questionMkdirSrvOl2Li03Dd = questionMkdirSrvOl2Li03Dd1;
	public static final String questionMkdirSrvOl2Li04Dt1 = "-o";
	public static final String questionMkdirSrvOl2Li04Dt = questionMkdirSrvOl2Li04Dt1;
	public static final String questionMkdirSrvOl2Li04Dd1 = ": Set ownership on the directory (super-user only). ";
	public static final String questionMkdirSrvOl2Li04Dd = questionMkdirSrvOl2Li04Dd1;
	public static final String questionMkdirSrvOl2Li05Dt1 = "$USER";
	public static final String questionMkdirSrvOl2Li05Dt = questionMkdirSrvOl2Li05Dt1;
	public static final String questionMkdirSrvOl2Li05Dd1 = ": The current user to make the owner of the directory. ";
	public static final String questionMkdirSrvOl2Li05Dd = questionMkdirSrvOl2Li05Dd1;
	public static final String questionMkdirSrvOl2Li06Dt1 = "-g";
	public static final String questionMkdirSrvOl2Li06Dt = questionMkdirSrvOl2Li06Dt1;
	public static final String questionMkdirSrvOl2Li06Dd1 = ": Set group ownership on the directory (super-user only). ";
	public static final String questionMkdirSrvOl2Li06Dd = questionMkdirSrvOl2Li06Dd1;
	public static final String questionMkdirSrvOl2Li07Dt1 = "$USER";
	public static final String questionMkdirSrvOl2Li07Dt = questionMkdirSrvOl2Li07Dt1;
	public static final String questionMkdirSrvOl2Li07Dd1 = ": The current user to make the group owner of the directory. ";
	public static final String questionMkdirSrvOl2Li07Dd = questionMkdirSrvOl2Li07Dd1;
	public static final String questionMkdirSrvOl2Li08Dt1 = "-m";
	public static final String questionMkdirSrvOl2Li08Dt = questionMkdirSrvOl2Li08Dt1;
	public static final String questionMkdirSrvOl2Li08Dd1 = "-m: Set permissions on the directory (super-user only). ";
	public static final String questionMkdirSrvOl2Li08Dd = questionMkdirSrvOl2Li08Dd1;
	public static final String questionMkdirSrvOl2Li09Dt1 = "700";
	public static final String questionMkdirSrvOl2Li09Dt = questionMkdirSrvOl2Li09Dt1;
	public static final String questionMkdirSrvOl2Li09Dd1 = ": Give read, write and execute permissions to only the user of the directory. ";
	public static final String questionMkdirSrvOl2Li09Dd = questionMkdirSrvOl2Li09Dd1;
	public static final String questionMkdirSrvOl2Li10Dt1 = "/srv/certbot";
	public static final String questionMkdirSrvOl2Li10Dt = questionMkdirSrvOl2Li10Dt1;
	public static final String questionMkdirSrvOl2Li10Dd1 = ": /srv is a good place to install open source software serveurs and your certificates, keys and keystores. ";
	public static final String questionMkdirSrvOl2Li10Dd = questionMkdirSrvOl2Li10Dd1;

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
			{ e("span").a("class", " questionMkdirSrvPreSpan01 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan011);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan02 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan021);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan03 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan031);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan04 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan041);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan05 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan051);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan06 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan061);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan07 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan071);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan08 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan081);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan09 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan091);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan10 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan101);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirSrvOl2 questionMkdirSrvOl even ").f();
			{ e("li").a("class", " questionMkdirSrvOl2Li01 questionMkdirSrvOl2Li odd ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li01Dt ").f();
					sx(questionMkdirSrvOl2Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li02 questionMkdirSrvOl2Li even ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li02Dt ").f();
					sx(questionMkdirSrvOl2Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li02Dd ").f();
					sx(questionMkdirSrvOl2Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li03 questionMkdirSrvOl2Li odd ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li03Dt ").f();
					sx(questionMkdirSrvOl2Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li03Dd ").f();
					sx(questionMkdirSrvOl2Li03Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li04 questionMkdirSrvOl2Li even ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li04Dt ").f();
					sx(questionMkdirSrvOl2Li04Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li04Dd ").f();
					sx(questionMkdirSrvOl2Li04Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li05 questionMkdirSrvOl2Li odd ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li05Dt ").f();
					sx(questionMkdirSrvOl2Li05Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li05Dd ").f();
					sx(questionMkdirSrvOl2Li05Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li06 questionMkdirSrvOl2Li even ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li06Dt ").f();
					sx(questionMkdirSrvOl2Li06Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li06Dd ").f();
					sx(questionMkdirSrvOl2Li06Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li07 questionMkdirSrvOl2Li odd ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li07Dt ").f();
					sx(questionMkdirSrvOl2Li07Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li07Dd ").f();
					sx(questionMkdirSrvOl2Li07Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li08 questionMkdirSrvOl2Li even ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li08Dt ").f();
					sx(questionMkdirSrvOl2Li08Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li08Dd ").f();
					sx(questionMkdirSrvOl2Li08Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li09 questionMkdirSrvOl2Li odd ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li09Dt ").f();
					sx(questionMkdirSrvOl2Li09Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li09Dd ").f();
					sx(questionMkdirSrvOl2Li09Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li10 questionMkdirSrvOl2Li even ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li10Dt ").f();
					sx(questionMkdirSrvOl2Li10Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li10Dd ").f();
					sx(questionMkdirSrvOl2Li10Dd1);
				} g("dd");
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
	public static final String questionCertbotPreSpan07Span11 = " -d ";
	public static final String questionCertbotPreSpan07Span1 = questionCertbotPreSpan07Span11;
	public static final String questionCertbotPreSpan07Span21 = "example.com";
	public static final String questionCertbotPreSpan07Span2 = questionCertbotPreSpan07Span21;
	public static final String questionCertbotPreSpan08Span11 = " -d *.";
	public static final String questionCertbotPreSpan08Span1 = questionCertbotPreSpan08Span11;
	public static final String questionCertbotPreSpan08Span21 = "example.com";
	public static final String questionCertbotPreSpan08Span2 = questionCertbotPreSpan08Span21;
	public static final String questionCertbotPreSpan09Span11 = " -d *.apps.";
	public static final String questionCertbotPreSpan09Span1 = questionCertbotPreSpan09Span11;
	public static final String questionCertbotPreSpan09Span21 = "example.com";
	public static final String questionCertbotPreSpan09Span2 = questionCertbotPreSpan09Span21;
	public static final String questionCertbotOl2Li01Dt1 = "sudo";
	public static final String questionCertbotOl2Li01Dt = questionCertbotOl2Li01Dt1;
	public static final String questionCertbotOl2Li02Dt1 = "certbot";
	public static final String questionCertbotOl2Li02Dt = questionCertbotOl2Li02Dt1;
	public static final String questionCertbotOl2Li02Dd1 = ": A free, automated certificate authority that aims to lower the barriers to entry for encrypting all HTTP traffic on the Internet. ";
	public static final String questionCertbotOl2Li02Dd = questionCertbotOl2Li02Dd1;
	public static final String questionCertbotOl2Li03Dt1 = "--manual";
	public static final String questionCertbotOl2Li03Dt = questionCertbotOl2Li03Dt1;
	public static final String questionCertbotOl2Li03Dd1 = ": Obtain certificates interactively, or using shell script. ";
	public static final String questionCertbotOl2Li03Dd = questionCertbotOl2Li03Dd1;
	public static final String questionCertbotOl2Li04Dt1 = "--preferred-challenges dns";
	public static final String questionCertbotOl2Li04Dt = questionCertbotOl2Li04Dt1;
	public static final String questionCertbotOl2Li04Dd1 = ": Use DNS record challenges to prove ownership of your domain. ";
	public static final String questionCertbotOl2Li04Dd = questionCertbotOl2Li04Dd1;
	public static final String questionCertbotOl2Li05Dt1 = "--server https://acme-v02.api.letsencrypt.org/directory";
	public static final String questionCertbotOl2Li05Dt = questionCertbotOl2Li05Dt1;
	public static final String questionCertbotOl2Li05Dd1 = ": Specify a more recent version of a letsencrypt server that allows wildcard domains in certificates. ";
	public static final String questionCertbotOl2Li05Dd = questionCertbotOl2Li05Dd1;
	public static final String questionCertbotOl2Li06Dt1 = "certonly";
	public static final String questionCertbotOl2Li06Dt = questionCertbotOl2Li06Dt1;
	public static final String questionCertbotOl2Li06Dd1 = ": Obtain or renew a certificate, but do not install it. ";
	public static final String questionCertbotOl2Li06Dd = questionCertbotOl2Li06Dd1;
	public static final String questionCertbotOl2Li07DtSpan11 = "-d ";
	public static final String questionCertbotOl2Li07DtSpan1 = questionCertbotOl2Li07DtSpan11;
	public static final String questionCertbotOl2Li07DtSpan21 = "example.com";
	public static final String questionCertbotOl2Li07DtSpan2 = questionCertbotOl2Li07DtSpan21;
	public static final String questionCertbotOl2Li07DdSpan31 = ": Specify your root domain name to include it as a route secured by the certificate. ";
	public static final String questionCertbotOl2Li07DdSpan3 = questionCertbotOl2Li07DdSpan31;
	public static final String questionCertbotOl2Li08DtSpan11 = "-d *.";
	public static final String questionCertbotOl2Li08DtSpan1 = questionCertbotOl2Li08DtSpan11;
	public static final String questionCertbotOl2Li08DtSpan21 = "example.com";
	public static final String questionCertbotOl2Li08DtSpan2 = questionCertbotOl2Li08DtSpan21;
	public static final String questionCertbotOl2Li08DdSpan31 = ": Include wildcard domains under your root domain, which would include www for example. ";
	public static final String questionCertbotOl2Li08DdSpan3 = questionCertbotOl2Li08DdSpan31;
	public static final String questionCertbotOl2Li09DtSpan11 = "-d *.apps.";
	public static final String questionCertbotOl2Li09DtSpan1 = questionCertbotOl2Li09DtSpan11;
	public static final String questionCertbotOl2Li09DtSpan21 = "example.com";
	public static final String questionCertbotOl2Li09DtSpan2 = questionCertbotOl2Li09DtSpan21;
	public static final String questionCertbotOl2Li09DdSpan31 = ": Wildcard domains do not include subdomains of a wildcard domain, so include additional subdomains as well. ";
	public static final String questionCertbotOl2Li09DdSpan32 = "You can optionally include more than one domain name in the same certificate if you want to, up to a generous amount by letsencrypt. ";
	public static final String questionCertbotOl2Li09DdSpan3 = questionCertbotOl2Li09DdSpan31 + questionCertbotOl2Li09DdSpan32;
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
	public static final String questionCertbotP3A11 = " https://www.fastmail.com/";
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
				{ e("span").a("class", " questionCertbotPreSpan07Span1 questionCertbotPreSpan odd ").f();
					sx(questionCertbotPreSpan07Span11);
				} g("span");
				{ e("span").a("class", " questionCertbotPreSpan07Span2 questionCertbotPreSpan even ").f();
					sx(utilisateurId == null ? questionCertbotPreSpan07Span21 : utilisateurSiteNomDomaine);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan08 questionCertbotPreSpan even ").f();
				{ e("span").a("class", " questionCertbotPreSpan08Span1 questionCertbotPreSpan odd ").f();
					sx(questionCertbotPreSpan08Span11);
				} g("span");
				{ e("span").a("class", " questionCertbotPreSpan08Span2 questionCertbotPreSpan even ").f();
					sx(utilisateurId == null ? questionCertbotPreSpan08Span21 : utilisateurSiteNomDomaine);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan09 questionCertbotPreSpan odd ").f();
				{ e("span").a("class", " questionCertbotPreSpan09Span1 questionCertbotPreSpan odd ").f();
					sx(questionCertbotPreSpan09Span11);
				} g("span");
				{ e("span").a("class", " questionCertbotPreSpan09Span2 questionCertbotPreSpan even ").f();
					sx(utilisateurId == null ? questionCertbotPreSpan09Span21 : utilisateurSiteNomDomaine);
				} g("span");
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCertbotOl2 questionCertbotOl even ").f();
			{ e("li").a("class", " questionCertbotOl2Li01 questionCertbotOl2Li odd ").f();
				{ e("dt").a("class", " questionCertbotOl2Li01Dt ").f();
					sx(questionCertbotOl2Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li02 questionCertbotOl2Li even ").f();
				{ e("dt").a("class", " questionCertbotOl2Li02Dt ").f();
					sx(questionCertbotOl2Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li02Dd ").f();
					sx(questionCertbotOl2Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li03 questionCertbotOl2Li odd ").f();
				{ e("dt").a("class", " questionCertbotOl2Li03Dt ").f();
					sx(questionCertbotOl2Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li03Dd ").f();
					sx(questionCertbotOl2Li03Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li04 questionCertbotOl2Li even ").f();
				{ e("dt").a("class", " questionCertbotOl2Li04Dt ").f();
					sx(questionCertbotOl2Li04Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li04Dd ").f();
					sx(questionCertbotOl2Li04Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li05 questionCertbotOl2Li odd ").f();
				{ e("dt").a("class", " questionCertbotOl2Li05Dt ").f();
					sx(questionCertbotOl2Li05Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li05Dd ").f();
					sx(questionCertbotOl2Li05Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li06 questionCertbotOl2Li even ").f();
				{ e("dt").a("class", " questionCertbotOl2Li06Dt ").f();
					sx(questionCertbotOl2Li06Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li06Dd ").f();
					sx(questionCertbotOl2Li06Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li07 questionCertbotOl2Li odd ").f();
				{ e("dt").a("class", " questionCertbotOl2Li07Dt ").f();
					{ e("span").a("class", " questionCertbotOl2Li07DtSpan1 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li07DtSpan11);
					} g("span");
					{ e("span").a("class", " questionCertbotOl2Li07DtSpan2 questionCertbotOl2Li even ").f();
						sx(utilisateurId == null ? questionCertbotOl2Li07DtSpan21 : utilisateurSiteNomDomaine);
					} g("span");
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li07Dd ").f();
					{ e("span").a("class", " questionCertbotOl2Li07DdSpan3 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li07DdSpan31);
					} g("span");
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li08 questionCertbotOl2Li even ").f();
				{ e("dt").a("class", " questionCertbotOl2Li08Dt ").f();
					{ e("span").a("class", " questionCertbotOl2Li08DtSpan1 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li08DtSpan11);
					} g("span");
					{ e("span").a("class", " questionCertbotOl2Li08DtSpan2 questionCertbotOl2Li even ").f();
						sx(utilisateurId == null ? questionCertbotOl2Li08DtSpan21 : utilisateurSiteNomDomaine);
					} g("span");
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li08Dd ").f();
					{ e("span").a("class", " questionCertbotOl2Li08DdSpan3 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li08DdSpan31);
					} g("span");
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li09 questionCertbotOl2Li odd ").f();
				{ e("dt").a("class", " questionCertbotOl2Li09Dt ").f();
					{ e("span").a("class", " questionCertbotOl2Li09DtSpan1 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li09DtSpan11);
					} g("span");
					{ e("span").a("class", " questionCertbotOl2Li09DtSpan2 questionCertbotOl2Li even ").f();
						sx(utilisateurId == null ? questionCertbotOl2Li09DtSpan21 : utilisateurSiteNomDomaine);
					} g("span");
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li09Dd ").f();
					{ e("span").a("class", " questionCertbotOl2Li09DdSpan3 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li09DdSpan31);
						sx(questionCertbotOl2Li09DdSpan32);
					} g("span");
				} g("dd");
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

	////////////////////
	// questionCopier //
	////////////////////

	public static final String questionCopierH3I1 = "far fa-key";
	public static final String questionCopierH3I = questionCopierH3I1;
	public static final String questionCopierH3Span1 = "How do I use the certificate and key that certbot generated? ";
	public static final String questionCopierH3Span = questionCopierH3Span1;
	public static final String questionCopierH4I1 = "far fa-copy";
	public static final String questionCopierH4I = questionCopierH4I1;
	public static final String questionCopierH4Span1 = "Copy the certbot files with the install command. ";
	public static final String questionCopierH4Span = questionCopierH4Span1;
	public static final String questionCopierPre1Span011 = "sudo";
	public static final String questionCopierPre1Span01 = questionCopierPre1Span011;
	public static final String questionCopierPre1Span021 = " install";
	public static final String questionCopierPre1Span02 = questionCopierPre1Span021;
	public static final String questionCopierPre1Span031 = " -o";
	public static final String questionCopierPre1Span03 = questionCopierPre1Span031;
	public static final String questionCopierPre1Span041 = " $USER";
	public static final String questionCopierPre1Span04 = questionCopierPre1Span041;
	public static final String questionCopierPre1Span051 = " -g";
	public static final String questionCopierPre1Span05 = questionCopierPre1Span051;
	public static final String questionCopierPre1Span061 = " $USER";
	public static final String questionCopierPre1Span06 = questionCopierPre1Span061;
	public static final String questionCopierPre1Span071 = " -m";
	public static final String questionCopierPre1Span07 = questionCopierPre1Span071;
	public static final String questionCopierPre1Span081 = " 700";
	public static final String questionCopierPre1Span08 = questionCopierPre1Span081;
	public static final String questionCopierPre1Span09Span11 = " /etc/letsencrypt/live/";
	public static final String questionCopierPre1Span09Span1 = questionCopierPre1Span09Span11;
	public static final String questionCopierPreSpan09Span21 = "example.com";
	public static final String questionCopierPreSpan09Span2 = questionCopierPreSpan09Span21;
	public static final String questionCopierPre1Span09Span31 = "/privkey.pem";
	public static final String questionCopierPre1Span09Span3 = questionCopierPre1Span09Span31;
	public static final String questionCopierPre1Span101 = " /srv/certbot/server.key";
	public static final String questionCopierPre1Span10 = questionCopierPre1Span101;
	public static final String questionCopierOl1Li01Dt1 = "sudo";
	public static final String questionCopierOl1Li01Dt = questionCopierOl1Li01Dt1;
	public static final String questionCopierOl1Li02Dt1 = "install";
	public static final String questionCopierOl1Li02Dt = questionCopierOl1Li02Dt1;
	public static final String questionCopierOl1Li03Dt1 = "-o";
	public static final String questionCopierOl1Li03Dt = questionCopierOl1Li03Dt1;
	public static final String questionCopierOl1Li04Dt1 = "$USER";
	public static final String questionCopierOl1Li04Dt = questionCopierOl1Li04Dt1;
	public static final String questionCopierOl1Li05Dt1 = "-g";
	public static final String questionCopierOl1Li05Dt = questionCopierOl1Li05Dt1;
	public static final String questionCopierOl1Li06Dt1 = "$USER";
	public static final String questionCopierOl1Li06Dt = questionCopierOl1Li06Dt1;
	public static final String questionCopierOl1Li07Dt1 = "-m";
	public static final String questionCopierOl1Li07Dt = questionCopierOl1Li07Dt1;
	public static final String questionCopierOl1Li08Dt1 = "700";
	public static final String questionCopierOl1Li08Dt = questionCopierOl1Li08Dt1;
	public static final String questionCopierOl1Li09Dt1 = "/srv/certbot";
	public static final String questionCopierOl1Li09Dt2 = " /etc/letsencrypt/live/";
	public static final String questionCopierOl1Li09Dt3 = "example.com";
	public static final String questionCopierOl1Li09Dt4 = "/privkey.pem";
	public static final String questionCopierOl1Li09Dt = questionCopierOl1Li09Dt1 + questionCopierOl1Li09Dt2 + questionCopierOl1Li09Dt3 + questionCopierOl1Li09Dt4;
	public static final String questionCopierOl1Li09Dd1 = ": After the certbot command completes, it will tell you the complete path to the newly generated private key, which may not be exactly what I wrote here. ";
	public static final String questionCopierOl1Li09Dd = questionCopierOl1Li09Dd1;
	public static final String questionCopierOl1Li10Dt1 = "/srv/certbot/server.key";
	public static final String questionCopierOl1Li10Dt = questionCopierOl1Li10Dt1;
	public static final String questionCopierOl1Li10Dd1 = ": The new path to where the private key will be copied. ";
	public static final String questionCopierOl1Li10Dd = questionCopierOl1Li10Dd1;
	public static final String questionCopierPre2Span011 = "sudo";
	public static final String questionCopierPre2Span01 = questionCopierPre2Span011;
	public static final String questionCopierPre2Span021 = " install";
	public static final String questionCopierPre2Span02 = questionCopierPre2Span021;
	public static final String questionCopierPre2Span031 = " -o";
	public static final String questionCopierPre2Span03 = questionCopierPre2Span031;
	public static final String questionCopierPre2Span041 = " $USER";
	public static final String questionCopierPre2Span04 = questionCopierPre2Span041;
	public static final String questionCopierPre2Span051 = " -g";
	public static final String questionCopierPre2Span05 = questionCopierPre2Span051;
	public static final String questionCopierPre2Span061 = " $USER";
	public static final String questionCopierPre2Span06 = questionCopierPre2Span061;
	public static final String questionCopierPre2Span071 = " -m";
	public static final String questionCopierPre2Span07 = questionCopierPre2Span071;
	public static final String questionCopierPre2Span081 = " 700";
	public static final String questionCopierPre2Span08 = questionCopierPre2Span081;
	public static final String questionCopierPre2Span09Span11 = " /etc/letsencrypt/live/";
	public static final String questionCopierPre2Span09Span1 = questionCopierPre2Span09Span11;
	public static final String questionCopierPre2Span09Span21 = "example.com";
	public static final String questionCopierPre2Span09Span2 = questionCopierPre2Span09Span21;
	public static final String questionCopierPre2Span09Span31 = "/fullchain.pem";
	public static final String questionCopierPre2Span09Span3 = questionCopierPre2Span09Span31;
	public static final String questionCopierPre2Span101 = " /srv/certbot/server.crt";
	public static final String questionCopierPre2Span10 = questionCopierPre2Span101;
	public static final String questionCopierOl2Li01Dt1 = "sudo";
	public static final String questionCopierOl2Li01Dt = questionCopierOl2Li01Dt1;
	public static final String questionCopierOl2Li02Dt1 = "install";
	public static final String questionCopierOl2Li02Dt = questionCopierOl2Li02Dt1;
	public static final String questionCopierOl2Li03Dt1 = "-o";
	public static final String questionCopierOl2Li03Dt = questionCopierOl2Li03Dt1;
	public static final String questionCopierOl2Li04Dt1 = "$USER";
	public static final String questionCopierOl2Li04Dt = questionCopierOl2Li04Dt1;
	public static final String questionCopierOl2Li05Dt1 = "-g";
	public static final String questionCopierOl2Li05Dt = questionCopierOl2Li05Dt1;
	public static final String questionCopierOl2Li06Dt1 = "$USER";
	public static final String questionCopierOl2Li06Dt = questionCopierOl2Li06Dt1;
	public static final String questionCopierOl2Li07Dt1 = "-m";
	public static final String questionCopierOl2Li07Dt = questionCopierOl2Li07Dt1;
	public static final String questionCopierOl2Li08Dt1 = "700";
	public static final String questionCopierOl2Li08Dt = questionCopierOl2Li08Dt1;
	public static final String questionCopierOl2Li09Dt1 = "/srv/certbot";
	public static final String questionCopierOl2Li09Dt2 = " /etc/letsencrypt/live/";
	public static final String questionCopierOl2Li09Dt3 = "example.com";
	public static final String questionCopierOl2Li09Dt4 = "/fullchain.pem";
	public static final String questionCopierOl2Li09Dt = questionCopierOl2Li09Dt1 + questionCopierOl2Li09Dt2 + questionCopierOl2Li09Dt3 + questionCopierOl2Li09Dt4;
	public static final String questionCopierOl2Li09Dd1 = ": After the certbot command completes, it will tell you the complete path to the newly generated certificate, which may not be exactly what I wrote here. ";
	public static final String questionCopierOl2Li09Dd = questionCopierOl2Li09Dd1;
	public static final String questionCopierOl2Li10Dt1 = "/srv/certbot/server.crt";
	public static final String questionCopierOl2Li10Dt = questionCopierOl2Li10Dt1;
	public static final String questionCopierOl2Li10Dd1 = ": The new path to where the certificate will be copied. ";
	public static final String questionCopierOl2Li10Dd = questionCopierOl2Li10Dd1;

	/**	L'entité « questionCopier »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCopier = new PageHtml();
	public Couverture<PageHtml> questionCopierCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCopier").o(questionCopier);

	/**	<br/>L'entité « questionCopier »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCopier">Trouver l'entité questionCopier dans Solr</a>
	 * <br/>
	 * @param questionCopier est l'entité déjà construit. 
	 **/
	protected abstract void _questionCopier(PageHtml o);

	public PageHtml getQuestionCopier() {
		return questionCopier;
	}

	public void setQuestionCopier(PageHtml questionCopier) {
		this.questionCopier = questionCopier;
		this.questionCopierCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionCopierInit() {
		if(questionCopier != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionCopier, "questionCopier");
			((C001L008CreerCertificat)this).avantPagePart(questionCopier, "questionCopier");
		}
		if(!questionCopierCouverture.dejaInitialise) {
			_questionCopier(questionCopier);
		}
		questionCopier.initLoinPourClasse(requeteSite_);
		questionCopierCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionCopier(PageHtml o) {
		{ e("h3").a("class", " questionCopierH3 ").f();
			{ e("i").a("class", questionCopierH3I1, " site-menu-icon questionCopierH3I ").f();
			} g("i");
			{ e("span").a("class", " questionCopierH3Span ").f();
				sx(questionCopierH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionCopierH4 ").f();
			{ e("i").a("class", questionCopierH4I1, " site-menu-icon questionCopierH4I ").f();
			} g("i");
			{ e("span").a("class", " questionCopierH4Span ").f();
				sx(questionCopierH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionCopierPre1 questionCopierPre odd ").f();
			{ e("span").a("class", " questionCopierPre1Span01 questionCopierPre1Span odd ").f();
				sx(questionCopierPre1Span011);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span02 questionCopierPre1Span even ").f();
				sx(questionCopierPre1Span021);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span03 questionCopierPre1Span odd ").f();
				sx(questionCopierPre1Span031);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span04 questionCopierPre1Span even ").f();
				sx(questionCopierPre1Span041);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span05 questionCopierPre1Span odd ").f();
				sx(questionCopierPre1Span051);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span06 questionCopierPre1Span even ").f();
				sx(questionCopierPre1Span061);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span07 questionCopierPre1Span odd ").f();
				sx(questionCopierPre1Span071);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span08 questionCopierPre1Span even ").f();
				sx(questionCopierPre1Span081);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span09 questionCopierPre1Span odd ").f();
				{ e("span").a("class", " questionCopierPre1Span09Span1 questionCopierPre1Span odd ").f();
					sx(questionCopierPre1Span09Span11);
				} g("span");
				{ e("span").a("class", " questionCopierPreSpan09Span2 questionCopierPreSpan even ").f();
					sx(utilisateurId == null ? questionCopierPreSpan09Span21 : utilisateurSiteNomDomaine);
				} g("span");
				{ e("span").a("class", " questionCopierPre1Span09Span3 questionCopierPre1Span odd ").f();
					sx(questionCopierPre1Span09Span31);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span10 questionCopierPre1Span even ").f();
				sx(questionCopierPre1Span101);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCopierOl1 questionCopierOl odd ").f();
			{ e("li").a("class", " questionCopierOl1Li01 questionCopierOl1Li odd ").f();
				{ e("dt").a("class", " questionCopierOl1Li01Dt ").f();
					sx(questionCopierOl1Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li02 questionCopierOl1Li even ").f();
				{ e("dt").a("class", " questionCopierOl1Li02Dt ").f();
					sx(questionCopierOl1Li02Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li03 questionCopierOl1Li odd ").f();
				{ e("dt").a("class", " questionCopierOl1Li03Dt ").f();
					sx(questionCopierOl1Li03Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li04 questionCopierOl1Li even ").f();
				{ e("dt").a("class", " questionCopierOl1Li04Dt ").f();
					sx(questionCopierOl1Li04Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li05 questionCopierOl1Li odd ").f();
				{ e("dt").a("class", " questionCopierOl1Li05Dt ").f();
					sx(questionCopierOl1Li05Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li06 questionCopierOl1Li even ").f();
				{ e("dt").a("class", " questionCopierOl1Li06Dt ").f();
					sx(questionCopierOl1Li06Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li07 questionCopierOl1Li odd ").f();
				{ e("dt").a("class", " questionCopierOl1Li07Dt ").f();
					sx(questionCopierOl1Li07Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li08 questionCopierOl1Li even ").f();
				{ e("dt").a("class", " questionCopierOl1Li08Dt ").f();
					sx(questionCopierOl1Li08Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li09 questionCopierOl1Li odd ").f();
				{ e("dt").a("class", " questionCopierOl1Li09Dt ").f();
					sx(questionCopierOl1Li09Dt1);
					sx(questionCopierOl1Li09Dt2);
					sx(utilisateurId == null ? questionCopierOl1Li09Dt3 : utilisateurSiteNomDomaine);
					sx(questionCopierOl1Li09Dt4);
				} g("dt");
				{ e("dd").a("class", " questionCopierOl1Li09Dd ").f();
					sx(questionCopierOl1Li09Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li10 questionCopierOl1Li even ").f();
				{ e("dt").a("class", " questionCopierOl1Li10Dt ").f();
					sx(questionCopierOl1Li10Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCopierOl1Li10Dd ").f();
					sx(questionCopierOl1Li10Dd1);
				} g("dd");
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionCopierPre2 questionCopierPre even ").f();
			{ e("span").a("class", " questionCopierPre2Span01 questionCopierPre2Span odd ").f();
				sx(questionCopierPre2Span011);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span02 questionCopierPre2Span even ").f();
				sx(questionCopierPre2Span021);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span03 questionCopierPre2Span odd ").f();
				sx(questionCopierPre2Span031);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span04 questionCopierPre2Span even ").f();
				sx(questionCopierPre2Span041);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span05 questionCopierPre2Span odd ").f();
				sx(questionCopierPre2Span051);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span06 questionCopierPre2Span even ").f();
				sx(questionCopierPre2Span061);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span07 questionCopierPre2Span odd ").f();
				sx(questionCopierPre2Span071);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span08 questionCopierPre2Span even ").f();
				sx(questionCopierPre2Span081);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span09 questionCopierPre2Span odd ").f();
				{ e("span").a("class", " questionCopierPre2Span09Span1 questionCopierPre2Span odd ").f();
					sx(questionCopierPre2Span09Span11);
				} g("span");
				{ e("span").a("class", " questionCopierPre2Span09Span2 questionCopierPre2Span even ").f();
					sx(utilisateurId == null ? questionCopierPre2Span09Span21 : utilisateurSiteNomDomaine);
				} g("span");
				{ e("span").a("class", " questionCopierPre2Span09Span3 questionCopierPre2Span odd ").f();
					sx(questionCopierPre2Span09Span31);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span10 questionCopierPre2Span even ").f();
				sx(questionCopierPre2Span101);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCopierOl2 questionCopierOl even ").f();
			{ e("li").a("class", " questionCopierOl2Li01 questionCopierOl2Li odd ").f();
				{ e("dt").a("class", " questionCopierOl2Li01Dt ").f();
					sx(questionCopierOl2Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li02 questionCopierOl2Li even ").f();
				{ e("dt").a("class", " questionCopierOl2Li02Dt ").f();
					sx(questionCopierOl2Li02Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li03 questionCopierOl2Li odd ").f();
				{ e("dt").a("class", " questionCopierOl2Li03Dt ").f();
					sx(questionCopierOl2Li03Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li04 questionCopierOl2Li even ").f();
				{ e("dt").a("class", " questionCopierOl2Li04Dt ").f();
					sx(questionCopierOl2Li04Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li05 questionCopierOl2Li odd ").f();
				{ e("dt").a("class", " questionCopierOl2Li05Dt ").f();
					sx(questionCopierOl2Li05Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li06 questionCopierOl2Li even ").f();
				{ e("dt").a("class", " questionCopierOl2Li06Dt ").f();
					sx(questionCopierOl2Li06Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li07 questionCopierOl2Li odd ").f();
				{ e("dt").a("class", " questionCopierOl2Li07Dt ").f();
					sx(questionCopierOl2Li07Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li08 questionCopierOl2Li even ").f();
				{ e("dt").a("class", " questionCopierOl2Li08Dt ").f();
					sx(questionCopierOl2Li08Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li09 questionCopierOl2Li odd ").f();
				{ e("dt").a("class", " questionCopierOl2Li09Dt ").f();
					sx(questionCopierOl2Li09Dt1);
					sx(questionCopierOl2Li09Dt2);
					sx(utilisateurId == null ? questionCopierOl2Li09Dt3 : utilisateurSiteNomDomaine);
					sx(questionCopierOl2Li09Dt4);
				} g("dt");
				{ e("dd").a("class", " questionCopierOl2Li09Dd ").f();
					sx(questionCopierOl2Li09Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li10 questionCopierOl2Li even ").f();
				{ e("dt").a("class", " questionCopierOl2Li10Dt ").f();
					sx(questionCopierOl2Li10Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCopierOl2Li10Dd ").f();
					sx(questionCopierOl2Li10Dd1);
				} g("dd");
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionCopier() {
		questionCopier.htmlAvant();
		htmlBodyQuestionCopier(questionCopier);
		questionCopier.htmlApres();
	}

	//////////////////////
	// questionRacineCa //
	//////////////////////

	public static final String questionRacineCaH3I1 = "far fa-users-crown";
	public static final String questionRacineCaH3I = questionRacineCaH3I1;
	public static final String questionRacineCaH3Span1 = "How do I obtain the letsencrypt root and CA certificates? ";
	public static final String questionRacineCaH3Span = questionRacineCaH3Span1;
	public static final String questionRacineCaH4I1 = "far fa-copy";
	public static final String questionRacineCaH4I = questionRacineCaH4I1;
	public static final String questionRacineCaH4Span1 = "Download the root and CA certificates with the curl command. ";
	public static final String questionRacineCaH4Span = questionRacineCaH4Span1;
	public static final String questionRacineCaPre1Span011 = "curl";
	public static final String questionRacineCaPre1Span01 = questionRacineCaPre1Span011;
	public static final String questionRacineCaPre1Span021 = " https://letsencrypt.org/certs/isrgrootx1.pem.txt";
	public static final String questionRacineCaPre1Span02 = questionRacineCaPre1Span021;
	public static final String questionRacineCaPre1Span031 = " -o /srv/certbot/root.crt";
	public static final String questionRacineCaPre1Span03 = questionRacineCaPre1Span031;
	public static final String questionRacineCaOl1Li01Dt1 = "curl";
	public static final String questionRacineCaOl1Li01Dt = questionRacineCaOl1Li01Dt1;
	public static final String questionRacineCaOl1Li01Dd1 = ": A tool to transfer data from or to a server, using supported protocols. ";
	public static final String questionRacineCaOl1Li01Dd = questionRacineCaOl1Li01Dd1;
	public static final String questionRacineCaOl1Li02Dt1 = "https://letsencrypt.org/certs/isrgrootx1.pem.txt";
	public static final String questionRacineCaOl1Li02Dt = questionRacineCaOl1Li02Dt1;
	public static final String questionRacineCaOl1Li02Dd1 = ": The URL to the letsencrypt root certificate. ";
	public static final String questionRacineCaOl1Li02Dd = questionRacineCaOl1Li02Dd1;
	public static final String questionRacineCaOl1Li03Dt1 = "-o /srv/certbot/root.crt";
	public static final String questionRacineCaOl1Li03Dt = questionRacineCaOl1Li03Dt1;
	public static final String questionRacineCaOl1Li03Dd1 = ": Write output to the root.crt file instead of stdout. ";
	public static final String questionRacineCaOl1Li03Dd = questionRacineCaOl1Li03Dd1;
	public static final String questionRacineCaPre2Span011 = "curl";
	public static final String questionRacineCaPre2Span01 = questionRacineCaPre2Span011;
	public static final String questionRacineCaPre2Span021 = " https://letsencrypt.org/certs/lets-encrypt-x3-cross-signed.pem.txt";
	public static final String questionRacineCaPre2Span02 = questionRacineCaPre2Span021;
	public static final String questionRacineCaPre2Span031 = " -o /srv/certbot/ca1.crt";
	public static final String questionRacineCaPre2Span03 = questionRacineCaPre2Span031;
	public static final String questionRacineCaOl2Li01Dt1 = "curl";
	public static final String questionRacineCaOl2Li01Dt = questionRacineCaOl2Li01Dt1;
	public static final String questionRacineCaOl2Li02Dt1 = "https://letsencrypt.org/certs/lets-encrypt-x3-cross-signed.pem.txt";
	public static final String questionRacineCaOl2Li02Dt = questionRacineCaOl2Li02Dt1;
	public static final String questionRacineCaOl2Li02Dd1 = ": The URL to the first letsencrypt certificate authority. ";
	public static final String questionRacineCaOl2Li02Dd = questionRacineCaOl2Li02Dd1;
	public static final String questionRacineCaOl2Li03Dt1 = "-o /srv/certbot/ca1.crt";
	public static final String questionRacineCaOl2Li03Dt = questionRacineCaOl2Li03Dt1;
	public static final String questionRacineCaOl2Li03Dd1 = ": Write output to the ca1.crt file instead of stdout. ";
	public static final String questionRacineCaOl2Li03Dd = questionRacineCaOl2Li03Dd1;
	public static final String questionRacineCaPre3Span011 = "curl";
	public static final String questionRacineCaPre3Span01 = questionRacineCaPre3Span011;
	public static final String questionRacineCaPre3Span021 = " https://letsencrypt.org/certs/letsencryptauthorityx3.pem.txt";
	public static final String questionRacineCaPre3Span02 = questionRacineCaPre3Span021;
	public static final String questionRacineCaPre3Span031 = " -o /srv/certbot/ca2.crt";
	public static final String questionRacineCaPre3Span03 = questionRacineCaPre3Span031;
	public static final String questionRacineCaOl3Li01Dt1 = "curl";
	public static final String questionRacineCaOl3Li01Dt = questionRacineCaOl3Li01Dt1;
	public static final String questionRacineCaOl3Li02Dt1 = "https://letsencrypt.org/certs/letsencryptauthorityx3.pem.txt";
	public static final String questionRacineCaOl3Li02Dt = questionRacineCaOl3Li02Dt1;
	public static final String questionRacineCaOl3Li02Dd1 = ": The URL to the second letsencrypt certificate authority. ";
	public static final String questionRacineCaOl3Li02Dd = questionRacineCaOl3Li02Dd1;
	public static final String questionRacineCaOl3Li03Dt1 = "-o /srv/certbot/ca2.crt";
	public static final String questionRacineCaOl3Li03Dt = questionRacineCaOl3Li03Dt1;
	public static final String questionRacineCaOl3Li03Dd1 = ": Write output to the ca2.crt file instead of stdout. ";
	public static final String questionRacineCaOl3Li03Dd = questionRacineCaOl3Li03Dd1;

	/**	L'entité « questionRacineCa »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionRacineCa = new PageHtml();
	public Couverture<PageHtml> questionRacineCaCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionRacineCa").o(questionRacineCa);

	/**	<br/>L'entité « questionRacineCa »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionRacineCa">Trouver l'entité questionRacineCa dans Solr</a>
	 * <br/>
	 * @param questionRacineCa est l'entité déjà construit. 
	 **/
	protected abstract void _questionRacineCa(PageHtml o);

	public PageHtml getQuestionRacineCa() {
		return questionRacineCa;
	}

	public void setQuestionRacineCa(PageHtml questionRacineCa) {
		this.questionRacineCa = questionRacineCa;
		this.questionRacineCaCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionRacineCaInit() {
		if(questionRacineCa != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionRacineCa, "questionRacineCa");
			((C001L008CreerCertificat)this).avantPagePart(questionRacineCa, "questionRacineCa");
		}
		if(!questionRacineCaCouverture.dejaInitialise) {
			_questionRacineCa(questionRacineCa);
		}
		questionRacineCa.initLoinPourClasse(requeteSite_);
		questionRacineCaCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionRacineCa(PageHtml o) {
		{ e("h3").a("class", " questionRacineCaH3 ").f();
			{ e("i").a("class", questionRacineCaH3I1, " site-menu-icon questionRacineCaH3I ").f();
			} g("i");
			{ e("span").a("class", " questionRacineCaH3Span ").f();
				sx(questionRacineCaH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionRacineCaH4 ").f();
			{ e("i").a("class", questionRacineCaH4I1, " site-menu-icon questionRacineCaH4I ").f();
			} g("i");
			{ e("span").a("class", " questionRacineCaH4Span ").f();
				sx(questionRacineCaH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionRacineCaPre1 questionRacineCaPre odd ").f();
			{ e("span").a("class", " questionRacineCaPre1Span01 questionRacineCaPre1Span odd ").f();
				sx(questionRacineCaPre1Span011);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre1Span02 questionRacineCaPre1Span even ").f();
				sx(questionRacineCaPre1Span021);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre1Span03 questionRacineCaPre1Span odd ").f();
				sx(questionRacineCaPre1Span031);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionRacineCaOl1 questionRacineCaOl odd ").f();
			{ e("li").a("class", " questionRacineCaOl1Li01 questionRacineCaOl1Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl1Li01Dt ").f();
					sx(questionRacineCaOl1Li01Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl1Li01Dd ").f();
					sx(questionRacineCaOl1Li01Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl1Li02 questionRacineCaOl1Li even ").f();
				{ e("dt").a("class", " questionRacineCaOl1Li02Dt ").f();
					sx(questionRacineCaOl1Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl1Li02Dd ").f();
					sx(questionRacineCaOl1Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl1Li03 questionRacineCaOl1Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl1Li03Dt ").f();
					sx(questionRacineCaOl1Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl1Li03Dd ").f();
					sx(questionRacineCaOl1Li03Dd1);
				} g("dd");
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionRacineCaPre2 questionRacineCaPre even ").f();
			{ e("span").a("class", " questionRacineCaPre2Span01 questionRacineCaPre2Span odd ").f();
				sx(questionRacineCaPre2Span011);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre2Span02 questionRacineCaPre2Span even ").f();
				sx(questionRacineCaPre2Span021);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre2Span03 questionRacineCaPre2Span odd ").f();
				sx(questionRacineCaPre2Span031);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionRacineCaOl2 questionRacineCaOl even ").f();
			{ e("li").a("class", " questionRacineCaOl2Li01 questionRacineCaOl2Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl2Li01Dt ").f();
					sx(questionRacineCaOl2Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl2Li02 questionRacineCaOl2Li even ").f();
				{ e("dt").a("class", " questionRacineCaOl2Li02Dt ").f();
					sx(questionRacineCaOl2Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl2Li02Dd ").f();
					sx(questionRacineCaOl2Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl2Li03 questionRacineCaOl2Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl2Li03Dt ").f();
					sx(questionRacineCaOl2Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl2Li03Dd ").f();
					sx(questionRacineCaOl2Li03Dd1);
				} g("dd");
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionRacineCaPre3 questionRacineCaPre odd ").f();
			{ e("span").a("class", " questionRacineCaPre3Span01 questionRacineCaPre3Span odd ").f();
				sx(questionRacineCaPre3Span011);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre3Span02 questionRacineCaPre3Span even ").f();
				sx(questionRacineCaPre3Span021);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre3Span03 questionRacineCaPre3Span odd ").f();
				sx(questionRacineCaPre3Span031);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionRacineCaOl3 questionRacineCaOl odd ").f();
			{ e("li").a("class", " questionRacineCaOl3Li01 questionRacineCaOl3Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl3Li01Dt ").f();
					sx(questionRacineCaOl3Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl3Li02 questionRacineCaOl3Li even ").f();
				{ e("dt").a("class", " questionRacineCaOl3Li02Dt ").f();
					sx(questionRacineCaOl3Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl3Li02Dd ").f();
					sx(questionRacineCaOl3Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl3Li03 questionRacineCaOl3Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl3Li03Dt ").f();
					sx(questionRacineCaOl3Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl3Li03Dd ").f();
					sx(questionRacineCaOl3Li03Dd1);
				} g("dd");
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionRacineCa() {
		questionRacineCa.htmlAvant();
		htmlBodyQuestionRacineCa(questionRacineCa);
		questionRacineCa.htmlApres();
	}

	//////////////////////////////////
	// questionCertificatsFusionnes //
	//////////////////////////////////

	public static final String questionCertificatsFusionnesH3I1 = "far fa-object-group";
	public static final String questionCertificatsFusionnesH3I = questionCertificatsFusionnesH3I1;
	public static final String questionCertificatsFusionnesH3Span1 = "How do I create a merged version of site certificates, certificate authority and root certificate? ";
	public static final String questionCertificatsFusionnesH3Span = questionCertificatsFusionnesH3Span1;
	public static final String questionCertificatsFusionnesH4I1 = "far fa-cat";
	public static final String questionCertificatsFusionnesH4I = questionCertificatsFusionnesH4I1;
	public static final String questionCertificatsFusionnesH4Span1 = "Create a merged certificate with the cat command. ";
	public static final String questionCertificatsFusionnesH4Span = questionCertificatsFusionnesH4Span1;
	public static final String questionCertificatsFusionnesPre1Span011 = "cat";
	public static final String questionCertificatsFusionnesPre1Span01 = questionCertificatsFusionnesPre1Span011;
	public static final String questionCertificatsFusionnesPre1Span021 = " /srv/certbot/root.crt";
	public static final String questionCertificatsFusionnesPre1Span02 = questionCertificatsFusionnesPre1Span021;
	public static final String questionCertificatsFusionnesPre1Span031 = " /srv/certbot/ca2.crt";
	public static final String questionCertificatsFusionnesPre1Span03 = questionCertificatsFusionnesPre1Span031;
	public static final String questionCertificatsFusionnesPre1Span041 = " /srv/certbot/server.crt";
	public static final String questionCertificatsFusionnesPre1Span04 = questionCertificatsFusionnesPre1Span041;
	public static final String questionCertificatsFusionnesPre1Span051 = " >";
	public static final String questionCertificatsFusionnesPre1Span05 = questionCertificatsFusionnesPre1Span051;
	public static final String questionCertificatsFusionnesPre1Span061 = " /srv/certbot/merged.crt";
	public static final String questionCertificatsFusionnesPre1Span06 = questionCertificatsFusionnesPre1Span061;
	public static final String questionCertificatsFusionnesOl1Li01Dt1 = "cat";
	public static final String questionCertificatsFusionnesOl1Li01Dt = questionCertificatsFusionnesOl1Li01Dt1;
	public static final String questionCertificatsFusionnesOl1Li01Dd1 = ": Concatenate files and print on the standard output. ";
	public static final String questionCertificatsFusionnesOl1Li01Dd = questionCertificatsFusionnesOl1Li01Dd1;
	public static final String questionCertificatsFusionnesOl1Li02Dt1 = "/srv/certbot/root.crt";
	public static final String questionCertificatsFusionnesOl1Li02Dt = questionCertificatsFusionnesOl1Li02Dt1;
	public static final String questionCertificatsFusionnesOl1Li02Dd1 = ": The path to the letsencrypt root certificate. ";
	public static final String questionCertificatsFusionnesOl1Li02Dd = questionCertificatsFusionnesOl1Li02Dd1;
	public static final String questionCertificatsFusionnesOl1Li03Dt1 = "/srv/certbot/ca2.crt";
	public static final String questionCertificatsFusionnesOl1Li03Dt = questionCertificatsFusionnesOl1Li03Dt1;
	public static final String questionCertificatsFusionnesOl1Li03Dd1 = ": The path to the second letsencrypt certificate authority. ";
	public static final String questionCertificatsFusionnesOl1Li03Dd = questionCertificatsFusionnesOl1Li03Dd1;
	public static final String questionCertificatsFusionnesOl1Li04Dt1 = "/srv/certbot/server.crt";
	public static final String questionCertificatsFusionnesOl1Li04Dt = questionCertificatsFusionnesOl1Li04Dt1;
	public static final String questionCertificatsFusionnesOl1Li04Dd1 = ": The path to your new site certificate, the first letsencrypt certificate authority is also in there. ";
	public static final String questionCertificatsFusionnesOl1Li04Dd = questionCertificatsFusionnesOl1Li04Dd1;
	public static final String questionCertificatsFusionnesOl1Li05Dt1 = ">";
	public static final String questionCertificatsFusionnesOl1Li05Dt = questionCertificatsFusionnesOl1Li05Dt1;
	public static final String questionCertificatsFusionnesOl1Li05Dd1 = ": Write the contents of the previous command to the file. ";
	public static final String questionCertificatsFusionnesOl1Li05Dd = questionCertificatsFusionnesOl1Li05Dd1;
	public static final String questionCertificatsFusionnesOl1Li06Dt1 = "/srv/certbot/merged.crt";
	public static final String questionCertificatsFusionnesOl1Li06Dt = questionCertificatsFusionnesOl1Li06Dt1;
	public static final String questionCertificatsFusionnesOl1Li06Dd1 = ": The path to the merged certificate file. ";
	public static final String questionCertificatsFusionnesOl1Li06Dd = questionCertificatsFusionnesOl1Li06Dd1;

	/**	L'entité « questionCertificatsFusionnes »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCertificatsFusionnes = new PageHtml();
	public Couverture<PageHtml> questionCertificatsFusionnesCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCertificatsFusionnes").o(questionCertificatsFusionnes);

	/**	<br/>L'entité « questionCertificatsFusionnes »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCertificatsFusionnes">Trouver l'entité questionCertificatsFusionnes dans Solr</a>
	 * <br/>
	 * @param questionCertificatsFusionnes est l'entité déjà construit. 
	 **/
	protected abstract void _questionCertificatsFusionnes(PageHtml o);

	public PageHtml getQuestionCertificatsFusionnes() {
		return questionCertificatsFusionnes;
	}

	public void setQuestionCertificatsFusionnes(PageHtml questionCertificatsFusionnes) {
		this.questionCertificatsFusionnes = questionCertificatsFusionnes;
		this.questionCertificatsFusionnesCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionCertificatsFusionnesInit() {
		if(questionCertificatsFusionnes != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionCertificatsFusionnes, "questionCertificatsFusionnes");
			((C001L008CreerCertificat)this).avantPagePart(questionCertificatsFusionnes, "questionCertificatsFusionnes");
		}
		if(!questionCertificatsFusionnesCouverture.dejaInitialise) {
			_questionCertificatsFusionnes(questionCertificatsFusionnes);
		}
		questionCertificatsFusionnes.initLoinPourClasse(requeteSite_);
		questionCertificatsFusionnesCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionCertificatsFusionnes(PageHtml o) {
		{ e("h3").a("class", " questionCertificatsFusionnesH3 ").f();
			{ e("i").a("class", questionCertificatsFusionnesH3I1, " site-menu-icon questionCertificatsFusionnesH3I ").f();
			} g("i");
			{ e("span").a("class", " questionCertificatsFusionnesH3Span ").f();
				sx(questionCertificatsFusionnesH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionCertificatsFusionnesH4 ").f();
			{ e("i").a("class", questionCertificatsFusionnesH4I1, " site-menu-icon questionCertificatsFusionnesH4I ").f();
			} g("i");
			{ e("span").a("class", " questionCertificatsFusionnesH4Span ").f();
				sx(questionCertificatsFusionnesH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionCertificatsFusionnesPre1 questionCertificatsFusionnesPre odd ").f();
			{ e("span").a("class", " questionCertificatsFusionnesPre1Span01 questionCertificatsFusionnesPre1Span odd ").f();
				sx(questionCertificatsFusionnesPre1Span011);
			} g("span");
			{ e("span").a("class", " questionCertificatsFusionnesPre1Span02 questionCertificatsFusionnesPre1Span even ").f();
				sx(questionCertificatsFusionnesPre1Span021);
			} g("span");
			{ e("span").a("class", " questionCertificatsFusionnesPre1Span03 questionCertificatsFusionnesPre1Span odd ").f();
				sx(questionCertificatsFusionnesPre1Span031);
			} g("span");
			{ e("span").a("class", " questionCertificatsFusionnesPre1Span04 questionCertificatsFusionnesPre1Span even ").f();
				sx(questionCertificatsFusionnesPre1Span041);
			} g("span");
			{ e("span").a("class", " questionCertificatsFusionnesPre1Span05 questionCertificatsFusionnesPre1Span odd ").f();
				sx(questionCertificatsFusionnesPre1Span051);
			} g("span");
			{ e("span").a("class", " questionCertificatsFusionnesPre1Span06 questionCertificatsFusionnesPre1Span even ").f();
				sx(questionCertificatsFusionnesPre1Span061);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCertificatsFusionnesOl1 questionCertificatsFusionnesOl odd ").f();
			{ e("li").a("class", " questionCertificatsFusionnesOl1Li01 questionCertificatsFusionnesOl1Li odd ").f();
				{ e("dt").a("class", " questionCertificatsFusionnesOl1Li01Dt ").f();
					sx(questionCertificatsFusionnesOl1Li01Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertificatsFusionnesOl1Li01Dd ").f();
					sx(questionCertificatsFusionnesOl1Li01Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertificatsFusionnesOl1Li02 questionCertificatsFusionnesOl1Li even ").f();
				{ e("dt").a("class", " questionCertificatsFusionnesOl1Li02Dt ").f();
					sx(questionCertificatsFusionnesOl1Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertificatsFusionnesOl1Li02Dd ").f();
					sx(questionCertificatsFusionnesOl1Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertificatsFusionnesOl1Li03 questionCertificatsFusionnesOl1Li odd ").f();
				{ e("dt").a("class", " questionCertificatsFusionnesOl1Li03Dt ").f();
					sx(questionCertificatsFusionnesOl1Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertificatsFusionnesOl1Li03Dd ").f();
					sx(questionCertificatsFusionnesOl1Li03Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertificatsFusionnesOl1Li04 questionCertificatsFusionnesOl1Li even ").f();
				{ e("dt").a("class", " questionCertificatsFusionnesOl1Li04Dt ").f();
					sx(questionCertificatsFusionnesOl1Li04Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertificatsFusionnesOl1Li04Dd ").f();
					sx(questionCertificatsFusionnesOl1Li04Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertificatsFusionnesOl1Li05 questionCertificatsFusionnesOl1Li odd ").f();
				{ e("dt").a("class", " questionCertificatsFusionnesOl1Li05Dt ").f();
					sx(questionCertificatsFusionnesOl1Li05Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertificatsFusionnesOl1Li05Dd ").f();
					sx(questionCertificatsFusionnesOl1Li05Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertificatsFusionnesOl1Li06 questionCertificatsFusionnesOl1Li even ").f();
				{ e("dt").a("class", " questionCertificatsFusionnesOl1Li06Dt ").f();
					sx(questionCertificatsFusionnesOl1Li06Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertificatsFusionnesOl1Li06Dd ").f();
					sx(questionCertificatsFusionnesOl1Li06Dd1);
				} g("dd");
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionCertificatsFusionnes() {
		questionCertificatsFusionnes.htmlAvant();
		htmlBodyQuestionCertificatsFusionnes(questionCertificatsFusionnes);
		questionCertificatsFusionnes.htmlApres();
	}

	////////////////////
	// questionPkcs12 //
	////////////////////

	public static final String questionPkcs12H3I1 = "far fa-file-certificate";
	public static final String questionPkcs12H3I = questionPkcs12H3I1;
	public static final String questionPkcs12H3Span1 = "How do I create a pkcs12 certificate chain of trust? ";
	public static final String questionPkcs12H3Span = questionPkcs12H3Span1;
	public static final String questionPkcs12H4I1 = "far fa-shield-alt";
	public static final String questionPkcs12H4I = questionPkcs12H4I1;
	public static final String questionPkcs12H4Span1 = "Use the openssl command to create a .p12 file. ";
	public static final String questionPkcs12H4Span = questionPkcs12H4Span1;
	public static final String questionPkcs12P11 = "In cryptography, PKCS #12 defines an archive file format for storing many cryptography objects as a single file. ";
	public static final String questionPkcs12P12 = "It is commonly used to bundle a private key with its X.509 certificate or to bundle all the members of a chain of trust. ";
	public static final String questionPkcs12P1 = questionPkcs12P11 + questionPkcs12P12;
	public static final String questionPkcs12Pre1Span011 = "openssl";
	public static final String questionPkcs12Pre1Span01 = questionPkcs12Pre1Span011;
	public static final String questionPkcs12Pre1Span021 = " pkcs12";
	public static final String questionPkcs12Pre1Span02 = questionPkcs12Pre1Span021;
	public static final String questionPkcs12Pre1Span031 = " -export";
	public static final String questionPkcs12Pre1Span03 = questionPkcs12Pre1Span031;
	public static final String questionPkcs12Pre1Span04Span11 = " -name ";
	public static final String questionPkcs12Pre1Span04Span1 = questionPkcs12Pre1Span04Span11;
	public static final String questionPkcs12Pre1Span04Span21 = "example.com";
	public static final String questionPkcs12Pre1Span04Span2 = questionPkcs12Pre1Span04Span21;
	public static final String questionPkcs12Pre1Span051 = " -in /srv/certbot/merged.crt";
	public static final String questionPkcs12Pre1Span05 = questionPkcs12Pre1Span051;
	public static final String questionPkcs12Pre1Span061 = " -inkey /srv/certbot/server.key";
	public static final String questionPkcs12Pre1Span06 = questionPkcs12Pre1Span061;
	public static final String questionPkcs12Pre1Span071 = " -out /srv/certbot/server.p12";
	public static final String questionPkcs12Pre1Span07 = questionPkcs12Pre1Span071;
	public static final String questionPkcs12Ol1Li01Dt1 = "openssl";
	public static final String questionPkcs12Ol1Li01Dt = questionPkcs12Ol1Li01Dt1;
	public static final String questionPkcs12Ol1Li01Dd1 = ": OpenSSL is a cryptography toolkit implementing the Secure Sockets Layer (SSL v2/v3) and Transport Layer Security (TLS v1) network protocols. ";
	public static final String questionPkcs12Ol1Li01Dd = questionPkcs12Ol1Li01Dd1;
	public static final String questionPkcs12Ol1Li02Dt1 = "pkcs12";
	public static final String questionPkcs12Ol1Li02Dt = questionPkcs12Ol1Li02Dt1;
	public static final String questionPkcs12Ol1Li02Dd1 = ": The pkcs12 command allows PKCS#12 files to be created and parsed. ";
	public static final String questionPkcs12Ol1Li02Dd = questionPkcs12Ol1Li02Dd1;
	public static final String questionPkcs12Ol1Li03Dt1 = "-export";
	public static final String questionPkcs12Ol1Li03Dt = questionPkcs12Ol1Li03Dt1;
	public static final String questionPkcs12Ol1Li03Dd1 = ": This option specifies that a PKCS#12 file will be created rather than parsed. ";
	public static final String questionPkcs12Ol1Li03Dd = questionPkcs12Ol1Li03Dd1;
	public static final String questionPkcs12Ol1Li04DtSpan11 = "-name ";
	public static final String questionPkcs12Ol1Li04DtSpan1 = questionPkcs12Ol1Li04DtSpan11;
	public static final String questionPkcs12Ol1Li04DtSpan21 = "example.com";
	public static final String questionPkcs12Ol1Li04DtSpan2 = questionPkcs12Ol1Li04DtSpan21;
	public static final String questionPkcs12Ol1Li04Dd1 = ": This specifies the alias, or friendly name, for the certificate and private key. ";
	public static final String questionPkcs12Ol1Li04Dd = questionPkcs12Ol1Li04Dd1;
	public static final String questionPkcs12Ol1Li05Dt1 = "-in /srv/certbot/merged.crt";
	public static final String questionPkcs12Ol1Li05Dt = questionPkcs12Ol1Li05Dt1;
	public static final String questionPkcs12Ol1Li05Dd1 = ": The path to the merged certificate file. ";
	public static final String questionPkcs12Ol1Li05Dd = questionPkcs12Ol1Li05Dd1;
	public static final String questionPkcs12Ol1Li06Dt1 = "-inkey /srv/certbot/server.key";
	public static final String questionPkcs12Ol1Li06Dt = questionPkcs12Ol1Li06Dt1;
	public static final String questionPkcs12Ol1Li06Dd1 = ": The path to the private key. ";
	public static final String questionPkcs12Ol1Li06Dd = questionPkcs12Ol1Li06Dd1;
	public static final String questionPkcs12Ol1Li07Dt1 = "-out /srv/certbot/server.p12";
	public static final String questionPkcs12Ol1Li07Dt = questionPkcs12Ol1Li07Dt1;
	public static final String questionPkcs12Ol1Li07Dd1 = ": The path to the new .p12 chain of trust file. ";
	public static final String questionPkcs12Ol1Li07Dd = questionPkcs12Ol1Li07Dd1;

	/**	L'entité « questionPkcs12 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionPkcs12 = new PageHtml();
	public Couverture<PageHtml> questionPkcs12Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionPkcs12").o(questionPkcs12);

	/**	<br/>L'entité « questionPkcs12 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionPkcs12">Trouver l'entité questionPkcs12 dans Solr</a>
	 * <br/>
	 * @param questionPkcs12 est l'entité déjà construit. 
	 **/
	protected abstract void _questionPkcs12(PageHtml o);

	public PageHtml getQuestionPkcs12() {
		return questionPkcs12;
	}

	public void setQuestionPkcs12(PageHtml questionPkcs12) {
		this.questionPkcs12 = questionPkcs12;
		this.questionPkcs12Couverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionPkcs12Init() {
		if(questionPkcs12 != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionPkcs12, "questionPkcs12");
			((C001L008CreerCertificat)this).avantPagePart(questionPkcs12, "questionPkcs12");
		}
		if(!questionPkcs12Couverture.dejaInitialise) {
			_questionPkcs12(questionPkcs12);
		}
		questionPkcs12.initLoinPourClasse(requeteSite_);
		questionPkcs12Couverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionPkcs12(PageHtml o) {
		{ e("h3").a("class", " questionPkcs12H3 ").f();
			{ e("i").a("class", questionPkcs12H3I1, " site-menu-icon questionPkcs12H3I ").f();
			} g("i");
			{ e("span").a("class", " questionPkcs12H3Span ").f();
				sx(questionPkcs12H3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionPkcs12H4 ").f();
			{ e("i").a("class", questionPkcs12H4I1, " site-menu-icon questionPkcs12H4I ").f();
			} g("i");
			{ e("span").a("class", " questionPkcs12H4Span ").f();
				sx(questionPkcs12H4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " questionPkcs12P1 questionPkcs12P odd ").f();
			sx(questionPkcs12P11);
			sx(questionPkcs12P12);
		} g("p");
		{ e("pre").a("class", " questionPkcs12Pre1 questionPkcs12Pre odd ").f();
			{ e("span").a("class", " questionPkcs12Pre1Span01 questionPkcs12Pre1Span odd ").f();
				sx(questionPkcs12Pre1Span011);
			} g("span");
			{ e("span").a("class", " questionPkcs12Pre1Span02 questionPkcs12Pre1Span even ").f();
				sx(questionPkcs12Pre1Span021);
			} g("span");
			{ e("span").a("class", " questionPkcs12Pre1Span03 questionPkcs12Pre1Span odd ").f();
				sx(questionPkcs12Pre1Span031);
			} g("span");
			{ e("span").a("class", " questionPkcs12Pre1Span04 questionPkcs12Pre1Span even ").f();
				{ e("span").a("class", " questionPkcs12Pre1Span04Span1 questionPkcs12Pre1Span odd ").f();
					sx(questionPkcs12Pre1Span04Span11);
				} g("span");
				{ e("span").a("class", " questionPkcs12Pre1Span04Span2 questionPkcs12Pre1Span even ").f();
					sx(utilisateurId == null ? questionPkcs12Pre1Span04Span21 : utilisateurSiteNomDomaine);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionPkcs12Pre1Span05 questionPkcs12Pre1Span odd ").f();
				sx(questionPkcs12Pre1Span051);
			} g("span");
			{ e("span").a("class", " questionPkcs12Pre1Span06 questionPkcs12Pre1Span even ").f();
				sx(questionPkcs12Pre1Span061);
			} g("span");
			{ e("span").a("class", " questionPkcs12Pre1Span07 questionPkcs12Pre1Span odd ").f();
				sx(questionPkcs12Pre1Span071);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionPkcs12Ol1 questionPkcs12Ol odd ").f();
			{ e("li").a("class", " questionPkcs12Ol1Li01 questionPkcs12Ol1Li odd ").f();
				{ e("dt").a("class", " questionPkcs12Ol1Li01Dt ").f();
					sx(questionPkcs12Ol1Li01Dt1);
				} g("dt");
				{ e("dd").a("class", " questionPkcs12Ol1Li01Dd ").f();
					sx(questionPkcs12Ol1Li01Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionPkcs12Ol1Li02 questionPkcs12Ol1Li even ").f();
				{ e("dt").a("class", " questionPkcs12Ol1Li02Dt ").f();
					sx(questionPkcs12Ol1Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionPkcs12Ol1Li02Dd ").f();
					sx(questionPkcs12Ol1Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionPkcs12Ol1Li03 questionPkcs12Ol1Li odd ").f();
				{ e("dt").a("class", " questionPkcs12Ol1Li03Dt ").f();
					sx(questionPkcs12Ol1Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionPkcs12Ol1Li03Dd ").f();
					sx(questionPkcs12Ol1Li03Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionPkcs12Ol1Li04 questionPkcs12Ol1Li even ").f();
				{ e("dt").a("class", " questionPkcs12Ol1Li04Dt ").f();
					{ e("span").a("class", " questionPkcs12Ol1Li04DtSpan1 questionPkcs12Ol1Li odd ").f();
						sx(questionPkcs12Ol1Li04DtSpan11);
					} g("span");
					{ e("span").a("class", " questionPkcs12Ol1Li04DtSpan2 questionPkcs12Ol1Li even ").f();
						sx(utilisateurId == null ? questionPkcs12Ol1Li04DtSpan21 : utilisateurSiteNomDomaine);
					} g("span");
				} g("dt");
				{ e("dd").a("class", " questionPkcs12Ol1Li04Dd ").f();
					sx(questionPkcs12Ol1Li04Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionPkcs12Ol1Li05 questionPkcs12Ol1Li odd ").f();
				{ e("dt").a("class", " questionPkcs12Ol1Li05Dt ").f();
					sx(questionPkcs12Ol1Li05Dt1);
				} g("dt");
				{ e("dd").a("class", " questionPkcs12Ol1Li05Dd ").f();
					sx(questionPkcs12Ol1Li05Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionPkcs12Ol1Li06 questionPkcs12Ol1Li even ").f();
				{ e("dt").a("class", " questionPkcs12Ol1Li06Dt ").f();
					sx(questionPkcs12Ol1Li06Dt1);
				} g("dt");
				{ e("dd").a("class", " questionPkcs12Ol1Li06Dd ").f();
					sx(questionPkcs12Ol1Li06Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionPkcs12Ol1Li07 questionPkcs12Ol1Li odd ").f();
				{ e("dt").a("class", " questionPkcs12Ol1Li07Dt ").f();
					sx(questionPkcs12Ol1Li07Dt1);
				} g("dt");
				{ e("dd").a("class", " questionPkcs12Ol1Li07Dd ").f();
					sx(questionPkcs12Ol1Li07Dd1);
				} g("dd");
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionPkcs12() {
		questionPkcs12.htmlAvant();
		htmlBodyQuestionPkcs12(questionPkcs12);
		questionPkcs12.htmlApres();
	}

	//////////////////////
	// questionKeystore //
	//////////////////////

	public static final String questionKeystoreH3I1 = "far fa-store";
	public static final String questionKeystoreH3I = questionKeystoreH3I1;
	public static final String questionKeystoreH3Span1 = "How do I create a Java keystore for certificate chains in Java applications? ";
	public static final String questionKeystoreH3Span = questionKeystoreH3Span1;
	public static final String questionKeystoreH4I1 = "far fa-terminal";
	public static final String questionKeystoreH4I = questionKeystoreH4I1;
	public static final String questionKeystoreH4Span1 = "Use the keytool command to create a .jks file. ";
	public static final String questionKeystoreH4Span = questionKeystoreH4Span1;
	public static final String questionKeystorePre1Span011 = "keytool";
	public static final String questionKeystorePre1Span01 = questionKeystorePre1Span011;
	public static final String questionKeystorePre1Span021 = " -importkeystore";
	public static final String questionKeystorePre1Span02 = questionKeystorePre1Span021;
	public static final String questionKeystorePre1Span031 = " -srcstoretype pkcs12";
	public static final String questionKeystorePre1Span03 = questionKeystorePre1Span031;
	public static final String questionKeystorePre1Span041 = " -srckeystore /srv/certbot/server.p12";
	public static final String questionKeystorePre1Span04 = questionKeystorePre1Span041;
	public static final String questionKeystorePre1Span051 = " -destkeystore /srv/certbot/server.jks";
	public static final String questionKeystorePre1Span05 = questionKeystorePre1Span051;
	public static final String questionKeystoreOl1Li01Dt1 = "keytool";
	public static final String questionKeystoreOl1Li01Dt = questionKeystoreOl1Li01Dt1;
	public static final String questionKeystoreOl1Li01Dd1 = ": A Java application that manages a keystore of cryptographic keys, certificate chains, and trusted certificates. ";
	public static final String questionKeystoreOl1Li01Dd = questionKeystoreOl1Li01Dd1;
	public static final String questionKeystoreOl1Li02Dt1 = "-importkeystore";
	public static final String questionKeystoreOl1Li02Dt = questionKeystoreOl1Li02Dt1;
	public static final String questionKeystoreOl1Li02Dd1 = ": Imports entries from a source keystore to a destination keystore. ";
	public static final String questionKeystoreOl1Li02Dd = questionKeystoreOl1Li02Dd1;
	public static final String questionKeystoreOl1Li03Dt1 = "-srcstoretype pkcs12";
	public static final String questionKeystoreOl1Li03Dt = questionKeystoreOl1Li03Dt1;
	public static final String questionKeystoreOl1Li03Dd1 = ": The type of source keystore, which is pkcs12. ";
	public static final String questionKeystoreOl1Li03Dd = questionKeystoreOl1Li03Dd1;
	public static final String questionKeystoreOl1Li04Dt1 = "-srckeystore /srv/certbot/server.p12";
	public static final String questionKeystoreOl1Li04Dt = questionKeystoreOl1Li04Dt1;
	public static final String questionKeystoreOl1Li04Dd1 = ": The path to the .p12 chain of trust file. ";
	public static final String questionKeystoreOl1Li04Dd = questionKeystoreOl1Li04Dd1;
	public static final String questionKeystoreOl1Li05Dt1 = "-destkeystore /srv/certbot/server.jks";
	public static final String questionKeystoreOl1Li05Dt = questionKeystoreOl1Li05Dt1;
	public static final String questionKeystoreOl1Li05Dd1 = ": The path to the new .jks Java keystore. ";
	public static final String questionKeystoreOl1Li05Dd = questionKeystoreOl1Li05Dd1;

	/**	L'entité « questionKeystore »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionKeystore = new PageHtml();
	public Couverture<PageHtml> questionKeystoreCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionKeystore").o(questionKeystore);

	/**	<br/>L'entité « questionKeystore »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionKeystore">Trouver l'entité questionKeystore dans Solr</a>
	 * <br/>
	 * @param questionKeystore est l'entité déjà construit. 
	 **/
	protected abstract void _questionKeystore(PageHtml o);

	public PageHtml getQuestionKeystore() {
		return questionKeystore;
	}

	public void setQuestionKeystore(PageHtml questionKeystore) {
		this.questionKeystore = questionKeystore;
		this.questionKeystoreCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionKeystoreInit() {
		if(questionKeystore != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionKeystore, "questionKeystore");
			((C001L008CreerCertificat)this).avantPagePart(questionKeystore, "questionKeystore");
		}
		if(!questionKeystoreCouverture.dejaInitialise) {
			_questionKeystore(questionKeystore);
		}
		questionKeystore.initLoinPourClasse(requeteSite_);
		questionKeystoreCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionKeystore(PageHtml o) {
		{ e("h3").a("class", " questionKeystoreH3 ").f();
			{ e("i").a("class", questionKeystoreH3I1, " site-menu-icon questionKeystoreH3I ").f();
			} g("i");
			{ e("span").a("class", " questionKeystoreH3Span ").f();
				sx(questionKeystoreH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionKeystoreH4 ").f();
			{ e("i").a("class", questionKeystoreH4I1, " site-menu-icon questionKeystoreH4I ").f();
			} g("i");
			{ e("span").a("class", " questionKeystoreH4Span ").f();
				sx(questionKeystoreH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionKeystorePre1 questionKeystorePre odd ").f();
			{ e("span").a("class", " questionKeystorePre1Span01 questionKeystorePre1Span odd ").f();
				sx(questionKeystorePre1Span011);
			} g("span");
			{ e("span").a("class", " questionKeystorePre1Span02 questionKeystorePre1Span even ").f();
				sx(questionKeystorePre1Span021);
			} g("span");
			{ e("span").a("class", " questionKeystorePre1Span03 questionKeystorePre1Span odd ").f();
				sx(questionKeystorePre1Span031);
			} g("span");
			{ e("span").a("class", " questionKeystorePre1Span04 questionKeystorePre1Span even ").f();
				sx(questionKeystorePre1Span041);
			} g("span");
			{ e("span").a("class", " questionKeystorePre1Span05 questionKeystorePre1Span odd ").f();
				sx(questionKeystorePre1Span051);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionKeystoreOl1 questionKeystoreOl odd ").f();
			{ e("li").a("class", " questionKeystoreOl1Li01 questionKeystoreOl1Li odd ").f();
				{ e("dt").a("class", " questionKeystoreOl1Li01Dt ").f();
					sx(questionKeystoreOl1Li01Dt1);
				} g("dt");
				{ e("dd").a("class", " questionKeystoreOl1Li01Dd ").f();
					sx(questionKeystoreOl1Li01Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionKeystoreOl1Li02 questionKeystoreOl1Li even ").f();
				{ e("dt").a("class", " questionKeystoreOl1Li02Dt ").f();
					sx(questionKeystoreOl1Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionKeystoreOl1Li02Dd ").f();
					sx(questionKeystoreOl1Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionKeystoreOl1Li03 questionKeystoreOl1Li odd ").f();
				{ e("dt").a("class", " questionKeystoreOl1Li03Dt ").f();
					sx(questionKeystoreOl1Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionKeystoreOl1Li03Dd ").f();
					sx(questionKeystoreOl1Li03Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionKeystoreOl1Li04 questionKeystoreOl1Li even ").f();
				{ e("dt").a("class", " questionKeystoreOl1Li04Dt ").f();
					sx(questionKeystoreOl1Li04Dt1);
				} g("dt");
				{ e("dd").a("class", " questionKeystoreOl1Li04Dd ").f();
					sx(questionKeystoreOl1Li04Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionKeystoreOl1Li05 questionKeystoreOl1Li odd ").f();
				{ e("dt").a("class", " questionKeystoreOl1Li05Dt ").f();
					sx(questionKeystoreOl1Li05Dt1);
				} g("dt");
				{ e("dd").a("class", " questionKeystoreOl1Li05Dd ").f();
					sx(questionKeystoreOl1Li05Dd1);
				} g("dd");
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionKeystore() {
		questionKeystore.htmlAvant();
		htmlBodyQuestionKeystore(questionKeystore);
		questionKeystore.htmlApres();
	}

	///////////////////////
	// questionGenSecKey //
	///////////////////////

	public static final String questionGenSecKeyH3I1 = "far fa-key";
	public static final String questionGenSecKeyH3I = questionGenSecKeyH3I1;
	public static final String questionGenSecKeyH3Span1 = "How do I create a Java keystore for my secret key in Java applications? ";
	public static final String questionGenSecKeyH3Span = questionGenSecKeyH3Span1;
	public static final String questionGenSecKeyH4I1 = "far fa-terminal";
	public static final String questionGenSecKeyH4I = questionGenSecKeyH4I1;
	public static final String questionGenSecKeyH4Span1 = "Use the keytool command to create a .jceks file. ";
	public static final String questionGenSecKeyH4Span = questionGenSecKeyH4Span1;
	public static final String questionGenSecKeyPre1Span011 = "keytool";
	public static final String questionGenSecKeyPre1Span01 = questionGenSecKeyPre1Span011;
	public static final String questionGenSecKeyPre1Span021 = " -genseckey";
	public static final String questionGenSecKeyPre1Span02 = questionGenSecKeyPre1Span021;
	public static final String questionGenSecKeyPre1Span031 = " -storetype JCEKS";
	public static final String questionGenSecKeyPre1Span03 = questionGenSecKeyPre1Span031;
	public static final String questionGenSecKeyPre1Span04Span11 = " -alias ";
	public static final String questionGenSecKeyPre1Span04Span1 = questionGenSecKeyPre1Span04Span11;
	public static final String questionGenSecKeyPre1Span04Span21 = "example.com";
	public static final String questionGenSecKeyPre1Span04Span2 = questionGenSecKeyPre1Span04Span21;
	public static final String questionGenSecKeyPre1Span051 = " -keystore /srv/certbot/server.jceks";
	public static final String questionGenSecKeyPre1Span05 = questionGenSecKeyPre1Span051;
	public static final String questionGenSecKeyOl1Li01Dt1 = "keytool";
	public static final String questionGenSecKeyOl1Li01Dt = questionGenSecKeyOl1Li01Dt1;
	public static final String questionGenSecKeyOl1Li02Dt1 = "-genseckey";
	public static final String questionGenSecKeyOl1Li02Dt = questionGenSecKeyOl1Li02Dt1;
	public static final String questionGenSecKeyOl1Li02Dd1 = ": Generates a secret key and stores it in a new secret key entry keystore identified by the alias. ";
	public static final String questionGenSecKeyOl1Li02Dd = questionGenSecKeyOl1Li02Dd1;
	public static final String questionGenSecKeyOl1Li03Dt1 = "-storetype JCEKS";
	public static final String questionGenSecKeyOl1Li03Dt = questionGenSecKeyOl1Li03Dt1;
	public static final String questionGenSecKeyOl1Li03Dd1 = ": The type of keystore for storing keys to prevent your encryption keys from being exposed. ";
	public static final String questionGenSecKeyOl1Li03Dd = questionGenSecKeyOl1Li03Dd1;
	public static final String questionGenSecKeyOl1Li04DtSpan11 = "-alias ";
	public static final String questionGenSecKeyOl1Li04DtSpan1 = questionGenSecKeyOl1Li04DtSpan11;
	public static final String questionGenSecKeyOl1Li04DtSpan21 = "example.com";
	public static final String questionGenSecKeyOl1Li04DtSpan2 = questionGenSecKeyOl1Li04DtSpan21;
	public static final String questionGenSecKeyOl1Li04Dd1 = ": This specifies the alias, or friendly name, for the certificate and private key. ";
	public static final String questionGenSecKeyOl1Li04Dd = questionGenSecKeyOl1Li04Dd1;
	public static final String questionGenSecKeyOl1Li05Dt1 = "-keystore /srv/certbot/server.jceks";
	public static final String questionGenSecKeyOl1Li05Dt = questionGenSecKeyOl1Li05Dt1;
	public static final String questionGenSecKeyOl1Li05Dd1 = ": The path to the new .jks Java keystore. ";
	public static final String questionGenSecKeyOl1Li05Dd = questionGenSecKeyOl1Li05Dd1;

	/**	L'entité « questionGenSecKey »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionGenSecKey = new PageHtml();
	public Couverture<PageHtml> questionGenSecKeyCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionGenSecKey").o(questionGenSecKey);

	/**	<br/>L'entité « questionGenSecKey »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionGenSecKey">Trouver l'entité questionGenSecKey dans Solr</a>
	 * <br/>
	 * @param questionGenSecKey est l'entité déjà construit. 
	 **/
	protected abstract void _questionGenSecKey(PageHtml o);

	public PageHtml getQuestionGenSecKey() {
		return questionGenSecKey;
	}

	public void setQuestionGenSecKey(PageHtml questionGenSecKey) {
		this.questionGenSecKey = questionGenSecKey;
		this.questionGenSecKeyCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionGenSecKeyInit() {
		if(questionGenSecKey != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionGenSecKey, "questionGenSecKey");
			((C001L008CreerCertificat)this).avantPagePart(questionGenSecKey, "questionGenSecKey");
		}
		if(!questionGenSecKeyCouverture.dejaInitialise) {
			_questionGenSecKey(questionGenSecKey);
		}
		questionGenSecKey.initLoinPourClasse(requeteSite_);
		questionGenSecKeyCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionGenSecKey(PageHtml o) {
		{ e("h3").a("class", " questionGenSecKeyH3 ").f();
			{ e("i").a("class", questionGenSecKeyH3I1, " site-menu-icon questionGenSecKeyH3I ").f();
			} g("i");
			{ e("span").a("class", " questionGenSecKeyH3Span ").f();
				sx(questionGenSecKeyH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionGenSecKeyH4 ").f();
			{ e("i").a("class", questionGenSecKeyH4I1, " site-menu-icon questionGenSecKeyH4I ").f();
			} g("i");
			{ e("span").a("class", " questionGenSecKeyH4Span ").f();
				sx(questionGenSecKeyH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionGenSecKeyPre1 questionGenSecKeyPre odd ").f();
			{ e("span").a("class", " questionGenSecKeyPre1Span01 questionGenSecKeyPre1Span odd ").f();
				sx(questionGenSecKeyPre1Span011);
			} g("span");
			{ e("span").a("class", " questionGenSecKeyPre1Span02 questionGenSecKeyPre1Span even ").f();
				sx(questionGenSecKeyPre1Span021);
			} g("span");
			{ e("span").a("class", " questionGenSecKeyPre1Span03 questionGenSecKeyPre1Span odd ").f();
				sx(questionGenSecKeyPre1Span031);
			} g("span");
			{ e("span").a("class", " questionGenSecKeyPre1Span04 questionGenSecKeyPre1Span even ").f();
				{ e("span").a("class", " questionGenSecKeyPre1Span04Span1 questionGenSecKeyPre1Span odd ").f();
					sx(questionGenSecKeyPre1Span04Span11);
				} g("span");
				{ e("span").a("class", " questionGenSecKeyPre1Span04Span2 questionGenSecKeyPre1Span even ").f();
					sx(utilisateurId == null ? questionGenSecKeyPre1Span04Span21 : utilisateurSiteNomDomaine);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionGenSecKeyPre1Span05 questionGenSecKeyPre1Span odd ").f();
				sx(questionGenSecKeyPre1Span051);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionGenSecKeyOl1 questionGenSecKeyOl odd ").f();
			{ e("li").a("class", " questionGenSecKeyOl1Li01 questionGenSecKeyOl1Li odd ").f();
				{ e("dt").a("class", " questionGenSecKeyOl1Li01Dt ").f();
					sx(questionGenSecKeyOl1Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionGenSecKeyOl1Li02 questionGenSecKeyOl1Li even ").f();
				{ e("dt").a("class", " questionGenSecKeyOl1Li02Dt ").f();
					sx(questionGenSecKeyOl1Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionGenSecKeyOl1Li02Dd ").f();
					sx(questionGenSecKeyOl1Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionGenSecKeyOl1Li03 questionGenSecKeyOl1Li odd ").f();
				{ e("dt").a("class", " questionGenSecKeyOl1Li03Dt ").f();
					sx(questionGenSecKeyOl1Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionGenSecKeyOl1Li03Dd ").f();
					sx(questionGenSecKeyOl1Li03Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionGenSecKeyOl1Li04 questionGenSecKeyOl1Li even ").f();
				{ e("dt").a("class", " questionGenSecKeyOl1Li04Dt ").f();
					{ e("span").a("class", " questionGenSecKeyOl1Li04DtSpan1 questionGenSecKeyOl1Li odd ").f();
						sx(questionGenSecKeyOl1Li04DtSpan11);
					} g("span");
					{ e("span").a("class", " questionGenSecKeyOl1Li04DtSpan2 questionGenSecKeyOl1Li even ").f();
						sx(utilisateurId == null ? questionGenSecKeyOl1Li04DtSpan21 : utilisateurSiteNomDomaine);
					} g("span");
				} g("dt");
				{ e("dd").a("class", " questionGenSecKeyOl1Li04Dd ").f();
					sx(questionGenSecKeyOl1Li04Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionGenSecKeyOl1Li05 questionGenSecKeyOl1Li odd ").f();
				{ e("dt").a("class", " questionGenSecKeyOl1Li05Dt ").f();
					sx(questionGenSecKeyOl1Li05Dt1);
				} g("dt");
				{ e("dd").a("class", " questionGenSecKeyOl1Li05Dd ").f();
					sx(questionGenSecKeyOl1Li05Dd1);
				} g("dd");
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionGenSecKey() {
		questionGenSecKey.htmlAvant();
		htmlBodyQuestionGenSecKey(questionGenSecKey);
		questionGenSecKey.htmlApres();
	}

	/////////
	// fin //
	/////////

	public static final String finP1 = "Congratulations, now you are all set to use your new certificate, keys and keystores in your applications. ";
	public static final String finP2 = "You will be able to secure your applications with https and TLS locally and on the OpenShift cloud. ";
	public static final String finP3 = "You can sign your Java code to deploy it confidently. ";
	public static final String finP4 = "You can install a Single Sign On server to manage user authentication and authorization in your applications. ";
	public static final String finP = finP1 + finP2 + finP3 + finP4;

	/**	L'entité « fin »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml fin = new PageHtml();
	public Couverture<PageHtml> finCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("fin").o(fin);

	/**	<br/>L'entité « fin »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:fin">Trouver l'entité fin dans Solr</a>
	 * <br/>
	 * @param fin est l'entité déjà construit. 
	 **/
	protected abstract void _fin(PageHtml o);

	public PageHtml getFin() {
		return fin;
	}

	public void setFin(PageHtml fin) {
		this.fin = fin;
		this.finCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat finInit() {
		if(fin != null) {
			((C001L008CreerCertificat)this).avantPagePart(fin, "fin");
			((C001L008CreerCertificat)this).avantPagePart(fin, "fin");
		}
		if(!finCouverture.dejaInitialise) {
			_fin(fin);
		}
		fin.initLoinPourClasse(requeteSite_);
		finCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyFin(PageHtml o) {
		{ e("p").a("class", " finP ").f();
			sx(finP1);
			sx(finP2);
			sx(finP3);
			sx(finP4);
		} g("p");
	}
	public void htmlBodyFin() {
		fin.htmlAvant();
		htmlBodyFin(fin);
		fin.htmlApres();
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

	public static final String recapituler2TableTr1Td11 = "Friday ";
	public static final String recapituler2TableTr1Td1 = recapituler2TableTr1Td11;
	public static final String recapituler2TableTr1Td2I1 = "far fa-fast-forward";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "far fa-file-code";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "far fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "May 24 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "What can I do once I have purchased a domain name? ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "Obtain a valid TLS certificate for free, for security and credibility. ";
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
	public static final String recapituler3TableTr02Td21 = "How do I install the dependencies for certbot? ";
	public static final String recapituler3TableTr02Td2 = recapituler3TableTr02Td21;
	public static final String recapituler3TableTr02Td3Span1I1 = "far fa-cookie";
	public static final String recapituler3TableTr02Td3Span1I = recapituler3TableTr02Td3Span1I1;
	public static final String recapituler3TableTr02Td41 = "Build the dependencies with yum. ";
	public static final String recapituler3TableTr02Td4 = recapituler3TableTr02Td41;
	public static final String recapituler3TableTr03Td1I1 = "far fa-files-medical";
	public static final String recapituler3TableTr03Td1I = recapituler3TableTr03Td1I1;
	public static final String recapituler3TableTr03Td21 = "Where do I put the certificates, keys and keystores for my site? ";
	public static final String recapituler3TableTr03Td2 = recapituler3TableTr03Td21;
	public static final String recapituler3TableTr03Td3I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr03Td3I = recapituler3TableTr03Td3I1;
	public static final String recapituler3TableTr03Td41 = "Create a certbot directory in /srv. ";
	public static final String recapituler3TableTr03Td4 = recapituler3TableTr03Td41;
	public static final String recapituler3TableTr04Td1I1 = "far fa-file-certificate";
	public static final String recapituler3TableTr04Td1I = recapituler3TableTr04Td1I1;
	public static final String recapituler3TableTr04Td21 = "How do I obtain my certificate? ";
	public static final String recapituler3TableTr04Td2 = recapituler3TableTr04Td21;
	public static final String recapituler3TableTr04Td3Span1I1 = "far fa-stamp";
	public static final String recapituler3TableTr04Td3Span1I = recapituler3TableTr04Td3Span1I1;
	public static final String recapituler3TableTr04Td41 = "Use the certbot command. ";
	public static final String recapituler3TableTr04Td4 = recapituler3TableTr04Td41;
	public static final String recapituler3TableTr05Td1I1 = "far fa-key";
	public static final String recapituler3TableTr05Td1I = recapituler3TableTr05Td1I1;
	public static final String recapituler3TableTr05Td21 = "How do I use the certificate and key that certbot generated? ";
	public static final String recapituler3TableTr05Td2 = recapituler3TableTr05Td21;
	public static final String recapituler3TableTr05Td3I1 = "far fa-copy";
	public static final String recapituler3TableTr05Td3I = recapituler3TableTr05Td3I1;
	public static final String recapituler3TableTr05Td41 = "Copy the certbot files with the install command. ";
	public static final String recapituler3TableTr05Td4 = recapituler3TableTr05Td41;
	public static final String recapituler3TableTr06Td1I1 = "far fa-users-crown";
	public static final String recapituler3TableTr06Td1I = recapituler3TableTr06Td1I1;
	public static final String recapituler3TableTr06Td21 = "How do I obtain the letsencrypt root and CA certificates? ";
	public static final String recapituler3TableTr06Td2 = recapituler3TableTr06Td21;
	public static final String recapituler3TableTr06Td3I1 = "far fa-copy";
	public static final String recapituler3TableTr06Td3I = recapituler3TableTr06Td3I1;
	public static final String recapituler3TableTr06Td41 = "Download the root and CA certificates with the curl command. ";
	public static final String recapituler3TableTr06Td4 = recapituler3TableTr06Td41;
	public static final String recapituler3TableTr07Td1I1 = "far fa-object-group";
	public static final String recapituler3TableTr07Td1I = recapituler3TableTr07Td1I1;
	public static final String recapituler3TableTr07Td21 = "How do I create a merged version of site certificates, certificate authority and root certificate? ";
	public static final String recapituler3TableTr07Td2 = recapituler3TableTr07Td21;
	public static final String recapituler3TableTr07Td3I1 = "far fa-cat";
	public static final String recapituler3TableTr07Td3I = recapituler3TableTr07Td3I1;
	public static final String recapituler3TableTr07Td41 = "Create a merged certificate with the cat command. ";
	public static final String recapituler3TableTr07Td4 = recapituler3TableTr07Td41;
	public static final String recapituler3TableTr08Td1I1 = "far fa-file-certificate";
	public static final String recapituler3TableTr08Td1I = recapituler3TableTr08Td1I1;
	public static final String recapituler3TableTr08Td21 = "How do I create a pkcs12 certificate chain of trust? ";
	public static final String recapituler3TableTr08Td2 = recapituler3TableTr08Td21;
	public static final String recapituler3TableTr08Td3I1 = "far fa-shield-alt";
	public static final String recapituler3TableTr08Td3I = recapituler3TableTr08Td3I1;
	public static final String recapituler3TableTr08Td41 = "Use the openssl command to create a .p12 file. ";
	public static final String recapituler3TableTr08Td4 = recapituler3TableTr08Td41;
	public static final String recapituler3TableTr09Td1I1 = "far fa-store";
	public static final String recapituler3TableTr09Td1I = recapituler3TableTr09Td1I1;
	public static final String recapituler3TableTr09Td21 = "How do I create a Java keystore for certificate chains in Java applications? ";
	public static final String recapituler3TableTr09Td2 = recapituler3TableTr09Td21;
	public static final String recapituler3TableTr09Td3I1 = "far fa-terminal";
	public static final String recapituler3TableTr09Td3I = recapituler3TableTr09Td3I1;
	public static final String recapituler3TableTr09Td41 = "Use the keytool command to create a .jks file. ";
	public static final String recapituler3TableTr09Td4 = recapituler3TableTr09Td41;
	public static final String recapituler3TableTr10Td1I1 = "far fa-key";
	public static final String recapituler3TableTr10Td1I = recapituler3TableTr10Td1I1;
	public static final String recapituler3TableTr10Td21 = "How do I create a Java keystore for my secret key in Java applications? ";
	public static final String recapituler3TableTr10Td2 = recapituler3TableTr10Td21;
	public static final String recapituler3TableTr10Td3I1 = "far fa-terminal";
	public static final String recapituler3TableTr10Td3I = recapituler3TableTr10Td3I1;
	public static final String recapituler3TableTr10Td41 = "Use the keytool command to create a .jceks file. ";
	public static final String recapituler3TableTr10Td4 = recapituler3TableTr10Td41;

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
		personnaliserInit();
		questionDependencesInit();
		questionMkdirSrvInit();
		questionCertbotInit();
		questionCopierInit();
		questionRacineCaInit();
		questionCertificatsFusionnesInit();
		questionPkcs12Init();
		questionKeystoreInit();
		questionGenSecKeyInit();
		finInit();
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
		if(personnaliser != null)
			personnaliser.setRequeteSite_(requeteSite_);
		if(questionDependences != null)
			questionDependences.setRequeteSite_(requeteSite_);
		if(questionMkdirSrv != null)
			questionMkdirSrv.setRequeteSite_(requeteSite_);
		if(questionCertbot != null)
			questionCertbot.setRequeteSite_(requeteSite_);
		if(questionCopier != null)
			questionCopier.setRequeteSite_(requeteSite_);
		if(questionRacineCa != null)
			questionRacineCa.setRequeteSite_(requeteSite_);
		if(questionCertificatsFusionnes != null)
			questionCertificatsFusionnes.setRequeteSite_(requeteSite_);
		if(questionPkcs12 != null)
			questionPkcs12.setRequeteSite_(requeteSite_);
		if(questionKeystore != null)
			questionKeystore.setRequeteSite_(requeteSite_);
		if(questionGenSecKey != null)
			questionGenSecKey.setRequeteSite_(requeteSite_);
		if(fin != null)
			fin.setRequeteSite_(requeteSite_);
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
			case "personnaliser":
				return oC001L008CreerCertificat.personnaliser;
			case "questionDependences":
				return oC001L008CreerCertificat.questionDependences;
			case "questionMkdirSrv":
				return oC001L008CreerCertificat.questionMkdirSrv;
			case "questionCertbot":
				return oC001L008CreerCertificat.questionCertbot;
			case "questionCopier":
				return oC001L008CreerCertificat.questionCopier;
			case "questionRacineCa":
				return oC001L008CreerCertificat.questionRacineCa;
			case "questionCertificatsFusionnes":
				return oC001L008CreerCertificat.questionCertificatsFusionnes;
			case "questionPkcs12":
				return oC001L008CreerCertificat.questionPkcs12;
			case "questionKeystore":
				return oC001L008CreerCertificat.questionKeystore;
			case "questionGenSecKey":
				return oC001L008CreerCertificat.questionGenSecKey;
			case "fin":
				return oC001L008CreerCertificat.fin;
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
		if(personnaliser != null)
			personnaliser.htmlBodyCourt();
		if(questionDependences != null)
			questionDependences.htmlBodyCourt();
		if(questionMkdirSrv != null)
			questionMkdirSrv.htmlBodyCourt();
		if(questionCertbot != null)
			questionCertbot.htmlBodyCourt();
		if(questionCopier != null)
			questionCopier.htmlBodyCourt();
		if(questionRacineCa != null)
			questionRacineCa.htmlBodyCourt();
		if(questionCertificatsFusionnes != null)
			questionCertificatsFusionnes.htmlBodyCourt();
		if(questionPkcs12 != null)
			questionPkcs12.htmlBodyCourt();
		if(questionKeystore != null)
			questionKeystore.htmlBodyCourt();
		if(questionGenSecKey != null)
			questionGenSecKey.htmlBodyCourt();
		if(fin != null)
			fin.htmlBodyCourt();
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
		((C001L008CreerCertificat)this).htmlBodyPersonnaliser();
		((C001L008CreerCertificat)this).htmlBodyQuestionDependences();
		((C001L008CreerCertificat)this).htmlBodyQuestionMkdirSrv();
		((C001L008CreerCertificat)this).htmlBodyQuestionCertbot();
		((C001L008CreerCertificat)this).htmlBodyQuestionCopier();
		((C001L008CreerCertificat)this).htmlBodyQuestionRacineCa();
		((C001L008CreerCertificat)this).htmlBodyQuestionCertificatsFusionnes();
		((C001L008CreerCertificat)this).htmlBodyQuestionPkcs12();
		((C001L008CreerCertificat)this).htmlBodyQuestionKeystore();
		((C001L008CreerCertificat)this).htmlBodyQuestionGenSecKey();
		((C001L008CreerCertificat)this).htmlBodyFin();
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

	public static final String[] C001L008CreerCertificatVals = new String[] { moiP1, moiP2, moiP3, moiP4, moiP5, moiP6, moiP7, moiP8, questionDependencesH3I1, questionDependencesH3Span1, questionDependencesH4I1, questionDependencesH4Span1, questionDependencesPre1Span11, questionDependencesPre1Span21, questionDependencesPre1Span31, questionDependencesPre1Span41, questionDependencesPre1Span51, questionDependencesOl2Li1Dt1, questionDependencesOl2Li1Dd1, questionDependencesOl2Li1Dd2, questionDependencesOl2Li1Dd3, questionDependencesOl2Li2Dt1, questionDependencesOl2Li2Dd1, questionDependencesOl2Li2Dd2, questionDependencesOl2Li3Dt1, questionDependencesOl2Li3Dd1, questionDependencesOl2Li4Dt1, questionDependencesOl2Li4Dd1, questionDependencesOl2Li5Dt1, questionDependencesOl2Li5Dd1, questionDependencesPre3Span11, questionDependencesPre3Span21, questionDependencesPre3Span31, questionDependencesPre3Span41, questionDependencesPre3Span51, questionDependencesOl4Li1Dt1, questionDependencesOl4Li2Dt1, questionDependencesOl4Li3Dt1, questionDependencesOl4Li4Dt1, questionDependencesOl4Li5Dt1, questionDependencesOl4Li5Dd1, questionMkdirSrvH3I1, questionMkdirSrvH3Span1, questionMkdirSrvH4I1, questionMkdirSrvH4Span1, questionMkdirSrvPreSpan011, questionMkdirSrvPreSpan021, questionMkdirSrvPreSpan031, questionMkdirSrvPreSpan041, questionMkdirSrvPreSpan051, questionMkdirSrvPreSpan061, questionMkdirSrvPreSpan071, questionMkdirSrvPreSpan081, questionMkdirSrvPreSpan091, questionMkdirSrvPreSpan101, questionMkdirSrvOl2Li01Dt1, questionMkdirSrvOl2Li02Dt1, questionMkdirSrvOl2Li02Dd1, questionMkdirSrvOl2Li03Dt1, questionMkdirSrvOl2Li03Dd1, questionMkdirSrvOl2Li04Dt1, questionMkdirSrvOl2Li04Dd1, questionMkdirSrvOl2Li05Dt1, questionMkdirSrvOl2Li05Dd1, questionMkdirSrvOl2Li06Dt1, questionMkdirSrvOl2Li06Dd1, questionMkdirSrvOl2Li07Dt1, questionMkdirSrvOl2Li07Dd1, questionMkdirSrvOl2Li08Dt1, questionMkdirSrvOl2Li08Dd1, questionMkdirSrvOl2Li09Dt1, questionMkdirSrvOl2Li09Dd1, questionMkdirSrvOl2Li10Dt1, questionMkdirSrvOl2Li10Dd1, questionCertbotH3I1, questionCertbotH3Span1, questionCertbotH4I1, questionCertbotH4Span1, questionCertbotPreSpan011, questionCertbotPreSpan021, questionCertbotPreSpan031, questionCertbotPreSpan041, questionCertbotPreSpan051, questionCertbotPreSpan061, questionCertbotPreSpan07Span11, questionCertbotPreSpan07Span21, questionCertbotPreSpan08Span11, questionCertbotPreSpan08Span21, questionCertbotPreSpan09Span11, questionCertbotPreSpan09Span21, questionCertbotOl2Li01Dt1, questionCertbotOl2Li02Dt1, questionCertbotOl2Li02Dd1, questionCertbotOl2Li03Dt1, questionCertbotOl2Li03Dd1, questionCertbotOl2Li04Dt1, questionCertbotOl2Li04Dd1, questionCertbotOl2Li05Dt1, questionCertbotOl2Li05Dd1, questionCertbotOl2Li06Dt1, questionCertbotOl2Li06Dd1, questionCertbotOl2Li07DtSpan11, questionCertbotOl2Li07DtSpan21, questionCertbotOl2Li07DdSpan31, questionCertbotOl2Li08DtSpan11, questionCertbotOl2Li08DtSpan21, questionCertbotOl2Li08DdSpan31, questionCertbotOl2Li09DtSpan11, questionCertbotOl2Li09DtSpan21, questionCertbotOl2Li09DdSpan31, questionCertbotOl2Li09DdSpan32, questionCertbotP21, questionCertbotP22, questionCertbotP23, questionCertbotP24, questionCertbotP25, questionCertbotP3Span11, questionCertbotP3Span12, questionCertbotP3Span13, questionCertbotP3A11, questionCertbotP3Span21, questionCertbotP3Span22, questionCertbotP3Span23, questionCertbotP3Span24, questionCertbotP3Span25, questionCertbotP3Span26, questionCertbotP3Span27, questionCopierH3I1, questionCopierH3Span1, questionCopierH4I1, questionCopierH4Span1, questionCopierPre1Span011, questionCopierPre1Span021, questionCopierPre1Span031, questionCopierPre1Span041, questionCopierPre1Span051, questionCopierPre1Span061, questionCopierPre1Span071, questionCopierPre1Span081, questionCopierPre1Span09Span11, questionCopierPreSpan09Span21, questionCopierPre1Span09Span31, questionCopierPre1Span101, questionCopierOl1Li01Dt1, questionCopierOl1Li02Dt1, questionCopierOl1Li03Dt1, questionCopierOl1Li04Dt1, questionCopierOl1Li05Dt1, questionCopierOl1Li06Dt1, questionCopierOl1Li07Dt1, questionCopierOl1Li08Dt1, questionCopierOl1Li09Dt1, questionCopierOl1Li09Dt2, questionCopierOl1Li09Dt3, questionCopierOl1Li09Dt4, questionCopierOl1Li09Dd1, questionCopierOl1Li10Dt1, questionCopierOl1Li10Dd1, questionCopierPre2Span011, questionCopierPre2Span021, questionCopierPre2Span031, questionCopierPre2Span041, questionCopierPre2Span051, questionCopierPre2Span061, questionCopierPre2Span071, questionCopierPre2Span081, questionCopierPre2Span09Span11, questionCopierPre2Span09Span21, questionCopierPre2Span09Span31, questionCopierPre2Span101, questionCopierOl2Li01Dt1, questionCopierOl2Li02Dt1, questionCopierOl2Li03Dt1, questionCopierOl2Li04Dt1, questionCopierOl2Li05Dt1, questionCopierOl2Li06Dt1, questionCopierOl2Li07Dt1, questionCopierOl2Li08Dt1, questionCopierOl2Li09Dt1, questionCopierOl2Li09Dt2, questionCopierOl2Li09Dt3, questionCopierOl2Li09Dt4, questionCopierOl2Li09Dd1, questionCopierOl2Li10Dt1, questionCopierOl2Li10Dd1, questionRacineCaH3I1, questionRacineCaH3Span1, questionRacineCaH4I1, questionRacineCaH4Span1, questionRacineCaPre1Span011, questionRacineCaPre1Span021, questionRacineCaPre1Span031, questionRacineCaOl1Li01Dt1, questionRacineCaOl1Li01Dd1, questionRacineCaOl1Li02Dt1, questionRacineCaOl1Li02Dd1, questionRacineCaOl1Li03Dt1, questionRacineCaOl1Li03Dd1, questionRacineCaPre2Span011, questionRacineCaPre2Span021, questionRacineCaPre2Span031, questionRacineCaOl2Li01Dt1, questionRacineCaOl2Li02Dt1, questionRacineCaOl2Li02Dd1, questionRacineCaOl2Li03Dt1, questionRacineCaOl2Li03Dd1, questionRacineCaPre3Span011, questionRacineCaPre3Span021, questionRacineCaPre3Span031, questionRacineCaOl3Li01Dt1, questionRacineCaOl3Li02Dt1, questionRacineCaOl3Li02Dd1, questionRacineCaOl3Li03Dt1, questionRacineCaOl3Li03Dd1, questionCertificatsFusionnesH3I1, questionCertificatsFusionnesH3Span1, questionCertificatsFusionnesH4I1, questionCertificatsFusionnesH4Span1, questionCertificatsFusionnesPre1Span011, questionCertificatsFusionnesPre1Span021, questionCertificatsFusionnesPre1Span031, questionCertificatsFusionnesPre1Span041, questionCertificatsFusionnesPre1Span051, questionCertificatsFusionnesPre1Span061, questionCertificatsFusionnesOl1Li01Dt1, questionCertificatsFusionnesOl1Li01Dd1, questionCertificatsFusionnesOl1Li02Dt1, questionCertificatsFusionnesOl1Li02Dd1, questionCertificatsFusionnesOl1Li03Dt1, questionCertificatsFusionnesOl1Li03Dd1, questionCertificatsFusionnesOl1Li04Dt1, questionCertificatsFusionnesOl1Li04Dd1, questionCertificatsFusionnesOl1Li05Dt1, questionCertificatsFusionnesOl1Li05Dd1, questionCertificatsFusionnesOl1Li06Dt1, questionCertificatsFusionnesOl1Li06Dd1, questionPkcs12H3I1, questionPkcs12H3Span1, questionPkcs12H4I1, questionPkcs12H4Span1, questionPkcs12P11, questionPkcs12P12, questionPkcs12Pre1Span011, questionPkcs12Pre1Span021, questionPkcs12Pre1Span031, questionPkcs12Pre1Span04Span11, questionPkcs12Pre1Span04Span21, questionPkcs12Pre1Span051, questionPkcs12Pre1Span061, questionPkcs12Pre1Span071, questionPkcs12Ol1Li01Dt1, questionPkcs12Ol1Li01Dd1, questionPkcs12Ol1Li02Dt1, questionPkcs12Ol1Li02Dd1, questionPkcs12Ol1Li03Dt1, questionPkcs12Ol1Li03Dd1, questionPkcs12Ol1Li04DtSpan11, questionPkcs12Ol1Li04DtSpan21, questionPkcs12Ol1Li04Dd1, questionPkcs12Ol1Li05Dt1, questionPkcs12Ol1Li05Dd1, questionPkcs12Ol1Li06Dt1, questionPkcs12Ol1Li06Dd1, questionPkcs12Ol1Li07Dt1, questionPkcs12Ol1Li07Dd1, questionKeystoreH3I1, questionKeystoreH3Span1, questionKeystoreH4I1, questionKeystoreH4Span1, questionKeystorePre1Span011, questionKeystorePre1Span021, questionKeystorePre1Span031, questionKeystorePre1Span041, questionKeystorePre1Span051, questionKeystoreOl1Li01Dt1, questionKeystoreOl1Li01Dd1, questionKeystoreOl1Li02Dt1, questionKeystoreOl1Li02Dd1, questionKeystoreOl1Li03Dt1, questionKeystoreOl1Li03Dd1, questionKeystoreOl1Li04Dt1, questionKeystoreOl1Li04Dd1, questionKeystoreOl1Li05Dt1, questionKeystoreOl1Li05Dd1, questionGenSecKeyH3I1, questionGenSecKeyH3Span1, questionGenSecKeyH4I1, questionGenSecKeyH4Span1, questionGenSecKeyPre1Span011, questionGenSecKeyPre1Span021, questionGenSecKeyPre1Span031, questionGenSecKeyPre1Span04Span11, questionGenSecKeyPre1Span04Span21, questionGenSecKeyPre1Span051, questionGenSecKeyOl1Li01Dt1, questionGenSecKeyOl1Li02Dt1, questionGenSecKeyOl1Li02Dd1, questionGenSecKeyOl1Li03Dt1, questionGenSecKeyOl1Li03Dd1, questionGenSecKeyOl1Li04DtSpan11, questionGenSecKeyOl1Li04DtSpan21, questionGenSecKeyOl1Li04Dd1, questionGenSecKeyOl1Li05Dt1, questionGenSecKeyOl1Li05Dd1, finP1, finP2, finP3, finP4, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3Span1I1, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41 };
}
