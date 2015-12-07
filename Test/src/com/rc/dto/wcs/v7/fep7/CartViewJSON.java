package com.rc.dto.wcs.v7.fep7;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.rc.dto.base.BaseConverterDTO;
import com.rc.dto.pojo.OrderItemEntryView;

public class CartViewJSON extends BaseConverterDTO {

	private List<OrderItemEntryView> orderItem;
	private String orderId;

	public List<OrderItemEntryView> getOrderItem() {
		return orderItem;
	}
	@JsonProperty("orderItem")
	public void setOrderItem(List<OrderItemEntryView> orderItem) {
		this.orderItem = orderItem;
	}
	public String getOrderId() {
		return orderId;
	}
	@JsonProperty("orderId")
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}