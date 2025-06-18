
public class DaemonDemo extends Thread {
	private int limit;

	public DaemonDemo(int limit, String name) {
		super(name);
		this.limit = limit;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int c=1; c<= limit; c++)
			System.out.println(name + ": " + c);
	}
	
	public static void main(String[] args) {
		DaemonDemo d1 = new DaemonDemo(25, "First");
		DaemonDemo d2 = new DaemonDemo(50, "Second");
		DaemonDemo d3 = new DaemonDemo(100, "Third");
		
		DaemonDemo d4 = new DaemonDemo(500000, "Daemon");
		d4.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();
		d4.start();
	}
}
