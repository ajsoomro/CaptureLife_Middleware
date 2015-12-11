package com.rc.dto.wcs.v7.fep7;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import com.rc.dto.base.BaseConverterDTO;
import com.rc.dto.pojo.GiftListDefault;

public class WishListDefaultJSON extends BaseConverterDTO {
	private List<GiftListDefault> giftListDefault;

	public List<GiftListDefault> getGiftListDefault() {
		return giftListDefault;
	}

	@JsonProperty("GiftList")
	public void setGiftListDefault(List<GiftListDefault> giftListDefault) {
		this.giftListDefault = giftListDefault;
	}
	

}
