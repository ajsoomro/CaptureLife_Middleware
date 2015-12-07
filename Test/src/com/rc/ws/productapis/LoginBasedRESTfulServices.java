package com.rc.ws.productapis;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rc.common.constants.Constants;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.RESTfulBaseService;

public interface LoginBasedRESTfulServices extends RESTfulBaseService {

	@POST
	@Path(Constants.GUEST_LOGIN)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getGuestLoginToken();
	
	@POST
	@Path(Constants.USER_LOGIN)
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getUserLoginToken(String json);
	/*public ResponseDTO getUserLoginToken(@QueryParam("logonId")String logonId, @QueryParam("logonPassword") String logonPassword);*/
}
