package BinarySearch.S1Easy;

public class Q3UpperBound {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,3,4};
        System.out.println(arr[upperBound(arr, 2,arr.length)]);
    }
    
}
