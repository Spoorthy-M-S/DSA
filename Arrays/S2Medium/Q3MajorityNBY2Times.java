package DSA.Arrays.S2Medium;
import java.util.*;
public class Q3MajorityNBY2Times {
    public static int brute(int arr[]){
        int n=arr.length;
        int maj=n/2;
       if(n==1){
           return arr[0];
        }
        for(int i=0;i<n;i++){
            int ele=arr[i];
            int cnt=1;
            for(int j=i+1;j<n;j++){
              if(arr[j]==ele){
                cnt++;
                if(cnt>maj){
                    return ele;
                }
              }
            }
        }
        return -1;
    }
    public static int better(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int v=map.getOrDefault(arr[i],0);
            map.put(arr[i],v+1);
        }
       Set<Integer>set=map.keySet();
       for(int i:set){
        if(map.get(i)>n/2){
            return i;
        }
       }
        return -1;
    }
    //MOONS VOTING ALGO
    public static int optimal(int arr[]){
        int cnt=0;
        int i=0;
        int maxi=0;
        int n=arr.length;
        int ele=-1;
        if(n==1){
            return arr[0];
        }
        while(i<n){
            if(cnt==0){
                ele=arr[i];
                cnt=1;
            }
            else if(ele==arr[i]){
                cnt++;
                maxi=Math.max(maxi,cnt);
            }
            else{
                cnt--;
            }
            i++;
        }
        cnt=0;
        for(i=0;i<n;i++){
            if(ele==arr[i]){
                cnt++;
            }
            if(cnt>n/2){
                return ele;
            }
        }
        if(cnt>n/2){
            return ele;
        }
        return -1;
    }
    public static int majorityElement(int[] nums) {
     return brute(nums);
        
    }
    public static void main(String[] args) {
        int arr[]={3,3,1};
        System.out.println(majorityElement(arr));
    }
    
}
