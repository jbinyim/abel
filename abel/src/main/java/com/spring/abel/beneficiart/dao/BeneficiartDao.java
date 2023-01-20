package com.spring.abel.beneficiart.dao;

import java.util.List;
import java.util.Map;

import com.spring.abel.beneficiart.dto.BeneficiartDto;

public interface BeneficiartDao {
	
	public List<BeneficiartDto> selectBeneficiartList(Map<String,String> beneficiartMap) throws Exception;
	public BeneficiartDto selectBeneficiart(int beneficiartCd) throws Exception;
	
}
