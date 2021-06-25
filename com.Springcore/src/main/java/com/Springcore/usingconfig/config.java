package com.Springcore.usingconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.Springcore.usingconfig")
public class config {
	
	@Bean
	public Person getPerson() {
		return new Person();
	}
	
	
	

}
