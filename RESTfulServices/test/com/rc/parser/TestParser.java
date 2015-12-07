package com.rc.parser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.rc.dto.base.BaseDTO;
import com.rc.dto.jaxb.CommerceConfig;

public class TestParser {

	public static void main(String[] args) {
		 
		File file = new File("config/royalcyber/ws/source.xml"); 

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(CommerceConfig.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller(); 
			CommerceConfig cc = (CommerceConfig) jaxbUnmarshaller.unmarshal(file); 
			System.out.println(cc); 
			
			cc = (CommerceConfig) unmarshal(new CommerceConfig(),file);
			System.out.println(cc);
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

	public static BaseDTO unmarshal(BaseDTO inputDto, File file){

		try {
			
			JAXBContext jaxbContext = JAXBContext.newInstance(inputDto.getClass());

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			inputDto = (BaseDTO)jaxbUnmarshaller.unmarshal(file);
			System.out.println(inputDto);

		  } catch (JAXBException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
		  }

		return inputDto;
	}
}
