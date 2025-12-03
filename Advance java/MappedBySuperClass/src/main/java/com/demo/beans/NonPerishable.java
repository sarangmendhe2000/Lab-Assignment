package com.demo.beans;


import javax.persistence.Entity;


@Entity

public class NonPerishable extends Product{
  private int guarantee;

public NonPerishable() {
	super();
}

public NonPerishable(int pid , String pname , int Qty , double price, int guarantee) {
	super(pid , pname , Qty , price);
	this.guarantee = guarantee;
}

public int getGuarantee() {
	return guarantee;
}

public void setGuarantee(int guarantee) {
	this.guarantee = guarantee;
}

@Override
public String toString() {
	return "NonPerishable [guarantee=" + guarantee + "]";
}
  



}
