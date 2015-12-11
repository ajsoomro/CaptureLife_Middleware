package com.rc.ws.productapis.impl;

import java.util.HashMap;
import java.util.Map;

import javax.management.ServiceNotFoundException;
import javax.ws.rs.Path;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.rc.common.constants.Constants;
import com.rc.common.exception.RCSystemException;
import com.rc.common.util.CommonUtility;
import com.rc.delegate.RCDelegate;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.impl.RESTFulBaseServiceImpl;
import com.rc.ws.productapis.StoreLocatorRESTfulServices;

@Path("storelocator")
public class StoreLocatorRESTfulServicesImpl extends RESTFulBaseServiceImpl implements StoreLocatorRESTfulServices {

	@Autowired
    private RCDelegate mDelegate;

	public static String CLASS_NAME = StoreLocatorRESTfulServicesImpl.class.getName();
    
    public final Logger logger = Logger.getLogger(StoreLocatorRESTfulServicesImpl.class);

	@Override
	public ResponseDTO searchStoreByLocation(String city, String siteLevelStoreSearch, String radius) {

		String METHOD_NAME = CLASS_NAME+"byLocation()";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		Map<String, String> param = new HashMap<String, String>();
    		param.put(CommonUtility.formatParamNameForMap(Constants.CITY), city);
    		param.put(CommonUtility.formatParamNameForMap(Constants.SITE_LEVEL_STORE_SEARCH), siteLevelStoreSearch);
    		param.put(CommonUtility.formatParamNameForMap(Constants.RADIUS), radius);
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.STORE_LOCATOR_BY_LOCATION);
    		serviceMap.put(Constants.PLATFORM, super.getApplicationData().getBaseStoreConfig().getPlatform());
    		serviceMap.put(Constants.PARAMETERS, param);
    		
			responseDTO = mDelegate.doDelegate(serviceMap);
			
		} catch (ServiceNotFoundException e) {
			logger.error(METHOD_NAME+" : Service not found",e);
			
		} catch (RCSystemException e) {
			logger.error(METHOD_NAME+" : RC System Exception occers : "+e.getMessage(),e);
		}
    	
    	if(responseDTO == null){
    		responseDTO = new  ResponseDTO();
    		/**
    		 * TODO setup error message format as per mobile team 
    		 */
    		responseDTO.setBaseConverterDTO(null);
    	}
    	
    	logger.info(METHOD_NAME+" Exit method.");
		return responseDTO;
	}

    public void setDelegate(RCDelegate delegate) {
		this.mDelegate = delegate;
	}

    public RCDelegate getDelegate() {
		return mDelegate;
	}

	@Override
	public ResponseDTO searchStoreByZipcode(String latitude, String longitude, String maxItems,
			String siteLevelStoreSearch, String responseFormat) {

		String METHOD_NAME = CLASS_NAME+"searchStoreByLocation()";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		
    		Map<String, String> param = new HashMap<String, String>();
    		param.put(CommonUtility.formatParamNameForMap(Constants.LATITUDE), latitude);
    		param.put(CommonUtility.formatParamNameForMap(Constants.LONGITUDE), longitude);
    		param.put(CommonUtility.formatParamNameForMap(Constants.MAX_ITEMS), maxItems);
    		param.put(CommonUtility.formatParamNameForMap(Constants.SITE_LEVEL_STORE_SEARCH), siteLevelStoreSearch);
    		param.put(CommonUtility.formatParamNameForMap(Constants.RESPONSE_FORMAT), responseFormat);
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.STORE_LOCATOR_BY_ZIPCODE);
    		serviceMap.put(Constants.PLATFORM, super.getApplicationData().getBaseStoreConfig().getPlatform());
    		serviceMap.put(Constants.PARAMETERS, param);
    		
			responseDTO = mDelegate.doDelegate(serviceMap);
			
		} catch (ServiceNotFoundException e) {
			logger.error(METHOD_NAME+" : Service not found",e);
			
		} catch (RCSystemException e) {
			logger.error(METHOD_NAME+" : RC System Exception occers : "+e.getMessage(),e);
		}
    	
    	if(responseDTO == null){
    		responseDTO = new  ResponseDTO();
    		/**
    		 * TODO setup error message format as per mobile team 
    		 */
    		responseDTO.setBaseConverterDTO(null);
    	}
    	
    	logger.info(METHOD_NAME+" Exit method.");
		return responseDTO;
	}
}
