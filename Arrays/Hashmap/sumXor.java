package DSA.Arrays.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class sumXor {
    public static int subarraysXor(ArrayList<Integer> arr, int x) {
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int xor = 0;
        int cnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            xor = xor ^ arr.get(i);
            if (map.containsKey(xor ^ x)) {
                cnt += map.get(xor ^ x);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return cnt;
    }
}
