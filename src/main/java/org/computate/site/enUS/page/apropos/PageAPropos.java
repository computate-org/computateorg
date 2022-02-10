package org.computate.site.enUS.page.apropos;

import java.util.List;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.page.parti.QuestionReponse;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enus.article.Article;
import org.computate.site.site.enUS.couverture.Couverture;

public class PageAPropos extends PageAProposGen<Article> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(PageAPropos.class.getCanonicalName());
		l.add(org.computate.site.frFR.page.apropos.PageAPropos.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(PageAPropos_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(PageAPropos_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(PageAProposEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(PageAProposFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(PageAProposEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(PageAProposFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H1);
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H2);
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAProposVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(PageAPropos_H1);
		addPageRecherche_frFR(PageAPropos_H2);
		addPageRecherche_frFR(PageAProposVals);
	}

	@Override()
	protected void  _pageTitre(Couverture<String> c) {
		c.o(PageAPropos_H1 + PageAPropos_H2);
	}

	@Override()
	protected void  _pageH1(Couverture<String> c) {
		c.o(PageAPropos_H1);
	}

	@Override()
	protected void  _pageH2(Couverture<String> c) {
		c.o(PageAPropos_H2);
	}

	protected void _listeArticle(ListeRecherche<Article> o) {
		o.setC(Article.class);
		o.setQuery("*:*");
		o.addSort("archive_indexed_boolean", ORDER.asc);
		o.addSort("supprime_indexed_boolean", ORDER.asc);
		o.addFilterQuery("classeNomsCanoniques_indexed_strings:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.article.Article"));
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _ouVenezVous(PageHtml o) {
	}

	public void  htmlBodyOuVenezVous(PageHtml o) { 
		e("p").f();
			e("div").a("class", "w3-row w3-mobile ").f();
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/idaho-winter.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/idaho-winter.jpg").fg();
					g("a");
					e("a").a("href", statiqueUrlBase, "/jpg/utah-mountains2.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/utah-mountains2.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/utah-mountains.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/utah-mountains.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/idaho.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/idaho.jpg").fg();
					g("a");
					e("a").a("href", statiqueUrlBase, "/jpg/quebec.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/quebec.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/france.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/france.jpg").fg();
					g("a");
				g("div");
			g("div");
		g("p");
		super.htmlBodyOuVenezVous(o);
	}

	protected void _informatique(PageHtml o) {
	}

	protected void _emploi(PageHtml o) {
	}

	protected void _opensource(PageHtml o) {
	}

	protected void _recapituler2(PageHtml o) {      
	}

	protected void _recapituler3(PageHtml o) {      
	}
}
