package com.example.coreJava.oop.abstraction;

public class PersonDao extends AbstractDao<Person>{
	
	public int save(Person t) {
		System.out.println("Person saved to the database!");
		return 1;
	}
}
