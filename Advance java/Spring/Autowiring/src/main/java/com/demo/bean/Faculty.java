package com.demo.bean;

public class Faculty {
	
	private int facid;
	private String facName;
	
	private Skill skl;
	private Address addr;
	public Faculty() {
		super();
	}
	public Faculty(int facid, String facName, Skill skl, Address addr) {
		super();
		this.facid = facid;
		this.facName = facName;
		this.skl = skl;
		this.addr = addr;
	}
	public int getFacid() {
		return facid;
	}
	public void setFacid(int facid) {
		this.facid = facid;
	}
	public String getFacName() {
		return facName;
	}
	public void setFacName(String facName) {
		this.facName = facName;
	}
	public Skill getSkl() {
		return skl;
	}
	public void setSkl(Skill skl) {
		this.skl = skl;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Faculty [facid=" + facid + ", facName=" + facName + ", skl=" + skl + ", addr=" + addr + "]";
	}
	
	

}
