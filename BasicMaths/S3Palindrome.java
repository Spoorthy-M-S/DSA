package BasicMaths;

public class S3Palindrome {
    //Tc=log(N)
    public static boolean brute(int num){
        int n=num;
        int ans=0;
        while(n>0){
            int ld=n%10;
            n=n/10;
            ans=ans*10+ld;
        }
        return num==ans;
    }
    //Tc=O(n/2)
    public static boolean better(int num){
        String str=Integer.toString(num);
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(better(121));
        
    }
}
