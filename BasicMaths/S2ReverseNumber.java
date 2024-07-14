package BasicMaths;

public class S2ReverseNumber {
    // given if 4050= then ans is :504
    public static int reverseBrute(int num) {
        String n = Integer.toString(num);
        StringBuilder sb = new StringBuilder(n);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static int reverseBetterByNum(int num) {

        int ans = 0;
        while (num > 0) {
            int ld = num % 10;
            num = num / 10;
            ans = ans * 10 + ld;

        }
        return ans;
    }

    public static int reverseBetterByString(int num) {
        String str = "";
        while (num > 0) {
            int ld = num % 10;
            num = num / 10;
            str += ld;
        }
        return Integer.parseInt(str);
    }

    public static int reverseWithNumberHavingTrailingZeroz(int num){
        String s=String.format("%03d",num);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("By brute:" + reverseBrute(num));
        System.out.println("By String" + reverseBetterByString(num));
        System.out.println("BY Number" + reverseBetterByNum(num));
        System.out.println(reverseWithNumberHavingTrailingZeroz(12300));

    }

}
