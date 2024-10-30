import org.slf4j.helpers.MessageFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//linkedin java assessment
class Main {
    public static void main(String[] args) {
        // Lists
        String[] array = new String[]{"A", "B", "C"};
        List<String> list1 = Arrays.asList(array);
        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
        System.out.print(list1.equals(list2));
        System.out.print(list1.equals(list3));
        //String
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
        //Map
        Map<String, String> inventory = new HashMap<>();
        MapApiWithFunctions.addEntry(inventory, "STAT1001", "pencil 2H");
        MapApiWithFunctions.addEntry(inventory, "STAT1002", "pencil HB");
        MapApiWithFunctions.addEntry(inventory, "STAT1003", "pencil 3B");
        inventory.forEach((k,v) -> System.out.println(k+":"+v));

        MapApiWithFunctions.replaceEntry(inventory, "STAT1001", (k, v) -> "pencil HH");
        MapApiWithFunctions.replaceEntry(inventory, "STAT1002", (k, v) -> "pencil 00");
        MapApiWithFunctions.replaceEntry(inventory, "STAT1003", (k, v) -> "pencil BBB");
        inventory.forEach((k,v) -> System.out.println(k+":"+v));

        MapApiWithFunctions.replaceEntries(inventory,(k,v)-> "art "+v);
        inventory.forEach((k,v) -> System.out.println(k+":"+v));

    }
}