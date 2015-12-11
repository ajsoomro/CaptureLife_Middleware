package com.rc.dto.pojo;

import org.codehaus.jackson.annotate.JsonProperty;

public class GiftListDefault extends GiftList {
	private String createdTime;
	private String guestAccessKey;
	private String lastUpdate;
	private String location;
	private String registryAccessKey;
	
	
	public String getCreatedTime() {
		return createdTime;
	}
	@JsonProperty("createdTime")
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	public String getGuestAccessKey() {
		return guestAccessKey;
	}
	@JsonProperty("guestAccessKey")
	public void setGuestAccessKey(String guestAccessKey) {
		this.guestAccessKey = guestAccessKey;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	@JsonProperty("lastUpdate")
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getLocation() {
		return location;
	}
	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRegistryAccessKey() {
		return registryAccessKey;
	}
	@JsonProperty("registryAccessKey")
	public void setRegistryAccessKey(String registryAccessKey) {
		this.registryAccessKey = registryAccessKey;
	}
	
	
	


}
