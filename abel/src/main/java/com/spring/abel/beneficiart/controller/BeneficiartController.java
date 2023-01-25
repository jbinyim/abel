package com.spring.abel.beneficiart.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.abel.beneficiart.service.BeneficiartService;

@Controller
@RequestMapping("/beneficiart")
public class BeneficiartController {

	@Autowired
	private BeneficiartService beneficiartService;
	
	@RequestMapping(value="/beneficiartList" , method=RequestMethod.GET)
	public ModelAndView beneficiartList(@RequestParam Map<String,String> beneficiartMap) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("beneficiart/beneficiartList");
		mv.addObject("beneficiartList", beneficiartService.getBeneficiartList(beneficiartMap));
		
		return mv;
		
	}
	
	@RequestMapping(value="/beneficiartMore" , method=RequestMethod.GET)
	public ModelAndView beneficiartMore(@RequestParam("beneficiartCd") int beneficiartCd) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("beneficiart/beneficiartMore");
		mv.addObject("beneficiartDto", beneficiartService.getBeneficiartDetail(beneficiartCd));
		
		
		return mv;
		
	}
	
}
