package BinarySearch.S2Medium;
import java.util.*;
public class Q10SplitArrayWithMinimMaxSum {
    public static int mini(int arr[],int k){
        int low=Arrays.stream(arr).max().getAsInt();
        int high=0;
        for(int i=0;i<arr.length;i++){
            high+=arr[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int ans=f(arr,mid);
            if(ans<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int f(int arr[],int T){
        int cnt=1; int t=0;
        for(int i=0;i<arr.length;i++){
            if(t+arr[i]<=T){
                t+=arr[i];
            }
            else{
                cnt++;
                t=arr[i];
            }
        }
        return cnt;
    }
    public static int splitArray(int[] nums, int k) {
        return mini(nums,k);
    }
    public static void main(String[] args) {
        int arr[]={7,2,5,10,8};
        System.out.println(splitArray(arr, 2));
    }
}
