package com.Springcore.spl.methodcall;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("maths")
public class Demo {
	@Value("10")
	private int a;
	@Value("Maths")
	private String name;
	@Value("#{T(java.lang.Math).PI}")
	private double pi;
	@Value("#{ T(java.lang.Math).E }")
	private double e;
	@Value("#{ T(java.lang.Math).sqrt(144) }")
	private int square;
	@Override
	public String toString() {
		return "Demo [a=" + a + ", name=" + name + ", pi=" + pi + ", e=" + e + ", square=" + square + "]";
	}
	
	

}
