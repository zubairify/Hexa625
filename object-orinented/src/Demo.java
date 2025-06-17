import com.zubair.pers.Person;

public class Demo<Z> {
	private Z data;

	public Demo(Z data) {
		this.data = data;
	}

	public Z getData() {
		return data;
	}
	public void setData(Z data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo<Integer> d1 = new Demo<Integer>(99);
		System.out.println(d1.getData());
		
		Demo<String> d2 = new Demo<String>("Hello");
		System.out.println(d2.getData());
		
		Demo<Person> d3 = new Demo<Person>(new Person("Jack", 10));
		System.out.println(d3.getData());
	}
}
