package com.Springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	
	private int price;

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

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public Pepsi(int price) {
		super();
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//this is init methods...
	//name can be changed....
	
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("taking pepsi.....");
		
	}

	
	//this is destroyable method 
	//name can be  changed...
	
	public void destroy() throws Exception {
	
			System.out.println("just going to put bottle in the dustbin...");
		
	}
	
	

}
