package neetcode._6LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@SuppressWarnings("unused")
class Node{
    int key;
    int val;
    Node prev;
    Node next;
    Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
public class _8LRUcache {
    private HashMap<Integer, Node> cache;
    private int cap;
    private Node left, right; // dummy head (left) and dummy tail (right) nodes
    private _8LRUcache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        // Initialize dummy head and tail
        this.left = new Node(0, 0); 
        this.right = new Node(0, 0);
        // Connect left and right
        this.left.next = this.right;
        this.right.prev = this.left;
    }
    // Think of removing middle node in a double linkedlist
    private void remove(Node node) {
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;    
    }
    // Insert a node at the MRU position (before dummy right)
    private void insert(Node node) {
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
    }
    // Get value by key, if exists, move it to MRU position
    @SuppressWarnings("unused")
    private int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node); // Remove from current position
            insert(node); // Insert at MRU position
            return node.val;
        }
        return -1;
    }
    // Put key-value in cache
    @SuppressWarnings("unused")
    private void put(int key, int value) {
        // If key exists, remove it from DLL
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }
        // Create new node & insert at MRU position
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);
        // If cache exceeds capacity, evict LRU node
        if(cache.size() > cap) {
            Node lru = this.left.next; // LRU node is next to dummy left
            remove(lru); // Remove from DLL
            cache.remove(lru.key); // Remove from hashmap
        }
    }
    // TC : O(1) for both get() & put() op
    // SC : O(n)
}
// ------------------------------------------------
@SuppressWarnings("unused")
class LRUCacheBruteForce {
    private ArrayList<int[]> cache;
    private int capacity;
    public LRUCacheBruteForce(int capacity) {
        this.cache = new ArrayList<>();
        this.capacity = capacity;
    }
    private int get(int key) {
        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i)[0] == key) {
                int[] tmp = cache.remove(i);
                cache.add(tmp);
                return tmp[1];
            }
        }
        return -1;
    }
    private void put(int key, int value) {
        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i)[0] == key) {
                int[] tmp = cache.remove(i);
                tmp[1] = value;
                cache.add(tmp);
                return;
            }
        }
        if (capacity == cache.size()) {
            cache.remove(0);
        }
        cache.add(new int[]{key, value});
    }
    // TC : O(n) for both get() & put() op
    // SC : O(n)
}
// -------------------------------
@SuppressWarnings("unused")
class LRUCacheBuiltIn {
    private final Map<Integer, Integer> cache;
    private final int capacity;

    private LRUCacheBuiltIn(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > LRUCacheBuiltIn.this.capacity;
            }
        };
    }

    private int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    private void put(int key, int value) {
        cache.put(key, value);
    }
    // TC : O(1) for both get() & put() op
    // SC : O(n)
}