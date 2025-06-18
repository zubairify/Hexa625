
public class MyThread extends Thread {
	private int data;

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int c=1; c<= 50; c++) 
			System.out.println(name + ": " + ++data);
	}
	
	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		mt1.setName("First");
		
		MyThread mt2 = new MyThread();
		mt2.setName("Second");
		
		MyThread mt3 = new MyThread();
		mt3.setName("Third");
		
		mt1.setPriority(MIN_PRIORITY);
		mt3.setPriority(MAX_PRIORITY);
		
		mt1.start();
		mt2.start();
		mt3.start();
		
		String name = Thread.currentThread().getName();
		for(int c=1; c<= 50; c++) 
			System.out.println(name + ": " + c);
	}
}
