package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rc.dto.base.BaseDTO;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class OrderItemEntryView extends BaseDTO {

	//private String orderItem;
	private String orderItemId;	
	
	public String getOrderItemId() {
		return orderItemId;
	}
	@JsonProperty("orderItemId")
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}
	
}