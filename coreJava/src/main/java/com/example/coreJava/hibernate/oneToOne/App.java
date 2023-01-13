
package com.example.coreJava.hibernate.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Product bus = new Product("bus", "TATA", 3500000f);
		Category vehicle = new Category("Vehicle");
		bus.setCategory(vehicle);
		vehicle.setProduct(bus);
		
		
		
		
		Configuration con = new Configuration().configure(
							"com/example/coreJava/hibernate/hibernate.cfg.xml"
							)
							.addAnnotatedClass(Product.class)
							.addAnnotatedClass(Category.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(bus);
		session.save(vehicle);
		tx.commit();
		session.close();
		
	}
}

