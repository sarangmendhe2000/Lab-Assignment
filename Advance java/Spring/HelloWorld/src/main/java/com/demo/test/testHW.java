package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Address;
import com.demo.beans.Employee;
import com.demo.beans.Hello;
import com.demo.beans.MyUser;
import com.demo.beans.Student;


public class testHW {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		
		Hello obj = (Hello)ctx.getBean("hw");
		
		 obj.helloWorld();
		 
		 
		 
		 //For Employee class
		 
		 Employee e = (Employee)ctx.getBean("e1");
		 System.out.println(e);
		 
		 Address a = (Address)ctx.getBean("a1");
		 System.out.println(a);
		 
		 MyUser u = (MyUser)ctx.getBean("u1");
		 System.out.println(u);
		 
		 
		 Student s = (Student)ctx.getBean("s1");
		 System.out.println(s);
		 
		 
	}
	
	
	
	

}
