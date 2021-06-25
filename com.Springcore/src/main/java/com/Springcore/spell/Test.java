package com.Springcore.spell;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String a[] ) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/spell/beans.xml");
		
		Person p = context.getBean("per", Person.class);
		
		System.out.println(p);
		
		
	}

}
