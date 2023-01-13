package com.example.coreJava.oop.abstraction;

public interface Dao<T> {
	
	public void connect();
	public void disconnect();
	public int save(T t);
}
