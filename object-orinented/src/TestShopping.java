import com.zubair.shop.Product;
import com.zubair.shop.ShoppingCart;

public class TestShopping {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		Product p1 = new Product("Marker", 25, 100);
		Product p2 = new Product("Coffee Mug", 100, 20);
		
		cart.addItem(p1, 10);
		cart.addItem(p2, 2);
		cart.addItem(p1, 10);
		cart.addItem(p2, 3);
		cart.addItem(p1, 5);
		cart.addItem(p2, 2);
		
		cart.checkout();
	}
}
