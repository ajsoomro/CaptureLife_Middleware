package com.rc.dto.pojo;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class SKUPrice extends BaseDTO {
	
	private String SKUPriceDescription;
	private String SKUPriceValue;
	private String SKUPriceUsage;
	
	public String getSKUPriceDescription() {
		return SKUPriceDescription;
	}
	@JsonProperty("SKUPriceDescription")
	public void setSKUPriceDescription(String sKUPriceDescription) {
		SKUPriceDescription = sKUPriceDescription;
	}
	public String getSKUPriceValue() {
		return SKUPriceValue;
	}
	@JsonProperty("SKUPriceValue")
	public void setSKUPriceValue(String sKUPriceValue) {
		SKUPriceValue = sKUPriceValue;
	}
	public String getSKUPriceUsage() {
		return SKUPriceUsage;
	}
	@JsonProperty("SKUPriceUsage")
	public void setSKUPriceUsage(String sKUPriceUsage) {
		SKUPriceUsage = sKUPriceUsage;
	}
	
}
