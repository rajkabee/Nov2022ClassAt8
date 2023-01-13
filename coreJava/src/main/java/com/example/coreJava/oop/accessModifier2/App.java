package com.example.coreJava.oop.accessModifier2;

import com.example.coreJava.oop.accessModifier.Person;

public class App {
	public static void main(String[] args) {
		Person p = new Person();
		//p.name="Alina";
		//p.age=28;
		p.address="Kathmandu";
		//p.contact=9876776666l;
		Employee emp = new Employee();
		emp.setName("hello");
		emp.setAge(312);
	}
}
