package com.rc.ws.demo.impl;

import javax.ws.rs.Path;

import com.rc.ws.base.impl.RESTFulBaseServiceImpl;
import com.rc.ws.demo.Demo;

@Path("demo")
public class DemoImpl extends RESTFulBaseServiceImpl implements Demo{

	public String hello(){
		
		return "Hello World!! <br/> Store Id = "+super.getApplicationData().getBaseStoreConfig().getStoreId() +" and E-Commerce Platform = "+super.getApplicationData().getBaseStoreConfig().getPlatform();
	}

	public String sum(int a, int b){
		
		return "Sum of number "+a+" and "+b+" is = "+String.valueOf(a + b);
	}
}
