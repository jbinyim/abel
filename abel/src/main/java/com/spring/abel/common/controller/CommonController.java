package com.spring.abel.common.controller;

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

import com.spring.abel.common.dto.CommonDto;
import com.spring.abel.common.service.CommonService;

@Controller
public class CommonController {
	
	@Autowired
	private CommonService commonService;
	
	@RequestMapping(value="/contact" , method=RequestMethod.GET)
	public ModelAndView contact() throws Exception {
		return new ModelAndView("contact");
	}
	
	@RequestMapping(value="/contact" , method=RequestMethod.POST)
	public ResponseEntity<Object> contact(CommonDto commonDto , HttpServletRequest request) throws Exception {
		
		commonService.addNewContact(commonDto);
		String jsScript  = "<script>";
			   jsScript += " alert('컨텍트 정보가 등록 되었습니다.');";
			   jsScript += " location.href='" + request.getContextPath() + "/';";
			   jsScript += " </script>";
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		return new ResponseEntity<Object>(jsScript, responseHeaders, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/contactList" , method=RequestMethod.GET)
	public ModelAndView contactList() throws Exception{
		
		ModelAndView mv = new ModelAndView("common/contactList");
		mv.setViewName("contactList");
		mv.addObject("contactList", commonService.getContactList());
		
		return mv;
	}
	
	@RequestMapping(value="/contactDetail" , method=RequestMethod.GET)
	public ModelAndView contactDetail(@RequestParam("contactCd") int contactCd) throws Exception{
		ModelAndView mv = new ModelAndView("common/contactList");
		mv.setViewName("contactDetail");
		mv.addObject("commonDto", commonService.getContactDetail(contactCd));
		
		return mv;
	}
	
}
