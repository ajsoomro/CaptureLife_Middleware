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
import com.rc.ws.productapis.LoginBasedRESTfulServices;

@Path("login")
public class LoginBasedRESTfulServicesImpl extends RESTFulBaseServiceImpl implements LoginBasedRESTfulServices {

	@Autowired
    private RCDelegate mDelegate;

	public static String CLASS_NAME = LoginBasedRESTfulServicesImpl.class.getName();
    
    public final Logger logger = Logger.getLogger(LoginBasedRESTfulServicesImpl.class);
    
    //Guest Login
	public ResponseDTO getGuestLoginToken() {

		String METHOD_NAME = CLASS_NAME+"getGuestLoginToken()";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		   		
    		serviceMap.put(Constants.SERVICE_NAME, Constants.GUEST_LOGIN);
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

    //User Login
	public ResponseDTO getUserLoginToken(String json) {
		
		String METHOD_NAME = CLASS_NAME+"getUserLoginToken()";
		logger.info(METHOD_NAME+" Enter method.");
		
    	Map<String, Object> serviceMap = new HashMap<String, Object>();
    	ResponseDTO responseDTO = null;
    	
    	try {
    		Map<String, String> param = new HashMap<String, String>();
    		param.put(CommonUtility.formatParamNameForMap(Constants.LOGON_ID_PASSWORD), json);
    		serviceMap.put(Constants.SERVICE_NAME, Constants.USER_LOGIN);
    		serviceMap.put(Constants.PLATFORM, super.getApplicationData().getBaseStoreConfig().getPlatform());
    		serviceMap.put(Constants.PARAMETERS, param);
    		
			responseDTO = mDelegate.doDelegate(serviceMap);
			System.out.println(responseDTO);
			
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
}