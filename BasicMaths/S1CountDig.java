package BasicMaths;

public class S1CountDig {

    //Extraction of digits
    //TC==log base (10) N
    //If we divide then Time complexity will be log of base [by which number we divide]
    public static int numberOfDig(int num){
        int cnt=0;
        while(num>0){
            num=num/10;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDig(6978));
    }
    
}
