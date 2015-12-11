package com.rc.common.util;

import java.util.Map;

import org.apache.log4j.Logger;

import com.rc.common.exception.RCSystemException;
import com.rc.dto.pojo.AdapterDTO;
import com.rc.dto.pojo.BaseStoreConfigDTO;

public class CommonUtility {
	
	private static Logger logger = Logger.getLogger(CommonUtility.class);
	private final static String CLASS_NAME = CommonUtility.class.getName();

	public static String requestURIParamaters(BaseStoreConfigDTO configDTO){
		
		String url = configDTO.getURI();
		for(String paramName : configDTO.getParameters().keySet()){
			url = url.replace(formatParamNameForMap(paramName), configDTO.getParameters().get(paramName));
		}
		
		return url;
	}
	
	public static void createWebServiceURL(AdapterDTO adapterDTO) throws RCSystemException{

		String METHOD_NAME = CLASS_NAME+".createWebServiceURL";
		String eCommWSURL = null;
				
		logger.info(METHOD_NAME+": Enter method");
		
		//Add host name to URL
		logger.debug(METHOD_NAME+": create eCommerce platform web service URL");
		eCommWSURL = isHTTPSecure(adapterDTO.getApiDTO().isHttps())
						+"://"+adapterDTO.getBaseStoreConfigDTO().getHostname();
		
		//Add port to URL
		logger.debug(METHOD_NAME+": add port");
		if(adapterDTO.getBaseStoreConfigDTO().getPort() != null && !adapterDTO.getBaseStoreConfigDTO().getPort().equalsIgnoreCase(""))
			eCommWSURL+=":"+adapterDTO.getBaseStoreConfigDTO().getPort();
		
		//Add URI to URL 
		logger.debug(METHOD_NAME+": add api name");
		if(!adapterDTO.getBaseStoreConfigDTO().getURI().contains("/"))
			eCommWSURL+="/";
		eCommWSURL+=requestURIParamaters(adapterDTO.getBaseStoreConfigDTO());

		//Add api name
		eCommWSURL+=adapterDTO.getApiDTO().getURI();
		
		//Add parameters
		logger.debug(METHOD_NAME+": add parameters");
		eCommWSURL+=setParamInURL(adapterDTO);
		System.out.println("test");
		
		logger.info(METHOD_NAME+": eCommerce platform web service URL created = "+eCommWSURL);
		adapterDTO.setURL(eCommWSURL);
		
		logger.info(METHOD_NAME+": Exit method");
		
	}
	
	public static String isHTTPSecure(boolean httpSecure){
		
		String http = "http";
		
		if(httpSecure)
			http = "https";
		
		return http;
	}

	public static String setParamInURL(AdapterDTO adapterDTO){
		
		String apiParamURL = adapterDTO.getApiDTO().getParameters();
		Map<String, String> requestParamMap = adapterDTO.getRequestParameters();
		
		if(requestParamMap == null && apiParamURL.contains("@")){
			return apiParamURL;
		}
		
		//replace all param in url
		for(String paramName : requestParamMap.keySet()){
			apiParamURL = apiParamURL.replace(paramName, requestParamMap.get(paramName));
		}
			
		return apiParamURL;
	}

	public static String formatParamNameForMap(String paramName){
		return "["+paramName+"]";
	}
}