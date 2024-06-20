package DSA.BinarySearch.S2Medium;

public class Q2FindSquareRoot {
    public static int mySqrt(int x) {
        int low=1;
        int high=(int)Math.sqrt(x);
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int n=9;
        System.out.println(mySqrt(n));

    }
    
}
