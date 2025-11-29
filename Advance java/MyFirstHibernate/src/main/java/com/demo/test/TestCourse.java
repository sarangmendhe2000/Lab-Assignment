package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Faculty;

public class TestCourse {

	public static void main(String[] args) {
	
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Faculty f1 = new Faculty(101 , "Kishori mam" , "Java");
		
		Course c1 = new Course("DSA" , 3 , f1 );
		
		
		session.save(f1);
		session.save(c1);
		
		tr.commit();
		
		session.close();
		sf.close();
		
		
	}

}
