package DSA.SlidingWindow;

public class Q11MinilengthSubArraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int n=nums.length;  int sum=0;  int mini=Integer.MAX_VALUE;
        while(r<n){
        sum+=nums[r];
        while(sum>=target){
            sum=sum-nums[l];
            mini=Math.min(mini,r-l+1);
            l++;
        }
        r++;
        }
        return mini==Integer.MAX_VALUE?0:mini;
    }

    public static void main(String[] args) {
        int arr[]={2,3,1,2,4,3};  //1 4 4 t=4  ans=1
        int sum=7;                //1 1 1 1 1 1 1   t=11   ans=0
        System.out.println(minSubArrayLen(sum, arr));
    }
}
