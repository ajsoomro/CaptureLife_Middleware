package com.rc.dto.pojo;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MetaData extends BaseDTO {

	private String metaKey;
	private String metaData;
	public String getMetaKey() {
		return metaKey;
	}
	@JsonProperty("metaKey")
	public void setMetaKey(String metaKey) {
		this.metaKey = metaKey;
	}
	public String getMetaData() {
		System.out.println("metaData: "+metaData);
		return metaData;
	}
	@JsonProperty("metaData")
	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}
}
