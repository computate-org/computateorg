package org.computate.site.enUS.cours.c001.l005;

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
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L005InstallerMavenGen<DEV> extends C001Lecon {

	public static final String C001L005InstallerMaven_UnNom = "a lesson";
	public static final String C001L005InstallerMaven_Ce = "this ";
	public static final String C001L005InstallerMaven_CeNom = "this lesson";
	public static final String C001L005InstallerMaven_Un = "an ";
	public static final String C001L005InstallerMaven_LeNom = "the lesson";
	public static final String C001L005InstallerMaven_NomSingulier = "lesson";
	public static final String C001L005InstallerMaven_NomPluriel = "lessons";
	public static final String C001L005InstallerMaven_NomActuel = "current lesson";
	public static final String C001L005InstallerMaven_TousNom = "the lessons";
	public static final String C001L005InstallerMaven_RechercherTousNomPar = "search lessons by ";
	public static final String C001L005InstallerMaven_H1 = "How do I install the latest version of maven. ";
	public static final String C001L005InstallerMaven_H2 = "Install maven from the source code. ";
	public static final String C001L005InstallerMaven_Titre = "How do I install the latest version of maven. Install maven from the source code. ";
	public static final String C001L005InstallerMaven_LesNoms = "the lessons";
	public static final String C001L005InstallerMaven_AucunNomTrouve = "no lesson found";
	public static final String C001L005InstallerMaven_NomVar = "lesson";
	public static final String C001L005InstallerMaven_DeNom = "of lesson";
	public static final String C001L005InstallerMaven_Couleur = "green";
	public static final String C001L005InstallerMaven_IconeGroupe = "regular";
	public static final String C001L005InstallerMaven_IconeNom = "question";
	public static final String C001L005InstallerMavenFrFRPage_Uri = "/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven";
	public static final String C001L005InstallerMavenFrFRPage_ImageUri = "/png/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven-999.png";
	public static final String C001L005InstallerMavenEnUSPage_Uri = "/enUS/course/001/004-how-to-install-the-latest-version-of-maven";
	public static final String C001L005InstallerMavenEnUSPage_ImageUri = "/png/enUS/course/001/004-how-to-install-the-latest-version-of-maven-999.png";

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. ";
	public static final String moiP2 = "Most enterprises use Java today to build their applications and microservices, including governments, banks, accounting and businesses. ";
	public static final String moiP3 = "Building java applications begins with installing Maven. ";
	public static final String moiP4 = "The default version of Maven on your Linux distribution may be out of date to install certain open source software. ";
	public static final String moiP5 = "I will help you install the most recent version of Maven to develop your website the open source way. ";
	public static final String moiP = moiP1 + moiP2 + moiP3 + moiP4 + moiP5;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml moi = new PageHtml();
	public Couverture<PageHtml> moiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L005InstallerMaven moiInit() {
		if(moi != null) {
			((C001L005InstallerMaven)this).avantPagePart(moi, "moi");
			((C001L005InstallerMaven)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyMoi(PageHtml o) {
		{ e("p").a("class", " moiP ").f();
			sx(moiP1);
			sx(moiP2);
			sx(moiP3);
			sx(moiP4);
			sx(moiP5);
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
	public static final String questionDependencesH3Span1 = "How do I install the dependencies for Maven? ";
	public static final String questionDependencesH3Span = questionDependencesH3Span1;
	public static final String questionDependencesH4I1 = "far fa-cookie";
	public static final String questionDependencesH4I = questionDependencesH4I1;
	public static final String questionDependencesH4Span1 = "Build the dependencies with yum. ";
	public static final String questionDependencesH4Span = questionDependencesH4Span1;
	public static final String questionDependencesPre1Span11 = "sudo";
	public static final String questionDependencesPre1Span1 = questionDependencesPre1Span11;
	public static final String questionDependencesPre1Span21 = " yum-builddep";
	public static final String questionDependencesPre1Span2 = questionDependencesPre1Span21;
	public static final String questionDependencesPre1Span31 = " -y";
	public static final String questionDependencesPre1Span3 = questionDependencesPre1Span31;
	public static final String questionDependencesPre1Span41 = " maven";
	public static final String questionDependencesPre1Span4 = questionDependencesPre1Span41;
	public static final String questionDependencesOl2Li11 = "sudo: The command to install yum repositories begins with the command sudo. ";
	public static final String questionDependencesOl2Li12 = "The \"sudo\" command allows your current user to have root privileges for a few minutes after entering your password. ";
	public static final String questionDependencesOl2Li1 = questionDependencesOl2Li11 + questionDependencesOl2Li12;
	public static final String questionDependencesOl2Li21 = "yum Stands for \"Yellowdog Updater Modified\", but nobody knows it as yellowdog, just yum. ";
	public static final String questionDependencesOl2Li22 = "yum-builddep installs missing dependencies for building an RPM package. ";
	public static final String questionDependencesOl2Li2 = questionDependencesOl2Li21 + questionDependencesOl2Li22;
	public static final String questionDependencesOl2Li31 = "-y: Suppress messages asking to confirm if you want to install the software. ";
	public static final String questionDependencesOl2Li3 = questionDependencesOl2Li31;
	public static final String questionDependencesOl2Li41 = "maven: The package name you wish to install the dependencies for. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionDependences">Trouver l'entité questionDependences dans Solr</a>
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
	protected C001L005InstallerMaven questionDependencesInit() {
		if(questionDependences != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionDependences, "questionDependences");
			((C001L005InstallerMaven)this).avantPagePart(questionDependences, "questionDependences");
		}
		if(!questionDependencesCouverture.dejaInitialise) {
			_questionDependences(questionDependences);
		}
		questionDependences.initLoinPourClasse(requeteSite_);
		questionDependencesCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
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
	public static final String questionMkdirSrcH3Span1 = "Where do I put the Maven source code? ";
	public static final String questionMkdirSrcH3Span = questionMkdirSrcH3Span1;
	public static final String questionMkdirSrcH4I1 = "far fa-folder-tree";
	public static final String questionMkdirSrcH4I = questionMkdirSrcH4I1;
	public static final String questionMkdirSrcH4Span1 = "Create a maven directory in /usr/local/src. ";
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
	public static final String questionMkdirSrcPreSpan81 = " /usr/local/src/maven";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionMkdirSrc">Trouver l'entité questionMkdirSrc dans Solr</a>
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
	protected C001L005InstallerMaven questionMkdirSrcInit() {
		if(questionMkdirSrc != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionMkdirSrc, "questionMkdirSrc");
			((C001L005InstallerMaven)this).avantPagePart(questionMkdirSrc, "questionMkdirSrc");
		}
		if(!questionMkdirSrcCouverture.dejaInitialise) {
			_questionMkdirSrc(questionMkdirSrc);
		}
		questionMkdirSrc.initLoinPourClasse(requeteSite_);
		questionMkdirSrcCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
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

	////////////////////////
	// questionMkdirMaven //
	////////////////////////

	public static final String questionMkdirMavenH3I1 = "far fa-map-pin";
	public static final String questionMkdirMavenH3I = questionMkdirMavenH3I1;
	public static final String questionMkdirMavenH3Span1 = "Where do I install Maven? ";
	public static final String questionMkdirMavenH3Span = questionMkdirMavenH3Span1;
	public static final String questionMkdirMavenH4I1 = "far fa-folder-tree";
	public static final String questionMkdirMavenH4I = questionMkdirMavenH4I1;
	public static final String questionMkdirMavenH4Span1 = "Create a maven directory in /opt. ";
	public static final String questionMkdirMavenH4Span = questionMkdirMavenH4Span1;
	public static final String questionMkdirMavenPreSpan11 = "sudo";
	public static final String questionMkdirMavenPreSpan1 = questionMkdirMavenPreSpan11;
	public static final String questionMkdirMavenPreSpan21 = " install";
	public static final String questionMkdirMavenPreSpan2 = questionMkdirMavenPreSpan21;
	public static final String questionMkdirMavenPreSpan31 = " -d";
	public static final String questionMkdirMavenPreSpan3 = questionMkdirMavenPreSpan31;
	public static final String questionMkdirMavenPreSpan41 = " -o";
	public static final String questionMkdirMavenPreSpan4 = questionMkdirMavenPreSpan41;
	public static final String questionMkdirMavenPreSpan51 = " $USER";
	public static final String questionMkdirMavenPreSpan5 = questionMkdirMavenPreSpan51;
	public static final String questionMkdirMavenPreSpan61 = " -g";
	public static final String questionMkdirMavenPreSpan6 = questionMkdirMavenPreSpan61;
	public static final String questionMkdirMavenPreSpan71 = " $USER";
	public static final String questionMkdirMavenPreSpan7 = questionMkdirMavenPreSpan71;
	public static final String questionMkdirMavenPreSpan81 = " /opt/maven";
	public static final String questionMkdirMavenPreSpan8 = questionMkdirMavenPreSpan81;
	public static final String questionMkdirMavenOl2Li11 = "sudo";
	public static final String questionMkdirMavenOl2Li1 = questionMkdirMavenOl2Li11;
	public static final String questionMkdirMavenOl2Li21 = "install";
	public static final String questionMkdirMavenOl2Li2 = questionMkdirMavenOl2Li21;
	public static final String questionMkdirMavenOl2Li31 = "-d";
	public static final String questionMkdirMavenOl2Li3 = questionMkdirMavenOl2Li31;
	public static final String questionMkdirMavenOl2Li41 = "-o";
	public static final String questionMkdirMavenOl2Li4 = questionMkdirMavenOl2Li41;
	public static final String questionMkdirMavenOl2Li51 = "$USER";
	public static final String questionMkdirMavenOl2Li5 = questionMkdirMavenOl2Li51;
	public static final String questionMkdirMavenOl2Li61 = "-g";
	public static final String questionMkdirMavenOl2Li6 = questionMkdirMavenOl2Li61;
	public static final String questionMkdirMavenOl2Li71 = "$USER";
	public static final String questionMkdirMavenOl2Li7 = questionMkdirMavenOl2Li71;
	public static final String questionMkdirMavenOl2Li81 = "/opt is a good place to install open source software applications like maven. ";
	public static final String questionMkdirMavenOl2Li8 = questionMkdirMavenOl2Li81;

	/**	L'entité « questionMkdirMaven »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMkdirMaven = new PageHtml();
	public Couverture<PageHtml> questionMkdirMavenCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMkdirMaven").o(questionMkdirMaven);

	/**	<br/>L'entité « questionMkdirMaven »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionMkdirMaven">Trouver l'entité questionMkdirMaven dans Solr</a>
	 * <br/>
	 * @param questionMkdirMaven est l'entité déjà construit. 
	 **/
	protected abstract void _questionMkdirMaven(PageHtml o);

	public PageHtml getQuestionMkdirMaven() {
		return questionMkdirMaven;
	}

	public void setQuestionMkdirMaven(PageHtml questionMkdirMaven) {
		this.questionMkdirMaven = questionMkdirMaven;
		this.questionMkdirMavenCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionMkdirMavenInit() {
		if(questionMkdirMaven != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionMkdirMaven, "questionMkdirMaven");
			((C001L005InstallerMaven)this).avantPagePart(questionMkdirMaven, "questionMkdirMaven");
		}
		if(!questionMkdirMavenCouverture.dejaInitialise) {
			_questionMkdirMaven(questionMkdirMaven);
		}
		questionMkdirMaven.initLoinPourClasse(requeteSite_);
		questionMkdirMavenCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionMkdirMaven(PageHtml o) {
		{ e("h3").a("class", " questionMkdirMavenH3 ").f();
			{ e("i").a("class", questionMkdirMavenH3I1, " site-menu-icon questionMkdirMavenH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirMavenH3Span ").f();
				sx(questionMkdirMavenH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMkdirMavenH4 ").f();
			{ e("i").a("class", questionMkdirMavenH4I1, " site-menu-icon questionMkdirMavenH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirMavenH4Span ").f();
				sx(questionMkdirMavenH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionMkdirMavenPre ").f();
			{ e("span").a("class", " questionMkdirMavenPreSpan1 questionMkdirMavenPreSpan odd ").f();
				sx(questionMkdirMavenPreSpan11);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan2 questionMkdirMavenPreSpan even ").f();
				sx(questionMkdirMavenPreSpan21);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan3 questionMkdirMavenPreSpan odd ").f();
				sx(questionMkdirMavenPreSpan31);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan4 questionMkdirMavenPreSpan even ").f();
				sx(questionMkdirMavenPreSpan41);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan5 questionMkdirMavenPreSpan odd ").f();
				sx(questionMkdirMavenPreSpan51);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan6 questionMkdirMavenPreSpan even ").f();
				sx(questionMkdirMavenPreSpan61);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan7 questionMkdirMavenPreSpan odd ").f();
				sx(questionMkdirMavenPreSpan71);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan8 questionMkdirMavenPreSpan even ").f();
				sx(questionMkdirMavenPreSpan81);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirMavenOl2 questionMkdirMavenOl even ").f();
			{ e("li").a("class", " questionMkdirMavenOl2Li1 questionMkdirMavenOl2Li odd ").f();
				sx(questionMkdirMavenOl2Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li2 questionMkdirMavenOl2Li even ").f();
				sx(questionMkdirMavenOl2Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li3 questionMkdirMavenOl2Li odd ").f();
				sx(questionMkdirMavenOl2Li31);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li4 questionMkdirMavenOl2Li even ").f();
				sx(questionMkdirMavenOl2Li41);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li5 questionMkdirMavenOl2Li odd ").f();
				sx(questionMkdirMavenOl2Li51);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li6 questionMkdirMavenOl2Li even ").f();
				sx(questionMkdirMavenOl2Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li7 questionMkdirMavenOl2Li odd ").f();
				sx(questionMkdirMavenOl2Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li8 questionMkdirMavenOl2Li even ").f();
				sx(questionMkdirMavenOl2Li81);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMkdirMaven() {
		questionMkdirMaven.htmlAvant();
		htmlBodyQuestionMkdirMaven(questionMkdirMaven);
		questionMkdirMaven.htmlApres();
	}

	//////////////////////////
	// questionClonerSource //
	//////////////////////////

	public static final String questionClonerSourceH3I1 = "far fa-cloud-download";
	public static final String questionClonerSourceH3I = questionClonerSourceH3I1;
	public static final String questionClonerSourceH3Span1 = "How do I download the maven source code? ";
	public static final String questionClonerSourceH3Span = questionClonerSourceH3Span1;
	public static final String questionClonerSourceH4I1 = "fab fa-git";
	public static final String questionClonerSourceH4I = questionClonerSourceH4I1;
	public static final String questionClonerSourceH4Span1 = "Clone the source code with the git command. ";
	public static final String questionClonerSourceH4Span = questionClonerSourceH4Span1;
	public static final String questionClonerSourcePreSpan11 = "git";
	public static final String questionClonerSourcePreSpan1 = questionClonerSourcePreSpan11;
	public static final String questionClonerSourcePreSpan21 = " clone";
	public static final String questionClonerSourcePreSpan2 = questionClonerSourcePreSpan21;
	public static final String questionClonerSourcePreSpan31 = " https://git-wip-us.apache.org/repos/asf/maven.git";
	public static final String questionClonerSourcePreSpan3 = questionClonerSourcePreSpan31;
	public static final String questionClonerSourcePreSpan41 = " /usr/local/src/maven";
	public static final String questionClonerSourcePreSpan4 = questionClonerSourcePreSpan41;
	public static final String questionClonerSourceOl2Li11 = "git: The distributed revision control system for most open source software. ";
	public static final String questionClonerSourceOl2Li1 = questionClonerSourceOl2Li11;
	public static final String questionClonerSourceOl2Li21 = "clone: Clone a repository into a directory. ";
	public static final String questionClonerSourceOl2Li2 = questionClonerSourceOl2Li21;
	public static final String questionClonerSourceOl2Li31 = "https://git-wip-us.apache.org/repos/asf/maven.git: The git URL to the maven source code repository. ";
	public static final String questionClonerSourceOl2Li3 = questionClonerSourceOl2Li31;
	public static final String questionClonerSourceOl2Li41 = "/usr/local/src/maven: The directory where the maven source code will be cloned. ";
	public static final String questionClonerSourceOl2Li4 = questionClonerSourceOl2Li41;

	/**	L'entité « questionClonerSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionClonerSource = new PageHtml();
	public Couverture<PageHtml> questionClonerSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionClonerSource").o(questionClonerSource);

	/**	<br/>L'entité « questionClonerSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionClonerSource">Trouver l'entité questionClonerSource dans Solr</a>
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
	protected C001L005InstallerMaven questionClonerSourceInit() {
		if(questionClonerSource != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionClonerSource, "questionClonerSource");
			((C001L005InstallerMaven)this).avantPagePart(questionClonerSource, "questionClonerSource");
		}
		if(!questionClonerSourceCouverture.dejaInitialise) {
			_questionClonerSource(questionClonerSource);
		}
		questionClonerSource.initLoinPourClasse(requeteSite_);
		questionClonerSourceCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
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
	public static final String questionListerTagsH3Span1 = "How do I pick a recent version of Maven? ";
	public static final String questionListerTagsH3Span = questionListerTagsH3Span1;
	public static final String questionListerTagsH4I1 = "far fa-tag";
	public static final String questionListerTagsH4I = questionListerTagsH4I1;
	public static final String questionListerTagsH4Span1 = "List all the tags in the git repository. ";
	public static final String questionListerTagsH4Span = questionListerTagsH4Span1;
	public static final String questionListerTagsPreSpan11 = "(cd";
	public static final String questionListerTagsPreSpan1 = questionListerTagsPreSpan11;
	public static final String questionListerTagsPreSpan21 = " /usr/local/src/maven";
	public static final String questionListerTagsPreSpan2 = questionListerTagsPreSpan21;
	public static final String questionListerTagsPreSpan31 = " &&";
	public static final String questionListerTagsPreSpan3 = questionListerTagsPreSpan31;
	public static final String questionListerTagsPreSpan41 = " git";
	public static final String questionListerTagsPreSpan4 = questionListerTagsPreSpan41;
	public static final String questionListerTagsPreSpan51 = " tag)";
	public static final String questionListerTagsPreSpan5 = questionListerTagsPreSpan51;
	public static final String questionListerTagsOl2Li11 = "(cd: Change directory temporarily, because of the open parenthesis. ";
	public static final String questionListerTagsOl2Li1 = questionListerTagsOl2Li11;
	public static final String questionListerTagsOl2Li21 = "/usr/local/src/maven: The directory where the maven source code was cloned. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionListerTags">Trouver l'entité questionListerTags dans Solr</a>
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
	protected C001L005InstallerMaven questionListerTagsInit() {
		if(questionListerTags != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionListerTags, "questionListerTags");
			((C001L005InstallerMaven)this).avantPagePart(questionListerTags, "questionListerTags");
		}
		if(!questionListerTagsCouverture.dejaInitialise) {
			_questionListerTags(questionListerTags);
		}
		questionListerTags.initLoinPourClasse(requeteSite_);
		questionListerTagsCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
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
	public static final String questionCheckoutTagH3Span1 = "How do I switch versions of the maven source code? ";
	public static final String questionCheckoutTagH3Span = questionCheckoutTagH3Span1;
	public static final String questionCheckoutTagH4I1 = "far fa-code-commit";
	public static final String questionCheckoutTagH4I = questionCheckoutTagH4I1;
	public static final String questionCheckoutTagH4Span1 = "Checkout the git tag. ";
	public static final String questionCheckoutTagH4Span = questionCheckoutTagH4Span1;
	public static final String questionCheckoutTagPreSpan11 = "(cd";
	public static final String questionCheckoutTagPreSpan1 = questionCheckoutTagPreSpan11;
	public static final String questionCheckoutTagPreSpan21 = " /usr/local/src/maven";
	public static final String questionCheckoutTagPreSpan2 = questionCheckoutTagPreSpan21;
	public static final String questionCheckoutTagPreSpan31 = " &&";
	public static final String questionCheckoutTagPreSpan3 = questionCheckoutTagPreSpan31;
	public static final String questionCheckoutTagPreSpan41 = " git";
	public static final String questionCheckoutTagPreSpan4 = questionCheckoutTagPreSpan41;
	public static final String questionCheckoutTagPreSpan51 = " checkout";
	public static final String questionCheckoutTagPreSpan5 = questionCheckoutTagPreSpan51;
	public static final String questionCheckoutTagPreSpan61 = " maven-3.6.1)";
	public static final String questionCheckoutTagPreSpan6 = questionCheckoutTagPreSpan61;
	public static final String questionCheckoutTagOl2Li11 = "(cd";
	public static final String questionCheckoutTagOl2Li1 = questionCheckoutTagOl2Li11;
	public static final String questionCheckoutTagOl2Li21 = "/usr/local/src/maven";
	public static final String questionCheckoutTagOl2Li2 = questionCheckoutTagOl2Li21;
	public static final String questionCheckoutTagOl2Li31 = "&&";
	public static final String questionCheckoutTagOl2Li3 = questionCheckoutTagOl2Li31;
	public static final String questionCheckoutTagOl2Li41 = "git";
	public static final String questionCheckoutTagOl2Li4 = questionCheckoutTagOl2Li41;
	public static final String questionCheckoutTagOl2Li51 = "checkout: Checkout a branch to the working tree. ";
	public static final String questionCheckoutTagOl2Li5 = questionCheckoutTagOl2Li51;
	public static final String questionCheckoutTagOl2Li61 = "maven-3.6.1): The latest tag to base the branch from. ";
	public static final String questionCheckoutTagOl2Li6 = questionCheckoutTagOl2Li61;

	/**	L'entité « questionCheckoutTag »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCheckoutTag = new PageHtml();
	public Couverture<PageHtml> questionCheckoutTagCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCheckoutTag").o(questionCheckoutTag);

	/**	<br/>L'entité « questionCheckoutTag »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCheckoutTag">Trouver l'entité questionCheckoutTag dans Solr</a>
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
	protected C001L005InstallerMaven questionCheckoutTagInit() {
		if(questionCheckoutTag != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
			((C001L005InstallerMaven)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
		}
		if(!questionCheckoutTagCouverture.dejaInitialise) {
			_questionCheckoutTag(questionCheckoutTag);
		}
		questionCheckoutTag.initLoinPourClasse(requeteSite_);
		questionCheckoutTagCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
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
	public static final String questionConstruireSourceH3Span1 = "How do I build the maven source code? ";
	public static final String questionConstruireSourceH3Span = questionConstruireSourceH3Span1;
	public static final String questionConstruireSourceH4I1 = "far fa-terminal";
	public static final String questionConstruireSourceH4I = questionConstruireSourceH4I1;
	public static final String questionConstruireSourceH4Span1 = "Build Maven with the mvn command. ";
	public static final String questionConstruireSourceH4Span = questionConstruireSourceH4Span1;
	public static final String questionConstruireSourcePre1Span11 = "(cd";
	public static final String questionConstruireSourcePre1Span1 = questionConstruireSourcePre1Span11;
	public static final String questionConstruireSourcePre1Span21 = " /usr/local/src/maven";
	public static final String questionConstruireSourcePre1Span2 = questionConstruireSourcePre1Span21;
	public static final String questionConstruireSourcePre1Span31 = " &&";
	public static final String questionConstruireSourcePre1Span3 = questionConstruireSourcePre1Span31;
	public static final String questionConstruireSourcePre1Span41 = " mvn";
	public static final String questionConstruireSourcePre1Span4 = questionConstruireSourcePre1Span41;
	public static final String questionConstruireSourcePre1Span51 = " -DdistributionTargetDir=\"/tmp/maven\"";
	public static final String questionConstruireSourcePre1Span5 = questionConstruireSourcePre1Span51;
	public static final String questionConstruireSourcePre1Span61 = " clean";
	public static final String questionConstruireSourcePre1Span6 = questionConstruireSourcePre1Span61;
	public static final String questionConstruireSourcePre1Span71 = " package)";
	public static final String questionConstruireSourcePre1Span7 = questionConstruireSourcePre1Span71;
	public static final String questionConstruireSourceOl1Li11 = "(cd";
	public static final String questionConstruireSourceOl1Li1 = questionConstruireSourceOl1Li11;
	public static final String questionConstruireSourceOl1Li21 = "/usr/local/src/maven";
	public static final String questionConstruireSourceOl1Li2 = questionConstruireSourceOl1Li21;
	public static final String questionConstruireSourceOl1Li31 = "&&";
	public static final String questionConstruireSourceOl1Li3 = questionConstruireSourceOl1Li31;
	public static final String questionConstruireSourceOl1Li41 = "mvn: The java software project management tool. ";
	public static final String questionConstruireSourceOl1Li4 = questionConstruireSourceOl1Li41;
	public static final String questionConstruireSourceOl1Li51 = "-DdistributionTargetDir=\"/tmp/maven\": Point the distributionTargetDir to a temporary directory in /tmp. ";
	public static final String questionConstruireSourceOl1Li5 = questionConstruireSourceOl1Li51;
	public static final String questionConstruireSourceOl1Li61 = "clean: Clean up any previous builds. ";
	public static final String questionConstruireSourceOl1Li6 = questionConstruireSourceOl1Li61;
	public static final String questionConstruireSourceOl1Li71 = "package): Build the complete maven application and close the parenthesis. ";
	public static final String questionConstruireSourceOl1Li7 = questionConstruireSourceOl1Li71;
	public static final String questionConstruireSourcePre2Span11 = "rsync";
	public static final String questionConstruireSourcePre2Span1 = questionConstruireSourcePre2Span11;
	public static final String questionConstruireSourcePre2Span21 = " -r";
	public static final String questionConstruireSourcePre2Span2 = questionConstruireSourcePre2Span21;
	public static final String questionConstruireSourcePre2Span31 = " /tmp/maven/";
	public static final String questionConstruireSourcePre2Span3 = questionConstruireSourcePre2Span31;
	public static final String questionConstruireSourcePre2Span41 = " /opt/maven/";
	public static final String questionConstruireSourcePre2Span4 = questionConstruireSourcePre2Span41;
	public static final String questionConstruireSourceOl2Li11 = "rsync: a fast, versatile, remote (and local) file-copying tool. ";
	public static final String questionConstruireSourceOl2Li1 = questionConstruireSourceOl2Li11;
	public static final String questionConstruireSourceOl2Li21 = "-r: Recurse into directories. ";
	public static final String questionConstruireSourceOl2Li2 = questionConstruireSourceOl2Li21;
	public static final String questionConstruireSourceOl2Li31 = "/tmp/maven/: The directory where the maven application was built. ";
	public static final String questionConstruireSourceOl2Li32 = "/tmp/maven/: Don't forget the ending slash or rsync assumes it's a file inside the destination. ";
	public static final String questionConstruireSourceOl2Li3 = questionConstruireSourceOl2Li31 + questionConstruireSourceOl2Li32;
	public static final String questionConstruireSourceOl2Li41 = "/opt/maven/: The directory where the maven will be installed. ";
	public static final String questionConstruireSourceOl2Li42 = "/opt/maven/: It's best to always write directories with a trailing slash in rsync for fewer surprises. ";
	public static final String questionConstruireSourceOl2Li4 = questionConstruireSourceOl2Li41 + questionConstruireSourceOl2Li42;

	/**	L'entité « questionConstruireSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionConstruireSource = new PageHtml();
	public Couverture<PageHtml> questionConstruireSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionConstruireSource").o(questionConstruireSource);

	/**	<br/>L'entité « questionConstruireSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionConstruireSource">Trouver l'entité questionConstruireSource dans Solr</a>
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
	protected C001L005InstallerMaven questionConstruireSourceInit() {
		if(questionConstruireSource != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
			((C001L005InstallerMaven)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
		}
		if(!questionConstruireSourceCouverture.dejaInitialise) {
			_questionConstruireSource(questionConstruireSource);
		}
		questionConstruireSource.initLoinPourClasse(requeteSite_);
		questionConstruireSourceCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
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
				sx(questionConstruireSourceOl2Li32);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl2Li4 questionConstruireSourceOl2Li even ").f();
				sx(questionConstruireSourceOl2Li41);
				sx(questionConstruireSourceOl2Li42);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionConstruireSource() {
		questionConstruireSource.htmlAvant();
		htmlBodyQuestionConstruireSource(questionConstruireSource);
		questionConstruireSource.htmlApres();
	}

	////////////////////////////////
	// questionMavenInstalleMaven //
	////////////////////////////////

	public static final String questionMavenInstalleMavenH3I1 = "far fa-question";
	public static final String questionMavenInstalleMavenH3I = questionMavenInstalleMavenH3I1;
	public static final String questionMavenInstalleMavenH3Span1 = "But why are we installing Maven to install the latest Maven? ";
	public static final String questionMavenInstalleMavenH3Span = questionMavenInstalleMavenH3Span1;
	public static final String questionMavenInstalleMavenH4I1 = "far fa-flushed";
	public static final String questionMavenInstalleMavenH4I = questionMavenInstalleMavenH4I1;
	public static final String questionMavenInstalleMavenH4Span1 = "A program that requires itself to build itself. ";
	public static final String questionMavenInstalleMavenH4Span = questionMavenInstalleMavenH4Span1;
	public static final String questionMavenInstalleMavenH5Span1 = "";
	public static final String questionMavenInstalleMavenH5Span = questionMavenInstalleMavenH5Span1;
	public static final String questionMavenInstalleMavenP5Span1 = "I couldn't believe it myself at first, a program that requires itself to build itself? ";
	public static final String questionMavenInstalleMavenP5Span2 = "The best I can do to explain this phenomenon is to quote the maven documentation: ";
	public static final String questionMavenInstalleMavenP5Span3 = "\"Until Maven 3.3, Maven core build could be boostrapped with an Ant build. ";
	public static final String questionMavenInstalleMavenP5Span4 = "This bootstrap has been removed in Maven 3.5: you need a pre-built Maven to build Maven from source.\" ";
	public static final String questionMavenInstalleMavenP5Span = questionMavenInstalleMavenP5Span1 + questionMavenInstalleMavenP5Span2 + questionMavenInstalleMavenP5Span3 + questionMavenInstalleMavenP5Span4;

	/**	L'entité « questionMavenInstalleMaven »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMavenInstalleMaven = new PageHtml();
	public Couverture<PageHtml> questionMavenInstalleMavenCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMavenInstalleMaven").o(questionMavenInstalleMaven);

	/**	<br/>L'entité « questionMavenInstalleMaven »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionMavenInstalleMaven">Trouver l'entité questionMavenInstalleMaven dans Solr</a>
	 * <br/>
	 * @param questionMavenInstalleMaven est l'entité déjà construit. 
	 **/
	protected abstract void _questionMavenInstalleMaven(PageHtml o);

	public PageHtml getQuestionMavenInstalleMaven() {
		return questionMavenInstalleMaven;
	}

	public void setQuestionMavenInstalleMaven(PageHtml questionMavenInstalleMaven) {
		this.questionMavenInstalleMaven = questionMavenInstalleMaven;
		this.questionMavenInstalleMavenCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionMavenInstalleMavenInit() {
		if(questionMavenInstalleMaven != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionMavenInstalleMaven, "questionMavenInstalleMaven");
			((C001L005InstallerMaven)this).avantPagePart(questionMavenInstalleMaven, "questionMavenInstalleMaven");
		}
		if(!questionMavenInstalleMavenCouverture.dejaInitialise) {
			_questionMavenInstalleMaven(questionMavenInstalleMaven);
		}
		questionMavenInstalleMaven.initLoinPourClasse(requeteSite_);
		questionMavenInstalleMavenCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionMavenInstalleMaven(PageHtml o) {
		{ e("h3").a("class", " questionMavenInstalleMavenH3 ").f();
			{ e("i").a("class", questionMavenInstalleMavenH3I1, " site-menu-icon questionMavenInstalleMavenH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMavenInstalleMavenH3Span ").f();
				sx(questionMavenInstalleMavenH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMavenInstalleMavenH4 ").f();
			{ e("i").a("class", questionMavenInstalleMavenH4I1, " site-menu-icon questionMavenInstalleMavenH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMavenInstalleMavenH4Span ").f();
				sx(questionMavenInstalleMavenH4Span1);
			} g("span");
		} g("h4");
		{ e("h5").a("class", " questionMavenInstalleMavenH5 ").f();
			{ e("span").a("class", " questionMavenInstalleMavenH5Span ").f();
				sx(questionMavenInstalleMavenH5Span1);
			} g("span");
		} g("h5");
		{ e("p").a("class", " questionMavenInstalleMavenP5 questionMavenInstalleMavenP odd ").f();
			{ e("span").a("class", " questionMavenInstalleMavenP5Span ").f();
				sx(questionMavenInstalleMavenP5Span1);
				sx(questionMavenInstalleMavenP5Span2);
				sx(questionMavenInstalleMavenP5Span3);
				sx(questionMavenInstalleMavenP5Span4);
			} g("span");
		} g("p");
	}
	public void htmlBodyQuestionMavenInstalleMaven() {
		questionMavenInstalleMaven.htmlAvant();
		htmlBodyQuestionMavenInstalleMaven(questionMavenInstalleMaven);
		questionMavenInstalleMaven.htmlApres();
	}

	/////////////////////////////////
	// questionSauvegardeRemplacer //
	/////////////////////////////////

	public static final String questionSauvegardeRemplacerH3I1 = "far fa-mind-share";
	public static final String questionSauvegardeRemplacerH3I = questionSauvegardeRemplacerH3I1;
	public static final String questionSauvegardeRemplacerH3Span1 = "How do I change the default mvn command on the system? ";
	public static final String questionSauvegardeRemplacerH3Span = questionSauvegardeRemplacerH3Span1;
	public static final String questionSauvegardeRemplacerH4I1 = "far fa-link";
	public static final String questionSauvegardeRemplacerH4I = questionSauvegardeRemplacerH4I1;
	public static final String questionSauvegardeRemplacerH4Span1 = "Backup the original and make a symbolic link. ";
	public static final String questionSauvegardeRemplacerH4Span = questionSauvegardeRemplacerH4Span1;
	public static final String questionSauvegardeRemplacerPre1Span11 = "which";
	public static final String questionSauvegardeRemplacerPre1Span1 = questionSauvegardeRemplacerPre1Span11;
	public static final String questionSauvegardeRemplacerPre1Span21 = " mvn";
	public static final String questionSauvegardeRemplacerPre1Span2 = questionSauvegardeRemplacerPre1Span21;
	public static final String questionSauvegardeRemplacerOl1Li11 = "which: Shows the full path of commands in the $PATH. ";
	public static final String questionSauvegardeRemplacerOl1Li1 = questionSauvegardeRemplacerOl1Li11;
	public static final String questionSauvegardeRemplacerOl1Li21 = "mvn: The command we want to backup and upgrade. ";
	public static final String questionSauvegardeRemplacerOl1Li2 = questionSauvegardeRemplacerOl1Li21;
	public static final String questionSauvegardeRemplacerPre2Span11 = "mvn";
	public static final String questionSauvegardeRemplacerPre2Span1 = questionSauvegardeRemplacerPre2Span11;
	public static final String questionSauvegardeRemplacerPre2Span21 = " -v";
	public static final String questionSauvegardeRemplacerPre2Span2 = questionSauvegardeRemplacerPre2Span21;
	public static final String questionSauvegardeRemplacerOl2Li11 = "mvn";
	public static final String questionSauvegardeRemplacerOl2Li1 = questionSauvegardeRemplacerOl2Li11;
	public static final String questionSauvegardeRemplacerOl2Li21 = "-v: View the version of maven on the system. ";
	public static final String questionSauvegardeRemplacerOl2Li2 = questionSauvegardeRemplacerOl2Li21;
	public static final String questionSauvegardeRemplacerPre3Span11 = "sudo";
	public static final String questionSauvegardeRemplacerPre3Span1 = questionSauvegardeRemplacerPre3Span11;
	public static final String questionSauvegardeRemplacerPre3Span21 = " mv";
	public static final String questionSauvegardeRemplacerPre3Span2 = questionSauvegardeRemplacerPre3Span21;
	public static final String questionSauvegardeRemplacerPre3Span31 = " /usr/bin/mvn";
	public static final String questionSauvegardeRemplacerPre3Span3 = questionSauvegardeRemplacerPre3Span31;
	public static final String questionSauvegardeRemplacerPre3Span41 = " /usr/bin/mvn3.0.5";
	public static final String questionSauvegardeRemplacerPre3Span4 = questionSauvegardeRemplacerPre3Span41;
	public static final String questionSauvegardeRemplacerOl3Li11 = "sudo";
	public static final String questionSauvegardeRemplacerOl3Li1 = questionSauvegardeRemplacerOl3Li11;
	public static final String questionSauvegardeRemplacerOl3Li21 = "mv: Move or rename files. ";
	public static final String questionSauvegardeRemplacerOl3Li2 = questionSauvegardeRemplacerOl3Li21;
	public static final String questionSauvegardeRemplacerOl3Li31 = "/usr/bin/mvn: The old mvn command to backup. ";
	public static final String questionSauvegardeRemplacerOl3Li3 = questionSauvegardeRemplacerOl3Li31;
	public static final String questionSauvegardeRemplacerOl3Li41 = "/usr/bin/mvn3.0.5: The path to the backup file. ";
	public static final String questionSauvegardeRemplacerOl3Li4 = questionSauvegardeRemplacerOl3Li41;
	public static final String questionSauvegardeRemplacerPre4Span11 = "sudo";
	public static final String questionSauvegardeRemplacerPre4Span1 = questionSauvegardeRemplacerPre4Span11;
	public static final String questionSauvegardeRemplacerPre4Span21 = " ln";
	public static final String questionSauvegardeRemplacerPre4Span2 = questionSauvegardeRemplacerPre4Span21;
	public static final String questionSauvegardeRemplacerPre4Span31 = " -s";
	public static final String questionSauvegardeRemplacerPre4Span3 = questionSauvegardeRemplacerPre4Span31;
	public static final String questionSauvegardeRemplacerPre4Span41 = " /opt/maven/bin/mvn";
	public static final String questionSauvegardeRemplacerPre4Span4 = questionSauvegardeRemplacerPre4Span41;
	public static final String questionSauvegardeRemplacerPre4Span51 = " /usr/local/bin/mvn";
	public static final String questionSauvegardeRemplacerPre4Span5 = questionSauvegardeRemplacerPre4Span51;
	public static final String questionSauvegardeRemplacerOl4Li11 = "sudo";
	public static final String questionSauvegardeRemplacerOl4Li1 = questionSauvegardeRemplacerOl4Li11;
	public static final String questionSauvegardeRemplacerOl4Li21 = "ln: Makes links between files. ";
	public static final String questionSauvegardeRemplacerOl4Li2 = questionSauvegardeRemplacerOl4Li21;
	public static final String questionSauvegardeRemplacerOl4Li31 = "-s: Make symbolic links instead of hard links. ";
	public static final String questionSauvegardeRemplacerOl4Li3 = questionSauvegardeRemplacerOl4Li31;
	public static final String questionSauvegardeRemplacerOl4Li41 = "/opt/maven/bin/mvn: The path to the new mvn file. ";
	public static final String questionSauvegardeRemplacerOl4Li4 = questionSauvegardeRemplacerOl4Li41;
	public static final String questionSauvegardeRemplacerOl4Li51 = "/usr/local/bin/mvn: The path to the symbolic link in the $PATH. ";
	public static final String questionSauvegardeRemplacerOl4Li5 = questionSauvegardeRemplacerOl4Li51;
	public static final String questionSauvegardeRemplacerP41 = "Now try out the new binary and see that it's properly upgraded! ";
	public static final String questionSauvegardeRemplacerP4 = questionSauvegardeRemplacerP41;
	public static final String questionSauvegardeRemplacerPre5Span11 = "which";
	public static final String questionSauvegardeRemplacerPre5Span1 = questionSauvegardeRemplacerPre5Span11;
	public static final String questionSauvegardeRemplacerPre5Span21 = " mvn";
	public static final String questionSauvegardeRemplacerPre5Span2 = questionSauvegardeRemplacerPre5Span21;
	public static final String questionSauvegardeRemplacerPre6Span11 = "mvn";
	public static final String questionSauvegardeRemplacerPre6Span1 = questionSauvegardeRemplacerPre6Span11;
	public static final String questionSauvegardeRemplacerPre6Span21 = " -v";
	public static final String questionSauvegardeRemplacerPre6Span2 = questionSauvegardeRemplacerPre6Span21;

	/**	L'entité « questionSauvegardeRemplacer »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSauvegardeRemplacer = new PageHtml();
	public Couverture<PageHtml> questionSauvegardeRemplacerCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSauvegardeRemplacer").o(questionSauvegardeRemplacer);

	/**	<br/>L'entité « questionSauvegardeRemplacer »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSauvegardeRemplacer">Trouver l'entité questionSauvegardeRemplacer dans Solr</a>
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
	protected C001L005InstallerMaven questionSauvegardeRemplacerInit() {
		if(questionSauvegardeRemplacer != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionSauvegardeRemplacer, "questionSauvegardeRemplacer");
			((C001L005InstallerMaven)this).avantPagePart(questionSauvegardeRemplacer, "questionSauvegardeRemplacer");
		}
		if(!questionSauvegardeRemplacerCouverture.dejaInitialise) {
			_questionSauvegardeRemplacer(questionSauvegardeRemplacer);
		}
		questionSauvegardeRemplacer.initLoinPourClasse(requeteSite_);
		questionSauvegardeRemplacerCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
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
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span1 questionSauvegardeRemplacerPre1Span odd ").f();
				sx(questionSauvegardeRemplacerPre1Span11);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre1Span2 questionSauvegardeRemplacerPre1Span even ").f();
				sx(questionSauvegardeRemplacerPre1Span21);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSauvegardeRemplacerOl1 questionSauvegardeRemplacerOl odd ").f();
			{ e("li").a("class", " questionSauvegardeRemplacerOl1Li1 questionSauvegardeRemplacerOl1Li odd ").f();
				sx(questionSauvegardeRemplacerOl1Li11);
			} g("li");
			{ e("li").a("class", " questionSauvegardeRemplacerOl1Li2 questionSauvegardeRemplacerOl1Li even ").f();
				sx(questionSauvegardeRemplacerOl1Li21);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionSauvegardeRemplacerPre2 questionSauvegardeRemplacerPre even ").f();
			{ e("span").a("class", " questionSauvegardeRemplacerPre2Span1 questionSauvegardeRemplacerPre2Span odd ").f();
				sx(questionSauvegardeRemplacerPre2Span11);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre2Span2 questionSauvegardeRemplacerPre2Span even ").f();
				sx(questionSauvegardeRemplacerPre2Span21);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSauvegardeRemplacerOl2 questionSauvegardeRemplacerOl even ").f();
			{ e("li").a("class", " questionSauvegardeRemplacerOl2Li1 questionSauvegardeRemplacerOl2Li odd ").f();
				sx(questionSauvegardeRemplacerOl2Li11);
			} g("li");
			{ e("li").a("class", " questionSauvegardeRemplacerOl2Li2 questionSauvegardeRemplacerOl2Li even ").f();
				sx(questionSauvegardeRemplacerOl2Li21);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionSauvegardeRemplacerPre3 questionSauvegardeRemplacerPre odd ").f();
			{ e("span").a("class", " questionSauvegardeRemplacerPre3Span1 questionSauvegardeRemplacerPre3Span odd ").f();
				sx(questionSauvegardeRemplacerPre3Span11);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre3Span2 questionSauvegardeRemplacerPre3Span even ").f();
				sx(questionSauvegardeRemplacerPre3Span21);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre3Span3 questionSauvegardeRemplacerPre3Span odd ").f();
				sx(questionSauvegardeRemplacerPre3Span31);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre3Span4 questionSauvegardeRemplacerPre3Span even ").f();
				sx(questionSauvegardeRemplacerPre3Span41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSauvegardeRemplacerOl3 questionSauvegardeRemplacerOl odd ").f();
			{ e("li").a("class", " questionSauvegardeRemplacerOl3Li1 questionSauvegardeRemplacerOl3Li odd ").f();
				sx(questionSauvegardeRemplacerOl3Li11);
			} g("li");
			{ e("li").a("class", " questionSauvegardeRemplacerOl3Li2 questionSauvegardeRemplacerOl3Li even ").f();
				sx(questionSauvegardeRemplacerOl3Li21);
			} g("li");
			{ e("li").a("class", " questionSauvegardeRemplacerOl3Li3 questionSauvegardeRemplacerOl3Li odd ").f();
				sx(questionSauvegardeRemplacerOl3Li31);
			} g("li");
			{ e("li").a("class", " questionSauvegardeRemplacerOl3Li4 questionSauvegardeRemplacerOl3Li even ").f();
				sx(questionSauvegardeRemplacerOl3Li41);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionSauvegardeRemplacerPre4 questionSauvegardeRemplacerPre even ").f();
			{ e("span").a("class", " questionSauvegardeRemplacerPre4Span1 questionSauvegardeRemplacerPre4Span odd ").f();
				sx(questionSauvegardeRemplacerPre4Span11);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre4Span2 questionSauvegardeRemplacerPre4Span even ").f();
				sx(questionSauvegardeRemplacerPre4Span21);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre4Span3 questionSauvegardeRemplacerPre4Span odd ").f();
				sx(questionSauvegardeRemplacerPre4Span31);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre4Span4 questionSauvegardeRemplacerPre4Span even ").f();
				sx(questionSauvegardeRemplacerPre4Span41);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre4Span5 questionSauvegardeRemplacerPre4Span odd ").f();
				sx(questionSauvegardeRemplacerPre4Span51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSauvegardeRemplacerOl4 questionSauvegardeRemplacerOl even ").f();
			{ e("li").a("class", " questionSauvegardeRemplacerOl4Li1 questionSauvegardeRemplacerOl4Li odd ").f();
				sx(questionSauvegardeRemplacerOl4Li11);
			} g("li");
			{ e("li").a("class", " questionSauvegardeRemplacerOl4Li2 questionSauvegardeRemplacerOl4Li even ").f();
				sx(questionSauvegardeRemplacerOl4Li21);
			} g("li");
			{ e("li").a("class", " questionSauvegardeRemplacerOl4Li3 questionSauvegardeRemplacerOl4Li odd ").f();
				sx(questionSauvegardeRemplacerOl4Li31);
			} g("li");
			{ e("li").a("class", " questionSauvegardeRemplacerOl4Li4 questionSauvegardeRemplacerOl4Li even ").f();
				sx(questionSauvegardeRemplacerOl4Li41);
			} g("li");
			{ e("li").a("class", " questionSauvegardeRemplacerOl4Li5 questionSauvegardeRemplacerOl4Li odd ").f();
				sx(questionSauvegardeRemplacerOl4Li51);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionSauvegardeRemplacerP4 questionSauvegardeRemplacerP even ").f();
			sx(questionSauvegardeRemplacerP41);
		} g("p");
		{ e("pre").a("class", " questionSauvegardeRemplacerPre5 questionSauvegardeRemplacerPre odd ").f();
			{ e("span").a("class", " questionSauvegardeRemplacerPre5Span1 questionSauvegardeRemplacerPre5Span odd ").f();
				sx(questionSauvegardeRemplacerPre5Span11);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre5Span2 questionSauvegardeRemplacerPre5Span even ").f();
				sx(questionSauvegardeRemplacerPre5Span21);
			} g("span");
		} g("pre");
		{ e("pre").a("class", " questionSauvegardeRemplacerPre6 questionSauvegardeRemplacerPre even ").f();
			{ e("span").a("class", " questionSauvegardeRemplacerPre6Span1 questionSauvegardeRemplacerPre6Span odd ").f();
				sx(questionSauvegardeRemplacerPre6Span11);
			} g("span");
			{ e("span").a("class", " questionSauvegardeRemplacerPre6Span2 questionSauvegardeRemplacerPre6Span even ").f();
				sx(questionSauvegardeRemplacerPre6Span21);
			} g("span");
		} g("pre");
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
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
	protected C001L005InstallerMaven recapituler1Init() {
		if(recapituler1 != null) {
			((C001L005InstallerMaven)this).avantPagePart(recapituler1, "recapituler1");
			((C001L005InstallerMaven)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
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

	public static final String recapituler2TableTr1Td11 = "Wednesday ";
	public static final String recapituler2TableTr1Td1 = recapituler2TableTr1Td11;
	public static final String recapituler2TableTr1Td2I1 = "far fa-fast-forward";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "far fa-file-code";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "far fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "May 8 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "How do I install the latest version of maven. ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "Install maven from the source code. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
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
	protected C001L005InstallerMaven recapituler2Init() {
		if(recapituler2 != null) {
			((C001L005InstallerMaven)this).avantPagePart(recapituler2, "recapituler2");
			((C001L005InstallerMaven)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
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
	public static final String recapituler3TableTr02Td21 = "How do I install the dependencies for Maven? ";
	public static final String recapituler3TableTr02Td2 = recapituler3TableTr02Td21;
	public static final String recapituler3TableTr02Td3Span1I1 = "far fa-cookie";
	public static final String recapituler3TableTr02Td3Span1I = recapituler3TableTr02Td3Span1I1;
	public static final String recapituler3TableTr02Td41 = "Build the dependencies with yum. ";
	public static final String recapituler3TableTr02Td4 = recapituler3TableTr02Td41;
	public static final String recapituler3TableTr03Td1I1 = "far fa-files-medical";
	public static final String recapituler3TableTr03Td1I = recapituler3TableTr03Td1I1;
	public static final String recapituler3TableTr03Td21 = "Where do I put the Maven source code? ";
	public static final String recapituler3TableTr03Td2 = recapituler3TableTr03Td21;
	public static final String recapituler3TableTr03Td3I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr03Td3I = recapituler3TableTr03Td3I1;
	public static final String recapituler3TableTr03Td41 = "Create a maven directory in /usr/local/src. ";
	public static final String recapituler3TableTr03Td4 = recapituler3TableTr03Td41;
	public static final String recapituler3TableTr04Td1I1 = "far fa-map-pin";
	public static final String recapituler3TableTr04Td1I = recapituler3TableTr04Td1I1;
	public static final String recapituler3TableTr04Td21 = "Where do I install Maven? ";
	public static final String recapituler3TableTr04Td2 = recapituler3TableTr04Td21;
	public static final String recapituler3TableTr04Td3Span1I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr04Td3Span1I = recapituler3TableTr04Td3Span1I1;
	public static final String recapituler3TableTr04Td41 = "Create a maven directory in /opt. ";
	public static final String recapituler3TableTr04Td4 = recapituler3TableTr04Td41;
	public static final String recapituler3TableTr05Td1I1 = "far fa-cloud-download";
	public static final String recapituler3TableTr05Td1I = recapituler3TableTr05Td1I1;
	public static final String recapituler3TableTr05Td21 = "How do I download the maven source code? ";
	public static final String recapituler3TableTr05Td2 = recapituler3TableTr05Td21;
	public static final String recapituler3TableTr05Td3I1 = "fab fa-git";
	public static final String recapituler3TableTr05Td3I = recapituler3TableTr05Td3I1;
	public static final String recapituler3TableTr05Td41 = "Clone the source code with the git command. ";
	public static final String recapituler3TableTr05Td4 = recapituler3TableTr05Td41;
	public static final String recapituler3TableTr06Td1I1 = "far fa-code-branch";
	public static final String recapituler3TableTr06Td1I = recapituler3TableTr06Td1I1;
	public static final String recapituler3TableTr06Td21 = "How do I pick a recent version of Maven? ";
	public static final String recapituler3TableTr06Td2 = recapituler3TableTr06Td21;
	public static final String recapituler3TableTr06Td3I1 = "far fa-tag";
	public static final String recapituler3TableTr06Td3I = recapituler3TableTr06Td3I1;
	public static final String recapituler3TableTr06Td41 = "List all the tags in the git repository. ";
	public static final String recapituler3TableTr06Td4 = recapituler3TableTr06Td41;
	public static final String recapituler3TableTr07Td1I1 = "far fa-code-merge";
	public static final String recapituler3TableTr07Td1I = recapituler3TableTr07Td1I1;
	public static final String recapituler3TableTr07Td21 = "How do I switch versions of the maven source code? ";
	public static final String recapituler3TableTr07Td2 = recapituler3TableTr07Td21;
	public static final String recapituler3TableTr07Td3I1 = "far fa-code-commit";
	public static final String recapituler3TableTr07Td3I = recapituler3TableTr07Td3I1;
	public static final String recapituler3TableTr07Td41 = "Checkout the git tag. ";
	public static final String recapituler3TableTr07Td4 = recapituler3TableTr07Td41;
	public static final String recapituler3TableTr08Td1I1 = "far fa-tools";
	public static final String recapituler3TableTr08Td1I = recapituler3TableTr08Td1I1;
	public static final String recapituler3TableTr08Td21 = "How do I build the maven source code? ";
	public static final String recapituler3TableTr08Td2 = recapituler3TableTr08Td21;
	public static final String recapituler3TableTr08Td3I1 = "far fa-terminal";
	public static final String recapituler3TableTr08Td3I = recapituler3TableTr08Td3I1;
	public static final String recapituler3TableTr08Td41 = "Build Maven with the mvn command. ";
	public static final String recapituler3TableTr08Td4 = recapituler3TableTr08Td41;
	public static final String recapituler3TableTr09Td1I1 = "far fa-question";
	public static final String recapituler3TableTr09Td1I = recapituler3TableTr09Td1I1;
	public static final String recapituler3TableTr09Td21 = "But why are we installing Maven to install the latest Maven? ";
	public static final String recapituler3TableTr09Td2 = recapituler3TableTr09Td21;
	public static final String recapituler3TableTr09Td3I1 = "far fa-flushed";
	public static final String recapituler3TableTr09Td3I = recapituler3TableTr09Td3I1;
	public static final String recapituler3TableTr09Td41 = "A program that requires itself to build itself. ";
	public static final String recapituler3TableTr09Td4 = recapituler3TableTr09Td41;
	public static final String recapituler3TableTr10Td1I1 = "far fa-mind-share";
	public static final String recapituler3TableTr10Td1I = recapituler3TableTr10Td1I1;
	public static final String recapituler3TableTr10Td21 = "How do I change the default mvn command on the system? ";
	public static final String recapituler3TableTr10Td2 = recapituler3TableTr10Td21;
	public static final String recapituler3TableTr10Td3I1 = "far fa-link";
	public static final String recapituler3TableTr10Td3I = recapituler3TableTr10Td3I1;
	public static final String recapituler3TableTr10Td41 = "Backup the original and make a symbolic link. ";
	public static final String recapituler3TableTr10Td4 = recapituler3TableTr10Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
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
	protected C001L005InstallerMaven recapituler3Init() {
		if(recapituler3 != null) {
			((C001L005InstallerMaven)this).avantPagePart(recapituler3, "recapituler3");
			((C001L005InstallerMaven)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
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

	protected boolean dejaInitialiseC001L005InstallerMaven = false;

	public C001L005InstallerMaven initLoinC001L005InstallerMaven(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L005InstallerMaven) {
			dejaInitialiseC001L005InstallerMaven = true;
			initLoinC001L005InstallerMaven();
		}
		return (C001L005InstallerMaven)this;
	}

	public void initLoinC001L005InstallerMaven() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L005InstallerMaven();
	}

	public void initC001L005InstallerMaven() {
		moiInit();
		questionDependencesInit();
		questionMkdirSrcInit();
		questionMkdirMavenInit();
		questionClonerSourceInit();
		questionListerTagsInit();
		questionCheckoutTagInit();
		questionConstruireSourceInit();
		questionMavenInstalleMavenInit();
		questionSauvegardeRemplacerInit();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L005InstallerMaven(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L005InstallerMaven(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(questionDependences != null)
			questionDependences.setRequeteSite_(requeteSite_);
		if(questionMkdirSrc != null)
			questionMkdirSrc.setRequeteSite_(requeteSite_);
		if(questionMkdirMaven != null)
			questionMkdirMaven.setRequeteSite_(requeteSite_);
		if(questionClonerSource != null)
			questionClonerSource.setRequeteSite_(requeteSite_);
		if(questionListerTags != null)
			questionListerTags.setRequeteSite_(requeteSite_);
		if(questionCheckoutTag != null)
			questionCheckoutTag.setRequeteSite_(requeteSite_);
		if(questionConstruireSource != null)
			questionConstruireSource.setRequeteSite_(requeteSite_);
		if(questionMavenInstalleMaven != null)
			questionMavenInstalleMaven.setRequeteSite_(requeteSite_);
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
		requeteSiteC001L005InstallerMaven(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L005InstallerMaven(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L005InstallerMaven(String var) {
		C001L005InstallerMaven oC001L005InstallerMaven = (C001L005InstallerMaven)this;
		switch(var) {
			case "moi":
				return oC001L005InstallerMaven.moi;
			case "questionDependences":
				return oC001L005InstallerMaven.questionDependences;
			case "questionMkdirSrc":
				return oC001L005InstallerMaven.questionMkdirSrc;
			case "questionMkdirMaven":
				return oC001L005InstallerMaven.questionMkdirMaven;
			case "questionClonerSource":
				return oC001L005InstallerMaven.questionClonerSource;
			case "questionListerTags":
				return oC001L005InstallerMaven.questionListerTags;
			case "questionCheckoutTag":
				return oC001L005InstallerMaven.questionCheckoutTag;
			case "questionConstruireSource":
				return oC001L005InstallerMaven.questionConstruireSource;
			case "questionMavenInstalleMaven":
				return oC001L005InstallerMaven.questionMavenInstalleMaven;
			case "questionSauvegardeRemplacer":
				return oC001L005InstallerMaven.questionSauvegardeRemplacer;
			case "recapituler1":
				return oC001L005InstallerMaven.recapituler1;
			case "recapituler2":
				return oC001L005InstallerMaven.recapituler2;
			case "recapituler3":
				return oC001L005InstallerMaven.recapituler3;
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
				o = attribuerC001L005InstallerMaven(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L005InstallerMaven(String var, Object val) {
		C001L005InstallerMaven oC001L005InstallerMaven = (C001L005InstallerMaven)this;
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
					o = definirC001L005InstallerMaven(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L005InstallerMaven(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven-999.png"));
				System.out.println("C001L005InstallerMavenFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/004-how-to-install-the-latest-version-of-maven?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/004-how-to-install-the-latest-version-of-maven-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/004-how-to-install-the-latest-version-of-maven-999.png"));
				System.out.println("C001L005InstallerMavenEnUSPage");
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L005InstallerMaven o = new C001L005InstallerMaven();
			o.requeteSiteC001L005InstallerMaven(requeteSite);
			o.initLoinC001L005InstallerMaven(requeteSite);
			o.indexerC001L005InstallerMaven();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001L005InstallerMaven();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001L005InstallerMaven(document);
	}

	public void indexerC001L005InstallerMaven(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L005InstallerMaven(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L005InstallerMaven() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L005InstallerMaven(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L005InstallerMaven(SolrInputDocument document) {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L005InstallerMaven() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinC001L005InstallerMaven(siteContexte.getRequeteSite_());
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
		stockerC001L005InstallerMaven(solrDocument);
	}
	public void stockerC001L005InstallerMaven(SolrDocument solrDocument) {
		C001L005InstallerMaven oC001L005InstallerMaven = (C001L005InstallerMaven)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L005InstallerMaven();
	}

	public void htmlBodyCourtC001L005InstallerMaven() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(questionDependences != null)
			questionDependences.htmlBodyCourt();
		if(questionMkdirSrc != null)
			questionMkdirSrc.htmlBodyCourt();
		if(questionMkdirMaven != null)
			questionMkdirMaven.htmlBodyCourt();
		if(questionClonerSource != null)
			questionClonerSource.htmlBodyCourt();
		if(questionListerTags != null)
			questionListerTags.htmlBodyCourt();
		if(questionCheckoutTag != null)
			questionCheckoutTag.htmlBodyCourt();
		if(questionConstruireSource != null)
			questionConstruireSource.htmlBodyCourt();
		if(questionMavenInstalleMaven != null)
			questionMavenInstalleMaven.htmlBodyCourt();
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
		htmlBodyC001L005InstallerMaven();
		super.htmlBody();
	}

	public void htmlBodyC001L005InstallerMaven() {
		((C001L005InstallerMaven)this).htmlBodyMoi();
		((C001L005InstallerMaven)this).htmlBodyQuestionDependences();
		((C001L005InstallerMaven)this).htmlBodyQuestionMkdirSrc();
		((C001L005InstallerMaven)this).htmlBodyQuestionMkdirMaven();
		((C001L005InstallerMaven)this).htmlBodyQuestionClonerSource();
		((C001L005InstallerMaven)this).htmlBodyQuestionListerTags();
		((C001L005InstallerMaven)this).htmlBodyQuestionCheckoutTag();
		((C001L005InstallerMaven)this).htmlBodyQuestionConstruireSource();
		((C001L005InstallerMaven)this).htmlBodyQuestionMavenInstalleMaven();
		((C001L005InstallerMaven)this).htmlBodyQuestionSauvegardeRemplacer();
		((C001L005InstallerMaven)this).htmlBodyRecapituler1();
		((C001L005InstallerMaven)this).htmlBodyRecapituler2();
		((C001L005InstallerMaven)this).htmlBodyRecapituler3();
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
		if(!(o instanceof C001L005InstallerMaven))
			return false;
		C001L005InstallerMaven that = (C001L005InstallerMaven)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L005InstallerMaven {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L005InstallerMavenVals = new String[] { moiP1, moiP2, moiP3, moiP4, moiP5, questionDependencesH3I1, questionDependencesH3Span1, questionDependencesH4I1, questionDependencesH4Span1, questionDependencesPre1Span11, questionDependencesPre1Span21, questionDependencesPre1Span31, questionDependencesPre1Span41, questionDependencesOl2Li11, questionDependencesOl2Li12, questionDependencesOl2Li21, questionDependencesOl2Li22, questionDependencesOl2Li31, questionDependencesOl2Li41, questionDependencesPre3Span11, questionDependencesPre3Span21, questionDependencesPre3Span31, questionDependencesPre3Span41, questionDependencesPre3Span51, questionDependencesOl4Li11, questionDependencesOl4Li21, questionDependencesOl4Li31, questionDependencesOl4Li41, questionDependencesOl4Li51, questionMkdirSrcH3I1, questionMkdirSrcH3Span1, questionMkdirSrcH4I1, questionMkdirSrcH4Span1, questionMkdirSrcPreSpan11, questionMkdirSrcPreSpan21, questionMkdirSrcPreSpan31, questionMkdirSrcPreSpan41, questionMkdirSrcPreSpan51, questionMkdirSrcPreSpan61, questionMkdirSrcPreSpan71, questionMkdirSrcPreSpan81, questionMkdirSrcOl2Li11, questionMkdirSrcOl2Li21, questionMkdirSrcOl2Li31, questionMkdirSrcOl2Li41, questionMkdirSrcOl2Li51, questionMkdirSrcOl2Li61, questionMkdirSrcOl2Li71, questionMkdirSrcOl2Li81, questionMkdirSrcOl2Li82, questionMkdirMavenH3I1, questionMkdirMavenH3Span1, questionMkdirMavenH4I1, questionMkdirMavenH4Span1, questionMkdirMavenPreSpan11, questionMkdirMavenPreSpan21, questionMkdirMavenPreSpan31, questionMkdirMavenPreSpan41, questionMkdirMavenPreSpan51, questionMkdirMavenPreSpan61, questionMkdirMavenPreSpan71, questionMkdirMavenPreSpan81, questionMkdirMavenOl2Li11, questionMkdirMavenOl2Li21, questionMkdirMavenOl2Li31, questionMkdirMavenOl2Li41, questionMkdirMavenOl2Li51, questionMkdirMavenOl2Li61, questionMkdirMavenOl2Li71, questionMkdirMavenOl2Li81, questionClonerSourceH3I1, questionClonerSourceH3Span1, questionClonerSourceH4I1, questionClonerSourceH4Span1, questionClonerSourcePreSpan11, questionClonerSourcePreSpan21, questionClonerSourcePreSpan31, questionClonerSourcePreSpan41, questionClonerSourceOl2Li11, questionClonerSourceOl2Li21, questionClonerSourceOl2Li31, questionClonerSourceOl2Li41, questionListerTagsH3I1, questionListerTagsH3Span1, questionListerTagsH4I1, questionListerTagsH4Span1, questionListerTagsPreSpan11, questionListerTagsPreSpan21, questionListerTagsPreSpan31, questionListerTagsPreSpan41, questionListerTagsPreSpan51, questionListerTagsOl2Li11, questionListerTagsOl2Li21, questionListerTagsOl2Li31, questionListerTagsOl2Li41, questionListerTagsOl2Li51, questionCheckoutTagH3I1, questionCheckoutTagH3Span1, questionCheckoutTagH4I1, questionCheckoutTagH4Span1, questionCheckoutTagPreSpan11, questionCheckoutTagPreSpan21, questionCheckoutTagPreSpan31, questionCheckoutTagPreSpan41, questionCheckoutTagPreSpan51, questionCheckoutTagPreSpan61, questionCheckoutTagOl2Li11, questionCheckoutTagOl2Li21, questionCheckoutTagOl2Li31, questionCheckoutTagOl2Li41, questionCheckoutTagOl2Li51, questionCheckoutTagOl2Li61, questionConstruireSourceH3I1, questionConstruireSourceH3Span1, questionConstruireSourceH4I1, questionConstruireSourceH4Span1, questionConstruireSourcePre1Span11, questionConstruireSourcePre1Span21, questionConstruireSourcePre1Span31, questionConstruireSourcePre1Span41, questionConstruireSourcePre1Span51, questionConstruireSourcePre1Span61, questionConstruireSourcePre1Span71, questionConstruireSourceOl1Li11, questionConstruireSourceOl1Li21, questionConstruireSourceOl1Li31, questionConstruireSourceOl1Li41, questionConstruireSourceOl1Li51, questionConstruireSourceOl1Li61, questionConstruireSourceOl1Li71, questionConstruireSourcePre2Span11, questionConstruireSourcePre2Span21, questionConstruireSourcePre2Span31, questionConstruireSourcePre2Span41, questionConstruireSourceOl2Li11, questionConstruireSourceOl2Li21, questionConstruireSourceOl2Li31, questionConstruireSourceOl2Li32, questionConstruireSourceOl2Li41, questionConstruireSourceOl2Li42, questionMavenInstalleMavenH3I1, questionMavenInstalleMavenH3Span1, questionMavenInstalleMavenH4I1, questionMavenInstalleMavenH4Span1, questionMavenInstalleMavenH5Span1, questionMavenInstalleMavenP5Span1, questionMavenInstalleMavenP5Span2, questionMavenInstalleMavenP5Span3, questionMavenInstalleMavenP5Span4, questionSauvegardeRemplacerH3I1, questionSauvegardeRemplacerH3Span1, questionSauvegardeRemplacerH4I1, questionSauvegardeRemplacerH4Span1, questionSauvegardeRemplacerPre1Span11, questionSauvegardeRemplacerPre1Span21, questionSauvegardeRemplacerOl1Li11, questionSauvegardeRemplacerOl1Li21, questionSauvegardeRemplacerPre2Span11, questionSauvegardeRemplacerPre2Span21, questionSauvegardeRemplacerOl2Li11, questionSauvegardeRemplacerOl2Li21, questionSauvegardeRemplacerPre3Span11, questionSauvegardeRemplacerPre3Span21, questionSauvegardeRemplacerPre3Span31, questionSauvegardeRemplacerPre3Span41, questionSauvegardeRemplacerOl3Li11, questionSauvegardeRemplacerOl3Li21, questionSauvegardeRemplacerOl3Li31, questionSauvegardeRemplacerOl3Li41, questionSauvegardeRemplacerPre4Span11, questionSauvegardeRemplacerPre4Span21, questionSauvegardeRemplacerPre4Span31, questionSauvegardeRemplacerPre4Span41, questionSauvegardeRemplacerPre4Span51, questionSauvegardeRemplacerOl4Li11, questionSauvegardeRemplacerOl4Li21, questionSauvegardeRemplacerOl4Li31, questionSauvegardeRemplacerOl4Li41, questionSauvegardeRemplacerOl4Li51, questionSauvegardeRemplacerP41, questionSauvegardeRemplacerPre5Span11, questionSauvegardeRemplacerPre5Span21, questionSauvegardeRemplacerPre6Span11, questionSauvegardeRemplacerPre6Span21, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3Span1I1, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41 };
}
