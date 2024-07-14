package Stack.StackProblems;

import java.util.*;

public class Q1PushAtBottomOfStack {
    // Brute
    public static void brute(Stack<Integer> st, int data) {
        Stack<Integer> s2 = new Stack();
        while (!st.isEmpty()) {
            s2.push(st.pop());
        }
        st.push(data);
        while (!s2.isEmpty()) {
            st.push(s2.pop());
        }
        System.out.println(st);
    }

    // Better
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
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        better(st, 0);
        System.out.println(st);
    }

}
