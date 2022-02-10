package org.computate.site.enUS.cours.c001.l011;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import org.computate.site.enUS.page.parti.PagePart;
import org.computate.site.enUS.request.RequeteSiteEnUS;

import java.lang.String;
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
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L011InstallerKeycloakGen<DEV> extends C001Lecon {

	public static final String C001L011InstallerKeycloak_UnNom = "a lesson";
	public static final String C001L011InstallerKeycloak_Ce = "this ";
	public static final String C001L011InstallerKeycloak_CeNom = "this lesson";
	public static final String C001L011InstallerKeycloak_Un = "an ";
	public static final String C001L011InstallerKeycloak_LeNom = "the lesson";
	public static final String C001L011InstallerKeycloak_NomSingulier = "lesson";
	public static final String C001L011InstallerKeycloak_NomPluriel = "lessons";
	public static final String C001L011InstallerKeycloak_NomActuel = "current lesson";
	public static final String C001L011InstallerKeycloak_TousNom = "the lessons";
	public static final String C001L011InstallerKeycloak_RechercherTousNomPar = "search lessons by ";
	public static final String C001L011InstallerKeycloak_H1 = "How do I try out some user management software for single sign on applications? ";
	public static final String C001L011InstallerKeycloak_H2 = "Install Keycloak from the source code. ";
	public static final String C001L011InstallerKeycloak_Titre = "Description.frFR:";
	public static final String C001L011InstallerKeycloak_LesNoms = "the lessons";
	public static final String C001L011InstallerKeycloak_AucunNomTrouve = "no lesson found";
	public static final String C001L011InstallerKeycloak_NomVar = "lesson";
	public static final String C001L011InstallerKeycloak_DeNom = "of lesson";
	public static final String C001L011InstallerKeycloak_Couleur = "green";
	public static final String C001L011InstallerKeycloak_IconeGroupe = "regular";
	public static final String C001L011InstallerKeycloak_IconeNom = "question";
	public static final String C001L011InstallerKeycloakFrFRPage_Uri = "/frFR/cours/001/011-comment-installer-une-version-recente-de-keycloak";
	public static final String C001L011InstallerKeycloakFrFRPage_ImageUri = "/png/frFR/cours/001/011-comment-installer-une-version-recente-de-keycloak-999.png";
	public static final String C001L011InstallerKeycloakEnUSPage_Uri = "/enUS/course/001/011-how-to-install-a-recent-version-of-keycloak";
	public static final String C001L011InstallerKeycloakEnUSPage_ImageUri = "/png/enUS/course/001/011-how-to-install-a-recent-version-of-keycloak-999.png";

	/////////////////////
	// keycloakVersion //
	/////////////////////

	/**	L'entité « keycloakVersion »
	 *	 is defined as null before being initialized. 
	 */
	protected String keycloakVersion;
	public Couverture<String> keycloakVersionCouverture = new Couverture<String>().p(this).c(String.class).var("keycloakVersion").o(keycloakVersion);

	/**	<br/>L'entité « keycloakVersion »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:keycloakVersion">Trouver l'entité keycloakVersion dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _keycloakVersion(Couverture<String> c);

	public String getKeycloakVersion() {
		return keycloakVersion;
	}

	public void setKeycloakVersion(String keycloakVersion) {
		this.keycloakVersion = keycloakVersion;
		this.keycloakVersionCouverture.dejaInitialise = true;
	}
	protected C001L011InstallerKeycloak keycloakVersionInit() {
		if(!keycloakVersionCouverture.dejaInitialise) {
			_keycloakVersion(keycloakVersionCouverture);
			if(keycloakVersion == null)
				setKeycloakVersion(keycloakVersionCouverture.o);
		}
		keycloakVersionCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
	}

	public String solrKeycloakVersion() {
		return keycloakVersion;
	}

	public String strKeycloakVersion() {
		return keycloakVersion == null ? "" : keycloakVersion;
	}

	public String nomAffichageKeycloakVersion() {
		return null;
	}

	public String htmTooltipKeycloakVersion() {
		return null;
	}

	public String htmKeycloakVersion() {
		return keycloakVersion == null ? "" : StringEscapeUtils.escapeHtml4(strKeycloakVersion());
	}

	////////////////////////
	// keycloakPortClient //
	////////////////////////

	/**	L'entité « keycloakPortClient »
	 *	 is defined as null before being initialized. 
	 */
	protected Integer keycloakPortClient;
	public Couverture<Integer> keycloakPortClientCouverture = new Couverture<Integer>().p(this).c(Integer.class).var("keycloakPortClient").o(keycloakPortClient);

	/**	<br/>L'entité « keycloakPortClient »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:keycloakPortClient">Trouver l'entité keycloakPortClient dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _keycloakPortClient(Couverture<Integer> c);

	public Integer getKeycloakPortClient() {
		return keycloakPortClient;
	}

	public void setKeycloakPortClient(Integer keycloakPortClient) {
		this.keycloakPortClient = keycloakPortClient;
		this.keycloakPortClientCouverture.dejaInitialise = true;
	}
	public C001L011InstallerKeycloak setKeycloakPortClient(String o) {
		if(org.apache.commons.lang3.math.NumberUtils.isCreatable(o))
			this.keycloakPortClient = Integer.parseInt(o);
		this.keycloakPortClientCouverture.dejaInitialise = true;
		return (C001L011InstallerKeycloak)this;
	}
	protected C001L011InstallerKeycloak keycloakPortClientInit() {
		if(!keycloakPortClientCouverture.dejaInitialise) {
			_keycloakPortClient(keycloakPortClientCouverture);
			if(keycloakPortClient == null)
				setKeycloakPortClient(keycloakPortClientCouverture.o);
		}
		keycloakPortClientCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
	}

	public Integer solrKeycloakPortClient() {
		return keycloakPortClient;
	}

	public String strKeycloakPortClient() {
		return keycloakPortClient == null ? "" : keycloakPortClient.toString();
	}

	public String nomAffichageKeycloakPortClient() {
		return null;
	}

	public String htmTooltipKeycloakPortClient() {
		return null;
	}

	public String htmKeycloakPortClient() {
		return keycloakPortClient == null ? "" : StringEscapeUtils.escapeHtml4(strKeycloakPortClient());
	}

	/////////////////
	// keycloakTag //
	/////////////////

	/**	L'entité « keycloakTag »
	 *	 is defined as null before being initialized. 
	 */
	protected String keycloakTag;
	public Couverture<String> keycloakTagCouverture = new Couverture<String>().p(this).c(String.class).var("keycloakTag").o(keycloakTag);

	/**	<br/>L'entité « keycloakTag »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:keycloakTag">Trouver l'entité keycloakTag dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _keycloakTag(Couverture<String> c);

	public String getKeycloakTag() {
		return keycloakTag;
	}

	public void setKeycloakTag(String keycloakTag) {
		this.keycloakTag = keycloakTag;
		this.keycloakTagCouverture.dejaInitialise = true;
	}
	protected C001L011InstallerKeycloak keycloakTagInit() {
		if(!keycloakTagCouverture.dejaInitialise) {
			_keycloakTag(keycloakTagCouverture);
			if(keycloakTag == null)
				setKeycloakTag(keycloakTagCouverture.o);
		}
		keycloakTagCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
	}

	public String solrKeycloakTag() {
		return keycloakTag;
	}

	public String strKeycloakTag() {
		return keycloakTag == null ? "" : keycloakTag;
	}

	public String nomAffichageKeycloakTag() {
		return null;
	}

	public String htmTooltipKeycloakTag() {
		return null;
	}

	public String htmKeycloakTag() {
		return keycloakTag == null ? "" : StringEscapeUtils.escapeHtml4(strKeycloakTag());
	}

	///////////////////////
	// keycloakConfigset //
	///////////////////////

	/**	L'entité « keycloakConfigset »
	 *	 is defined as null before being initialized. 
	 */
	protected String keycloakConfigset;
	public Couverture<String> keycloakConfigsetCouverture = new Couverture<String>().p(this).c(String.class).var("keycloakConfigset").o(keycloakConfigset);

	/**	<br/>L'entité « keycloakConfigset »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:keycloakConfigset">Trouver l'entité keycloakConfigset dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _keycloakConfigset(Couverture<String> c);

	public String getKeycloakConfigset() {
		return keycloakConfigset;
	}

	public void setKeycloakConfigset(String keycloakConfigset) {
		this.keycloakConfigset = keycloakConfigset;
		this.keycloakConfigsetCouverture.dejaInitialise = true;
	}
	protected C001L011InstallerKeycloak keycloakConfigsetInit() {
		if(!keycloakConfigsetCouverture.dejaInitialise) {
			_keycloakConfigset(keycloakConfigsetCouverture);
			if(keycloakConfigset == null)
				setKeycloakConfigset(keycloakConfigsetCouverture.o);
		}
		keycloakConfigsetCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
	}

	public String solrKeycloakConfigset() {
		return keycloakConfigset;
	}

	public String strKeycloakConfigset() {
		return keycloakConfigset == null ? "" : keycloakConfigset;
	}

	public String nomAffichageKeycloakConfigset() {
		return null;
	}

	public String htmTooltipKeycloakConfigset() {
		return null;
	}

	public String htmKeycloakConfigset() {
		return keycloakConfigset == null ? "" : StringEscapeUtils.escapeHtml4(strKeycloakConfigset());
	}

	////////////////////////
	// keycloakCollection //
	////////////////////////

	/**	L'entité « keycloakCollection »
	 *	 is defined as null before being initialized. 
	 */
	protected String keycloakCollection;
	public Couverture<String> keycloakCollectionCouverture = new Couverture<String>().p(this).c(String.class).var("keycloakCollection").o(keycloakCollection);

	/**	<br/>L'entité « keycloakCollection »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:keycloakCollection">Trouver l'entité keycloakCollection dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _keycloakCollection(Couverture<String> c);

	public String getKeycloakCollection() {
		return keycloakCollection;
	}

	public void setKeycloakCollection(String keycloakCollection) {
		this.keycloakCollection = keycloakCollection;
		this.keycloakCollectionCouverture.dejaInitialise = true;
	}
	protected C001L011InstallerKeycloak keycloakCollectionInit() {
		if(!keycloakCollectionCouverture.dejaInitialise) {
			_keycloakCollection(keycloakCollectionCouverture);
			if(keycloakCollection == null)
				setKeycloakCollection(keycloakCollectionCouverture.o);
		}
		keycloakCollectionCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
	}

	public String solrKeycloakCollection() {
		return keycloakCollection;
	}

	public String strKeycloakCollection() {
		return keycloakCollection == null ? "" : keycloakCollection;
	}

	public String nomAffichageKeycloakCollection() {
		return null;
	}

	public String htmTooltipKeycloakCollection() {
		return null;
	}

	public String htmKeycloakCollection() {
		return keycloakCollection == null ? "" : StringEscapeUtils.escapeHtml4(strKeycloakCollection());
	}

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. ";
	public static final String moiP2 = "I will help you install the most recent version of Keycloak to add single sign on to your application the open source way. ";
	public static final String moiP = moiP1 + moiP2;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml moi = new PageHtml();
	public Couverture<PageHtml> moiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L011InstallerKeycloak moiInit() {
		if(moi != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(moi, "moi");
			((C001L011InstallerKeycloak)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:personnaliser">Trouver l'entité personnaliser dans Solr</a>
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
	protected C001L011InstallerKeycloak personnaliserInit() {
		if(personnaliser != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(personnaliser, "personnaliser");
			((C001L011InstallerKeycloak)this).avantPagePart(personnaliser, "personnaliser");
		}
		if(!personnaliserCouverture.dejaInitialise) {
			_personnaliser(personnaliser);
		}
		personnaliser.initLoinPourClasse(requeteSite_);
		personnaliserCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
	public static final String questionDependencesH3Span1 = "How do I install the dependencies for Keycloak? ";
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
	public static final String questionDependencesPre1Span51 = " ivy lsof maven git";
	public static final String questionDependencesPre1Span5 = questionDependencesPre1Span51;
	public static final String questionDependencesOl2Li1Dt1 = "sudo";
	public static final String questionDependencesOl2Li1Dt = questionDependencesOl2Li1Dt1;
	public static final String questionDependencesOl2Li1Dd1 = ": The command to install yum repositories begins with the command sudo. ";
	public static final String questionDependencesOl2Li1Dd2 = "The \"sudo\" command allows your current user to have root privileges for a few minutes after entering your password. ";
	public static final String questionDependencesOl2Li1Dd3 = "Installing yum repositories always requires root privileges. ";
	public static final String questionDependencesOl2Li1Dd = questionDependencesOl2Li1Dd1 + questionDependencesOl2Li1Dd2 + questionDependencesOl2Li1Dd3;
	public static final String questionDependencesOl2Li2Dt1 = "yum";
	public static final String questionDependencesOl2Li2Dt = questionDependencesOl2Li2Dt1;
	public static final String questionDependencesOl2Li2Dd1 = "Stands for \"Yellowdog Updater Modified\", but nobody knows it as yellowdog, just yum. ";
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
	public static final String questionDependencesOl2Li5Dt1 = "ivy lsof maven git";
	public static final String questionDependencesOl2Li5Dt = questionDependencesOl2Li5Dt1;
	public static final String questionDependencesOl2Li5Dd1 = ": The package names of the dependencies for building Keycloak from the source code. ";
	public static final String questionDependencesOl2Li5Dd = questionDependencesOl2Li5Dd1;

	/**	L'entité « questionDependences »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDependences = new PageHtml();
	public Couverture<PageHtml> questionDependencesCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDependences").o(questionDependences);

	/**	<br/>L'entité « questionDependences »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionDependences">Trouver l'entité questionDependences dans Solr</a>
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
	protected C001L011InstallerKeycloak questionDependencesInit() {
		if(questionDependences != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionDependences, "questionDependences");
			((C001L011InstallerKeycloak)this).avantPagePart(questionDependences, "questionDependences");
		}
		if(!questionDependencesCouverture.dejaInitialise) {
			_questionDependences(questionDependences);
		}
		questionDependences.initLoinPourClasse(requeteSite_);
		questionDependencesCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
	public static final String questionMkdirSrcH3Span1 = "Where do I put the Keycloak source code? ";
	public static final String questionMkdirSrcH3Span = questionMkdirSrcH3Span1;
	public static final String questionMkdirSrcH4I1 = "far fa-folder-tree";
	public static final String questionMkdirSrcH4I = questionMkdirSrcH4I1;
	public static final String questionMkdirSrcH4Span1 = "Create a keycloak directory in /usr/local/src. ";
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
	public static final String questionMkdirSrcPreSpan81 = " /usr/local/src/keycloak";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionMkdirSrc">Trouver l'entité questionMkdirSrc dans Solr</a>
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
	protected C001L011InstallerKeycloak questionMkdirSrcInit() {
		if(questionMkdirSrc != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionMkdirSrc, "questionMkdirSrc");
			((C001L011InstallerKeycloak)this).avantPagePart(questionMkdirSrc, "questionMkdirSrc");
		}
		if(!questionMkdirSrcCouverture.dejaInitialise) {
			_questionMkdirSrc(questionMkdirSrc);
		}
		questionMkdirSrc.initLoinPourClasse(requeteSite_);
		questionMkdirSrcCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
	// questionClonerSource //
	//////////////////////////

	public static final String questionClonerSourceH3I1 = "far fa-cloud-download";
	public static final String questionClonerSourceH3I = questionClonerSourceH3I1;
	public static final String questionClonerSourceH3Span1 = "How do I download the Keycloak source code? ";
	public static final String questionClonerSourceH3Span = questionClonerSourceH3Span1;
	public static final String questionClonerSourceH4I1 = "fab fa-git";
	public static final String questionClonerSourceH4I = questionClonerSourceH4I1;
	public static final String questionClonerSourceH4Span1 = "Clone the source code with the git command. ";
	public static final String questionClonerSourceH4Span = questionClonerSourceH4Span1;
	public static final String questionClonerSourcePreSpan11 = "git";
	public static final String questionClonerSourcePreSpan1 = questionClonerSourcePreSpan11;
	public static final String questionClonerSourcePreSpan21 = " clone";
	public static final String questionClonerSourcePreSpan2 = questionClonerSourcePreSpan21;
	public static final String questionClonerSourcePreSpan31 = " https://github.com/keycloak/keycloak.git";
	public static final String questionClonerSourcePreSpan3 = questionClonerSourcePreSpan31;
	public static final String questionClonerSourcePreSpan41 = " /usr/local/src/keycloak";
	public static final String questionClonerSourcePreSpan4 = questionClonerSourcePreSpan41;
	public static final String questionClonerSourceOl2Li11 = "git: The distributed revision control system for most open source software. ";
	public static final String questionClonerSourceOl2Li1 = questionClonerSourceOl2Li11;
	public static final String questionClonerSourceOl2Li21 = "clone: Clone a repository into a directory. ";
	public static final String questionClonerSourceOl2Li2 = questionClonerSourceOl2Li21;
	public static final String questionClonerSourceOl2Li31 = "https://github.com/keycloak/keycloak.git: The git URL to the Keycloak source code repository. ";
	public static final String questionClonerSourceOl2Li3 = questionClonerSourceOl2Li31;
	public static final String questionClonerSourceOl2Li41 = "/usr/local/src/keycloak: The directory where the Keycloak source code will be cloned. ";
	public static final String questionClonerSourceOl2Li4 = questionClonerSourceOl2Li41;

	/**	L'entité « questionClonerSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionClonerSource = new PageHtml();
	public Couverture<PageHtml> questionClonerSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionClonerSource").o(questionClonerSource);

	/**	<br/>L'entité « questionClonerSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionClonerSource">Trouver l'entité questionClonerSource dans Solr</a>
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
	protected C001L011InstallerKeycloak questionClonerSourceInit() {
		if(questionClonerSource != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionClonerSource, "questionClonerSource");
			((C001L011InstallerKeycloak)this).avantPagePart(questionClonerSource, "questionClonerSource");
		}
		if(!questionClonerSourceCouverture.dejaInitialise) {
			_questionClonerSource(questionClonerSource);
		}
		questionClonerSource.initLoinPourClasse(requeteSite_);
		questionClonerSourceCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
	public static final String questionListerTagsH3Span1 = "How do I pick a recent version of Keycloak? ";
	public static final String questionListerTagsH3Span = questionListerTagsH3Span1;
	public static final String questionListerTagsH4I1 = "far fa-tag";
	public static final String questionListerTagsH4I = questionListerTagsH4I1;
	public static final String questionListerTagsH4Span1 = "List all the tags in the git repository. ";
	public static final String questionListerTagsH4Span = questionListerTagsH4Span1;
	public static final String questionListerTagsPreSpan11 = "(cd";
	public static final String questionListerTagsPreSpan1 = questionListerTagsPreSpan11;
	public static final String questionListerTagsPreSpan21 = " /usr/local/src/keycloak";
	public static final String questionListerTagsPreSpan2 = questionListerTagsPreSpan21;
	public static final String questionListerTagsPreSpan31 = " &&";
	public static final String questionListerTagsPreSpan3 = questionListerTagsPreSpan31;
	public static final String questionListerTagsPreSpan41 = " git";
	public static final String questionListerTagsPreSpan4 = questionListerTagsPreSpan41;
	public static final String questionListerTagsPreSpan51 = " tag)";
	public static final String questionListerTagsPreSpan5 = questionListerTagsPreSpan51;
	public static final String questionListerTagsOl2Li11 = "(cd: Change directory temporarily, because of the open parenthesis. ";
	public static final String questionListerTagsOl2Li1 = questionListerTagsOl2Li11;
	public static final String questionListerTagsOl2Li21 = "/usr/local/src/keycloak: The directory where the Keycloak source code was cloned. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionListerTags">Trouver l'entité questionListerTags dans Solr</a>
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
	protected C001L011InstallerKeycloak questionListerTagsInit() {
		if(questionListerTags != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionListerTags, "questionListerTags");
			((C001L011InstallerKeycloak)this).avantPagePart(questionListerTags, "questionListerTags");
		}
		if(!questionListerTagsCouverture.dejaInitialise) {
			_questionListerTags(questionListerTags);
		}
		questionListerTags.initLoinPourClasse(requeteSite_);
		questionListerTagsCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
	public static final String questionCheckoutTagH3Span1 = "How do I switch versions of the Keycloak source code? ";
	public static final String questionCheckoutTagH3Span = questionCheckoutTagH3Span1;
	public static final String questionCheckoutTagH4I1 = "far fa-code-commit";
	public static final String questionCheckoutTagH4I = questionCheckoutTagH4I1;
	public static final String questionCheckoutTagH4Span1 = "Checkout the git tag. ";
	public static final String questionCheckoutTagH4Span = questionCheckoutTagH4Span1;
	public static final String questionCheckoutTagPreSpan11 = "(cd";
	public static final String questionCheckoutTagPreSpan1 = questionCheckoutTagPreSpan11;
	public static final String questionCheckoutTagPreSpan21 = " /usr/local/src/keycloak";
	public static final String questionCheckoutTagPreSpan2 = questionCheckoutTagPreSpan21;
	public static final String questionCheckoutTagPreSpan31 = " &&";
	public static final String questionCheckoutTagPreSpan3 = questionCheckoutTagPreSpan31;
	public static final String questionCheckoutTagPreSpan41 = " git";
	public static final String questionCheckoutTagPreSpan4 = questionCheckoutTagPreSpan41;
	public static final String questionCheckoutTagPreSpan51 = " checkout";
	public static final String questionCheckoutTagPreSpan5 = questionCheckoutTagPreSpan51;
	public static final String questionCheckoutTagPreSpan6Span11 = " ";
	public static final String questionCheckoutTagPreSpan6Span1 = questionCheckoutTagPreSpan6Span11;
	public static final String questionCheckoutTagPreSpan6Span21 = "4.8.3.Final";
	public static final String questionCheckoutTagPreSpan6Span2 = questionCheckoutTagPreSpan6Span21;
	public static final String questionCheckoutTagPreSpan6Span31 = ")";
	public static final String questionCheckoutTagPreSpan6Span3 = questionCheckoutTagPreSpan6Span31;
	public static final String questionCheckoutTagOl1Li11 = "(cd";
	public static final String questionCheckoutTagOl1Li1 = questionCheckoutTagOl1Li11;
	public static final String questionCheckoutTagOl1Li21 = "/usr/local/src/keycloak";
	public static final String questionCheckoutTagOl1Li2 = questionCheckoutTagOl1Li21;
	public static final String questionCheckoutTagOl1Li31 = "&&";
	public static final String questionCheckoutTagOl1Li3 = questionCheckoutTagOl1Li31;
	public static final String questionCheckoutTagOl1Li41 = "git";
	public static final String questionCheckoutTagOl1Li4 = questionCheckoutTagOl1Li41;
	public static final String questionCheckoutTagOl1Li51 = "checkout: Checkout a branch to the working tree. ";
	public static final String questionCheckoutTagOl1Li5 = questionCheckoutTagOl1Li51;
	public static final String questionCheckoutTagOl1Li6Span11 = "4.8.3.Final";
	public static final String questionCheckoutTagOl1Li6Span1 = questionCheckoutTagOl1Li6Span11;
	public static final String questionCheckoutTagOl1Li6Span21 = "): The latest tag to base the branch from. ";
	public static final String questionCheckoutTagOl1Li6Span2 = questionCheckoutTagOl1Li6Span21;
	public static final String questionCheckoutTagP2Span11 = "The enterprise supported version of Keycloak is called Red Hat Single Sign On (Red Hat SSO). ";
	public static final String questionCheckoutTagP2Span12 = "The latest version of Red Hat SSO is version 7.3 and is based on Keycloak version 4.8. See: ";
	public static final String questionCheckoutTagP2Span1 = questionCheckoutTagP2Span11 + questionCheckoutTagP2Span12;
	public static final String questionCheckoutTagP2A11 = "https://access.redhat.com/articles/2342881";
	public static final String questionCheckoutTagP2A1 = questionCheckoutTagP2A11;
	public static final String questionCheckoutTagP2Span21 = ". I will use the latest 4.8 tag to give me the latest updates of the most recent, enterprise supported, version of Keycloak. ";
	public static final String questionCheckoutTagP2Span22 = "That way, when I deploy my application to the cloud in production, I can install the same compatible, enterprise supported, version of Red Hat SSO for user management of my applications. ";
	public static final String questionCheckoutTagP2Span2 = questionCheckoutTagP2Span21 + questionCheckoutTagP2Span22;

	/**	L'entité « questionCheckoutTag »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCheckoutTag = new PageHtml();
	public Couverture<PageHtml> questionCheckoutTagCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCheckoutTag").o(questionCheckoutTag);

	/**	<br/>L'entité « questionCheckoutTag »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCheckoutTag">Trouver l'entité questionCheckoutTag dans Solr</a>
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
	protected C001L011InstallerKeycloak questionCheckoutTagInit() {
		if(questionCheckoutTag != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
			((C001L011InstallerKeycloak)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
		}
		if(!questionCheckoutTagCouverture.dejaInitialise) {
			_questionCheckoutTag(questionCheckoutTag);
		}
		questionCheckoutTag.initLoinPourClasse(requeteSite_);
		questionCheckoutTagCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
				{ e("span").a("class", " questionCheckoutTagPreSpan6Span1 questionCheckoutTagPreSpan6Span odd ").f();
					sx(questionCheckoutTagPreSpan6Span11);
				} g("span");
				{ e("span").a("class", " questionCheckoutTagPreSpan6Span2 questionCheckoutTagPreSpan6Span even ").f();
					sx(utilisateurId == null ? questionCheckoutTagPreSpan6Span21 : keycloakTag);
				} g("span");
				{ e("span").a("class", " questionCheckoutTagPreSpan6Span3 questionCheckoutTagPreSpan6Span odd ").f();
					sx(questionCheckoutTagPreSpan6Span31);
				} g("span");
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
				{ e("span").a("class", " questionCheckoutTagOl1Li6Span1 questionCheckoutTagOl1Li6Span odd ").f();
					sx(utilisateurId == null ? questionCheckoutTagOl1Li6Span11 : keycloakTag);
				} g("span");
				{ e("span").a("class", " questionCheckoutTagOl1Li6Span2 questionCheckoutTagOl1Li6Span even ").f();
					sx(questionCheckoutTagOl1Li6Span21);
				} g("span");
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionCheckoutTagP2 questionCheckoutTagP even ").f();
			{ e("span").a("class", " questionCheckoutTagP2Span1 questionCheckoutTagP2Span odd ").f();
				sx(questionCheckoutTagP2Span11);
				sx(questionCheckoutTagP2Span12);
			} g("span");
			{ e("a").a("class", " questionCheckoutTagP2A1 questionCheckoutTagP2A odd ").a("href", questionCheckoutTagP2A11).f();
				sx(questionCheckoutTagP2A11);
			} g("a");
			{ e("span").a("class", " questionCheckoutTagP2Span2 questionCheckoutTagP2Span even ").f();
				sx(questionCheckoutTagP2Span21);
				sx(questionCheckoutTagP2Span22);
			} g("span");
		} g("p");
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
	public static final String questionConstruireSourceH3Span1 = "How do I build the Keycloak source code? ";
	public static final String questionConstruireSourceH3Span = questionConstruireSourceH3Span1;
	public static final String questionConstruireSourceH4I1 = "far fa-terminal";
	public static final String questionConstruireSourceH4I = questionConstruireSourceH4I1;
	public static final String questionConstruireSourceH4Span1 = "Build Keycloak with the mvn command. ";
	public static final String questionConstruireSourceH4Span = questionConstruireSourceH4Span1;
	public static final String questionConstruireSourcePre1Span011 = "(cd";
	public static final String questionConstruireSourcePre1Span01 = questionConstruireSourcePre1Span011;
	public static final String questionConstruireSourcePre1Span021 = " /usr/local/src/keycloak";
	public static final String questionConstruireSourcePre1Span02 = questionConstruireSourcePre1Span021;
	public static final String questionConstruireSourcePre1Span031 = " &&";
	public static final String questionConstruireSourcePre1Span03 = questionConstruireSourcePre1Span031;
	public static final String questionConstruireSourcePre1Span041 = " mvn";
	public static final String questionConstruireSourcePre1Span04 = questionConstruireSourcePre1Span041;
	public static final String questionConstruireSourcePre1Span051 = " install";
	public static final String questionConstruireSourcePre1Span05 = questionConstruireSourcePre1Span051;
	public static final String questionConstruireSourcePre1Span061 = " -Pdistribution";
	public static final String questionConstruireSourcePre1Span06 = questionConstruireSourcePre1Span061;
	public static final String questionConstruireSourcePre1Span071 = " -DskipTests)";
	public static final String questionConstruireSourcePre1Span07 = questionConstruireSourcePre1Span071;
	public static final String questionConstruireSourceOl1Li011 = "(cd";
	public static final String questionConstruireSourceOl1Li01 = questionConstruireSourceOl1Li011;
	public static final String questionConstruireSourceOl1Li021 = "/usr/local/src/keycloak";
	public static final String questionConstruireSourceOl1Li02 = questionConstruireSourceOl1Li021;
	public static final String questionConstruireSourceOl1Li031 = "&&";
	public static final String questionConstruireSourceOl1Li03 = questionConstruireSourceOl1Li031;
	public static final String questionConstruireSourceOl1Li041 = "mvn:  A platform-independent build tool for Java projects. ";
	public static final String questionConstruireSourceOl1Li04 = questionConstruireSourceOl1Li041;
	public static final String questionConstruireSourceOl1Li051 = "install: Compile and install the version of Keycloak in the local Maven repository. ";
	public static final String questionConstruireSourceOl1Li05 = questionConstruireSourceOl1Li051;
	public static final String questionConstruireSourceOl1Li061 = "-Pdistribution:  Create the full distribution of the Keycloak application. ";
	public static final String questionConstruireSourceOl1Li06 = questionConstruireSourceOl1Li061;
	public static final String questionConstruireSourceOl1Li071 = "-DskipTests): Skip tests to speed up the build process. ";
	public static final String questionConstruireSourceOl1Li07 = questionConstruireSourceOl1Li071;

	/**	L'entité « questionConstruireSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionConstruireSource = new PageHtml();
	public Couverture<PageHtml> questionConstruireSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionConstruireSource").o(questionConstruireSource);

	/**	<br/>L'entité « questionConstruireSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionConstruireSource">Trouver l'entité questionConstruireSource dans Solr</a>
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
	protected C001L011InstallerKeycloak questionConstruireSourceInit() {
		if(questionConstruireSource != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
			((C001L011InstallerKeycloak)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
		}
		if(!questionConstruireSourceCouverture.dejaInitialise) {
			_questionConstruireSource(questionConstruireSource);
		}
		questionConstruireSource.initLoinPourClasse(requeteSite_);
		questionConstruireSourceCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
	public static final String questionMkdirServeurH3Span1 = "After compiling Keycloak, where do I install it as a server? ";
	public static final String questionMkdirServeurH3Span = questionMkdirServeurH3Span1;
	public static final String questionMkdirServeurH4I1 = "far fa-folder-tree";
	public static final String questionMkdirServeurH4I = questionMkdirServeurH4I1;
	public static final String questionMkdirServeurH4Span1 = "Create a keycloak directory in /srv. ";
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
	public static final String questionMkdirServeurPreSpan81 = " /srv/keycloak";
	public static final String questionMkdirServeurPreSpan8 = questionMkdirServeurPreSpan81;
	public static final String questionMkdirServeurOl1Li11 = "sudo";
	public static final String questionMkdirServeurOl1Li1 = questionMkdirServeurOl1Li11;
	public static final String questionMkdirServeurOl1Li21 = "install";
	public static final String questionMkdirServeurOl1Li2 = questionMkdirServeurOl1Li21;
	public static final String questionMkdirServeurOl1Li31 = "-d";
	public static final String questionMkdirServeurOl1Li3 = questionMkdirServeurOl1Li31;
	public static final String questionMkdirServeurOl1Li41 = "-o";
	public static final String questionMkdirServeurOl1Li4 = questionMkdirServeurOl1Li41;
	public static final String questionMkdirServeurOl1Li51 = "$USER";
	public static final String questionMkdirServeurOl1Li5 = questionMkdirServeurOl1Li51;
	public static final String questionMkdirServeurOl1Li61 = "-g";
	public static final String questionMkdirServeurOl1Li6 = questionMkdirServeurOl1Li61;
	public static final String questionMkdirServeurOl1Li71 = "$USER";
	public static final String questionMkdirServeurOl1Li7 = questionMkdirServeurOl1Li71;
	public static final String questionMkdirServeurOl1Li81 = "/srv is a good place to install open source software serveurs like Keycloak that run as a service. ";
	public static final String questionMkdirServeurOl1Li8 = questionMkdirServeurOl1Li81;
	public static final String questionMkdirServeurPre2Span11 = "rsync";
	public static final String questionMkdirServeurPre2Span1 = questionMkdirServeurPre2Span11;
	public static final String questionMkdirServeurPre2Span21 = " -r";
	public static final String questionMkdirServeurPre2Span2 = questionMkdirServeurPre2Span21;
	public static final String questionMkdirServeurPre2Span3Span11 = " /usr/local/src/keycloak/distribution/server-dist/keycloak-";
	public static final String questionMkdirServeurPre2Span3Span1 = questionMkdirServeurPre2Span3Span11;
	public static final String questionMkdirServeurPre2Span3Span21 = "4.8.3";
	public static final String questionMkdirServeurPre2Span3Span2 = questionMkdirServeurPre2Span3Span21;
	public static final String questionMkdirServeurPre2Span3Span31 = ".Final/";
	public static final String questionMkdirServeurPre2Span3Span3 = questionMkdirServeurPre2Span3Span31;
	public static final String questionMkdirServeurPre2Span41 = " /srv/keycloak/";
	public static final String questionMkdirServeurPre2Span4 = questionMkdirServeurPre2Span41;
	public static final String questionMkdirServeurOl2Li11 = "rsync: a fast, versatile, remote (and local) file-copying tool. ";
	public static final String questionMkdirServeurOl2Li1 = questionMkdirServeurOl2Li11;
	public static final String questionMkdirServeurOl2Li21 = "-r: Recurse into directories. ";
	public static final String questionMkdirServeurOl2Li2 = questionMkdirServeurOl2Li21;
	public static final String questionMkdirServeurOl2Li3Span11 = "/usr/local/src/keycloak/distribution/server-dist/keycloak-";
	public static final String questionMkdirServeurOl2Li3Span1 = questionMkdirServeurOl2Li3Span11;
	public static final String questionMkdirServeurOl2Li3Span21 = "4.8.3";
	public static final String questionMkdirServeurOl2Li3Span2 = questionMkdirServeurOl2Li3Span21;
	public static final String questionMkdirServeurOl2Li3Span31 = ".Final/: The directory where the maven application was built. ";
	public static final String questionMkdirServeurOl2Li3Span32 = "Don't forget the ending slash or rsync assumes it's a file inside the destination. ";
	public static final String questionMkdirServeurOl2Li3Span3 = questionMkdirServeurOl2Li3Span31 + questionMkdirServeurOl2Li3Span32;
	public static final String questionMkdirServeurOl2Li41 = "/srv/keycloak/: The directory where the server will be installed. ";
	public static final String questionMkdirServeurOl2Li42 = "It's best to always write directories with a trailing slash in rsync for fewer surprises. ";
	public static final String questionMkdirServeurOl2Li4 = questionMkdirServeurOl2Li41 + questionMkdirServeurOl2Li42;
	public static final String questionMkdirServeurPre3Span11 = "rsync";
	public static final String questionMkdirServeurPre3Span1 = questionMkdirServeurPre3Span11;
	public static final String questionMkdirServeurPre3Span21 = " /usr/local/src/keycloak/distribution/server-dist/src/main/modules/layers.conf";
	public static final String questionMkdirServeurPre3Span2 = questionMkdirServeurPre3Span21;
	public static final String questionMkdirServeurPre3Span31 = " /srv/keycloak/modules/";
	public static final String questionMkdirServeurPre3Span3 = questionMkdirServeurPre3Span31;
	public static final String questionMkdirServeurOl3Li11 = "rsync";
	public static final String questionMkdirServeurOl3Li1 = questionMkdirServeurOl3Li11;
	public static final String questionMkdirServeurOl3Li21 = "/usr/local/src/keycloak/distribution/server-dist/src/main/modules/layers.conf: ";
	public static final String questionMkdirServeurOl3Li2 = questionMkdirServeurOl3Li21;
	public static final String questionMkdirServeurOl3Li31 = "/srv/keycloak/modules/: ";
	public static final String questionMkdirServeurOl3Li3 = questionMkdirServeurOl3Li31;
	public static final String questionMkdirServeurPre4Span11 = "install";
	public static final String questionMkdirServeurPre4Span1 = questionMkdirServeurPre4Span11;
	public static final String questionMkdirServeurPre4Span21 = " -d";
	public static final String questionMkdirServeurPre4Span2 = questionMkdirServeurPre4Span21;
	public static final String questionMkdirServeurPre4Span31 = " /srv/keycloak-4.8.3/modules/system/layers/keycloak/org/postgresql/main";
	public static final String questionMkdirServeurPre4Span3 = questionMkdirServeurPre4Span31;
	public static final String questionMkdirServeurOl4Li11 = "rm: Remove files and directories. ";
	public static final String questionMkdirServeurOl4Li1 = questionMkdirServeurOl4Li11;
	public static final String questionMkdirServeurOl4Li21 = "-rf: Remove all files and directories recursively without prompting. ";
	public static final String questionMkdirServeurOl4Li2 = questionMkdirServeurOl4Li21;
	public static final String questionMkdirServeurOl4Li31 = "/srv/keycloak/example/: The Keycloak example files that will result in error messages when starting the server if they remain. ";
	public static final String questionMkdirServeurOl4Li3 = questionMkdirServeurOl4Li31;

	/**	L'entité « questionMkdirServeur »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMkdirServeur = new PageHtml();
	public Couverture<PageHtml> questionMkdirServeurCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMkdirServeur").o(questionMkdirServeur);

	/**	<br/>L'entité « questionMkdirServeur »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionMkdirServeur">Trouver l'entité questionMkdirServeur dans Solr</a>
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
	protected C001L011InstallerKeycloak questionMkdirServeurInit() {
		if(questionMkdirServeur != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionMkdirServeur, "questionMkdirServeur");
			((C001L011InstallerKeycloak)this).avantPagePart(questionMkdirServeur, "questionMkdirServeur");
		}
		if(!questionMkdirServeurCouverture.dejaInitialise) {
			_questionMkdirServeur(questionMkdirServeur);
		}
		questionMkdirServeur.initLoinPourClasse(requeteSite_);
		questionMkdirServeurCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
		{ e("ol").a("class", " questionMkdirServeurOl1 questionMkdirServeurOl odd ").f();
			{ e("li").a("class", " questionMkdirServeurOl1Li1 questionMkdirServeurOl1Li odd ").f();
				sx(questionMkdirServeurOl1Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li2 questionMkdirServeurOl1Li even ").f();
				sx(questionMkdirServeurOl1Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li3 questionMkdirServeurOl1Li odd ").f();
				sx(questionMkdirServeurOl1Li31);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li4 questionMkdirServeurOl1Li even ").f();
				sx(questionMkdirServeurOl1Li41);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li5 questionMkdirServeurOl1Li odd ").f();
				sx(questionMkdirServeurOl1Li51);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li6 questionMkdirServeurOl1Li even ").f();
				sx(questionMkdirServeurOl1Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li7 questionMkdirServeurOl1Li odd ").f();
				sx(questionMkdirServeurOl1Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li8 questionMkdirServeurOl1Li even ").f();
				sx(questionMkdirServeurOl1Li81);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionMkdirServeurPre2 questionMkdirServeurPre even ").f();
			{ e("span").a("class", " questionMkdirServeurPre2Span1 questionMkdirServeurPre2Span odd ").f();
				sx(questionMkdirServeurPre2Span11);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPre2Span2 questionMkdirServeurPre2Span even ").f();
				sx(questionMkdirServeurPre2Span21);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPre2Span3 questionMkdirServeurPre2Span odd ").f();
				{ e("span").a("class", " questionMkdirServeurPre2Span3Span1 questionMkdirServeurPre2Span3Span odd ").f();
					sx(questionMkdirServeurPre2Span3Span11);
				} g("span");
				{ e("span").a("class", " questionMkdirServeurPre2Span3Span2 questionMkdirServeurPre2Span3Span even ").f();
					sx(utilisateurId == null ? questionMkdirServeurPre2Span3Span21 : keycloakVersion);
				} g("span");
				{ e("span").a("class", " questionMkdirServeurPre2Span3Span3 questionMkdirServeurPre2Span3Span odd ").f();
					sx(questionMkdirServeurPre2Span3Span31);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPre2Span4 questionMkdirServeurPre2Span even ").f();
				sx(questionMkdirServeurPre2Span41);
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
				{ e("span").a("class", " questionMkdirServeurOl2Li3Span1 questionMkdirServeurOl2Li3Span odd ").f();
					sx(questionMkdirServeurOl2Li3Span11);
				} g("span");
				{ e("span").a("class", " questionMkdirServeurOl2Li3Span2 questionMkdirServeurOl2Li3Span even ").f();
					sx(utilisateurId == null ? questionMkdirServeurOl2Li3Span21 : keycloakVersion);
				} g("span");
				{ e("span").a("class", " questionMkdirServeurOl2Li3Span3 questionMkdirServeurOl2Li3Span odd ").f();
					sx(questionMkdirServeurOl2Li3Span31);
					sx(questionMkdirServeurOl2Li3Span32);
				} g("span");
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li4 questionMkdirServeurOl2Li even ").f();
				sx(questionMkdirServeurOl2Li41);
				sx(questionMkdirServeurOl2Li42);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionMkdirServeurPre3 questionMkdirServeurPre odd ").f();
			{ e("span").a("class", " questionMkdirServeurPre3Span1 questionMkdirServeurPre3Span odd ").f();
				sx(questionMkdirServeurPre3Span11);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPre3Span2 questionMkdirServeurPre3Span even ").f();
				sx(questionMkdirServeurPre3Span21);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPre3Span3 questionMkdirServeurPre3Span odd ").f();
				sx(questionMkdirServeurPre3Span31);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirServeurOl3 questionMkdirServeurOl odd ").f();
			{ e("li").a("class", " questionMkdirServeurOl3Li1 questionMkdirServeurOl3Li odd ").f();
				sx(questionMkdirServeurOl3Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl3Li2 questionMkdirServeurOl3Li even ").f();
				sx(questionMkdirServeurOl3Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl3Li3 questionMkdirServeurOl3Li odd ").f();
				sx(questionMkdirServeurOl3Li31);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionMkdirServeurPre4 questionMkdirServeurPre even ").f();
			{ e("span").a("class", " questionMkdirServeurPre4Span1 questionMkdirServeurPre4Span odd ").f();
				sx(questionMkdirServeurPre4Span11);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPre4Span2 questionMkdirServeurPre4Span even ").f();
				sx(questionMkdirServeurPre4Span21);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPre4Span3 questionMkdirServeurPre4Span odd ").f();
				sx(questionMkdirServeurPre4Span31);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirServeurOl4 questionMkdirServeurOl even ").f();
			{ e("li").a("class", " questionMkdirServeurOl4Li1 questionMkdirServeurOl4Li odd ").f();
				sx(questionMkdirServeurOl4Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl4Li2 questionMkdirServeurOl4Li even ").f();
				sx(questionMkdirServeurOl4Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl4Li3 questionMkdirServeurOl4Li odd ").f();
				sx(questionMkdirServeurOl4Li31);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMkdirServeur() {
		questionMkdirServeur.htmlAvant();
		htmlBodyQuestionMkdirServeur(questionMkdirServeur);
		questionMkdirServeur.htmlApres();
	}

	////////////////////////
	// questionConfigurer //
	////////////////////////

	public static final String questionConfigurerH3I1 = "far fa-ballot";
	public static final String questionConfigurerH3I = questionConfigurerH3I1;
	public static final String questionConfigurerH3Span1 = "How do I configure the Keycloak server? ";
	public static final String questionConfigurerH3Span = questionConfigurerH3Span1;
	public static final String questionConfigurerH4I1 = "far fa-file-alt";
	public static final String questionConfigurerH4I = questionConfigurerH4I1;
	public static final String questionConfigurerH4Span1 = "Create a keycloak.xml file. ";
	public static final String questionConfigurerH4Span = questionConfigurerH4Span1;
	public static final String questionConfigurerPreSpan11 = "echo '<?xml version=\"1.0\" encoding=\"UTF-8\" ?>";
	public static final String questionConfigurerPreSpan1 = questionConfigurerPreSpan11;
	public static final String questionConfigurerPreSpan1Br1 = "<keycloak>";
	public static final String questionConfigurerPreSpan1Br2 = "\t<keycloakcloud>";
	public static final String questionConfigurerPreSpan1Br3 = "\t\t<str name=\"host\">${host:}</str>";
	public static final String questionConfigurerPreSpan1Br4 = "\t\t<int name=\"hostPort\">${jetty.port:8983}</int>";
	public static final String questionConfigurerPreSpan1Br5 = "\t\t<str name=\"hostContext\">${hostContext:keycloak}</str>";
	public static final String questionConfigurerPreSpan1Br6 = "\t\t<bool name=\"genericCoreNodeNames\">${genericCoreNodeNames:true}</bool>";
	public static final String questionConfigurerPreSpan1Br7 = "\t\t<int name=\"zkClientTimeout\">${zkClientTimeout:30000}</int>";
	public static final String questionConfigurerPreSpan1Br8 = "\t\t<int name=\"distribUpdateSoTimeout\">${distribUpdateSoTimeout:600000}</int>";
	public static final String questionConfigurerPreSpan1Br9 = "\t\t<int name=\"distribUpdateConnTimeout\">${distribUpdateConnTimeout:60000}</int>";
	public static final String questionConfigurerPreSpan1Br10 = "\t\t<str name=\"zkCredentialsProvider\">${zkCredentialsProvider:org.apache.keycloak.common.cloud.DefaultZkCredentialsProvider}</str>";
	public static final String questionConfigurerPreSpan1Br11 = "\t\t<str name=\"zkACLProvider\">${zkACLProvider:org.apache.keycloak.common.cloud.DefaultZkACLProvider}</str>";
	public static final String questionConfigurerPreSpan1Br12 = "\t</keycloakcloud>";
	public static final String questionConfigurerPreSpan1Br13 = "\t<shardHandlerFactory name=\"shardHandlerFactory\" class=\"HttpShardHandlerFactory\">";
	public static final String questionConfigurerPreSpan1Br14 = "\t\t<int name=\"socketTimeout\">${socketTimeout:600000}</int>";
	public static final String questionConfigurerPreSpan1Br15 = "\t\t<int name=\"connTimeout\">${connTimeout:60000}</int>";
	public static final String questionConfigurerPreSpan1Br16 = "\t</shardHandlerFactory>";
	public static final String questionConfigurerPreSpan1Br17 = "</keycloak>";
	public static final String questionConfigurerPreSpan1Br = questionConfigurerPreSpan1Br1 + questionConfigurerPreSpan1Br2 + questionConfigurerPreSpan1Br3 + questionConfigurerPreSpan1Br4 + questionConfigurerPreSpan1Br5 + questionConfigurerPreSpan1Br6 + questionConfigurerPreSpan1Br7 + questionConfigurerPreSpan1Br8 + questionConfigurerPreSpan1Br9 + questionConfigurerPreSpan1Br10 + questionConfigurerPreSpan1Br11 + questionConfigurerPreSpan1Br12 + questionConfigurerPreSpan1Br13 + questionConfigurerPreSpan1Br14 + questionConfigurerPreSpan1Br15 + questionConfigurerPreSpan1Br16 + questionConfigurerPreSpan1Br17;
	public static final String questionConfigurerPreSpan5Br1 = "' | tee /srv/keycloak/keycloak.xml";
	public static final String questionConfigurerPreSpan5Br = questionConfigurerPreSpan5Br1;
	public static final String questionConfigurerOl2Li011 = "echo '...': Write a string to the console. ";
	public static final String questionConfigurerOl2Li01 = questionConfigurerOl2Li011;
	public static final String questionConfigurerOl2Li061 = "|: Read the string into the following command. ";
	public static final String questionConfigurerOl2Li06 = questionConfigurerOl2Li061;
	public static final String questionConfigurerOl2Li071 = "tee: Write a string to a file. ";
	public static final String questionConfigurerOl2Li07 = questionConfigurerOl2Li071;
	public static final String questionConfigurerOl2Li081 = "/srv/keycloak/keycloak.xml: A new config file for Keycloak. ";
	public static final String questionConfigurerOl2Li08 = questionConfigurerOl2Li081;

	/**	L'entité « questionConfigurer »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionConfigurer = new PageHtml();
	public Couverture<PageHtml> questionConfigurerCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionConfigurer").o(questionConfigurer);

	/**	<br/>L'entité « questionConfigurer »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionConfigurer">Trouver l'entité questionConfigurer dans Solr</a>
	 * <br/>
	 * @param questionConfigurer est l'entité déjà construit. 
	 **/
	protected abstract void _questionConfigurer(PageHtml o);

	public PageHtml getQuestionConfigurer() {
		return questionConfigurer;
	}

	public void setQuestionConfigurer(PageHtml questionConfigurer) {
		this.questionConfigurer = questionConfigurer;
		this.questionConfigurerCouverture.dejaInitialise = true;
	}
	protected C001L011InstallerKeycloak questionConfigurerInit() {
		if(questionConfigurer != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionConfigurer, "questionConfigurer");
			((C001L011InstallerKeycloak)this).avantPagePart(questionConfigurer, "questionConfigurer");
		}
		if(!questionConfigurerCouverture.dejaInitialise) {
			_questionConfigurer(questionConfigurer);
		}
		questionConfigurer.initLoinPourClasse(requeteSite_);
		questionConfigurerCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
	}
	public void htmlBodyQuestionConfigurer(PageHtml o) {
		{ e("h3").a("class", " questionConfigurerH3 ").f();
			{ e("i").a("class", questionConfigurerH3I1, " site-menu-icon questionConfigurerH3I ").f();
			} g("i");
			{ e("span").a("class", " questionConfigurerH3Span ").f();
				sx(questionConfigurerH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionConfigurerH4 ").f();
			{ e("i").a("class", questionConfigurerH4I1, " site-menu-icon questionConfigurerH4I ").f();
			} g("i");
			{ e("span").a("class", " questionConfigurerH4Span ").f();
				sx(questionConfigurerH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionConfigurerPre ").f();
			{ e("span").a("class", " questionConfigurerPreSpan1 questionConfigurerPreSpan odd ").f();
				sx(questionConfigurerPreSpan11);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br1);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br2);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br3);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br4);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br5);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br6);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br7);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br8);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br9);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br10);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br11);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br12);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br13);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br14);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br15);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br16);
				e("br").fg();
				sx(questionConfigurerPreSpan1Br17);
			} g("span");
			{ e("span").a("class", " questionConfigurerPreSpan5 questionConfigurerPreSpan odd ").f();
				e("br").fg();
				sx(questionConfigurerPreSpan5Br1);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionConfigurerOl2 questionConfigurerOl even ").f();
			{ e("li").a("class", " questionConfigurerOl2Li01 questionConfigurerOl2Li odd ").f();
				sx(questionConfigurerOl2Li011);
			} g("li");
			{ e("li").a("class", " questionConfigurerOl2Li06 questionConfigurerOl2Li even ").f();
				sx(questionConfigurerOl2Li061);
			} g("li");
			{ e("li").a("class", " questionConfigurerOl2Li07 questionConfigurerOl2Li odd ").f();
				sx(questionConfigurerOl2Li071);
			} g("li");
			{ e("li").a("class", " questionConfigurerOl2Li08 questionConfigurerOl2Li even ").f();
				sx(questionConfigurerOl2Li081);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionConfigurer() {
		questionConfigurer.htmlAvant();
		htmlBodyQuestionConfigurer(questionConfigurer);
		questionConfigurer.htmlApres();
	}

	/////////////////////////////////
	// questionConfigurerConfigset //
	/////////////////////////////////

	public static final String questionConfigurerConfigsetH3I1 = "far fa-file-check";
	public static final String questionConfigurerConfigsetH3I = questionConfigurerConfigsetH3I1;
	public static final String questionConfigurerConfigsetH3Span1 = "How do I create a Keycloak configset for my site. ";
	public static final String questionConfigurerConfigsetH3Span = questionConfigurerConfigsetH3Span1;
	public static final String questionConfigurerConfigsetH4I1 = "far fa-hand-receiving";
	public static final String questionConfigurerConfigsetH4I = questionConfigurerConfigsetH4I1;
	public static final String questionConfigurerConfigsetH4Span1 = "Try out my own favorite configset from my opensource project computate. ";
	public static final String questionConfigurerConfigsetH4Span = questionConfigurerConfigsetH4Span1;
	public static final String questionConfigurerConfigsetPre1Span011 = "git";
	public static final String questionConfigurerConfigsetPre1Span01 = questionConfigurerConfigsetPre1Span011;
	public static final String questionConfigurerConfigsetPre1Span021 = " clone";
	public static final String questionConfigurerConfigsetPre1Span02 = questionConfigurerConfigsetPre1Span021;
	public static final String questionConfigurerConfigsetPre1Span031 = " https://github.com/computate/computate.git";
	public static final String questionConfigurerConfigsetPre1Span03 = questionConfigurerConfigsetPre1Span031;
	public static final String questionConfigurerConfigsetPre1Span04Span11 = " /srv/keycloak/server/keycloak/configsets/";
	public static final String questionConfigurerConfigsetPre1Span04Span12 = "computate";
	public static final String questionConfigurerConfigsetPre1Span04Span1 = questionConfigurerConfigsetPre1Span04Span11 + questionConfigurerConfigsetPre1Span04Span12;
	public static final String questionConfigurerConfigsetOl1Li011 = "git";
	public static final String questionConfigurerConfigsetOl1Li01 = questionConfigurerConfigsetOl1Li011;
	public static final String questionConfigurerConfigsetOl1Li021 = "clone";
	public static final String questionConfigurerConfigsetOl1Li02 = questionConfigurerConfigsetOl1Li021;
	public static final String questionConfigurerConfigsetOl1Li031 = "https://github.com/computate/computate.git: The open source git repository that is the base of all my work. ";
	public static final String questionConfigurerConfigsetOl1Li03 = questionConfigurerConfigsetOl1Li031;
	public static final String questionConfigurerConfigsetOl1Li04Span11 = "/srv/keycloak/server/keycloak/configsets/";
	public static final String questionConfigurerConfigsetOl1Li04Span1 = questionConfigurerConfigsetOl1Li04Span11;
	public static final String questionConfigurerConfigsetOl1Li04Span21 = "computate";
	public static final String questionConfigurerConfigsetOl1Li04Span2 = questionConfigurerConfigsetOl1Li04Span21;
	public static final String questionConfigurerConfigsetOl1Li04Span31 = ": The directory for the computate Keycloak configset. ";
	public static final String questionConfigurerConfigsetOl1Li04Span3 = questionConfigurerConfigsetOl1Li04Span31;
	public static final String questionConfigurerConfigsetPre2Span011 = "(cd";
	public static final String questionConfigurerConfigsetPre2Span01 = questionConfigurerConfigsetPre2Span011;
	public static final String questionConfigurerConfigsetPre2Span021 = " /srv/keycloak/server/keycloak/configsets/computate/";
	public static final String questionConfigurerConfigsetPre2Span02 = questionConfigurerConfigsetPre2Span021;
	public static final String questionConfigurerConfigsetPre2Span031 = " &&";
	public static final String questionConfigurerConfigsetPre2Span03 = questionConfigurerConfigsetPre2Span031;
	public static final String questionConfigurerConfigsetPre2Span041 = " git";
	public static final String questionConfigurerConfigsetPre2Span04 = questionConfigurerConfigsetPre2Span041;
	public static final String questionConfigurerConfigsetPre2Span051 = " filter-branch";
	public static final String questionConfigurerConfigsetPre2Span05 = questionConfigurerConfigsetPre2Span051;
	public static final String questionConfigurerConfigsetPre2Span061 = " --subdirectory-filter";
	public static final String questionConfigurerConfigsetPre2Span06 = questionConfigurerConfigsetPre2Span061;
	public static final String questionConfigurerConfigsetPre2Span071 = " config/keycloak/server/keycloak/configsets/computate";
	public static final String questionConfigurerConfigsetPre2Span07 = questionConfigurerConfigsetPre2Span071;
	public static final String questionConfigurerConfigsetPre2Span081 = " HEAD)";
	public static final String questionConfigurerConfigsetPre2Span08 = questionConfigurerConfigsetPre2Span081;
	public static final String questionConfigurerConfigsetOl2Li011 = "(cd";
	public static final String questionConfigurerConfigsetOl2Li01 = questionConfigurerConfigsetOl2Li011;
	public static final String questionConfigurerConfigsetOl2Li02Span11 = "/srv/keycloak/server/keycloak/configsets/";
	public static final String questionConfigurerConfigsetOl2Li02Span1 = questionConfigurerConfigsetOl2Li02Span11;
	public static final String questionConfigurerConfigsetOl2Li02Span21 = "computate";
	public static final String questionConfigurerConfigsetOl2Li02Span2 = questionConfigurerConfigsetOl2Li02Span21;
	public static final String questionConfigurerConfigsetOl2Li031 = "&&";
	public static final String questionConfigurerConfigsetOl2Li03 = questionConfigurerConfigsetOl2Li031;
	public static final String questionConfigurerConfigsetOl2Li041 = "git";
	public static final String questionConfigurerConfigsetOl2Li04 = questionConfigurerConfigsetOl2Li041;
	public static final String questionConfigurerConfigsetOl2Li051 = "filter-branch: Rewrite the branch, applying custom filters on each revision. ";
	public static final String questionConfigurerConfigsetOl2Li05 = questionConfigurerConfigsetOl2Li051;
	public static final String questionConfigurerConfigsetOl2Li061 = "--subdirectory-filter: Only look at the history which touches the given subdirectory. ";
	public static final String questionConfigurerConfigsetOl2Li06 = questionConfigurerConfigsetOl2Li061;
	public static final String questionConfigurerConfigsetOl2Li071 = "config/keycloak/server/keycloak/configsets/computate: My favorite configset to use in Keycloak. ";
	public static final String questionConfigurerConfigsetOl2Li07 = questionConfigurerConfigsetOl2Li071;
	public static final String questionConfigurerConfigsetOl2Li081 = "HEAD): The current HEAD revision to filter. ";
	public static final String questionConfigurerConfigsetOl2Li08 = questionConfigurerConfigsetOl2Li081;

	/**	L'entité « questionConfigurerConfigset »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionConfigurerConfigset = new PageHtml();
	public Couverture<PageHtml> questionConfigurerConfigsetCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionConfigurerConfigset").o(questionConfigurerConfigset);

	/**	<br/>L'entité « questionConfigurerConfigset »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionConfigurerConfigset">Trouver l'entité questionConfigurerConfigset dans Solr</a>
	 * <br/>
	 * @param questionConfigurerConfigset est l'entité déjà construit. 
	 **/
	protected abstract void _questionConfigurerConfigset(PageHtml o);

	public PageHtml getQuestionConfigurerConfigset() {
		return questionConfigurerConfigset;
	}

	public void setQuestionConfigurerConfigset(PageHtml questionConfigurerConfigset) {
		this.questionConfigurerConfigset = questionConfigurerConfigset;
		this.questionConfigurerConfigsetCouverture.dejaInitialise = true;
	}
	protected C001L011InstallerKeycloak questionConfigurerConfigsetInit() {
		if(questionConfigurerConfigset != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionConfigurerConfigset, "questionConfigurerConfigset");
			((C001L011InstallerKeycloak)this).avantPagePart(questionConfigurerConfigset, "questionConfigurerConfigset");
		}
		if(!questionConfigurerConfigsetCouverture.dejaInitialise) {
			_questionConfigurerConfigset(questionConfigurerConfigset);
		}
		questionConfigurerConfigset.initLoinPourClasse(requeteSite_);
		questionConfigurerConfigsetCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
	}
	public void htmlBodyQuestionConfigurerConfigset(PageHtml o) {
		{ e("h3").a("class", " questionConfigurerConfigsetH3 ").f();
			{ e("i").a("class", questionConfigurerConfigsetH3I1, " site-menu-icon questionConfigurerConfigsetH3I ").f();
			} g("i");
			{ e("span").a("class", " questionConfigurerConfigsetH3Span ").f();
				sx(questionConfigurerConfigsetH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionConfigurerConfigsetH4 ").f();
			{ e("i").a("class", questionConfigurerConfigsetH4I1, " site-menu-icon questionConfigurerConfigsetH4I ").f();
			} g("i");
			{ e("span").a("class", " questionConfigurerConfigsetH4Span ").f();
				sx(questionConfigurerConfigsetH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionConfigurerConfigsetPre1 questionConfigurerConfigsetPre odd ").f();
			{ e("span").a("class", " questionConfigurerConfigsetPre1Span01 questionConfigurerConfigsetPre1Span odd ").f();
				sx(questionConfigurerConfigsetPre1Span011);
			} g("span");
			{ e("span").a("class", " questionConfigurerConfigsetPre1Span02 questionConfigurerConfigsetPre1Span even ").f();
				sx(questionConfigurerConfigsetPre1Span021);
			} g("span");
			{ e("span").a("class", " questionConfigurerConfigsetPre1Span03 questionConfigurerConfigsetPre1Span odd ").f();
				sx(questionConfigurerConfigsetPre1Span031);
			} g("span");
			{ e("span").a("class", " questionConfigurerConfigsetPre1Span04 questionConfigurerConfigsetPre1Span even ").f();
				{ e("span").a("class", " questionConfigurerConfigsetPre1Span04Span1 questionConfigurerConfigsetPre1Span odd ").f();
					sx(questionConfigurerConfigsetPre1Span04Span11);
					sx(utilisateurId == null ? questionConfigurerConfigsetPre1Span04Span12 : keycloakConfigset);
				} g("span");
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionConfigurerConfigsetOl1 questionConfigurerConfigsetOl odd ").f();
			{ e("li").a("class", " questionConfigurerConfigsetOl1Li01 questionConfigurerConfigsetOl1Li odd ").f();
				sx(questionConfigurerConfigsetOl1Li011);
			} g("li");
			{ e("li").a("class", " questionConfigurerConfigsetOl1Li02 questionConfigurerConfigsetOl1Li even ").f();
				sx(questionConfigurerConfigsetOl1Li021);
			} g("li");
			{ e("li").a("class", " questionConfigurerConfigsetOl1Li03 questionConfigurerConfigsetOl1Li odd ").f();
				sx(questionConfigurerConfigsetOl1Li031);
			} g("li");
			{ e("li").a("class", " questionConfigurerConfigsetOl1Li04 questionConfigurerConfigsetOl1Li even ").f();
				{ e("span").a("class", " questionConfigurerConfigsetOl1Li04Span1 questionConfigurerConfigsetOl1Li odd ").f();
					sx(questionConfigurerConfigsetOl1Li04Span11);
				} g("span");
				{ e("span").a("class", " questionConfigurerConfigsetOl1Li04Span2 questionConfigurerConfigsetOl1Li even ").f();
					sx(utilisateurId == null ? questionConfigurerConfigsetOl1Li04Span21 : keycloakConfigset);
				} g("span");
				{ e("span").a("class", " questionConfigurerConfigsetOl1Li04Span3 questionConfigurerConfigsetOl1Li odd ").f();
					sx(questionConfigurerConfigsetOl1Li04Span31);
				} g("span");
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionConfigurerConfigsetPre2 questionConfigurerConfigsetPre even ").f();
			{ e("span").a("class", " questionConfigurerConfigsetPre2Span01 questionConfigurerConfigsetPre2Span odd ").f();
				sx(questionConfigurerConfigsetPre2Span011);
			} g("span");
			{ e("span").a("class", " questionConfigurerConfigsetPre2Span02 questionConfigurerConfigsetPre2Span even ").f();
				sx(questionConfigurerConfigsetPre2Span021);
			} g("span");
			{ e("span").a("class", " questionConfigurerConfigsetPre2Span03 questionConfigurerConfigsetPre2Span odd ").f();
				sx(questionConfigurerConfigsetPre2Span031);
			} g("span");
			{ e("span").a("class", " questionConfigurerConfigsetPre2Span04 questionConfigurerConfigsetPre2Span even ").f();
				sx(questionConfigurerConfigsetPre2Span041);
			} g("span");
			{ e("span").a("class", " questionConfigurerConfigsetPre2Span05 questionConfigurerConfigsetPre2Span odd ").f();
				sx(questionConfigurerConfigsetPre2Span051);
			} g("span");
			{ e("span").a("class", " questionConfigurerConfigsetPre2Span06 questionConfigurerConfigsetPre2Span even ").f();
				sx(questionConfigurerConfigsetPre2Span061);
			} g("span");
			{ e("span").a("class", " questionConfigurerConfigsetPre2Span07 questionConfigurerConfigsetPre2Span odd ").f();
				sx(questionConfigurerConfigsetPre2Span071);
			} g("span");
			{ e("span").a("class", " questionConfigurerConfigsetPre2Span08 questionConfigurerConfigsetPre2Span even ").f();
				sx(questionConfigurerConfigsetPre2Span081);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionConfigurerConfigsetOl2 questionConfigurerConfigsetOl even ").f();
			{ e("li").a("class", " questionConfigurerConfigsetOl2Li01 questionConfigurerConfigsetOl2Li odd ").f();
				sx(questionConfigurerConfigsetOl2Li011);
			} g("li");
			{ e("li").a("class", " questionConfigurerConfigsetOl2Li02 questionConfigurerConfigsetOl2Li even ").f();
				{ e("span").a("class", " questionConfigurerConfigsetOl2Li02Span1 questionConfigurerConfigsetOl2Li odd ").f();
					sx(utilisateurId == null ? questionConfigurerConfigsetOl2Li02Span11 : keycloakConfigset);
				} g("span");
				{ e("span").a("class", " questionConfigurerConfigsetOl2Li02Span2 questionConfigurerConfigsetOl2Li even ").f();
					sx(utilisateurId == null ? questionConfigurerConfigsetOl2Li02Span21 : keycloakConfigset);
				} g("span");
			} g("li");
			{ e("li").a("class", " questionConfigurerConfigsetOl2Li03 questionConfigurerConfigsetOl2Li odd ").f();
				sx(questionConfigurerConfigsetOl2Li031);
			} g("li");
			{ e("li").a("class", " questionConfigurerConfigsetOl2Li04 questionConfigurerConfigsetOl2Li even ").f();
				sx(questionConfigurerConfigsetOl2Li041);
			} g("li");
			{ e("li").a("class", " questionConfigurerConfigsetOl2Li05 questionConfigurerConfigsetOl2Li odd ").f();
				sx(questionConfigurerConfigsetOl2Li051);
			} g("li");
			{ e("li").a("class", " questionConfigurerConfigsetOl2Li06 questionConfigurerConfigsetOl2Li even ").f();
				sx(questionConfigurerConfigsetOl2Li061);
			} g("li");
			{ e("li").a("class", " questionConfigurerConfigsetOl2Li07 questionConfigurerConfigsetOl2Li odd ").f();
				sx(questionConfigurerConfigsetOl2Li071);
			} g("li");
			{ e("li").a("class", " questionConfigurerConfigsetOl2Li08 questionConfigurerConfigsetOl2Li even ").f();
				sx(questionConfigurerConfigsetOl2Li081);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionConfigurerConfigset() {
		questionConfigurerConfigset.htmlAvant();
		htmlBodyQuestionConfigurerConfigset(questionConfigurerConfigset);
		questionConfigurerConfigset.htmlApres();
	}

	///////////////////////////////
	// questionConfigsetKeycloak //
	///////////////////////////////

	public static final String questionConfigsetKeycloakH3I1 = "far fa-cloud-upload-alt";
	public static final String questionConfigsetKeycloakH3I = questionConfigsetKeycloakH3I1;
	public static final String questionConfigsetKeycloakH3Span1 = "How do I upload my Keycloak configset to Keycloak? ";
	public static final String questionConfigsetKeycloakH3Span = questionConfigsetKeycloakH3Span1;
	public static final String questionConfigsetKeycloakH4I1 = "far fa-file-upload";
	public static final String questionConfigsetKeycloakH4I = questionConfigsetKeycloakH4I1;
	public static final String questionConfigsetKeycloakH4Span1 = "Use the keycloak zk upconfig command. ";
	public static final String questionConfigsetKeycloakH4Span = questionConfigsetKeycloakH4Span1;
	public static final String questionConfigsetKeycloakPre1Span011 = "/srv/keycloak/bin/keycloak";
	public static final String questionConfigsetKeycloakPre1Span01 = questionConfigsetKeycloakPre1Span011;
	public static final String questionConfigsetKeycloakPre1Span021 = " zk";
	public static final String questionConfigsetKeycloakPre1Span02 = questionConfigsetKeycloakPre1Span021;
	public static final String questionConfigsetKeycloakPre1Span031 = " upconfig";
	public static final String questionConfigsetKeycloakPre1Span03 = questionConfigsetKeycloakPre1Span031;
	public static final String questionConfigsetKeycloakPre1Span04Span11 = " -n ";
	public static final String questionConfigsetKeycloakPre1Span04Span1 = questionConfigsetKeycloakPre1Span04Span11;
	public static final String questionConfigsetKeycloakPre1Span04Span21 = "computate";
	public static final String questionConfigsetKeycloakPre1Span04Span2 = questionConfigsetKeycloakPre1Span04Span21;
	public static final String questionConfigsetKeycloakPre1Span05Span11 = " -d /srv/keycloak/server/keycloak/configsets/";
	public static final String questionConfigsetKeycloakPre1Span05Span1 = questionConfigsetKeycloakPre1Span05Span11;
	public static final String questionConfigsetKeycloakPre1Span05Span21 = "computate";
	public static final String questionConfigsetKeycloakPre1Span05Span2 = questionConfigsetKeycloakPre1Span05Span21;
	public static final String questionConfigsetKeycloakOl1Li011 = "/srv/keycloak/bin/keycloak: The keycloak executable binary. ";
	public static final String questionConfigsetKeycloakOl1Li01 = questionConfigsetKeycloakOl1Li011;
	public static final String questionConfigsetKeycloakOl1Li021 = "zk: Perform a keycloak operation with Keycloak configsets. ";
	public static final String questionConfigsetKeycloakOl1Li02 = questionConfigsetKeycloakOl1Li021;
	public static final String questionConfigsetKeycloakOl1Li031 = "upconfig: Upload a Keycloak configset to keycloak. ";
	public static final String questionConfigsetKeycloakOl1Li03 = questionConfigsetKeycloakOl1Li031;
	public static final String questionConfigsetKeycloakOl1Li04Span11 = "-n ";
	public static final String questionConfigsetKeycloakOl1Li04Span1 = questionConfigsetKeycloakOl1Li04Span11;
	public static final String questionConfigsetKeycloakOl1Li04Span21 = "computate";
	public static final String questionConfigsetKeycloakOl1Li04Span2 = questionConfigsetKeycloakOl1Li04Span21;
	public static final String questionConfigsetKeycloakOl1Li04Span31 = ": The name of the Keycloak configset. ";
	public static final String questionConfigsetKeycloakOl1Li04Span3 = questionConfigsetKeycloakOl1Li04Span31;

	/**	L'entité « questionConfigsetKeycloak »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionConfigsetKeycloak = new PageHtml();
	public Couverture<PageHtml> questionConfigsetKeycloakCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionConfigsetKeycloak").o(questionConfigsetKeycloak);

	/**	<br/>L'entité « questionConfigsetKeycloak »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionConfigsetKeycloak">Trouver l'entité questionConfigsetKeycloak dans Solr</a>
	 * <br/>
	 * @param questionConfigsetKeycloak est l'entité déjà construit. 
	 **/
	protected abstract void _questionConfigsetKeycloak(PageHtml o);

	public PageHtml getQuestionConfigsetKeycloak() {
		return questionConfigsetKeycloak;
	}

	public void setQuestionConfigsetKeycloak(PageHtml questionConfigsetKeycloak) {
		this.questionConfigsetKeycloak = questionConfigsetKeycloak;
		this.questionConfigsetKeycloakCouverture.dejaInitialise = true;
	}
	protected C001L011InstallerKeycloak questionConfigsetKeycloakInit() {
		if(questionConfigsetKeycloak != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionConfigsetKeycloak, "questionConfigsetKeycloak");
			((C001L011InstallerKeycloak)this).avantPagePart(questionConfigsetKeycloak, "questionConfigsetKeycloak");
		}
		if(!questionConfigsetKeycloakCouverture.dejaInitialise) {
			_questionConfigsetKeycloak(questionConfigsetKeycloak);
		}
		questionConfigsetKeycloak.initLoinPourClasse(requeteSite_);
		questionConfigsetKeycloakCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
	}
	public void htmlBodyQuestionConfigsetKeycloak(PageHtml o) {
		{ e("h3").a("class", " questionConfigsetKeycloakH3 ").f();
			{ e("i").a("class", questionConfigsetKeycloakH3I1, " site-menu-icon questionConfigsetKeycloakH3I ").f();
			} g("i");
			{ e("span").a("class", " questionConfigsetKeycloakH3Span ").f();
				sx(questionConfigsetKeycloakH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionConfigsetKeycloakH4 ").f();
			{ e("i").a("class", questionConfigsetKeycloakH4I1, " site-menu-icon questionConfigsetKeycloakH4I ").f();
			} g("i");
			{ e("span").a("class", " questionConfigsetKeycloakH4Span ").f();
				sx(questionConfigsetKeycloakH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionConfigsetKeycloakPre1 questionConfigsetKeycloakPre odd ").f();
			{ e("span").a("class", " questionConfigsetKeycloakPre1Span01 questionConfigsetKeycloakPre1Span odd ").f();
				sx(questionConfigsetKeycloakPre1Span011);
			} g("span");
			{ e("span").a("class", " questionConfigsetKeycloakPre1Span02 questionConfigsetKeycloakPre1Span even ").f();
				sx(questionConfigsetKeycloakPre1Span021);
			} g("span");
			{ e("span").a("class", " questionConfigsetKeycloakPre1Span03 questionConfigsetKeycloakPre1Span odd ").f();
				sx(questionConfigsetKeycloakPre1Span031);
			} g("span");
			{ e("span").a("class", " questionConfigsetKeycloakPre1Span04 questionConfigsetKeycloakPre1Span even ").f();
				{ e("span").a("class", " questionConfigsetKeycloakPre1Span04Span1 questionConfigsetKeycloakPre1Span odd ").f();
					sx(questionConfigsetKeycloakPre1Span04Span11);
				} g("span");
				{ e("span").a("class", " questionConfigsetKeycloakPre1Span04Span2 questionConfigsetKeycloakPre1Span even ").f();
					sx(utilisateurId == null ? questionConfigsetKeycloakPre1Span04Span21 : keycloakConfigset);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionConfigsetKeycloakPre1Span05 questionConfigsetKeycloakPre1Span odd ").f();
				{ e("span").a("class", " questionConfigsetKeycloakPre1Span05Span1 questionConfigsetKeycloakPre1Span odd ").f();
					sx(questionConfigsetKeycloakPre1Span05Span11);
				} g("span");
				{ e("span").a("class", " questionConfigsetKeycloakPre1Span05Span2 questionConfigsetKeycloakPre1Span even ").f();
					sx(utilisateurId == null ? questionConfigsetKeycloakPre1Span05Span21 : keycloakConfigset);
				} g("span");
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionConfigsetKeycloakOl1 questionConfigsetKeycloakOl odd ").f();
			{ e("li").a("class", " questionConfigsetKeycloakOl1Li01 questionConfigsetKeycloakOl1Li odd ").f();
				sx(questionConfigsetKeycloakOl1Li011);
			} g("li");
			{ e("li").a("class", " questionConfigsetKeycloakOl1Li02 questionConfigsetKeycloakOl1Li even ").f();
				sx(questionConfigsetKeycloakOl1Li021);
			} g("li");
			{ e("li").a("class", " questionConfigsetKeycloakOl1Li03 questionConfigsetKeycloakOl1Li odd ").f();
				sx(questionConfigsetKeycloakOl1Li031);
			} g("li");
			{ e("li").a("class", " questionConfigsetKeycloakOl1Li04 questionConfigsetKeycloakOl1Li even ").f();
				{ e("span").a("class", " questionConfigsetKeycloakOl1Li04Span1 questionConfigsetKeycloakOl1Li odd ").f();
					sx(questionConfigsetKeycloakOl1Li04Span11);
				} g("span");
				{ e("span").a("class", " questionConfigsetKeycloakOl1Li04Span2 questionConfigsetKeycloakOl1Li even ").f();
					sx(utilisateurId == null ? questionConfigsetKeycloakOl1Li04Span21 : keycloakConfigset);
				} g("span");
				{ e("span").a("class", " questionConfigsetKeycloakOl1Li04Span3 questionConfigsetKeycloakOl1Li odd ").f();
					sx(questionConfigsetKeycloakOl1Li04Span31);
				} g("span");
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionConfigsetKeycloak() {
		questionConfigsetKeycloak.htmlAvant();
		htmlBodyQuestionConfigsetKeycloak(questionConfigsetKeycloak);
		questionConfigsetKeycloak.htmlApres();
	}

	/////////////////////
	// questionService //
	/////////////////////

	public static final String questionServiceH3I1 = "far fa-alarm-clock";
	public static final String questionServiceH3I = questionServiceH3I1;
	public static final String questionServiceH3Span1 = "How do I run Keycloak all the time, when my computer starts up? ";
	public static final String questionServiceH3Span = questionServiceH3Span1;
	public static final String questionServiceH4I1 = "far fa-layer-plus";
	public static final String questionServiceH4I = questionServiceH4I1;
	public static final String questionServiceH4Span1 = "How to run Keycloak as a systemd service. ";
	public static final String questionServiceH4Span = questionServiceH4Span1;
	public static final String questionServicePreSpan11 = "echo '";
	public static final String questionServicePreSpan1 = questionServicePreSpan11;
	public static final String questionServicePreSpan1Br1 = "[Unit]";
	public static final String questionServicePreSpan1Br = questionServicePreSpan1Br1;
	public static final String questionServicePreSpan2Br1 = "Description=A powerful open source search engine. ";
	public static final String questionServicePreSpan2Br = questionServicePreSpan2Br1;
	public static final String questionServicePreSpan3Br1 = "After=network.target";
	public static final String questionServicePreSpan3Br2 = "";
	public static final String questionServicePreSpan3Br3 = "[Service]";
	public static final String questionServicePreSpan3Br4 = "Type=forking";
	public static final String questionServicePreSpan3Br5 = "User='\"$USER\"'";
	public static final String questionServicePreSpan3Br6 = "Group='\"$USER\"'";
	public static final String questionServicePreSpan3Br = questionServicePreSpan3Br1 + questionServicePreSpan3Br2 + questionServicePreSpan3Br3 + questionServicePreSpan3Br4 + questionServicePreSpan3Br5 + questionServicePreSpan3Br6;
	public static final String questionServicePreSpan4BrSpan11 = "ExecStart=/srv/keycloak/bin/keycloak -c -s /srv/keycloak -p ";
	public static final String questionServicePreSpan4BrSpan1 = questionServicePreSpan4BrSpan11;
	public static final String questionServicePreSpan4Span21 = "10380";
	public static final String questionServicePreSpan4Span2 = questionServicePreSpan4Span21;
	public static final String questionServicePreSpan5Br1 = "Restart=on-failure";
	public static final String questionServicePreSpan5Br2 = "";
	public static final String questionServicePreSpan5Br3 = "[Install]";
	public static final String questionServicePreSpan5Br4 = "WantedBy=multi-user.target";
	public static final String questionServicePreSpan5Br5 = "' | sudo tee /usr/lib/systemd/system/keycloak.service";
	public static final String questionServicePreSpan5Br = questionServicePreSpan5Br1 + questionServicePreSpan5Br2 + questionServicePreSpan5Br3 + questionServicePreSpan5Br4 + questionServicePreSpan5Br5;
	public static final String questionServiceOl2Li011 = "echo '...': Write a string to the console. ";
	public static final String questionServiceOl2Li01 = questionServiceOl2Li011;
	public static final String questionServiceOl2Li021 = "[Unit]: A unit configuration file whose name ends in \".service\" encodes information about a process controlled and supervised by systemd. ";
	public static final String questionServiceOl2Li02 = questionServiceOl2Li021;
	public static final String questionServiceOl2Li031 = "Description=...: The description of the service. ";
	public static final String questionServiceOl2Li03 = questionServiceOl2Li031;
	public static final String questionServiceOl2Li041 = "After=...: The Keycloak service will be started after the following dependencies. ";
	public static final String questionServiceOl2Li04 = questionServiceOl2Li041;
	public static final String questionServiceOl2Li051 = "[Service]: Information about a service controlled and supervised by systemd. ";
	public static final String questionServiceOl2Li05 = questionServiceOl2Li051;
	public static final String questionServiceOl2Li061 = "Type=forking: Because it is expected that the process configured with ExecStart= will call fork() as part of its start-up. ";
	public static final String questionServiceOl2Li06 = questionServiceOl2Li061;
	public static final String questionServiceOl2Li071 = "User=...: The user as the current user that will run the service. ";
	public static final String questionServiceOl2Li07 = questionServiceOl2Li071;
	public static final String questionServiceOl2Li081 = "Group=...: The group user as the current user that will run the service. ";
	public static final String questionServiceOl2Li08 = questionServiceOl2Li081;
	public static final String questionServiceOl2Li091 = "ExecStart=...: The Keycloak command that will start the service. ";
	public static final String questionServiceOl2Li09 = questionServiceOl2Li091;
	public static final String questionServiceOl2Li101 = "Restart=on-failure: Restart the service if it fails. ";
	public static final String questionServiceOl2Li10 = questionServiceOl2Li101;
	public static final String questionServiceOl2Li111 = "[Install]: This section is optional and is used to define the behavior or a unit if it is enabled or disabled. ";
	public static final String questionServiceOl2Li11 = questionServiceOl2Li111;
	public static final String questionServiceOl2Li121 = "WantedBy=multi-user.target: When the service is enabled, a directory called multi-user.target.wants will be created within /etc/systemd/system (if not already available) and a symbolic link to the current unit will be placed within. ";
	public static final String questionServiceOl2Li12 = questionServiceOl2Li121;
	public static final String questionServiceOl2Li131 = "|: Read the string into the following command. ";
	public static final String questionServiceOl2Li13 = questionServiceOl2Li131;
	public static final String questionServiceOl2Li141 = "sudo";
	public static final String questionServiceOl2Li14 = questionServiceOl2Li141;
	public static final String questionServiceOl2Li151 = "tee: Write a string to a file. ";
	public static final String questionServiceOl2Li15 = questionServiceOl2Li151;
	public static final String questionServiceOl2Li161 = "/usr/lib/systemd/system/keycloak.service: A new systemd service file to write to for Keycloak. ";
	public static final String questionServiceOl2Li16 = questionServiceOl2Li161;

	/**	L'entité « questionService »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionService = new PageHtml();
	public Couverture<PageHtml> questionServiceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionService").o(questionService);

	/**	<br/>L'entité « questionService »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionService">Trouver l'entité questionService dans Solr</a>
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
	protected C001L011InstallerKeycloak questionServiceInit() {
		if(questionService != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionService, "questionService");
			((C001L011InstallerKeycloak)this).avantPagePart(questionService, "questionService");
		}
		if(!questionServiceCouverture.dejaInitialise) {
			_questionService(questionService);
		}
		questionService.initLoinPourClasse(requeteSite_);
		questionServiceCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
			} g("span");
			{ e("span").a("class", " questionServicePreSpan4 questionServicePreSpan even ").f();
				e("br").fg();
				{ e("span").a("class", " questionServicePreSpan4Br questionServicePreSpan4Br  odd ").f();
					sx(questionServicePreSpan4BrSpan11);
				} g("span");
				{ e("span").a("class", " questionServicePreSpan4Span2 questionServicePreSpan4Span even ").f();
					sx(utilisateurId == null ? questionServicePreSpan4Span21 : keycloakPortClient);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionServicePreSpan5 questionServicePreSpan odd ").f();
				e("br").fg();
				sx(questionServicePreSpan5Br1);
				e("br").fg();
				sx(questionServicePreSpan5Br2);
				e("br").fg();
				sx(questionServicePreSpan5Br3);
				e("br").fg();
				sx(questionServicePreSpan5Br4);
				e("br").fg();
				sx(questionServicePreSpan5Br5);
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSystemctlDaemonReload">Trouver l'entité questionSystemctlDaemonReload dans Solr</a>
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
	protected C001L011InstallerKeycloak questionSystemctlDaemonReloadInit() {
		if(questionSystemctlDaemonReload != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionSystemctlDaemonReload, "questionSystemctlDaemonReload");
			((C001L011InstallerKeycloak)this).avantPagePart(questionSystemctlDaemonReload, "questionSystemctlDaemonReload");
		}
		if(!questionSystemctlDaemonReloadCouverture.dejaInitialise) {
			_questionSystemctlDaemonReload(questionSystemctlDaemonReload);
		}
		questionSystemctlDaemonReload.initLoinPourClasse(requeteSite_);
		questionSystemctlDaemonReloadCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
	public static final String questionSystemctlEnableH3Span1 = "How do I enable the Keycloak service? ";
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
	public static final String questionSystemctlEnablePreSpan41 = " keycloak";
	public static final String questionSystemctlEnablePreSpan4 = questionSystemctlEnablePreSpan41;
	public static final String questionSystemctlEnableOl2Li11 = "sudo";
	public static final String questionSystemctlEnableOl2Li1 = questionSystemctlEnableOl2Li11;
	public static final String questionSystemctlEnableOl2Li21 = "systemctl";
	public static final String questionSystemctlEnableOl2Li2 = questionSystemctlEnableOl2Li21;
	public static final String questionSystemctlEnableOl2Li31 = "enable: Enable one or more unit files or unit file instances. ";
	public static final String questionSystemctlEnableOl2Li3 = questionSystemctlEnableOl2Li31;
	public static final String questionSystemctlEnableOl2Li41 = "keycloak: Enable the Keycloak service to start when the computer starts. ";
	public static final String questionSystemctlEnableOl2Li4 = questionSystemctlEnableOl2Li41;

	/**	L'entité « questionSystemctlEnable »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlEnable = new PageHtml();
	public Couverture<PageHtml> questionSystemctlEnableCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlEnable").o(questionSystemctlEnable);

	/**	<br/>L'entité « questionSystemctlEnable »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSystemctlEnable">Trouver l'entité questionSystemctlEnable dans Solr</a>
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
	protected C001L011InstallerKeycloak questionSystemctlEnableInit() {
		if(questionSystemctlEnable != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionSystemctlEnable, "questionSystemctlEnable");
			((C001L011InstallerKeycloak)this).avantPagePart(questionSystemctlEnable, "questionSystemctlEnable");
		}
		if(!questionSystemctlEnableCouverture.dejaInitialise) {
			_questionSystemctlEnable(questionSystemctlEnable);
		}
		questionSystemctlEnable.initLoinPourClasse(requeteSite_);
		questionSystemctlEnableCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
	public static final String questionSystemctlStartH3Span1 = "How do I start the Keycloak service? ";
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
	public static final String questionSystemctlStartPreSpan41 = " keycloak";
	public static final String questionSystemctlStartPreSpan4 = questionSystemctlStartPreSpan41;
	public static final String questionSystemctlStartOl2Li11 = "sudo";
	public static final String questionSystemctlStartOl2Li1 = questionSystemctlStartOl2Li11;
	public static final String questionSystemctlStartOl2Li21 = "systemctl";
	public static final String questionSystemctlStartOl2Li2 = questionSystemctlStartOl2Li21;
	public static final String questionSystemctlStartOl2Li31 = "start: Start one or more services. ";
	public static final String questionSystemctlStartOl2Li3 = questionSystemctlStartOl2Li31;
	public static final String questionSystemctlStartOl2Li41 = "keycloak: Start the Keycloak service. ";
	public static final String questionSystemctlStartOl2Li4 = questionSystemctlStartOl2Li41;

	/**	L'entité « questionSystemctlStart »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlStart = new PageHtml();
	public Couverture<PageHtml> questionSystemctlStartCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlStart").o(questionSystemctlStart);

	/**	<br/>L'entité « questionSystemctlStart »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSystemctlStart">Trouver l'entité questionSystemctlStart dans Solr</a>
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
	protected C001L011InstallerKeycloak questionSystemctlStartInit() {
		if(questionSystemctlStart != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionSystemctlStart, "questionSystemctlStart");
			((C001L011InstallerKeycloak)this).avantPagePart(questionSystemctlStart, "questionSystemctlStart");
		}
		if(!questionSystemctlStartCouverture.dejaInitialise) {
			_questionSystemctlStart(questionSystemctlStart);
		}
		questionSystemctlStart.initLoinPourClasse(requeteSite_);
		questionSystemctlStartCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
	public static final String questionSystemctlStatusH3Span1 = "How do I make sure the Keycloak service started successfully? ";
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
	public static final String questionSystemctlStatusPreSpan41 = " keycloak";
	public static final String questionSystemctlStatusPreSpan4 = questionSystemctlStatusPreSpan41;
	public static final String questionSystemctlStatusOl2Li11 = "sudo";
	public static final String questionSystemctlStatusOl2Li1 = questionSystemctlStatusOl2Li11;
	public static final String questionSystemctlStatusOl2Li21 = "systemctl";
	public static final String questionSystemctlStatusOl2Li2 = questionSystemctlStatusOl2Li21;
	public static final String questionSystemctlStatusOl2Li31 = "status: Check the status of one or more services. ";
	public static final String questionSystemctlStatusOl2Li3 = questionSystemctlStatusOl2Li31;
	public static final String questionSystemctlStatusOl2Li41 = "keycloak: Check the status of the Keycloak service. ";
	public static final String questionSystemctlStatusOl2Li4 = questionSystemctlStatusOl2Li41;
	public static final String questionSystemctlStatusP21 = "And just like that, your Keycloak server is ready for client to connect and begin clustering. ";
	public static final String questionSystemctlStatusP22 = "In future lessons we will connect a search engine, as well as your web applications to Keycloak to allow them to scale. ";
	public static final String questionSystemctlStatusP2 = questionSystemctlStatusP21 + questionSystemctlStatusP22;

	/**	L'entité « questionSystemctlStatus »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlStatus = new PageHtml();
	public Couverture<PageHtml> questionSystemctlStatusCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlStatus").o(questionSystemctlStatus);

	/**	<br/>L'entité « questionSystemctlStatus »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionSystemctlStatus">Trouver l'entité questionSystemctlStatus dans Solr</a>
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
	protected C001L011InstallerKeycloak questionSystemctlStatusInit() {
		if(questionSystemctlStatus != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionSystemctlStatus, "questionSystemctlStatus");
			((C001L011InstallerKeycloak)this).avantPagePart(questionSystemctlStatus, "questionSystemctlStatus");
		}
		if(!questionSystemctlStatusCouverture.dejaInitialise) {
			_questionSystemctlStatus(questionSystemctlStatus);
		}
		questionSystemctlStatus.initLoinPourClasse(requeteSite_);
		questionSystemctlStatusCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
			sx(questionSystemctlStatusP22);
		} g("p");
	}
	public void htmlBodyQuestionSystemctlStatus() {
		questionSystemctlStatus.htmlAvant();
		htmlBodyQuestionSystemctlStatus(questionSystemctlStatus);
		questionSystemctlStatus.htmlApres();
	}

	/////////////////////////////////
	// questionCollectionsKeycloak //
	/////////////////////////////////

	public static final String questionCollectionsKeycloakH3I1 = "far fa-sliders-h-square";
	public static final String questionCollectionsKeycloakH3I = questionCollectionsKeycloakH3I1;
	public static final String questionCollectionsKeycloakH3Span1 = "How do I create Keycloak collections to begin indexing and searching my content? ";
	public static final String questionCollectionsKeycloakH3Span = questionCollectionsKeycloakH3Span1;
	public static final String questionCollectionsKeycloakH4I1 = "far fa-user-cog";
	public static final String questionCollectionsKeycloakH4I = questionCollectionsKeycloakH4I1;
	public static final String questionCollectionsKeycloakH4Span1 = "Create collections with the keycloak command. ";
	public static final String questionCollectionsKeycloakH4Span = questionCollectionsKeycloakH4Span1;
	public static final String questionCollectionsKeycloakPre1Span011 = "/srv/keycloak/bin/keycloak";
	public static final String questionCollectionsKeycloakPre1Span01 = questionCollectionsKeycloakPre1Span011;
	public static final String questionCollectionsKeycloakPre1Span021 = " create_collection";
	public static final String questionCollectionsKeycloakPre1Span02 = questionCollectionsKeycloakPre1Span021;
	public static final String questionCollectionsKeycloakPre1Span03Span11 = " -c ";
	public static final String questionCollectionsKeycloakPre1Span03Span1 = questionCollectionsKeycloakPre1Span03Span11;
	public static final String questionCollectionsKeycloakPre1Span03Span21 = "site";
	public static final String questionCollectionsKeycloakPre1Span03Span2 = questionCollectionsKeycloakPre1Span03Span21;
	public static final String questionCollectionsKeycloakPre1Span04Span11 = " -n ";
	public static final String questionCollectionsKeycloakPre1Span04Span1 = questionCollectionsKeycloakPre1Span04Span11;
	public static final String questionCollectionsKeycloakPre1Span04Span21 = "computate";
	public static final String questionCollectionsKeycloakPre1Span04Span2 = questionCollectionsKeycloakPre1Span04Span21;
	public static final String questionCollectionsKeycloakOl1Li011 = "/srv/keycloak/bin/keycloak";
	public static final String questionCollectionsKeycloakOl1Li01 = questionCollectionsKeycloakOl1Li011;
	public static final String questionCollectionsKeycloakOl1Li021 = "create_collection: A Keycloak collection";
	public static final String questionCollectionsKeycloakOl1Li02 = questionCollectionsKeycloakOl1Li021;
	public static final String questionCollectionsKeycloakOl1Li03Span11 = "-c ";
	public static final String questionCollectionsKeycloakOl1Li03Span1 = questionCollectionsKeycloakOl1Li03Span11;
	public static final String questionCollectionsKeycloakOl1Li03Span21 = "site";
	public static final String questionCollectionsKeycloakOl1Li03Span2 = questionCollectionsKeycloakOl1Li03Span21;
	public static final String questionCollectionsKeycloakOl1Li03Span31 = ": The name of the keycloak collection to create. ";
	public static final String questionCollectionsKeycloakOl1Li03Span3 = questionCollectionsKeycloakOl1Li03Span31;
	public static final String questionCollectionsKeycloakOl1Li04Span11 = "-n ";
	public static final String questionCollectionsKeycloakOl1Li04Span1 = questionCollectionsKeycloakOl1Li04Span11;
	public static final String questionCollectionsKeycloakOl1Li04Span21 = "computate";
	public static final String questionCollectionsKeycloakOl1Li04Span2 = questionCollectionsKeycloakOl1Li04Span21;
	public static final String questionCollectionsKeycloakOl1Li04Span31 = ": The name of the keycloak collection to create. ";
	public static final String questionCollectionsKeycloakOl1Li04Span3 = questionCollectionsKeycloakOl1Li04Span31;

	/**	L'entité « questionCollectionsKeycloak »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCollectionsKeycloak = new PageHtml();
	public Couverture<PageHtml> questionCollectionsKeycloakCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCollectionsKeycloak").o(questionCollectionsKeycloak);

	/**	<br/>L'entité « questionCollectionsKeycloak »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCollectionsKeycloak">Trouver l'entité questionCollectionsKeycloak dans Solr</a>
	 * <br/>
	 * @param questionCollectionsKeycloak est l'entité déjà construit. 
	 **/
	protected abstract void _questionCollectionsKeycloak(PageHtml o);

	public PageHtml getQuestionCollectionsKeycloak() {
		return questionCollectionsKeycloak;
	}

	public void setQuestionCollectionsKeycloak(PageHtml questionCollectionsKeycloak) {
		this.questionCollectionsKeycloak = questionCollectionsKeycloak;
		this.questionCollectionsKeycloakCouverture.dejaInitialise = true;
	}
	protected C001L011InstallerKeycloak questionCollectionsKeycloakInit() {
		if(questionCollectionsKeycloak != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionCollectionsKeycloak, "questionCollectionsKeycloak");
			((C001L011InstallerKeycloak)this).avantPagePart(questionCollectionsKeycloak, "questionCollectionsKeycloak");
		}
		if(!questionCollectionsKeycloakCouverture.dejaInitialise) {
			_questionCollectionsKeycloak(questionCollectionsKeycloak);
		}
		questionCollectionsKeycloak.initLoinPourClasse(requeteSite_);
		questionCollectionsKeycloakCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
	}
	public void htmlBodyQuestionCollectionsKeycloak(PageHtml o) {
		{ e("h3").a("class", " questionCollectionsKeycloakH3 ").f();
			{ e("i").a("class", questionCollectionsKeycloakH3I1, " site-menu-icon questionCollectionsKeycloakH3I ").f();
			} g("i");
			{ e("span").a("class", " questionCollectionsKeycloakH3Span ").f();
				sx(questionCollectionsKeycloakH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionCollectionsKeycloakH4 ").f();
			{ e("i").a("class", questionCollectionsKeycloakH4I1, " site-menu-icon questionCollectionsKeycloakH4I ").f();
			} g("i");
			{ e("span").a("class", " questionCollectionsKeycloakH4Span ").f();
				sx(questionCollectionsKeycloakH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionCollectionsKeycloakPre1 questionCollectionsKeycloakPre odd ").f();
			{ e("span").a("class", " questionCollectionsKeycloakPre1Span01 questionCollectionsKeycloakPre1Span odd ").f();
				sx(questionCollectionsKeycloakPre1Span011);
			} g("span");
			{ e("span").a("class", " questionCollectionsKeycloakPre1Span02 questionCollectionsKeycloakPre1Span even ").f();
				sx(questionCollectionsKeycloakPre1Span021);
			} g("span");
			{ e("span").a("class", " questionCollectionsKeycloakPre1Span03 questionCollectionsKeycloakPre1Span odd ").f();
				{ e("span").a("class", " questionCollectionsKeycloakPre1Span03Span1 questionCollectionsKeycloakPre1Span odd ").f();
					sx(questionCollectionsKeycloakPre1Span03Span11);
				} g("span");
				{ e("span").a("class", " questionCollectionsKeycloakPre1Span03Span2 questionCollectionsKeycloakPre1Span even ").f();
					sx(utilisateurId == null ? questionCollectionsKeycloakPre1Span03Span21 : keycloakCollection);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionCollectionsKeycloakPre1Span04 questionCollectionsKeycloakPre1Span even ").f();
				{ e("span").a("class", " questionCollectionsKeycloakPre1Span04Span1 questionCollectionsKeycloakPre1Span odd ").f();
					sx(questionCollectionsKeycloakPre1Span04Span11);
				} g("span");
				{ e("span").a("class", " questionCollectionsKeycloakPre1Span04Span2 questionCollectionsKeycloakPre1Span even ").f();
					sx(utilisateurId == null ? questionCollectionsKeycloakPre1Span04Span21 : keycloakConfigset);
				} g("span");
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCollectionsKeycloakOl1 questionCollectionsKeycloakOl odd ").f();
			{ e("li").a("class", " questionCollectionsKeycloakOl1Li01 questionCollectionsKeycloakOl1Li odd ").f();
				sx(questionCollectionsKeycloakOl1Li011);
			} g("li");
			{ e("li").a("class", " questionCollectionsKeycloakOl1Li02 questionCollectionsKeycloakOl1Li even ").f();
				sx(questionCollectionsKeycloakOl1Li021);
			} g("li");
			{ e("li").a("class", " questionCollectionsKeycloakOl1Li03 questionCollectionsKeycloakOl1Li odd ").f();
				{ e("span").a("class", " questionCollectionsKeycloakOl1Li03Span1 questionCollectionsKeycloakOl1Li odd ").f();
					sx(questionCollectionsKeycloakOl1Li03Span11);
				} g("span");
				{ e("span").a("class", " questionCollectionsKeycloakOl1Li03Span2 questionCollectionsKeycloakOl1Li even ").f();
					sx(utilisateurId == null ? questionCollectionsKeycloakOl1Li03Span21 : keycloakCollection);
				} g("span");
				{ e("span").a("class", " questionCollectionsKeycloakOl1Li03Span3 questionCollectionsKeycloakOl1Li odd ").f();
					sx(questionCollectionsKeycloakOl1Li03Span31);
				} g("span");
			} g("li");
			{ e("li").a("class", " questionCollectionsKeycloakOl1Li04 questionCollectionsKeycloakOl1Li even ").f();
				{ e("span").a("class", " questionCollectionsKeycloakOl1Li04Span1 questionCollectionsKeycloakOl1Li odd ").f();
					sx(questionCollectionsKeycloakOl1Li04Span11);
				} g("span");
				{ e("span").a("class", " questionCollectionsKeycloakOl1Li04Span2 questionCollectionsKeycloakOl1Li even ").f();
					sx(utilisateurId == null ? questionCollectionsKeycloakOl1Li04Span21 : keycloakCollection);
				} g("span");
				{ e("span").a("class", " questionCollectionsKeycloakOl1Li04Span3 questionCollectionsKeycloakOl1Li odd ").f();
					sx(questionCollectionsKeycloakOl1Li04Span31);
				} g("span");
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionCollectionsKeycloak() {
		questionCollectionsKeycloak.htmlAvant();
		htmlBodyQuestionCollectionsKeycloak(questionCollectionsKeycloak);
		questionCollectionsKeycloak.htmlApres();
	}

	///////////////////
	// questionLiens //
	///////////////////

	public static final String questionLiensH3I1 = "far fa-file-search";
	public static final String questionLiensH3I = questionLiensH3I1;
	public static final String questionLiensH3Span1 = "Where can I go once I have installed a Keycloak server? ";
	public static final String questionLiensH3Span = questionLiensH3Span1;
	public static final String questionLiensH4I1 = "far fa-list";
	public static final String questionLiensH4I = questionLiensH4I1;
	public static final String questionLiensH4Span1 = "Here are some useful URLs related to your Keycloak server. ";
	public static final String questionLiensH4Span = questionLiensH4Span1;
	public static final String questionLiensUlLi1A1 = "http://localhost:10380/keycloak/#/";
	public static final String questionLiensUlLi1A = questionLiensUlLi1A1;
	public static final String questionLiensUlLi1Span1 = "The link to the Keycloak dashboard, for information about your running Keycloak server. ";
	public static final String questionLiensUlLi1Span = questionLiensUlLi1Span1;
	public static final String questionLiensUlLi2A1 = "http://localhost:10380/keycloak/#/site/query";
	public static final String questionLiensUlLi2A = questionLiensUlLi2A1;
	public static final String questionLiensUlLi2Span1 = "A page for querying the search results for your site index. ";
	public static final String questionLiensUlLi2Span = questionLiensUlLi2Span1;

	/**	L'entité « questionLiens »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionLiens = new PageHtml();
	public Couverture<PageHtml> questionLiensCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionLiens").o(questionLiens);

	/**	<br/>L'entité « questionLiens »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionLiens">Trouver l'entité questionLiens dans Solr</a>
	 * <br/>
	 * @param questionLiens est l'entité déjà construit. 
	 **/
	protected abstract void _questionLiens(PageHtml o);

	public PageHtml getQuestionLiens() {
		return questionLiens;
	}

	public void setQuestionLiens(PageHtml questionLiens) {
		this.questionLiens = questionLiens;
		this.questionLiensCouverture.dejaInitialise = true;
	}
	protected C001L011InstallerKeycloak questionLiensInit() {
		if(questionLiens != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(questionLiens, "questionLiens");
			((C001L011InstallerKeycloak)this).avantPagePart(questionLiens, "questionLiens");
		}
		if(!questionLiensCouverture.dejaInitialise) {
			_questionLiens(questionLiens);
		}
		questionLiens.initLoinPourClasse(requeteSite_);
		questionLiensCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
	}
	public void htmlBodyQuestionLiens(PageHtml o) {
		{ e("h3").a("class", " questionLiensH3 ").f();
			{ e("i").a("class", questionLiensH3I1, " site-menu-icon questionLiensH3I ").f();
			} g("i");
			{ e("span").a("class", " questionLiensH3Span ").f();
				sx(questionLiensH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionLiensH4 ").f();
			{ e("i").a("class", questionLiensH4I1, " site-menu-icon questionLiensH4I ").f();
			} g("i");
			{ e("span").a("class", " questionLiensH4Span ").f();
				sx(questionLiensH4Span1);
			} g("span");
		} g("h4");
		{ e("ul").a("class", " questionLiensUl ").f();
			{ e("li").a("class", " questionLiensUlLi1 questionLiensUlLi odd ").f();
				{ e("a").a("class", " questionLiensUlLi1A ").a("href", questionLiensUlLi1A1).f();
					sx(questionLiensUlLi1A1);
				} g("a");
				{ e("span").a("class", " questionLiensUlLi1Span ").f();
					sx(questionLiensUlLi1Span1);
				} g("span");
			} g("li");
			{ e("li").a("class", " questionLiensUlLi2 questionLiensUlLi even ").f();
				{ e("a").a("class", " questionLiensUlLi2A ").a("href", questionLiensUlLi2A1).f();
					sx(questionLiensUlLi2A1);
				} g("a");
				{ e("span").a("class", " questionLiensUlLi2Span ").f();
					sx(questionLiensUlLi2Span1);
				} g("span");
			} g("li");
		} g("ul");
	}
	public void htmlBodyQuestionLiens() {
		questionLiens.htmlAvant();
		htmlBodyQuestionLiens(questionLiens);
		questionLiens.htmlApres();
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
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
	protected C001L011InstallerKeycloak recapituler1Init() {
		if(recapituler1 != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(recapituler1, "recapituler1");
			((C001L011InstallerKeycloak)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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

	public static final String recapituler2TableTr1Td11 = "Monday ";
	public static final String recapituler2TableTr1Td1 = recapituler2TableTr1Td11;
	public static final String recapituler2TableTr1Td2I1 = "far fa-fast-forward";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "far fa-file-code";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "far fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "June 3 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "How do I try out clustered configuration, requests, events and shared data sources in development? ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "Install Keycloak from the source code. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
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
	protected C001L011InstallerKeycloak recapituler2Init() {
		if(recapituler2 != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(recapituler2, "recapituler2");
			((C001L011InstallerKeycloak)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
	public static final String recapituler3TableTr02Td21 = "How do I install the dependencies for Keycloak? ";
	public static final String recapituler3TableTr02Td2 = recapituler3TableTr02Td21;
	public static final String recapituler3TableTr02Td3Span1I1 = "far fa-cookie";
	public static final String recapituler3TableTr02Td3Span1I = recapituler3TableTr02Td3Span1I1;
	public static final String recapituler3TableTr02Td41 = "Build the dependencies with yum. ";
	public static final String recapituler3TableTr02Td4 = recapituler3TableTr02Td41;
	public static final String recapituler3TableTr03Td1I1 = "far fa-files-medical";
	public static final String recapituler3TableTr03Td1I = recapituler3TableTr03Td1I1;
	public static final String recapituler3TableTr03Td21 = "Where do I put the Keycloak source code? ";
	public static final String recapituler3TableTr03Td2 = recapituler3TableTr03Td21;
	public static final String recapituler3TableTr03Td3I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr03Td3I = recapituler3TableTr03Td3I1;
	public static final String recapituler3TableTr03Td41 = "Create a keycloak directory in /usr/local/src. ";
	public static final String recapituler3TableTr03Td4 = recapituler3TableTr03Td41;
	public static final String recapituler3TableTr04Td1I1 = "far fa-cloud-download";
	public static final String recapituler3TableTr04Td1I = recapituler3TableTr04Td1I1;
	public static final String recapituler3TableTr04Td21 = "How do I download the Keycloak source code? ";
	public static final String recapituler3TableTr04Td2 = recapituler3TableTr04Td21;
	public static final String recapituler3TableTr04Td3Span1I1 = "fab fa-git";
	public static final String recapituler3TableTr04Td3Span1I = recapituler3TableTr04Td3Span1I1;
	public static final String recapituler3TableTr04Td41 = "Clone the source code with the git command. ";
	public static final String recapituler3TableTr04Td4 = recapituler3TableTr04Td41;
	public static final String recapituler3TableTr05Td1I1 = "far fa-tools";
	public static final String recapituler3TableTr05Td1I = recapituler3TableTr05Td1I1;
	public static final String recapituler3TableTr05Td21 = "How do I build the Keycloak source code? ";
	public static final String recapituler3TableTr05Td2 = recapituler3TableTr05Td21;
	public static final String recapituler3TableTr05Td3I1 = "far fa-terminal";
	public static final String recapituler3TableTr05Td3I = recapituler3TableTr05Td3I1;
	public static final String recapituler3TableTr05Td41 = "Build Keycloak with the mvn command. ";
	public static final String recapituler3TableTr05Td4 = recapituler3TableTr05Td41;
	public static final String recapituler3TableTr08Td1I1 = "far fa-map-pin";
	public static final String recapituler3TableTr08Td1I = recapituler3TableTr08Td1I1;
	public static final String recapituler3TableTr08Td21 = "After compiling Keycloak, where do I install it as a server? ";
	public static final String recapituler3TableTr08Td2 = recapituler3TableTr08Td21;
	public static final String recapituler3TableTr08Td3I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr08Td3I = recapituler3TableTr08Td3I1;
	public static final String recapituler3TableTr08Td41 = "Create a keycloak directory in /srv. ";
	public static final String recapituler3TableTr08Td4 = recapituler3TableTr08Td41;
	public static final String recapituler3TableTr09Td1I1 = "far fa-ballot";
	public static final String recapituler3TableTr09Td1I = recapituler3TableTr09Td1I1;
	public static final String recapituler3TableTr09Td21 = "How do I configure the Keycloak server? ";
	public static final String recapituler3TableTr09Td2 = recapituler3TableTr09Td21;
	public static final String recapituler3TableTr09Td3I1 = "far fa-file-alt";
	public static final String recapituler3TableTr09Td3I = recapituler3TableTr09Td3I1;
	public static final String recapituler3TableTr09Td41 = "Create a keycloak.xml file. ";
	public static final String recapituler3TableTr09Td4 = recapituler3TableTr09Td41;
	public static final String recapituler3TableTr10Td1I1 = "far fa-file-check";
	public static final String recapituler3TableTr10Td1I = recapituler3TableTr10Td1I1;
	public static final String recapituler3TableTr10Td21 = "How do I create a Keycloak configset for my site. ";
	public static final String recapituler3TableTr10Td2 = recapituler3TableTr10Td21;
	public static final String recapituler3TableTr10Td3I1 = "far fa-hand-receiving";
	public static final String recapituler3TableTr10Td3I = recapituler3TableTr10Td3I1;
	public static final String recapituler3TableTr10Td41 = "Try out my own favorite configset from my opensource project computate. ";
	public static final String recapituler3TableTr10Td4 = recapituler3TableTr10Td41;
	public static final String recapituler3TableTr11Td1I1 = "far fa-cloud-upload-alt";
	public static final String recapituler3TableTr11Td1I = recapituler3TableTr11Td1I1;
	public static final String recapituler3TableTr11Td21 = "How do I upload my Keycloak configset to Keycloak? ";
	public static final String recapituler3TableTr11Td2 = recapituler3TableTr11Td21;
	public static final String recapituler3TableTr11Td3I1 = "far fa-file-upload";
	public static final String recapituler3TableTr11Td3I = recapituler3TableTr11Td3I1;
	public static final String recapituler3TableTr11Td41 = "Use the keycloak zk upconfig command. ";
	public static final String recapituler3TableTr11Td4 = recapituler3TableTr11Td41;
	public static final String recapituler3TableTr12Td1I1 = "far fa-alarm-clock";
	public static final String recapituler3TableTr12Td1I = recapituler3TableTr12Td1I1;
	public static final String recapituler3TableTr12Td21 = "How do I run Keycloak all the time, when my computer starts up? ";
	public static final String recapituler3TableTr12Td2 = recapituler3TableTr12Td21;
	public static final String recapituler3TableTr12Td3I1 = "far fa-layer-plus";
	public static final String recapituler3TableTr12Td3I = recapituler3TableTr12Td3I1;
	public static final String recapituler3TableTr12Td41 = "How to run Keycloak as a systemd service. ";
	public static final String recapituler3TableTr12Td4 = recapituler3TableTr12Td41;
	public static final String recapituler3TableTr13Td1I1 = "far fa-search";
	public static final String recapituler3TableTr13Td1I = recapituler3TableTr13Td1I1;
	public static final String recapituler3TableTr13Td21 = "How does the system know about the new service? ";
	public static final String recapituler3TableTr13Td2 = recapituler3TableTr13Td21;
	public static final String recapituler3TableTr13Td3I1 = "far fa-redo-alt";
	public static final String recapituler3TableTr13Td3I = recapituler3TableTr13Td3I1;
	public static final String recapituler3TableTr13Td41 = "Reload the systemd daemon. ";
	public static final String recapituler3TableTr13Td4 = recapituler3TableTr13Td41;
	public static final String recapituler3TableTr14Td1I1 = "far fa-toggle-off";
	public static final String recapituler3TableTr14Td1I = recapituler3TableTr14Td1I1;
	public static final String recapituler3TableTr14Td21 = "How do I enable the Keycloak service? ";
	public static final String recapituler3TableTr14Td2 = recapituler3TableTr14Td21;
	public static final String recapituler3TableTr14Td3I1 = "far fa-toggle-on";
	public static final String recapituler3TableTr14Td3I = recapituler3TableTr14Td3I1;
	public static final String recapituler3TableTr14Td41 = "Use the systemctl enable command. ";
	public static final String recapituler3TableTr14Td4 = recapituler3TableTr14Td41;
	public static final String recapituler3TableTr15Td1I1 = "far fa-pause-circle";
	public static final String recapituler3TableTr15Td1I = recapituler3TableTr15Td1I1;
	public static final String recapituler3TableTr15Td21 = "How do I start the Keycloak service? ";
	public static final String recapituler3TableTr15Td2 = recapituler3TableTr15Td21;
	public static final String recapituler3TableTr15Td3I1 = "far fa-play-circle";
	public static final String recapituler3TableTr15Td3I = recapituler3TableTr15Td3I1;
	public static final String recapituler3TableTr15Td41 = "Use the systemctl start command. ";
	public static final String recapituler3TableTr15Td4 = recapituler3TableTr15Td41;
	public static final String recapituler3TableTr16Td1I1 = "far fa-clipboard";
	public static final String recapituler3TableTr16Td1I = recapituler3TableTr16Td1I1;
	public static final String recapituler3TableTr16Td21 = "How do I make sure the Keycloak service started successfully? ";
	public static final String recapituler3TableTr16Td2 = recapituler3TableTr16Td21;
	public static final String recapituler3TableTr16Td3I1 = "far fa-clipboard-check";
	public static final String recapituler3TableTr16Td3I = recapituler3TableTr16Td3I1;
	public static final String recapituler3TableTr16Td41 = "Use the systemctl status command. ";
	public static final String recapituler3TableTr16Td4 = recapituler3TableTr16Td41;
	public static final String recapituler3TableTr17Td1I1 = "far fa-sliders-h-square";
	public static final String recapituler3TableTr17Td1I = recapituler3TableTr17Td1I1;
	public static final String recapituler3TableTr17Td21 = "How do I create Keycloak collections to begin indexing and searching my content? ";
	public static final String recapituler3TableTr17Td2 = recapituler3TableTr17Td21;
	public static final String recapituler3TableTr17Td3I1 = "far fa-user-cog";
	public static final String recapituler3TableTr17Td3I = recapituler3TableTr17Td3I1;
	public static final String recapituler3TableTr17Td41 = "Create collections with the keycloak command. ";
	public static final String recapituler3TableTr17Td4 = recapituler3TableTr17Td41;
	public static final String recapituler3TableTr18Td1I1 = "far fa-file-search";
	public static final String recapituler3TableTr18Td1I = recapituler3TableTr18Td1I1;
	public static final String recapituler3TableTr18Td21 = "Where can I go once I have installed a Keycloak server? ";
	public static final String recapituler3TableTr18Td2 = recapituler3TableTr18Td21;
	public static final String recapituler3TableTr18Td3I1 = "far fa-list";
	public static final String recapituler3TableTr18Td3I = recapituler3TableTr18Td3I1;
	public static final String recapituler3TableTr18Td41 = "Here are some useful URLs related to your Keycloak server. ";
	public static final String recapituler3TableTr18Td4 = recapituler3TableTr18Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
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
	protected C001L011InstallerKeycloak recapituler3Init() {
		if(recapituler3 != null) {
			((C001L011InstallerKeycloak)this).avantPagePart(recapituler3, "recapituler3");
			((C001L011InstallerKeycloak)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L011InstallerKeycloak)this;
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
			{ e("tr").a("class", " recapituler3TableTr16 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr16Td1 recapituler3TableTr16Td odd ").f();
					{ e("i").a("class", recapituler3TableTr16Td1I1, " site-menu-icon recapituler3TableTr16Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr16Td2 recapituler3TableTr16Td even ").f();
					sx(recapituler3TableTr16Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr16Td3 recapituler3TableTr16Td odd ").f();
					{ e("i").a("class", recapituler3TableTr16Td3I1, " site-menu-icon recapituler3TableTr16Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr16Td4 recapituler3TableTr16Td even ").f();
					sx(recapituler3TableTr16Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr17 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr17Td1 recapituler3TableTr17Td odd ").f();
					{ e("i").a("class", recapituler3TableTr17Td1I1, " site-menu-icon recapituler3TableTr17Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr17Td2 recapituler3TableTr17Td even ").f();
					sx(recapituler3TableTr17Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr17Td3 recapituler3TableTr17Td odd ").f();
					{ e("i").a("class", recapituler3TableTr17Td3I1, " site-menu-icon recapituler3TableTr17Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr17Td4 recapituler3TableTr17Td even ").f();
					sx(recapituler3TableTr17Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr18 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr18Td1 recapituler3TableTr18Td odd ").f();
					{ e("i").a("class", recapituler3TableTr18Td1I1, " site-menu-icon recapituler3TableTr18Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr18Td2 recapituler3TableTr18Td even ").f();
					sx(recapituler3TableTr18Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr18Td3 recapituler3TableTr18Td odd ").f();
					{ e("i").a("class", recapituler3TableTr18Td3I1, " site-menu-icon recapituler3TableTr18Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr18Td4 recapituler3TableTr18Td even ").f();
					sx(recapituler3TableTr18Td41);
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

	protected boolean dejaInitialiseC001L011InstallerKeycloak = false;

	public C001L011InstallerKeycloak initLoinC001L011InstallerKeycloak(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L011InstallerKeycloak) {
			dejaInitialiseC001L011InstallerKeycloak = true;
			initLoinC001L011InstallerKeycloak();
		}
		return (C001L011InstallerKeycloak)this;
	}

	public void initLoinC001L011InstallerKeycloak() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L011InstallerKeycloak();
	}

	public void initC001L011InstallerKeycloak() {
		keycloakVersionInit();
		keycloakPortClientInit();
		keycloakTagInit();
		keycloakConfigsetInit();
		keycloakCollectionInit();
		moiInit();
		personnaliserInit();
		questionDependencesInit();
		questionMkdirSrcInit();
		questionClonerSourceInit();
		questionListerTagsInit();
		questionCheckoutTagInit();
		questionConstruireSourceInit();
		questionMkdirServeurInit();
		questionConfigurerInit();
		questionConfigurerConfigsetInit();
		questionConfigsetKeycloakInit();
		questionServiceInit();
		questionSystemctlDaemonReloadInit();
		questionSystemctlEnableInit();
		questionSystemctlStartInit();
		questionSystemctlStatusInit();
		questionCollectionsKeycloakInit();
		questionLiensInit();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L011InstallerKeycloak(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L011InstallerKeycloak(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(personnaliser != null)
			personnaliser.setRequeteSite_(requeteSite_);
		if(questionDependences != null)
			questionDependences.setRequeteSite_(requeteSite_);
		if(questionMkdirSrc != null)
			questionMkdirSrc.setRequeteSite_(requeteSite_);
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
		if(questionConfigurer != null)
			questionConfigurer.setRequeteSite_(requeteSite_);
		if(questionConfigurerConfigset != null)
			questionConfigurerConfigset.setRequeteSite_(requeteSite_);
		if(questionConfigsetKeycloak != null)
			questionConfigsetKeycloak.setRequeteSite_(requeteSite_);
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
		if(questionCollectionsKeycloak != null)
			questionCollectionsKeycloak.setRequeteSite_(requeteSite_);
		if(questionLiens != null)
			questionLiens.setRequeteSite_(requeteSite_);
		if(recapituler1 != null)
			recapituler1.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L011InstallerKeycloak(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L011InstallerKeycloak(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L011InstallerKeycloak(String var) {
		C001L011InstallerKeycloak oC001L011InstallerKeycloak = (C001L011InstallerKeycloak)this;
		switch(var) {
			case "keycloakVersion":
				return oC001L011InstallerKeycloak.keycloakVersion;
			case "keycloakPortClient":
				return oC001L011InstallerKeycloak.keycloakPortClient;
			case "keycloakTag":
				return oC001L011InstallerKeycloak.keycloakTag;
			case "keycloakConfigset":
				return oC001L011InstallerKeycloak.keycloakConfigset;
			case "keycloakCollection":
				return oC001L011InstallerKeycloak.keycloakCollection;
			case "moi":
				return oC001L011InstallerKeycloak.moi;
			case "personnaliser":
				return oC001L011InstallerKeycloak.personnaliser;
			case "questionDependences":
				return oC001L011InstallerKeycloak.questionDependences;
			case "questionMkdirSrc":
				return oC001L011InstallerKeycloak.questionMkdirSrc;
			case "questionClonerSource":
				return oC001L011InstallerKeycloak.questionClonerSource;
			case "questionListerTags":
				return oC001L011InstallerKeycloak.questionListerTags;
			case "questionCheckoutTag":
				return oC001L011InstallerKeycloak.questionCheckoutTag;
			case "questionConstruireSource":
				return oC001L011InstallerKeycloak.questionConstruireSource;
			case "questionMkdirServeur":
				return oC001L011InstallerKeycloak.questionMkdirServeur;
			case "questionConfigurer":
				return oC001L011InstallerKeycloak.questionConfigurer;
			case "questionConfigurerConfigset":
				return oC001L011InstallerKeycloak.questionConfigurerConfigset;
			case "questionConfigsetKeycloak":
				return oC001L011InstallerKeycloak.questionConfigsetKeycloak;
			case "questionService":
				return oC001L011InstallerKeycloak.questionService;
			case "questionSystemctlDaemonReload":
				return oC001L011InstallerKeycloak.questionSystemctlDaemonReload;
			case "questionSystemctlEnable":
				return oC001L011InstallerKeycloak.questionSystemctlEnable;
			case "questionSystemctlStart":
				return oC001L011InstallerKeycloak.questionSystemctlStart;
			case "questionSystemctlStatus":
				return oC001L011InstallerKeycloak.questionSystemctlStatus;
			case "questionCollectionsKeycloak":
				return oC001L011InstallerKeycloak.questionCollectionsKeycloak;
			case "questionLiens":
				return oC001L011InstallerKeycloak.questionLiens;
			case "recapituler1":
				return oC001L011InstallerKeycloak.recapituler1;
			case "recapituler2":
				return oC001L011InstallerKeycloak.recapituler2;
			case "recapituler3":
				return oC001L011InstallerKeycloak.recapituler3;
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
				o = attribuerC001L011InstallerKeycloak(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L011InstallerKeycloak(String var, Object val) {
		C001L011InstallerKeycloak oC001L011InstallerKeycloak = (C001L011InstallerKeycloak)this;
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
					o = definirC001L011InstallerKeycloak(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L011InstallerKeycloak(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/011-comment-installer-une-version-recente-de-keycloak?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/011-comment-installer-une-version-recente-de-keycloak-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/011-comment-installer-une-version-recente-de-keycloak-999.png"));
				System.out.println("C001L011InstallerKeycloakFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/011-how-to-install-a-recent-version-of-keycloak?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/011-how-to-install-a-recent-version-of-keycloak-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/011-how-to-install-a-recent-version-of-keycloak-999.png"));
				System.out.println("C001L011InstallerKeycloakEnUSPage");
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.c001.l011.C001L011InstallerKeycloak"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L011InstallerKeycloak o = new C001L011InstallerKeycloak();
			o.requeteSiteC001L011InstallerKeycloak(requeteSite);
			o.initLoinC001L011InstallerKeycloak(requeteSite);
			o.indexerC001L011InstallerKeycloak();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001L011InstallerKeycloak();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001L011InstallerKeycloak(document);
	}

	public void indexerC001L011InstallerKeycloak(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L011InstallerKeycloak(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L011InstallerKeycloak() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L011InstallerKeycloak(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L011InstallerKeycloak(SolrInputDocument document) {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L011InstallerKeycloak() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinC001L011InstallerKeycloak(siteContexte.getRequeteSite_());
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
		stockerC001L011InstallerKeycloak(solrDocument);
	}
	public void stockerC001L011InstallerKeycloak(SolrDocument solrDocument) {
		C001L011InstallerKeycloak oC001L011InstallerKeycloak = (C001L011InstallerKeycloak)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L011InstallerKeycloak();
	}

	public void htmlBodyCourtC001L011InstallerKeycloak() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(personnaliser != null)
			personnaliser.htmlBodyCourt();
		if(questionDependences != null)
			questionDependences.htmlBodyCourt();
		if(questionMkdirSrc != null)
			questionMkdirSrc.htmlBodyCourt();
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
		if(questionConfigurer != null)
			questionConfigurer.htmlBodyCourt();
		if(questionConfigurerConfigset != null)
			questionConfigurerConfigset.htmlBodyCourt();
		if(questionConfigsetKeycloak != null)
			questionConfigsetKeycloak.htmlBodyCourt();
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
		if(questionCollectionsKeycloak != null)
			questionCollectionsKeycloak.htmlBodyCourt();
		if(questionLiens != null)
			questionLiens.htmlBodyCourt();
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
		htmlBodyC001L011InstallerKeycloak();
		super.htmlBody();
	}

	public void htmlBodyC001L011InstallerKeycloak() {
		((C001L011InstallerKeycloak)this).htmlBodyMoi();
		((C001L011InstallerKeycloak)this).htmlBodyPersonnaliser();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionDependences();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionMkdirSrc();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionClonerSource();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionListerTags();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionCheckoutTag();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionConstruireSource();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionMkdirServeur();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionConfigurer();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionConfigurerConfigset();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionConfigsetKeycloak();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionService();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionSystemctlDaemonReload();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionSystemctlEnable();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionSystemctlStart();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionSystemctlStatus();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionCollectionsKeycloak();
		((C001L011InstallerKeycloak)this).htmlBodyQuestionLiens();
		((C001L011InstallerKeycloak)this).htmlBodyRecapituler1();
		((C001L011InstallerKeycloak)this).htmlBodyRecapituler2();
		((C001L011InstallerKeycloak)this).htmlBodyRecapituler3();
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
		if(!(o instanceof C001L011InstallerKeycloak))
			return false;
		C001L011InstallerKeycloak that = (C001L011InstallerKeycloak)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L011InstallerKeycloak {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L011InstallerKeycloakVals = new String[] { moiP1, moiP2, questionDependencesH3I1, questionDependencesH3Span1, questionDependencesH4I1, questionDependencesH4Span1, questionDependencesPre1Span11, questionDependencesPre1Span21, questionDependencesPre1Span31, questionDependencesPre1Span41, questionDependencesPre1Span51, questionDependencesOl2Li1Dt1, questionDependencesOl2Li1Dd1, questionDependencesOl2Li1Dd2, questionDependencesOl2Li1Dd3, questionDependencesOl2Li2Dt1, questionDependencesOl2Li2Dd1, questionDependencesOl2Li2Dd2, questionDependencesOl2Li3Dt1, questionDependencesOl2Li3Dd1, questionDependencesOl2Li4Dt1, questionDependencesOl2Li4Dd1, questionDependencesOl2Li5Dt1, questionDependencesOl2Li5Dd1, questionMkdirSrcH3I1, questionMkdirSrcH3Span1, questionMkdirSrcH4I1, questionMkdirSrcH4Span1, questionMkdirSrcPreSpan11, questionMkdirSrcPreSpan21, questionMkdirSrcPreSpan31, questionMkdirSrcPreSpan41, questionMkdirSrcPreSpan51, questionMkdirSrcPreSpan61, questionMkdirSrcPreSpan71, questionMkdirSrcPreSpan81, questionMkdirSrcOl2Li11, questionMkdirSrcOl2Li21, questionMkdirSrcOl2Li31, questionMkdirSrcOl2Li41, questionMkdirSrcOl2Li51, questionMkdirSrcOl2Li61, questionMkdirSrcOl2Li71, questionMkdirSrcOl2Li81, questionMkdirSrcOl2Li82, questionClonerSourceH3I1, questionClonerSourceH3Span1, questionClonerSourceH4I1, questionClonerSourceH4Span1, questionClonerSourcePreSpan11, questionClonerSourcePreSpan21, questionClonerSourcePreSpan31, questionClonerSourcePreSpan41, questionClonerSourceOl2Li11, questionClonerSourceOl2Li21, questionClonerSourceOl2Li31, questionClonerSourceOl2Li41, questionListerTagsH3I1, questionListerTagsH3Span1, questionListerTagsH4I1, questionListerTagsH4Span1, questionListerTagsPreSpan11, questionListerTagsPreSpan21, questionListerTagsPreSpan31, questionListerTagsPreSpan41, questionListerTagsPreSpan51, questionListerTagsOl2Li11, questionListerTagsOl2Li21, questionListerTagsOl2Li31, questionListerTagsOl2Li41, questionListerTagsOl2Li51, questionCheckoutTagH3I1, questionCheckoutTagH3Span1, questionCheckoutTagH4I1, questionCheckoutTagH4Span1, questionCheckoutTagPreSpan11, questionCheckoutTagPreSpan21, questionCheckoutTagPreSpan31, questionCheckoutTagPreSpan41, questionCheckoutTagPreSpan51, questionCheckoutTagPreSpan6Span11, questionCheckoutTagPreSpan6Span21, questionCheckoutTagPreSpan6Span31, questionCheckoutTagOl1Li11, questionCheckoutTagOl1Li21, questionCheckoutTagOl1Li31, questionCheckoutTagOl1Li41, questionCheckoutTagOl1Li51, questionCheckoutTagOl1Li6Span11, questionCheckoutTagOl1Li6Span21, questionCheckoutTagP2Span11, questionCheckoutTagP2Span12, questionCheckoutTagP2A11, questionCheckoutTagP2Span21, questionCheckoutTagP2Span22, questionConstruireSourceH3I1, questionConstruireSourceH3Span1, questionConstruireSourceH4I1, questionConstruireSourceH4Span1, questionConstruireSourcePre1Span011, questionConstruireSourcePre1Span021, questionConstruireSourcePre1Span031, questionConstruireSourcePre1Span041, questionConstruireSourcePre1Span051, questionConstruireSourcePre1Span061, questionConstruireSourcePre1Span071, questionConstruireSourceOl1Li011, questionConstruireSourceOl1Li021, questionConstruireSourceOl1Li031, questionConstruireSourceOl1Li041, questionConstruireSourceOl1Li051, questionConstruireSourceOl1Li061, questionConstruireSourceOl1Li071, questionMkdirServeurH3I1, questionMkdirServeurH3Span1, questionMkdirServeurH4I1, questionMkdirServeurH4Span1, questionMkdirServeurPreSpan11, questionMkdirServeurPreSpan21, questionMkdirServeurPreSpan31, questionMkdirServeurPreSpan41, questionMkdirServeurPreSpan51, questionMkdirServeurPreSpan61, questionMkdirServeurPreSpan71, questionMkdirServeurPreSpan81, questionMkdirServeurOl1Li11, questionMkdirServeurOl1Li21, questionMkdirServeurOl1Li31, questionMkdirServeurOl1Li41, questionMkdirServeurOl1Li51, questionMkdirServeurOl1Li61, questionMkdirServeurOl1Li71, questionMkdirServeurOl1Li81, questionMkdirServeurPre2Span11, questionMkdirServeurPre2Span21, questionMkdirServeurPre2Span3Span11, questionMkdirServeurPre2Span3Span21, questionMkdirServeurPre2Span3Span31, questionMkdirServeurPre2Span41, questionMkdirServeurOl2Li11, questionMkdirServeurOl2Li21, questionMkdirServeurOl2Li3Span11, questionMkdirServeurOl2Li3Span21, questionMkdirServeurOl2Li3Span31, questionMkdirServeurOl2Li3Span32, questionMkdirServeurOl2Li41, questionMkdirServeurOl2Li42, questionMkdirServeurPre3Span11, questionMkdirServeurPre3Span21, questionMkdirServeurPre3Span31, questionMkdirServeurOl3Li11, questionMkdirServeurOl3Li21, questionMkdirServeurOl3Li31, questionMkdirServeurPre4Span11, questionMkdirServeurPre4Span21, questionMkdirServeurPre4Span31, questionMkdirServeurOl4Li11, questionMkdirServeurOl4Li21, questionMkdirServeurOl4Li31, questionConfigurerH3I1, questionConfigurerH3Span1, questionConfigurerH4I1, questionConfigurerH4Span1, questionConfigurerPreSpan11, questionConfigurerPreSpan1Br1, questionConfigurerPreSpan1Br2, questionConfigurerPreSpan1Br3, questionConfigurerPreSpan1Br4, questionConfigurerPreSpan1Br5, questionConfigurerPreSpan1Br6, questionConfigurerPreSpan1Br7, questionConfigurerPreSpan1Br8, questionConfigurerPreSpan1Br9, questionConfigurerPreSpan1Br10, questionConfigurerPreSpan1Br11, questionConfigurerPreSpan1Br12, questionConfigurerPreSpan1Br13, questionConfigurerPreSpan1Br14, questionConfigurerPreSpan1Br15, questionConfigurerPreSpan1Br16, questionConfigurerPreSpan1Br17, questionConfigurerPreSpan5Br1, questionConfigurerOl2Li011, questionConfigurerOl2Li061, questionConfigurerOl2Li071, questionConfigurerOl2Li081, questionConfigurerConfigsetH3I1, questionConfigurerConfigsetH3Span1, questionConfigurerConfigsetH4I1, questionConfigurerConfigsetH4Span1, questionConfigurerConfigsetPre1Span011, questionConfigurerConfigsetPre1Span021, questionConfigurerConfigsetPre1Span031, questionConfigurerConfigsetPre1Span04Span11, questionConfigurerConfigsetPre1Span04Span12, questionConfigurerConfigsetOl1Li011, questionConfigurerConfigsetOl1Li021, questionConfigurerConfigsetOl1Li031, questionConfigurerConfigsetOl1Li04Span11, questionConfigurerConfigsetOl1Li04Span21, questionConfigurerConfigsetOl1Li04Span31, questionConfigurerConfigsetPre2Span011, questionConfigurerConfigsetPre2Span021, questionConfigurerConfigsetPre2Span031, questionConfigurerConfigsetPre2Span041, questionConfigurerConfigsetPre2Span051, questionConfigurerConfigsetPre2Span061, questionConfigurerConfigsetPre2Span071, questionConfigurerConfigsetPre2Span081, questionConfigurerConfigsetOl2Li011, questionConfigurerConfigsetOl2Li02Span11, questionConfigurerConfigsetOl2Li02Span21, questionConfigurerConfigsetOl2Li031, questionConfigurerConfigsetOl2Li041, questionConfigurerConfigsetOl2Li051, questionConfigurerConfigsetOl2Li061, questionConfigurerConfigsetOl2Li071, questionConfigurerConfigsetOl2Li081, questionConfigsetKeycloakH3I1, questionConfigsetKeycloakH3Span1, questionConfigsetKeycloakH4I1, questionConfigsetKeycloakH4Span1, questionConfigsetKeycloakPre1Span011, questionConfigsetKeycloakPre1Span021, questionConfigsetKeycloakPre1Span031, questionConfigsetKeycloakPre1Span04Span11, questionConfigsetKeycloakPre1Span04Span21, questionConfigsetKeycloakPre1Span05Span11, questionConfigsetKeycloakPre1Span05Span21, questionConfigsetKeycloakOl1Li011, questionConfigsetKeycloakOl1Li021, questionConfigsetKeycloakOl1Li031, questionConfigsetKeycloakOl1Li04Span11, questionConfigsetKeycloakOl1Li04Span21, questionConfigsetKeycloakOl1Li04Span31, questionServiceH3I1, questionServiceH3Span1, questionServiceH4I1, questionServiceH4Span1, questionServicePreSpan11, questionServicePreSpan1Br1, questionServicePreSpan2Br1, questionServicePreSpan3Br1, questionServicePreSpan3Br2, questionServicePreSpan3Br3, questionServicePreSpan3Br4, questionServicePreSpan3Br5, questionServicePreSpan3Br6, questionServicePreSpan4BrSpan11, questionServicePreSpan4Span21, questionServicePreSpan5Br1, questionServicePreSpan5Br2, questionServicePreSpan5Br3, questionServicePreSpan5Br4, questionServicePreSpan5Br5, questionServiceOl2Li011, questionServiceOl2Li021, questionServiceOl2Li031, questionServiceOl2Li041, questionServiceOl2Li051, questionServiceOl2Li061, questionServiceOl2Li071, questionServiceOl2Li081, questionServiceOl2Li091, questionServiceOl2Li101, questionServiceOl2Li111, questionServiceOl2Li121, questionServiceOl2Li131, questionServiceOl2Li141, questionServiceOl2Li151, questionServiceOl2Li161, questionSystemctlDaemonReloadH3I1, questionSystemctlDaemonReloadH3Span1, questionSystemctlDaemonReloadH4I1, questionSystemctlDaemonReloadH4Span1, questionSystemctlDaemonReloadPreSpan11, questionSystemctlDaemonReloadPreSpan21, questionSystemctlDaemonReloadPreSpan31, questionSystemctlDaemonReloadOl2Li11, questionSystemctlDaemonReloadOl2Li21, questionSystemctlDaemonReloadOl2Li31, questionSystemctlEnableH3I1, questionSystemctlEnableH3Span1, questionSystemctlEnableH4I1, questionSystemctlEnableH4Span1, questionSystemctlEnablePreSpan11, questionSystemctlEnablePreSpan21, questionSystemctlEnablePreSpan31, questionSystemctlEnablePreSpan41, questionSystemctlEnableOl2Li11, questionSystemctlEnableOl2Li21, questionSystemctlEnableOl2Li31, questionSystemctlEnableOl2Li41, questionSystemctlStartH3I1, questionSystemctlStartH3Span1, questionSystemctlStartH4I1, questionSystemctlStartH4Span1, questionSystemctlStartPreSpan11, questionSystemctlStartPreSpan21, questionSystemctlStartPreSpan31, questionSystemctlStartPreSpan41, questionSystemctlStartOl2Li11, questionSystemctlStartOl2Li21, questionSystemctlStartOl2Li31, questionSystemctlStartOl2Li41, questionSystemctlStatusH3I1, questionSystemctlStatusH3Span1, questionSystemctlStatusH4I1, questionSystemctlStatusH4Span1, questionSystemctlStatusPreSpan11, questionSystemctlStatusPreSpan21, questionSystemctlStatusPreSpan31, questionSystemctlStatusPreSpan41, questionSystemctlStatusOl2Li11, questionSystemctlStatusOl2Li21, questionSystemctlStatusOl2Li31, questionSystemctlStatusOl2Li41, questionSystemctlStatusP21, questionSystemctlStatusP22, questionCollectionsKeycloakH3I1, questionCollectionsKeycloakH3Span1, questionCollectionsKeycloakH4I1, questionCollectionsKeycloakH4Span1, questionCollectionsKeycloakPre1Span011, questionCollectionsKeycloakPre1Span021, questionCollectionsKeycloakPre1Span03Span11, questionCollectionsKeycloakPre1Span03Span21, questionCollectionsKeycloakPre1Span04Span11, questionCollectionsKeycloakPre1Span04Span21, questionCollectionsKeycloakOl1Li011, questionCollectionsKeycloakOl1Li021, questionCollectionsKeycloakOl1Li03Span11, questionCollectionsKeycloakOl1Li03Span21, questionCollectionsKeycloakOl1Li03Span31, questionCollectionsKeycloakOl1Li04Span11, questionCollectionsKeycloakOl1Li04Span21, questionCollectionsKeycloakOl1Li04Span31, questionLiensH3I1, questionLiensH3Span1, questionLiensH4I1, questionLiensH4Span1, questionLiensUlLi1A1, questionLiensUlLi1Span1, questionLiensUlLi2A1, questionLiensUlLi2Span1, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3Span1I1, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41, recapituler3TableTr11Td1I1, recapituler3TableTr11Td21, recapituler3TableTr11Td3I1, recapituler3TableTr11Td41, recapituler3TableTr12Td1I1, recapituler3TableTr12Td21, recapituler3TableTr12Td3I1, recapituler3TableTr12Td41, recapituler3TableTr13Td1I1, recapituler3TableTr13Td21, recapituler3TableTr13Td3I1, recapituler3TableTr13Td41, recapituler3TableTr14Td1I1, recapituler3TableTr14Td21, recapituler3TableTr14Td3I1, recapituler3TableTr14Td41, recapituler3TableTr15Td1I1, recapituler3TableTr15Td21, recapituler3TableTr15Td3I1, recapituler3TableTr15Td41, recapituler3TableTr16Td1I1, recapituler3TableTr16Td21, recapituler3TableTr16Td3I1, recapituler3TableTr16Td41, recapituler3TableTr17Td1I1, recapituler3TableTr17Td21, recapituler3TableTr17Td3I1, recapituler3TableTr17Td41, recapituler3TableTr18Td1I1, recapituler3TableTr18Td21, recapituler3TableTr18Td3I1, recapituler3TableTr18Td41 };
}
