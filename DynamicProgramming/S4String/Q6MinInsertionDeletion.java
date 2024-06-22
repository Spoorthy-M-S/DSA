package DSA.DynamicProgramming.S4String;
import java.util.*;
public class Q6MinInsertionDeletion {
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

    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int r[]:dp){
            Arrays.fill(r,-1);
        }
        int size=r(word1,word2,n,m,dp);
        int dele=n-size;
        int inse=m-size;
        return n+m-(2*size);
    }
    public static void main(String[] args) {
        String s1="sea";
        String s2="eat";
        System.out.println(minDistance(s1, s2));
    }
}
