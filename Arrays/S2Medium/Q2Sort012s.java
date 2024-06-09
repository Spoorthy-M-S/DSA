package DSA.Arrays.S2Medium;

public class Q2Sort012s {
    public static void brute(int arr[]){
        Arrays.sort(arr);
    }

    public static void dutchNationalFlagAlgo(int nums[]){
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
    
    public static void sortColors(int[] nums) {
      dutchNationalFlagAlgo(nums);
}
public static void main(String[] args) {
    int arr[]={1,2,0,2,1,0,1,1,0};
    sortColors(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
