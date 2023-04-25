package com.bookman.model;

public class Book implements Comparable<Book>{

	private int id;
	private String name;
	private double price;
	
	public Book(){
	}

	public Book(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return id + "\n" + name + "\n" + price + "\n";
	}
	
	public int compareTo(Book book) {
		if (price == book.getPrice()) {
			return 0;
		}
		else if(price < book.getPrice()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
