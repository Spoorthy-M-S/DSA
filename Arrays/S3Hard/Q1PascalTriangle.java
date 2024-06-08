package DSA.Arrays.S3Hard;

import java.util.ArrayList;
import java.util.List;

public class Q1PascalTriangle {
    public static int ele(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static List<Integer> row(int r) {
        List<Integer> row = new ArrayList<>();
        for (int i = 1; i <= r; i++) {
            int el = ele(r - 1, i - 1);
            row.add(el);
        }
        return row;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> line = new ArrayList<>();
            line = row(i);
            ans.add(new ArrayList(line));
        }
        return ans;
    }

    public static void main(String[] args) {
        int r=5;
        List<List<Integer>>ans=new ArrayList<>();
        ans=generate(r);
        System.out.println(ans);

    }

}
