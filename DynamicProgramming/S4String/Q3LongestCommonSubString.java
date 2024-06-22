package DSA.DynamicProgramming.S4String;

public class Q3LongestCommonSubString {
    public static void main(String[] args) {
        String s1 = "abcjklp";
        String s2 = "acjkf";
        int n = s1.length();
        int m = s2.length();
        int si = 1;
        int sj = 1;
        int dp[][] = new int[n + 1][m + 1];
        int prev = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (prev <= dp[i][j]) {
                        prev = dp[i][j];
                        si = i;
                        sj = j;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        for (int ii = 0; ii < n; ii++) {
            for (int h = 0; h <= m; h++) {
                System.out.print(dp[ii][h] + " ");
            }
            System.out.println();
        }
        System.out.println(si);
        System.out.println(sj);
        String ans = "";
        while (si >= 0 && sj >= 0) {
            if (s1.charAt(si - 1) == s2.charAt(sj - 1)) {
                ans += s1.charAt(si - 1);
                si--;
                sj--;
            } else {
                break;
            }
        }
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();
        System.out.println(sb);
    }

}
