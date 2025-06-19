import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale hindi = new Locale("hi");
		Locale hiLoc = new Locale.Builder().setLanguage("hi").build();
		
		ResourceBundle bundle = ResourceBundle.getBundle("msgs", hiLoc);
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	}
}
