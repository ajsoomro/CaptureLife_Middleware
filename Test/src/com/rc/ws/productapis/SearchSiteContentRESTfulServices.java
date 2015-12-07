package com.rc.ws.productapis;

import com.rc.common.constants.Constants;
import com.rc.dto.pojo.ResponseDTO;
import com.rc.ws.base.RESTfulBaseService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface SearchSiteContentRESTfulServices extends RESTfulBaseService {
	
	@GET
	@Path(Constants.GET_KEYWORD_SUGGESTION+"/{keywordSuggestion}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseDTO getKeywordSuggestion(@PathParam("keywordSuggestion") String keywordSuggestion);
	

}
