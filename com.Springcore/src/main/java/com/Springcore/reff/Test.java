package com.Springcore.reff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] ars) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/reff/config.xml");
		
	A a = (A)	context.getBean("aref");
		
	
	System.out.println(a);
		
	}
	
	
}
