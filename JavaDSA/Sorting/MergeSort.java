package JavaDSA.Sorting;
public class MergeSort{

public static void div(int arr[],int low,int high){
        if(low>=high){
            return;
        }
    
    int mid=(low+high)/2;
    div(arr,low,mid);
    div(arr,mid+1,high);
    conq(arr,low,mid,high);
        
}
public static void conq(int arr[],int low,int mid,int high){
    int temp[]=new int[arr.length];
    int right=low;
    int left=mid+1;
    int k=0;
    while(right<=mid && left<=high){
        if(arr[right]<=arr[left]){
        temp[k++] =arr[right++];
        }
        else{
            temp[k++]=arr[left++];
        }
    }
    while(right<=mid){
        temp[k++]=arr[right++];
    }
    while(left<=high){
        temp[k++]=arr[left++];
    }
for(int i=low;i<=high;i++){
    arr[i]=temp[i-low];

}
}

    public static void main(String args[]){
        int arr[]={9,2,3,6,31,1};
           for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        div(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}
