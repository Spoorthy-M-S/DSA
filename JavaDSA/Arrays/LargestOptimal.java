package JavaDSA.Arrays;

public class LargestOptimal {
    

    public static int largestOptima(int arr[]){
         int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(int args[]){
        int arr[]={7,5,4,2,8};
        int l=largestOptima(arr);
        System.out.println(l);
       
            
        
    }
    
}
