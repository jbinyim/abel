package com.spring.abel.common.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.abel.common.dto.CommonDto;

@Repository
public class CommonDaoImpl implements CommonDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insertContact(CommonDto commonDto) throws Exception {
		sqlSession.insert("common.insertContact" , commonDto);
	}

	@Override
	public List<CommonDto> selectListContact() throws Exception {
		return sqlSession.selectList("common.selectListContact");
	}

	@Override
	public CommonDto selectOneContact(int contactCd) throws Exception {
		return sqlSession.selectOne("common.selectOneContact" , contactCd);
	}
	
	

}
