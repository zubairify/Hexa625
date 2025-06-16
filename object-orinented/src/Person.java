
public class Person {
	private String name;
	private int age;
	
	public Person() {
		this("Anonymous", -1);	// Calling another constructor (Constructor chaining)
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Polo", 21);
		p1.print();
		
		Person p2 = new Person();
		p2.print();
	}
}
