package com.demo.beans;

public class Student {
	
	private int sid;
	private String sname;
	private int mark1;
	private int mark2;
	
	private Address addr;

	public Student() {
		super();
	}

	public Student(int sid, String sname, int mark1, int mark2, Address addr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.addr = addr;
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

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", mark1=" + mark1 + ", mark2=" + mark2 + ", addr=" + addr
				+ "]";
	}
	
	
	
}
