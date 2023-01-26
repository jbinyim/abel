package com.spring.abel.sponsor.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.abel.beneficiart.dto.BeneficiartDto;
import com.spring.abel.member.dto.MemberDto;
import com.spring.abel.sponsor.dao.SponsorDao;
import com.spring.abel.sponsor.dto.SponsorDto;

@Service
public class SponsorServiceImpl implements SponsorService{
	
	@Autowired
	private SponsorDao sponsorDao;

	
	@Override
	@Transactional
	public void addSponsor(SponsorDto sponsorDto , int point) throws Exception {
		Map<String, Object> sponsorMap = new HashMap<String, Object>();
		sponsorMap.put("point" , point);
		sponsorMap.put("beneficiartCd" , sponsorDto.getBeneficiartCd());
		sponsorMap.put("memberId" , sponsorDto.getMemberId());
		
		sponsorDao.updateMemberPoint(sponsorMap);
		sponsorDao.insertSponsor(sponsorDto);
	}

	@Override
	public MemberDto getSponsorDetail(String memberId) throws Exception {
		return sponsorDao.selectOneSponsor(memberId);
	}

	@Override
	public BeneficiartDto getBeneficiartDetail(int beneficiartCd) throws Exception {
		return sponsorDao.selectOneMyPageBeneficiart(beneficiartCd);
	}

}
