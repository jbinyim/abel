package com.spring.abel.admin.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.abel.admin.member.dao.AdminMemberDao;
import com.spring.abel.admin.member.dto.AdminMemberDto;
import com.spring.abel.member.dto.MemberDto;

@Service
public class AdminMemberServiceImpl implements AdminMemberService{

	@Autowired
	private AdminMemberDao adminMemberDao;
	
	@Override
	public boolean adminLogin(AdminMemberDto adminMemberDto) throws Exception {
		
		if(adminMemberDao.selectAdminLogin(adminMemberDto) != null) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<MemberDto> getMemberList() throws Exception {
		return adminMemberDao.selectListMember();
	}

}
