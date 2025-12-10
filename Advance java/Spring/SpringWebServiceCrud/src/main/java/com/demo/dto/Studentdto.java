package com.demo.dto;

import java.time.LocalDate;

public class Studentdto {
	
	private int sid;
	private String sname;
	private String address;
	private String email;
	private String ldtstr;
	
	 
	
	
	public Studentdto() {
		super();
	}




	public Studentdto(int sid, String sname, String address, String email, String ldtstr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		this.email = email;
		this.ldtstr = ldtstr;
	}
	
	
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLdtstr() {
		return ldtstr;
	}
	public void setLdtstr(String ldtstr) {
		this.ldtstr = ldtstr;
	}




	@Override
	public String toString() {
		return "Studentdto [sid=" + sid + ", sname=" + sname + ", address=" + address + ", email=" + email + ", ldtstr="
				+ ldtstr + "]";
	}
	
	
	
	
}
