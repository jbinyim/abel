package com.spring.abel.admin.beneficiart.service;

import java.util.List;

import com.spring.abel.beneficiart.dto.BeneficiartDto;

public interface AdminBeneficiartService {
	
	public List<BeneficiartDto> getBeneficiartList() throws Exception;
	public void addNewBeneficiart(BeneficiartDto beneficiartDto) throws Exception;

}
