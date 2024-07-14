package Stack.StackProblems;

import java.util.*;

public class Q6DublicateParentheses {
    public static boolean dub(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int cnt = 0;
            if (ch == ')') {
                while (st.peek() != '(') {
                    cnt++;
                    st.pop();
                }
                if (cnt < 1) {
                    return true;
                } else {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(a+b)";
        System.out.println(dub(str));
    }

}
