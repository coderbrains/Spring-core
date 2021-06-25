package com.Springcore.usingbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.Springcore.usingbeans")
public class config {
	
	@Bean
	public Student getStudent() {
		return new Student();
	}

	@Bean
	public Person getPerson() {
		return new Person();
	}
	
}
