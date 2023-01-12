package com.spring.abel.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.abel.member.dao.MemberDao;
import com.spring.abel.member.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void addMember(MemberDto memberDto) throws Exception {
		memberDto.setMemberPasswd(bCryptPasswordEncoder.encode(memberDto.getMemberPasswd()));
		if (memberDto.getEmailstsYn() == null) memberDto.setEmailstsYn("N");
		if (memberDto.getSmsstsYn() == null) memberDto.setSmsstsYn("N");
		memberDao.insertMember(memberDto);
	}

	@Override
	public String checkDuplicatedId(String memberId) throws Exception {
		
		if (memberDao.selectDuplicatedId(memberId) == null) return "duplicate";
		else 												return "noDuplicate";
	}

	@Override
	public boolean login(MemberDto memberDto) throws Exception {
		MemberDto checkExsisId = memberDao.selectLogin(memberDto);
		if (checkExsisId != null) {
			if (bCryptPasswordEncoder.matches(memberDto.getMemberPasswd() , checkExsisId.getMemberPasswd())) {
				return true;
			}
		}
		return false;
	}
	
		
		

}
