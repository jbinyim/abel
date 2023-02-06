package com.spring.abel.common.dao;

import java.util.List;

import com.spring.abel.common.dto.CommonDto;

public interface CommonDao {
	
	public void insertContact(CommonDto commonDto) throws Exception;
	public List<CommonDto> selectListContact() throws Exception;
	public CommonDto selectOneContact(int contactCd) throws Exception;

}
