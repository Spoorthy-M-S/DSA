package BinarySearch.S1Easy;

public class Q7CountOccuranceOfANumber {
    public static int count(int arr[], int n, int x) {
        // Your code goes here
        int fi = low(arr, x);
        if (fi == -1) {
            return 0;
        }
        int l = hig(arr, x);
        return l - fi + 1;
    }

    public static int low(int arr[], int t) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int hig(int arr[], int t) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,3,3,3,4,5};
        System.out.println(count(arr, arr.length, 3));
    }

}
