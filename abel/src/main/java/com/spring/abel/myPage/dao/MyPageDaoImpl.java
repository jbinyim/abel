package com.spring.abel.myPage.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.abel.member.dto.MemberDto;

@Repository
public class MyPageDaoImpl implements MyPageDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public MemberDto selectOneMyInfo(String memberId) throws Exception {
		return sqlSession.selectOne("myPage.selectOneMyInfo" , memberId);
	}

	@Override
	public void updateMyInfo(MemberDto memberDto) throws Exception {
		sqlSession.update("myPage.updateMyInfo" , memberDto);
	}

	@Override
	public void deleteMember(String memberId) throws Exception {
		sqlSession.delete("myPage.deleteMember" , memberId);
	}

	@Override
	public List<Map<String, Object>> selectListMySponsor(String memberId) throws Exception {
		return sqlSession.selectList("myPage.selectListMySponsor" , memberId);
	}

}
