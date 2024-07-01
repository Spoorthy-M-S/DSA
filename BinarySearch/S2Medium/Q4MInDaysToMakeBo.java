package BinarySearch.S2Medium;
import java.util.*;
public class Q4MInDaysToMakeBo {
    public static int f(int arr[], int k, int m, int day) {
        int cnt = 0;
        int flr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                flr++;
            }
            else {
                cnt += flr / k;
                flr = 0;
            }
        }
        cnt += flr / k;
        return cnt;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int low = -1;
        int high = Arrays.stream(bloomDay).max().getAsInt();
        while (low <= high) {
            int mid = (low + high) / 2;
            int gett = f(bloomDay, k, m, mid);
            if (gett >= m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low > Arrays.stream(bloomDay).max().getAsInt()) {
            return -1;
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={7,7,7,7,12,7,7,};
        System.out.println(minDays(arr, 2, 3));
    }
}
