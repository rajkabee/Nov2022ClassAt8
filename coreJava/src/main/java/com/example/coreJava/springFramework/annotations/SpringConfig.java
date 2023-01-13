package com.example.coreJava.springFramework.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = "com.example.coreJava.springFramework.annotations")
@PropertySource("classpath:com/example/coreJava/springFramework/annotations/application.properties")
public class SpringConfig {
	@Bean("manu")
	public Manufacturer getManufacturer() {
		Manufacturer manu = new Manufacturer();
		manu.setId(654321);
		manu.setName("Annapurna");
		manu.setCountry("Nepal");
		return manu;
	}
	@Bean("manufacturer")
	public Manufacturer getManu() {
		return new Manufacturer();
	}
	
}
