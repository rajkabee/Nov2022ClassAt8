package com.example.coreJava.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStream {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				 new Person("Namita Shrestha", Gender.female, 27),
				 new Person("Sanjay Pajiyar", Gender.male, 23),
				 new Person("Karuna Shrestha", Gender.female, 10),
				 new Person("Nawadeep Adhikari", Gender.male, 35),
				 new Person("Jyoti Dadal", Gender.female, 45),
				 new Person("Suraj Dahal", Gender.male, 67),
				 new Person("Surya Pradhan", Gender.male, 33),
				 new Person("Pawan Shrestha", Gender.male, 39),
				 new Person("Najina Sunar", Gender.female, 7)
				);
		
		System.out.println("sorted: ");
		people.stream()
			.sorted(Comparator.comparing(Person::getAge))
			.collect(Collectors.toList())
			.forEach(System.out::println);
			
		System.out.println("\nReversed sorted: ");
		people.stream()
		.sorted(Comparator.comparing(Person::getAge).reversed())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("\nMin Value: ");
		System.out.println(people.stream()
			.min(Comparator.comparing(Person::getAge)));
			
		System.out.println("\nMax Value: ");
		System.out.println(people.stream()
				.max(Comparator.comparing(Person::getAge)));
		
		boolean isMinor = people.stream()
							.anyMatch(p->p.getAge()<18);
		if(isMinor) {
			System.out.println("\nThere are some minors in the list!");
		}
		
		boolean isEveryoneMinor = people.stream()
				.allMatch(p->p.getAge()<18);
		if(isEveryoneMinor) {
			System.out.println("\nEveryone is a minors in the list!");
		}else {
			System.out.println("There are some Adults in the list!");
		}
		
		boolean isMary = people.stream()
				.noneMatch(p->p.getName()=="Nawadeep Adhikari");
		if(!isMary) {
			System.out.println("Nawadeep Adhikari is in the List!");
		}else {
			System.out.println("Nawadeep Adhikari is not in the List!");
		}
		
		
		System.out.println("\nGrouping: ");
		Map<Gender, List<Person>> groupedByGender=
		people.stream()
			.collect(Collectors.groupingBy(Person::getGender));
		
		groupedByGender.forEach((gender, group)->{
			System.out.println("\nGroup of "+gender+":");
			group.forEach(System.out::println);
		});
		
		
		
		
		
		
		
		
	}
	
	static enum Gender{
		male, female
	}     
	static class Person{
		private String name;
		private int age;
		private Gender gender;
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Person(String name, Gender gender, int age) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Gender getGender() {
			return gender;
		}
		public void setGender(Gender gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
		
	}
	
}
