/**
 * This file is part of Wikiforia.
 *
 * Wikiforia is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Wikiforia is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Wikiforia. If not, see <http://www.gnu.org/licenses/>.
 */
 package se.lth.cs.nlp.wikipedia.lang;

//Autogenerated from Wikimedia sources at 2015-04-16T13:55:11+00:00

public class IsConfig extends TemplateConfig {
	public IsConfig() {
		addNamespaceAlias(-2, "Miðill");
		addNamespaceAlias(-1, "Kerfissíða");
		addNamespaceAlias(1, "Spjall");
		addNamespaceAlias(2, "Notandi");
		addNamespaceAlias(3, "Notandaspjall");
		addNamespaceAlias(5, "Wikipediaspjall");
		addNamespaceAlias(6, "Mynd");
		addNamespaceAlias(7, "Myndaspjall");
		addNamespaceAlias(8, "Melding");
		addNamespaceAlias(9, "Meldingarspjall");
		addNamespaceAlias(10, "Snið");
		addNamespaceAlias(11, "Sniðaspjall");
		addNamespaceAlias(12, "Hjálp");
		addNamespaceAlias(13, "Hjálparspjall");
		addNamespaceAlias(14, "Flokkur");
		addNamespaceAlias(15, "Flokkaspjall");

		addI18nCIAlias("redirect", "#tilvísun", "#TILVÍSUN", "#REDIRECT");
		addI18nCIAlias("nogallery", "__EMSAFN__", "__NOGALLERY__");
		addI18nAlias("currentday", "NÚDAGUR", "CURRENTDAY");
		addI18nAlias("currentday2", "NÚDAGUR2", "CURRENTDAY2");
		addI18nAlias("currentdayname", "NÚDAGNAFN", "CURRENTDAYNAME");
		addI18nAlias("currentyear", "NÚÁR", "CURRENTYEAR");
		addI18nAlias("currenttime", "NÚTÍMI", "CURRENTTIME");
		addI18nAlias("currenthour", "NÚKTÍMI", "CURRENTHOUR");
		addI18nAlias("localmonth", "STMÁN", "LOCALMONTH", "LOCALMONTH2");
		addI18nAlias("localmonthname", "STMÁNNAFN", "LOCALMONTHNAME");
		addI18nAlias("localmonthabbrev", "STMÁNST", "LOCALMONTHABBREV");
		addI18nAlias("localday", "STDAGUR", "LOCALDAY");
		addI18nAlias("localday2", "STDAGUR2", "LOCALDAY2");
		addI18nAlias("localdayname", "STDAGNAFN", "LOCALDAYNAME");
		addI18nAlias("localyear", "STÁR", "LOCALYEAR");
		addI18nAlias("localtime", "STTÍMI", "LOCALTIME");
		addI18nAlias("localhour", "STKTÍMI", "LOCALHOUR");
		addI18nAlias("numberofpages", "FJLSÍÐA", "NUMBEROFPAGES");
		addI18nAlias("numberofarticles", "FJLGREINA", "NUMBEROFARTICLES");
		addI18nAlias("numberoffiles", "FJLSKJALA", "NUMBEROFFILES");
		addI18nAlias("numberofusers", "FJLNOT", "NUMBEROFUSERS");
		addI18nAlias("numberofedits", "FJLBREYT", "NUMBEROFEDITS");
		addI18nAlias("pagename", "SÍÐUNAFN", "PAGENAME");
		addI18nAlias("namespace", "NAFNSVÆÐI", "NAMESPACE");
		addI18nAlias("talkspace", "SPJALLSVÆÐI", "TALKSPACE");
		addI18nAlias("fullpagename", "FULLTSÍÐUNF", "FULLPAGENAME");
		addI18nAlias("img_manualthumb", "þumall", "thumbnail=$1", "thumb=$1");
		addI18nAlias("img_right", "hægri", "right");
		addI18nAlias("img_left", "vinstri", "left");
		addI18nAlias("img_none", "engin", "none");
		addI18nAlias("img_width", "$1dp", "$1px");
		addI18nAlias("img_center", "miðja", "center", "centre");
		addI18nAlias("img_sub", "undir", "sub");
		addI18nAlias("img_super", "yfir", "super", "sup");
		addI18nAlias("img_top", "efst", "top");
		addI18nAlias("img_bottom", "neðst", "bottom");
		addI18nAlias("img_text_bottom", "texti-neðst", "text-bottom");
		addI18nCIAlias("ns", "NR:", "NS:");
		addI18nCIAlias("server", "VEFÞJ", "SERVER");
		addI18nCIAlias("servername", "VEFÞJNF", "SERVERNAME");
		addI18nCIAlias("grammar", "MÁLFRÆÐI:", "GRAMMAR:");
		addI18nAlias("currentweek", "NÚVIKA", "CURRENTWEEK");
		addI18nAlias("localweek", "STVIKA", "LOCALWEEK");
		addI18nCIAlias("plural", "FLTALA:", "PLURAL:");
		addI18nCIAlias("raw", "HRÁ:", "RAW:");
		addI18nAlias("displaytitle", "SÝNATITIL", "DISPLAYTITLE");
		addI18nCIAlias("language", "#TUNGUMÁL", "#LANGUAGE:");
		addI18nCIAlias("special", "kerfissíða", "special");
	}

	@Override
	protected String getSiteName() {
		return "Wikipedia";
	}

	@Override
	protected String getWikiUrl() {
		return "http://is.wikipedia.org/";
	}

	@Override
	public String getIso639() {
		return "is";
	}
}