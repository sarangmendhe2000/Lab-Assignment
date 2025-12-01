package com.demo.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="cart11")
public class Cart {
	
	@Id
    private int cid;
    
	@ManyToMany(mappedBy="cart" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	
    List<Item> list;

	public Cart() {
		super();
	}
	
	

	public Cart(int cid) {
		super();
		this.cid = cid;
	}



	public Cart(int cid, List<Item> list) {
		super();
		this.cid = cid;
		this.list = list;
	}
 
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public List<Item> getList() {
		return list;
	}

	public void setList(List<Item> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", list=" + list + "]";
	}
    
}
