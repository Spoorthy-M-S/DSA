package DSA.DynamicProgramming.S2Grids;

import java.util.*;

public class Q2UniquePaths {
    public static int rec(int n, int m) {
        if (n == 0 && m == 0) {
            return 1;
        }
        if (n < 0 || m < 0) {
            return 0;
        }

        int t = rec(n - 1, m);
        int nt = rec(n, m - 1);
        return t + nt;
    }

    public static int memo(int n, int m, int dp[][]) {
        if (n == 0 && m == 0) {
            return 1;
        }
        if (n < 0 || m < 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        int t = memo(n - 1, m, dp);
        int nt = memo(n, m - 1, dp);
        return dp[n][m] = t + nt;
    }

    public static int tab(int n, int m) {
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int t = dp[i - 1][j];
                int nt = dp[i][j - 1];
                dp[i][j] = t + nt;
            }
        }
        return dp[n - 1][m - 1];
    }

    public static int uniquePaths(int m, int n) {
        int dp[][] = new int[n + 1][m + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }
        // return memo(n-1,m-1,dp);
        return tab(n, m);
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(2, 3));
    }

}
