package com.rc.dto.pojo;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CreateWishList {
	private String description;
	private String descriptionName;
	private String registry;
	
	public String getDescription() {
		return description;
	}
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescriptionName() {
		return descriptionName;
	}
	@JsonProperty("descriptionName")
	public void setDescriptionName(String descriptionName) {
		this.descriptionName = descriptionName;
	}
	public String getRegistry() {
		return registry;
	}
	@JsonProperty("registry")
	public void setRegistry(String registry) {
		this.registry = registry;
	}
}
