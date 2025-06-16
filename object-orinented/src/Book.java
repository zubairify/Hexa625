
public class Book {
	private String title;
	private Member mbr;

	public Book(String title) {
		this.title = title;
	}
	
	public void status() {
		if(mbr == null)
			System.out.println(title + " is not issued to any member");
		else
			System.out.println(title + " is issued to " + mbr.getName());
	}

	public String getTitle() {
		return title;
	}
	
	public void issuing(Member m) {
		this.mbr = m;
		m.setBook(this);
		System.out.println("Book is issued.");
	}
	
	public void returning(Member m) {
		this.mbr = null;
		m.setBook(null);
		System.out.println("Book is returned.");
	}
}
