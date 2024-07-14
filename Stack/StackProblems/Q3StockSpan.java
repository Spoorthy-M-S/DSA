package Stack.StackProblems;
//Maximum No Of consecutive Days for which price<=todays Price
import java.util.*;
public class Q3StockSpan {
    
    public static int[] stockSpan(int arr[]){
        int span[]=new int[arr.length];
        //Defaut of 1st day=1
        //if stack is empty then i+1=>all are either less than Me or Equal to me
        span[0]=1;
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
        while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            span[i]=i+1;
        }
        else{
            span[i]=i-st.peek();
        }
        st.add(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,85,100};
        int span[]=stockSpan(arr);
        for(int ele:span){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
