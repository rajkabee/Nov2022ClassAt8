package com.example.coreJava.oop.abstraction;

public class App {
	public static void main(String[] args) {
		PersonDao personDao = new PersonDao();
		personDao.connect();
		personDao.save(new Person());
		personDao.disconnect();
		
		ProductDao productDao = new ProductDao();
		productDao.connect();
		productDao.save(new Product());
		productDao.disconnect();
	}
}
