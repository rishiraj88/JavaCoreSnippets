package java14;

public class SwitchExpressions {
	public static void main(String[] args) {
		System.out.println(stateNumberClass(0));
		System.out.println(stateNumberClass(2));
		System.out.println(stateNumberClass(4));
		System.out.println(stateNumberClass(3));
		System.out.println(stateNumberClass(-1));
	}
	
	static String stateNumberClass(int inputNumber) {
		// See the beauty and the brevity of code
		// break; is not needed to exit the switch when a match has been made
		return switch(inputNumber) {
		case 0 -> "zero";
		case 1,3,5,7,9 -> "odd";
		case 2,4,6,8,10 -> "even";
		default -> "Go REST with Gin. Weekend is at the doorstep.";		
		};
	}
}
