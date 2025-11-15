package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "book1")
public class Book1 {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="bookid")
	@SequenceGenerator(name="bookid",sequenceName = "seqprodid",initialValue = 1,allocationSize = 1)
	private int bookid;
	@Column(length = 15)
	private String name;
	private String category;
	private String edition;
	private int price;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	
	public Book1(String name, String category, String edition) {
		super();
		this.name = name;
		this.category = category;
		this.edition = edition;
	}
	
	
	
	
	
	public Book1() {
		super();
	}
	public Book1(int bookid, String name, String category, String edition, int price) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.category = category;
		this.edition = edition;
		this.price = price;
	}
	public Book1(String name, String category, String edition, int price) {
		super();
		this.name = name;
		this.category = category;
		this.edition = edition;
		this.price = price;
	}
	public Book1(int bookid) {
		super();
		this.bookid = bookid;
	}
	@Override
	public String toString() {
		return "Book1 [bookid=" + bookid + ", name=" + name + ", category=" + category + ", edition=" + edition
				+ ", price=" + price + "]";
	}
	
	
	
}
