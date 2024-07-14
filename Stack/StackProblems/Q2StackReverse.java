package Stack.StackProblems;
import java.util.*;
public class Q2StackReverse {
    public static void reverse(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int data=st.pop();
        reverse(st);
        better(st, data);
    }
    public static void better(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }
        int d = st.pop();
        better(st, data);
        st.push(d);
    }

    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1); st.push(2); st.push(3); st.push(4);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
        
    }
    
}
