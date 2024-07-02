package BinarySearch.S2Medium;
//Array should be Positive ,Increasing array
//(idx+1)-arr[idx]=number of missing ele till that index
//if arr[mid]-(mid+1)<k=>low=mid+1;
//else high=mid-1
public class Q7KthMissingPositiveNumberInIncreasingArray {
    public static int findKthPositiveBrute(int[] arr, int k) {
        int miss = k;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (ele <= miss) {
                miss++;
            } else {
                break;
            }
        }
        return miss;
    }

    public static int findKthPositiveBS(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int miss = arr[mid] - (mid + 1);
            if (miss < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k; // high+1+k
    }
        
        // missing =arr[high]+more
        // =arr[high]+(k-(arr[high]-(high+1))
        // =arr[high]+k-arr[high]+high+1
        // =k+high+1
        // =k+low
    

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 11 };
        System.out.println(findKthPositiveBS(arr, 5));
    }

}
