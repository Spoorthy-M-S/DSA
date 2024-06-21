package DSA.DynamicProgramming.S2Grids;
import java.util.*;
public class Q1Ninjas {
    public static int Rmaxi(int arr[][], int day, int last) {
        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i < arr[0].length; i++) {
                if (last != i) {
                    maxi = Math.max(maxi, arr[day][i]);
                }
            }
            return maxi;
        }
        int maxi = 0;
        for (int i = 0; i < arr[0].length; i++) {
            if (i != last) {
                int pic = arr[day][i] + Rmaxi(arr, day - 1, i);
                maxi = Math.max(maxi, pic);
            }
        }
        return maxi;
    }

    public static int memo(int arr[][], int day, int last, int dp[][]) {
        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i < arr[0].length; i++) {
                if (last != i) {
                    maxi = Math.max(maxi, arr[day][i]);
                }
            }
            return dp[day][last] = maxi;
        }
        if (last != -1) {
            if (dp[day][last] != -1) {
                return dp[day][last];
            }
        }
        int maxi = 0;
        for (int i = 0; i < arr[0].length; i++) {
            if (i != last) {
                int pic = arr[day][i] + memo(arr, day - 1, i, dp);
                maxi = Math.max(maxi, pic);
            }
        }
        if (last != -1) {
            dp[day][last] = maxi;
        }
        return maxi;
    }

    public static int tab(int arr[][]) {
        int dp[][] = new int[arr.length + 1][arr[0].length + 1];
        dp[0][0] = Math.max(arr[0][1], arr[0][2]);
        dp[0][1] = Math.max(arr[0][0], arr[0][2]);
        dp[0][2] = Math.max(arr[0][1], arr[0][0]);
        dp[0][3] = Math.max(Math.max(arr[0][1], arr[0][0]), arr[0][2]);
        for (int day = 1; day < arr.length; day++) {
            for (int last = 0; last <= arr[0].length; last++) {
                int maxi = 0;
                for (int task = 0; task <= 2; task++) {
                    if (task != last) {
                        int pic = arr[day][task] + dp[day - 1][task];
                        maxi = Math.max(dp[day][last], pic);
                    }
                    dp[day][last] = maxi;
                }
            }

        }
        return dp[arr.length - 1][3];
    }

    public static int ninjaTraining(int n, int points[][]) {
        // return maxi(points,points.length-1,-1);
        int dp[][] = new int[points.length + 1][points[0].length + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }
        // return memo(points,points.length-1,-1,dp);
        return tab(points);
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{2,3,4},{1,2,3}};
        System.out.println(ninjaTraining(arr.length, arr));
    }

}
