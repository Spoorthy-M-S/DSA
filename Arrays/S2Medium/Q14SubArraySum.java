package DSA.Arrays.S2Medium;
import java.util.HashMap;
public class Q14SubArraySum {
    public static int brute(int nums[], int k) {
        int cnt = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

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

    public static int subarraySum(int[] nums, int k) {
        if (nums.length == 1) {
            if (nums[0] == k) {
                return 1;
            }
        }
        return optimal(nums, k);
    }

    public static void main(String[] args) {
        int arr[]={1,1,1};
        System.out.println(subarraySum(arr, 2));
    }
}
