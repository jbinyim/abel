package com.spring.abel.common.service;

import java.util.List;

import com.spring.abel.common.dto.CommonDto;

public interface CommonService {
	
	public void addNewContact(CommonDto commonDto) throws Exception;
	public List<CommonDto> getContactList() throws Exception;
	public CommonDto getContactDetail(int contactCd) throws Exception;

}
