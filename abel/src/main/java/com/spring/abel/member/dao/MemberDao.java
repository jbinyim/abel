package com.spring.abel.member.dao;

import com.spring.abel.member.dto.MemberDto;

public interface MemberDao {
	
	public void insertMember(MemberDto memberDto) throws Exception;
	public MemberDto selectLogin(MemberDto memberDto) throws Exception;
	public int selectMyOrderCnt(String memberId) throws Exception;

}
