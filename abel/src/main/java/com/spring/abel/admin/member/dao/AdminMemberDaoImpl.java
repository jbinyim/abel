package com.spring.abel.admin.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.abel.admin.member.dto.AdminMemberDto;
import com.spring.abel.member.dto.MemberDto;

@Repository
public class AdminMemberDaoImpl implements AdminMemberDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public AdminMemberDto selectAdminLogin(AdminMemberDto adminMemberDto) throws Exception {
		return sqlSession.selectOne("admin.member.selectAdminLogin" , adminMemberDto);
	}

	@Override
	public List<MemberDto> selectListMember() throws Exception {
		return sqlSession.selectList("admin.member.selectListMember");
	}

}
