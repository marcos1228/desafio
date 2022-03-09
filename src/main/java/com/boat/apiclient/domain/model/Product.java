package com.boat.apiclient.domain.model;

public class Product {
	private Long id;
	private String name;
	public Product() {
		super();
	}
	public Product(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
