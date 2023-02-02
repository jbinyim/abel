package com.spring.abel.myPage.service;

import java.util.List;
import java.util.Map;

import com.spring.abel.member.dto.MemberDto;

public interface MyPageService {
	
	public List<Map<String,Object>> getMySponsorList(String memberId) throws Exception;
	public MemberDto getMyInfo(String memberId) throws Exception;
	public void modifyMyInfo(MemberDto memberDto) throws Exception;
	public void removeMember(String memberId) throws Exception;

}
