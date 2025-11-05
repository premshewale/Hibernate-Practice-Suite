package com.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book21July")
public class Book {
	@Id
	@GeneratedValue
	private int Bookid;
	@Column(length=10)
	private String BookTitle;
	private double Price;
	@Column(length=15)
	private String Authorname;
	
	public Book() {
		super();
	}
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
	@Override
	public String toString() {
		return "Book [Bookid=" + Bookid + ", BookTitle=" + BookTitle + ", Price=" + Price + ", Authorname=" + Authorname
				+ "]";
	}
	public Book(String bookTitle, double price, String authorname) {
		super();
		BookTitle = bookTitle;
		Price = price;
		Authorname = authorname;
	}

}
