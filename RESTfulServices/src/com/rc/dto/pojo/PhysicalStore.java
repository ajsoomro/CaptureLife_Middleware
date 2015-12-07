package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class PhysicalStore extends BaseDTO {
	private String country;
	private List<String> addressLine;
	private String postalCode;
	private String city;
	private List<StoreLocatorAttribute> attributes;
	private String latitude;
	private String uniqueID;
	private String storeName;
	private List<Description> Description;
	private String telephone1;
	private String longitude;
	private String stateOrProvinceName;
	
	public String getCountry() {
		return country;
	}
	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}
	public List<String> getAddressLine() {
		return addressLine;
	}
	@JsonProperty("addressLine")
	public void setAddressLine(List<String> addressLine) {
		this.addressLine = addressLine;
	}
	public String getPostalCode() {
		return postalCode;
	}
	@JsonProperty("postalCode")
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}
	public List<StoreLocatorAttribute> getAttributes() {
		return attributes;
	}
	@JsonProperty("Attribute")
	public void setAttributes(List<StoreLocatorAttribute> attributes) {
		this.attributes = attributes;
	}
	public String getLatitude() {
		return latitude;
	}
	@JsonProperty("latitude")
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	@JsonProperty("uniqueID")
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getStoreName() {
		return storeName;
	}
	@JsonProperty("storeName")
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public List<Description> getDescription() {
		return Description;
	}
	@JsonProperty("Description")
	public void setDescription(List<Description> description) {
		Description = description;
	}
	public String getTelephone1() {
		return telephone1;
	}
	@JsonProperty("telephone1")
	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}
	public String getLongitude() {
		return longitude;
	}
	@JsonProperty("longitude")
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getStateOrProvinceName() {
		return stateOrProvinceName;
	}
	@JsonProperty("stateOrProvinceName")
	public void setStateOrProvinceName(String stateOrProvinceName) {
		this.stateOrProvinceName = stateOrProvinceName;
	}
}
