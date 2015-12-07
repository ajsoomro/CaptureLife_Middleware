package com.rc.common.constants;

public class Constants {

	/*
	 * Application data contains configuration properties for
	 * e-commerce configuration and related web service API's
	 */
	public static final String APPLICATION_DATA = "applicationData";
	
	/*
	 * Source file path provided by client for e-Commerce application details
	 */
	public static final String ECOMMERCE_SOURCE_ROOT = "ecommerceConfigRoot";
	
	/*
	 * Constants for e-commerce platform related source 
	 * configuration file
	 */
	public static final String PLATFORM = "platform";
	public static final String VERSION = "version";
	public static final String FEATURE_PACK = "featurePack";
	public static final String STORE_ID = "storeId";
	public static final String HOSTNAME = "hostname";
	public static final String PORT = "port";
	public static final String URI = "URI";
	public static final String REQUEST_METHOD = "requestMethod";
	public static final String PARAMETERS = "parameters";
	public static final String CONSUMES = "consumes";
	public static final String PRODUCES = "produces";
	public static final String HTTPS = "https";
	
	/*
	 * Constant for WCS system name
	 */
	public static final String SYSTEM_WCS_NAME = "wcs";
	
	/*
	 * Constant for WCS system version
	 */
	public static final String SYSTEM_WCS_VERSION_7 = "7";
	
	/*
	 * Constant for WCS system feature pack
	 */
	public static final String SYSTEM_WCS_FEATURE_PACK_7 = "7";	
	
	/*
	 * Constant for hybris system name
	 */
	public static final String SYSTEM_HYBRIS_NAME = "hybris";
	
	/*
	 * Constant for hybris system version
	 */
	public static final String SYSTEM_HYBRIS_VERSION_4 = "4";
	
	/*
	 * Constant for magento system name
	 */
	public static final String SYSTEM_MAGENTO_NAME = "magento";
	
	/*
	 * Constant for magento system version
	 */
	public static final String SYSTEM_MAGENTO_VERSION_2 = "2";

	/*
	 * Delegate Service
	 */
	public static final String SERVICE_NAME = "serviceName";
	public static final String SESSION_OBJECT = "sessionObj";
	public static final Object API_NAME = "apiNAME";
	
	
	/**
	 * RESTful services API created for presentation layer
	 */
	
	/*
	 * Category based APIs
	 */
	public static final String GET_TOP_CATEGORYIES = "getTopCategories";
	public static final String BY_PARENT_CATEGORY = "byParentCategory";
	public static final String GET_PRODUCT_BY_CATEGORY = "getProductByCategory";

	/*
	 * Product based APIs
	 */
	public static final String GET_PRODUCT_DETAILS = "getProductByID";
	public static final String PRODUCTS_BY_SEARCH = "bySearchTerm";

	/*
	 * Search based APIs
	 */
	public static final String STORE_LOCATOR_BY_LOCATION = "byLocation";
	public static final String STORE_LOCATOR_BY_ZIPCODE = "byZipcode";
	
	/*
	 * Response types
	 */
	public static final String APPLICATION_JSON = "application/json";
	public static final String PLAIN_TEXT = "plain/text";
	public static final String PLAIN_HTML = "plain/html";

	/*
	 * Parameters name 
	 */
	public static final String PRODUCT_ID = "productId";
	public static final String PRODUCT_NAME = "productName";
	public static final String CATEGORY_ID = "categoryId";
	public static final String CITY = "city";
	public static final String SITE_LEVEL_STORE_SEARCH = "siteLevelStoreSearch";
	public static final String RADIUS = "radius";
	public static final String LATITUDE = "latitude";
	public static final String LONGITUDE = "longitude";
	public static final String MAX_ITEMS = "maxItems";
	public static final String RESPONSE_FORMAT = "responseFormat";
}