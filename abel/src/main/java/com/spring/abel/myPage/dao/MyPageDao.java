package com.spring.abel.myPage.dao;

import java.util.List;
import java.util.Map;

import com.spring.abel.member.dto.MemberDto;

public interface MyPageDao {
	
	public List<Map<String,Object>> selectListMySponsor(String memberId) throws Exception;
	public MemberDto selectOneMyInfo(String memberId) throws Exception;
	public void updateMyInfo(MemberDto memberDto) throws Exception;
	public void deleteMember(String memberId) throws Exception;

}
