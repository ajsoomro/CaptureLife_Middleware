package com.rc.dto.pojo;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Description extends BaseDTO {
	private String displayStoreName;

	public String getDisplayStoreName() {
		return displayStoreName;
	}
	
	@JsonProperty("displayStoreName")
	public void setDisplayStoreName(String displayStoreName) {
		this.displayStoreName = displayStoreName;
	}

}
