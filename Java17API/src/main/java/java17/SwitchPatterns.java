package java17;

import java.awt.*;

public class SwitchPatterns {
    public static void main(String[] args) {
        Object obj = 4.50;
        // Java 14 way
        System.out.println(formatter(obj));
        // Java 17 way
        testTriangle(new Triangle(1, 1, 1));
        // Java 21 way
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

    // Java 21 way
    static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("Integer %d", i);
            case Long l -> String.format("Long %d", l);
            case Double d -> String.format("Integer %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

    // Java 17 way
    static void testTriangle(Shape s) {
        if (s instanceof Triangle t && t.calculateArea() > 10)
			System.out.println("Big triangle");
        else /*small triangle or not a triangle at all*/
			System.out.println("Not a big triangle");
    }
}

class Triangle extends Shape {
    Triangle(float a, float b, float c) {
        super(a, b, c);
    }

    double calculateArea() {
        double s = (a + b + c) / 2.0;
        System.out.println("area: " + (s * (s - a) * (s - b) * (s - c)));
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

abstract class Shape {
    float a, b, c;

    Shape(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    abstract double calculateArea();
}



