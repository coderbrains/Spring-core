package com.Springcore.usingjavaconfig;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private int number;
	private String name;
	private String address;
	
	@Override
	public String toString() {
		return "Person [number=" + number + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
