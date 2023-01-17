package com.spring.abel.beneficiart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.abel.beneficiart.dto.BeneficiartDto;
import com.spring.abel.beneficiart.service.BeneficiartService;

@Controller
@RequestMapping("/beneficiart")
public class BeneficiartController {

	@Autowired
	private BeneficiartService beneficiartService;
	
	@RequestMapping(value="/beneficiartList" , method=RequestMethod.GET)
	public ModelAndView beneficiartList(@ModelAttribute BeneficiartDto beneficiartDto) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("beneficiart/beneficiartList");
		mv.addObject("beneficiartList", beneficiartService.getBeneficiartList(beneficiartDto));
		
		return mv;
		
	}
	
}
