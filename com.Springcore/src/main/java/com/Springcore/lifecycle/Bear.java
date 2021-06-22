package com.Springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bear {

	private int price;
	private String name;
	@Override
	public String toString() {
		return "Bear [price=" + price + ", name=" + name + "]";
	}
	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
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
	
	@PostConstruct
	public void init() {
		
		System.out.println("initializing bear....");
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("destroy bear...");
	}
	
	
}
