package com.rc.dto.base;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.pojo.MetaData;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class BaseConverterDTO extends BaseDTO {

	private String recordSetTotal;
	private String resourceId;
	private String resourceName;
	private String recordSetComplete;
	private String recordSetStartNumber;
	private String recordSetCount;
	private List<MetaData> metaData;
	
	public String getRecordSetTotal() {
		return recordSetTotal;
	}
	@JsonProperty("recordSetTotal")
	public void setRecordSetTotal(String recordSetTotal) {
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
	public String getRecordSetComplete() {
		return recordSetComplete;
	}
	@JsonProperty("recordSetComplete")
	public void setRecordSetComplete(String recordSetComplete) {
		this.recordSetComplete = recordSetComplete;
	}
	public String getRecordSetStartNumber() {
		return recordSetStartNumber;
	}
	@JsonProperty("recordSetStartNumber")
	public void setRecordSetStartNumber(String recordSetStartNumber) {
		this.recordSetStartNumber = recordSetStartNumber;
	}
	public String getRecordSetCount() {
		return recordSetCount;
	}
	@JsonProperty("recordSetCount")
	public void setRecordSetCount(String recordSetCount) {
		this.recordSetCount = recordSetCount;
	}
	public List<MetaData> getMetaData() {
		System.out.println("Tagged2");
		return metaData;
	}
	@JsonProperty("MetaData")
	public void setMetaData(List<MetaData> metaData) {
		System.out.println("Tagged4");
		this.metaData = metaData;
	}
	
}
