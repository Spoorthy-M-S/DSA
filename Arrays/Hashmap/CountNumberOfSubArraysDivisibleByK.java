package DSA.Arrays.Hashmap;

import java.util.HashMap;

public class CountNumberOfSubArraysDivisibleByK {
    public static int bett(int arr[], int k, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            int req = sum % k;
            if (req < 0) {
                req += k;
            }
            if (map.containsKey(req)) {
                cnt += map.get(req);
                map.put(req, map.get(req) + 1);
            } else if (!map.containsKey(req)) {
                map.put(req, 1);
            }
        }
        return cnt;
    }
}
