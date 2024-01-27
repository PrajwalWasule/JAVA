package com.app.core;

import java.time.LocalDate;

public class Book extends Publication{

	private static final long serialVersionUID = 1L;
	private int pgCount; //page count

	public Book(String title, int price, LocalDate publishDate, int rating, int pgCount) {
		super(title, price, publishDate, rating);
		this.pgCount = pgCount;
	}

	@Override
	public String toString() {
		return "Book [ " +  super.toString() + " pgCount=" + pgCount + "]";
	}
	
}
