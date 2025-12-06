package com.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyUser {
	
	@Value("Sangita")
	private String name;

	public MyUser() {
		super();
	}

	public MyUser(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyUser [name=" + name + "]";
	}
	
	public void m1()
	{
		System.out.println("In m1 method");
	}
	
	public int m2(int x)
	{
		System.out.println("In m2 method");
		return x;
	}
	
}
