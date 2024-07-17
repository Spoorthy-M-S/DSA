package Arrays.S1Easy;

public class Q9MissingNumber {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<=n;i++){
            int f=0;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    f=1;
                }
            }
            if(f==0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={0,1,3};
        System.out.println(missingNumber(arr));
    }
    
}
