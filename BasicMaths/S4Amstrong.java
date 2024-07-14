package BasicMaths;

public class S4Amstrong {
    //sum of power of each number to length of numbers =>Giving same number
    //ex:371=3pow(3)+7pow(3)+1pow(3)=27+1+343=371

    public static boolean isTrue(int num){
        String str=Integer.toString(num);
        int n=num;
        int pow=str.length();
        int sum=0;
        while(num>0){
            int ld=num%10;
            int add=(int)Math.pow(ld,pow);
            sum+=add;
            num=num/10;
        }
        return sum==n;
    }

    public static void main(String[] args) {
        System.out.println(isTrue(371));
        System.out.println(isTrue(1634));
        System.out.println(isTrue(134));
    }
    
}
