package com.Springcore.ci;

public class Addition {
	
	private int a;
	private int b;
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
	 * @return the b
	 */
	public int getB() {
		return b;
	}
	
	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	
	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public Addition(double a, double b) {
		
		super();
		this.a = (int)a;
		this.b = (int)b;
		
	}
	
	public int dosum() {
		
		return this.a + this.b;
	}
	
	
	

}
