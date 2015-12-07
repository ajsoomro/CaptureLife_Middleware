package com.rc.dto.wcs.v7.fep7;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.rc.dto.base.BaseConverterDTO;
import com.rc.dto.pojo.PhysicalStore;

public class StoreLocatorJSON extends BaseConverterDTO {

	private List<PhysicalStore> physicalStores;

	public List<PhysicalStore> getPhysicalStores() {
		return physicalStores;
	}
	
	@JsonProperty("PhysicalStore")
	public void setPhysicalStores(List<PhysicalStore> physicalStores) {
		this.physicalStores = physicalStores;
	}

}
