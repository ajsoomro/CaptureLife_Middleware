package com.rc.ws.productapis;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.rc.dto.pojo.AddORUpdateItem;

import com.rc.common.constants.Constants;
import com.rc.dto.pojo.CreateWishList;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.RESTfulBaseService;

public interface WishListBasedRESTfulServices extends RESTfulBaseService {
	@GET
	@Path(Constants.WISH_LIST_BY_EXTERNAL_ID+"/{externalId}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO wishListByExternalId(@PathParam("externalId") String externalId
										    ,@QueryParam("pageSize") String pageSize
											, @QueryParam("pageNumber") String pageNumber
											, @QueryParam("responseFormat") String responseFormat);
	@GET
	@Path(Constants.WISH_LIST_BY_DEFAULT)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO wishListByDefault(@QueryParam("responseFormat") String responseFormat);
	
	@GET
	@Path(Constants.WISH_LIST_SELF)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO wishListSelf(@QueryParam("responseFormat") String responseFormat);
	
	@POST
	@Path(Constants.WISH_LIST_CREATE)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO createWishList(@QueryParam("responseFormat") String responseFormat,  CreateWishList createWishList);
	
	@PUT
	@Path(Constants.WISH_LIST_ADD_ITEM)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO addItemToWishList(@QueryParam("responseFormat") String responseFormat, AddORUpdateItem addORUpdateItem);
	

}
