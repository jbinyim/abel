package com.spring.abel.admin.sponsor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.abel.admin.sponsor.service.AdminSponsorService;

@Controller
@RequestMapping("/admin/sponsor")
public class AdminSponsorController {

	@Autowired
	private AdminSponsorService adminSponsorService;
	
	@RequestMapping(value="/adminSponsorList" , method=RequestMethod.GET)
	public ModelAndView adminSponsorList() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/sponsor/adminSponsorList");
		mv.addObject("sponsorList", adminSponsorService.getsponsorList());
		
		return mv;
		
	}
	
	
}
