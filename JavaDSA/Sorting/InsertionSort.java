package JavaDSA.Sorting;
public class InsertionSort{
  public static void inSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    public static void main(String args[]){
        int arr[]={5,3,2,8,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        inSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
