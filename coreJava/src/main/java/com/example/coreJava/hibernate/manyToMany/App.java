
package com.example.coreJava.hibernate.manyToMany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
//		Product bus = new Product("bus", "TATA", 3500000f);
//		Product car = new Product("I20", "Hyundai", 3500000f);
//		Product bike = new Product("g6", "BMW", 3500000f);
//		List<Product> products=Arrays.asList(bus, car, bike);
//		Category vehicle = new Category("Vehicle");
//		Category machinery = new Category("Machinery");
//		Category fourWheeler = new Category("Four Wheeler");
//		List<Category> categories = Arrays.asList(vehicle, machinery, fourWheeler);
//		bus.setCategories(categories);
//		car.setCategories(categories);
//		bike.setCategories(categories);
//		vehicle.setProducts(products);
//		machinery.setProducts(products);
//		fourWheeler.setProducts(products);
//		
		
		
		
		Configuration con = new Configuration().configure(
							"com/example/coreJava/hibernate/hibernate.cfg.xml"
							)
							.addAnnotatedClass(Product.class)
							.addAnnotatedClass(Category.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
//		session.save(bus);
//		session.save(car);
//		session.save(bike);
//		session.save(vehicle);
//		session.save(machinery);
//		session.save(fourWheeler);
		
		Product p = session.find(Product.class, 2);
		System.out.println(p);
		
		tx.commit();
		session.close();
		
	}
}

