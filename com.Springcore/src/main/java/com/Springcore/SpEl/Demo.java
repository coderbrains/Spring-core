package com.Springcore.SpEl;

import org.springframework.stereotype.Component;

@Component
public class Demo {

	
	private int a;
	private String name;
	public Demo(int a, String name) {
		super();
		this.a = a;
		this.name = name;
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [a=" + a + ", name=" + name + "]";
	}
	
	
	
}
