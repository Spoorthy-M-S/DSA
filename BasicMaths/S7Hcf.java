package BasicMaths;

public class S7Hcf {
//biggest number that divides both and leaves 0 reminder

//TC=O(mini(a,b))
    public static int hcfBrute(int a, int b) {
        int ans=0;
    int mini=Math.min(a,b);
    for(int i=1;i<=mini;i++){
        if(a%i==0 && b%i==0){
            ans=i;
        }
    }
    return ans;
    }


    //In worst case TC=O(N)
    public static int hcfBetter(int a,int b){
        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }

    //Better=Euclidean algebra
    //Actually =>mini=mini and maxi=maxi-mini
    //untill one becomes 0=>max=max%mini and mini=mini
    public static int hcfE(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        return a==0?b:a;
    }


    public static void main(String[] args) {
        System.out.println(hcfE(16, 32));
    }

}