package org.computate.site.enus.course.c001;

import org.computate.search.wrap.Wrap;
import org.computate.site.enus.course.Course;

/**
 * Api: true
 * Page: true
 * SuperPage.enUS: CoursePage
 * Map.Integer.classSort: 3
 * 
 * ApiMethod: SearchPage
 * ApiUri.SearchPage.enUS: /enUS/course/001
 * AName.frFR: un cours n ° 1
 * AName.enUS: a course #1
 * NamePlural.frFR: courses
 * 
 * H1.frFR: Construire des applications Web modernes et async avec les meilleurs logiciels open sources. 
 * H1.enUS: Build modern asynchronous web applications with the best open source software. 
 * 
 * H2.frFR: Avec Vert.x, sur Linux, données PostgreSQL, recherche Solr, construit comme containers Linux sur OpenShift. 
 * H2.enUS: With Vert.x, on Linux, PostgreSQL data, Solr search, deployable as Linux containers on OpenShift. 
 * 
 * Titre.frFR: Construire des applications Web modernes et async avec les meilleurs logiciels open sources. 
 * Titre.enUS: Build modern asynchronous web applications with the best open source software. 
 * 
 * Description.frFR: Avec Vert.x, sur Linux, données PostgreSQL, recherche Solr, construit comme containers Linux sur OpenShift. 
 * Description.enUS: With Vert.x, on Linux, PostgreSQL data, Solr search, deployable as Linux containers on OpenShift. 
 * 
 * Color: green
 * IconGroup: regular
 * IconName: university
*/
public class C001 extends C001Gen<Course> {

	@Override protected void _articleH1_frFR(Wrap<String> c) {
//		c.o(C001_H1_frFR);
	}

	@Override protected void _articleH1_enUS(Wrap<String> c) {
		c.o(C001_H1_enUS);
	}

	@Override protected void _articleH2_frFR(Wrap<String> c) {
//		c.o(C001_H2_frFR);
	}

	@Override protected void _articleH2_enUS(Wrap<String> c) {
		c.o(C001_H2_enUS);
	}

	@Override protected void _pageUri_enUS(Wrap<String> c) {
		c.o(SearchPage_enUS_Uri);
	}
}
