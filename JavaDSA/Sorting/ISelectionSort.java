package JavaDSA.Sorting;

public class ISelectionSort {

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String args[]){
        int arr[]={1,6,2,3,4,1};
        System.out.println("Array before sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        selectionSort(arr);
        System.out.println("Array after sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}

