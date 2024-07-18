package BinarySearch.S1Easy;

public class Q5FloorAndCeil {

    public static int floorLowerB(int arr[], int x, int n) {
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                low = mid + 1;
                ans = arr[mid];
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int ceilUpp(int arr[], int x, int n) {
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                high = mid - 1;
                ans = arr[mid];
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        // Wriute your code here.
        int floor = floorLowerB(a, x, n);
        int ceil = ceilUpp(a, x, n);
        return new int[] { floor, ceil };
    }

    public static void main(String[] args) {
        int arr[]={3, 4, 7, 8, 8, 10};
        int ans[]=getFloorAndCeil(arr, arr.length, 5);
        System.out.println(ans[0]+" "+ans[1]);
    }

}
