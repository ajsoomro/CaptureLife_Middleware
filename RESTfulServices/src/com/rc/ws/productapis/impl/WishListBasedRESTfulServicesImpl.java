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
import com.rc.common.util.ParserUtility;
import com.rc.delegate.RCDelegate;
import com.rc.dto.pojo.AddORUpdateItem;
import com.rc.dto.pojo.CreateWishList;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.impl.RESTFulBaseServiceImpl;
import com.rc.ws.productapis.WishListBasedRESTfulServices;

@Path("wishlist")
public class WishListBasedRESTfulServicesImpl extends RESTFulBaseServiceImpl implements WishListBasedRESTfulServices {
	
	@Autowired
    private RCDelegate mDelegate;

	public static String CLASS_NAME = WishListBasedRESTfulServicesImpl.class.getName();
    
    public final Logger logger = Logger.getLogger(WishListBasedRESTfulServicesImpl.class);

	@Override
	public ResponseDTO wishListByExternalId(String externalId, String pageSize,
			String pageNumber, String responseFormat) {
		String METHOD_NAME = CLASS_NAME+"wishListByExternalId(String, String, String, String)";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		Map<String, String> param = new HashMap<String, String>();
    		param.put(CommonUtility.formatParamNameForMap(Constants.WISH_LIST_BY_EXTERNAL_ID), externalId);
    		if(pageSize!=null & pageNumber!=null & responseFormat!=null){
    			
    			param.put(CommonUtility.formatParamNameForMap(Constants.PAGE_SIZE), pageSize);
    			param.put(CommonUtility.formatParamNameForMap(Constants.PAGE_NUMBER), pageNumber);
    			param.put(CommonUtility.formatParamNameForMap(Constants.RESPONSE_FORMAT), responseFormat);
    		}
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.WISH_LIST_BY_EXTERNAL_ID);
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

	@Override
	public ResponseDTO wishListByDefault(String responseFormat) {
		String METHOD_NAME = CLASS_NAME+"wishListByDefault()";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		Map<String, String> param = new HashMap<String, String>();
    			
    			param.put(CommonUtility.formatParamNameForMap(Constants.RESPONSE_FORMAT), responseFormat);
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.WISH_LIST_BY_DEFAULT);
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

	
	
	@Override
	public ResponseDTO wishListSelf(String responseFormat) {
		String METHOD_NAME = CLASS_NAME+"wishListSelf(String)";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		Map<String, String> param = new HashMap<String, String>();
    		
    		if(responseFormat!=null)
    			param.put(CommonUtility.formatParamNameForMap(Constants.RESPONSE_FORMAT), responseFormat);
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.WISH_LIST_SELF);
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

	@Override
	public ResponseDTO createWishList(String responseFormat, CreateWishList createWishList) {
		String METHOD_NAME = CLASS_NAME+"createWishList(String,CreateWishList)";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		Map<String, String> param = new HashMap<String, String>();
    		
    		if(responseFormat!=null)
    			param.put(CommonUtility.formatParamNameForMap(Constants.RESPONSE_FORMAT), responseFormat);
    		
    		if(createWishList!=null)
    			param.put(Constants.BODY, ParserUtility.JavaToJson(createWishList));
    		
    		
    		
    		
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.WISH_LIST_CREATE);
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

	@Override
	public ResponseDTO addItemToWishList(String responseFormat, AddORUpdateItem addORUpdateItem) {
		String METHOD_NAME = CLASS_NAME+"addItemToWishList(String,AddORUpdateItem)";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		Map<String, String> param = new HashMap<String, String>();
    		
    		if(responseFormat!=null)
    			param.put(CommonUtility.formatParamNameForMap(Constants.RESPONSE_FORMAT), responseFormat);
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.WISH_LIST_ADD_ITEM);
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
