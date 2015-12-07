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
	public static final String HEADER_PARAMETERS = "headerParameters";
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
	public static final String GET_PRODUCT_BY_CATEGORY_TYPE = "getProductByCategoryType";

	/*
	 * Product based APIs
	 */
	public static final String GET_PRODUCT_DETAILS = "getProductByID";
	public static final String PRODUCTS_BY_SEARCH = "bySearchTerm";
	public static final String GET_PRODUCT_BY_CATEGORY = "getProductByCategory";

	/*
	 * Search based APIs
	 */
	public static final String STORE_LOCATOR_BY_LOCATION = "byLocation";
	public static final String STORE_LOCATOR_BY_ZIPCODE = "byZipcode";
	
	/*
	 * Login based APIs
	 */
	public static final String GUEST_LOGIN = "byGuestIdentity";
	public static final String USER_LOGIN = "byLoginIdentity";
	
	/*
	 * Shopping Cart based APIs
	 */
	public static final String ADD_TO_CART = "addToCart";
	public static final String DELETE_FROM_CART = "deleteFromCart";
	public static final String GET_CART = "getCart";
	public static final String GET_ASSIGNED_PROMOTION_CODE = "getAssignedPromotionCode";
	
	/*
	 * Search Site Content based APIs
	 */
	public static final String GET_KEYWORD_SUGGESTION = "getKeywordSuggestion";


	
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
	public static final String LOGON_ID_PASSWORD = "logonIdPassword";
	public static final String SHOPPING_CART_ITEM = "shoppingCartItem";
	public static final String RESPONSE_FORMAT = "responseFormat";
	
	public static final String USER_ID = "userId";
	public static final String PERSONALIZATION_ID = "personalizationID";
	public static final String WC_TRUSTED_TOKEN = "WCTrustedToken";
	public static final String WC_TOKEN = "WCToken";

	public static final String ORDER_ITEM_ID = "orderItemId";
	
	public static final String CATEGORY_TYPE = "categoryType";

	public static final String KEYWORD_SUGGESTION = "keywordSuggestion";

	public static final String ASSIGNED_PROMOTION_CODE = "assignedPromotionCode";

	


	
}