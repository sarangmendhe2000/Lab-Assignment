package com.demo.beans;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="myTable3")
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS )



public class Product {
	@Id
	private int pid;
	private String pname;
	private int Qty;
	private double price;
	
	
	public Product() {
		super();
	}
	
	
	public Product(int pid, String pname, int qty, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		Qty = qty;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", Qty=" + Qty + ", price=" + price + "]";
	}
	

}
