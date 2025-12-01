package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Student;

public class GetData {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Course cr = session.get(Course.class , 101);
		
//		System.out.println(cr);
		
//		Course cr2 = session.get(Course.class , 102);

//		System.out.println(cr2);
		
		
		Student s1 = session.get(Student.class, 1001);
		
//		System.out.println(s1);
//		System.out.println(s1.getEmail());
		System.out.println(cr.getCname());

		
		tr.commit();
		session.close();
		sf.close();

	}

}
