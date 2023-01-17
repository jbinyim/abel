package com.spring.abel.beneficiart.service;

import com.spring.abel.beneficiart.dto.BeneficiartDto;
import java.util.List;

public interface BeneficiartService {
	
	public List<BeneficiartDto> getBeneficiartList(BeneficiartDto beneficiartDto) throws Exception;

}
