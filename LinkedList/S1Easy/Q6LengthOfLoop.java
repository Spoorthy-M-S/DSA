package DSA.LinkedList.S1Easy;

public class Q6LengthOfLoop {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static int length(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        int cnt=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                ListNode temp=slow.next;
                cnt=1;
                while(temp!=slow){
                    temp=temp.next;
                    cnt++;
                }
                break;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        ListNode n = new ListNode(1);
        n.next = new ListNode(1);
        n.next.next = new ListNode(2);
        n.next.next.next = new ListNode(3);
        ListNode four = new ListNode(4);
        n.next.next.next.next = four;
        n.next.next.next.next.next = new ListNode(5);
        n.next.next.next.next.next.next = new ListNode(6);
        n.next.next.next.next.next.next.next = new ListNode(7);
        n.next.next.next.next.next.next.next.next = new ListNode(8);
        n.next.next.next.next.next.next.next.next.next = four;  
        System.out.println(length(n));
    }

    
}
