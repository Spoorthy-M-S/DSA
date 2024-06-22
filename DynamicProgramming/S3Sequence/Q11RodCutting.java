package DSA.DynamicProgramming.S3Sequence;
import java.util.*;
public class Q11RodCutting {

    public static int rod(int arr[], int idx, int N, int dp[][]) {
        if (idx == 0) {
            return (N * arr[0]);
        }
        if (dp[idx][N] != -1) {
            return dp[idx][N];
        }
        int nt = rod(arr, idx - 1, N, dp);
        int take = Integer.MIN_VALUE;
        int rodlen = idx + 1;
        if (rodlen <= N) {
            take = arr[idx] + rod(arr, idx, N - rodlen, dp);
        }
        return dp[idx][N] = Math.max(take, nt);
    }

    public static int memo(int arr[], int n) {
        int dp[][] = new int[arr.length][n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = i * arr[0];
        }
        for (int idx = 1; idx < arr.length; idx++) {
            for (int N = 0; N <= n; N++) {
                int nt = dp[idx - 1][N];
                int take = Integer.MIN_VALUE;
                int rodlen = idx + 1;
                if (rodlen <= N) {
                    take = arr[idx] + dp[idx][N - rodlen];
                }
                dp[idx][N] = Math.max(take, nt);
            }
        }
        return dp[arr.length - 1][n];
    }

    public static int cutRod(int price[], int n) {
        // Write your code here.
        int len = price.length;
        int dp[][] = new int[len][n + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }

        return memo(price, n);

    }
    public static void main(String[] args) {
        int p[]={1,2,3};
        System.out.println(cutRod(p, 5));
    }

}
