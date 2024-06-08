package DSA.Arrays.S2Medium;

import java.util.HashMap;

public class Q1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int r = target - nums[i];
            if (map.containsKey(r)) {
                return new int[] { map.get(r), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int k=9;
        int ans[]=twoSum(arr,k);
        System.out.println(ans[0]+" "+ans[1]);

    }

}
