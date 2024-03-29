package com.spring.abel.sponsor.controller;

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

import com.spring.abel.member.service.MemberService;
import com.spring.abel.sponsor.dto.SponsorDto;
import com.spring.abel.sponsor.service.SponsorService;

@Controller
@RequestMapping("/sponsor")
public class SponsorController {

	@Autowired
	private SponsorService sponsorService;
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/sponsorBeneficiart" , method=RequestMethod.GET)
	public ModelAndView sponsorBeneficiart(@RequestParam("beneficiartCd") int beneficiartCd , HttpServletRequest request) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sponsor/sponsorBeneficiart");
		HttpSession session = request.getSession();
		
		mv.addObject("sponsor", sponsorService.getSponsorDetail((String)session.getAttribute("memberId")));
		mv.addObject("beneficiartDto", sponsorService.getBeneficiartDetail(beneficiartCd));
		
		return mv;
		
	}
	
	@RequestMapping(value="/sponsorBeneficiart" , method=RequestMethod.POST)
	public ResponseEntity<Object> sponsorBeneficiart(SponsorDto sponsorDto , HttpServletRequest request) throws Exception{
		
		sponsorService.addSponsor(sponsorDto);
		
		
		String jsScript= "<script>";
		jsScript += " alert('후원해주셔서 감사합니다.');";
		jsScript += " location.href='" + request.getContextPath() + "/beneficiart/beneficiartList';";
		jsScript +="</script>";
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
			
		return new ResponseEntity<Object>(jsScript, responseHeaders, HttpStatus.OK);
		
	}
	
}
