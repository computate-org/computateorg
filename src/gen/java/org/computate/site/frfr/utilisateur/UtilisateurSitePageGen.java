package org.computate.site.frfr.utilisateur;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import org.computate.site.frfr.base.ModeleBase;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.computate.site.frfr.config.ConfigCles;
import org.apache.commons.collections.CollectionUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.computate.site.frfr.utilisateur.UtilisateurSiteGenPage;
import java.math.RoundingMode;
import org.slf4j.Logger;
import java.math.MathContext;
import io.vertx.core.Promise;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.vertx.core.Future;
import org.computate.site.frfr.requete.api.RequeteApi;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.utilisateur.UtilisateurSitePage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class UtilisateurSitePageGen<DEV> extends UtilisateurSiteGenPage {
	protected static final Logger LOG = LoggerFactory.getLogger(UtilisateurSitePage.class);

	//////////////
	// initLoin //
	//////////////

	public Future<Void> promesseLoinUtilisateurSitePage(RequeteSiteFrFR requeteSite_) {
		return promesseLoinUtilisateurSitePage();
	}

	public Future<Void> promesseLoinUtilisateurSitePage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promesseUtilisateurSitePage(promise2);
		promise2.future().onSuccess(a -> {
			super.promesseLoinUtilisateurSiteGenPage(requeteSite_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promesseUtilisateurSitePage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override public Future<Void> promesseLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		return promesseLoinUtilisateurSitePage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirUtilisateurSitePage(v);
			else if(o instanceof ModeleBase) {
				ModeleBase modeleBase = (ModeleBase)o;
				o = modeleBase.obtenirPourClasse(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtenirUtilisateurSitePage(String var) {
		UtilisateurSitePage oUtilisateurSitePage = (UtilisateurSitePage)this;
		switch(var) {
			default:
				return super.obtenirUtilisateurSiteGenPage(var);
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
				o = attribuerUtilisateurSitePage(v, val);
			else if(o instanceof ModeleBase) {
				ModeleBase modeleBase = (ModeleBase)o;
				o = modeleBase.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerUtilisateurSitePage(String var, Object val) {
		UtilisateurSitePage oUtilisateurSitePage = (UtilisateurSitePage)this;
		switch(var) {
			default:
				return super.attribuerUtilisateurSiteGenPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		return staticSetUtilisateurSitePage(entiteVar,  requeteSite_, o);
	}
	public static Object staticSetUtilisateurSitePage(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		switch(entiteVar) {
			default:
				return UtilisateurSiteGenPage.staticSetUtilisateurSiteGenPage(entiteVar,  requeteSite_, o);
		}
	}

	////////////////
	// staticSolr //
	////////////////

	public static Object staticSolrPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		return staticSolrUtilisateurSitePage(entiteVar,  requeteSite_, o);
	}
	public static Object staticSolrUtilisateurSitePage(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		switch(entiteVar) {
			default:
				return UtilisateurSiteGenPage.staticSolrUtilisateurSiteGenPage(entiteVar,  requeteSite_, o);
		}
	}

	///////////////////
	// staticSolrStr //
	///////////////////

	public static String staticSolrStrPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		return staticSolrStrUtilisateurSitePage(entiteVar,  requeteSite_, o);
	}
	public static String staticSolrStrUtilisateurSitePage(String entiteVar, RequeteSiteFrFR requeteSite_, Object o) {
		switch(entiteVar) {
			default:
				return UtilisateurSiteGenPage.staticSolrStrUtilisateurSiteGenPage(entiteVar,  requeteSite_, o);
		}
	}

	//////////////////
	// staticSolrFq //
	//////////////////

	public static String staticSolrFqPourClasse(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		return staticSolrFqUtilisateurSitePage(entiteVar,  requeteSite_, o);
	}
	public static String staticSolrFqUtilisateurSitePage(String entiteVar, RequeteSiteFrFR requeteSite_, String o) {
		switch(entiteVar) {
			default:
				return UtilisateurSiteGenPage.staticSolrFqUtilisateurSiteGenPage(entiteVar,  requeteSite_, o);
		}
	}

	/////////////
	// definir //
	/////////////

	@Override public boolean definirPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirUtilisateurSitePage(v, val);
				else if(o instanceof ModeleBase) {
					ModeleBase oModeleBase = (ModeleBase)o;
					o = oModeleBase.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirUtilisateurSitePage(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return super.definirUtilisateurSiteGenPage(var, val);
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		return sb.toString();
	}

}
