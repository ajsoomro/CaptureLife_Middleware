package com.rc.ws.productapis;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.rc.common.constants.Constants;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.RESTfulBaseService;

public interface StoreLocatorRESTfulServices extends RESTfulBaseService {

	@GET
	@Path(Constants.STORE_LOCATOR_BY_LOCATION)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO searchStoreByLocation(@QueryParam("city") String city
											, @QueryParam("siteLevelStoreSearch") String siteLevelStoreSearch
											, @QueryParam("radius") String radius);

	@GET
	@Path(Constants.STORE_LOCATOR_BY_ZIPCODE)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO searchStoreByZipcode(@QueryParam("latitude") String latitude
											, @QueryParam("longitude") String longitude
											, @QueryParam("maxItems") String maxItems
											, @QueryParam("siteLevelStoreSearch") String siteLevelStoreSearch
											, @QueryParam("responseFormat") String responseFormat);
}
