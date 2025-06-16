
public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1.replace('e', 'a');
		System.out.println(s1);
		s1.toUpperCase();
		System.out.println(s1);
		
		// Rules to validate email
		// 1. Only 1 occurrences of @ and .
		// 2. Min 4 chars before @
		// 3. Min 3 chars between @ and .
		// 4. Min 2 chars after .
		String email = "zubair@male.com";
		
		String name = "Zubair";
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(nameRegex));
		
		String mobile = "7876543210";
		String mobileRegex = "[6-9][0-9]{9}";
		System.out.println(mobile.matches(mobileRegex));
		
		
	}
}
