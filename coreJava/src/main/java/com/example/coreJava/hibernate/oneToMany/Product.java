package com.example.coreJava.hibernate.oneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String manufacturer;
	private float price;
	@ManyToOne
	private Category category;
	public Product(String name, String manufacturer, float price) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	
}
