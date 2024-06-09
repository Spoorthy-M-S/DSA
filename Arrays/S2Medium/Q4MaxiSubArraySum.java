package DSA.Arrays.S2Medium;

public class Q4MaxiSubArraySum {
    public static int brute(int arr[]) {
        int n = arr.length;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int maxi = 0;
            for (int j = i; j < n; j++) {
                maxi = maxi + arr[j];
                if (maxi > sum) {
                    sum = maxi;
                }
            }
            if (maxi > sum) {
                sum = maxi;
            }
        }
        return sum;
    }

    public static int kadane(int nums[]) {
        int sum = 0;
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            maxi = Math.max(maxi, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return kadane(nums);
    }
    public static void main(String[] args) {
        int arr[]={1,2,-1};
        System.out.println(maxSubArray(arr));
    }

}
