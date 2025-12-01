package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Cart;
import com.demo.beans.Item;

public class TestGetManyToMany {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		
		Cart c1 = session.get(Cart.class, 101);
		
		System.out.println(c1);
		
//		Item i1 = session.get(Item.class , 1001);
		
//		System.out.println(i1);
		
		tr.commit();
		session.close();
		sf.close();
		
	}
}
