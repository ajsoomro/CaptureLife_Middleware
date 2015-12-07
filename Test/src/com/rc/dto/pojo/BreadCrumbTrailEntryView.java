package com.rc.dto.pojo;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class BreadCrumbTrailEntryView extends BaseDTO {
	
	private String value;
	private String label;
	private String type;
	
	public String getValue() {
		return value;
	}
	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}
	public String getLabel() {
		return label;
	}
	@JsonProperty("label")
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}
}
