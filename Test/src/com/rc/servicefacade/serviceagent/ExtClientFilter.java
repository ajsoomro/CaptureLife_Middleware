package com.rc.servicefacade.serviceagent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rc.common.constants.Constants;
import com.rc.dto.pojo.AdapterDTO;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.ClientFilter;

public class ExtClientFilter extends ClientFilter {
	
	private AdapterDTO adapterDTO;
	public ExtClientFilter(AdapterDTO adapterDTO){
		this.adapterDTO = adapterDTO;
	}

	@Override
	public ClientResponse handle(ClientRequest request)
			throws ClientHandlerException {
		
	        final Map<String, String> headers = adapterDTO.getRequestHeaderParameters();
	 
	        final Map<String, List<Object>> headers1 = request.getHeaders();
	        
	        List<Object> valueList = new ArrayList<Object>();
	        valueList.add(headers.get(Constants.USER_ID));
	        headers1.put(Constants.USER_ID, valueList);
	        
	        valueList = new ArrayList<Object>();
	        valueList.add(headers.get(Constants.PERSONALIZATION_ID));
	        headers1.put(Constants.PERSONALIZATION_ID, valueList);
	        
	        valueList = new ArrayList<Object>();
	        valueList.add(headers.get(Constants.WC_TRUSTED_TOKEN));
	        headers1.put(Constants.WC_TRUSTED_TOKEN, valueList);
	        
	        valueList = new ArrayList<Object>();
	        valueList.add(headers.get(Constants.WC_TOKEN));
	        headers1.put(Constants.WC_TOKEN, valueList);
	        
	        return getNext().handle(request);
	}
}