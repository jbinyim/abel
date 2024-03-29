package com.spring.abel.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.abel.member.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertMember(MemberDto memberDto) throws Exception {
		sqlSession.insert("member.insertMember" , memberDto);
	}


	@Override
	public MemberDto selectLogin(MemberDto memberDto) throws Exception {
		return sqlSession.selectOne("member.selectLogin" , memberDto);
	}




}
