package Arrays.S1Easy;

public class Q10MaxiCosecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }
            else {
                maxi=Math.max(maxi,cnt);
                cnt=0;
            }
        }
        maxi=Math.max(cnt,maxi);
        return maxi; 
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    
}
