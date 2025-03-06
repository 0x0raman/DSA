package neetcode._4BinarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@SuppressWarnings("unused")
public class _6timeBasedKeyValueStore {

    private Map<String, TreeMap<Integer, String>> m;

    // private Map<String, List<Pair<Integer, String>>> keyStore;
    public _6timeBasedKeyValueStore() {
        m = new HashMap<>();

        // keyStore = new HashMap<>();
    }
    
    private void set(String key, String value, int timestamp) {
        m.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);

        // keyStore.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair<>(timestamp, value));
    }
    
    private String get(String key, int timestamp) {
        if(!m.containsKey(key)) return "";
        TreeMap<Integer, String> timestamps = m.get(key);
        Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();

        // List<Pair<Integer, String>> values = keyStore.getOrDefault(key, new ArrayList<>());
        // int left = 0, right = values.size() - 1;
        // String result = "";

        // while (left <= right) {
        //     int mid = left + (right - left) / 2;
        //     if (values.get(mid).getKey() <= timestamp) {
        //         result = values.get(mid).getValue();
        //         left = mid + 1;
        //     } else {
        //         right = mid - 1;
        //     }
        // }

        // return result;
    }

    // private static class Pair<K, V> {
    //     private final K key;
    //     private final V value;

    //     public Pair(K key, V value) {
    //         this.key = key;
    //         this.value = value;
    //     }

    //     public K getKey() {
    //         return key;
    //     }

    //     public V getValue() {
    //         return value;
    //     }
    // }
}
//TC : O(1) for set() and O(logn) for get()
//SC : O(m*n)