package com.zubair.lib;

public class Member {
	private String name;
	private Book bk;

	public Member(String name) {
		this.name = name;
	}
	
	public void status() {
		if(bk == null)
			System.out.println(name + " has not issued any book");
		else
			System.out.println(name + " has issued " + bk.getTitle());
	}

	public String getName() {
		return name;
	}

	public void setBook(Book b) {
		this.bk = b;
	}
	
}
