package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestData {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Course cr1 = new Course(101, "DAC", "Kishori Mam",6);
		Course cr2 = new Course(102, "DBDA", "Sayali Mam",6);
		Course cr3 = new Course(103, "DAI", "Supriya Mam",6);
		
		Student std1 = new Student(1001 , "Sarang" , "sarang@gmail;.com" , cr1);
		Student std2 = new Student(1002 , "Sangita" , "samgita@gmail;.com" , cr1);
		Student std3 = new Student(1003 , "pooja" , "pooja@gmail;.com" , cr2);
		Student std4 = new Student(1004 , "Tushar" , "tushar@gmail;.com" , cr3);
		Student std5 = new Student(1005 , "Chinmay" , "chinmay@gmail;.com" , cr2);
		
		Set<Student>set1 = new HashSet<>();
		
		set1.add(std1);
		set1.add(std2);
		
		Set<Student>set2 = new HashSet<>();
		
		set2.add(std3);
		set2.add(std5);
		
		Set<Student>set3 = new HashSet<>();
		
		set3.add(std4);
		
		cr1.setStd(set1);
		cr2.setStd(set2);
		cr3.setStd(set3);

		session.save(cr1);
		session.save(cr2);
		session.save(cr3);
		
		session.save(std1);
		session.save(std2);
		session.save(std3);
		session.save(std4);
		session.save(std5);
		
		
		tr.commit();
		session.close();
		sf.close();

	}

}
