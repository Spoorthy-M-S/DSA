package Arrays.S1Easy;

public class Q11Single {
    public static int singleNumber(int[] nums) {
        int ele=0;
        for(int i=0;i<nums.length;i++){
            ele=ele^nums[i];
        }
        return ele;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,1,1,3,3};
        System.out.println(singleNumber(arr));
    }
    
}
