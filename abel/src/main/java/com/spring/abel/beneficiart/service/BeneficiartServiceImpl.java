package com.spring.abel.beneficiart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.abel.beneficiart.dao.BeneficiartDao;
import com.spring.abel.beneficiart.dto.BeneficiartDto;

@Service
public class BeneficiartServiceImpl implements BeneficiartService{
	
	@Autowired
	private BeneficiartDao beneficiartDao;

	@Override
	public List<BeneficiartDto> getBeneficiartList(BeneficiartDto beneficiartDto) throws Exception {
		return beneficiartDao.selectBeneficiartList(beneficiartDto);
	}

}
