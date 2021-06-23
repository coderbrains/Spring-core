package com.Springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
//@Scope("prototype")
public class Person {
	
	@Value("Awanish kumar singh")
	private String name;
	
	@Value("siwan")
	private String city;
	
	@Value("#{mob}")
	private List<String> mobiles;

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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the mobiles
	 */
	public List<String> getMobiles() {
		return mobiles;
	}

	/**
	 * @param mobiles the mobiles to set
	 */
	public void setMobiles(List<String> mobiles) {
		this.mobiles = mobiles;
	}

	public Person(String name, String city, List<String> mobiles) {
		super();
		this.name = name;
		this.city = city;
		this.mobiles = mobiles;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", mobiles=" + mobiles + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
