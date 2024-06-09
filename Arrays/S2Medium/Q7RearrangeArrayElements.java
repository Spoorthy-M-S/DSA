package DSA.Arrays.S2Medium;

import java.util.ArrayList;

public class Q7RearrangeArrayElements {
    public static void arrange(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg.add(arr[i]);
            } else {
                pos.add(arr[i]);
            }
        }
        int j = 0;
        for (int i = 0; i < n; i = i + 2) {
            arr[i] = pos.get(j);
            j++;
        }
        j = 0;
        for (int i = 1; i < n; i = i + 2) {
            arr[i] = neg.get(j);
            j++;
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        arrange(nums);
        return nums;
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, 3, -4, 7, 8 };
        arr = rearrangeArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
/*
 * You are given a 0-indexed integer array nums of even length consisting of an
 * equal number of positive and negative integers.
 * 
 * You should return the array of nums such that the the array follows the given
 * conditions:
 * 
 * Every consecutive pair of integers have opposite signs.
 * For all integers with the same sign, the order in which they were present in
 * nums is preserved.
 * The rearranged array begins with a positive integer.
 * Return the modified array after rearranging the elements to satisfy the
 * aforementioned conditions.
 */
