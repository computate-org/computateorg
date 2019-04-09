package org.computate.site.frFR.cluster;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import org.computate.site.frFR.couverture.Couverture;
import java.util.Date;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import org.apache.commons.lang3.StringUtils;
import io.vertx.core.logging.LoggerFactory;
import java.util.ArrayList;
import org.computate.site.frFR.cluster.Cluster;
import java.lang.Long;
import java.lang.Boolean;
import io.vertx.core.json.JsonObject;
import java.lang.String;
import java.time.ZoneOffset;
import io.vertx.core.logging.Logger;
import org.computate.site.frFR.page.MiseEnPage;
import org.apache.solr.client.solrj.response.QueryResponse;
import java.util.Set;
import org.apache.commons.text.StringEscapeUtils;
import java.time.Instant;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import java.time.ZoneId;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import java.time.format.DateTimeFormatter;
import org.apache.solr.client.solrj.SolrQuery;
import io.vertx.ext.sql.SQLConnection;
import java.lang.Object;
import io.vertx.ext.sql.SQLClient;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class ClusterGen<DEV> extends Object {
	private static final Logger LOGGER = LoggerFactory.getLogger(Cluster.class);

	//////////////////
	// requeteSite_ //
	//////////////////

	/**	L'entité « requeteSite_ »
	 *	 is defined as null before being initialized. 
	 */
	protected RequeteSiteFrFR requeteSite_;
	public Couverture<RequeteSiteFrFR> requeteSite_Couverture = new Couverture<RequeteSiteFrFR>().p(this).c(RequeteSiteFrFR.class).var("requeteSite_").o(requeteSite_);

	/**	<br/>L'entité « requeteSite_ »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteSite_">Trouver l'entité requeteSite_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _requeteSite_(Couverture<RequeteSiteFrFR> c);

	public RequeteSiteFrFR getRequeteSite_() {
		return requeteSite_;
	}

	public void setRequeteSite_(RequeteSiteFrFR requeteSite_) {
		this.requeteSite_ = requeteSite_;
		this.requeteSite_Couverture.dejaInitialise = true;
	}

	///////////
	// page_ //
	///////////

	/**	L'entité « page_ »
	 *	 is defined as null before being initialized. 
	 */
	protected MiseEnPage page_;
	public Couverture<MiseEnPage> page_Couverture = new Couverture<MiseEnPage>().p(this).c(MiseEnPage.class).var("page_").o(page_);

	/**	<br/>L'entité « page_ »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:page_">Trouver l'entité page_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _page_(Couverture<MiseEnPage> c);

	public MiseEnPage getPage_() {
		return page_;
	}

	public void setPage_(MiseEnPage page_) {
		this.page_ = page_;
		this.page_Couverture.dejaInitialise = true;
	}

	////////
	// pk //
	////////

	/**	L'entité « pk »
	 *	 is defined as null before being initialized. 
	 */
	protected Long pk;
	public Couverture<Long> pkCouverture = new Couverture<Long>().p(this).c(Long.class).var("pk").o(pk);

	/**	<br/>L'entité « pk »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pk">Trouver l'entité pk dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pk(Couverture<Long> c);

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
		this.pkCouverture.dejaInitialise = true;
	}
	public Cluster setPk(String o) {
		if(org.apache.commons.lang3.math.NumberUtils.isCreatable(o))
			this.pk = Long.parseLong(o);
		this.pkCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	protected Cluster pkInit() {
		if(!pkCouverture.dejaInitialise) {
			_pk(pkCouverture);
			if(pk == null)
				setPk(pkCouverture.o);
		}
		pkCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public Long solrPk() {
		return pk;
	}

	public String strPk() {
		return pk == null ? "" : pk.toString();
	}

	public String nomAffichagePk() {
		return "clé primaire";
	}

	public String htmTooltipPk() {
		return null;
	}

	public String htmPk() {
		return pk == null ? "" : StringEscapeUtils.escapeHtml4(strPk());
	}

	public void htmPk(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "Pk\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "Pk() {");
				r.l("			$.ajax({");
				r.l("				url: '?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setPk\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichagePk()), "</span>");
				r.s("			<input");
							r.s(" name=\"pk\"");
							r.s(" value=\"", htmPk(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmPk());
			}
			r.l("</div>");
		}
	}

	////////
	// id //
	////////

	/**	L'entité « id »
	 *	 is defined as null before being initialized. 
	 */
	protected String id;
	public Couverture<String> idCouverture = new Couverture<String>().p(this).c(String.class).var("id").o(id);

	/**	<br/>L'entité « id »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:id">Trouver l'entité id dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _id(Couverture<String> c);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		this.idCouverture.dejaInitialise = true;
	}
	protected Cluster idInit() {
		if(!idCouverture.dejaInitialise) {
			_id(idCouverture);
			if(id == null)
				setId(idCouverture.o);
		}
		idCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public String solrId() {
		return id;
	}

	public String strId() {
		return id == null ? "" : id;
	}

	public String nomAffichageId() {
		return null;
	}

	public String htmTooltipId() {
		return null;
	}

	public String htmId() {
		return id == null ? "" : StringEscapeUtils.escapeHtml4(strId());
	}

	public void htmId(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "Id\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "Id() {");
				r.l("			$.ajax({");
				r.l("				url: '?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setId\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageId()), "</span>");
				r.s("			<input");
							r.s(" name=\"id\"");
							r.s(" value=\"", htmId(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmId());
			}
			r.l("</div>");
		}
	}

	//////////////
	// supprime //
	//////////////

	/**	L'entité « supprime »
	 *	 is defined as null before being initialized. 
	 */
	protected Boolean supprime;
	public Couverture<Boolean> supprimeCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("supprime").o(supprime);

	/**	<br/>L'entité « supprime »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:supprime">Trouver l'entité supprime dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _supprime(Couverture<Boolean> c);

	public Boolean getSupprime() {
		return supprime;
	}

	public void setSupprime(Boolean supprime) {
		this.supprime = supprime;
		this.supprimeCouverture.dejaInitialise = true;
	}
	public Cluster setSupprime(String o) {
		this.supprime = Boolean.parseBoolean(o);
		this.supprimeCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	protected Cluster supprimeInit() {
		if(!supprimeCouverture.dejaInitialise) {
			_supprime(supprimeCouverture);
			if(supprime == null)
				setSupprime(supprimeCouverture.o);
		}
		supprimeCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public Boolean solrSupprime() {
		return supprime;
	}

	public String strSupprime() {
		return supprime == null ? "" : supprime.toString();
	}

	public String nomAffichageSupprime() {
		return "Supprimé";
	}

	public String htmTooltipSupprime() {
		return null;
	}

	public String htmSupprime() {
		return supprime == null ? "" : StringEscapeUtils.escapeHtml4(strSupprime());
	}

	public void htmSupprime(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "Supprime\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "Supprime() {");
				r.l("			$.ajax({");
				r.l("				url: '?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setSupprime\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageSupprime()), "</span>");
				r.s("			<input");
							r.s(" name=\"supprime\"");
							r.s(" value=\"", htmSupprime(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmSupprime());
			}
			r.l("</div>");
		}
	}

	///////////////////
	// utilisateurId //
	///////////////////

	/**	L'entité « utilisateurId »
	 *	 is defined as null before being initialized. 
	 */
	protected String utilisateurId;
	public Couverture<String> utilisateurIdCouverture = new Couverture<String>().p(this).c(String.class).var("utilisateurId").o(utilisateurId);

	/**	<br/>L'entité « utilisateurId »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurId">Trouver l'entité utilisateurId dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurId(Couverture<String> c);

	public String getUtilisateurId() {
		return utilisateurId;
	}

	public void setUtilisateurId(String utilisateurId) {
		this.utilisateurId = utilisateurId;
		this.utilisateurIdCouverture.dejaInitialise = true;
	}
	protected Cluster utilisateurIdInit() {
		if(!utilisateurIdCouverture.dejaInitialise) {
			_utilisateurId(utilisateurIdCouverture);
			if(utilisateurId == null)
				setUtilisateurId(utilisateurIdCouverture.o);
		}
		utilisateurIdCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public String solrUtilisateurId() {
		return utilisateurId;
	}

	public String strUtilisateurId() {
		return utilisateurId == null ? "" : utilisateurId;
	}

	public String nomAffichageUtilisateurId() {
		return null;
	}

	public String htmTooltipUtilisateurId() {
		return null;
	}

	public String htmUtilisateurId() {
		return utilisateurId == null ? "" : StringEscapeUtils.escapeHtml4(strUtilisateurId());
	}

	public void htmUtilisateurId(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "UtilisateurId\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "UtilisateurId() {");
				r.l("			$.ajax({");
				r.l("				url: '?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setUtilisateurId\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageUtilisateurId()), "</span>");
				r.s("			<input");
							r.s(" name=\"utilisateurId\"");
							r.s(" value=\"", htmUtilisateurId(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmUtilisateurId());
			}
			r.l("</div>");
		}
	}

	//////////
	// cree //
	//////////

	/**	L'entité « cree »
	 *	 is defined as null before being initialized. 
	 */
	protected LocalDateTime cree;
	public Couverture<LocalDateTime> creeCouverture = new Couverture<LocalDateTime>().p(this).c(LocalDateTime.class).var("cree").o(cree);

	/**	<br/>L'entité « cree »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:cree">Trouver l'entité cree dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _cree(Couverture<LocalDateTime> c);

	public LocalDateTime getCree() {
		return cree;
	}

	public void setCree(LocalDateTime cree) {
		this.cree = cree;
		this.creeCouverture.dejaInitialise = true;
	}
	public Cluster setCree(Instant o) {
		this.cree = LocalDateTime.from(o);
		this.creeCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public Cluster setCree(String o) {
		this.cree = LocalDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this.creeCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	public Cluster setCree(Date o) {
		this.cree = LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this.creeCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	protected Cluster creeInit() {
		if(!creeCouverture.dejaInitialise) {
			_cree(creeCouverture);
			if(cree == null)
				setCree(creeCouverture.o);
		}
		creeCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public Date solrCree() {
		return cree == null ? null : Date.from(cree.atZone(ZoneId.systemDefault()).toInstant());
	}

	public String strCree() {
		return cree == null ? "" : cree.toString();
	}

	public String nomAffichageCree() {
		return "Crée";
	}

	public String htmTooltipCree() {
		return null;
	}

	public String htmCree() {
		return cree == null ? "" : StringEscapeUtils.escapeHtml4(strCree());
	}

	public void htmCree(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "Cree\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "Cree() {");
				r.l("			$.ajax({");
				r.l("				url: '?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setCree\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageCree()), "</span>");
				r.s("			<input");
							r.s(" name=\"cree\"");
							r.s(" value=\"", htmCree(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmCree());
			}
			r.l("</div>");
		}
	}

	/////////////
	// modifie //
	/////////////

	/**	L'entité « modifie »
	 *	 is defined as null before being initialized. 
	 */
	protected LocalDateTime modifie;
	public Couverture<LocalDateTime> modifieCouverture = new Couverture<LocalDateTime>().p(this).c(LocalDateTime.class).var("modifie").o(modifie);

	/**	<br/>L'entité « modifie »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:modifie">Trouver l'entité modifie dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _modifie(Couverture<LocalDateTime> c);

	public LocalDateTime getModifie() {
		return modifie;
	}

	public void setModifie(LocalDateTime modifie) {
		this.modifie = modifie;
		this.modifieCouverture.dejaInitialise = true;
	}
	public Cluster setModifie(Instant o) {
		this.modifie = LocalDateTime.from(o);
		this.modifieCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public Cluster setModifie(String o) {
		this.modifie = LocalDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this.modifieCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	public Cluster setModifie(Date o) {
		this.modifie = LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this.modifieCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	protected Cluster modifieInit() {
		if(!modifieCouverture.dejaInitialise) {
			_modifie(modifieCouverture);
			if(modifie == null)
				setModifie(modifieCouverture.o);
		}
		modifieCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public Date solrModifie() {
		return modifie == null ? null : Date.from(modifie.atZone(ZoneId.systemDefault()).toInstant());
	}

	public String strModifie() {
		return modifie == null ? "" : modifie.toString();
	}

	public String nomAffichageModifie() {
		return "Modifié";
	}

	public String htmTooltipModifie() {
		return null;
	}

	public String htmModifie() {
		return modifie == null ? "" : StringEscapeUtils.escapeHtml4(strModifie());
	}

	public void htmModifie(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "Modifie\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "Modifie() {");
				r.l("			$.ajax({");
				r.l("				url: '?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setModifie\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageModifie()), "</span>");
				r.s("			<input");
							r.s(" name=\"modifie\"");
							r.s(" value=\"", htmModifie(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmModifie());
			}
			r.l("</div>");
		}
	}

	//////////////////////////
	// classeNomsCanoniques //
	//////////////////////////

	/**	L'entité « classeNomsCanoniques »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	protected List<String> classeNomsCanoniques = new java.util.ArrayList<java.lang.String>();
	public Couverture<List<String>> classeNomsCanoniquesCouverture = new Couverture<List<String>>().p(this).c(List.class).var("classeNomsCanoniques").o(classeNomsCanoniques);

	/**	<br/>L'entité « classeNomsCanoniques »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:classeNomsCanoniques">Trouver l'entité classeNomsCanoniques dans Solr</a>
	 * <br/>
	 * @param classeNomsCanoniques est l'entité déjà construit. 
	 **/
	protected abstract void _classeNomsCanoniques(List<String> l);

	public List<String> getClasseNomsCanoniques() {
		return classeNomsCanoniques;
	}

	public void setClasseNomsCanoniques(List<String> classeNomsCanoniques) {
		this.classeNomsCanoniques = classeNomsCanoniques;
		this.classeNomsCanoniquesCouverture.dejaInitialise = true;
	}
	public Cluster addClasseNomsCanoniques(String...objets) {
		for(String o : objets) {
			addClasseNomsCanoniques(o);
		}
		return (Cluster)this;
	}
	public Cluster addClasseNomsCanoniques(String o) {
		if(o != null && !classeNomsCanoniques.contains(o))
			this.classeNomsCanoniques.add(o);
		return (Cluster)this;
	}
	public Cluster setClasseNomsCanoniques(JsonArray objets) {
		classeNomsCanoniques.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addClasseNomsCanoniques(o);
		}
		return (Cluster)this;
	}
	protected Cluster classeNomsCanoniquesInit() {
		if(!classeNomsCanoniquesCouverture.dejaInitialise) {
			_classeNomsCanoniques(classeNomsCanoniques);
		}
		classeNomsCanoniquesCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public List<String> solrClasseNomsCanoniques() {
		return classeNomsCanoniques;
	}

	public String strClasseNomsCanoniques() {
		return classeNomsCanoniques == null ? "" : classeNomsCanoniques.toString();
	}

	public String nomAffichageClasseNomsCanoniques() {
		return null;
	}

	public String htmTooltipClasseNomsCanoniques() {
		return null;
	}

	public String htmClasseNomsCanoniques() {
		return classeNomsCanoniques == null ? "" : StringEscapeUtils.escapeHtml4(strClasseNomsCanoniques());
	}

	public void htmClasseNomsCanoniques(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "ClasseNomsCanoniques\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "ClasseNomsCanoniques() {");
				r.l("			$.ajax({");
				r.l("				url: '?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setClasseNomsCanoniques\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageClasseNomsCanoniques()), "</span>");
				r.s("			<input");
							r.s(" name=\"classeNomsCanoniques\"");
							r.s(" value=\"", htmClasseNomsCanoniques(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmClasseNomsCanoniques());
			}
			r.l("</div>");
		}
	}

	////////////////////////
	// classeNomCanonique //
	////////////////////////

	/**	L'entité « classeNomCanonique »
	 *	 is defined as null before being initialized. 
	 */
	protected String classeNomCanonique;
	public Couverture<String> classeNomCanoniqueCouverture = new Couverture<String>().p(this).c(String.class).var("classeNomCanonique").o(classeNomCanonique);

	/**	<br/>L'entité « classeNomCanonique »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:classeNomCanonique">Trouver l'entité classeNomCanonique dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _classeNomCanonique(Couverture<String> c);

	public String getClasseNomCanonique() {
		return classeNomCanonique;
	}

	public void setClasseNomCanonique(String classeNomCanonique) {
		this.classeNomCanonique = classeNomCanonique;
		this.classeNomCanoniqueCouverture.dejaInitialise = true;
	}
	protected Cluster classeNomCanoniqueInit() {
		if(!classeNomCanoniqueCouverture.dejaInitialise) {
			_classeNomCanonique(classeNomCanoniqueCouverture);
			if(classeNomCanonique == null)
				setClasseNomCanonique(classeNomCanoniqueCouverture.o);
		}
		classeNomCanoniqueCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public String solrClasseNomCanonique() {
		return classeNomCanonique;
	}

	public String strClasseNomCanonique() {
		return classeNomCanonique == null ? "" : classeNomCanonique;
	}

	public String nomAffichageClasseNomCanonique() {
		return null;
	}

	public String htmTooltipClasseNomCanonique() {
		return null;
	}

	public String htmClasseNomCanonique() {
		return classeNomCanonique == null ? "" : StringEscapeUtils.escapeHtml4(strClasseNomCanonique());
	}

	public void htmClasseNomCanonique(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "ClasseNomCanonique\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "ClasseNomCanonique() {");
				r.l("			$.ajax({");
				r.l("				url: '?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setClasseNomCanonique\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageClasseNomCanonique()), "</span>");
				r.s("			<input");
							r.s(" name=\"classeNomCanonique\"");
							r.s(" value=\"", htmClasseNomCanonique(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmClasseNomCanonique());
			}
			r.l("</div>");
		}
	}

	/////////////////////
	// classeNomSimple //
	/////////////////////

	/**	L'entité « classeNomSimple »
	 *	 is defined as null before being initialized. 
	 */
	protected String classeNomSimple;
	public Couverture<String> classeNomSimpleCouverture = new Couverture<String>().p(this).c(String.class).var("classeNomSimple").o(classeNomSimple);

	/**	<br/>L'entité « classeNomSimple »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:classeNomSimple">Trouver l'entité classeNomSimple dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _classeNomSimple(Couverture<String> c);

	public String getClasseNomSimple() {
		return classeNomSimple;
	}

	public void setClasseNomSimple(String classeNomSimple) {
		this.classeNomSimple = classeNomSimple;
		this.classeNomSimpleCouverture.dejaInitialise = true;
	}
	protected Cluster classeNomSimpleInit() {
		if(!classeNomSimpleCouverture.dejaInitialise) {
			_classeNomSimple(classeNomSimpleCouverture);
			if(classeNomSimple == null)
				setClasseNomSimple(classeNomSimpleCouverture.o);
		}
		classeNomSimpleCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public String solrClasseNomSimple() {
		return classeNomSimple;
	}

	public String strClasseNomSimple() {
		return classeNomSimple == null ? "" : classeNomSimple;
	}

	public String nomAffichageClasseNomSimple() {
		return null;
	}

	public String htmTooltipClasseNomSimple() {
		return null;
	}

	public String htmClasseNomSimple() {
		return classeNomSimple == null ? "" : StringEscapeUtils.escapeHtml4(strClasseNomSimple());
	}

	public void htmClasseNomSimple(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "ClasseNomSimple\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "ClasseNomSimple() {");
				r.l("			$.ajax({");
				r.l("				url: '?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setClasseNomSimple\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageClasseNomSimple()), "</span>");
				r.s("			<input");
							r.s(" name=\"classeNomSimple\"");
							r.s(" value=\"", htmClasseNomSimple(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmClasseNomSimple());
			}
			r.l("</div>");
		}
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCluster = false;

	public Cluster initLoinCluster(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCluster) {
			dejaInitialiseCluster = true;
			initLoinCluster();
		}
		return (Cluster)this;
	}

	public void initLoinCluster() {
		initCluster();
	}

	public void initCluster() {
		pkInit();
		idInit();
		supprimeInit();
		utilisateurIdInit();
		creeInit();
		modifieInit();
		classeNomsCanoniquesInit();
		classeNomCanoniqueInit();
		classeNomSimpleInit();
	}

	public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinCluster(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCluster(RequeteSiteFrFR requeteSite_) {
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteCluster(requeteSite_);
	}

	/////////////
	// indexer //
	/////////////

	public static void indexer() {
		try {
			RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
			requeteSite.initLoinRequeteSiteFrFR();
			SiteContexteFrFR siteContexte = new SiteContexteFrFR();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexteFrFR();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.cluster.Cluster"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			Cluster o = new Cluster();
			o.requeteSiteCluster(requeteSite);
			o.initLoinCluster(requeteSite);
			o.indexerCluster();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	public void indexerPourClasse() throws Exception {
		indexerCluster();
	}

	public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerCluster(document);
	}

	public void indexerCluster(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerCluster(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerCluster() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerCluster(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerCluster(SolrInputDocument document) throws Exception {
		if(sauvegardesCluster != null)
			document.addField("sauvegardesCluster_stored_strings", sauvegardesCluster);

		if(pk != null) {
			document.addField("pk_indexed_long", pk);
			document.addField("pk_stored_long", pk);
		}
		if(id != null) {
			document.addField("id", id);
			document.addField("id_indexed_string", id);
		}
		if(utilisateurId != null) {
			document.addField("utilisateurId_indexed_string", utilisateurId);
			document.addField("utilisateurId_stored_string", utilisateurId);
		}
		if(cree != null) {
			document.addField("cree_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(cree.atOffset(ZoneOffset.UTC)));
			document.addField("cree_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(cree.atOffset(ZoneOffset.UTC)));
		}
		if(modifie != null) {
			document.addField("modifie_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(modifie.atOffset(ZoneOffset.UTC)));
			document.addField("modifie_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(modifie.atOffset(ZoneOffset.UTC)));
		}
		if(classeNomsCanoniques != null) {
			for(java.lang.String o : classeNomsCanoniques) {
				document.addField("classeNomsCanoniques_indexed_strings", o);
			}
			for(java.lang.String o : classeNomsCanoniques) {
				document.addField("classeNomsCanoniques_stored_strings", o);
			}
		}
		if(classeNomCanonique != null) {
			document.addField("classeNomCanonique_indexed_string", classeNomCanonique);
			document.addField("classeNomCanonique_stored_string", classeNomCanonique);
		}
		if(classeNomSimple != null) {
			document.addField("classeNomSimple_indexed_string", classeNomSimple);
			document.addField("classeNomSimple_stored_string", classeNomSimple);
		}
	}

	public void desindexerCluster() throws Exception {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
		requeteSite.initLoinRequeteSiteFrFR();
		SiteContexteFrFR siteContexte = new SiteContexteFrFR();
		siteContexte.initLoinSiteContexteFrFR();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinCluster(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCluster(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCluster(String var) throws Exception {
		Cluster oCluster = (Cluster)this;
		switch(var) {
			case "requeteSite_":
				return oCluster.requeteSite_;
			case "page_":
				return oCluster.page_;
			case "pk":
				return oCluster.pk;
			case "id":
				return oCluster.id;
			case "supprime":
				return oCluster.supprime;
			case "utilisateurId":
				return oCluster.utilisateurId;
			case "cree":
				return oCluster.cree;
			case "modifie":
				return oCluster.modifie;
			case "classeNomsCanoniques":
				return oCluster.classeNomsCanoniques;
			case "classeNomCanonique":
				return oCluster.classeNomCanonique;
			case "classeNomSimple":
				return oCluster.classeNomSimple;
			default:
				return null;
		}
	}

	///////////////
	// attribuer //
	///////////////

	public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerCluster(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCluster(String var, Object val) {
		Cluster oCluster = (Cluster)this;
		switch(var) {
			default:
				return null;
		}
	}

	/////////////
	// definir //
	/////////////

	public boolean definirPourClasse(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirCluster(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCluster(String var, String val) {
		switch(var) {
			case "pk":
				setPk(val);
				sauvegardesCluster.add(var);
				return val;
			case "id":
				setId(val);
				sauvegardesCluster.add(var);
				return val;
			case "supprime":
				setSupprime(val);
				sauvegardesCluster.add(var);
				return val;
			case "utilisateurId":
				setUtilisateurId(val);
				sauvegardesCluster.add(var);
				return val;
			case "cree":
				setCree(val);
				sauvegardesCluster.add(var);
				return val;
			case "modifie":
				setModifie(val);
				sauvegardesCluster.add(var);
				return val;
			case "classeNomsCanoniques":
				addClasseNomsCanoniques(val);
				if(!sauvegardesCluster.contains(var))
					sauvegardesCluster.add(var);
				return val;
			case "classeNomCanonique":
				setClasseNomCanonique(val);
				sauvegardesCluster.add(var);
				return val;
			case "classeNomSimple":
				setClasseNomSimple(val);
				sauvegardesCluster.add(var);
				return val;
			default:
				return null;
		}
	}

	/////////////////
	// sauvegardes //
	/////////////////

	protected List<String> sauvegardesCluster = new ArrayList<String>();

	/////////////
	// peupler //
	/////////////

	public void peuplerPourClasse(SolrDocument solrDocument) {
		peuplerCluster(solrDocument);
	}
	public void peuplerCluster(SolrDocument solrDocument) {
		Cluster oCluster = (Cluster)this;
		sauvegardesCluster = (List<String>)solrDocument.get("sauvegardesCluster_stored_strings");
		if(sauvegardesCluster != null) {

			Long pk = (Long)solrDocument.get("pk_stored_long");
			oCluster.setPk(pk);

			String id = (String)solrDocument.get("id");
			oCluster.setId(id);

			if(sauvegardesCluster.contains("utilisateurId")) {
				String utilisateurId = (String)solrDocument.get("utilisateurId_stored_string");
				if(utilisateurId != null)
					oCluster.setUtilisateurId(utilisateurId);
			}

			if(sauvegardesCluster.contains("cree")) {
				Date cree = (Date)solrDocument.get("cree_stored_date");
				if(cree != null)
					oCluster.setCree(cree);
			}

			if(sauvegardesCluster.contains("modifie")) {
				Date modifie = (Date)solrDocument.get("modifie_stored_date");
				if(modifie != null)
					oCluster.setModifie(modifie);
			}

			if(sauvegardesCluster.contains("classeNomsCanoniques")) {
				List<String> classeNomsCanoniques = (List<String>)solrDocument.get("classeNomsCanoniques_stored_strings");
				if(classeNomsCanoniques != null)
					oCluster.classeNomsCanoniques.addAll(classeNomsCanoniques);
			}

			if(sauvegardesCluster.contains("classeNomCanonique")) {
				String classeNomCanonique = (String)solrDocument.get("classeNomCanonique_stored_string");
				if(classeNomCanonique != null)
					oCluster.setClasseNomCanonique(classeNomCanonique);
			}

			if(sauvegardesCluster.contains("classeNomSimple")) {
				String classeNomSimple = (String)solrDocument.get("classeNomSimple_stored_string");
				if(classeNomSimple != null)
					oCluster.setClasseNomSimple(classeNomSimple);
			}
		}
	}

	/////////////
	// stocker //
	/////////////

	public void stockerPourClasse(SolrDocument solrDocument) {
		stockerCluster(solrDocument);
	}
	public void stockerCluster(SolrDocument solrDocument) {
		Cluster oCluster = (Cluster)this;

		Long pk = (Long)solrDocument.get("pk_stored_long");
		if(pk != null)
			oCluster.setPk(pk);

		String id = (String)solrDocument.get("id");
		oCluster.setId(id);

		String utilisateurId = (String)solrDocument.get("utilisateurId_stored_string");
		if(utilisateurId != null)
			oCluster.setUtilisateurId(utilisateurId);

		Date cree = (Date)solrDocument.get("cree_stored_date");
		if(cree != null)
			oCluster.setCree(cree);

		Date modifie = (Date)solrDocument.get("modifie_stored_date");
		if(modifie != null)
			oCluster.setModifie(modifie);

		List<String> classeNomsCanoniques = (List<String>)solrDocument.get("classeNomsCanoniques_stored_strings");
		if(classeNomsCanoniques != null)
			oCluster.classeNomsCanoniques.addAll(classeNomsCanoniques);

		String classeNomCanonique = (String)solrDocument.get("classeNomCanonique_stored_string");
		if(classeNomCanonique != null)
			oCluster.setClasseNomCanonique(classeNomCanonique);

		String classeNomSimple = (String)solrDocument.get("classeNomSimple_stored_string");
		if(classeNomSimple != null)
			oCluster.setClasseNomSimple(classeNomSimple);
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(pk, id, supprime, utilisateurId, cree, modifie, classeNomsCanoniques, classeNomCanonique, classeNomSimple);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof Cluster))
			return false;
		Cluster that = (Cluster)o;
		return Objects.equals( pk, that.pk )
				&& Objects.equals( id, that.id )
				&& Objects.equals( supprime, that.supprime )
				&& Objects.equals( utilisateurId, that.utilisateurId )
				&& Objects.equals( cree, that.cree )
				&& Objects.equals( modifie, that.modifie )
				&& Objects.equals( classeNomsCanoniques, that.classeNomsCanoniques )
				&& Objects.equals( classeNomCanonique, that.classeNomCanonique )
				&& Objects.equals( classeNomSimple, that.classeNomSimple );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cluster {");
		sb.append( "pk: " ).append(pk);
		sb.append( ", id: \"" ).append(id).append( "\"" );
		sb.append( ", supprime: " ).append(supprime);
		sb.append( ", utilisateurId: \"" ).append(utilisateurId).append( "\"" );
		sb.append( ", cree: " ).append(cree);
		sb.append( ", modifie: " ).append(modifie);
		sb.append( ", classeNomsCanoniques: " ).append(classeNomsCanoniques);
		sb.append( ", classeNomCanonique: \"" ).append(classeNomCanonique).append( "\"" );
		sb.append( ", classeNomSimple: \"" ).append(classeNomSimple).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}
}
