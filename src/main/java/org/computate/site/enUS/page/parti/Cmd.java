package org.computate.site.enUS.page.parti;

import org.computate.site.enUS.chaine.Chaine;

public class Cmd extends CmdGen<QuestionReponse> {

	protected void _cmd(Chaine o) {
	}

	@Override()
	public void  htmlAvant() {
		super.htmlAvant();
		e("span").a("class", "site-cmd-complet ").f();
	}

	@Override()
	public void  htmlMilieu() {
		e("span").f().sx(cmd).g("span");
		super.htmlMilieu();
	}

	@Override()
	public void  htmlApres() {
		g("span");
		super.htmlApres();
	}

	@Override()
	public void  htmlBody() {
		super.htmlBody();
	}

	@Override()
	public void  htmlBodyCourt() {
		super.htmlBodyCourt();
	}
}
