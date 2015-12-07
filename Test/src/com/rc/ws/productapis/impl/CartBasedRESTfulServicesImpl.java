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
import com.rc.ws.productapis.CartBasedRESTfulServices;

@Path("cart")
public class CartBasedRESTfulServicesImpl extends RESTFulBaseServiceImpl implements CartBasedRESTfulServices {

	@Autowired
    private RCDelegate mDelegate;

	public static String CLASS_NAME = CartBasedRESTfulServicesImpl.class.getName();
    
    public final Logger logger = Logger.getLogger(CartBasedRESTfulServicesImpl.class);
    
    //Add to Cart
	public ResponseDTO getAddToCartDetail(String json, String userId, String personalizationID, String WCTrustedToken, String WCToken) {
		
		String METHOD_NAME = CLASS_NAME+"getAddToCartDetail()";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		Map<String, String> param = new HashMap<String, String>();
    		Map<String, String> headerParam = new HashMap<String, String>();
    		
    		param.put(CommonUtility.formatParamNameForMap(Constants.SHOPPING_CART_ITEM), json);
    		
    		headerParam.put(Constants.USER_ID, userId);
    		headerParam.put(Constants.PERSONALIZATION_ID, personalizationID);
    		headerParam.put(Constants.WC_TRUSTED_TOKEN, WCTrustedToken);
    		headerParam.put(Constants.WC_TOKEN, WCToken);
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.ADD_TO_CART);
    		serviceMap.put(Constants.PLATFORM, super.getApplicationData().getBaseStoreConfig().getPlatform());
    		serviceMap.put(Constants.PARAMETERS, param);
    		serviceMap.put(Constants.HEADER_PARAMETERS, headerParam);
    		
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

	public ResponseDTO getDeleteFromCartDetail(String json, String orderItemId) {
		
		String METHOD_NAME = CLASS_NAME+"getDeleteFromCartDetail()"; //get clarity on this
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		Map<String, String> param = new HashMap<String, String>();
    		Map<String, String> headerParam = new HashMap<String, String>();
    		
    		param.put(CommonUtility.formatParamNameForMap(Constants.SHOPPING_CART_ITEM), json);
    		
    		headerParam.put(Constants.ORDER_ITEM_ID, orderItemId);
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.DELETE_FROM_CART);
    		serviceMap.put(Constants.PLATFORM, super.getApplicationData().getBaseStoreConfig().getPlatform());
    		serviceMap.put(Constants.PARAMETERS, param);
    		serviceMap.put(Constants.HEADER_PARAMETERS, headerParam);
    		
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

	public ResponseDTO getCartDetail(String orderItemId) {
		
		String METHOD_NAME = CLASS_NAME+"getCartDetail()"; //what's this?
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		if(!orderItemId.contains("@")){
	    		Map<String, String> param = new HashMap<String, String>();
	    		param.put(CommonUtility.formatParamNameForMap(Constants.CATEGORY_ID), orderItemId); //params to pass
    		}
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.GET_CART);
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

	public ResponseDTO getAssignedPromotionCode(String assignedPromotionCode) {
		
		String METHOD_NAME = CLASS_NAME+".getAssignedPromotionCode()";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		
    		Map<String, String> param = new HashMap<String, String>();
    		param.put(CommonUtility.formatParamNameForMap(Constants.ASSIGNED_PROMOTION_CODE), assignedPromotionCode);
    		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.GET_ASSIGNED_PROMOTION_CODE);
    		serviceMap.put(Constants.PLATFORM, super.getApplicationData().getBaseStoreConfig().getPlatform());
    		//11/30
    		serviceMap.put(Constants.HOSTNAME, super.getApplicationData().getBaseStoreConfig().getHostname());
    		serviceMap.put(Constants.PARAMETERS, param);
    		
    		System.out.println("Platform is: "+super.getApplicationData().getBaseStoreConfig().getPlatform());
    		System.out.println("Host is: "+super.getApplicationData().getBaseStoreConfig().getHostname());
    		
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