package com.rc.dto.pojo;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Price extends BaseDTO {
	
	private String priceDescription;
	private String priceUsage;
	private String priceValue;
	public String getPriceDescription() {
		return priceDescription;
	}
	@JsonProperty("priceDescription")
	public void setPriceDescription(String priceDescription) {
		this.priceDescription = priceDescription;
	}
	public String getPriceUsage() {
		return priceUsage;
	}
	@JsonProperty("priceUsage")
	public void setPriceUsage(String priceUsage) {
		this.priceUsage = priceUsage;
	}
	public String getPriceValue() {
		return priceValue;
	}
	@JsonProperty("priceValue")
	public void setPriceValue(String priceValue) {
		this.priceValue = priceValue;
	}

	
}
