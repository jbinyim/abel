package com.spring.abel.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.abel.member.dto.MemberDto;
import com.spring.abel.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/register" , method=RequestMethod.GET)
	public ModelAndView register() throws Exception{
		return new ModelAndView("member/register");
	}
	
	@RequestMapping(value="/register" , method=RequestMethod.POST)
	public ResponseEntity<Object> register(MemberDto memberDto , HttpServletRequest request) throws Exception {
		
		memberService.addMember(memberDto);
		
		String message = "<script>";
			   message += "alert('회원가입되었습니다.');";
			   message += "location.href='" + request.getContextPath() + "/';";
			   message += "</script>";
			   
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		return new ResponseEntity<Object>(message, responseHeaders, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/checkDuplicatedId" , method=RequestMethod.GET)
	public ResponseEntity<String> overlapped(@RequestParam("memberId") String memberId) throws Exception {
		return new ResponseEntity<String>(memberService.checkDuplicatedId(memberId) , HttpStatus.OK);
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public ModelAndView login() throws Exception{
		return new ModelAndView("member/login");
	}
	
	

}
