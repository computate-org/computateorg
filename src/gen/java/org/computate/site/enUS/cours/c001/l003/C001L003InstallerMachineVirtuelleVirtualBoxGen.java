package org.computate.site.enUS.cours.c001.l003;

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
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L003InstallerMachineVirtuelleVirtualBoxGen<DEV> extends C001Lecon {

	public static final String C001L003InstallerMachineVirtuelleVirtualBox_UnNom = "a lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_Ce = "this ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_CeNom = "this lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_Un = "an ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_LeNom = "the lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_NomSingulier = "lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_NomPluriel = "lessons";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_NomActuel = "current lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_TousNom = "the lessons";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_RechercherTousNomPar = "search lessons by ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_H1 = "How do I try CentOS 7 Linux without replacing my operating system? ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_H2 = "Try CentOS 7 on a VirtualBox virtual machine. ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_Titre = "How do I try CentOS 7 Linux without replacing my operating system? Try CentOS 7 on a VirtualBox virtual machine. ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_LesNoms = "the lessons";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_AucunNomTrouve = "no lesson found";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_NomVar = "lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_DeNom = "of lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_Couleur = "green";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_IconeGroupe = "regular";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_IconeNom = "question";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_Uri = "/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_ImageUri = "/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_Uri = "/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_ImageUri = "/png/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box-999.png";

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. ";
	public static final String moiP2 = "I will help you create your own successful website, on your own computer, using open-source software. ";
	public static final String moiP = moiP1 + moiP2;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml moi = new PageHtml();
	public Couverture<PageHtml> moiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L003InstallerMachineVirtuelleVirtualBox moiInit() {
		if(moi != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(moi, "moi");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyMoi(PageHtml o) {
		{ e("p").a("class", " moiP ").f();
			sx(moiP1);
			sx(moiP2);
		} g("p");
	}
	public void htmlBodyMoi() {
		moi.htmlAvant();
		htmlBodyMoi(moi);
		moi.htmlApres();
	}

	/////////////
	// ecraser //
	/////////////

	public static final String ecraserH3I1 = "fas fa-eraser";
	public static final String ecraserH3I = ecraserH3I1;
	public static final String ecraserH3Span1 = "Is it possible to try Linux without destroying my operating system? ";
	public static final String ecraserH3Span = ecraserH3Span1;
	public static final String ecraserH4Span1I1 = "fab fa-windows";
	public static final String ecraserH4Span1I = ecraserH4Span1I1;
	public static final String ecraserH4Span2I1 = "fab fa-apple";
	public static final String ecraserH4Span2I = ecraserH4Span2I1;
	public static final String ecraserH4Span3I1 = "fab fa-linux";
	public static final String ecraserH4Span3I = ecraserH4Span3I1;
	public static final String ecraserH4Span1 = "Virtualization can run Linux on any operating system. ";
	public static final String ecraserH4Span = ecraserH4Span1;
	public static final String ecraserPDiv1 = "Thanks to virtualization, trying out operating systems on your own computer is simple! ";
	public static final String ecraserPDiv2 = "Virtualization allows you to run virtual machines. ";
	public static final String ecraserPDiv3 = "Virtual machines are entire operating systems running under your own operating system through software. ";
	public static final String ecraserPDiv4 = "Virtualization is free, thanks to many good software packages! ";
	public static final String ecraserPDiv5 = "For Linux I recommend Libvirt for more power, but for a cross-platform solution, we will be using VirtualBox in this lesson. ";
	public static final String ecraserPDiv6 = "I'll teach you how to get a CentOS 7 virtual machine running on your system. ";
	public static final String ecraserPDiv = ecraserPDiv1 + ecraserPDiv2 + ecraserPDiv3 + ecraserPDiv4 + ecraserPDiv5 + ecraserPDiv6;

	/**	L'entité « ecraser »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml ecraser = new PageHtml();
	public Couverture<PageHtml> ecraserCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("ecraser").o(ecraser);

	/**	<br/>L'entité « ecraser »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:ecraser">Trouver l'entité ecraser dans Solr</a>
	 * <br/>
	 * @param ecraser est l'entité déjà construit. 
	 **/
	protected abstract void _ecraser(PageHtml o);

	public PageHtml getEcraser() {
		return ecraser;
	}

	public void setEcraser(PageHtml ecraser) {
		this.ecraser = ecraser;
		this.ecraserCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox ecraserInit() {
		if(ecraser != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(ecraser, "ecraser");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(ecraser, "ecraser");
		}
		if(!ecraserCouverture.dejaInitialise) {
			_ecraser(ecraser);
		}
		ecraser.initLoinPourClasse(requeteSite_);
		ecraserCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyEcraser(PageHtml o) {
		{ e("h3").a("class", " ecraserH3 ").f();
			{ e("i").a("class", ecraserH3I1, " site-menu-icon ecraserH3I ").f();
			} g("i");
			{ e("span").a("class", " ecraserH3Span ").f();
				sx(ecraserH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " ecraserH4 ").f();
			{ e("span").a("class", " ecraserH4Span1 ecraserH4Span odd ").f();
				{ e("i").a("class", ecraserH4Span1I1, " site-menu-icon ecraserH4Span1I ").f();
				} g("i");
			} g("span");
			{ e("span").a("class", " ecraserH4Span2 ecraserH4Span even ").f();
				{ e("i").a("class", ecraserH4Span2I1, " site-menu-icon ecraserH4Span2I ").f();
				} g("i");
			} g("span");
			{ e("span").a("class", " ecraserH4Span3 ecraserH4Span odd ").f();
				{ e("i").a("class", ecraserH4Span3I1, " site-menu-icon ecraserH4Span3I ").f();
				} g("i");
			} g("span");
			{ e("span").a("class", " ecraserH4Span ").f();
				sx(ecraserH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " ecraserP ").f();
			{ e("div").a("class", " ecraserPDiv ").f();
				sx(ecraserPDiv1);
				sx(ecraserPDiv2);
				sx(ecraserPDiv3);
				sx(ecraserPDiv4);
				sx(ecraserPDiv5);
				sx(ecraserPDiv6);
			} g("div");
		} g("p");
	}
	public void htmlBodyEcraser() {
		ecraser.htmlAvant();
		htmlBodyEcraser(ecraser);
		ecraser.htmlApres();
	}

	//////////////////////
	// commentInstaller //
	//////////////////////

	public static final String commentInstallerH3I1 = "fas fa-person-carry";
	public static final String commentInstallerH3I = commentInstallerH3I1;
	public static final String commentInstallerH3Span1 = "How do I install VirtualBox for virtualization? ";
	public static final String commentInstallerH3Span = commentInstallerH3Span1;
	public static final String commentInstallerH4I1 = "fas fa-cloud-download-alt";
	public static final String commentInstallerH4I = commentInstallerH4I1;
	public static final String commentInstallerH4Span1 = "Simply download it from virtualbox.org. ";
	public static final String commentInstallerH4Span = commentInstallerH4Span1;
	public static final String commentInstallerPOlLi1Span1 = "VirtualBox is easy to download and install. ";
	public static final String commentInstallerPOlLi1Span = commentInstallerPOlLi1Span1;
	public static final String commentInstallerPOlLi2Span1 = "Visit this url: ";
	public static final String commentInstallerPOlLi2Span = commentInstallerPOlLi2Span1;
	public static final String commentInstallerPOlLi2A1 = "https://www.virtualbox.org/wiki/Downloads";
	public static final String commentInstallerPOlLi2A = commentInstallerPOlLi2A1;
	public static final String commentInstallerPOlLi3Span1 = "You can download it on a Windows host, an OS X host, a Linux or Solaris host. ";
	public static final String commentInstallerPOlLi3Span = commentInstallerPOlLi3Span1;
	public static final String commentInstallerPOlLi4Span1 = "Because I am running CentOS 7, which is similar to RHEL, I will use the RHEL instructions at the very bottom of the page. ";
	public static final String commentInstallerPOlLi4Span = commentInstallerPOlLi4Span1;

	/**	L'entité « commentInstaller »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml commentInstaller = new PageHtml();
	public Couverture<PageHtml> commentInstallerCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("commentInstaller").o(commentInstaller);

	/**	<br/>L'entité « commentInstaller »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:commentInstaller">Trouver l'entité commentInstaller dans Solr</a>
	 * <br/>
	 * @param commentInstaller est l'entité déjà construit. 
	 **/
	protected abstract void _commentInstaller(PageHtml o);

	public PageHtml getCommentInstaller() {
		return commentInstaller;
	}

	public void setCommentInstaller(PageHtml commentInstaller) {
		this.commentInstaller = commentInstaller;
		this.commentInstallerCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox commentInstallerInit() {
		if(commentInstaller != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(commentInstaller, "commentInstaller");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(commentInstaller, "commentInstaller");
		}
		if(!commentInstallerCouverture.dejaInitialise) {
			_commentInstaller(commentInstaller);
		}
		commentInstaller.initLoinPourClasse(requeteSite_);
		commentInstallerCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyCommentInstaller(PageHtml o) {
		{ e("h3").a("class", " commentInstallerH3 ").f();
			{ e("i").a("class", commentInstallerH3I1, " site-menu-icon commentInstallerH3I ").f();
			} g("i");
			{ e("span").a("class", " commentInstallerH3Span ").f();
				sx(commentInstallerH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " commentInstallerH4 ").f();
			{ e("i").a("class", commentInstallerH4I1, " site-menu-icon commentInstallerH4I ").f();
			} g("i");
			{ e("span").a("class", " commentInstallerH4Span ").f();
				sx(commentInstallerH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " commentInstallerP ").f();
			{ e("ol").a("class", " commentInstallerPOl ").f();
				{ e("li").a("class", " commentInstallerPOlLi1 commentInstallerPOlLi odd ").f();
					{ e("span").a("class", " commentInstallerPOlLi1Span ").f();
						sx(commentInstallerPOlLi1Span1);
					} g("span");
				} g("li");
				{ e("li").a("class", " commentInstallerPOlLi2 commentInstallerPOlLi even ").f();
					{ e("span").a("class", " commentInstallerPOlLi2Span ").f();
						sx(commentInstallerPOlLi2Span1);
					} g("span");
					{ e("a").a("class", " commentInstallerPOlLi2A ").a("href", commentInstallerPOlLi2A1).f();
						sx(commentInstallerPOlLi2A1);
					} g("a");
				} g("li");
				{ e("li").a("class", " commentInstallerPOlLi3 commentInstallerPOlLi odd ").f();
					{ e("span").a("class", " commentInstallerPOlLi3Span ").f();
						sx(commentInstallerPOlLi3Span1);
					} g("span");
				} g("li");
				{ e("li").a("class", " commentInstallerPOlLi4 commentInstallerPOlLi even ").f();
					{ e("span").a("class", " commentInstallerPOlLi4Span ").f();
						sx(commentInstallerPOlLi4Span1);
					} g("span");
				} g("li");
			} g("ol");
		} g("p");
	}
	public void htmlBodyCommentInstaller() {
		commentInstaller.htmlAvant();
		htmlBodyCommentInstaller(commentInstaller);
		commentInstaller.htmlApres();
	}

	/////////////////
	// telecharger //
	/////////////////

	public static final String telechargerH3I1 = "fas fa-play-circle";
	public static final String telechargerH3I = telechargerH3I1;
	public static final String telechargerH3Span1 = "How can I prepare CentOS 7 to install VirtualBox? ";
	public static final String telechargerH3Span = telechargerH3Span1;
	public static final String telechargerH4I1 = "fas fa-download";
	public static final String telechargerH4I = telechargerH4I1;
	public static final String telechargerH4Span1 = "Install the virtualbox yum repo";
	public static final String telechargerH4Span = telechargerH4Span1;
	public static final String telechargerPreSpan11 = "wget";
	public static final String telechargerPreSpan1 = telechargerPreSpan11;
	public static final String telechargerPreSpan21 = " https://download.virtualbox.org/virtualbox/rpm/el/virtualbox.repo";
	public static final String telechargerPreSpan2 = telechargerPreSpan21;
	public static final String telechargerPreSpan31 = " -O";
	public static final String telechargerPreSpan3 = telechargerPreSpan31;
	public static final String telechargerPreSpan41 = " /tmp/virtualbox.repo";
	public static final String telechargerPreSpan4 = telechargerPreSpan41;
	public static final String telechargerOlLi11 = "The command to download files. ";
	public static final String telechargerOlLi1 = telechargerOlLi11;
	public static final String telechargerOlLi21 = "The URL to the VirtualBox yum repository download file. ";
	public static final String telechargerOlLi2 = telechargerOlLi21;
	public static final String telechargerOlLi31 = "For specifying the output path for the downloaded file. ";
	public static final String telechargerOlLi3 = telechargerOlLi31;
	public static final String telechargerOlLi41 = "The output path for the downloaded yum repository file. ";
	public static final String telechargerOlLi4 = telechargerOlLi41;

	/**	L'entité « telecharger »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml telecharger = new PageHtml();
	public Couverture<PageHtml> telechargerCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("telecharger").o(telecharger);

	/**	<br/>L'entité « telecharger »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:telecharger">Trouver l'entité telecharger dans Solr</a>
	 * <br/>
	 * @param telecharger est l'entité déjà construit. 
	 **/
	protected abstract void _telecharger(PageHtml o);

	public PageHtml getTelecharger() {
		return telecharger;
	}

	public void setTelecharger(PageHtml telecharger) {
		this.telecharger = telecharger;
		this.telechargerCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox telechargerInit() {
		if(telecharger != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(telecharger, "telecharger");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(telecharger, "telecharger");
		}
		if(!telechargerCouverture.dejaInitialise) {
			_telecharger(telecharger);
		}
		telecharger.initLoinPourClasse(requeteSite_);
		telechargerCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyTelecharger(PageHtml o) {
		{ e("h3").a("class", " telechargerH3 ").f();
			{ e("i").a("class", telechargerH3I1, " site-menu-icon telechargerH3I ").f();
			} g("i");
			{ e("span").a("class", " telechargerH3Span ").f();
				sx(telechargerH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " telechargerH4 ").f();
			{ e("i").a("class", telechargerH4I1, " site-menu-icon telechargerH4I ").f();
			} g("i");
			{ e("span").a("class", " telechargerH4Span ").f();
				sx(telechargerH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " telechargerPre ").f();
			{ e("span").a("class", " telechargerPreSpan1 telechargerPreSpan odd ").f();
				sx(telechargerPreSpan11);
			} g("span");
			{ e("span").a("class", " telechargerPreSpan2 telechargerPreSpan even ").f();
				sx(telechargerPreSpan21);
			} g("span");
			{ e("span").a("class", " telechargerPreSpan3 telechargerPreSpan odd ").f();
				sx(telechargerPreSpan31);
			} g("span");
			{ e("span").a("class", " telechargerPreSpan4 telechargerPreSpan even ").f();
				sx(telechargerPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " telechargerOl ").f();
			{ e("li").a("class", " telechargerOlLi1 telechargerOlLi odd ").f();
				sx(telechargerOlLi11);
			} g("li");
			{ e("li").a("class", " telechargerOlLi2 telechargerOlLi even ").f();
				sx(telechargerOlLi21);
			} g("li");
			{ e("li").a("class", " telechargerOlLi3 telechargerOlLi odd ").f();
				sx(telechargerOlLi31);
			} g("li");
			{ e("li").a("class", " telechargerOlLi4 telechargerOlLi even ").f();
				sx(telechargerOlLi41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyTelecharger() {
		telecharger.htmlAvant();
		htmlBodyTelecharger(telecharger);
		telecharger.htmlApres();
	}

	///////////////////
	// deplacerDepot //
	///////////////////

	public static final String deplacerDepotH3I1 = "fas fa-box-check";
	public static final String deplacerDepotH3I = deplacerDepotH3I1;
	public static final String deplacerDepotH3Span1 = "How can I install the virtualbox yum repository? ";
	public static final String deplacerDepotH3Span = deplacerDepotH3Span1;
	public static final String deplacerDepotH4I1 = "fas fa-person-dolly";
	public static final String deplacerDepotH4I = deplacerDepotH4I1;
	public static final String deplacerDepotH4Span1 = "Put virtualbox.repo in /etc/yum.repos.d/. ";
	public static final String deplacerDepotH4Span = deplacerDepotH4Span1;
	public static final String deplacerDepotPreSpan11 = "sudo";
	public static final String deplacerDepotPreSpan1 = deplacerDepotPreSpan11;
	public static final String deplacerDepotPreSpan21 = " mv";
	public static final String deplacerDepotPreSpan2 = deplacerDepotPreSpan21;
	public static final String deplacerDepotPreSpan31 = " /tmp/virtualbox.repo";
	public static final String deplacerDepotPreSpan3 = deplacerDepotPreSpan31;
	public static final String deplacerDepotPreSpan41 = " /etc/yum.repos.d/";
	public static final String deplacerDepotPreSpan4 = deplacerDepotPreSpan41;
	public static final String deplacerDepotOlLi11 = "The command to install yum repositories begins with the command sudo. ";
	public static final String deplacerDepotOlLi12 = "The \"sudo\" command allows your current user to have root privileges for a few minutes after entering your password. ";
	public static final String deplacerDepotOlLi13 = "Installing yum repositories always requires root privileges. ";
	public static final String deplacerDepotOlLi1 = deplacerDepotOlLi11 + deplacerDepotOlLi12 + deplacerDepotOlLi13;
	public static final String deplacerDepotOlLi21 = "For moving files to new locations in the filesystem. ";
	public static final String deplacerDepotOlLi2 = deplacerDepotOlLi21;
	public static final String deplacerDepotOlLi31 = "The path to the downloaded yum repository file. ";
	public static final String deplacerDepotOlLi3 = deplacerDepotOlLi31;
	public static final String deplacerDepotOlLi41 = "The directory for configured yum repositories. ";
	public static final String deplacerDepotOlLi4 = deplacerDepotOlLi41;

	/**	L'entité « deplacerDepot »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml deplacerDepot = new PageHtml();
	public Couverture<PageHtml> deplacerDepotCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("deplacerDepot").o(deplacerDepot);

	/**	<br/>L'entité « deplacerDepot »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:deplacerDepot">Trouver l'entité deplacerDepot dans Solr</a>
	 * <br/>
	 * @param deplacerDepot est l'entité déjà construit. 
	 **/
	protected abstract void _deplacerDepot(PageHtml o);

	public PageHtml getDeplacerDepot() {
		return deplacerDepot;
	}

	public void setDeplacerDepot(PageHtml deplacerDepot) {
		this.deplacerDepot = deplacerDepot;
		this.deplacerDepotCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox deplacerDepotInit() {
		if(deplacerDepot != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(deplacerDepot, "deplacerDepot");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(deplacerDepot, "deplacerDepot");
		}
		if(!deplacerDepotCouverture.dejaInitialise) {
			_deplacerDepot(deplacerDepot);
		}
		deplacerDepot.initLoinPourClasse(requeteSite_);
		deplacerDepotCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyDeplacerDepot(PageHtml o) {
		{ e("h3").a("class", " deplacerDepotH3 ").f();
			{ e("i").a("class", deplacerDepotH3I1, " site-menu-icon deplacerDepotH3I ").f();
			} g("i");
			{ e("span").a("class", " deplacerDepotH3Span ").f();
				sx(deplacerDepotH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " deplacerDepotH4 ").f();
			{ e("i").a("class", deplacerDepotH4I1, " site-menu-icon deplacerDepotH4I ").f();
			} g("i");
			{ e("span").a("class", " deplacerDepotH4Span ").f();
				sx(deplacerDepotH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " deplacerDepotPre ").f();
			{ e("span").a("class", " deplacerDepotPreSpan1 deplacerDepotPreSpan odd ").f();
				sx(deplacerDepotPreSpan11);
			} g("span");
			{ e("span").a("class", " deplacerDepotPreSpan2 deplacerDepotPreSpan even ").f();
				sx(deplacerDepotPreSpan21);
			} g("span");
			{ e("span").a("class", " deplacerDepotPreSpan3 deplacerDepotPreSpan odd ").f();
				sx(deplacerDepotPreSpan31);
			} g("span");
			{ e("span").a("class", " deplacerDepotPreSpan4 deplacerDepotPreSpan even ").f();
				sx(deplacerDepotPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " deplacerDepotOl ").f();
			{ e("li").a("class", " deplacerDepotOlLi1 deplacerDepotOlLi odd ").f();
				sx(deplacerDepotOlLi11);
				sx(deplacerDepotOlLi12);
				sx(deplacerDepotOlLi13);
			} g("li");
			{ e("li").a("class", " deplacerDepotOlLi2 deplacerDepotOlLi even ").f();
				sx(deplacerDepotOlLi21);
			} g("li");
			{ e("li").a("class", " deplacerDepotOlLi3 deplacerDepotOlLi odd ").f();
				sx(deplacerDepotOlLi31);
			} g("li");
			{ e("li").a("class", " deplacerDepotOlLi4 deplacerDepotOlLi even ").f();
				sx(deplacerDepotOlLi41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyDeplacerDepot() {
		deplacerDepot.htmlAvant();
		htmlBodyDeplacerDepot(deplacerDepot);
		deplacerDepot.htmlApres();
	}

	///////////////
	// yumSearch //
	///////////////

	public static final String yumSearchH3I1 = "fas fa-question";
	public static final String yumSearchH3I = yumSearchH3I1;
	public static final String yumSearchH3Span1 = "How do I know what the VirtualBox package is called? ";
	public static final String yumSearchH3Span = yumSearchH3Span1;
	public static final String yumSearchH4I1 = "fas fa-search";
	public static final String yumSearchH4I = yumSearchH4I1;
	public static final String yumSearchH4Span1 = "Search for \\\"virtualbox\\\" in yum. ";
	public static final String yumSearchH4Span = yumSearchH4Span1;
	public static final String yumSearchPreSpan11 = "sudo";
	public static final String yumSearchPreSpan1 = yumSearchPreSpan11;
	public static final String yumSearchPreSpan21 = " yum";
	public static final String yumSearchPreSpan2 = yumSearchPreSpan21;
	public static final String yumSearchPreSpan31 = " search";
	public static final String yumSearchPreSpan3 = yumSearchPreSpan31;
	public static final String yumSearchPreSpan41 = " virtualbox";
	public static final String yumSearchPreSpan4 = yumSearchPreSpan41;
	public static final String yumSearchOlLi11 = "sudo";
	public static final String yumSearchOlLi1 = yumSearchOlLi11;
	public static final String yumSearchOlLi21 = "Which stands for \"Yellowdog Updater Modified\", but nobody knows it as yellowdog, just yum. ";
	public static final String yumSearchOlLi22 = "CentOS manages software packages and RPM application files with yum. ";
	public static final String yumSearchOlLi2 = yumSearchOlLi21 + yumSearchOlLi22;
	public static final String yumSearchOlLi31 = "For searching for available yum packages. ";
	public static final String yumSearchOlLi3 = yumSearchOlLi31;
	public static final String yumSearchOlLi41 = "A phrase to search for in the yum repositories, like \"virtualbox\". ";
	public static final String yumSearchOlLi4 = yumSearchOlLi41;

	/**	L'entité « yumSearch »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml yumSearch = new PageHtml();
	public Couverture<PageHtml> yumSearchCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("yumSearch").o(yumSearch);

	/**	<br/>L'entité « yumSearch »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:yumSearch">Trouver l'entité yumSearch dans Solr</a>
	 * <br/>
	 * @param yumSearch est l'entité déjà construit. 
	 **/
	protected abstract void _yumSearch(PageHtml o);

	public PageHtml getYumSearch() {
		return yumSearch;
	}

	public void setYumSearch(PageHtml yumSearch) {
		this.yumSearch = yumSearch;
		this.yumSearchCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox yumSearchInit() {
		if(yumSearch != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(yumSearch, "yumSearch");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(yumSearch, "yumSearch");
		}
		if(!yumSearchCouverture.dejaInitialise) {
			_yumSearch(yumSearch);
		}
		yumSearch.initLoinPourClasse(requeteSite_);
		yumSearchCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyYumSearch(PageHtml o) {
		{ e("h3").a("class", " yumSearchH3 ").f();
			{ e("i").a("class", yumSearchH3I1, " site-menu-icon yumSearchH3I ").f();
			} g("i");
			{ e("span").a("class", " yumSearchH3Span ").f();
				sx(yumSearchH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " yumSearchH4 ").f();
			{ e("i").a("class", yumSearchH4I1, " site-menu-icon yumSearchH4I ").f();
			} g("i");
			{ e("span").a("class", " yumSearchH4Span ").f();
				sx(yumSearchH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " yumSearchPre ").f();
			{ e("span").a("class", " yumSearchPreSpan1 yumSearchPreSpan odd ").f();
				sx(yumSearchPreSpan11);
			} g("span");
			{ e("span").a("class", " yumSearchPreSpan2 yumSearchPreSpan even ").f();
				sx(yumSearchPreSpan21);
			} g("span");
			{ e("span").a("class", " yumSearchPreSpan3 yumSearchPreSpan odd ").f();
				sx(yumSearchPreSpan31);
			} g("span");
			{ e("span").a("class", " yumSearchPreSpan4 yumSearchPreSpan even ").f();
				sx(yumSearchPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " yumSearchOl ").f();
			{ e("li").a("class", " yumSearchOlLi1 yumSearchOlLi odd ").f();
				sx(yumSearchOlLi11);
			} g("li");
			{ e("li").a("class", " yumSearchOlLi2 yumSearchOlLi even ").f();
				sx(yumSearchOlLi21);
				sx(yumSearchOlLi22);
			} g("li");
			{ e("li").a("class", " yumSearchOlLi3 yumSearchOlLi odd ").f();
				sx(yumSearchOlLi31);
			} g("li");
			{ e("li").a("class", " yumSearchOlLi4 yumSearchOlLi even ").f();
				sx(yumSearchOlLi41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyYumSearch() {
		yumSearch.htmlAvant();
		htmlBodyYumSearch(yumSearch);
		yumSearch.htmlApres();
	}

	///////////////////////
	// yumInstallPaquets //
	///////////////////////

	public static final String yumInstallPaquetsH3I1 = "fas fa-box";
	public static final String yumInstallPaquetsH3I = yumInstallPaquetsH3I1;
	public static final String yumInstallPaquetsH3Span1 = "How do I now install the VirtualBox application? ";
	public static final String yumInstallPaquetsH3Span = yumInstallPaquetsH3Span1;
	public static final String yumInstallPaquetsH4I1 = "fas fa-box-full";
	public static final String yumInstallPaquetsH4I = yumInstallPaquetsH4I1;
	public static final String yumInstallPaquetsH4Span1 = "Install the package with yum. ";
	public static final String yumInstallPaquetsH4Span = yumInstallPaquetsH4Span1;
	public static final String yumInstallPaquetsPreSpan11 = "sudo";
	public static final String yumInstallPaquetsPreSpan1 = yumInstallPaquetsPreSpan11;
	public static final String yumInstallPaquetsPreSpan21 = " yum";
	public static final String yumInstallPaquetsPreSpan2 = yumInstallPaquetsPreSpan21;
	public static final String yumInstallPaquetsPreSpan31 = " install";
	public static final String yumInstallPaquetsPreSpan3 = yumInstallPaquetsPreSpan31;
	public static final String yumInstallPaquetsPreSpan41 = " -y";
	public static final String yumInstallPaquetsPreSpan4 = yumInstallPaquetsPreSpan41;
	public static final String yumInstallPaquetsPreSpan51 = " VirtualBox-5.2";
	public static final String yumInstallPaquetsPreSpan5 = yumInstallPaquetsPreSpan51;
	public static final String yumInstallPaquetsOlLi11 = "sudo";
	public static final String yumInstallPaquetsOlLi1 = yumInstallPaquetsOlLi11;
	public static final String yumInstallPaquetsOlLi21 = "yum";
	public static final String yumInstallPaquetsOlLi2 = yumInstallPaquetsOlLi21;
	public static final String yumInstallPaquetsOlLi31 = "For installing new yum packages. ";
	public static final String yumInstallPaquetsOlLi3 = yumInstallPaquetsOlLi31;
	public static final String yumInstallPaquetsOlLi41 = "Suppress messages asking to confirm if you want to install the software. ";
	public static final String yumInstallPaquetsOlLi4 = yumInstallPaquetsOlLi41;
	public static final String yumInstallPaquetsOlLi51 = "The package name of VirtualBox you wish to install. ";
	public static final String yumInstallPaquetsOlLi52 = "You can use the package name before the \".x86_64\" from the yum search you did earlier. ";
	public static final String yumInstallPaquetsOlLi53 = "For me it is \"VirtualBox-5.2\". ";
	public static final String yumInstallPaquetsOlLi5 = yumInstallPaquetsOlLi51 + yumInstallPaquetsOlLi52 + yumInstallPaquetsOlLi53;

	/**	L'entité « yumInstallPaquets »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml yumInstallPaquets = new PageHtml();
	public Couverture<PageHtml> yumInstallPaquetsCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("yumInstallPaquets").o(yumInstallPaquets);

	/**	<br/>L'entité « yumInstallPaquets »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:yumInstallPaquets">Trouver l'entité yumInstallPaquets dans Solr</a>
	 * <br/>
	 * @param yumInstallPaquets est l'entité déjà construit. 
	 **/
	protected abstract void _yumInstallPaquets(PageHtml o);

	public PageHtml getYumInstallPaquets() {
		return yumInstallPaquets;
	}

	public void setYumInstallPaquets(PageHtml yumInstallPaquets) {
		this.yumInstallPaquets = yumInstallPaquets;
		this.yumInstallPaquetsCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox yumInstallPaquetsInit() {
		if(yumInstallPaquets != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(yumInstallPaquets, "yumInstallPaquets");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(yumInstallPaquets, "yumInstallPaquets");
		}
		if(!yumInstallPaquetsCouverture.dejaInitialise) {
			_yumInstallPaquets(yumInstallPaquets);
		}
		yumInstallPaquets.initLoinPourClasse(requeteSite_);
		yumInstallPaquetsCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyYumInstallPaquets(PageHtml o) {
		{ e("h3").a("class", " yumInstallPaquetsH3 ").f();
			{ e("i").a("class", yumInstallPaquetsH3I1, " site-menu-icon yumInstallPaquetsH3I ").f();
			} g("i");
			{ e("span").a("class", " yumInstallPaquetsH3Span ").f();
				sx(yumInstallPaquetsH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " yumInstallPaquetsH4 ").f();
			{ e("i").a("class", yumInstallPaquetsH4I1, " site-menu-icon yumInstallPaquetsH4I ").f();
			} g("i");
			{ e("span").a("class", " yumInstallPaquetsH4Span ").f();
				sx(yumInstallPaquetsH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " yumInstallPaquetsPre ").f();
			{ e("span").a("class", " yumInstallPaquetsPreSpan1 yumInstallPaquetsPreSpan odd ").f();
				sx(yumInstallPaquetsPreSpan11);
			} g("span");
			{ e("span").a("class", " yumInstallPaquetsPreSpan2 yumInstallPaquetsPreSpan even ").f();
				sx(yumInstallPaquetsPreSpan21);
			} g("span");
			{ e("span").a("class", " yumInstallPaquetsPreSpan3 yumInstallPaquetsPreSpan odd ").f();
				sx(yumInstallPaquetsPreSpan31);
			} g("span");
			{ e("span").a("class", " yumInstallPaquetsPreSpan4 yumInstallPaquetsPreSpan even ").f();
				sx(yumInstallPaquetsPreSpan41);
			} g("span");
			{ e("span").a("class", " yumInstallPaquetsPreSpan5 yumInstallPaquetsPreSpan odd ").f();
				sx(yumInstallPaquetsPreSpan51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " yumInstallPaquetsOl ").f();
			{ e("li").a("class", " yumInstallPaquetsOlLi1 yumInstallPaquetsOlLi odd ").f();
				sx(yumInstallPaquetsOlLi11);
			} g("li");
			{ e("li").a("class", " yumInstallPaquetsOlLi2 yumInstallPaquetsOlLi even ").f();
				sx(yumInstallPaquetsOlLi21);
			} g("li");
			{ e("li").a("class", " yumInstallPaquetsOlLi3 yumInstallPaquetsOlLi odd ").f();
				sx(yumInstallPaquetsOlLi31);
			} g("li");
			{ e("li").a("class", " yumInstallPaquetsOlLi4 yumInstallPaquetsOlLi even ").f();
				sx(yumInstallPaquetsOlLi41);
			} g("li");
			{ e("li").a("class", " yumInstallPaquetsOlLi5 yumInstallPaquetsOlLi odd ").f();
				sx(yumInstallPaquetsOlLi51);
				sx(yumInstallPaquetsOlLi52);
				sx(yumInstallPaquetsOlLi53);
			} g("li");
		} g("ol");
	}
	public void htmlBodyYumInstallPaquets() {
		yumInstallPaquets.htmlAvant();
		htmlBodyYumInstallPaquets(yumInstallPaquets);
		yumInstallPaquets.htmlApres();
	}

	////////////////////
	// telechargerIso //
	////////////////////

	public static final String telechargerIsoH3I1 = "fas fa-clipboard-list";
	public static final String telechargerIsoH3I = telechargerIsoH3I1;
	public static final String telechargerIsoH3Span1 = "How do I put an operating system on a VirtualBox virtual machine? ";
	public static final String telechargerIsoH3Span = telechargerIsoH3Span1;
	public static final String telechargerIsoH4I1 = "fas fa-arrow-alt-to-bottom";
	public static final String telechargerIsoH4I = telechargerIsoH4I1;
	public static final String telechargerIsoH4Span1 = "Download an ISO file. ";
	public static final String telechargerIsoH4Span = telechargerIsoH4Span1;
	public static final String telechargerIsoPreSpan11 = "wget";
	public static final String telechargerIsoPreSpan1 = telechargerIsoPreSpan11;
	public static final String telechargerIsoPreSpan21 = " http://mirrors.xmission.com/centos/7.6.1810/isos/x86_64/CentOS-7-x86_64-DVD-1810.iso";
	public static final String telechargerIsoPreSpan2 = telechargerIsoPreSpan21;
	public static final String telechargerIsoPreSpan31 = " -O";
	public static final String telechargerIsoPreSpan3 = telechargerIsoPreSpan31;
	public static final String telechargerIsoPreSpan41 = " ~/Downloads/CentOS-7-x86_64-DVD-1810.iso";
	public static final String telechargerIsoPreSpan4 = telechargerIsoPreSpan41;
	public static final String telechargerIsoOlLi11 = "wget";
	public static final String telechargerIsoOlLi1 = telechargerIsoOlLi11;
	public static final String telechargerIsoOlLi21 = "The URL to the CentOS 7 ISO file to download. ";
	public static final String telechargerIsoOlLi2 = telechargerIsoOlLi21;
	public static final String telechargerIsoOlLi31 = "-O";
	public static final String telechargerIsoOlLi3 = telechargerIsoOlLi31;
	public static final String telechargerIsoOlLi41 = "The output path for the downloaded CentOS 7 ISO file. ";
	public static final String telechargerIsoOlLi4 = telechargerIsoOlLi41;
	public static final String telechargerIsoPSpan11 = "You can download the latest CentOS 7 ISO file to install on a new virtual machine here ";
	public static final String telechargerIsoPSpan1 = telechargerIsoPSpan11;
	public static final String telechargerIsoPSpan2A1 = "https://www.centos.org/download/";
	public static final String telechargerIsoPSpan2A = telechargerIsoPSpan2A1;
	public static final String telechargerIsoPSpan31 = ". Click on the [ DVD ISO ] button. ";
	public static final String telechargerIsoPSpan32 = "You can choose from any of the mirrors, you might find one close to you. ";
	public static final String telechargerIsoPSpan33 = "You can also download the file using the wget command in the terminal like that. ";
	public static final String telechargerIsoPSpan3 = telechargerIsoPSpan31 + telechargerIsoPSpan32 + telechargerIsoPSpan33;

	/**	L'entité « telechargerIso »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml telechargerIso = new PageHtml();
	public Couverture<PageHtml> telechargerIsoCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("telechargerIso").o(telechargerIso);

	/**	<br/>L'entité « telechargerIso »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:telechargerIso">Trouver l'entité telechargerIso dans Solr</a>
	 * <br/>
	 * @param telechargerIso est l'entité déjà construit. 
	 **/
	protected abstract void _telechargerIso(PageHtml o);

	public PageHtml getTelechargerIso() {
		return telechargerIso;
	}

	public void setTelechargerIso(PageHtml telechargerIso) {
		this.telechargerIso = telechargerIso;
		this.telechargerIsoCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox telechargerIsoInit() {
		if(telechargerIso != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(telechargerIso, "telechargerIso");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(telechargerIso, "telechargerIso");
		}
		if(!telechargerIsoCouverture.dejaInitialise) {
			_telechargerIso(telechargerIso);
		}
		telechargerIso.initLoinPourClasse(requeteSite_);
		telechargerIsoCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyTelechargerIso(PageHtml o) {
		{ e("h3").a("class", " telechargerIsoH3 ").f();
			{ e("i").a("class", telechargerIsoH3I1, " site-menu-icon telechargerIsoH3I ").f();
			} g("i");
			{ e("span").a("class", " telechargerIsoH3Span ").f();
				sx(telechargerIsoH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " telechargerIsoH4 ").f();
			{ e("i").a("class", telechargerIsoH4I1, " site-menu-icon telechargerIsoH4I ").f();
			} g("i");
			{ e("span").a("class", " telechargerIsoH4Span ").f();
				sx(telechargerIsoH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " telechargerIsoPre ").f();
			{ e("span").a("class", " telechargerIsoPreSpan1 telechargerIsoPreSpan odd ").f();
				sx(telechargerIsoPreSpan11);
			} g("span");
			{ e("span").a("class", " telechargerIsoPreSpan2 telechargerIsoPreSpan even ").f();
				sx(telechargerIsoPreSpan21);
			} g("span");
			{ e("span").a("class", " telechargerIsoPreSpan3 telechargerIsoPreSpan odd ").f();
				sx(telechargerIsoPreSpan31);
			} g("span");
			{ e("span").a("class", " telechargerIsoPreSpan4 telechargerIsoPreSpan even ").f();
				sx(telechargerIsoPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " telechargerIsoOl ").f();
			{ e("li").a("class", " telechargerIsoOlLi1 telechargerIsoOlLi odd ").f();
				sx(telechargerIsoOlLi11);
			} g("li");
			{ e("li").a("class", " telechargerIsoOlLi2 telechargerIsoOlLi even ").f();
				sx(telechargerIsoOlLi21);
			} g("li");
			{ e("li").a("class", " telechargerIsoOlLi3 telechargerIsoOlLi odd ").f();
				sx(telechargerIsoOlLi31);
			} g("li");
			{ e("li").a("class", " telechargerIsoOlLi4 telechargerIsoOlLi even ").f();
				sx(telechargerIsoOlLi41);
			} g("li");
		} g("ol");
		{ e("p").a("class", " telechargerIsoP ").f();
			{ e("span").a("class", " telechargerIsoPSpan1 telechargerIsoPSpan odd ").f();
				sx(telechargerIsoPSpan11);
			} g("span");
			{ e("span").a("class", " telechargerIsoPSpan2 telechargerIsoPSpan even ").f();
				{ e("a").a("class", " telechargerIsoPSpan2A ").a("href", telechargerIsoPSpan2A1).f();
					sx(telechargerIsoPSpan2A1);
				} g("a");
			} g("span");
			{ e("span").a("class", " telechargerIsoPSpan3 telechargerIsoPSpan odd ").f();
				sx(telechargerIsoPSpan31);
				sx(telechargerIsoPSpan32);
				sx(telechargerIsoPSpan33);
			} g("span");
		} g("p");
	}
	public void htmlBodyTelechargerIso() {
		telechargerIso.htmlAvant();
		htmlBodyTelechargerIso(telechargerIso);
		telechargerIso.htmlApres();
	}

	/////////////////
	// verifierIso //
	/////////////////

	public static final String verifierIsoH3I1 = "fas fa-clipboard-check";
	public static final String verifierIsoH3I = verifierIsoH3I1;
	public static final String verifierIsoH3Span1 = "How do I know that my ISO download is complete? ";
	public static final String verifierIsoH3Span = verifierIsoH3Span1;
	public static final String verifierIsoH4I1 = "fas fa-box-check";
	public static final String verifierIsoH4I = verifierIsoH4I1;
	public static final String verifierIsoH4Span1 = "Check the sha256sum. ";
	public static final String verifierIsoH4Span = verifierIsoH4Span1;
	public static final String verifierIsoPreSpan11 = "sha256sum";
	public static final String verifierIsoPreSpan1 = verifierIsoPreSpan11;
	public static final String verifierIsoPreSpan21 = " ~/Downloads/CentOS-7-x86_64-DVD-1810.iso";
	public static final String verifierIsoPreSpan2 = verifierIsoPreSpan21;
	public static final String verifierIsoOlLi11 = "Compute and check the SHA256 message digest for a file. ";
	public static final String verifierIsoOlLi1 = verifierIsoOlLi11;
	public static final String verifierIsoOlLi21 = "The path to the downloaded CentOS 7 ISO file. ";
	public static final String verifierIsoOlLi2 = verifierIsoOlLi21;
	public static final String verifierIsoPSpan11 = "You can see the documented sha256sum of the download in the release notes for your version of CentOS 7, see ";
	public static final String verifierIsoPSpan1 = verifierIsoPSpan11;
	public static final String verifierIsoPSpan2A1 = "https://wiki.centos.org/Manuals/ReleaseNotes";
	public static final String verifierIsoPSpan2A = verifierIsoPSpan2A1;
	public static final String verifierIsoPSpan31 = ". If yours is the latest version, then click on \"Release Notes for CentOS 7\". ";
	public static final String verifierIsoPSpan32 = "Otherwise, find your version in the links in the release notes. ";
	public static final String verifierIsoPSpan33 = "Where it says \"Verifying Downloaded Installation Images\", you will also see the sha256sums for all versions. ";
	public static final String verifierIsoPSpan34 = "Notice the sha256sum for CentOS-7-x86_64-DVD-1708.iso, and then perform the command and compare. ";
	public static final String verifierIsoPSpan3 = verifierIsoPSpan31 + verifierIsoPSpan32 + verifierIsoPSpan33 + verifierIsoPSpan34;

	/**	L'entité « verifierIso »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml verifierIso = new PageHtml();
	public Couverture<PageHtml> verifierIsoCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("verifierIso").o(verifierIso);

	/**	<br/>L'entité « verifierIso »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:verifierIso">Trouver l'entité verifierIso dans Solr</a>
	 * <br/>
	 * @param verifierIso est l'entité déjà construit. 
	 **/
	protected abstract void _verifierIso(PageHtml o);

	public PageHtml getVerifierIso() {
		return verifierIso;
	}

	public void setVerifierIso(PageHtml verifierIso) {
		this.verifierIso = verifierIso;
		this.verifierIsoCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox verifierIsoInit() {
		if(verifierIso != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(verifierIso, "verifierIso");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(verifierIso, "verifierIso");
		}
		if(!verifierIsoCouverture.dejaInitialise) {
			_verifierIso(verifierIso);
		}
		verifierIso.initLoinPourClasse(requeteSite_);
		verifierIsoCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyVerifierIso(PageHtml o) {
		{ e("h3").a("class", " verifierIsoH3 ").f();
			{ e("i").a("class", verifierIsoH3I1, " site-menu-icon verifierIsoH3I ").f();
			} g("i");
			{ e("span").a("class", " verifierIsoH3Span ").f();
				sx(verifierIsoH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " verifierIsoH4 ").f();
			{ e("i").a("class", verifierIsoH4I1, " site-menu-icon verifierIsoH4I ").f();
			} g("i");
			{ e("span").a("class", " verifierIsoH4Span ").f();
				sx(verifierIsoH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " verifierIsoPre ").f();
			{ e("span").a("class", " verifierIsoPreSpan1 verifierIsoPreSpan odd ").f();
				sx(verifierIsoPreSpan11);
			} g("span");
			{ e("span").a("class", " verifierIsoPreSpan2 verifierIsoPreSpan even ").f();
				sx(verifierIsoPreSpan21);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " verifierIsoOl ").f();
			{ e("li").a("class", " verifierIsoOlLi1 verifierIsoOlLi odd ").f();
				sx(verifierIsoOlLi11);
			} g("li");
			{ e("li").a("class", " verifierIsoOlLi2 verifierIsoOlLi even ").f();
				sx(verifierIsoOlLi21);
			} g("li");
		} g("ol");
		{ e("p").a("class", " verifierIsoP ").f();
			{ e("span").a("class", " verifierIsoPSpan1 verifierIsoPSpan odd ").f();
				sx(verifierIsoPSpan11);
			} g("span");
			{ e("span").a("class", " verifierIsoPSpan2 verifierIsoPSpan even ").f();
				{ e("a").a("class", " verifierIsoPSpan2A ").a("href", verifierIsoPSpan2A1).f();
					sx(verifierIsoPSpan2A1);
				} g("a");
			} g("span");
			{ e("span").a("class", " verifierIsoPSpan3 verifierIsoPSpan odd ").f();
				sx(verifierIsoPSpan31);
				sx(verifierIsoPSpan32);
				sx(verifierIsoPSpan33);
				sx(verifierIsoPSpan34);
			} g("span");
		} g("p");
	}
	public void htmlBodyVerifierIso() {
		verifierIso.htmlAvant();
		htmlBodyVerifierIso(verifierIso);
		verifierIso.htmlApres();
	}

	///////////////////////////
	// creerMachineVirtuelle //
	///////////////////////////

	public static final String creerMachineVirtuelleH3I1 = "fas fa-plus-square";
	public static final String creerMachineVirtuelleH3I = creerMachineVirtuelleH3I1;
	public static final String creerMachineVirtuelleH3Span1 = "How do I create a CentOS 7 virtual machine in VirtualBox? ";
	public static final String creerMachineVirtuelleH3Span = creerMachineVirtuelleH3Span1;
	public static final String creerMachineVirtuelleH4I1 = "fas fa-window";
	public static final String creerMachineVirtuelleH4I = creerMachineVirtuelleH4I1;
	public static final String creerMachineVirtuelleH4Span1 = "Open up VirtualBox and click [ New ]. ";
	public static final String creerMachineVirtuelleH4Span = creerMachineVirtuelleH4Span1;
	public static final String creerMachineVirtuelleOlLi011 = "Open VirtualBox in your installed applications. ";
	public static final String creerMachineVirtuelleOlLi01 = creerMachineVirtuelleOlLi011;
	public static final String creerMachineVirtuelleOlLi021 = "Click [ New ]. ";
	public static final String creerMachineVirtuelleOlLi02 = creerMachineVirtuelleOlLi021;
	public static final String creerMachineVirtuelleOlLi031 = "Give your virtual machine a name, like \"vm1\". ";
	public static final String creerMachineVirtuelleOlLi03 = creerMachineVirtuelleOlLi031;
	public static final String creerMachineVirtuelleOlLi041 = "Type: Linux";
	public static final String creerMachineVirtuelleOlLi04 = creerMachineVirtuelleOlLi041;
	public static final String creerMachineVirtuelleOlLi051 = "Version: Other Linux (64-bit)";
	public static final String creerMachineVirtuelleOlLi05 = creerMachineVirtuelleOlLi051;
	public static final String creerMachineVirtuelleOlLi061 = "Click [ Next > ]. ";
	public static final String creerMachineVirtuelleOlLi06 = creerMachineVirtuelleOlLi061;
	public static final String creerMachineVirtuelleOlLi071 = "Now you can give your virtual machine as much RAM as you want. ";
	public static final String creerMachineVirtuelleOlLi072 = "This can be changed later. ";
	public static final String creerMachineVirtuelleOlLi073 = "I would recommend at least 4096 MiB. ";
	public static final String creerMachineVirtuelleOlLi07 = creerMachineVirtuelleOlLi071 + creerMachineVirtuelleOlLi072 + creerMachineVirtuelleOlLi073;
	public static final String creerMachineVirtuelleOlLi081 = "Click [ Next > ]. ";
	public static final String creerMachineVirtuelleOlLi08 = creerMachineVirtuelleOlLi081;
	public static final String creerMachineVirtuelleOlLi091 = "Now you will create a disk file for your virtual machine. ";
	public static final String creerMachineVirtuelleOlLi092 = "You can select the default option \"Create a virtual hard disk now\". ";
	public static final String creerMachineVirtuelleOlLi09 = creerMachineVirtuelleOlLi091 + creerMachineVirtuelleOlLi092;
	public static final String creerMachineVirtuelleOlLi101 = "Click [ Create ]. ";
	public static final String creerMachineVirtuelleOlLi10 = creerMachineVirtuelleOlLi101;
	public static final String creerMachineVirtuelleOlLi111 = "Now you can choose from a few different disk types. ";
	public static final String creerMachineVirtuelleOlLi112 = "I would recommend \"VMDK (Virtual Machine Disk)\" which is more portable to other hypervisor software like libvirt. ";
	public static final String creerMachineVirtuelleOlLi11 = creerMachineVirtuelleOlLi111 + creerMachineVirtuelleOlLi112;
	public static final String creerMachineVirtuelleOlLi121 = "Here I would recommend a \"Dynamically allocated\" disk, that will will start out as a small file and will grow as it is used. ";
	public static final String creerMachineVirtuelleOlLi12 = creerMachineVirtuelleOlLi121;
	public static final String creerMachineVirtuelleOlLi131 = "Here you can leave the name of the disk as the hostname you gave to the virtual machine. ";
	public static final String creerMachineVirtuelleOlLi132 = "You can also choose the size of the virtual machine disk. ";
	public static final String creerMachineVirtuelleOlLi133 = "I would recommend at least 108 GB, since the disk file does not take up that much space, unless it grows to be that big if it is dynamically allocated. ";
	public static final String creerMachineVirtuelleOlLi13 = creerMachineVirtuelleOlLi131 + creerMachineVirtuelleOlLi132 + creerMachineVirtuelleOlLi133;
	public static final String creerMachineVirtuelleOlLi141 = "Click [ Create ]. ";
	public static final String creerMachineVirtuelleOlLi14 = creerMachineVirtuelleOlLi141;
	public static final String creerMachineVirtuelleOlLi151 = "Now your virtual machine is created! ";
	public static final String creerMachineVirtuelleOlLi152 = "The next step is to assign an ISO to it as an optical disk drive. ";
	public static final String creerMachineVirtuelleOlLi153 = "Right-click on the virtual machine in VirtualBox. ";
	public static final String creerMachineVirtuelleOlLi15 = creerMachineVirtuelleOlLi151 + creerMachineVirtuelleOlLi152 + creerMachineVirtuelleOlLi153;
	public static final String creerMachineVirtuelleOlLi161 = "Click \"Settings...\" ";
	public static final String creerMachineVirtuelleOlLi16 = creerMachineVirtuelleOlLi161;
	public static final String creerMachineVirtuelleOlLi171 = "Click [ Storage ]. ";
	public static final String creerMachineVirtuelleOlLi17 = creerMachineVirtuelleOlLi171;
	public static final String creerMachineVirtuelleOlLi181 = "Click the optical drive named \"Empty\". ";
	public static final String creerMachineVirtuelleOlLi18 = creerMachineVirtuelleOlLi181;
	public static final String creerMachineVirtuelleOlLi191 = "In the optical drive attributes, click the disk button with the dropdown arrow. ";
	public static final String creerMachineVirtuelleOlLi19 = creerMachineVirtuelleOlLi191;
	public static final String creerMachineVirtuelleOlLi201 = "Click \"Choose Virtual Optical Disk File...\". ";
	public static final String creerMachineVirtuelleOlLi20 = creerMachineVirtuelleOlLi201;
	public static final String creerMachineVirtuelleOlLi211 = "Browse to the CentOS 7 ISO file in your downloads: ~/Downloads/CentOS-7-x86_64-DVD-1810.iso";
	public static final String creerMachineVirtuelleOlLi21 = creerMachineVirtuelleOlLi211;
	public static final String creerMachineVirtuelleOlLi221 = "Click [ OK ]. ";
	public static final String creerMachineVirtuelleOlLi22 = creerMachineVirtuelleOlLi221;
	public static final String creerMachineVirtuelleOlLi231 = "Now click [ Start ]. ";
	public static final String creerMachineVirtuelleOlLi23 = creerMachineVirtuelleOlLi231;

	/**	L'entité « creerMachineVirtuelle »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml creerMachineVirtuelle = new PageHtml();
	public Couverture<PageHtml> creerMachineVirtuelleCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("creerMachineVirtuelle").o(creerMachineVirtuelle);

	/**	<br/>L'entité « creerMachineVirtuelle »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:creerMachineVirtuelle">Trouver l'entité creerMachineVirtuelle dans Solr</a>
	 * <br/>
	 * @param creerMachineVirtuelle est l'entité déjà construit. 
	 **/
	protected abstract void _creerMachineVirtuelle(PageHtml o);

	public PageHtml getCreerMachineVirtuelle() {
		return creerMachineVirtuelle;
	}

	public void setCreerMachineVirtuelle(PageHtml creerMachineVirtuelle) {
		this.creerMachineVirtuelle = creerMachineVirtuelle;
		this.creerMachineVirtuelleCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox creerMachineVirtuelleInit() {
		if(creerMachineVirtuelle != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(creerMachineVirtuelle, "creerMachineVirtuelle");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(creerMachineVirtuelle, "creerMachineVirtuelle");
		}
		if(!creerMachineVirtuelleCouverture.dejaInitialise) {
			_creerMachineVirtuelle(creerMachineVirtuelle);
		}
		creerMachineVirtuelle.initLoinPourClasse(requeteSite_);
		creerMachineVirtuelleCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyCreerMachineVirtuelle(PageHtml o) {
		{ e("h3").a("class", " creerMachineVirtuelleH3 ").f();
			{ e("i").a("class", creerMachineVirtuelleH3I1, " site-menu-icon creerMachineVirtuelleH3I ").f();
			} g("i");
			{ e("span").a("class", " creerMachineVirtuelleH3Span ").f();
				sx(creerMachineVirtuelleH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " creerMachineVirtuelleH4 ").f();
			{ e("i").a("class", creerMachineVirtuelleH4I1, " site-menu-icon creerMachineVirtuelleH4I ").f();
			} g("i");
			{ e("span").a("class", " creerMachineVirtuelleH4Span ").f();
				sx(creerMachineVirtuelleH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " creerMachineVirtuelleOl ").f();
			{ e("li").a("class", " creerMachineVirtuelleOlLi01 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi011);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi02 creerMachineVirtuelleOlLi even ").f();
				sx(creerMachineVirtuelleOlLi021);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi03 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi031);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi04 creerMachineVirtuelleOlLi even ").f();
				sx(creerMachineVirtuelleOlLi041);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi05 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi051);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi06 creerMachineVirtuelleOlLi even ").f();
				sx(creerMachineVirtuelleOlLi061);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi07 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi071);
				sx(creerMachineVirtuelleOlLi072);
				sx(creerMachineVirtuelleOlLi073);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi08 creerMachineVirtuelleOlLi even ").f();
				sx(creerMachineVirtuelleOlLi081);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi09 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi091);
				sx(creerMachineVirtuelleOlLi092);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi10 creerMachineVirtuelleOlLi even ").f();
				sx(creerMachineVirtuelleOlLi101);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi11 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi111);
				sx(creerMachineVirtuelleOlLi112);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi12 creerMachineVirtuelleOlLi even ").f();
				sx(creerMachineVirtuelleOlLi121);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi13 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi131);
				sx(creerMachineVirtuelleOlLi132);
				sx(creerMachineVirtuelleOlLi133);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi14 creerMachineVirtuelleOlLi even ").f();
				sx(creerMachineVirtuelleOlLi141);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi15 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi151);
				sx(creerMachineVirtuelleOlLi152);
				sx(creerMachineVirtuelleOlLi153);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi16 creerMachineVirtuelleOlLi even ").f();
				sx(creerMachineVirtuelleOlLi161);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi17 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi171);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi18 creerMachineVirtuelleOlLi even ").f();
				sx(creerMachineVirtuelleOlLi181);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi19 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi191);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi20 creerMachineVirtuelleOlLi even ").f();
				sx(creerMachineVirtuelleOlLi201);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi21 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi211);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi22 creerMachineVirtuelleOlLi even ").f();
				sx(creerMachineVirtuelleOlLi221);
			} g("li");
			{ e("li").a("class", " creerMachineVirtuelleOlLi23 creerMachineVirtuelleOlLi odd ").f();
				sx(creerMachineVirtuelleOlLi231);
			} g("li");
		} g("ol");
	}
	public void htmlBodyCreerMachineVirtuelle() {
		creerMachineVirtuelle.htmlAvant();
		htmlBodyCreerMachineVirtuelle(creerMachineVirtuelle);
		creerMachineVirtuelle.htmlApres();
	}

	//////////////////
	// erreurKernel //
	//////////////////

	public static final String erreurKernelH3I1 = "fas fa-exclamation-circle";
	public static final String erreurKernelH3I = erreurKernelH3I1;
	public static final String erreurKernelH3Span1 = "What if I get an error? Kernel driver not installed (rc=-1908)";
	public static final String erreurKernelH3Span = erreurKernelH3Span1;
	public static final String erreurKernelH4I1 = "fas fa-clipboard-list";
	public static final String erreurKernelH4I = erreurKernelH4I1;
	public static final String erreurKernelH4Span1 = "Install the right linux kernel prerequisites. ";
	public static final String erreurKernelH4Span = erreurKernelH4Span1;
	public static final String erreurKernelPSpan11 = "If you are running CentOS 7, you may get an error when starting your virtual machine: ";
	public static final String erreurKernelPSpan1 = erreurKernelPSpan11;
	public static final String erreurKernelDivP11 = "VirtualBox - Error In suplibOsInit";
	public static final String erreurKernelDivP1 = erreurKernelDivP11;
	public static final String erreurKernelDivP21 = "Kernel driver not installed (rc=-1908) ";
	public static final String erreurKernelDivP2 = erreurKernelDivP21;
	public static final String erreurKernelDivP31 = "The VirtualBox Linux kernel driver (vboxdrv) is either not loaded or there is a permission problem with /dev/vboxdrv. Please reinstall the kernel module by executing";
	public static final String erreurKernelDivP3 = erreurKernelDivP31;
	public static final String erreurKernelDivP41 = "'/sbin/vboxconfig'";
	public static final String erreurKernelDivP4 = erreurKernelDivP41;
	public static final String erreurKernelDivP51 = "as root.";
	public static final String erreurKernelDivP5 = erreurKernelDivP51;
	public static final String erreurKernelDivP61 = "where: suplib0slnit what: 3 VERR_VM_DRIVER_NOT_INSTALLED (-1908) - The support driver is not installed. On linux, open returned EN0ENT.";
	public static final String erreurKernelDivP6 = erreurKernelDivP61;

	/**	L'entité « erreurKernel »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml erreurKernel = new PageHtml();
	public Couverture<PageHtml> erreurKernelCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("erreurKernel").o(erreurKernel);

	/**	<br/>L'entité « erreurKernel »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:erreurKernel">Trouver l'entité erreurKernel dans Solr</a>
	 * <br/>
	 * @param erreurKernel est l'entité déjà construit. 
	 **/
	protected abstract void _erreurKernel(PageHtml o);

	public PageHtml getErreurKernel() {
		return erreurKernel;
	}

	public void setErreurKernel(PageHtml erreurKernel) {
		this.erreurKernel = erreurKernel;
		this.erreurKernelCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox erreurKernelInit() {
		if(erreurKernel != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(erreurKernel, "erreurKernel");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(erreurKernel, "erreurKernel");
		}
		if(!erreurKernelCouverture.dejaInitialise) {
			_erreurKernel(erreurKernel);
		}
		erreurKernel.initLoinPourClasse(requeteSite_);
		erreurKernelCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyErreurKernel(PageHtml o) {
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
		{ e("div").a("class", " erreurKernelDiv ").f();
			{ e("p").a("class", " erreurKernelDivP1 erreurKernelDivP odd ").f();
				sx(erreurKernelDivP11);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP2 erreurKernelDivP even ").f();
				sx(erreurKernelDivP21);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP3 erreurKernelDivP odd ").f();
				sx(erreurKernelDivP31);
			} g("p");
			{ e("p").a("class", " erreurKernelDivP4 erreurKernelDivP even ").f();
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
	public void htmlBodyErreurKernel() {
		erreurKernel.htmlAvant();
		htmlBodyErreurKernel(erreurKernel);
		erreurKernel.htmlApres();
	}

	////////////////////////
	// cmdSbinVboxconfig1 //
	////////////////////////

	public static final String cmdSbinVboxconfig1PreSpan11 = "sudo";
	public static final String cmdSbinVboxconfig1PreSpan1 = cmdSbinVboxconfig1PreSpan11;
	public static final String cmdSbinVboxconfig1PreSpan21 = " /sbin/vboxconfig";
	public static final String cmdSbinVboxconfig1PreSpan2 = cmdSbinVboxconfig1PreSpan21;
	public static final String cmdSbinVboxconfig1OlLi11 = "sudo";
	public static final String cmdSbinVboxconfig1OlLi1 = cmdSbinVboxconfig1OlLi11;
	public static final String cmdSbinVboxconfig1OlLi21 = "Linux post-installer for building VirtualBox kernel modules. ";
	public static final String cmdSbinVboxconfig1OlLi22 = "This will fail if the kernel-devel prerequisites have not been installed. ";
	public static final String cmdSbinVboxconfig1OlLi2 = cmdSbinVboxconfig1OlLi21 + cmdSbinVboxconfig1OlLi22;
	public static final String cmdSbinVboxconfig1P11 = "Another error will occur when running this command here. ";
	public static final String cmdSbinVboxconfig1P1 = cmdSbinVboxconfig1P11;
	public static final String cmdSbinVboxconfig1PreDiv011 = "vboxdrv.sh: Stopping VirtualBox services.";
	public static final String cmdSbinVboxconfig1PreDiv01 = cmdSbinVboxconfig1PreDiv011;
	public static final String cmdSbinVboxconfig1PreDiv021 = "vboxdrv.sh: Building VirtualBox kernel modules.";
	public static final String cmdSbinVboxconfig1PreDiv02 = cmdSbinVboxconfig1PreDiv021;
	public static final String cmdSbinVboxconfig1PreDiv031 = "This system is currently not set up to build kernel modules.";
	public static final String cmdSbinVboxconfig1PreDiv03 = cmdSbinVboxconfig1PreDiv031;
	public static final String cmdSbinVboxconfig1PreDiv041 = "Please install the Linux kernel \"header\" files matching the current kernel";
	public static final String cmdSbinVboxconfig1PreDiv04 = cmdSbinVboxconfig1PreDiv041;
	public static final String cmdSbinVboxconfig1PreDiv051 = "for adding new hardware support to the system.";
	public static final String cmdSbinVboxconfig1PreDiv05 = cmdSbinVboxconfig1PreDiv051;
	public static final String cmdSbinVboxconfig1PreDiv061 = "The distribution packages containing the headers are probably:";
	public static final String cmdSbinVboxconfig1PreDiv06 = cmdSbinVboxconfig1PreDiv061;
	public static final String cmdSbinVboxconfig1PreDiv071 = "    kernel-devel kernel-devel-3.10.0-693.el7.x86_64";
	public static final String cmdSbinVboxconfig1PreDiv07 = cmdSbinVboxconfig1PreDiv071;
	public static final String cmdSbinVboxconfig1PreDiv081 = "This system is currently not set up to build kernel modules.";
	public static final String cmdSbinVboxconfig1PreDiv08 = cmdSbinVboxconfig1PreDiv081;
	public static final String cmdSbinVboxconfig1PreDiv091 = "Please install the Linux kernel \"header\" files matching the current kernel";
	public static final String cmdSbinVboxconfig1PreDiv09 = cmdSbinVboxconfig1PreDiv091;
	public static final String cmdSbinVboxconfig1PreDiv101 = "for adding new hardware support to the system.";
	public static final String cmdSbinVboxconfig1PreDiv10 = cmdSbinVboxconfig1PreDiv101;
	public static final String cmdSbinVboxconfig1PreDiv111 = "The distribution packages containing the headers are probably:";
	public static final String cmdSbinVboxconfig1PreDiv11 = cmdSbinVboxconfig1PreDiv111;
	public static final String cmdSbinVboxconfig1PreDiv121 = "    kernel-devel kernel-devel-3.10.0-693.el7.x86_64";
	public static final String cmdSbinVboxconfig1PreDiv12 = cmdSbinVboxconfig1PreDiv121;
	public static final String cmdSbinVboxconfig1P21 = "So you will want to read carefully in the error message you receive for the specific packages you need to install to fix the problem as below. ";
	public static final String cmdSbinVboxconfig1P2 = cmdSbinVboxconfig1P21;

	/**	L'entité « cmdSbinVboxconfig1 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml cmdSbinVboxconfig1 = new PageHtml();
	public Couverture<PageHtml> cmdSbinVboxconfig1Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("cmdSbinVboxconfig1").o(cmdSbinVboxconfig1);

	/**	<br/>L'entité « cmdSbinVboxconfig1 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:cmdSbinVboxconfig1">Trouver l'entité cmdSbinVboxconfig1 dans Solr</a>
	 * <br/>
	 * @param cmdSbinVboxconfig1 est l'entité déjà construit. 
	 **/
	protected abstract void _cmdSbinVboxconfig1(PageHtml o);

	public PageHtml getCmdSbinVboxconfig1() {
		return cmdSbinVboxconfig1;
	}

	public void setCmdSbinVboxconfig1(PageHtml cmdSbinVboxconfig1) {
		this.cmdSbinVboxconfig1 = cmdSbinVboxconfig1;
		this.cmdSbinVboxconfig1Couverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox cmdSbinVboxconfig1Init() {
		if(cmdSbinVboxconfig1 != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(cmdSbinVboxconfig1, "cmdSbinVboxconfig1");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(cmdSbinVboxconfig1, "cmdSbinVboxconfig1");
		}
		if(!cmdSbinVboxconfig1Couverture.dejaInitialise) {
			_cmdSbinVboxconfig1(cmdSbinVboxconfig1);
		}
		cmdSbinVboxconfig1.initLoinPourClasse(requeteSite_);
		cmdSbinVboxconfig1Couverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyCmdSbinVboxconfig1(PageHtml o) {
		{ e("pre").a("class", " cmdSbinVboxconfig1Pre ").f();
			{ e("span").a("class", " cmdSbinVboxconfig1PreSpan1 cmdSbinVboxconfig1PreSpan odd ").f();
				sx(cmdSbinVboxconfig1PreSpan11);
			} g("span");
			{ e("span").a("class", " cmdSbinVboxconfig1PreSpan2 cmdSbinVboxconfig1PreSpan even ").f();
				sx(cmdSbinVboxconfig1PreSpan21);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " cmdSbinVboxconfig1Ol ").f();
			{ e("li").a("class", " cmdSbinVboxconfig1OlLi1 cmdSbinVboxconfig1OlLi odd ").f();
				sx(cmdSbinVboxconfig1OlLi11);
			} g("li");
			{ e("li").a("class", " cmdSbinVboxconfig1OlLi2 cmdSbinVboxconfig1OlLi even ").f();
				sx(cmdSbinVboxconfig1OlLi21);
				sx(cmdSbinVboxconfig1OlLi22);
			} g("li");
		} g("ol");
		{ e("p").a("class", " cmdSbinVboxconfig1P1 cmdSbinVboxconfig1P odd ").f();
			sx(cmdSbinVboxconfig1P11);
		} g("p");
		{ e("pre").a("class", " cmdSbinVboxconfig1Pre ").f();
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv01 cmdSbinVboxconfig1PreDiv odd ").f();
				sx(cmdSbinVboxconfig1PreDiv011);
			} g("div");
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv02 cmdSbinVboxconfig1PreDiv even ").f();
				sx(cmdSbinVboxconfig1PreDiv021);
			} g("div");
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv03 cmdSbinVboxconfig1PreDiv odd ").f();
				sx(cmdSbinVboxconfig1PreDiv031);
			} g("div");
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv04 cmdSbinVboxconfig1PreDiv even ").f();
				sx(cmdSbinVboxconfig1PreDiv041);
			} g("div");
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv05 cmdSbinVboxconfig1PreDiv odd ").f();
				sx(cmdSbinVboxconfig1PreDiv051);
			} g("div");
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv06 cmdSbinVboxconfig1PreDiv even ").f();
				sx(cmdSbinVboxconfig1PreDiv061);
			} g("div");
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv07 cmdSbinVboxconfig1PreDiv odd ").f();
				sx(cmdSbinVboxconfig1PreDiv071);
			} g("div");
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv08 cmdSbinVboxconfig1PreDiv even ").f();
				sx(cmdSbinVboxconfig1PreDiv081);
			} g("div");
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv09 cmdSbinVboxconfig1PreDiv odd ").f();
				sx(cmdSbinVboxconfig1PreDiv091);
			} g("div");
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv10 cmdSbinVboxconfig1PreDiv even ").f();
				sx(cmdSbinVboxconfig1PreDiv101);
			} g("div");
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv11 cmdSbinVboxconfig1PreDiv odd ").f();
				sx(cmdSbinVboxconfig1PreDiv111);
			} g("div");
			{ e("div").a("class", " cmdSbinVboxconfig1PreDiv12 cmdSbinVboxconfig1PreDiv even ").f();
				sx(cmdSbinVboxconfig1PreDiv121);
			} g("div");
		} g("pre");
		{ e("p").a("class", " cmdSbinVboxconfig1P2 cmdSbinVboxconfig1P even ").f();
			sx(cmdSbinVboxconfig1P21);
		} g("p");
	}
	public void htmlBodyCmdSbinVboxconfig1() {
		cmdSbinVboxconfig1.htmlAvant();
		htmlBodyCmdSbinVboxconfig1(cmdSbinVboxconfig1);
		cmdSbinVboxconfig1.htmlApres();
	}

	/////////////////////
	// cmdErreurKernel //
	/////////////////////

	public static final String cmdErreurKernelPreSpan11 = "sudo";
	public static final String cmdErreurKernelPreSpan1 = cmdErreurKernelPreSpan11;
	public static final String cmdErreurKernelPreSpan21 = " yum";
	public static final String cmdErreurKernelPreSpan2 = cmdErreurKernelPreSpan21;
	public static final String cmdErreurKernelPreSpan31 = " install";
	public static final String cmdErreurKernelPreSpan3 = cmdErreurKernelPreSpan31;
	public static final String cmdErreurKernelPreSpan41 = " -y";
	public static final String cmdErreurKernelPreSpan4 = cmdErreurKernelPreSpan41;
	public static final String cmdErreurKernelPreSpan51 = " kernel-devel";
	public static final String cmdErreurKernelPreSpan52 = " kernel-devel-3.10.0-693.el7.x86_64";
	public static final String cmdErreurKernelPreSpan5 = cmdErreurKernelPreSpan51 + cmdErreurKernelPreSpan52;
	public static final String cmdErreurKernelOlLi11 = "sudo";
	public static final String cmdErreurKernelOlLi1 = cmdErreurKernelOlLi11;
	public static final String cmdErreurKernelOlLi21 = "yum";
	public static final String cmdErreurKernelOlLi2 = cmdErreurKernelOlLi21;
	public static final String cmdErreurKernelOlLi31 = "install";
	public static final String cmdErreurKernelOlLi3 = cmdErreurKernelOlLi31;
	public static final String cmdErreurKernelOlLi41 = "-y";
	public static final String cmdErreurKernelOlLi4 = cmdErreurKernelOlLi41;
	public static final String cmdErreurKernelOlLi51 = "The development package for building kernel modules to match the kernel. ";
	public static final String cmdErreurKernelOlLi5 = cmdErreurKernelOlLi51;
	public static final String cmdErreurKernelOlLi61 = "Be aware that this version may be different for your system. ";
	public static final String cmdErreurKernelOlLi62 = "You will want to install the version that this command recommended earlier: sudo /sbin/vboxconfig";
	public static final String cmdErreurKernelOlLi6 = cmdErreurKernelOlLi61 + cmdErreurKernelOlLi62;

	/**	L'entité « cmdErreurKernel »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml cmdErreurKernel = new PageHtml();
	public Couverture<PageHtml> cmdErreurKernelCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("cmdErreurKernel").o(cmdErreurKernel);

	/**	<br/>L'entité « cmdErreurKernel »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:cmdErreurKernel">Trouver l'entité cmdErreurKernel dans Solr</a>
	 * <br/>
	 * @param cmdErreurKernel est l'entité déjà construit. 
	 **/
	protected abstract void _cmdErreurKernel(PageHtml o);

	public PageHtml getCmdErreurKernel() {
		return cmdErreurKernel;
	}

	public void setCmdErreurKernel(PageHtml cmdErreurKernel) {
		this.cmdErreurKernel = cmdErreurKernel;
		this.cmdErreurKernelCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox cmdErreurKernelInit() {
		if(cmdErreurKernel != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(cmdErreurKernel, "cmdErreurKernel");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(cmdErreurKernel, "cmdErreurKernel");
		}
		if(!cmdErreurKernelCouverture.dejaInitialise) {
			_cmdErreurKernel(cmdErreurKernel);
		}
		cmdErreurKernel.initLoinPourClasse(requeteSite_);
		cmdErreurKernelCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyCmdErreurKernel(PageHtml o) {
		{ e("pre").a("class", " cmdErreurKernelPre ").f();
			{ e("span").a("class", " cmdErreurKernelPreSpan1 cmdErreurKernelPreSpan odd ").f();
				sx(cmdErreurKernelPreSpan11);
			} g("span");
			{ e("span").a("class", " cmdErreurKernelPreSpan2 cmdErreurKernelPreSpan even ").f();
				sx(cmdErreurKernelPreSpan21);
			} g("span");
			{ e("span").a("class", " cmdErreurKernelPreSpan3 cmdErreurKernelPreSpan odd ").f();
				sx(cmdErreurKernelPreSpan31);
			} g("span");
			{ e("span").a("class", " cmdErreurKernelPreSpan4 cmdErreurKernelPreSpan even ").f();
				sx(cmdErreurKernelPreSpan41);
			} g("span");
			{ e("span").a("class", " cmdErreurKernelPreSpan5 cmdErreurKernelPreSpan odd ").f();
				sx(cmdErreurKernelPreSpan51);
				sx(cmdErreurKernelPreSpan52);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " cmdErreurKernelOl ").f();
			{ e("li").a("class", " cmdErreurKernelOlLi1 cmdErreurKernelOlLi odd ").f();
				sx(cmdErreurKernelOlLi11);
			} g("li");
			{ e("li").a("class", " cmdErreurKernelOlLi2 cmdErreurKernelOlLi even ").f();
				sx(cmdErreurKernelOlLi21);
			} g("li");
			{ e("li").a("class", " cmdErreurKernelOlLi3 cmdErreurKernelOlLi odd ").f();
				sx(cmdErreurKernelOlLi31);
			} g("li");
			{ e("li").a("class", " cmdErreurKernelOlLi4 cmdErreurKernelOlLi even ").f();
				sx(cmdErreurKernelOlLi41);
			} g("li");
			{ e("li").a("class", " cmdErreurKernelOlLi5 cmdErreurKernelOlLi odd ").f();
				sx(cmdErreurKernelOlLi51);
			} g("li");
			{ e("li").a("class", " cmdErreurKernelOlLi6 cmdErreurKernelOlLi even ").f();
				sx(cmdErreurKernelOlLi61);
				sx(cmdErreurKernelOlLi62);
			} g("li");
		} g("ol");
	}
	public void htmlBodyCmdErreurKernel() {
		cmdErreurKernel.htmlAvant();
		htmlBodyCmdErreurKernel(cmdErreurKernel);
		cmdErreurKernel.htmlApres();
	}

	////////////////////////
	// cmdSbinVboxconfig2 //
	////////////////////////

	public static final String cmdSbinVboxconfig2PreSpan11 = "sudo";
	public static final String cmdSbinVboxconfig2PreSpan1 = cmdSbinVboxconfig2PreSpan11;
	public static final String cmdSbinVboxconfig2PreSpan21 = " /sbin/vboxconfig";
	public static final String cmdSbinVboxconfig2PreSpan2 = cmdSbinVboxconfig2PreSpan21;
	public static final String cmdSbinVboxconfig2OlLi11 = "sudo";
	public static final String cmdSbinVboxconfig2OlLi1 = cmdSbinVboxconfig2OlLi11;
	public static final String cmdSbinVboxconfig2OlLi21 = "Run this again with the kernel-devel prerequisites installed. ";
	public static final String cmdSbinVboxconfig2OlLi2 = cmdSbinVboxconfig2OlLi21;
	public static final String cmdSbinVboxconfig2P11 = "Here, when you run this command again, you should no longer have an error message. ";
	public static final String cmdSbinVboxconfig2P1 = cmdSbinVboxconfig2P11;
	public static final String cmdSbinVboxconfig2P21 = "Now, return to VirtualBox and click [ Start ]. ";
	public static final String cmdSbinVboxconfig2P2 = cmdSbinVboxconfig2P21;

	/**	L'entité « cmdSbinVboxconfig2 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml cmdSbinVboxconfig2 = new PageHtml();
	public Couverture<PageHtml> cmdSbinVboxconfig2Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("cmdSbinVboxconfig2").o(cmdSbinVboxconfig2);

	/**	<br/>L'entité « cmdSbinVboxconfig2 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:cmdSbinVboxconfig2">Trouver l'entité cmdSbinVboxconfig2 dans Solr</a>
	 * <br/>
	 * @param cmdSbinVboxconfig2 est l'entité déjà construit. 
	 **/
	protected abstract void _cmdSbinVboxconfig2(PageHtml o);

	public PageHtml getCmdSbinVboxconfig2() {
		return cmdSbinVboxconfig2;
	}

	public void setCmdSbinVboxconfig2(PageHtml cmdSbinVboxconfig2) {
		this.cmdSbinVboxconfig2 = cmdSbinVboxconfig2;
		this.cmdSbinVboxconfig2Couverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox cmdSbinVboxconfig2Init() {
		if(cmdSbinVboxconfig2 != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(cmdSbinVboxconfig2, "cmdSbinVboxconfig2");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(cmdSbinVboxconfig2, "cmdSbinVboxconfig2");
		}
		if(!cmdSbinVboxconfig2Couverture.dejaInitialise) {
			_cmdSbinVboxconfig2(cmdSbinVboxconfig2);
		}
		cmdSbinVboxconfig2.initLoinPourClasse(requeteSite_);
		cmdSbinVboxconfig2Couverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyCmdSbinVboxconfig2(PageHtml o) {
		{ e("pre").a("class", " cmdSbinVboxconfig2Pre ").f();
			{ e("span").a("class", " cmdSbinVboxconfig2PreSpan1 cmdSbinVboxconfig2PreSpan odd ").f();
				sx(cmdSbinVboxconfig2PreSpan11);
			} g("span");
			{ e("span").a("class", " cmdSbinVboxconfig2PreSpan2 cmdSbinVboxconfig2PreSpan even ").f();
				sx(cmdSbinVboxconfig2PreSpan21);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " cmdSbinVboxconfig2Ol ").f();
			{ e("li").a("class", " cmdSbinVboxconfig2OlLi1 cmdSbinVboxconfig2OlLi odd ").f();
				sx(cmdSbinVboxconfig2OlLi11);
			} g("li");
			{ e("li").a("class", " cmdSbinVboxconfig2OlLi2 cmdSbinVboxconfig2OlLi even ").f();
				sx(cmdSbinVboxconfig2OlLi21);
			} g("li");
		} g("ol");
		{ e("p").a("class", " cmdSbinVboxconfig2P1 cmdSbinVboxconfig2P odd ").f();
			sx(cmdSbinVboxconfig2P11);
		} g("p");
		{ e("p").a("class", " cmdSbinVboxconfig2P2 cmdSbinVboxconfig2P even ").f();
			sx(cmdSbinVboxconfig2P21);
		} g("p");
	}
	public void htmlBodyCmdSbinVboxconfig2() {
		cmdSbinVboxconfig2.htmlAvant();
		htmlBodyCmdSbinVboxconfig2(cmdSbinVboxconfig2);
		cmdSbinVboxconfig2.htmlApres();
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
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
	protected C001L003InstallerMachineVirtuelleVirtualBox recapituler1Init() {
		if(recapituler1 != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler1, "recapituler1");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
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

	public static final String recapituler2TableTr1Td11 = "Tuesday ";
	public static final String recapituler2TableTr1Td1 = recapituler2TableTr1Td11;
	public static final String recapituler2TableTr1Td2I1 = "fab fa-linux";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "fas fa-network-wired";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "fas fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "April 23 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "How to try CentOS 7";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "On a virtual machine";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
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
	protected C001L003InstallerMachineVirtuelleVirtualBox recapituler2Init() {
		if(recapituler2 != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler2, "recapituler2");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
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

	public static final String recapituler3TableTr01Td1I1 = "fas fa-question";
	public static final String recapituler3TableTr01Td1I = recapituler3TableTr01Td1I1;
	public static final String recapituler3TableTr01Td21 = "Questions";
	public static final String recapituler3TableTr01Td2 = recapituler3TableTr01Td21;
	public static final String recapituler3TableTr01Td3I1 = "fas fa-bullhorn";
	public static final String recapituler3TableTr01Td3I = recapituler3TableTr01Td3I1;
	public static final String recapituler3TableTr01Td41 = "Answers";
	public static final String recapituler3TableTr01Td4 = recapituler3TableTr01Td41;
	public static final String recapituler3TableTr02Td1I1 = "fas fa-eraser";
	public static final String recapituler3TableTr02Td1I = recapituler3TableTr02Td1I1;
	public static final String recapituler3TableTr02Td21 = "Will Linux destroy my operating system? ";
	public static final String recapituler3TableTr02Td2 = recapituler3TableTr02Td21;
	public static final String recapituler3TableTr02Td3Span1I1 = "fab fa-microsoft";
	public static final String recapituler3TableTr02Td3Span1I = recapituler3TableTr02Td3Span1I1;
	public static final String recapituler3TableTr02Td3Span2I1 = "fab fa-apple";
	public static final String recapituler3TableTr02Td3Span2I = recapituler3TableTr02Td3Span2I1;
	public static final String recapituler3TableTr02Td3Span3I1 = "fab fa-linux";
	public static final String recapituler3TableTr02Td3Span3I = recapituler3TableTr02Td3Span3I1;
	public static final String recapituler3TableTr02Td41 = "Virtualization can run Linux on any operating system. ";
	public static final String recapituler3TableTr02Td4 = recapituler3TableTr02Td41;
	public static final String recapituler3TableTr03Td1I1 = "fas fa-person-carry";
	public static final String recapituler3TableTr03Td1I = recapituler3TableTr03Td1I1;
	public static final String recapituler3TableTr03Td21 = "How do I install VirtualBox? ";
	public static final String recapituler3TableTr03Td2 = recapituler3TableTr03Td21;
	public static final String recapituler3TableTr03Td3I1 = "fas fa-cloud-download-alt";
	public static final String recapituler3TableTr03Td3I = recapituler3TableTr03Td3I1;
	public static final String recapituler3TableTr03Td41 = "Download it from virtualbox.org";
	public static final String recapituler3TableTr03Td4 = recapituler3TableTr03Td41;
	public static final String recapituler3TableTr04Td1I1 = "fas fa-play-circle";
	public static final String recapituler3TableTr04Td1I = recapituler3TableTr04Td1I1;
	public static final String recapituler3TableTr04Td21 = "Prepare CentOS 7 to install VirtualBox";
	public static final String recapituler3TableTr04Td2 = recapituler3TableTr04Td21;
	public static final String recapituler3TableTr04Td3I1 = "fas fa-download";
	public static final String recapituler3TableTr04Td3I = recapituler3TableTr04Td3I1;
	public static final String recapituler3TableTr04Td41 = "Install the virtualbox yum repo";
	public static final String recapituler3TableTr04Td4 = recapituler3TableTr04Td41;
	public static final String recapituler3TableTr05Td1I1 = "fas fa-box-check";
	public static final String recapituler3TableTr05Td1I = recapituler3TableTr05Td1I1;
	public static final String recapituler3TableTr05Td21 = "Install the virtualbox yum repository";
	public static final String recapituler3TableTr05Td2 = recapituler3TableTr05Td21;
	public static final String recapituler3TableTr05Td3I1 = "fas fa-person-dolly";
	public static final String recapituler3TableTr05Td3I = recapituler3TableTr05Td3I1;
	public static final String recapituler3TableTr05Td41 = "Put virtualbox.repo in /etc/yum.repos.d/";
	public static final String recapituler3TableTr05Td4 = recapituler3TableTr05Td41;
	public static final String recapituler3TableTr06Td1I1 = "fas fa-question";
	public static final String recapituler3TableTr06Td1I = recapituler3TableTr06Td1I1;
	public static final String recapituler3TableTr06Td21 = "What is the VirtualBox package called? ";
	public static final String recapituler3TableTr06Td2 = recapituler3TableTr06Td21;
	public static final String recapituler3TableTr06Td3I1 = "fas fa-search";
	public static final String recapituler3TableTr06Td3I = recapituler3TableTr06Td3I1;
	public static final String recapituler3TableTr06Td41 = "Search for \"virtualbox\" in yum";
	public static final String recapituler3TableTr06Td4 = recapituler3TableTr06Td41;
	public static final String recapituler3TableTr07Td1I1 = "fas fa-box";
	public static final String recapituler3TableTr07Td1I = recapituler3TableTr07Td1I1;
	public static final String recapituler3TableTr07Td21 = "Installing VirtualBox";
	public static final String recapituler3TableTr07Td2 = recapituler3TableTr07Td21;
	public static final String recapituler3TableTr07Td3I1 = "fas fa-box-full";
	public static final String recapituler3TableTr07Td3I = recapituler3TableTr07Td3I1;
	public static final String recapituler3TableTr07Td41 = "Install the package with yum";
	public static final String recapituler3TableTr07Td4 = recapituler3TableTr07Td41;
	public static final String recapituler3TableTr08Td1I1 = "fas fa-clipboard-list";
	public static final String recapituler3TableTr08Td1I = recapituler3TableTr08Td1I1;
	public static final String recapituler3TableTr08Td21 = "How to put an operating system on a virtual machine";
	public static final String recapituler3TableTr08Td2 = recapituler3TableTr08Td21;
	public static final String recapituler3TableTr08Td3I1 = "fas fa-arrow-alt-to-bottom";
	public static final String recapituler3TableTr08Td3I = recapituler3TableTr08Td3I1;
	public static final String recapituler3TableTr08Td41 = "Download an ISO file";
	public static final String recapituler3TableTr08Td4 = recapituler3TableTr08Td41;
	public static final String recapituler3TableTr09Td1I1 = "fas fa-clipboard-check";
	public static final String recapituler3TableTr09Td1I = recapituler3TableTr09Td1I1;
	public static final String recapituler3TableTr09Td21 = "Verify ISO download";
	public static final String recapituler3TableTr09Td2 = recapituler3TableTr09Td21;
	public static final String recapituler3TableTr09Td3I1 = "fas fa-box-check";
	public static final String recapituler3TableTr09Td3I = recapituler3TableTr09Td3I1;
	public static final String recapituler3TableTr09Td41 = "Check the sha256sum";
	public static final String recapituler3TableTr09Td4 = recapituler3TableTr09Td41;
	public static final String recapituler3TableTr10Td1I1 = "fas fa-plus-square";
	public static final String recapituler3TableTr10Td1I = recapituler3TableTr10Td1I1;
	public static final String recapituler3TableTr10Td21 = "How do I create the virtual machine?";
	public static final String recapituler3TableTr10Td2 = recapituler3TableTr10Td21;
	public static final String recapituler3TableTr10Td3I1 = "fas fa-window";
	public static final String recapituler3TableTr10Td3I = recapituler3TableTr10Td3I1;
	public static final String recapituler3TableTr10Td41 = "Open up VirtualBox and click New";
	public static final String recapituler3TableTr10Td4 = recapituler3TableTr10Td41;
	public static final String recapituler3TableTr11Td1I1 = "fas fa-exclamation-circle";
	public static final String recapituler3TableTr11Td1I = recapituler3TableTr11Td1I1;
	public static final String recapituler3TableTr11Td21 = "Kernel driver not installed error";
	public static final String recapituler3TableTr11Td2 = recapituler3TableTr11Td21;
	public static final String recapituler3TableTr11Td3I1 = "fas fa-clipboard-list";
	public static final String recapituler3TableTr11Td3I = recapituler3TableTr11Td3I1;
	public static final String recapituler3TableTr11Td41 = "Install kernel prerequisites";
	public static final String recapituler3TableTr11Td4 = recapituler3TableTr11Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
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
	protected C001L003InstallerMachineVirtuelleVirtualBox recapituler3Init() {
		if(recapituler3 != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler3, "recapituler3");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
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
					{ e("span").a("class", " recapituler3TableTr02Td3Span2 recapituler3TableTr even ").f();
						{ e("i").a("class", recapituler3TableTr02Td3Span2I1, " site-menu-icon recapituler3TableTr02Td3Span2I ").f();
						} g("i");
					} g("span");
					{ e("span").a("class", " recapituler3TableTr02Td3Span3 recapituler3TableTr odd ").f();
						{ e("i").a("class", recapituler3TableTr02Td3Span3I1, " site-menu-icon recapituler3TableTr02Td3Span3I ").f();
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
					{ e("i").a("class", recapituler3TableTr04Td3I1, " site-menu-icon recapituler3TableTr04Td3I ").f();
					} g("i");
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

	protected boolean dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBox = false;

	public C001L003InstallerMachineVirtuelleVirtualBox initLoinC001L003InstallerMachineVirtuelleVirtualBox(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBox) {
			dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBox = true;
			initLoinC001L003InstallerMachineVirtuelleVirtualBox();
		}
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}

	public void initLoinC001L003InstallerMachineVirtuelleVirtualBox() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L003InstallerMachineVirtuelleVirtualBox();
	}

	public void initC001L003InstallerMachineVirtuelleVirtualBox() {
		moiInit();
		ecraserInit();
		commentInstallerInit();
		telechargerInit();
		deplacerDepotInit();
		yumSearchInit();
		yumInstallPaquetsInit();
		telechargerIsoInit();
		verifierIsoInit();
		creerMachineVirtuelleInit();
		erreurKernelInit();
		cmdSbinVboxconfig1Init();
		cmdErreurKernelInit();
		cmdSbinVboxconfig2Init();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L003InstallerMachineVirtuelleVirtualBox(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L003InstallerMachineVirtuelleVirtualBox(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(ecraser != null)
			ecraser.setRequeteSite_(requeteSite_);
		if(commentInstaller != null)
			commentInstaller.setRequeteSite_(requeteSite_);
		if(telecharger != null)
			telecharger.setRequeteSite_(requeteSite_);
		if(deplacerDepot != null)
			deplacerDepot.setRequeteSite_(requeteSite_);
		if(yumSearch != null)
			yumSearch.setRequeteSite_(requeteSite_);
		if(yumInstallPaquets != null)
			yumInstallPaquets.setRequeteSite_(requeteSite_);
		if(telechargerIso != null)
			telechargerIso.setRequeteSite_(requeteSite_);
		if(verifierIso != null)
			verifierIso.setRequeteSite_(requeteSite_);
		if(creerMachineVirtuelle != null)
			creerMachineVirtuelle.setRequeteSite_(requeteSite_);
		if(erreurKernel != null)
			erreurKernel.setRequeteSite_(requeteSite_);
		if(cmdSbinVboxconfig1 != null)
			cmdSbinVboxconfig1.setRequeteSite_(requeteSite_);
		if(cmdErreurKernel != null)
			cmdErreurKernel.setRequeteSite_(requeteSite_);
		if(cmdSbinVboxconfig2 != null)
			cmdSbinVboxconfig2.setRequeteSite_(requeteSite_);
		if(recapituler1 != null)
			recapituler1.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L003InstallerMachineVirtuelleVirtualBox(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L003InstallerMachineVirtuelleVirtualBox(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L003InstallerMachineVirtuelleVirtualBox(String var) {
		C001L003InstallerMachineVirtuelleVirtualBox oC001L003InstallerMachineVirtuelleVirtualBox = (C001L003InstallerMachineVirtuelleVirtualBox)this;
		switch(var) {
			case "moi":
				return oC001L003InstallerMachineVirtuelleVirtualBox.moi;
			case "ecraser":
				return oC001L003InstallerMachineVirtuelleVirtualBox.ecraser;
			case "commentInstaller":
				return oC001L003InstallerMachineVirtuelleVirtualBox.commentInstaller;
			case "telecharger":
				return oC001L003InstallerMachineVirtuelleVirtualBox.telecharger;
			case "deplacerDepot":
				return oC001L003InstallerMachineVirtuelleVirtualBox.deplacerDepot;
			case "yumSearch":
				return oC001L003InstallerMachineVirtuelleVirtualBox.yumSearch;
			case "yumInstallPaquets":
				return oC001L003InstallerMachineVirtuelleVirtualBox.yumInstallPaquets;
			case "telechargerIso":
				return oC001L003InstallerMachineVirtuelleVirtualBox.telechargerIso;
			case "verifierIso":
				return oC001L003InstallerMachineVirtuelleVirtualBox.verifierIso;
			case "creerMachineVirtuelle":
				return oC001L003InstallerMachineVirtuelleVirtualBox.creerMachineVirtuelle;
			case "erreurKernel":
				return oC001L003InstallerMachineVirtuelleVirtualBox.erreurKernel;
			case "cmdSbinVboxconfig1":
				return oC001L003InstallerMachineVirtuelleVirtualBox.cmdSbinVboxconfig1;
			case "cmdErreurKernel":
				return oC001L003InstallerMachineVirtuelleVirtualBox.cmdErreurKernel;
			case "cmdSbinVboxconfig2":
				return oC001L003InstallerMachineVirtuelleVirtualBox.cmdSbinVboxconfig2;
			case "recapituler1":
				return oC001L003InstallerMachineVirtuelleVirtualBox.recapituler1;
			case "recapituler2":
				return oC001L003InstallerMachineVirtuelleVirtualBox.recapituler2;
			case "recapituler3":
				return oC001L003InstallerMachineVirtuelleVirtualBox.recapituler3;
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
				o = attribuerC001L003InstallerMachineVirtuelleVirtualBox(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L003InstallerMachineVirtuelleVirtualBox(String var, Object val) {
		C001L003InstallerMachineVirtuelleVirtualBox oC001L003InstallerMachineVirtuelleVirtualBox = (C001L003InstallerMachineVirtuelleVirtualBox)this;
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
					o = definirC001L003InstallerMachineVirtuelleVirtualBox(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L003InstallerMachineVirtuelleVirtualBox(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png"));
				System.out.println("C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box-999.png"));
				System.out.println("C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage");
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L003InstallerMachineVirtuelleVirtualBox o = new C001L003InstallerMachineVirtuelleVirtualBox();
			o.requeteSiteC001L003InstallerMachineVirtuelleVirtualBox(requeteSite);
			o.initLoinC001L003InstallerMachineVirtuelleVirtualBox(requeteSite);
			o.indexerC001L003InstallerMachineVirtuelleVirtualBox();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001L003InstallerMachineVirtuelleVirtualBox();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001L003InstallerMachineVirtuelleVirtualBox(document);
	}

	public void indexerC001L003InstallerMachineVirtuelleVirtualBox(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L003InstallerMachineVirtuelleVirtualBox(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L003InstallerMachineVirtuelleVirtualBox() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L003InstallerMachineVirtuelleVirtualBox(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L003InstallerMachineVirtuelleVirtualBox(SolrInputDocument document) {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L003InstallerMachineVirtuelleVirtualBox() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinC001L003InstallerMachineVirtuelleVirtualBox(siteContexte.getRequeteSite_());
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
		stockerC001L003InstallerMachineVirtuelleVirtualBox(solrDocument);
	}
	public void stockerC001L003InstallerMachineVirtuelleVirtualBox(SolrDocument solrDocument) {
		C001L003InstallerMachineVirtuelleVirtualBox oC001L003InstallerMachineVirtuelleVirtualBox = (C001L003InstallerMachineVirtuelleVirtualBox)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBox();
	}

	public void htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBox() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(ecraser != null)
			ecraser.htmlBodyCourt();
		if(commentInstaller != null)
			commentInstaller.htmlBodyCourt();
		if(telecharger != null)
			telecharger.htmlBodyCourt();
		if(deplacerDepot != null)
			deplacerDepot.htmlBodyCourt();
		if(yumSearch != null)
			yumSearch.htmlBodyCourt();
		if(yumInstallPaquets != null)
			yumInstallPaquets.htmlBodyCourt();
		if(telechargerIso != null)
			telechargerIso.htmlBodyCourt();
		if(verifierIso != null)
			verifierIso.htmlBodyCourt();
		if(creerMachineVirtuelle != null)
			creerMachineVirtuelle.htmlBodyCourt();
		if(erreurKernel != null)
			erreurKernel.htmlBodyCourt();
		if(cmdSbinVboxconfig1 != null)
			cmdSbinVboxconfig1.htmlBodyCourt();
		if(cmdErreurKernel != null)
			cmdErreurKernel.htmlBodyCourt();
		if(cmdSbinVboxconfig2 != null)
			cmdSbinVboxconfig2.htmlBodyCourt();
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
		htmlBodyC001L003InstallerMachineVirtuelleVirtualBox();
		super.htmlBody();
	}

	public void htmlBodyC001L003InstallerMachineVirtuelleVirtualBox() {
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyMoi();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyEcraser();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyCommentInstaller();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyTelecharger();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyDeplacerDepot();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyYumSearch();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyYumInstallPaquets();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyTelechargerIso();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyVerifierIso();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyCreerMachineVirtuelle();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyErreurKernel();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyCmdSbinVboxconfig1();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyCmdErreurKernel();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyCmdSbinVboxconfig2();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyRecapituler1();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyRecapituler2();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyRecapituler3();
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
		if(!(o instanceof C001L003InstallerMachineVirtuelleVirtualBox))
			return false;
		C001L003InstallerMachineVirtuelleVirtualBox that = (C001L003InstallerMachineVirtuelleVirtualBox)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L003InstallerMachineVirtuelleVirtualBox {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L003InstallerMachineVirtuelleVirtualBoxVals = new String[] { moiP1, moiP2, ecraserH3I1, ecraserH3Span1, ecraserH4Span1I1, ecraserH4Span2I1, ecraserH4Span3I1, ecraserH4Span1, ecraserPDiv1, ecraserPDiv2, ecraserPDiv3, ecraserPDiv4, ecraserPDiv5, ecraserPDiv6, commentInstallerH3I1, commentInstallerH3Span1, commentInstallerH4I1, commentInstallerH4Span1, commentInstallerPOlLi1Span1, commentInstallerPOlLi2Span1, commentInstallerPOlLi2A1, commentInstallerPOlLi3Span1, commentInstallerPOlLi4Span1, telechargerH3I1, telechargerH3Span1, telechargerH4I1, telechargerH4Span1, telechargerPreSpan11, telechargerPreSpan21, telechargerPreSpan31, telechargerPreSpan41, telechargerOlLi11, telechargerOlLi21, telechargerOlLi31, telechargerOlLi41, deplacerDepotH3I1, deplacerDepotH3Span1, deplacerDepotH4I1, deplacerDepotH4Span1, deplacerDepotPreSpan11, deplacerDepotPreSpan21, deplacerDepotPreSpan31, deplacerDepotPreSpan41, deplacerDepotOlLi11, deplacerDepotOlLi12, deplacerDepotOlLi13, deplacerDepotOlLi21, deplacerDepotOlLi31, deplacerDepotOlLi41, yumSearchH3I1, yumSearchH3Span1, yumSearchH4I1, yumSearchH4Span1, yumSearchPreSpan11, yumSearchPreSpan21, yumSearchPreSpan31, yumSearchPreSpan41, yumSearchOlLi11, yumSearchOlLi21, yumSearchOlLi22, yumSearchOlLi31, yumSearchOlLi41, yumInstallPaquetsH3I1, yumInstallPaquetsH3Span1, yumInstallPaquetsH4I1, yumInstallPaquetsH4Span1, yumInstallPaquetsPreSpan11, yumInstallPaquetsPreSpan21, yumInstallPaquetsPreSpan31, yumInstallPaquetsPreSpan41, yumInstallPaquetsPreSpan51, yumInstallPaquetsOlLi11, yumInstallPaquetsOlLi21, yumInstallPaquetsOlLi31, yumInstallPaquetsOlLi41, yumInstallPaquetsOlLi51, yumInstallPaquetsOlLi52, yumInstallPaquetsOlLi53, telechargerIsoH3I1, telechargerIsoH3Span1, telechargerIsoH4I1, telechargerIsoH4Span1, telechargerIsoPreSpan11, telechargerIsoPreSpan21, telechargerIsoPreSpan31, telechargerIsoPreSpan41, telechargerIsoOlLi11, telechargerIsoOlLi21, telechargerIsoOlLi31, telechargerIsoOlLi41, telechargerIsoPSpan11, telechargerIsoPSpan2A1, telechargerIsoPSpan31, telechargerIsoPSpan32, telechargerIsoPSpan33, verifierIsoH3I1, verifierIsoH3Span1, verifierIsoH4I1, verifierIsoH4Span1, verifierIsoPreSpan11, verifierIsoPreSpan21, verifierIsoOlLi11, verifierIsoOlLi21, verifierIsoPSpan11, verifierIsoPSpan2A1, verifierIsoPSpan31, verifierIsoPSpan32, verifierIsoPSpan33, verifierIsoPSpan34, creerMachineVirtuelleH3I1, creerMachineVirtuelleH3Span1, creerMachineVirtuelleH4I1, creerMachineVirtuelleH4Span1, creerMachineVirtuelleOlLi011, creerMachineVirtuelleOlLi021, creerMachineVirtuelleOlLi031, creerMachineVirtuelleOlLi041, creerMachineVirtuelleOlLi051, creerMachineVirtuelleOlLi061, creerMachineVirtuelleOlLi071, creerMachineVirtuelleOlLi072, creerMachineVirtuelleOlLi073, creerMachineVirtuelleOlLi081, creerMachineVirtuelleOlLi091, creerMachineVirtuelleOlLi092, creerMachineVirtuelleOlLi101, creerMachineVirtuelleOlLi111, creerMachineVirtuelleOlLi112, creerMachineVirtuelleOlLi121, creerMachineVirtuelleOlLi131, creerMachineVirtuelleOlLi132, creerMachineVirtuelleOlLi133, creerMachineVirtuelleOlLi141, creerMachineVirtuelleOlLi151, creerMachineVirtuelleOlLi152, creerMachineVirtuelleOlLi153, creerMachineVirtuelleOlLi161, creerMachineVirtuelleOlLi171, creerMachineVirtuelleOlLi181, creerMachineVirtuelleOlLi191, creerMachineVirtuelleOlLi201, creerMachineVirtuelleOlLi211, creerMachineVirtuelleOlLi221, creerMachineVirtuelleOlLi231, erreurKernelH3I1, erreurKernelH3Span1, erreurKernelH4I1, erreurKernelH4Span1, erreurKernelPSpan11, erreurKernelDivP11, erreurKernelDivP21, erreurKernelDivP31, erreurKernelDivP41, erreurKernelDivP51, erreurKernelDivP61, cmdSbinVboxconfig1PreSpan11, cmdSbinVboxconfig1PreSpan21, cmdSbinVboxconfig1OlLi11, cmdSbinVboxconfig1OlLi21, cmdSbinVboxconfig1OlLi22, cmdSbinVboxconfig1P11, cmdSbinVboxconfig1PreDiv011, cmdSbinVboxconfig1PreDiv021, cmdSbinVboxconfig1PreDiv031, cmdSbinVboxconfig1PreDiv041, cmdSbinVboxconfig1PreDiv051, cmdSbinVboxconfig1PreDiv061, cmdSbinVboxconfig1PreDiv071, cmdSbinVboxconfig1PreDiv081, cmdSbinVboxconfig1PreDiv091, cmdSbinVboxconfig1PreDiv101, cmdSbinVboxconfig1PreDiv111, cmdSbinVboxconfig1PreDiv121, cmdSbinVboxconfig1P21, cmdErreurKernelPreSpan11, cmdErreurKernelPreSpan21, cmdErreurKernelPreSpan31, cmdErreurKernelPreSpan41, cmdErreurKernelPreSpan51, cmdErreurKernelPreSpan52, cmdErreurKernelOlLi11, cmdErreurKernelOlLi21, cmdErreurKernelOlLi31, cmdErreurKernelOlLi41, cmdErreurKernelOlLi51, cmdErreurKernelOlLi61, cmdErreurKernelOlLi62, cmdSbinVboxconfig2PreSpan11, cmdSbinVboxconfig2PreSpan21, cmdSbinVboxconfig2OlLi11, cmdSbinVboxconfig2OlLi21, cmdSbinVboxconfig2P11, cmdSbinVboxconfig2P21, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td3Span2I1, recapituler3TableTr02Td3Span3I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3I1, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41, recapituler3TableTr11Td1I1, recapituler3TableTr11Td21, recapituler3TableTr11Td3I1, recapituler3TableTr11Td41 };
}
