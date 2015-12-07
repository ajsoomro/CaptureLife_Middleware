package com.rc.delegate;

import java.util.HashMap;
import java.util.Map;

import com.rc.servicefacade.base.RCBaseService;

public class RCServiceFactory {

	private Map<String, RCBaseService> serviceMap;
	
	public RCServiceFactory() {
		serviceMap = new HashMap<String, RCBaseService>();
	}
	
	public void setServiceMap(Map<String, RCBaseService> serviceMap) {
		this.serviceMap = serviceMap;
	}
	
	public Map<String, RCBaseService> getServiceMap() {
		return this.serviceMap;
	}
}
