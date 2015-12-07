package com.rc.dto.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.rc.dto.base.BaseDTO;

@XmlRootElement ( name = "section")
public class Section extends BaseDTO {
	
	private String name;
	private List<Param> params;
	
	@XmlAttribute( name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement( name = "param" )
	public List<Param> getParams() {
		return params;
	}
	public void setParams(List<Param> params) {
		this.params = params;
	}
}
