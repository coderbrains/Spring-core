package com.Springcore.usingconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] a) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		
		
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
	}

}
