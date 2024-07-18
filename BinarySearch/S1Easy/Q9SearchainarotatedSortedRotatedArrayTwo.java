package BinarySearch.S1Easy;

public class Q9SearchainarotatedSortedRotatedArrayTwo {

    public static boolean is(int arr[], int t) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            if (arr[mid] == t) {
                return true;
            }
            if (arr[low] <= arr[mid]) {
                if (t >= arr[low] && t <= arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (t >= arr[mid] && t <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static boolean search(int[] nums, int target) {
        // Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0] == target;
        }
        // if(nums.length==0){

        // }
        return is(nums, target);
    }

    public static void main(String[] args) {
        int arr[]={2,5,6,0,0,1,2};
        System.out.println(search(arr, 0));
    }

}
