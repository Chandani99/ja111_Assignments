package com.masai.entity;

public class Book {
	private Integer bId ;
	private String name;
	private String	author;
	private Integer	Price;
	
	
	public Book() {
		super();
	}


	public Book(Integer bId, String name, String author, Integer price) {
		super();
		this.bId = bId;
		this.name = name;
		this.author = author;
		Price = price;
	}


	public Integer getbId() {
		return bId;
	}


	public void setbId(Integer bId) {
		this.bId = bId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Integer getPrice() {
		return Price;
	}


	public void setPrice(Integer price) {
		Price = price;
	}


	@Override
	public String toString() {
		return "Book [bId=" + bId + ", name=" + name + ", author=" + author + ", Price=" + Price + "]";
	}

	
}
