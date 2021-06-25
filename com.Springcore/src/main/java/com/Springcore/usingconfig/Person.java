package com.Springcore.usingconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value("Awanish kumar singh")
	private String name;

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
