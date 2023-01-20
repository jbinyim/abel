package com.spring.abel.beneficiart.dto;

import org.springframework.stereotype.Component;

@Component
public class BeneficiartDto {
	
	private int beneficiartCd;
	private String beneficiartNm;
	private String beneficiartComment;
	private int contribution;
	private String beneficiartBirth;
	private String beneficiartSex;
	private String beneficiartHobby;
	private String beneficiartFamily;
	private String beneficiartCountry;
	private String beneficiartFileName;
	
	public String getBeneficiartFileName() {
		return beneficiartFileName;
	}
	public void setBeneficiartFileName(String beneficiartFileName) {
		this.beneficiartFileName = beneficiartFileName;
	}
	public int getBeneficiartCd() {
		return beneficiartCd;
	}
	public void setBeneficiartCd(int beneficiartCd) {
		this.beneficiartCd = beneficiartCd;
	}
	public String getBeneficiartNm() {
		return beneficiartNm;
	}
	public void setBeneficiartNm(String beneficiartNm) {
		this.beneficiartNm = beneficiartNm;
	}
	public String getBeneficiartComment() {
		return beneficiartComment;
	}
	public void setBeneficiartComment(String beneficiartComment) {
		this.beneficiartComment = beneficiartComment;
	}
	public int getContribution() {
		return contribution;
	}
	public void setContribution(int contribution) {
		this.contribution = contribution;
	}
	public String getBeneficiartBirth() {
		return beneficiartBirth;
	}
	public void setBeneficiartBirth(String beneficiartBirth) {
		this.beneficiartBirth = beneficiartBirth;
	}
	public String getBeneficiartSex() {
		return beneficiartSex;
	}
	public void setBeneficiartSex(String beneficiartSex) {
		this.beneficiartSex = beneficiartSex;
	}
	public String getBeneficiartHobby() {
		return beneficiartHobby;
	}
	public void setBeneficiartHobby(String beneficiartHobby) {
		this.beneficiartHobby = beneficiartHobby;
	}
	public String getBeneficiartFamily() {
		return beneficiartFamily;
	}
	public void setBeneficiartFamily(String beneficiartFamily) {
		this.beneficiartFamily = beneficiartFamily;
	}
	public String getBeneficiartCountry() {
		return beneficiartCountry;
	}
	public void setBeneficiartCountry(String beneficiartCountry) {
		this.beneficiartCountry = beneficiartCountry;
	}
	
	@Override
	public String toString() {
		return "BeneficiartDto [beneficiartCd=" + beneficiartCd + ", beneficiartNm=" + beneficiartNm
				+ ", beneficiartComment=" + beneficiartComment + ", contribution=" + contribution
				+ ", beneficiartBirth=" + beneficiartBirth + ", beneficiartSex=" + beneficiartSex
				+ ", beneficiartHobby=" + beneficiartHobby + ", beneficiartFamily=" + beneficiartFamily
				+ ", beneficiartCountry=" + beneficiartCountry + ", beneficiartFileName=" + beneficiartFileName + "]";
	}
	
	

}
