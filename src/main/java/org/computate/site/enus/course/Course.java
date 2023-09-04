package org.computate.site.enus.course;

import org.apache.commons.lang3.StringUtils;
import org.computate.search.wrap.Wrap;
import org.computate.site.enus.article.Article;

/**
 * Api: true
 * Indexed: true
 * Page: true
 * SuperPage.enUS: ArticlePage
 * Order: 2
 * 
 * ApiTag: Course
 * ApiUri: /api/course
 * ApiMethod: SearchPage
 * ApiMethod: Search
 * ApiMethod: GET
 * ApiUri.SearchPage.enUS: /enUS/course
 * 
 * AName.frFR: un cours
 * AName.enUS: a course
 * NamePlural.frFR: cours
 * Color: green
 * IconGroup: regular
 * IconName: university
*/
public class Course extends CourseGen<Article> {

	protected void _courseIdentifierLowercase(Wrap<String> c) {
		String s = "c" + String.format("%03d", courseNumber);
		c.o(s);
	}

	protected void _courseIdentifierCapitalized(Wrap<String> c) {
		String s = StringUtils.capitalize(courseIdentifierLowercase);
		c.o(s);
	}

	@Override
	protected void _isCourse(Wrap<Boolean> w) {
		w.o(true);
	}
}
