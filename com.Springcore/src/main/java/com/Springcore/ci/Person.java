package com.Springcore.ci;

public class Person {
	
	private int id;
	private String name;
	private Certificate certi;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certi=" + certi + "]";
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	/**
	 * @return the certi
	 */
	public Certificate getCerti() {
		return certi;
	}
	/**
	 * @param certi the certi to set
	 */
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public Person(int id, String name, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
	}
	
	
	
}
