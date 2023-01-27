package com.spring.abel.member.dto;

public class MemberDto {

	private String memberId;
	private String memberPasswd;
	private String memberNm;
	private String email;
	private String emailstsYn;
	private String dateBirth;
	private String sex;
	private String hp;
	private String smsstsYn;
	private String zipcode;
	private String roadAddress;
	private String jibunAddress;
	private String namujiAddress;
	private int point;
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPasswd() {
		return memberPasswd;
	}
	public void setMemberPasswd(String memberPasswd) {
		this.memberPasswd = memberPasswd;
	}
	public String getMemberNm() {
		return memberNm;
	}
	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailstsYn() {
		return emailstsYn;
	}
	public void setEmailstsYn(String emailstsYn) {
		this.emailstsYn = emailstsYn;
	}
	public String getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getSmsstsYn() {
		return smsstsYn;
	}
	public void setSmsstsYn(String smsstsYn) {
		this.smsstsYn = smsstsYn;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getRoadAddress() {
		return roadAddress;
	}
	public void setRoadAddress(String roadAddress) {
		this.roadAddress = roadAddress;
	}
	public String getJibunAddress() {
		return jibunAddress;
	}
	public void setJibunAddress(String jibunAddress) {
		this.jibunAddress = jibunAddress;
	}
	public String getNamujiAddress() {
		return namujiAddress;
	}
	public void setNamujiAddress(String namujiAddress) {
		this.namujiAddress = namujiAddress;
	}
	
	
	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", memberPasswd=" + memberPasswd + ", memberNm=" + memberNm
				+ ", email=" + email + ", emailstsYn=" + emailstsYn + ", dateBirth=" + dateBirth + ", sex=" + sex
				+ ", hp=" + hp + ", smsstsYn=" + smsstsYn + ", zipcode=" + zipcode + ", roadAddress=" + roadAddress
				+ ", jibunAddress=" + jibunAddress + ", namujiAddress=" + namujiAddress + "]";
	}
	
	
	
}
