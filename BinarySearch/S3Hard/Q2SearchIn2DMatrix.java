package BinarySearch.S3Hard;

public class Q2SearchIn2DMatrix {
    //sorted col and row wise
    public static int[] search(int arr[][],int ele){
        int n=arr.length-1;
        int m=arr[0].length-1;
        int i=0;
        int j=m;
        while(i<=n && j>=0){
            if(arr[i][j]==ele){
                return new int[]{i,j};
            }
            if(arr[i][j]>ele){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        /*
         * [1,4,7,11,15]
         * [2,5,8,12,19]
         * [3,6,9,16,22]
         * [10,13,14,17,24]
         * [18,21,23,26,30]
         *  T=5 */
        int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int arrr[]=search(arr, 5);
        System.out.println(arr[arrr[0]][arrr[1]]);

        
    }
    
}
