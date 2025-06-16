
public class Product {
	private String name;
	private double price;
	private int stock;
	
	public Product() {
	}

	public Product(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void print() {
		System.out.println("Name: " + name + "\tPrice: " + price + "\tStock: " + stock);
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrice() {
		return price;
	}
}
