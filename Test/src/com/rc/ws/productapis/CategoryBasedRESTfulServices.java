package com.rc.ws.productapis;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rc.common.constants.Constants;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.RESTfulBaseService;

public interface CategoryBasedRESTfulServices extends RESTfulBaseService {

	@GET
	@Path(Constants.GET_TOP_CATEGORYIES+"/{topCategory}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getTopCategories(@PathParam("topCategory") String topCategory);

	
	@GET
	@Path(Constants.BY_PARENT_CATEGORY+"/{categoryId}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getSubCategories(@PathParam("categoryId") String categoryId);
	
	
	
	@GET
	@Path(Constants.GET_PRODUCT_BY_CATEGORY_TYPE+"/{categoryType}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getCategoriesybyType(@PathParam("categoryType") String categoryType);
	
	
}
