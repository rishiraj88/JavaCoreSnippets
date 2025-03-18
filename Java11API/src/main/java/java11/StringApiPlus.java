package java11;
/**
 * @author rishiraj
 * to demonstrate the new methods of String API (added in Java 11)
 */
public class StringApiPlus {
	public static void main(String[] args) {
		String s1 = "";
		String s2 = " ";
		String s3 = " d ";

		// isBlank()
		System.out.println("s1 blank: " + s1.isBlank());
		System.out.println("s2 blank: " + s2.isBlank());
		System.out.println("s3 blank: " + s3.isBlank());

		// lines()
		String s4 = "\nsdf sdfs\nsdfsdfs\nsdf sdf sd fs\n ";
		s4.lines().forEach(line -> System.out.println("Line in s4: >" + line+"<"));

		// strip()
		System.out.println("s1 stripped: >" + s1.strip() + "<");
		System.out.println("s2 stripped: >" + s2.strip() + "<");
		System.out.println("s3 stripped: >" + s3.strip() + "<");


		// stripLeading()
		System.out.println("s1 stripLeading: >" + s1.stripLeading() + "<");
		System.out.println("s2 stripLeading: >" + s2.stripLeading() + "<");
		System.out.println("s3 stripLeading: >" + s3.stripLeading() + "<");

		// stripTrailing()
		System.out.println("s1 stripTrailing: >" + s1.stripTrailing() + "<");
		System.out.println("s2 stripTrailing: >" + s2.stripTrailing() + "<");
		System.out.println("s3 stripTrailing: >" + s3.stripTrailing() + "<");

		// repeat()
		System.out.println("s2 5 times repeated: >" + s3.repeat(5) +"<");
	}
}
