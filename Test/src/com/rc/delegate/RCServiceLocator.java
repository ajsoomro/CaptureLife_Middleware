package com.rc.delegate;

import com.rc.servicefacade.base.RCBaseService;

public class RCServiceLocator {
	private RCServiceFactory serviceFactory;

	public void setServiceFactory(RCServiceFactory serviceFactory) {
		this.serviceFactory = serviceFactory;
	}

	public RCBaseService getService(String serviceName) {
		return serviceFactory.getServiceMap().get(serviceName);
	}
	
}
