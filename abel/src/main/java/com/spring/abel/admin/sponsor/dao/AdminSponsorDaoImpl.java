package com.spring.abel.admin.sponsor.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.abel.sponsor.dto.SponsorDto;

@Repository
public class AdminSponsorDaoImpl implements AdminSponsorDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<SponsorDto> selectListSponsor() throws Exception {
		return sqlSession.selectList("admin.sponsor.selectListSponsor");
	}
	
}
