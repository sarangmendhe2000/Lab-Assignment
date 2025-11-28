package com.demo.beans;

public class Product {
	
	private int pid;
	private String desc;
	private double price;
	
	
	public Product() {
		super();
	}


	public Product(int pid, String desc, double price) {
		super();
		this.pid = pid;
		this.desc = desc;
		this.price = price;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", desc=" + desc + ", price=" + price + "]";
	}
	
	
	
}
