package com.spring.abel.admin.member.service;

import com.spring.abel.admin.member.dto.AdminMemberDto;

public interface AdminMemberService {
	
	public boolean adminLogin(AdminMemberDto adminMemberDto) throws Exception;

}
