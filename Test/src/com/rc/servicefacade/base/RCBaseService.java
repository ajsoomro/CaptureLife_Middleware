package com.rc.servicefacade.base;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.rc.common.config.ApplicationData;
import com.rc.common.exception.RCSystemException;
import com.rc.dto.pojo.ResponseDTO;

public abstract class RCBaseService {

	@Autowired
	private ApplicationData applicationData;
	
	public abstract ResponseDTO doService(Map<String, Object> aServiceMap) throws RCSystemException;

	public ApplicationData getApplicationData() {
		return applicationData;
	}

	public void setApplicationData(ApplicationData applicationData) {
		this.applicationData = applicationData;
	}
}
