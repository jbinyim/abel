package com.spring.abel.admin.beneficiart.dao;

import java.util.List;

import com.spring.abel.beneficiart.dto.BeneficiartDto;

public interface AdminBeneficiartDao {
	
	public List<BeneficiartDto> selectListBeneficiart() throws Exception;
	public void insertBeneficiart(BeneficiartDto beneficiartDto) throws Exception;

}
