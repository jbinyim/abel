package com.spring.abel.common.dto;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class CommonDto {

	private int contactCd;
	private String name;
	private String email;
	private String subject;
	private String content;
	private Date regDt;
	
	public int getContactCd() {
		return contactCd;
	}
	public void setContactCd(int contactCd) {
		this.contactCd = contactCd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDt() {
		return regDt;
	}
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}
	
	@Override
	public String toString() {
		return "CommonDto [contactCd=" + contactCd + ", name=" + name + ", email=" + email + ", subject=" + subject
				+ ", content=" + content + ", regDt=" + regDt + "]";
	}
	
	
	
	
}
