import java.util.Arrays;
import java.util.OptionalInt;

//21) How do you find second largest element in an array of integers?
//https://javaconceptoftheday.com/java-array-interview-questions-and-answers/
/**
 * 
 * @author rishiraj
 * 
 */
public class SecondLargest {
	public static void main(String[] args) {
		int [] a = {3333,44,55,676,33,22,55};
		
//		System.out.println("Second largest: " + sLargest(a));
		System.out.println("Second largest: " + sLargestJ8(a));
//		System.out.println(Arrays.toString(a));
	}
	
	//with Stream as in Java 8 and later
	static int sLargestJ8(int[] a)  {
		int invalidSentinel = -1111111111;
		final int max;
		
		OptionalInt maxOpt = Arrays.stream(a).max();
		if(maxOpt.isEmpty())
			return invalidSentinel;
		else 
			max = maxOpt.getAsInt();
		maxOpt = Arrays.stream(a)
		.filter(i -> i < max)
		.max();
		if(maxOpt.isEmpty())
			return invalidSentinel;
		else 
			return maxOpt.getAsInt();
	}
	
	static int sLargest(int[] a)  {
		int sl= -10000000;
		
		int[] b = a.clone(); 
		Arrays.sort(b);
		int largest = largest(b);
		
		for(int i: a) {
			if(i == largest) continue;
			if(i>sl) sl=i;
		}
		return sl;
	}
	static int largest(int[] b ) {
		int l = -100000000; 
		
		for(int i : b) {
		if(i>l) l = i;	
		}
		
		return l;
	}
}
