package DSA.LinkedList.S1Easy;

public class Q10InterSectionPoint {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head1=headA;
        ListNode head2=headB;
        while(head1!=head2){ ////In case of not intersection both intersect at null 
            if(head1!=null){
                head1=head1.next;
            }
            else{
                head1=headB;
            }
            if(head2!=null){
                head2=head2.next;
            }
            else{
                head2=headA;
            }
        }
        return head1;
    }

    public static void main(String[] args) {
        ListNode h1=new ListNode(1);
        ListNode h2=new ListNode(2);
        ListNode b=new ListNode(3);
        ListNode c=new ListNode(4);
        ListNode d=new ListNode(5);
        h1.next=b;
        h1.next.next=c;
        h1.next.next.next=d;
        h2.next=c;
        System.out.println(getIntersectionNode(h1, h2).data);



    }
}
