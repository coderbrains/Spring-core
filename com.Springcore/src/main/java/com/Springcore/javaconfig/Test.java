package com.Springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] a) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		
		Person person = context.getBean("person",Person.class);
		
		System.out.println(person);
	}

}
