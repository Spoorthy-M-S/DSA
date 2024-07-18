package BinarySearch.S1Easy;

public class Q6FirstAndLastOccurance {
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

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] { -1, -1 };
        }
        int first = low(nums, target);
        int lst = hig(nums, target);

        if (first < nums.length && lst < nums.length && nums[first] == target && nums[lst] == target) {
            return new int[] { first, lst };
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        int ans[]=searchRange(arr, 8);
        System.out.println(ans[0]+" "+ans[1]);
    }

}
