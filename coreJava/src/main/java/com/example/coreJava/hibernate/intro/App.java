package com.example.coreJava.hibernate.intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure(
							"com/example/coreJava/hibernate/hibernate.cfg.xml"
							)
							.addAnnotatedClass(User.class);
		System.out.println("Hibernate configured!");
		User user = new User(1, "Ramesh", "cook", true);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		
	}
}