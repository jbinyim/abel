package com.spring.abel.sponsor.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.abel.beneficiart.dto.BeneficiartDto;
import com.spring.abel.member.dto.MemberDto;
import com.spring.abel.sponsor.dto.SponsorDto;

@Repository
public class SponsorDaoImpl implements SponsorDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertSponsor(SponsorDto sponsorDto) throws Exception {
		sqlSession.insert("sponsor.insertSponsor" , sponsorDto);
	}

	@Override
	public MemberDto selectOneSponsor(String memberId) throws Exception {
		return sqlSession.selectOne("sponsor.selectOneSponsor" , memberId);
	}

	@Override
	public BeneficiartDto selectOneMyPageBeneficiart(int beneficiartCd) throws Exception {
		return sqlSession.selectOne("sponsor.selectOneMyPageBeneficiart" , beneficiartCd);
	}

	@Override
	public void updateMemberPoint(Map<String, Object> sponsorMap) throws Exception {
		sqlSession.update("sponsor.updateMemberPoint" , sponsorMap);
	}

}
