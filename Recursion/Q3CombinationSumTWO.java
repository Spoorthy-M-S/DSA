package Recursion;

import java.util.*;

public class Q3CombinationSumTWO {
    public static void combinationsum(int arr[], int idx, List<List<Integer>> ans, List<Integer> ds, int target) {
        if (target == 0) {
            ans.add(new ArrayList(ds));
        }
        for (int i = idx; i < arr.length; i++) {
            if (i != idx && arr[i] == arr[i - 1]) {
                continue;
            }
            if (target < arr[i]) {
                break;
            }
            ds.add(arr[i]);
            combinationsum(arr, i + 1, ans, ds, target - arr[i]);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combinationsum(candidates, 0, ans, ds, target);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        System.out.println(combinationSum2(arr, 8));
    }

}
