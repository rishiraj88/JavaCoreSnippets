import java.util.Arrays;

/**
 * @author rishiraj
 * 
 * to separate zeros from non-zeros in an integer array
 *
 */
public class ZeroAndNonZero {
	public static void main(String[] args) {

		int[] arr = { 2, 34, 6, 7, -2, 0, 3-9, 3, 4, 00, 4, 5, 20, 0, 0, 0, 2, 11 };
		
//		arr = new int[]{};
		arr = sortZeros(arr);
		System.out.println(Arrays.toString(arr));
	}

	static int[] sortZeros(int[] inputArr) {
		int[] outputArr = new int[inputArr.length];
		
		int outIndex = 0;
		for(int inIndex=0;inIndex<inputArr.length;inIndex++) {
			if(0 != inputArr[inIndex]) {
				outputArr[outIndex++] = inputArr[inIndex];
			}
		}
	return outputArr;	
	}
}
