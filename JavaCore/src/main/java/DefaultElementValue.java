/**
 * 
 * @author rishiraj
 * to test default values of elements of array
 */
public class DefaultElementValue {
 public static void main(String[] args) {
	int[] intArr = new int[10];
	intArr[0] = 2;
	
	System.out.println(intArr[3]);
	for(int i : intArr) {
		System.out.println("i: "+i);
	}
}
}
