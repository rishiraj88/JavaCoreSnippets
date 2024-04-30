import java.util.HashMap;
import java.util.Map;

//19) How do you find duplicate elements in an array?
//https://javaconceptoftheday.com/java-array-interview-questions-and-answers/
public class FindDuplicatesInArrayByMap {
	public static void main(String[] args) {
		int[] a = { 2, 2, 2, 34, 3, 54, 56, 6, 6, 6, 5, 3, 34, 23, 2, 2, 5 };
		findDuplicatesInArray(a);
		
	}

	//with Map and without Stream API
	static void findDuplicatesInArray(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i : a) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(Integer k : map.keySet()) {
			if(map.get(k)>1) {
				System.out.print(k + " ");
			}
		}
	}
	
	
}
