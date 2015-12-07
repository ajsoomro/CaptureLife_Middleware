package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Value extends BaseDTO {
	private String values;
	private String identifier;
	private String uniqueID;
	private List<ExtendedValue> extendedValue;
	
	public String getValues() {
		return values;
	}
	@JsonProperty("values")
	public void setValues(String values) {
		this.values = values;
	}
	public String getIdentifier() {
		return identifier;
	}
	@JsonProperty("identifier")
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	@JsonProperty("uniqueID")
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public List<ExtendedValue> getExtendedValue() {
		return extendedValue;
	}
	@JsonProperty("extendedValue")
	public void setExtendedValue(List<ExtendedValue> extendedValue) {
		this.extendedValue = extendedValue;
	}

	
}
