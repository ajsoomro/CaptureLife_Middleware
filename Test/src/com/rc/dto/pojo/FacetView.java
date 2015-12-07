package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class FacetView extends BaseDTO {
	private String value;
	private String name;
	private List<Entry> entry;
	
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
	public List<Entry> getEntry() {
		return entry;
	}
	@JsonProperty("Entry")
	public void setEntry(List<Entry> entry) {
		this.entry = entry;
	}
	
	
}
