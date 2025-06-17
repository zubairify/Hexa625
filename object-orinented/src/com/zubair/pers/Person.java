package com.zubair.pers;

/**
 * This class represents a Person and it can be cloned.
 * @author Zubair
 * @version 1.0
 */
public class Person implements Cloneable {
	private String name;
	private int age;
	
	/** Default constructor */
	public Person() {
		this("Anonymous", -1);	// Calling another constructor (Constructor chaining)
	}
	
	/**
	 * Parameterized constructor
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private void test() {
		System.out.println("Private test method of Person");
	}

	/** Method to print person details. */
	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.age == this.age && p.name.equals(this.name))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Polo", 21);
		System.out.println(p1.hashCode());
		System.out.println(p1);
		
		Person p2 = new Person("Polo", 21);
		System.out.println(p2.hashCode());
		System.out.println(p2);
		
		System.out.println(p1.equals(p2));
		
		try {
			Person pc = (Person) p1.clone();
			System.out.println(pc);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
