package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Attachment extends BaseDTO {
	private String usage;
	private String path;
	private String ID;
	private String mimeType;
	private List<MetaData> metaData;
	
	public String getUsage() {
		return usage;
	}
	@JsonProperty("usage")
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public String getPath() {
		return path;
	}
	@JsonProperty("path")
	public void setPath(String path) {
		this.path = path;
	}
	public String getID() {
		return ID;
	}
	@JsonProperty("ID")
	public void setID(String iD) {
		ID = iD;
	}
	public String getMimeType() {
		return mimeType;
	}
	@JsonProperty("mimeType")
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public List<MetaData> getMetaData() {
		return metaData;
	}
	@JsonProperty("MetaData")
	public void setMetaData(List<MetaData> metaData) {
		this.metaData = metaData;
	}
}
