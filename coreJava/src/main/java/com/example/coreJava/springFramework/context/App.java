package com.example.coreJava.springFramework.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/coreJava/springFramework/context/beans.xml");
		//Product p = context.getBean(Product.class);
		Product p = (Product)context.getBean("pd");
		System.out.println(p);
		System.out.println("Spring Framework");
	} 
}
