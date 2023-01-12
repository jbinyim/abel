package com.spring.abel.member.dao;

import com.spring.abel.member.dto.MemberDto;

public interface MemberDao {
	
	public void insertMember(MemberDto memberDto) throws Exception;
	public String selectDuplicatedId(String memberId) throws Exception;
	public MemberDto selectLogin(MemberDto memberDto) throws Exception;

}
