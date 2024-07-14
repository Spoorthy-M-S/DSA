package Stack.StackImplementation;

public class Q2StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;
        static Node tail = null;
        static int size = 0;

        public void push(int i) {
            Node nw = new Node(i);
            size++;
            if (head == null) {
                head = nw;
                tail = nw;
                return;
            }
            tail.next = nw;
            tail = nw;
        }

        public int pop() {
            if (head == null) {
                return -1;
            }
            if(head.next==null){
                int da=head.data;
                head=null;
                size=0;
                return da;
            }
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            Node r = tail;
            tail = temp;
            temp.next = null;
            size--;
            return r.data;
        }

        public int peek() {
            if (head == null) {
                return -1;
            }
            return tail.data;
        }

        public boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size);

    }

}
