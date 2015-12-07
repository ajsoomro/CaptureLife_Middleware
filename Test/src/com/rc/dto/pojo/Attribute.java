package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Attribute extends BaseDTO {
	private String usage;
	private String searchable;
	private String dataType;
	private List<ExtendedValue> extendedValue;
	private String identifier;
	private String comparable;
	private String name;
	private String description;
	private String displayable;
	private String uniqueID;
	private List<Value> values;
	
	public String getUsage() {
		return usage;
	}
	@JsonProperty("usage")
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public String getSearchable() {
		return searchable;
	}
	@JsonProperty("searchable")
	public void setSearchable(String searchable) {
		this.searchable = searchable;
	}
	public String getIdentifier() {
		return identifier;
	}
	@JsonProperty("identifier")
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getComparable() {
		return comparable;
	}
	@JsonProperty("comparable")
	public void setComparable(String comparable) {
		this.comparable = comparable;
	}
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayable() {
		return displayable;
	}
	@JsonProperty("displayable")
	public void setDisplayable(String displayable) {
		this.displayable = displayable;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	@JsonProperty("uniqueID")
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public List<Value> getValues() {
		return values;
	}
	@JsonProperty("Values")
	public void setValues(List<Value> values) {
		this.values = values;
	}
	public String getDataType() {
		return dataType;
	}
	@JsonProperty("dataType")
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public List<ExtendedValue> getExtendedValue() {
		return extendedValue;
	}
	@JsonProperty("ExtendedValue")
	public void setExtendedValue(List<ExtendedValue> extendedValue) {
		this.extendedValue = extendedValue;
	}
	public String getDescription() {
		return description;
	}
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}
}
