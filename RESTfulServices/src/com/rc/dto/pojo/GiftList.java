package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class GiftList extends BaseDTO {
	
	
	private String accessSpecifier;
	private String description;
	private String descriptionName;
	private String event;
	private String externalIdentifier;
	private String giftCardAccepted;
	private List<Item> item;
	private String optForEmail;
	private String registry;
	private String state;
	private String storeId;
	private String storeName;
	private String storeOwnerID;
	private String uniqueID;
	
	
	public String getAccessSpecifier() {
		return accessSpecifier;
	}
	@JsonProperty("accessSpecifier")
	public void setAccessSpecifier(String accessSpecifier) {
		this.accessSpecifier = accessSpecifier;
	}
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
	public String getEvent() {
		return event;
	}
	@JsonProperty("event")
	public void setEvent(String event) {
		this.event = event;
	}
	public String getExternalIdentifier() {
		return externalIdentifier;
	}
	@JsonProperty("externalIdentifier")
	public void setExternalIdentifier(String externalIdentifier) {
		this.externalIdentifier = externalIdentifier;
	}
	public String getGiftCardAccepted() {
		return giftCardAccepted;
	}
	@JsonProperty("giftCardAccepted")
	public void setGiftCardAccepted(String giftCardAccepted) {
		this.giftCardAccepted = giftCardAccepted;
	}
	public List<Item> getItem() {
		return item;
	}
	@JsonProperty("item")
	public void setItem(List<Item> item) {
		this.item = item;
	}
	public String getOptForEmail() {
		return optForEmail;
	}
	@JsonProperty("optForEmail")
	public void setOptForEmail(String optForEmail) {
		this.optForEmail = optForEmail;
	}
	public String getRegistry() {
		return registry;
	}
	@JsonProperty("registry")
	public void setRegistry(String registry) {
		this.registry = registry;
	}
	public String getState() {
		return state;
	}
	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}
	public String getStoreId() {
		return storeId;
	}
	@JsonProperty("storeId")
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	@JsonProperty("storeName")
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreOwnerID() {
		return storeOwnerID;
	}
	@JsonProperty("storeOwnerID")
	public void setStoreOwnerID(String storeOwnerID) {
		this.storeOwnerID = storeOwnerID;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	@JsonProperty("uniqueID")
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	
	
	

}
