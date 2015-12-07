package com.rc.dto.pojo;

import java.util.HashMap;
import java.util.Map;

import com.rc.dto.base.BaseDTO;

public class BaseStoreConfigDTO extends BaseDTO {

	private String platform;
	private String version;
	private String featurePack;
	private String storeId;
	private String hostname;
	private String port;
	private String URI;
	private Map<String, String> parameters;
	
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		if(platform != null)
			platform = platform.toLowerCase();
		this.platform = platform;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		if(version != null)
			version = version.toLowerCase();
		this.version = version;
	}
	public String getFeaturePack() {
		return featurePack;
	}
	public void setFeaturePack(String featurePack) {
		if(featurePack != null)
			featurePack = featurePack.toLowerCase();
		this.featurePack = featurePack;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getURI() {
		return URI;
	}
	public void setURI(String uRI) {
		URI = uRI;
	}
	public Map<String, String> getParameters() {
		return parameters;
	}
	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}
	public void setParameters(String key, String value) {
		if(this.parameters == null)
			this.parameters = new HashMap<String,String>();
		
		this.parameters.put(key, value);
	}
}
