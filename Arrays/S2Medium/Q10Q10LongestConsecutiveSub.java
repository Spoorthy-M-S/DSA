package DSA.Arrays.S2Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q10Q10LongestConsecutiveSub {
      //TLE
    public static int Brute(int nums[]){
       HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int arr[]=new int[set.size()];
        int id=0;
        for(int i:set){
            arr[id]=i;
            id++;
        }  
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int n=arr.length;
        int maxi=1;
        for(int i=0;i<n;i++){
            int cnt=1;
         for(int j=i;j<n-1;j++){
          if(arr[j]+1==arr[j+1]){
            cnt++;
          }
          else{
            break;
          }
         }
         maxi=Math.max(maxi,cnt);
        }
        return maxi;
    }
    public static int optimal(int arr[]){
        Set<Integer>set=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
        set.add(arr[i]);
        }
        int maxi=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int ele=i; int cnt=0;
                while(set.contains(ele)){
                    ele=ele+1;
                    cnt=cnt+1;
                }
                maxi=Math.max(maxi,cnt);
            }
        }
      return maxi;
    }
    public int longestConsecutive(int[] nums) {
        return optimal(nums);
    }
    
}
