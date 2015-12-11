package com.rc.common.util;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import com.rc.common.exception.RCSystemException;
import com.rc.dto.base.BaseConverterDTO;
import com.rc.dto.base.BaseDTO;
import com.rc.dto.pojo.AdapterDTO;
import com.rc.servicefacade.adapters.AdapterResponse;
import com.rc.servicefacade.converter.ConverterFactory;

public class ParserUtility {
	
	private static Logger logger = Logger.getLogger(ParserUtility.class);
	private final static String CLASS_NAME = ParserUtility.class.getName();

	public static Object unmarshal(BaseDTO inputDto, File file) throws Exception{

		String METHOD_NAME = CLASS_NAME+".unmarshal";
		logger.info(METHOD_NAME+": Start unmarshal");
		
		Object outputObject = null;
		try {
			if(!file.canRead()){
				  logger.error(METHOD_NAME+" : file does not exist path - "+file.getAbsolutePath());
				  throw new Exception("File not found");
			}
			logger.info(METHOD_NAME+": Unmarshal file = '"+file.getName()+"' to object = '"+inputDto.getClass().getName()+"'");
			JAXBContext jaxbContext = JAXBContext.newInstance(inputDto.getClass());

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			outputObject = jaxbUnmarshaller.unmarshal(file);

		  } catch (JAXBException e) {
			  logger.error(METHOD_NAME+" \n "+e.getMessage());
			  throw new Exception("Error occured during unmarshelling : ",e);
		  }

		logger.info(METHOD_NAME+": End unmarshal");
		return outputObject;
	}
	

	public static void convertJSONToJavaObject(AdapterDTO adapterDTO, AdapterResponse adapterResponse) throws RCSystemException {

		String METHOD_NAME = CLASS_NAME+".convertToJavaObject()";
		logger.info(METHOD_NAME+" : Exit executeService");
		
		ObjectMapper mapper = new ObjectMapper();
		BaseConverterDTO dto;
		
		try {

			//Get converter DTO object
			dto = ConverterFactory.getConverter(adapterDTO.getApiDTO().getURI(), adapterDTO.getBaseStoreConfigDTO());
			
			//Convert JSON string to java DTO
			dto = mapper.readValue(adapterResponse.getResponseObject(), dto.getClass());
		} catch (JsonParseException e) {
			logger.error(METHOD_NAME+" : JSON parser exception  = "+e.getMessage(), e);
			throw new RCSystemException(METHOD_NAME+" : JSON parser exception  = "+e.getMessage(), e);
		} catch (JsonMappingException e) {
			logger.error(METHOD_NAME+" : JSON mapping exception  = "+e.getMessage(), e);
			throw new RCSystemException(METHOD_NAME+" : JSON mapping exception  = "+e.getMessage(), e);
		} catch (IOException e) {
			logger.error(METHOD_NAME+" : JSON IO exception  = "+e.getMessage(), e);
			throw new RCSystemException(METHOD_NAME+" : JSON IO exception  = "+e.getMessage(), e);
		}
		
		adapterResponse.setConvertedJavaObject(dto);
		
		logger.info(METHOD_NAME+" : Exit executeService");
	}
	
	
	
	
	
	
	/**
	 * @author abdul.jalil
	 * @param obj
	 * @return
	 */
	
	public static String JavaToJson(Object obj){
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		String s = gson.toJson(obj);
		return s;
		
	}
	
	/**
	 * 
	 * @author abdul.jalil
	 * @param jsonText
	 * @param clazz
	 * @return
	 * @throws RCSystemException 
	 */
	public static  <T>  T JsonTOJava(String jsonText, Class<T> clazz) throws RCSystemException {
		String METHOD_NAME ="JsonTOJava(String jsonText, Class<T> clazz)";
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		try {
			return gson.fromJson(jsonText, clazz);
		
		}catch(JsonSyntaxException e){
			logger.error(METHOD_NAME+" : JSON Syntext exception  = "+e.getMessage(), e);
			throw new RCSystemException(METHOD_NAME+" : JSON parser exception  = "+e.getMessage(), e);
		}catch(Exception e){
			logger.error(e.fillInStackTrace());
		}
		return null;
	}
}
