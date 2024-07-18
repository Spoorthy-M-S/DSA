package BinarySearch.S1Easy;

public class Q12SingleElementInArray {
    public static int single(int arr[]){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            if((mid%2==0 && arr[mid]==arr[mid-1]) || (mid%2==1 && arr[mid]==arr[mid+1])){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        System.out.println(single(arr));
        
    }
    
}
