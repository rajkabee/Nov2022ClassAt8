package com.example.coreJava.oop.abstraction;

public class ProductDao extends AbstractDao<Product> {

	public int save(Product t) {
		System.out.println("Product saved to the database!");
		return 1;
	}
}
