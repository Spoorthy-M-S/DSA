package DSA.DynamicProgramming.S4String;
import java.util.*;
public class Q8TotalSubStringEqualToSinT {
    public static int r(String s1, String s2, int i, int j, int dp[][]) {
        if (j <= 0) {
            return 1;
        }
        if (i <= 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return dp[i][j] = r(s1, s2, i - 1, j - 1, dp) + r(s1, s2, i - 1, j, dp);
        } else {
            return dp[i][j] = r(s1, s2, i - 1, j, dp);
        }
    }

    public static int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }
        return r(s, t, n, m, dp);
    }
    public static void main(String[] args) {
        String s="abc";
        String s2="aabbc";
        System.out.println(numDistinct(s2, s));
    }
}
