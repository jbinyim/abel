package com.spring.abel.admin.sponsor.dao;

import java.util.List;

import com.spring.abel.sponsor.dto.SponsorDto;

public interface AdminSponsorDao {
	
	public List<SponsorDto> selectListSponsor() throws Exception;

}
