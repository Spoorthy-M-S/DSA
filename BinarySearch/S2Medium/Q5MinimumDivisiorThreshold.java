package BinarySearch.S2Medium;
import java.util.*;
public class Q5MinimumDivisiorThreshold {
    public static int f(int arr[], int n) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += Math.ceil((double) arr[i] / n);
        }
        return cnt;
    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        while (low <= high) {
            int mid = (low + high) / 2;
            int ans = f(nums, mid);
            if (ans <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 9 };
        System.out.println(smallestDivisor(arr, 6));
    }
}
