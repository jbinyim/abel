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
	public MemberDto login(MemberDto memberDto) throws Exception {
		MemberDto dbMemberDto = memberDao.selectLogin(memberDto);
		if (dbMemberDto != null) {
			if (bCryptPasswordEncoder.matches(memberDto.getMemberPasswd(), dbMemberDto.getMemberPasswd())) {
				return memberDto;
			} 
		}
		return null;
	}
	
		
		

}
