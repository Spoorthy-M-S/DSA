package BinarySearch.S2Medium;
import java.util.*;
public class Q9PageAllocation {
    public static int mini(ArrayList<Integer> arr, int n, int m) {
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int ans = f(arr, mid);
            if (ans <= m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int f(ArrayList<Integer> arr, int T) {
        int cnt = 0;
        int t = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (t + arr.get(i) <= T) {
                t += arr.get(i);
            } else {
                cnt++;
                t = arr.get(i);
            }
        }
        if (t <= T) {
            cnt++;
        }
        return cnt;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if (m > n) {
            return -1;
        }
        return mini(arr, n, m);
    }
    public static void main(String[] args) {
        //int arr[]={12, 34, 67, 90};
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(12); arr.add(34); arr.add(67); arr.add(90);
        System.out.println(findPages(arr, 4, 2));
    }

}
