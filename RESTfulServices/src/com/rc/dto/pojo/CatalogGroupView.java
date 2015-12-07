package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CatalogGroupView extends BaseDTO {

	private String identifier;
	private String resourceId;
	private String name;
	private String shortDescription;
	private String uniqueID;
	private String thumbnail;
	private String productsURL;
	private List<String> parentCatalogGroupID;
	
	public String getResourceId() {
		return resourceId;
	}
	@JsonProperty("resourceId")
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	@JsonProperty("shortDescription")
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	@JsonProperty("uniqueID")
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	@JsonProperty("thumbnail")
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getIdentifier() {
		return identifier;
	}
	@JsonProperty("identifier")
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getProductsURL() {
		return productsURL;
	}
	@JsonProperty("productsURL")
	public void setProductsURL(String productsURL) {
		this.productsURL = productsURL;
	}
	public List<String> getParentCatalogGroupID() {
		return parentCatalogGroupID;
	}
	@JsonProperty("parentCatalogGroupID")
	public void setParentCatalogGroupID(List<String> parentCatalogGroupID) {
		this.parentCatalogGroupID = parentCatalogGroupID;
	}
}
