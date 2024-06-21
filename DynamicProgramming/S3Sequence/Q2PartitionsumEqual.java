package DSA.DynamicProgramming.S3Sequence;

public class Q2PartitionsumEqual {
    public static boolean sum(int arr[], int k, int idx, int dp[][]) {
        if (k == 0) {
            return true;
        }
        if (idx == 0) {
            return arr[0] == k;
        }
        if (dp[idx][k] != -1) {
            return dp[idx][k] == 1;
        }
        boolean nt = sum(arr, k, idx - 1, dp);
        boolean t = false;
        if (arr[idx] <= k) {
            t = sum(arr, k - arr[idx], idx - 1, dp);
        }
        dp[idx][k] = (t || nt ? 1 : 0);
        return t || nt;
    }

    public static boolean tab(int arr[], int k, boolean dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        if (arr[0] <= k) {
            dp[0][arr[0]] = true;
        }
        for (int idx = 1; idx < arr.length; idx++) {
            for (int tar = 1; tar < k + 1; tar++) {
                boolean nt = dp[idx - 1][tar];
                boolean take = false;
                if (tar >= arr[idx]) {
                    take = dp[idx - 1][tar - arr[idx]];
                }
                dp[idx][tar] = take || nt;
            }
        }
        return dp[arr.length - 1][k];
    }

    public static boolean space(int arr[], int k) {
        boolean prev[] = new boolean[k + 1];
        boolean curr[] = new boolean[k + 1];
        if (arr[0] <= k) {
            prev[0] = true;
            curr[0] = true;
        }
        for (int idx = 1; idx < arr.length; idx++) {
            for (int j = 1; j < k + 1; j++) {
                boolean nt = prev[j];
                boolean t = false;
                if (arr[idx] <= j) {
                    t = prev[j - arr[idx]];
                }
                curr[j] = t || nt;
            }
            prev = curr;
        }
        return prev[prev.length - 1];
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        if (sum % 2 == 1) {
            return false;
        }
        boolean dp[][] = new boolean[nums.length][(sum / 2) + 1];
        // for(int r[]:dp){
        // Arrays.fill(r,-1);
        // }
        return tab(nums, sum / 2, dp);
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2};
        System.out.println(canPartition(arr));
    }

}
