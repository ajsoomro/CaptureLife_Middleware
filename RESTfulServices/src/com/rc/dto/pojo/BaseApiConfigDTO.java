package com.rc.dto.pojo;

import com.rc.dto.base.BaseDTO;

public class BaseApiConfigDTO extends BaseDTO {

	private String name;
	private String URI;
	private String requestMethod;
	private String consumes;
	private String produces;
	private boolean https;
	private String parameters;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getURI() {
		return URI;
	}
	public void setURI(String uRI) {
		URI = uRI;
	}
	public String getRequestMethod() {
		return requestMethod;
	}
	public void setRequestMethod(String requestMethod) {
		if(requestMethod != null)
			requestMethod = requestMethod.toLowerCase();
		this.requestMethod = requestMethod;
	}
	public String getConsumes() {
		return consumes;
	}
	public void setConsumes(String consumes) {
		if(consumes != null)
			consumes = consumes.toLowerCase();
		this.consumes = consumes;
	}
	public String getProduces() {
		return produces;
	}
	public void setProduces(String produces) {
		if(produces != null)
			produces = produces.toLowerCase();
		this.produces = produces;
	}
	public boolean isHttps() {
		return https;
	}
	public void setHttps(boolean https) {
		this.https = https;
	}
	public String getParameters() {
		return parameters;
	}
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
}
