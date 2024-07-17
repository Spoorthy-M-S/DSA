package Arrays.S1Easy;
class Q5RotateArrayByKPlace{
    public static void rotate(int arr[],int st,int ed){
        while(st<ed){
            int temp=arr[st];
            arr[st]=arr[ed];
            arr[ed]=temp;
            st++;
            ed--;
        }
    }

    public static void Rot(int arr[],int k){
        k=k%arr.length;
        rotate(arr,0,arr.length-k-1);
        rotate(arr,arr.length-k,arr.length-1);
        rotate(arr,0,arr.length-1);

    }
    public void rotate(int[] nums, int k) {
        Rot(nums,k);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Rot(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}