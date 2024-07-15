package Arrays.S1Easy;
import java.util.*;
public class Q2SecondLargest {
    //O(NlogN)
    public static int brute(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    //O(2N)
    public static int better(int arr[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        int smaxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<maxi && arr[i]>smaxi){
                smaxi=arr[i];
            }
        }
        return smaxi;
    }
   //TC=O(N)
    public static int optimal(int arr[]){
        int maxi=Integer.MIN_VALUE;
        int smaxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                smaxi=maxi;
                maxi=arr[i];
            }
            if(arr[i]>smaxi && arr[i]<maxi){
                smaxi=arr[i];
            }
        }
        return smaxi;
    }

    public static void main(String[] args) {
        int arr[]={7,5,10,4};
        System.out.println(optimal(arr));
    }    
}
