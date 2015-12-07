package com.rc.dto.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.rc.dto.base.BaseDTO;

public class APICategory extends BaseDTO {
	
	private String name;
	private List<API> apis;

	
	@XmlAttribute(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement( name="api")
	public List<API> getApis() {
		return apis;
	}

	public void setApis(List<API> apis) {
		this.apis = apis;
	}
}
