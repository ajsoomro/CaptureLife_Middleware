package com.rc.ws.base.impl;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;

import org.springframework.stereotype.Component;

import com.rc.common.config.ApplicationData;
import com.rc.ws.base.RESTfulBaseService;
import com.sun.jersey.api.core.InjectParam;

@Component
public class RESTFulBaseServiceImpl implements RESTfulBaseService {

	@Context
	private HttpServletRequest request;
	
	@InjectParam
	private ApplicationData applicationData;

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public ApplicationData getApplicationData() {
		return applicationData;
	}

	public void setApplicationData(ApplicationData applicationData) {
		this.applicationData = applicationData;
	}

}
