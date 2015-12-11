package com.rc.dto.pojo;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class AddORUpdateItem {
	
	
	private List<Item> item;

	public List<Item> getItem() {
		return item;
	}
	@JsonProperty("item")
	public void setItem(List<Item> item) {
		this.item = item;
	}
	
	
	
	
	
	

}
