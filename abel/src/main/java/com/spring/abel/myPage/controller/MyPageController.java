package com.spring.abel.myPage.controller;

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
import org.springframework.web.servlet.ModelAndView;

import com.spring.abel.member.dto.MemberDto;
import com.spring.abel.myPage.service.MyPageService;

@Controller
@RequestMapping("/myPage")
public class MyPageController {

	@Autowired
	private MyPageService myPageService;
	
	@RequestMapping(value="/myInfo" , method=RequestMethod.GET)
	public ModelAndView main(@RequestParam("memberId") String memberId) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("myPage/myInfo");
		mv.addObject("memberDto" , myPageService.getMyInfo(memberId));
		
		return mv;
		
	}
	
	@RequestMapping(value="/modifyInfo" , method=RequestMethod.POST)
	public ResponseEntity<Object> modifyInfo(MemberDto memberDto , HttpServletRequest request) throws Exception {
		
		myPageService.modifyMyInfo(memberDto);
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		String jsScript  = "<script>";
		jsScript += " alert('수정되었습니다.');";
		jsScript += " location.href='" + request.getContextPath() + "/myPage/myInfo?memberId=" + memberDto.getMemberId() +  "';";
		jsScript += " </script>";

		return new ResponseEntity<Object>(jsScript, responseHeaders, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/removeMember" , method=RequestMethod.GET)
	public ResponseEntity<Object> removeMember(HttpServletRequest request) throws Exception {
		
		HttpSession session = request.getSession();
		session.invalidate(); 
		
		myPageService.removeMember(request.getParameter("memberId"));
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		String jsScript  = "<script>";
				jsScript += "alert('탈퇴되었습니다.');";
				jsScript += "location.href='" + request.getContextPath() + "/main';";
				jsScript += "</script>";
		
		return new ResponseEntity<Object>(jsScript, responseHeaders, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/mySponsorList" , method=RequestMethod.GET)
	public ModelAndView mySponsorList(HttpServletRequest request) throws Exception {
		
		HttpSession session = request.getSession();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("myPage/mySponsorList");
		mv.addObject("mySponsorList" , myPageService.getMySponsorList((String)session.getAttribute("memberId")));
		
		
		return mv;
		
	}
	
}
