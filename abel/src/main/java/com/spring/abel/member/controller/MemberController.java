package com.spring.abel.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
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
	public @ResponseBody String register (MultipartHttpServletRequest multipartRequest , HttpServletRequest request) throws Exception {
		
		MemberDto memberDto = new MemberDto();
		memberDto.setMemberId(multipartRequest.getParameter("memberId"));
		memberDto.setMemberPasswd(multipartRequest.getParameter("memberPasswd"));
		memberDto.setMemberNm(multipartRequest.getParameter("memberNm"));
		memberDto.setEmail(multipartRequest.getParameter("email"));
		memberDto.setEmailstsYn(multipartRequest.getParameter("emailstsYn"));
		memberDto.setDateBirth(multipartRequest.getParameter("dateBirth"));
		memberDto.setSex(multipartRequest.getParameter("sex"));
		memberDto.setHp(multipartRequest.getParameter("hp"));
		memberDto.setSmsstsYn(multipartRequest.getParameter("smsstsYn"));
		memberDto.setZipcode(multipartRequest.getParameter("zipcode"));
		memberDto.setRoadAddress(multipartRequest.getParameter("roadAddress"));
		memberDto.setJibunAddress(multipartRequest.getParameter("jibunAddress"));
		memberDto.setNamujiAddress(multipartRequest.getParameter("namujiAddress"));
		
		memberService.addMember(memberDto);
		
		String jsScript = "<script>";
			   jsScript += "alert('register success');";
			   jsScript += "location.href='" + request.getContextPath() + "/main'";
			   jsScript += "</script>";
			   
		return jsScript;
		
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.GET)
	public ModelAndView login() throws Exception{
		return new ModelAndView("member/login");
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public @ResponseBody String login (MemberDto memberDto , HttpServletRequest request) throws Exception{
		
		String message = "";
		if (memberService.login(memberDto) != null) {
			
			HttpSession session = request.getSession();
			session.setAttribute("memberId", memberDto.getMemberId());
			
			message = "<script>";
			message += "alert('login');";
			message += " location.href='" + request.getContextPath() + "/main';";
			message += " </script>";
		}
		else {
			message  = "<script>";
			message += " alert('login false');";
			message += " history.go(-1);";
			message += " </script>";
		}
		
		return message;
		
	}
	
	@RequestMapping(value="/logout" , method=RequestMethod.GET)
	public @ResponseBody String logout(HttpServletRequest request) throws Exception {
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		String message = "<script>";
			   message += "alert('logout.');";
			   message += "location.href='" + request.getContextPath() + "/main';";
			   message += "</script>";
 			   
		return message;
		
	}
	
	
	

}
