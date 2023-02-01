package com.spring.abel.myPage.dto;

import org.springframework.stereotype.Component;

@Component
public class MyPageDto {
	
	private long cartCd;
	private String memberId;
	private int beneficiartCd;
	
	
	public long getCartCd() {
		return cartCd;
	}
	public void setCartCd(long cartCd) {
		this.cartCd = cartCd;
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
	
	

}
