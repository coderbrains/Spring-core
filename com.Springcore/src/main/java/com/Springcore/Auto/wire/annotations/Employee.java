package com.Springcore.Auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	// the annotations can be used on the property as well as on the
	// setter and on the constructor.....

	@Autowired
	private Address address;

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
