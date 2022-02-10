package org.computate.site.enus.article;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.solr.common.SolrDocument;
import org.computate.site.enUS.article.ArticleGen;
import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.page.parti.PagePart;
import org.computate.site.enUS.user.UtilisateurSite;
import org.computate.site.site.enUS.couverture.Couverture;
import org.computate.site.site.enus.model.base.Cluster;

public class Article extends ArticleGen<Cluster> {

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(Article.class.getCanonicalName());
		l.add(org.computate.site.enus.article.Article.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	protected void _statiqueUrlBase(Couverture<String> c) {
		c.o(requeteSite_.getConfigSite_().getStatiqueUrlBase()); 
	}

	protected void _documentSolr(Couverture<SolrDocument> c) {  
		c.o(requeteSite_.getDocumentSolr());
	}

	protected void _nomDomaine(Couverture<String> c) {
		c.o("example.com");
	}

	protected void _nomSite(Couverture<String> c) {
		c.o(nomDomaine);
	}

	protected void _nomHoteSite(Couverture<String> c) {
		c.o(nomDomaine);
	}

	protected void _nomEnsembleSite(Couverture<String> c) { 
		String[] partis = StringUtils.split(nomHoteSite, ".");
		ArrayUtils.reverse(partis);
		String o = StringUtils.join(partis, ".");
		c.o(o);
	}

	protected void _nomHoteOrdinateur(Couverture<String> c) {
		c.o("tower1." + nomDomaine);
	}

	protected void _cheminServeur(Couverture<String> c) {
		String o = new StringBuilder("/srv/").append(nomHoteOrdinateur).toString();
		c.o(o);
	}

	protected void _cheminProjet(Couverture<String> c) {
		String o = new StringBuilder(cheminServeur).append("/").append(nomDomaine).toString();
		c.o(o);
	}

	protected void _utilisateurNom(Couverture<String> c) {
		String[] partis = requeteSite_.getUtilisateurNom() == null ? new String[0] : requeteSite_.getUtilisateurNom().split("\\W");
		if(partis.length > 0) {
			String o = partis[0];
			c.o(o);
		}
		else {
			c.o("monutilisateur");
		}
	}

	protected void _groupeNom(Couverture<String> c) {
		c.o(utilisateurNom);
	}

	protected void _estCours(Couverture<Boolean> c) {
		c.o(false);
	}

	protected void _estLecon(Couverture<Boolean> c) {
		c.o(false);
	}

	protected void _estArticle(Couverture<Boolean> c) {
		c.o(true);
	}

	protected void _coursNumero(Couverture<Integer> c) {
		Matcher m = Pattern.compile("^C(\\d+)", Pattern.MULTILINE).matcher(getClass().getSimpleName());
		if(m.find()) {
			Integer o = Integer.parseInt(m.group(1));
			c.o(o);
		}
	}

	protected void _leconNumero(Couverture<Integer> c) {
	}

	protected void _leconDescription(Couverture<String> c) {
		if(estLecon)
			c.o(articleH1_enUS + "\n" + articleH2_enUS);
	}

	protected void _articleH1_enUS(Couverture<String> c) {
	}

	protected void _articleH1_frFR(Couverture<String> c) {
	}

	protected void _articleH2_enUS(Couverture<String> c) {
	}

	protected void _articleH2_frFR(Couverture<String> c) {
	}

	protected void _articleH1(Couverture<String> c) {
		c.o(articleH1_enUS);
	}

	protected void _articleH2(Couverture<String> c) {
		c.o(articleH2_enUS);
	}

	protected void _articleDescription(Couverture<String> c) {
		c.o(articleH1_enUS + "\n" + articleH2_enUS);
	}

	protected void _pageDescription(Couverture<String> c) {
		c.o(articleH1_frFR + "\n" + articleH2_frFR);
	}

	protected void _articleCree(Couverture<LocalDateTime> c) {
	}

	protected void _pageUri_enUS(Couverture<String> c) {
	}

	protected void _pageUri_frFR(Couverture<String> c) {
	}

	protected void _pageUri(Couverture<String> c) {
		c.o(pageUri_enUS);
	}

	protected void _pageImageUri_enUS(Couverture<String> c) {
	}

	protected void _pageImageUri_frFR(Couverture<String> c) {
	}

	protected void _pageImageUri(Couverture<String> c) {
		c.o(pageImageUri_enUS);
	}

	protected void _pageCree(Couverture<LocalDateTime> c) {
		c.o(articleCree);
	}

	protected void _pageH1(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_H1")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	protected void _pageH2(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_H2")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	protected void _pageH3(Couverture<String> c) { 
		if(pageCree != null)
			c.o("Created: " + pageCree.format(MiseEnPage.FORMATAffichage));
	}

	protected void _pageTitre(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_Title")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	protected void _pageRecherche_enUS(List<String> l) {
	}

	protected void _pageRecherche_frFR(List<String> l) {
	}

	public void  htmlBody() {
		super.htmlBody();
	}

	@Override()
	protected void  _id(Couverture<String> c) {
		c.o(getClass().getCanonicalName());
	}

	protected void _pageParts(List<PagePart> l) {
	}

	public void  avantPagePart(PagePart o, String var) {
	}

	protected void _utilisateurSite(Couverture<UtilisateurSite> c) {
		c.o(requeteSite_.getUtilisateurSite());
	}

	@Override()
	public void  htmlBodyArticle() {
	}

	protected void _utilisateurId(Couverture<String> c) {
		if(utilisateurSite != null)
			c.o(utilisateurSite.getUtilisateurId());
	}

	protected void _utilisateurSiteNomDomaine(Couverture<String> c) {
		if(utilisateurSite != null)
			c.o(utilisateurSite.getSiteNomDomaine());
	}

	public void  htmlBodyPersonnaliserAvant(PageHtml o) {
		if(utilisateurSite != null && requeteSite_.getUtilisateurRolesRessource().contains("SiteAdmin")) {
			{ e("div").a("class", "w3-card-4 w3-margin-bottom ").f();
				{ e("h1").a("class", "w3-container w3-vivid-greenish-blue ").f();
					e("i").a("class", "far fa-keyboard site-menu-icon ").f().g("i");
					sx("Site Admin. ");
				} g("h1");
				{ e("div").a("class", "w3-padding ").f();

					// FormFiltres PATCH
					{ e("form").a("action", "/api/cluster").a("id", "patchClusterFormFiltres").f();
					} g("form");
					{ e("form").a("action", "/api/cluster").a("id", "patchClusterFormValeurs").f();
					} g("form");
					e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3- ")
						.a("onclick", "patchCluster($('#patchClusterFormFiltres'), $('#patchClusterFormValeurs')); ")
						.f().sx("Indexer tous les pages")
					.g("button");
				} g("div");
			} g("div");
		}
		{ e("div").a("class", "w3-card-4 w3-margin-bottom ").f();
			{e("h1").a("class", "w3-container w3-vivid-greenish-blue ").f();
				e("i").a("class", "far fa-keyboard site-menu-icon ").f().g("i");
				sx("Customize the whole site for your domain. ");
			} g("h1");
			{ e("div").a("class", "w3-padding ").f();
				if(utilisateurSite == null) {
					{ e("ol").f();
						{ e("li").f();
							e("i").a("class", "far fa-sign-in-alt site-menu-icon ").f().g("i");
							sx("Just click the ");
							e("a").a("class", "").a("href", "/enUS/user").f(); 
								sx("[ Login ]");
							g("a");
							sx(" button above. ");
						} g("li");
						{ e("li").f();
							e("i").a("class", "far fa-users-medical site-menu-icon ").f().g("i");
							sx("Click: New user? Register");
						} g("li");
						{ e("li").f();
							e("i").a("class", "far fa-shield-check site-menu-icon ").f().g("i");
							sx("It's free, and your information is private. ");
						} g("li");
					} g("ol");
				}
				else {
				}
			}
		}
	}

	public void  htmlBodyPersonnaliserApres(PageHtml o) {
		{
			{
				if(utilisateurSite == null) {
				}
				else {
					e("a").a("href", "").f().g("a");
				}
			} g("div");
		} g("div");
	}
}
