package JavaDSA.Sorting;

import java.util.Arrays;

public class BubbleSort{

    public static void bbsort(int arr[]){
        int n=arr.length;

        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                                    }
                                    }
                                }        }



public static void main(String args[]){
    int arr[]={1,5,3,9,5,3};
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
    }
    System.out.println();
    bbsort(arr);
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
    }
    System.out.println();

   
    System.out.println("By in built function== Arrays.sort(Array_name)");
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
    }
    System.out.println();
}    
}
