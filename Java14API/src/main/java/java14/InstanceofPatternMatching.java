package java14;

public class InstanceofPatternMatching {
	public static void main(String[] args) {
		Object obj = (Object) "user1";

		// Older approach
		if (obj instanceof String) {
			String str = (String) obj;
			System.out.println(str + 2 + 3);
		}

		// Java 14 approach and later
		if (obj instanceof String str) {
			System.out.println(str + 2 + 3);
		}

	}
}
