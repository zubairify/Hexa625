
public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m1 = new Manager("Kelly", 2300, 600);
		
		Clerk c1 = new Clerk("Ryan", 1400, 400);
		
		showSalary(m1);
		showSalary(c1);
	}

	private static void showSalary(Employee e) {
		if(e instanceof Manager)
			System.out.println("Manager Salary: " + e.getSalary());
		else
			System.out.println("Clerk Salary: " + e.getSalary());
	}

//	private static void showSalary(Clerk c1) {
//		System.out.println("Clerk Salary: " + c1.getSalary());
//	}
//
//	private static void showSalary(Manager m1) {
//		System.out.println("Manager Salary: " + m1.getSalary());
//	}
}
