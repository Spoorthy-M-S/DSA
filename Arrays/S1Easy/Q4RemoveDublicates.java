package Arrays.S1Easy;
//given array will be sorted
import java.util.*;
public class Q4RemoveDublicates {
    public static int[] remveDubBrute(int arr[]){
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int ans[]=new int[set.size()];
        int i=0;
        for(int j:set){
            ans[i]=j;
            i++;
        }
        System.out.println(set);
      
        return ans;
    }

    public static  ArrayList<Integer> optimal(int arr[]){
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                ans.add(arr[i-1]);
            }
        }
        if(arr[arr.length-1]!=arr[arr.length-2]){
            ans.add(arr[arr.length-1]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6};
        int ans[]=remveDubBrute(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        System.out.println(optimal(arr));
    }
    
}
