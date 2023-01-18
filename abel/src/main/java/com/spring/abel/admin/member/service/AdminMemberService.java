package com.spring.abel.admin.member.service;

import java.util.List;

import com.spring.abel.admin.member.dto.AdminMemberDto;
import com.spring.abel.member.dto.MemberDto;

public interface AdminMemberService {
	
	public boolean adminLogin(AdminMemberDto adminMemberDto) throws Exception;
	public List<MemberDto> getMemberList() throws Exception;

}
