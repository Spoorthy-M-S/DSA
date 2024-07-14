package Stack.StackProblems;

import java.util.Stack;

public class Q5ValidParentheses {
    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            if (st.isEmpty()) {
                return false;
            }
            if(c==')' && st.peek()=='(' || c=='}' && st.peek()=='{' || c==']' && st.peek()=='['){
                st.pop();
            }
        }
        if(st.isEmpty()){
        return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "{([]}";
        System.out.println(isValid(str));

    }

}
