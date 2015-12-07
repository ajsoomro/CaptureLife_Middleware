package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CatalogEntryView extends BaseDTO {

	private String resourceId;
	private String productType;
	private String name;
	private String fullImage;
	private List<Attachment> attachments;
	private String manufacturer;
	private List<SKU> SKUs;
	private String numberOfSKUs;
	private String title;
	private String partNumber;
	private String shortDescription;
	private String buyable;
	private String longDescription;
	private String parentCategoryID;
	private String metaKeyword;
	private List<Price> Price;
	private String uniqueID;
	private String thumbnail;
	private List<Attribute> attributes;
	private String subscriptionType;
	private String metaDescription;
	private String disallowRecOrder;
	private String hasSingleSKU;
	private String storeID;
	private String fullImageAltDescription;
	
	public String getResourceId() {
		return resourceId;
	}
	@JsonProperty("resourceId")
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getProductType() {
		return productType;
	}
	@JsonProperty("productType")
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	public String getFullImage() {
		return fullImage;
	}
	@JsonProperty("fullImage")
	public void setFullImage(String fullImage) {
		this.fullImage = fullImage;
	}
	public List<Attachment> getAttachments() {
		return attachments;
	}
	@JsonProperty("Attachments")
	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	@JsonProperty("manufacturer")
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public List<SKU> getSKUs() {
		return SKUs;
	}
	@JsonProperty("SKUs")
	public void setSKUs(List<SKU> sKUs) {
		SKUs = sKUs;
	}
	public String getNumberOfSKUs() {
		return numberOfSKUs;
	}
	@JsonProperty("numberOfSKUs")
	public void setNumberOfSKUs(String numberOfSKUs) {
		this.numberOfSKUs = numberOfSKUs;
	}
	public String getTitle() {
		return title;
	}
	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPartNumber() {
		return partNumber;
	}
	@JsonProperty("partNumber")
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	@JsonProperty("shortDescription")
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getBuyable() {
		return buyable;
	}
	@JsonProperty("buyable")
	public void setBuyable(String buyable) {
		this.buyable = buyable;
	}
	public String getLongDescription() {
		return longDescription;
	}
	@JsonProperty("longDescription")
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getParentCategoryID() {
		return parentCategoryID;
	}
	@JsonProperty("parentCategoryID")
	public void setParentCategoryID(String parentCategoryID) {
		this.parentCategoryID = parentCategoryID;
	}
	public String getMetaKeyword() {
		return metaKeyword;
	}
	@JsonProperty("metaKeyword")
	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}
	public List<Price> getPrice() {
		return Price;
	}
	@JsonProperty("Price")
	public void setPrice(List<Price> price) {
		Price = price;
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
	public List<Attribute> getAttributes() {
		return attributes;
	}
	@JsonProperty("Attributes")
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
	public String getSubscriptionType() {
		return subscriptionType;
	}
	@JsonProperty("subscriptionType")
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public String getMetaDescription() {
		return metaDescription;
	}
	@JsonProperty("metaDescription")
	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}
	public String getDisallowRecOrder() {
		return disallowRecOrder;
	}
	@JsonProperty("disallowRecOrder")
	public void setDisallowRecOrder(String disallowRecOrder) {
		this.disallowRecOrder = disallowRecOrder;
	}
	public String getHasSingleSKU() {
		return hasSingleSKU;
	}
	@JsonProperty("hasSingleSKU")
	public void setHasSingleSKU(String hasSingleSKU) {
		this.hasSingleSKU = hasSingleSKU;
	}
	public String getStoreID() {
		return storeID;
	}
	@JsonProperty("storeID")
	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}
	public String getFullImageAltDescription() {
		return fullImageAltDescription;
	}
	@JsonProperty("fullImageAltDescription")
	public void setFullImageAltDescription(String fullImageAltDescription) {
		this.fullImageAltDescription = fullImageAltDescription;
	}
}
