package com.Springcore.usingbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private Person person;
	@Value("Awanish kumar singh")
	private String name;
	@Override
	public String toString() {
		return "Student [person=" + person + ", name=" + name + "]";
	}
	
	

}
