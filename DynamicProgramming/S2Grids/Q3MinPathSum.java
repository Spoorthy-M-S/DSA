package DSA.DynamicProgramming.S2Grids;
import java.util.*;
public class Q3MinPathSum {
    public static int r(int a[][],int i,int j){
        if(i==0 && j==0){
            return a[0][0];
        }
        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        int u=r(a,i-1,j);
        int l=r(a,i,j-1);
        return Math.min(u,l)+a[i][j];
    }
    public static int memo(int a[][],int i,int j,int dp[][]){
        if(i==0 && j==0){
            return a[0][0];
        }
        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int u=memo(a,i-1,j,dp);
        int l=memo(a,i,j-1,dp);
        return dp[i][j]=Math.min(u,l)+a[i][j];
    }
    public static int tab(int arr[][],int n,int m){
         int dp[][]=new int[n][m];  
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if(i==0 && j==0){
                dp[i][j]=arr[i][j];
            }
            else{
            int u=arr[i][j];
            if(i>0){
                u+=dp[i-1][j];
            }
            else{
                u=(int)(Math.pow(10,9));
            }
            int l=arr[i][j];
            if(j>0){
              l+=dp[i][j-1];
            }
            else{
                l=(int)(Math.pow(10,9));
            }
            dp[i][j]=Math.min(l,u);
            }}
        }
        return dp[n-1][m-1];

    }
    public static int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n+1][m+1];
        for(int r[]:dp){
            Arrays.fill(r,-1);
        }
     //   return memo(grid,grid.length-1,grid[0].length-1,dp);
     return tab(grid,n,m);
    }
    public static void main(String[] args) {
        int arr[][]={{1,1,2,3},{1,2,1,1},{1,2,3,4},{1,1,1,1}};
        System.out.println(minPathSum(arr));

    }
    
}
