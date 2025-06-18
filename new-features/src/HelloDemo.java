
@FunctionalInterface
interface Demo {
	void print(String s);
}

public class HelloDemo {

	public static void main(String[] args) {
		
		Hello h1 = () -> "Hello Lambda";
		System.out.println(h1.sayHello());
		
		Hello h2 = () -> {
			String greet = "Hola Lambda";
			return greet;
		};
		System.out.println(h2.sayHello());
		
		System.out.println(h2.sayBye());
		
		Hello.greet();
		
		Demo d1 = (s) -> System.out.println(s);
		d1.print("Aloha");
		
		Demo d2 = System.out::println;
		d2.print("Asta la vista");
		
		Demo d3 = HelloDemo::display;
		d3.print("Bojour");
	}
	
	public static void display(String s) {
		System.out.println(s);
	}
}





