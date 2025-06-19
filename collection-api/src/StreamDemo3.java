import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo3 {

	private static void process(int i) {
		try {
			Thread.sleep(1); // lets thread sleep for a millisecond
		} catch (InterruptedException e) {}
	}
	
	public static void main(String[] args) {

		List<Integer> numbers = IntStream.range(1, 99).boxed().collect(Collectors.toList());
		
		long startTime = System.currentTimeMillis();
		numbers.stream().forEach(StreamDemo3::process);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by sequential stream: " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		numbers.parallelStream().forEach(StreamDemo3::process);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by parallel stream: " + (endTime - startTime));
	}
}
