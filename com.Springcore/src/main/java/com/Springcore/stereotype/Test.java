package com.Springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Springcore.Student;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/stereotype/stereotype.xml");
	
		Person person = context.getBean("ob",Person.class);
		System.out.println(person);
	}

}
