package BinarySearch.S1Easy;

public class Q11FindHowManyTimesArrayHasBeenRotatae {

    public static int howmany(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;
        int mini = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[low]<=arr[high]){
                if(mini>=arr[low]){
                    mini=arr[low];
                    idx=low;
                    break;
                }
            }
            if (arr[low] <= arr[mid]) {
                // mini=Math.min(mini,arr[low]);
                if (mini < arr[low]) {
                    mini = arr[low];
                    idx=low;
                }
                low = mid + 1;
            } else {
                // mini=Math.min(mini,arr[mid]);
                if (mini < arr[mid]) {
                    mini = arr[mid];
                    idx=mid;
                }
                high = mid - 1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(howmany(arr));
    }

}
