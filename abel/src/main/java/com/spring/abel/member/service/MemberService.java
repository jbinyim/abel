package com.spring.abel.member.service;

import com.spring.abel.member.dto.MemberDto;

public interface MemberService {

	public void addMember(MemberDto memberDto) throws Exception;
	public String checkDuplicatedId(String memberId) throws Exception;

}
