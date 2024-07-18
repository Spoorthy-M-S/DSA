package BinarySearch.S3Hard;
//EACH ROW IS SORTED AND
//The first integer of each row is greater than the last integer of the previous row.
public class Q3SearchInMatrix2 {

    public static int row(int arr[][],int t){
        for(int i=0;i<arr.length;i++){
            if(t>=arr[i][0] && t<=arr[i][arr[i].length-1]){
                return i;
            }
        }
        return -1;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int x=row(matrix,target);
        if(x==-1){
            return false;
        }
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[x][i]==target){
                return true;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
    
        /*
         * [[1,3,5,7]
         * [10,11,16,20]
         * [23,30,34,60]
         */
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr, 11));
        
    }
    
}
