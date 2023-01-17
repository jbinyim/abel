package com.spring.abel.admin.member.dao;

import com.spring.abel.admin.member.dto.AdminMemberDto;

public interface AdminMemberDao {
	
	public AdminMemberDto selectAdminLogin(AdminMemberDto adminMemberDto) throws Exception;

}
