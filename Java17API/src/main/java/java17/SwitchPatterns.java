package java17;

public class SwitchPatterns {
	public static void main(String[] args) {

		Object obj = Double.valueOf(4.00);

		// Older way
		System.out.println(formatter(obj));

		// Java 17 way
		System.out.println(formatterPatternSwitch(obj));
	}

	// older way
	static String formatter(Object o) {
		String formatted = "sentinel";

		if (o instanceof Integer i) { // new style of instanceof used here!!!
			formatted = String.format("Integer %d", i);
		} else if (o instanceof Long l) { // new style of instanceof used here!!!
			formatted = String.format("Long %d", l);
		} else if (o instanceof Double d) { // new style of instanceof used here!!!
			formatted = String.format("Double %f", d);
		} else if (o instanceof String s) { // new style of instanceof used here!!!
			formatted = String.format("String %s", s);
		} else {
			formatted = "unknown";
		}

		return formatted;
	}

	//TODO Check if it is Java 17+ way or only a Java 20+ facility
	static String formatterPatternSwitch(Object o) {
		return switch(o) {
		case Integer i -> String.format("Integer %d", i);
		case Long l -> String.format("Long %d", l);
		case Double d -> String.format("Integer %f", d);
		case String s -> String.format("String %s", s);
		default -> o.toString();
		};
	}

	// Java 17 way
	static void testTriangle(Shape s) {
		if(s instanceof Triangle t && t.calculateArea() > 10)
			System.out.println("Big triangle");
		else
			System.out.println("Not a big triangle");
		}
	}

class Triangle extends Shape {
	int a,b,c;
	
	double calculateArea() {
		double s = (a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
	}
}

abstract class Shape {	abstract double calculateArea(); }


