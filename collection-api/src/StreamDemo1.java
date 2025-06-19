import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class StreamDemo1 {

	public static void main(String[] args) {
		Integer[] ar = { 2, 5, 7, 6, 8, 2, 3, 4 };
		// Convert an array into a list of integers
		List<Integer> numbers = Arrays.asList(ar);
		// New way to iterate over collection
//		numbers.forEach(System.out::println);

		// Creating stream for numbers list
//		Stream<Integer> str1 = numbers.stream();
//		str1.forEach(System.out::println);	// Terminal operation
		// Performing operation again shall give an error as stream is closed
//		str1.forEach(System.out::println);

		// Shorthand to do the same
//		numbers.stream().forEach(System.out::println); // forEach() is terminal operation

		// Performing intermediate operation
//		numbers.stream().distinct().forEach(System.out::println); // distinct() is intermediate operation

//		System.out.println(numbers.stream().distinct().count()); // count() is terminal operation

		// Sorting distinct values before printing
//		numbers.stream().distinct().sorted().forEach(System.out::println); // sorted() is intermediate

		// Calculating sum of numbers in 2 ways
//		System.out.println(numbers.stream().distinct().reduce(0, (a, b) -> a + b));
//		System.out.println(numbers.stream().distinct().reduce(0, Integer::sum));

		// Creating and working with streams of numbers
//		System.out.println(IntStream.range(1, 99).count());
//		System.out.println(IntStream.range(1, 9).sum());
//
//		System.out.println(IntStream.range(1, 9).skip(5).sum());

		// Common statics on Integer stream
		IntStream str = IntStream.of(2, 5, 7, 6, 8, 2, 3, 4);
		IntSummaryStatistics stats = str.summaryStatistics();
		System.out.println(stats);
	}
}
