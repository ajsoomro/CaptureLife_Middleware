package com.rc.dto.pojo;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Item {
	
	
	private String giftListItemID;
	private String itemCreatedTime;
	private String itemLastUpdate;
	private String location;
	private String partNumber;
	private String productId;
	private String productOwnerID;
	private String quantityBought;
	private String quantityRequested;
	
	public String getGiftListItemID() {
		return giftListItemID;
	}
	@JsonProperty("giftListItemID")
	public void setGiftListItemID(String giftListItemID) {
		this.giftListItemID = giftListItemID;
	}
	@JsonProperty("")
	public String getItemCreatedTime() {
		return itemCreatedTime;
	}
	@JsonProperty("itemCreatedTime")
	public void setItemCreatedTime(String itemCreatedTime) {
		this.itemCreatedTime = itemCreatedTime;
	}
	@JsonProperty("")
	public String getItemLastUpdate() {
		return itemLastUpdate;
	}
	@JsonProperty("itemLastUpdate")
	public void setItemLastUpdate(String itemLastUpdate) {
		this.itemLastUpdate = itemLastUpdate;
	}
	@JsonProperty("")
	public String getLocation() {
		return location;
	}
	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}
	@JsonProperty("")
	public String getPartNumber() {
		return partNumber;
	}
	@JsonProperty("partNumber")
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getProductId() {
		return productId;
	}
	@JsonProperty("productId")
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductOwnerID() {
		return productOwnerID;
	}
	@JsonProperty("productOwnerID")
	public void setProductOwnerID(String productOwnerID) {
		this.productOwnerID = productOwnerID;
	}
	public String getQuantityBought() {
		return quantityBought;
	}
	@JsonProperty("quantityBought")
	public void setQuantityBought(String quantityBought) {
		this.quantityBought = quantityBought;
	}
	public String getQuantityRequested() {
		return quantityRequested;
	}
	@JsonProperty("quantityRequested")
	public void setQuantityRequested(String quantityRequested) {
		this.quantityRequested = quantityRequested;
	}

}
