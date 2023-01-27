package com.spring.abel.sponsor.dto;

import org.springframework.stereotype.Component;

@Component
public class SponsorDto {
	
	private long sponsorCd;
	private String memberId;
	private int beneficiartCd;
	private String beneficiartNm;
	private int sponsorAmount;
	private String paymentMethod;
	private String cardCompany;
	private String sponsorShipMessage;
	private String sponsorHp;
	private String payHp;
	private String sponsorNm;
	private int sponsorBeneficiartQty;
	
	
	public int getSponsorBeneficiartQty() {
		return sponsorBeneficiartQty;
	}
	public void setSponsorBeneficiartQty(int sponsorBeneficiartQty) {
		this.sponsorBeneficiartQty = sponsorBeneficiartQty;
	}
	public String getSponsorHp() {
		return sponsorHp;
	}
	public void setSponsorHp(String sponsorHp) {
		this.sponsorHp = sponsorHp;
	}
	public String getPayHp() {
		return payHp;
	}
	public void setPayHp(String payHp) {
		this.payHp = payHp;
	}
	public String getSponsorNm() {
		return sponsorNm;
	}
	public void setSponsorNm(String sponsorNm) {
		this.sponsorNm = sponsorNm;
	}
	public long getSponsorCd() {
		return sponsorCd;
	}
	public void setSponsorCd(long sponsorCd) {
		this.sponsorCd = sponsorCd;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	public int getSponsorAmount() {
		return sponsorAmount;
	}
	public void setSponsorAmount(int sponsorAmount) {
		this.sponsorAmount = sponsorAmount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getCardCompany() {
		return cardCompany;
	}
	public void setCardCompany(String cardCompany) {
		this.cardCompany = cardCompany;
	}
	public String getSponsorShipMessage() {
		return sponsorShipMessage;
	}
	public void setSponsorShipMessage(String sponsorShipMessage) {
		this.sponsorShipMessage = sponsorShipMessage;
	}
	
	@Override
	public String toString() {
		return "SponsorDto [sponsorCd=" + sponsorCd + ", memberId=" + memberId + ", beneficiartCd=" + beneficiartCd
				+ ", beneficiartNm=" + beneficiartNm + ", sponsorAmount=" + sponsorAmount + ", paymentMethod="
				+ paymentMethod + ", cardCompany=" + cardCompany + ", sponsorShipMessage=" + sponsorShipMessage + "]";
	}
	
	
	
	

}
