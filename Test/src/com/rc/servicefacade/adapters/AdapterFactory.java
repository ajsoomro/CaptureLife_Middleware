package com.rc.servicefacade.adapters;

import org.apache.log4j.Logger;

import com.rc.common.constants.Constants;
import com.rc.servicefacade.adapters.impl.WCSAdapter;

/**
 * Factory class use to get instance of system specific adapter.
 * 
 * @author RB
 */
public class AdapterFactory {

	/* Class name for logging*/
	private static final String CLASS_NAME = AdapterFactory.class.getName();
	private static final Logger logger = Logger.getLogger(AdapterFactory.class);

	/**
	 * Returns appropriate adapter for the system.
	 * This method takes system name as input and return an instance
	 * of appropriate adapter for the system.
	 * @param systemName for which adapter is required
	 * @return Adapter instance for the given system name
	 * @throws AdapterNotFoundException
	 */
	public static Adapter getAdapter(String systemName)
	{
		final String METHOD_NAME = CLASS_NAME+".getAdapter()";
		
		logger.info(METHOD_NAME+ " : Entered the method");

		Adapter adapter = null;

		logger.debug(METHOD_NAME+ "Find an adapter for System name [" + systemName + "]");
		
		if (Constants.SYSTEM_WCS_NAME.equals(systemName)) {
			adapter = new WCSAdapter();
		} else if (Constants.SYSTEM_HYBRIS_NAME.equals(systemName)) {
			//adapter = new HybrisAdapter();
		} else if (Constants.SYSTEM_MAGENTO_NAME.equals(systemName)) {
			//adapter = new MagentoAdapter();
		}
		
		if(adapter == null){
			logger.error(METHOD_NAME+ "No Adapter found for System name [" + systemName + "]", new Exception());
		}
		
		logger.info(METHOD_NAME+ " : Exit method");
		return adapter;
	}

}
