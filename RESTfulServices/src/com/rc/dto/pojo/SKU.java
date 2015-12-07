package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SKU extends BaseDTO {
	private String SKUUniqueID;
	private List<Attribute> attributes;
	private List<SKUPrice> prices;
	
	public String getSKUUniqueID() {
		return SKUUniqueID;
	}
	@JsonProperty("SKUUniqueID")
	public void setSKUUniqueID(String sKUUniqueID) {
		SKUUniqueID = sKUUniqueID;
	}
	public List<Attribute> getAttributes() {
		return attributes;
	}
	@JsonProperty("Attributes")
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}
	public List<SKUPrice> getPrices() {
		return prices;
	}
	@JsonProperty("Price")
	public void setPrices(List<SKUPrice> prices) {
		this.prices = prices;
	}
}
