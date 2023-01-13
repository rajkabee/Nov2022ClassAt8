package com.example.coreJava.springFramework.objectInjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manufacturer {
	private int id;
	private String name;
	private String country;
}
