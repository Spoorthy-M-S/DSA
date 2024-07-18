package BinarySearch.S1Easy;

public class Q10FindMin {
    public static int minimum(int arr[]){
        int low=0;
        int high=arr.length-1;
        int mini=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                mini=Math.min(mini,arr[low]);
                low=mid+1;
            }
            else{
                mini=Math.min(mini,arr[mid]);
                high=mid-1;
            }
        }
        return mini;
    }

    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(minimum(arr));
        
    }
    
}
