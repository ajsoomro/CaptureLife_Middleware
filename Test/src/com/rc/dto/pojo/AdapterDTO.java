package com.rc.dto.pojo;

import java.util.Map;

import com.rc.dto.base.BaseDTO;

public class AdapterDTO extends BaseDTO {

	private String URL;
	private Map<String, String> requestParameters;
	private Map<String, String> requestHeaderParameters;
	private BaseApiConfigDTO apiDTO;
	private BaseStoreConfigDTO baseStoreConfigDTO;

	public BaseStoreConfigDTO getBaseStoreConfigDTO() {
		return baseStoreConfigDTO;
	}

	public void setBaseStoreConfigDTO(BaseStoreConfigDTO configDTO) {
		this.baseStoreConfigDTO = configDTO;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public BaseApiConfigDTO getApiDTO() {
		return apiDTO;
	}

	public void setApiDTO(BaseApiConfigDTO apiDTO) {
		this.apiDTO = apiDTO;
	}

	public Map<String, String> getRequestParameters() {
		return requestParameters;
	}

	public void setRequestParameters(Map<String, String> requestParameters) {
		this.requestParameters = requestParameters;
	}

	public Map<String, String> getRequestHeaderParameters() {
		return requestHeaderParameters;
	}

	public void setRequestHeaderParameters(Map<String, String> requestHeaderParameters) {
		this.requestHeaderParameters = requestHeaderParameters;
	}
}
