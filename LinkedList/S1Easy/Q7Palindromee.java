package DSA.LinkedList.S1Easy;

public class Q7Palindromee {
    
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode mid=mid(head);
        ListNode head2=mid.next;
        head2=reverse(head2);
        ListNode head1=head;
        while(head1!=null && head2!=null){
            if(head1.data!=head2.data){
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(5);
      //  System.out.println(removeNthFromEnd(head, 2).data);
      System.out.println(isPalindrome(head));

    }
    
}
