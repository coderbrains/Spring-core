package com.Springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] aar) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/lifecycle/config.xml");

		Samosa s = (Samosa)context.getBean("samosa");
		
		System.out.println(s);
		context.registerShutdownHook();
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		Pepsi pepsi = (Pepsi)context.getBean("soft");
		
		System.out.println(pepsi);
		
		
		System.out.println("----------------------------------------");
		
		Bear b = (Bear)context.getBean("bear");
		
		System.out.println(b);
		
		
		
	}

}
