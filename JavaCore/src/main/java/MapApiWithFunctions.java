import java.util.Map;
import java.util.function.BiFunction;

public class MapApiWithFunctions {
    // to add one entry if no entry is found for the specified key
    // Only key can be used for computation.
    public static <K,V> void addEntry(Map<K,V> map, K key,V value) {
        map.computeIfAbsent(key,k -> value);
    }

    // to replace the entry if an entry is found for the specified key.
    // Old value as well as key can be used for computation.
    public static <K,V> void replaceEntry(Map<K,V> map, K key,BiFunction<K,V,V> calculateNewValueFromKeyAndOldValue) {
        map.computeIfPresent(key,calculateNewValueFromKeyAndOldValue);
    }

    // to replace all entries found for the keys in map.
    // Respective old values as well as keys can be used for computating the new values.
    public static <K,V> void replaceEntries(Map<K,V> map, BiFunction<K,V,V> calculateNewValueFromKeyAndOldValue) {
        map.replaceAll(calculateNewValueFromKeyAndOldValue);
    }
}
