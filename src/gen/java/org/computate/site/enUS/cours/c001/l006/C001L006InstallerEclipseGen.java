package org.computate.site.enUS.cours.c001.l006;

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
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L006InstallerEclipseGen<DEV> extends C001Lecon {

	public static final String C001L006InstallerEclipse_UnNom = "a lesson";
	public static final String C001L006InstallerEclipse_Ce = "this ";
	public static final String C001L006InstallerEclipse_CeNom = "this lesson";
	public static final String C001L006InstallerEclipse_Un = "an ";
	public static final String C001L006InstallerEclipse_LeNom = "the lesson";
	public static final String C001L006InstallerEclipse_NomSingulier = "lesson";
	public static final String C001L006InstallerEclipse_NomPluriel = "lessons";
	public static final String C001L006InstallerEclipse_NomActuel = "current lesson";
	public static final String C001L006InstallerEclipse_TousNom = "the lessons";
	public static final String C001L006InstallerEclipse_RechercherTousNomPar = "search lessons by ";
	public static final String C001L006InstallerEclipse_H1 = "How do I install development tools to develop my website? ";
	public static final String C001L006InstallerEclipse_H2 = "How to install Eclipse IDE the open source way. ";
	public static final String C001L006InstallerEclipse_Titre = "How do I install development tools to develop my website? How to install Eclipse IDE the open source way. ";
	public static final String C001L006InstallerEclipse_LesNoms = "the lessons";
	public static final String C001L006InstallerEclipse_AucunNomTrouve = "no lesson found";
	public static final String C001L006InstallerEclipse_NomVar = "lesson";
	public static final String C001L006InstallerEclipse_DeNom = "of lesson";
	public static final String C001L006InstallerEclipse_Couleur = "green";
	public static final String C001L006InstallerEclipse_IconeGroupe = "regular";
	public static final String C001L006InstallerEclipse_IconeNom = "question";
	public static final String C001L006InstallerEclipseFrFRPage_Uri = "/frFR/cours/001/006-comment-installer-eclipse";
	public static final String C001L006InstallerEclipseFrFRPage_ImageUri = "/png/frFR/cours/001/006-comment-installer-eclipse-999.png";
	public static final String C001L006InstallerEclipseEnUSPage_Uri = "/enUS/course/001/006-how-to-install-eclipse";
	public static final String C001L006InstallerEclipseEnUSPage_ImageUri = "/png/enUS/course/001/006-how-to-install-eclipse-999.png";

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. ";
	public static final String moiP2 = "To show how important Eclipse is to the world of open source development, many leading technology companies have their own IDEs based off Eclipse. ";
	public static final String moiP3 = "These include Red Hat, IBM, Texas Instruments, Adobe, Node, PHP and many more. ";
	public static final String moiP4 = "Red Hat® Developer Studio is a certified Eclipse-based integrated development environment (IDE) for developing, testing, and deploying rich web apps, mobile web apps, transactional enterprise apps, and microservices. ";
	public static final String moiP5 = "True to the Red Hat's mission, \"to be the catalyst in communities of customers, contributors, and partners creating better technology the open source way,\" Red Hat is very involved in Eclipse. ";
	public static final String moiP6 = "I will help you install the most recent version of Eclipse to develop your website the open source way. ";
	public static final String moiP = moiP1 + moiP2 + moiP3 + moiP4 + moiP5 + moiP6;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml moi = new PageHtml();
	public Couverture<PageHtml> moiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L006InstallerEclipse moiInit() {
		if(moi != null) {
			((C001L006InstallerEclipse)this).avantPagePart(moi, "moi");
			((C001L006InstallerEclipse)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
	}
	public void htmlBodyMoi(PageHtml o) {
		{ e("p").a("class", " moiP ").f();
			sx(moiP1);
			sx(moiP2);
			sx(moiP3);
			sx(moiP4);
			sx(moiP5);
			sx(moiP6);
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
	public static final String questionDependencesH3Span1 = "How do I install the dependencies for Eclipse? ";
	public static final String questionDependencesH3Span = questionDependencesH3Span1;
	public static final String questionDependencesH4I1 = "far fa-cookie";
	public static final String questionDependencesH4I = questionDependencesH4I1;
	public static final String questionDependencesH4Span1 = "Build the dependencies with yum. ";
	public static final String questionDependencesH4Span = questionDependencesH4Span1;
	public static final String questionDependencesOl2Li11 = "sudo: The command to install yum repositories begins with the command sudo. ";
	public static final String questionDependencesOl2Li12 = "The \"sudo\" command allows your current user to have root privileges for a few minutes after entering your password. ";
	public static final String questionDependencesOl2Li1 = questionDependencesOl2Li11 + questionDependencesOl2Li12;
	public static final String questionDependencesOl2Li21 = "Which stands for \"Yellowdog Updater Modified\", but nobody knows it as yellowdog, just yum. ";
	public static final String questionDependencesOl2Li22 = "CentOS manages software packages and RPM application files with yum. ";
	public static final String questionDependencesOl2Li2 = questionDependencesOl2Li21 + questionDependencesOl2Li22;
	public static final String questionDependencesOl2Li31 = "-y: Suppress messages asking to confirm if you want to install the software. ";
	public static final String questionDependencesOl2Li3 = questionDependencesOl2Li31;
	public static final String questionDependencesOl2Li41 = "git: The package names you wish to install. ";
	public static final String questionDependencesOl2Li4 = questionDependencesOl2Li41;
	public static final String questionDependencesPre3Span11 = "sudo";
	public static final String questionDependencesPre3Span1 = questionDependencesPre3Span11;
	public static final String questionDependencesPre3Span21 = " yum";
	public static final String questionDependencesPre3Span2 = questionDependencesPre3Span21;
	public static final String questionDependencesPre3Span31 = " install";
	public static final String questionDependencesPre3Span3 = questionDependencesPre3Span31;
	public static final String questionDependencesPre3Span41 = " -y";
	public static final String questionDependencesPre3Span4 = questionDependencesPre3Span41;
	public static final String questionDependencesPre3Span51 = " git";
	public static final String questionDependencesPre3Span5 = questionDependencesPre3Span51;
	public static final String questionDependencesOl4Li11 = "sudo";
	public static final String questionDependencesOl4Li1 = questionDependencesOl4Li11;
	public static final String questionDependencesOl4Li21 = "yum";
	public static final String questionDependencesOl4Li2 = questionDependencesOl4Li21;
	public static final String questionDependencesOl4Li31 = "install: For installing new yum packages. ";
	public static final String questionDependencesOl4Li3 = questionDependencesOl4Li31;
	public static final String questionDependencesOl4Li41 = "-y";
	public static final String questionDependencesOl4Li4 = questionDependencesOl4Li41;
	public static final String questionDependencesOl4Li51 = "git: The distributed revision control system for most open source software. ";
	public static final String questionDependencesOl4Li5 = questionDependencesOl4Li51;

	/**	L'entité « questionDependences »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDependences = new PageHtml();
	public Couverture<PageHtml> questionDependencesCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDependences").o(questionDependences);

	/**	<br/>L'entité « questionDependences »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionDependences">Trouver l'entité questionDependences dans Solr</a>
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
	protected C001L006InstallerEclipse questionDependencesInit() {
		if(questionDependences != null) {
			((C001L006InstallerEclipse)this).avantPagePart(questionDependences, "questionDependences");
			((C001L006InstallerEclipse)this).avantPagePart(questionDependences, "questionDependences");
		}
		if(!questionDependencesCouverture.dejaInitialise) {
			_questionDependences(questionDependences);
		}
		questionDependences.initLoinPourClasse(requeteSite_);
		questionDependencesCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
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
	// questionMkdirSrc //
	//////////////////////

	public static final String questionMkdirSrcH3I1 = "far fa-files-medical";
	public static final String questionMkdirSrcH3I = questionMkdirSrcH3I1;
	public static final String questionMkdirSrcH3Span1 = "Where do I put the Eclipse source code? ";
	public static final String questionMkdirSrcH3Span = questionMkdirSrcH3Span1;
	public static final String questionMkdirSrcH4I1 = "far fa-folder-tree";
	public static final String questionMkdirSrcH4I = questionMkdirSrcH4I1;
	public static final String questionMkdirSrcH4Span1 = "Create a eclipse directory in /usr/local/src. ";
	public static final String questionMkdirSrcH4Span = questionMkdirSrcH4Span1;
	public static final String questionMkdirSrcPreSpan11 = "sudo";
	public static final String questionMkdirSrcPreSpan1 = questionMkdirSrcPreSpan11;
	public static final String questionMkdirSrcPreSpan21 = " install";
	public static final String questionMkdirSrcPreSpan2 = questionMkdirSrcPreSpan21;
	public static final String questionMkdirSrcPreSpan31 = " -d";
	public static final String questionMkdirSrcPreSpan3 = questionMkdirSrcPreSpan31;
	public static final String questionMkdirSrcPreSpan41 = " -o";
	public static final String questionMkdirSrcPreSpan4 = questionMkdirSrcPreSpan41;
	public static final String questionMkdirSrcPreSpan51 = " $USER";
	public static final String questionMkdirSrcPreSpan5 = questionMkdirSrcPreSpan51;
	public static final String questionMkdirSrcPreSpan61 = " -g";
	public static final String questionMkdirSrcPreSpan6 = questionMkdirSrcPreSpan61;
	public static final String questionMkdirSrcPreSpan71 = " $USER";
	public static final String questionMkdirSrcPreSpan7 = questionMkdirSrcPreSpan71;
	public static final String questionMkdirSrcPreSpan81 = " /usr/local/src/eclipse";
	public static final String questionMkdirSrcPreSpan8 = questionMkdirSrcPreSpan81;
	public static final String questionMkdirSrcOl2Li11 = "sudo";
	public static final String questionMkdirSrcOl2Li1 = questionMkdirSrcOl2Li11;
	public static final String questionMkdirSrcOl2Li21 = "install: Creates directories and sets attributes on the new directory. ";
	public static final String questionMkdirSrcOl2Li2 = questionMkdirSrcOl2Li21;
	public static final String questionMkdirSrcOl2Li31 = "-d: Create  directories. ";
	public static final String questionMkdirSrcOl2Li3 = questionMkdirSrcOl2Li31;
	public static final String questionMkdirSrcOl2Li41 = "-o: Set ownership on the directory (super-user only). ";
	public static final String questionMkdirSrcOl2Li4 = questionMkdirSrcOl2Li41;
	public static final String questionMkdirSrcOl2Li51 = "$USER: The current user to make the owner of the directory. ";
	public static final String questionMkdirSrcOl2Li5 = questionMkdirSrcOl2Li51;
	public static final String questionMkdirSrcOl2Li61 = "-g: Set group ownership on the directory (super-user only). ";
	public static final String questionMkdirSrcOl2Li6 = questionMkdirSrcOl2Li61;
	public static final String questionMkdirSrcOl2Li71 = "$USER: The current user to make the group owner of the directory. ";
	public static final String questionMkdirSrcOl2Li7 = questionMkdirSrcOl2Li71;
	public static final String questionMkdirSrcOl2Li81 = "/usr/local is a place for extra software that you install without the package manager. ";
	public static final String questionMkdirSrcOl2Li82 = "/usr/local/src is a good place to clone your open source software repositories. ";
	public static final String questionMkdirSrcOl2Li8 = questionMkdirSrcOl2Li81 + questionMkdirSrcOl2Li82;

	/**	L'entité « questionMkdirSrc »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMkdirSrc = new PageHtml();
	public Couverture<PageHtml> questionMkdirSrcCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMkdirSrc").o(questionMkdirSrc);

	/**	<br/>L'entité « questionMkdirSrc »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionMkdirSrc">Trouver l'entité questionMkdirSrc dans Solr</a>
	 * <br/>
	 * @param questionMkdirSrc est l'entité déjà construit. 
	 **/
	protected abstract void _questionMkdirSrc(PageHtml o);

	public PageHtml getQuestionMkdirSrc() {
		return questionMkdirSrc;
	}

	public void setQuestionMkdirSrc(PageHtml questionMkdirSrc) {
		this.questionMkdirSrc = questionMkdirSrc;
		this.questionMkdirSrcCouverture.dejaInitialise = true;
	}
	protected C001L006InstallerEclipse questionMkdirSrcInit() {
		if(questionMkdirSrc != null) {
			((C001L006InstallerEclipse)this).avantPagePart(questionMkdirSrc, "questionMkdirSrc");
			((C001L006InstallerEclipse)this).avantPagePart(questionMkdirSrc, "questionMkdirSrc");
		}
		if(!questionMkdirSrcCouverture.dejaInitialise) {
			_questionMkdirSrc(questionMkdirSrc);
		}
		questionMkdirSrc.initLoinPourClasse(requeteSite_);
		questionMkdirSrcCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
	}
	public void htmlBodyQuestionMkdirSrc(PageHtml o) {
		{ e("h3").a("class", " questionMkdirSrcH3 ").f();
			{ e("i").a("class", questionMkdirSrcH3I1, " site-menu-icon questionMkdirSrcH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirSrcH3Span ").f();
				sx(questionMkdirSrcH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMkdirSrcH4 ").f();
			{ e("i").a("class", questionMkdirSrcH4I1, " site-menu-icon questionMkdirSrcH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirSrcH4Span ").f();
				sx(questionMkdirSrcH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionMkdirSrcPre ").f();
			{ e("span").a("class", " questionMkdirSrcPreSpan1 questionMkdirSrcPreSpan odd ").f();
				sx(questionMkdirSrcPreSpan11);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan2 questionMkdirSrcPreSpan even ").f();
				sx(questionMkdirSrcPreSpan21);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan3 questionMkdirSrcPreSpan odd ").f();
				sx(questionMkdirSrcPreSpan31);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan4 questionMkdirSrcPreSpan even ").f();
				sx(questionMkdirSrcPreSpan41);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan5 questionMkdirSrcPreSpan odd ").f();
				sx(questionMkdirSrcPreSpan51);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan6 questionMkdirSrcPreSpan even ").f();
				sx(questionMkdirSrcPreSpan61);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan7 questionMkdirSrcPreSpan odd ").f();
				sx(questionMkdirSrcPreSpan71);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan8 questionMkdirSrcPreSpan even ").f();
				sx(questionMkdirSrcPreSpan81);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirSrcOl2 questionMkdirSrcOl even ").f();
			{ e("li").a("class", " questionMkdirSrcOl2Li1 questionMkdirSrcOl2Li odd ").f();
				sx(questionMkdirSrcOl2Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li2 questionMkdirSrcOl2Li even ").f();
				sx(questionMkdirSrcOl2Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li3 questionMkdirSrcOl2Li odd ").f();
				sx(questionMkdirSrcOl2Li31);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li4 questionMkdirSrcOl2Li even ").f();
				sx(questionMkdirSrcOl2Li41);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li5 questionMkdirSrcOl2Li odd ").f();
				sx(questionMkdirSrcOl2Li51);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li6 questionMkdirSrcOl2Li even ").f();
				sx(questionMkdirSrcOl2Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li7 questionMkdirSrcOl2Li odd ").f();
				sx(questionMkdirSrcOl2Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li8 questionMkdirSrcOl2Li even ").f();
				sx(questionMkdirSrcOl2Li81);
				sx(questionMkdirSrcOl2Li82);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMkdirSrc() {
		questionMkdirSrc.htmlAvant();
		htmlBodyQuestionMkdirSrc(questionMkdirSrc);
		questionMkdirSrc.htmlApres();
	}

	//////////////////////////
	// questionMkdirEclipse //
	//////////////////////////

	public static final String questionMkdirEclipseH3I1 = "far fa-map-pin";
	public static final String questionMkdirEclipseH3I = questionMkdirEclipseH3I1;
	public static final String questionMkdirEclipseH3Span1 = "Where do I install Eclipse? ";
	public static final String questionMkdirEclipseH3Span = questionMkdirEclipseH3Span1;
	public static final String questionMkdirEclipseH4I1 = "far fa-folder-tree";
	public static final String questionMkdirEclipseH4I = questionMkdirEclipseH4I1;
	public static final String questionMkdirEclipseH4Span1 = "Create a eclipse directory in /opt. ";
	public static final String questionMkdirEclipseH4Span = questionMkdirEclipseH4Span1;
	public static final String questionMkdirEclipsePreSpan11 = "sudo";
	public static final String questionMkdirEclipsePreSpan1 = questionMkdirEclipsePreSpan11;
	public static final String questionMkdirEclipsePreSpan21 = " install";
	public static final String questionMkdirEclipsePreSpan2 = questionMkdirEclipsePreSpan21;
	public static final String questionMkdirEclipsePreSpan31 = " -d";
	public static final String questionMkdirEclipsePreSpan3 = questionMkdirEclipsePreSpan31;
	public static final String questionMkdirEclipsePreSpan41 = " -o";
	public static final String questionMkdirEclipsePreSpan4 = questionMkdirEclipsePreSpan41;
	public static final String questionMkdirEclipsePreSpan51 = " $USER";
	public static final String questionMkdirEclipsePreSpan5 = questionMkdirEclipsePreSpan51;
	public static final String questionMkdirEclipsePreSpan61 = " -g";
	public static final String questionMkdirEclipsePreSpan6 = questionMkdirEclipsePreSpan61;
	public static final String questionMkdirEclipsePreSpan71 = " $USER";
	public static final String questionMkdirEclipsePreSpan7 = questionMkdirEclipsePreSpan71;
	public static final String questionMkdirEclipsePreSpan81 = " /opt/eclipse";
	public static final String questionMkdirEclipsePreSpan8 = questionMkdirEclipsePreSpan81;
	public static final String questionMkdirEclipseOl2Li11 = "sudo";
	public static final String questionMkdirEclipseOl2Li1 = questionMkdirEclipseOl2Li11;
	public static final String questionMkdirEclipseOl2Li21 = "install";
	public static final String questionMkdirEclipseOl2Li2 = questionMkdirEclipseOl2Li21;
	public static final String questionMkdirEclipseOl2Li31 = "-d";
	public static final String questionMkdirEclipseOl2Li3 = questionMkdirEclipseOl2Li31;
	public static final String questionMkdirEclipseOl2Li41 = "-o";
	public static final String questionMkdirEclipseOl2Li4 = questionMkdirEclipseOl2Li41;
	public static final String questionMkdirEclipseOl2Li51 = "$USER";
	public static final String questionMkdirEclipseOl2Li5 = questionMkdirEclipseOl2Li51;
	public static final String questionMkdirEclipseOl2Li61 = "-g";
	public static final String questionMkdirEclipseOl2Li6 = questionMkdirEclipseOl2Li61;
	public static final String questionMkdirEclipseOl2Li71 = "$USER";
	public static final String questionMkdirEclipseOl2Li7 = questionMkdirEclipseOl2Li71;
	public static final String questionMkdirEclipseOl2Li81 = "/opt is a good place to install open source software applications like Eclipse. ";
	public static final String questionMkdirEclipseOl2Li8 = questionMkdirEclipseOl2Li81;

	/**	L'entité « questionMkdirEclipse »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMkdirEclipse = new PageHtml();
	public Couverture<PageHtml> questionMkdirEclipseCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMkdirEclipse").o(questionMkdirEclipse);

	/**	<br/>L'entité « questionMkdirEclipse »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionMkdirEclipse">Trouver l'entité questionMkdirEclipse dans Solr</a>
	 * <br/>
	 * @param questionMkdirEclipse est l'entité déjà construit. 
	 **/
	protected abstract void _questionMkdirEclipse(PageHtml o);

	public PageHtml getQuestionMkdirEclipse() {
		return questionMkdirEclipse;
	}

	public void setQuestionMkdirEclipse(PageHtml questionMkdirEclipse) {
		this.questionMkdirEclipse = questionMkdirEclipse;
		this.questionMkdirEclipseCouverture.dejaInitialise = true;
	}
	protected C001L006InstallerEclipse questionMkdirEclipseInit() {
		if(questionMkdirEclipse != null) {
			((C001L006InstallerEclipse)this).avantPagePart(questionMkdirEclipse, "questionMkdirEclipse");
			((C001L006InstallerEclipse)this).avantPagePart(questionMkdirEclipse, "questionMkdirEclipse");
		}
		if(!questionMkdirEclipseCouverture.dejaInitialise) {
			_questionMkdirEclipse(questionMkdirEclipse);
		}
		questionMkdirEclipse.initLoinPourClasse(requeteSite_);
		questionMkdirEclipseCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
	}
	public void htmlBodyQuestionMkdirEclipse(PageHtml o) {
		{ e("h3").a("class", " questionMkdirEclipseH3 ").f();
			{ e("i").a("class", questionMkdirEclipseH3I1, " site-menu-icon questionMkdirEclipseH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirEclipseH3Span ").f();
				sx(questionMkdirEclipseH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMkdirEclipseH4 ").f();
			{ e("i").a("class", questionMkdirEclipseH4I1, " site-menu-icon questionMkdirEclipseH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirEclipseH4Span ").f();
				sx(questionMkdirEclipseH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionMkdirEclipsePre ").f();
			{ e("span").a("class", " questionMkdirEclipsePreSpan1 questionMkdirEclipsePreSpan odd ").f();
				sx(questionMkdirEclipsePreSpan11);
			} g("span");
			{ e("span").a("class", " questionMkdirEclipsePreSpan2 questionMkdirEclipsePreSpan even ").f();
				sx(questionMkdirEclipsePreSpan21);
			} g("span");
			{ e("span").a("class", " questionMkdirEclipsePreSpan3 questionMkdirEclipsePreSpan odd ").f();
				sx(questionMkdirEclipsePreSpan31);
			} g("span");
			{ e("span").a("class", " questionMkdirEclipsePreSpan4 questionMkdirEclipsePreSpan even ").f();
				sx(questionMkdirEclipsePreSpan41);
			} g("span");
			{ e("span").a("class", " questionMkdirEclipsePreSpan5 questionMkdirEclipsePreSpan odd ").f();
				sx(questionMkdirEclipsePreSpan51);
			} g("span");
			{ e("span").a("class", " questionMkdirEclipsePreSpan6 questionMkdirEclipsePreSpan even ").f();
				sx(questionMkdirEclipsePreSpan61);
			} g("span");
			{ e("span").a("class", " questionMkdirEclipsePreSpan7 questionMkdirEclipsePreSpan odd ").f();
				sx(questionMkdirEclipsePreSpan71);
			} g("span");
			{ e("span").a("class", " questionMkdirEclipsePreSpan8 questionMkdirEclipsePreSpan even ").f();
				sx(questionMkdirEclipsePreSpan81);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirEclipseOl2 questionMkdirEclipseOl even ").f();
			{ e("li").a("class", " questionMkdirEclipseOl2Li1 questionMkdirEclipseOl2Li odd ").f();
				sx(questionMkdirEclipseOl2Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirEclipseOl2Li2 questionMkdirEclipseOl2Li even ").f();
				sx(questionMkdirEclipseOl2Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirEclipseOl2Li3 questionMkdirEclipseOl2Li odd ").f();
				sx(questionMkdirEclipseOl2Li31);
			} g("li");
			{ e("li").a("class", " questionMkdirEclipseOl2Li4 questionMkdirEclipseOl2Li even ").f();
				sx(questionMkdirEclipseOl2Li41);
			} g("li");
			{ e("li").a("class", " questionMkdirEclipseOl2Li5 questionMkdirEclipseOl2Li odd ").f();
				sx(questionMkdirEclipseOl2Li51);
			} g("li");
			{ e("li").a("class", " questionMkdirEclipseOl2Li6 questionMkdirEclipseOl2Li even ").f();
				sx(questionMkdirEclipseOl2Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirEclipseOl2Li7 questionMkdirEclipseOl2Li odd ").f();
				sx(questionMkdirEclipseOl2Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirEclipseOl2Li8 questionMkdirEclipseOl2Li even ").f();
				sx(questionMkdirEclipseOl2Li81);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMkdirEclipse() {
		questionMkdirEclipse.htmlAvant();
		htmlBodyQuestionMkdirEclipse(questionMkdirEclipse);
		questionMkdirEclipse.htmlApres();
	}

	//////////////////////////
	// questionClonerSource //
	//////////////////////////

	public static final String questionClonerSourceH3I1 = "far fa-cloud-download";
	public static final String questionClonerSourceH3I = questionClonerSourceH3I1;
	public static final String questionClonerSourceH3Span1 = "How do I download the eclipse source code? ";
	public static final String questionClonerSourceH3Span = questionClonerSourceH3Span1;
	public static final String questionClonerSourceH4I1 = "fab fa-git";
	public static final String questionClonerSourceH4I = questionClonerSourceH4I1;
	public static final String questionClonerSourceH4Span1 = "Clone the source code with the git command. ";
	public static final String questionClonerSourceH4Span = questionClonerSourceH4Span1;
	public static final String questionClonerSourcePreSpan11 = "git";
	public static final String questionClonerSourcePreSpan1 = questionClonerSourcePreSpan11;
	public static final String questionClonerSourcePreSpan21 = " clone";
	public static final String questionClonerSourcePreSpan2 = questionClonerSourcePreSpan21;
	public static final String questionClonerSourcePreSpan31 = " git://git.eclipse.org/gitroot/platform/eclipse.platform.releng.aggregator.git";
	public static final String questionClonerSourcePreSpan3 = questionClonerSourcePreSpan31;
	public static final String questionClonerSourcePreSpan41 = " /usr/local/src/eclipse";
	public static final String questionClonerSourcePreSpan4 = questionClonerSourcePreSpan41;
	public static final String questionClonerSourceOl2Li11 = "git: The distributed revision control system for most open source software. ";
	public static final String questionClonerSourceOl2Li1 = questionClonerSourceOl2Li11;
	public static final String questionClonerSourceOl2Li21 = "clone: Clone a repository into a directory. ";
	public static final String questionClonerSourceOl2Li2 = questionClonerSourceOl2Li21;
	public static final String questionClonerSourceOl2Li31 = "git://git.eclipse.org/gitroot/platform/eclipse.platform.releng.aggregator.git: The git URL to the eclipse source code repository. ";
	public static final String questionClonerSourceOl2Li3 = questionClonerSourceOl2Li31;
	public static final String questionClonerSourceOl2Li41 = "/usr/local/src/eclipse: The directory where the eclipse source code will be cloned. ";
	public static final String questionClonerSourceOl2Li4 = questionClonerSourceOl2Li41;

	/**	L'entité « questionClonerSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionClonerSource = new PageHtml();
	public Couverture<PageHtml> questionClonerSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionClonerSource").o(questionClonerSource);

	/**	<br/>L'entité « questionClonerSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionClonerSource">Trouver l'entité questionClonerSource dans Solr</a>
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
	protected C001L006InstallerEclipse questionClonerSourceInit() {
		if(questionClonerSource != null) {
			((C001L006InstallerEclipse)this).avantPagePart(questionClonerSource, "questionClonerSource");
			((C001L006InstallerEclipse)this).avantPagePart(questionClonerSource, "questionClonerSource");
		}
		if(!questionClonerSourceCouverture.dejaInitialise) {
			_questionClonerSource(questionClonerSource);
		}
		questionClonerSource.initLoinPourClasse(requeteSite_);
		questionClonerSourceCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
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
	public static final String questionListerTagsH3Span1 = "How do I pick a recent version of Eclipse? ";
	public static final String questionListerTagsH3Span = questionListerTagsH3Span1;
	public static final String questionListerTagsH4I1 = "far fa-tag";
	public static final String questionListerTagsH4I = questionListerTagsH4I1;
	public static final String questionListerTagsH4Span1 = "List all the tags in the git repository. ";
	public static final String questionListerTagsH4Span = questionListerTagsH4Span1;
	public static final String questionListerTagsPreSpan11 = "(cd";
	public static final String questionListerTagsPreSpan1 = questionListerTagsPreSpan11;
	public static final String questionListerTagsPreSpan21 = " /usr/local/src/eclipse";
	public static final String questionListerTagsPreSpan2 = questionListerTagsPreSpan21;
	public static final String questionListerTagsPreSpan31 = " &&";
	public static final String questionListerTagsPreSpan3 = questionListerTagsPreSpan31;
	public static final String questionListerTagsPreSpan41 = " git";
	public static final String questionListerTagsPreSpan4 = questionListerTagsPreSpan41;
	public static final String questionListerTagsPreSpan51 = " tag)";
	public static final String questionListerTagsPreSpan5 = questionListerTagsPreSpan51;
	public static final String questionListerTagsOl1Li11 = "(cd: Change directory temporarily, because of the open parenthesis. ";
	public static final String questionListerTagsOl1Li1 = questionListerTagsOl1Li11;
	public static final String questionListerTagsOl1Li21 = "/usr/local/src/eclipse: The directory where the eclipse source code was cloned. ";
	public static final String questionListerTagsOl1Li2 = questionListerTagsOl1Li21;
	public static final String questionListerTagsOl1Li31 = "&&: Run the cd and git command together. ";
	public static final String questionListerTagsOl1Li3 = questionListerTagsOl1Li31;
	public static final String questionListerTagsOl1Li41 = "git";
	public static final String questionListerTagsOl1Li4 = questionListerTagsOl1Li41;
	public static final String questionListerTagsOl1Li51 = "tag): Lists the current tags or assigned versions of the code and close the parenthesis. ";
	public static final String questionListerTagsOl1Li5 = questionListerTagsOl1Li51;
	public static final String questionListerTagsP1Span11 = "Picking a version can be quite confusing, so I recommend visiting the Eclipse Project Build Types page. ";
	public static final String questionListerTagsP1Span1 = questionListerTagsP1Span11;
	public static final String questionListerTagsP1A21 = "https://download.eclipse.org/eclipse/downloads/build_types.html";
	public static final String questionListerTagsP1A2 = questionListerTagsP1A21;
	public static final String questionListerTagsP1Span31 = ". You can read about Stable builds: \"Stable builds are integration builds that have been found to be stable enough for most people to use. ";
	public static final String questionListerTagsP1Span32 = "They are promoted from integration build to stable build by the architecture team after they have been used for a few days and deemed reasonably stable. ";
	public static final String questionListerTagsP1Span33 = "The latest stable build is the right build for people who want to stay up to date with what is going on in the latest development stream, and don't mind putting up with a few problems n in order to get the latest greatest features and bug fixes. ";
	public static final String questionListerTagsP1Span34 = "The latest stable build is the one the development team likes people to be using, because of the valuable and timely feedback.\" ";
	public static final String questionListerTagsP1Span3 = questionListerTagsP1Span31 + questionListerTagsP1Span32 + questionListerTagsP1Span33 + questionListerTagsP1Span34;
	public static final String questionListerTagsP2Span31 = "Now visit the Eclipse Project Downloads page. ";
	public static final String questionListerTagsP2Span3 = questionListerTagsP2Span31;
	public static final String questionListerTagsP2A21 = "https://download.eclipse.org/eclipse/downloads/";
	public static final String questionListerTagsP2A2 = questionListerTagsP2A21;
	public static final String questionListerTagsP2Span21 = ". Look for the \"Stable Builds\" section. ";
	public static final String questionListerTagsP2Span22 = "If it says something like \"4.12M1\", then look for the git branch \"S4_12_0_M1\" which would likely be the right stable tag to build off of at that time. ";
	public static final String questionListerTagsP2Span2 = questionListerTagsP2Span21 + questionListerTagsP2Span22;

	/**	L'entité « questionListerTags »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionListerTags = new PageHtml();
	public Couverture<PageHtml> questionListerTagsCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionListerTags").o(questionListerTags);

	/**	<br/>L'entité « questionListerTags »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionListerTags">Trouver l'entité questionListerTags dans Solr</a>
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
	protected C001L006InstallerEclipse questionListerTagsInit() {
		if(questionListerTags != null) {
			((C001L006InstallerEclipse)this).avantPagePart(questionListerTags, "questionListerTags");
			((C001L006InstallerEclipse)this).avantPagePart(questionListerTags, "questionListerTags");
		}
		if(!questionListerTagsCouverture.dejaInitialise) {
			_questionListerTags(questionListerTags);
		}
		questionListerTags.initLoinPourClasse(requeteSite_);
		questionListerTagsCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
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
		{ e("ol").a("class", " questionListerTagsOl1 questionListerTagsOl odd ").f();
			{ e("li").a("class", " questionListerTagsOl1Li1 questionListerTagsOl1Li odd ").f();
				sx(questionListerTagsOl1Li11);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl1Li2 questionListerTagsOl1Li even ").f();
				sx(questionListerTagsOl1Li21);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl1Li3 questionListerTagsOl1Li odd ").f();
				sx(questionListerTagsOl1Li31);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl1Li4 questionListerTagsOl1Li even ").f();
				sx(questionListerTagsOl1Li41);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl1Li5 questionListerTagsOl1Li odd ").f();
				sx(questionListerTagsOl1Li51);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionListerTagsP1 questionListerTagsP odd ").f();
			{ e("span").a("class", " questionListerTagsP1Span1 questionListerTagsP1Span odd ").f();
				sx(questionListerTagsP1Span11);
			} g("span");
			{ e("a").a("class", " questionListerTagsP1A2 questionListerTagsP1A even ").a("href", questionListerTagsP1A21).f();
				sx(questionListerTagsP1A21);
			} g("a");
			{ e("span").a("class", " questionListerTagsP1Span3 questionListerTagsP1Span odd ").f();
				sx(questionListerTagsP1Span31);
				sx(questionListerTagsP1Span32);
				sx(questionListerTagsP1Span33);
				sx(questionListerTagsP1Span34);
			} g("span");
		} g("p");
		{ e("p").a("class", " questionListerTagsP2 questionListerTagsP even ").f();
			{ e("span").a("class", " questionListerTagsP2Span3 questionListerTagsP2Span odd ").f();
				sx(questionListerTagsP2Span31);
			} g("span");
			{ e("a").a("class", " questionListerTagsP2A2 questionListerTagsP2A even ").a("href", questionListerTagsP2A21).f();
				sx(questionListerTagsP2A21);
			} g("a");
			{ e("span").a("class", " questionListerTagsP2Span2 questionListerTagsP2Span even ").f();
				sx(questionListerTagsP2Span21);
				sx(questionListerTagsP2Span22);
			} g("span");
		} g("p");
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
	public static final String questionCheckoutTagH3Span1 = "How do I switch versions of the eclipse source code? ";
	public static final String questionCheckoutTagH3Span = questionCheckoutTagH3Span1;
	public static final String questionCheckoutTagH4I1 = "far fa-code-commit";
	public static final String questionCheckoutTagH4I = questionCheckoutTagH4I1;
	public static final String questionCheckoutTagH4Span1 = "Checkout the git tag. ";
	public static final String questionCheckoutTagH4Span = questionCheckoutTagH4Span1;
	public static final String questionCheckoutTagPreSpan11 = "(cd";
	public static final String questionCheckoutTagPreSpan1 = questionCheckoutTagPreSpan11;
	public static final String questionCheckoutTagPreSpan21 = " /usr/local/src/eclipse";
	public static final String questionCheckoutTagPreSpan2 = questionCheckoutTagPreSpan21;
	public static final String questionCheckoutTagPreSpan31 = " &&";
	public static final String questionCheckoutTagPreSpan3 = questionCheckoutTagPreSpan31;
	public static final String questionCheckoutTagPreSpan41 = " git";
	public static final String questionCheckoutTagPreSpan4 = questionCheckoutTagPreSpan41;
	public static final String questionCheckoutTagPreSpan51 = " checkout";
	public static final String questionCheckoutTagPreSpan5 = questionCheckoutTagPreSpan51;
	public static final String questionCheckoutTagPreSpan61 = " S4_12_0_M1)";
	public static final String questionCheckoutTagPreSpan6 = questionCheckoutTagPreSpan61;
	public static final String questionCheckoutTagOl1Li11 = "(cd";
	public static final String questionCheckoutTagOl1Li1 = questionCheckoutTagOl1Li11;
	public static final String questionCheckoutTagOl1Li21 = "/usr/local/src/eclipse";
	public static final String questionCheckoutTagOl1Li2 = questionCheckoutTagOl1Li21;
	public static final String questionCheckoutTagOl1Li31 = "&&";
	public static final String questionCheckoutTagOl1Li3 = questionCheckoutTagOl1Li31;
	public static final String questionCheckoutTagOl1Li41 = "git";
	public static final String questionCheckoutTagOl1Li4 = questionCheckoutTagOl1Li41;
	public static final String questionCheckoutTagOl1Li51 = "checkout: Checkout a branch to the working tree. ";
	public static final String questionCheckoutTagOl1Li5 = questionCheckoutTagOl1Li51;
	public static final String questionCheckoutTagOl1Li61 = "S4_12_0_M1): The latest tag to base the branch from. ";
	public static final String questionCheckoutTagOl1Li6 = questionCheckoutTagOl1Li61;

	/**	L'entité « questionCheckoutTag »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCheckoutTag = new PageHtml();
	public Couverture<PageHtml> questionCheckoutTagCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCheckoutTag").o(questionCheckoutTag);

	/**	<br/>L'entité « questionCheckoutTag »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCheckoutTag">Trouver l'entité questionCheckoutTag dans Solr</a>
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
	protected C001L006InstallerEclipse questionCheckoutTagInit() {
		if(questionCheckoutTag != null) {
			((C001L006InstallerEclipse)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
			((C001L006InstallerEclipse)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
		}
		if(!questionCheckoutTagCouverture.dejaInitialise) {
			_questionCheckoutTag(questionCheckoutTag);
		}
		questionCheckoutTag.initLoinPourClasse(requeteSite_);
		questionCheckoutTagCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
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
		{ e("ol").a("class", " questionCheckoutTagOl1 questionCheckoutTagOl odd ").f();
			{ e("li").a("class", " questionCheckoutTagOl1Li1 questionCheckoutTagOl1Li odd ").f();
				sx(questionCheckoutTagOl1Li11);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl1Li2 questionCheckoutTagOl1Li even ").f();
				sx(questionCheckoutTagOl1Li21);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl1Li3 questionCheckoutTagOl1Li odd ").f();
				sx(questionCheckoutTagOl1Li31);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl1Li4 questionCheckoutTagOl1Li even ").f();
				sx(questionCheckoutTagOl1Li41);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl1Li5 questionCheckoutTagOl1Li odd ").f();
				sx(questionCheckoutTagOl1Li51);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl1Li6 questionCheckoutTagOl1Li even ").f();
				sx(questionCheckoutTagOl1Li61);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionCheckoutTag() {
		questionCheckoutTag.htmlAvant();
		htmlBodyQuestionCheckoutTag(questionCheckoutTag);
		questionCheckoutTag.htmlApres();
	}

	/////////////////////////
	// questionSousModules //
	/////////////////////////

	public static final String questionSousModulesH3I1 = "far fa-retweet";
	public static final String questionSousModulesH3I = questionSousModulesH3I1;
	public static final String questionSousModulesH3Span1 = "How do I pull in all the Eclipse dependencies? ";
	public static final String questionSousModulesH3Span = questionSousModulesH3Span1;
	public static final String questionSousModulesH4I1 = "far fa-sitemap";
	public static final String questionSousModulesH4I = questionSousModulesH4I1;
	public static final String questionSousModulesH4Span1 = "Update the submodules with git. ";
	public static final String questionSousModulesH4Span = questionSousModulesH4Span1;
	public static final String questionSousModulesPreSpan11 = "(cd";
	public static final String questionSousModulesPreSpan1 = questionSousModulesPreSpan11;
	public static final String questionSousModulesPreSpan21 = " /usr/local/src/eclipse";
	public static final String questionSousModulesPreSpan2 = questionSousModulesPreSpan21;
	public static final String questionSousModulesPreSpan31 = " &&";
	public static final String questionSousModulesPreSpan3 = questionSousModulesPreSpan31;
	public static final String questionSousModulesPreSpan41 = " git";
	public static final String questionSousModulesPreSpan4 = questionSousModulesPreSpan41;
	public static final String questionSousModulesPreSpan51 = " submodule";
	public static final String questionSousModulesPreSpan5 = questionSousModulesPreSpan51;
	public static final String questionSousModulesPreSpan61 = " update";
	public static final String questionSousModulesPreSpan6 = questionSousModulesPreSpan61;
	public static final String questionSousModulesPreSpan71 = " --init";
	public static final String questionSousModulesPreSpan7 = questionSousModulesPreSpan71;
	public static final String questionSousModulesPreSpan81 = " --recursive)";
	public static final String questionSousModulesPreSpan8 = questionSousModulesPreSpan81;
	public static final String questionSousModulesOl2Li11 = "(cd";
	public static final String questionSousModulesOl2Li1 = questionSousModulesOl2Li11;
	public static final String questionSousModulesOl2Li21 = "/usr/local/src/eclipse";
	public static final String questionSousModulesOl2Li2 = questionSousModulesOl2Li21;
	public static final String questionSousModulesOl2Li31 = "&&";
	public static final String questionSousModulesOl2Li3 = questionSousModulesOl2Li31;
	public static final String questionSousModulesOl2Li41 = "git";
	public static final String questionSousModulesOl2Li4 = questionSousModulesOl2Li41;
	public static final String questionSousModulesOl2Li51 = "submodule: Git submodules are other git repositories that can be loaded into another repository at a certain commit. ";
	public static final String questionSousModulesOl2Li5 = questionSousModulesOl2Li51;
	public static final String questionSousModulesOl2Li61 = "update: Update all submodules in the current git repository. ";
	public static final String questionSousModulesOl2Li6 = questionSousModulesOl2Li61;
	public static final String questionSousModulesOl2Li71 = "--init: Initialize empty submodules. ";
	public static final String questionSousModulesOl2Li7 = questionSousModulesOl2Li71;
	public static final String questionSousModulesOl2Li81 = "--recursive): Initialize submodules of the submodules in the git repository recursively. ";
	public static final String questionSousModulesOl2Li82 = "This will take a long time. ";
	public static final String questionSousModulesOl2Li8 = questionSousModulesOl2Li81 + questionSousModulesOl2Li82;

	/**	L'entité « questionSousModules »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSousModules = new PageHtml();
	public Couverture<PageHtml> questionSousModulesCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSousModules").o(questionSousModules);

	/**	<br/>L'entité « questionSousModules »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSousModules">Trouver l'entité questionSousModules dans Solr</a>
	 * <br/>
	 * @param questionSousModules est l'entité déjà construit. 
	 **/
	protected abstract void _questionSousModules(PageHtml o);

	public PageHtml getQuestionSousModules() {
		return questionSousModules;
	}

	public void setQuestionSousModules(PageHtml questionSousModules) {
		this.questionSousModules = questionSousModules;
		this.questionSousModulesCouverture.dejaInitialise = true;
	}
	protected C001L006InstallerEclipse questionSousModulesInit() {
		if(questionSousModules != null) {
			((C001L006InstallerEclipse)this).avantPagePart(questionSousModules, "questionSousModules");
			((C001L006InstallerEclipse)this).avantPagePart(questionSousModules, "questionSousModules");
		}
		if(!questionSousModulesCouverture.dejaInitialise) {
			_questionSousModules(questionSousModules);
		}
		questionSousModules.initLoinPourClasse(requeteSite_);
		questionSousModulesCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
	}
	public void htmlBodyQuestionSousModules(PageHtml o) {
		{ e("h3").a("class", " questionSousModulesH3 ").f();
			{ e("i").a("class", questionSousModulesH3I1, " site-menu-icon questionSousModulesH3I ").f();
			} g("i");
			{ e("span").a("class", " questionSousModulesH3Span ").f();
				sx(questionSousModulesH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionSousModulesH4 ").f();
			{ e("i").a("class", questionSousModulesH4I1, " site-menu-icon questionSousModulesH4I ").f();
			} g("i");
			{ e("span").a("class", " questionSousModulesH4Span ").f();
				sx(questionSousModulesH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionSousModulesPre ").f();
			{ e("span").a("class", " questionSousModulesPreSpan1 questionSousModulesPreSpan odd ").f();
				sx(questionSousModulesPreSpan11);
			} g("span");
			{ e("span").a("class", " questionSousModulesPreSpan2 questionSousModulesPreSpan even ").f();
				sx(questionSousModulesPreSpan21);
			} g("span");
			{ e("span").a("class", " questionSousModulesPreSpan3 questionSousModulesPreSpan odd ").f();
				sx(questionSousModulesPreSpan31);
			} g("span");
			{ e("span").a("class", " questionSousModulesPreSpan4 questionSousModulesPreSpan even ").f();
				sx(questionSousModulesPreSpan41);
			} g("span");
			{ e("span").a("class", " questionSousModulesPreSpan5 questionSousModulesPreSpan odd ").f();
				sx(questionSousModulesPreSpan51);
			} g("span");
			{ e("span").a("class", " questionSousModulesPreSpan6 questionSousModulesPreSpan even ").f();
				sx(questionSousModulesPreSpan61);
			} g("span");
			{ e("span").a("class", " questionSousModulesPreSpan7 questionSousModulesPreSpan odd ").f();
				sx(questionSousModulesPreSpan71);
			} g("span");
			{ e("span").a("class", " questionSousModulesPreSpan8 questionSousModulesPreSpan even ").f();
				sx(questionSousModulesPreSpan81);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSousModulesOl2 questionSousModulesOl even ").f();
			{ e("li").a("class", " questionSousModulesOl2Li1 questionSousModulesOl2Li odd ").f();
				sx(questionSousModulesOl2Li11);
			} g("li");
			{ e("li").a("class", " questionSousModulesOl2Li2 questionSousModulesOl2Li even ").f();
				sx(questionSousModulesOl2Li21);
			} g("li");
			{ e("li").a("class", " questionSousModulesOl2Li3 questionSousModulesOl2Li odd ").f();
				sx(questionSousModulesOl2Li31);
			} g("li");
			{ e("li").a("class", " questionSousModulesOl2Li4 questionSousModulesOl2Li even ").f();
				sx(questionSousModulesOl2Li41);
			} g("li");
			{ e("li").a("class", " questionSousModulesOl2Li5 questionSousModulesOl2Li odd ").f();
				sx(questionSousModulesOl2Li51);
			} g("li");
			{ e("li").a("class", " questionSousModulesOl2Li6 questionSousModulesOl2Li even ").f();
				sx(questionSousModulesOl2Li61);
			} g("li");
			{ e("li").a("class", " questionSousModulesOl2Li7 questionSousModulesOl2Li odd ").f();
				sx(questionSousModulesOl2Li71);
			} g("li");
			{ e("li").a("class", " questionSousModulesOl2Li8 questionSousModulesOl2Li even ").f();
				sx(questionSousModulesOl2Li81);
				sx(questionSousModulesOl2Li82);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionSousModules() {
		questionSousModules.htmlAvant();
		htmlBodyQuestionSousModules(questionSousModules);
		questionSousModules.htmlApres();
	}

	//////////////////////////////
	// questionConstruireSource //
	//////////////////////////////

	public static final String questionConstruireSourceH3I1 = "far fa-tools";
	public static final String questionConstruireSourceH3I = questionConstruireSourceH3I1;
	public static final String questionConstruireSourceH3Span1 = "How do I build the eclipse source code? ";
	public static final String questionConstruireSourceH3Span = questionConstruireSourceH3Span1;
	public static final String questionConstruireSourceH4I1 = "far fa-terminal";
	public static final String questionConstruireSourceH4I = questionConstruireSourceH4I1;
	public static final String questionConstruireSourceH4Span1 = "Build Eclipse with the mvn command. ";
	public static final String questionConstruireSourceH4Span = questionConstruireSourceH4Span1;
	public static final String questionConstruireSourcePre1Span11 = "(cd";
	public static final String questionConstruireSourcePre1Span1 = questionConstruireSourcePre1Span11;
	public static final String questionConstruireSourcePre1Span21 = " /usr/local/src/eclipse";
	public static final String questionConstruireSourcePre1Span2 = questionConstruireSourcePre1Span21;
	public static final String questionConstruireSourcePre1Span31 = " &&";
	public static final String questionConstruireSourcePre1Span3 = questionConstruireSourcePre1Span31;
	public static final String questionConstruireSourcePre1Span41 = " mvn";
	public static final String questionConstruireSourcePre1Span4 = questionConstruireSourcePre1Span41;
	public static final String questionConstruireSourcePre1Span51 = " clean";
	public static final String questionConstruireSourcePre1Span5 = questionConstruireSourcePre1Span51;
	public static final String questionConstruireSourcePre1Span61 = " verify";
	public static final String questionConstruireSourcePre1Span6 = questionConstruireSourcePre1Span61;
	public static final String questionConstruireSourcePre1Span71 = " -DskipTests=true)";
	public static final String questionConstruireSourcePre1Span7 = questionConstruireSourcePre1Span71;
	public static final String questionConstruireSourceOl1Li11 = "(cd";
	public static final String questionConstruireSourceOl1Li1 = questionConstruireSourceOl1Li11;
	public static final String questionConstruireSourceOl1Li21 = "/usr/local/src/eclipse";
	public static final String questionConstruireSourceOl1Li2 = questionConstruireSourceOl1Li21;
	public static final String questionConstruireSourceOl1Li31 = "&&";
	public static final String questionConstruireSourceOl1Li3 = questionConstruireSourceOl1Li31;
	public static final String questionConstruireSourceOl1Li41 = "mvn: The java software project management tool. ";
	public static final String questionConstruireSourceOl1Li4 = questionConstruireSourceOl1Li41;
	public static final String questionConstruireSourceOl1Li51 = "clean: Clean up any previous builds. ";
	public static final String questionConstruireSourceOl1Li5 = questionConstruireSourceOl1Li51;
	public static final String questionConstruireSourceOl1Li61 = "verify: The Maven target to build the eclipse application. ";
	public static final String questionConstruireSourceOl1Li6 = questionConstruireSourceOl1Li61;
	public static final String questionConstruireSourceOl1Li71 = "-DskipTests=true): Skip tests to make the build go faster, but the build will still take a very long time. ";
	public static final String questionConstruireSourceOl1Li7 = questionConstruireSourceOl1Li71;
	public static final String questionConstruireSourceP21 = "Now copy the newly built eclipse application into the destination directory. ";
	public static final String questionConstruireSourceP2 = questionConstruireSourceP21;

	/**	L'entité « questionConstruireSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionConstruireSource = new PageHtml();
	public Couverture<PageHtml> questionConstruireSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionConstruireSource").o(questionConstruireSource);

	/**	<br/>L'entité « questionConstruireSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionConstruireSource">Trouver l'entité questionConstruireSource dans Solr</a>
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
	protected C001L006InstallerEclipse questionConstruireSourceInit() {
		if(questionConstruireSource != null) {
			((C001L006InstallerEclipse)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
			((C001L006InstallerEclipse)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
		}
		if(!questionConstruireSourceCouverture.dejaInitialise) {
			_questionConstruireSource(questionConstruireSource);
		}
		questionConstruireSource.initLoinPourClasse(requeteSite_);
		questionConstruireSourceCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
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
			{ e("span").a("class", " questionConstruireSourcePre1Span1 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span11);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span2 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span21);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span3 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span31);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span4 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span41);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span5 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span51);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span6 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span61);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span7 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span71);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionConstruireSourceOl1 questionConstruireSourceOl odd ").f();
			{ e("li").a("class", " questionConstruireSourceOl1Li1 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li11);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li2 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li21);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li3 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li31);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li4 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li41);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li5 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li51);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li6 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li61);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li7 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li71);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionConstruireSourceP2 questionConstruireSourceP even ").f();
			sx(questionConstruireSourceP21);
		} g("p");
	}
	public void htmlBodyQuestionConstruireSource() {
		questionConstruireSource.htmlAvant();
		htmlBodyQuestionConstruireSource(questionConstruireSource);
		questionConstruireSource.htmlApres();
	}

	////////////////////
	// questionErreur //
	////////////////////

	public static final String questionErreurH3I1 = "far fa-exclamation-square";
	public static final String questionErreurH3I = questionErreurH3I1;
	public static final String questionErreurH3Span1 = "What if my build fails? ";
	public static final String questionErreurH3Span = questionErreurH3Span1;
	public static final String questionErreurH4I1 = "far fa-repeat";
	public static final String questionErreurH4I = questionErreurH4I1;
	public static final String questionErreurH4Span1 = "Try a different tag, clean it up, and try again. ";
	public static final String questionErreurH4Span = questionErreurH4Span1;
	public static final String questionErreurPre1Span11 = "(cd";
	public static final String questionErreurPre1Span1 = questionErreurPre1Span11;
	public static final String questionErreurPre1Span21 = " /usr/local/src/eclipse";
	public static final String questionErreurPre1Span2 = questionErreurPre1Span21;
	public static final String questionErreurPre1Span31 = " &&";
	public static final String questionErreurPre1Span3 = questionErreurPre1Span31;
	public static final String questionErreurPre1Span41 = " git";
	public static final String questionErreurPre1Span4 = questionErreurPre1Span41;
	public static final String questionErreurPre1Span51 = " tag)";
	public static final String questionErreurPre1Span5 = questionErreurPre1Span51;
	public static final String questionErreurPre2Span11 = "(cd";
	public static final String questionErreurPre2Span1 = questionErreurPre2Span11;
	public static final String questionErreurPre2Span21 = " /usr/local/src/eclipse";
	public static final String questionErreurPre2Span2 = questionErreurPre2Span21;
	public static final String questionErreurPre2Span31 = " &&";
	public static final String questionErreurPre2Span3 = questionErreurPre2Span31;
	public static final String questionErreurPre2Span41 = " git";
	public static final String questionErreurPre2Span4 = questionErreurPre2Span41;
	public static final String questionErreurPre2Span51 = " checkout";
	public static final String questionErreurPre2Span5 = questionErreurPre2Span51;
	public static final String questionErreurPre2Span61 = " S4_12_0_M1)";
	public static final String questionErreurPre2Span6 = questionErreurPre2Span61;
	public static final String questionErreurPre3Span011 = "(cd";
	public static final String questionErreurPre3Span01 = questionErreurPre3Span011;
	public static final String questionErreurPre3Span021 = " /usr/local/src/eclipse";
	public static final String questionErreurPre3Span02 = questionErreurPre3Span021;
	public static final String questionErreurPre3Span031 = " &&";
	public static final String questionErreurPre3Span03 = questionErreurPre3Span031;
	public static final String questionErreurPre3Span041 = " git";
	public static final String questionErreurPre3Span04 = questionErreurPre3Span041;
	public static final String questionErreurPre3Span051 = " submodule";
	public static final String questionErreurPre3Span05 = questionErreurPre3Span051;
	public static final String questionErreurPre3Span061 = " foreach";
	public static final String questionErreurPre3Span06 = questionErreurPre3Span061;
	public static final String questionErreurPre3Span071 = " --recursive";
	public static final String questionErreurPre3Span07 = questionErreurPre3Span071;
	public static final String questionErreurPre3Span081 = " git";
	public static final String questionErreurPre3Span08 = questionErreurPre3Span081;
	public static final String questionErreurPre3Span091 = " clean";
	public static final String questionErreurPre3Span09 = questionErreurPre3Span091;
	public static final String questionErreurPre3Span101 = " -f";
	public static final String questionErreurPre3Span10 = questionErreurPre3Span101;
	public static final String questionErreurPre3Span111 = " -d)";
	public static final String questionErreurPre3Span11 = questionErreurPre3Span111;
	public static final String questionErreurOl3Li011 = "(cd";
	public static final String questionErreurOl3Li01 = questionErreurOl3Li011;
	public static final String questionErreurOl3Li021 = "/usr/local/src/eclipse";
	public static final String questionErreurOl3Li02 = questionErreurOl3Li021;
	public static final String questionErreurOl3Li031 = "&&";
	public static final String questionErreurOl3Li03 = questionErreurOl3Li031;
	public static final String questionErreurOl3Li041 = "git";
	public static final String questionErreurOl3Li04 = questionErreurOl3Li041;
	public static final String questionErreurOl3Li051 = "submodule";
	public static final String questionErreurOl3Li05 = questionErreurOl3Li051;
	public static final String questionErreurOl3Li061 = "foreach: Perform the following command for each submodule. ";
	public static final String questionErreurOl3Li06 = questionErreurOl3Li061;
	public static final String questionErreurOl3Li071 = "--recursive";
	public static final String questionErreurOl3Li07 = questionErreurOl3Li071;
	public static final String questionErreurOl3Li081 = "git";
	public static final String questionErreurOl3Li08 = questionErreurOl3Li081;
	public static final String questionErreurOl3Li091 = "clean: Remove untracked files from the working tree. ";
	public static final String questionErreurOl3Li09 = questionErreurOl3Li091;
	public static final String questionErreurOl3Li101 = "-f: Force git to clean the project. ";
	public static final String questionErreurOl3Li10 = questionErreurOl3Li101;
	public static final String questionErreurOl3Li111 = "-d): Remove untracked directories in addition to untracked files. ";
	public static final String questionErreurOl3Li11 = questionErreurOl3Li111;
	public static final String questionErreurPre4Span11 = "(cd";
	public static final String questionErreurPre4Span1 = questionErreurPre4Span11;
	public static final String questionErreurPre4Span21 = " /usr/local/src/eclipse";
	public static final String questionErreurPre4Span2 = questionErreurPre4Span21;
	public static final String questionErreurPre4Span31 = " &&";
	public static final String questionErreurPre4Span3 = questionErreurPre4Span31;
	public static final String questionErreurPre4Span41 = " mvn";
	public static final String questionErreurPre4Span4 = questionErreurPre4Span41;
	public static final String questionErreurPre4Span51 = " clean";
	public static final String questionErreurPre4Span5 = questionErreurPre4Span51;
	public static final String questionErreurPre4Span61 = " verify";
	public static final String questionErreurPre4Span6 = questionErreurPre4Span61;
	public static final String questionErreurPre4Span71 = " -DskipTests=true)";
	public static final String questionErreurPre4Span7 = questionErreurPre4Span71;

	/**	L'entité « questionErreur »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionErreur = new PageHtml();
	public Couverture<PageHtml> questionErreurCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionErreur").o(questionErreur);

	/**	<br/>L'entité « questionErreur »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionErreur">Trouver l'entité questionErreur dans Solr</a>
	 * <br/>
	 * @param questionErreur est l'entité déjà construit. 
	 **/
	protected abstract void _questionErreur(PageHtml o);

	public PageHtml getQuestionErreur() {
		return questionErreur;
	}

	public void setQuestionErreur(PageHtml questionErreur) {
		this.questionErreur = questionErreur;
		this.questionErreurCouverture.dejaInitialise = true;
	}
	protected C001L006InstallerEclipse questionErreurInit() {
		if(questionErreur != null) {
			((C001L006InstallerEclipse)this).avantPagePart(questionErreur, "questionErreur");
			((C001L006InstallerEclipse)this).avantPagePart(questionErreur, "questionErreur");
		}
		if(!questionErreurCouverture.dejaInitialise) {
			_questionErreur(questionErreur);
		}
		questionErreur.initLoinPourClasse(requeteSite_);
		questionErreurCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
	}
	public void htmlBodyQuestionErreur(PageHtml o) {
		{ e("h3").a("class", " questionErreurH3 ").f();
			{ e("i").a("class", questionErreurH3I1, " site-menu-icon questionErreurH3I ").f();
			} g("i");
			{ e("span").a("class", " questionErreurH3Span ").f();
				sx(questionErreurH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionErreurH4 ").f();
			{ e("i").a("class", questionErreurH4I1, " site-menu-icon questionErreurH4I ").f();
			} g("i");
			{ e("span").a("class", " questionErreurH4Span ").f();
				sx(questionErreurH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionErreurPre1 questionErreurPre odd ").f();
			{ e("span").a("class", " questionErreurPre1Span1 questionErreurPre1Span odd ").f();
				sx(questionErreurPre1Span11);
			} g("span");
			{ e("span").a("class", " questionErreurPre1Span2 questionErreurPre1Span even ").f();
				sx(questionErreurPre1Span21);
			} g("span");
			{ e("span").a("class", " questionErreurPre1Span3 questionErreurPre1Span odd ").f();
				sx(questionErreurPre1Span31);
			} g("span");
			{ e("span").a("class", " questionErreurPre1Span4 questionErreurPre1Span even ").f();
				sx(questionErreurPre1Span41);
			} g("span");
			{ e("span").a("class", " questionErreurPre1Span5 questionErreurPre1Span odd ").f();
				sx(questionErreurPre1Span51);
			} g("span");
		} g("pre");
		{ e("pre").a("class", " questionErreurPre2 questionErreurPre even ").f();
			{ e("span").a("class", " questionErreurPre2Span1 questionErreurPre2Span odd ").f();
				sx(questionErreurPre2Span11);
			} g("span");
			{ e("span").a("class", " questionErreurPre2Span2 questionErreurPre2Span even ").f();
				sx(questionErreurPre2Span21);
			} g("span");
			{ e("span").a("class", " questionErreurPre2Span3 questionErreurPre2Span odd ").f();
				sx(questionErreurPre2Span31);
			} g("span");
			{ e("span").a("class", " questionErreurPre2Span4 questionErreurPre2Span even ").f();
				sx(questionErreurPre2Span41);
			} g("span");
			{ e("span").a("class", " questionErreurPre2Span5 questionErreurPre2Span odd ").f();
				sx(questionErreurPre2Span51);
			} g("span");
			{ e("span").a("class", " questionErreurPre2Span6 questionErreurPre2Span even ").f();
				sx(questionErreurPre2Span61);
			} g("span");
		} g("pre");
		{ e("pre").a("class", " questionErreurPre3 questionErreurPre odd ").f();
			{ e("span").a("class", " questionErreurPre3Span01 questionErreurPre3Span odd ").f();
				sx(questionErreurPre3Span011);
			} g("span");
			{ e("span").a("class", " questionErreurPre3Span02 questionErreurPre3Span even ").f();
				sx(questionErreurPre3Span021);
			} g("span");
			{ e("span").a("class", " questionErreurPre3Span03 questionErreurPre3Span odd ").f();
				sx(questionErreurPre3Span031);
			} g("span");
			{ e("span").a("class", " questionErreurPre3Span04 questionErreurPre3Span even ").f();
				sx(questionErreurPre3Span041);
			} g("span");
			{ e("span").a("class", " questionErreurPre3Span05 questionErreurPre3Span odd ").f();
				sx(questionErreurPre3Span051);
			} g("span");
			{ e("span").a("class", " questionErreurPre3Span06 questionErreurPre3Span even ").f();
				sx(questionErreurPre3Span061);
			} g("span");
			{ e("span").a("class", " questionErreurPre3Span07 questionErreurPre3Span odd ").f();
				sx(questionErreurPre3Span071);
			} g("span");
			{ e("span").a("class", " questionErreurPre3Span08 questionErreurPre3Span even ").f();
				sx(questionErreurPre3Span081);
			} g("span");
			{ e("span").a("class", " questionErreurPre3Span09 questionErreurPre3Span odd ").f();
				sx(questionErreurPre3Span091);
			} g("span");
			{ e("span").a("class", " questionErreurPre3Span10 questionErreurPre3Span even ").f();
				sx(questionErreurPre3Span101);
			} g("span");
			{ e("span").a("class", " questionErreurPre3Span11 questionErreurPre3Span odd ").f();
				sx(questionErreurPre3Span111);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionErreurOl3 questionErreurOl odd ").f();
			{ e("li").a("class", " questionErreurOl3Li01 questionErreurOl3Li odd ").f();
				sx(questionErreurOl3Li011);
			} g("li");
			{ e("li").a("class", " questionErreurOl3Li02 questionErreurOl3Li even ").f();
				sx(questionErreurOl3Li021);
			} g("li");
			{ e("li").a("class", " questionErreurOl3Li03 questionErreurOl3Li odd ").f();
				sx(questionErreurOl3Li031);
			} g("li");
			{ e("li").a("class", " questionErreurOl3Li04 questionErreurOl3Li even ").f();
				sx(questionErreurOl3Li041);
			} g("li");
			{ e("li").a("class", " questionErreurOl3Li05 questionErreurOl3Li odd ").f();
				sx(questionErreurOl3Li051);
			} g("li");
			{ e("li").a("class", " questionErreurOl3Li06 questionErreurOl3Li even ").f();
				sx(questionErreurOl3Li061);
			} g("li");
			{ e("li").a("class", " questionErreurOl3Li07 questionErreurOl3Li odd ").f();
				sx(questionErreurOl3Li071);
			} g("li");
			{ e("li").a("class", " questionErreurOl3Li08 questionErreurOl3Li even ").f();
				sx(questionErreurOl3Li081);
			} g("li");
			{ e("li").a("class", " questionErreurOl3Li09 questionErreurOl3Li odd ").f();
				sx(questionErreurOl3Li091);
			} g("li");
			{ e("li").a("class", " questionErreurOl3Li10 questionErreurOl3Li even ").f();
				sx(questionErreurOl3Li101);
			} g("li");
			{ e("li").a("class", " questionErreurOl3Li11 questionErreurOl3Li odd ").f();
				sx(questionErreurOl3Li111);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionErreurPre4 questionErreurPre even ").f();
			{ e("span").a("class", " questionErreurPre4Span1 questionErreurPre4Span odd ").f();
				sx(questionErreurPre4Span11);
			} g("span");
			{ e("span").a("class", " questionErreurPre4Span2 questionErreurPre4Span even ").f();
				sx(questionErreurPre4Span21);
			} g("span");
			{ e("span").a("class", " questionErreurPre4Span3 questionErreurPre4Span odd ").f();
				sx(questionErreurPre4Span31);
			} g("span");
			{ e("span").a("class", " questionErreurPre4Span4 questionErreurPre4Span even ").f();
				sx(questionErreurPre4Span41);
			} g("span");
			{ e("span").a("class", " questionErreurPre4Span5 questionErreurPre4Span odd ").f();
				sx(questionErreurPre4Span51);
			} g("span");
			{ e("span").a("class", " questionErreurPre4Span6 questionErreurPre4Span even ").f();
				sx(questionErreurPre4Span61);
			} g("span");
			{ e("span").a("class", " questionErreurPre4Span7 questionErreurPre4Span odd ").f();
				sx(questionErreurPre4Span71);
			} g("span");
		} g("pre");
	}
	public void htmlBodyQuestionErreur() {
		questionErreur.htmlAvant();
		htmlBodyQuestionErreur(questionErreur);
		questionErreur.htmlApres();
	}

	//////////////////////////
	// questionCopierSource //
	//////////////////////////

	public static final String questionCopierSourceH3I1 = "far fa-copy";
	public static final String questionCopierSourceH3I = questionCopierSourceH3I1;
	public static final String questionCopierSourceH3Span1 = "How would I copy the new eclipse build into the right location? ";
	public static final String questionCopierSourceH3Span = questionCopierSourceH3Span1;
	public static final String questionCopierSourceH4I1 = "far fa-sync-alt";
	public static final String questionCopierSourceH4I = questionCopierSourceH4I1;
	public static final String questionCopierSourceH4Span1 = "Use rsync. ";
	public static final String questionCopierSourceH4Span = questionCopierSourceH4Span1;
	public static final String questionCopierSourcePre2Span11 = "rsync";
	public static final String questionCopierSourcePre2Span1 = questionCopierSourcePre2Span11;
	public static final String questionCopierSourcePre2Span21 = " -r";
	public static final String questionCopierSourcePre2Span2 = questionCopierSourcePre2Span21;
	public static final String questionCopierSourcePre2Span31 = " /usr/local/src/eclipse/eclipse.platform.releng.tychoeclipsebuilder/sdk/target/products/org.eclipse.sdk.ide/linux/gtk/x86_64/eclipse/";
	public static final String questionCopierSourcePre2Span3 = questionCopierSourcePre2Span31;
	public static final String questionCopierSourcePre2Span41 = " /opt/eclipse/";
	public static final String questionCopierSourcePre2Span4 = questionCopierSourcePre2Span41;
	public static final String questionCopierSourceOl2Li11 = "rsync: a fast, versatile, remote (and local) file-copying tool. ";
	public static final String questionCopierSourceOl2Li1 = questionCopierSourceOl2Li11;
	public static final String questionCopierSourceOl2Li21 = "-r: Recurse into directories. ";
	public static final String questionCopierSourceOl2Li2 = questionCopierSourceOl2Li21;
	public static final String questionCopierSourceOl2Li31 = "The directory where the eclipse application was built. ";
	public static final String questionCopierSourceOl2Li32 = "Don't forget the ending slash or rsync assumes it's a file inside the destination. ";
	public static final String questionCopierSourceOl2Li3 = questionCopierSourceOl2Li31 + questionCopierSourceOl2Li32;
	public static final String questionCopierSourceOl2Li41 = "/opt/eclipse/: The directory where the eclipse will be installed. ";
	public static final String questionCopierSourceOl2Li42 = "/opt/eclipse/: It's best to always write directories with a trailing slash in rsync for fewer surprises. ";
	public static final String questionCopierSourceOl2Li4 = questionCopierSourceOl2Li41 + questionCopierSourceOl2Li42;

	/**	L'entité « questionCopierSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCopierSource = new PageHtml();
	public Couverture<PageHtml> questionCopierSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCopierSource").o(questionCopierSource);

	/**	<br/>L'entité « questionCopierSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCopierSource">Trouver l'entité questionCopierSource dans Solr</a>
	 * <br/>
	 * @param questionCopierSource est l'entité déjà construit. 
	 **/
	protected abstract void _questionCopierSource(PageHtml o);

	public PageHtml getQuestionCopierSource() {
		return questionCopierSource;
	}

	public void setQuestionCopierSource(PageHtml questionCopierSource) {
		this.questionCopierSource = questionCopierSource;
		this.questionCopierSourceCouverture.dejaInitialise = true;
	}
	protected C001L006InstallerEclipse questionCopierSourceInit() {
		if(questionCopierSource != null) {
			((C001L006InstallerEclipse)this).avantPagePart(questionCopierSource, "questionCopierSource");
			((C001L006InstallerEclipse)this).avantPagePart(questionCopierSource, "questionCopierSource");
		}
		if(!questionCopierSourceCouverture.dejaInitialise) {
			_questionCopierSource(questionCopierSource);
		}
		questionCopierSource.initLoinPourClasse(requeteSite_);
		questionCopierSourceCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
	}
	public void htmlBodyQuestionCopierSource(PageHtml o) {
		{ e("h3").a("class", " questionCopierSourceH3 ").f();
			{ e("i").a("class", questionCopierSourceH3I1, " site-menu-icon questionCopierSourceH3I ").f();
			} g("i");
			{ e("span").a("class", " questionCopierSourceH3Span ").f();
				sx(questionCopierSourceH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionCopierSourceH4 ").f();
			{ e("i").a("class", questionCopierSourceH4I1, " site-menu-icon questionCopierSourceH4I ").f();
			} g("i");
			{ e("span").a("class", " questionCopierSourceH4Span ").f();
				sx(questionCopierSourceH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionCopierSourcePre2 questionCopierSourcePre even ").f();
			{ e("span").a("class", " questionCopierSourcePre2Span1 questionCopierSourcePre2Span odd ").f();
				sx(questionCopierSourcePre2Span11);
			} g("span");
			{ e("span").a("class", " questionCopierSourcePre2Span2 questionCopierSourcePre2Span even ").f();
				sx(questionCopierSourcePre2Span21);
			} g("span");
			{ e("span").a("class", " questionCopierSourcePre2Span3 questionCopierSourcePre2Span odd ").f();
				sx(questionCopierSourcePre2Span31);
			} g("span");
			{ e("span").a("class", " questionCopierSourcePre2Span4 questionCopierSourcePre2Span even ").f();
				sx(questionCopierSourcePre2Span41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCopierSourceOl2 questionCopierSourceOl even ").f();
			{ e("li").a("class", " questionCopierSourceOl2Li1 questionCopierSourceOl2Li odd ").f();
				sx(questionCopierSourceOl2Li11);
			} g("li");
			{ e("li").a("class", " questionCopierSourceOl2Li2 questionCopierSourceOl2Li even ").f();
				sx(questionCopierSourceOl2Li21);
			} g("li");
			{ e("li").a("class", " questionCopierSourceOl2Li3 questionCopierSourceOl2Li odd ").f();
				sx(questionCopierSourceOl2Li31);
				sx(questionCopierSourceOl2Li32);
			} g("li");
			{ e("li").a("class", " questionCopierSourceOl2Li4 questionCopierSourceOl2Li even ").f();
				sx(questionCopierSourceOl2Li41);
				sx(questionCopierSourceOl2Li42);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionCopierSource() {
		questionCopierSource.htmlAvant();
		htmlBodyQuestionCopierSource(questionCopierSource);
		questionCopierSource.htmlApres();
	}

	/////////////////////////////////
	// questionSauvegardeRemplacer //
	/////////////////////////////////

	public static final String questionSauvegardeRemplacerH3I1 = "far fa-image";
	public static final String questionSauvegardeRemplacerH3I = questionSauvegardeRemplacerH3I1;
	public static final String questionSauvegardeRemplacerH3Span1 = "How do I make an application icon to run eclipse? ";
	public static final String questionSauvegardeRemplacerH3Span = questionSauvegardeRemplacerH3Span1;
	public static final String questionSauvegardeRemplacerH4I1 = "far fa-file-alt";
	public static final String questionSauvegardeRemplacerH4I = questionSauvegardeRemplacerH4I1;
	public static final String questionSauvegardeRemplacerH4Span1 = "Create an eclipse.desktop file in /usr/share/applications. ";
	public static final String questionSauvegardeRemplacerH4Span = questionSauvegardeRemplacerH4Span1;
	public static final String questionSauvegardeRemplacerPre1Span011 = "echo";
	public static final String questionSauvegardeRemplacerPre1Span01 = questionSauvegardeRemplacerPre1Span011;
	public static final String questionSauvegardeRemplacerPre1Span021 = " '";
	public static final String questionSauvegardeRemplacerPre1Span02 = questionSauvegardeRemplacerPre1Span021;
	public static final String questionSauvegardeRemplacerPre1Span031 = "[Desktop Entry]";
	public static final String questionSauvegardeRemplacerPre1Span03 = questionSauvegardeRemplacerPre1Span031;
	public static final String questionSauvegardeRemplacerPre1Span04Br1 = "Type=Application";
	public static final String questionSauvegardeRemplacerPre1Span04Br = questionSauvegardeRemplacerPre1Span04Br1;
	public static final String questionSauvegardeRemplacerPre1Span05Br1 = "Name=Eclipse";
	public static final String questionSauvegardeRemplacerPre1Span05Br = questionSauvegardeRemplacerPre1Span05Br1;
	public static final String questionSauvegardeRemplacerPre1Span06Br1 = "Comment=Eclipse Integrated Development Environment";
	public static final String questionSauvegardeRemplacerPre1Span06Br = questionSauvegardeRemplacerPre1Span06Br1;
	public static final String questionSauvegardeRemplacerPre1Span07Br1 = "Icon=/opt/eclipse/icon.xpm";
	public static final String questionSauvegardeRemplacerPre1Span07Br = questionSauvegardeRemplacerPre1Span07Br1;
	public static final String questionSauvegardeRemplacerPre1Span08Br1 = "Exec=/opt/eclipse/eclipse";
	public static final String questionSauvegardeRemplacerPre1Span08Br = questionSauvegardeRemplacerPre1Span08Br1;
	public static final String questionSauvegardeRemplacerPre1Span09Br1 = "Terminal=false";
	public static final String questionSauvegardeRemplacerPre1Span09Br = questionSauvegardeRemplacerPre1Span09Br1;
	public static final String questionSauvegardeRemplacerPre1Span10Br1 = "Categories=Development;IDE;Java;";
	public static final String questionSauvegardeRemplacerPre1Span10Br = questionSauvegardeRemplacerPre1Span10Br1;
	public static final String questionSauvegardeRemplacerPre1Span11Br1 = "'";
	public static final String questionSauvegardeRemplacerPre1Span11Br = questionSauvegardeRemplacerPre1Span11Br1;
	public static final String questionSauvegardeRemplacerPre1Span121 = " |";
	public static final String questionSauvegardeRemplacerPre1Span12 = questionSauvegardeRemplacerPre1Span121;
	public static final String questionSauvegardeRemplacerPre1Span131 = " sudo";
	public static final String questionSauvegardeRemplacerPre1Span13 = questionSauvegardeRemplacerPre1Span131;
	public static final String questionSauvegardeRemplacerPre1Span141 = " tee";
	public static final String questionSauvegardeRemplacerPre1Span14 = questionSauvegardeRemplacerPre1Span141;
	public static final String questionSauvegardeRemplacerPre1Span151 = " /usr/share/applications/eclipse.desktop";
	public static final String questionSauvegardeRemplacerPre1Span15 = questionSauvegardeRemplacerPre1Span151;
	public static final String questionSauvegardeRemplacerP11 = "Like that, you can now find Eclipse in your applications! ";
	public static final String questionSauvegardeRemplacerP1 = questionSauvegardeRemplacerP11;

	/**	L'entité « questionSauvegardeRemplacer »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSauvegardeRemplacer = new PageHtml();
	public Couverture<PageHtml> questionSauvegardeRemplacerCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSauvegardeRemplacer").o(questionSauvegardeRemplacer);

	/**	<br/>L'entité « questionSauvegardeRemplacer »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSauvegardeRemplacer">Trouver l'entité questionSauvegardeRemplacer dans Solr</a>
	 * <br/>
	 * @param questionSauvegardeRemplacer est l'entité déjà construit. 
	 **/
	protected abstract void _questionSauvegardeRemplacer(PageHtml o);

	public PageHtml getQuestionSauvegardeRemplacer() {
		return questionSauvegardeRemplacer;
	}

	public void setQuestionSauvegardeRemplacer(PageHtml questionSauvegardeRemplacer) {
		this.questionSauvegardeRemplacer = questionSauvegardeRemplacer;
		this.questionSauvegardeRemplacerCouverture.dejaInitialise = true;
	}
	protected C001L006InstallerEclipse questionSauvegardeRemplacerInit() {
		if(questionSauvegardeRemplacer != null) {
			((C001L006InstallerEclipse)this).avantPagePart(questionSauvegardeRemplacer, "questionSauvegardeRemplacer");
			((C001L006InstallerEclipse)this).avantPagePart(questionSauvegardeRemplacer, "questionSauvegardeRemplacer");
		}
		if(!questionSauvegardeRemplacerCouverture.dejaInitialise) {
			_questionSauvegardeRemplacer(questionSauvegardeRemplacer);
		}
		questionSauvegardeRemplacer.initLoinPourClasse(requeteSite_);
		questionSauvegardeRemplacerCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
	}
	public void htmlBodyQuestionSauvegardeRemplacer(PageHtml o) {
		{ e("h3").a("class", " questionSauvegardeRemplacerH3 ").f();
			{ e("i").a("class", questionSauvegardeRemplacerH3I1, " site-menu-icon questionSauvegardeRemplacerH3I ").f();
			} g("i");
			{ e("span").a("class", " questionSauvegardeRemplacerH3Span ").f();
				sx(questionSauvegardeRemplacerH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionSauvegardeRemplacerH4 ").f();
			{ e("i").a("class", questionSauvegardeRemplacerH4I1, " site-menu-icon questionSauvegardeRemplacerH4I ").f();
			} g("i");
			{ e("span").a("class", " questionSauvegardeRemplacerH4Span ").f();
				sx(questionSauvegardeRemplacerH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionSauvegardeRemplacerPre1 questionSauvegardeRemplacerPre odd ").f();
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span01 questionSauvegardeRemplacerPre1Span odd ").f();
				sx(questionSauvegardeRemplacerPre1Span011);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span02 questionSauvegardeRemplacerPre1Span even ").f();
				sx(questionSauvegardeRemplacerPre1Span021);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span03 questionSauvegardeRemplacerPre1Span odd ").f();
				sx(questionSauvegardeRemplacerPre1Span031);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span04 questionSauvegardeRemplacerPre1Span even ").f();
				e("br").fg();
				sx(questionSauvegardeRemplacerPre1Span04Br1);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span05 questionSauvegardeRemplacerPre1Span odd ").f();
				e("br").fg();
				sx(questionSauvegardeRemplacerPre1Span05Br1);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span06 questionSauvegardeRemplacerPre1Span even ").f();
				e("br").fg();
				sx(questionSauvegardeRemplacerPre1Span06Br1);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span07 questionSauvegardeRemplacerPre1Span odd ").f();
				e("br").fg();
				sx(questionSauvegardeRemplacerPre1Span07Br1);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span08 questionSauvegardeRemplacerPre1Span even ").f();
				e("br").fg();
				sx(questionSauvegardeRemplacerPre1Span08Br1);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span09 questionSauvegardeRemplacerPre1Span odd ").f();
				e("br").fg();
				sx(questionSauvegardeRemplacerPre1Span09Br1);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span10 questionSauvegardeRemplacerPre1Span even ").f();
				e("br").fg();
				sx(questionSauvegardeRemplacerPre1Span10Br1);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span11 questionSauvegardeRemplacerPre1Span odd ").f();
				e("br").fg();
				sx(questionSauvegardeRemplacerPre1Span11Br1);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span12 questionSauvegardeRemplacerPre1Span even ").f();
				sx(questionSauvegardeRemplacerPre1Span121);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span13 questionSauvegardeRemplacerPre1Span odd ").f();
				sx(questionSauvegardeRemplacerPre1Span131);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span14 questionSauvegardeRemplacerPre1Span even ").f();
				sx(questionSauvegardeRemplacerPre1Span141);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span15 questionSauvegardeRemplacerPre1Span odd ").f();
				sx(questionSauvegardeRemplacerPre1Span151);
			} g("span");
		} g("pre");
		{ e("p").a("class", " questionSauvegardeRemplacerP1 questionSauvegardeRemplacerP odd ").f();
			sx(questionSauvegardeRemplacerP11);
		} g("p");
	}
	public void htmlBodyQuestionSauvegardeRemplacer() {
		questionSauvegardeRemplacer.htmlAvant();
		htmlBodyQuestionSauvegardeRemplacer(questionSauvegardeRemplacer);
		questionSauvegardeRemplacer.htmlApres();
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
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
	protected C001L006InstallerEclipse recapituler1Init() {
		if(recapituler1 != null) {
			((C001L006InstallerEclipse)this).avantPagePart(recapituler1, "recapituler1");
			((C001L006InstallerEclipse)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
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
	public static final String recapituler2TableTr1Td2I1 = "far fa-eclipse";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "far fa-file-code";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "far fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "May 9 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "How do I install the latest version of eclipse. ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "Install eclipse from the source code. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
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
	protected C001L006InstallerEclipse recapituler2Init() {
		if(recapituler2 != null) {
			((C001L006InstallerEclipse)this).avantPagePart(recapituler2, "recapituler2");
			((C001L006InstallerEclipse)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
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
	public static final String recapituler3TableTr02Td21 = "How do I install the dependencies for Eclipse? ";
	public static final String recapituler3TableTr02Td2 = recapituler3TableTr02Td21;
	public static final String recapituler3TableTr02Td3Span1I1 = "far fa-cookie";
	public static final String recapituler3TableTr02Td3Span1I = recapituler3TableTr02Td3Span1I1;
	public static final String recapituler3TableTr02Td41 = "Build the dependencies with yum. ";
	public static final String recapituler3TableTr02Td4 = recapituler3TableTr02Td41;
	public static final String recapituler3TableTr03Td1I1 = "far fa-files-medical";
	public static final String recapituler3TableTr03Td1I = recapituler3TableTr03Td1I1;
	public static final String recapituler3TableTr03Td21 = "Where do I put the Eclipse source code? ";
	public static final String recapituler3TableTr03Td2 = recapituler3TableTr03Td21;
	public static final String recapituler3TableTr03Td3I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr03Td3I = recapituler3TableTr03Td3I1;
	public static final String recapituler3TableTr03Td41 = "Create a eclipse directory in /usr/local/src. ";
	public static final String recapituler3TableTr03Td4 = recapituler3TableTr03Td41;
	public static final String recapituler3TableTr04Td1I1 = "far fa-map-pin";
	public static final String recapituler3TableTr04Td1I = recapituler3TableTr04Td1I1;
	public static final String recapituler3TableTr04Td21 = "Where do I install Eclipse? ";
	public static final String recapituler3TableTr04Td2 = recapituler3TableTr04Td21;
	public static final String recapituler3TableTr04Td3Span1I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr04Td3Span1I = recapituler3TableTr04Td3Span1I1;
	public static final String recapituler3TableTr04Td41 = "Create a eclipse directory in /opt. ";
	public static final String recapituler3TableTr04Td4 = recapituler3TableTr04Td41;
	public static final String recapituler3TableTr05Td1I1 = "far fa-cloud-download";
	public static final String recapituler3TableTr05Td1I = recapituler3TableTr05Td1I1;
	public static final String recapituler3TableTr05Td21 = "How do I download the eclipse source code? ";
	public static final String recapituler3TableTr05Td2 = recapituler3TableTr05Td21;
	public static final String recapituler3TableTr05Td3I1 = "fab fa-git";
	public static final String recapituler3TableTr05Td3I = recapituler3TableTr05Td3I1;
	public static final String recapituler3TableTr05Td41 = "Clone the source code with the git command. ";
	public static final String recapituler3TableTr05Td4 = recapituler3TableTr05Td41;
	public static final String recapituler3TableTr06Td1I1 = "far fa-code-branch";
	public static final String recapituler3TableTr06Td1I = recapituler3TableTr06Td1I1;
	public static final String recapituler3TableTr06Td21 = "How do I pick a recent version of Eclipse? ";
	public static final String recapituler3TableTr06Td2 = recapituler3TableTr06Td21;
	public static final String recapituler3TableTr06Td3I1 = "far fa-tag";
	public static final String recapituler3TableTr06Td3I = recapituler3TableTr06Td3I1;
	public static final String recapituler3TableTr06Td41 = "List all the tags in the git repository. ";
	public static final String recapituler3TableTr06Td4 = recapituler3TableTr06Td41;
	public static final String recapituler3TableTr07Td1I1 = "far fa-code-merge";
	public static final String recapituler3TableTr07Td1I = recapituler3TableTr07Td1I1;
	public static final String recapituler3TableTr07Td21 = "How do I switch versions of the eclipse source code? ";
	public static final String recapituler3TableTr07Td2 = recapituler3TableTr07Td21;
	public static final String recapituler3TableTr07Td3I1 = "far fa-code-commit";
	public static final String recapituler3TableTr07Td3I = recapituler3TableTr07Td3I1;
	public static final String recapituler3TableTr07Td41 = "Checkout the git tag. ";
	public static final String recapituler3TableTr07Td4 = recapituler3TableTr07Td41;
	public static final String recapituler3TableTr08Td1I1 = "far fa-retweet";
	public static final String recapituler3TableTr08Td1I = recapituler3TableTr08Td1I1;
	public static final String recapituler3TableTr08Td21 = "How do I pull in all the Eclipse dependencies? ";
	public static final String recapituler3TableTr08Td2 = recapituler3TableTr08Td21;
	public static final String recapituler3TableTr08Td3I1 = "far fa-sitemap";
	public static final String recapituler3TableTr08Td3I = recapituler3TableTr08Td3I1;
	public static final String recapituler3TableTr08Td41 = "Update the submodules with git. ";
	public static final String recapituler3TableTr08Td4 = recapituler3TableTr08Td41;
	public static final String recapituler3TableTr09Td1I1 = "far fa-tools";
	public static final String recapituler3TableTr09Td1I = recapituler3TableTr09Td1I1;
	public static final String recapituler3TableTr09Td21 = "How do I build the eclipse source code? ";
	public static final String recapituler3TableTr09Td2 = recapituler3TableTr09Td21;
	public static final String recapituler3TableTr09Td3I1 = "far fa-terminal";
	public static final String recapituler3TableTr09Td3I = recapituler3TableTr09Td3I1;
	public static final String recapituler3TableTr09Td41 = "Build Eclipse with the mvn command. ";
	public static final String recapituler3TableTr09Td4 = recapituler3TableTr09Td41;
	public static final String recapituler3TableTr10TdI1 = "far fa-exclamation-square";
	public static final String recapituler3TableTr10TdI = recapituler3TableTr10TdI1;
	public static final String recapituler3TableTr10Td21 = "What if my build fails? ";
	public static final String recapituler3TableTr10Td2 = recapituler3TableTr10Td21;
	public static final String recapituler3TableTr10Td3I1 = "far fa-repeat";
	public static final String recapituler3TableTr10Td3I = recapituler3TableTr10Td3I1;
	public static final String recapituler3TableTr10Td41 = "Try a different tag, clean it up, and try again. ";
	public static final String recapituler3TableTr10Td4 = recapituler3TableTr10Td41;
	public static final String recapituler3TableTr11TdI1 = "far fa-copy";
	public static final String recapituler3TableTr11TdI = recapituler3TableTr11TdI1;
	public static final String recapituler3TableTr11Td21 = "How would I copy the new eclipse build into the right location? ";
	public static final String recapituler3TableTr11Td2 = recapituler3TableTr11Td21;
	public static final String recapituler3TableTr11Td3I1 = "far fa-sync-alt";
	public static final String recapituler3TableTr11Td3I = recapituler3TableTr11Td3I1;
	public static final String recapituler3TableTr11Td41 = "Use rsync. ";
	public static final String recapituler3TableTr11Td4 = recapituler3TableTr11Td41;
	public static final String recapituler3TableTr12Td1I1 = "far fa-image";
	public static final String recapituler3TableTr12Td1I = recapituler3TableTr12Td1I1;
	public static final String recapituler3TableTr12Td21 = "How do I make an application icon to run eclipse? ";
	public static final String recapituler3TableTr12Td2 = recapituler3TableTr12Td21;
	public static final String recapituler3TableTr12Td3I1 = "far fa-file-alt";
	public static final String recapituler3TableTr12Td3I = recapituler3TableTr12Td3I1;
	public static final String recapituler3TableTr12Td41 = "Create an eclipse.desktop file in /usr/share/applications. ";
	public static final String recapituler3TableTr12Td4 = recapituler3TableTr12Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
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
	protected C001L006InstallerEclipse recapituler3Init() {
		if(recapituler3 != null) {
			((C001L006InstallerEclipse)this).avantPagePart(recapituler3, "recapituler3");
			((C001L006InstallerEclipse)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L006InstallerEclipse)this;
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
				{ e("td").a("class", " w3-mobile recapituler3TableTr10Td ").f();
					{ e("i").a("class", recapituler3TableTr10TdI1, " site-menu-icon recapituler3TableTr10TdI ").f();
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
				{ e("td").a("class", " w3-mobile recapituler3TableTr11Td ").f();
					{ e("i").a("class", recapituler3TableTr11TdI1, " site-menu-icon recapituler3TableTr11TdI ").f();
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

	protected boolean dejaInitialiseC001L006InstallerEclipse = false;

	public C001L006InstallerEclipse initLoinC001L006InstallerEclipse(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L006InstallerEclipse) {
			dejaInitialiseC001L006InstallerEclipse = true;
			initLoinC001L006InstallerEclipse();
		}
		return (C001L006InstallerEclipse)this;
	}

	public void initLoinC001L006InstallerEclipse() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L006InstallerEclipse();
	}

	public void initC001L006InstallerEclipse() {
		moiInit();
		questionDependencesInit();
		questionMkdirSrcInit();
		questionMkdirEclipseInit();
		questionClonerSourceInit();
		questionListerTagsInit();
		questionCheckoutTagInit();
		questionSousModulesInit();
		questionConstruireSourceInit();
		questionErreurInit();
		questionCopierSourceInit();
		questionSauvegardeRemplacerInit();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L006InstallerEclipse(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L006InstallerEclipse(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(questionDependences != null)
			questionDependences.setRequeteSite_(requeteSite_);
		if(questionMkdirSrc != null)
			questionMkdirSrc.setRequeteSite_(requeteSite_);
		if(questionMkdirEclipse != null)
			questionMkdirEclipse.setRequeteSite_(requeteSite_);
		if(questionClonerSource != null)
			questionClonerSource.setRequeteSite_(requeteSite_);
		if(questionListerTags != null)
			questionListerTags.setRequeteSite_(requeteSite_);
		if(questionCheckoutTag != null)
			questionCheckoutTag.setRequeteSite_(requeteSite_);
		if(questionSousModules != null)
			questionSousModules.setRequeteSite_(requeteSite_);
		if(questionConstruireSource != null)
			questionConstruireSource.setRequeteSite_(requeteSite_);
		if(questionErreur != null)
			questionErreur.setRequeteSite_(requeteSite_);
		if(questionCopierSource != null)
			questionCopierSource.setRequeteSite_(requeteSite_);
		if(questionSauvegardeRemplacer != null)
			questionSauvegardeRemplacer.setRequeteSite_(requeteSite_);
		if(recapituler1 != null)
			recapituler1.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L006InstallerEclipse(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L006InstallerEclipse(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L006InstallerEclipse(String var) {
		C001L006InstallerEclipse oC001L006InstallerEclipse = (C001L006InstallerEclipse)this;
		switch(var) {
			case "moi":
				return oC001L006InstallerEclipse.moi;
			case "questionDependences":
				return oC001L006InstallerEclipse.questionDependences;
			case "questionMkdirSrc":
				return oC001L006InstallerEclipse.questionMkdirSrc;
			case "questionMkdirEclipse":
				return oC001L006InstallerEclipse.questionMkdirEclipse;
			case "questionClonerSource":
				return oC001L006InstallerEclipse.questionClonerSource;
			case "questionListerTags":
				return oC001L006InstallerEclipse.questionListerTags;
			case "questionCheckoutTag":
				return oC001L006InstallerEclipse.questionCheckoutTag;
			case "questionSousModules":
				return oC001L006InstallerEclipse.questionSousModules;
			case "questionConstruireSource":
				return oC001L006InstallerEclipse.questionConstruireSource;
			case "questionErreur":
				return oC001L006InstallerEclipse.questionErreur;
			case "questionCopierSource":
				return oC001L006InstallerEclipse.questionCopierSource;
			case "questionSauvegardeRemplacer":
				return oC001L006InstallerEclipse.questionSauvegardeRemplacer;
			case "recapituler1":
				return oC001L006InstallerEclipse.recapituler1;
			case "recapituler2":
				return oC001L006InstallerEclipse.recapituler2;
			case "recapituler3":
				return oC001L006InstallerEclipse.recapituler3;
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
				o = attribuerC001L006InstallerEclipse(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L006InstallerEclipse(String var, Object val) {
		C001L006InstallerEclipse oC001L006InstallerEclipse = (C001L006InstallerEclipse)this;
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
					o = definirC001L006InstallerEclipse(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L006InstallerEclipse(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/006-comment-installer-eclipse?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/006-comment-installer-eclipse-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/006-comment-installer-eclipse-999.png"));
				System.out.println("C001L006InstallerEclipseFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/006-how-to-install-eclipse?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/006-how-to-install-eclipse-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/006-how-to-install-eclipse-999.png"));
				System.out.println("C001L006InstallerEclipseEnUSPage");
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L006InstallerEclipse o = new C001L006InstallerEclipse();
			o.requeteSiteC001L006InstallerEclipse(requeteSite);
			o.initLoinC001L006InstallerEclipse(requeteSite);
			o.indexerC001L006InstallerEclipse();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001L006InstallerEclipse();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001L006InstallerEclipse(document);
	}

	public void indexerC001L006InstallerEclipse(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L006InstallerEclipse(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L006InstallerEclipse() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L006InstallerEclipse(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L006InstallerEclipse(SolrInputDocument document) {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L006InstallerEclipse() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinC001L006InstallerEclipse(siteContexte.getRequeteSite_());
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
		stockerC001L006InstallerEclipse(solrDocument);
	}
	public void stockerC001L006InstallerEclipse(SolrDocument solrDocument) {
		C001L006InstallerEclipse oC001L006InstallerEclipse = (C001L006InstallerEclipse)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L006InstallerEclipse();
	}

	public void htmlBodyCourtC001L006InstallerEclipse() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(questionDependences != null)
			questionDependences.htmlBodyCourt();
		if(questionMkdirSrc != null)
			questionMkdirSrc.htmlBodyCourt();
		if(questionMkdirEclipse != null)
			questionMkdirEclipse.htmlBodyCourt();
		if(questionClonerSource != null)
			questionClonerSource.htmlBodyCourt();
		if(questionListerTags != null)
			questionListerTags.htmlBodyCourt();
		if(questionCheckoutTag != null)
			questionCheckoutTag.htmlBodyCourt();
		if(questionSousModules != null)
			questionSousModules.htmlBodyCourt();
		if(questionConstruireSource != null)
			questionConstruireSource.htmlBodyCourt();
		if(questionErreur != null)
			questionErreur.htmlBodyCourt();
		if(questionCopierSource != null)
			questionCopierSource.htmlBodyCourt();
		if(questionSauvegardeRemplacer != null)
			questionSauvegardeRemplacer.htmlBodyCourt();
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
		htmlBodyC001L006InstallerEclipse();
		super.htmlBody();
	}

	public void htmlBodyC001L006InstallerEclipse() {
		((C001L006InstallerEclipse)this).htmlBodyMoi();
		((C001L006InstallerEclipse)this).htmlBodyQuestionDependences();
		((C001L006InstallerEclipse)this).htmlBodyQuestionMkdirSrc();
		((C001L006InstallerEclipse)this).htmlBodyQuestionMkdirEclipse();
		((C001L006InstallerEclipse)this).htmlBodyQuestionClonerSource();
		((C001L006InstallerEclipse)this).htmlBodyQuestionListerTags();
		((C001L006InstallerEclipse)this).htmlBodyQuestionCheckoutTag();
		((C001L006InstallerEclipse)this).htmlBodyQuestionSousModules();
		((C001L006InstallerEclipse)this).htmlBodyQuestionConstruireSource();
		((C001L006InstallerEclipse)this).htmlBodyQuestionErreur();
		((C001L006InstallerEclipse)this).htmlBodyQuestionCopierSource();
		((C001L006InstallerEclipse)this).htmlBodyQuestionSauvegardeRemplacer();
		((C001L006InstallerEclipse)this).htmlBodyRecapituler1();
		((C001L006InstallerEclipse)this).htmlBodyRecapituler2();
		((C001L006InstallerEclipse)this).htmlBodyRecapituler3();
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
		if(!(o instanceof C001L006InstallerEclipse))
			return false;
		C001L006InstallerEclipse that = (C001L006InstallerEclipse)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L006InstallerEclipse {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L006InstallerEclipseVals = new String[] { moiP1, moiP2, moiP3, moiP4, moiP5, moiP6, questionDependencesH3I1, questionDependencesH3Span1, questionDependencesH4I1, questionDependencesH4Span1, questionDependencesOl2Li11, questionDependencesOl2Li12, questionDependencesOl2Li21, questionDependencesOl2Li22, questionDependencesOl2Li31, questionDependencesOl2Li41, questionDependencesPre3Span11, questionDependencesPre3Span21, questionDependencesPre3Span31, questionDependencesPre3Span41, questionDependencesPre3Span51, questionDependencesOl4Li11, questionDependencesOl4Li21, questionDependencesOl4Li31, questionDependencesOl4Li41, questionDependencesOl4Li51, questionMkdirSrcH3I1, questionMkdirSrcH3Span1, questionMkdirSrcH4I1, questionMkdirSrcH4Span1, questionMkdirSrcPreSpan11, questionMkdirSrcPreSpan21, questionMkdirSrcPreSpan31, questionMkdirSrcPreSpan41, questionMkdirSrcPreSpan51, questionMkdirSrcPreSpan61, questionMkdirSrcPreSpan71, questionMkdirSrcPreSpan81, questionMkdirSrcOl2Li11, questionMkdirSrcOl2Li21, questionMkdirSrcOl2Li31, questionMkdirSrcOl2Li41, questionMkdirSrcOl2Li51, questionMkdirSrcOl2Li61, questionMkdirSrcOl2Li71, questionMkdirSrcOl2Li81, questionMkdirSrcOl2Li82, questionMkdirEclipseH3I1, questionMkdirEclipseH3Span1, questionMkdirEclipseH4I1, questionMkdirEclipseH4Span1, questionMkdirEclipsePreSpan11, questionMkdirEclipsePreSpan21, questionMkdirEclipsePreSpan31, questionMkdirEclipsePreSpan41, questionMkdirEclipsePreSpan51, questionMkdirEclipsePreSpan61, questionMkdirEclipsePreSpan71, questionMkdirEclipsePreSpan81, questionMkdirEclipseOl2Li11, questionMkdirEclipseOl2Li21, questionMkdirEclipseOl2Li31, questionMkdirEclipseOl2Li41, questionMkdirEclipseOl2Li51, questionMkdirEclipseOl2Li61, questionMkdirEclipseOl2Li71, questionMkdirEclipseOl2Li81, questionClonerSourceH3I1, questionClonerSourceH3Span1, questionClonerSourceH4I1, questionClonerSourceH4Span1, questionClonerSourcePreSpan11, questionClonerSourcePreSpan21, questionClonerSourcePreSpan31, questionClonerSourcePreSpan41, questionClonerSourceOl2Li11, questionClonerSourceOl2Li21, questionClonerSourceOl2Li31, questionClonerSourceOl2Li41, questionListerTagsH3I1, questionListerTagsH3Span1, questionListerTagsH4I1, questionListerTagsH4Span1, questionListerTagsPreSpan11, questionListerTagsPreSpan21, questionListerTagsPreSpan31, questionListerTagsPreSpan41, questionListerTagsPreSpan51, questionListerTagsOl1Li11, questionListerTagsOl1Li21, questionListerTagsOl1Li31, questionListerTagsOl1Li41, questionListerTagsOl1Li51, questionListerTagsP1Span11, questionListerTagsP1A21, questionListerTagsP1Span31, questionListerTagsP1Span32, questionListerTagsP1Span33, questionListerTagsP1Span34, questionListerTagsP2Span31, questionListerTagsP2A21, questionListerTagsP2Span21, questionListerTagsP2Span22, questionCheckoutTagH3I1, questionCheckoutTagH3Span1, questionCheckoutTagH4I1, questionCheckoutTagH4Span1, questionCheckoutTagPreSpan11, questionCheckoutTagPreSpan21, questionCheckoutTagPreSpan31, questionCheckoutTagPreSpan41, questionCheckoutTagPreSpan51, questionCheckoutTagPreSpan61, questionCheckoutTagOl1Li11, questionCheckoutTagOl1Li21, questionCheckoutTagOl1Li31, questionCheckoutTagOl1Li41, questionCheckoutTagOl1Li51, questionCheckoutTagOl1Li61, questionSousModulesH3I1, questionSousModulesH3Span1, questionSousModulesH4I1, questionSousModulesH4Span1, questionSousModulesPreSpan11, questionSousModulesPreSpan21, questionSousModulesPreSpan31, questionSousModulesPreSpan41, questionSousModulesPreSpan51, questionSousModulesPreSpan61, questionSousModulesPreSpan71, questionSousModulesPreSpan81, questionSousModulesOl2Li11, questionSousModulesOl2Li21, questionSousModulesOl2Li31, questionSousModulesOl2Li41, questionSousModulesOl2Li51, questionSousModulesOl2Li61, questionSousModulesOl2Li71, questionSousModulesOl2Li81, questionSousModulesOl2Li82, questionConstruireSourceH3I1, questionConstruireSourceH3Span1, questionConstruireSourceH4I1, questionConstruireSourceH4Span1, questionConstruireSourcePre1Span11, questionConstruireSourcePre1Span21, questionConstruireSourcePre1Span31, questionConstruireSourcePre1Span41, questionConstruireSourcePre1Span51, questionConstruireSourcePre1Span61, questionConstruireSourcePre1Span71, questionConstruireSourceOl1Li11, questionConstruireSourceOl1Li21, questionConstruireSourceOl1Li31, questionConstruireSourceOl1Li41, questionConstruireSourceOl1Li51, questionConstruireSourceOl1Li61, questionConstruireSourceOl1Li71, questionConstruireSourceP21, questionErreurH3I1, questionErreurH3Span1, questionErreurH4I1, questionErreurH4Span1, questionErreurPre1Span11, questionErreurPre1Span21, questionErreurPre1Span31, questionErreurPre1Span41, questionErreurPre1Span51, questionErreurPre2Span11, questionErreurPre2Span21, questionErreurPre2Span31, questionErreurPre2Span41, questionErreurPre2Span51, questionErreurPre2Span61, questionErreurPre3Span011, questionErreurPre3Span021, questionErreurPre3Span031, questionErreurPre3Span041, questionErreurPre3Span051, questionErreurPre3Span061, questionErreurPre3Span071, questionErreurPre3Span081, questionErreurPre3Span091, questionErreurPre3Span101, questionErreurPre3Span111, questionErreurOl3Li011, questionErreurOl3Li021, questionErreurOl3Li031, questionErreurOl3Li041, questionErreurOl3Li051, questionErreurOl3Li061, questionErreurOl3Li071, questionErreurOl3Li081, questionErreurOl3Li091, questionErreurOl3Li101, questionErreurOl3Li111, questionErreurPre4Span11, questionErreurPre4Span21, questionErreurPre4Span31, questionErreurPre4Span41, questionErreurPre4Span51, questionErreurPre4Span61, questionErreurPre4Span71, questionCopierSourceH3I1, questionCopierSourceH3Span1, questionCopierSourceH4I1, questionCopierSourceH4Span1, questionCopierSourcePre2Span11, questionCopierSourcePre2Span21, questionCopierSourcePre2Span31, questionCopierSourcePre2Span41, questionCopierSourceOl2Li11, questionCopierSourceOl2Li21, questionCopierSourceOl2Li31, questionCopierSourceOl2Li32, questionCopierSourceOl2Li41, questionCopierSourceOl2Li42, questionSauvegardeRemplacerH3I1, questionSauvegardeRemplacerH3Span1, questionSauvegardeRemplacerH4I1, questionSauvegardeRemplacerH4Span1, questionSauvegardeRemplacerPre1Span011, questionSauvegardeRemplacerPre1Span021, questionSauvegardeRemplacerPre1Span031, questionSauvegardeRemplacerPre1Span04Br1, questionSauvegardeRemplacerPre1Span05Br1, questionSauvegardeRemplacerPre1Span06Br1, questionSauvegardeRemplacerPre1Span07Br1, questionSauvegardeRemplacerPre1Span08Br1, questionSauvegardeRemplacerPre1Span09Br1, questionSauvegardeRemplacerPre1Span10Br1, questionSauvegardeRemplacerPre1Span11Br1, questionSauvegardeRemplacerPre1Span121, questionSauvegardeRemplacerPre1Span131, questionSauvegardeRemplacerPre1Span141, questionSauvegardeRemplacerPre1Span151, questionSauvegardeRemplacerP11, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3Span1I1, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10TdI1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41, recapituler3TableTr11TdI1, recapituler3TableTr11Td21, recapituler3TableTr11Td3I1, recapituler3TableTr11Td41, recapituler3TableTr12Td1I1, recapituler3TableTr12Td21, recapituler3TableTr12Td3I1, recapituler3TableTr12Td41 };
}
