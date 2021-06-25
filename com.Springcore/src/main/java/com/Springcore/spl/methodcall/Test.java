package com.Springcore.spl.methodcall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] a) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/spl/methodcall/config.xml");
	
		Demo demo = context.getBean("maths",Demo.class);
		
		System.out.println(demo);
	
	}

}
