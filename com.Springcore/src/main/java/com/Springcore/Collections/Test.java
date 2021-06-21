package com.Springcore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/Collections/config.xml");
		
		Employee e = (Employee)context.getBean("Employee1");
		System.out.println(e);
	}

}
