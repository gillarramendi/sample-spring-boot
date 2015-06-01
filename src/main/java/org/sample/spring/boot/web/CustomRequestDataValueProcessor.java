package org.sample.spring.boot.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.support.RequestDataValueProcessor;

public class CustomRequestDataValueProcessor implements RequestDataValueProcessor {

	@Override
	public String processAction(HttpServletRequest request, String action, String httpMethod) {
		return action;
	}

	@Override
	public String processFormFieldValue(HttpServletRequest request, String name, String value, String type) {
		return value;
	}

	@Override
	public Map<String, String> getExtraHiddenFields(HttpServletRequest request) {
		return new HashMap<String, String>();
	}

	@Override
	public String processUrl(HttpServletRequest request, String url) {
		return url + "?autoparam=Hi";
	}

}
