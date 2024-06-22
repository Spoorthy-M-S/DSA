package JavaDSA.Sorting;
import java.util.*;
public class QuickSort {
      public static void quickSort(int arr[],int low,int high ){
        if(low<high){
            int pidx=partitionIndex(arr,low,high);
            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }
    }
    public static int partitionIndex(int arr[],int low,int high){
        int pivote=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivote && i<=high-1){
                i++;
            }
            while(arr[j]>pivote && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        quickSort(arr,0,arr.length-1);
        System.out.println("Array after sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   
    
}
