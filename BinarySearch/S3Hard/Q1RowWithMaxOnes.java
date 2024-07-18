package BinarySearch.S3Hard;

public class Q1RowWithMaxOnes {
//ALL ROWS ARE SORTED IN ASCENDING ORDER
//TC=O(N2)
    public static int rowwithmaxonesbRUTE(int arr[][]){
        int row=-1; int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int cnt=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    cnt++;
                }
            }
            if(cnt>maxi){
                maxi=cnt;
                row=i;
            }
        }
        return row;
    }
    //OPTIMAL://O(Nlog N)
    public static int optimal(int arr[][]){
        
        int row=-1; int cnt=Integer.MIN_VALUE;
        int n=arr[0].length;
        for(int i=0;i<arr.length;i++){
            int arrr[]=arr[i];
            int ans=lowerBound(arrr,1);
            if(n-ans>cnt){
                cnt=n-ans;
                row=i;
            }
        }
        return row;
    }
    public static int lowerBound(int arr[],int ele){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=ele){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }


    public static void main(String[] args) {
        int arr[][]={{0,0,0,1,1,1},{1,1,1,1,1,1},{0,0,0,1,1,1}};
        /*
         * 0,0,0,1,1,1
         * 1,1,1,1,1,1
         * 0,0,0,1,1,1
         */
        System.out.println(rowwithmaxonesbRUTE(arr));

        
    }
    
}
