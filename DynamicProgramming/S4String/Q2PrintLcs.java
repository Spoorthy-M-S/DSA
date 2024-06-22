package DSA.DynamicProgramming.S4String;

import java.util.*;

public class Q2PrintLcs {
    public static int r(String s1, String s2, int i, int j, int dp[][]) {
        if (i == 1 && j == 1) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                return 1;
            }
            return 0;
        }
        if (i == 0 || j == 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return 1 + r(s1, s2, i - 1, j - 1, dp);
        }
        return dp[i][j] = Math.max(r(s1, s2, i - 1, j, dp), r(s1, s2, i, j - 1, dp));
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "bdegk";
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n + 1][m + 1];
        r(s1, s2, n, m, dp);
        int i = n;
        int j = m;
        String s = "";
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                s += s1.charAt(i - 1);
                i--;
                j--;
            } else if (j > 1 && dp[i][j - 1] >= dp[i - 1][j]) {
                j--;
            } else {
                if (i > 1)
                    i--;
            }
        }
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
    }
}
