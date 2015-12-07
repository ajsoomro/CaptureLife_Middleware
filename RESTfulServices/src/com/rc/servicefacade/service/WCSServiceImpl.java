package com.rc.servicefacade.service;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.rc.common.constants.Constants;
import com.rc.common.exception.RCSystemException;
import com.rc.dto.pojo.AdapterDTO;
import com.rc.dto.pojo.BaseApiConfigDTO;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.servicefacade.adapters.Adapter;
import com.rc.servicefacade.adapters.AdapterFactory;
import com.rc.servicefacade.adapters.AdapterResponse;
import com.rc.servicefacade.base.RCBaseService;

@Component
public class WCSServiceImpl extends RCBaseService {

	private static final String CLASS_NAME = WCSServiceImpl.class.getName();
	
	private static final Logger logger = Logger.getLogger(WCSServiceImpl.class);
		
	@Override
	public ResponseDTO doService(Map<String, Object> aServiceMap) throws RCSystemException {
		
		String METHOD_NAME = CLASS_NAME+".doService()";
		logger.info(METHOD_NAME+" : Enter method");
		
		//Get platform name
		String eCommPlatform = (String)aServiceMap.get(Constants.PLATFORM);
		AdapterResponse adapterResponse = null;
		
		//Get RESTful method name called from presentation layer
		String methodName = (String)aServiceMap.get(Constants.SERVICE_NAME);
		logger.debug(METHOD_NAME+" : get backend related web services for user called api = "+methodName);
		
		//Get the back end service API list required to fulfill RESTful service request
		List<BaseApiConfigDTO> apiList = super.getApplicationData().getApiMap().get(methodName);
		
		//If no API's found through an error
		if(!(apiList != null && !apiList.isEmpty())){
			logger.error(METHOD_NAME+" : no registered backend web service API's found for = "+methodName);
			throw new RCSystemException("no registered backend web service API's found for = "+methodName);
		}
		
		/**
		 * TODO : Get the required adapter to call the back end service
		 */
		AdapterDTO adapterDTO = new AdapterDTO();
		
		if(aServiceMap.containsKey(Constants.PARAMETERS)) {
			
			@SuppressWarnings("unchecked")
			Map<String, String> requestParameters = (Map<String, String>)aServiceMap.get(Constants.PARAMETERS);
			
			adapterDTO.setRequestParameters(requestParameters);			
		}
		
		adapterDTO.setBaseStoreConfigDTO(super.getApplicationData().getBaseStoreConfig());
		
		Adapter adapter = AdapterFactory.getAdapter(eCommPlatform);
		
		//Call all back end services iteratively
		for(BaseApiConfigDTO apiConfig : apiList){
			logger.debug(METHOD_NAME+" : Calling backend API = "+apiConfig.getName());
			
			adapterDTO.setApiDTO(apiConfig);
			adapterResponse = adapter.callService(adapterDTO);
		}

		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setBaseConverterDTO(adapterResponse.getConvertedJavaObject());

		logger.info(METHOD_NAME+" : Exit method");
		
		return responseDTO;
	}
	
}
