import org.slf4j.helpers.MessageFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//linkedin java assessment
class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"A", "B", "C"};
        List<String> list1 = Arrays.asList(array);
        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
        System.out.print(list1.equals(list2));
        System.out.print(list1.equals(list3));

        //ArrayList words = Arrays.asList("Hello", "World");
        String s = "hello %s!";
        s = String.format(s, "world");
        System.out.println(s);
		//assertEquals(s, "hello world!"); // should be true

        //The slf4J uses org.slf4j.helpers.MessageFormatter The code looks like this:
        String str = "Hello this is {} string {}";
        str = MessageFormatter.format(str, "hello", "world").getMessage();
        System.out.println();
        System.out.println(str);
    }
}