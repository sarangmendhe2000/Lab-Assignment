package com.demo.beans;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Item11")
public class Item {
	@Id
	private int iid;
	private String iname;
	private double iprice;
	private LocalDate mgf;
	@ManyToMany
	List<Cart> cart;
	public Item() {
		super();
	}
	public Item(int iid, String iname, double iprice, LocalDate mgf) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.iprice = iprice;
		this.mgf = mgf;
	}
	
	
	public Item(int iid, String iname, double iprice, LocalDate mgf, List<Cart> cart) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.iprice = iprice;
		this.mgf = mgf;
		this.cart = cart;
	}

	public List<Cart> getCart() {
		return cart;
	}
	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public double getIprice() {
		return iprice;
	}
	public void setIprice(double iprice) {
		this.iprice = iprice;
	}
	public LocalDate getMgf() {
		return mgf;
	}
	public void setMgf(LocalDate mgf) {
		this.mgf = mgf;
	}
	@Override
	public String toString() {
		return "Item [iid=" + iid + ", iname=" + iname + ", iprice=" + iprice + ", mgf=" + mgf + "]";
	}
	

}
