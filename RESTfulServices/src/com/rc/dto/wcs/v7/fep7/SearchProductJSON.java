package com.rc.dto.wcs.v7.fep7;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.rc.dto.base.BaseConverterDTO;
import com.rc.dto.pojo.BreadCrumbTrailEntryView;
import com.rc.dto.pojo.CatalogEntryView;
import com.rc.dto.pojo.FacetView;

public class SearchProductJSON extends BaseConverterDTO {

	private List<CatalogEntryView> catalogEntryViews;
	private List<FacetView> facetViews;
	private List<BreadCrumbTrailEntryView> breadCrumbTrailEntryView;
	
	public List<CatalogEntryView> getCatalogEntryViews() {
		return catalogEntryViews;
	}
	@JsonProperty("CatalogEntryView")
	public void setCatalogEntryViews(List<CatalogEntryView> catalogEntryViews) {
		this.catalogEntryViews = catalogEntryViews;
	}
	public List<FacetView> getFacetViews() {
		return facetViews;
	}
	@JsonProperty("FacetView")
	public void setFacetViews(List<FacetView> facetViews) {
		this.facetViews = facetViews;
	}
	public List<BreadCrumbTrailEntryView> getBreadCrumbTrailEntryView() {
		return breadCrumbTrailEntryView;
	}
	@JsonProperty("BreadCrumbTrailEntryView")
	public void setBreadCrumbTrailEntryView(List<BreadCrumbTrailEntryView> breadCrumbTrailEntryView) {
		this.breadCrumbTrailEntryView = breadCrumbTrailEntryView;
	}
}
