package com.rc.common.exception;

import org.apache.log4j.Logger;

/**
 * <code>RCRunTimeException</code> is run time exception thrown by portal.
 * 
 * @author RB
 */

public class RCRunTimeException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8846891232699681616L;
	
	/*
	 * Class name for logging.
	 */
	private final Logger logger = Logger.getLogger(RCRunTimeException.class);
    
    /**
	 * Constructor GARunTimeException.
	 */
	public RCRunTimeException() {
		super();
	}

	/**
	 * Constructor with a String Parameter 
	 * @param reasonCode Exception message
	 */	
	public RCRunTimeException(String msg) {
		super(msg);
		
		logger.error("Exception Message is [" + msg + "]");
	}
	
	/**
	 * Constructor with an Exception Parameter.
	 * @param eEx Exception Object 
	 */
	public RCRunTimeException(Exception ex) {
			super(ex);
			
		logger.error("Exception Message is [" + ex.getMessage() + "]",ex);
	}


	/**
	 * Constructor previous exception and message.
	 * @param reasonCode Exception message.
	 * @param eEx previous exception.
	 */		
	public RCRunTimeException(String msg, Exception ex) {
		super(msg, ex);
		
		logger.error("Exception Message is [" + msg + "]", ex);
	}
}


