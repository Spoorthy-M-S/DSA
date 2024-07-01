package BinarySearch.S2Medium;

import java.util.*;
public class Q6ShipLoad {
    public static int f(int arr[], int C) {
        int c = 0;
        int days = 1;
        for (int i = 0; i < arr.length; i++) {
            if (c + arr[i] > C) {
                days++;
                c = arr[i];
            } else {
                c += arr[i];
            }
        }
        return days;
    }
    public static  int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            int ans = f(weights, mid);
            if (ans <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr, 5));
    }
}
