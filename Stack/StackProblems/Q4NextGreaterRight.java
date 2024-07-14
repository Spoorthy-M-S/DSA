package Stack.StackProblems;
import java.util.*;
public class Q4NextGreaterRight {

    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int NxtG[]=new int[arr.length];
        NxtG[arr.length-1]=-1;
        Stack<Integer>st=new Stack<>();
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
            NxtG[i]=-1;
            }
            else{
                NxtG[i]=arr[st.peek()];
            }
            st.add(i);
        }
        for(int r:NxtG){
            System.out.print(r+" ");
        }
    }
    
}
