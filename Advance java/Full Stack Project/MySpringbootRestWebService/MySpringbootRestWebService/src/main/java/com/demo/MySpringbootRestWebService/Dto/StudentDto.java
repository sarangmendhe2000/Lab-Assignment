package com.demo.MySpringbootRestWebService.Dto;

public class StudentDto {
	
	private int sid;
	private String name;
	private String address;
	private String email;
	
	private String ldtstr;

	public StudentDto() {
		super();
	}

	public StudentDto(int sid, String name, String address, String email, String ldtstr) {
		super();
		this.sid = sid;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "StudentDto [sid=" + sid + ", name=" + name + ", address=" + address + ", email=" + email + ", ldtstr="
				+ ldtstr + "]";
	}

	
	
	
	
	
}
