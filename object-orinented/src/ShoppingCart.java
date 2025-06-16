
public class ShoppingCart {
	private Product[] products;
	private double total;
	private int idx;
	
	public ShoppingCart() {
		products = new Product[5];
	}
	
	public void addItem(Product p, int qty) {
		if(idx > 4)
			System.out.println("Your cart is full");
		else {
			if(qty > p.getStock()) 
				System.out.println("Product out of stock");
			else {
				products[idx] = p;
				p.setStock(p.getStock() - qty);
				idx ++;
				total += p.getPrice() * qty;
			}
		}
	}
	
	public void checkout() {
		System.out.println("Products in your cart");
		for(int i=0; i<idx; i++)
			products[i].print();
		System.out.println("Cart Total: " + total);
	}
}
