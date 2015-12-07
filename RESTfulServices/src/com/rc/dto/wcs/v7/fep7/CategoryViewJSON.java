package com.rc.dto.wcs.v7.fep7;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.rc.dto.base.BaseConverterDTO;
import com.rc.dto.pojo.CatalogGroupView;

public class CategoryViewJSON extends BaseConverterDTO {

	private List<CatalogGroupView> catalogGroupView;

	public List<CatalogGroupView> getCatalogEntryView() {
		return catalogGroupView;
	}

	@JsonProperty("CatalogGroupView")
	public void setCatalogEntryView(List<CatalogGroupView> catalogGroupView) {
		this.catalogGroupView = catalogGroupView;
	}
}
