package com.example.coreJava.springFramework.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component(value="prod")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	private int id;
	@Value("Solar Panels")
	private String name;
	@Autowired
	@Qualifier("manu")
	private Manufacturer manufacturer;
	private float price;
	
	@PostConstruct
	public void init() {
		System.out.println("Manufacturer Bean Created!");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Manufacturer bean destroying!");
	}
	
}
