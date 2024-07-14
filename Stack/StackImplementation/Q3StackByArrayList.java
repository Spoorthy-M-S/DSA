package Stack.StackImplementation;
import java.util.*;

public class Q3StackByArrayList {
    static class stack {
        static ArrayList<Integer> arr;

        stack() {
            arr = new ArrayList<>();
        }

        public void push(int data) {
            arr.add(data);
        }

        public int pop() {
            return arr.remove(arr.size() - 1);
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public int size() {
            return arr.size();
        }
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }

}
