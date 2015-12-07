package com.rc.common.exception;

import org.apache.log4j.Logger;

/**
 * This base exception will be thrown whenever there is a problem in
 * reading/writing data
 * 
 * @author RB
 */

public class RCSystemException extends Exception {

	private static final long serialVersionUID = -7089114070905348400L;
	
	/*
	 * Logger object for logging.
	 */
	private final Logger logger = Logger.getLogger(RCRunTimeException.class);

	String reasonCode = null;

	/**
	 * RCSystemException Constructor This is the constructor with out
	 * parameter.
	 */
	public RCSystemException() {
		super();

	}

	/**
	 * RCSystemException Constructor This is the constructor with a String
	 * Parameter.
	 * 
	 * @param reasonCode
	 *            this is the String Object as a Message
	 */
	public RCSystemException(String msg) {
		super(msg);

		if (this.getClass().getName().equalsIgnoreCase(RCSystemException.class.getName())) {
			
			logger.error("Exception Message is [" + msg + "]");
		}
	}

	/**
	 * Constructor RCSystemException This is the constructor with an Exception
	 * Parameter
	 * 
	 * @param eEx
	 *            this is the Exception Object
	 *  
	 */
	public RCSystemException(Exception eEx) {
		super(eEx);

		if (this.getClass().getName().equalsIgnoreCase(RCSystemException.class.getName())) {
			
			logger.error("Exception Message is [" + reasonCode + "]",eEx);
		}
	}

	/**
	 * Constructor RCSystemException This is the constructor with a String
	 * Message and an Exception Parameter
	 * 
	 * @param reasonCode
	 *            this is the String message
	 * @param eEx
	 *            this is the Exception Object
	 *  
	 */
	public RCSystemException(String msg, Exception eEx) {
		super(msg, eEx);

		if (this.getClass().getName().equalsIgnoreCase(RCSystemException.class.getName())) {
			
			logger.error("Exception Message is [" + msg + "]",eEx);
		}
	}

	/**
	 * RCSystemException Constructor This is the constructor with a String
	 * Parameter.
	 * 
	 * @param reasonCode
	 *            this is the String Object as a Message
	 */
	public RCSystemException(String msg, String reasonCode) {
		super(msg);
		this.reasonCode = (String) reasonCode;
		
		if (this.getClass().getName().equalsIgnoreCase(RCSystemException.class.getName())) {
			
			logger.error("Exception Message is [" + reasonCode + "]",new Exception(msg));
		}
	}

	/**
	 * Constructor RCSystemException This is the constructor with an Exception
	 * Parameter
	 * 
	 * @param eEx
	 *            this is the Exception Object
	 *  
	 */
	public RCSystemException(Exception eEx, String reasonCode) {
		super(eEx);
		this.reasonCode = (String) reasonCode;
		
		if (this.getClass().getName().equalsIgnoreCase(RCSystemException.class.getName())) {
			
			logger.error("Exception Message is [" + reasonCode + "]",eEx);
		}
	}
	
	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
}

