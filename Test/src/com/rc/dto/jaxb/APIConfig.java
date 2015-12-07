package com.rc.dto.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.rc.dto.base.BaseDTO;

@XmlRootElement( name = "configuration")
public class APIConfig extends BaseDTO {
	
	private List<APICategory> apiCategorys;
	
	@XmlElement( name = "api-category")
	public List<APICategory> getApiCategorys() {
		return apiCategorys;
	}
	public void setApiCategorys(List<APICategory> apiCategorys) {
		this.apiCategorys = apiCategorys;
	}
}
