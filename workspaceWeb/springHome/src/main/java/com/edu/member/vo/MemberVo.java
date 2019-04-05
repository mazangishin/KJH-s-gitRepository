package com.edu.member.vo;

import java.util.Date;

public class MemberVo {

	private int no;
	private String email;
	private String name;
	private String password;
	private Date createDate;
	private Date modifiedDate;
	
	public MemberVo() {
		
	}
	
	public MemberVo(int no, String email, String name, String password, 
			Date createDate, Date modifiedDate) {
		super();
		this.no = no;
		this.email = email;
		this.name = name;
		this.password = password;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", email=" + email + ", name=" + name + ", "
				+ "password=" + password + ", createDate="
				+ createDate + ", modifiedDate=" + modifiedDate + "]";
	}
	
}
