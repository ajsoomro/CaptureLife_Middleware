package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rc.common.exception.RCRunTimeException;
import com.rc.common.exception.RCSystemException;
import com.rc.common.util.ParserUtility;
import com.rc.dto.pojo.AddORUpdateItem;
import com.rc.dto.pojo.Item;


public class TestMain {

	public static void main(String[] args) {
		AddORUpdateItem addORUpdateItem = new AddORUpdateItem();
		Item i = new Item();
		i.setProductId("10000021155");
		i.setQuantityRequested("20");
		
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(i);
		
		addORUpdateItem.setItem(itemList);
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		AddORUpdateItem ai = new AddORUpdateItem();
		
		
		String s = gson.toJson(addORUpdateItem);
		String s2 = ParserUtility.JavaToJson(addORUpdateItem);
		System.out.println(s2);
		
				
				try {
					ai = ParserUtility.JsonTOJava(s2, AddORUpdateItem.class);
				} catch (RCSystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
		
		
		
		//ai = gson.fromJson(s, AddORUpdateItem.class);
		
		
		
		System.out.println(ai);
		
		
		
	
	}

}
