package com.spring.abel.admin.beneficiart.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.abel.beneficiart.dto.BeneficiartDto;

@Repository
public class AdminBeneficiartDaoImpl implements AdminBeneficiartDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertBeneficiart(BeneficiartDto beneficiartDto) throws Exception {
		sqlSession.insert("admin.beneficiart.insertBeneficiart" , beneficiartDto);
	}

	@Override
	public List<BeneficiartDto> selectListBeneficiart() throws Exception {
		return sqlSession.selectList("admin.beneficiart.selectListBeneficiart");
	}

	@Override
	public void updateBeneficiiartDetail(BeneficiartDto beneficiartDto) throws Exception {
		sqlSession.update("admin.beneficiart.updateBeneficiiartDetail" , beneficiartDto);
	}

	@Override
	public void deleteBeneficiart(int beneficiartCd) throws Exception {
		sqlSession.delete("admin.beneficiart.deleteBeneficiart" , beneficiartCd);
	}

}
