package DSA.DynamicProgramming.S3Sequence;
import java.util.*;
public class Q9CoinChange {
    public static int pc(int arr[], int sum, int idx, int dp[][]) {
        if (idx == 0) {
            if (sum % arr[idx] == 0) {
                return 1;
            }
            return 0;
        }
        if (dp[idx][sum] != -1) {
            return dp[idx][sum];
        }
        int pic = 0;
        if (sum >= arr[idx]) {
            pic = pc(arr, sum - arr[idx], idx, dp);
        }
        int np = pc(arr, sum, idx - 1, dp);
        return dp[idx][sum] = pic + np;
    }

    public static int tab(int arr[], int S) {
        int dp[][] = new int[arr.length][S + 1];
        for (int i = 0; i <= S; i++) {
            dp[0][i] = (i % arr[0] == 0 ? 1 : 0);
        }
        for (int i = 1; i < arr.length; i++) {
            for (int sum = 0; sum <= S; sum++) {
                int pic = 0;
                if (sum >= arr[i]) {
                    pic = dp[i][sum - arr[i]];
                }
                int np = dp[i - 1][sum];
                dp[i][sum] = pic + np;
            }
        }
        return dp[arr.length - 1][S];
    }

    public static int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length][amount + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }
        return tab(coins, amount);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(change(5, arr));
    }

}
