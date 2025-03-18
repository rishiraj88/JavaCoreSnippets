package java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rishiraj
 * to get arrays out of lists
 */
public class CollectionPlus {

	public static void main(String[] args) {

		//setup -- start
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		System.out.println("Integer list: "+integerList);

		List<String> sList = new ArrayList<>();
		sList.add("3");
		sList.add("4");
		System.out.println("String list: "+sList);
		// setup -- complete

		Integer[] integerArr = null;
		String[] sArr = null;

		// JDK 11
		// Collection.toArray(IntFunction<T[]> generator )
		integerArr = integerList.toArray(size -> new Integer[size]);
		System.out.println("\nInteger array with List.toArray(size -> new Integer[size]: "+Arrays.toString(integerArr));
		integerArr = integerList.toArray(Integer[] :: new);
		System.out.println("Integer array with List.toArray(Integer[] :: new): "+Arrays.toString(integerArr));

		// JDK 11
		// Collection.toArray(IntFunction<T[]> generator )
		sArr = sList.toArray(size -> new String[size]);
		System.out.println("\nString array with List.toArray(size -> new String[size]): "+Arrays.toString(sArr));
		sArr = sList.toArray(String[]:: new);
		System.out.println("String array with List.toArray(String[]:: new): "+Arrays.toString(sArr));

/*		// "JDK 8,9,10" style
		// Collection.stream()
		// Stream.toArray(IntFunction<A[]> generator);
		integerArr = integerList.stream().toArray(size -> new Integer[size]);

		// "JDK 8,9,10" style
		// Stream.toArray()
		//System.out.println("Integer array: "+Arrays.toString(integerArr));
		sArr = sList.stream().toArray(size -> new String[size]);
*/
	}

}
