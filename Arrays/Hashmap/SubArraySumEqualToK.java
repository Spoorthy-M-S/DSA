package DSA.Arrays.Hashmap;

import java.util.HashMap;

public class SubArraySumEqualToK {
    public static int optimal(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int n = arr.length;
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int r = (sum - k);
            if (map.containsKey(r)) {
                cnt += map.get(r);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}
