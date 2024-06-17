package DSA.Arrays.Hashmap;

import java.util.HashSet;
import java.util.Set;

public class LongestConsegutiveIncreasingArrayElements {
    public static int optimal(int arr[]) {
        Set<Integer> set = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int maxi = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int ele = i;
                int cnt = 0;
                while (set.contains(ele)) {
                    ele = ele + 1;
                    cnt = cnt + 1;
                }
                maxi = Math.max(maxi, cnt);
            }
        }
        return maxi;
    }
}
