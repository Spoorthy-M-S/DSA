package Arrays.S1Easy;

public class Q3CheckIfArraySorted {
//optimal
    public static boolean isSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,6,2};
        System.out.println(isSorted(arr));
        
    }
}
