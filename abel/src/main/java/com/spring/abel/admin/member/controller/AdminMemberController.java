package com.spring.abel.admin.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.abel.admin.member.dto.AdminMemberDto;
import com.spring.abel.admin.member.service.AdminMemberService;

@Controller
@RequestMapping("/admin/member")
public class AdminMemberController {

	@Autowired
	private AdminMemberService adminMemberService;
	
	@RequestMapping(value="/adminLogin" , method=RequestMethod.GET)
	public ModelAndView adminLogin() throws Exception {
		return new ModelAndView("admin/member/adminLogin");
	}
	
	@RequestMapping(value="/adminLogin" , method=RequestMethod.POST)
	public ResponseEntity<Object> login(AdminMemberDto adminMemberDto, HttpServletRequest request) throws Exception {
		
		String jsScript = "";
		
		if(adminMemberService.adminLogin(adminMemberDto)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("memberId", adminMemberDto.getAdminId());
			session.setAttribute("role", "admin");
			session.setMaxInactiveInterval(60 * 30);
			jsScript  = "<script>";
			jsScript += " alert('로그인 되었습니다.');";
			jsScript += " location.href='" + request.getContextPath() + "/main';";
			jsScript += " </script>";
			
		}
		
		else { 
					
			jsScript  = "<script>";
			jsScript += " alert('로그인에 실패하였습니다. 아이디와 비밀번호를 확인하세요.');";
			jsScript += " history.go(-1);";
			jsScript += " </script>";
					
		}
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		return new ResponseEntity<Object>(jsScript, responseHeaders, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/adminMemberList" , method=RequestMethod.GET)
	public ModelAndView adminMemberList(HttpServletRequest request) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/member/adminMemberList");
		HttpSession session = request.getSession();
		session.setAttribute("sideMenu", "adminMode");
		mv.addObject("memberList"  , adminMemberService.getMemberList());
		
		return mv;
		
	}
	
}
