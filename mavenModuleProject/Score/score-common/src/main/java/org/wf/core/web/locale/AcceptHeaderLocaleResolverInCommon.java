package org.wf.core.web.locale;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

public class AcceptHeaderLocaleResolverInCommon extends
		AcceptHeaderLocaleResolver {
	
	private Locale myLocal;

	public Locale resolveLocale(HttpServletRequest request) {
		return myLocal;
	}

	public void setLocale(HttpServletRequest request,
			HttpServletResponse response, Locale locale) {
		myLocal = locale;
	}

}
