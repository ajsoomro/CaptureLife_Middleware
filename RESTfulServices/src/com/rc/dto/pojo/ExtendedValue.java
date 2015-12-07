package com.rc.dto.pojo;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ExtendedValue extends BaseDTO {
	private String extValue;
	private String value;
	private String key;

	public String getExtValue() {
		return extValue;
	}
	@JsonProperty("extValue")
	public void setExtValue(String extValue) {
		this.extValue = extValue;
	}
	public String getValue() {
		return value;
	}
	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}
	public String getKey() {
		return key;
	}
	@JsonProperty("key")
	public void setKey(String key) {
		this.key = key;
	}
}
