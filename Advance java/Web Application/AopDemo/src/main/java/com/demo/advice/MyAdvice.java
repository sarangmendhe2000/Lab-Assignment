package com.demo.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
	
	@Before("execution (* com.demo.bean.*.*(..))")
	public void beforeAdvice()
	{
		System.out.println("In Before Advice");
	}
	
	
	@After("execution(* com.demo.bean.*.*(..))")
	public void afterAdvice()
	{
		System.out.println("In After Advice");
	}
	
	@Around("execution(* com.demo.bean.*.*(..))")
	
	public Object aroundAdvice(ProceedingJoinPoint jpoint) throws Throwable
	{
		System.out.println("In Around advice before function call");
		Object ob = jpoint.proceed();
		System.out.println("In Around advice after function call");
		return ob;
	}
}
