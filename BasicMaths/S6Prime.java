package BasicMaths;

public class S6Prime {
    //TC=O(N)
    public static boolean isPrimeBrute(int num){
        int cnt=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                cnt++;
            }
        }
        if(cnt==2){
            return true;
        }
        return false;
    }


    //TC=O(Sqrt(N))
    public static boolean isPrimeOptimal(int num){
        int cnt=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                cnt++;
                if(num/i!=i){
                    cnt++;
                }
            }
        }
        if(cnt==2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeOptimal(11));
    }
    
}
