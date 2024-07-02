package Recursion;

import java.util.*;

public class Q4SubSet2 {
    public static void subset2(int idx,int arr[],List<List<Integer>>ans,List<Integer>ds){
        ans.add(new ArrayList(ds));
        for(int i=idx;i<arr.length;i++){
            if(i!=idx && i>=1 && arr[i]==arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            subset2(i+1,arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        subset2(0, nums, ans, ds);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(subsetsWithDup(arr));
    }
}
