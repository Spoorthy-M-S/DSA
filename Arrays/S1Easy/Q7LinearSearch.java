package Arrays.S1Easy;

public class Q7LinearSearch {
    public static int linearSearch(int arr[],int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("Found At Index:"+linearSearch(arr, 4));
    }
    
}
