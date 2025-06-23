package ex3;

public class Stock {
	
	public Stock() {
		System.out.println("Default constructor");
	}
	
	private static Stock stk;
	
	public static Stock getStock() {
		System.out.println("Stock singleton");
		
		if(stk == null)
			stk = new Stock();
		
		return stk;
	}
}
