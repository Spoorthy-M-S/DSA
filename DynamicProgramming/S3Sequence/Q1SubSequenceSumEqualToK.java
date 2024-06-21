package DSA.DynamicProgramming.S3Sequence;

import java.util.Arrays;

public class Q1SubSequenceSumEqualToK {
        public static boolean R(int k,int i,int arr[]){
        if(k==0){
            return true;
        }
        if(i==0){
            return arr[0]==k;
        }
        boolean np=R(k,i-1,arr);
        boolean pic=false;
        if(arr[i]<=k){
            pic=R(k-arr[i],i-1,arr);
        }
        return pic|np;
    }
    public static boolean memo(int k,int i,int arr[],int dp[][]){
        if(k==0){
            return true;
        }
        if(i==0){
            return arr[0]==k;
        }
        if(dp[i][k]!=-1){
            if(dp[i][k]==1){
                return true;
            }
            return false;
        }
        boolean np=memo(k,i-1,arr,dp);
        boolean pic=false;
        if(arr[i]<=k){
            pic=memo(k-arr[i],i-1,arr,dp);
        }
        boolean ans=pic|np;
        if(ans==true){
            dp[i][k]=1;
        }
        else{
            dp[i][k]=0;
        }
        return pic|np;
    }
    
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here
        int dp[][]=new int[n][k+1];
        for(int r[]:dp){
            Arrays.fill(r,-1);
        }
        return memo(k,n-1,arr,dp);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4};
        System.out.println(subsetSumToK(arr.length, 5, arr));
    }
}
