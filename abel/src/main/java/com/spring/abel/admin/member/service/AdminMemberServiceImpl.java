package com.spring.abel.admin.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.abel.admin.member.dao.AdminMemberDao;
import com.spring.abel.admin.member.dto.AdminMemberDto;

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

}
