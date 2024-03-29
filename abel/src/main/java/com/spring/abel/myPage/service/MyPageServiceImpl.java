package com.spring.abel.myPage.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.abel.member.dto.MemberDto;
import com.spring.abel.myPage.dao.MyPageDao;

@Service
public class MyPageServiceImpl implements MyPageService {

	@Autowired
	private MyPageDao myPageDao;
	
	@Override
	public MemberDto getMyInfo(String memberId) throws Exception {
		return myPageDao.selectOneMyInfo(memberId);
	}

	@Override
	public void modifyMyInfo(MemberDto memberDto) throws Exception {
		if (memberDto.getSmsstsYn() == null) memberDto.setSmsstsYn("N"); 
		if (memberDto.getEmailstsYn() == null) memberDto.setEmailstsYn("N");
		myPageDao.updateMyInfo(memberDto);
	}

	@Override
	public void removeMember(String memberId) throws Exception {
		myPageDao.deleteMember(memberId);
	}

	@Override
	public List<Map<String, Object>> getMySponsorList(String memberId) throws Exception {
		return myPageDao.selectListMySponsor(memberId);
	}

}
