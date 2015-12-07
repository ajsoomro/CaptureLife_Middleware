package com.rc.delegate;

import java.util.Map;

import javax.management.ServiceNotFoundException;

import com.rc.common.constants.Constants;
import com.rc.common.exception.RCSystemException;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.servicefacade.base.RCBaseService;

public class RCDelegate {
	
	private RCServiceLocator serviceLocator;
		
	public ResponseDTO doDelegate(Map<String, Object> serviceMap) throws RCSystemException, ServiceNotFoundException {
		
		ResponseDTO response = null;
		
		RCBaseService service = serviceLocator.getService((String)serviceMap.get(Constants.PLATFORM));
		
		if(service == null){
			
			throw new RCSystemException("Service not found", "service.not.found");
		}
			
		try {
			
			response = service.doService(serviceMap);
		} catch (RCSystemException e) {
			
			if(e.getReasonCode() != null && !e.getReasonCode().equalsIgnoreCase("")){
				
				throw new RCSystemException(e.getMessage(), e.getReasonCode());
			}
			
			throw new RCSystemException(e.getMessage());
		} catch (Exception e) {
			
			throw new RCSystemException(e.getMessage());
		}
		
		return response;
	}
	
	public void setServiceLocator(RCServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
}