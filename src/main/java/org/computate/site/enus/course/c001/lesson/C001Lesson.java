package org.computate.site.enus.course.c001.lesson;

import java.time.ZonedDateTime;

import org.computate.search.wrap.Wrap;
import org.computate.site.enus.article.Article;
import org.computate.site.enus.course.c001.C001;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;

/**     
 * Api: true
 * Page: true
 * SuperPage.enUS: C001Page
 * Map.Integer.classSort: 4
 * 
 * ApiMethod: SearchPage
 * ApiUriSearchPage.enUS: /enUS/course/001/lessons
 * UnNom.frFR: un leçon
 * UnNom.enUS: a lesson
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: book
*/
public class C001Lesson extends C001LessonGen<C001> {

	/**
	 * DocValues: true
	 */
	protected void _leconCree(Wrap<ZonedDateTime> c) {
	}

	@Override protected void _lessonNumber(Wrap<Integer> c) {
	}

	@Override protected void _pageCreated(Wrap<ZonedDateTime> c) {
		c.o(leconCree);
	}

	@Override protected void _isLesson(Wrap<Boolean> c) {
		c.o(true);
	}

	@Override protected void _isCourse(Wrap<Boolean> c) {
		c.o(false);
	}

	/**
	 */ 
	protected void _leconsACote(Promise<SearchList<Article>> promise) {
		SearchList<Article> l = new SearchList<>();
		l.setC(C001Lesson.class);
		l.q("*:*");
		l.rows(2);
		l.fq("lessonNumber_docvalues_int:(" + (lessonNumber - 1) + " OR " + (lessonNumber + 1) + ")");
		l.sortAsc("lessonNumber_docvalues_int");
		promise.complete(l);
	}
}
