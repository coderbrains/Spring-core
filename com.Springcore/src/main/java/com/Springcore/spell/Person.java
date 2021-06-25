package com.Springcore.spell;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("per")
public class Person {

	@Value("#{25 + 52}")  // this is spellllll
	private int id;

	@Value("Anik")
	private String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
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
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
