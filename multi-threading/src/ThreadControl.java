
public class ThreadControl extends Thread {
	private String msg;
	public ThreadControl(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(msg);
			Thread.yield();
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new ThreadControl("Hello");
		Thread t2 = new ThreadControl("World");
		
		t1.start();
		t2.start();
	}
}
