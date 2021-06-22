package com.Springcore.xmlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] aar) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/xmlifecycle/config.xml");

		Samosa s = (Samosa)context.getBean("samosa");
		
		System.out.println(s);
		
		context.registerShutdownHook();
		
	}

}