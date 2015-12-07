package com.rc.dto.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.rc.dto.base.BaseDTO;

@XmlRootElement( name = "configuration")
public class CommerceConfig extends BaseDTO {
	
	private Section section;
	
	@XmlElement( name = "section")
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
}
