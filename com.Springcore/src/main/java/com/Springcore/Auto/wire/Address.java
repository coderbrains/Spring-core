package com.Springcore.Auto.wire;

public class Address {
	
	private String street;
	private String house;
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the house
	 */
	public String getHouse() {
		return house;
	}
	/**
	 * @param house the house to set
	 */
	public void setHouse(String house) {
		this.house = house;
	}
	public Address(String street, String house) {
		super();
		this.street = street;
		this.house = house;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", house=" + house + "]";
	}
	
	
	

}
