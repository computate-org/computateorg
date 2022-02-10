package org.computate.site.enUS.cours;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.enUS.page.parti.PagePart;
import org.computate.site.enUS.user.UtilisateurSite;
import org.computate.site.enus.article.Article;
import org.computate.site.site.enUS.couverture.Couverture;

public class Cours extends CoursGen<Article> {

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(Cours.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.Cours.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _estCours(Couverture<Boolean> c) {
		c.o(true);
	}

	@Override()
	protected void  _estLecon(Couverture<Boolean> c) {
		c.o(false);
	}

	@Override()
	protected void  _estArticle(Couverture<Boolean> c) {
		c.o(false);
	}

	protected void _coursIdentifiantMinuscule(Couverture<String> c) {
		String s = "c" + String.format("%03d", coursNumero);
		c.o(s);
	}

	protected void _coursIdentifiantMajuscule(Couverture<String> c) {
		String s = StringUtils.capitalize(coursIdentifiantMinuscule);
		c.o(s);
	}
}
