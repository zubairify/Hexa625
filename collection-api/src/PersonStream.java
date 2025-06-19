import java.util.ArrayList;
import java.util.List;

public class PersonStream {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Polo", 21));
		people.add(new Person("Mili", 19));
		people.add(new Person("Jim", 24));
		
		people.stream().filter(p -> p.getAge() > 20).forEach(System.out::println);
		
		people.stream().filter(p -> p.getName().contains("i")).forEach(System.out::println);
		
	}
}
