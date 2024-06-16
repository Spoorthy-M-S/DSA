package DSA.Arrays.S2Medium;

import java.util.*;

class Q13SpiralMatrix {
    public static void ans(int arr[][], List<Integer> ans) {
        int n = arr.length;
        int m = arr[0].length;
        int p1 = 0;// ->m
        int p2 = 0;// ->n
        int p3 = m - 1;// ->0
        int p4 = n - 1;// ->0
        while (p1 <= p3 && p2 <= p4) {
            for (int j = p1; j <= p3; j++) {
                ans.add(arr[p2][j]);
            }
            p2++;
            for (int i = p2; i <= p4; i++) {
                ans.add(arr[i][p3]);
            }
            p3--;
            if (p2 <= p4) {
                for (int j = p3; j >= p1; j--) {
                    ans.add(arr[p4][j]);
                }
                p4--;
            }

            if (p1 <= p3) {
                for (int i = p4; i >= p2; i--) {
                    ans.add(arr[i][p1]);
                }
                p1++;
            }

        }

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        ans(matrix, ans);
        return ans;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans=spiralOrder(arr);
        System.out.println(ans);
    }
}