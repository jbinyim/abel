package com.spring.abel.admin.member.dao;

import java.util.List;

import com.spring.abel.admin.member.dto.AdminMemberDto;
import com.spring.abel.member.dto.MemberDto;

public interface AdminMemberDao {
	
	public AdminMemberDto selectAdminLogin(AdminMemberDto adminMemberDto) throws Exception;
	public List<MemberDto> selectListMember() throws Exception;

}
