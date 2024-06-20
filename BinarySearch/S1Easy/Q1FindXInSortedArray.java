package DSA.BinarySearch.S1Easy;

public class Q1FindXInSortedArray {
    public static int BinarySearch(int arr[],int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(low>arr.length-1){
            return -1;
        }
        return arr[low]==k?low:-1;
    }
    public static int search(int[] nums, int target) {
        return BinarySearch(nums,target);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(search(arr, 2));
    }
}
