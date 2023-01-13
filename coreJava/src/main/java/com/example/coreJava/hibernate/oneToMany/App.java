
package com.example.coreJava.hibernate.oneToMany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Product bus = new Product("bus", "TATA", 3500000f);
		Product car = new Product("I20", "Hyundai", 3500000f);
		Product bike = new Product("g6", "BMW", 3500000f);
		List<Product> products=Arrays.asList(bus, car, bike);
		Category vehicle = new Category("Vehicle");
		bus.setCategory(vehicle);
		car.setCategory(vehicle);
		bike.setCategory(vehicle);
		vehicle.setProducts(products);
		
		
		
		
		Configuration con = new Configuration().configure(
							"com/example/coreJava/hibernate/hibernate.cfg.xml"
							)
							.addAnnotatedClass(Product.class)
							.addAnnotatedClass(Category.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(bus);
		session.save(car);
		session.save(bike);
		session.save(vehicle);
		tx.commit();
		session.close();
		
	}
}

