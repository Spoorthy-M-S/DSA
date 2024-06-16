package DSA.Arrays.S3Hard;

import java.util.ArrayList;
import java.util.List;

public class Q2MajElement2 {
    public static List<Integer> majorityElement(int[] nums) {
        int ele1 = 0;
        int ele2 = 0;
        int n = nums.length;
        int i = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        while (i < n) {
            if (cnt1 == 0 && nums[i] != ele2) {
                ele1 = nums[i];
                cnt1++;
            } else if (cnt2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                cnt2++;
            } else if (nums[i] == ele1) {
                cnt1++;
            } else if (nums[i] == ele2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
            i++;
        }
        cnt1 = 0;
        cnt2 = 0;
        List<Integer> ans = new ArrayList<>();
        for (int ii = 0; ii < n; ii++) {
            if (nums[ii] == ele1) {
                cnt1++;
            } else if (nums[ii] == ele2) {
                cnt2++;
            }
        }
        if (cnt1 > (n / 3)) {
            ans.add(ele1);
        }
        if (cnt2 > (n / 3)) {
            ans.add(ele2);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2};
        List<Integer>ans=majorityElement(arr);
        System.out.println(ans);
    }

}
