package com.rc.dto.pojo;

import com.rc.dto.base.BaseConverterDTO;
import com.rc.dto.base.BaseDTO;

public class ResponseDTO extends BaseDTO {

	private BaseConverterDTO baseConverterDTO;

	public BaseConverterDTO getBaseConverterDTO() {
		return baseConverterDTO;
	}

	public void setBaseConverterDTO(BaseConverterDTO baseConverterDTO) {
		this.baseConverterDTO = baseConverterDTO;
	}
}