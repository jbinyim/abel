package com.spring.abel.beneficiart.dao;

import java.util.List;
import java.util.Map;

import com.spring.abel.beneficiart.dto.BeneficiartDto;

public interface BeneficiartDao {
	
	public List<BeneficiartDto> selectBeneficiartList(Map<String,String> beneficiartMap) throws Exception;
	public BeneficiartDto selectBeneficiart(int beneficiartCd) throws Exception;
	public BeneficiartDto selectListRelatedBeneficiart (int beneficiartCd) throws Exception;
	public List<BeneficiartDto> selectListSearchBeneficiart(Map<String,Object> searchMap) throws Exception;
	public List<BeneficiartDto> selectListFindBeneficiart(Map<String,Object> findMap) throws Exception;
	
}
