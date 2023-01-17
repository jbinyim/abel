package com.spring.abel.beneficiart.dao;

import java.util.List;

import com.spring.abel.beneficiart.dto.BeneficiartDto;

public interface BeneficiartDao {
	
	public List<BeneficiartDto> selectBeneficiartList(BeneficiartDto beneficiartDto) throws Exception;

}
