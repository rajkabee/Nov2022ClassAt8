package com.example.coreJava.oop.abstraction;

public abstract class AbstractDao<T> implements Dao<T>{
	
	public void connect() {
		System.out.println("Connect to the database!");
	}
	
	public void disconnect() {
		System.out.println("Disconnected from the database!");
	}
	
	
}
