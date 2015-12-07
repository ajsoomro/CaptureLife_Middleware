package com.rc.servicefacade.converter;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.core.convert.ConverterNotFoundException;

import com.rc.common.exception.RCSystemException;
import com.rc.dto.base.BaseConverterDTO;
import com.rc.dto.pojo.BaseStoreConfigDTO;

public class ConverterFactory {

	//logger instance
	private static final Logger logger = Logger.getLogger(ConverterFactory.class);

	// class name for logging
	private static final String CLASS_NAME = ConverterFactory.class.getName();

	/**
	 * Map containing all converters.
	 * This map contains key as web service API name and JSON Converter DTO as value
	 */
	private static Map<String, String> converterMap = new HashMap<String, String>();

	// static block loads all the Converters in map
	static {

		// Load look up member Converter
		converterMap.put("wcs/v7/fep7/productview","com.rc.dto.wcs.v7.fep7.ProductViewJSON");
		converterMap.put("wcs/v7/fep7/productview/byCategory","com.rc.dto.wcs.v7.fep7.SearchProductJSON");
		converterMap.put("wcs/v7/fep7/productview/bySearchTerm","com.rc.dto.wcs.v7.fep7.SearchProductJSON");
		converterMap.put("wcs/v7/fep7/storelocator/byLocation","com.rc.dto.wcs.v7.fep7.StoreLocatorJSON");
		converterMap.put("wcs/v7/fep7/storelocator","com.rc.dto.wcs.v7.fep7.StoreLocatorJSON");
		converterMap.put("wcs/v7/fep7/categoryview","com.rc.dto.wcs.v7.fep7.CategoryViewJSON");
		converterMap.put("wcs/v7/fep7/categoryview/byParentCategory","com.rc.dto.wcs.v7.fep7.CategoryViewJSON");

	}

	/**
	 * Return converter for action name
	 * This method will look in converter map for converter and return 
	 * appropriate converter.
	 * 
	 * @param actionName for which converter is required.
	 * @return BaseConverter.
	 * @throws ConverterNotFoundException if no converter is found for action.
	 */
	public static BaseConverterDTO getConverter(String actionName, BaseStoreConfigDTO configDTO) throws RCSystemException {

		final String METHOD_NAME = CLASS_NAME+"getConverter";


		BaseConverterDTO converter = null;


		String dtoPath = converterMap.get(configDTO.getPlatform()+"/"+configDTO.getVersion()+"/"+configDTO.getFeaturePack()+actionName);
		
		converter = (BaseConverterDTO) createObject(dtoPath);

		if (converter == null) {
			
			logger.error(METHOD_NAME+" : Converter not found for {"+ actionName +"]");
			throw new RCSystemException(METHOD_NAME+" : Converter not found for {"+ actionName +"]");
		}		
		
		return converter;

	}

	@SuppressWarnings("rawtypes")
	private static Object createObject(String className) {
		Object object = null;
		try {
			Class classDefinition = Class.forName(className);
			object = classDefinition.newInstance();
		} catch (InstantiationException e) {
			System.out.println(e);
		} catch (IllegalAccessException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return object;
	}
}
