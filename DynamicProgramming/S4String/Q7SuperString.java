package DSA.DynamicProgramming.S4String;

import java.util.*;

public class Q7SuperString {
    public static void dp(String s1, String s2, int n, int m, int dp[][]) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
    }

    public static String ans(String s1, String s2, int n, int m, int dp[][]) {
        String s = "";
        int i = n;
        int j = m;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                s += s1.charAt(i - 1);
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                s += s1.charAt(i - 1);
                i--;
            } else {
                s += s2.charAt(j - 1);
                j--;
            }
        }
        while (i > 0) {
            s += s1.charAt(i - 1);
            i--;
        }
        while (j > 0) {
            s += s2.charAt(j - 1);
            j--;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        return sb.toString();
    }

    public static String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        dp(str1, str2, n, m, dp);
        return ans(str1, str2, n, m, dp);

    }
    public static void main(String[] args) {
        String s1 = "abab";
        String s2 = "aaa";
        System.out.println(shortestCommonSupersequence(s1, s2));
    }

}
