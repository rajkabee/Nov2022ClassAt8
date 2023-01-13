package com.example.coreJava.oop;

public class ClassObject {

	static class Person{
		private String name;
		public String address;
		protected long contact;
		int age;
		
		public Person(String name, String address, long contact, int age) {
			this.name = name;
			this.address = address;
			this.contact = contact;
			this.age=age;
		}
		
		public Person(String name) {
			this.name = name;
		}

		public Person() {
		}
		
		
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", address=" + address + ", contact=" + contact + ", age=" + age + "]";
		}
		
		public void greet() {
			System.out.println("Welcome to Java!");
		}
		public void greet(String name) {
			System.out.println("Hello "+name+", Welcome to Java!");
		}
		
		
	}
	public static void main(String[] args) {
		Person p = new Person("kabiraj", "lalitpur", 9876677654l, 34);
		
		p.name="Uttam Gajurel";
		p.address="Kageshwori";
		p.contact=9876556644l;
		p.age=24;
		
		System.out.println(p);
		
	}
	
}
