package Stack.StackImplementation;

public class Q1StackUsingArrays {

    static class Stack {
        static int arr[];
        static int size;
        static int n;

        Stack(int n) {
            this.arr = new int[n];
            this.n = n;
            this.size = -1;
        }
        Stack(){
            this.n=1000;
            this.arr=new int[n];
            this.size=-1;
        }

        public static void add(int data) {
            size++;
            if (size >= n) {
                System.out.println("Stack Full!!");
                return;
            }
            arr[size] = data;
        }

        public static int pop() {
            if (size == -1) {
                System.out.println("Stack is Empty!!");
                return -1;
            }
            int ele = arr[size];
            size--;
            return ele;
        }

        public int top() {
            if (size == -1) {
                System.out.println("Stack is Empty!!");
                return -1;
            }
            return arr[size];
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st.pop()); 
        System.out.println(st.pop()); 
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
