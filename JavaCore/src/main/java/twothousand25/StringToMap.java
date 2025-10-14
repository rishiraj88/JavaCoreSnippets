package twothousand25;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

// https://www.youtube.com/watch?v=ezy4AlThN_8
public class StringToMap {
        public static void main(String[] args) {
                String str1 = "welcome to my coding cure";
                Map<String, Integer> wordLengths = Arrays.stream(str1.split(" "))
                                .collect(Collectors.toMap(word -> word, String::length));
                System.out.println(wordLengths);

                // to preserve order
                Map<String, Integer> result = Arrays.stream(str1.split(" "))
                                .collect(Collectors.toMap(word -> word, String::length,
                                                (existing, replacement) -> existing, LinkedHashMap::new));
                System.out.println(result);

                // to sort
                result = Arrays.stream(str1.split(" "))
                                .collect(Collectors.toMap(word -> word, String::length))
                                .entrySet()
                                .stream()
                                .sorted(Map.Entry.comparingByKey())
                                .collect(Collectors.toMap(
                                                Map.Entry::getKey,
                                                Map.Entry::getValue,
                                                (e1, e2) -> e1,
                                                LinkedHashMap::new));
                System.out.println(result);

        }
}
