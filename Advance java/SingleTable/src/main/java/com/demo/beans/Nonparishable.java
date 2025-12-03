package com.demo.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("nonperishable")
public class Nonparishable extends Product{
  private int guarantee;

public Nonparishable() {
	super();
}

public Nonparishable(int pid , String pname , int Qty , double price, int guarantee) {
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
	return "Nonparishable [guarantee=" + guarantee + "]";
}
  



}
