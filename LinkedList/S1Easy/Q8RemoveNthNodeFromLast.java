package DSA.LinkedList.S1Easy;

public class Q8RemoveNthNodeFromLast {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode temp = head;
        int s = 0;
        while (temp != null) {
            temp = temp.next;
            s++;
        }
        int t = 1;
        temp = head;
        if (s - n == 0) {
            return head.next;
        }
        while (t < (s - n)) {
            t++;
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(removeNthFromEnd(head, 2).data);

    }

}
