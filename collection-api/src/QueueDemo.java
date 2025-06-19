import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<>();
		
		que.offer("Apple");
		que.offer("Banana");
		que.offer("Cherry");
		
		System.out.println(que.peek());	// Fetch value but doesn't remove
		
		while(!que.isEmpty())
			System.out.println(que.poll());	// Fetch value and remove from queue
	}
}
