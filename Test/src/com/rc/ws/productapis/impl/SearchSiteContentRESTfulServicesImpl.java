package com.rc.ws.productapis.impl;

import java.util.Map;
import java.util.HashMap;

import com.rc.common.constants.Constants;
import com.rc.common.exception.RCSystemException;
import com.rc.common.util.CommonUtility;
import com.rc.delegate.RCDelegate;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.impl.RESTFulBaseServiceImpl;
import com.rc.ws.productapis.SearchSiteContentRESTfulServices;

import javax.management.ServiceNotFoundException;
import javax.ws.rs.Path;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


@Path("site_content")
public class SearchSiteContentRESTfulServicesImpl extends RESTFulBaseServiceImpl implements SearchSiteContentRESTfulServices {
	
	@Autowired
	private RCDelegate mDelegate;
	
	public static String CLASS_NAME = SearchSiteContentRESTfulServicesImpl.class.getName();
	
	public final Logger logger = Logger.getLogger(SearchSiteContentRESTfulServicesImpl.class);

	public ResponseDTO getKeywordSuggestion(String keywordSuggestion) {
		
		String METHOD_NAME = CLASS_NAME+".getKeywordSuggestion()";
		logger.info(METHOD_NAME+" Enter Method.");
		
		Map<String, Object> serviceMap = new HashMap<String, Object>();
		ResponseDTO responseDTO = null;
		
		try{
			
			//Hashmap for parameter values
			Map<String, String> param = new HashMap<String, String>();
			param.put(CommonUtility.formatParamNameForMap(Constants.KEYWORD_SUGGESTION), keywordSuggestion);
			
			//Hashmap for service values
			serviceMap.put(Constants.SERVICE_NAME, Constants.GET_KEYWORD_SUGGESTION);
			serviceMap.put(Constants.PLATFORM, super.getApplicationData().getBaseStoreConfig().getPlatform());
			serviceMap.put(Constants.PARAMETERS, param);
			
			responseDTO = mDelegate.doDelegate(serviceMap);
		}
		
		catch (ServiceNotFoundException e){
			logger.error(METHOD_NAME+" Service not found", e);
		}
		catch(RCSystemException e){
			logger.error(METHOD_NAME+ "RC System Exception occured. "+e.getMessage(), e);
		}
		
		if(responseDTO == null){
			responseDTO = new ResponseDTO();
			/**
    		 * TODO setup error message format as per mobile team 
    		 */
			responseDTO.setBaseConverterDTO(null);
		}
		
		logger.info(METHOD_NAME+": Exit Method.");
		return responseDTO;

	}
	
	//RCDelegate mDelegate setter and getter
	public void setDelegate(RCDelegate delegate){
		this.mDelegate = delegate;
	}
	
	public RCDelegate getDelegate(){
		return mDelegate;
	}

}
