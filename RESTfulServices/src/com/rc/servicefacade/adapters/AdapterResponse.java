package com.rc.servicefacade.adapters;

import com.rc.dto.base.BaseConverterDTO;

public class AdapterResponse {


	/** success or failure code of service. */
	private String returnCode;

	/** Error code of the service. */
	private String errorCode;

	/** Error code of the service. */
	private String responseMessage;

	/** Error code of the service. */
	private String responseObject;

	/** Response converted into java object*/
	private BaseConverterDTO convertedJavaObject;

	public BaseConverterDTO getConvertedJavaObject() {
		return convertedJavaObject;
	}

	public void setConvertedJavaObject(BaseConverterDTO convertedJavaObject) {
		this.convertedJavaObject = convertedJavaObject;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(String responseObject) {
		this.responseObject = responseObject;
	}
}
