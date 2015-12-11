package com.rc.ws.productapis;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rc.common.constants.Constants;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.RESTfulBaseService;

public interface ProductBasedRESTfulServices extends RESTfulBaseService {

	@GET
	@Path(Constants.GET_PRODUCT_DETAILS+"/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getProductByID(@PathParam("productId") String productId);
	
	@GET
	@Path(Constants.PRODUCT_BY_PART_NUMBER+"/{partNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getProductbyPartNumber(@PathParam("partNumber") String partNumber);

	@GET
	@Path(Constants.PRODUCTS_BY_SEARCH+"/{productName}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getSearchProducts(@PathParam("productName") String productName);

	@GET
	@Path(Constants.GET_PRODUCT_BY_CATEGORY+"/{categoryId}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getProductbyCategory(@PathParam("categoryId") String categoryId);
}
