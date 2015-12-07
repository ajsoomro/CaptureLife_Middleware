package com.rc.ws.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rc.ws.base.RESTfulBaseService;

public interface Demo extends RESTfulBaseService {

	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello();

	@GET
	@Path("sum/{a}/{b}")
	@Produces(MediaType.TEXT_PLAIN)
	public String sum(@PathParam("a") int a, @PathParam("b") int b);
}
