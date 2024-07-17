package Arrays.S1Easy;

public class Q6MoveZerosToEnd {
    public static  void moveZeroes(int[] nums) {
        int i=-1;
        int n=nums.length;
        for(int id=0;id<n;id++){
            if(nums[id]==0){
                i=id;
                break;
            }
        }
        if(i==-1){
            return;
        }
        for(int j=i+1;j<n;j++){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,99,0,2,0};
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
