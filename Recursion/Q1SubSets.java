import java.util.ArrayList;
import java.util.List;

public class Q1SubSets {
    public static void powerSet(int arr[], List<List<Integer>> ans) {
        int n = arr.length;
        int subsets = (int) Math.pow(2, n);
        for (int i = 0; i < subsets; i++) {
            List<Integer> ds = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int d = (i) & (1 << j);
                if (d >= 1) {
                    ds.add(arr[j]);
                }
            }
            ans.add(new ArrayList(ds));
        }
    }

    public static void subSets(int arr[], int i, List<Integer> ds, List<List<Integer>> ans) {
        if (i == arr.length) {
            ans.add(new ArrayList(ds));
            return;
        }
        ds.add(arr[i]);
        subSets(arr, i + 1, ds, ans);
        ds.remove(ds.size() - 1);
        subSets(arr, i + 1, ds, ans);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        subSets(nums, 0, ds, ans);
        // powerSet(nums,ans);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(subsets(arr));

    }

}