package com.spring.abel.admin.member.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class AdminMemberDto {
	
	private String adminId;
	private String passwd;
	private Date joinDt;
	
	public Date getJoinDt() {
		return joinDt;
	}
	public void setJoinDt(Date joinDt) {
		this.joinDt = joinDt;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getPassws() {
		return passwd;
	}
	public void setPassws(String passws) {
		this.passwd = passwd;
	}
	
	

}