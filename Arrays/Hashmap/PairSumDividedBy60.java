package DSA.Arrays.Hashmap;

import java.util.HashMap;

public class PairSumDividedBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int cnt = 0;
        int n = time.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int r = Math.abs(time[i] % 60);
            if (map.containsKey(60 - r)) {
                cnt += map.get(60 - r);
            }
            if (r != 0) {
                map.put(r, map.getOrDefault(r, 0) + 1);
            } else {
                map.put(60, map.getOrDefault(60, 0) + 1);
            }
        }
        return cnt;
    }
}
