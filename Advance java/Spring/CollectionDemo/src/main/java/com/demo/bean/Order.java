package com.demo.bean;

import java.util.List;

public class Order {
  private int ordid;
  private String cname;
  List <Product> plist;
public Order() {
	super();
}
public Order(int ordid, String cname, List<Product> plist) {
	super();
	this.ordid = ordid;
	this.cname = cname;
	this.plist = plist;
}
public int getOrdid() {
	return ordid;
}
public void setOrdid(int ordid) {
	this.ordid = ordid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public List<Product> getPlist() {
	return plist;
}
public void setPlist(List<Product> plist) {
	this.plist = plist;
}
@Override
public String toString() {
	return "Order [ordid=" + ordid + ", cname=" + cname + ", plist=" + plist + "]";
}

}
