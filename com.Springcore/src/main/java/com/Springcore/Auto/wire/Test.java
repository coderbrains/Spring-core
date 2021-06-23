package com.Springcore.Auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String [] ar) {
		
		//Both uses the setter injection...
//		This is a byname example method used for the autowiring methods...
//		name of the variable must be the same as that of the variable declared as the field
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/Auto/wire/config.xml");
		
		Employee e = (Employee)context.getBean("emp");
		
		System.out.println(e);
		
		
		
//		This is the by type example which is used for the autowiring and name of the variables can be the differe

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		
		Employee e2 = (Employee)context.getBean("emp2");
		
		System.out.println(e2);
		
		
	}

}
