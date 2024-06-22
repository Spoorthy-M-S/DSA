package DSA.DynamicProgramming.S4String;
import java.util.*;
public class Q5MinimumInsertionsToMakeStringPalindrome {
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
    public static int minInsertions(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        int dp[][]=new int[n+1][n+1];
        for(int r[]:dp){
            Arrays.fill(r,-1);
        }
        int len=r(s,sb.toString(),n,n,dp);
        return n-len;
    }
    public static void main(String[] args) {
        String s="zvb";
        System.out.println(minInsertions(s));
    }
}
