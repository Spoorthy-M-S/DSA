package ImplementationOfDataStructures;

import java.util.LinkedList;
import java.util.ArrayList;

public class HashmapImplementation {
    static class HashMap<K, V> { // Generics

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private static int n = 0;
        private static int N = 4;
        private LinkedList<Node> bucket[];

        public HashMap() {
            this.n = 0;
            this.bucket = new LinkedList[N];
            for (int i = 0; i < 4; i++) {
                bucket[i] = new LinkedList<>();
            }
        }

        public void putt(K key, V value) {
            int bi = hashFunction(key);
            int di = serachInLL(key, bi);
            if (di != -1) {
                Node node = bucket[bi].get(di);
                node.value = value;
                n++;
            } else {
                bucket[bi].add(new Node(key, value));
            }
            double lambda = (double) n / N;
            if (lambda > 2) {
                rehash();
            }
        }

        public void rehash() {
            LinkedList<Node> oldBucket[] = bucket;
            N = 2 * N;
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    putt(node.key, node.value);
                }
            }
        }

        public int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        public int serachInLL(K key, int bi) {
            LinkedList<Node> ll = bucket[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = serachInLL(key, bi);
            if (di != -1) {
                return true;
            }
            return false;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = serachInLL(key, bi);
            if (di != -1) {
                Node node = bucket[bi].get(di);
                return node.value;
            }
            return null;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> arr = new ArrayList<>();
            for (int i = 0; i < bucket.length; i++) {
                LinkedList<Node> ll = bucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    arr.add(ll.get(j).key);
                }
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.putt("APPLE", 4);
        map.putt("Mango", 7);
        map.putt("Berry", 9);
        map.putt("Grapes", 0);
        map.putt("DD", 0);
        ArrayList<String> set = map.keySet();

        for (int i = 0; i < set.size(); i++) {
            System.out.println(set.get(i) + "->" + map.get(set.get(i)));
        }

        // System.out.println(map.containsKey("APPLeE"));

    }

}
