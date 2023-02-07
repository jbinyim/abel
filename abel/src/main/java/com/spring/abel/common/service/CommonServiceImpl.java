package com.spring.abel.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.abel.common.dao.CommonDao;
import com.spring.abel.common.dto.CommonDto;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	private CommonDao commonDao;
	
	@Override
	public void addNewContact(CommonDto commonDto) throws Exception {
		commonDao.insertContact(commonDto);
	}

	@Override
	public List<CommonDto> getContactList() throws Exception {
		return commonDao.selectListContact();
	}

	@Override
	public CommonDto getContactDetail(int contactCd) throws Exception {
		return commonDao.selectOneContact(contactCd);
	}

	@Override
	public void removeContact(int[] deleteContactCdList) throws Exception {
		commonDao.deleteContact(deleteContactCdList);
	}

}
