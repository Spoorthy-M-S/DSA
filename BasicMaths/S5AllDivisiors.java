package BasicMaths;
class S5ALlDivisiors{

    //TC=O(N)
    public static void brute(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    //O(Sqrt(N))
    public static void better(int  num){
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                System.out.println(i);
                if(num/i!=i){
                     System.out.println(num/i);
                }
            } 
        }
    }

public static void main(String[] args) {
    better(36);
}

}