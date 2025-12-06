package com.demo.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.MyUser;

public class TestPropPlaceHolder {
	
public static void main(String[] args) {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
	
	MyUser u = (MyUser)ctx.getBean("u1");
	
	System.out.println(u);
	
}
}
