package com.Spring.Standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] a) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Spring/Standalone/beans.xml");
		Person p = (Person)context.getBean("person",Person.class);
		System.out.println(p);
		
	}

}
