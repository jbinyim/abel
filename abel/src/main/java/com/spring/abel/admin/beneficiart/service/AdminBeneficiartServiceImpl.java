package com.spring.abel.admin.beneficiart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.abel.admin.beneficiart.dao.AdminBeneficiartDao;
import com.spring.abel.beneficiart.dto.BeneficiartDto;

@Service
public class AdminBeneficiartServiceImpl implements AdminBeneficiartService{

	@Autowired
	private AdminBeneficiartDao adminBeneficairtDao;
	
	@Override
	public void addNewBeneficiart(BeneficiartDto beneficiartDto) throws Exception {
		adminBeneficairtDao.insertBeneficiart(beneficiartDto);
	}

	@Override
	public List<BeneficiartDto> getBeneficiartList() throws Exception {
		return adminBeneficairtDao.selectListBeneficiart();
	}

}
