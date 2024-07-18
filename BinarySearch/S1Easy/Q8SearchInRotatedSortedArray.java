package BinarySearch.S1Easy;

public class Q8SearchInRotatedSortedArray {
    public static int searchInRotatedSortedArray(int arr[],int ele){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==ele){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=ele && ele<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }

            }
            else{
                if(arr[mid]<=ele && ele<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
        
    }


    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(arr[searchInRotatedSortedArray(arr, 0)]);
    }
    
}
