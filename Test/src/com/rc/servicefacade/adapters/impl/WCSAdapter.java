package com.rc.servicefacade.adapters.impl;

import org.apache.log4j.Logger;

import com.rc.common.exception.RCSystemException;
import com.rc.common.util.CommonUtility;
import com.rc.common.util.ParserUtility;
import com.rc.dto.pojo.AdapterDTO;
import com.rc.servicefacade.adapters.Adapter;
import com.rc.servicefacade.adapters.AdapterFactory;
import com.rc.servicefacade.adapters.AdapterResponse;
import com.rc.servicefacade.serviceagent.ServiceAgent;

public class WCSAdapter implements Adapter {

	private static final String CLASS_NAME = WCSAdapter.class.getName();
	private final Logger logger = Logger.getLogger(AdapterFactory.class);
	
	public AdapterResponse callService(AdapterDTO adapterDTO) throws RCSystemException {

		String METHOD_NAME = CLASS_NAME+".callService()";
		logger.info(METHOD_NAME+" : calling service for");

		AdapterResponse adapterResponse = null;
		
		logger.debug(METHOD_NAME+" : Get the service agent");
		ServiceAgent serviceAgent = ServiceAgent.getInstance();
		
		if(serviceAgent == null){
			logger.error(METHOD_NAME+" : No service agent found that can product this output");
			throw new RCSystemException("No service agent found that can product this output");
		}
		
		//populate adaptorDTO: add URL
		CommonUtility.createWebServiceURL(adapterDTO);
		
		adapterResponse = serviceAgent.executeService(adapterDTO);
		ParserUtility.convertJSONToJavaObject(adapterDTO, adapterResponse); //converts json to a java object that is passed to the frontend
		
		logger.info(METHOD_NAME+" : Exit method");

		return adapterResponse;
	}

	
}