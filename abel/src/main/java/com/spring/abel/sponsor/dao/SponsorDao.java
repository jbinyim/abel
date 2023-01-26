package com.spring.abel.sponsor.dao;

import java.util.Map;

import com.spring.abel.beneficiart.dto.BeneficiartDto;
import com.spring.abel.member.dto.MemberDto;
import com.spring.abel.sponsor.dto.SponsorDto;

public interface SponsorDao {
	
	public void insertSponsor(SponsorDto sponsorDto) throws Exception;
	public MemberDto selectOneSponsor(String memberId) throws Exception;
	public BeneficiartDto selectOneMyPageBeneficiart(int beneficiartCd) throws Exception;
	public void updateMemberPoint(Map<String,Object> sponsorMap) throws Exception;

}
