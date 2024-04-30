import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//19) How do you find duplicate elements in an array?
//https://javaconceptoftheday.com/java-array-interview-questions-and-answers/
public class FindDuplicatesInArrayByStream {
	public static void main(String[] args) {
		int[] a = { 2, 2, 2, 34, 3, 54, 56, 6, 6, 6, 5, 3, 34, 23, 2, 2, 5 };
		findDuplicatesInArray(a);
	}

	//using Stream as in Java 8 and later
	static void findDuplicatesInArray(int[] arr) {
		Set<Integer> uniqueSet = new HashSet<>();

		Arrays.stream(arr)
			.filter(i -> !uniqueSet.add(i))
			.distinct() // .boxed().collect(java.util.stream.Collectors.toSet()) //alternate approach, for wrapper type
			.forEach(n -> System.out.print(n + " "));
	}
}
