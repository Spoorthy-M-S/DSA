package DSA.Arrays.S2Medium;

import java.util.*;

public class Q9Leaders {
    public static void brute(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int f = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);
    }

    public static void better(int arr[]) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        st.push(arr[n - 1]);
        ans.add(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] > st.peek()) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ans.add(st.pop());
            }
            st.push(arr[i]);
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }

    public static void leadersOptimal(int arr[]) {
        int n = arr.length;
        int l = arr[n - 1];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > l) {
                ans.add(arr[i]);
                l = arr[i];
            }
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 4, 3, 0, 5, 0 };
        // 7,5,0
        leadersOptimal(arr);
    }

}
