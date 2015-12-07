package com.rc.servicefacade.serviceagent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;

import com.rc.common.exception.RCSystemException;
import com.rc.dto.pojo.AdapterDTO;
import com.rc.servicefacade.adapters.AdapterResponse;

/**
 * ServiceAgent is wrapper around all back end web services.
 * All service calls will be made through this agent only.
 * 
 * @author RB
 */
public class ServiceAgent{

	/* Logger instance */

	/* class name for logging */
	private static final String CLASS_NAME = ServiceAgent.class.getName();
	private static final Logger logger = Logger.getLogger(ServiceAgent.class.getName());
	private static ServiceAgent serviceAgent;
	
	// hide the constructor
	private ServiceAgent(){
		
	}
	
	public static ServiceAgent getInstance(){
		if(serviceAgent == null){
			serviceAgent = new ServiceAgent();
		}
		return serviceAgent;
	}

	/**
	 * Execute the actual service.
	 * 
	 * @param AdapterDTO required by service as input.
	 * @return InputStream for JSON response.
	 * @throws RCSystemException
	 */
	public AdapterResponse executeService(AdapterDTO adapterDTO) throws RCSystemException {

		final String METHOD_NAME = CLASS_NAME+".executeService()";
		logger.info(METHOD_NAME+" : Enter executeService");
		InputStream jsonIO = null;
		AdapterResponse adapterResponse = new AdapterResponse();
		
		try {

			logger.debug(METHOD_NAME+" : Prepare URL = "+adapterDTO.getURL());
			URL url = new URL(adapterDTO.getURL());		//"http://localhost:8080/RESTfulExample/json/product/get"
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			logger.debug(METHOD_NAME+" : Request Method = "+adapterDTO.getApiDTO().getRequestMethod());
			if(adapterDTO.getApiDTO().getRequestMethod() != null)
				conn.setRequestMethod(adapterDTO.getApiDTO().getRequestMethod().toUpperCase());
			else 
				conn.setRequestMethod("GET");
			
			logger.debug(METHOD_NAME+" : Response Type = "+adapterDTO.getApiDTO().getProduces());
			if(adapterDTO.getApiDTO().getProduces() != null)
				conn.setRequestProperty("Accept", adapterDTO.getApiDTO().getProduces());
			else 
				conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				logger.error(METHOD_NAME+" : Error occured while calling the service. ResponseCode = "+conn.getResponseCode());
				adapterResponse.setErrorCode(String.valueOf(conn.getResponseCode()));
			}

			jsonIO = conn.getInputStream();
			
			StringBuilder jsonBuilder = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(jsonIO));
			
			String read = br.readLine();

			while(read != null) {
				jsonBuilder.append(read);
			    read =br.readLine();
			}			

			adapterResponse.setResponseMessage(conn.getResponseMessage());
			adapterResponse.setResponseObject(jsonBuilder.toString());
			
			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		
		logger.info(METHOD_NAME+" : Exit executeService");
		return adapterResponse;
	}
}
