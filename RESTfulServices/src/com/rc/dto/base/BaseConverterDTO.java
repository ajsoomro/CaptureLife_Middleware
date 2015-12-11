package com.rc.dto.base;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.pojo.MetaData;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class BaseConverterDTO extends BaseDTO {

	private Integer recordSetTotal;
	private String resourceId;
	private String resourceName;
	private Boolean recordSetComplete;
	private Integer recordSetStartNumber;
	private Integer recordSetCount;
	private List<MetaData> metaData;
	
	public Integer getRecordSetTotal() {
		return recordSetTotal;
	}
	@JsonProperty("recordSetTotal")
	public void setRecordSetTotal(Integer recordSetTotal) {
		this.recordSetTotal = recordSetTotal;
	}
	public String getResourceId() {
		return resourceId;
	}
	@JsonProperty("resourceId")
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceName() {
		return resourceName;
	}
	@JsonProperty("resourceName")
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public Boolean getRecordSetComplete() {
		return recordSetComplete;
	}
	@JsonProperty("recordSetComplete")
	public void setRecordSetComplete(Boolean recordSetComplete) {
		this.recordSetComplete = recordSetComplete;
	}
	public Integer getRecordSetStartNumber() {
		return recordSetStartNumber;
	}
	@JsonProperty("recordSetStartNumber")
	public void setRecordSetStartNumber(Integer recordSetStartNumber) {
		this.recordSetStartNumber = recordSetStartNumber;
	}
	public Integer getRecordSetCount() {
		return recordSetCount;
	}
	@JsonProperty("recordSetCount")
	public void setRecordSetCount(Integer recordSetCount) {
		this.recordSetCount = recordSetCount;
	}
	public List<MetaData> getMetaData() {
		return metaData;
	}
	@JsonProperty("MetaData")
	public void setMetaData(List<MetaData> metaData) {
		this.metaData = metaData;
	}
	
}
