package com.rc.ws.productapis;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rc.common.constants.Constants;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.RESTfulBaseService;

public interface CartBasedRESTfulServices extends RESTfulBaseService {

	@POST
	@Path(Constants.ADD_TO_CART)
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getAddToCartDetail(String json
										  , @HeaderParam("userId") String userId
										  , @HeaderParam("personalizationID") String personalizationID
										  , @HeaderParam("WCTrustedToken") String WCTrustedToken
										  , @HeaderParam("WCToken") String WCToken);
	

	
	//Applicable for FEP8
	//Work on this
	@POST
	@Path(Constants.DELETE_FROM_CART)
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getDeleteFromCartDetail(String json, @HeaderParam("orderItemId") String orderItemId);
	
	
	//Work on this
	@GET
	@Path(Constants.GET_CART+"/{orderItemId}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getCartDetail(@PathParam("orderItemId") String orderItemId);
	
	
	@GET
	@Path(Constants.GET_ASSIGNED_PROMOTION_CODE+"/{assignedPromotionCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getAssignedPromotionCode(@PathParam("assignedPromotionCode") String assignedPromotionCode);
}