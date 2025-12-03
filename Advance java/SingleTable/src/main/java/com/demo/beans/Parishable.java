package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("perishable")
public class Parishable extends Product{
	private LocalDate expdate;

	public Parishable() {
		super();
	}

	public Parishable(int pid , String pname , int Qty , double price, LocalDate date) {
		super(pid , pname , Qty , price );
		this.expdate = date;
	}

	public LocalDate getDate() {
		return expdate;
	}

	public void setDate(LocalDate date) {
		this.expdate = date;
	}

	@Override
	public String toString() {
		return "Parishable [expdate=" + expdate + "]";
	}
	

}
