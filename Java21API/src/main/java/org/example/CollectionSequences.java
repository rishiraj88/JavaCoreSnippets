package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class CollectionSequences {
    public static void testCollectionSequences() {
        System.out.println("ArrayList example");
        var arrayList = new ArrayList<>(Arrays.asList("Banana", "Cherry", "Date"));
        arrayList.addFirst("Apple");
        arrayList.addLast("Elderberry");

        System.out.println(arrayList);
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());

        System.out.println("\nDeque example");
        var deque = new ArrayDeque<>(Arrays.asList("Banana", "Cherry", "Date"));
        deque.addFirst("Apple");
        deque.addLast("Elderberry");

        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println("\nLinkedHashSet example");
        var linkedHashSet = new LinkedHashSet<>(Arrays.asList("Banana", "Cherry", "Date"));
        linkedHashSet.addFirst("Apple");
        linkedHashSet.addLast("Elderberry");

        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.getFirst());
        System.out.println(linkedHashSet.getLast());
    }
}
