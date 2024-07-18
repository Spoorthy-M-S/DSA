package BinarySearch.S1Easy;

public class Q4FindInsertionPosition {

    public static int lowerBound(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(lowerBound(arr, 3));
    }

    
}
