package DSA.DynamicProgramming.S4String;
import java.util.*;
public class Q1LCS {
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

    public static int tab(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {

        }
        return 1;
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }
        return r(text1, text2, text1.length(), text2.length(), dp);
    }

    public static void main(String[] args) {
        String s1 = "asas";
        String s2 = "sas";
        System.out.println(longestCommonSubsequence(s1, s2));
    }
}
