package DSA.DynamicProgramming.S1Easy;
import java.util.*;
public class Q2HouseRob {
    public static int recur(int arr[],int i,int n){
        if(i==0){
            return arr[0]; 
        }
        if(i<0){
            return 0;
        }
        int take=recur(arr,i-2,n)+arr[i];
        int nt=recur(arr,i-1,n);
        return Math.max(take,nt);
    }
    public static int memo(int arr[],int n,int dp[]){
        if(n==0){
            return arr[0];
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int t=memo(arr,n-2,dp)+arr[n];
        int nt=memo(arr,n-1,dp);
        return dp[n]=Math.max(t,nt);
    }

    public static int tab(int arr[]){
        int dp[]=new int[arr.length+1];
        dp[0]=arr[0];
        int n=arr.length;
        for(int i=1;i<=n;i++){
        int pic=0;
        if(i<n){
            pic=arr[i];
        }
        int np=0;
        if(i>=2){
            pic+=dp[i-2];
        }
        if(i>=1){
            np+=dp[i-1];
        }
        dp[i]=Math.max(pic,np);
        }
    
    return dp[arr.length];
    }
    public static int spaceOptimiZation(int arr[]){
        int prev1=arr[0];
        int prev2=0;
        for(int i=0;i<=arr.length;i++){
            int p=0;
            int np=0;
            if(i<arr.length){
                p=arr[i];
            }
            if(i>=2){
                p+=prev2;
            }
            if(i>=1){
                np=prev1;
            }
            int curr=Math.max(p,np);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    
    public static int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return spaceOptimiZation(nums);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(rob(arr));
    }
}

