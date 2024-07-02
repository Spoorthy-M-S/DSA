package BinarySearch.S2Medium;
import java.util.*;
public class QIntersection {
    public static List<Integer> intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer>ans=new ArrayList<>();
        int i=0;
        int j=0;
        int n=nums1.length; int m=nums2.length;
        while(i<n && j<m){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++; j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int arr1[]={2,2,1};
        int arr2[]={2,2};
        System.out.println(intersect(arr1, arr2));
    }
}
