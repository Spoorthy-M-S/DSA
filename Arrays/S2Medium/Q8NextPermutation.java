package DSA.Arrays.S2Medium;

import java.util.Arrays;

public class Q8NextPermutation {
     public static void nextPermutation(int[] nums) {
        int dI=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                dI=i;
                break;
            }
        }
        if(dI==-1){
            Arrays.sort(nums);
        }
        else{

            for(int i=n-1;i>=0;i--){
                if(nums[i]>nums[dI]){
                    int temp=nums[dI];
                    nums[dI]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            Arrays.sort(nums,dI+1,n);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
