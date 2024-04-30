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
		System.out.println("String blank: " + s1.isBlank());
		System.out.println("String blank: " + s2.isBlank());
		System.out.println("String blank: " + s3.isBlank());

		// lines()
		String s4 = "\nsdf sdfs\nsdfsdfs\nsdf sdf sd fs\n ";
		s4.lines().forEach(line -> System.out.println("Line: " + line));

		// strip()
		System.out.println("String strip:" + s1.strip() + ":End");
		System.out.println("String strip:" + s2.strip() + ":End");
		System.out.println("String strip:" + s3.strip() + ":End");


		// stripLeading()
		System.out.println("String stripLeading:" + s1.stripLeading() + ":End");
		System.out.println("String stripLeading:" + s2.stripLeading() + ":End");
		System.out.println("String stripLeading:" + s3.stripLeading() + ":End");

		// stripTrailing()
		System.out.println("String stripTrailing:" + s1.stripTrailing() + ":End");
		System.out.println("String stripTrailing:" + s2.stripTrailing() + ":End");
		System.out.println("String stripTrailing:" + s3.stripTrailing() + ":End");

		// repeat()
		System.out.println("String repeat:" + s3.repeat(5));
	}
}
