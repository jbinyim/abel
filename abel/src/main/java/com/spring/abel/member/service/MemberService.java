package com.spring.abel.member.service;

import com.spring.abel.member.dto.MemberDto;

public interface MemberService {

	public void addMember(MemberDto memberDto) throws Exception;
	public MemberDto login(MemberDto memberDto) throws Exception;
	public int getMySponsorCnt(String memberId) throws Exception;

}
