package DSA.DynamicProgramming.S3Sequence;
import java.util.*;
public class Q8TargetSum {
    public static int tot(int arr[], int idx, int sum, int dp[][]) {
        if (idx == 0) {
            if (sum == 0 && arr[idx] == sum) {
                return 2;
            }
            if (sum == 0 || arr[idx] == sum) {
                return 1;
            }
            return 0;
        }
        if (dp[idx][sum] != -1) {
            return dp[idx][sum];
        }
        int pic = 0;
        if (sum >= arr[idx]) {
            pic = tot(arr, idx - 1, sum - arr[idx], dp);
        }
        int np = tot(arr, idx - 1, sum, dp);
        return dp[idx][sum] = pic + np;
    }

    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int t = (sum - target);
        if (t < 0) {
            return 0;
        }
        if (t % 2 == 1) {
            return 0;
        }
        t = t / 2;
        int dp[][] = new int[nums.length][t + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }

        return tot(nums, nums.length - 1, t, dp);
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1};
        System.out.println(findTargetSumWays(arr, 3));


    }
}
