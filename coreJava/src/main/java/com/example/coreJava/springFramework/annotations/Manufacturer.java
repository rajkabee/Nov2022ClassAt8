package com.example.coreJava.springFramework.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component("producer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer {
	//@Value("${manufacturer.id}")
	private int id;
	//@Value("${manufacturer.name}")
	private String name;
	//@Value("${manufacturer.country}")
	private String country;
}
