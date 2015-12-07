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
import com.rc.ws.productapis.CategoryBasedRESTfulServices;

@Path("category")
public class CategoryBasedRESTfulServicesImpl extends RESTFulBaseServiceImpl implements CategoryBasedRESTfulServices {

	@Autowired
    private RCDelegate mDelegate;

	public static String CLASS_NAME = CategoryBasedRESTfulServicesImpl.class.getName();
    
    public final Logger logger = Logger.getLogger(CategoryBasedRESTfulServicesImpl.class);

	@Override
	public ResponseDTO getTopCategories(String topCategory) {

		String METHOD_NAME = CLASS_NAME+"getProductByID()";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		if(!topCategory.contains("@")){
	    		Map<String, String> param = new HashMap<String, String>();
	    		param.put(CommonUtility.formatParamNameForMap(Constants.CATEGORY_ID), topCategory);
    		}
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.GET_TOP_CATEGORYIES);
    		serviceMap.put(Constants.PLATFORM, super.getApplicationData().getBaseStoreConfig().getPlatform());
    		
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
	public ResponseDTO getSubCategories(String categoryId) {

		String METHOD_NAME = CLASS_NAME+"getProductByID()";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		
    		Map<String, String> param = new HashMap<String, String>();
    		param.put(CommonUtility.formatParamNameForMap(Constants.CATEGORY_ID), categoryId);
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.BY_PARENT_CATEGORY);
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
