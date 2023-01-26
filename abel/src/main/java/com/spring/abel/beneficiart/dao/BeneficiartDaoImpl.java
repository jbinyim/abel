package com.spring.abel.beneficiart.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.abel.beneficiart.dto.BeneficiartDto;

@Repository
public class BeneficiartDaoImpl implements BeneficiartDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<BeneficiartDto> selectBeneficiartList(Map<String,String> beneficiartMap) throws Exception {
		return sqlSession.selectList("beneficiart.selectBeneficiartList" , beneficiartMap);
	}

	@Override
	public BeneficiartDto selectBeneficiart(int beneficiartCd) throws Exception {
		return sqlSession.selectOne("beneficiart.selectBeneficiart" , beneficiartCd);
	}

	@Override
	public BeneficiartDto selectListRelatedBeneficiart(int beneficiartCd) throws Exception {
		return sqlSession.selectOne("beneficiart.selectRelatedBeneficiartList" , beneficiartCd);
	}

	@Override
	public List<BeneficiartDto> selectListSearchBeneficiart(Map<String, Object> searchMap) throws Exception {
		return sqlSession.selectList("beneficiart.selectListSearchBeneficiart" , searchMap);
	}
	
	

}
