package DSA.DynamicProgramming.S3Sequence;
import java.util.*;
public class Q6Kanpsack {
    public static int maxi(int W, int idx, int w[], int v[]) {
        if (idx < 0) {
            return 0;
        }
        if (idx == 0) {
            if (w[idx] <= W) {
                return v[idx];
            }
            return 0;
        }
        int pic = Integer.MIN_VALUE;
        if (W >= w[idx]) {
            pic = v[idx] + maxi(W - w[idx], idx - 1, w, v);
        }
        int np = maxi(W, idx - 1, w, v);
        return Math.max(pic, np);
    }

    public static int memo(int W, int idx, int w[], int v[], int dp[][]) {
        if (idx == 0) {
            if (w[idx] <= W) {
                return v[0];
            }
            return 0;
        }
        if (dp[idx][W] != -1) {
            return dp[idx][W];
        }
        int pic = Integer.MIN_VALUE;
        if (W >= w[idx]) {
            pic = v[idx] + memo(W - w[idx], idx - 1, w, v, dp);
        }
        int np = memo(W, idx - 1, w, v, dp);
        return dp[idx][W] = Math.max(pic, np);
    }

    public static int tab(int W, int w[], int v[]) {
        int dp[][] = new int[w.length][W + 1];
        for (int i = w[0]; i <= W; i++) {
            dp[0][i] = v[0];
        }
        for (int idx = 1; idx < w.length; idx++) {
            for (int we = 0; we <= W; we++) {
                int pic = Integer.MIN_VALUE;
                if (we >= w[idx]) {
                    pic = v[idx] + dp[idx - 1][we - w[idx]];
                }
                int np = dp[idx - 1][we];
                dp[idx][we] = Math.max(pic, np);
            }
        }
        return dp[dp.length - 1][W];
    }

    public static int space(int W, int w[], int v[]) {
        int prev[] = new int[W + 1];
        // int curr[]=new int[W+1];
        for (int i = w[0]; i <= W; i++) {
            prev[i] = v[0];
        }
        for (int idx = 1; idx < w.length; idx++) {
            for (int we = W; we >= 0; we--) {
                int pic = Integer.MIN_VALUE;
                if (we >= w[idx]) {
                    pic = v[idx] + prev[we - w[idx]];
                }
                int np = prev[we];
                prev[we] = Math.max(pic, np);
            }
        }
        return prev[W];

    }

    public static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
        int dp[][] = new int[weight.length][maxWeight + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }
        return space(maxWeight, weight, value);
    }
    public static void main(String[] args) {
        int w[]={1,2,1,4};
        int v[]={1,2,3,4};
        int W=4;
        System.out.println(knapsack(w, v, w.length, W));
    }

}
