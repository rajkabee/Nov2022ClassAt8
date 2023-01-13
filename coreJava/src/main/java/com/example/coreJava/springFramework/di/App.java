package com.example.coreJava.springFramework.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/coreJava/springFramework/di/beans.xml");
		//Product p = context.getBean(Product.class);
		Product p1 = (Product)context.getBean("pd");
		System.out.println(p1);
		Product p2 = (Product)context.getBean("prod");
		System.out.println(p2);
		System.out.println("Spring Framework");
	} 
}
