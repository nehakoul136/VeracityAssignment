package com.veracity.assignment.first;

public class Product {
	
	private int id;
	private String name;
	private float price;
	
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	@Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: " +price;
    }
}
	
