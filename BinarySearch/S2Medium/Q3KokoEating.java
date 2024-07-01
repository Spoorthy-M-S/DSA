package BinarySearch.S2Medium;
import java.util.*;
public class Q3KokoEating {
    public static int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        while(low<=high){
            int mid=(low+high)/2;
            int ans=f(mid,piles);
            if(ans<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int f(int h,int arr[]){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            cnt+=Math.ceil((double)arr[i]/(double)h);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int piles[]={30,11,23,4,20};
        System.out.println(minEatingSpeed(piles, 5));
    }
    
}
