package org.computate.site.enUS.page.faq;

import java.util.List;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.page.parti.QuestionReponse;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enus.article.Article;
import org.computate.site.site.enUS.couverture.Couverture;

public class PageFaq extends PageFaqGen<Article> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(PageFaq.class.getCanonicalName());
		l.add(org.computate.site.frFR.page.faq.PageFaq.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(PageFaq_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(PageFaq_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(PageFaqEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(PageFaqFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(PageFaqEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(PageFaqFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H1);
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H2);
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaqVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(PageFaq_H1);
		addPageRecherche_frFR(PageFaq_H2);
		addPageRecherche_frFR(PageFaqVals);
	}

	@Override()
	protected void  _pageTitre(Couverture<String> c) {
		c.o(PageFaq_H1 + PageFaq_H2);
	}

	@Override()
	protected void  _pageH1(Couverture<String> c) {
		c.o(PageFaq_H1);
	}

	@Override()
	protected void  _pageH2(Couverture<String> c) {
		c.o(PageFaq_H2);
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

	protected void _i18n(PageHtml o) {
	}

	protected void _recapituler2(PageHtml o) {     
	}

	protected void _recapituler3(PageHtml o) {      
	}
}
