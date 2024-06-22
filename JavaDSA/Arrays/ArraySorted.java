package JavaDSA.Arrays;

public class ArraySorted {
    public static int sortedOrNot(int arr[],int n){
        int r=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
              r=1;
            }
            else {
                return r;
            }
        }
        return r;

    }

    public static void main(String args[]){
        int arr[]={5,6,7,8};
        int n=arr.length;
        System.out.println(sortedOrNot(arr,n));
    }
    
}
