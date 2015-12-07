package com.rc.dto.pojo;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class StoreLocatorAttribute extends BaseDTO {
	private String value;
	private String name;
	private String displayName;
	private String displayValue;
	
	public String getValue() {
		return value;
	}
	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	@JsonProperty("displayName")
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getDisplayValue() {
		return displayValue;
	}
	@JsonProperty("displayValue")
	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}

}
