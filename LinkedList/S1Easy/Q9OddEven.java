package DSA.LinkedList.S1Easy;

public class Q9OddEven {
    
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode oddEvenList(ListNode head) {
        ListNode odd=head;
        ListNode even=head.next;
         ListNode even2=head.next;
         while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
         }
         odd.next=even2;
         return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
      head= oddEvenList(head);
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null");
    }
    
}
