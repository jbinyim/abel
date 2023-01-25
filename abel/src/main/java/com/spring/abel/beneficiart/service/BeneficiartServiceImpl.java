package com.spring.abel.beneficiart.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.abel.beneficiart.dao.BeneficiartDao;
import com.spring.abel.beneficiart.dto.BeneficiartDto;

@Service
public class BeneficiartServiceImpl implements BeneficiartService{
	
	@Autowired
	private BeneficiartDao beneficiartDao;

	@Override
	public List<BeneficiartDto> getBeneficiartList(Map<String,String> beneficiartMap) throws Exception {
		return beneficiartDao.selectBeneficiartList(beneficiartMap);
	}

	@Override
	public BeneficiartDto getBeneficiartDetail(int beneficiartCd) throws Exception {
		return beneficiartDao.selectBeneficiart(beneficiartCd);
	}

	@Override
	public BeneficiartDto getRelatedBeneficiartList(int beneficiartCd) throws Exception {
		return beneficiartDao.selectListRelatedBeneficiart(beneficiartCd);
	}

}
