package com.Springcore.usingbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] a) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student);
	}

}
