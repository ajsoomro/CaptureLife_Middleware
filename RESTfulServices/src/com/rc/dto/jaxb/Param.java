package com.rc.dto.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.rc.dto.base.BaseDTO;


@XmlRootElement( name = "param" )
public class Param extends BaseDTO {

    private String name;
    private String value;

    @XmlAttribute
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlAttribute
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
