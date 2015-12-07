package com.rc.servicefacade.adapters;

import com.rc.common.exception.RCSystemException;
import com.rc.dto.pojo.AdapterDTO;

/**
 * Interface to be implemented by all Adapters.
 *  
 * @author RB
 */

public interface Adapter {

	/**
	 * Call external system service.
	 * This method is called when ever any data is posted to the system.
	 * TODO : still to decide 
	 * 		1. method arguments
	 * 		2. response objects format
	 * 		3. Type of exception handling  
	 */
	public AdapterResponse callService(AdapterDTO adapterDTO) throws RCSystemException;
	
}
