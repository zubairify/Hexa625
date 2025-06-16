
public class TestLibrary {

	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist");
		Member m1 = new Member("John");
		Member m2 = new Member("Sean");
		Book b2 = new Book("Code Complete");
		
		b1.status();
		m1.status();
		
		// Issuing book to member
		b1.issuing(m1);
		
		b1.issuing(m2);
		b2.returning(m1);
		
		b1.status();
		m1.status();
		
		b1.returning(m1);

		b1.status();
		m1.status();

	}
}
