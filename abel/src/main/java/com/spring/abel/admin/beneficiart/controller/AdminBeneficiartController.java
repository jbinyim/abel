package com.spring.abel.admin.beneficiart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.spring.abel.admin.beneficiart.service.AdminBeneficiartService;
import com.spring.abel.beneficiart.dto.BeneficiartDto;
import com.spring.abel.beneficiart.service.BeneficiartService;
@Controller
@RequestMapping("/admin/beneficiart")
public class AdminBeneficiartController {
	
	@Autowired
	private AdminBeneficiartService adminBeneficiartService;
	
	@Autowired
	private BeneficiartService beneficiartService;
	
	@RequestMapping(value="/adminBeneficiartAdd" , method=RequestMethod.GET)
	public ModelAndView addNewBeneficiart() {
		return new ModelAndView("admin/beneficiart/adminBeneficiartAdd");
	}
	
//	@RequestMapping(value="/adminBeneficiartAdd" , method=RequestMethod.POST)
//	public ResponseEntity<Object> addNewBeneficiart(MultipartHttpServletRequest multipartRequest) throws Exception{
//		
//		multipartRequest.setCharacterEncoding("utf-8");
//		BeneficiartDto beneficiartDto = new BeneficiartDto();
//		
//		
//	}

}
