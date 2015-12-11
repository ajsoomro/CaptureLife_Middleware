package com.rc.dto.wcs.v7.fep7;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.rc.dto.base.BaseConverterDTO;
import com.rc.dto.pojo.GiftList;

public class WishListJSON extends BaseConverterDTO {
	private List<GiftList> giftList;

	public List<GiftList> getGiftList() {
		return giftList;
	}

	@JsonProperty("GiftList")
	public void setGiftList(List<GiftList> giftList) {
		this.giftList = giftList;
	}
	

}
