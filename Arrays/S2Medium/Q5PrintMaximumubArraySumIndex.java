package DSA.Arrays.S2Medium;

public class Q5PrintMaximumubArraySumIndex {

    public static void main(String[] args) {
        int arr[]={1,-2,2,-2,2,2};
        int i=0;
        int n=arr.length;
        int maxi=0;int sum=0;
        int si=0;
        int ei=0;
        int s=0;
        while(i<n){
        if(sum==0){
            s=i;
        }
        sum+=arr[i];
        if(sum>maxi){
            maxi=sum;
            si=s;
            ei=i;
        }
        if(sum<0){
            sum=0;
        }
        i++;
        }
        System.out.println(maxi);
        System.out.println("FROM: "+si+" TO: "+ei);
    }
    
}
