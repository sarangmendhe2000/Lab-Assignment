package com.demo.beans;

import java.time.LocalDate;


import javax.persistence.Entity;


@Entity

public class Perishable extends Product{
	private LocalDate expdate;

	public Perishable() {
		super();
	}

	public Perishable(int pid , String pname , int Qty , double price, LocalDate date) {
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
		return "Perishable [expdate=" + expdate + "]";
	}
	

}
