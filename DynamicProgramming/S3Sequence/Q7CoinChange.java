package DSA.DynamicProgramming.S3Sequence;
import java.util.*;
public class Q7CoinChange {
    public static int r(int c[], int A, int idx, int dp[][]) {
        if (idx == 0) {
            if (A % c[0] == 0) {
                return A / c[0];
            }
            return (int) Math.pow(10, 9);
        }
        if (dp[idx][A] != -1) {
            return dp[idx][A];
        }
        int pic = (int) Math.pow(10, 9);
        if (A >= c[idx]) {
            pic = 1 + r(c, A - c[idx], idx, dp);
        }
        int np = r(c, A, idx - 1, dp);
        return dp[idx][A] = Math.min(pic, np);
    }

    public static int tabu(int c[], int a, int idx, int dp[][]) {
        for (int i = 0; i <= a; i++) {
            dp[0][i] = i % c[0] == 0 ? i / c[0] : (int) Math.pow(10, 9);
        }
        for (int i = 1; i < c.length; i++) {
            for (int A = 0; A <= a; A++) {
                int pic = (int) Math.pow(10, 9);
                if (A >= c[i]) {
                    pic = 1 + dp[i][A - c[i]];
                }
                int np = dp[i - 1][A];
                dp[i][A] = Math.min(pic, np);
            }
        }
        return dp[c.length - 1][a];

    }

    public static int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }
        int rr = tabu(coins, amount, coins.length - 1, dp);
        if (rr == (int) Math.pow(10, 9)) {
            return -1;
        }
        return rr;
    }
    public static void main(String[] args) {
        int c[]={1,3,2,1};
        int a=3;
        System.out.println(coinChange(c, a));
    }

}
