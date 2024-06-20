package DSA.LinkedList.S1Easy;

public class Q1Create {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;
    static int size;

    public static Node create(int arr[]) {
        int n = arr.length;
        Node head1 = new Node(arr[0]);
        head = head1;
        Node temp = head1;
        size++;
        for (int i = 1; i < n; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
            tail = temp;
            size++;
        }

        return head1;
    }

    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static Node addF(int n) {
        Node newNode = new Node(n);
        size++;
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return newNode;
    }

    public static Node addLast(int d) {
        Node newNode = new Node(d);
        size++;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
        return head;
    }

    public static Node addM(int d) {
        Node newNode = new Node(d);
        int n = size / 2;
        size++;
        if (head == null) {
            return newNode;
        }

        int i = 1;
        Node temp = head;
        while (i < n) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static Node mid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static Node deleteF(){
        if(head==null){
            return null;
        }
        if(head.next==null){
            Node temp=head;
            head=null;
            size=0;
            return temp;
        }
        Node r=head;
        Node temp=head.next;
        head=temp;
        size--;
        return r;
    }

    public static Node deleteL(){
        if(head==null){
            return null;
        }
        if(head.next==null){
            size=0;
            Node temp=head;
            head=null;
            return temp;
        }
        size--;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node n=tail;
        temp.next=null;
        tail=temp;
        return n;
    }

    public static Node delM(){
        if(head==null){
            return null;
        }
        if(head.next==null){
            size=0;
            Node temp=head;
            head=null;
            return temp;
        }
        Node temp=head;
        int n=size/2;
        int i=1;
        while(i<=n-1){
            i++;
            temp=temp.next;
        }
        size--;
        temp.next=temp.next.next;
        return head;
    }
    



    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = create(arr);
        print();

        head = addF(8);
        print();
        System.out.println(size);
        System.out.println(head.data);
      //  System.out.println(mid().data);
        System.out.println(delM().data);
        System.out.println(size);
        print();

    }

}
