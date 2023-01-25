package com.spring.abel.beneficiart.service;

import com.spring.abel.beneficiart.dto.BeneficiartDto;
import java.util.List;
import java.util.Map;

public interface BeneficiartService {
	
	public List<BeneficiartDto> getBeneficiartList(Map<String,String> beneficiartMap) throws Exception;
	public BeneficiartDto getBeneficiartDetail (int beneficiartCd) throws Exception;
	public BeneficiartDto getRelatedBeneficiartList (int beneficiartCd) throws Exception;

}
