package org.computate.site.enUS.cours.c001.l004;

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
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L004InstallerCentos7Gen<DEV> extends C001Lecon {

	public static final String C001L004InstallerCentos7_UnNom = "a lesson";
	public static final String C001L004InstallerCentos7_Ce = "this ";
	public static final String C001L004InstallerCentos7_CeNom = "this lesson";
	public static final String C001L004InstallerCentos7_Un = "an ";
	public static final String C001L004InstallerCentos7_LeNom = "the lesson";
	public static final String C001L004InstallerCentos7_NomSingulier = "lesson";
	public static final String C001L004InstallerCentos7_NomPluriel = "lessons";
	public static final String C001L004InstallerCentos7_NomActuel = "current lesson";
	public static final String C001L004InstallerCentos7_TousNom = "the lessons";
	public static final String C001L004InstallerCentos7_RechercherTousNomPar = "search lessons by ";
	public static final String C001L004InstallerCentos7_H1 = "How do I install the operating system to start developing my website? ";
	public static final String C001L004InstallerCentos7_H2 = "Every step to install the CentOS 7 operating system. ";
	public static final String C001L004InstallerCentos7_Titre = "How do I install the operating system to start developing my website? Every step to install the CentOS 7 operating system. ";
	public static final String C001L004InstallerCentos7_LesNoms = "the lessons";
	public static final String C001L004InstallerCentos7_AucunNomTrouve = "no lesson found";
	public static final String C001L004InstallerCentos7_NomVar = "lesson";
	public static final String C001L004InstallerCentos7_DeNom = "of lesson";
	public static final String C001L004InstallerCentos7_Couleur = "green";
	public static final String C001L004InstallerCentos7_IconeGroupe = "regular";
	public static final String C001L004InstallerCentos7_IconeNom = "question";
	public static final String C001L004InstallerCentos7FrFRPage_Uri = "/frFR/cours/001/004-comment-installer-centos7";
	public static final String C001L004InstallerCentos7FrFRPage_ImageUri = "/png/frFR/cours/001/004-comment-installer-centos7-999.png";
	public static final String C001L004InstallerCentos7EnUSPage_Uri = "/enUS/course/001/004-how-to-install-centos7";
	public static final String C001L004InstallerCentos7EnUSPage_ImageUri = "/png/enUS/course/001/004-how-to-install-centos7-999.png";

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L004InstallerCentos7 moiInit() {
		if(moi != null) {
			((C001L004InstallerCentos7)this).avantPagePart(moi, "moi");
			((C001L004InstallerCentos7)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
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

	////////////////////////////////
	// questionTelechargerCentos7 //
	////////////////////////////////

	public static final String questionTelechargerCentos7H3I1 = "far fa-person-carry";
	public static final String questionTelechargerCentos7H3I = questionTelechargerCentos7H3I1;
	public static final String questionTelechargerCentos7H3Span1 = "How do I download CentOS 7?";
	public static final String questionTelechargerCentos7H3Span = questionTelechargerCentos7H3Span1;
	public static final String questionTelechargerCentos7H4I1 = "far fa-cloud-download-alt";
	public static final String questionTelechargerCentos7H4I = questionTelechargerCentos7H4I1;
	public static final String questionTelechargerCentos7H4Span1 = "Download an ISO file. ";
	public static final String questionTelechargerCentos7H4Span = questionTelechargerCentos7H4Span1;
	public static final String questionTelechargerCentos7PreSpan11 = "wget";
	public static final String questionTelechargerCentos7PreSpan1 = questionTelechargerCentos7PreSpan11;
	public static final String questionTelechargerCentos7PreSpan21 = " http://mirrors.xmission.com/centos/7.6.1810/isos/x86_64/CentOS-7-x86_64-DVD-1810.iso";
	public static final String questionTelechargerCentos7PreSpan2 = questionTelechargerCentos7PreSpan21;
	public static final String questionTelechargerCentos7PreSpan31 = " -O";
	public static final String questionTelechargerCentos7PreSpan3 = questionTelechargerCentos7PreSpan31;
	public static final String questionTelechargerCentos7PreSpan41 = " ~/Downloads/CentOS-7-x86_64-DVD-1810.iso";
	public static final String questionTelechargerCentos7PreSpan4 = questionTelechargerCentos7PreSpan41;
	public static final String questionTelechargerCentos7OlLi11 = "wget: The command to download files. ";
	public static final String questionTelechargerCentos7OlLi1 = questionTelechargerCentos7OlLi11;
	public static final String questionTelechargerCentos7OlLi21 = "The URL to the CentOS 7 ISO file to download. ";
	public static final String questionTelechargerCentos7OlLi2 = questionTelechargerCentos7OlLi21;
	public static final String questionTelechargerCentos7OlLi31 = "-O: For specifying the output path for the downloaded file. ";
	public static final String questionTelechargerCentos7OlLi3 = questionTelechargerCentos7OlLi31;
	public static final String questionTelechargerCentos7OlLi41 = "The output path for the downloaded CentOS 7 ISO file. ";
	public static final String questionTelechargerCentos7OlLi4 = questionTelechargerCentos7OlLi41;
	public static final String questionTelechargerCentos7PSpan11 = "You can download the latest CentOS 7 ISO file to install on your computer here ";
	public static final String questionTelechargerCentos7PSpan1 = questionTelechargerCentos7PSpan11;
	public static final String questionTelechargerCentos7PSpan2A1 = "https://www.centos.org/download/";
	public static final String questionTelechargerCentos7PSpan2A = questionTelechargerCentos7PSpan2A1;
	public static final String questionTelechargerCentos7PSpan31 = ". Click on the [ DVD ISO ] button. ";
	public static final String questionTelechargerCentos7PSpan32 = "You can choose from any of the mirrors, you might find one close to you. ";
	public static final String questionTelechargerCentos7PSpan33 = "You can also download the file using the wget command in the terminal like that. ";
	public static final String questionTelechargerCentos7PSpan3 = questionTelechargerCentos7PSpan31 + questionTelechargerCentos7PSpan32 + questionTelechargerCentos7PSpan33;

	/**	L'entité « questionTelechargerCentos7 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionTelechargerCentos7 = new PageHtml();
	public Couverture<PageHtml> questionTelechargerCentos7Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionTelechargerCentos7").o(questionTelechargerCentos7);

	/**	<br/>L'entité « questionTelechargerCentos7 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionTelechargerCentos7">Trouver l'entité questionTelechargerCentos7 dans Solr</a>
	 * <br/>
	 * @param questionTelechargerCentos7 est l'entité déjà construit. 
	 **/
	protected abstract void _questionTelechargerCentos7(PageHtml o);

	public PageHtml getQuestionTelechargerCentos7() {
		return questionTelechargerCentos7;
	}

	public void setQuestionTelechargerCentos7(PageHtml questionTelechargerCentos7) {
		this.questionTelechargerCentos7 = questionTelechargerCentos7;
		this.questionTelechargerCentos7Couverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionTelechargerCentos7Init() {
		if(questionTelechargerCentos7 != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionTelechargerCentos7, "questionTelechargerCentos7");
			((C001L004InstallerCentos7)this).avantPagePart(questionTelechargerCentos7, "questionTelechargerCentos7");
		}
		if(!questionTelechargerCentos7Couverture.dejaInitialise) {
			_questionTelechargerCentos7(questionTelechargerCentos7);
		}
		questionTelechargerCentos7.initLoinPourClasse(requeteSite_);
		questionTelechargerCentos7Couverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionTelechargerCentos7(PageHtml o) {
		{ e("h3").a("class", " questionTelechargerCentos7H3 ").f();
			{ e("i").a("class", questionTelechargerCentos7H3I1, " site-menu-icon questionTelechargerCentos7H3I ").f();
			} g("i");
			{ e("span").a("class", " questionTelechargerCentos7H3Span ").f();
				sx(questionTelechargerCentos7H3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionTelechargerCentos7H4 ").f();
			{ e("i").a("class", questionTelechargerCentos7H4I1, " site-menu-icon questionTelechargerCentos7H4I ").f();
			} g("i");
			{ e("span").a("class", " questionTelechargerCentos7H4Span ").f();
				sx(questionTelechargerCentos7H4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionTelechargerCentos7Pre ").f();
			{ e("span").a("class", " questionTelechargerCentos7PreSpan1 questionTelechargerCentos7PreSpan odd ").f();
				sx(questionTelechargerCentos7PreSpan11);
			} g("span");
			{ e("span").a("class", " questionTelechargerCentos7PreSpan2 questionTelechargerCentos7PreSpan even ").f();
				sx(questionTelechargerCentos7PreSpan21);
			} g("span");
			{ e("span").a("class", " questionTelechargerCentos7PreSpan3 questionTelechargerCentos7PreSpan odd ").f();
				sx(questionTelechargerCentos7PreSpan31);
			} g("span");
			{ e("span").a("class", " questionTelechargerCentos7PreSpan4 questionTelechargerCentos7PreSpan even ").f();
				sx(questionTelechargerCentos7PreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionTelechargerCentos7Ol ").f();
			{ e("li").a("class", " questionTelechargerCentos7OlLi1 questionTelechargerCentos7OlLi odd ").f();
				sx(questionTelechargerCentos7OlLi11);
			} g("li");
			{ e("li").a("class", " questionTelechargerCentos7OlLi2 questionTelechargerCentos7OlLi even ").f();
				sx(questionTelechargerCentos7OlLi21);
			} g("li");
			{ e("li").a("class", " questionTelechargerCentos7OlLi3 questionTelechargerCentos7OlLi odd ").f();
				sx(questionTelechargerCentos7OlLi31);
			} g("li");
			{ e("li").a("class", " questionTelechargerCentos7OlLi4 questionTelechargerCentos7OlLi even ").f();
				sx(questionTelechargerCentos7OlLi41);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionTelechargerCentos7P ").f();
			{ e("span").a("class", " questionTelechargerCentos7PSpan1 questionTelechargerCentos7PSpan odd ").f();
				sx(questionTelechargerCentos7PSpan11);
			} g("span");
			{ e("span").a("class", " questionTelechargerCentos7PSpan2 questionTelechargerCentos7PSpan even ").f();
				{ e("a").a("class", " questionTelechargerCentos7PSpan2A ").a("href", questionTelechargerCentos7PSpan2A1).f();
					sx(questionTelechargerCentos7PSpan2A1);
				} g("a");
			} g("span");
			{ e("span").a("class", " questionTelechargerCentos7PSpan3 questionTelechargerCentos7PSpan odd ").f();
				sx(questionTelechargerCentos7PSpan31);
				sx(questionTelechargerCentos7PSpan32);
				sx(questionTelechargerCentos7PSpan33);
			} g("span");
		} g("p");
	}
	public void htmlBodyQuestionTelechargerCentos7() {
		questionTelechargerCentos7.htmlAvant();
		htmlBodyQuestionTelechargerCentos7(questionTelechargerCentos7);
		questionTelechargerCentos7.htmlApres();
	}

	////////////////////////////
	// questionCreerUneCleUsb //
	////////////////////////////

	public static final String questionCreerUneCleUsbH3I1 = "fab fa-usb";
	public static final String questionCreerUneCleUsbH3I = questionCreerUneCleUsbH3I1;
	public static final String questionCreerUneCleUsbH3Span1 = "How can I create a USB key with CentOS 7? ";
	public static final String questionCreerUneCleUsbH3Span = questionCreerUneCleUsbH3Span1;
	public static final String questionCreerUneCleUsbH4I1 = "far fa-compact-disc";
	public static final String questionCreerUneCleUsbH4I = questionCreerUneCleUsbH4I1;
	public static final String questionCreerUneCleUsbH4Span1 = "Use the dd command. ";
	public static final String questionCreerUneCleUsbH4Span = questionCreerUneCleUsbH4Span1;
	public static final String questionCreerUneCleUsbOl1Li11 = "Once you have downloaded your ISO image, place your USB key into a USB port on your computer. ";
	public static final String questionCreerUneCleUsbOl1Li1 = questionCreerUneCleUsbOl1Li11;
	public static final String questionCreerUneCleUsbOl1Li2Span11 = "If you are currently using windows, you can download a program like Win32 Disk Imager to load the ISO image onto a USB key at the bottom of this page ";
	public static final String questionCreerUneCleUsbOl1Li2Span1 = questionCreerUneCleUsbOl1Li2Span11;
	public static final String questionCreerUneCleUsbOl1Li2A1 = "https://wiki.centos.org/HowTos/InstallFromUSBkey";
	public static final String questionCreerUneCleUsbOl1Li2A = questionCreerUneCleUsbOl1Li2A1;
	public static final String questionCreerUneCleUsbOl1Li2Span21 = ". ";
	public static final String questionCreerUneCleUsbOl1Li2Span2 = questionCreerUneCleUsbOl1Li2Span21;
	public static final String questionCreerUneCleUsbOl1Li31 = "If you are on Linux already, I'll teach you a way to load CentOS onto a USB key from the terminal that shows a progress bar. ";
	public static final String questionCreerUneCleUsbOl1Li32 = "First install the prerequisite \"pv\" application to monitor the progress of data through a pipe. ";
	public static final String questionCreerUneCleUsbOl1Li3 = questionCreerUneCleUsbOl1Li31 + questionCreerUneCleUsbOl1Li32;
	public static final String questionCreerUneCleUsbDiv2H51 = "Install the \"pv\" application. ";
	public static final String questionCreerUneCleUsbDiv2H5 = questionCreerUneCleUsbDiv2H51;
	public static final String questionCreerUneCleUsbPre2Span11 = "sudo";
	public static final String questionCreerUneCleUsbPre2Span1 = questionCreerUneCleUsbPre2Span11;
	public static final String questionCreerUneCleUsbPre2Span21 = " yum";
	public static final String questionCreerUneCleUsbPre2Span2 = questionCreerUneCleUsbPre2Span21;
	public static final String questionCreerUneCleUsbPre2Span31 = " install";
	public static final String questionCreerUneCleUsbPre2Span3 = questionCreerUneCleUsbPre2Span31;
	public static final String questionCreerUneCleUsbPre2Span41 = " -y";
	public static final String questionCreerUneCleUsbPre2Span42 = " pv";
	public static final String questionCreerUneCleUsbPre2Span4 = questionCreerUneCleUsbPre2Span41 + questionCreerUneCleUsbPre2Span42;
	public static final String questionCreerUneCleUsbOl2Li11 = "sudo: The command to install yum repositories begins with the command sudo. ";
	public static final String questionCreerUneCleUsbOl2Li12 = "The \"sudo\" command allows your current user to have root privileges for a few minutes after entering your password. ";
	public static final String questionCreerUneCleUsbOl2Li1 = questionCreerUneCleUsbOl2Li11 + questionCreerUneCleUsbOl2Li12;
	public static final String questionCreerUneCleUsbOl2Li21 = "yum : Stands for \"Yellowdog Updater Modified\", but nobody knows it as yellowdog, just yum. ";
	public static final String questionCreerUneCleUsbOl2Li22 = "CentOS manages software packages and RPM application files with yum. ";
	public static final String questionCreerUneCleUsbOl2Li2 = questionCreerUneCleUsbOl2Li21 + questionCreerUneCleUsbOl2Li22;
	public static final String questionCreerUneCleUsbOl2Li31 = "install: For installing new yum packages. ";
	public static final String questionCreerUneCleUsbOl2Li3 = questionCreerUneCleUsbOl2Li31;
	public static final String questionCreerUneCleUsbOl2Li41 = "-y: Suppress messages asking to confirm if you want to install the software. ";
	public static final String questionCreerUneCleUsbOl2Li4 = questionCreerUneCleUsbOl2Li41;
	public static final String questionCreerUneCleUsbOl2Li51 = "pv: The package name you wish to install. ";
	public static final String questionCreerUneCleUsbOl2Li5 = questionCreerUneCleUsbOl2Li51;
	public static final String questionCreerUneCleUsbDiv3H51 = "Find the path to the USB storage device. ";
	public static final String questionCreerUneCleUsbDiv3H5 = questionCreerUneCleUsbDiv3H51;
	public static final String questionCreerUneCleUsbDiv3P1 = "Run the built in command in linux to view the disks on the computer: ";
	public static final String questionCreerUneCleUsbDiv3P = questionCreerUneCleUsbDiv3P1;
	public static final String questionCreerUneCleUsbPre31 = "lsblk";
	public static final String questionCreerUneCleUsbPre3 = questionCreerUneCleUsbPre31;
	public static final String questionCreerUneCleUsbOl3Li11 = "lsblk: The command to list all block storage devices on the computer. ";
	public static final String questionCreerUneCleUsbOl3Li1 = questionCreerUneCleUsbOl3Li11;
	public static final String questionCreerUneCleUsbP41 = "You will want to very carefully review the list of disks. ";
	public static final String questionCreerUneCleUsbP42 = "Find the disk name that matches the size and mount point of your USB key. ";
	public static final String questionCreerUneCleUsbP43 = "Here is what my USB device at /dev/sdb looks like: ";
	public static final String questionCreerUneCleUsbP4 = questionCreerUneCleUsbP41 + questionCreerUneCleUsbP42 + questionCreerUneCleUsbP43;
	public static final String questionCreerUneCleUsbPre51 = "NAME                                          MAJ:MIN RM   SIZE RO TYPE  MOUNTPOINT";
	public static final String questionCreerUneCleUsbPre5 = questionCreerUneCleUsbPre51;
	public static final String questionCreerUneCleUsbPre5Br1 = "sdb                                             8:16   1   7.2G  0 disk";
	public static final String questionCreerUneCleUsbPre5Br2 = "├─sdb1                                          8:17   1   4.3G  0 part  /run/media/ctate/CentOS 7 x86_64";
	public static final String questionCreerUneCleUsbPre5Br3 = "└─sdb2                                          8:18   1   8.5M  0 part";
	public static final String questionCreerUneCleUsbPre5Br = questionCreerUneCleUsbPre5Br1 + questionCreerUneCleUsbPre5Br2 + questionCreerUneCleUsbPre5Br3;
	public static final String questionCreerUneCleUsbDiv6H51 = "Write the ISO image to the USB key and watch the progress. ";
	public static final String questionCreerUneCleUsbDiv6H5 = questionCreerUneCleUsbDiv6H51;
	public static final String questionCreerUneCleUsbP61 = "If the lsblk command shows sdb, sdb1, sdb2, etc, the path to your USB device would be /dev/sdb. ";
	public static final String questionCreerUneCleUsbP62 = "With that information, you can run a command to write the ISO image to the USB device and see the progress. ";
	public static final String questionCreerUneCleUsbP6 = questionCreerUneCleUsbP61 + questionCreerUneCleUsbP62;
	public static final String questionCreerUneCleUsbPre61 = "pv ~/Downloads/CentOS-7-x86_64-DVD-1810.iso | sudo dd of=/dev/sdb";
	public static final String questionCreerUneCleUsbPre6 = questionCreerUneCleUsbPre61;
	public static final String questionCreerUneCleUsbOl6Li11 = "pv: To monitor the progress of data through a pipe. ";
	public static final String questionCreerUneCleUsbOl6Li1 = questionCreerUneCleUsbOl6Li11;
	public static final String questionCreerUneCleUsbOl6Li21 = "The path to the ISO file. ";
	public static final String questionCreerUneCleUsbOl6Li2 = questionCreerUneCleUsbOl6Li21;
	public static final String questionCreerUneCleUsbOl6Li31 = "|: Takes the output from the pv command and uses it as the input to the dd command. ";
	public static final String questionCreerUneCleUsbOl6Li3 = questionCreerUneCleUsbOl6Li31;
	public static final String questionCreerUneCleUsbOl6Li41 = "sudo ";
	public static final String questionCreerUneCleUsbOl6Li4 = questionCreerUneCleUsbOl6Li41;
	public static final String questionCreerUneCleUsbOl6Li51 = "dd: Copies a file to a device. ";
	public static final String questionCreerUneCleUsbOl6Li5 = questionCreerUneCleUsbOl6Li51;
	public static final String questionCreerUneCleUsbOl6Li61 = "of=... The path to the USB device. ";
	public static final String questionCreerUneCleUsbOl6Li6 = questionCreerUneCleUsbOl6Li61;
	public static final String questionCreerUneCleUsbP71 = "Enjoy the progress bar as your ISO is slowly and carefully loaded onto your USB key. ";
	public static final String questionCreerUneCleUsbP7 = questionCreerUneCleUsbP71;

	/**	L'entité « questionCreerUneCleUsb »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCreerUneCleUsb = new PageHtml();
	public Couverture<PageHtml> questionCreerUneCleUsbCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCreerUneCleUsb").o(questionCreerUneCleUsb);

	/**	<br/>L'entité « questionCreerUneCleUsb »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCreerUneCleUsb">Trouver l'entité questionCreerUneCleUsb dans Solr</a>
	 * <br/>
	 * @param questionCreerUneCleUsb est l'entité déjà construit. 
	 **/
	protected abstract void _questionCreerUneCleUsb(PageHtml o);

	public PageHtml getQuestionCreerUneCleUsb() {
		return questionCreerUneCleUsb;
	}

	public void setQuestionCreerUneCleUsb(PageHtml questionCreerUneCleUsb) {
		this.questionCreerUneCleUsb = questionCreerUneCleUsb;
		this.questionCreerUneCleUsbCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionCreerUneCleUsbInit() {
		if(questionCreerUneCleUsb != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionCreerUneCleUsb, "questionCreerUneCleUsb");
			((C001L004InstallerCentos7)this).avantPagePart(questionCreerUneCleUsb, "questionCreerUneCleUsb");
		}
		if(!questionCreerUneCleUsbCouverture.dejaInitialise) {
			_questionCreerUneCleUsb(questionCreerUneCleUsb);
		}
		questionCreerUneCleUsb.initLoinPourClasse(requeteSite_);
		questionCreerUneCleUsbCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionCreerUneCleUsb(PageHtml o) {
		{ e("h3").a("class", " questionCreerUneCleUsbH3 ").f();
			{ e("i").a("class", questionCreerUneCleUsbH3I1, " site-menu-icon questionCreerUneCleUsbH3I ").f();
			} g("i");
			{ e("span").a("class", " questionCreerUneCleUsbH3Span ").f();
				sx(questionCreerUneCleUsbH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionCreerUneCleUsbH4 ").f();
			{ e("i").a("class", questionCreerUneCleUsbH4I1, " site-menu-icon questionCreerUneCleUsbH4I ").f();
			} g("i");
			{ e("span").a("class", " questionCreerUneCleUsbH4Span ").f();
				sx(questionCreerUneCleUsbH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " questionCreerUneCleUsbOl1 questionCreerUneCleUsbOl odd ").f();
			{ e("li").a("class", " questionCreerUneCleUsbOl1Li1 questionCreerUneCleUsbOl1Li odd ").f();
				sx(questionCreerUneCleUsbOl1Li11);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl1Li2 questionCreerUneCleUsbOl1Li even ").f();
				{ e("span").a("class", " questionCreerUneCleUsbOl1Li2Span1 questionCreerUneCleUsbOl1Li2Span odd ").f();
					sx(questionCreerUneCleUsbOl1Li2Span11);
				} g("span");
				{ e("a").a("class", " questionCreerUneCleUsbOl1Li2A ").a("href", questionCreerUneCleUsbOl1Li2A1).f();
					sx(questionCreerUneCleUsbOl1Li2A1);
				} g("a");
				{ e("span").a("class", " questionCreerUneCleUsbOl1Li2Span2 questionCreerUneCleUsbOl1Li2Span even ").f();
					sx(questionCreerUneCleUsbOl1Li2Span21);
				} g("span");
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl1Li3 questionCreerUneCleUsbOl1Li odd ").f();
				sx(questionCreerUneCleUsbOl1Li31);
				sx(questionCreerUneCleUsbOl1Li32);
			} g("li");
		} g("ol");
		{ e("div").a("class", " questionCreerUneCleUsbDiv2 questionCreerUneCleUsbDiv even ").f();
			{ e("h5").a("class", " questionCreerUneCleUsbDiv2H5 ").f();
				sx(questionCreerUneCleUsbDiv2H51);
			} g("h5");
		} g("div");
		{ e("pre").a("class", " questionCreerUneCleUsbPre2 questionCreerUneCleUsbPre even ").f();
			{ e("span").a("class", " questionCreerUneCleUsbPre2Span1 questionCreerUneCleUsbPre2Span odd ").f();
				sx(questionCreerUneCleUsbPre2Span11);
			} g("span");
			{ e("span").a("class", " questionCreerUneCleUsbPre2Span2 questionCreerUneCleUsbPre2Span even ").f();
				sx(questionCreerUneCleUsbPre2Span21);
			} g("span");
			{ e("span").a("class", " questionCreerUneCleUsbPre2Span3 questionCreerUneCleUsbPre2Span odd ").f();
				sx(questionCreerUneCleUsbPre2Span31);
			} g("span");
			{ e("span").a("class", " questionCreerUneCleUsbPre2Span4 questionCreerUneCleUsbPre2Span even ").f();
				sx(questionCreerUneCleUsbPre2Span41);
				sx(questionCreerUneCleUsbPre2Span42);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCreerUneCleUsbOl2 questionCreerUneCleUsbOl even ").f();
			{ e("li").a("class", " questionCreerUneCleUsbOl2Li1 questionCreerUneCleUsbOl2Li odd ").f();
				sx(questionCreerUneCleUsbOl2Li11);
				sx(questionCreerUneCleUsbOl2Li12);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl2Li2 questionCreerUneCleUsbOl2Li even ").f();
				sx(questionCreerUneCleUsbOl2Li21);
				sx(questionCreerUneCleUsbOl2Li22);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl2Li3 questionCreerUneCleUsbOl2Li odd ").f();
				sx(questionCreerUneCleUsbOl2Li31);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl2Li4 questionCreerUneCleUsbOl2Li even ").f();
				sx(questionCreerUneCleUsbOl2Li41);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl2Li5 questionCreerUneCleUsbOl2Li odd ").f();
				sx(questionCreerUneCleUsbOl2Li51);
			} g("li");
		} g("ol");
		{ e("div").a("class", " questionCreerUneCleUsbDiv3 questionCreerUneCleUsbDiv odd ").f();
			{ e("h5").a("class", " questionCreerUneCleUsbDiv3H5 ").f();
				sx(questionCreerUneCleUsbDiv3H51);
			} g("h5");
			{ e("p").a("class", " questionCreerUneCleUsbDiv3P ").f();
				sx(questionCreerUneCleUsbDiv3P1);
			} g("p");
		} g("div");
		{ e("pre").a("class", " questionCreerUneCleUsbPre3 questionCreerUneCleUsbPre odd ").f();
			sx(questionCreerUneCleUsbPre31);
		} g("pre");
		{ e("ol").a("class", " questionCreerUneCleUsbOl3 questionCreerUneCleUsbOl odd ").f();
			{ e("li").a("class", " questionCreerUneCleUsbOl3Li1 questionCreerUneCleUsbOl3Li odd ").f();
				sx(questionCreerUneCleUsbOl3Li11);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionCreerUneCleUsbP4 questionCreerUneCleUsbP even ").f();
			sx(questionCreerUneCleUsbP41);
			sx(questionCreerUneCleUsbP42);
			sx(questionCreerUneCleUsbP43);
		} g("p");
		{ e("pre").a("class", " questionCreerUneCleUsbPre5 questionCreerUneCleUsbPre odd ").f();
			sx(questionCreerUneCleUsbPre51);
			e("br").fg();
			sx(questionCreerUneCleUsbPre5Br1);
			e("br").fg();
			sx(questionCreerUneCleUsbPre5Br2);
			e("br").fg();
			sx(questionCreerUneCleUsbPre5Br3);
		} g("pre");
		{ e("div").a("class", " questionCreerUneCleUsbDiv6 questionCreerUneCleUsbDiv even ").f();
			{ e("h5").a("class", " questionCreerUneCleUsbDiv6H5 ").f();
				sx(questionCreerUneCleUsbDiv6H51);
			} g("h5");
		} g("div");
		{ e("p").a("class", " questionCreerUneCleUsbP6 questionCreerUneCleUsbP even ").f();
			sx(questionCreerUneCleUsbP61);
			sx(questionCreerUneCleUsbP62);
		} g("p");
		{ e("pre").a("class", " questionCreerUneCleUsbPre6 questionCreerUneCleUsbPre even ").f();
			sx(questionCreerUneCleUsbPre61);
		} g("pre");
		{ e("ol").a("class", " questionCreerUneCleUsbOl6 questionCreerUneCleUsbOl even ").f();
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li1 questionCreerUneCleUsbOl6Li odd ").f();
				sx(questionCreerUneCleUsbOl6Li11);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li2 questionCreerUneCleUsbOl6Li even ").f();
				sx(questionCreerUneCleUsbOl6Li21);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li3 questionCreerUneCleUsbOl6Li odd ").f();
				sx(questionCreerUneCleUsbOl6Li31);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li4 questionCreerUneCleUsbOl6Li even ").f();
				sx(questionCreerUneCleUsbOl6Li41);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li5 questionCreerUneCleUsbOl6Li odd ").f();
				sx(questionCreerUneCleUsbOl6Li51);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li6 questionCreerUneCleUsbOl6Li even ").f();
				sx(questionCreerUneCleUsbOl6Li61);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionCreerUneCleUsbP7 questionCreerUneCleUsbP odd ").f();
			sx(questionCreerUneCleUsbP71);
		} g("p");
	}
	public void htmlBodyQuestionCreerUneCleUsb() {
		questionCreerUneCleUsb.htmlAvant();
		htmlBodyQuestionCreerUneCleUsb(questionCreerUneCleUsb);
		questionCreerUneCleUsb.htmlApres();
	}

	/////////////////////////////////////
	// questionDemarrerSystemSurCleUsb //
	/////////////////////////////////////

	public static final String questionDemarrerSystemSurCleUsbH3I1 = "far fa-play-circle";
	public static final String questionDemarrerSystemSurCleUsbH3I = questionDemarrerSystemSurCleUsbH3I1;
	public static final String questionDemarrerSystemSurCleUsbH3Span1 = "When I reboot with the USB key, which boot mode do I choose? ";
	public static final String questionDemarrerSystemSurCleUsbH3Span = questionDemarrerSystemSurCleUsbH3Span1;
	public static final String questionDemarrerSystemSurCleUsbH4Span1I1 = "fab fa-windows";
	public static final String questionDemarrerSystemSurCleUsbH4Span1I = questionDemarrerSystemSurCleUsbH4Span1I1;
	public static final String questionDemarrerSystemSurCleUsbH4Span2I1 = "fab fa-centos";
	public static final String questionDemarrerSystemSurCleUsbH4Span2I = questionDemarrerSystemSurCleUsbH4Span2I1;
	public static final String questionDemarrerSystemSurCleUsbH4Span31 = "Avoid booting in UEFI boot mode. ";
	public static final String questionDemarrerSystemSurCleUsbH4Span3 = questionDemarrerSystemSurCleUsbH4Span31;
	public static final String questionDemarrerSystemSurCleUsbP11 = "When you reboot your computer, you will want to press the right key to enter the boot menu. ";
	public static final String questionDemarrerSystemSurCleUsbP12 = "If not, it's possible that you enter a boot mode on the USB that will cause problems after installing your operating system. ";
	public static final String questionDemarrerSystemSurCleUsbP13 = "For me, I will ignore the UEFI options, like \"UEFI: TOSHIBA TransMemory 1.00\", and choose \"TOSHIBA TransMemory 1.00\". ";
	public static final String questionDemarrerSystemSurCleUsbP14 = "I'm not an expert on UEFI, but I know I regretted installing it with UEFI once and it made my system unstable. ";
	public static final String questionDemarrerSystemSurCleUsbP15 = "One reason to use UEFI mode is if other systems (Windows Vista/7/8, GNU/Linux...) of your computer are installed in UEFI mode, and you wish to dual boot, then you must install in UEFI mode too. ";
	public static final String questionDemarrerSystemSurCleUsbP16 = "I never dual boot, since I chose a long time ago to keep Microsoft out of my personal life forever, so I never use UEFI mode. ";
	public static final String questionDemarrerSystemSurCleUsbP1 = questionDemarrerSystemSurCleUsbP11 + questionDemarrerSystemSurCleUsbP12 + questionDemarrerSystemSurCleUsbP13 + questionDemarrerSystemSurCleUsbP14 + questionDemarrerSystemSurCleUsbP15 + questionDemarrerSystemSurCleUsbP16;
	public static final String questionDemarrerSystemSurCleUsbP21 = "Now let it boot into your USB image, let it check the disk for errors and you're on your way! ";
	public static final String questionDemarrerSystemSurCleUsbP2 = questionDemarrerSystemSurCleUsbP21;

	/**	L'entité « questionDemarrerSystemSurCleUsb »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDemarrerSystemSurCleUsb = new PageHtml();
	public Couverture<PageHtml> questionDemarrerSystemSurCleUsbCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDemarrerSystemSurCleUsb").o(questionDemarrerSystemSurCleUsb);

	/**	<br/>L'entité « questionDemarrerSystemSurCleUsb »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionDemarrerSystemSurCleUsb">Trouver l'entité questionDemarrerSystemSurCleUsb dans Solr</a>
	 * <br/>
	 * @param questionDemarrerSystemSurCleUsb est l'entité déjà construit. 
	 **/
	protected abstract void _questionDemarrerSystemSurCleUsb(PageHtml o);

	public PageHtml getQuestionDemarrerSystemSurCleUsb() {
		return questionDemarrerSystemSurCleUsb;
	}

	public void setQuestionDemarrerSystemSurCleUsb(PageHtml questionDemarrerSystemSurCleUsb) {
		this.questionDemarrerSystemSurCleUsb = questionDemarrerSystemSurCleUsb;
		this.questionDemarrerSystemSurCleUsbCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionDemarrerSystemSurCleUsbInit() {
		if(questionDemarrerSystemSurCleUsb != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionDemarrerSystemSurCleUsb, "questionDemarrerSystemSurCleUsb");
			((C001L004InstallerCentos7)this).avantPagePart(questionDemarrerSystemSurCleUsb, "questionDemarrerSystemSurCleUsb");
		}
		if(!questionDemarrerSystemSurCleUsbCouverture.dejaInitialise) {
			_questionDemarrerSystemSurCleUsb(questionDemarrerSystemSurCleUsb);
		}
		questionDemarrerSystemSurCleUsb.initLoinPourClasse(requeteSite_);
		questionDemarrerSystemSurCleUsbCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionDemarrerSystemSurCleUsb(PageHtml o) {
		{ e("h3").a("class", " questionDemarrerSystemSurCleUsbH3 ").f();
			{ e("i").a("class", questionDemarrerSystemSurCleUsbH3I1, " site-menu-icon questionDemarrerSystemSurCleUsbH3I ").f();
			} g("i");
			{ e("span").a("class", " questionDemarrerSystemSurCleUsbH3Span ").f();
				sx(questionDemarrerSystemSurCleUsbH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionDemarrerSystemSurCleUsbH4 ").f();
			{ e("span").a("class", " questionDemarrerSystemSurCleUsbH4Span1 questionDemarrerSystemSurCleUsbH4Span odd ").f();
				{ e("i").a("class", questionDemarrerSystemSurCleUsbH4Span1I1, " site-menu-icon questionDemarrerSystemSurCleUsbH4Span1I ").f();
				} g("i");
			} g("span");
			{ e("span").a("class", " questionDemarrerSystemSurCleUsbH4Span2 questionDemarrerSystemSurCleUsbH4Span even ").f();
				{ e("i").a("class", questionDemarrerSystemSurCleUsbH4Span2I1, " site-menu-icon questionDemarrerSystemSurCleUsbH4Span2I ").f();
				} g("i");
			} g("span");
			{ e("span").a("class", " questionDemarrerSystemSurCleUsbH4Span3 questionDemarrerSystemSurCleUsbH4Span odd ").f();
				sx(questionDemarrerSystemSurCleUsbH4Span31);
			} g("span");
		} g("h4");
		{ e("p").a("class", " questionDemarrerSystemSurCleUsbP1 questionDemarrerSystemSurCleUsbP odd ").f();
			sx(questionDemarrerSystemSurCleUsbP11);
			sx(questionDemarrerSystemSurCleUsbP12);
			sx(questionDemarrerSystemSurCleUsbP13);
			sx(questionDemarrerSystemSurCleUsbP14);
			sx(questionDemarrerSystemSurCleUsbP15);
			sx(questionDemarrerSystemSurCleUsbP16);
		} g("p");
		{ e("p").a("class", " questionDemarrerSystemSurCleUsbP2 questionDemarrerSystemSurCleUsbP even ").f();
			sx(questionDemarrerSystemSurCleUsbP21);
		} g("p");
	}
	public void htmlBodyQuestionDemarrerSystemSurCleUsb() {
		questionDemarrerSystemSurCleUsb.htmlAvant();
		htmlBodyQuestionDemarrerSystemSurCleUsb(questionDemarrerSystemSurCleUsb);
		questionDemarrerSystemSurCleUsb.htmlApres();
	}

	///////////////////////////
	// questionChoisirLangue //
	///////////////////////////

	public static final String questionChoisirLangueH3I1 = "fas fa-flag-alt";
	public static final String questionChoisirLangueH3I = questionChoisirLangueH3I1;
	public static final String questionChoisirLangueH3Span1 = "What language would I use during the install process? ";
	public static final String questionChoisirLangueH3Span = questionChoisirLangueH3Span1;
	public static final String questionChoisirLangueH4I1 = "far fa-language";
	public static final String questionChoisirLangueH4I = questionChoisirLangueH4I1;
	public static final String questionChoisirLangueH4Span1 = "Choose the language you are comfortable with. ";
	public static final String questionChoisirLangueH4Span = questionChoisirLangueH4Span1;
	public static final String questionChoisirLangueOlLi11 = "On the left hand side, you will find the choices of language for the operating system. ";
	public static final String questionChoisirLangueOlLi12 = "Select the language that you prefer (English). ";
	public static final String questionChoisirLangueOlLi1 = questionChoisirLangueOlLi11 + questionChoisirLangueOlLi12;
	public static final String questionChoisirLangueOlLi21 = "On the right hand side, you will find the choices of locale (English (United States). ";
	public static final String questionChoisirLangueOlLi2 = questionChoisirLangueOlLi21;
	public static final String questionChoisirLangueOlLi31 = "Press [ Continue ]. ";
	public static final String questionChoisirLangueOlLi3 = questionChoisirLangueOlLi31;

	/**	L'entité « questionChoisirLangue »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionChoisirLangue = new PageHtml();
	public Couverture<PageHtml> questionChoisirLangueCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionChoisirLangue").o(questionChoisirLangue);

	/**	<br/>L'entité « questionChoisirLangue »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionChoisirLangue">Trouver l'entité questionChoisirLangue dans Solr</a>
	 * <br/>
	 * @param questionChoisirLangue est l'entité déjà construit. 
	 **/
	protected abstract void _questionChoisirLangue(PageHtml o);

	public PageHtml getQuestionChoisirLangue() {
		return questionChoisirLangue;
	}

	public void setQuestionChoisirLangue(PageHtml questionChoisirLangue) {
		this.questionChoisirLangue = questionChoisirLangue;
		this.questionChoisirLangueCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionChoisirLangueInit() {
		if(questionChoisirLangue != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionChoisirLangue, "questionChoisirLangue");
			((C001L004InstallerCentos7)this).avantPagePart(questionChoisirLangue, "questionChoisirLangue");
		}
		if(!questionChoisirLangueCouverture.dejaInitialise) {
			_questionChoisirLangue(questionChoisirLangue);
		}
		questionChoisirLangue.initLoinPourClasse(requeteSite_);
		questionChoisirLangueCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionChoisirLangue(PageHtml o) {
		{ e("h3").a("class", " questionChoisirLangueH3 ").f();
			{ e("i").a("class", questionChoisirLangueH3I1, " site-menu-icon questionChoisirLangueH3I ").f();
			} g("i");
			{ e("span").a("class", " questionChoisirLangueH3Span ").f();
				sx(questionChoisirLangueH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionChoisirLangueH4 ").f();
			{ e("i").a("class", questionChoisirLangueH4I1, " site-menu-icon questionChoisirLangueH4I ").f();
			} g("i");
			{ e("span").a("class", " questionChoisirLangueH4Span ").f();
				sx(questionChoisirLangueH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " questionChoisirLangueOl ").f();
			{ e("li").a("class", " questionChoisirLangueOlLi1 questionChoisirLangueOlLi odd ").f();
				sx(questionChoisirLangueOlLi11);
				sx(questionChoisirLangueOlLi12);
			} g("li");
			{ e("li").a("class", " questionChoisirLangueOlLi2 questionChoisirLangueOlLi even ").f();
				sx(questionChoisirLangueOlLi21);
			} g("li");
			{ e("li").a("class", " questionChoisirLangueOlLi3 questionChoisirLangueOlLi odd ").f();
				sx(questionChoisirLangueOlLi31);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionChoisirLangue() {
		questionChoisirLangue.htmlAvant();
		htmlBodyQuestionChoisirLangue(questionChoisirLangue);
		questionChoisirLangue.htmlApres();
	}

	///////////////////////
	// questionDateHeure //
	///////////////////////

	public static final String questionDateHeureH3I1 = "fas fa-clock";
	public static final String questionDateHeureH3I = questionDateHeureH3I1;
	public static final String questionDateHeureH3Span1 = "How do I setup the date and time for a CentOS 7 installation? ";
	public static final String questionDateHeureH3Span = questionDateHeureH3Span1;
	public static final String questionDateHeureH4I1 = "fas fa-city";
	public static final String questionDateHeureH4I = questionDateHeureH4I1;
	public static final String questionDateHeureH4Span1 = "Choose the big city near you. ";
	public static final String questionDateHeureH4Span = questionDateHeureH4Span1;
	public static final String questionDateHeureOlLi11 = "On the \"INSTALLATION SUMMARY\" page, there are several options to complete. ";
	public static final String questionDateHeureOlLi1 = questionDateHeureOlLi11;
	public static final String questionDateHeureOlLi21 = "Start in the \"LOCALIZATION\" section, click \"DATE & TIME\". ";
	public static final String questionDateHeureOlLi2 = questionDateHeureOlLi21;
	public static final String questionDateHeureOlLi31 = "Click on the city on the map that is the closest match to your timezone (for me it's Region: Americas, City: Denver). ";
	public static final String questionDateHeureOlLi3 = questionDateHeureOlLi31;
	public static final String questionDateHeureOlLi41 = "Select whether you prefer \"24-hour\" time or \"AM/PM\" time. ";
	public static final String questionDateHeureOlLi4 = questionDateHeureOlLi41;
	public static final String questionDateHeureOlLi51 = "In the top-left corner, click [ Done ]. ";
	public static final String questionDateHeureOlLi5 = questionDateHeureOlLi51;

	/**	L'entité « questionDateHeure »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDateHeure = new PageHtml();
	public Couverture<PageHtml> questionDateHeureCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDateHeure").o(questionDateHeure);

	/**	<br/>L'entité « questionDateHeure »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionDateHeure">Trouver l'entité questionDateHeure dans Solr</a>
	 * <br/>
	 * @param questionDateHeure est l'entité déjà construit. 
	 **/
	protected abstract void _questionDateHeure(PageHtml o);

	public PageHtml getQuestionDateHeure() {
		return questionDateHeure;
	}

	public void setQuestionDateHeure(PageHtml questionDateHeure) {
		this.questionDateHeure = questionDateHeure;
		this.questionDateHeureCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionDateHeureInit() {
		if(questionDateHeure != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionDateHeure, "questionDateHeure");
			((C001L004InstallerCentos7)this).avantPagePart(questionDateHeure, "questionDateHeure");
		}
		if(!questionDateHeureCouverture.dejaInitialise) {
			_questionDateHeure(questionDateHeure);
		}
		questionDateHeure.initLoinPourClasse(requeteSite_);
		questionDateHeureCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionDateHeure(PageHtml o) {
		{ e("h3").a("class", " questionDateHeureH3 ").f();
			{ e("i").a("class", questionDateHeureH3I1, " site-menu-icon questionDateHeureH3I ").f();
			} g("i");
			{ e("span").a("class", " questionDateHeureH3Span ").f();
				sx(questionDateHeureH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionDateHeureH4 ").f();
			{ e("i").a("class", questionDateHeureH4I1, " site-menu-icon questionDateHeureH4I ").f();
			} g("i");
			{ e("span").a("class", " questionDateHeureH4Span ").f();
				sx(questionDateHeureH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " questionDateHeureOl ").f();
			{ e("li").a("class", " questionDateHeureOlLi1 questionDateHeureOlLi odd ").f();
				sx(questionDateHeureOlLi11);
			} g("li");
			{ e("li").a("class", " questionDateHeureOlLi2 questionDateHeureOlLi even ").f();
				sx(questionDateHeureOlLi21);
			} g("li");
			{ e("li").a("class", " questionDateHeureOlLi3 questionDateHeureOlLi odd ").f();
				sx(questionDateHeureOlLi31);
			} g("li");
			{ e("li").a("class", " questionDateHeureOlLi4 questionDateHeureOlLi even ").f();
				sx(questionDateHeureOlLi41);
			} g("li");
			{ e("li").a("class", " questionDateHeureOlLi5 questionDateHeureOlLi odd ").f();
				sx(questionDateHeureOlLi51);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionDateHeure() {
		questionDateHeure.htmlAvant();
		htmlBodyQuestionDateHeure(questionDateHeure);
		questionDateHeure.htmlApres();
	}

	////////////////////
	// questionReseau //
	////////////////////

	public static final String questionReseauH3I1 = "fas fa-network-wired";
	public static final String questionReseauH3I = questionReseauH3I1;
	public static final String questionReseauH3Span1 = "How do I setup the network and host name? ";
	public static final String questionReseauH3Span = questionReseauH3Span1;
	public static final String questionReseauH4I1 = "fas fa-ethernet";
	public static final String questionReseauH4I = questionReseauH4I1;
	public static final String questionReseauH4Span1 = "Pick a unique name on your network and plug in your Ethernet cable. ";
	public static final String questionReseauH4Span = questionReseauH4Span1;
	public static final String questionReseauOlLi11 = "This is a good early step in the install process to configure the network so that necessary packages can be found before choosing other options. ";
	public static final String questionReseauOlLi12 = "In the SYSTEM section, select \"NETWORK & HOST NAME\". ";
	public static final String questionReseauOlLi1 = questionReseauOlLi11 + questionReseauOlLi12;
	public static final String questionReseauOlLi21 = "I'm expecting your machine to be connected to an Ethernet cable, rather than a wireless network. ";
	public static final String questionReseauOlLi22 = "So make sure your \"Ethernet (...)\" card is selected on the left. ";
	public static final String questionReseauOlLi2 = questionReseauOlLi21 + questionReseauOlLi22;
	public static final String questionReseauOlLi31 = "On the right side, switch the Ethernet card to on. ";
	public static final String questionReseauOlLi32 = "Notice that your router assigns the machine an IP Address based on the Hardware Address. ";
	public static final String questionReseauOlLi3 = questionReseauOlLi31 + questionReseauOlLi32;
	public static final String questionReseauOlLi41 = "Another important item to change is the \"Host name\". ";
	public static final String questionReseauOlLi42 = "Give your computer a unique name on your network (\"tower1\" for me), but do not include a fully qualified domain name (followed by a dot). ";
	public static final String questionReseauOlLi43 = "If you give a fully qualified domain name like \"tower1.computate.org\", then networking (/etc/resolve.conf) will configure your domain name \"computate.org\" as a search domain. ";
	public static final String questionReseauOlLi44 = "I've found that to cause me problems in the past, making networking slower for me. ";
	public static final String questionReseauOlLi45 = "I setup fully qualified domain names in an IPA server or in the /etc/hosts file instead. ";
	public static final String questionReseauOlLi4 = questionReseauOlLi41 + questionReseauOlLi42 + questionReseauOlLi43 + questionReseauOlLi44 + questionReseauOlLi45;
	public static final String questionReseauOlLi51 = "Next to the host name, click [ Apply ]. ";
	public static final String questionReseauOlLi5 = questionReseauOlLi51;
	public static final String questionReseauOlLi61 = "Now click [ Done ]. ";
	public static final String questionReseauOlLi6 = questionReseauOlLi61;

	/**	L'entité « questionReseau »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionReseau = new PageHtml();
	public Couverture<PageHtml> questionReseauCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionReseau").o(questionReseau);

	/**	<br/>L'entité « questionReseau »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionReseau">Trouver l'entité questionReseau dans Solr</a>
	 * <br/>
	 * @param questionReseau est l'entité déjà construit. 
	 **/
	protected abstract void _questionReseau(PageHtml o);

	public PageHtml getQuestionReseau() {
		return questionReseau;
	}

	public void setQuestionReseau(PageHtml questionReseau) {
		this.questionReseau = questionReseau;
		this.questionReseauCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionReseauInit() {
		if(questionReseau != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionReseau, "questionReseau");
			((C001L004InstallerCentos7)this).avantPagePart(questionReseau, "questionReseau");
		}
		if(!questionReseauCouverture.dejaInitialise) {
			_questionReseau(questionReseau);
		}
		questionReseau.initLoinPourClasse(requeteSite_);
		questionReseauCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionReseau(PageHtml o) {
		{ e("h3").a("class", " questionReseauH3 ").f();
			{ e("i").a("class", questionReseauH3I1, " site-menu-icon questionReseauH3I ").f();
			} g("i");
			{ e("span").a("class", " questionReseauH3Span ").f();
				sx(questionReseauH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionReseauH4 ").f();
			{ e("i").a("class", questionReseauH4I1, " site-menu-icon questionReseauH4I ").f();
			} g("i");
			{ e("span").a("class", " questionReseauH4Span ").f();
				sx(questionReseauH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " questionReseauOl ").f();
			{ e("li").a("class", " questionReseauOlLi1 questionReseauOlLi odd ").f();
				sx(questionReseauOlLi11);
				sx(questionReseauOlLi12);
			} g("li");
			{ e("li").a("class", " questionReseauOlLi2 questionReseauOlLi even ").f();
				sx(questionReseauOlLi21);
				sx(questionReseauOlLi22);
			} g("li");
			{ e("li").a("class", " questionReseauOlLi3 questionReseauOlLi odd ").f();
				sx(questionReseauOlLi31);
				sx(questionReseauOlLi32);
			} g("li");
			{ e("li").a("class", " questionReseauOlLi4 questionReseauOlLi even ").f();
				sx(questionReseauOlLi41);
				sx(questionReseauOlLi42);
				sx(questionReseauOlLi43);
				sx(questionReseauOlLi44);
				sx(questionReseauOlLi45);
			} g("li");
			{ e("li").a("class", " questionReseauOlLi5 questionReseauOlLi odd ").f();
				sx(questionReseauOlLi51);
			} g("li");
			{ e("li").a("class", " questionReseauOlLi6 questionReseauOlLi even ").f();
				sx(questionReseauOlLi61);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionReseau() {
		questionReseau.htmlAvant();
		htmlBodyQuestionReseau(questionReseau);
		questionReseau.htmlApres();
	}

	///////////////////////////////
	// questionSelectionLogiciel //
	///////////////////////////////

	public static final String questionSelectionLogicielH3I1 = "fas fa-save";
	public static final String questionSelectionLogicielH3I = questionSelectionLogicielH3I1;
	public static final String questionSelectionLogicielH3Span1 = "What should I choose for the software selection in a CentOS 7 installation? ";
	public static final String questionSelectionLogicielH3Span = questionSelectionLogicielH3Span1;
	public static final String questionSelectionLogicielH4I1 = "fas fa-browser";
	public static final String questionSelectionLogicielH4I = questionSelectionLogicielH4I1;
	public static final String questionSelectionLogicielH4Span1 = "Make sure to pick a desktop environment. ";
	public static final String questionSelectionLogicielH4Span = questionSelectionLogicielH4Span1;
	public static final String questionSelectionLogicielOlLi11 = "In the \"SOFTWARE\" section, click \"SOFTWARE SELECTION\". ";
	public static final String questionSelectionLogicielOlLi1 = questionSelectionLogicielOlLi11;
	public static final String questionSelectionLogicielOlLi21 = "I would always recommend a Desktop environment on your computers. ";
	public static final String questionSelectionLogicielOlLi22 = "Your computers are for development, and your actual website I recommend running on an OpenShift cloud at Red Hat's openshift.com. ";
	public static final String questionSelectionLogicielOlLi23 = "OpenShift is open source, and Red Hat is an open source company, the true leader in enterprise open source technology. ";
	public static final String questionSelectionLogicielOlLi24 = "I'll take you through the whole journey from developing your site on your own computer, to deployment on the OpenShift cloud. ";
	public static final String questionSelectionLogicielOlLi2 = questionSelectionLogicielOlLi21 + questionSelectionLogicielOlLi22 + questionSelectionLogicielOlLi23 + questionSelectionLogicielOlLi24;
	public static final String questionSelectionLogicielOlLi31 = "So in the \"Base Environment\" section, select \"GNOME Desktop\". ";
	public static final String questionSelectionLogicielOlLi32 = "Phonetically, GNOME is pronounced nɔ̃m, not ʒi-nɔ̃m. ";
	public static final String questionSelectionLogicielOlLi3 = questionSelectionLogicielOlLi31 + questionSelectionLogicielOlLi32;
	public static final String questionSelectionLogicielOlLi41 = "You could also choose \"KDE PLasma Workspaces\", but I find KDE to be buggy, and I prefer a simple GNOME Desktop. ";
	public static final String questionSelectionLogicielOlLi4 = questionSelectionLogicielOlLi41;
	public static final String questionSelectionLogicielOlLi51 = "In the top-left corner, click [ Done ]. ";
	public static final String questionSelectionLogicielOlLi5 = questionSelectionLogicielOlLi51;

	/**	L'entité « questionSelectionLogiciel »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSelectionLogiciel = new PageHtml();
	public Couverture<PageHtml> questionSelectionLogicielCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSelectionLogiciel").o(questionSelectionLogiciel);

	/**	<br/>L'entité « questionSelectionLogiciel »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSelectionLogiciel">Trouver l'entité questionSelectionLogiciel dans Solr</a>
	 * <br/>
	 * @param questionSelectionLogiciel est l'entité déjà construit. 
	 **/
	protected abstract void _questionSelectionLogiciel(PageHtml o);

	public PageHtml getQuestionSelectionLogiciel() {
		return questionSelectionLogiciel;
	}

	public void setQuestionSelectionLogiciel(PageHtml questionSelectionLogiciel) {
		this.questionSelectionLogiciel = questionSelectionLogiciel;
		this.questionSelectionLogicielCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionSelectionLogicielInit() {
		if(questionSelectionLogiciel != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionSelectionLogiciel, "questionSelectionLogiciel");
			((C001L004InstallerCentos7)this).avantPagePart(questionSelectionLogiciel, "questionSelectionLogiciel");
		}
		if(!questionSelectionLogicielCouverture.dejaInitialise) {
			_questionSelectionLogiciel(questionSelectionLogiciel);
		}
		questionSelectionLogiciel.initLoinPourClasse(requeteSite_);
		questionSelectionLogicielCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionSelectionLogiciel(PageHtml o) {
		{ e("h3").a("class", " questionSelectionLogicielH3 ").f();
			{ e("i").a("class", questionSelectionLogicielH3I1, " site-menu-icon questionSelectionLogicielH3I ").f();
			} g("i");
			{ e("span").a("class", " questionSelectionLogicielH3Span ").f();
				sx(questionSelectionLogicielH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionSelectionLogicielH4 ").f();
			{ e("i").a("class", questionSelectionLogicielH4I1, " site-menu-icon questionSelectionLogicielH4I ").f();
			} g("i");
			{ e("span").a("class", " questionSelectionLogicielH4Span ").f();
				sx(questionSelectionLogicielH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " questionSelectionLogicielOl ").f();
			{ e("li").a("class", " questionSelectionLogicielOlLi1 questionSelectionLogicielOlLi odd ").f();
				sx(questionSelectionLogicielOlLi11);
			} g("li");
			{ e("li").a("class", " questionSelectionLogicielOlLi2 questionSelectionLogicielOlLi even ").f();
				sx(questionSelectionLogicielOlLi21);
				sx(questionSelectionLogicielOlLi22);
				sx(questionSelectionLogicielOlLi23);
				sx(questionSelectionLogicielOlLi24);
			} g("li");
			{ e("li").a("class", " questionSelectionLogicielOlLi3 questionSelectionLogicielOlLi odd ").f();
				sx(questionSelectionLogicielOlLi31);
				sx(questionSelectionLogicielOlLi32);
			} g("li");
			{ e("li").a("class", " questionSelectionLogicielOlLi4 questionSelectionLogicielOlLi even ").f();
				sx(questionSelectionLogicielOlLi41);
			} g("li");
			{ e("li").a("class", " questionSelectionLogicielOlLi5 questionSelectionLogicielOlLi odd ").f();
				sx(questionSelectionLogicielOlLi51);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionSelectionLogiciel() {
		questionSelectionLogiciel.htmlAvant();
		htmlBodyQuestionSelectionLogiciel(questionSelectionLogiciel);
		questionSelectionLogiciel.htmlApres();
	}

	/////////////////////////////////////
	// questionInstallationDestination //
	/////////////////////////////////////

	public static final String questionInstallationDestinationH3I1 = "fas fa-hdd";
	public static final String questionInstallationDestinationH3I = questionInstallationDestinationH3I1;
	public static final String questionInstallationDestinationH3Span1 = "How do I setup the disk for the installation destination? ";
	public static final String questionInstallationDestinationH3Span = questionInstallationDestinationH3Span1;
	public static final String questionInstallationDestinationH4I1 = "fas fa-pallet-alt";
	public static final String questionInstallationDestinationH4I = questionInstallationDestinationH4I1;
	public static final String questionInstallationDestinationH4Span1 = "Configure your own partitioning. ";
	public static final String questionInstallationDestinationH4Span = questionInstallationDestinationH4Span1;
	public static final String questionInstallationDestinationOl1Li11 = "Now it's time to configure the primary disk for the operating system. ";
	public static final String questionInstallationDestinationOl1Li12 = "In the \"SYSTEM\" section, click \"INSTALLATION DESTINATION\". ";
	public static final String questionInstallationDestinationOl1Li1 = questionInstallationDestinationOl1Li11 + questionInstallationDestinationOl1Li12;
	public static final String questionInstallationDestinationOl1Li21 = "If your primary disk does not have a black and white checkmark icon, then you'll want to select the correct primary disk. ";
	public static final String questionInstallationDestinationOl1Li2 = questionInstallationDestinationOl1Li21;
	public static final String questionInstallationDestinationOl1Li31 = "Select \"I will configure partitioning.\". ";
	public static final String questionInstallationDestinationOl1Li32 = "You can also select other options like \"Encrypt my data\", but it's not necessary. ";
	public static final String questionInstallationDestinationOl1Li3 = questionInstallationDestinationOl1Li31 + questionInstallationDestinationOl1Li32;
	public static final String questionInstallationDestinationOl1Li41 = "Click [ Done ] to configure partitioning yourself. ";
	public static final String questionInstallationDestinationOl1Li4 = questionInstallationDestinationOl1Li41;
	public static final String questionInstallationDestinationDiv2H51 = "Instructions for an existing operating system on your disk. ";
	public static final String questionInstallationDestinationDiv2H5 = questionInstallationDestinationDiv2H51;
	public static final String questionInstallationDestinationOl2Li11 = "If you have an existing operating system on your disk, you will want to open the drop down for your operating system to redo the filesystem. ";
	public static final String questionInstallationDestinationOl2Li1 = questionInstallationDestinationOl2Li11;
	public static final String questionInstallationDestinationOl2Li21 = "Click on the first SYSTEM partition and click the [ - ] button. ";
	public static final String questionInstallationDestinationOl2Li2 = questionInstallationDestinationOl2Li21;
	public static final String questionInstallationDestinationOl2Li31 = "You can select \"Delete all file systems which are only used by ....\". ";
	public static final String questionInstallationDestinationOl2Li3 = questionInstallationDestinationOl2Li31;
	public static final String questionInstallationDestinationOl2Li41 = "Click [ Delete It ]. ";
	public static final String questionInstallationDestinationOl2Li4 = questionInstallationDestinationOl2Li41;
	public static final String questionInstallationDestinationDiv3H51 = "The best way to setup your disk for most situations. ";
	public static final String questionInstallationDestinationDiv3H5 = questionInstallationDestinationDiv3H51;
	public static final String questionInstallationDestinationOl3Li011 = "The easiest way is to get started is to click \"Click here to create them automatically.\". ";
	public static final String questionInstallationDestinationOl3Li012 = "If you are a disk expert, than you can ignore this section and do it your way. ";
	public static final String questionInstallationDestinationOl3Li013 = "But I'll recommend the best way to setup your disk for most situations. ";
	public static final String questionInstallationDestinationOl3Li01 = questionInstallationDestinationOl3Li011 + questionInstallationDestinationOl3Li012 + questionInstallationDestinationOl3Li013;
	public static final String questionInstallationDestinationOl3Li021 = "The automatic disk setup will create 4 partitions (/home, /boot, /, and swap). ";
	public static final String questionInstallationDestinationOl3Li022 = "You don't need a separate partition between / and /home, so I would delete the /home partition. ";
	public static final String questionInstallationDestinationOl3Li023 = "Click on the /home partition. ";
	public static final String questionInstallationDestinationOl3Li02 = questionInstallationDestinationOl3Li021 + questionInstallationDestinationOl3Li022 + questionInstallationDestinationOl3Li023;
	public static final String questionInstallationDestinationOl3Li031 = "Click the [ - ] button. ";
	public static final String questionInstallationDestinationOl3Li03 = questionInstallationDestinationOl3Li031;
	public static final String questionInstallationDestinationOl3Li041 = "Now the size of the /boot partition is up to you. ";
	public static final String questionInstallationDestinationOl3Li042 = "However, I recommend at least 2 GiB for your /boot partition. ";
	public static final String questionInstallationDestinationOl3Li043 = "This way, when you receive updated packages and security fixes, your /boot partition won't run out of space, at least not for many years I think. ";
	public static final String questionInstallationDestinationOl3Li044 = "So click on the /boot partition. ";
	public static final String questionInstallationDestinationOl3Li04 = questionInstallationDestinationOl3Li041 + questionInstallationDestinationOl3Li042 + questionInstallationDestinationOl3Li043 + questionInstallationDestinationOl3Li044;
	public static final String questionInstallationDestinationOl3Li051 = "Change the /boot partition \"Desired Capacity\" to \"2 GiB\". ";
	public static final String questionInstallationDestinationOl3Li05 = questionInstallationDestinationOl3Li051;
	public static final String questionInstallationDestinationOl3Li061 = "Now to decide how much swap space to reserve for memory. ";
	public static final String questionInstallationDestinationOl3Li062 = "Swap space is related to the amount of RAM you have installed in your system. ";
	public static final String questionInstallationDestinationOl3Li063 = "It's generally agreed that you don't need more swap space than double the amount of RAM in your system. ";
	public static final String questionInstallationDestinationOl3Li064 = "However, do consider the amount of RAM you will likely upgrade your system with someday to determine how much swap space to reserve. ";
	public static final String questionInstallationDestinationOl3Li065 = "This is because you won't be able to change it later without reinstalling the operating system either. ";
	public static final String questionInstallationDestinationOl3Li066 = "It's not the end of the world to reinstall your operating system, I seem to do it fairly often. ";
	public static final String questionInstallationDestinationOl3Li067 = "So to set the swap space, click on the swap partition. ";
	public static final String questionInstallationDestinationOl3Li06 = questionInstallationDestinationOl3Li061 + questionInstallationDestinationOl3Li062 + questionInstallationDestinationOl3Li063 + questionInstallationDestinationOl3Li064 + questionInstallationDestinationOl3Li065 + questionInstallationDestinationOl3Li066 + questionInstallationDestinationOl3Li067;
	public static final String questionInstallationDestinationOl3Li071 = "If I have 32 GiB of RAM in my system, I will set the amount of swap space to double that amount in \"Desired Capacity\": \"64 GiB\". ";
	public static final String questionInstallationDestinationOl3Li07 = questionInstallationDestinationOl3Li071;
	public static final String questionInstallationDestinationOl3Li081 = "Now let's max out the amount of space on the / partition. ";
	public static final String questionInstallationDestinationOl3Li08 = questionInstallationDestinationOl3Li081;
	public static final String questionInstallationDestinationOl3Li091 = "Click on the / partition. ";
	public static final String questionInstallationDestinationOl3Li09 = questionInstallationDestinationOl3Li091;
	public static final String questionInstallationDestinationOl3Li101 = "Clear any value from the \"Desired Capacity\" of the / partition. ";
	public static final String questionInstallationDestinationOl3Li10 = questionInstallationDestinationOl3Li101;
	public static final String questionInstallationDestinationOl3Li111 = "Now click on the /boot partition to see all of the values of all three partitions updated. ";
	public static final String questionInstallationDestinationOl3Li112 = "The amounts may have been converted to MiB instead of GiB, but you should see the right values you are expecting, with the / partition maxed out. ";
	public static final String questionInstallationDestinationOl3Li11 = questionInstallationDestinationOl3Li111 + questionInstallationDestinationOl3Li112;
	public static final String questionInstallationDestinationDiv4H51 = "If you are accidentally booted into \"UEFI\" mode. ";
	public static final String questionInstallationDestinationDiv4H5 = questionInstallationDestinationDiv4H51;
	public static final String questionInstallationDestinationOl4Li11 = "If you are accidentally booted into your USB Centos 7 Installer in \"UEFI\" mode, you will see an extra /boot/efi paritition. ";
	public static final String questionInstallationDestinationOl4Li12 = "The installer will assume that you need a /boot/efi partition, which you don't. ";
	public static final String questionInstallationDestinationOl4Li13 = "Proceeding with the /boot/efi paritition and removing the install media will make your system unstable and crash. ";
	public static final String questionInstallationDestinationOl4Li14 = "So avoid installing the operating system in UEFI mode. ";
	public static final String questionInstallationDestinationOl4Li1 = questionInstallationDestinationOl4Li11 + questionInstallationDestinationOl4Li12 + questionInstallationDestinationOl4Li13 + questionInstallationDestinationOl4Li14;
	public static final String questionInstallationDestinationOl4Li21 = "Click [ Done ]. ";
	public static final String questionInstallationDestinationOl4Li2 = questionInstallationDestinationOl4Li21;
	public static final String questionInstallationDestinationOl4Li31 = "Click [ Accept the changes ]. ";
	public static final String questionInstallationDestinationOl4Li3 = questionInstallationDestinationOl4Li31;

	/**	L'entité « questionInstallationDestination »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionInstallationDestination = new PageHtml();
	public Couverture<PageHtml> questionInstallationDestinationCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionInstallationDestination").o(questionInstallationDestination);

	/**	<br/>L'entité « questionInstallationDestination »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionInstallationDestination">Trouver l'entité questionInstallationDestination dans Solr</a>
	 * <br/>
	 * @param questionInstallationDestination est l'entité déjà construit. 
	 **/
	protected abstract void _questionInstallationDestination(PageHtml o);

	public PageHtml getQuestionInstallationDestination() {
		return questionInstallationDestination;
	}

	public void setQuestionInstallationDestination(PageHtml questionInstallationDestination) {
		this.questionInstallationDestination = questionInstallationDestination;
		this.questionInstallationDestinationCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionInstallationDestinationInit() {
		if(questionInstallationDestination != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionInstallationDestination, "questionInstallationDestination");
			((C001L004InstallerCentos7)this).avantPagePart(questionInstallationDestination, "questionInstallationDestination");
		}
		if(!questionInstallationDestinationCouverture.dejaInitialise) {
			_questionInstallationDestination(questionInstallationDestination);
		}
		questionInstallationDestination.initLoinPourClasse(requeteSite_);
		questionInstallationDestinationCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionInstallationDestination(PageHtml o) {
		{ e("h3").a("class", " questionInstallationDestinationH3 ").f();
			{ e("i").a("class", questionInstallationDestinationH3I1, " site-menu-icon questionInstallationDestinationH3I ").f();
			} g("i");
			{ e("span").a("class", " questionInstallationDestinationH3Span ").f();
				sx(questionInstallationDestinationH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionInstallationDestinationH4 ").f();
			{ e("i").a("class", questionInstallationDestinationH4I1, " site-menu-icon questionInstallationDestinationH4I ").f();
			} g("i");
			{ e("span").a("class", " questionInstallationDestinationH4Span ").f();
				sx(questionInstallationDestinationH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " questionInstallationDestinationOl1 questionInstallationDestinationOl odd ").f();
			{ e("li").a("class", " questionInstallationDestinationOl1Li1 questionInstallationDestinationOl1Li odd ").f();
				sx(questionInstallationDestinationOl1Li11);
				sx(questionInstallationDestinationOl1Li12);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl1Li2 questionInstallationDestinationOl1Li even ").f();
				sx(questionInstallationDestinationOl1Li21);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl1Li3 questionInstallationDestinationOl1Li odd ").f();
				sx(questionInstallationDestinationOl1Li31);
				sx(questionInstallationDestinationOl1Li32);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl1Li4 questionInstallationDestinationOl1Li even ").f();
				sx(questionInstallationDestinationOl1Li41);
			} g("li");
		} g("ol");
		{ e("div").a("class", " questionInstallationDestinationDiv2 questionInstallationDestinationDiv even ").f();
			{ e("h5").a("class", " questionInstallationDestinationDiv2H5 ").f();
				sx(questionInstallationDestinationDiv2H51);
			} g("h5");
		} g("div");
		{ e("ol").a("class", " questionInstallationDestinationOl2 questionInstallationDestinationOl even ").f();
			{ e("li").a("class", " questionInstallationDestinationOl2Li1 questionInstallationDestinationOl2Li odd ").f();
				sx(questionInstallationDestinationOl2Li11);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl2Li2 questionInstallationDestinationOl2Li even ").f();
				sx(questionInstallationDestinationOl2Li21);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl2Li3 questionInstallationDestinationOl2Li odd ").f();
				sx(questionInstallationDestinationOl2Li31);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl2Li4 questionInstallationDestinationOl2Li even ").f();
				sx(questionInstallationDestinationOl2Li41);
			} g("li");
		} g("ol");
		{ e("div").a("class", " questionInstallationDestinationDiv3 questionInstallationDestinationDiv odd ").f();
			{ e("h5").a("class", " questionInstallationDestinationDiv3H5 ").f();
				sx(questionInstallationDestinationDiv3H51);
			} g("h5");
		} g("div");
		{ e("ol").a("class", " questionInstallationDestinationOl3 questionInstallationDestinationOl odd ").f();
			{ e("li").a("class", " questionInstallationDestinationOl3Li01 questionInstallationDestinationOl3Li odd ").f();
				sx(questionInstallationDestinationOl3Li011);
				sx(questionInstallationDestinationOl3Li012);
				sx(questionInstallationDestinationOl3Li013);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl3Li02 questionInstallationDestinationOl3Li even ").f();
				sx(questionInstallationDestinationOl3Li021);
				sx(questionInstallationDestinationOl3Li022);
				sx(questionInstallationDestinationOl3Li023);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl3Li03 questionInstallationDestinationOl3Li odd ").f();
				sx(questionInstallationDestinationOl3Li031);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl3Li04 questionInstallationDestinationOl3Li even ").f();
				sx(questionInstallationDestinationOl3Li041);
				sx(questionInstallationDestinationOl3Li042);
				sx(questionInstallationDestinationOl3Li043);
				sx(questionInstallationDestinationOl3Li044);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl3Li05 questionInstallationDestinationOl3Li odd ").f();
				sx(questionInstallationDestinationOl3Li051);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl3Li06 questionInstallationDestinationOl3Li even ").f();
				sx(questionInstallationDestinationOl3Li061);
				sx(questionInstallationDestinationOl3Li062);
				sx(questionInstallationDestinationOl3Li063);
				sx(questionInstallationDestinationOl3Li064);
				sx(questionInstallationDestinationOl3Li065);
				sx(questionInstallationDestinationOl3Li066);
				sx(questionInstallationDestinationOl3Li067);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl3Li07 questionInstallationDestinationOl3Li odd ").f();
				sx(questionInstallationDestinationOl3Li071);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl3Li08 questionInstallationDestinationOl3Li even ").f();
				sx(questionInstallationDestinationOl3Li081);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl3Li09 questionInstallationDestinationOl3Li odd ").f();
				sx(questionInstallationDestinationOl3Li091);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl3Li10 questionInstallationDestinationOl3Li even ").f();
				sx(questionInstallationDestinationOl3Li101);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl3Li11 questionInstallationDestinationOl3Li odd ").f();
				sx(questionInstallationDestinationOl3Li111);
				sx(questionInstallationDestinationOl3Li112);
			} g("li");
		} g("ol");
		{ e("div").a("class", " questionInstallationDestinationDiv4 questionInstallationDestinationDiv even ").f();
			{ e("h5").a("class", " questionInstallationDestinationDiv4H5 ").f();
				sx(questionInstallationDestinationDiv4H51);
			} g("h5");
		} g("div");
		{ e("ol").a("class", " questionInstallationDestinationOl4 questionInstallationDestinationOl even ").f();
			{ e("li").a("class", " questionInstallationDestinationOl4Li1 questionInstallationDestinationOl4Li odd ").f();
				sx(questionInstallationDestinationOl4Li11);
				sx(questionInstallationDestinationOl4Li12);
				sx(questionInstallationDestinationOl4Li13);
				sx(questionInstallationDestinationOl4Li14);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl4Li2 questionInstallationDestinationOl4Li even ").f();
				sx(questionInstallationDestinationOl4Li21);
			} g("li");
			{ e("li").a("class", " questionInstallationDestinationOl4Li3 questionInstallationDestinationOl4Li odd ").f();
				sx(questionInstallationDestinationOl4Li31);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionInstallationDestination() {
		questionInstallationDestination.htmlAvant();
		htmlBodyQuestionInstallationDestination(questionInstallationDestination);
		questionInstallationDestination.htmlApres();
	}

	///////////////////////
	// questionInstaller //
	///////////////////////

	public static final String questionInstallerH3I1 = "fas fa-exclamation-triangle";
	public static final String questionInstallerH3I = questionInstallerH3I1;
	public static final String questionInstallerH3Span1 = "Am I ready to push the [ Begin Installation ] button? ";
	public static final String questionInstallerH3Span = questionInstallerH3Span1;
	public static final String questionInstallerH4I1 = "fab fa-centos";
	public static final String questionInstallerH4I = questionInstallerH4I1;
	public static final String questionInstallerH4Span1 = "Welcome the wonderful world of CentOS 7. ";
	public static final String questionInstallerH4Span = questionInstallerH4Span1;
	public static final String questionInstallerOlLi11 = "You are about to install the wonderful world of CentOS 7. ";
	public static final String questionInstallerOlLi12 = "Relax, you're going to love it, just like thousands of others around the world. ";
	public static final String questionInstallerOlLi13 = "So go ahead and push the [ Begin Installation ] button. ";
	public static final String questionInstallerOlLi1 = questionInstallerOlLi11 + questionInstallerOlLi12 + questionInstallerOlLi13;

	/**	L'entité « questionInstaller »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionInstaller = new PageHtml();
	public Couverture<PageHtml> questionInstallerCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionInstaller").o(questionInstaller);

	/**	<br/>L'entité « questionInstaller »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionInstaller">Trouver l'entité questionInstaller dans Solr</a>
	 * <br/>
	 * @param questionInstaller est l'entité déjà construit. 
	 **/
	protected abstract void _questionInstaller(PageHtml o);

	public PageHtml getQuestionInstaller() {
		return questionInstaller;
	}

	public void setQuestionInstaller(PageHtml questionInstaller) {
		this.questionInstaller = questionInstaller;
		this.questionInstallerCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionInstallerInit() {
		if(questionInstaller != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionInstaller, "questionInstaller");
			((C001L004InstallerCentos7)this).avantPagePart(questionInstaller, "questionInstaller");
		}
		if(!questionInstallerCouverture.dejaInitialise) {
			_questionInstaller(questionInstaller);
		}
		questionInstaller.initLoinPourClasse(requeteSite_);
		questionInstallerCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionInstaller(PageHtml o) {
		{ e("h3").a("class", " questionInstallerH3 ").f();
			{ e("i").a("class", questionInstallerH3I1, " site-menu-icon questionInstallerH3I ").f();
			} g("i");
			{ e("span").a("class", " questionInstallerH3Span ").f();
				sx(questionInstallerH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionInstallerH4 ").f();
			{ e("i").a("class", questionInstallerH4I1, " site-menu-icon questionInstallerH4I ").f();
			} g("i");
			{ e("span").a("class", " questionInstallerH4Span ").f();
				sx(questionInstallerH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " questionInstallerOl ").f();
			{ e("li").a("class", " questionInstallerOlLi1 questionInstallerOlLi odd ").f();
				sx(questionInstallerOlLi11);
				sx(questionInstallerOlLi12);
				sx(questionInstallerOlLi13);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionInstaller() {
		questionInstaller.htmlAvant();
		htmlBodyQuestionInstaller(questionInstaller);
		questionInstaller.htmlApres();
	}

	/////////////////////////
	// questionMotsDePasse //
	/////////////////////////

	public static final String questionMotsDePasseH3I1 = "fas fa-user-cog";
	public static final String questionMotsDePasseH3I = questionMotsDePasseH3I1;
	public static final String questionMotsDePasseH3Span1 = "Do I need a root password and a user password? ";
	public static final String questionMotsDePasseH3Span = questionMotsDePasseH3Span1;
	public static final String questionMotsDePasseH4I1 = "fas fa-lock-alt";
	public static final String questionMotsDePasseH4I = questionMotsDePasseH4I1;
	public static final String questionMotsDePasseH4Span1 = "Choose a string root password. ";
	public static final String questionMotsDePasseH4Span = questionMotsDePasseH4Span1;
	public static final String questionMotsDePasseOlLi11 = "It's important to choose a strong root password. ";
	public static final String questionMotsDePasseOlLi12 = "This will be an administrative account that can be logged into to do anything at all. ";
	public static final String questionMotsDePasseOlLi13 = "Click on \"ROOT PASSWORD\". ";
	public static final String questionMotsDePasseOlLi1 = questionMotsDePasseOlLi11 + questionMotsDePasseOlLi12 + questionMotsDePasseOlLi13;
	public static final String questionMotsDePasseOlLi21 = "So come up with, or generate a strong root password and type it twice in the boxes. ";
	public static final String questionMotsDePasseOlLi22 = "Write it down carefully for later, or store it in an encrypted password safe if possible. ";
	public static final String questionMotsDePasseOlLi23 = "I'll tell you more about password safes in another lesson. ";
	public static final String questionMotsDePasseOlLi24 = "Click [ Done ]. ";
	public static final String questionMotsDePasseOlLi2 = questionMotsDePasseOlLi21 + questionMotsDePasseOlLi22 + questionMotsDePasseOlLi23 + questionMotsDePasseOlLi24;
	public static final String questionMotsDePasseOlLi31 = "Click on \"USER CREATION\". ";
	public static final String questionMotsDePasseOlLi32 = "Write the first name, last name and username that you want. ";
	public static final String questionMotsDePasseOlLi33 = "Check \"Make this user an administrator\". ";
	public static final String questionMotsDePasseOlLi34 = "It's important to choose a strong user password. ";
	public static final String questionMotsDePasseOlLi35 = "Click [ Done ]. ";
	public static final String questionMotsDePasseOlLi3 = questionMotsDePasseOlLi31 + questionMotsDePasseOlLi32 + questionMotsDePasseOlLi33 + questionMotsDePasseOlLi34 + questionMotsDePasseOlLi35;

	/**	L'entité « questionMotsDePasse »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMotsDePasse = new PageHtml();
	public Couverture<PageHtml> questionMotsDePasseCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMotsDePasse").o(questionMotsDePasse);

	/**	<br/>L'entité « questionMotsDePasse »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionMotsDePasse">Trouver l'entité questionMotsDePasse dans Solr</a>
	 * <br/>
	 * @param questionMotsDePasse est l'entité déjà construit. 
	 **/
	protected abstract void _questionMotsDePasse(PageHtml o);

	public PageHtml getQuestionMotsDePasse() {
		return questionMotsDePasse;
	}

	public void setQuestionMotsDePasse(PageHtml questionMotsDePasse) {
		this.questionMotsDePasse = questionMotsDePasse;
		this.questionMotsDePasseCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionMotsDePasseInit() {
		if(questionMotsDePasse != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionMotsDePasse, "questionMotsDePasse");
			((C001L004InstallerCentos7)this).avantPagePart(questionMotsDePasse, "questionMotsDePasse");
		}
		if(!questionMotsDePasseCouverture.dejaInitialise) {
			_questionMotsDePasse(questionMotsDePasse);
		}
		questionMotsDePasse.initLoinPourClasse(requeteSite_);
		questionMotsDePasseCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionMotsDePasse(PageHtml o) {
		{ e("h3").a("class", " questionMotsDePasseH3 ").f();
			{ e("i").a("class", questionMotsDePasseH3I1, " site-menu-icon questionMotsDePasseH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMotsDePasseH3Span ").f();
				sx(questionMotsDePasseH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMotsDePasseH4 ").f();
			{ e("i").a("class", questionMotsDePasseH4I1, " site-menu-icon questionMotsDePasseH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMotsDePasseH4Span ").f();
				sx(questionMotsDePasseH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " questionMotsDePasseOl ").f();
			{ e("li").a("class", " questionMotsDePasseOlLi1 questionMotsDePasseOlLi odd ").f();
				sx(questionMotsDePasseOlLi11);
				sx(questionMotsDePasseOlLi12);
				sx(questionMotsDePasseOlLi13);
			} g("li");
			{ e("li").a("class", " questionMotsDePasseOlLi2 questionMotsDePasseOlLi even ").f();
				sx(questionMotsDePasseOlLi21);
				sx(questionMotsDePasseOlLi22);
				sx(questionMotsDePasseOlLi23);
				sx(questionMotsDePasseOlLi24);
			} g("li");
			{ e("li").a("class", " questionMotsDePasseOlLi3 questionMotsDePasseOlLi odd ").f();
				sx(questionMotsDePasseOlLi31);
				sx(questionMotsDePasseOlLi32);
				sx(questionMotsDePasseOlLi33);
				sx(questionMotsDePasseOlLi34);
				sx(questionMotsDePasseOlLi35);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMotsDePasse() {
		questionMotsDePasse.htmlAvant();
		htmlBodyQuestionMotsDePasse(questionMotsDePasse);
		questionMotsDePasse.htmlApres();
	}

	///////////////////////////////////
	// questionConfigurationInitiale //
	///////////////////////////////////

	public static final String questionConfigurationInitialeH3I1 = "fas fa-fast-forward";
	public static final String questionConfigurationInitialeH3I = questionConfigurationInitialeH3I1;
	public static final String questionConfigurationInitialeH3Span1 = "How do I finish the install of CentOS 7? ";
	public static final String questionConfigurationInitialeH3Span = questionConfigurationInitialeH3Span1;
	public static final String questionConfigurationInitialeH4I1 = "fab fa-linux";
	public static final String questionConfigurationInitialeH4I = questionConfigurationInitialeH4I1;
	public static final String questionConfigurationInitialeH4Span1 = "A few more steps to enjoy your new computer. ";
	public static final String questionConfigurationInitialeH4Span = questionConfigurationInitialeH4Span1;
	public static final String questionConfigurationInitialeOlLi011 = "When it's done, you can click [ Reboot ]. ";
	public static final String questionConfigurationInitialeOlLi01 = questionConfigurationInitialeOlLi011;
	public static final String questionConfigurationInitialeOlLi021 = "Don't forget to take out the USB disk at the same time, or you will boot back into the installer. ";
	public static final String questionConfigurationInitialeOlLi02 = questionConfigurationInitialeOlLi021;
	public static final String questionConfigurationInitialeOlLi031 = "When you boot into CentOS 7 for the first time, you will be asked to accept the License Information. ";
	public static final String questionConfigurationInitialeOlLi032 = "Click on \"LICENCE AGREEMENT\". ";
	public static final String questionConfigurationInitialeOlLi03 = questionConfigurationInitialeOlLi031 + questionConfigurationInitialeOlLi032;
	public static final String questionConfigurationInitialeOlLi041 = "Review the license agreement and then check \"I accept the license agreement\". ";
	public static final String questionConfigurationInitialeOlLi04 = questionConfigurationInitialeOlLi041;
	public static final String questionConfigurationInitialeOlLi051 = "Click [ Done ]. ";
	public static final String questionConfigurationInitialeOlLi05 = questionConfigurationInitialeOlLi051;
	public static final String questionConfigurationInitialeOlLi061 = "Now click [ FINISH CONFIGURATION ] in the bottom-right corner. ";
	public static final String questionConfigurationInitialeOlLi06 = questionConfigurationInitialeOlLi061;
	public static final String questionConfigurationInitialeOlLi071 = "You can now sign into your user account by clicking on your username and entering your password. ";
	public static final String questionConfigurationInitialeOlLi07 = questionConfigurationInitialeOlLi071;
	public static final String questionConfigurationInitialeOlLi081 = "Follow the welcome screen by clicking [ Next ] for your language. ";
	public static final String questionConfigurationInitialeOlLi08 = questionConfigurationInitialeOlLi081;
	public static final String questionConfigurationInitialeOlLi091 = "Click [ Next ] for your keyboard layout. ";
	public static final String questionConfigurationInitialeOlLi09 = questionConfigurationInitialeOlLi091;
	public static final String questionConfigurationInitialeOlLi101 = "Turn off \"Location Services\", since you don't need anybody tracking your location. ";
	public static final String questionConfigurationInitialeOlLi10 = questionConfigurationInitialeOlLi101;
	public static final String questionConfigurationInitialeOlLi111 = "Click [ Next ] to turn off location services. ";
	public static final String questionConfigurationInitialeOlLi11 = questionConfigurationInitialeOlLi111;
	public static final String questionConfigurationInitialeOlLi121 = "And I skip the online accounts by clicking [ Skip ]. ";
	public static final String questionConfigurationInitialeOlLi12 = questionConfigurationInitialeOlLi121;
	public static final String questionConfigurationInitialeOlLi131 = "Now click [ Start using CentOS Linux ] to enjoy your new computer! ";
	public static final String questionConfigurationInitialeOlLi13 = questionConfigurationInitialeOlLi131;

	/**	L'entité « questionConfigurationInitiale »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionConfigurationInitiale = new PageHtml();
	public Couverture<PageHtml> questionConfigurationInitialeCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionConfigurationInitiale").o(questionConfigurationInitiale);

	/**	<br/>L'entité « questionConfigurationInitiale »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionConfigurationInitiale">Trouver l'entité questionConfigurationInitiale dans Solr</a>
	 * <br/>
	 * @param questionConfigurationInitiale est l'entité déjà construit. 
	 **/
	protected abstract void _questionConfigurationInitiale(PageHtml o);

	public PageHtml getQuestionConfigurationInitiale() {
		return questionConfigurationInitiale;
	}

	public void setQuestionConfigurationInitiale(PageHtml questionConfigurationInitiale) {
		this.questionConfigurationInitiale = questionConfigurationInitiale;
		this.questionConfigurationInitialeCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionConfigurationInitialeInit() {
		if(questionConfigurationInitiale != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionConfigurationInitiale, "questionConfigurationInitiale");
			((C001L004InstallerCentos7)this).avantPagePart(questionConfigurationInitiale, "questionConfigurationInitiale");
		}
		if(!questionConfigurationInitialeCouverture.dejaInitialise) {
			_questionConfigurationInitiale(questionConfigurationInitiale);
		}
		questionConfigurationInitiale.initLoinPourClasse(requeteSite_);
		questionConfigurationInitialeCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionConfigurationInitiale(PageHtml o) {
		{ e("h3").a("class", " questionConfigurationInitialeH3 ").f();
			{ e("i").a("class", questionConfigurationInitialeH3I1, " site-menu-icon questionConfigurationInitialeH3I ").f();
			} g("i");
			{ e("span").a("class", " questionConfigurationInitialeH3Span ").f();
				sx(questionConfigurationInitialeH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionConfigurationInitialeH4 ").f();
			{ e("i").a("class", questionConfigurationInitialeH4I1, " site-menu-icon questionConfigurationInitialeH4I ").f();
			} g("i");
			{ e("span").a("class", " questionConfigurationInitialeH4Span ").f();
				sx(questionConfigurationInitialeH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " questionConfigurationInitialeOl ").f();
			{ e("li").a("class", " questionConfigurationInitialeOlLi01 questionConfigurationInitialeOlLi odd ").f();
				sx(questionConfigurationInitialeOlLi011);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi02 questionConfigurationInitialeOlLi even ").f();
				sx(questionConfigurationInitialeOlLi021);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi03 questionConfigurationInitialeOlLi odd ").f();
				sx(questionConfigurationInitialeOlLi031);
				sx(questionConfigurationInitialeOlLi032);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi04 questionConfigurationInitialeOlLi even ").f();
				sx(questionConfigurationInitialeOlLi041);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi05 questionConfigurationInitialeOlLi odd ").f();
				sx(questionConfigurationInitialeOlLi051);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi06 questionConfigurationInitialeOlLi even ").f();
				sx(questionConfigurationInitialeOlLi061);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi07 questionConfigurationInitialeOlLi odd ").f();
				sx(questionConfigurationInitialeOlLi071);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi08 questionConfigurationInitialeOlLi even ").f();
				sx(questionConfigurationInitialeOlLi081);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi09 questionConfigurationInitialeOlLi odd ").f();
				sx(questionConfigurationInitialeOlLi091);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi10 questionConfigurationInitialeOlLi even ").f();
				sx(questionConfigurationInitialeOlLi101);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi11 questionConfigurationInitialeOlLi odd ").f();
				sx(questionConfigurationInitialeOlLi111);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi12 questionConfigurationInitialeOlLi even ").f();
				sx(questionConfigurationInitialeOlLi121);
			} g("li");
			{ e("li").a("class", " questionConfigurationInitialeOlLi13 questionConfigurationInitialeOlLi odd ").f();
				sx(questionConfigurationInitialeOlLi131);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionConfigurationInitiale() {
		questionConfigurationInitiale.htmlAvant();
		htmlBodyQuestionConfigurationInitiale(questionConfigurationInitiale);
		questionConfigurationInitiale.htmlApres();
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
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
	protected C001L004InstallerCentos7 recapituler1Init() {
		if(recapituler1 != null) {
			((C001L004InstallerCentos7)this).avantPagePart(recapituler1, "recapituler1");
			((C001L004InstallerCentos7)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
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
	public static final String recapituler2TableTr1Td3I1 = "far fa-network-wired";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "far fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "April 30 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "How do I install the operating system to start developing my website? ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "Every step to install the CentOS 7 operating system. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
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
	protected C001L004InstallerCentos7 recapituler2Init() {
		if(recapituler2 != null) {
			((C001L004InstallerCentos7)this).avantPagePart(recapituler2, "recapituler2");
			((C001L004InstallerCentos7)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
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
	public static final String recapituler3TableTr02Td1I1 = "far fa-person-carry";
	public static final String recapituler3TableTr02Td1I = recapituler3TableTr02Td1I1;
	public static final String recapituler3TableTr02Td21 = "How do I download CentOS 7? ";
	public static final String recapituler3TableTr02Td2 = recapituler3TableTr02Td21;
	public static final String recapituler3TableTr02Td3Span1I1 = "far fa-cloud-download-alt";
	public static final String recapituler3TableTr02Td3Span1I = recapituler3TableTr02Td3Span1I1;
	public static final String recapituler3TableTr02Td41 = "Download an ISO file. ";
	public static final String recapituler3TableTr02Td4 = recapituler3TableTr02Td41;
	public static final String recapituler3TableTr03Td1I1 = "fab fa-usb";
	public static final String recapituler3TableTr03Td1I = recapituler3TableTr03Td1I1;
	public static final String recapituler3TableTr03Td21 = "How can I create a USB key with CentOS 7? ";
	public static final String recapituler3TableTr03Td2 = recapituler3TableTr03Td21;
	public static final String recapituler3TableTr03Td3I1 = "far fa-compact-disc";
	public static final String recapituler3TableTr03Td3I = recapituler3TableTr03Td3I1;
	public static final String recapituler3TableTr03Td41 = "Use the dd command. ";
	public static final String recapituler3TableTr03Td4 = recapituler3TableTr03Td41;
	public static final String recapituler3TableTr04Td1I1 = "far fa-play-circle";
	public static final String recapituler3TableTr04Td1I = recapituler3TableTr04Td1I1;
	public static final String recapituler3TableTr04Td21 = "When I reboot with the USB key, which boot mode do I choose? ";
	public static final String recapituler3TableTr04Td2 = recapituler3TableTr04Td21;
	public static final String recapituler3TableTr04Td3Span1I1 = "fab fa-windows";
	public static final String recapituler3TableTr04Td3Span1I2 = "fab fa-centos";
	public static final String recapituler3TableTr04Td3Span1I = recapituler3TableTr04Td3Span1I1 + recapituler3TableTr04Td3Span1I2;
	public static final String recapituler3TableTr04Td41 = "Avoid booting in UEFI boot mode. ";
	public static final String recapituler3TableTr04Td4 = recapituler3TableTr04Td41;
	public static final String recapituler3TableTr05Td1I1 = "fas fa-flag-alt";
	public static final String recapituler3TableTr05Td1I = recapituler3TableTr05Td1I1;
	public static final String recapituler3TableTr05Td21 = "What language would I use during the install process? ";
	public static final String recapituler3TableTr05Td2 = recapituler3TableTr05Td21;
	public static final String recapituler3TableTr05Td3I1 = "far fa-language";
	public static final String recapituler3TableTr05Td3I = recapituler3TableTr05Td3I1;
	public static final String recapituler3TableTr05Td41 = "Choose the language you are comfortable with. ";
	public static final String recapituler3TableTr05Td4 = recapituler3TableTr05Td41;
	public static final String recapituler3TableTr06Td1I1 = "fas fa-clock";
	public static final String recapituler3TableTr06Td1I = recapituler3TableTr06Td1I1;
	public static final String recapituler3TableTr06Td21 = "How do I setup the date and time for a CentOS 7 installation? ";
	public static final String recapituler3TableTr06Td2 = recapituler3TableTr06Td21;
	public static final String recapituler3TableTr06Td3I1 = "fas fa-city";
	public static final String recapituler3TableTr06Td3I = recapituler3TableTr06Td3I1;
	public static final String recapituler3TableTr06Td41 = "Choose the big city near you. ";
	public static final String recapituler3TableTr06Td4 = recapituler3TableTr06Td41;
	public static final String recapituler3TableTr07Td1I1 = "fas fa-network-wired";
	public static final String recapituler3TableTr07Td1I = recapituler3TableTr07Td1I1;
	public static final String recapituler3TableTr07Td21 = "How do I setup the network and host name? ";
	public static final String recapituler3TableTr07Td2 = recapituler3TableTr07Td21;
	public static final String recapituler3TableTr07Td3I1 = "fas fa-ethernet";
	public static final String recapituler3TableTr07Td3I = recapituler3TableTr07Td3I1;
	public static final String recapituler3TableTr07Td41 = "Pick a unique name on your network and plug in your Ethernet cable. ";
	public static final String recapituler3TableTr07Td4 = recapituler3TableTr07Td41;
	public static final String recapituler3TableTr08Td1I1 = "fas fa-save";
	public static final String recapituler3TableTr08Td1I = recapituler3TableTr08Td1I1;
	public static final String recapituler3TableTr08Td21 = "What should I choose for the software selection in a CentOS 7 installation? ";
	public static final String recapituler3TableTr08Td2 = recapituler3TableTr08Td21;
	public static final String recapituler3TableTr08Td3I1 = "fas fa-browser";
	public static final String recapituler3TableTr08Td3I = recapituler3TableTr08Td3I1;
	public static final String recapituler3TableTr08Td41 = "Make sure to pick a desktop environment. ";
	public static final String recapituler3TableTr08Td4 = recapituler3TableTr08Td41;
	public static final String recapituler3TableTr09Td1I1 = "fas fa-hdd";
	public static final String recapituler3TableTr09Td1I = recapituler3TableTr09Td1I1;
	public static final String recapituler3TableTr09Td21 = "How do I setup the disk for the installation destination? ";
	public static final String recapituler3TableTr09Td2 = recapituler3TableTr09Td21;
	public static final String recapituler3TableTr09Td3I1 = "fas fa-pallet-alt";
	public static final String recapituler3TableTr09Td3I = recapituler3TableTr09Td3I1;
	public static final String recapituler3TableTr09Td41 = "Configure your own partitioning. ";
	public static final String recapituler3TableTr09Td4 = recapituler3TableTr09Td41;
	public static final String recapituler3TableTr10Td1I1 = "fas fa-exclamation-triangle";
	public static final String recapituler3TableTr10Td1I = recapituler3TableTr10Td1I1;
	public static final String recapituler3TableTr10Td21 = "Am I ready to push the [ Begin Installation ] button? ";
	public static final String recapituler3TableTr10Td2 = recapituler3TableTr10Td21;
	public static final String recapituler3TableTr10Td3I1 = "fab fa-centos";
	public static final String recapituler3TableTr10Td3I = recapituler3TableTr10Td3I1;
	public static final String recapituler3TableTr10Td41 = "Welcome the wonderful world of CentOS 7. ";
	public static final String recapituler3TableTr10Td4 = recapituler3TableTr10Td41;
	public static final String recapituler3TableTr11Td1I1 = "fas fa-user-cog";
	public static final String recapituler3TableTr11Td1I = recapituler3TableTr11Td1I1;
	public static final String recapituler3TableTr11Td21 = "Do I need a root password and a user password? ";
	public static final String recapituler3TableTr11Td2 = recapituler3TableTr11Td21;
	public static final String recapituler3TableTr11Td3I1 = "fas fa-lock-alt";
	public static final String recapituler3TableTr11Td3I = recapituler3TableTr11Td3I1;
	public static final String recapituler3TableTr11Td41 = "Choose a string root password. ";
	public static final String recapituler3TableTr11Td4 = recapituler3TableTr11Td41;
	public static final String recapituler3TableTr12Td1I1 = "fas fa-fast-forward";
	public static final String recapituler3TableTr12Td1I = recapituler3TableTr12Td1I1;
	public static final String recapituler3TableTr12Td21 = "How do I finish the install of CentOS 7? ";
	public static final String recapituler3TableTr12Td2 = recapituler3TableTr12Td21;
	public static final String recapituler3TableTr12Td3I1 = "fab fa-linux";
	public static final String recapituler3TableTr12Td3I = recapituler3TableTr12Td3I1;
	public static final String recapituler3TableTr12Td41 = "A few more steps to enjoy your new computer. ";
	public static final String recapituler3TableTr12Td4 = recapituler3TableTr12Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
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
	protected C001L004InstallerCentos7 recapituler3Init() {
		if(recapituler3 != null) {
			((C001L004InstallerCentos7)this).avantPagePart(recapituler3, "recapituler3");
			((C001L004InstallerCentos7)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
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

	protected boolean dejaInitialiseC001L004InstallerCentos7 = false;

	public C001L004InstallerCentos7 initLoinC001L004InstallerCentos7(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L004InstallerCentos7) {
			dejaInitialiseC001L004InstallerCentos7 = true;
			initLoinC001L004InstallerCentos7();
		}
		return (C001L004InstallerCentos7)this;
	}

	public void initLoinC001L004InstallerCentos7() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L004InstallerCentos7();
	}

	public void initC001L004InstallerCentos7() {
		moiInit();
		questionTelechargerCentos7Init();
		questionCreerUneCleUsbInit();
		questionDemarrerSystemSurCleUsbInit();
		questionChoisirLangueInit();
		questionDateHeureInit();
		questionReseauInit();
		questionSelectionLogicielInit();
		questionInstallationDestinationInit();
		questionInstallerInit();
		questionMotsDePasseInit();
		questionConfigurationInitialeInit();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L004InstallerCentos7(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L004InstallerCentos7(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(questionTelechargerCentos7 != null)
			questionTelechargerCentos7.setRequeteSite_(requeteSite_);
		if(questionCreerUneCleUsb != null)
			questionCreerUneCleUsb.setRequeteSite_(requeteSite_);
		if(questionDemarrerSystemSurCleUsb != null)
			questionDemarrerSystemSurCleUsb.setRequeteSite_(requeteSite_);
		if(questionChoisirLangue != null)
			questionChoisirLangue.setRequeteSite_(requeteSite_);
		if(questionDateHeure != null)
			questionDateHeure.setRequeteSite_(requeteSite_);
		if(questionReseau != null)
			questionReseau.setRequeteSite_(requeteSite_);
		if(questionSelectionLogiciel != null)
			questionSelectionLogiciel.setRequeteSite_(requeteSite_);
		if(questionInstallationDestination != null)
			questionInstallationDestination.setRequeteSite_(requeteSite_);
		if(questionInstaller != null)
			questionInstaller.setRequeteSite_(requeteSite_);
		if(questionMotsDePasse != null)
			questionMotsDePasse.setRequeteSite_(requeteSite_);
		if(questionConfigurationInitiale != null)
			questionConfigurationInitiale.setRequeteSite_(requeteSite_);
		if(recapituler1 != null)
			recapituler1.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L004InstallerCentos7(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L004InstallerCentos7(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L004InstallerCentos7(String var) {
		C001L004InstallerCentos7 oC001L004InstallerCentos7 = (C001L004InstallerCentos7)this;
		switch(var) {
			case "moi":
				return oC001L004InstallerCentos7.moi;
			case "questionTelechargerCentos7":
				return oC001L004InstallerCentos7.questionTelechargerCentos7;
			case "questionCreerUneCleUsb":
				return oC001L004InstallerCentos7.questionCreerUneCleUsb;
			case "questionDemarrerSystemSurCleUsb":
				return oC001L004InstallerCentos7.questionDemarrerSystemSurCleUsb;
			case "questionChoisirLangue":
				return oC001L004InstallerCentos7.questionChoisirLangue;
			case "questionDateHeure":
				return oC001L004InstallerCentos7.questionDateHeure;
			case "questionReseau":
				return oC001L004InstallerCentos7.questionReseau;
			case "questionSelectionLogiciel":
				return oC001L004InstallerCentos7.questionSelectionLogiciel;
			case "questionInstallationDestination":
				return oC001L004InstallerCentos7.questionInstallationDestination;
			case "questionInstaller":
				return oC001L004InstallerCentos7.questionInstaller;
			case "questionMotsDePasse":
				return oC001L004InstallerCentos7.questionMotsDePasse;
			case "questionConfigurationInitiale":
				return oC001L004InstallerCentos7.questionConfigurationInitiale;
			case "recapituler1":
				return oC001L004InstallerCentos7.recapituler1;
			case "recapituler2":
				return oC001L004InstallerCentos7.recapituler2;
			case "recapituler3":
				return oC001L004InstallerCentos7.recapituler3;
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
				o = attribuerC001L004InstallerCentos7(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L004InstallerCentos7(String var, Object val) {
		C001L004InstallerCentos7 oC001L004InstallerCentos7 = (C001L004InstallerCentos7)this;
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
					o = definirC001L004InstallerCentos7(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L004InstallerCentos7(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/004-comment-installer-centos7?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/004-comment-installer-centos7-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/004-comment-installer-centos7-999.png"));
				System.out.println("C001L004InstallerCentos7FrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/004-how-to-install-centos7?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/004-how-to-install-centos7-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/004-how-to-install-centos7-999.png"));
				System.out.println("C001L004InstallerCentos7EnUSPage");
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L004InstallerCentos7 o = new C001L004InstallerCentos7();
			o.requeteSiteC001L004InstallerCentos7(requeteSite);
			o.initLoinC001L004InstallerCentos7(requeteSite);
			o.indexerC001L004InstallerCentos7();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001L004InstallerCentos7();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001L004InstallerCentos7(document);
	}

	public void indexerC001L004InstallerCentos7(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L004InstallerCentos7(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L004InstallerCentos7() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L004InstallerCentos7(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L004InstallerCentos7(SolrInputDocument document) {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L004InstallerCentos7() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinC001L004InstallerCentos7(siteContexte.getRequeteSite_());
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
		stockerC001L004InstallerCentos7(solrDocument);
	}
	public void stockerC001L004InstallerCentos7(SolrDocument solrDocument) {
		C001L004InstallerCentos7 oC001L004InstallerCentos7 = (C001L004InstallerCentos7)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L004InstallerCentos7();
	}

	public void htmlBodyCourtC001L004InstallerCentos7() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(questionTelechargerCentos7 != null)
			questionTelechargerCentos7.htmlBodyCourt();
		if(questionCreerUneCleUsb != null)
			questionCreerUneCleUsb.htmlBodyCourt();
		if(questionDemarrerSystemSurCleUsb != null)
			questionDemarrerSystemSurCleUsb.htmlBodyCourt();
		if(questionChoisirLangue != null)
			questionChoisirLangue.htmlBodyCourt();
		if(questionDateHeure != null)
			questionDateHeure.htmlBodyCourt();
		if(questionReseau != null)
			questionReseau.htmlBodyCourt();
		if(questionSelectionLogiciel != null)
			questionSelectionLogiciel.htmlBodyCourt();
		if(questionInstallationDestination != null)
			questionInstallationDestination.htmlBodyCourt();
		if(questionInstaller != null)
			questionInstaller.htmlBodyCourt();
		if(questionMotsDePasse != null)
			questionMotsDePasse.htmlBodyCourt();
		if(questionConfigurationInitiale != null)
			questionConfigurationInitiale.htmlBodyCourt();
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
		htmlBodyC001L004InstallerCentos7();
		super.htmlBody();
	}

	public void htmlBodyC001L004InstallerCentos7() {
		((C001L004InstallerCentos7)this).htmlBodyMoi();
		((C001L004InstallerCentos7)this).htmlBodyQuestionTelechargerCentos7();
		((C001L004InstallerCentos7)this).htmlBodyQuestionCreerUneCleUsb();
		((C001L004InstallerCentos7)this).htmlBodyQuestionDemarrerSystemSurCleUsb();
		((C001L004InstallerCentos7)this).htmlBodyQuestionChoisirLangue();
		((C001L004InstallerCentos7)this).htmlBodyQuestionDateHeure();
		((C001L004InstallerCentos7)this).htmlBodyQuestionReseau();
		((C001L004InstallerCentos7)this).htmlBodyQuestionSelectionLogiciel();
		((C001L004InstallerCentos7)this).htmlBodyQuestionInstallationDestination();
		((C001L004InstallerCentos7)this).htmlBodyQuestionInstaller();
		((C001L004InstallerCentos7)this).htmlBodyQuestionMotsDePasse();
		((C001L004InstallerCentos7)this).htmlBodyQuestionConfigurationInitiale();
		((C001L004InstallerCentos7)this).htmlBodyRecapituler1();
		((C001L004InstallerCentos7)this).htmlBodyRecapituler2();
		((C001L004InstallerCentos7)this).htmlBodyRecapituler3();
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
		if(!(o instanceof C001L004InstallerCentos7))
			return false;
		C001L004InstallerCentos7 that = (C001L004InstallerCentos7)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L004InstallerCentos7 {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L004InstallerCentos7Vals = new String[] { moiP1, moiP2, questionTelechargerCentos7H3I1, questionTelechargerCentos7H3Span1, questionTelechargerCentos7H4I1, questionTelechargerCentos7H4Span1, questionTelechargerCentos7PreSpan11, questionTelechargerCentos7PreSpan21, questionTelechargerCentos7PreSpan31, questionTelechargerCentos7PreSpan41, questionTelechargerCentos7OlLi11, questionTelechargerCentos7OlLi21, questionTelechargerCentos7OlLi31, questionTelechargerCentos7OlLi41, questionTelechargerCentos7PSpan11, questionTelechargerCentos7PSpan2A1, questionTelechargerCentos7PSpan31, questionTelechargerCentos7PSpan32, questionTelechargerCentos7PSpan33, questionCreerUneCleUsbH3I1, questionCreerUneCleUsbH3Span1, questionCreerUneCleUsbH4I1, questionCreerUneCleUsbH4Span1, questionCreerUneCleUsbOl1Li11, questionCreerUneCleUsbOl1Li2Span11, questionCreerUneCleUsbOl1Li2A1, questionCreerUneCleUsbOl1Li2Span21, questionCreerUneCleUsbOl1Li31, questionCreerUneCleUsbOl1Li32, questionCreerUneCleUsbDiv2H51, questionCreerUneCleUsbPre2Span11, questionCreerUneCleUsbPre2Span21, questionCreerUneCleUsbPre2Span31, questionCreerUneCleUsbPre2Span41, questionCreerUneCleUsbPre2Span42, questionCreerUneCleUsbOl2Li11, questionCreerUneCleUsbOl2Li12, questionCreerUneCleUsbOl2Li21, questionCreerUneCleUsbOl2Li22, questionCreerUneCleUsbOl2Li31, questionCreerUneCleUsbOl2Li41, questionCreerUneCleUsbOl2Li51, questionCreerUneCleUsbDiv3H51, questionCreerUneCleUsbDiv3P1, questionCreerUneCleUsbPre31, questionCreerUneCleUsbOl3Li11, questionCreerUneCleUsbP41, questionCreerUneCleUsbP42, questionCreerUneCleUsbP43, questionCreerUneCleUsbPre51, questionCreerUneCleUsbPre5Br1, questionCreerUneCleUsbPre5Br2, questionCreerUneCleUsbPre5Br3, questionCreerUneCleUsbDiv6H51, questionCreerUneCleUsbP61, questionCreerUneCleUsbP62, questionCreerUneCleUsbPre61, questionCreerUneCleUsbOl6Li11, questionCreerUneCleUsbOl6Li21, questionCreerUneCleUsbOl6Li31, questionCreerUneCleUsbOl6Li41, questionCreerUneCleUsbOl6Li51, questionCreerUneCleUsbOl6Li61, questionCreerUneCleUsbP71, questionDemarrerSystemSurCleUsbH3I1, questionDemarrerSystemSurCleUsbH3Span1, questionDemarrerSystemSurCleUsbH4Span1I1, questionDemarrerSystemSurCleUsbH4Span2I1, questionDemarrerSystemSurCleUsbH4Span31, questionDemarrerSystemSurCleUsbP11, questionDemarrerSystemSurCleUsbP12, questionDemarrerSystemSurCleUsbP13, questionDemarrerSystemSurCleUsbP14, questionDemarrerSystemSurCleUsbP15, questionDemarrerSystemSurCleUsbP16, questionDemarrerSystemSurCleUsbP21, questionChoisirLangueH3I1, questionChoisirLangueH3Span1, questionChoisirLangueH4I1, questionChoisirLangueH4Span1, questionChoisirLangueOlLi11, questionChoisirLangueOlLi12, questionChoisirLangueOlLi21, questionChoisirLangueOlLi31, questionDateHeureH3I1, questionDateHeureH3Span1, questionDateHeureH4I1, questionDateHeureH4Span1, questionDateHeureOlLi11, questionDateHeureOlLi21, questionDateHeureOlLi31, questionDateHeureOlLi41, questionDateHeureOlLi51, questionReseauH3I1, questionReseauH3Span1, questionReseauH4I1, questionReseauH4Span1, questionReseauOlLi11, questionReseauOlLi12, questionReseauOlLi21, questionReseauOlLi22, questionReseauOlLi31, questionReseauOlLi32, questionReseauOlLi41, questionReseauOlLi42, questionReseauOlLi43, questionReseauOlLi44, questionReseauOlLi45, questionReseauOlLi51, questionReseauOlLi61, questionSelectionLogicielH3I1, questionSelectionLogicielH3Span1, questionSelectionLogicielH4I1, questionSelectionLogicielH4Span1, questionSelectionLogicielOlLi11, questionSelectionLogicielOlLi21, questionSelectionLogicielOlLi22, questionSelectionLogicielOlLi23, questionSelectionLogicielOlLi24, questionSelectionLogicielOlLi31, questionSelectionLogicielOlLi32, questionSelectionLogicielOlLi41, questionSelectionLogicielOlLi51, questionInstallationDestinationH3I1, questionInstallationDestinationH3Span1, questionInstallationDestinationH4I1, questionInstallationDestinationH4Span1, questionInstallationDestinationOl1Li11, questionInstallationDestinationOl1Li12, questionInstallationDestinationOl1Li21, questionInstallationDestinationOl1Li31, questionInstallationDestinationOl1Li32, questionInstallationDestinationOl1Li41, questionInstallationDestinationDiv2H51, questionInstallationDestinationOl2Li11, questionInstallationDestinationOl2Li21, questionInstallationDestinationOl2Li31, questionInstallationDestinationOl2Li41, questionInstallationDestinationDiv3H51, questionInstallationDestinationOl3Li011, questionInstallationDestinationOl3Li012, questionInstallationDestinationOl3Li013, questionInstallationDestinationOl3Li021, questionInstallationDestinationOl3Li022, questionInstallationDestinationOl3Li023, questionInstallationDestinationOl3Li031, questionInstallationDestinationOl3Li041, questionInstallationDestinationOl3Li042, questionInstallationDestinationOl3Li043, questionInstallationDestinationOl3Li044, questionInstallationDestinationOl3Li051, questionInstallationDestinationOl3Li061, questionInstallationDestinationOl3Li062, questionInstallationDestinationOl3Li063, questionInstallationDestinationOl3Li064, questionInstallationDestinationOl3Li065, questionInstallationDestinationOl3Li066, questionInstallationDestinationOl3Li067, questionInstallationDestinationOl3Li071, questionInstallationDestinationOl3Li081, questionInstallationDestinationOl3Li091, questionInstallationDestinationOl3Li101, questionInstallationDestinationOl3Li111, questionInstallationDestinationOl3Li112, questionInstallationDestinationDiv4H51, questionInstallationDestinationOl4Li11, questionInstallationDestinationOl4Li12, questionInstallationDestinationOl4Li13, questionInstallationDestinationOl4Li14, questionInstallationDestinationOl4Li21, questionInstallationDestinationOl4Li31, questionInstallerH3I1, questionInstallerH3Span1, questionInstallerH4I1, questionInstallerH4Span1, questionInstallerOlLi11, questionInstallerOlLi12, questionInstallerOlLi13, questionMotsDePasseH3I1, questionMotsDePasseH3Span1, questionMotsDePasseH4I1, questionMotsDePasseH4Span1, questionMotsDePasseOlLi11, questionMotsDePasseOlLi12, questionMotsDePasseOlLi13, questionMotsDePasseOlLi21, questionMotsDePasseOlLi22, questionMotsDePasseOlLi23, questionMotsDePasseOlLi24, questionMotsDePasseOlLi31, questionMotsDePasseOlLi32, questionMotsDePasseOlLi33, questionMotsDePasseOlLi34, questionMotsDePasseOlLi35, questionConfigurationInitialeH3I1, questionConfigurationInitialeH3Span1, questionConfigurationInitialeH4I1, questionConfigurationInitialeH4Span1, questionConfigurationInitialeOlLi011, questionConfigurationInitialeOlLi021, questionConfigurationInitialeOlLi031, questionConfigurationInitialeOlLi032, questionConfigurationInitialeOlLi041, questionConfigurationInitialeOlLi051, questionConfigurationInitialeOlLi061, questionConfigurationInitialeOlLi071, questionConfigurationInitialeOlLi081, questionConfigurationInitialeOlLi091, questionConfigurationInitialeOlLi101, questionConfigurationInitialeOlLi111, questionConfigurationInitialeOlLi121, questionConfigurationInitialeOlLi131, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3Span1I1, recapituler3TableTr04Td3Span1I2, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41, recapituler3TableTr11Td1I1, recapituler3TableTr11Td21, recapituler3TableTr11Td3I1, recapituler3TableTr11Td41, recapituler3TableTr12Td1I1, recapituler3TableTr12Td21, recapituler3TableTr12Td3I1, recapituler3TableTr12Td41 };
}
