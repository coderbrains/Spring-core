package com.Springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value("25")
	private int id;
	
	@Value("awanish kumar singh")
	private String name;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
