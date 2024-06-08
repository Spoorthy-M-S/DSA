package DSA.Arrays.S1Easy;
import java.util.*;
public class Q1LargestElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,11,1111,1};
        int lar=Arrays.stream(arr).max().getAsInt();
        int small=Arrays.stream(arr).min().getAsInt();
        System.out.println(lar);
        System.out.println(small);
    }
}
