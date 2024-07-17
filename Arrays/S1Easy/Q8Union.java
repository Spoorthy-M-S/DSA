package Arrays.S1Easy;
import java.util.*;
public class Q8Union {
    //TC=O(n+m)*log(n+m)
    public static ArrayList<Integer> unionBetter(int a[],int b[]){
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        ArrayList<Integer>arr=new ArrayList<>();
        for(int it:set){
            arr.add(it);
        }
        return arr;
    }
    //Optimal Using Two Pointer
    public static ArrayList<Integer> unionOptimal(int a[],int b[]){
        Arrays.sort(a); Arrays.sort(b);
        ArrayList<Integer>ans=new ArrayList<>();
        int i=0; int j=0; int n=a.length;  int m=b.length;
        while(i<n && j<m){
            if(a[i]==b[j]){
               ans.add(a[i]); i++; j++;
            }
            else if(a[i]<b[j]){
            ans.add(a[i]); i++;
            }
            else{
                ans.add(b[j]); j++;
            }
            
        }
        while(i<n){
            ans.add(a[i]); i++;
        }
        while(j<m){
            ans.add(b[j]); j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={2,5,6,7};
        System.out.println(unionOptimal(a, b));
    }
    
}
