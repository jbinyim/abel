package com.spring.abel.admin.sponsor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.abel.admin.sponsor.dao.AdminSponsorDao;
import com.spring.abel.sponsor.dto.SponsorDto;

@Service
public class AdminSponsorServiceImpl implements AdminSponsorService {

	@Autowired
	private AdminSponsorDao adminSponsorDao;

	@Override
	public List<SponsorDto> getsponsorList() throws Exception {
		return adminSponsorDao.selectListSponsor();
	}
	
}
