import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size = 0;
        private int N; // number of buckets
        private LinkedList<Node>[] buckets; // array of buckets

        public HashMap() {
            N = 4;
            initBuckets(N);
        }

        @SuppressWarnings("unchecked")
        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLinkedList(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (key.equals(ll.get(i).key)) {
                    return i;
                }
            }
            return -1;
        }

        private double loadFactor() {
            return (double) size / N;
        }

        private void reHash() {
            LinkedList<Node>[] oldBuckets = buckets;
            N=N*2;
            initBuckets(N);
            size = 0;

            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                Node node = new Node(key, value);
                buckets[bi].addLast(node);
                size++;
            }

            if (loadFactor() >= 2.0) {
                reHash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            return searchInLinkedList(key, bi) != -1;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);
            if (di == -1) {
                return null;
            }
            return buckets[bi].get(di).value;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLinkedList(key, bi);
            if (di == -1) {
                return null;
            }
            size--;
            return buckets[bi].remove(di).value;
        }

        public Set<K> keySet() {
            Set<K> set = new HashSet<>();
            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    set.add(node.key);
                }
            }
            return set;
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            return size==0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("Value for key 'one': " + map.get("one"));
        System.out.println("Value for key 'two': " + map.get("two"));
        System.out.println("Value for key 'three': " + map.get("three"));

        map.remove("two");
        System.out.println("Value for key 'two' after removal: " + map.get("two"));

        System.out.println("Keys in the map: " + map.keySet());
        System.out.println("Does key 'one' exist? " + map.containsKey("one"));
        System.out.println("Does key 'two' exist? " + map.containsKey("two"));
    }
}
