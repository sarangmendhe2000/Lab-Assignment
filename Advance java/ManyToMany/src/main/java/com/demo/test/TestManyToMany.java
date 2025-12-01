package com.demo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Cart;
import com.demo.beans.Item;

;

public class TestManyToMany {

	public static void main(String[] args) {
     
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
	
		
		Item i1 = new Item(1001 , "Milk" , 2500 , LocalDate.of(2025, 12, 01));
		Item i2 = new Item(1002 , "Coffee" , 2500 , LocalDate.of(2025, 11, 01));
		Item i3 = new Item(1003 , "Green Tea" , 350 , LocalDate.of(2025, 10, 01));
		Item i4 = new Item(1004 , "Black Tea" , 650 , LocalDate.of(2025, 01, 01));
		Item i5 = new Item(1005 , "Lemon Tea" , 750 , LocalDate.of(2025, 01, 11));
		
		List<Item> ilist = new ArrayList<>();
		
		ilist.add(i1);
		ilist.add(i2);
		ilist.add(i3);
		
		
		
		List<Item> ilist2 = new ArrayList<>();
		
		ilist2.add(i3);
		ilist2.add(i4);
		ilist2.add(i5);
		
		
		
	
		Cart c1 = new Cart(101 , ilist);
		Cart c2 = new Cart(102 , ilist2);
		Cart c3 = new Cart(103 , ilist);
		
		c1.setList(ilist);
		c2.setList(ilist2);
		c3.setList(ilist);
		
		i1.setCart(Arrays.asList(c1, c3)); 
        i2.setCart(Arrays.asList(c1, c3)); 
        
        // Item i3 is in C1, C2, and C3
        i3.setCart(Arrays.asList(c1, c2, c3)); 
        
        // Item i4 and i5 are only in C2
        i4.setCart(Arrays.asList(c2));
		
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
		tr.commit();
		session.close();
		sf.close();
		
	}

}
