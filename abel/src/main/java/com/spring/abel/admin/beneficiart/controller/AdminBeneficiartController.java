package com.spring.abel.admin.beneficiart.controller;

import java.io.File;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.spring.abel.admin.beneficiart.service.AdminBeneficiartService;
import com.spring.abel.beneficiart.dto.BeneficiartDto;
import com.spring.abel.beneficiart.service.BeneficiartService;

import net.coobird.thumbnailator.Thumbnails;
@Controller
@RequestMapping("/admin/beneficiart")
public class AdminBeneficiartController {
	
	@Autowired
	private AdminBeneficiartService adminBeneficiartService;
	
	@Autowired
	private BeneficiartService beneficiartService;
	
	private final String CURR_IMAGE_REPO_PATH = "C:\\file_repo";
	private final String SEPERATOR = "\\";
	
	//private final String CURR_IMAGE_REPO_PATH = "/var/lib/tomcat9/file_repo";
	//private final String SEPERATOR = "/";											// linux
	
	@RequestMapping(value="/adminBeneficiartList" , method=RequestMethod.GET)
	public ModelAndView adminBeneficiartList() throws Exception {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/beneficiart/adminBeneficiartList");
		mv.addObject("adminBeneficiartList", adminBeneficiartService.getBeneficiartList());
		return mv;
	}
	
	
	@RequestMapping(value="/adminBeneficiartAdd" , method=RequestMethod.GET)
	public ModelAndView addNewBeneficiart() {
		return new ModelAndView("admin/beneficiart/adminBeneficiartAdd");
	}
	
	@RequestMapping(value="/adminBeneficiartAdd" , method=RequestMethod.POST)
	public ResponseEntity<Object> addNewBeneficiart(MultipartHttpServletRequest multipartRequest) throws Exception{
		
		multipartRequest.setCharacterEncoding("utf-8");
		BeneficiartDto beneficiartDto = new BeneficiartDto();
		beneficiartDto.setBeneficiartCd(Integer.parseInt(multipartRequest.getParameter("beneficiartCd")));
		beneficiartDto.setBeneficiartNm(multipartRequest.getParameter("beneficiartNm"));
		beneficiartDto.setBeneficiartComment(multipartRequest.getParameter("beneficiartComment"));
		beneficiartDto.setContribution(Integer.parseInt(multipartRequest.getParameter("contribution")));
		beneficiartDto.setBeneficiartBirth(multipartRequest.getParameter("beneficiartBirth"));
		beneficiartDto.setBeneficiartSex(multipartRequest.getParameter("beneficiartSex"));
		beneficiartDto.setBeneficiartHobby(multipartRequest.getParameter("beneficiartHobby"));
		beneficiartDto.setBeneficiartFamily(multipartRequest.getParameter("beneficiartFamily"));
		beneficiartDto.setBeneficiartCountry(multipartRequest.getParameter("beneficiartCountry"));
		
		Iterator<String> file = multipartRequest.getFileNames();
		if (file.hasNext()) {
			
			MultipartFile uploadFile = multipartRequest.getFile(file.next());
			
			if(!uploadFile.getOriginalFilename().isEmpty()) {
				String uploadFileName = UUID.randomUUID() + "_" + uploadFile.getOriginalFilename();
				File f = new File(CURR_IMAGE_REPO_PATH + SEPERATOR + uploadFileName);
				uploadFile.transferTo(f);
				beneficiartDto.setBeneficiartFileName(uploadFileName);
			}
			
		}
		
		adminBeneficiartService.addNewBeneficiart(beneficiartDto);
		
		String jsScript= "<script>";
		   jsScript += " alert('수혜자 등록하였습니다.');";
		   jsScript +=" location.href='adminBeneficiartList';";
		   jsScript +="</script>";
		   
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		return new ResponseEntity<Object>(jsScript, responseHeaders, HttpStatus.OK);
		
	}
	
	
	// 썸네일 컨트롤러 : 이미지 파일을 읽어들여서 화면에 출력한다.
	@RequestMapping(value="/thumbnails" , method=RequestMethod.GET)
	public void thumbnails(@RequestParam("beneficiartFileName") String beneficiartFileName , HttpServletResponse response) throws Exception {
	
		OutputStream out = response.getOutputStream();
		String filePath = CURR_IMAGE_REPO_PATH + SEPERATOR + beneficiartFileName;
		
		File image = new File(filePath);
		if (image.exists()) { 
			Thumbnails.of(image).size(800,800).outputFormat("png").toOutputStream(out);
		}
		byte[] buffer = new byte[1024 * 8];
		out.write(buffer);
		out.close();
	}
	

}
