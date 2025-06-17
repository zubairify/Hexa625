package com.zubair.stock;

public class Stock implements Exchange {

	@Override
	public void getQuote() {
		System.out.println("Get quote");
	}

	@Override
	public void viewQuote() {
		System.out.println("View quote");
	}

	@Override
	public void setQuote() {
		System.out.println("Set quote");
	}
}
