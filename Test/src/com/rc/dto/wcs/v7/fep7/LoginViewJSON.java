package com.rc.dto.wcs.v7.fep7;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.rc.dto.base.BaseConverterDTO;

public class LoginViewJSON extends BaseConverterDTO {

	private String userId;
	private String WCToken;
	private String WCTrustedToken;
	private String personalizationID;
	
	
	public String getUserId() {
		return userId;
	}
	@JsonProperty("userId")
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getWCToken() {
		return WCToken;
	}
	@JsonProperty("WCToken")
	public void setWCToken(String wCToken) {
		WCToken = wCToken;
	}
	public String getWCTrustedToken() {
		return WCTrustedToken;
	}
	@JsonProperty("WCTrustedToken")
	public void setWCTrustedToken(String wCTrustedToken) {
		WCTrustedToken = wCTrustedToken;
	}
	public String getPersonalizationID() {
		return personalizationID;
	}
	@JsonProperty("personalizationID")
	public void setPersonalizationID(String personalizationID) {
		this.personalizationID = personalizationID;
	}
}
