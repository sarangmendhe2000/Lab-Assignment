package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Nonparishable;
import com.demo.beans.Parishable;
import com.demo.beans.Product;

public class TestProduct {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Product p = new Parishable(101 , "Milk" , 5 , 20.00 , LocalDate.of(2025, 10, 22) );
		Product p1 = new Nonparishable(102 , "Computer" , 3 , 25000 , 6);
		
		session.save(p);
		session.save(p1);
		
		tr.commit();
		session.close();
		sf.close();
	}

	}


