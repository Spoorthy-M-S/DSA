package DSA.Arrays.S3Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q3ThreeSum {
    public static void brute(int arr[], Set<List<Integer>> set) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                        set.add(new ArrayList(temp));
                    }
                }
            }
        }
    }

    public static void better(int arr[], Set<List<Integer>> set) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            HashMap<Integer, Integer> map = new HashMap<>();
            int j = i + 1;
            while (j < n) {
                int a = sum + arr[j];
                int r = -(a);
                if (map.containsKey(r)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(r);
                    Collections.sort(temp);
                    set.add(new ArrayList(temp));
                }
                map.put(arr[j], j);
                j++;
            }
        }
    }

    public static void optimal(int arr[], List<List<Integer>> set) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i >= 1 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    set.add(new ArrayList(temp));
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }

            }
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        optimal(nums, ans);
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,0,1,1,-1,-1};
        List<List<Integer>>ans=threeSum(arr);
        System.out.println(ans);
    }

}
