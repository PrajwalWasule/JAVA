package com.app.core;

import java.time.LocalDate;

public class Tape extends Publication{
	
	private static final long serialVersionUID = 1L;
	private int playTime; //play time in min

	public Tape(String title, int price, LocalDate publishDate, int rating, int playTime) {
		super(title, price, publishDate, rating);
		this.playTime = playTime;
	}

	@Override
	public String toString() {
		return "Tape [ " +  super.toString() + " playTime=" + playTime + "]";
	}
	
}
