package java14;

public class InstanceofPatternMatching {
	public static void main(String[] args) {
		Object user = "rishiraj";

		// Older approach
		if (user instanceof String) {
			String userName = (String) user;
			System.out.println("User name is: " + userName);
		}

		// "Java 14 and later" approach
		if (user instanceof String userName) {
			System.out.println("User name is: " + userName);
		}

	}
}
