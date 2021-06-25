package com.Springcore.SpEl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] a) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/SpEl/config.xml");
		
		Demo demo = context.getBean("demo", Demo.class);
		
		demo.setA(52);
		demo.setName("Hello moto");
		
		System.out.println(demo);
	}

}
