package BinarySearch.S2Medium;
import java.util.*;
public class Q8AgressiveCows {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int mini = Arrays.stream(stalls).min().getAsInt();
        int maxi = Arrays.stream(stalls).max().getAsInt();
        int low = 1;
        int high = maxi - mini;
        while (low <= high) {
            int mid = (low + high) / 2;
            int ans = f(mid, stalls);
            if (ans >= k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static int f(int dis, int arr[]) {
        int cnt = 1;
        int prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - prev) >= dis) {
                cnt++;
                prev = arr[i];
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[]={0,3,4,7,10,9};
        System.out.println(aggressiveCows(arr, 4));
    }

}
