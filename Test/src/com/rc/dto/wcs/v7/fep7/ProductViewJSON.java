package com.rc.dto.wcs.v7.fep7;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.rc.dto.base.BaseConverterDTO;
import com.rc.dto.pojo.CatalogEntryView;

public class ProductViewJSON extends BaseConverterDTO {

	private List<CatalogEntryView> catalogEntryView;

	public List<CatalogEntryView> getCatalogEntryView() {
		return catalogEntryView;
	}

	@JsonProperty("CatalogEntryView")
	public void setCatalogEntryView(List<CatalogEntryView> catalogEntryView) {
		this.catalogEntryView = catalogEntryView;
	}
}
