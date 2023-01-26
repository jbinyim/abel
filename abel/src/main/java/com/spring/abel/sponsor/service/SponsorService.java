package com.spring.abel.sponsor.service;

import com.spring.abel.beneficiart.dto.BeneficiartDto;
import com.spring.abel.member.dto.MemberDto;
import com.spring.abel.sponsor.dto.SponsorDto;

public interface SponsorService {
	
	public void addSponsor(SponsorDto sponsorDto , int point) throws Exception;
	public MemberDto getSponsorDetail(String memberId) throws Exception;
	public BeneficiartDto getBeneficiartDetail(int beneficiartCd) throws Exception;
	

}
