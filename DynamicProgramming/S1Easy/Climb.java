package DSA.DynamicProgramming.S1Easy;

import java.util.Arrays;

public class Climb {
    public static int R(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int one=R(n-1);
        int two=R(n-2);
        return one+two;
    }
    public static int memo(int n,int dp[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int one=memo(n-1,dp);
        int two=memo(n-2,dp);
        return dp[n]=one+two;
    }
    public static int tab(int n){
    int dp[]=new int[n+1];
    for(int i=0;i<=n;i++){
        int one=0;
        if(i>=1){
            one=dp[i-1];
        }
        int two=0;
        if(i>=2){
            two=dp[i-2];
        }
        if(i==0){
            dp[i]=1;
        }
        else{
        dp[i]=one+two;
    }}
    return dp[n];
    }
    public static int spaceOptimization(int n){
        int prev=0;
        int prev1=1;
        for(int i=1;i<=n;i++){
            int one=0;
            if(i>=1){
                one=prev1;
            }
            int two=0;
            if(i>=2){
                two=prev;
            }
            int curr=one+two;
            prev=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public static int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return spaceOptimization(n);
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
    
}
