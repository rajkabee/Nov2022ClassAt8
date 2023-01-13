package com.example.coreJava.springFramework.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/coreJava/springFramework/objectInjection/beans.xml");
		//Product p = context.getBean(Product.class);
		//Product p1 = (Product)context.getBean("pd");
		//System.out.println(p1);
		Product p2 = (Product)context.getBean("prod");
		System.out.println(p2);
		Product p3 = (Product)context.getBean("prod3");
		System.out.println(p3);
		System.out.println("Spring Framework");
	} 
}
