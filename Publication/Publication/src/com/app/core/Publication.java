package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Publication implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static int idGenerator;
	private int id;
	private String title;
	private int price;
	private LocalDate publishDate;
	private int rating;
	
	static {
		idGenerator = 0;
	}
	public Publication(String title, int price, LocalDate publishDate, int rating) {
		super();
		this.id = ++idGenerator;
		this.title = title;
		this.price = price;
		this.publishDate = publishDate;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return " id=" + id + ", title=" + title + ", price=" + price + ", publishDate=" + publishDate
				+ ", rating=" + rating;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
