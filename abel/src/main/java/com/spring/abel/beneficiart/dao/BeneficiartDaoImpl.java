package com.spring.abel.beneficiart.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.abel.beneficiart.dto.BeneficiartDto;

@Repository
public class BeneficiartDaoImpl implements BeneficiartDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<BeneficiartDto> selectBeneficiartList(BeneficiartDto beneficiartDto) throws Exception {
		return sqlSession.selectList("beneficiart.selectBeneficiartList" , beneficiartDto);
	}

}