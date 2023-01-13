package com.example.coreJava.oop.inheritance;

public class Employee extends Person{
	String position; 
	float salary;
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [position=" + position + ", salary=" + salary + "]";
	}
	
}
