package com.rc.dto.pojo;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Entry extends BaseDTO {
	
	private String label;
	private String count;
	private String entryValue;
	
	public String getLabel() {
		return label;
	}
	@JsonProperty("label")
	public void setLabel(String label) {
		this.label = label;
	}
	public String getCount() {
		return count;
	}
	@JsonProperty("count")
	public void setCount(String count) {
		this.count = count;
	}
	public String getEntryValue() {
		return entryValue;
	}
	@JsonProperty("entryValue")
	public void setEntryValue(String entryValue) {
		this.entryValue = entryValue;
	}
	
	
}
