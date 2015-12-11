package com.rc.common.config;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.rc.common.constants.Constants;
import com.rc.common.exception.RCSystemException;
import com.rc.common.util.ParserUtility;
import com.rc.dto.jaxb.API;
import com.rc.dto.jaxb.APICategory;
import com.rc.dto.jaxb.APIConfig;
import com.rc.dto.jaxb.CommerceConfig;
import com.rc.dto.jaxb.Param;
import com.rc.dto.pojo.BaseApiConfigDTO;
import com.rc.dto.pojo.BaseStoreConfigDTO;

public class ApplicationData{
	
	public static final String CLASS_NAME = ApplicationData.class.toString();
	private final Logger logger = Logger.getLogger(ApplicationData.class);
	
	private BaseStoreConfigDTO baseStoreConfig;
	private Map<String, List<BaseApiConfigDTO>> apiMap;
	
	public void load() throws Exception{
		String METHO_NAME = CLASS_NAME+".load()";
		// load all base tables data
		loadStorConfigAndRelatedApis();
		logger.debug(METHO_NAME+" : All tables and properties are loaded on server startup");
	}

	private void loadStorConfigAndRelatedApis() throws RCSystemException{

		String METHO_NAME = CLASS_NAME+".loadStorConfigAndApisMap()";
		
		logger.info(METHO_NAME+" : Enter into the method");

		CommerceConfig sourceConfig = new CommerceConfig();
		APIConfig apiConfig = new APIConfig();
		
		String apiConfigRootPath = null;
		//String sourceRoot = System.getProperty(Constants.ECOMMERCE_SOURCE_ROOT);
		String sourceRoot = "C:/Users/abdul.jalil/Dropbox/GITHUB/CaptureLife_Middleware/RESTfulServices/src/com/rc/common/config/ws/source.xml";
		
		logger.info(METHO_NAME+" : ecommerceConfigRoot = "+sourceRoot);
		
		try {
			sourceConfig = (CommerceConfig) ParserUtility.unmarshal(sourceConfig, new File(sourceRoot));
			populateBaseConfigObject(sourceConfig);
			
			apiConfigRootPath = "ws\\"+baseStoreConfig.getPlatform().toLowerCase()
							+"\\"+baseStoreConfig.getVersion().toLowerCase()
							+"\\"+baseStoreConfig.getFeaturePack().toLowerCase()
							+"\\API-config.xml";
			
			File apiConfigFile = new File(this.getClass().getResource(apiConfigRootPath).getPath());
			apiConfig = (APIConfig) ParserUtility.unmarshal(apiConfig, apiConfigFile);
			populateApiMap(apiConfig);
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(METHO_NAME+" : "+ e.getMessage(), e);
			throw new RCSystemException("Some exception occured while parsing source configuration files", e);
		}
		
		logger.info(METHO_NAME+" : Store config and related API's loaded successfully on server startup");
	}
	
	private void populateBaseConfigObject(CommerceConfig config){

		String METHO_NAME = CLASS_NAME+".populateBaseConfigObject()";
		
		baseStoreConfig = new BaseStoreConfigDTO();
		
		List<Param> storeParams = config.getSection().getParams();

		//for(Iterator<Param> iter = storeParams.iterator() ; iter.hasNext(); ){
		for(Param configParam : storeParams){

			if(configParam.getName().equalsIgnoreCase(Constants.PLATFORM)){
				baseStoreConfig.setPlatform(configParam.getValue());

			} else if(configParam.getName().equalsIgnoreCase(Constants.VERSION)){
				baseStoreConfig.setVersion(configParam.getValue());

			} else if(configParam.getName().equalsIgnoreCase(Constants.FEATURE_PACK)){
				baseStoreConfig.setFeaturePack(configParam.getValue());

			} else if(configParam.getName().equalsIgnoreCase(Constants.STORE_ID)){
				baseStoreConfig.setStoreId(configParam.getValue());

			} else if(configParam.getName().equalsIgnoreCase(Constants.HOSTNAME)){
				baseStoreConfig.setHostname(configParam.getValue());

			} else if(configParam.getName().equalsIgnoreCase(Constants.PORT)){
				baseStoreConfig.setPort(configParam.getValue());

			} else if(configParam.getName().equalsIgnoreCase(Constants.URI)){
				baseStoreConfig.setURI(configParam.getValue());

			} else if(configParam.getName().equalsIgnoreCase(Constants.PARAMETERS)) {

				String uriParamters = configParam.getValue();

				String[] paramsArray = uriParamters.split(";");

				for(String parameter : paramsArray) {

					if(parameter == null || parameter.equalsIgnoreCase(""))
						continue;

					String[] paramArray = parameter.split(":"); 

					String key = paramArray[0];
					String value = "";
					
					if(paramArray.length > 1)
						value = paramArray[1];
					baseStoreConfig.setParameters(key, value);
				}
			}
		}
		
		logger.debug(METHO_NAME+" : base store config object populated successfully");
	}
	
	private BaseApiConfigDTO populateBaseAPIObject(API api){

		String METHO_NAME = CLASS_NAME+".populateBaseAPIObject()";
		
		BaseApiConfigDTO baseApiConfig = new BaseApiConfigDTO();
		
		for(Param apiParam : api.getParams()){

			if(apiParam.getName().equalsIgnoreCase(Constants.URI)){
				baseApiConfig.setURI(apiParam.getValue());
				
			} else if(apiParam.getName().equalsIgnoreCase(Constants.REQUEST_METHOD)){
				baseApiConfig.setRequestMethod(apiParam.getValue());

			} else if(apiParam.getName().equalsIgnoreCase(Constants.PRODUCES)){
				baseApiConfig.setProduces(apiParam.getValue());

			} else if(apiParam.getName().equalsIgnoreCase(Constants.CONSUMES)){
				baseApiConfig.setConsumes(apiParam.getValue()); 

			} else if(apiParam.getName().equalsIgnoreCase(Constants.HTTPS)){
				baseApiConfig.setHttps(Boolean.valueOf(apiParam.getValue()).booleanValue());

			} else if(apiParam.getName().equalsIgnoreCase(Constants.PARAMETERS)) {
				baseApiConfig.setParameters(apiParam.getValue());
			}
		}
		
		logger.debug(METHO_NAME+" : base API object for that store populated successfully");
		
		return baseApiConfig;
	}
	
	private void populateApiMap(APIConfig config){
		
		String METHO_NAME = CLASS_NAME+".populateApiMap()";
		
		List<APICategory> apiCategories = config.getApiCategorys();
		
		for(APICategory apiCategory : apiCategories){
			List<API> apis = apiCategory.getApis();
			for(API api : apis){
				setApiMap(api.getName(),api);
			}
		}
		
		logger.debug(METHO_NAME+" : All API's MAP for that store populated successfully");
	}
	
	private void setApiMap(String key, API api){
		
		List<BaseApiConfigDTO> apiList = null;
		BaseApiConfigDTO baseApiConfig = populateBaseAPIObject(api);
		
		if(this.apiMap == null){
			
			this.apiMap = new HashMap<String, List<BaseApiConfigDTO>>();
			
		} else {
			
			apiList = this.apiMap.get(key);
			this.apiMap.remove(key);
		}
		
		if(apiList == null)
			apiList = new ArrayList<BaseApiConfigDTO>();
		
		apiList.add(baseApiConfig);
		this.apiMap.put(key, apiList);
	}

	public BaseStoreConfigDTO getBaseStoreConfig() {
		return baseStoreConfig;
	}

	public void setBaseStoreConfig(BaseStoreConfigDTO baseStoreConfig) {
		this.baseStoreConfig = baseStoreConfig;
	}

	public Map<String, List<BaseApiConfigDTO>> getApiMap() {
		return apiMap;
	}

	public void setApiMap(Map<String, List<BaseApiConfigDTO>> apiMap) {
		this.apiMap = apiMap;
	}
/*
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {

		try {
			loadStorConfigAndRelatedApis();
		} catch (RCSystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
*/}
