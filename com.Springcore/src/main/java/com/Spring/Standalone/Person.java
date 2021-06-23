package com.Spring.Standalone;

import java.util.List;
import java.util.Set;

public class Person {
	
	private int id;
	private String name;
	private List<String> companies;
	private Set<String> mobiles;
	public Person(int id, String name, List<String> companies, Set<String> mobiles) {
		super();
		this.id = id;
		this.name = name;
		this.companies = companies;
		this.mobiles = mobiles;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", companies=" + companies + ", mobiles=" + mobiles + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	/**
	 * @return the companies
	 */
	public List<String> getCompanies() {
		return companies;
	}
	/**
	 * @param companies the companies to set
	 */
	public void setCompanies(List<String> companies) {
		this.companies = companies;
	}
	/**
	 * @return the mobiles
	 */
	public Set<String> getMobiles() {
		return mobiles;
	}
	/**
	 * @param mobiles the mobiles to set
	 */
	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}
	
	
	

}
